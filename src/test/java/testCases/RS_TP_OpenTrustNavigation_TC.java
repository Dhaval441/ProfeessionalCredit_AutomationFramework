package testCases;

import java.io.IOException;
import java.text.ParseException;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.google.gson.JsonObject;

import automationEngine.ApplicationSetup;

import businesslogic.RS_TP_OpenTrustNavigation_BL;
import businesslogic.TP_2_BL;
import utilities.CommonUtilities;
import utilities.ExtentReportBuilder;
import utilities.JsonReader;

public class RS_TP_OpenTrustNavigation_TC extends ApplicationSetup{

	public RS_TP_OpenTrustNavigation_TC() {
		// TODO Auto-generated constructor stub
	}
	RS_TP_OpenTrustNavigation_BL objProcTrustBL=new RS_TP_OpenTrustNavigation_BL();
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
	/*
	 * User is able to see the report download Option in excel format button
	 */
	@SuppressWarnings("deprecation")
	@Test(groups = { "Smoke", "Regression" })
	@Parameters({"browser"})
	public void TC_02_NavigationToExcelReportBtnTC(String browser) throws NullPointerException, ParseException, IOException {
		ExtentReportBuilder.ReportInitialization("User is able to see the report download Option in excel format button TC" + " - " + browser);

		try {
			objCU.browserTCcounter(browser);

			objProcTrustBL.VerifyExcelDownloadBtn(driver);



			ExtentReportBuilder.ReportTestStep("Console Messages:  ","Pass",""+objCU.printTheConsoleMessage());
			ExtentReportBuilder.ReportTestStep("User is able to see the report download Option in excel format button TC is passed" + Thread.currentThread().getStackTrace()[2].getMethodName(),
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
	 * User is able to see the report download Option in PDF format button
	 */
	@SuppressWarnings("deprecation")
	@Test(groups = { "Smoke", "Regression" })
	@Parameters({"browser"})
	public void TC_03_NavigationToPDFReportBtnTC(String browser) throws NullPointerException, ParseException, IOException {
		ExtentReportBuilder.ReportInitialization("User is able to see the report download Option in PDF format button TC" + " - " + browser);

		try {
			objCU.browserTCcounter(browser);

			objProcTrustBL.VerifyPDFDownloadBtn(driver);



			ExtentReportBuilder.ReportTestStep("Console Messages:  ","Pass",""+objCU.printTheConsoleMessage());
			ExtentReportBuilder.ReportTestStep("User is able to see the report download Option in PDF format button TC is passed" + Thread.currentThread().getStackTrace()[2].getMethodName(),
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
	 * User is able to see the report download Option in PDF format button
	 */
	@SuppressWarnings("deprecation")
	@Test(groups = { "Smoke", "Regression" })
	@Parameters({"browser"})
	public void TC_04_NavigationToCombinedPDFReportBtnTC(String browser) throws NullPointerException, ParseException, IOException {
		ExtentReportBuilder.ReportInitialization("User is able to see the report download Option in Combined PDF format button TC" + " - " + browser);

		try {
			objCU.browserTCcounter(browser);

			objProcTrustBL.VerifyCombinedPDFDownloadBtn(driver);



			ExtentReportBuilder.ReportTestStep("Console Messages:  ","Pass",""+objCU.printTheConsoleMessage());
			ExtentReportBuilder.ReportTestStep("User is able to see the report download Option in Combined PDF format button TC is passed" + Thread.currentThread().getStackTrace()[2].getMethodName(),
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
	*
	*TC_002. Preview report in Excel format and verify UI and report value
	*/
	@SuppressWarnings("deprecation")
	@Test(groups = { "Smoke", "Regression" })
	@Parameters({"browser"})
	public void TC_05_VerifyExcelOnUIandDownloadPartTC(String browser) throws NullPointerException, ParseException, IOException {
		ExtentReportBuilder.ReportInitialization("verify and Preview report in Excel format and verify UI and report value TC" + " - " + browser);

		try {
			objCU.browserTCcounter(browser);
			objProcTrustBL.navigationProcessTrust(driver);
			objProcTrustBL.VerifyExcelOnUIandDownloadPart(driver);


			ExtentReportBuilder.ReportTestStep("Console Messages:  ","Pass",""+objCU.printTheConsoleMessage());
			ExtentReportBuilder.ReportTestStep("verify and Preview report in Excel format and verify UI and report value TC is passed" + Thread.currentThread().getStackTrace()[2].getMethodName(),
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
	*
	*TC_003. Preview report in pdf format and verify UI and report value
	*/
	@SuppressWarnings("deprecation")
	@Test(groups = { "Smoke", "Regression" })
	@Parameters({"browser"})
	public void TC_06_VerifyPDFOnUIandDownloadPartTC(String browser) throws NullPointerException, ParseException, IOException {
		ExtentReportBuilder.ReportInitialization("verify and Preview report in PDF format and verify UI and report value TC" + " - " + browser);

		try {
			objCU.browserTCcounter(browser);
			objProcTrustBL.navigationProcessTrust(driver);
			objProcTrustBL.VerifyPDFOnUIandDownloadPart(driver);


			ExtentReportBuilder.ReportTestStep("Console Messages:  ","Pass",""+objCU.printTheConsoleMessage());
			ExtentReportBuilder.ReportTestStep("verify and Preview report in PDF format and verify UI and report value TC is passed" + Thread.currentThread().getStackTrace()[2].getMethodName(),
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
	public void TC_07_VerifyPDFZipOnUIandDownloadPartTC(String browser) throws NullPointerException, ParseException, IOException {
		ExtentReportBuilder.ReportInitialization("verify and Preview report in combined PDF format and verify UI and report value TC" + " - " + browser);

		try {
			objCU.browserTCcounter(browser);
			objProcTrustBL.navigationProcessTrust(driver);
			objProcTrustBL.VerifyPDFZipFileOnUIandDownloadPart(driver);


			ExtentReportBuilder.ReportTestStep("Console Messages:  ","Pass",""+objCU.printTheConsoleMessage());
			ExtentReportBuilder.ReportTestStep("verify and Preview report in Combined PDF format and verify UI and report value TC is passed" + Thread.currentThread().getStackTrace()[2].getMethodName(),
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
