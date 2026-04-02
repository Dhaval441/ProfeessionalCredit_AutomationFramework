package testCases;

import java.io.IOException;
import java.text.ParseException;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.google.gson.JsonObject;

import automationEngine.ApplicationSetup;
import businesslogic.RS_TP_OpenTrustNavigation_BL;
import businesslogic.RS_TP_ProcessedTrustNavigation_BL;
import utilities.CommonUtilities;
import utilities.ExtentReportBuilder;
import utilities.JsonReader;

public class RS_TP_ProcessedTrustNavigation_TC extends ApplicationSetup{

	public RS_TP_ProcessedTrustNavigation_TC() {
		// TODO Auto-generated constructor stub
	}
	RS_TP_ProcessedTrustNavigation_BL objProcTrustBL=new RS_TP_ProcessedTrustNavigation_BL();
	CommonUtilities objCU = new CommonUtilities();
	JsonObject jsonObj = new JsonObject();
	JsonReader jsR = new JsonReader();
	
	@SuppressWarnings("deprecation")
	@Test(groups = { "Smoke", "Regression" })
	@Parameters({"browser"})
	public void TC_01_NavigationProcesstrustTC(String browser) throws NullPointerException, ParseException, IOException {
		ExtentReportBuilder.ReportInitialization("Processed trust navigation TC" + " - " + browser);

		try {
			objCU.browserTCcounter(browser);

			objProcTrustBL.navigationProcessedTrust(driver);



			ExtentReportBuilder.ReportTestStep("Console Messages:  ","Pass",""+objCU.printTheConsoleMessage());
			ExtentReportBuilder.ReportTestStep("User is able to navigate to Process Trust tab TC" + Thread.currentThread().getStackTrace()[2].getMethodName(),
					"PASS", objCU.generateRandomNumericString());
			ExtentReportBuilder.CompleteTest();
		}catch(Exception e)
		{
			Thread thread = new Thread();
			thread.interrupt();
			log.info(e.getMessage());
			ExtentReportBuilder.ReportTestStep("Error in " + Thread.currentThread().getStackTrace()[2].getMethodName(),
					"ERROR", objCU.generateRandomNumericString());
			ExtentReportBuilder.CompleteTest();
			Assert.fail();
		}
	}
	@SuppressWarnings("deprecation")
	@Test(groups = { "Smoke", "Regression" })
	@Parameters({"browser"})
	public void TC_02_verifyExceReportPTDownloadTC(String browser) throws NullPointerException, ParseException, IOException {
		ExtentReportBuilder.ReportInitialization("User is successfully able to see report excel download button on processed trust tab TC" + " - " + browser);

		try {
			objCU.browserTCcounter(browser);

			objProcTrustBL.verifyExceReportPTDownload(driver);



			ExtentReportBuilder.ReportTestStep("Console Messages:  ","Pass",""+objCU.printTheConsoleMessage());
			ExtentReportBuilder.ReportTestStep("User is successfully able to see report excel download button on processed trust tab TC is pasesed" + Thread.currentThread().getStackTrace()[2].getMethodName(),
					"PASS", objCU.generateRandomNumericString());
			ExtentReportBuilder.CompleteTest();
		}catch(Exception e)
		{
			Thread thread = new Thread();
			thread.interrupt();
			log.info(e.getMessage());
			ExtentReportBuilder.ReportTestStep("Error in " + Thread.currentThread().getStackTrace()[2].getMethodName(),
					"ERROR", objCU.generateRandomNumericString());
			ExtentReportBuilder.CompleteTest();
			Assert.fail();
		}
	}
	@SuppressWarnings("deprecation")
	@Test(groups = { "Smoke", "Regression" })
	@Parameters({"browser"})
	public void TC_03_verifyPDFReportPTDownloadTC(String browser) throws NullPointerException, ParseException, IOException {
		ExtentReportBuilder.ReportInitialization("User is successfully able to see report in PDF button and collection Activity reports TC" + " - " + browser);

		try {
			objCU.browserTCcounter(browser);

			objProcTrustBL.verifyPDFReportPTDownload(driver);



			ExtentReportBuilder.ReportTestStep("Console Messages:  ","Pass",""+objCU.printTheConsoleMessage());
			ExtentReportBuilder.ReportTestStep("User is successfully able to see report in PDF button and collection Activity reports TC is pasesed" + Thread.currentThread().getStackTrace()[2].getMethodName(),
					"PASS", objCU.generateRandomNumericString());
			ExtentReportBuilder.CompleteTest();
		}catch(Exception e)
		{
			Thread thread = new Thread();
			thread.interrupt();
			log.info(e.getMessage());
			ExtentReportBuilder.ReportTestStep("Error in " + Thread.currentThread().getStackTrace()[2].getMethodName(),
					"ERROR", objCU.generateRandomNumericString());
			ExtentReportBuilder.CompleteTest();
			Assert.fail();
		}
	}
	@SuppressWarnings("deprecation")
	@Test(groups = { "Smoke", "Regression" })
	@Parameters({"browser"})
	public void TC_04_verifyinvoiceReportPTDownloadTC(String browser) throws NullPointerException, ParseException, IOException {
		ExtentReportBuilder.ReportInitialization("User is successfully able to see report in invoice as well as Combined and indivisual Invoice buttons TC" + " - " + browser);

		try {
			objCU.browserTCcounter(browser);

			objProcTrustBL.verifyinvoiceReportPTDownload(driver);



			ExtentReportBuilder.ReportTestStep("Console Messages:  ","Pass",""+objCU.printTheConsoleMessage());
			ExtentReportBuilder.ReportTestStep("User is successfully able to see report in invoice as well as Combined and indivisual Invoice buttons TC is pasesed" + Thread.currentThread().getStackTrace()[2].getMethodName(),
					"PASS", objCU.generateRandomNumericString());
			ExtentReportBuilder.CompleteTest();
		}catch(Exception e)
		{
			Thread thread = new Thread();
			thread.interrupt();
			log.info(e.getMessage());
			ExtentReportBuilder.ReportTestStep("Error in " + Thread.currentThread().getStackTrace()[2].getMethodName(),
					"ERROR", objCU.generateRandomNumericString());
			ExtentReportBuilder.CompleteTest();
			Assert.fail();
		}
	}
	
