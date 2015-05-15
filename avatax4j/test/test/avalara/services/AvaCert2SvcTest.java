package test.avalara.services;
import com.avalara.avatax.services.avacert2.*;
import com.avalara.avatax.services.base.Profile;
import com.avalara.avatax.services.base.Security;
import junit.framework.Assert;
import junit.framework.TestCase;
import org.apache.axis.AxisFault;
import javax.xml.rpc.ServiceException;
import javax.xml.soap.SOAPException;
import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;
import java.util.Calendar;
import java.util.Date;
import java.util.Properties;

/**
 * Created by IntelliJ IDEA.
 * User: swetal.desai
 * Date: Apr 15, 2010
 * Time: 11:18:50 AM
 * To change this template use File | Settings | File Templates.
 */
public class AvaCert2SvcTest extends TestCase {

     private AvaCert2Svc avaCert2Svc;
    private AvaCert2SvcSoap port;
      String customerCode;

    protected void setUp() throws ServiceException, SOAPException, MalformedURLException, IOException
    {
        Properties properties = new java.util.Properties();
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
        Assert.assertFalse("avatax4j.account property is not configured in avatax4j.properties", account == null || account.length() == 0);

        String license = properties.getProperty("avatax4j.license");
        Assert.assertFalse("avatax4j.license property is not configured in avatax4j.properties", license == null || license.length() == 0);


        avaCert2Svc = new AvaCert2SvcLocator();

        port = avaCert2Svc.getAvaCert2SvcSoap(new URL(url));

        // Set the profile
        Profile profile = new Profile();
        profile.setName("11.2");
        profile.setClient("AvaCertSvcTest,11.2");
        port.setProfile(profile);

        // Set security
        Security security = new Security();
        security.setAccount(account);
        security.setLicense(license);
        port.setSecurity(security);
    }

