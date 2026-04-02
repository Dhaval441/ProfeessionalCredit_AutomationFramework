package businesslogic;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import objectRepository.TP_17_OR;
import objectRepository.TP_20_OR;
import objectRepository.TP_2_OR;
import utilities.CommonMethods;
import utilities.ExtentReportBuilder;
import utilities.RWExcel;

public class TP_20_BL extends ExtentReportBuilder {

	public TP_20_BL() {
		// TODO Auto-generated constructor stub
	}

	String mthName;
	CommonMethods objCM = new CommonMethods();
	TP_20_OR objProTrustOR = new TP_20_OR();
	TP_2_OR objTP_2_OR =new TP_2_OR ();
	RWExcel getExcelData = new RWExcel();
	Duration due = Duration.ofSeconds(30);
	
	/*
	 * Navigation
	 */
	public void navigationProcessTrust(WebDriver driver) throws Exception {

		
		Thread.sleep(50000);
		objCM.waitUntillVisibilityOfElement(driver, objTP_2_OR.menubutton,due);
		try {
			mthName = new Object() {
			}.getClass().getEnclosingMethod().getName();

			objCM.onMouseHover(driver, objTP_2_OR.menubutton);
			objCM.onMouseHover_withoutClick(driver, objTP_2_OR.AccountingButtonn);
			objCM.onMouseHover(driver, objTP_2_OR.processtrustButton);

			if (objCM.isElementPresent(driver, objTP_2_OR.processTrustTab)) {
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
	/*
	 * Verify that a toast notification alerts the user to select the "Client" or "Run Date" filter to view results when no filters are selected on the Trust Open tab, and the "View" button is clicked.
	 */
	public void withoutrundateView(WebDriver driver) throws Exception {

		try {
			mthName = new Object() {
			}.getClass().getEnclosingMethod().getName();
			driver.switchTo().frame("TrustProcess");
			objCM.onMouseHover(driver, objTP_2_OR.clearButton);
				


			if(objCM.checkElementVisibility(driver, objTP_2_OR.rundate)) 

				objCM.onMouseHover(driver, objTP_2_OR.viewButton);
			objCM.checkElementVisibility(driver, objProTrustOR.ActualError1 );
			String ActualError1=objCM.getText(driver, objProTrustOR.ActualError1);
			System.out.println(ActualError1);

			String ExpErrorCode1 = getExcelData.readCell("ProcessTrust", "ExpErrorCode1");
			System.out.println(ExpErrorCode1);
			System.out.println("Expected data from updated filtered is ="+ ActualError1);


			if (ExpErrorCode1.equals(ActualError1)) {
				ExtentReportBuilder.ReportTestStep("PASSED", "List of records",
						"User is successfully able click on view button with getting exception 'Date Please'", mthName);
			} else {
				ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
						"User is not able to click on view button", mthName);
			}
		} catch (Exception e) {
			ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
					"User failed to click on view button without selecting run date"+e, mthName);
			e.printStackTrace();
			Assert.fail();  
		}

	}
	/*
	 * Verify that a toast notification alerts the user to select either the "Client" or "Run Date" filter to view results when only the "Corporate" filter is selected, and the "Run Trust Process" button is clicked on the Trust Open tab.
	 */
	public void withselectingdateOrClientRunTrsut(WebDriver driver) throws Exception {

		try {
			mthName = new Object() {
			}.getClass().getEnclosingMethod().getName();
		//	driver.switchTo().frame("TrustProcess");
			objCM.onMouseHover(driver, objTP_2_OR.clearButton);
				
			objCM.onMouseHover(driver, objTP_2_OR.rundate);
			objCM.onMouseHover(driver, objTP_2_OR.bymonthSelection);
			objCM.onMouseHover(driver, objTP_2_OR.byyearSelection);
			objCM.onMouseHover(driver, objTP_2_OR.yearSelelection);
			objCM.onMouseHover(driver, objTP_2_OR.monthSelection);
			objCM.onMouseHover(driver, objTP_2_OR.dateSelection);
			
			objCM.onMouseHover(driver, objTP_2_OR.AdvancedFilterOption);
			objCM.onMouseHover(driver, objTP_2_OR.dropdownCorporatename);
			objCM.onMouseHover(driver, objTP_2_OR.selectallCorporatename);
			objCM.onMouseHover(driver, objTP_2_OR.PaymentID);
			Thread.sleep(6000);
			objCM.onMouseHover(driver, objProTrustOR.RunTrust);

			
//			if(objCM.checkElementVisibility(driver, objTP_2_OR.rundate)) 

			objCM.checkElementVisibility(driver, objProTrustOR.ActualError1 );
			String ActualError1=objCM.getText(driver, objProTrustOR.ActualError1);
			System.out.println(ActualError1);

			String ExpErrorCode1 = getExcelData.readCell("ProcessTrust", "ExpErrorCode2");
			System.out.println(ExpErrorCode1);
			System.out.println("Expected data from updated filtered is ="+ ActualError1);


			if (ExpErrorCode1.equals(ActualError1)) {
				ExtentReportBuilder.ReportTestStep("PASSED", "List of records",
						"User is successfully able click on run trsut after selecting corporate all getting exception 'Date Please'", mthName);
			} else {
				ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
						"User is not able click on run trsut after selecting corporate all getting exception 'Date Please'", mthName);
			}
		} catch (Exception e) {
			ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
					"User is failed to get run trsut after selecting corporate all getting exception 'Date Please'"+e, mthName);
			e.printStackTrace();
			Assert.fail();  
		}
		objCM.onMouseHover(driver, objProTrustOR.ClearFilter2);
	}
	/*
	 * Verify that results are displayed in the grid when the "Run Date" filter is selected, and the "View" button is clicked on the Trust Open tab.
	 */
	public void verifytrustopenbydate(WebDriver driver) throws Exception {
		int i;
		try {
			mthName = new Object() {
			}.getClass().getEnclosingMethod().getName();

//			driver.switchTo().frame("TrustProcess");

			if(objCM.checkElementVisibility(driver, objTP_2_OR.rundate)) {

				objCM.onMouseHover(driver, objTP_2_OR.rundate);
				objCM.onMouseHover(driver, objTP_2_OR.bymonthSelection);
				objCM.onMouseHover(driver, objTP_2_OR.byyearSelection);
				objCM.onMouseHover(driver, objTP_2_OR.yearSelelection);
				objCM.onMouseHover(driver, objTP_2_OR.monthSelection);
				objCM.onMouseHover(driver, objTP_2_OR.dateSelection2);
				objCM.onMouseHover(driver, objTP_2_OR.viewbutton2);
				objCM.listObjecLocater(driver, objTP_2_OR.filtereddata);

				System.out.println(objCM.getText(driver, objTP_2_OR.ListCount));

			}
			/*
			 * Need to update code for open trust verification
			 */
			Thread.sleep(2000);
			if (objCM.isElementPresent(driver, objTP_2_OR.ListCount)) {
				ExtentReportBuilder.ReportTestStep("PASSED", "List of records",
						"User successfully get the list of open trust after selecting run date filter", mthName);
			} else {
				ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
						"After selecting Run date filter,Failed to get list of open trust after selecting run date filter", mthName);
			}
		} catch (Exception e) {
			ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
					"User failed to apply fliter on open trust process after selecting run date filter"+e, mthName);
			e.printStackTrace();
			Assert.fail();
		}
		driver.navigate().refresh();
	}
	/*
	 * Verify that results in the grid refresh without corporate grouping when the "Group by Corporate" checkbox is unchecked on the Trust Processed tab.
	 */
	public void navigationProcessedTrust(WebDriver driver) throws Exception {

//		objCM.onMouseHover(driver, objProTrustOR.fa_refresh);	
		Thread.sleep(25000);
		objCM.waitUntillVisibilityOfElement(driver, objTP_2_OR.menubutton,due);
		try {
			mthName = new Object() {
			}.getClass().getEnclosingMethod().getName();

			objCM.onMouseHover(driver, objTP_2_OR.menubutton);
			objCM.onMouseHover_withoutClick(driver, objTP_2_OR.AccountingButtonn);
			objCM.onMouseHover(driver, objTP_2_OR.processtrustButton);
//			objCM.onMouseHover(driver, objProssdTrustOR.processedTrustTab);
			if (objCM.isElementPresent(driver, objTP_2_OR.mainTab)) {
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
				objCM.listObjecLocater(driver, objProTrustOR.GroupByCorporate);
				objCM.listObjecLocater(driver, objProTrustOR.GroupByCorporate);
				Thread.sleep(2000);
				if (objCM.isElementPresent(driver, objProTrustOR.GroupByCorporate)) {
					ExtentReportBuilder.ReportTestStep("PASSED", "List of records",
							"User successfully able to click on group by corporate in processed trust", mthName);
				} else {
					ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
							"User not able to click on group by corporate in processed trust", mthName);
				}
			} catch (Exception e) {
				ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
						"User failed to click on group by corporate in processed trust"+e, mthName);
				e.printStackTrace();
				Assert.fail();
			}
			objCM.onMouseHover(driver, objProTrustOR.ClearFilter);
		}
	/*
	 * Verify that entering a search string in the Search box filters the results in the grid to display only matching records.
	 */
	
	public void verifytrustprocessedbySearch(WebDriver driver) throws Exception {
		//	int i;
			try {
				mthName = new Object() {
				}.getClass().getEnclosingMethod().getName();
//				driver.switchTo().frame("TrustProcess");

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
				String Search1 = getExcelData.readCell("ProcessTrust", "ProcessedTrustSearch");
				objCM.setText(driver, objProTrustOR.ProcessedTrustSearch,Search1 );
				String ExpCond=objCM.getText(driver, objProTrustOR.ExpCond);

				System.out.println("Expected data from updated filtered is ="+ ExpCond);

			
				Thread.sleep(2000);
				if (ExpCond.equals(Search1)) {
					ExtentReportBuilder.ReportTestStep("PASSED", "List of records",
							"User successfully able to search in processed trust tab", mthName);
				} else {
					ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
							"User not able to search in processed trust tab", mthName);
				}
			} catch (Exception e) {
				ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
						"User failed to search in processed trust tab"+e, mthName);
				e.printStackTrace();
				Assert.fail();
			}
			objCM.onMouseHover(driver, objProTrustOR.ClearFilter);
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
	
	public void verifytrustprocessedbySearchforValidateFlow(WebDriver driver) throws Exception {
		//	int i;
			try {
				mthName = new Object() {
				}.getClass().getEnclosingMethod().getName();
//				driver.switchTo().frame("TrustProcess");

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
				String Search1 = getExcelData.readCell("ProcessTrust", "ValidateAddRemoveScenario");
				objCM.setText(driver, objProTrustOR.ProcessedTrustSearch,Search1 );
				String ExpCond=objCM.getText(driver, objProTrustOR.ExpCond);

				System.out.println("Expected data from updated filtered is ="+ ExpCond);
				
				objCM.onMouseHover(driver, objProTrustOR.ValidateButton);
		
			
				Thread.sleep(2000);
				if (objCM.isElementPresent(driver, objProTrustOR.SearchTransforExp)) {
					ExtentReportBuilder.ReportTestStep("PASSED", "List of records",
							"User successfully able to navigate to validate tab", mthName);
				} else {
					ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
							"User is not able to navigate to validate tab", mthName);
				}
			} catch (Exception e) {
				ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
						"User failed to navigate to validate tab"+e, mthName);
				e.printStackTrace();
				Assert.fail();
			}
		}
	public void verifytrustprocessedbyRemoveTransactionFlow(WebDriver driver) throws Exception {
		//	int i;
			try {
				mthName = new Object() {
				}.getClass().getEnclosingMethod().getName();
//				driver.switchTo().frame("TrustProcess");

			
				/*
				 * Need to update code for Processed trust verification
				 */
				objCM.onMouseHover(driver, objProTrustOR.SelectTransaction);
				objCM.onMouseHover(driver, objProTrustOR.RemoveBUtton);
				
			
				Thread.sleep(2000);
				if (objCM.isElementPresent(driver, objProTrustOR.SearchTransforExp)) {
					ExtentReportBuilder.ReportTestStep("PASSED", "List of records",
							"User successfully able to remove the transaction using Payment ID", mthName);
				} else {
					ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
							"User is not able to remove the transaction using Payment ID", mthName);
				}
			} catch (Exception e) {
				ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
						"User failed to remove the transaction using Payment ID"+e, mthName);
				e.printStackTrace();
				Assert.fail();
			}
		}
	public void verifyAddMoreTransactionFlow(WebDriver driver) throws Exception {
		//	int i;
			try {
				mthName = new Object() {
				}.getClass().getEnclosingMethod().getName();
//				driver.switchTo().frame("TrustProcess");

			
				/*
				 * Need to update code for Processed trust verification
				 */
				Thread.sleep(3000);
				objCM.onMouseHover(driver, objProTrustOR.AddMoreTrans);
				objCM.onMouseHover(driver, objProTrustOR.SelectAddMoreTras);
//				objCM.onMouseHover(driver, objProTrustOR.AddMoreTrans);
				objCM.onMouseHover(driver, objProTrustOR.AddTrans);
//				Need to update xpath for back button
				objCM.onMouseHover(driver, objProTrustOR.BackbtnAddMore);
				Thread.sleep(2000);
				if (objCM.isElementPresent(driver, objProTrustOR.SearchTransforExp)) {
					ExtentReportBuilder.ReportTestStep("PASSED", "List of records",
							"User successfully able to add more transaction from transaction details", mthName);
				} else {
					ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
							"User not able to add more transaction from transaction details", mthName);
				}
			} catch (Exception e) {
				ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
						"User failed to add more transaction from transaction details"+e, mthName);
				e.printStackTrace();
				Assert.fail();
			}
		}
	public void verifyAddMoretTransAndSaveFlow(WebDriver driver) throws Exception {
		//	int i;
			try {
				mthName = new Object() {
				}.getClass().getEnclosingMethod().getName();
//				driver.switchTo().frame("TrustProcess");

				Thread.sleep(4000);
				/*
				 * Need to update code for Processed trust verification
				 */
				objCM.onMouseHover(driver, objProTrustOR.SaveBtn);
	
				Thread.sleep(2000);
				if (objCM.isElementPresent(driver, objProTrustOR.ViewButton)) {
					ExtentReportBuilder.ReportTestStep("PASSED", "List of records",
							"User successfully able to save the changes made in transaction details tab", mthName);
				} else {
					ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
							"User not able to save the changes made in transaction details tab", mthName);
				}
			} catch (Exception e) {
				ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
						"User failed to save the changes made in transaction details tab"+e, mthName);
				e.printStackTrace();
				Assert.fail();
			}
			driver.navigate().refresh();
		}
	
	public void verifyWithoutselectingRemoveFlow(WebDriver driver) throws Exception {
		//	int i;
			try {
				mthName = new Object() {
				}.getClass().getEnclosingMethod().getName();
//				driver.switchTo().frame("TrustProcess");

			
				/*
				 * Need to update code for Processed trust verification
				 */
				objCM.onMouseHover(driver, objProTrustOR.RemoveBUtton);
				Thread.sleep(2000);
				String ActualToastMsg = getExcelData.readCell("ProcessTrust", "RemoveToast");
				String ExpCond=objCM.getText(driver, objProTrustOR.RemoveToastMsg);
				System.out.println(ActualToastMsg);
				System.out.println(ExpCond);

	
	
				Thread.sleep(2000);
				if (ExpCond.equals(ActualToastMsg)) {
					ExtentReportBuilder.ReportTestStep("PASSED", "List of records",
							"User successfully able to click on remove button and get the toast msg", mthName);
				} else {
					ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
							"User not able to click on remove button and get the toast msg", mthName);
				}
			} catch (Exception e) {
				ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
						"User failed to click on remove button and get the toast msg"+e, mthName);
				e.printStackTrace();
				Assert.fail();
			}
		
		}
}
