import com.avalara.avatax.services.base.Profile;
import com.avalara.avatax.services.base.Security;
import com.avalara.avatax.services.address.*;

import javax.xml.rpc.ServiceException;
import javax.xml.soap.SOAPException;
import java.net.MalformedURLException;
import java.net.URL;
import java.io.IOException;
import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import junit.framework.Assert;
import org.apache.axis.EngineConfiguration;
import org.apache.axis.configuration.FileProvider;

/**
 * This is a sample address validation using the AvaTax AddressSvc.
 *
 * @author brianh
 * Copyright (c) 2005, Avalara.  All rights reserved.
 */
public class AddressValidateSample
{
    public static void main(String args[])
    {
        try
        {
            AddressSvcSoap port = getAddressSvc();

            ValidateRequest request = new ValidateRequest();
            Address address = new Address();

            address.setLine1("900 Winslow Way");
            address.setLine2("Suite 130");
            address.setCity("Bainbridge Is");
            address.setRegion("WA");
            address.setPostalCode("98110-2450");
            request.setAddress(address);
            request.setTextCase(TextCase.Default);

            ValidateResult result;
            result = port.validate(request);

            System.out.println("Validate Result: " + result.getResultCode().toString());

            if (result.getResultCode() != SeverityLevel.Success)
            {
                printMessages(result.getMessages());
            }
            else
            {
                ValidAddress validAddress = result.getValidAddresses().getValidAddress(0);
                System.out.println("Line1: " + validAddress.getLine1());
                System.out.println("Line2: " + validAddress.getLine2());
                System.out.println("Line3: " + validAddress.getLine3());
                System.out.println("City: " + validAddress.getCity());
                System.out.println("County: " + validAddress.getCounty());
                System.out.println("State: " + validAddress.getRegion());
                System.out.println("PostalCode: " + validAddress.getPostalCode());
            }
        }
        catch (Exception ex)
        {
            System.out.println("Exception: " + ex.getMessage());
        }
    }

    protected static AddressSvcSoap getAddressSvc() throws ServiceException, SOAPException, MalformedURLException, IOException
    {
        AddressSvc addressSvc;
        AddressSvcSoap port;

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
        Assert.assertFalse("avatax4j.account property is not configured in avatax4j.properties", account == null || account.length() == 0);

        String license = properties.getProperty("avatax4j.license");;
        Assert.assertFalse("avatax4j.license property is not configured in avatax4j.properties", license == null || license.length() == 0);

        addressSvc = new AddressSvcLocator();

        port = addressSvc.getAddressSvcSoap(new URL(url));

        // Set the profile
        Profile profile = new Profile();
        profile.setClient("TaxSvcTest,4.0.0.0");
        port.setProfile(profile);

        // Set security
        Security security = new Security();
        security.setAccount(account);
        security.setLicense(license);
        port.setSecurity(security);

        return port;
    }

    protected static void printMessages(ArrayOfMessage messages)
    {
        for (int ii = 0; ii < messages.size(); ii++)
        {
            Message message = messages.getMessage(ii);
            System.out.println(message.getSeverity().toString() + " " + ii + ": " + message.getSummary());
        }

    }
}
