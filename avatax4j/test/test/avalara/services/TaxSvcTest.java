package test.avalara.services;

import junit.framework.*;
import com.avalara.avatax.services.tax.*;
import com.avalara.avatax.services.base.*;

import java.io.*;
import javax.xml.rpc.ServiceException;
import javax.xml.soap.SOAPException;
import java.rmi.RemoteException;
import java.text.Format.Field;	//Added on 211116
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Arrays;//Added on 211116
import java.util.Calendar;
import java.math.BigDecimal;
import java.net.URL;
import java.net.MalformedURLException;


/**
 * JUnit tests for Avalara AvaTax Tax
 */
public class TaxSvcTest extends TestCase
{
    private TaxSvc taxSvc;
    private TaxSvcSoap port;



    public static void main(String args[]) 
    {
        junit.textui.TestRunner.run(TaxSvcTest.class);
    }
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
        

        taxSvc = new TaxSvcLocator();

        port = taxSvc.getTaxSvcSoap(new URL(url));

              

        // Set the profile
        Profile profile = new Profile();
        profile.setName("6.0.0");
        profile.setClient("TaxSvcTest,5.5.0.0");
        port.setProfile(profile);

        // Set security
        Security security = new Security();
        security.setAccount(account);
        security.setLicense(license);
        port.setSecurity(security);
    }

    public void testPing() throws RemoteException
    {
        PingResult result = port.ping("");

        Assert.assertEquals(SeverityLevel.Success, result.getResultCode());
    }

    public void testIsAuthorized() throws RemoteException
    {
        IsAuthorizedResult result = port.isAuthorized("Ping,IsAuthorized,GetTax,PostTax,CommitTax,CancelTax,ReconcileTaxHistory");

        Assert.assertEquals(SeverityLevel.Success, result.getResultCode());
        Assert.assertEquals("Ping,IsAuthorized,GetTax,PostTax,CommitTax,CancelTax,ReconcileTaxHistory", result.getOperations());
    }

    public void testGetTaxDocumentDetail() throws RemoteException
    {
        GetTaxRequest request = CreateTaxRequest("GetTaxDocumentDetailTest");

        GetTaxResult result = port.getTax(request);

        Assert.assertEquals(SeverityLevel.Success, result.getResultCode());
        Assert.assertEquals(DocStatus.Saved, result.getDocStatus());
        Assert.assertFalse(result.isReconciled());
        Assert.assertEquals(new BigDecimal(1010), result.getTotalAmount());
        Assert.assertEquals(BigDecimal.valueOf(8787, 2), result.getTotalTax());

        // Check tax history
        GetTaxHistoryRequest taxHistoryRequest = new GetTaxHistoryRequest();
        //taxHistoryRequest.setDocId(result.getDocId());
        taxHistoryRequest.setCompanyCode(request.getCompanyCode());
        taxHistoryRequest.setDocCode(request.getDocCode());
        taxHistoryRequest.setDocType(request.getDocType());
        taxHistoryRequest.setDetailLevel(DetailLevel.Tax);
        GetTaxHistoryResult taxHistoryResult = waitForTaxHistory(taxHistoryRequest, result.getTimestamp());

        Assert.assertEquals(SeverityLevel.Success, taxHistoryResult.getResultCode());
        compareHistory(request, result, taxHistoryResult);
    }

    public void testGetTaxRounding() throws RemoteException
    {
        GetTaxRequest request = CreateTaxRequest("GetTaxDocumentDetailTest-Java");
        request.setDetailLevel(DetailLevel.Tax);
        request.getLines().getLine(0).setAmount(new BigDecimal(4599));
        request.getLines().getLine(1).setAmount(new BigDecimal(50));

        GetTaxResult result = port.getTax(request);

        Assert.assertEquals(SeverityLevel.Success, result.getResultCode());
        Assert.assertEquals(BigDecimal.valueOf(40447, 2), result.getTotalTax());

        // Check tax history
        GetTaxHistoryRequest taxHistoryRequest = new GetTaxHistoryRequest();
        //taxHistoryRequest.setDocId(result.getDocId());
        taxHistoryRequest.setCompanyCode(request.getCompanyCode());
        taxHistoryRequest.setDocCode(request.getDocCode());
        taxHistoryRequest.setDocType(request.getDocType());
        taxHistoryRequest.setDetailLevel(DetailLevel.Tax);
        GetTaxHistoryResult taxHistoryResult = port.getTaxHistory(taxHistoryRequest);

        Assert.assertEquals(SeverityLevel.Success, taxHistoryResult.getResultCode());
        compareHistory(request, result, taxHistoryResult);
    }


    public void testTransaction() throws RemoteException
    {
        Date date = new Date();
        String docCode = "CommitTest " + Long.toString(date.getTime());
        GetTaxRequest taxRequest = CreateTaxRequest(docCode);
        //taxRequest.setDetailLevel(DetailLevel.Tax);
        taxRequest.setDetailLevel(DetailLevel.Diagnostic);

        GetTaxResult taxResult = port.getTax(taxRequest);

        Assert.assertEquals(SeverityLevel.Success, taxResult.getResultCode());
        Assert.assertEquals(taxRequest.getLines().size(), taxResult.getTaxLines().size());
        TaxLine taxLine = taxResult.getTaxLines().getTaxLine(0);
        Assert.assertEquals(3, taxLine.getTaxDetails().size());

        TaxDetail taxDetail = taxLine.getTaxDetails().getTaxDetail(0);
        Assert.assertEquals(JurisdictionType.State, taxDetail.getJurisType());
        Assert.assertEquals("53", taxDetail.getJurisCode());
        Assert.assertEquals(BigDecimal.valueOf(1000), taxDetail.getTaxable());
        Assert.assertEquals(BigDecimal.valueOf(65000,6), taxDetail.getRate());
        Assert.assertEquals("G", taxDetail.getRateType());
        Assert.assertEquals(BigDecimal.valueOf(65), taxDetail.getTax());
        Assert.assertEquals(BigDecimal.valueOf(0), taxDetail.getNonTaxable());
        Assert.assertEquals(taxDetail.getTaxable(), taxDetail.getTaxable());

        // Check tax history
        GetTaxHistoryRequest taxHistoryRequest = new GetTaxHistoryRequest();
        //taxHistoryRequest.setDocId(taxResult.getDocId());
        taxHistoryRequest.setCompanyCode(taxRequest.getCompanyCode());
        taxHistoryRequest.setDocCode(taxRequest.getDocCode());
        taxHistoryRequest.setDocType(taxRequest.getDocType());
        //taxHistoryRequest.setDetailLevel(DetailLevel.Tax);
        taxHistoryRequest.setDetailLevel(DetailLevel.Diagnostic);
        GetTaxHistoryResult taxHistoryResult = port.getTaxHistory(taxHistoryRequest);

        Assert.assertEquals(SeverityLevel.Success, taxHistoryResult.getResultCode());
        GetTaxRequest historyTaxRequest = taxHistoryResult.getGetTaxRequest();
        Assert.assertNotNull(historyTaxRequest);
        Assert.assertEquals(taxRequest.getAddresses().size(), historyTaxRequest.getAddresses().size());
        Assert.assertEquals(taxRequest.getLines().size(), historyTaxRequest.getLines().size());
        Assert.assertEquals(0,taxRequest.getExchangeRate().compareTo(taxHistoryResult.getGetTaxRequest().getExchangeRate()));
        //Assert.assertEquals(taxRequest.getExchangeRateEffDate(),taxHistoryResult.getGetTaxRequest().getExchangeRateEffDate());

        compareHistory(taxRequest,taxResult,taxHistoryResult);

        GetTaxResult historyTaxResult = taxHistoryResult.getGetTaxResult();
        Assert.assertNotNull(historyTaxResult);
        Assert.assertEquals(taxRequest.getLines().size(), historyTaxResult.getTaxLines().size());

        PostTaxRequest postRequest = new PostTaxRequest();

        postRequest.setCompanyCode(taxRequest.getCompanyCode());
        postRequest.setDocType(taxRequest.getDocType());
        postRequest.setDocCode(taxRequest.getDocCode());
        postRequest.setDocDate(taxRequest.getDocDate());
        postRequest.setTotalAmount(taxResult.getTotalAmount());
        postRequest.setTotalTax(taxResult.getTotalTax());
        String newDocCode="NewDocumentCode"+ Long.toString(date.getTime());
        postRequest.setNewDocCode(newDocCode);

        PostTaxResult postResult = port.postTax(postRequest);


        Assert.assertEquals(SeverityLevel.Success, postResult.getResultCode());

        CommitTaxRequest commitRequest = new CommitTaxRequest();
        commitRequest.setCompanyCode(taxRequest.getCompanyCode());
        commitRequest.setDocType(taxRequest.getDocType());
        commitRequest.setDocCode(newDocCode);


        CommitTaxResult commitResult = port.commitTax(commitRequest);

        Assert.assertEquals(SeverityLevel.Success, commitResult.getResultCode());

        CancelTaxRequest cancelRequest = new CancelTaxRequest();
        cancelRequest.setCompanyCode(taxRequest.getCompanyCode());
        cancelRequest.setDocCode(newDocCode);
        cancelRequest.setDocType(taxRequest.getDocType());
        cancelRequest.setCancelCode(CancelCode.DocDeleted);

        CancelTaxResult cancelResult = port.cancelTax(cancelRequest);

        Assert.assertEquals(SeverityLevel.Success, cancelResult.getResultCode());

    }

    public void testReconcileHistoryTest() throws RemoteException
    {
        Date date = new Date();
        String docCode = "CommitTest " + Long.toString(date.getTime());
        GetTaxRequest taxRequest = CreateTaxRequest(docCode);
        taxRequest.setDetailLevel(DetailLevel.Tax);

        GetTaxResult taxResult = port.getTax(taxRequest);

        Assert.assertEquals(SeverityLevel.Success, taxResult.getResultCode());
        Assert.assertEquals(taxRequest.getLines().size(), taxResult.getTaxLines().size());
        TaxLine taxLine = taxResult.getTaxLines().getTaxLine(0);
        Assert.assertEquals(taxLine.getTaxDetails().size(),3);
        TaxDetail taxDetail = taxLine.getTaxDetails().getTaxDetail(0);
        Assert.assertEquals(JurisdictionType.State, taxDetail.getJurisType());
        Assert.assertEquals("53", taxDetail.getJurisCode());
        Assert.assertEquals(BigDecimal.valueOf(1000), taxDetail.getTaxable());
        Assert.assertEquals(BigDecimal.valueOf(65000,6), taxDetail.getRate());
        Assert.assertEquals(BigDecimal.valueOf(65), taxDetail.getTax());
        Assert.assertEquals(BigDecimal.valueOf(0), taxDetail.getNonTaxable());
        Assert.assertEquals(taxDetail.getTaxable(), taxDetail.getTaxable());

        PostTaxRequest postRequest = new PostTaxRequest();

        postRequest.setCompanyCode(taxRequest.getCompanyCode());
        postRequest.setDocType(taxRequest.getDocType());
        postRequest.setDocCode(taxRequest.getDocCode());
        postRequest.setDocDate(taxRequest.getDocDate());
        postRequest.setTotalAmount(taxResult.getTotalAmount());
        postRequest.setTotalTax(taxResult.getTotalTax());

        PostTaxResult postResult = port.postTax(postRequest);

        Assert.assertEquals(SeverityLevel.Success, postResult.getResultCode());

        CommitTaxRequest commitRequest = new CommitTaxRequest();
        commitRequest.setCompanyCode(taxRequest.getCompanyCode());
        commitRequest.setDocType(taxRequest.getDocType());
        commitRequest.setDocCode(taxRequest.getDocCode());

        CommitTaxResult commitResult = port.commitTax(commitRequest);

        Assert.assertEquals(SeverityLevel.Success, commitResult.getResultCode());

        // Wait for queue
        // Check tax history
        GetTaxHistoryRequest taxHistoryRequest = new GetTaxHistoryRequest();
        //taxHistoryRequest.setDocId(result.getDocId());
        taxHistoryRequest.setCompanyCode(taxRequest.getCompanyCode());
        taxHistoryRequest.setDocCode(taxRequest.getDocCode());
        taxHistoryRequest.setDocType(taxRequest.getDocType());
        taxHistoryRequest.setDetailLevel(DetailLevel.Document);
        GetTaxHistoryResult taxHistoryResult = waitForTaxHistory(taxHistoryRequest, taxResult.getTimestamp());

        //Preparing RecontaxHistory Request
        ReconcileTaxHistoryRequest reconcileTaxHistoryRequest = new ReconcileTaxHistoryRequest();
        reconcileTaxHistoryRequest.setCompanyCode("DEFAULT");
        //request.setReconciled(false);
        reconcileTaxHistoryRequest.setStartDate(new Date());
        reconcileTaxHistoryRequest.setEndDate(new Date());
        reconcileTaxHistoryRequest.setDocStatus(DocStatus.Committed);
        reconcileTaxHistoryRequest.setLastDocCode("0");
        reconcileTaxHistoryRequest.setPageSize(new Integer(100));
        
        //Calling reconHistory Method
        ReconcileTaxHistoryResult reconcileTaxHistoryResult = port.reconcileTaxHistory(reconcileTaxHistoryRequest);
        Assert.assertEquals(SeverityLevel.Success,reconcileTaxHistoryResult.getResultCode());
        GetTaxResult taxResults[] = reconcileTaxHistoryResult.getGetTaxResults().getGetTaxResult();
        Assert.assertTrue("Expected > 0 reconcile records",taxResults.length > 0);
        Assert.assertTrue("RecordCount has to be equal to or more than number of records fetched",reconcileTaxHistoryResult.getRecordCount().intValue() >= taxResults.length);


        boolean found = false;
        GetTaxResult getTaxResult=null;


        do
        {
            for (int i=0;i <taxResults.length ;i++)
            {
                getTaxResult=taxResults[i];
                Assert.assertEquals(DocStatus.Committed, getTaxResult.getDocStatus());
                compareDate(taxRequest.getDocDate(),getTaxResult.getDocDate());


                if (getTaxResult.getDocCode().equals(commitRequest.getDocCode()))
                {
                    found = true;
                }
            }

            reconcileTaxHistoryRequest.setLastDocCode(reconcileTaxHistoryResult.getLastDocCode());
            reconcileTaxHistoryResult = port.reconcileTaxHistory(reconcileTaxHistoryRequest);
        }
        while (reconcileTaxHistoryResult.getGetTaxResults().getGetTaxResult().length > 0);

        Assert.assertTrue("ReconcileCommittedTest doc not found",found);

        CancelTaxRequest cancelRequest = new CancelTaxRequest();
        cancelRequest.setCompanyCode(taxRequest.getCompanyCode());
        cancelRequest.setDocCode(taxRequest.getDocCode());
        cancelRequest.setDocType(taxRequest.getDocType());
        cancelRequest.setCancelCode(CancelCode.DocDeleted);

        CancelTaxResult cancelResult = port.cancelTax(cancelRequest);

        Assert.assertEquals(SeverityLevel.Success, cancelResult.getResultCode());

    }

    public void testApplyPayment() throws RemoteException
    {

        Date date=new Date();
        Calendar calendar=Calendar.getInstance();

        GetTaxRequest request = CreateTaxRequest("ApplyPaymentTest");
        request.setDetailLevel(DetailLevel.Tax);
        calendar.add(Calendar.DATE,-2);
        request.setDocDate(calendar.getTime());

        request.setDocCode("ApplyPaymentTest" +date.getTime());
        request.setCommit(true);
        GetTaxResult result = port.getTax(request);

        Assert.assertEquals(com.avalara.avatax.services.tax.SeverityLevel.Success, result.getResultCode());

        Calendar paymentDate =Calendar.getInstance();
        ApplyPaymentRequest applyPaymentRequest = new ApplyPaymentRequest();
        applyPaymentRequest.setCompanyCode(request.getCompanyCode());
        applyPaymentRequest.setDocCode(request.getDocCode());
        applyPaymentRequest.setPaymentDate(paymentDate);
        applyPaymentRequest.setDocType(DocumentType.SalesInvoice);
        ApplyPaymentResult applyPaymentResult = port.applyPayment(applyPaymentRequest);

        if(com.avalara.avatax.services.tax.SeverityLevel.Warning.equals(applyPaymentResult.getResultCode()))
        {
            Assert.assertEquals("ApplyPaymentWarning",applyPaymentResult.getMessages().getMessage(0).getName());
        }
        else
        {
            Assert.assertEquals(com.avalara.avatax.services.tax.SeverityLevel.Success,applyPaymentResult.getResultCode());
        }

    }

    public void fourTwelveChangesTest() throws RemoteException
    {
        Date date = new Date();
        String docCode = "CommitTest " + Long.toString(date.getTime());
        GetTaxRequest taxRequest = CreateTaxRequestReloaded(docCode,1);
        taxRequest.setDetailLevel(DetailLevel.Tax);

        GetTaxResult taxResult = port.getTax(taxRequest);

        Assert.assertEquals(SeverityLevel.Success, taxResult.getResultCode());
        Assert.assertEquals(taxRequest.getLines().size(), taxResult.getTaxLines().size());

        TaxLine taxLine = taxResult.getTaxLines().getTaxLine(0);
        Assert.assertEquals(2, taxLine.getTaxDetails().size());

        PostTaxRequest postRequest = new PostTaxRequest();

        postRequest.setCompanyCode(taxRequest.getCompanyCode());
        postRequest.setDocType(taxRequest.getDocType());
        postRequest.setDocCode(taxRequest.getDocCode());
        postRequest.setDocDate(taxRequest.getDocDate());
        postRequest.setTotalAmount(taxResult.getTotalAmount());
        postRequest.setTotalTax(taxResult.getTotalTax());

        PostTaxResult postResult = port.postTax(postRequest);

        Assert.assertEquals(SeverityLevel.Success, postResult.getResultCode());

        CommitTaxRequest commitRequest = new CommitTaxRequest();
        commitRequest.setCompanyCode(taxRequest.getCompanyCode());
        commitRequest.setDocType(taxRequest.getDocType());
        commitRequest.setDocCode(taxRequest.getDocCode());
        String newDocCode = Long.toString(date.getTime());
        //overwritting the DocCode
        commitRequest.setDocCode(newDocCode);
        CommitTaxResult commitResult = port.commitTax(commitRequest);


        //Finally Cancel Tax and remove the entry from the system by calling new DocVoided
        CancelTaxRequest cancelRequest = new CancelTaxRequest();
        cancelRequest.setCompanyCode(taxRequest.getCompanyCode());
        cancelRequest.setDocCode(taxRequest.getDocCode());
        cancelRequest.setDocType(taxRequest.getDocType());
        cancelRequest.setCancelCode(CancelCode.DocVoided);

        CancelTaxResult cancelResult = port.cancelTax(cancelRequest);

        Assert.assertEquals(SeverityLevel.Success, cancelResult.getResultCode());


        // Check tax history
        GetTaxHistoryRequest taxHistoryRequest = new GetTaxHistoryRequest();
        //taxHistoryRequest.setDocId(taxResult.getDocId());
        taxHistoryRequest.setCompanyCode(taxRequest.getCompanyCode());
        taxHistoryRequest.setDocCode(taxRequest.getDocCode());
        taxHistoryRequest.setDocType(taxRequest.getDocType());
        taxHistoryRequest.setDetailLevel(DetailLevel.Tax);
        GetTaxHistoryResult taxHistoryResult = port.getTaxHistory(taxHistoryRequest);

        Assert.assertEquals(SeverityLevel.Success, taxHistoryResult.getResultCode());
        GetTaxRequest historyTaxRequest = taxHistoryResult.getGetTaxRequest();
        Assert.assertNotNull(historyTaxRequest);
        Assert.assertEquals(taxRequest.getAddresses().size(), historyTaxRequest.getAddresses().size());
        Assert.assertEquals(taxRequest.getLines().size(), historyTaxRequest.getLines().size());
        GetTaxResult historyTaxResult = taxHistoryResult.getGetTaxResult();
        Assert.assertNotNull(historyTaxResult);
        Assert.assertEquals(taxRequest.getLines().size(), historyTaxResult.getTaxLines().size());
        Assert.assertEquals(SeverityLevel.Success, commitResult.getResultCode());

        //match the values

        //compare id DocCode has been overwritten
        Assert.assertEquals(historyTaxResult.getDocCode(),newDocCode );
        //compare DocStatus is Cancelled as we straight away cancelled the Doc
        //System.out.print("Printing the status :"+historyTaxResult.getDocStatus());

        //Printing the TaxName
        //System.out.print("Printing TaxName : " + historyTaxResult.getTaxLines().getTaxLine(0).getTaxDetails().getTaxDetail(0).getTaxName());

        //Finally Cancel Tax and remove the entry from the system by calling new DocVoided
        //Delete the document from the system
        cancelRequest = new CancelTaxRequest();
        //cancelRequest.setDocId(commitResult.getDocId());
        cancelRequest.setCompanyCode(taxRequest.getCompanyCode());
        cancelRequest.setDocCode(taxRequest.getDocCode());
        cancelRequest.setDocType(taxRequest.getDocType());
        cancelRequest.setDocType(taxRequest.getDocType());
        cancelRequest.setCancelCode(CancelCode.DocDeleted);

        cancelResult = port.cancelTax(cancelRequest);

        Assert.assertEquals(SeverityLevel.Success, cancelResult.getResultCode());

    }

    public void fourSeventeenChangesTest() throws RemoteException
    {
        GetTaxRequest request = CreateTaxRequest("AdjustTaxTest"+new Date());
        request.setCommit(true);
        GetTaxResult result = port.getTax(request);

        if (result.getMessages().size() > 0)
        {
            System.out.println(result);
        }
        Assert.assertEquals(SeverityLevel.Success, result.getResultCode());
        Assert.assertEquals(1, result.getVersion());
        Assert.assertEquals(false, result.getLocked());
        Assert.assertEquals(0, result.getAdjustmentReason());
        Assert.assertEquals("", result.getAdjustmentDescription());
        Assert.assertEquals(DocStatus.Committed, result.getDocStatus());
        Assert.assertEquals(1, result.getVersion());
        Assert.assertEquals(result.getDocDate(), result.getTaxDate());


        //***************
        Line line = new Line();
        int lineNo = 2;
        line.setNo(Integer.toString(lineNo));
        line.setQty(new BigDecimal(2));
        line.setAmount(new BigDecimal(100.00));
        //request.lines.add();
        request.getLines().add(line);



        AdjustTaxRequest adjustTaxRequest = new AdjustTaxRequest();
        adjustTaxRequest.setAdjustmentReason(4); // Price or Qty Adjustment
        adjustTaxRequest.setGetTaxRequest(request);
        adjustTaxRequest.setAdjustmentDescription("Testing Adjustment");
        AdjustTaxResult adjustTaxResult = port.adjustTax(adjustTaxRequest);
        //TaxSvcAssert.IsSuccess(adjustTaxResult);
        Assert.assertEquals(2, adjustTaxResult.getVersion());
        Assert.assertEquals(4, adjustTaxResult.getAdjustmentReason());
        Assert.assertEquals("Testing Adjustment", adjustTaxResult.getAdjustmentDescription());
        Assert.assertEquals(DocStatus.Committed, result.getDocStatus());
        //System.out.println("Adjusted Version 2 DocId: "+ adjustTaxResult.getDocId());


        // Cancel the last adjustment
        CancelTaxRequest cancelRequest = new CancelTaxRequest();
        //cancelRequest.setDocId(adjustTaxResult.getDocId());
        cancelRequest.setCompanyCode(request.getCompanyCode());
        cancelRequest.setDocCode(request.getDocCode());
        cancelRequest.setDocType(request.getDocType());
        cancelRequest.setCancelCode(CancelCode.AdjustmentCancelled);
        CancelTaxResult cancelResult = port.cancelTax(cancelRequest);
        //TaxSvcAssert.IsSuccess(cancelResult);
        //System.out.println("Cancelled Version 2 DocId: {0}"+ cancelResult.getDocId());

        // Check the version
        GetTaxHistoryRequest taxHistoryRequest = new GetTaxHistoryRequest();
        //taxHistoryRequest.setDocId(cancelResult.getDocId());
        taxHistoryRequest.setCompanyCode(request.getCompanyCode());
        taxHistoryRequest.setDocCode(request.getDocCode());
        taxHistoryRequest.setDocType(request.getDocType());
        taxHistoryRequest.setDetailLevel(DetailLevel.Document);
        GetTaxHistoryResult taxHistoryResult = port.getTaxHistory(taxHistoryRequest);
        //TaxSvcAssert.IsSuccess(taxHistoryResult);
        Assert.assertEquals(1, taxHistoryResult.getGetTaxResult().getVersion());
        Assert.assertEquals(0, taxHistoryResult.getGetTaxResult().getAdjustmentReason());

    }

    public void testTaxOverrideHeader()
    {
        try
        {
            GetTaxRequest request = CreateTaxRequest("TaxOverrideTest"+new Date());

            TaxOverride taxOverride = new TaxOverride();
            taxOverride.setTaxOverrideType(TaxOverrideType.TaxAmount);
            taxOverride.setTaxAmount(new BigDecimal(5));
            taxOverride.setTaxDate(new Date());
            taxOverride.setReason("Return");
            request.setCurrencyCode("USD");
            request.setServiceMode(ServiceMode.Automatic);

            request.setTaxOverride(taxOverride);

            GetTaxResult result = port.getTax(request);

            if (result.getMessages().size() > 0)
            {
                System.out.println(result.getMessages().getMessage(0).getSummary());
            }
            Assert.assertEquals(SeverityLevel.Success, result.getResultCode());

            Assert.assertEquals(SeverityLevel.Success, result.getResultCode());
            Assert.assertEquals(new BigDecimal(5), result.getTotalTax());

            // Check tax history
            GetTaxHistoryRequest taxHistoryRequest = new GetTaxHistoryRequest();
            //taxHistoryRequest.setDocId(result.getDocId());
            taxHistoryRequest.setCompanyCode(request.getCompanyCode());
            taxHistoryRequest.setDocCode(request.getDocCode());
            taxHistoryRequest.setDocType(request.getDocType());
            taxHistoryRequest.setDetailLevel(DetailLevel.Tax);
            GetTaxHistoryResult taxHistoryResult = port.getTaxHistory(taxHistoryRequest);

            Assert.assertEquals(SeverityLevel.Success, taxHistoryResult.getResultCode());
            compareHistory(request, result, taxHistoryResult);
        }
        catch (RemoteException e)
        {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
    }

    public void testAllParemeterBagItems()
    {
        try
        {
        	//GetAllParameterBagItemsResult allParameterBagItemsResult = port.getAllParameterBagItems(null);        	
        	GetParameterBagItemsResult allParameterBagItemsResult1 = port.getParameterBagItems(null);
            Assert.assertEquals(SeverityLevel.Success, allParameterBagItemsResult1.getResultCode());
        }
        catch (RemoteException e)
        {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
	}

    public void testTaxOverrideLine()
    {
        try
        {
        	//echo 123
            GetTaxRequest request = CreateTaxRequestForTaxOverride("TaxOverrideLineTest"+new Date());
            request.setCurrencyCode("USD");
            request.setServiceMode(ServiceMode.Automatic);

            GetTaxResult result = port.getTax(request);
            Assert.assertEquals(SeverityLevel.Success, result.getResultCode());
            Assert.assertEquals(result.getTotalTax(),new BigDecimal(5));
            Assert.assertEquals(result.getTotalTaxCalculated(),new BigDecimal(80));

            Assert.assertEquals(result.getTaxLines().getTaxLine(0).getTax(),new BigDecimal(5));
            Assert.assertEquals(result.getTaxLines().getTaxLine(0).getTaxCalculated(),new BigDecimal(80));

           // Assert.assertEquals(result.getTaxLines().getTaxLine(0).g);

            // Check tax history
            GetTaxHistoryRequest taxHistoryRequest = new GetTaxHistoryRequest();
            //taxHistoryRequest.setDocId(result.getDocId());
            taxHistoryRequest.setCompanyCode(request.getCompanyCode());
            taxHistoryRequest.setDocCode(request.getDocCode());
            taxHistoryRequest.setDocType(request.getDocType());
            taxHistoryRequest.setDetailLevel(DetailLevel.Tax);
            GetTaxHistoryResult taxHistoryResult = port.getTaxHistory(taxHistoryRequest);

            Assert.assertEquals(SeverityLevel.Success, taxHistoryResult.getResultCode());
            compareHistory(request, result, taxHistoryResult);
        }
        catch (RemoteException e)
        {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
    }

    public void testGetTaxGlobal() throws RemoteException, SOAPException
    {
        GetTaxRequest request = CreateTaxRequest("testGetTaxGlobal");

        // Change the destination to Canada
        BaseAddress destAddress = request.getAddresses().getBaseAddress(1);
        destAddress.setLine1("5412 Imperial St");
        destAddress.setLine2("");
        destAddress.setCity("Burnaby");
        destAddress.setRegion("BC");
        destAddress.setPostalCode("V5J 1E6");
        destAddress.setCountry("CA");

        GetTaxResult result = port.getTax(request);

        Assert.assertEquals(SeverityLevel.Success, result.getResultCode());
        Assert.assertEquals(DocStatus.Saved, result.getDocStatus());
        Assert.assertFalse(result.isReconciled());
        Assert.assertEquals(new BigDecimal(1010), result.getTotalAmount());
        Assert.assertEquals(BigDecimal.valueOf(8787, 2), result.getTotalTax());

        // Look for new Country/State jurisdictions
        TaxLine taxLine = result.getTaxLines().getTaxLine(0);
        TaxDetail taxDetail = findTaxDetail(JurisdictionType.Country, "CA", taxLine.getTaxDetails().getTaxDetail());
        //Assert.assertNotNull("Expected Country=CA detail", taxDetail);
        taxDetail = findTaxDetail(JurisdictionType.State, "BC", taxLine.getTaxDetails().getTaxDetail());
        //Assert.assertNotNull("Expected State=BC detail", taxDetail);

        // Check tax history
        GetTaxHistoryRequest taxHistoryRequest = new GetTaxHistoryRequest();
        //taxHistoryRequest.setDocId(result.getDocId());
        taxHistoryRequest.setCompanyCode(request.getCompanyCode());
        taxHistoryRequest.setDocCode(request.getDocCode());
        taxHistoryRequest.setDocType(request.getDocType());
        taxHistoryRequest.setDetailLevel(DetailLevel.Tax);
        GetTaxHistoryResult taxHistoryResult = port.getTaxHistory(taxHistoryRequest);

        Assert.assertEquals(SeverityLevel.Success, taxHistoryResult.getResultCode());
        compareHistory(request, result, taxHistoryResult);
    }

    public void testGetTaxWithLatLong() throws RemoteException, SOAPException
    {
        port.getProfile().setName("Jaas");
        GetTaxRequest request = CreateTaxRequestWithLatLong("testGetTaxWithLatLong");
        GetTaxResult result = port.getTax(request);

        Assert.assertEquals(SeverityLevel.Success, result.getResultCode());
        Assert.assertEquals(DocStatus.Saved, result.getDocStatus());
        Assert.assertFalse(result.isReconciled());
        Assert.assertEquals(new BigDecimal(15), result.getTotalAmount());
        Assert.assertEquals(BigDecimal.valueOf(131,2) , result.getTotalTax());
    
    }

      // Test Function for TaxOverride Type AccruedTaxAmount

    public void testTaxOverrideType()
    {
        try
        {
            GetTaxRequest request = CreateTaxRequestForTaxOverrideType("TaxOverrideTypeTest" + new Date());

            GetTaxResult result = port.getTax(request);

            if (result.getMessages().size() > 0)
            {
                System.out.println(result.getMessages().getMessage(0).getSummary());
            }
            Assert.assertEquals(SeverityLevel.Success, result.getResultCode());
            Assert.assertEquals(request.getDocType(),result.getDocType());
            Assert.assertEquals(new BigDecimal(0), result.getTotalTax());
        }
        catch (RemoteException e)
        {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
    }

    public void testGetTaxWithDocType() throws RemoteException, SOAPException
    {
        //Testing Document Type InventoryTransferInvoice.
        DocumentType docType=DocumentType.InventoryTransferInvoice;
        GetTaxRequest request = CreateTaxRequestDocType(docType);
        GetTaxResult result = port.getTax(request);

        Assert.assertEquals(SeverityLevel.Success, result.getResultCode());
        Assert.assertEquals(new BigDecimal(1010), result.getTotalAmount());
        Assert.assertEquals(BigDecimal.valueOf(9696, 2), result.getTotalTax());

        //Testing Document Type InventoryTransferOrder.
        docType=DocumentType.InventoryTransferOrder;
         request = CreateTaxRequestDocType(docType);
         result = port.getTax(request);

        Assert.assertEquals(SeverityLevel.Success, result.getResultCode());
        Assert.assertEquals(new BigDecimal(1010), result.getTotalAmount());
        Assert.assertEquals(BigDecimal.valueOf(9696, 2), result.getTotalTax());
    }

    //Test Function for Business Identification No.
    public void testGetTaxBusinessIdentificationNo() throws RemoteException
    {

        GetTaxRequest request = CreateTaxRequestForBINo("HL123");

        GetTaxResult result = port.getTax(request);

        Assert.assertEquals(SeverityLevel.Success, result.getResultCode());
        Assert.assertEquals(new BigDecimal(1010), result.getTotalAmount());
        Assert.assertEquals(BigDecimal.valueOf(9696, 2), result.getTotalTax());
        // Check tax history
        GetTaxHistoryRequest taxHistoryRequest = new GetTaxHistoryRequest();
        taxHistoryRequest.setCompanyCode(request.getCompanyCode());
        taxHistoryRequest.setDocCode(request.getDocCode());
        taxHistoryRequest.setDocType(request.getDocType());
        taxHistoryRequest.setDetailLevel(DetailLevel.Tax);
        GetTaxHistoryResult taxHistoryResult = waitForTaxHistory(taxHistoryRequest, result.getTimestamp());
        Assert.assertEquals(SeverityLevel.Success, taxHistoryResult.getResultCode());
        Assert.assertEquals(taxHistoryResult.getGetTaxRequest().getBusinessIdentificationNo(),request.getBusinessIdentificationNo());
        Assert.assertEquals(taxHistoryResult.getGetTaxRequest().getLines().getLine(0).getBusinessIdentificationNo(),request.getLines().getLine(0).getBusinessIdentificationNo());
    }
    
    public void testTaxIncluded() throws RemoteException
    {
        GetTaxRequest request = CreateTaxRequest("testTaxIncluded");
        Line line = request.getLines().getLine(0);
        line.setTaxIncluded(true);

        GetTaxResult result = port.getTax(request);

        Assert.assertEquals(SeverityLevel.Success, result.getResultCode());
        Assert.assertEquals(DocStatus.Saved, result.getDocStatus());
        Assert.assertFalse(result.isReconciled());
        Assert.assertEquals(BigDecimal.valueOf(929.96), result.getTotalAmount());
        Assert.assertEquals(BigDecimal.valueOf(8091, 2), result.getTotalTax());

        // Check tax history
        GetTaxHistoryRequest taxHistoryRequest = new GetTaxHistoryRequest();
        //taxHistoryRequest.setDocId(result.getDocId());
        taxHistoryRequest.setCompanyCode(request.getCompanyCode());
        taxHistoryRequest.setDocCode(request.getDocCode());
        taxHistoryRequest.setDocType(request.getDocType());
        taxHistoryRequest.setDetailLevel(DetailLevel.Tax);
        GetTaxHistoryResult taxHistoryResult = waitForTaxHistory(taxHistoryRequest, result.getTimestamp());

        Assert.assertEquals(SeverityLevel.Success, taxHistoryResult.getResultCode());
        compareHistory(request, result, taxHistoryResult);
    }
    public void testTaxDetailStateAssignedNo() throws RemoteException
    {
        
        GetTaxRequest getTaxRequest = CreateTaxRequest("testStateAssignedNo");
        getTaxRequest.setDetailLevel(DetailLevel.Diagnostic);

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
        destination.setLine1("400 Embassy Row NE Ste 580");
        destination.setCity("Atlanta");
        destination.setRegion("GA");
        destination.setPostalCode("30328-7000");
        destination.setCountry("USA");
        addresses.add(destination);

        getTaxRequest.setAddresses(addresses);

        //StateAssignedNo returned by GetTax
        GetTaxResult getTaxResult=port.getTax(getTaxRequest);
        Assert.assertEquals(SeverityLevel.Success,getTaxResult.getResultCode());


        boolean isStateAssignedNo = false;

        if (getTaxResult.getTaxSummary().getTaxDetail().length  > 0)
        {
            TaxDetail taxDetail;
            for(int i=0;i<getTaxResult.getTaxSummary().getTaxDetail().length;i++)
            {
                taxDetail=getTaxResult.getTaxSummary().getTaxDetail(i);
                 if (taxDetail.getStateAssignedNo() != null && taxDetail.getStateAssignedNo().trim().length() > 0)
                 {
                     //Assert.assertEquals("1804", taxDetail.getStateAssignedNo());
                     isStateAssignedNo=true;

                 }
            }
        }
        if (!isStateAssignedNo)
        {
            Assert.fail("Failed to fetch State Assigned No for the given address");
        }

        isStateAssignedNo = false;
        if (getTaxResult.getTaxLines().getTaxLine().length > 0 && getTaxResult.getTaxLines().getTaxLine(0).getTaxDetails().getTaxDetail().length > 0)
        {
            TaxDetail taxDetail;
            for(int i=0;i<getTaxResult.getTaxLines().getTaxLine(0).getTaxDetails().getTaxDetail().length;i++)
            {
                taxDetail=getTaxResult.getTaxLines().getTaxLine(0).getTaxDetails().getTaxDetail(i);
                if (taxDetail.getStateAssignedNo() != null && taxDetail.getStateAssignedNo().trim().length() > 0)
                {
                    //Assert.assertEquals("1804", taxDetail.getStateAssignedNo());
                    isStateAssignedNo = true;
                }
            }
        }
        if (!isStateAssignedNo)
        {
            Assert.fail("Failed to fetch State Assigned No for the given address");
        }

        // 2. StateAssignedNo is returned by GetTaxHistory
        GetTaxHistoryRequest historyRequest = new GetTaxHistoryRequest();
        historyRequest.setCompanyCode(getTaxRequest.getCompanyCode());
        historyRequest.setDocType(getTaxRequest.getDocType());
        historyRequest.setDocCode(getTaxRequest.getDocCode());
        historyRequest.setDetailLevel( DetailLevel.Diagnostic);

        GetTaxHistoryResult historyResult = port.getTaxHistory(historyRequest);

        Assert.assertEquals(SeverityLevel.Success, historyResult.getResultCode());
        Assert.assertNotNull(historyResult.getGetTaxRequest());
        Assert.assertNotNull(historyResult.getGetTaxResult());

        isStateAssignedNo = false;
        if (historyResult.getGetTaxResult().getTaxSummary().getTaxDetail().length > 0)
        {
            TaxDetail taxDetail;
            for(int i=0;i<historyResult.getGetTaxResult().getTaxSummary().getTaxDetail().length;i++)
            {
                taxDetail=historyResult.getGetTaxResult().getTaxSummary().getTaxDetail(i);
                if (taxDetail.getStateAssignedNo() != null && taxDetail.getStateAssignedNo().trim().length() > 0)
                {
                    //Assert.assertEquals("1800", taxDetail.getStateAssignedNo());
                    isStateAssignedNo = true;
                }
            }
        }
        if (!isStateAssignedNo)
        {
            Assert.fail("Failed to fetch State Assigned No for the given address");
        }

        isStateAssignedNo = false;
        if (historyResult.getGetTaxResult().getTaxLines().getTaxLine().length > 0 && historyResult.getGetTaxResult().getTaxLines().getTaxLine(0).getTaxDetails().getTaxDetail().length > 0)
        {
            TaxDetail taxDetail;
            for(int i=0;i<historyResult.getGetTaxResult().getTaxLines().getTaxLine(0).getTaxDetails().getTaxDetail().length;i++)
            {
                taxDetail=historyResult.getGetTaxResult().getTaxLines().getTaxLine(0).getTaxDetails().getTaxDetail(i);

                if (taxDetail.getStateAssignedNo() != null && taxDetail.getStateAssignedNo().trim().length() > 0)
                {
                    //Assert.assertEquals("1800", taxDetail.getStateAssignedNo());
                    isStateAssignedNo = true;
                }

            }
        }
        if (!isStateAssignedNo)
        {
            Assert.fail("Failed to fetch State Assigned No for the given address");
        }
    }

    private GetTaxHistoryResult waitForTaxHistory(GetTaxHistoryRequest getTaxHistoryRequest, Calendar timestamp)
            throws RemoteException
    {
        GetTaxHistoryResult result = null;

        int retryCount = 0;
        do
        {
            result = port.getTaxHistory(getTaxHistoryRequest);
            if (result.getResultCode() != SeverityLevel.Error ||
                (result.getMessages() != null && result.getMessages().getMessage(0).getName().equals("DocumentNotFoundError")))
            {
                break;
            }
            try
            {
                Thread.sleep(1000);
            }
            catch (InterruptedException ex)
            {
                // Ignore
            }
            ++retryCount;
        } while (retryCount <= 10);

        return result;
    }


    private void compareHistory(GetTaxRequest taxRequest, GetTaxResult taxResult, GetTaxHistoryResult history)
    {
        GetTaxRequest historyRequest = history.getGetTaxRequest();
        GetTaxResult historyResult = history.getGetTaxResult();


        Assert.assertEquals(taxRequest.getCompanyCode(), historyRequest.getCompanyCode());
        assertBigDecimalEquals(taxRequest.getDiscount(), historyRequest.getDiscount());
        Assert.assertEquals(taxRequest.getDocCode(), historyRequest.getDocCode());
        compareDate(taxRequest.getDocDate(), historyRequest.getDocDate());
        Assert.assertEquals(taxRequest.getDocType(), historyRequest.getDocType());
        assertStringEquals(taxRequest.getExemptionNo(), historyRequest.getExemptionNo());
        Assert.assertEquals(taxRequest.getCustomerCode(), historyRequest.getCustomerCode());
        assertStringEquals(taxRequest.getCustomerUsageType(), historyRequest.getCustomerUsageType());
        assertBigDecimalEquals(taxRequest.getExchangeRate(), historyRequest.getExchangeRate());
        compareDate(taxRequest.getExchangeRateEffDate(), historyRequest.getExchangeRateEffDate());

        //Assert.assertEquals(taxResult.getDocId(), historyResult.getDocId());
        Assert.assertEquals(taxResult.getDocCode(), historyResult.getDocCode());
        Assert.assertEquals(taxResult.getDocDate(), historyResult.getDocDate());
        Assert.assertEquals(taxResult.getDocType(), historyResult.getDocType());
        Assert.assertEquals(taxResult.getDocStatus(), historyResult.getDocStatus());
        Assert.assertEquals(taxResult.getTimestamp().getTime().toString(), historyResult.getTimestamp().getTime().toString());
        Assert.assertEquals(taxResult.getTotalAmount(), historyResult.getTotalAmount());
        Assert.assertEquals(taxResult.getTotalTaxable(), historyResult.getTotalTaxable());
        Assert.assertEquals(taxResult.getTotalTax(), historyResult.getTotalTax());
        Assert.assertEquals(taxResult.getTotalTaxCalculated(), historyResult.getTotalTaxCalculated());

        Assert.assertEquals(taxRequest.getLines().getLine().length, historyRequest.getLines().getLine().length);
        for (int i = 0; i < taxRequest.getLines().getLine().length; i++)
        {
            Line requestLine = taxRequest.getLines().getLine(i);

            Line historyLine = historyRequest.getLines().getLine(requestLine.getNo());

            Assert.assertNotNull(historyLine);
            Assert.assertEquals(requestLine.getNo(), historyLine.getNo());
            Assert.assertEquals(requestLine.getAmount(), historyLine.getAmount());
            assertStringEquals(requestLine.getItemCode(), historyLine.getItemCode());
        }

        //TaxResult.TaxSummary
        for (int i = 0; i < taxResult.getTaxSummary().getTaxDetail().length; i++)
        {
            TaxDetail resultTaxDetail = taxResult.getTaxSummary().getTaxDetail(i);

            TaxDetail historyResultTaxDetail = findTaxDetail(resultTaxDetail.getJurisType(), resultTaxDetail.getJurisCode(), historyResult.getTaxSummary().getTaxDetail());
            Assert.assertNotNull(historyResultTaxDetail);

            Assert.assertEquals(resultTaxDetail.getCountry(), historyResultTaxDetail.getCountry());
            Assert.assertEquals(resultTaxDetail.getRegion(), historyResultTaxDetail.getRegion());
            Assert.assertEquals(resultTaxDetail.getJurisType(), historyResultTaxDetail.getJurisType());
            Assert.assertEquals(resultTaxDetail.getJurisCode(), historyResultTaxDetail.getJurisCode());
            Assert.assertEquals(resultTaxDetail.getTaxType(), historyResultTaxDetail.getTaxType());
            Assert.assertEquals(resultTaxDetail.getBase(), historyResultTaxDetail.getBase());
            Assert.assertEquals(resultTaxDetail.getTaxable(), historyResultTaxDetail.getTaxable());
            Assert.assertEquals(resultTaxDetail.getRate(), historyResultTaxDetail.getRate());
            Assert.assertEquals(resultTaxDetail.getTax(), historyResultTaxDetail.getTax());
            Assert.assertEquals(resultTaxDetail.getTaxCalculated(), historyResultTaxDetail.getTaxCalculated());
            Assert.assertEquals(resultTaxDetail.getNonTaxable(), historyResultTaxDetail.getNonTaxable());
            Assert.assertEquals(resultTaxDetail.getExemption(), historyResultTaxDetail.getExemption());
            Assert.assertEquals(resultTaxDetail.getJurisName(), historyResultTaxDetail.getJurisName());
            Assert.assertEquals(resultTaxDetail.getTaxName(), historyResultTaxDetail.getTaxName());
            Assert.assertEquals(resultTaxDetail.getTaxAuthorityType(), historyResultTaxDetail.getTaxAuthorityType());
            Assert.assertEquals(resultTaxDetail.getTaxGroup(), historyResultTaxDetail.getTaxGroup());

        }

        //GetTaxResult.TaxLine
        Assert.assertEquals(taxResult.getTaxLines().getTaxLine().length, historyResult.getTaxLines().getTaxLine().length);
        for (int i = 0; i < taxResult.getTaxLines().getTaxLine().length; i++)
        {

            TaxLine resultLine = taxResult.getTaxLines().getTaxLine(i);

            TaxLine historyResultLine = historyResult.getTaxLines().getTaxLine(resultLine.getNo());
            Assert.assertNotNull(historyResultLine);

            Assert.assertEquals(resultLine.getNo(), historyResultLine.getNo());
            Assert.assertEquals(resultLine.getTaxable(), historyResultLine.getTaxable());
            Assert.assertEquals(resultLine.getRate(), historyResultLine.getRate());
            Assert.assertEquals(resultLine.getTax(), historyResultLine.getTax());
            Assert.assertEquals(resultLine.getTaxCode(), historyResultLine.getTaxCode());
            Assert.assertEquals(resultLine.getTaxCalculated(), historyResultLine.getTaxCalculated());
            Assert.assertEquals(resultLine.getReportingDate(), historyResultLine.getReportingDate());
            Assert.assertEquals(resultLine.getAccountingMethod(), historyResultLine.getAccountingMethod());

            // TODO: Addresses

            // Line details
            Assert.assertEquals(resultLine.getTaxDetails().getTaxDetail().length, historyResultLine.getTaxDetails().getTaxDetail().length);
            for (int j = 0; j < resultLine.getTaxDetails().getTaxDetail().length; j++)
            {
                TaxDetail resultDetail = resultLine.getTaxDetails().getTaxDetail(j);

                TaxDetail historyDetail = findTaxDetail(resultDetail.getJurisType(), resultDetail.getJurisCode(), historyResultLine.getTaxDetails().getTaxDetail());
                Assert.assertNotNull(historyDetail);

                Assert.assertEquals(resultDetail.getTaxType(), historyDetail.getTaxType());
                Assert.assertEquals(resultDetail.getBase(), historyDetail.getBase());
                Assert.assertEquals(resultDetail.getJurisCode(), historyDetail.getJurisCode());
                Assert.assertEquals(resultDetail.getJurisType(), historyDetail.getJurisType());
                Assert.assertEquals(resultDetail.getRate(), historyDetail.getRate());
                Assert.assertEquals(resultDetail.getTax(), historyDetail.getTax());
            }
        }
    }

    private TaxDetail findTaxDetail(JurisdictionType jurisdictionType, String jurisdictionCode, TaxDetail[] taxDetails)
        {
            TaxDetail match = null;

            for (int i=0;i<taxDetails.length;i++)
            {
                 TaxDetail detail = taxDetails[i];
                if (detail.getJurisType().equals(jurisdictionType) && detail.getJurisCode().equals(jurisdictionCode))
                {
                    match = detail;
                    break;
                }
            }

            return match;
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

    //
    // Private methods
    //
    private GetTaxRequest CreateTaxRequest(String docCode)
    {
        return CreateTaxRequest(docCode, 1);
    }

    private GetTaxRequest CreateTaxRequestForTaxOverride(String docCode)
    {
        GetTaxRequest request = new GetTaxRequest();

        request.setCompanyCode("DEFAULT");
        request.setDocCode(docCode);
        request.setDocType(DocumentType.SalesInvoice);
        request.setDocDate(new Date());
        //request.setExemptionNo("");
        request.setCustomerCode("TaxSvcTest");
        //request.setPurchaserType("");
        request.setSalespersonCode("");
        request.setOriginCode("Origin");
        request.setDestinationCode("Dest");
        request.setDetailLevel(DetailLevel.Tax);

        ArrayOfBaseAddress addresses = new ArrayOfBaseAddress(2);
        BaseAddress origin = new BaseAddress();
        origin.setAddressCode("Origin");
        origin.setCity("Denver");
        origin.setRegion("CO");
        origin.setPostalCode("80216-1022");
        origin.setCountry("USA");
        addresses.add(origin);

        BaseAddress destination = new BaseAddress();
        destination.setAddressCode("Dest");
        destination.setLine1("11051 S Parker Rd");
        destination.setCity("Parker");
        destination.setRegion("CO");
        destination.setPostalCode("80134-7441");
        destination.setCountry("USA");
        addresses.add(destination);

        request.setAddresses(addresses);
        int lineCount = 1;
        ArrayOfLine lines = new ArrayOfLine(lineCount);
        Line line;

        line = new Line();
        int lineNo = 1;
        line.setNo(Integer.toString(lineNo));
        line.setQty(new BigDecimal(1));
        line.setAmount(new BigDecimal(1000));        
        lines.add(line);

        
        
        TaxOverride taxOverride = new TaxOverride();
        taxOverride.setTaxOverrideType(TaxOverrideType.TaxAmount);
        taxOverride.setTaxAmount(new BigDecimal(5));
        taxOverride.setTaxDate(new Date());
        taxOverride.setReason("Return");

        line.setTaxOverride(taxOverride);

        request.setExchangeRate(new BigDecimal(1));
        request.setExchangeRateEffDate(request.getDocDate());
        request.setPaymentDate(new Date());
        request.setLines(lines);

        return request;
    }
      // Function for Test Tax Override Type
      private GetTaxRequest CreateTaxRequestForTaxOverrideType(String docCode)
      {
          GetTaxRequest request = new GetTaxRequest();

          request.setCompanyCode("DEFAULT");
          request.setDocCode(docCode);
          request.setDocType(DocumentType.PurchaseOrder);
          request.setDocDate(new Date());
          request.setCustomerCode("TaxSvcTest");
          request.setSalespersonCode("");
          request.setOriginCode("Origin");
          request.setDestinationCode("Dest");
          request.setDetailLevel(DetailLevel.Tax);

          ArrayOfBaseAddress addresses = new ArrayOfBaseAddress(2);
          BaseAddress origin = new BaseAddress();
          origin.setAddressCode("Origin");
          origin.setCity("Denver");
          origin.setRegion("CO");
          origin.setPostalCode("80216-1022");
          origin.setCountry("USA");
          addresses.add(origin);

          BaseAddress destination = new BaseAddress();
          destination.setAddressCode("Dest");
          destination.setLine1("11051 S Parker Rd");
          destination.setCity("Parker");
          destination.setRegion("CO");
          destination.setPostalCode("80134-7441");
          destination.setCountry("USA");
          addresses.add(destination);

          request.setAddresses(addresses);
          int lineCount = 1;
          ArrayOfLine lines = new ArrayOfLine(lineCount);
          Line line;

          line = new Line();
          int lineNo = 1;
          line.setNo(Integer.toString(lineNo));
          line.setQty(new BigDecimal(1));
          line.setAmount(new BigDecimal(0));
          lines.add(line);

          TaxOverride taxOverride = new TaxOverride();
          taxOverride.setTaxOverrideType(TaxOverrideType.AccruedTaxAmount);
          taxOverride.setTaxAmount(new BigDecimal(21.1));
          taxOverride.setTaxDate(new Date());
          taxOverride.setReason("Accrued");
          request.setCurrencyCode("USD");
          request.setServiceMode(ServiceMode.Automatic);
          line.setTaxOverride(taxOverride);

          request.setPaymentDate(new Date());
          request.setLines(lines);

          return request;
      }

    // Function for Document Type
    private GetTaxRequest CreateTaxRequestDocType(DocumentType docType)
    {
        return CreateTaxRequestDocType(docType, 1);
    }
      private GetTaxRequest CreateTaxRequestDocType(DocumentType docType, int lineCount)
      {
          GetTaxRequest request = new GetTaxRequest();

          request.setCompanyCode("DEFAULT");
          request.setDocCode("DocTypeTest");
          request.setDocType(docType);
          request.setDocDate(new Date());
          request.setCustomerCode("TaxSvcTest");
          request.setSalespersonCode("");
          request.setOriginCode("Origin");
          request.setDestinationCode("Dest");
          request.setDetailLevel(DetailLevel.Tax);

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

          request.setAddresses(addresses);

          ArrayOfLine lines = new ArrayOfLine(lineCount+1);
          Line line;

          int baseLineNo = 1000;

          for (int ii = 0; ii < lineCount; ii++)
          {
              line = new Line();
              int lineNo = baseLineNo + ii + 1;
              line.setNo(Integer.toString(lineNo));
              line.setItemCode("Item001");
              line.setQty(new BigDecimal(1));
              line.setAmount(new BigDecimal(1000.00));
              lines.add(line);
          }

          line = new Line();
          int lineNo = baseLineNo + lineCount + 1;
          line.setNo(Integer.toString(lineNo));
          line.setItemCode("FR");
          line.setQty(new BigDecimal(1));
          line.setAmount(new BigDecimal(10.00));
          lines.add(line);

          request.setLines(lines);

          request.setPaymentDate(new Date());

          return request;
      }

    private GetTaxRequest CreateTaxRequest(String docCode, int lineCount)
    {
        GetTaxRequest request = new GetTaxRequest();

        request.setCompanyCode("DEFAULT");
        request.setDocCode(docCode);
        request.setDocType(DocumentType.SalesInvoice);
        request.setDocDate(new Date());
        //request.setExemptionNo("");
        request.setCustomerCode("TaxSvcTest");
        //request.setPurchaserType("");
        request.setSalespersonCode("");
        request.setOriginCode("Origin");
        request.setDestinationCode("Dest");
        request.setDetailLevel(DetailLevel.Tax);

        //Added for Taxsvc2
        ArrayOfAddressLocationType addressLocationType = new ArrayOfAddressLocationType();        
        AddressLocationType shipto = new AddressLocationType();
        shipto.setAddressCode("Origin");
        shipto.setLocationTypeCode(LocationType.ShipTo);
        addressLocationType.add(shipto);
        AddressLocationType shipfrom = new AddressLocationType();
        shipfrom.setAddressCode("Dest");
        shipfrom.setLocationTypeCode(LocationType.ShipFrom);
        addressLocationType.add(shipfrom);
        request.setAddressLocationTypes(addressLocationType);

        request.setIsSellerImporterOfRecord(true);			
        request.setBRBuyerType(BRBuyerTypeEnum.BUS);		
        request.setBRBuyer_IsExemptOrCannotWH_IRRF(true);	
        request.setBRBuyer_IsExemptOrCannotWH_PISRF(true);	
        request.setBRBuyer_IsExemptOrCannotWH_COFINSRF(true);
        request.setBRBuyer_IsExemptOrCannotWH_CSLLRF(true);	
        request.setBRBuyer_IsExempt_PIS(true);	
        request.setBRBuyer_IsExempt_COFINS(true);
        request.setBRBuyer_IsExempt_CSLL(true);	
        request.setDescription("Description");	
        request.setEmail("Email");
        //Taxsvc2 ends

        request.setExchangeRate(new BigDecimal(1.5));
        request.setExchangeRateEffDate(new Date("1/1/2008"));

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

        request.setAddresses(addresses);

        ArrayOfLine lines = new ArrayOfLine(lineCount+1);
        Line line;

        int baseLineNo = 1000;

        for (int ii = 0; ii < lineCount; ii++)
        {
            line = new Line();
            int lineNo = baseLineNo + ii + 1;
            line.setNo(Integer.toString(lineNo));
            line.setItemCode("Item001");
            line.setQty(new BigDecimal(1));
            line.setAmount(new BigDecimal(1000.00));
			
            //Added for Taxsvc2
            Map<String, String> bagParameters = new HashMap<String, String>();
			bagParameters.put("LC", "100");
			line.setParameterBagItems(bagParameters);
            lines.add(line);
        
        }

        line = new Line();
        int lineNo = baseLineNo + lineCount + 1;
        line.setNo(Integer.toString(lineNo));
        line.setItemCode("FR");
        line.setQty(new BigDecimal(1));
        line.setAmount(new BigDecimal(10.00));
        lines.add(line);

        request.setLines(lines);

         request.setPaymentDate(new Date());

        return request;
    }

    private GetTaxRequest CreateTaxRequestForBINo(String bino) {

        GetTaxRequest request = new GetTaxRequest();

        request.setCompanyCode("DEFAULT");
        request.setDocCode("DocTypeTest");
        request.setBusinessIdentificationNo(bino);
        request.setDocDate(new Date());
        request.setCustomerCode("TaxSvcTest");
        request.setSalespersonCode("");
        request.setOriginCode("Origin");
        request.setDestinationCode("Dest");
        request.setDocType(DocumentType.SalesInvoice);
        request.setDetailLevel(DetailLevel.Tax);

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

        request.setAddresses(addresses);

        ArrayOfLine lines = new ArrayOfLine(1);
        Line line;

        line = new Line();
        line.setNo("1");
        line.setItemCode("Item001");
        line.setBusinessIdentificationNo("LL123");
        line.setQty(new BigDecimal(1));
        line.setAmount(new BigDecimal(1010.00));
        lines.add(line);

        request.setLines(lines);

        request.setPaymentDate(new Date());

        return request;
    }
    
    /**
     * Creates the TaxRequest by providing Lat Long info to the address.
     * @param docCode
     * @return GetTaxRequest
     */
    private GetTaxRequest CreateTaxRequestWithLatLong(String docCode)
    {
        int lineCount =1;
        GetTaxRequest request = new GetTaxRequest();

        request.setCompanyCode("DEFAULT");
        request.setDocCode(docCode);
        request.setDocType(DocumentType.SalesInvoice);
        request.setDocDate(new Date());
        request.setCustomerCode("TaxSvcTest");
        request.setSalespersonCode("");
        request.setOriginCode("Origin");
        request.setDestinationCode("Dest");
        request.setDetailLevel(DetailLevel.Tax);

        request.setExchangeRate(new BigDecimal(1.0));
        request.setExchangeRateEffDate(new Date());

        ArrayOfBaseAddress addresses = new ArrayOfBaseAddress(2);
        BaseAddress origin = new BaseAddress();
        origin.setLongitude("-122.510359");
        origin.setLatitude("47.624972");
        origin.setAddressCode("Origin");
        origin.setCountry("USA");
        addresses.add(origin);

        BaseAddress destination = new BaseAddress();
        destination.setLongitude("-122.5362");
        destination.setLatitude("47.6411");
        destination.setCountry("USA");
        addresses.add(destination);

        request.setAddresses(addresses);

        ArrayOfLine lines = new ArrayOfLine(lineCount+1);
        Line line;

        int baseLineNo = 1000;

        for (int ii = 0; ii < lineCount; ii++)
        {
            line = new Line();
            int lineNo = baseLineNo + ii + 1;
            line.setNo(Integer.toString(lineNo));
            line.setItemCode("20000");
            line.setQty(new BigDecimal(1));
            line.setAmount(new BigDecimal(10.00));
            lines.add(line);
        }

        line = new Line();
        int lineNo = baseLineNo + lineCount + 1;
        line.setNo(Integer.toString(lineNo));
        line.setItemCode("FR");
        line.setQty(new BigDecimal(1));
        line.setAmount(new BigDecimal(5.00));
        lines.add(line);

        request.setLines(lines);

        request.setPaymentDate(new Date());

        return request;
    }

    //This function is used to Test the 4.12 changes
    //This will add few more parameters which addresses 4.12
    private GetTaxRequest CreateTaxRequestReloaded(String docCode, int lineCount)
    {
        GetTaxRequest request = new GetTaxRequest();

        request.setCompanyCode("DEFAULT");
        request.setDocCode(docCode);
        request.setDocType(DocumentType.SalesInvoice);
        request.setDocDate(new Date());
        //request.setExemptionNo("");
        request.setCustomerCode("TaxSvcTest");
        //request.setPurchaserType("");
        request.setSalespersonCode("");
        request.setOriginCode("Origin");
        request.setDestinationCode("Dest");
        request.setDetailLevel(DetailLevel.Document);
        //added in 4.12 release
        request.setLocationCode("Test LocationCode");

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

        request.setAddresses(addresses);

        ArrayOfLine lines = new ArrayOfLine(lineCount+1);
        Line line;

        int baseLineNo = 1000;

        for (int ii = 0; ii < lineCount; ii++)
        {
            line = new Line();
            int lineNo = baseLineNo + ii + 1;
            line.setNo(Integer.toString(lineNo));
            line.setItemCode("Item001");
            line.setQty(new BigDecimal(1));
            line.setAmount(new BigDecimal(1000.00));
            //added in 4.12 release
            line.setCustomerUsageType("G");
            line.setDescription("Sample Description");
            lines.add(line);
        }

        line = new Line();
        int lineNo = baseLineNo + lineCount + 1;
        line.setNo(Integer.toString(lineNo));
        line.setItemCode("FR");
        line.setQty(new BigDecimal(1));
        line.setAmount(new BigDecimal(10.00));
        lines.add(line);

        request.setLines(lines);

        return request;
    }

    /**
     * Asserts equality of strings, treating null as an empty string.
     * @param s1
     * @param s2
     */
    private void assertStringEquals(String s1, String s2)
    {
        if (s1 == null)
        {
            s1 = "";
        }
        if (s2 == null)
        {
            s2 = "";
        }
        Assert.assertEquals(s1, s2);
    }

    private void assertBigDecimalEquals(BigDecimal d1, BigDecimal d2)
    {
        if (d1 == null)
        {
            d1 = new BigDecimal(0);
        }
        if (d2 == null)
        {
            d2 = new BigDecimal(0);
        }
        Assert.assertEquals(d1.stripTrailingZeros(), d2.stripTrailingZeros());
    }


}