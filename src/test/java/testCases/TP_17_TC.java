package testCases;

import java.io.IOException;
import java.text.ParseException;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.google.gson.JsonObject;

import automationEngine.ApplicationSetup;
import businesslogic.TP_16_BL;
import businesslogic.TP_17_BL;
import utilities.CommonUtilities;
import utilities.ExtentReportBuilder;
import utilities.JsonReader;

public class TP_17_TC extends ApplicationSetup{

	public TP_17_TC() {
		// TODO Auto-generated constructor stub
	}
	TP_17_BL objProcTrustBL=new TP_17_BL();
	CommonUtilities objCU = new CommonUtilities();
	JsonObject jsonObj = new JsonObject();
	JsonReader jsR = new JsonReader();
	
	@SuppressWarnings("deprecation")
	@Test(groups = { "Smoke", "Regression" })
	@Parameters({"browser"})
	public void TC_01_NavigationTC(String browser) throws NullPointerException, ParseException, IOException {
		ExtentReportBuilder.ReportInitialization("Processed trust navigation TC" + " - " + browser);

		try {
			objCU.browserTCcounter(browser);

			objProcTrustBL.navigationProcessedTrust(driver);



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
	/*
	 * Verify that the Trust Reverse tab is removed, and the Reverse Trust functionality is Available to the Trust Processed tab
	 */
	@SuppressWarnings("deprecation")
	@Test(groups = { "Smoke", "Regression" })
	@Parameters({"browser"})
	public void TC_02_ReverseTrsutButtonoAvailTC(String browser) throws NullPointerException, ParseException, IOException {
		ExtentReportBuilder.ReportInitialization("erify that the Trust Reverse tab is removed, and the Reverse Trust functionality is Available to the Trust Processed tab TC" + " - " + browser);

		try {
			objCU.browserTCcounter(browser);

			objProcTrustBL.verifytrustReverseButtonAvail(driver);



			ExtentReportBuilder.ReportTestStep("Console Messages:  ","Pass",""+objCU.printTheConsoleMessage());
			ExtentReportBuilder.ReportTestStep("erify that the Trust Reverse tab is removed, and the Reverse Trust functionality is Available to the Trust Processed tab TC is passed" + Thread.currentThread().getStackTrace()[2].getMethodName(),
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
	 * Verify that a toast alert is displayed when the Reverse Trust button is clicked without selecting any trusts on the Trust Processed tab
	 */
	@SuppressWarnings("deprecation")
	@Test(groups = { "Smoke", "Regression" })
	@Parameters({"browser"})
	public void TC_03_ReverseTrsutButtonoAvailTC(String browser) throws NullPointerException, ParseException, IOException {
		ExtentReportBuilder.ReportInitialization("Verify that a toast alert is displayed when the Reverse Trust button is clicked without selecting any trusts on the Trust Processed tab TC" + " - " + browser);

		try {
			objCU.browserTCcounter(browser);

			objProcTrustBL.verifytrustReverseButtonToastMsg(driver);



			ExtentReportBuilder.ReportTestStep("Console Messages:  ","Pass",""+objCU.printTheConsoleMessage());
			ExtentReportBuilder.ReportTestStep("Verify that a toast alert is displayed when the Reverse Trust button is clicked without selecting any trusts on the Trust Processed tab is passed" + Thread.currentThread().getStackTrace()[2].getMethodName(),
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
	 * Verify that multiple trusts can be reversed with confirmation on the Trust Processed tab, and only selected trusts are affected
	 */
}
