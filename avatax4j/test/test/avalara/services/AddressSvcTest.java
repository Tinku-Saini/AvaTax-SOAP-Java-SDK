package test.avalara.services;

import junit.framework.*;
import com.avalara.avatax.services.address.*;
import com.avalara.avatax.services.base.*;

import java.io.*;
import javax.xml.rpc.ServiceException;
import javax.xml.soap.SOAPException;
import java.rmi.RemoteException;
import java.util.Properties;
import java.util.Calendar;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.axis.AxisFault;

/**
 * JUnit tests for Avalara AvaTax Tax
 * @author greggr
 * Copyright (c) 2005, Avalara.  All rights reserved.
 */
public class AddressSvcTest extends TestCase
{
    private AddressSvc AddressSvc;
    private AddressSvcSoap port;
    private String url;
    /**
     * Runs Junit TestRunner.
     * @see junit.textui.TestRunner
     * @param args
     */
    public static void main(String args[]) {
        junit.textui.TestRunner.run(AddressSvcTest.class);
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

        String account = properties.getProperty("avatax4j.account");
        boolean accountSet = !isEmpty(account);

        String license = properties.getProperty("avatax4j.license");
        boolean licenseSet = !isEmpty(license);

        // Note the addition of userName and password from the avatax4j properties file
        String userName = properties.getProperty("avatax4j.userName");
        boolean userNameSet = !isEmpty(userName);

        String password = properties.getProperty("avatax4j.password");;
        boolean passwordSet = !isEmpty(password);
       

        Assert.assertTrue("In the avatax4j property file, " +
                "either avatax4j.license and " +
                "avatax4j.account need to be" +
                " specified, or avatax4j.userName and " +
                "avatax4j.password need to be specified",
                ((licenseSet && accountSet) ||
                        (userNameSet && passwordSet)));

        AddressSvc = new AddressSvcLocator();

        port = AddressSvc.getAddressSvcSoap(new URL(url));
            

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
     * Tests Address Service's ping functionality.
     * @throws RemoteException
     */
    public void testPing() throws RemoteException
    {
        PingResult result = port.ping("");

        Assert.assertEquals(SeverityLevel.Success, result.getResultCode());
    }

    /**
     * Tests Address Service's ping functionality.
     * @throws RemoteException
     */
    public void testPingSecurity() throws RemoteException
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
            String test = e.getFaultString(); // "An error was discovered processing the <Security> header"
            Assert.assertTrue("", e.getFaultString().toLowerCase().indexOf("security") >= 0);
        }
        Assert.assertFalse("Expected trapped error due to security problem", ok);

