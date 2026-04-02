package testCases;

import java.io.IOException;
import java.text.ParseException;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.google.gson.JsonObject;

import automationEngine.ApplicationSetup;
import businesslogic.ProcessTrustBL;
import businesslogic.TP_2_BL;
import utilities.CommonUtilities;
import utilities.ExtentReportBuilder;
import utilities.JsonReader;

public class TP_2_TC extends ApplicationSetup {
			/*
			 * Navigation to Process trust Scenario
			*/

	TP_2_BL objProcTrustBL=new TP_2_BL();
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
		 * Verify that applying Run Date filter displays available trusts and allows grid manipulation on the Trust Open screen
		 */
		
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
		/*
		 * Verify that applying Run Date & Payment Type as Select all filter displays available trusts and allows grid manipulation on the Trust Open screen
		 */
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

		/*
		 * Verify that applying Run Date & Payment Type as Agency Payments filter displays available trusts and allows grid manipulation on the Trust Open screen
		 */
	@SuppressWarnings("deprecation")
	@Test(groups = { "Smoke", "Regression" })
	@Parameters({"browser"})
	public void TC_04_VerifyFilterDateAndAgencyPaymentTC(String browser) throws NullPointerException, ParseException, IOException {
		ExtentReportBuilder.ReportInitialization("Applying run date & payment type as Agency payment filter displays available trusts TC" + " - " + browser);

		try {
			objCU.browserTCcounter(browser);

			objProcTrustBL.verifyfilterdateandAgencyPayment(driver);



			ExtentReportBuilder.ReportTestStep("Console Messages:  ","Pass",""+objCU.printTheConsoleMessage());
			ExtentReportBuilder.ReportTestStep("Applying filter of reun date and Payment type as Agency Payments to process trust is passed" + Thread.currentThread().getStackTrace()[2].getMethodName(),
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
		 * Verify that applying Run Date & Payment Type as Client/DP Payments filter displays available trusts and allows grid manipulation on the Trust Open screen
		 */
	@SuppressWarnings("deprecation")
	@Test(groups = { "Smoke", "Regression" })
	@Parameters({"browser"})
	public void TC_05_VerifyFilterDateAndClient_DPPaymentsTC(String browser) throws NullPointerException, ParseException, IOException {
		ExtentReportBuilder.ReportInitialization("Applying run date & payment type as Client/DP Payments filter displays available trusts TC" + " - " + browser);

		try {
			objCU.browserTCcounter(browser);

			objProcTrustBL.verifyfilterdateandClient_DPPayments(driver);



			ExtentReportBuilder.ReportTestStep("Console Messages:  ","Pass",""+objCU.printTheConsoleMessage());
			ExtentReportBuilder.ReportTestStep("Applying filter of reun date and Payment type as Client/DP Payments to process trust is passed" + Thread.currentThread().getStackTrace()[2].getMethodName(),
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
		 * Verify that applying Run Date & Trust Group Name as Select all filter displays available trusts and allows grid manipulation on the Trust Open screen
		 */
	@SuppressWarnings("deprecation")
	@Test(groups = { "Smoke", "Regression" })
	@Parameters({"browser"})
	public void TC_06_VerifyFilterDateAndGroupTrustAllTC(String browser) throws NullPointerException, ParseException, IOException {
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
		/*
		 *Verify that applying Run Date & Trust Group Name as #1 DP ONLY filter displays available trusts and allows grid manipulation on the Trust Open screen
		 */
	@SuppressWarnings("deprecation")
	@Test(groups = { "Smoke", "Regression" })
	@Parameters({"browser"})
	public void TC_07_VerifyFilterDateAndDP_ONLYTC(String browser) throws NullPointerException, ParseException, IOException {
		ExtentReportBuilder.ReportInitialization("Applying run date & Trust Group Type as DP ONLY filter displays available trusts TC" + " - " + browser);

		try {
			objCU.browserTCcounter(browser);

			objProcTrustBL.verifyfilterdateandDP_Only(driver);



			ExtentReportBuilder.ReportTestStep("Console Messages:  ","Pass",""+objCU.printTheConsoleMessage());
			ExtentReportBuilder.ReportTestStep("Applying filter of run date and  DP ONLY type to process trust is passed" + Thread.currentThread().getStackTrace()[2].getMethodName(),
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
		 *Verify that applying Run Date & Trust Group Name as #2 NEGATIVE ONLY filter displays available trusts and allows grid manipulation on the Trust Open screen
		 */
	@SuppressWarnings("deprecation")
	@Test(groups = { "Smoke", "Regression" })
	@Parameters({"browser"})
	public void TC_08_VerifyFilterDateAndNEGATIVE_ONLYTC(String browser) throws NullPointerException, ParseException, IOException {
		ExtentReportBuilder.ReportInitialization("Applying run date & Trust Group Type as DP ONLY filter displays available trusts TC" + " - " + browser);

		try {
			objCU.browserTCcounter(browser);

			objProcTrustBL.verifyfilterdateandNEGATIVE_ONLY(driver);



			ExtentReportBuilder.ReportTestStep("Console Messages:  ","Pass",""+objCU.printTheConsoleMessage());
			ExtentReportBuilder.ReportTestStep("Applying filter of run date and  NEGATIVE ONLY type to process trust is passed" + Thread.currentThread().getStackTrace()[2].getMethodName(),
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
		 * Verify that applying Run Date & Trust Group Name as BOTH #1 & #2 filter displays available trusts and allows grid manipulation on the Trust Open screen
		 */
	@SuppressWarnings("deprecation")
	@Test(groups = { "Smoke", "Regression" })
	@Parameters({"browser"})
	public void TC_09_VerifyFilterDateAndBOTH_OneAndTwoTC(String browser) throws NullPointerException, ParseException, IOException {
		ExtentReportBuilder.ReportInitialization("Applying run date & Trust Group Type as BOTH_OneAndTwo filter displays available trusts TC" + " - " + browser);

		try {
			objCU.browserTCcounter(browser);

			objProcTrustBL.verifyfilterdateandBOTH_OneAndTwo(driver);



			ExtentReportBuilder.ReportTestStep("Console Messages:  ","Pass",""+objCU.printTheConsoleMessage());
			ExtentReportBuilder.ReportTestStep("Applying filter of run date and  BOTH_OneAndTwo type to process trust is passed" + Thread.currentThread().getStackTrace()[2].getMethodName(),
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
		 *Verify that applying Run Date & Trust Group Name as NEGATIVE DP, BOTH #1 & #2 filter displays available trusts and allows grid manipulation on the Trust Open screen
		 */
	
	@SuppressWarnings("deprecation")
	@Test(groups = { "Smoke", "Regression" })
	@Parameters({"browser"})
	public void TC_10_VerifyFilterDateAndNEGATIVE_DP_BOTHTC(String browser) throws NullPointerException, ParseException, IOException {
		ExtentReportBuilder.ReportInitialization("Applying run date & Trust Group Type as NEGATIVE_DP_BOTH filter displays available trusts TC" + " - " + browser);

		try {
			objCU.browserTCcounter(browser);

			objProcTrustBL.verifyfilterdateandNEGATIVE_DP_BOTH(driver);



			ExtentReportBuilder.ReportTestStep("Console Messages:  ","Pass",""+objCU.printTheConsoleMessage());
			ExtentReportBuilder.ReportTestStep("Applying filter of run date and  NEGATIVE_DP_BOTH type to process trust is passed" + Thread.currentThread().getStackTrace()[2].getMethodName(),
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
		 * Verify that applying Run Date & Transaction Type as Select all filter displays available trusts and allows grid manipulation on the Trust Open screen
		 */
	@SuppressWarnings("deprecation")
	@Test(groups = { "Smoke", "Regression" })
	@Parameters({"browser"})
	public void TC_11_VerifyFilterDateTransactionAllTC(String browser) throws NullPointerException, ParseException, IOException {
		ExtentReportBuilder.ReportInitialization("Applying run date & Transaction Type as Select all displays available trusts TC" + " - " + browser);

		try {
			objCU.browserTCcounter(browser);

			objProcTrustBL.verifyfilterdateandtransactionAll(driver);



			ExtentReportBuilder.ReportTestStep("Console Messages:  ","Pass",""+objCU.printTheConsoleMessage());
			ExtentReportBuilder.ReportTestStep("Applying filter of run date while Selecting Transaction Type as Select all to process trust is passed" + Thread.currentThread().getStackTrace()[2].getMethodName(),
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
		 * Verify that applying Run Date & Transaction Type as Positive Transactions filter displays available trusts and allows grid manipulation on the Trust Open screen
		 */
	@SuppressWarnings("deprecation")
	@Test(groups = { "Smoke", "Regression" })
	@Parameters({"browser"})
	public void TC_12_VerifyFilterDatePositiveTransactionsTC(String browser) throws NullPointerException, ParseException, IOException {
		ExtentReportBuilder.ReportInitialization("Applying run date & Transaction Type as Positive Transactions displays available trusts TC" + " - " + browser);

		try {
			objCU.browserTCcounter(browser);

			objProcTrustBL.verifyfilterdateandPositiveTransactions(driver);



			ExtentReportBuilder.ReportTestStep("Console Messages:  ","Pass",""+objCU.printTheConsoleMessage());
			ExtentReportBuilder.ReportTestStep("Applying filter of run date while Selecting Transaction Type as Positive Transactions to process trust is passed" + Thread.currentThread().getStackTrace()[2].getMethodName(),
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
		 * Verify that applying Run Date & Transaction Type as Negative Transactions filter displays available trusts and allows grid manipulation on the Trust Open screen
		 */
	@SuppressWarnings("deprecation")
	@Test(groups = { "Smoke", "Regression" })
	@Parameters({"browser"})
	public void TC_13_VerifyFilterDateNegativeTransactionsTC(String browser) throws NullPointerException, ParseException, IOException {
		ExtentReportBuilder.ReportInitialization("Applying run date & Transaction Type as Positive Transactions displays available trusts TC" + " - " + browser);

		try {
			objCU.browserTCcounter(browser);

			objProcTrustBL.verifyfilterdateandNegativeTransactions(driver);



			ExtentReportBuilder.ReportTestStep("Console Messages:  ","Pass",""+objCU.printTheConsoleMessage());
			ExtentReportBuilder.ReportTestStep("Applying filter of run date while Selecting Transaction Type as Negative Transactions to process trust is passed" + Thread.currentThread().getStackTrace()[2].getMethodName(),
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
		 *Verify that applying Run Date & Transaction Type as All Transactions filter displays available trusts and allows grid manipulation on the Trust Open screen
		 */
	@SuppressWarnings("deprecation")
	@Test(groups = { "Smoke", "Regression" })
	@Parameters({"browser"})
	public void TC_14_VerifyFilterDatePositiveTransactionsTC(String browser) throws NullPointerException, ParseException, IOException {
		ExtentReportBuilder.ReportInitialization("Applying run date & Transaction Type as All Transactions displays available trusts TC" + " - " + browser);

		try {
			objCU.browserTCcounter(browser);

			objProcTrustBL.verifyfilterdateandAllTransactions(driver);



			ExtentReportBuilder.ReportTestStep("Console Messages:  ","Pass",""+objCU.printTheConsoleMessage());
			ExtentReportBuilder.ReportTestStep("Applying filter of run date while Selecting Transaction Type as All Transactions to process trust is passed" + Thread.currentThread().getStackTrace()[2].getMethodName(),
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
		 * Verify that applying Run Date, Payment Type, Trust Group, Transaction Type and frequency type filters displays available trusts and allows grid manipulation on the Trust Open screen
		 */
	@SuppressWarnings("deprecation")
	@Test(groups = { "Smoke", "Regression" })
	@Parameters({"browser"})
	public void TC_15_VerifyFilterDateusinngaAllOptionsTC(String browser) throws NullPointerException, ParseException, IOException {
		ExtentReportBuilder.ReportInitialization("Applying Run Date, Payment Type, Trust Group, Transaction Type and frequency type displays available trusts TC" + " - " + browser);

		try {
			objCU.browserTCcounter(browser);

			objProcTrustBL.verifyfilterUsingAllOptions(driver);



			ExtentReportBuilder.ReportTestStep("Console Messages:  ","Pass",""+objCU.printTheConsoleMessage());
			ExtentReportBuilder.ReportTestStep("Applying filter of Run Date, Payment Type, Trust Group, Transaction Type and frequency type to process trust is passed" + Thread.currentThread().getStackTrace()[2].getMethodName(),
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


