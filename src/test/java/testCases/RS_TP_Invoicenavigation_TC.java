package testCases;

import java.io.IOException;
import java.text.ParseException;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.google.gson.JsonObject;

import automationEngine.ApplicationSetup;
import businesslogic.RS_TP_Invoicenavigation_BL;
import businesslogic.RS_TP_OpenTrustNavigation_BL;
import utilities.CommonUtilities;
import utilities.ExtentReportBuilder;
import utilities.JsonReader;

public class RS_TP_Invoicenavigation_TC extends ApplicationSetup{

	public RS_TP_Invoicenavigation_TC() {
		// TODO Auto-generated constructor stub
	}
	RS_TP_Invoicenavigation_BL objInvoiceBL=new RS_TP_Invoicenavigation_BL();
	CommonUtilities objCU = new CommonUtilities();
	JsonObject jsonObj = new JsonObject();
	JsonReader jsR = new JsonReader();
	
	@SuppressWarnings("deprecation")
	@Test(groups = { "Smoke", "Regression" })
	@Parameters({"browser"})
	public void TC_01_InvoiceNavigationTC(String browser) throws NullPointerException, ParseException, IOException {
		ExtentReportBuilder.ReportInitialization("Verify Navigation to the New \"Invoices\" Screen And Bydefault the screen is openedTC" + " - " + browser);

		try {
			objCU.browserTCcounter(browser);

			objInvoiceBL.navigationInvoiceTab(driver);



			ExtentReportBuilder.ReportTestStep("Console Messages:  ","Pass",""+objCU.printTheConsoleMessage());
			ExtentReportBuilder.ReportTestStep("Verify Navigation to the New \"Invoices\" Screen and bydefault screen is opened TC is passed" + Thread.currentThread().getStackTrace()[2].getMethodName(),
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
	public void TC_02_VerifySinglePDFDownloadBtnTC(String browser) throws NullPointerException, ParseException, IOException {
		ExtentReportBuilder.ReportInitialization("Verify  User is able to click on single PDF download button in invoice tab TC" + " - " + browser);

		try {
			objCU.browserTCcounter(browser);

			objInvoiceBL.VerifySinglePDFDownloadBtn(driver);



			ExtentReportBuilder.ReportTestStep("Console Messages:  ","Pass",""+objCU.printTheConsoleMessage());
			ExtentReportBuilder.ReportTestStep("Verify  User is able to click on single PDF download button in invoice tab TC is passed" + Thread.currentThread().getStackTrace()[2].getMethodName(),
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
	public void TC_03_VerifyBothCIPDFDownloadBtnTC(String browser) throws NullPointerException, ParseException, IOException {
		ExtentReportBuilder.ReportInitialization("Verify User is able to click on both combined nad individual PDF download button in invoice tab TC" + " - " + browser);

		try {
			objCU.browserTCcounter(browser);

			objInvoiceBL.VerifyBothCIPDFDownloadBtn(driver);



			ExtentReportBuilder.ReportTestStep("Console Messages:  ","Pass",""+objCU.printTheConsoleMessage());
			ExtentReportBuilder.ReportTestStep("Verify User is able to click on both combined nad individual PDF download button in invoice tab TC is passed" + Thread.currentThread().getStackTrace()[2].getMethodName(),
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
	public void TC_04_VerifySingleBSPDFDownloadBtnTC(String browser) throws NullPointerException, ParseException, IOException {
		ExtentReportBuilder.ReportInitialization("Verify User is able to click on single PDF download button for Billing Summary in invoice tab TC" + " - " + browser);

		try {
			objCU.browserTCcounter(browser);

			objInvoiceBL.VerifySingleBSPDFDownloadBtn(driver);



			ExtentReportBuilder.ReportTestStep("Console Messages:  ","Pass",""+objCU.printTheConsoleMessage());
			ExtentReportBuilder.ReportTestStep("Verify User is able to click on single PDF download button for Billing Summary in invoice tab TC is passed" + Thread.currentThread().getStackTrace()[2].getMethodName(),
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
	public void TC_05_VerifyBothCIBSPDFDownloadBtnTC(String browser) throws NullPointerException, ParseException, IOException {
		ExtentReportBuilder.ReportInitialization("User is  able to see the report download Option Both Combined and individual PDF download button for Billing Summary TC" + " - " + browser);

		try {
			objCU.browserTCcounter(browser);	

			objInvoiceBL.VerifyBothCIBSPDFDownloadBtn(driver);



			ExtentReportBuilder.ReportTestStep("Console Messages:  ","Pass",""+objCU.printTheConsoleMessage());
			ExtentReportBuilder.ReportTestStep("User is  able to see the report download Option Both Combined and individual PDF download button for Billing SummaryTC is passed" + Thread.currentThread().getStackTrace()[2].getMethodName(),
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
	public void TC_06_VerifyPDFOnUIandDownloadPartInvoiceUTABTC(String browser) throws NullPointerException, ParseException, IOException {
		ExtentReportBuilder.ReportInitialization("User successfully able to navigate to invoice pdf report download button and after downloading report from process trust tab for unpublished trust TC" + " - " + browser);

		try {
			objCU.browserTCcounter(browser);
			objInvoiceBL.navigationInvoiceTab(driver);
			objInvoiceBL.VerifyPDFOnUIandDownloadPartInvoiceUTAB(driver);



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
	public void TC_07_VerifyPDFOnUIandDownloadPartInvoiceCombinedUTABTC(String browser) throws NullPointerException, ParseException, IOException {
		ExtentReportBuilder.ReportInitialization("User successfully able to navigate to invoice pdf report download button and after downloading report from invoice tab TC" + " - " + browser);

		try {
			objCU.browserTCcounter(browser);
			objInvoiceBL.navigationInvoiceTab(driver);
			objInvoiceBL.VerifyPDFOnUIandDownloadPartInvoiceCombinedUTAB(driver);



			ExtentReportBuilder.ReportTestStep("Console Messages:  ","Pass",""+objCU.printTheConsoleMessage());
			ExtentReportBuilder.ReportTestStep("User successfully able to navigate to invoice pdf report download button and after downloading report from invoice tab  TC is pasesed" + Thread.currentThread().getStackTrace()[2].getMethodName(),
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
