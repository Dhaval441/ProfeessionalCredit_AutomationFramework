package testCases;

import java.io.IOException;
import java.text.ParseException;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.google.gson.JsonObject;

import automationEngine.ApplicationSetup;
import businesslogic.TP_10_BL;
import businesslogic.TP_3_BL;
import utilities.CommonUtilities;
import utilities.ExtentReportBuilder;
import utilities.JsonReader;

public class TP_10_TC extends ApplicationSetup{

	public TP_10_TC() {
		// TODO Auto-generated constructor stub
	}
	TP_10_BL objProcTrustBL=new TP_10_BL();
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
	 * Verify that the "Select ACH/CH" filter is removed from the Trust Open screen	 
	 */
	@SuppressWarnings("deprecation")
	@Test(groups = { "Smoke", "Regression" })
	@Parameters({"browser"})
	public void TC_02_verifyACH_ChfilterRemovedTC(String browser) throws NullPointerException, ParseException, IOException {
		ExtentReportBuilder.ReportInitialization("Verify that the Select ACH/CH filter is removed from the Trust Open screen" + " - " + browser);

		try {
			objCU.browserTCcounter(browser);

			objProcTrustBL.verifyACH_CHFIlterRemved(driver);

			//		objProcTrustBL.VrfySrchFnctnltyUsngExcelFlw2(driver);

			ExtentReportBuilder.ReportTestStep("Console Messages:  ","Pass",""+objCU.printTheConsoleMessage());
			ExtentReportBuilder.ReportTestStep("Verify that the Select ACH/CH filter is removed from the Trust Open screen is passed" + Thread.currentThread().getStackTrace()[2].getMethodName(),
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
	 *Verify that clicking on Advanced Filters displays additional filtering options in the Trust Open tab
	 */
	@SuppressWarnings("deprecation")
	@Test(groups = { "Smoke", "Regression" })
	@Parameters({"browser"})
	public void TC_03_verifyAdvancedFilterClickableTC(String browser) throws NullPointerException, ParseException, IOException {
		ExtentReportBuilder.ReportInitialization("Verify that clicking on Advanced Filters displays additional filtering options in the Trust Open tab" + " - " + browser);

		try {
			objCU.browserTCcounter(browser);

			objProcTrustBL.verifyAdvancedFilter(driver);

			//		objProcTrustBL.VrfySrchFnctnltyUsngExcelFlw2(driver);

			ExtentReportBuilder.ReportTestStep("Console Messages:  ","Pass",""+objCU.printTheConsoleMessage());
			ExtentReportBuilder.ReportTestStep("Verify that clicking on Advanced Filters displays additional filtering options in the Trust Open tab is passed" + Thread.currentThread().getStackTrace()[2].getMethodName(),
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
	 * Verify that the "Select Trust Formula" filter functions correctly in the Trust Open tab
	 */
	@SuppressWarnings("deprecation")
	@Test(groups = { "Smoke", "Regression" })
	@Parameters({"browser"})
	public void TC_04_verifyTrustFormulaOptionTC(String browser) throws NullPointerException, ParseException, IOException {
		ExtentReportBuilder.ReportInitialization("Verify that the Select Trust Formula filter functions correctly in the Trust Open tab" + " - " + browser);

		try {
			objCU.browserTCcounter(browser);

			objProcTrustBL.verifySelectTrsutFormulaFilter1(driver);
			objProcTrustBL.verifySelectTrsutFormulaFilter2(driver);
			objProcTrustBL.verifySelectTrsutFormulaFilter3(driver);

			//		objProcTrustBL.VrfySrchFnctnltyUsngExcelFlw2(driver);

			ExtentReportBuilder.ReportTestStep("Console Messages:  ","Pass",""+objCU.printTheConsoleMessage());
			ExtentReportBuilder.ReportTestStep("Verify that the Select Trust Formula filter functions correctly in the Trust Open tabis passed" + Thread.currentThread().getStackTrace()[2].getMethodName(),
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
	 * Verify that the "Select G/L Code" filter functions correctly in the Trust Open tab
	 */
	@SuppressWarnings("deprecation")
	@Test(groups = { "Smoke", "Regression" })
	@Parameters({"browser"})
	public void TC_05_verifyGLCodeOptionTC(String browser) throws NullPointerException, ParseException, IOException {
		ExtentReportBuilder.ReportInitialization(" Verify that the Select G/L Code filter functions correctly in the Trust Open tab" + " - " + browser);

		try {
			objCU.browserTCcounter(browser);

			objProcTrustBL.verifySelectGLCodefromOptions(driver);
		

			//		objProcTrustBL.VrfySrchFnctnltyUsngExcelFlw2(driver);

			ExtentReportBuilder.ReportTestStep("Console Messages:  ","Pass",""+objCU.printTheConsoleMessage());
			ExtentReportBuilder.ReportTestStep(" Verify that the Select G/L Code filter functions correctly in the Trust Open tab" + Thread.currentThread().getStackTrace()[2].getMethodName(),
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
//	/*
//	 * Verify that the "PaymentID" filter functions correctly in the Trust Open tab
//	 */
//	@SuppressWarnings("deprecation")
//	@Test(groups = { "Smoke", "Regression" })
//	@Parameters({"browser"})
//	public void TC_05_verifyPaymentIDFilterTC(String browser) throws NullPointerException, ParseException, IOException {
//		ExtentReportBuilder.ReportInitialization("Verify that the PaymentID filter functions correctly in the Trust Open tab" + " - " + browser);
//
//		try {
//			objCU.browserTCcounter(browser);	
//
//			objProcTrustBL.verifyPaymentIDFilter(driver);
//		
//
//			//		objProcTrustBL.VrfySrchFnctnltyUsngExcelFlw2(driver);
//
//			ExtentReportBuilder.ReportTestStep("Console Messages:  ","Pass",""+objCU.printTheConsoleMessage());
//			ExtentReportBuilder.ReportTestStep(" Verify that the  PaymentID filter functions correctly in the Trust Open tab is passed" + Thread.currentThread().getStackTrace()[2].getMethodName(),
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
	/*
	 * Verify that the "Select Corporate Name" filter functions correctly in the Trust Open tab
	 */
	@SuppressWarnings("deprecation")
	@Test(groups = { "Smoke", "Regression" })
	@Parameters({"browser"})
	public void TC_06_verifyCoprorateNameOptionTC(String browser) throws NullPointerException, ParseException, IOException {
		ExtentReportBuilder.ReportInitialization("Verify that the \"Select Corporate Name\" filter functions correctly in the Trust Open tab" + " - " + browser);

		try {
			objCU.browserTCcounter(browser);	

			objProcTrustBL.verifySelectorporateName(driver);
		

			//		objProcTrustBL.VrfySrchFnctnltyUsngExcelFlw2(driver);

			ExtentReportBuilder.ReportTestStep("Console Messages:  ","Pass",""+objCU.printTheConsoleMessage());
			ExtentReportBuilder.ReportTestStep(" Verify that the \"Select Corporate Name\" filter functions correctly in the Trust Open tab is passed" + Thread.currentThread().getStackTrace()[2].getMethodName(),
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
	 * Verify that the "Select Client Name" filter functions correctly in the Trust Open tab
	 */
	
	@SuppressWarnings("deprecation")
	@Test(groups = { "Smoke", "Regression" })
	@Parameters({"browser"})
	public void TC_08_verifyClientNameOptionTC(String browser) throws NullPointerException, ParseException, IOException {
		ExtentReportBuilder.ReportInitialization("Verify that the \"Select Client Name\" filter functions correctly in the Trust Open tab" + " - " + browser);

		try {
			objCU.browserTCcounter(browser);	

			objProcTrustBL.verifySelectClientNameOption(driver);
		

			//		objProcTrustBL.VrfySrchFnctnltyUsngExcelFlw2(driver);

			ExtentReportBuilder.ReportTestStep("Console Messages:  ","Pass",""+objCU.printTheConsoleMessage());
			ExtentReportBuilder.ReportTestStep(" Verify that the \"Select Client Name\" filter functions correctly in the Trust Open tabis passed" + Thread.currentThread().getStackTrace()[2].getMethodName(),
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
