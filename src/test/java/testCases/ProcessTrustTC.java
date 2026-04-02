package testCases;

import java.io.IOException;
import java.text.ParseException;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.google.gson.JsonObject;

import automationEngine.ApplicationSetup;
import businesslogic.ProcessTrustBL;
import utilities.CommonUtilities;
import utilities.ExtentReportBuilder;
import utilities.JsonReader;

public class ProcessTrustTC extends ApplicationSetup {

	public ProcessTrustTC() {
		// TODO Auto-generated constructor stub
	}

	ProcessTrustBL objProcTrustBL=new ProcessTrustBL(null);
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

			objProcTrustBL.navigationProcessTrust(driver);



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
	public void TC_02_VerifyTrustListByDate(String browser) throws NullPointerException, ParseException, IOException {
		ExtentReportBuilder.ReportInitialization("Applying run date filter displays available open trusts TC" + " - " + browser);

		try {
			objCU.browserTCcounter(browser);

			objProcTrustBL.verifytrustopenbydate(driver);




			ExtentReportBuilder.ReportTestStep("Console Messages:  ","Pass",""+objCU.printTheConsoleMessage());
			ExtentReportBuilder.ReportTestStep("Applying Date filter to trust listing is passed" + Thread.currentThread().getStackTrace()[2].getMethodName(),
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
	public void TC_03_VerifyFilterDateAndPaymenAllTC(String browser) throws NullPointerException, ParseException, IOException {
		ExtentReportBuilder.ReportInitialization("Applying run date & payment type as select all filter displays available trusts TC" + " - " + browser);

		try {
			objCU.browserTCcounter(browser);

			objProcTrustBL.verifyfilterdateandpaymentall(driver);



			ExtentReportBuilder.ReportTestStep("Console Messages:  ","Pass",""+objCU.printTheConsoleMessage());
			ExtentReportBuilder.ReportTestStep("Applying filter of reun date and payment type to process trust is passed" + Thread.currentThread().getStackTrace()[2].getMethodName(),
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
	public void TC_04_VerifyFilterDateAndGroupTrustAllTC(String browser) throws NullPointerException, ParseException, IOException {
		ExtentReportBuilder.ReportInitialization("Applying run date & Trust Group Type as select all filter displays available trusts TC" + " - " + browser);

		try {
			objCU.browserTCcounter(browser);

			objProcTrustBL.verifyfilterdateandtrustgroupall(driver);



			ExtentReportBuilder.ReportTestStep("Console Messages:  ","Pass",""+objCU.printTheConsoleMessage());
			ExtentReportBuilder.ReportTestStep("Applying filter of run date and Group trust type to process trust is passed" + Thread.currentThread().getStackTrace()[2].getMethodName(),
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
	public void TC_05_VerifyFilterDateTransFreqAllTC(String browser) throws NullPointerException, ParseException, IOException {
		ExtentReportBuilder.ReportInitialization("Applying run date & Transaction type select all filter displays available trusts TC" + " - " + browser);

		try {
			objCU.browserTCcounter(browser);

			objProcTrustBL.verifyfilterdateandtransactionfreqall(driver);



			ExtentReportBuilder.ReportTestStep("Console Messages:  ","Pass",""+objCU.printTheConsoleMessage());
			ExtentReportBuilder.ReportTestStep("Applying filter of run date while Selecting all transaction type and trust frequency to process trust is passed" + Thread.currentThread().getStackTrace()[2].getMethodName(),
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
	public void TC_06_VerifyfilterdateandtrustformulaglcodeAllTC(String browser) throws NullPointerException, ParseException, IOException {
		ExtentReportBuilder.ReportInitialization("Applying run date & trust formula,G/L code select all filter displays available trusts TC" + " - " + browser);

		try {
			objCU.browserTCcounter(browser);

			objProcTrustBL.verifyfilterdateandtrustformulaglcodeall(driver);



			ExtentReportBuilder.ReportTestStep("Console Messages:  ","Pass",""+objCU.printTheConsoleMessage());
			ExtentReportBuilder.ReportTestStep("Applying filter of run date while Selecting all trust formula & G/L code to process trust is passed" + Thread.currentThread().getStackTrace()[2].getMethodName(),
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
	public void TC_07_verifyfilterdateandcorporateclientnameallTC(String browser) throws NullPointerException, ParseException, IOException {
		ExtentReportBuilder.ReportInitialization("Applying run date, corporate name and client name select all filter displays available trusts TC" + " - " + browser);

		try {
			objCU.browserTCcounter(browser);

			objProcTrustBL.verifyfilterdateandcorporateclientnameall(driver);



			ExtentReportBuilder.ReportTestStep("Console Messages:  ","Pass",""+objCU.printTheConsoleMessage());
			ExtentReportBuilder.ReportTestStep("Applying filter of run date while Selecting all from corporate name and client name to process trust is passed" + Thread.currentThread().getStackTrace()[2].getMethodName(),
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
	public void TC_08_VerifySearchoptionUsingExceldataTC(String browser) throws NullPointerException, ParseException, IOException {
		ExtentReportBuilder.ReportInitialization("Fetching data from excel and try to operate search functionality in Open trust tabTC" + " - " + browser);

		try {
			objCU.browserTCcounter(browser);

			objProcTrustBL.verifysearchoptionbyexceldata(driver);

			//		objProcTrustBL.VrfySrchFnctnltyUsngExcelFlw2(driver);

			ExtentReportBuilder.ReportTestStep("Console Messages:  ","Pass",""+objCU.printTheConsoleMessage());
			ExtentReportBuilder.ReportTestStep("User able to use search functionality is passed" + Thread.currentThread().getStackTrace()[2].getMethodName(),
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

//	@SuppressWarnings("deprecation")
//	@Test(groups = { "Smoke", "Regression" })
//	@Parameters({"browser"})
//	public void TC_09_verifyexelreportdownloadptTC(String browser) throws NullPointerException, ParseException, IOException {
//		ExtentReportBuilder.ReportInitialization("User is able to search the data for given date and able to download excel report for single client TC" + " - " + browser);
//
//		try {
//			objCU.browserTCcounter(browser);
//
//			objProcTrustBL.verifyexelreportdownloadpt(driver);
//
//			//		objProcTrustBL.VrfySrchFnctnltyUsngExcelFlw2(driver);
//
//			ExtentReportBuilder.ReportTestStep("Console Messages:  ","Pass",""+objCU.printTheConsoleMessage());
//			ExtentReportBuilder.ReportTestStep("User able to download the excel report is passed" + Thread.currentThread().getStackTrace()[2].getMethodName(),
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
//	}
//
//	@SuppressWarnings("deprecation")
//	@Test(groups = { "Smoke", "Regression" })
//	@Parameters({"browser"})
//	public void TC_10_verifypdfreportdownloadptTC(String browser) throws NullPointerException, ParseException, IOException {
//		ExtentReportBuilder.ReportInitialization("User is able to search the data for given date and able to download PDF report for single client TC" + " - " + browser);
//
//		try {
//			objCU.browserTCcounter(browser);
//
//			objProcTrustBL.verifypdfreportdownloadpt(driver);
//
//			//		objProcTrustBL.VrfySrchFnctnltyUsngExcelFlw2(driver);
//
//			ExtentReportBuilder.ReportTestStep("Console Messages:  ","Pass",""+objCU.printTheConsoleMessage());
//			ExtentReportBuilder.ReportTestStep("User able to download the pdf report is passed" + Thread.currentThread().getStackTrace()[2].getMethodName(),
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
//	}
//
//
//	@SuppressWarnings("deprecation")
//	@Test(groups = { "Smoke", "Regression" })
//	@Parameters({"browser"})
//	public void TC_11_verifyCombinedreportdownloadptTC(String browser) throws NullPointerException, ParseException, IOException {
//		ExtentReportBuilder.ReportInitialization("User is able to search the data for given date and able to download combined PDF report for single client TC" + " - " + browser);
//
//		try {
//			objCU.browserTCcounter(browser);
//
//			objProcTrustBL.verifycombinedreportdownloadpt(driver);
//
//			//		objProcTrustBL.VrfySrchFnctnltyUsngExcelFlw2(driver);
//
//			ExtentReportBuilder.ReportTestStep("Console Messages:  ","Pass",""+objCU.printTheConsoleMessage());
//			ExtentReportBuilder.ReportTestStep("User able to download the combined report is passed" + Thread.currentThread().getStackTrace()[2].getMethodName(),
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
//	}
	
	@SuppressWarnings("deprecation")
	@Test(groups = { "Smoke", "Regression" })
	@Parameters({"browser"})
	public void TC_12_withoutrundateViewTC(String browser) throws NullPointerException, ParseException, IOException {
		ExtentReportBuilder.ReportInitialization("Without selecting any date, click on View Button TC" + " - " + browser);

		try {
			objCU.browserTCcounter(browser);

			objProcTrustBL.withoutrundateView(driver);

			ExtentReportBuilder.ReportTestStep("Console Messages:  ","Pass",""+objCU.printTheConsoleMessage());
			ExtentReportBuilder.ReportTestStep("User able to click on view button with getting exception is passed" + Thread.currentThread().getStackTrace()[2].getMethodName(),
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
	public void TC_13_withoutrundateRunTrustTC(String browser) throws NullPointerException, ParseException, IOException {
		ExtentReportBuilder.ReportInitialization("Without selecting any option,Click on Run Trust process TC" + " - " + browser);

		try {
			objCU.browserTCcounter(browser);

			objProcTrustBL.withoutrundateRunTrust(driver);

			ExtentReportBuilder.ReportTestStep("Console Messages:  ","Pass",""+objCU.printTheConsoleMessage());
			ExtentReportBuilder.ReportTestStep("User able to click on Run Trust Process button with getting exception is passed" + Thread.currentThread().getStackTrace()[2].getMethodName(),
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
	public void TC_14_NorecordsScenario_1TC(String browser) throws NullPointerException, ParseException, IOException {
		ExtentReportBuilder.ReportInitialization("Fetching data from excel and try to operate search functionality in Open trust tabTC" + " - " + browser);

		try {
			objCU.browserTCcounter(browser);

			objProcTrustBL.NorecordsScenario_1(driver);

			ExtentReportBuilder.ReportTestStep("Console Messages:  ","Pass",""+objCU.printTheConsoleMessage());
			ExtentReportBuilder.ReportTestStep("User able to use the filter options having no records is passed" + Thread.currentThread().getStackTrace()[2].getMethodName(),
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
	public void TC_15_NorecordsScenario_2TC(String browser) throws NullPointerException, ParseException, IOException {
		ExtentReportBuilder.ReportInitialization("User is able to filter the option that are containing no records TC" + " - " + browser);

		try {
			objCU.browserTCcounter(browser);

			objProcTrustBL.NorecordsScenario_2(driver);

			ExtentReportBuilder.ReportTestStep("Console Messages:  ","Pass",""+objCU.printTheConsoleMessage());
			ExtentReportBuilder.ReportTestStep("User able to use the search functionality having no records is passed" + Thread.currentThread().getStackTrace()[2].getMethodName(),
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