        // restore old credentials
        port.setSecurity(holder);
    }

    /**
     * Tests Address Service's IsAuthorized functionality.
     * @throws RemoteException
     */
    public void testIsAuthorized() throws RemoteException
    {
        IsAuthorizedResult result = port.isAuthorized("Ping,IsAuthorized,Validate");

        Assert.assertEquals(SeverityLevel.Success, result.getResultCode());
        Assert.assertEquals("Ping,IsAuthorized,Validate", result.getOperations());
        Calendar calendar = result.getExpires();
        ArrayOfMessage messages = result.getMessages();
        Assert.assertTrue( "Expected 0 messages back", messages == null || messages.getMessage().length == 0);

    }


    /**
     * ValidateTest -- tests address validation and return values.
     * @throws RemoteException
     */
    public void testValidate() throws RemoteException
    {
        ValidateRequest request = new ValidateRequest();
        Address address = new Address();
        address.setLine1("900 Winslow Way");
        address.setLine2("Suite 130");
        address.setCity("Bainbridge Is");
        address.setRegion("WA");
        address.setPostalCode("98110-2450");
        request.setAddress(address);
        request.setTextCase(TextCase.Upper);
        request.setTaxability(true);

        ValidateResult result;
        result = port.validate(request);

        Assert.assertEquals(SeverityLevel.Success, result.getResultCode());
        ValidAddress validAddress = result.getValidAddresses().getValidAddress(0);
        Assert.assertEquals("900 WINSLOW WAY E STE 130", validAddress.getLine1());
        Assert.assertEquals("BAINBRIDGE IS WA 98110-2450", validAddress.getLine4());
        Assert.assertEquals("5303500000", validAddress.getFipsCode());
        Assert.assertEquals("KITSAP", validAddress.getCounty());
        Assert.assertEquals(true, result.isTaxable());
    }

    /**
     * ValidateTest -- tests address validation and return values.
     * @throws RemoteException
     */
    public void testValidateWithTaxRegionId() throws RemoteException
    {
        ValidateRequest request = new ValidateRequest();
        Address address = new Address();
        address.setLine1("900 Winslow Way");
        address.setLine2("Suite 130");
        address.setCity("Bainbridge Is");
        address.setRegion("WA");
        address.setPostalCode("98110-2450");
        //Note may not be a valid taxregion id it is just to test whther values is being passed properly
        // For more details contact Avalara Support
        address.setTaxRegionId(9229);
        request.setAddress(address);
        request.setTextCase(TextCase.Upper);
        request.setTaxability(true);

        ValidateResult result;
        result = port.validate(request);

        Assert.assertEquals(SeverityLevel.Success, result.getResultCode());
        ValidAddress validAddress = result.getValidAddresses().getValidAddress(0);

        Assert.assertEquals("900 WINSLOW WAY E STE 130", validAddress.getLine1());
        Assert.assertEquals("BAINBRIDGE IS WA 98110-2450", validAddress.getLine4());
        Assert.assertEquals("5303500000", validAddress.getFipsCode());
        Assert.assertEquals("KITSAP", validAddress.getCounty());
        Assert.assertTrue(validAddress.getTaxRegionId()!=0);
        request.setTaxability(false);
        result=port.validate(request);
        validAddress = result.getValidAddresses().getValidAddress(0);
        Assert.assertTrue(validAddress.getTaxRegionId()==0);
        
    }


    /**
     * InvalidAddressTest -- Tests that the service properly rejects bad addresses.
     * @throws RemoteException
     */
    public void testInvalidAddress() throws RemoteException
    {
        ValidateRequest request = new ValidateRequest();

        // No Address given
        Address address = new Address();
        request.setAddress(address);
        request.setTextCase(TextCase.Upper);
        ValidateResult result = port.validate(request);
        Assert.assertEquals(result.getResultCode(), SeverityLevel.Error);
        ArrayOfMessage messageArray = result.getMessages();
        Assert.assertTrue( "Expected messageArray back", messageArray != null
                && messageArray.getMessage().length > 0);
        Message[] messages = messageArray.getMessage();
        Assert.assertTrue("Expected InsufficientAddressError",
                messages[0].getName().equals("InsufficientAddressError"));

        // Bad Zip Code
        address.setLine1("900 Winslow Way");
        address.setLine2("Suite 130");
        address.setCity("Bainbridge Is");
        address.setRegion("GA");
        address.setPostalCode("00000");
        request.setAddress(address);
        request.setTextCase(TextCase.Upper);
        result = port.validate(request);
        Assert.assertEquals(result.getResultCode(), SeverityLevel.Error);
        messageArray = result.getMessages();
        Assert.assertTrue( "Expected messageArray back", messageArray != null
                && messageArray.getMessage().length > 0);
        messages = messageArray.getMessage();
        Assert.assertEquals(messages[0].getName(),"PostalCodeError");
        // Assert.assertTrue("Expected AddressUnknownStreetError",
        //        messages[0].getName().equals("AddressUnknownStreetError"));
        //Assert.assertTrue()

//        for (int i= 0; i < messages.length; i++)
//        {
//            Message mess = messages[i];
//            String out = "Message #" + i + "\n" + mess.getName() + ", " + mess.getSource() + "," +
//                    mess.getSeverity() + ", " + mess.getSummary() + "," +
//                    mess.getDetails();
//            System.out.println(out);
//        }
    }

    /**
     * ValidateTest -- tests address validation and return values.
     * @throws RemoteException
     */
    public void testLatLongValidate() throws RemoteException
    {
        ValidateRequest request = new ValidateRequest();
        Address address = new Address();
        address.setLine1("900 Winslow Way");
        address.setRegion("WA");
        address.setPostalCode("98110");
        request.setAddress(address);
        request.setTextCase(TextCase.Upper);

        ValidateResult result;
        result = port.validate(request);

        Assert.assertEquals(SeverityLevel.Success, result.getResultCode());
        ValidAddress validAddress = result.getValidAddresses().getValidAddress(0);

        Assert.assertEquals("", validAddress.getLatitude());
        Assert.assertEquals("", validAddress.getLongitude());

        //check or the latitude longitude value
        request.setCoordinates(true);
        result = port.validate(request);
        Assert.assertEquals(SeverityLevel.Success, result.getResultCode());
        validAddress = result.getValidAddresses().getValidAddress(0);
        Assert.assertEquals("47.6", validAddress.getLatitude().substring(0,4));
		Assert.assertEquals("-122.5", validAddress.getLongitude().substring(0,6));
    }


    /**
     * Tests address validation and return values (Using Jaas enabled Address Web Service).
     * This testcase also verifies the ability to specify a Lat/Long as part of Address.
     * @throws RemoteException
     */
    public void testJaasLatLongValidation() throws RemoteException, SOAPException, ServiceException, MalformedURLException {
        Address address;
        ValidateResult result;
        ValidAddress validAddress;
        address = new Address();
        address.setLine1("900 Winslow Way");
        address.setLine2("Ste 130");
        address.setCity("Bainbridge Island");
        address.setRegion ("WA");
        address.setPostalCode("98110");
        address.setLongitude("-122.510359");
        address.setLatitude("47.624972");

        ValidateRequest validateRequest = new ValidateRequest();
        validateRequest.setAddress(address);
        validateRequest.setTextCase(TextCase.Upper);

        // get the existing profile
        Profile profile = port.getProfile();

        // set profile to "Jaas"
        profile.setName("Jaas");

        //get existing security details
        Security security = port.getSecurity();

        //Create new instance for Avalara Address Web Service
        AddressSvcSoap jaasEnabledPort = AddressSvc.getAddressSvcSoap(new URL(url));

        //Set 'Jaas' profile
        jaasEnabledPort.setProfile(profile);

        //Set security
        jaasEnabledPort.setSecurity(security);

        //Added for 4.13 changes
        validateRequest.setCoordinates(true);

        result = jaasEnabledPort.validate(validateRequest);
        assertEquals(SeverityLevel.Success, result.getResultCode());
        assertEquals(1, result.getValidAddresses().size());
        if (result.getValidAddresses().size() != 1)
        {
            Assert.fail("Unexpected number of addresses returned.  Expected one address.");
        }
        else
        {
            validAddress = result.getValidAddresses().getValidAddress(0);
            assertEquals(address.getLine1().toUpperCase() + " E "
                             + address.getLine2().toUpperCase(),validAddress.getLine1());
            assertEquals("", validAddress.getLine2());
            assertEquals(address.getCity().toUpperCase(), validAddress.getCity());
            assertEquals(address.getRegion().toUpperCase(), validAddress.getRegion());
            assertEquals(address.getPostalCode() + "-2450", validAddress.getPostalCode());
            assertEquals("H", validAddress.getAddressType());
            assertEquals("C051", validAddress.getCarrierRoute());

            //Ticket 21203: Modified Fips Code value for jaas enabled account.
            assertEquals("5303503736", validAddress.getFipsCode());

            // Fips Code value if Jaas is not enabled
            //assertEquals("5303500000", validAddress.getFipsCode());

            assertEquals("KITSAP", validAddress.getCounty());
            assertEquals(address.getCity().toUpperCase() + " " + address.getRegion().toUpperCase()
                             + " " + address.getPostalCode() + "-2450", validAddress.getLine4());
            assertEquals("981102450307", validAddress.getPostNet());

            // Added 4.13 changes for the Lat Long
            // Update to check for ZIP+4 precision
            // Zip+4 precision coordinates
            if (validAddress.getLatitude().length() > 7)
            {
                System.out.println("ZIP+4 precision coordinates received");
                assertEquals(address.getLatitude(), validAddress.getLatitude());
                assertEquals(address.getLongitude(), validAddress.getLongitude());
            }
            else
            {
                System.out.println("ZIP5 precision coordinates received");
                assertTrue("Expected Latitude to start with '47.64'",validAddress.getLatitude().
                          startsWith(address.getLatitude().substring(0,4)));
                assertTrue("Expected Longitude to start with '-122.53'",validAddress.getLongitude().
                          startsWith(address.getLongitude().substring(0,6)));
            }
        }

    }
}
