package businesslogic;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import objectRepository.ProcessTrustOR;
import objectRepository.ProcessedTrustOR;
import objectRepository.TP_20_RM_OR;
import utilities.CommonMethods;
import utilities.ExtentReportBuilder;
import utilities.RWExcel;

public class TP_20_RM_BL extends ExtentReportBuilder{

	public TP_20_RM_BL() {
		// TODO Auto-generated constructor stub
	}
	String mthName;


	CommonMethods objCM = new CommonMethods();
	TP_20_RM_OR objProTrustOR = new TP_20_RM_OR();
	ProcessedTrustOR objProssdTrustOR=new ProcessedTrustOR();
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
			if (objCM.isElementPresent(driver, objProssdTrustOR.mainTab)) {
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
	 * TestScenario- Verify that after applying run date filter displays available Processed trusts and allow grid manipulation
	 */
	public void verifytrustprocessedbydate(WebDriver driver) throws Exception {
	//	int i;
		try {
			mthName = new Object() {
			}.getClass().getEnclosingMethod().getName();
			driver.switchTo().frame("TrustProcess");

			if(objCM.checkElementVisibility(driver, objProssdTrustOR.ValidationTab)) {
				objCM.onMouseHover(driver, objProssdTrustOR.ProcessedTrustTab);
				objCM.onMouseHover(driver, objProssdTrustOR.CustomDateOption);
				objCM.setText(driver, objProssdTrustOR.EnterFromDate,"01/01/2025");
				objCM.setText(driver, objProssdTrustOR.EnterToDate, "03/25/2026");
				objCM.onMouseHover(driver, objProssdTrustOR.ApplyButton);
				objCM.onMouseHover(driver, objProssdTrustOR.ViewButton);
				//need to change Xpath following Webelemnt
				objCM.listObjecLocater(driver, objProssdTrustOR.listRe);
				objCM.listObjecLocater(driver, objProssdTrustOR.listCount);

			}
			/*
			 * Need to update code for Processed trust verification
			 */
			Thread.sleep(2000);
			if (objCM.isElementPresent(driver, objProssdTrustOR.listCount)) {
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
		objCM.onMouseHover(driver, objProssdTrustOR.ClearFilter);
	}
	
	/*
	 * TestScenario- Verify that after applying run date and Select all corporate filter displays available Processed trusts and allow grid manipulation
	 */
	public void verifytrustprocessedbydateandallcorporate(WebDriver driver) throws Exception {
	
		try {
			mthName = new Object() {
			}.getClass().getEnclosingMethod().getName();
//			driver.switchTo().frame("TrustProcess");

			if(objCM.checkElementVisibility(driver, objProssdTrustOR.ValidationTab)) {
				objCM.onMouseHover(driver, objProssdTrustOR.ProcessedTrustTab);
				objCM.onMouseHover(driver, objProssdTrustOR.CustomDateOption);
				objCM.setText(driver, objProssdTrustOR.EnterFromDate,"01/01/2025");
				objCM.setText(driver, objProssdTrustOR.EnterToDate, "03/25/2026");
				objCM.onMouseHover(driver, objProssdTrustOR.ApplyButton);
				objCM.onMouseHover(driver, objProssdTrustOR.dropdownSeleCorporate);
				objCM.onMouseHover(driver, objProssdTrustOR.SelectAllCorporate);
			
				objCM.onMouseHover(driver, objProssdTrustOR.ViewButton);
				//need to change Xpath following Webelemnt
				objCM.listObjecLocater(driver, objProssdTrustOR.listRe);
				objCM.listObjecLocater(driver, objProssdTrustOR.listCount);

			}
			/*
			 * Need to update code for Processed trust verification
			 */
			Thread.sleep(2000);
			if (objCM.isElementPresent(driver, objProssdTrustOR.listCount)) {
				ExtentReportBuilder.ReportTestStep("PASSED", "List of records",
						"User successfully get the list of Processed trust after applying rundate and select all corporates", mthName);
			} else {
				ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
						"After selecting Run date and select all corporate filter,Failed to get list of processed trust", mthName);
			}
		} catch (Exception e) {
			ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
					"User failed to apply fliter on Processed trust process Using run date and select all corprate"+e, mthName);
			e.printStackTrace();
			Assert.fail();
		}
		objCM.onMouseHover(driver, objProssdTrustOR.ClearFilter);
	}
	
	/*
	 * TestScenario- Verify that after applying run date  and Select Option from Parent filter displays available Processed trusts and allow grid manipulation
	 */
	public void verifytrustprocessedbydateandallParent(WebDriver driver) throws Exception {
	
		try {
			mthName = new Object() {
			}.getClass().getEnclosingMethod().getName();
//			driver.switchTo().frame("TrustProcess");

			if(objCM.checkElementVisibility(driver, objProssdTrustOR.ValidationTab)) {
				objCM.onMouseHover(driver, objProssdTrustOR.ProcessedTrustTab);
				objCM.onMouseHover(driver, objProssdTrustOR.CustomDateOption);
				objCM.setText(driver, objProssdTrustOR.EnterFromDate,"01/01/2025");
				objCM.setText(driver, objProssdTrustOR.EnterToDate, "03/25/2026");
				objCM.onMouseHover(driver, objProssdTrustOR.ApplyButton);
				objCM.onMouseHover(driver, objProssdTrustOR.dropdownSeleCorporate);
				objCM.onMouseHover(driver, objProssdTrustOR.SelectAllCorporate);
				objCM.onMouseHover(driver, objProssdTrustOR.dropdownSeleParent);
				objCM.onMouseHover(driver, objProssdTrustOR.SelectAllParent);
			
				objCM.onMouseHover(driver, objProssdTrustOR.ViewButton);
				//need to change Xpath following Webelemnt
				objCM.listObjecLocater(driver, objProssdTrustOR.listRe);
				objCM.listObjecLocater(driver, objProssdTrustOR.listCount);

			}
			/*
			 * Need to update code for Processed trust verification
			 */
			Thread.sleep(2000);
			if (objCM.isElementPresent(driver, objProssdTrustOR.listCount)) {
				ExtentReportBuilder.ReportTestStep("PASSED", "List of records",
						"User successfully get the list of Processed trust after applying rundate and select all parents", mthName);
			} else {
				ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
						"After selecting Run date and select all parents filter,Failed to get list of processed trust", mthName);
			}
		} catch (Exception e) {
			ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
					"User failed to apply fliter on Processed trust process Using run date and select all parents"+e, mthName);
			e.printStackTrace();
			Assert.fail();
		}
		objCM.onMouseHover(driver, objProssdTrustOR.ClearFilter);
	}
	
	/*
	 * TestScenario- Verify that after applying run date  and Select Option from Client filter displays available Processed trusts and allow grid manipulation
	 */
	public void verifytrustprocessedbydateandallClient(WebDriver driver) throws Exception {
	
		try {
			mthName = new Object() {
			}.getClass().getEnclosingMethod().getName();
//			driver.switchTo().frame("TrustProcess");

			if(objCM.checkElementVisibility(driver, objProssdTrustOR.ValidationTab)) {
				objCM.onMouseHover(driver, objProssdTrustOR.ProcessedTrustTab);
				objCM.onMouseHover(driver, objProssdTrustOR.CustomDateOption);
				objCM.setText(driver, objProssdTrustOR.EnterFromDate,"01/01/2025");
				objCM.setText(driver, objProssdTrustOR.EnterToDate, "03/25/2026");
				objCM.onMouseHover(driver, objProssdTrustOR.ApplyButton);
				objCM.onMouseHover(driver, objProssdTrustOR.dropdownSeleCorporate);
				objCM.onMouseHover(driver, objProssdTrustOR.SelectAllCorporate);
				objCM.onMouseHover(driver, objProssdTrustOR.dropdownSeleParent);
				objCM.onMouseHover(driver, objProssdTrustOR.SelectAllParent);
				objCM.onMouseHover(driver, objProssdTrustOR.dropdownSeleClient);
				objCM.onMouseHover(driver, objProssdTrustOR.SelectAllClient);
			
				objCM.onMouseHover(driver, objProssdTrustOR.ViewButton);
				//need to change Xpath following Webelemnt
				objCM.listObjecLocater(driver, objProssdTrustOR.listRe);
				objCM.listObjecLocater(driver, objProssdTrustOR.listCount);

			}
			/*
			 * Need to update code for Processed trust verification
			 */
			Thread.sleep(2000);
			if (objCM.isElementPresent(driver, objProssdTrustOR.listCount)) {
				ExtentReportBuilder.ReportTestStep("PASSED", "List of records",
						"User successfully get the list of Processed trust after applying rundate and select all Clients", mthName);
			} else {
				ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
						"After selecting Run date and select all clients filter,Failed to get list of processed trust", mthName);
			}
		} catch (Exception e) {
			ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
					"User failed to apply fliter on Processed trust process Using run date and select all clients"+e, mthName);
			e.printStackTrace();
			Assert.fail();
		}
		objCM.onMouseHover(driver, objProssdTrustOR.ClearFilter);
	}
	
	/*
	 * TestScenario- Verify that after applying run date  and Select Option Export type Tab filter displays available Processed trusts and allow grid manipulation
	 */
	public void verifytrustprocessedbydateandallExportType(WebDriver driver) throws Exception {
	
		try {
			mthName = new Object() {
			}.getClass().getEnclosingMethod().getName();
//			driver.switchTo().frame("TrustProcess");

			if(objCM.checkElementVisibility(driver, objProssdTrustOR.ValidationTab)) {
				objCM.onMouseHover(driver, objProssdTrustOR.ProcessedTrustTab);
				objCM.onMouseHover(driver, objProssdTrustOR.CustomDateOption);
				objCM.setText(driver, objProssdTrustOR.EnterFromDate,"01/01/2025");
				objCM.setText(driver, objProssdTrustOR.EnterToDate, "03/25/2026");
				objCM.onMouseHover(driver, objProssdTrustOR.ApplyButton);
				objCM.onMouseHover(driver, objProssdTrustOR.dropdownSeleExportType);
				objCM.onMouseHover(driver, objProssdTrustOR.SelectAllExportType);
			
				objCM.onMouseHover(driver, objProssdTrustOR.ViewButton);
				//need to change Xpath following Webelemnt
				objCM.listObjecLocater(driver, objProssdTrustOR.listRe);
				objCM.listObjecLocater(driver, objProssdTrustOR.listCount);

			}
			/*
			 * Need to update code for Processed trust verification
			 */
			Thread.sleep(2000);
			if (objCM.isElementPresent(driver, objProssdTrustOR.listCount)) {
				ExtentReportBuilder.ReportTestStep("PASSED", "List of records",
						"User successfully get the list of Processed trust after applying rundate and select all export types", mthName);
			} else {
				ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
						"After selecting Run date and select all export types filter,Failed to get list of processed trust", mthName);
			}
		} catch (Exception e) {
			ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
					"User failed to apply fliter on Processed trust process Using run date and select all export types"+e, mthName);
			e.printStackTrace();
			Assert.fail();
		}
		objCM.onMouseHover(driver, objProssdTrustOR.ClearFilter);
	}
	
	
	/*
	 * TestScenario- Verify that after applying run date  and Select Option trust receipt method type Tab filter displays available Processed trusts and allow grid manipulation
	 */
	public void verifytrustprocessedbydateandallTrustReceiptMethod(WebDriver driver) throws Exception {
	
		try {
			mthName = new Object() {
			}.getClass().getEnclosingMethod().getName();
//			driver.switchTo().frame("TrustProcess");

			if(objCM.checkElementVisibility(driver, objProssdTrustOR.ValidationTab)) {
				objCM.onMouseHover(driver, objProssdTrustOR.ProcessedTrustTab);
				objCM.onMouseHover(driver, objProssdTrustOR.CustomDateOption);
				objCM.setText(driver, objProssdTrustOR.EnterFromDate,"01/01/2025");
				objCM.setText(driver, objProssdTrustOR.EnterToDate, "03/25/2026");
				objCM.onMouseHover(driver, objProssdTrustOR.ApplyButton);
				objCM.onMouseHover(driver, objProssdTrustOR.dropdownSeleTrustReceiptMethod);
				objCM.onMouseHover(driver, objProssdTrustOR.SelectAllTrustReceiptMethod);
			
				objCM.onMouseHover(driver, objProssdTrustOR.ViewButton);
				//need to change Xpath following Webelemnt
				objCM.listObjecLocater(driver, objProssdTrustOR.listRe);
				objCM.listObjecLocater(driver, objProssdTrustOR.listCount);

			}
			/*
			 */
			Thread.sleep(2000);
			if (objCM.isElementPresent(driver, objProssdTrustOR.listCount)) {
				ExtentReportBuilder.ReportTestStep("PASSED", "List of records",
						"User successfully get the list of Processed trust after applying rundate and select all trust reciept method", mthName);
			} else {
				ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
						"After selecting Run date and select all trust reciept methods filter,Failed to get list of processed trust", mthName);
			}
		} catch (Exception e) {
			ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
					"User failed to apply fliter on Processed trust process Using run date and select all trust reciept methods"+e, mthName);
			e.printStackTrace();
			Assert.fail();
		}
		objCM.onMouseHover(driver, objProssdTrustOR.ClearFilter);
	}
	
	/*
	 * TestScenario- Verify that after applying run date  and Select  Option ACH/CH filter displays available Processed trusts and allow grid manipulation
	 */
	public void verifytrustprocessedbydateandallACH_CH(WebDriver driver) throws Exception {
	
		try {
			mthName = new Object() {
			}.getClass().getEnclosingMethod().getName();
//			driver.switchTo().frame("TrustProcess");

			if(objCM.checkElementVisibility(driver, objProssdTrustOR.ValidationTab)) {
				objCM.onMouseHover(driver, objProssdTrustOR.ProcessedTrustTab);
				objCM.onMouseHover(driver, objProssdTrustOR.CustomDateOption);
				objCM.setText(driver, objProssdTrustOR.EnterFromDate,"01/01/2025");
				objCM.setText(driver, objProssdTrustOR.EnterToDate, "03/25/2026");
				objCM.onMouseHover(driver, objProssdTrustOR.ApplyButton);
				objCM.onMouseHover(driver, objProssdTrustOR.dropdownSeleACH_CH);
				objCM.onMouseHover(driver, objProssdTrustOR.SelectAllACH_CH);
			
				objCM.onMouseHover(driver, objProssdTrustOR.ViewButton);
				//need to change Xpath following Webelemnt
				objCM.listObjecLocater(driver, objProssdTrustOR.listRe);
				objCM.listObjecLocater(driver, objProssdTrustOR.listCount);

			}
			/*
			 */
			Thread.sleep(2000);
			if (objCM.isElementPresent(driver, objProssdTrustOR.listCount)) {
				ExtentReportBuilder.ReportTestStep("PASSED", "List of records",
						"User successfully get the list of Processed trust after applying rundate and select all  ACH/CH", mthName);
			} else {
				ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
						"After selecting Run date and select all ACH/CH filter,Failed to get list of processed trust", mthName);
			}
		} catch (Exception e) {
			ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
					"User failed to apply fliter on Processed trust process Using run date and select all  ACH/CH "+e, mthName);
			e.printStackTrace();
			Assert.fail();
		}
		objCM.onMouseHover(driver, objProssdTrustOR.ClearFilter);
	}
	
	/*
	 * TestScenario- Verify that after applying run date  and Select  Option Trust frequency using filter displays available Processed trusts and allow grid manipulation
	 */
	public void verifytrustprocessedbydateandallTrustFreq(WebDriver driver) throws Exception {
	
		try {
			mthName = new Object() {
			}.getClass().getEnclosingMethod().getName();
//			driver.switchTo().frame("TrustProcess");

			if(objCM.checkElementVisibility(driver, objProssdTrustOR.ValidationTab)) {
				objCM.onMouseHover(driver, objProssdTrustOR.ProcessedTrustTab);
				objCM.onMouseHover(driver, objProssdTrustOR.CustomDateOption);
				objCM.setText(driver, objProssdTrustOR.EnterFromDate,"01/01/2025");
				objCM.setText(driver, objProssdTrustOR.EnterToDate, "03/25/2026");
				objCM.onMouseHover(driver, objProssdTrustOR.ApplyButton);
				objCM.onMouseHover(driver, objProssdTrustOR.dropdownSeleTrustFreq);
				objCM.onMouseHover(driver, objProssdTrustOR.SelectAllTrustFreq);
				objCM.onMouseHover(driver, objProssdTrustOR.DivertButton);
				objCM.onMouseHover(driver, objProssdTrustOR.ViewButton);
				//need to change Xpath following Webelemnt
				objCM.listObjecLocater(driver, objProssdTrustOR.listRe);
				objCM.listObjecLocater(driver, objProssdTrustOR.listCount);

			}
			/*
			 */
			Thread.sleep(2000);
			if (objCM.isElementPresent(driver, objProssdTrustOR.listCount)) {
				ExtentReportBuilder.ReportTestStep("PASSED", "List of records",
						"User successfully get the list of Processed trust after applying rundate and select all Trust frequency", mthName);
			} else {
				ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
						"After selecting Run date and select all Trust frequencyfilter,Failed to get list of processed trust", mthName);
			}
		} catch (Exception e) {
			ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
					"User failed to apply fliter on Processed trust process Using run date and select all Trust frequency "+e, mthName);
			e.printStackTrace();
			Assert.fail();
		}
		objCM.onMouseHover(driver, objProssdTrustOR.ClearFilter);
	}
	
	
	/*
	 * TestScenario- Verify that after applying run date  and Select  Option from G/L Code using filter displays available Processed trusts and allow grid manipulation
	 */
	public void verifytrustprocessedbydateandallG_L_Code(WebDriver driver) throws Exception {
	
		try {
			mthName = new Object() {
			}.getClass().getEnclosingMethod().getName();
//			driver.switchTo().frame("TrustProcess");

			if(objCM.checkElementVisibility(driver, objProssdTrustOR.ValidationTab)) {
				objCM.onMouseHover(driver, objProssdTrustOR.ProcessedTrustTab);
				objCM.onMouseHover(driver, objProssdTrustOR.CustomDateOption);
				objCM.setText(driver, objProssdTrustOR.EnterFromDate,"01/01/2025");
				objCM.setText(driver, objProssdTrustOR.EnterToDate, "03/25/2026");
				objCM.onMouseHover(driver, objProssdTrustOR.ApplyButton);
				objCM.onMouseHover(driver, objProssdTrustOR.AdvancedFilterButton);
				objCM.onMouseHover(driver, objProssdTrustOR.dropdownSeleG_LCode);
				objCM.onMouseHover(driver, objProssdTrustOR.SelectAllG_LCode);
				objCM.onMouseHover(driver, objProssdTrustOR.DivertButton);
				objCM.onMouseHover(driver, objProssdTrustOR.AdvViewButton);
				//need to change Xpath following Webelemnt
				objCM.listObjecLocater(driver, objProssdTrustOR.listRe);
				objCM.listObjecLocater(driver, objProssdTrustOR.listCount);

			}
			/*
			 */
			Thread.sleep(2000);
			if (objCM.isElementPresent(driver, objProssdTrustOR.listCount)) {
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
		objCM.onMouseHover(driver, objProssdTrustOR.AdvClearButton);
	}
	
	
	/*
	 * TestScenario- Verify that after applying run date  and Select  Option ERP Export reports using filter displays available Processed trusts and allow grid manipulation
	 */
	public void verifytrustprocessedbydateandallERPReport(WebDriver driver) throws Exception {
	
		try {
			mthName = new Object() {
			}.getClass().getEnclosingMethod().getName();
//			driver.switchTo().frame("TrustProcess");

			if(objCM.checkElementVisibility(driver, objProssdTrustOR.ValidationTab)) {
				objCM.onMouseHover(driver, objProssdTrustOR.ProcessedTrustTab);
				objCM.onMouseHover(driver, objProssdTrustOR.CustomDateOption);
				objCM.setText(driver, objProssdTrustOR.EnterFromDate,"01/01/2025");
				objCM.setText(driver, objProssdTrustOR.EnterToDate, "03/25/2026");
				objCM.onMouseHover(driver, objProssdTrustOR.ApplyButton);
				objCM.onMouseHover(driver, objProssdTrustOR.dropdownSeleERPReports);
				objCM.onMouseHover(driver, objProssdTrustOR.SelectAllERPReports);
				objCM.onMouseHover(driver, objProssdTrustOR.RedropdownSeleERPReports);
				objCM.onMouseHover(driver, objProssdTrustOR.AdvViewButton);
				//need to change Xpath following Webelemnt
				Thread.sleep(2000);
				objCM.listObjecLocater(driver, objProssdTrustOR.listRe);
				objCM.listObjecLocater(driver, objProssdTrustOR.listCount);

			}
			/*
			 */
			Thread.sleep(2000);
			if (objCM.isElementPresent(driver, objProssdTrustOR.listCount)) {
				ExtentReportBuilder.ReportTestStep("PASSED", "List of records",
						"User successfully get the list of Processed trust after applying rundate and select all ERP Export reports", mthName);
			} else {
				ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
						"After selecting Run date and select all ERP Export reports filter,Failed to get list of processed trust", mthName);
			}
		} catch (Exception e) {
			ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
					"User failed to apply fliter on Processed trust process Using run date and select all ERP Export reports "+e, mthName);
			e.printStackTrace();
			Assert.fail();
		}
		objCM.onMouseHover(driver, objProssdTrustOR.AdvClearButton);
	}
	
	/*
	 * TestScenario- Verify that after applying run date  and Select  Option Publish Status using filter displays available Processed trusts and allow grid manipulation
	 */
	public void verifytrustprocessedbydateandallPublishStatus(WebDriver driver) throws Exception {
	
		try {
			mthName = new Object() {
			}.getClass().getEnclosingMethod().getName();
//			driver.switchTo().frame("TrustProcess");

			if(objCM.checkElementVisibility(driver, objProssdTrustOR.ValidationTab)) {
				objCM.onMouseHover(driver, objProssdTrustOR.ProcessedTrustTab);
				objCM.onMouseHover(driver, objProssdTrustOR.CustomDateOption);
				objCM.setText(driver, objProssdTrustOR.EnterFromDate,"01/01/2025");
				objCM.setText(driver, objProssdTrustOR.EnterToDate, "03/25/2026");
				objCM.onMouseHover(driver, objProssdTrustOR.ApplyButton);
				objCM.onMouseHover(driver, objProssdTrustOR.dropdownSelePublishStatus);
				objCM.onMouseHover(driver, objProssdTrustOR.SelectAllPublishStatus);
			
				objCM.onMouseHover(driver, objProssdTrustOR.AdvViewButton);
				//need to change Xpath following Webelemnt
				objCM.listObjecLocater(driver, objProssdTrustOR.listRe);
				objCM.listObjecLocater(driver, objProssdTrustOR.listCount);

			}
			/*
			 */
			Thread.sleep(2000);
			if (objCM.isElementPresent(driver, objProssdTrustOR.listCount)) {
				ExtentReportBuilder.ReportTestStep("PASSED", "List of records",
						"User successfully get the list of Processed trust after applying rundate and select all Publish Status", mthName);
			} else {
				ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
						"After selecting Run date and select all ERP Export reports filter,Failed to get list of Publish Status", mthName);
			}
		} catch (Exception e) {
			ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
					"User failed to apply fliter on Processed trust process Using run date and select all Publish Status "+e, mthName);
			e.printStackTrace();
			Assert.fail();
		}
		objCM.onMouseHover(driver, objProssdTrustOR.AdvClearButton);
	}

	
	
	
	/*
	 * TestScenario- Verify that after applying run date  and Select  Option Publish Status using filter displays available Processed trusts and allow grid manipulation
	 */
	public void verifytrustprocessedbydateandTrustBatch(WebDriver driver) throws Exception {
	
		try {
			mthName = new Object() {
			}.getClass().getEnclosingMethod().getName();
//			driver.switchTo().frame("TrustProcess");

			if(objCM.checkElementVisibility(driver, objProssdTrustOR.ValidationTab)) {
				objCM.onMouseHover(driver, objProssdTrustOR.ProcessedTrustTab);
				objCM.onMouseHover(driver, objProssdTrustOR.CustomDateOption);
				objCM.setText(driver, objProssdTrustOR.EnterFromDate,"01/01/2025");
				objCM.setText(driver, objProssdTrustOR.EnterToDate, "03/25/2026");
				objCM.onMouseHover(driver, objProssdTrustOR.ApplyButton);
				objCM.setText(driver, objProssdTrustOR.enterTrustBatch, "4924");
				
				objCM.onMouseHover(driver, objProssdTrustOR.AdvViewButton);
				//need to change Xpath following Webelemnt
				objCM.listObjecLocater(driver, objProssdTrustOR.listRe);
				objCM.listObjecLocater(driver, objProssdTrustOR.listCount);

			}
			/*
			 */
			Thread.sleep(2000);
			if (objCM.isElementPresent(driver, objProssdTrustOR.listCount)) {
				ExtentReportBuilder.ReportTestStep("PASSED", "List of records",
						"User successfully get the list of Processed trust after applying rundate and entering batch Id", mthName);
			} else {
				ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
						"After selecting Run date and enetering batch ID,Failed to get list of records", mthName);
			}
		} catch (Exception e) {
			ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
					"User failed to apply fliter on Processed trust process Using run date and entering Batch ID"+e, mthName);
			e.printStackTrace();
			Assert.fail();
		}
		objCM.onMouseHover(driver, objProssdTrustOR.AdvClearButton);
	}
	
	/*
	 * TestScenario- Verify that after selecting date and entering the details of trust batch and User able to view records
	 */
	public void verifytrustprocessedbydateandallInvoiceID(WebDriver driver) throws Exception {
	
		try {
			mthName = new Object() {
			}.getClass().getEnclosingMethod().getName();
//			driver.switchTo().frame("TrustProcess");

			if(objCM.checkElementVisibility(driver, objProssdTrustOR.ValidationTab)) {
				objCM.onMouseHover(driver, objProssdTrustOR.ProcessedTrustTab);
				objCM.onMouseHover(driver, objProssdTrustOR.CustomDateOption);
				objCM.setText(driver, objProssdTrustOR.EnterFromDate,"01/01/2025");
				objCM.setText(driver, objProssdTrustOR.EnterToDate, "03/25/2026");
				objCM.onMouseHover(driver, objProssdTrustOR.ApplyButton);
				objCM.onMouseHover(driver, objProssdTrustOR.AdvViewButton);
//Need to add test data
				objCM.setText(driver, objProssdTrustOR.enterTrustBatch, "4925");

				//need to change Xpath following Webelemnt
				objCM.listObjecLocater(driver, objProssdTrustOR.listRe);
				objCM.listObjecLocater(driver, objProssdTrustOR.listCount);

			}
			/*
			 */
			Thread.sleep(2000);
			if (objCM.isElementPresent(driver, objProssdTrustOR.listCount)) {
				ExtentReportBuilder.ReportTestStep("PASSED", "List of records",
						"User successfully get the list of Processed trust after applying rundate and entering Invoice id", mthName);
			} else {
				ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
						"After selecting Run date and entering inovice ID,Failed to get list of processed trust", mthName);
			}
		} catch (Exception e) {
			ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
					"User failed to apply fliter on Processed trust process Using run date and entering Invoice ID "+e, mthName);
			e.printStackTrace();
			Assert.fail();
		}
		objCM.onMouseHover(driver, objProssdTrustOR.AdvClearButton);
		driver.navigate().refresh();
	}
	/*
	 * Run trust and reverse trust functionality
	 */
	public void navigationProcessTrust(WebDriver driver) throws Exception {
	
			
			Thread.sleep(5000);
			objCM.waitUntillVisibilityOfElement(driver, objProTrustOR.menubutton,due);
			try {
				mthName = new Object() {
				}.getClass().getEnclosingMethod().getName();
	
				objCM.onMouseHover(driver, objProTrustOR.menubutton);
				objCM.onMouseHover_withoutClick(driver, objProTrustOR.AccountingButtonn);
				objCM.onMouseHover(driver, objProTrustOR.processtrustButton);
	
				if (objCM.isElementPresent(driver, objProTrustOR.processTrustTab)) {
					ExtentReportBuilder.ReportTestStep("PASSED", "PASS",
							"User navigated successfully to the process trust tab", mthName);
				} else {
					ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
							"User not  able tonavigate successfully to the process trust tab", mthName);
				}
			} catch (Exception e) {
				ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
						"User failed to navigate process trust tab"+e, mthName);
				e.printStackTrace();
				Assert.fail();
			}
		}
	public void verifytrustopenbydateAndRunTrust(WebDriver driver) throws Exception {
	int i;
	try {
		mthName = new Object() {
		}.getClass().getEnclosingMethod().getName();

		driver.switchTo().frame("TrustProcess");

		if(objCM.checkElementVisibility(driver, objProTrustOR.rundate)) {

			objCM.onMouseHover(driver, objProTrustOR.rundate);
			objCM.onMouseHover(driver, objProTrustOR.bymonthSelection);
			objCM.onMouseHover(driver, objProTrustOR.byyearSelection);
			objCM.onMouseHover(driver, objProTrustOR.yearSelelection);
			objCM.onMouseHover(driver, objProTrustOR.monthSelection);
			objCM.onMouseHover(driver, objProTrustOR.dateSelection);
			objCM.onMouseHover(driver, objProTrustOR.viewButton);
			objCM.listObjecLocater(driver, objProTrustOR.filtereddata);

			System.out.println(objCM.getText(driver, objProTrustOR.ListCount));
			objCM.setText(driver, objProTrustOR.Search, "20021");
			objCM.onMouseHover(driver, objProTrustOR.ClientSelection);
			objCM.onMouseHover(driver, objProTrustOR.RunTrust);
			driver.switchTo().defaultContent();
//			objCM.onMouseHover(driver, objProTrustOR.SuccessToastMsg);
		}
		/*
		 * Need to update code for open trust verification
		 */
//		Thread.sleep(2000);
		String SuccessToastMsg=objCM.getText(driver, objProTrustOR.SuccessToastMsg);
		Thread.sleep(2000);
		String ExpToastMsg = getExcelData.readCell("ProcessTrust", "RunTrustToastMsg");
		if (ExpToastMsg.equals(SuccessToastMsg)) {
			
			ExtentReportBuilder.ReportTestStep("PASSED", "List of records",
					"User successfully able to ruin trust for one single client", mthName);
		} else {
			ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
					"User not able to ruin trust for one single client", mthName);
		}
	} catch (Exception e) {
		ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
				"User failed to ruin trust for one single client"+e, mthName);
		e.printStackTrace();
		Assert.fail();
	}
	Thread.sleep(4000);
	driver.navigate().refresh();
}
	public void navigationProcessedTrustforReverseTrust(WebDriver driver) throws Exception {
	
		
		Thread.sleep(25000);
		objCM.waitUntillVisibilityOfElement(driver, objProTrustOR.menubutton,due);
		try {
			mthName = new Object() {
			}.getClass().getEnclosingMethod().getName();
	
			objCM.onMouseHover(driver, objProTrustOR.menubutton);
			objCM.onMouseHover_withoutClick(driver, objProTrustOR.AccountingButtonn);
			objCM.onMouseHover(driver, objProTrustOR.processtrustButton);
//			objCM.onMouseHover(driver, objProssdTrustOR.processedTrustTab);
			if (objCM.isElementPresent(driver, objProssdTrustOR.mainTab)) {
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
	 * TestScenario- Verify that after applying run date filter displays available Processed trusts and allow grid manipulation
	 */
	public void verifytrustprocessedbydateReversetrust(WebDriver driver) throws Exception {
//		int i;
		try {
			mthName = new Object() {
			}.getClass().getEnclosingMethod().getName();
			driver.switchTo().frame("TrustProcess");
	
			if(objCM.checkElementVisibility(driver, objProssdTrustOR.ValidationTab)) {
				objCM.onMouseHover(driver, objProssdTrustOR.ProcessedTrustTab);
				objCM.onMouseHover(driver, objProssdTrustOR.CustomDateOption);
				objCM.setText(driver, objProssdTrustOR.EnterFromDate,"01/01/2025");
				objCM.setText(driver, objProssdTrustOR.EnterToDate, "03/25/2026");
				objCM.onMouseHover(driver, objProssdTrustOR.ApplyButton);
				objCM.onMouseHover(driver, objProssdTrustOR.ViewButton);
				//need to change Xpath following Webelemnt
				objCM.listObjecLocater(driver, objProssdTrustOR.listRe);
				objCM.listObjecLocater(driver, objProssdTrustOR.listCount);
				objCM.setText(driver, objProTrustOR.Search2, "20021");
				objCM.onMouseHover(driver, objProTrustOR.ClientSelection2);
				objCM.onMouseHover(driver, objProTrustOR.ReverseTrust);
				objCM.onMouseHover(driver, objProTrustOR.ClickonYes);
				driver.switchTo().defaultContent();
				
	
			}
			String SuccessToastMsg2=objCM.getText(driver, objProTrustOR.SuccessToastMsg2);
			Thread.sleep(2000);
			String ExpToastMsg = getExcelData.readCell("ProcessTrust", "ReverseToastmsg");
			if (ExpToastMsg.equals(SuccessToastMsg2)) {
				ExtentReportBuilder.ReportTestStep("PASSED", "List of records",
						"User successfully reverse the trust for single trust", mthName);
			} else {
				ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
						"Userr is not able to reverse the trust for single client", mthName);
			}
		} catch (Exception e) {
			ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
					"Userr is failed to reverse the trust for single client"+e, mthName);
			e.printStackTrace();
			Assert.fail();
		}
		driver.switchTo().frame("TrustProcess");
		objCM.onMouseHover(driver, objProssdTrustOR.ClearFilter);
		driver.navigate().refresh();
	}
	
}
