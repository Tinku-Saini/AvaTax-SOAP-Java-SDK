import com.avalara.avatax.services.tax.*;
import com.avalara.avatax.services.base.Profile;
import com.avalara.avatax.services.base.Security;

import javax.xml.rpc.ServiceException;
import javax.xml.soap.SOAPException;
import java.net.MalformedURLException;
import java.net.URL;
import java.io.IOException;
import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.Date;
import java.math.BigDecimal;

import junit.framework.Assert;
import org.apache.axis.EngineConfiguration;
import org.apache.axis.configuration.FileProvider;

/**
 * This is a sample tax calculation using the AvaTax TaxSvc.
 *
 * @author araval
 * Copyright (c) 2005, Avalara.  All rights reserved.
 */

// Note: PLZ refer to test cases updated with the 4.12 changes
// testReconcileHistoryTest
// testReconcileHistoryTest    
public class TaxTransactionSample
{
    public static void main(String args[])
    {
        try
        {
            TaxSvcSoap port = getTaxSvc();

            GetTaxRequest getTaxRequest = new GetTaxRequest();

            // Set the tax document properties
            getTaxRequest.setCompanyCode("DEFAULT");
            Date docDate = new Date();
            getTaxRequest.setDocCode("TaxTxSample-" + docDate.toString()); // Unique DocCode
            getTaxRequest.setDocType(DocumentType.SalesInvoice);
            getTaxRequest.setDocDate(docDate);
            //request.setExemptionNo("");
            getTaxRequest.setCustomerCode("TaxSvcTest");
            //request.setPurchaserType("");
            getTaxRequest.setSalespersonCode("");
            getTaxRequest.setOriginCode("Origin");
            getTaxRequest.setDestinationCode("Dest");
            getTaxRequest.setDetailLevel(DetailLevel.Line);

            getTaxRequest.setLocationCode("Test LocationCode");

            // Add the origin and destination addresses referred to by the
            // setOriginCode and setDestinationCode properties above.
            ArrayOfBaseAddress addresses = new ArrayOfBaseAddress(2);
            BaseAddress origin = new BaseAddress();
            origin.setAddressCode("Origin");
            origin.setLine1("Avalara");
            origin.setLine2("900 Winslow Way");
            origin.setLine3("Suite 100");
            origin.setCity("Bainbridge Island");
            origin.setRegion("WA");
            origin.setPostalCode("98110");
            origin.setCountry("USA");
            addresses.add(origin);

            BaseAddress destination = new BaseAddress();
            destination.setAddressCode("Dest");
            destination.setLine1("3130 Elliott");
            destination.setCity("Seattle");
            destination.setRegion("WA");
            destination.setPostalCode("98121");
            destination.setCountry("USA");
            addresses.add(destination);

            getTaxRequest.setAddresses(addresses);

            // Add invoice lines
            ArrayOfLine lines = new ArrayOfLine(2);
            Line line;

            line = new Line();
            line.setNo("101");
            line.setItemCode("Item001");
            line.setQty(new BigDecimal(1));
            line.setAmount(new BigDecimal(1000.00));
            //added in 4.12 release
            line.setCustomerUsageType("G");
            line.setDescription("Sample Description");
            lines.add(line);

            line = new Line();
            line.setNo("102");
            line.setItemCode("FR");
            line.setQty(new BigDecimal(1));
            line.setAmount(new BigDecimal(10.00));
            lines.add(line);

            getTaxRequest.setLines(lines);

            // Get the tax
            GetTaxResult getTaxResult = port.getTax(getTaxRequest);

            System.out.println("GetTax Result: " + getTaxResult.getResultCode().toString());

            if (getTaxResult.getResultCode() == SeverityLevel.Success)
            {
                System.out.println("DocCode: " + getTaxRequest.getDocCode());                
                System.out.println("TotalAmount: " + getTaxResult.getTotalAmount().toString());
                System.out.println("TotalTax: " + getTaxResult.getTotalTax().toString());
            }
            else
            {
                printMessages(getTaxResult.getMessages());
                return;
            }

            // Post the document

            PostTaxRequest postTaxRequest = new PostTaxRequest();
            // Identify which document
            postTaxRequest.setCompanyCode(getTaxRequest.getCompanyCode());
            postTaxRequest.setDocCode(getTaxRequest.getDocCode());
            postTaxRequest.setDocType(getTaxRequest.getDocType());
            // Can change the document date, but this is not usually desired
            postTaxRequest.setDocDate(getTaxRequest.getDocDate());
            // Pass the expected TotalAmount and TotalTax for verification
            postTaxRequest.setTotalAmount(getTaxResult.getTotalAmount());
            postTaxRequest.setTotalTax(getTaxResult.getTotalTax());

            PostTaxResult postTaxResult = port.postTax(postTaxRequest);

            System.out.println("PostTax Result: " + postTaxResult.getResultCode().toString());

            if (postTaxResult.getResultCode() != SeverityLevel.Success)
            {
                printMessages(postTaxResult.getMessages());
                return;
            }

            // Commit the document - AvaTax provides a two phase commit.
            // Within a financial application, you should now post to the finance application,
            // then commit to AvaTax or CancelTax if posting fails

            CommitTaxRequest commitTaxRequest = new CommitTaxRequest();                        
            commitTaxRequest.setCompanyCode(getTaxRequest.getCompanyCode());
            commitTaxRequest.setDocType(getTaxRequest.getDocType());
            commitTaxRequest.setDocCode(getTaxRequest.getDocCode());

            CommitTaxResult commitTaxResult = port.commitTax(commitTaxRequest);

            System.out.println("CommitTax Result: " + commitTaxResult.getResultCode().toString());

            if (commitTaxResult.getResultCode() != SeverityLevel.Success)
            {
                printMessages(commitTaxResult.getMessages());

                if (commitTaxResult.getResultCode() == SeverityLevel.Error || commitTaxResult.getResultCode() == SeverityLevel.Exception)
                {
                    // Cancel it
                    CancelTaxRequest cancelTaxRequest = new CancelTaxRequest();

                    cancelTaxRequest.setCompanyCode(getTaxRequest.getCompanyCode());
                    cancelTaxRequest.setDocCode(getTaxRequest.getDocCode());
                    cancelTaxRequest.setDocType(getTaxRequest.getDocType());
                    cancelTaxRequest.setCancelCode(CancelCode.PostFailed);

                    CancelTaxResult cancelTaxResult = port.cancelTax(cancelTaxRequest);

                    System.out.println("CancelTax Result: " + cancelTaxResult.getResultCode().toString());
                }
                return;
            }
        }
        catch (Exception ex)
        {
            System.out.println("Exception: " + ex.getMessage());
        }
    }

    protected static TaxSvcSoap getTaxSvc() throws ServiceException, SOAPException, MalformedURLException, IOException
    {
        TaxSvc taxSvc;
        TaxSvcSoap port;

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

        taxSvc = new TaxSvcLocator();

        port = taxSvc.getTaxSvcSoap(new URL(url));

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