	@SuppressWarnings("deprecation")
	@Test(groups = { "Smoke", "Regression" })
	@Parameters({"browser"})
	public void TC_05_verifyERPReportPTDownloadTC(String browser) throws NullPointerException, ParseException, IOException {
		ExtentReportBuilder.ReportInitialization("User is successfully able to see ERP report on process trust tab TC" + " - " + browser);

		try {
			objCU.browserTCcounter(browser);

			objProcTrustBL.verifyERPReportPTDownload(driver);



			ExtentReportBuilder.ReportTestStep("Console Messages:  ","Pass",""+objCU.printTheConsoleMessage());
			ExtentReportBuilder.ReportTestStep("User is successfully able to see ERP report on process trust tab TC is pasesed" + Thread.currentThread().getStackTrace()[2].getMethodName(),
					"PASS", objCU.generateRandomNumericString());
			ExtentReportBuilder.CompleteTest();
		}catch(Exception e)
		{
			Thread thread = new Thread();
			thread.interrupt();
			log.info(e.getMessage());
			ExtentReportBuilder.ReportTestStep("Error in " + Thread.currentThread().getStackTrace()[2].getMethodName(),
					"ERROR", objCU.generateRandomNumericString());
			ExtentReportBuilder.CompleteTest();
			Assert.fail();
		}
	}
	

