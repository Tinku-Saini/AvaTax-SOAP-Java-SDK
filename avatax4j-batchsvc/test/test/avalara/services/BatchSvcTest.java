package test.avalara.services;

import com.avalara.avatax.services.base.Profile;
import com.avalara.avatax.services.base.Security;
import com.avalara.avatax.services.batch.*;
import junit.framework.*;
import org.apache.axis.AxisFault;

import javax.xml.rpc.ServiceException;
import javax.xml.soap.SOAPException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;
import java.util.Calendar;
import java.util.Properties;

/**
 * Created by IntelliJ IDEA.
 * User: Swetal.Desai
 * Date: Jul 7, 2010
 * Time: 10:50:48 AM
 * To change this template use File | Settings | File Templates.
 */
public class
        BatchSvcTest extends TestCase{

        private BatchSvc batchSvc;
        private BatchSvcSoap port;
    /**
     * Runs Junit TestRunner.
     * @see junit.textui.TestRunner
     * @param args
     */
    public static void main(String args[]) {
        junit.textui.TestRunner.run(BatchSvcTest.class);
    }
    /**
     * JUnit function called before each Test case runs.
     * @throws ServiceException
     * @throws SOAPException
     * @throws MalformedURLException
     * @throws IOException
     */
    protected void setUp() throws ServiceException, SOAPException, MalformedURLException, IOException
    {
        Properties properties = new Properties();
        File file = new File("avatax4j.properties");
        try
        {
            properties.load(new FileInputStream(file));
        } catch (IOException e)
        {
            System.out.println("Unable to load avatax4j.properties");
            throw e;
        }

        String url = properties.getProperty("avatax4j.url");
        Assert.assertFalse("avatax4j.url property is not configured in avatax4j.properties", url == null || url.length() == 0);

        String account = properties.getProperty("avatax4j.account");
        boolean accountSet = !isEmpty(account);

        String license = properties.getProperty("avatax4j.license");
        boolean licenseSet = !isEmpty(license);

        // Note the addition of userName and password from the avatax4j properties file
        String userName = properties.getProperty("avatax4j.userName");
        boolean userNameSet = !isEmpty(userName);

        String password = properties.getProperty("avatax4j.password");
        boolean passwordSet = !isEmpty(password);


        Assert.assertTrue("In the avatax4j property file, " +
                "either avatax4j.license and " +
                "avatax4j.account need to be" +
                " specified, or avatax4j.userName and " +
                "avatax4j.password need to be specified",
                ((licenseSet && accountSet) ||
                        (userNameSet && passwordSet)));

        batchSvc = new BatchSvcLocator();

        port = batchSvc.getBatchSvcSoap(new URL(url));


        // Set the profile
        Profile profile = new Profile();
        profile.setClient("AddressSvcTest,5.5.0.0");
        port.setProfile(profile);

        // Set security
        // New support for account/license vs. username/password login
        Security security = new Security();
        if (accountSet && licenseSet)
        {
            security.setAccount(account);
            security.setLicense(license);
        }
        // IntelliJ erroneously thinks userNameSet is always true, not sure why. It isn't.
        else if (userNameSet && passwordSet)
        {
            security.setPassword(password);
            security.setUserName(userName);
        }
        port.setSecurity(security);
    }
    /**
     * Determines whether a string is null or of zero length once trimmed.
     * @param str String
     * @return True or False depending on whether the string is empty.
     */
    private boolean isEmpty(String str)
    {
        return str == null || str.trim().length() == 0;
    }
    public void testPing() throws RemoteException
    {
        PingResult result = port.ping("");

        Assert.assertEquals(SeverityLevel.Success, result.getResultCode());
    }
    public void testIsAuthorized() throws RemoteException
	{

		String operations="Ping,BatchSave,BatchFetch,BatchDelete";
        IsAuthorizedResult isAuthorizedResult = port.isAuthorized(operations);

		Assert.assertEquals(SeverityLevel.Success, isAuthorizedResult.getResultCode());
        Assert.assertEquals(operations,isAuthorizedResult.getOperations());

	}
    public void testBatch() throws RemoteException
    {

    	Batch batch = new Batch();
        batch.setBatchStatusId("Waiting");
        batch.setBatchTypeId("ItemImport");

        //ToDo: Define how to set companyId
        batch.setCompanyId(34005);

        batch.setName("ItemImportTest.xls");
        batch.setOptions("Add File");

        BatchFile batchFile = new BatchFile();
        batchFile.setName(batch.getName());
        batchFile.setContentType("application/vnd.ms-excel");

        String filePath = "c:\\Batch\\ItemImportTest.xls";

		byte[] contents=GetBytes(filePath);
        batchFile.setFilePath(filePath);
		batchFile.setSize(contents.length);
		batchFile.setContent(contents);

		BatchFile[] batchFiles=new BatchFile[1];
        batchFiles[0]=batchFile;
        ArrayOfBatchFile arrayofBatchFile=new ArrayOfBatchFile();
        arrayofBatchFile.setBatchFile(batchFiles);

        batch.setFiles(arrayofBatchFile);
        batch.setCreatedDate(Calendar.getInstance());
        batch.setCompletedDate(Calendar.getInstance());
        batch.setModifiedDate(Calendar.getInstance());
	    //Batch Save
	    BatchSaveResult batchSaveResult = port.batchSave(batch);
	    Assert.assertEquals(SeverityLevel.Success,batchSaveResult.getResultCode());
	    FetchRequest fetchRequest = new FetchRequest();
	    fetchRequest.setFields("*,Files.Content");
	    fetchRequest.setFilters("BatchId="+batchSaveResult.getBatchId());
	    int batchId = batchSaveResult.getBatchId();

	    //Batch Fetch
	    BatchFetchResult batchFetchResult = port.batchFetch(fetchRequest);
	    Assert.assertEquals(SeverityLevel.Success,batchFetchResult.getResultCode());

	    Batch tempBatch;        
        for (int i=0;i<batchFetchResult.getBatches().getBatch().length;i++)
	    {
            tempBatch=batchFetchResult.getBatches().getBatch(i);
	        Assert.assertEquals(batchSaveResult.getBatchId(),tempBatch.getBatchId());
	        Assert.assertEquals(batch.getBatchTypeId(),tempBatch.getBatchTypeId());
	        Assert.assertEquals(batch.getName(),tempBatch.getName());
	        Assert.assertEquals(batch.getOptions(),tempBatch.getOptions());

            Assert.assertEquals(batch.getFiles().getBatchFile().length,tempBatch.getFiles().getBatchFile().length);            
        }

        //BatchDelete
        DeleteRequest deleteRequest = new DeleteRequest();
        deleteRequest.setFilters("BatchId="+batchId);
        DeleteResult deleteResult = port.batchDelete(deleteRequest);
        Assert.assertEquals(SeverityLevel.Success,deleteResult.getResultCode());

    }
    public void testBatchFile() throws RemoteException
    {

        //BatchSave
        Batch batch = new Batch();
        batch.setBatchStatusId("Waiting");
        batch.setBatchTypeId("ItemImport");
        batch.setCompanyId(34005);
        batch.setName("ItemImportTest.xls");
        batch.setOptions("Add File");
        batch.setCreatedDate(Calendar.getInstance());
        batch.setCompletedDate(Calendar.getInstance());
        batch.setModifiedDate(Calendar.getInstance());

        BatchFile batchFile = new BatchFile();
        batchFile.setName("ItemImportTest.xls");
        String filename = "c:\\Batch\\ItemImportTest.xls";
        byte[] contents = GetBytes(filename);
        batchFile.setFilePath(filename);
        batchFile.setSize(contents.length);
        batchFile.setContent(contents);

        BatchFile[] batchFiles = new BatchFile[]{batchFile};
        ArrayOfBatchFile arrayOfBatchFile=new ArrayOfBatchFile();
        arrayOfBatchFile.setBatchFile(batchFiles);
        batch.setFiles(arrayOfBatchFile);

        BatchSaveResult batchSaveResult = port.batchSave(batch);

        Assert.assertEquals(SeverityLevel.Success,batchSaveResult.getResultCode());
        int batchId = batchSaveResult.getBatchId();

        //BatchFileSave- save BatchFile in that BAtchFile only
        batchFile = new BatchFile();
        //Set BatchId for recently stored batch
        batchFile.setBatchId(batchId);
        batchFile.setName("Error.xls");
        batchFile.setSize(100);
        batchFile.setContentType("content type");

        filename = "c:\\Batch\\Errors.xls";
        contents=GetBytes(filename);
        batchFile.setContent(contents);

        BatchFileSaveResult batchFileSaveResult = port.batchFileSave(batchFile);
        Assert.assertEquals(SeverityLevel.Success,batchFileSaveResult.getResultCode());

        //BatchFileFetch
        FetchRequest fetchRequest = new FetchRequest();
        fetchRequest.setFields("*,Content");
        fetchRequest.setFilters("BatchFileId="+batchFileSaveResult.getBatchFileId());
        BatchFileFetchResult batchFileFetchResult = port.batchFileFetch(fetchRequest);
        Assert.assertEquals(SeverityLevel.Success,batchFileFetchResult.getResultCode());

        BatchFile tempBatchFile;
        for (int i=0;i< batchFileFetchResult.getBatchFiles().getBatchFile().length;i++)
        {
            tempBatchFile=batchFileFetchResult.getBatchFiles().getBatchFile(i);
            Assert.assertEquals("Error.xls",tempBatchFile.getName());            
        }

         //BatchFile delete
         DeleteRequest delRequest = new DeleteRequest();
         delRequest.setFilters("BatchFileId="+batchFileSaveResult.getBatchFileId());
         delRequest.setMaxCount(1);
         DeleteResult delResult = port.batchFileDelete(delRequest);
         Assert.assertEquals(SeverityLevel.Success,delResult.getResultCode());

         //Batch Delete
         delRequest = new DeleteRequest();
         delRequest.setFilters("BatchId="+batchId);
         delResult = port.batchDelete(delRequest);
         Assert.assertEquals(SeverityLevel.Success,delResult.getResultCode());

    }
    public byte[] GetBytes(String filePath)
    {
        FileInputStream fileInputStream=null;
        try
        {
            File file=new File(filePath);
            fileInputStream=new FileInputStream(filePath);
            int count=(int)file.length();
            byte[] bytes=new byte[count];

            fileInputStream.read(bytes);

            return bytes;
        }
        catch(Exception ex)
        {
            Assert.fail(ex.getMessage());
            return new byte[0];
        }
        finally {
            if(fileInputStream!=null)
            {
                try
                {
                    fileInputStream.close();
                }
                catch (Exception exe)
                {

                }
            }
        }
    }    
}