    public void testPing() throws RemoteException
    {
        PingResult pingResult = port.ping("");

        Assert.assertEquals(SeverityLevel.Success, pingResult.getResultCode());
    }
    public void testCustomerSave() throws Exception
    {


            Customer customer=getCustomer();
            CustomerSaveRequest customerSaveRequest = new CustomerSaveRequest();
            customerSaveRequest.setCompanyCode("Default");
            CustomerSaveResult customerSaveResult = new CustomerSaveResult();
            customerSaveRequest.setCustomer( customer);
            customerSaveResult = port.customerSave(customerSaveRequest);

        //Success
        Assert.assertEquals(SeverityLevel.Success,customerSaveResult.getResultCode());



        //Add duplicate customer - No error
        customerSaveRequest = new CustomerSaveRequest();
        customerSaveRequest.setCompanyCode("Default");
        customerSaveRequest.setCustomer(customer);
        customerSaveResult= port.customerSave(customerSaveRequest);
        Assert.assertEquals(SeverityLevel.Success,customerSaveResult.getResultCode());

        //failure-while Passing new customer code, customer corresponding to old customer code not present
        customer.setCustomerCode("CC"+new Date().getTime());
        customer.setNewCustomerCode("NCC"+new Date().getTime());
        customerSaveRequest = new CustomerSaveRequest();
         customerSaveRequest.setCompanyCode("Default");
        customerSaveRequest.setCustomer(customer);
        customerSaveResult= port.customerSave(customerSaveRequest);
        Assert.assertEquals(SeverityLevel.Warning,  customerSaveResult.getResultCode());

        //failure-empty customer object is passed
        customer=new Customer();
        customerSaveRequest = new CustomerSaveRequest();
        customerSaveRequest.setCompanyCode("Default");
        customerSaveRequest.setCustomer(customer);
        customerSaveResult= port.customerSave(customerSaveRequest);
        Assert.assertEquals(SeverityLevel.Error,customerSaveResult.getResultCode());


            String customerCodeValue="avatax4j"+new Date().getTime() ;
            customer.setCustomerCode(customerCodeValue);
            CustomerSaveRequest addcustReq = new CustomerSaveRequest();
            CustomerSaveResult addcustRes = new CustomerSaveResult();
            addcustReq.setCompanyCode("Default");
            addcustReq.setCustomer(customer);
            addcustRes = port.customerSave(addcustReq);


           //If a value for the NEW_CUSTOMER_REF_ID field is provided, and the ACTION field value is C or the ACTION field value is R and no customer record with the given CUSTOMER_REF_ID is found, 
           //then a new customer record will be created with the NEW_CUSTOMER_REF_ID field value, and a warning will be issued.

            customer = getCustomer();
            addcustReq = new CustomerSaveRequest();
            addcustRes = new CustomerSaveResult();
            addcustReq.setCompanyCode("Default");
            customer.setCustomerCode("CC" + new Date().getTime());
            customer.setNewCustomerCode("NCC" +new Date().getTime());
            customer.setBusinessName("Avalara , Inc");
            addcustReq.setCustomer(customer);
            addcustRes = port.customerSave(addcustReq);
            Assert.assertEquals(SeverityLevel.Warning,addcustRes.getResultCode());
        
            //NewCustRefId already exists with other customer test

            customer = getCustomer();
            addcustReq = new CustomerSaveRequest();
            addcustRes = new CustomerSaveResult();
            addcustReq.setCompanyCode("Default");
            customer.setCustomerCode(customerCodeValue);
            addcustReq.setCustomer(customer);
            addcustRes = port.customerSave(addcustReq);

            customer = getCustomer();
            addcustReq = new CustomerSaveRequest();
            addcustRes = new CustomerSaveResult();
            addcustReq.setCompanyCode("Default");
            customer.setCustomerCode("afafafafdvs");
            customer.setNewCustomerCode(customerCodeValue);
            addcustReq.setCustomer(customer);
            addcustRes = port.customerSave(addcustReq);
            Assert.assertEquals("Error saving the Customer.",addcustRes.getMessages().getMessage(0).getSummary());

           //ParentCustomerId does not exists in the database


            customer = getCustomer();
            addcustReq = new CustomerSaveRequest();
            addcustRes = new CustomerSaveResult();
            addcustReq.setCompanyCode("Default");
            customer.setCustomerCode("CC" + new Date().getTime());
            customer.setParentCustomerCode("testparentcustcode");
            addcustReq.setCustomer(customer);
            addcustRes = port.customerSave(addcustReq);
            Assert.assertEquals("Error saving the Customer.",addcustRes.getMessages().getMessage(0).getSummary());

        //Region not supported test.
            customer = getCustomer();
            customerCodeValue="avatax4j"+new Date().getTime() ;
            customer.setCustomerCode(customerCodeValue);
            customer.setState("AAA");
            addcustReq = new CustomerSaveRequest();
            addcustRes = new CustomerSaveResult();
            addcustReq.setCompanyCode("Default");
            addcustReq.setCustomer(customer);
            addcustRes = port.customerSave(addcustReq);
           Assert.assertEquals("Error saving the Customer.", addcustRes.getMessages().getMessage(0).getSummary());
           Assert.assertEquals("Record Skipped; Error: 'AAA' is not a valid USPS State Code", addcustRes.getMessages().getMessage(0).getDetails());

        //invalid email check test

             customer = getCustomer();
            customerCodeValue="avatax4j"+new Date().getTime() ;
            customer.setCustomerCode(customerCodeValue);
            customer.setEmail("AAA");
            addcustReq = new CustomerSaveRequest();
            addcustRes = new CustomerSaveResult();
            addcustReq.setCompanyCode("Default");
            addcustReq.setCustomer(customer);
            addcustRes = port.customerSave(addcustReq);
            Assert.assertEquals("Error saving the Customer.", addcustRes.getMessages().getMessage(0).getSummary());
            Assert.assertEquals("Record Skipped; Error: 'AAA' is not a well-formed email address", addcustRes.getMessages().getMessage(0).getDetails());
    }


    
    public void testCertificateRequestInitiate() throws RemoteException
    {


       //Add customer
            Customer customer = getCustomer(); 
            String customerCodeValue="avatax4j"+new Date().getTime() ;
            customer.setCustomerCode(customerCodeValue);
            CustomerSaveRequest addcustReq = new CustomerSaveRequest();
            CustomerSaveResult addcustRes = new CustomerSaveResult();
            addcustReq.setCompanyCode("Default");
            addcustReq.setCustomer(customer);
            addcustRes = port.customerSave(addcustReq);


        //Success
        CertificateRequestInitiateRequest certificaterequestinitiate=new CertificateRequestInitiateRequest();
        certificaterequestinitiate.setCompanyCode("Default");
        certificaterequestinitiate.setCommunicationMode(CommunicationMode.EMAIL);
        certificaterequestinitiate.setCustomMessage("Testing");
        certificaterequestinitiate.setCustomerCode(customerCodeValue);
        CertificateRequestInitiateResult certificateresult= port.certificateRequestInitiate(certificaterequestinitiate);
        Assert.assertEquals(SeverityLevel.Success,certificateresult.getResultCode());

        //Failure - duplicate request
        certificateresult= port.certificateRequestInitiate(certificaterequestinitiate);
        Assert.assertEquals(SeverityLevel.Error,certificateresult.getResultCode());
        Assert.assertEquals("Request Skipped; open request exists for customer",certificateresult.getMessages().getMessage(0).getDetails());


        //Failure - Maximum length string for customer message

         String maxLengthString = "Avalara, A leading Sales Tax Calc Company.";
        for (int ii = 0; ii <= 5; ii++)
        {
            maxLengthString += maxLengthString;
        }

        certificaterequestinitiate=new CertificateRequestInitiateRequest();
        certificaterequestinitiate.setCompanyCode("Default");
        certificaterequestinitiate.setCommunicationMode(CommunicationMode.EMAIL);
        certificaterequestinitiate.setCustomMessage(maxLengthString);
        certificaterequestinitiate.setCustomerCode(customerCodeValue);
        certificateresult= port.certificateRequestInitiate(certificaterequestinitiate);

        Assert.assertEquals(SeverityLevel.Error, certificateresult.getResultCode());
        Assert.assertEquals("validation.common.field-value-error", certificateresult.getMessages().getMessage(0).getRefersTo());
        Assert.assertEquals("Error saving the CertificateRequestInitiate.", certificateresult.getMessages().getMessage(0).getSummary());



        //Failure - customer object missing
        certificaterequestinitiate=new CertificateRequestInitiateRequest();
        certificaterequestinitiate.setCommunicationMode(CommunicationMode.EMAIL);
        certificaterequestinitiate.setCustomMessage("Testing");
        certificateresult= port.certificateRequestInitiate(certificaterequestinitiate);
        Assert.assertEquals(SeverityLevel.Error,certificateresult.getResultCode());
        Assert.assertEquals("RequiredError",certificateresult.getMessages().getMessage(0).getName());

        //  CertificateRequestInitiate Field missing

        CertificateRequestInitiateRequest request = new CertificateRequestInitiateRequest();
        request.setCompanyCode("Default");
        request.setCustomerCode ("");
        CertificateRequestInitiateResult result = port.certificateRequestInitiate(request);
        Assert.assertEquals(SeverityLevel.Error, result.getResultCode());
        Assert.assertEquals("validation.common.field-value-error", result.getMessages().getMessage(0).getRefersTo());

          //customer code missing test

            customer = getCustomer();
            String custcode="avatax4j"+new Date().getTime();
            customer.setCustomerCode("avatax4j"+new Date().getTime());
            addcustReq = new CustomerSaveRequest();
            addcustRes = new CustomerSaveResult();
            addcustReq.setCustomer(customer);
            addcustRes = port.customerSave(addcustReq);

            certificaterequestinitiate=new CertificateRequestInitiateRequest();
            certificaterequestinitiate.setCompanyCode("Default");
            certificaterequestinitiate.setCommunicationMode(CommunicationMode.FAX );
            certificaterequestinitiate.setCustomMessage("Testing");
            certificaterequestinitiate.setCustomerCode("");
            certificateresult= port.certificateRequestInitiate(certificaterequestinitiate);
            Assert.assertEquals(SeverityLevel.Error,certificateresult.getResultCode());
            Assert.assertEquals("validation.common.field-value-error",certificateresult.getMessages().getMessage(0).getRefersTo());
            Assert.assertEquals("Request Skipped; Error: CustomerCode is required; Warning: REQUEST_ID ignored; Warning: TYPE ignored",certificateresult.getMessages().getMessage(0).getDetails());


         //CertificateRequestInitiate  Location Error Test

            CustomerSaveRequest saverequest = new CustomerSaveRequest();
            saverequest.setCompanyCode("Default");
            saverequest.setCustomer(getCustomer());
            CustomerSaveResult saveresult = port.customerSave(saverequest);

            Assert.assertEquals(SeverityLevel.Success,saveresult.getResultCode());

            CertificateRequestInitiateRequest initiateRequest = new CertificateRequestInitiateRequest();
            initiateRequest.setCompanyCode("Default");
            initiateRequest.setCustomerCode("avatax4jCust");
            initiateRequest.setCommunicationMode(CommunicationMode.EMAIL);
            initiateRequest.setSourceLocationCode("LocationCode");
            CertificateRequestInitiateResult initiateResult = port.certificateRequestInitiate(initiateRequest);


            Assert.assertEquals(SeverityLevel.Error, initiateResult.getResultCode());
            Assert.assertEquals("application.configuration.location-override-disabled", initiateResult.getMessages().getMessage(0).getRefersTo());
            Assert.assertEquals("Request Skipped; location override is disabled", initiateResult.getMessages().getMessage(0).getDetails());

         // CertificateRequestInitiate with non exists customer test
        
          certificaterequestinitiate=new CertificateRequestInitiateRequest();
          certificaterequestinitiate.setCompanyCode("Default");
          certificaterequestinitiate.setCustomerCode("TEST132342212455");
          certificaterequestinitiate.setCommunicationMode(CommunicationMode.EMAIL);
          certificaterequestinitiate.setCustomMessage("Testing");
          certificateresult= port.certificateRequestInitiate(certificaterequestinitiate);
          Assert.assertEquals(SeverityLevel.Error,certificateresult.getResultCode());
          Assert.assertEquals("Error saving the CertificateRequestInitiate.",certificateresult.getMessages().getMessage(0).getSummary());
          Assert.assertEquals("application.customer.customer-not-found",certificateresult.getMessages().getMessage(0).getRefersTo());
          Assert.assertEquals("Request Skipped; customer does not exist",certificateresult.getMessages().getMessage(0).getDetails());

        //Failure - communication mode =FAX , Fax number not provided

        customer = getCustomer();
        custcode="avatax4j"+new Date().getTime();
        customer.setCustomerCode("avatax4j"+new Date().getTime());
        addcustReq = new CustomerSaveRequest();
        addcustRes = new CustomerSaveResult();
        addcustReq.setCompanyCode("Default");
        addcustReq.setCustomer(customer);
        addcustRes = port.customerSave(addcustReq);

        certificaterequestinitiate=new CertificateRequestInitiateRequest();
        certificaterequestinitiate.setCompanyCode("Default");
        certificaterequestinitiate.setCommunicationMode(CommunicationMode.FAX );
        certificaterequestinitiate.setCustomMessage("Testing");
        certificaterequestinitiate.setCustomerCode(custcode);
        certificateresult= port.certificateRequestInitiate(certificaterequestinitiate);
        Assert.assertEquals(SeverityLevel.Error,certificateresult.getResultCode());
        Assert.assertEquals("Error saving the CertificateRequestInitiate.",certificateresult.getMessages().getMessage(0).getSummary());
        Assert.assertEquals("validation.common.fax-required",certificateresult.getMessages().getMessage(0).getRefersTo());
        Assert.assertEquals("Request Skipped; fax number is required",certificateresult.getMessages().getMessage(0).getDetails());

         //Failure - communication mode =MAIL , MAIL ADDRESS  not provided

        customer = new Customer();
        customer.setCustomerCode ("avatax4jCust");
        customer.setCountry ("US");
        customer.setCity ("Bainbridge Island");
        customer.setZip ("98110");
        customer.setEmail("devadmin@avalara.com");
        customer.setState("WA");
        customer.setBusinessName("Avalara , Inc");
        customer.setAddress1("");

        custcode="avatax4j"+new Date().getTime();
        customer.setCustomerCode("avatax4j"+new Date().getTime());
        addcustReq = new CustomerSaveRequest();
        addcustRes = new CustomerSaveResult();
        addcustReq.setCompanyCode("Default");
        addcustReq.setCustomer(customer);
        addcustRes = port.customerSave(addcustReq);

        certificaterequestinitiate=new CertificateRequestInitiateRequest();
        certificaterequestinitiate.setCompanyCode("Default");
        certificaterequestinitiate.setCommunicationMode(CommunicationMode.MAIL );

        certificaterequestinitiate.setCustomMessage("Testing");
        certificaterequestinitiate.setCustomerCode(custcode);
        certificateresult= port.certificateRequestInitiate(certificaterequestinitiate);
        Assert.assertEquals(SeverityLevel.Error,certificateresult.getResultCode());
        Assert.assertEquals("Error saving the CertificateRequestInitiate.",certificateresult.getMessages().getMessage(0).getSummary());
        Assert.assertEquals("validation.request.mail-address-incomplete",certificateresult.getMessages().getMessage(0).getRefersTo());
        Assert.assertEquals("Request Skipped; mailing address is incomplete",certificateresult.getMessages().getMessage(0).getDetails());


         //Failure - communication mode =EMAIL , EMAIl Address not provided

              customer = new Customer();


               customer.setCountry ("US");
               customer.setCity ("Bainbridge Island");
               customer.setZip ("98110");
               customer.setEmail("");
               customer.setState("WA");
               customer.setBusinessName("Avalara , Inc");
               customer.setAddress1("435 Ericksen Ave");

               custcode="avatax4j"+new Date().getTime();
               customer.setCustomerCode (custcode);
               addcustReq = new CustomerSaveRequest();
               addcustRes = new CustomerSaveResult();
               addcustReq.setCompanyCode("Default");
               addcustReq.setCustomer(customer);
               addcustRes = port.customerSave(addcustReq);


        certificaterequestinitiate=new CertificateRequestInitiateRequest();
        certificaterequestinitiate.setCompanyCode("Default");
        certificaterequestinitiate.setCommunicationMode(CommunicationMode.FAX );
        certificaterequestinitiate.setCustomMessage("Testing");
        certificaterequestinitiate.setCustomerCode(custcode);
        certificateresult= port.certificateRequestInitiate(certificaterequestinitiate);
        Assert.assertEquals(SeverityLevel.Error,certificateresult.getResultCode());
        Assert.assertEquals("Error saving the CertificateRequestInitiate.",certificateresult.getMessages().getMessage(0).getSummary());
        Assert.assertEquals("validation.common.fax-required",certificateresult.getMessages().getMessage(0).getRefersTo());
        Assert.assertEquals("Request Skipped; fax number is required",certificateresult.getMessages().getMessage(0).getDetails());




         // Success - Check Request type

        certificaterequestinitiate=new CertificateRequestInitiateRequest();
        certificaterequestinitiate.setCompanyCode("Default");
        certificaterequestinitiate.setCustomerCode(custcode);
        certificaterequestinitiate.setCustomMessage("Testing");
        certificaterequestinitiate.setCommunicationMode(CommunicationMode.EMAIL);
        certificaterequestinitiate.setType(RequestType.DIRECT);
        certificateresult= port.certificateRequestInitiate(certificaterequestinitiate);
        Assert.assertEquals(SeverityLevel.Success, certificateresult.getResultCode());
        Assert.assertNotNull(certificateresult.getWizardLaunchUrl());


        //Certificate Request Initiate MinRequired Fields Test

         CustomerSaveRequest customerSaveRequest = new CustomerSaveRequest();
                customerSaveRequest.setCompanyCode ("Default") ;
                customer=new Customer();
                customer.setCustomerCode ("avatax4jCust"+new Date().getTime());
                customer.setBusinessName("Avalara , Inc");
                customerSaveRequest.setCustomer(customer);
                CustomerSaveResult customerSaveResult = port.customerSave(customerSaveRequest);
                Assert.assertEquals(SeverityLevel.Success, customerSaveResult.getResultCode());
        
                request = new CertificateRequestInitiateRequest();
                request.setCompanyCode("Default");
                certificaterequestinitiate.setCustomerCode("ava"+new Date().getTime());
                request.setCommunicationMode(CommunicationMode.EMAIL);
                result = port.certificateRequestInitiate(request);
                Assert.assertEquals(SeverityLevel.Error, result.getResultCode());
                Assert.assertEquals("validation.common.field-value-error", result.getMessages().getMessage(0).getRefersTo());

    }


