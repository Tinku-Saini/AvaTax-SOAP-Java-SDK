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
public class AccountSvcTest extends TestCase
{
    private AccountSvc AccountSvc;
    private AccountSvcSoap port;
    //private int accountId = 0;
    private static Company defaultCompany;
    private static String userName;
    private  static String password;
    private  static String account;
    private  static String license;
    private  static boolean accountSet;
    private  static  boolean licenseSet;
    private  static  boolean userNameSet;
    private  static boolean passwordSet;
    private  static int accountId;
    private static String url;
    


    /**
     * Runs Junit TestRunner.
     * @see junit.textui.TestRunner
     * @param args
     */
    public static void main(String args[]) {
        junit.textui.TestRunner.run(AccountSvcTest.class);
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

        url = properties.getProperty("avatax4j.url");
        Assert.assertFalse("avatax4j.url property is not configured in avatax4j.properties", url == null || url.length() == 0);

        account = properties.getProperty("avatax4j.account");
        accountSet = !isEmpty(account);
        if (accountSet)
        {
            accountId = Integer.parseInt(account);
        }

        license = properties.getProperty("avatax4j.license");
        licenseSet = !isEmpty(license);

        // Note the addition of userName and password from the avatax4j properties file
        userName = properties.getProperty("avatax4j.userName");
        userNameSet = !isEmpty(userName);

        password = properties.getProperty("avatax4j.password");;
        passwordSet = !isEmpty(password);

        Assert.assertTrue("In the avatax4j property file, " +
                "either avatax4j.license and " +
                "avatax4j.account need to be" +
                " specified, or avatax4j.userName and " +
                "avatax4j.password need to be specified",
                ((licenseSet && accountSet) ||
                 (userNameSet && passwordSet)));

        EngineConfiguration config = new FileProvider("avatax4j.wsdd");
        AccountSvc = new AccountSvcLocator(config);

        port = AccountSvc.getAccountSvcSoap(new URL(url));

        // Set the profile
        Profile profile = new Profile();
        profile.setClient("AccountSvcTest,5.7.0.0");
        port.setProfile(profile);

        // Set security
        // New support for account/license vs. username/password login
        Security security = new Security();
        if (userNameSet && passwordSet)
        {
            security.setPassword(password);
            security.setUserName(userName);            
        }
        else if (accountSet && licenseSet)
        {
            security.setAccount(account);
            security.setLicense(license);
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

    public void testUserFetch() throws RemoteException
    {
        // Fetch users for account
        FetchRequest fetchRequest = new FetchRequest();
        //fetchRequest.setFilters("AccountId=" + accountId);
        AccountFetchResult accountFetchResult = port.accountFetch(fetchRequest);
        Assert.assertEquals(SeverityLevel.Success, accountFetchResult.getResultCode());
        Assert.assertTrue(accountFetchResult.getAccounts().getAccount().length > 0);
        accountId= accountFetchResult.getAccounts().getAccount(0).getAccountId();
        System.out.print("");

        


    }

    public void testCompanySettings() throws RemoteException
    {
        // Get default company
        FetchRequest companyFetch = new FetchRequest();
        companyFetch.setFilters("IsDefault=true");
        CompanyFetchResult companyFetchResult = port.companyFetch(companyFetch);
        Assert.assertEquals(SeverityLevel.Success, companyFetchResult.getResultCode());
        defaultCompany = companyFetchResult.getCompanies().getCompany(0);


        try
        {
            // Add some settings
            CompanySetting companySettings[] = new CompanySetting[1];
            companySettings[0] = new CompanySetting();
            companySettings[0].setCompanyId(defaultCompany.getCompanyId());
            companySettings[0].setSet("Test");
            companySettings[0].setName("Setting1");
            companySettings[0].setValue("Value1");
            CompanySettingSaveResult saveResult = port.companySettingSave(companySettings);
            Assert.assertEquals(SeverityLevel.Success, saveResult.getResultCode());

            // Fetch settings
            FetchRequest fetchRequest = new FetchRequest();
            fetchRequest.setFilters("CompanyId=" + defaultCompany.getCompanyId() + " and Set='Test'");
            fetchRequest.setSort("Name");
            CompanySettingFetchResult fetchResult = port.companySettingFetch(fetchRequest);
            Assert.assertEquals(SeverityLevel.Success, fetchResult.getResultCode());
            Assert.assertEquals(1, fetchResult.getCompanySettings().getCompanySetting().length);
            Assert.assertEquals(companySettings[0].getSet(), fetchResult.getCompanySettings().getCompanySetting(0).getSet());
            Assert.assertEquals(companySettings[0].getName(), fetchResult.getCompanySettings().getCompanySetting(0).getName());

            // Update settings
            companySettings = new CompanySetting[2];
            companySettings[0] = fetchResult.getCompanySettings().getCompanySetting(0);
            companySettings[0].setValue("Value1a");
            companySettings[1] = new CompanySetting();
            companySettings[1].setCompanyId(defaultCompany.getCompanyId());
            companySettings[1].setSet("Test");
            companySettings[1].setName("Setting2");
            companySettings[1].setValue("Value2");
            saveResult = port.companySettingSave(companySettings);
            Assert.assertEquals(SeverityLevel.Success, saveResult.getResultCode());

            // Fetch settings
            fetchResult = port.companySettingFetch(fetchRequest);
            Assert.assertEquals(SeverityLevel.Success, fetchResult.getResultCode());
            Assert.assertEquals(2, fetchResult.getCompanySettings().getCompanySetting().length);
            Assert.assertEquals(companySettings[0].getSet(), fetchResult.getCompanySettings().getCompanySetting(0).getSet());
            Assert.assertEquals(companySettings[0].getName(), fetchResult.getCompanySettings().getCompanySetting(0).getName());
            Assert.assertEquals(companySettings[1].getSet(), fetchResult.getCompanySettings().getCompanySetting(1).getSet());
            Assert.assertEquals(companySettings[1].getName(), fetchResult.getCompanySettings().getCompanySetting(1).getName());
        }
        finally
        {
            // Delete them
            DeleteRequest deleteRequest = new DeleteRequest();
            deleteRequest.setFilters("CompanyId=" + defaultCompany.getCompanyId() + " and Set='Test'");
            DeleteResult deleteResult = port.companySettingDelete(deleteRequest);
            Assert.assertEquals(SeverityLevel.Success, deleteResult.getResultCode());
        }
    }

    public void testServiceOperation() throws RemoteException,ServiceException,MalformedURLException,SOAPException
    {
        DeleteRequest deleteRequest=new DeleteRequest();
        try
        {

            Date effDate=new Date();
            Date endDate=new Date();
            Calendar createdDate=Calendar.getInstance();
            Calendar modifiedDate=Calendar.getInstance();

            //ServiceSave
            Service service=new Service();
            service.setAccountId(accountId);
            service.setCompanyId(0);
            service.setServiceTypeId(ServiceTypeId.AvaTaxST);
            service.setEffDate(effDate);
            service.setEndDate(endDate);
            service.setCreatedDate(createdDate);
            service.setModifiedDate(modifiedDate);
            service.setQuantity(1);

            setRegistrarSecurity();
            ServiceSaveResult serviceSaveResult= port.serviceSave(service);
            Assert.assertEquals(SeverityLevel.Success,serviceSaveResult.getResultCode());
            deleteRequest.setFilters("ServiceId="+serviceSaveResult.getServiceId()+"");

            //Service Fetch            
            FetchRequest fetchRequest=new FetchRequest();
            fetchRequest.setFilters("ServiceId="+serviceSaveResult.getServiceId()+"");
            ServiceFetchResult serviceFetchResult=port.serviceFetch(fetchRequest);
            Assert.assertEquals(SeverityLevel.Success,serviceFetchResult.getResultCode());
            Service fetchedService= serviceFetchResult.getServices().getService(0);
            Assert.assertEquals(accountId,fetchedService.getAccountId());
            Assert.assertEquals(0, fetchedService.getCompanyId());
            Assert.assertEquals(ServiceTypeId.AvaTaxST,fetchedService.getServiceTypeId());            
            Assert.assertEquals(1,fetchedService.getQuantity());
            

        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
        finally
        {
            DeleteResult deleteResult= port.serviceDelete(deleteRequest);
            Assert.assertEquals(SeverityLevel.Success,deleteResult.getResultCode());
            setDefaultSecurity();
        }

    }
    public void testAvaCertServiceOperation() throws RemoteException,ServiceException,MalformedURLException,SOAPException
    {
        DeleteRequest deleteRequest=new DeleteRequest();
        try
        {

            Date effDate=new Date();
            Date endDate=new Date();
            Calendar createdDate=Calendar.getInstance();
            Calendar modifiedDate=Calendar.getInstance();

            //ServiceSave
            Service service=new Service();
            service.setAccountId(accountId);
            service.setCompanyId(0);
            service.setServiceTypeId(ServiceTypeId.AvaCert);
            service.setEffDate(effDate);
            service.setEndDate(endDate);
            service.setCreatedDate(createdDate);
            service.setModifiedDate(modifiedDate);
            service.setQuantity(1);

            setRegistrarSecurity();
            ServiceSaveResult serviceSaveResult= port.serviceSave(service);
            Assert.assertEquals(SeverityLevel.Success,serviceSaveResult.getResultCode());
            deleteRequest.setFilters("ServiceId="+serviceSaveResult.getServiceId()+"");

            //Service Fetch
            FetchRequest fetchRequest=new FetchRequest();
            fetchRequest.setFilters("ServiceId="+serviceSaveResult.getServiceId()+"");
            ServiceFetchResult serviceFetchResult=port.serviceFetch(fetchRequest);
            Assert.assertEquals(SeverityLevel.Success,serviceFetchResult.getResultCode());
            Service fetchedService= serviceFetchResult.getServices().getService(0);
            Assert.assertEquals(accountId,fetchedService.getAccountId());
            Assert.assertEquals(0, fetchedService.getCompanyId());
            Assert.assertEquals(ServiceTypeId.AvaCert,fetchedService.getServiceTypeId());
            Assert.assertEquals(1,fetchedService.getQuantity());


        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
        finally
        {
            DeleteResult deleteResult= port.serviceDelete(deleteRequest);
            Assert.assertEquals(SeverityLevel.Success,deleteResult.getResultCode());
            setDefaultSecurity();
        }

    }
    private void setRegistrarSecurity() throws RemoteException,ServiceException,MalformedURLException,SOAPException
    {
        EngineConfiguration config = new FileProvider("avatax4j.wsdd");
        AccountSvc = new AccountSvcLocator(config);

        port = AccountSvc.getAccountSvcSoap(new URL(url));

        // Set the profile
        Profile profile = new Profile();
        profile.setClient("AccountSvcTest,4.1.0.0");
        port.setProfile(profile);


        // Set security
        // New support for account/license vs. username/password login
        Security security = new Security();
        security.setUserName("registrar@avalara.com");
        security.setPassword("kennwort");

        // IntelliJ erroneously thinks userNameSet is always true, not sure why. It isn't.
        port.setSecurity(security);


        
    }
    private void setDefaultSecurity() throws RemoteException,ServiceException,MalformedURLException,SOAPException
    {

        EngineConfiguration config = new FileProvider("avatax4j.wsdd");
        AccountSvc = new AccountSvcLocator(config);

        port = AccountSvc.getAccountSvcSoap(new URL(url));

        // Set the profile
        Profile profile = new Profile();
        profile.setClient("AccountSvcTest,4.1.0.0");
        port.setProfile(profile);

        // Set security
        // New support for account/license vs. username/password login
        Security security = new Security();
        if (userNameSet && passwordSet)
        {
            security.setPassword(password);
            security.setUserName(userName);
        }
        else if (accountSet && licenseSet)
        {
            security.setAccount(account);
            security.setLicense(license);
        }
        // IntelliJ erroneously thinks userNameSet is always true, not sure why. It isn't.
        port.setSecurity(security);
        
    }
    public void testNexus() throws RemoteException
    {


        Calendar calendar= Calendar.getInstance();

        String jurisName = "Test_Nexus";

        try
        {

            //Create new nexus
            Nexus nexus = new Nexus();
            nexus.setCompanyId(defaultCompany.getCompanyId());
            nexus.setEffDate(calendar.getTime());
            nexus.setCreatedDate(calendar);
            nexus.setModifiedDate(calendar);
            calendar.add(Calendar.YEAR,1);
            nexus.setEndDate(calendar.getTime());
            nexus.setJurisCode("juris");
            nexus.setJurisName(jurisName);
            nexus.setJurisTypeId(JurisTypeId.CIT);
            nexus.setState("WA");
            nexus.setLocalNexusTypeId(LocalNexusTypeId.Selected);
            
            nexus.setNexusTypeId(NexusTypeId.None);

            NexusSaveResult nexusSaveResult = port.nexusSave(nexus);
            Assert.assertEquals(SeverityLevel.Success,nexusSaveResult.getResultCode());
            Assert.assertTrue(nexusSaveResult.getNexusId() > 0);

            //Fetch Nexus
            FetchRequest fetchRequest = new FetchRequest();
            fetchRequest.setFields("*");
            fetchRequest.setFilters("JurisName like '" + jurisName + "%'");
            fetchRequest.setPageIndex(0);
            fetchRequest.setPageSize(0);
            fetchRequest.setMaxCount(5);
            fetchRequest.setRecordCount(0);
            NexusFetchResult fetchResult = port.nexusFetch(fetchRequest);

            Assert.assertEquals(SeverityLevel.Success, fetchResult.getResultCode());
        }
        finally
        {
            DeleteRequest deleteRequest = new DeleteRequest();            
            deleteRequest.setFilters("CompanyId='" + defaultCompany.getCompanyId() + "' and State='WA' and JurisCode='juris'");
            deleteRequest.setMaxCount(1);
            DeleteResult deleteResult = port.nexusDelete(deleteRequest);

            Assert.assertEquals(SeverityLevel.Success,deleteResult.getResultCode());
            Assert.assertEquals(1,deleteResult.getCount());
        }
    }
    public void testEcms() throws RemoteException
    {
        int exemptCertId=0;
        try
        {

            ExemptCert cert = new ExemptCert();            
            cert.setAddress1("Test_my address 1");
            cert.setAddress2 ("Test_my address 2");
            cert.setAddress3("Test_my address 3");
            cert.setBusinessTypeId (new org.apache.axis.types.UnsignedByte(1));
            cert.setBusinessTypeDescription("Accommodations and food services");
            cert.setCity("Test_PUNE");
            cert.setRegion( "WA");
            cert.setPostalCode( "98110");
            cert.setCountry( "IN");
            cert.setCompanyId( defaultCompany.getCompanyId());
            cert.setCreatedDate( Calendar.getInstance());
            cert.setCustomerCode( "Test_Customer Code");
            cert.setCustomerName( "Test_Customer");
            cert.setDocumentRefNo( "Test_Doc Ref");
            cert.setExemptReasonId( "G");
            cert.setEffDate(Calendar.getInstance());
            cert.setExemptCertTypeId(ExemptCertType.Single);
            cert.setExemptCertStatusId(ExemptCertStatus.Active);            
            cert.setExpiryDate(Calendar.getInstance());
            cert.setModifiedDate(Calendar.getInstance());
            cert.setCountryIssued("US");
            cert.setExemptCertReviewStatusId(ExemptCertReviewStatus.Pending);
            cert.setAvaCertId("0");
            cert.setBusinessTypeOtherDescription("BusinessTypeOtherDescription");
            cert.setExemptReasonOtherDescription("ExemptReasonOtherDescription");
            cert.setLastTransactionDate(Calendar.getInstance());

            Calendar endDate=Calendar.getInstance();
            endDate.add(Calendar.DAY_OF_MONTH,1);
            ExemptCertDetail exemptCertDetail = new ExemptCertDetail();
            exemptCertDetail.setEndDate(endDate);
            exemptCertDetail.setCountry("US");
            exemptCertDetail.setIdType("TIN");
            exemptCertDetail.setIdNo("123455");
            exemptCertDetail.setRegion("AR");
            ExemptCertDetail[] exemptCertDetails = new ExemptCertDetail[1];
            exemptCertDetails[0] = exemptCertDetail;

            ArrayOfExemptCertDetail arrayOfExemptCertDetail=new ArrayOfExemptCertDetail();
            arrayOfExemptCertDetail.setExemptCertDetail(exemptCertDetails);
            cert.setExemptCertDetails(arrayOfExemptCertDetail);

            //SaveExemptCert
            ExemptCertSaveResult exemptCertSaveResult = port.exemptCertSave(cert);
            Assert.assertEquals(SeverityLevel.Success,exemptCertSaveResult.getResultCode());
            exemptCertId=exemptCertSaveResult.getExemptCertId();
            Assert.assertTrue(exemptCertSaveResult.getExemptCertId() > 1);

            //FetchExemptCert
            FetchRequest fetchRequest = new FetchRequest();
            fetchRequest.setFilters("ExemptCertId=" + exemptCertSaveResult.getExemptCertId() + " and CompanyId=" + cert.getCompanyId());
            fetchRequest.setFields("*,ExemptCertDetails");
            ExemptCertFetchResult exemptCertResult = port.exemptCertFetch(fetchRequest);
            Assert.assertEquals(SeverityLevel.Success,exemptCertResult.getResultCode());
            Assert.assertTrue(exemptCertResult.getCertificates().getExemptCert().length > 0);

            //Compare all properties
            ExemptCert tempExemptCert=exemptCertResult.getCertificates().getExemptCert(0);
            Assert.assertEquals(cert.getAddress1(),tempExemptCert.getAddress1());
            Assert.assertEquals(cert.getAddress2(),tempExemptCert.getAddress2());
            Assert.assertEquals(cert.getAddress3(),tempExemptCert.getAddress3());
            Assert.assertEquals(cert.getBusinessTypeId(),tempExemptCert.getBusinessTypeId());
            Assert.assertEquals(cert.getBusinessTypeDescription(),tempExemptCert.getBusinessTypeDescription());
            Assert.assertEquals(cert.getCity(),tempExemptCert.getCity());
            Assert.assertEquals(cert.getCompanyId(),tempExemptCert.getCompanyId());
            Assert.assertEquals(cert.getCountry(),tempExemptCert.getCountry());
            compareDate(cert.getCreatedDate().getTime(),tempExemptCert.getCreatedDate().getTime());
            Assert.assertEquals(cert.getCustomerCode(),tempExemptCert.getCustomerCode());
            Assert.assertEquals(cert.getCustomerName(),tempExemptCert.getCustomerName());
            Assert.assertEquals(cert.getDocumentRefNo(),tempExemptCert.getDocumentRefNo());
            Assert.assertEquals(cert.getExemptReasonId(),tempExemptCert.getExemptReasonId());
            Assert.assertEquals(cert.getRegion(),tempExemptCert.getRegion());
            Assert.assertEquals(cert.getPostalCode(),tempExemptCert.getPostalCode());
            compareDate(cert.getEffDate().getTime(),tempExemptCert.getEffDate().getTime());
            Assert.assertEquals(cert.getBusinessTypeOtherDescription(),tempExemptCert.getBusinessTypeOtherDescription());
            Assert.assertEquals(cert.getExemptReasonOtherDescription(),tempExemptCert.getExemptReasonOtherDescription());
            compareDate(cert.getLastTransactionDate().getTime(),tempExemptCert.getLastTransactionDate().getTime());
            Assert.assertEquals(cert.getCountryIssued(),tempExemptCert.getCountryIssued());
            Assert.assertEquals(cert.getExemptCertReviewStatusId(),tempExemptCert.getExemptCertReviewStatusId());
            Assert.assertEquals(cert.getAvaCertId(),tempExemptCert.getAvaCertId());

            Assert.assertTrue(tempExemptCert.getExemptCertDetails().getExemptCertDetail().length > 0);
            ExemptCertDetail tempExemptCertDetail=tempExemptCert.getExemptCertDetails().getExemptCertDetail(0);
            compareDate(exemptCertDetail.getEndDate().getTime(),tempExemptCertDetail.getEndDate().getTime());
            Assert.assertEquals(exemptCertDetail.getCountry(),tempExemptCertDetail.getCountry());
            Assert.assertEquals(exemptCertDetail.getIdType(),tempExemptCertDetail.getIdType());
            Assert.assertEquals(exemptCertDetail.getIdNo(),tempExemptCertDetail.getIdNo());
            Assert.assertEquals(exemptCertDetail.getRegion(),tempExemptCertDetail.getRegion());
            

        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
        finally
        {
            DeleteRequest deleteRequest = new DeleteRequest();
            deleteRequest.setFilters("ExemptCertId=" + exemptCertId + " and CompanyId=" +defaultCompany.getCompanyId());

            DeleteResult deleteResult = port.exemptCertDelete(deleteRequest);
            Assert.assertEquals(SeverityLevel.Success,deleteResult.getResultCode());
            Assert.assertTrue(deleteResult.getCount() >0);                        
        }
    }
    private void compareDate(Date dateExpected, Date dateActual)
   {
       Calendar calExpected=Calendar.getInstance();
       calExpected.setTime(dateExpected);

       Calendar calActual=Calendar.getInstance();
       calActual.setTime(dateActual);

       String strExpected= calExpected.get(Calendar.DATE) + ""+ calExpected.get(Calendar.MONTH)+ "" + calExpected.get(Calendar.YEAR) + "";
       String strActual= calActual.get(Calendar.DATE) + "" + calActual.get(Calendar.MONTH) + "" +  calActual.get(Calendar.YEAR) + "";

       Assert.assertEquals(strExpected,strActual);
   }
}
