package test.avalara.services;

import junit.framework.*;
import com.avalara.avatax.services.local.*;

import javax.xml.rpc.ServiceException;
import javax.xml.soap.SOAPException;
import java.net.MalformedURLException;
import java.net.URL;
import java.io.IOException;
import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.rmi.RemoteException;

/**
 * Created by IntelliJ IDEA.
 * User: swetal.desai
 * Date: Oct 12, 2009
 * Time: 11:24:05 AM
 * To change this template use File | Settings | File Templates.
 */
public class LocalSvcTest extends TestCase {

    private LocalSvc localSvc;
    private LocalSvcSoap port;

        /**
     * Runs Junit TestRunner.
     * @see junit.textui.TestRunner
     * @param args
     */
    public static void main(String args[]) {
        junit.textui.TestRunner.run(LocalSvcTest.class);
    }
    protected void setUp() throws ServiceException, SOAPException, MalformedURLException, IOException
    {
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
     public void testPing() throws RemoteException {
        PingResult result = port.ping("BVT");

        Assert.assertEquals(SeverityLevel.Success, result.getResultCode());
    }
    public void testGetUpdates() throws RemoteException
    {
        GetUpdatesRequest getUpdatesRequest=new GetUpdatesRequest();
        getUpdatesRequest.setUpdateType(UpdateType.Modified);

        GetUpdatesResult getUpdatesResult= port.getUpdates(getUpdatesRequest);
        Assert.assertEquals(SeverityLevel.Success,getUpdatesResult.getResultCode());

    }
    public void testPostTransactions() throws RemoteException
    {
        PostTransactionResult postTransactionResult= port.postTransactions();
        Assert.assertEquals(SeverityLevel.Success,postTransactionResult.getResultCode());
    }
    public void testConfigSettingSave() throws RemoteException
    {
        ConfigSetting configSetting=new ConfigSetting("timeOut","500");
        ConfigSetting[] configSettings=new ConfigSetting[1];
        configSettings[0]=configSetting;

        ArrayOfConfigSetting arrayOfConfigSetting=new ArrayOfConfigSetting();
        arrayOfConfigSetting.setConfigSetting(configSettings);

        ConfigSettingSaveResult configSettingSaveResult = port.configSettingSave(arrayOfConfigSetting);
        Assert.assertEquals(SeverityLevel.Success,configSettingSaveResult.getResultCode());
    }
     public void testConfigSettingFetch() throws RemoteException
    {
        ConfigSettingFetchResult configSettingFetchResult = port.configSettingFetch("timeOut");
        Assert.assertEquals(SeverityLevel.Success,configSettingFetchResult.getResultCode());
        Assert.assertNotNull("Config setting can not be retreived",configSettingFetchResult.getConfigSettings());
        Assert.assertEquals(1, configSettingFetchResult.getConfigSettings().getConfigSetting().length);
        Assert.assertEquals("500",configSettingFetchResult.getConfigSettings().getConfigSetting(0).getValue());        
    }
    public void testGetInfo() throws RemoteException
    {

        GetInfoResult getInfoResult= port.getInfo();
        Assert.assertEquals(SeverityLevel.Success,getInfoResult.getResultCode());
    }

    


}