    public void testCertificateGet()
           {
               try
               {
                   Calendar fromdate = Calendar.getInstance();
                   fromdate.set(2010,01,01);
                   Calendar todate = Calendar.getInstance();
                   CertificateGetRequest certificateGetRequest = new CertificateGetRequest();
                   certificateGetRequest.setCompanyCode("DEFAULT") ;
                   certificateGetRequest.setCustomerCode("");
                   certificateGetRequest.setModFromDate(fromdate);
                   certificateGetRequest.setModToDate(java.util.Calendar.getInstance());

                   CertificateGetResult certificateGetResult = port.certificateGet(certificateGetRequest);
                   ArrayOfCertificate arroe = certificateGetResult.getCertificates();
                   if(arroe != null && arroe.getCertificate().length>0)
                   {
                       int count =0;
                       Certificate eCert=arroe.getCertificate(count);
                       ArrayOfString arros = eCert.getCustomerCodes();

                       for (int i = 0; arros != null && i < arros.getString().length; i++)
                       {
                         String str=arros.getString(i);
                       }
                   }



                   Assert.assertEquals(SeverityLevel.Success, certificateGetResult.getResultCode());
               }
               catch (Exception ex)
               {
                   Assert.fail("GetExemptionCertificatesTest: " + ex.getMessage() + " : " + ex.getStackTrace());
               }
           }