	@SuppressWarnings("deprecation")
	@Test(groups = { "Smoke", "Regression" })
	@Parameters({"browser"})
	public void TC_06_VerifyExcelOnUIandDownloadPartPTTC(String browser) throws NullPointerException, ParseException, IOException {
		ExtentReportBuilder.ReportInitialization("User successfully able to navigate to excel report download button and after downloading report from processtrust tab for published trust TC" + " - " + browser);

		try {
			objCU.browserTCcounter(browser);
			objProcTrustBL.navigationProcessedTrust(driver);
			objProcTrustBL.VerifyExcelOnUIandDownloadPartPT(driver);



			ExtentReportBuilder.ReportTestStep("Console Messages:  ","Pass",""+objCU.printTheConsoleMessage());
			ExtentReportBuilder.ReportTestStep("User successfully able to navigate to excel report download button and after downloading report from processtrust tab for published trust TC is pasesed" + Thread.currentThread().getStackTrace()[2].getMethodName(),
					"PASS", objCU.generateRandomNumericString());
			ExtentReportBuilder.CompleteTest();
		}catch(Exception e)
		{
			Thread thread = new Thread();
			thread.interrupt();
			log.info(e.getMessage());
			ExtentReportBuilder.ReportTestStep("Error in " + Thread.currentThread().getStackTrace()[2].getMethodName(),
					"ERROR", objCU.generateRandomNumericString());
			ExtentReportBuilder.CompleteTest();
			Assert.fail();
		}
	}
	@SuppressWarnings("deprecation")
	@Test(groups = { "Smoke", "Regression" })
	@Parameters({"browser"})
	public void TC_07_VerifyPDFOnUIandDownloadPartPTTC(String browser) throws NullPointerException, ParseException, IOException {
		ExtentReportBuilder.ReportInitialization("User successfully able to navigate to PDF report download button and after downloading report from processtrust tab for published trust TC" + " - " + browser);

		try {
			objCU.browserTCcounter(browser);
			objProcTrustBL.navigationProcessedTrust(driver);
			objProcTrustBL.VerifyPDFOnUIandDownloadPartPT(driver);



			ExtentReportBuilder.ReportTestStep("Console Messages:  ","Pass",""+objCU.printTheConsoleMessage());
			ExtentReportBuilder.ReportTestStep("User successfully able to navigate to PDF report download button and after downloading report from processtrust tab for published trust TC is pasesed" + Thread.currentThread().getStackTrace()[2].getMethodName(),
					"PASS", objCU.generateRandomNumericString());
			ExtentReportBuilder.CompleteTest();
		}catch(Exception e)
		{
			Thread thread = new Thread();
			thread.interrupt();
			log.info(e.getMessage());
			ExtentReportBuilder.ReportTestStep("Error in " + Thread.currentThread().getStackTrace()[2].getMethodName(),
					"ERROR", objCU.generateRandomNumericString());
			ExtentReportBuilder.CompleteTest();
			Assert.fail();
		}
	}
	
	@SuppressWarnings("deprecation")
	@Test(groups = { "Smoke", "Regression" })
	@Parameters({"browser"})
	public void TC_08_VerifyPDFOnUIandDownloadPartCollectionCombinedPTTC(String browser) throws NullPointerException, ParseException, IOException {
		ExtentReportBuilder.ReportInitialization("User successfully able to navigate to combined pdf report download button and after downloading report from process trust tab for published trust TC" + " - " + browser);

		try {
			objCU.browserTCcounter(browser);
			objProcTrustBL.navigationProcessedTrust(driver);
			objProcTrustBL.VerifyPDFOnUIandDownloadPartCollectionCombinedPT(driver);



			ExtentReportBuilder.ReportTestStep("Console Messages:  ","Pass",""+objCU.printTheConsoleMessage());
			ExtentReportBuilder.ReportTestStep("User successfully able to navigate to combined pdf report download button and after downloading report from process trust tab for published trust TC is pasesed" + Thread.currentThread().getStackTrace()[2].getMethodName(),
					"PASS", objCU.generateRandomNumericString());
			ExtentReportBuilder.CompleteTest();
		}catch(Exception e)
		{
			Thread thread = new Thread();
			thread.interrupt();
			log.info(e.getMessage());
			ExtentReportBuilder.ReportTestStep("Error in " + Thread.currentThread().getStackTrace()[2].getMethodName(),
					"ERROR", objCU.generateRandomNumericString());
			ExtentReportBuilder.CompleteTest();
			Assert.fail();
		}
	}
	
