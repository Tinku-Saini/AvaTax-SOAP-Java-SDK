import com.avalara.avatax.services.local.*;

import java.util.Properties;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.rmi.RemoteException;

import junit.framework.Assert;

import javax.xml.rpc.ServiceException;

/**
 * Created by IntelliJ IDEA.
 * User: swetal.desai
 * Date: Oct 14, 2009
 * Time: 2:15:21 PM
 * To change this template use File | Settings | File Templates.
 */
public class LocalSvcSample {
     private LocalSvc localSvc;
    private LocalSvcSoap port;

    public static void main(String args[])
    {
        try
        {
            LocalSvcSample localSvcSample=new LocalSvcSample();
            localSvcSample.intialise();
            localSvcSample.pingSample();
            localSvcSample.getUpdatesSample();
            localSvcSample.postTransactionsSample();
            localSvcSample.configSettingFetchSample();
            localSvcSample.getInfoSample();
        }
        catch(Exception ex)
        {
            ex.printStackTrace();

        }
        
    }
    public void intialise() throws IOException, ServiceException {


        System.out.println("Intialising");
        System.out.println("---------------");
        
        Properties properties = new Properties();
        File file = new File("avatax4j-localsvc.properties");
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
        localSvc=new LocalSvcLocator();
        port=localSvc.getLocalSvcSoap(new URL(url));

    }
    public void pingSample()throws RemoteException {
        System.out.println("PingSample");
        System.out.println("---------------");

        PingResult result = port.ping("REMOTE");
        System.out.println("Result Code:"+result.getResultCode());
        System.out.println("Version:"+result.getVersion());                

    }
    public void getUpdatesSample() throws RemoteException
    {
        System.out.println("\nGetUpdatesSample");
        System.out.println("---------------");
        GetUpdatesRequest getUpdatesRequest=new GetUpdatesRequest();
        getUpdatesRequest.setUpdateType(UpdateType.Modified);
        GetUpdatesResult getUpdatesResult=port.getUpdates(getUpdatesRequest);
        ArrayOfMessage arrMessage=getUpdatesResult.getMessages();
        for(int i=0;i<arrMessage.getMessage().length;i++)
        {
            Message msg=arrMessage.getMessage(i);
            System.out.println("Name:"+msg.getName());
            System.out.println("Summary:"+msg.getSummary());
            System.out.println("Details:"+msg.getDetails());
        }
        
    }
    public void postTransactionsSample()throws RemoteException
    {
        System.out.println("\nPostTransactionSample");
        System.out.println("---------------");
        PostTransactionResult postTransactionResult=port.postTransactions();
        ArrayOfMessage arrMessage=postTransactionResult.getMessages();
        for(int i=0;i<arrMessage.getMessage().length;i++)
        {
            Message msg=arrMessage.getMessage(i);
            System.out.println("Name:"+msg.getName());
            System.out.println("Summary:"+msg.getSummary());
            System.out.println("Details:"+msg.getDetails());
        }

    }
    public void configSettingFetchSample() throws RemoteException
    {
        System.out.println("\nConfigSettingFetchSample");
        System.out.println("---------------");
        ConfigSettingFetchResult configSettingFetchResult= port.configSettingFetch("AvaTaxLocalUrl");
        System.out.println("AvaTaxLocalUrl:"+configSettingFetchResult.getConfigSettings().getConfigSetting(0).getValue());         
    }
    public void getInfoSample()throws RemoteException
    {
        System.out.println("\nGetInfoSample");
        System.out.println("---------------");
        GetInfoResult getInfoResult=port.getInfo();
        System.out.println("Pending Transaction:"+getInfoResult.getPendingTransactionCount());
    }
}