        public void testCertificateGetByCustomer()
        {
            try
            {
                Calendar fromdate = Calendar.getInstance();
                fromdate.set(2010,12,01);
                Calendar todate = Calendar.getInstance();

                CertificateGetRequest certificateGetRequest = new CertificateGetRequest();
                certificateGetRequest.setCompanyCode("DEFAULT");

                certificateGetRequest.setCustomerCode("TEST" + java.util.Calendar.getInstance().getTime());
                certificateGetRequest.setCustomerCode("avatax4jCust");
                certificateGetRequest.setModFromDate(fromdate);
                certificateGetRequest.setModToDate(java.util.Calendar.getInstance());

                CertificateGetResult certificateGetResult = port.certificateGet(certificateGetRequest);
                Assert.assertEquals(SeverityLevel.Success, certificateGetResult.getResultCode());
            }
            catch (Exception ex)
            {
                Assert.fail("GetExemptionCertificatesByCustomerTest: " + ex.getMessage() + " : " + ex.getStackTrace());
            }
        }


        public void testCertificateGetWithoutDates()
        {
            try
            {
                CertificateGetRequest certificateGetRequest = new  CertificateGetRequest();
                  certificateGetRequest.setCompanyCode("DEFAULT");
                  certificateGetRequest.setCustomerCode("");
                CertificateGetResult certificateGetResult = port.certificateGet(certificateGetRequest);
                Assert.assertEquals(SeverityLevel.Success, certificateGetResult.getResultCode());
            }
            catch (Exception ex)
            {
                Assert.fail("GetExemptionCertificatesWithoutDatesTest: " + ex.getMessage() + " : " + ex.getStackTrace());
            }
        }