	@SuppressWarnings("deprecation")
	@Test(groups = { "Smoke", "Regression" })
	@Parameters({"browser"})
	public void TC_09_VerifyPDFOnUIandDownloadPartCollectionIndivisualPTTC(String browser) throws NullPointerException, ParseException, IOException {
		ExtentReportBuilder.ReportInitialization("User successfully able to navigate to indivisual pdf report download button and after downloading report from process trust tab for published trust TC" + " - " + browser);

		try {
			objCU.browserTCcounter(browser);
			objProcTrustBL.navigationProcessedTrust(driver);
			objProcTrustBL.VerifyPDFOnUIandDownloadPartCollectionIndivisaulPT(driver);



			ExtentReportBuilder.ReportTestStep("Console Messages:  ","Pass",""+objCU.printTheConsoleMessage());
			ExtentReportBuilder.ReportTestStep("User successfully able to navigate to indivisual pdf report download button and after downloading report from process trust tab for published trust TC is pasesed" + Thread.currentThread().getStackTrace()[2].getMethodName(),
					"PASS", objCU.generateRandomNumericString());
			ExtentReportBuilder.CompleteTest();
		}catch(Exception e)
		{
			Thread thread = new Thread();
			thread.interrupt();
			log.info(e.getMessage());
			ExtentReportBuilder.ReportTestStep("Error in " + Thread.currentThread().getStackTrace()[2].getMethodName(),
					"ERROR", objCU.generateRandomNumericString());
			ExtentReportBuilder.CompleteTest();
			Assert.fail();
		}
	}
	
	@SuppressWarnings("deprecation")
	@Test(groups = { "Smoke", "Regression" })
	@Parameters({"browser"})
	public void TC_10_VerifyPDFOnUIandDownloadPartInvoicePTTC(String browser) throws NullPointerException, ParseException, IOException {
		ExtentReportBuilder.ReportInitialization("User successfully able to navigate to invoice pdf report download button and after downloading report from process trust tab for published trust TC" + " - " + browser);

		try {
			objCU.browserTCcounter(browser);
			objProcTrustBL.navigationProcessedTrust(driver);
			objProcTrustBL.VerifyPDFOnUIandDownloadPartInvoicePT(driver);



			ExtentReportBuilder.ReportTestStep("Console Messages:  ","Pass",""+objCU.printTheConsoleMessage());
			ExtentReportBuilder.ReportTestStep("User successfully able to navigate to invoice pdf report download button and after downloading report from process trust tab for published trust TC is pasesed" + Thread.currentThread().getStackTrace()[2].getMethodName(),
					"PASS", objCU.generateRandomNumericString());
			ExtentReportBuilder.CompleteTest();
		}catch(Exception e)
		{
			Thread thread = new Thread();
			thread.interrupt();
			log.info(e.getMessage());
			ExtentReportBuilder.ReportTestStep("Error in " + Thread.currentThread().getStackTrace()[2].getMethodName(),
					"ERROR", objCU.generateRandomNumericString());
			ExtentReportBuilder.CompleteTest();
			Assert.fail();
		}
	}
	
	@SuppressWarnings("deprecation")
	@Test(groups = { "Smoke", "Regression" })
	@Parameters({"browser"})
	public void TC_11_VerifyPDFOnUIandDownloadPartInvoiceCombinedPTTC(String browser) throws NullPointerException, ParseException, IOException {
		ExtentReportBuilder.ReportInitialization("User successfully able to navigate to invoice combined pdf report download button and after downloading report from process trust tab for published trust TC" + " - " + browser);

		try {
			objCU.browserTCcounter(browser);
			objProcTrustBL.navigationProcessedTrust(driver);
			objProcTrustBL.VerifyPDFOnUIandDownloadPartInvoiceCombinedPT(driver);



			ExtentReportBuilder.ReportTestStep("Console Messages:  ","Pass",""+objCU.printTheConsoleMessage());
			ExtentReportBuilder.ReportTestStep("User successfully able to navigate to invoice combined pdf report download button and after downloading report from process trust tab for published trust TC is pasesed" + Thread.currentThread().getStackTrace()[2].getMethodName(),
					"PASS", objCU.generateRandomNumericString());
			ExtentReportBuilder.CompleteTest();
		}catch(Exception e)
		{
			Thread thread = new Thread();
			thread.interrupt();
			log.info(e.getMessage());
			ExtentReportBuilder.ReportTestStep("Error in " + Thread.currentThread().getStackTrace()[2].getMethodName(),
					"ERROR", objCU.generateRandomNumericString());
			ExtentReportBuilder.CompleteTest();
			Assert.fail();
		}
	}
	
