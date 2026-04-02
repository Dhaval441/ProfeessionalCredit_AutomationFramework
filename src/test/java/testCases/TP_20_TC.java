package testCases;

import java.io.IOException;
import java.text.ParseException;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.google.gson.JsonObject;

import automationEngine.ApplicationSetup;
import businesslogic.TP_17_BL;
import businesslogic.TP_20_BL;
import utilities.CommonUtilities;
import utilities.ExtentReportBuilder;
import utilities.JsonReader;

public class TP_20_TC extends ApplicationSetup{

	public TP_20_TC() {
		// TODO Auto-generated constructor stub
	}
	TP_20_BL objProcTrustBL=new TP_20_BL();
	CommonUtilities objCU = new CommonUtilities();
	JsonObject jsonObj = new JsonObject();
	JsonReader jsR = new JsonReader();
	
	/*
	 * Navigation
	 */
	@SuppressWarnings("deprecation")
	@Test(groups = { "Smoke", "Regression" })
	@Parameters({"browser"})
	public void TC_01_NavigationTC(String browser) throws NullPointerException, ParseException, IOException {
		ExtentReportBuilder.ReportInitialization("Processed trust navigation TC" + " - " + browser);

		try {
			objCU.browserTCcounter(browser);

			objProcTrustBL.navigationProcessTrust(driver);



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
	 * Verify that a toast notification alerts the user to select the "Client" or "Run Date" filter to view results when no filters are selected on the Trust Open tab, and the "View" button is clicked.
	 */
	@SuppressWarnings("deprecation")
	@Test(groups = { "Smoke", "Regression" })
	@Parameters({"browser"})
	public void TC_02_WithoutFilterViewTC(String browser) throws NullPointerException, ParseException, IOException {
		ExtentReportBuilder.ReportInitialization("Verify that a toast notification alerts the user to select the \"Client\" or \"Run Date\" filter to view results when no filters are selected on the Trust Open tab, and the \"View\" button is clicked TC" + " - " + browser);

		try {
			objCU.browserTCcounter(browser);

			objProcTrustBL.withoutrundateView(driver);



			ExtentReportBuilder.ReportTestStep("Console Messages:  ","Pass",""+objCU.printTheConsoleMessage());
			ExtentReportBuilder.ReportTestStep("Verify that a toast notification alerts the user to select the \"Client\" or \"Run Date\" filter to view results when no filters are selected on the Trust Open tab, and the \"View\" button is clicked TC is passed" + Thread.currentThread().getStackTrace()[2].getMethodName(),
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
	 * Verify that a toast notification alerts the user to select either the "Client" or "Run Date" filter to view results when only the "Corporate" filter is selected, and the "Run Trust Process" button is clicked on the Trust Open tab.
	 */
	@SuppressWarnings("deprecation")
	@Test(groups = { "Smoke", "Regression" })
	@Parameters({"browser"})
	public void TC_03_WithSelectingCorpoOnlyRunTrustViewTC(String browser) throws NullPointerException, ParseException, IOException {
		ExtentReportBuilder.ReportInitialization("Verify that a toast notification alerts the user to select either the \"Client\" or \"Run Date\" filter to view results when only the \"Corporate\" filter is selected, and the \"Run Trust Process\" button is clicked on the Trust Open tab TC" + " - " + browser);

		try {
			objCU.browserTCcounter(browser);

			objProcTrustBL.withselectingdateOrClientRunTrsut(driver);



			ExtentReportBuilder.ReportTestStep("Console Messages:  ","Pass",""+objCU.printTheConsoleMessage());
			ExtentReportBuilder.ReportTestStep("Verify that a toast notification alerts the user to select either the \"Client\" or \"Run Date\" filter to view results when only the \"Corporate\" filter is selected, and the \"Run Trust Process\" button is clicked on the Trust Open tab. is passed" + Thread.currentThread().getStackTrace()[2].getMethodName(),
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
	 * Verify that results are displayed in the grid when the "Run Date" filter is selected, and the "View" button is clicked on the Trust Open tab.
	 */
	@SuppressWarnings("deprecation")
	@Test(groups = { "Smoke", "Regression" })
	@Parameters({"browser"})
	public void TC_04_WithSelectingRunDateFilterTC(String browser) throws NullPointerException, ParseException, IOException {
		ExtentReportBuilder.ReportInitialization("Verify that results are displayed in the grid when the \"Run Date\" filter is selected, and the \"View\" button is clicked on the Trust Open tab TC" + " - " + browser);

		try {
			objCU.browserTCcounter(browser);

			objProcTrustBL.verifytrustopenbydate(driver);



			ExtentReportBuilder.ReportTestStep("Console Messages:  ","Pass",""+objCU.printTheConsoleMessage());
			ExtentReportBuilder.ReportTestStep("Verify that results are displayed in the grid when the \"Run Date\" filter is selected, and the \"View\" button is clicked on the Trust Open tab. is passed" + Thread.currentThread().getStackTrace()[2].getMethodName(),
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
	 * Verify that results in the grid refresh without corporate grouping when the "Group by Corporate" checkbox is unchecked on the Trust Processed tab.
	 */
	@SuppressWarnings("deprecation")
	@Test(groups = { "Smoke", "Regression" })
	@Parameters({"browser"})
	public void TC_05_SelectingGrpByCorporateTC(String browser) throws NullPointerException, ParseException, IOException {
		ExtentReportBuilder.ReportInitialization("Verify that results in the grid refresh without corporate grouping when the \"Group by Corporate\" checkbox is unchecked on the Trust Processed tab TC" + " - " + browser);

		try {
			objCU.browserTCcounter(browser);

			objProcTrustBL.navigationProcessedTrust(driver);
			objProcTrustBL.verifytrustprocessedbydate(driver);


			ExtentReportBuilder.ReportTestStep("Console Messages:  ","Pass",""+objCU.printTheConsoleMessage());
			ExtentReportBuilder.ReportTestStep("Verify that results in the grid refresh without corporate grouping when the \"Group by Corporate\" checkbox is unchecked on the Trust Processed tab is passed" + Thread.currentThread().getStackTrace()[2].getMethodName(),
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
	 * Verify that entering a search string in the Search box filters the results in the grid to display only matching records.
	 */
	@SuppressWarnings("deprecation")
	@Test(groups = { "Smoke", "Regression" })
	@Parameters({"browser"})
	public void TC_06_SearchinginProcessedTrsutTC(String browser) throws NullPointerException, ParseException, IOException {
		ExtentReportBuilder.ReportInitialization(" Verify that entering a search string in the Search box filters the results in the grid to display only matching records. TC" + " - " + browser);

		try {
			objCU.browserTCcounter(browser);

			objProcTrustBL.verifytrustprocessedbySearch(driver);


			ExtentReportBuilder.ReportTestStep("Console Messages:  ","Pass",""+objCU.printTheConsoleMessage());
			ExtentReportBuilder.ReportTestStep(" Verify that entering a search string in the Search box filters the results in the grid to display only matching records. is passed" + Thread.currentThread().getStackTrace()[2].getMethodName(),
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
	 * Verify that clicking the “Publish All” button publishes all selected trusts and updates their status to “Published” in the Trust Processed grid.
	 */
	
	/*
	 * Verify that clicking on a Payment ID opens a modal with additional information for the selected trust after the “Validate” action is clicked. 
	 */
	
	/*
	 * Verify that clicking on “Add More Transaction” shows available transactions for the selected trust and excludes transactions posted after the trust creation date. 
	 */
	
	/*
	 * Verify that selected transactions are added to the validate screen upon clicking the “ADD” button after selecting them from the available transactions grid
	 */
	/*
	 * Verify that any changes made in the Validate screen persist upon clicking the “SAVE” button. 
	 */	
	
	
	/*
	 * Verify that a toast alert is displayed when the user clicks on the “Remove” button without selecting any transactions in the Validate screen. 
	 */	
	
	
	/*
	 * Verify that selected transactions are removed in the Validate screen when the user clicks on the “Remove” button.	 
	 */
	
	@SuppressWarnings("deprecation")
	@Test(groups = { "Smoke", "Regression" })
	@Parameters({"browser"})
	public void TC_07_ValidatioAddMoreRemoveFlowTC(String browser) throws NullPointerException, ParseException, IOException {
		ExtentReportBuilder.ReportInitialization(" Verify that entering a search string in the Search box filters the results in the grid to display only matching records. TC" + " - " + browser);

		try {
			objCU.browserTCcounter(browser);

			objProcTrustBL.verifytrustprocessedbySearchforValidateFlow(driver);
			objProcTrustBL.verifytrustprocessedbyRemoveTransactionFlow(driver);
			objProcTrustBL.verifyAddMoreTransactionFlow(driver);
			objProcTrustBL.verifyWithoutselectingRemoveFlow(driver);
			objProcTrustBL.verifyAddMoretTransAndSaveFlow(driver);

		
		
			
		

			ExtentReportBuilder.ReportTestStep("Console Messages:  ","Pass",""+objCU.printTheConsoleMessage());
			ExtentReportBuilder.ReportTestStep(" Verify that entering a search string in the Search box filters the results in the grid to display only matching records. is passed" + Thread.currentThread().getStackTrace()[2].getMethodName(),
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
