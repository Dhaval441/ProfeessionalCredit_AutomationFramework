package businesslogic;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import objectRepository.ProcessTrustOR;
import objectRepository.ProcessedTrustOR;
import utilities.CommonMethods;
import utilities.ExtentReportBuilder;
import utilities.RWExcel;

public class ProcessedTrustBL extends ExtentReportBuilder {

	public ProcessedTrustBL() {
		// TODO Auto-generated constructor stub
	}


	String mthName;


	CommonMethods objCM = new CommonMethods();
	ProcessTrustOR objProTrustOR = new ProcessTrustOR();
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
				objCM.setText(driver, objProssdTrustOR.EnterToDate, "11/03/2025");
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
				objCM.setText(driver, objProssdTrustOR.EnterToDate, "11/03/2025");
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
				objCM.setText(driver, objProssdTrustOR.EnterToDate, "11/03/2025");
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
				objCM.setText(driver, objProssdTrustOR.EnterToDate, "11/03/2025");
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
				objCM.setText(driver, objProssdTrustOR.EnterToDate, "11/03/2025");
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
				objCM.setText(driver, objProssdTrustOR.EnterToDate, "11/03/2025");
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
				objCM.setText(driver, objProssdTrustOR.EnterToDate, "11/03/2025");
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
				objCM.setText(driver, objProssdTrustOR.EnterToDate, "11/03/2025");
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
				objCM.setText(driver, objProssdTrustOR.EnterToDate, "11/03/2025");
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
				objCM.setText(driver, objProssdTrustOR.EnterToDate, "11/03/2025");
				objCM.onMouseHover(driver, objProssdTrustOR.ApplyButton);
				objCM.onMouseHover(driver, objProssdTrustOR.dropdownSeleERPReports);
				objCM.onMouseHover(driver, objProssdTrustOR.SelectAllERPReports);
				objCM.onMouseHover(driver, objProssdTrustOR.RedropdownSeleERPReports);
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
		objCM.onMouseHover(driver, objProssdTrustOR.ClearFilter);
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
				objCM.setText(driver, objProssdTrustOR.EnterToDate, "11/03/2025");
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
	
	//For testing change
	//For testing change 2
	//For testing change 3
	//For testing change 4
	//For testing change 5
		//For testing change 6
	//For testing change 7
	//For testing change 8
	//For testing change 9
	//For testing change 10
	//For testing change 11
	//For testing change 12
	//For testing change 13
	//For testing change 14
	//For testing change 15
	//For testing change 16
	//For testing change 17
	//For testing change 18
	//For testing change 19
	//For testing change 20
	//For testing change 21
	//For testing change 22
	//For testing change 23
	//For testing change 24
	//For testing change 25
	//For testing change 26
	//For testing change 27
	//For testing change 28	
	//For testing change 29
	//For testing change 30
	//For testing change 31	
	//For testing change 32
	//For testing change 33
	//For testing change 34
	//For testing change 35
	//For testing change 36
	//For testing change 37
	//For testing change 38
	//For testing change 39
	//For testing change 40
	//For testing change 41
	//For testing change 42
	//For testing change 43
	//For testing change 44
	//For testing change 45
	//For testing change 46
	//For testing change 47
	//For testing change 48
	//For testing change 49
	//For testing change 50
	//For testing change 51
	//For testing change 52
	//For testing change 53
	//For testing change 54
	//For testing change 55
	//For testing change 56
	// For testing change 57
//	For testing change 58
//	For testing change 59
//	For testing change 60
//	For testing change 61
//	For testing change 62
//	For testing change 63

}