      public void testCertificateImageGet()
      {
                   //CertificateImageGet_PNG  test
                   CertificateImageGetRequest certificateImageGetRequest = new CertificateImageGetRequest();

                   certificateImageGetRequest.setAvaCertId ("CBSK");
                   certificateImageGetRequest.setCompanyCode ("Default");
                   certificateImageGetRequest.setFormat(FormatType.PNG);
                   certificateImageGetRequest.setPageNumber(1);
                   CertificateImageGetResult certificateImageGetResult = null;
                 try {
                             certificateImageGetResult = port.certificateImageGet(certificateImageGetRequest);
                     }       catch (RemoteException e) {
                             e.printStackTrace();
                     }


                    Assert.assertEquals(SeverityLevel.Success,certificateImageGetResult.getResultCode());
                    Assert.assertNotNull(certificateImageGetResult.getImage());
              //      writeImage(certificateImageGetResult.getImage());


                 //CertificateImageGet_PDF test
                   certificateImageGetRequest = new CertificateImageGetRequest();
                   certificateImageGetRequest.setAvaCertId ("CBSK");
                   certificateImageGetRequest.setCompanyCode ("Default");
                   certificateImageGetRequest.setFormat(FormatType.PDF);
                   certificateImageGetRequest.setPageNumber(1);


                   try {
                            certificateImageGetResult =port.certificateImageGet(certificateImageGetRequest);
                       }    catch (RemoteException e) {
                            e.printStackTrace();
                       }

                    Assert.assertEquals(SeverityLevel.Success,certificateImageGetResult.getResultCode());
                    Assert.assertNotNull(certificateImageGetResult.getImage());


                  //  CertificateImageGet_MissingAvaCertID


                   certificateImageGetRequest = new CertificateImageGetRequest();

                   certificateImageGetRequest.setCompanyCode ("Default");
                   certificateImageGetRequest.setFormat(FormatType.PNG);
                      try {
                             certificateImageGetResult = port.certificateImageGet(certificateImageGetRequest);
                     }       catch (RemoteException e) {
                             e.printStackTrace();
                     }

                   Assert.assertEquals(SeverityLevel.Error,certificateImageGetResult.getResultCode());
                   Assert.assertEquals("AvaCertImageError", certificateImageGetResult.getMessages().getMessage(0).getName());
                   Assert.assertEquals("ERROR: Resource not found.  One or more of the following is invalid: CompanyCode, AvaCertId.\r\n", certificateImageGetResult.getMessages().getMessage(0).getDetails());

                   // InvalidAvaCertID

                   certificateImageGetRequest = new CertificateImageGetRequest();

                   certificateImageGetRequest.setAvaCertId("InvalidId");
                   certificateImageGetRequest.setCompanyCode("Default");
                   certificateImageGetRequest.setFormat(FormatType.PNG);
                    try {
                             certificateImageGetResult = port.certificateImageGet(certificateImageGetRequest);
                     }       catch (RemoteException e) {
                             e.printStackTrace();
                     }


                    Assert.assertEquals(SeverityLevel.Error,certificateImageGetResult.getResultCode());
                    Assert.assertEquals("AvaCertImageError", certificateImageGetResult.getMessages().getMessage(0).getName());
                    Assert.assertEquals("CertificateNotFound", certificateImageGetResult.getMessages().getMessage(0).getRefersTo());
                    Assert.assertEquals("ERROR: Invalid certificate ID.\r\n", certificateImageGetResult.getMessages().getMessage(0).getDetails());


                   //NoImage
                   certificateImageGetRequest = new CertificateImageGetRequest();

                   certificateImageGetRequest.setAvaCertId("CBT3");
                   certificateImageGetRequest.setCompanyCode("Default");
                   certificateImageGetRequest.setFormat(FormatType.PNG);

                    try {
                             certificateImageGetResult = port.certificateImageGet(certificateImageGetRequest);
                     }       catch (RemoteException e) {
                             e.printStackTrace();
                     }


                    Assert.assertEquals(SeverityLevel.Error,certificateImageGetResult.getResultCode());
                    Assert.assertEquals("AvaCertImageError", certificateImageGetResult.getMessages().getMessage(0).getName());
                    Assert.assertEquals("ImageNotFound", certificateImageGetResult.getMessages().getMessage(0).getRefersTo());
                    Assert.assertEquals("ERROR: The Certificate associated with the cert ID 'CBT3' does not have any images.\r\n", certificateImageGetResult.getMessages().getMessage(0).getDetails());

                   //InvalidPageNumber
                   certificateImageGetRequest = new CertificateImageGetRequest();

                   certificateImageGetRequest.setAvaCertId("CBSK");
                   certificateImageGetRequest.setCompanyCode("Default");
                   certificateImageGetRequest.setFormat(FormatType.PNG);
                   certificateImageGetRequest.setPageNumber(5);
                   try {
                         certificateImageGetResult = port.certificateImageGet(certificateImageGetRequest);
                   }     catch (RemoteException e) {
                         e.printStackTrace();
                   }

                    Assert.assertEquals(SeverityLevel.Error,certificateImageGetResult.getResultCode());
                    Assert.assertEquals("AvaCertImageError", certificateImageGetResult.getMessages().getMessage(0).getName());
                    Assert.assertEquals("PageNotFound", certificateImageGetResult.getMessages().getMessage(0).getRefersTo());
                    Assert.assertEquals("ERROR: Invalid page number.\r\n", certificateImageGetResult.getMessages().getMessage(0).getDetails());

    }

