package testCases;

import java.io.IOException;
import java.text.ParseException;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.google.gson.JsonObject;

import automationEngine.ApplicationSetup;
import businesslogic.ProcessTrustBL;
import businesslogic.ProcessedTrustBL;
import utilities.CommonUtilities;
import utilities.ExtentReportBuilder;
import utilities.JsonReader;

public class ProcessedTrustTC   extends ApplicationSetup {

	public ProcessedTrustTC() {
		// TODO Auto-generated constructor stub
	}

	

	ProcessedTrustBL objProcdTrustBL=new ProcessedTrustBL();
	CommonUtilities objCU = new CommonUtilities();
	JsonObject jsonObj = new JsonObject();
	JsonReader jsR = new JsonReader();

	@SuppressWarnings("deprecation")
	@Test(groups = { "Smoke", "Regression" })
	@Parameters({"browser"})
	public void TC_01_NavigationTC(String browser) throws NullPointerException, ParseException, IOException {
		ExtentReportBuilder.ReportInitialization("Process trust navigation TC" + " - " + browser);

		try {
			objCU.browserTCcounter(browser);

			objProcdTrustBL.navigationProcessedTrust(driver);



			ExtentReportBuilder.ReportTestStep("Console Messages:  ","Pass",""+objCU.printTheConsoleMessage());
			ExtentReportBuilder.ReportTestStep("User is able to navigate to Processed Trust tab TC" + Thread.currentThread().getStackTrace()[2].getMethodName(),
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
	public void TC_02_VerifyTrustListByDate(String browser) throws NullPointerException, ParseException, IOException {
		ExtentReportBuilder.ReportInitialization("Applying run date filter displays available processed trusts TC" + " - " + browser);

		try {
			objCU.browserTCcounter(browser);

			objProcdTrustBL.verifytrustprocessedbydate(driver);




			ExtentReportBuilder.ReportTestStep("Console Messages:  ","Pass",""+objCU.printTheConsoleMessage());
			ExtentReportBuilder.ReportTestStep("Applying Date filter to processed trust listing is passed" + Thread.currentThread().getStackTrace()[2].getMethodName(),
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
	public void TC_03_VerifyTrustListBydateandallcorporate(String browser) throws NullPointerException, ParseException, IOException {
		ExtentReportBuilder.ReportInitialization("Applying run date and slect all corporate filter displays available processed trusts TC" + " - " + browser);

		try {
			objCU.browserTCcounter(browser);

			objProcdTrustBL.verifytrustprocessedbydateandallcorporate(driver);




			ExtentReportBuilder.ReportTestStep("Console Messages:  ","Pass",""+objCU.printTheConsoleMessage());
			ExtentReportBuilder.ReportTestStep("Applying Date filter and select all corporate to processed trust listing is passed" + Thread.currentThread().getStackTrace()[2].getMethodName(),
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
	public void TC_04_VerifyTrustListBydateandallparent(String browser) throws NullPointerException, ParseException, IOException {
		ExtentReportBuilder.ReportInitialization("Applying run date And select all parent filter displays available processed trusts TC" + " - " + browser);

		try {
			objCU.browserTCcounter(browser);

			objProcdTrustBL.verifytrustprocessedbydateandallParent(driver);




			ExtentReportBuilder.ReportTestStep("Console Messages:  ","Pass",""+objCU.printTheConsoleMessage());
			ExtentReportBuilder.ReportTestStep("Applying Date filter and select all parent to processed trust listing is passed" + Thread.currentThread().getStackTrace()[2].getMethodName(),
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
	public void TC_05_VerifyTrustListBydateandallClient(String browser) throws NullPointerException, ParseException, IOException {
		ExtentReportBuilder.ReportInitialization("Applying run date And select all Client filter displays available processed trusts TC" + " - " + browser);

		try {
			objCU.browserTCcounter(browser);

			objProcdTrustBL.verifytrustprocessedbydateandallClient(driver);




			ExtentReportBuilder.ReportTestStep("Console Messages:  ","Pass",""+objCU.printTheConsoleMessage());
			ExtentReportBuilder.ReportTestStep("Applying Date filter and select all Client to processed trust listing is passed" + Thread.currentThread().getStackTrace()[2].getMethodName(),
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
	public void TC_06_VerifyTrustListBydateandallExportType(String browser) throws NullPointerException, ParseException, IOException {
		ExtentReportBuilder.ReportInitialization("Applying run date And select all Export Type filter displays available processed trusts TC" + " - " + browser);

		try {
			objCU.browserTCcounter(browser);

			objProcdTrustBL.verifytrustprocessedbydateandallExportType(driver);




			ExtentReportBuilder.ReportTestStep("Console Messages:  ","Pass",""+objCU.printTheConsoleMessage());
			ExtentReportBuilder.ReportTestStep("Applying Date filter and select all export type to processed trust listing is passed" + Thread.currentThread().getStackTrace()[2].getMethodName(),
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
	public void TC_07_VerifyTrustListBydateandallTrustReceiptMethod(String browser) throws NullPointerException, ParseException, IOException {
		ExtentReportBuilder.ReportInitialization("Applying run date And select all trust receipt method filter displays available processed trusts TC" + " - " + browser);

		try {
			objCU.browserTCcounter(browser);

			objProcdTrustBL.verifytrustprocessedbydateandallTrustReceiptMethod(driver);




			ExtentReportBuilder.ReportTestStep("Console Messages:  ","Pass",""+objCU.printTheConsoleMessage());
			ExtentReportBuilder.ReportTestStep("Applying Date filter and select all trust receipt method to processed trust listing is passed" + Thread.currentThread().getStackTrace()[2].getMethodName(),
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
	public void TC_08_VerifyTrustListBydateandallACH_CH(String browser) throws NullPointerException, ParseException, IOException {
		ExtentReportBuilder.ReportInitialization("Applying run date And select all ACH/CH using filter displays available processed trusts TC" + " - " + browser);

		try {
			objCU.browserTCcounter(browser);

			objProcdTrustBL.verifytrustprocessedbydateandallACH_CH(driver);

			ExtentReportBuilder.ReportTestStep("Console Messages:  ","Pass",""+objCU.printTheConsoleMessage());
			ExtentReportBuilder.ReportTestStep("Applying Date filter and select all ACH/CH options to processed trust listing is passed" + Thread.currentThread().getStackTrace()[2].getMethodName(),
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
	public void TC_09_VerifyTrustListBydateandallTrustFreq(String browser) throws NullPointerException, ParseException, IOException {
		ExtentReportBuilder.ReportInitialization("Applying run date And select all Option Trust frequency using filter displays available processed trusts TC" + " - " + browser);

		try {
			objCU.browserTCcounter(browser);

			objProcdTrustBL.verifytrustprocessedbydateandallTrustFreq(driver);

			ExtentReportBuilder.ReportTestStep("Console Messages:  ","Pass",""+objCU.printTheConsoleMessage());
			ExtentReportBuilder.ReportTestStep("Applying Date filter and select all Option Trust frequency to processed trust listing is passed" + Thread.currentThread().getStackTrace()[2].getMethodName(),
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
	public void TC_10_VerifyTrustListBydateandallG_L_Code(String browser) throws NullPointerException, ParseException, IOException {
		ExtentReportBuilder.ReportInitialization("Applying run date And select all Option from G/L Code using filter displays available processed trusts TC" + " - " + browser);

		try {
			objCU.browserTCcounter(browser);

			objProcdTrustBL.verifytrustprocessedbydateandallG_L_Code(driver);

			ExtentReportBuilder.ReportTestStep("Console Messages:  ","Pass",""+objCU.printTheConsoleMessage());
			ExtentReportBuilder.ReportTestStep("Applying Date filter and select all Option from G/L Code to processed trust listing is passed" + Thread.currentThread().getStackTrace()[2].getMethodName(),
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
	public void TC_11_VerifyTrustListBydateandallERPReport(String browser) throws NullPointerException, ParseException, IOException {
		ExtentReportBuilder.ReportInitialization("Applying run date And select all Option ERP Export reports using filter displays available processed trusts TC" + " - " + browser);

		try {
			objCU.browserTCcounter(browser);

			objProcdTrustBL.verifytrustprocessedbydateandallERPReport(driver);

			ExtentReportBuilder.ReportTestStep("Console Messages:  ","Pass",""+objCU.printTheConsoleMessage());
			ExtentReportBuilder.ReportTestStep("Applying Date filter and select all Option ERP Export reports to processed trust listing is passed" + Thread.currentThread().getStackTrace()[2].getMethodName(),
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
	public void TC_12_VerifyTrustListBydateandallPublishStatus(String browser) throws NullPointerException, ParseException, IOException {
		ExtentReportBuilder.ReportInitialization("Applying run date And select all Option Publish Status using filter displays available processed trusts TC" + " - " + browser);

		try {
			objCU.browserTCcounter(browser);

			objProcdTrustBL.verifytrustprocessedbydateandallPublishStatus(driver);

			ExtentReportBuilder.ReportTestStep("Console Messages:  ","Pass",""+objCU.printTheConsoleMessage());
			ExtentReportBuilder.ReportTestStep("Applying Date filter and select all Option Publish Status to processed trust listing is passed" + Thread.currentThread().getStackTrace()[2].getMethodName(),
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