	@SuppressWarnings("deprecation")
	@Test(groups = { "Smoke", "Regression" })
	@Parameters({"browser"})
	public void TC_12_VerifyPDFOnUIandDownloadPartInvoiceIndivisaulPTTC(String browser) throws NullPointerException, ParseException, IOException {
		ExtentReportBuilder.ReportInitialization("User successfully able to navigate to invoice indivisual pdf report download button and after downloading report from process trust tab for published trust TC" + " - " + browser);

		try {
			objCU.browserTCcounter(browser);
			objProcTrustBL.navigationProcessedTrust(driver);
			objProcTrustBL.VerifyPDFOnUIandDownloadPartInvoiceIndivisaulPT(driver);



			ExtentReportBuilder.ReportTestStep("Console Messages:  ","Pass",""+objCU.printTheConsoleMessage());
			ExtentReportBuilder.ReportTestStep("User successfully able to navigate to invoice indivisual pdf report download button and after downloading report from process trust tab for published trust TC is pasesed" + Thread.currentThread().getStackTrace()[2].getMethodName(),
					"PASS", objCU.generateRandomNumericString());
			ExtentReportBuilder.CompleteTest();
		}catch(Exception e)
		{
			Thread thread = new Thread();
			thread.interrupt();
			log.info(e.getMessage());
			ExtentReportBuilder.ReportTestStep("Error in " + Thread.currentThread().getStackTrace()[2].getMethodName(),
					"ERROR", objCU.generateRandomNumericString());
			ExtentReportBuilder.CompleteTest();
			Assert.fail();
		}
	}
	
	//****for Unpublished trust
	
	@SuppressWarnings("deprecation")
	@Test(groups = { "Smoke", "Regression" })
	@Parameters({"browser"})
	public void TC_13_VerifyExcelOnUIandDownloadPartUPTTC(String browser) throws NullPointerException, ParseException, IOException {
		ExtentReportBuilder.ReportInitialization("User successfully able to navigate to excel report download button and after downloading report from unpublished processtrust tab for published trust TC" + " - " + browser);

		try {
			objCU.browserTCcounter(browser);
			objProcTrustBL.navigationProcessedTrust(driver);
			objProcTrustBL.VerifyExcelOnUIandDownloadPartUPT(driver);



			ExtentReportBuilder.ReportTestStep("Console Messages:  ","Pass",""+objCU.printTheConsoleMessage());
			ExtentReportBuilder.ReportTestStep("User successfully able to navigate to excel report download button and after downloading report from unpublished processtrust tab for published trust TC is pasesed" + Thread.currentThread().getStackTrace()[2].getMethodName(),
					"PASS", objCU.generateRandomNumericString());
			ExtentReportBuilder.CompleteTest();
		}catch(Exception e)
		{
			Thread thread = new Thread();
			thread.interrupt();
			log.info(e.getMessage());
			ExtentReportBuilder.ReportTestStep("Error in " + Thread.currentThread().getStackTrace()[2].getMethodName(),
					"ERROR", objCU.generateRandomNumericString());
			ExtentReportBuilder.CompleteTest();
			Assert.fail();
		}
	}
	@SuppressWarnings("deprecation")
	@Test(groups = { "Smoke", "Regression" })
	@Parameters({"browser"})
	public void TC_14_VerifyPDFOnUIandDownloadPartUPTTC(String browser) throws NullPointerException, ParseException, IOException {
		ExtentReportBuilder.ReportInitialization("User successfully able to navigate to PDF report download button and after downloading report from processtrust tab for Unpublished trust TC" + " - " + browser);

		try {
			objCU.browserTCcounter(browser);
			objProcTrustBL.navigationProcessedTrust(driver);
			objProcTrustBL.VerifyPDFOnUIandDownloadPartUPT(driver);



			ExtentReportBuilder.ReportTestStep("Console Messages:  ","Pass",""+objCU.printTheConsoleMessage());
			ExtentReportBuilder.ReportTestStep("User successfully able to navigate to PDF report download button and after downloading report from processtrust tab for Unpublished trust TC is pasesed" + Thread.currentThread().getStackTrace()[2].getMethodName(),
					"PASS", objCU.generateRandomNumericString());
			ExtentReportBuilder.CompleteTest();
		}catch(Exception e)
		{
			Thread thread = new Thread();
			thread.interrupt();
			log.info(e.getMessage());
			ExtentReportBuilder.ReportTestStep("Error in " + Thread.currentThread().getStackTrace()[2].getMethodName(),
					"ERROR", objCU.generateRandomNumericString());
			ExtentReportBuilder.CompleteTest();
			Assert.fail();
		}
	}
	
