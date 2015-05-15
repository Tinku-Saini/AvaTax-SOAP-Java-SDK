package test.avalara.services;

import junit.framework.*;
import com.avalara.avatax.services.account.*;
import com.avalara.avatax.services.base.*;

import java.io.*;
import javax.xml.rpc.ServiceException;
import javax.xml.soap.SOAPException;
import java.rmi.RemoteException;
import java.util.Properties;
import java.util.Calendar;
import java.util.Date;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.axis.EngineConfiguration;
import org.apache.axis.AxisFault;
import org.apache.axis.configuration.FileProvider;

/**
 * JUnit tests for Avalara AvaTax Tax
 * @author greggr
 * Copyright (c) 2005, Avalara.  All rights reserved.
 */
public class RegistrarTest extends TestCase
{
    private AccountSvc AccountSvc;
    private AccountSvcSoap port;
    private int accountId = 0;
    private static String testSiteName = "Avalara-Technology Team";

    /**
     * Runs Junit TestRunner.
     * @see junit.textui.TestRunner
     * @param args
     */
    public static void main(String args[]) {
        junit.textui.TestRunner.run(RegistrarTest.class);
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

        String userName = "devsiteadmin@avalara.com";
        boolean userNameSet = !isEmpty(userName);

        String password = "kennw0rt";
        boolean passwordSet = !isEmpty(password);

        Assert.assertTrue("In the avatax4j property file, " +
                "either avatax4j.license and " +
                "avatax4j.account need to be" +
                " specified, or avatax4j.userName and " +
                "avatax4j.password need to be specified",
                 (userNameSet && passwordSet));

        EngineConfiguration config = new FileProvider("avatax4j.wsdd");
        AccountSvc = new AccountSvcLocator(config);

        port = AccountSvc.getAccountSvcSoap(new URL(url));

        // Set the profile
        Profile profile = new Profile();
        profile.setClient("RegistrarTest,5.7.0.0");
        port.setProfile(profile);

        // Set security
        // New support for account/license vs. username/password login
        Security security = new Security();
        if (userNameSet && passwordSet)
        {
            security.setPassword(password);
            security.setUserName(userName);
        }
        // IntelliJ erroneously thinks userNameSet is always true, not sure why. It isn't.
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

    //
    // NOTE: Naming convention -- Junit requires test methods to start with "test" as in
    // public void testThis() {}
    // The C# Naming covention for the Avalara test cases was slightly different: public void ThisTest
    // So, in general, the name of the test from the C# has been preserved, but the "Test" portion of
    // the method name has been moved to start the method and made all lower case. For example:
    // In C# test method "public void SomeFunctionalityTest()" would become
    // in Java: "public void testSomeFunctionality()"
    //


    /**
     * Tests Account Service's ping functionality.
     * @throws RemoteException
     */
    public void testPing() throws RemoteException
    {
        PingResult result = port.ping("");

        Assert.assertEquals(SeverityLevel.Success, result.getResultCode());

        // Save old credentials
        Security holder = port.getSecurity();

        // Create new fake credentials & store in service
        Security scam = new Security();
        scam.setAccount("1");
        scam.setLicense("1");
        port.setSecurity(scam);

        PingResult result2;
        boolean ok = true;
        try
        {
            result2 = port.ping("");
        }
        catch (AxisFault e)
        {
            ok = false;
            String test = e.getFaultString();
            Assert.assertTrue("", e.getFaultString().toLowerCase().indexOf("security") >= 0);
        }
        Assert.assertFalse("Expected trapped error due to security problem", ok);

        // restore old credentials
        port.setSecurity(holder);
    }

    /**
     * Tests Account Service's IsAuthorized functionality.
     * @throws RemoteException
     */
    public void testIsAuthorized() throws RemoteException
    {
        IsAuthorizedResult result = port.isAuthorized("Ping,IsAuthorized,UserFetch");

        Assert.assertEquals(SeverityLevel.Success, result.getResultCode());
        Assert.assertEquals("Ping,IsAuthorized,UserFetch", result.getOperations());
        Calendar calendar = result.getExpires();
        ArrayOfMessage messages = result.getMessages();
        Assert.assertTrue( "Expected 0 messages back", messages == null || messages.getMessage().length == 0);

    }

    public void testSiteFetch() throws RemoteException
    {
        // Fetches sites
        FetchRequest fetchRequest = new FetchRequest();
        SiteFetchResult result = port.siteFetch(fetchRequest);
        Assert.assertEquals(SeverityLevel.Success, result.getResultCode());
        Assert.assertTrue(result.getSites().getSite().length > 0);
    }

    public void testAccountCreate() throws RemoteException
    {
        Site testSite = getTestSite();

        Account account = new Account();
        account.setSiteId(testSite.getSiteId());
        account.setAccountName("Test" + new Date().hashCode());
        account.setAccountStatusId(AccountStatusId.Test);
        Date effDate = new Date();
        account.setEffDate(effDate);
        account.setEndDate(new Date(effDate.getYear()+1, effDate.getMonth(), effDate.getDate()));

        // Create Admin User
        User adminUser = new User();
        adminUser.setUserName("Admin@" + account.getAccountName());
        adminUser.setPassword("password");
        adminUser.setFirstName("Account");
        adminUser.setLastName("Admin");
        adminUser.setSecurityRoleId(SecurityRoleId.AccountAdmin);
        adminUser.setIsActive(true);
        adminUser.setEmail(adminUser.getUserName() + ".com");
        adminUser.setPostalCode("98110");
        adminUser.setPasswordStatusId(PasswordStatusId.UserCanChange);
        adminUser.setCreatedDate(Calendar.getInstance());
        adminUser.setModifiedDate(Calendar.getInstance());
        ArrayOfUser users = new ArrayOfUser(new User[1]);
        users.setUser(0, adminUser);
        account.setUsers(users);

        // Add services
        ArrayOfService services = new ArrayOfService(new Service[4]);
        Service service = new Service();
        service.setServiceTypeId(ServiceTypeId.AvaTaxST);
        service.setQuantity(1);
        service.setEffDate(new Date(1900,1,1));
        service.setEndDate(new Date(2999,12,31));
        service.setCreatedDate(Calendar.getInstance());
        service.setModifiedDate(Calendar.getInstance());
        services.setService(0, service);

        service = new Service();
        service.setServiceTypeId(ServiceTypeId.AutoAddress);
        service.setQuantity(1);
        service.setEffDate(new Date(1900,1,1));
        service.setEndDate(new Date(2999,12,31));
        service.setCreatedDate(Calendar.getInstance());
        service.setModifiedDate(Calendar.getInstance());
        services.setService(1, service);

        service = new Service();
        service.setServiceTypeId(ServiceTypeId.Mrs);
        service.setQuantity(1);
        services.setService(2, service);
        service.setEffDate(new Date(1900,1,1));
        service.setEndDate(new Date(2999,12,31));
        service.setCreatedDate(Calendar.getInstance());
        service.setModifiedDate(Calendar.getInstance());

        service = new Service();
        service.setServiceTypeId(ServiceTypeId.AvaCert);
        service.setQuantity(1);
        services.setService(3, service);
        service.setEffDate(new Date(1900,1,1));
        service.setEndDate(new Date(2999,12,31));
        service.setCreatedDate(Calendar.getInstance());
        service.setModifiedDate(Calendar.getInstance());

        account.setServices(services);

        account.setCreatedDate(Calendar.getInstance());
        account.setModifiedDate(Calendar.getInstance());

        AccountSaveResult saveResult = port.accountSave(account);
        Assert.assertEquals(SeverityLevel.Success, saveResult.getResultCode());
        Assert.assertTrue(saveResult.getAccountId() > 0);
        Assert.assertTrue(saveResult.getKey().length() > 0);
    }

    public void testUserFetch() throws RemoteException
    {
        // Fetch users for account
        FetchRequest fetchRequest = new FetchRequest();
        //fetchRequest.setFilters("AccountId=" + accountId);
        AccountFetchResult result = port.accountFetch(fetchRequest);
        Assert.assertEquals(SeverityLevel.Success, result.getResultCode());
        Assert.assertTrue(result.getAccounts().getAccount().length > 0);
    }

    private Site getTestSite() throws RemoteException
    {
        Site testSite = null;

        FetchRequest fetchRequest = new FetchRequest();
        fetchRequest.setFilters("SiteName='" + testSiteName + "'");
        SiteFetchResult fetchResult = port.siteFetch(fetchRequest);
        Assert.assertEquals(SeverityLevel.Success, fetchResult.getResultCode());

        if (fetchResult.getSites().getSite() == null || fetchResult.getSites().getSite().length == 0)
        {
            // Create it
            testSite = new Site();
            testSite.setSiteName(testSiteName);
            testSite.setEffDate(new Date());
            testSite.setEndDate(new Date(2005, 12, 31));
            testSite.setCspId("CSP000001");
            SiteSaveResult saveResult = port.siteSave(testSite);
            Assert.assertEquals(SeverityLevel.Success, saveResult.getResultCode());
        }
        else
        {
            testSite = fetchResult.getSites().getSite(0);
        }

        return testSite;
    }

}
