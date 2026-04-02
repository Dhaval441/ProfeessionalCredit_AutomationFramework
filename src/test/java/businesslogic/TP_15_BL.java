package businesslogic;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import objectRepository.TP_10_OR;
import objectRepository.TP_15_OR;
import objectRepository.TP_2_OR;
import utilities.CommonMethods;
import utilities.ExtentReportBuilder;
import utilities.RWExcel;

public class TP_15_BL extends ExtentReportBuilder{

	public TP_15_BL() {
		// TODO Auto-generated constructor stub
	}
	String mthName;
	CommonMethods objCM = new CommonMethods();
	TP_15_OR objProTrustOR = new TP_15_OR();
	TP_2_OR objTP_2_OR =new TP_2_OR ();
	RWExcel getExcelData = new RWExcel();
	Duration due = Duration.ofSeconds(30);
	
	/*
	 * TestScenario-Verify that  User is able to navigate to Processed Trust tab 
	 */
	
	public void navigationProcessedTrust(WebDriver driver) throws Exception {

		
		Thread.sleep(25000);
		objCM.waitUntillVisibilityOfElement(driver, objProTrustOR.menubutton,due);
		try {
			mthName = new Object() {
			}.getClass().getEnclosingMethod().getName();

			objCM.onMouseHover(driver, objProTrustOR.menubutton);
			objCM.onMouseHover_withoutClick(driver, objProTrustOR.AccountingButtonn);
			objCM.onMouseHover(driver, objProTrustOR.processtrustButton);
//			objCM.onMouseHover(driver, objProssdTrustOR.processedTrustTab);
			if (objCM.isElementPresent(driver, objProTrustOR.mainTab)) {
				ExtentReportBuilder.ReportTestStep("PASSED", "PASS",
						"User navigated successfully to the processed trust tab", mthName);
			} else {
				ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
						"User not  able to navigate successfully to the processed trust tab", mthName);
			}
		} catch (Exception e) {
			ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
					"User failed to navigate processed trust tab"+e, mthName);
			e.printStackTrace();
			Assert.fail();
		}

	}
	/*
	 * Verify that the "Run Date" filter allows selection of a date range on the Trust Processed screen 
	 */
	
	public void verifytrustprocessedbydate(WebDriver driver) throws Exception {
		//	int i;
			try {
				mthName = new Object() {
				}.getClass().getEnclosingMethod().getName();
				driver.switchTo().frame("TrustProcess");

				if(objCM.checkElementVisibility(driver, objProTrustOR.ValidationTab)) {
					objCM.onMouseHover(driver, objProTrustOR.ProcessedTrustTab);
					objCM.onMouseHover(driver, objProTrustOR.CustomDateOption);
					objCM.setText(driver, objProTrustOR.EnterFromDate,"01/01/2025");
					objCM.setText(driver, objProTrustOR.EnterToDate, "03/25/2026");
					objCM.onMouseHover(driver, objProTrustOR.ApplyButton);
					objCM.onMouseHover(driver, objProTrustOR.ViewButton);
					//need to change Xpath following Webelemnt
					objCM.listObjecLocater(driver, objProTrustOR.listRe);
					objCM.listObjecLocater(driver, objProTrustOR.listCount);

				}
				/*
				 * Need to update code for Processed trust verification
				 */
				Thread.sleep(2000);
				if (objCM.isElementPresent(driver, objProTrustOR.listCount)) {
					ExtentReportBuilder.ReportTestStep("PASSED", "List of records",
							"User successfully get the list of Processed trust", mthName);
				} else {
					ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
							"After selecting Run date filter,Failed to get list of processed trust", mthName);
				}
			} catch (Exception e) {
				ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
						"User failed to apply fliter on Processed trust process"+e, mthName);
				e.printStackTrace();
				Assert.fail();
			}
			objCM.onMouseHover(driver, objProTrustOR.ClearFilter);
		}
	/*
	 * Verify that the G/L Code filter added on the Trust Processed Screen 
	 */
	public void verifytrustprocessedbydateandallG_L_Code(WebDriver driver) throws Exception {
		
		try {
			mthName = new Object() {
			}.getClass().getEnclosingMethod().getName();
//			driver.switchTo().frame("TrustProcess");

			if(objCM.checkElementVisibility(driver, objProTrustOR.ValidationTab)) {
				objCM.onMouseHover(driver, objProTrustOR.ProcessedTrustTab);
				objCM.onMouseHover(driver, objProTrustOR.CustomDateOption);
				objCM.setText(driver, objProTrustOR.EnterFromDate,"01/01/2025");
				objCM.setText(driver, objProTrustOR.EnterToDate, "11/03/2025");
				objCM.onMouseHover(driver, objProTrustOR.ApplyButton);
				objCM.onMouseHover(driver, objProTrustOR.AdvancedFilterButton);
				objCM.onMouseHover(driver, objProTrustOR.dropdownSeleG_LCode);
				objCM.onMouseHover(driver, objProTrustOR.SelectAllG_LCode);
				objCM.onMouseHover(driver, objProTrustOR.DivertButton);
				objCM.onMouseHover(driver, objProTrustOR.AdvViewButton);
				//need to change Xpath following Webelemnt
				objCM.listObjecLocater(driver, objProTrustOR.listRe);
				objCM.listObjecLocater(driver, objProTrustOR.listCount);

			}
			/*
			 */
			Thread.sleep(2000);
			if (objCM.isElementPresent(driver, objProTrustOR.listCount)) {
				ExtentReportBuilder.ReportTestStep("PASSED", "List of records",
						"User successfully get the list of Processed trust after applying rundate and select all G/L Code ", mthName);
			} else {
				ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
						"After selecting Run date and select all G/L Code filter,Failed to get list of processed trust", mthName);
			}
		} catch (Exception e) {
			ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
					"User failed to apply fliter on Processed trust process Using run date and select allG/L Code  "+e, mthName);
			e.printStackTrace();
			Assert.fail();
		}
		objCM.onMouseHover(driver, objProTrustOR.AdvClearButton);
	}
	
	
	/*
	 * Verify that the Trust Batch filter allows users to enter a comma-delimited string or a range of batch IDs	 
	 */
	public void verifyTrustbatchIDFilter(WebDriver driver) throws Exception {

		try {
			mthName = new Object() {
			}.getClass().getEnclosingMethod().getName();
//			driver.switchTo().frame("TrustProcess");

			if(objCM.checkElementVisibility(driver, objProTrustOR.ValidationTab)) {
				objCM.onMouseHover(driver, objProTrustOR.ProcessedTrustTab);
				objCM.onMouseHover(driver, objProTrustOR.CustomDateOption);
				objCM.setText(driver, objProTrustOR.EnterFromDate,"01/01/2025");
				objCM.setText(driver, objProTrustOR.EnterToDate, "11/03/2025");
				objCM.onMouseHover(driver, objProTrustOR.ApplyButton);
//				objCM.onMouseHover(driver, objProTrustOR.AdvancedFilterButton);
				objCM.onMouseHover(driver, objProTrustOR.DivertButton);

				//need to change Xpath following Webelemnt
			

			}
			String BatchNo = getExcelData.readCell("ProcessTrust", "TrustBatchNo");
			System.out.println(BatchNo);
			objCM.setText(driver, objProTrustOR.TrustBatchIDs,BatchNo );
			objCM.onMouseHover(driver, objProTrustOR.AdvViewButton);
			//need to change Xpath following Webelemnt
			objCM.listObjecLocater(driver, objProTrustOR.listRe);
			objCM.listObjecLocater(driver, objProTrustOR.listCount);

			Thread.sleep(5000);
			//Need to update code for open trust verification

			if (objCM.isElementPresent(driver, objProTrustOR.listCount)) {
				ExtentReportBuilder.ReportTestStep("PASSED", "List of records",
						"User is successfully able to search trust using BatchID", mthName);
			} else {
				ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
						"User is not able to search trust using BatchID", mthName);
			}
		} catch (Exception e) {
			ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
					"User failed to apply search trust using BatchID in processed trust"+e, mthName);
			e.printStackTrace();
			Assert.fail();
		}
//		objCM.onMouseHover(driver, objProTrustOR.AdvClearButton);
		driver.navigate().refresh();
//		driver.switchTo().frame("TrustProcess");
//		objCM.onMouseHover(driver, objProTrustOR.CloseTrustTab);
	}

}