	@SuppressWarnings("deprecation")
	@Test(groups = { "Smoke", "Regression" })
	@Parameters({"browser"})
	public void TC_15_VerifyPDFOnUIandDownloadPartCollectionCombinedUPTTC(String browser) throws NullPointerException, ParseException, IOException {
		ExtentReportBuilder.ReportInitialization("User successfully able to navigate to combined pdf report download button and after downloading report from process trust tab for Unpublished trust TC" + " - " + browser);

		try {
			objCU.browserTCcounter(browser);
			objProcTrustBL.navigationProcessedTrust(driver);
			objProcTrustBL.VerifyPDFOnUIandDownloadPartCollectionCombinedUPT(driver);



			ExtentReportBuilder.ReportTestStep("Console Messages:  ","Pass",""+objCU.printTheConsoleMessage());
			ExtentReportBuilder.ReportTestStep("User successfully able to navigate to combined pdf report download button and after downloading report from process trust tab for Unpublished trust TC is pasesed" + Thread.currentThread().getStackTrace()[2].getMethodName(),
					"PASS", objCU.generateRandomNumericString());
			ExtentReportBuilder.CompleteTest();
		}catch(Exception e)
		{
			Thread thread = new Thread();
			thread.interrupt();
			log.info(e.getMessage());
			ExtentReportBuilder.ReportTestStep("Error in " + Thread.currentThread().getStackTrace()[2].getMethodName(),
					"ERROR", objCU.generateRandomNumericString());
			ExtentReportBuilder.CompleteTest();
			Assert.fail();
		}
	}
	
	@SuppressWarnings("deprecation")
	@Test(groups = { "Smoke", "Regression" })
	@Parameters({"browser"})
	public void TC_16_VerifyPDFOnUIandDownloadPartCollectionIndivisualUPTTC(String browser) throws NullPointerException, ParseException, IOException {
		ExtentReportBuilder.ReportInitialization("User successfully able to navigate to indivisual pdf report download button and after downloading report from process trust tab for Unpublished trust TC" + " - " + browser);

		try {
			objCU.browserTCcounter(browser);
			objProcTrustBL.navigationProcessedTrust(driver);
			objProcTrustBL.VerifyPDFOnUIandDownloadPartCollectionIndivisaulUPT(driver);



			ExtentReportBuilder.ReportTestStep("Console Messages:  ","Pass",""+objCU.printTheConsoleMessage());
			ExtentReportBuilder.ReportTestStep("User successfully able to navigate to indivisual pdf report download button and after downloading report from process trust tab for unpublished trust TC is pasesed" + Thread.currentThread().getStackTrace()[2].getMethodName(),
					"PASS", objCU.generateRandomNumericString());
			ExtentReportBuilder.CompleteTest();
		}catch(Exception e)
		{
			Thread thread = new Thread();
			thread.interrupt();
			log.info(e.getMessage());
			ExtentReportBuilder.ReportTestStep("Error in " + Thread.currentThread().getStackTrace()[2].getMethodName(),
					"ERROR", objCU.generateRandomNumericString());
			ExtentReportBuilder.CompleteTest();
			Assert.fail();
		}
	}
	
