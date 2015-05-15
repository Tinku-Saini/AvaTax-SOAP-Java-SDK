import com.avalara.avatax.services.base.Profile;
import com.avalara.avatax.services.base.Security;
import com.avalara.avatax.services.batch.*;
import junit.framework.Assert;

import javax.xml.rpc.ServiceException;
import javax.xml.soap.SOAPException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Calendar;
import java.util.Properties;

/**
 * Created by IntelliJ IDEA.
 * User: Swetal.Desai
 * Date: Jul 12, 2010
 * Time: 11:47:14 AM
 * To change this template use File | Settings | File Templates.
 */
public class BatchSvcSample {

    public static void main(String[] args)
    {

        try
        {
            BatchSvcSoap port=getBatchSvc();

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
            System.out.println("BatchSave");
            BatchSaveResult batchSaveResult = port.batchSave(batch);
            System.out.println("BatchSaveResult:"+batchSaveResult.getResultCode());
            System.out.println("BatchId:"+batchSaveResult.getBatchId());
            FetchRequest fetchRequest = new FetchRequest();
            fetchRequest.setFields("*,Files.Content");
            fetchRequest.setFilters("BatchId="+batchSaveResult.getBatchId());
            int batchId = batchSaveResult.getBatchId();

            //Batch Fetch
            System.out.println("\n");
            System.out.println("BatchFetch");
            BatchFetchResult batchFetchResult = port.batchFetch(fetchRequest);
            System.out.println("BatchFetchResult:"+batchFetchResult.getResultCode());
            System.out.println("BatchCount:"+batchFetchResult.getBatches().getBatch().length);

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
            System.out.println("\n");
            System.out.println("BatchDelete");
            DeleteRequest deleteRequest = new DeleteRequest();

            deleteRequest.setFilters("BatchId="+batchId);
            DeleteResult deleteResult = port.batchDelete(deleteRequest);
            System.out.println("BatchDeleteResult:"+deleteResult.getResultCode());
            Assert.assertEquals(SeverityLevel.Success,deleteResult.getResultCode());
            }
            catch(Exception ex)
            {
               System.out.println("Exception: " + ex.getMessage());
            }


    }
    private static BatchSvcSoap getBatchSvc() throws ServiceException, SOAPException, MalformedURLException, IOException
    {
        BatchSvc batchSvc;
        BatchSvcSoap port;
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

        return port;
    }
    private static boolean isEmpty(String str)
    {
        return str == null || str.trim().length() == 0;
    }

    public static byte[] GetBytes(String filePath)
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
