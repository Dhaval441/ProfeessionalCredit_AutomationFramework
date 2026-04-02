package testCases;

import java.io.IOException;
import java.text.ParseException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.google.gson.JsonObject;

import automationEngine.ApplicationSetup;
import businesslogic.TP_20_BL;
import businesslogic.TP_29_BL;
import utilities.CommonUtilities;
import utilities.ExtentReportBuilder;
import utilities.JsonReader;

public class TP_29_TC extends ApplicationSetup{

	public TP_29_TC() {
		// TODO Auto-generated constructor stub
	}
	TP_29_BL objProcTrustBL=new TP_29_BL();
	CommonUtilities objCU = new CommonUtilities();
	JsonObject jsonObj = new JsonObject();
	JsonReader jsR = new JsonReader();
	
	/*
	 * 1.Verify Navigation to the New "Invoices" Screen
	 */
	/*
	 * 2.Verify that the “Invoices” tab is loaded by default
	 */
	@SuppressWarnings("deprecation")
	@Test(groups = { "Smoke", "Regression" })
	@Parameters({"browser"})
	public void TC_01_NavigationTC(String browser) throws NullPointerException, ParseException, IOException {
		ExtentReportBuilder.ReportInitialization("Verify Navigation to the New \"Invoices\" Screen And Bydefault the screen is openedTC" + " - " + browser);

		try {
			objCU.browserTCcounter(browser);

			objProcTrustBL.navigationInvoiceTab(driver);



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
	
	
	
	/*
	 * 3.Verify combined features from legacy tabs
	 */
	@SuppressWarnings("deprecation")
	@Test(groups = { "Smoke", "Regression" })
	@Parameters({"browser"})
	public void TC_03_VerifyInvoiceCombinedFeaturesTC(String browser) throws NullPointerException, ParseException, IOException {
		ExtentReportBuilder.ReportInitialization("Verify combined features from legacy tabs TC" + " - " + browser);

		try {
			objCU.browserTCcounter(browser);

			objProcTrustBL.VerifyInvoiceCombinedFeatures(driver);



			ExtentReportBuilder.ReportTestStep("Console Messages:  ","Pass",""+objCU.printTheConsoleMessage());
			ExtentReportBuilder.ReportTestStep("Verify combined features from legacy tabs TC is passed" + Thread.currentThread().getStackTrace()[2].getMethodName(),
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
	/*
	 * 4.Verify “Invoice Open” Functionality in the New Screen
	 */
	/*
	 * 5.Verify “Invoice Processed” Functionality in the New Screen
	 */
	@SuppressWarnings("deprecation")
	@Test(groups = { "Smoke", "Regression" })
	@Parameters({"browser"})
	public void TC_04_VerifyInvoiceOpenFunctionalityTC(String browser) throws NullPointerException, ParseException, IOException {
		ExtentReportBuilder.ReportInitialization("Verify “Invoice Open” Functionality in the New Screen TC" + " - " + browser);

		try {
			objCU.browserTCcounter(browser);

			objProcTrustBL.VerifyInvoiceOpenFunctionality(driver);



			ExtentReportBuilder.ReportTestStep("Console Messages:  ","Pass",""+objCU.printTheConsoleMessage());
			ExtentReportBuilder.ReportTestStep("Verify “Invoice Open” Functionality in the New Screen TC is passed" + Thread.currentThread().getStackTrace()[2].getMethodName(),
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
	
	
	/*
	 * 6.Verify “Receivables” Functionality in the New Screen
	 */
	@SuppressWarnings("deprecation")
	@Test(groups = { "Smoke", "Regression" })
	@Parameters({"browser"})
	public void TC_05_VerifyReceivablesFunctionalityTC(String browser) throws NullPointerException, ParseException, IOException {
		ExtentReportBuilder.ReportInitialization("Verify “Receivables” Functionality in the New Screen TC" + " - " + browser);

		try {
			objCU.browserTCcounter(browser);

			objProcTrustBL.VerifyReceivablesFunctionality(driver);



			ExtentReportBuilder.ReportTestStep("Console Messages:  ","Pass",""+objCU.printTheConsoleMessage());
			ExtentReportBuilder.ReportTestStep("Verify “Receivables” Functionality in the New Screen TC is passed" + Thread.currentThread().getStackTrace()[2].getMethodName(),
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
	/*
	 * 7.Verify “Reverse” Functionality in the New Screen
	 */
	@SuppressWarnings("deprecation")
	@Test(groups = { "Smoke", "Regression" })
	@Parameters({"browser"})
	public void TC_06_VerifyInvoiceReverseFunctionalityTC(String browser) throws NullPointerException, ParseException, IOException {
		ExtentReportBuilder.ReportInitialization("Verify “Receivables” Functionality in the New Screen TC" + " - " + browser);

		try {
			objCU.browserTCcounter(browser);

			objProcTrustBL.VerifyInvoiceReverseFunctionality(driver);



			ExtentReportBuilder.ReportTestStep("Console Messages:  ","Pass",""+objCU.printTheConsoleMessage());
			ExtentReportBuilder.ReportTestStep("Verify “Receivables” Functionality in the New Screen TC is passed" + Thread.currentThread().getStackTrace()[2].getMethodName(),
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
	/*
	 * 8.Verify UI consistency with the “Process Trust” screen
	 */
	@SuppressWarnings("deprecation")	
	@Test(groups = { "Smoke", "Regression" })
	@Parameters({"browser"})
	public void TC_07_VerifyUICompareOfInvoiceProcessTrustTC(String browser) throws NullPointerException, ParseException, IOException {
		ExtentReportBuilder.ReportInitialization("Verify UI consistency with the “Process Trust” screen TC" + " - " + browser);

		try {
			objCU.browserTCcounter(browser);

			objProcTrustBL.VerifyUICompareOfInvoiceProcessTrust(driver);



			ExtentReportBuilder.ReportTestStep("Console Messages:  ","Pass",""+objCU.printTheConsoleMessage());
			ExtentReportBuilder.ReportTestStep("Verify UI consistency with the “Process Trust” screen TC is passed" + Thread.currentThread().getStackTrace()[2].getMethodName(),
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
	/*
	 * 9. Verify All Filters and Actions in the New Screen
	 */
	@SuppressWarnings("deprecation")	
	@Test(groups = { "Smoke", "Regression" })
	@Parameters({"browser"})
	public void TC_08_VerifyInvoiceFiltersFunctionalityTC(String browser) throws NullPointerException, ParseException, IOException {
		ExtentReportBuilder.ReportInitialization("Verify All Filters and Actions in the New Screen TC" + " - " + browser);

		try {
			objCU.browserTCcounter(browser);

			objProcTrustBL.VerifyInvoiceFiltersFunctionality(driver);



			ExtentReportBuilder.ReportTestStep("Console Messages:  ","Pass",""+objCU.printTheConsoleMessage());
			ExtentReportBuilder.ReportTestStep("Verify All Filters and Actions in the New Screen TC is passed" + Thread.currentThread().getStackTrace()[2].getMethodName(),
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
	/*
	 * 10.Verify the Display of Columns in the Invoices Tab
	 */
	@SuppressWarnings("deprecation")	
	@Test(groups = { "Smoke", "Regression" })
	@Parameters({"browser"})
	public void TC_09_VerifyInvoiceNewColumnTC(String browser) throws NullPointerException, ParseException, IOException {
		ExtentReportBuilder.ReportInitialization("Verify the Display of Columns in the Invoices Tab TC" + " - " + browser);

		try {
			objCU.browserTCcounter(browser);

			objProcTrustBL.VerifyInvoiceNewColumn(driver);



			ExtentReportBuilder.ReportTestStep("Console Messages:  ","Pass",""+objCU.printTheConsoleMessage());
			ExtentReportBuilder.ReportTestStep("Verify the Display of Columns in the Invoices Tab TC is passed" + Thread.currentThread().getStackTrace()[2].getMethodName(),
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
	/*
	 * 11.Verify that the "Post" button is enabled for invoices with “Open” or “Partially Paid” status
	 */
	@SuppressWarnings("deprecation")	
	@Test(groups = { "Smoke", "Regression" })
	@Parameters({"browser"})
	public void TC_10_VerifyPostbuttonEnableTC(String browser) throws NullPointerException, ParseException, IOException {
		ExtentReportBuilder.ReportInitialization("Verify that the \"Post\" button is enabled for invoices with “Open” or “Partially Paid” status" + " - " + browser);

		try {
			objCU.browserTCcounter(browser);

			objProcTrustBL.VerifyPostButtonEnablePartiallyPaid(driver);
			objProcTrustBL.VerifyPostButtonEnableOpen(driver);


			ExtentReportBuilder.ReportTestStep("Console Messages:  ","Pass",""+objCU.printTheConsoleMessage());
			ExtentReportBuilder.ReportTestStep("Verify that the \"Post\" button is enabled for invoices with “Open” or “Partially Paid” status TC is passed" + Thread.currentThread().getStackTrace()[2].getMethodName(),
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
	/*
	 * 12.Verify that the "Post" button is disabled for statuses other than “Open” or “Partially Paid”
	 */
	@SuppressWarnings("deprecation")	
	@Test(groups = { "Smoke", "Regression" })
	@Parameters({"browser"})	
	public void TC_11_VerifyPostButtondisablePaidTC(String browser) throws NullPointerException, ParseException, IOException {
		ExtentReportBuilder.ReportInitialization("Verify that the \"Post\" button is disabled for statuses other than “Open” or “Partially Paid” TC" + " - " + browser);

		try {
			objCU.browserTCcounter(browser);

			objProcTrustBL.VerifyPostButtondisablePaid(driver);


			ExtentReportBuilder.ReportTestStep("Console Messages:  ","Pass",""+objCU.printTheConsoleMessage());
			ExtentReportBuilder.ReportTestStep("Verify that the \\\"Post\\\" button is disabled for statuses other than “Open” or “Partially Paid” TC is passed" + Thread.currentThread().getStackTrace()[2].getMethodName(),
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
	/*
	 * 13.Verify clicking the "Post" button triggers the expected behavior
	 */
	
	/*
	 *14.Verify that the “Reverse” button is enabled only for manual invoices 
	 */
//	@SuppressWarnings("deprecation")	
//	@Test(groups = { "Smoke", "Regression" })
//	@Parameters({"browser"})	
//	public void TC_12_VerifyReverseEnableFunctionalityTC(String browser) throws NullPointerException, ParseException, IOException {
//		ExtentReportBuilder.ReportInitialization("Verify that the “Reverse” button is enabled only for manual invoices TC" + " - " + browser);
//
//		try {
//			objCU.browserTCcounter(browser);
//
//			objProcTrustBL.VerifyReverseEnableFunctionality(driver);
//
//
//			ExtentReportBuilder.ReportTestStep("Console Messages:  ","Pass",""+objCU.printTheConsoleMessage());
//			ExtentReportBuilder.ReportTestStep("Verify that the “Reverse” button is enabled only for manual invoices tc is passed" + Thread.currentThread().getStackTrace()[2].getMethodName(),
//					"PASS", objCU.generateRandomNumericString());
//			ExtentReportBuilder.CompleteTest();
//		}catch(Exception e)
//		{
//			Thread thread = new Thread();
//			thread.interrupt();
//			log.info(e.getMessage());
//			ExtentReportBuilder.ReportTestStep("Error in " + Thread.currentThread().getStackTrace()[2].getMethodName(),
//					"ERROR", objCU.generateRandomNumericString());
//			ExtentReportBuilder.CompleteTest();
//			Assert.fail();
//		}
//
//
//	}
	/*
	 * 15.Verify that the “Reverse” button is disabled for previously reversed invoices
	 */
	
	/*
	 * 17.Verify that clicking the “Reverse” button updates the status to “Reversed”
	 */
	
	/*
	 * 18.Verify the presence of “Remit Type” and “Report” columns in the grid
	 */
	
	/*
	 * 20.Verify that the “Status” column size is adjusted to accommodate new columns
	 */
	

}