	@SuppressWarnings("deprecation")
	@Test(groups = { "Smoke", "Regression" })
	@Parameters({"browser"})
	public void TC_17_VerifyPDFOnUIandDownloadPartInvoiceUPTTC(String browser) throws NullPointerException, ParseException, IOException {
		ExtentReportBuilder.ReportInitialization("User successfully able to navigate to invoice pdf report download button and after downloading report from process trust tab for unpublished trust TC" + " - " + browser);

		try {
			objCU.browserTCcounter(browser);
			objProcTrustBL.navigationProcessedTrust(driver);
			objProcTrustBL.VerifyPDFOnUIandDownloadPartInvoiceUPT(driver);



			ExtentReportBuilder.ReportTestStep("Console Messages:  ","Pass",""+objCU.printTheConsoleMessage());
			ExtentReportBuilder.ReportTestStep("User successfully able to navigate to invoice pdf report download button and after downloading report from process trust tab for unpublished trust TC is pasesed" + Thread.currentThread().getStackTrace()[2].getMethodName(),
					"PASS", objCU.generateRandomNumericString());
			ExtentReportBuilder.CompleteTest();
		}catch(Exception e)
		{
			Thread thread = new Thread();
			thread.interrupt();
			log.info(e.getMessage());
			ExtentReportBuilder.ReportTestStep("Error in " + Thread.currentThread().getStackTrace()[2].getMethodName(),
					"ERROR", objCU.generateRandomNumericString());
			ExtentReportBuilder.CompleteTest();
			Assert.fail();
		}
	}
	
	@SuppressWarnings("deprecation")
	@Test(groups = { "Smoke", "Regression" })
	@Parameters({"browser"})
	public void TC_18_VerifyPDFOnUIandDownloadPartInvoiceCombinedUPTTC(String browser) throws NullPointerException, ParseException, IOException {
		ExtentReportBuilder.ReportInitialization("User successfully able to navigate to invoice combined pdf report download button and after downloading report from process trust tab for Unpublished trust TC" + " - " + browser);

		try {
			objCU.browserTCcounter(browser);
			objProcTrustBL.navigationProcessedTrust(driver);
			objProcTrustBL.VerifyPDFOnUIandDownloadPartInvoiceCombinedUPT(driver);



			ExtentReportBuilder.ReportTestStep("Console Messages:  ","Pass",""+objCU.printTheConsoleMessage());
			ExtentReportBuilder.ReportTestStep("User successfully able to navigate to invoice combined pdf report download button and after downloading report from process trust tab for Umpublished trust TC is pasesed" + Thread.currentThread().getStackTrace()[2].getMethodName(),
					"PASS", objCU.generateRandomNumericString());
			ExtentReportBuilder.CompleteTest();
		}catch(Exception e)
		{
			Thread thread = new Thread();
			thread.interrupt();
			log.info(e.getMessage());
			ExtentReportBuilder.ReportTestStep("Error in " + Thread.currentThread().getStackTrace()[2].getMethodName(),
					"ERROR", objCU.generateRandomNumericString());
			ExtentReportBuilder.CompleteTest();
			Assert.fail();
		}
	}
	
	@SuppressWarnings("deprecation")
	@Test(groups = { "Smoke", "Regression" })
	@Parameters({"browser"})
	public void TC_19_VerifyPDFOnUIandDownloadPartInvoiceIndivisaulUPTTC(String browser) throws NullPointerException, ParseException, IOException {
		ExtentReportBuilder.ReportInitialization("User successfully able to navigate to invoice indivisual pdf report download button and after downloading report from process trust tab for unpublished trust TC" + " - " + browser);

		try {
			objCU.browserTCcounter(browser);
			objProcTrustBL.navigationProcessedTrust(driver);
			objProcTrustBL.VerifyPDFOnUIandDownloadPartInvoiceIndivisaulUPT(driver);



			ExtentReportBuilder.ReportTestStep("Console Messages:  ","Pass",""+objCU.printTheConsoleMessage());
			ExtentReportBuilder.ReportTestStep("User successfully able to navigate to invoice indivisual pdf report download button and after downloading report from process trust tab for unpublished trust TC is pasesed" + Thread.currentThread().getStackTrace()[2].getMethodName(),
					"PASS", objCU.generateRandomNumericString());
			ExtentReportBuilder.CompleteTest();
		}catch(Exception e)
		{
			Thread thread = new Thread();
			thread.interrupt();
			log.info(e.getMessage());
			ExtentReportBuilder.ReportTestStep("Error in " + Thread.currentThread().getStackTrace()[2].getMethodName(),
					"ERROR", objCU.generateRandomNumericString());
			ExtentReportBuilder.CompleteTest();
			Assert.fail();
		}
	}
}