    public void testCertificateRequestGet()
    {
                   Calendar fromdate = Calendar.getInstance();
                   fromdate.set(2008,01,01);
                   Calendar todate = Calendar.getInstance();
                   todate.set(2020,12,31);
                //CertificateRequestGet_CustomerCodeTest
                Customer customer =getCustomer();
                customer.setCustomerCode("ava"+new Date().getTime());
                CustomerSaveRequest customerSaveRequest = new CustomerSaveRequest();

                customerSaveRequest.setCompanyCode("Default");
                customerSaveRequest.setCustomer(customer);
                CustomerSaveResult customerSaveResult = null;
                    try {
                        customerSaveResult = port.customerSave(customerSaveRequest);
                    } catch (RemoteException e) {
                        e.printStackTrace();
                    }
                Assert.assertEquals(SeverityLevel.Success, customerSaveResult.getResultCode());

                CertificateRequestInitiateRequest certificateRequestInitiateRequest = new CertificateRequestInitiateRequest();
                certificateRequestInitiateRequest.setCompanyCode("Default");
                certificateRequestInitiateRequest.setCustomerCode(customerSaveRequest.getCustomer().getCustomerCode());
                certificateRequestInitiateRequest.setCommunicationMode( CommunicationMode.EMAIL);
                CertificateRequestInitiateResult certificateRequestInitiateResult = null;
                try {
                    certificateRequestInitiateResult = port.certificateRequestInitiate(certificateRequestInitiateRequest);
                } catch (RemoteException e) {
                    e.printStackTrace();
                }
                Assert.assertEquals(SeverityLevel.Success, certificateRequestInitiateResult.getResultCode());

                CertificateRequestGetRequest certificateRequestGetRequest = new CertificateRequestGetRequest();
                certificateRequestGetRequest.setCompanyCode("Default");
                certificateRequestGetRequest.setCustomerCode(customerSaveRequest.getCustomer().getCustomerCode());
                CertificateRequestGetResult certificateRequestGetResult =   null;
                //certificateRequestGetRequest.setModFromDate(fromdate);
               // certificateRequestGetRequest.setModToDate(todate);

                try {
                  certificateRequestGetResult = port.certificateRequestGet(certificateRequestGetRequest);
                } catch (RemoteException e) {
                    e.printStackTrace();
                }
                Assert.assertEquals(SeverityLevel.Success, certificateRequestGetResult.getResultCode());
                Assert.assertEquals(1, certificateRequestGetResult.getCertificateRequests().getCertificateRequest().length);
                Assert.assertEquals(certificateRequestInitiateResult.getCustomerCode(),
                                certificateRequestGetResult.getCertificateRequests().getCertificateRequest(0).getCustomerCode());
                Assert.assertEquals(certificateRequestInitiateResult.getRequestId(),
                                certificateRequestGetResult.getCertificateRequests().getCertificateRequest(0).getRequestId());
                Assert.assertEquals(certificateRequestInitiateResult.getTrackingCode(),
                               certificateRequestGetResult.getCertificateRequests().getCertificateRequest(0).getTrackingCode());




           //CertificateRequestGet_CustomerCodeRequestStatusTest
                       customer =getCustomer();
                        customer.setCustomerCode("ava"+new Date().getTime());
                       customerSaveRequest = new CustomerSaveRequest();
                       customerSaveRequest.setCompanyCode("Default");
                       customerSaveRequest.setCustomer(customer);
                        try {
                            customerSaveResult = port.customerSave(customerSaveRequest);
                        } catch (RemoteException e) {
                            e.printStackTrace();
                        }
                        Assert.assertEquals(SeverityLevel.Success, customerSaveResult.getResultCode());

                       certificateRequestInitiateRequest = new CertificateRequestInitiateRequest();
                       certificateRequestInitiateRequest.setCompanyCode("Default");
                       certificateRequestInitiateRequest.setCustomerCode(customerSaveRequest.getCustomer().getCustomerCode());
                       certificateRequestInitiateRequest.setCommunicationMode(CommunicationMode.EMAIL);
                        try {
                            certificateRequestInitiateResult = port.certificateRequestInitiate(certificateRequestInitiateRequest);
                        } catch (RemoteException e) {
                            e.printStackTrace();
                        }
                        Assert.assertEquals(SeverityLevel.Success, certificateRequestInitiateResult.getResultCode());

                       certificateRequestGetRequest = new CertificateRequestGetRequest();
                       certificateRequestGetRequest.setCompanyCode("Default");
                       certificateRequestGetRequest.setCustomerCode(customerSaveRequest.getCustomer().getCustomerCode());
                       certificateRequestGetRequest.setRequestStatus(CertificateRequestStatus.OPEN);
                        certificateRequestGetResult = null;
                        try {
                            certificateRequestGetResult = port.certificateRequestGet(certificateRequestGetRequest);
                        } catch (RemoteException e) {
                            e.printStackTrace();
                        }
                       Assert.assertEquals(SeverityLevel.Success, certificateRequestGetResult.getResultCode());
                       Assert.assertEquals(certificateRequestInitiateResult.getTrackingCode(), certificateRequestGetResult.getCertificateRequests().getCertificateRequest(0).getTrackingCode());
                       Assert.assertEquals(certificateRequestInitiateResult.getCustomerCode(), certificateRequestGetResult.getCertificateRequests().getCertificateRequest(0).getCustomerCode());
                       Assert.assertEquals(certificateRequestInitiateRequest.getCommunicationMode(), certificateRequestGetResult.getCertificateRequests().getCertificateRequest(0).getCommunicationMode());


                     //CertificateRequestGet_CustomerCodeRequestStatusClosedTest
                       customer =getCustomer();
                       customer.setCustomerCode("ava"+new Date().getTime());
                       customerSaveRequest = new CustomerSaveRequest();
                       customerSaveRequest.setCompanyCode("Default");
                       customerSaveRequest.setCustomer(customer) ;
                        try {
                            customerSaveResult = port.customerSave(customerSaveRequest);
                        } catch (RemoteException e) {
                            e.printStackTrace();
                        }
                        Assert.assertEquals(SeverityLevel.Success, customerSaveResult.getResultCode());

                       certificateRequestInitiateRequest = new CertificateRequestInitiateRequest();
                       certificateRequestInitiateRequest.setCompanyCode("Default");
                       certificateRequestInitiateRequest.setCustomerCode(customerSaveRequest.getCustomer().getCustomerCode());
                       certificateRequestInitiateRequest.setCommunicationMode(CommunicationMode.EMAIL);
                        try {
                            certificateRequestInitiateResult = port.certificateRequestInitiate(certificateRequestInitiateRequest);
                        } catch (RemoteException e) {
                            e.printStackTrace();
                        }
                        Assert.assertEquals(SeverityLevel.Success, certificateRequestInitiateResult.getResultCode());

                       certificateRequestGetRequest = new CertificateRequestGetRequest();
                       certificateRequestGetRequest.setCompanyCode("Default");
                       certificateRequestGetRequest.setCustomerCode(customerSaveRequest.getCustomer().getCustomerCode());
                       certificateRequestGetRequest.setRequestStatus(CertificateRequestStatus.CLOSED);
                       certificateRequestGetResult = null;
                        try {
                            certificateRequestGetResult = port.certificateRequestGet(certificateRequestGetRequest);
                        } catch (RemoteException e) {
                            e.printStackTrace();
                        }
                        Assert.assertEquals(SeverityLevel.Success, certificateRequestGetResult.getResultCode());
                        Assert.assertEquals(0, certificateRequestGetResult.getCertificateRequests().getCertificateRequest().length);


                       // CertificateRequestGet_ModDateRangeTest
                       customer =getCustomer();
                       customer.setCustomerCode("ava"+new Date().getTime());
                       customerSaveRequest = new CustomerSaveRequest();
                       customerSaveRequest.setCompanyCode("Default");
                       customerSaveRequest.setCustomer(customer);
                        try {
                            customerSaveResult = port.customerSave(customerSaveRequest);
                        } catch (RemoteException e) {
                            e.printStackTrace();
                        }
                        Assert.assertEquals(SeverityLevel.Success, customerSaveResult.getResultCode());

                       certificateRequestInitiateRequest = new CertificateRequestInitiateRequest();
                       certificateRequestInitiateRequest.setCompanyCode("Default");
                       certificateRequestInitiateRequest.setCustomerCode(customerSaveRequest.getCustomer().getCustomerCode());
                       certificateRequestInitiateRequest.setCommunicationMode(CommunicationMode.EMAIL);
                        try {
                            certificateRequestInitiateResult = port.certificateRequestInitiate(certificateRequestInitiateRequest);
                        } catch (RemoteException e) {
                            e.printStackTrace();
                        }
                        Assert.assertEquals(SeverityLevel.Success, certificateRequestInitiateResult.getResultCode());

                       certificateRequestGetRequest = new CertificateRequestGetRequest();
                       certificateRequestGetRequest.setCompanyCode("Default");
                       certificateRequestGetRequest.setCustomerCode(customerSaveRequest.getCustomer().getCustomerCode());
                       certificateRequestGetRequest.setModFromDate(fromdate);
                       certificateRequestGetRequest.setModToDate(todate);
                       certificateRequestGetResult =null;
                        try {
                            certificateRequestGetResult = port.certificateRequestGet(certificateRequestGetRequest);
                        } catch (RemoteException e) {
                            e.printStackTrace();
                        }
                        Assert.assertEquals(SeverityLevel.Success, certificateRequestGetResult.getResultCode());
                       Assert.assertEquals(1, certificateRequestGetResult.getCertificateRequests().getCertificateRequest().length);
                       Assert.assertEquals(certificateRequestInitiateResult.getTrackingCode(), certificateRequestGetResult. getCertificateRequests().getCertificateRequest(0).getTrackingCode());
                       Assert.assertEquals(certificateRequestInitiateResult.getCustomerCode(), certificateRequestGetResult. getCertificateRequests().getCertificateRequest(0).getCustomerCode());
                       Assert.assertEquals(certificateRequestInitiateRequest.getCommunicationMode(), certificateRequestGetResult. getCertificateRequests().getCertificateRequest(0).getCommunicationMode());


                       //CertificateRequestGet_InvalidModDateRangeTest
                       customer =getCustomer();
                       customer.setCustomerCode("ava"+new Date().getTime());
                       customerSaveRequest = new CustomerSaveRequest();
                       customerSaveRequest.setCompanyCode("Default");
                       customerSaveRequest.setCustomer(customer) ;
                        try {
                            customerSaveResult = port.customerSave(customerSaveRequest);
                        } catch (RemoteException e) {
                            e.printStackTrace();
                        }
                        Assert.assertEquals(SeverityLevel.Success, customerSaveResult.getResultCode());

                       certificateRequestInitiateRequest = new CertificateRequestInitiateRequest();
                       certificateRequestInitiateRequest.setCompanyCode("Default");
                       certificateRequestInitiateRequest.setCustomerCode(customerSaveRequest.getCustomer().getCustomerCode());
                       certificateRequestInitiateRequest.setCommunicationMode(CommunicationMode.EMAIL);
                        try {
                            certificateRequestInitiateResult = port.certificateRequestInitiate(certificateRequestInitiateRequest);
                        } catch (RemoteException e) {
                            e.printStackTrace();
                        }
                        Assert.assertEquals(SeverityLevel.Success, certificateRequestInitiateResult.getResultCode());

                       certificateRequestGetRequest = new CertificateRequestGetRequest();
                       certificateRequestGetRequest.setCompanyCode("Default");
                       certificateRequestGetRequest.setCustomerCode(customerSaveRequest.getCustomer().getCustomerCode());
                             todate.set(2009,01,01);
                             certificateRequestGetRequest.setModFromDate(fromdate);
                             certificateRequestGetRequest.setModToDate(todate);

                       certificateRequestGetResult = null;
                        try {
                            certificateRequestGetResult = port.certificateRequestGet(certificateRequestGetRequest);
                        } catch (RemoteException e) {
                            e.printStackTrace();
                        }
                        Assert.assertEquals(SeverityLevel.Success, certificateRequestGetResult.getResultCode());
                      Assert.assertEquals(0, certificateRequestGetResult.getCertificateRequests().getCertificateRequest().length);

                     //CertificateRequestGet_CustomerCodeModFromDateTest()
                         customer =getCustomer();
                       customer.setCustomerCode("ava"+new Date().getTime());
                       customerSaveRequest = new CustomerSaveRequest();
                       customerSaveRequest.setCompanyCode("Default");
                       customerSaveRequest.setCustomer(customer);
                        try {
                            customerSaveResult = port.customerSave(customerSaveRequest);
                        } catch (RemoteException e) {
                            e.printStackTrace();
                        }
                        Assert.assertEquals(SeverityLevel.Success, customerSaveResult.getResultCode());

                       certificateRequestInitiateRequest = new CertificateRequestInitiateRequest();
                       certificateRequestInitiateRequest.setCompanyCode("Default");
                       certificateRequestInitiateRequest.setCustomerCode(customerSaveRequest.getCustomer().getCustomerCode());
                       certificateRequestInitiateRequest.setCommunicationMode(CommunicationMode.EMAIL);
                        try {
                            certificateRequestInitiateResult = port.certificateRequestInitiate(certificateRequestInitiateRequest);
                        } catch (RemoteException e) {
                            e.printStackTrace();
                        }
                        Assert.assertEquals(SeverityLevel.Success, certificateRequestInitiateResult.getResultCode());

                       certificateRequestGetRequest = new CertificateRequestGetRequest();
                       certificateRequestGetRequest.setCompanyCode("Default");
                       certificateRequestGetRequest.setCustomerCode(customerSaveRequest.getCustomer().getCustomerCode());
                       certificateRequestGetRequest.setModFromDate(fromdate);
                        try {
                            certificateRequestGetResult =
                                port.certificateRequestGet(certificateRequestGetRequest);
                        } catch (RemoteException e) {
                            e.printStackTrace();
                        }
                        Assert.assertEquals(SeverityLevel.Success, certificateRequestGetResult.getResultCode());
                       Assert.assertEquals(1, certificateRequestGetResult.getCertificateRequests().getCertificateRequest().length);
                       Assert.assertEquals(certificateRequestInitiateResult.getTrackingCode(), certificateRequestGetResult.getCertificateRequests().getCertificateRequest(0).getTrackingCode());
                       Assert.assertEquals(certificateRequestInitiateResult.getCustomerCode(), certificateRequestGetResult. getCertificateRequests().getCertificateRequest(0).getCustomerCode());
                       Assert.assertEquals(certificateRequestInitiateRequest.getCommunicationMode(), certificateRequestGetResult. getCertificateRequests().getCertificateRequest(0).getCommunicationMode());



        
    }

 /*   public void  writeImage(byte[] image)
    {



     try{
        String strFilePath = "C://FileIO//demo.PNG";
        FileOutputStream fos = new FileOutputStream(strFilePath);
        fos.write(image);
        fos.close();
    }
    catch(FileNotFoundException ex)
    {
        System.out.println("FileNotFoundException : " + ex);
    }
    catch(IOException ioe)
    {
        System.out.println("IOException : " + ioe);
    }
  }   */
    private Customer getCustomer()
    {
        Customer customer = new Customer();
        customer.setCustomerCode ("avatax4jCust");
        customer.setCountry ("US");
        customer.setCity ("Bainbridge Island");
        customer.setZip ("98110");
        customer.setEmail("devadmin@avalara.com");
        customer.setState("WA");
        customer.setBusinessName("Avalara , Inc");
        customer.setAddress1("435 Ericksen Ave");

        return customer;


    }


}
