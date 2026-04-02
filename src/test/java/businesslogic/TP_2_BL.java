package businesslogic;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import objectRepository.ProcessTrustOR;
import objectRepository.TP_2_OR;
import utilities.CommonMethods;
import utilities.ExtentReportBuilder;
import utilities.RWExcel;

public class TP_2_BL extends ExtentReportBuilder {


	String mthName;


	CommonMethods objCM = new CommonMethods();
	TP_2_OR objProTrustOR = new TP_2_OR();
	RWExcel getExcelData = new RWExcel();
	Duration due = Duration.ofSeconds(30);
	/*
	 * Navigation to Process Trust
	 */
	public void navigationProcessTrust(WebDriver driver) throws Exception {

		
		Thread.sleep(50000);
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


	/*
	 * Verify that applying Run Date filter displays available trusts and allows grid manipulation on the Trust Open screen
	 */
	public void verifytrustopenbydate(WebDriver driver) throws Exception {
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

			}
			/*
			 * Need to update code for open trust verification
			 */
			Thread.sleep(2000);
			if (objCM.isElementPresent(driver, objProTrustOR.ListCount)) {
				ExtentReportBuilder.ReportTestStep("PASSED", "List of records",
						"User successfully get the list of open trust", mthName);
			} else {
				ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
						"After selecting Run date filter,Failed to get list of open trust", mthName);
			}
		} catch (Exception e) {
			ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
					"User failed to apply fliter on open trust process"+e, mthName);
			e.printStackTrace();
			Assert.fail();
		}
	}

	/*
	 * Verify that applying Run Date & Payment Type as Select all filter displays available trusts and allows grid manipulation on the Trust Open screen
	 */
	public void verifyfilterdateandpaymentall(WebDriver driver) throws Exception {

		try {
			mthName = new Object() {
			}.getClass().getEnclosingMethod().getName();

			objCM.onMouseHover(driver, objProTrustOR.clearButton);
			//			driver.switchTo().frame("TrustProcess");


			if(objCM.checkElementVisibility(driver, objProTrustOR.rundate)) {

				objCM.onMouseHover(driver, objProTrustOR.rundate);
				objCM.onMouseHover(driver, objProTrustOR.bymonthSelection);
				objCM.onMouseHover(driver, objProTrustOR.byyearSelection);
				objCM.onMouseHover(driver, objProTrustOR.yearSelelection);
				objCM.onMouseHover(driver, objProTrustOR.monthSelection);
				//Webelelment exeption
				objCM.onMouseHover(driver, objProTrustOR.dateSelection2);

				objCM.onMouseHover(driver, objProTrustOR.dropdownPayment);
				objCM.onMouseHover(driver, objProTrustOR.selectAll);

				objCM.onMouseHover(driver, objProTrustOR.viewButton);
				objCM.listObjecLocater(driver, objProTrustOR.filtereddata);
				System.out.println(objCM.getText(driver, objProTrustOR.ListCount));

			}
			//Need to update code for open trust verification

			Thread.sleep(2000);
			if (objCM.isElementPresent(driver, objProTrustOR.ListCount)) {
				ExtentReportBuilder.ReportTestStep("PASSED", "List of records",
						"User successfully get the list of open trust after applying Run date & Payment Selectall option", mthName);
			} else {
				ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
						"After selecting Run date filter & Select all option in payment dropdown,Failed to get list of open trust", mthName);
			}
		} catch (Exception e) {
			ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
					"User failed to apply fliter using run date and payment options on open trust process"+e, mthName);
			e.printStackTrace();
			Assert.fail();
		}

		objCM.onMouseHover(driver, objProTrustOR.clearButton);


	}
	/*
	 * Verify that applying Run Date & Payment Type as Agency Payments filter displays available trusts and allows grid manipulation on the Trust Open screen
	 */
	public void verifyfilterdateandAgencyPayment(WebDriver driver) throws Exception {

		try {
			mthName = new Object() {
			}.getClass().getEnclosingMethod().getName();

			objCM.onMouseHover(driver, objProTrustOR.clearButton);
			//			driver.switchTo().frame("TrustProcess");


			if(objCM.checkElementVisibility(driver, objProTrustOR.rundate)) {

				objCM.onMouseHover(driver, objProTrustOR.rundate);
				objCM.onMouseHover(driver, objProTrustOR.bymonthSelection);
				objCM.onMouseHover(driver, objProTrustOR.byyearSelection);
				objCM.onMouseHover(driver, objProTrustOR.yearSelelection);
				objCM.onMouseHover(driver, objProTrustOR.monthSelection);
				//Webelelment exeption
				objCM.onMouseHover(driver, objProTrustOR.dateSelection2);

				objCM.onMouseHover(driver, objProTrustOR.dropdownPayment);
				objCM.onMouseHover(driver, objProTrustOR.AgencyPayment);

				objCM.onMouseHover(driver, objProTrustOR.viewButton);
				objCM.listObjecLocater(driver, objProTrustOR.filtereddata);
				System.out.println(objCM.getText(driver, objProTrustOR.ListCount));

			}
			//Need to update code for open trust verification

			Thread.sleep(2000);
			if (objCM.isElementPresent(driver, objProTrustOR.ListCount)) {
				ExtentReportBuilder.ReportTestStep("PASSED", "List of records",
						"User successfully get the list of open trust after applying Run date & Agency Payment option", mthName);
			} else {
				ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
						"After selecting Run date filter & Select Agency Payment in payment dropdown,Failed to get list of open trust", mthName);
			}
		} catch (Exception e) {
			ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
					"User failed to apply fliter using run date and Agency Payment options on open trust process"+e, mthName);
			e.printStackTrace();
			Assert.fail();
		}

		objCM.onMouseHover(driver, objProTrustOR.clearButton);


	}
	/*
	 * Verify that applying Run Date & Payment Type as Client/DP Payments filter displays available trusts and allows grid manipulation on the Trust Open screen
	 */
	public void verifyfilterdateandClient_DPPayments(WebDriver driver) throws Exception {

		try {
			mthName = new Object() {
			}.getClass().getEnclosingMethod().getName();

			objCM.onMouseHover(driver, objProTrustOR.clearButton);
			//			driver.switchTo().frame("TrustProcess");


			if(objCM.checkElementVisibility(driver, objProTrustOR.rundate)) {

				objCM.onMouseHover(driver, objProTrustOR.rundate);
				objCM.onMouseHover(driver, objProTrustOR.bymonthSelection);
				objCM.onMouseHover(driver, objProTrustOR.byyearSelection);
				objCM.onMouseHover(driver, objProTrustOR.yearSelelection);
				objCM.onMouseHover(driver, objProTrustOR.monthSelection);
				//Webelelment exeption
				objCM.onMouseHover(driver, objProTrustOR.dateSelection2);

				objCM.onMouseHover(driver, objProTrustOR.dropdownPayment);
				objCM.onMouseHover(driver, objProTrustOR.Client_DPPayments);

				objCM.onMouseHover(driver, objProTrustOR.viewButton);
				objCM.listObjecLocater(driver, objProTrustOR.filtereddata);
				System.out.println(objCM.getText(driver, objProTrustOR.ListCount));

			}
			//Need to update code for open trust verification

			Thread.sleep(2000);
			if (objCM.isElementPresent(driver, objProTrustOR.ListCount)) {
				ExtentReportBuilder.ReportTestStep("PASSED", "List of records",
						"User successfully get the list of open trust after applying Run date & Client/DP Payments option", mthName);
			} else {
				ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
						"After selecting Run date filter & Select Client/DP Payments option in payment dropdown,Failed to get list of open trust", mthName);
			}
		} catch (Exception e) {
			ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
					"User failed to apply fliter using run date and Client/DP Payments options on open trust process"+e, mthName);
			e.printStackTrace();
			Assert.fail();
		}

		objCM.onMouseHover(driver, objProTrustOR.clearButton);


	}
	/*
	 * Verify that applying Run Date & Trust Group Name as Select all filter displays available trusts and allows grid manipulation on the Trust Open screen
	 */
	public void verifyfilterdateandtrustgroupall(WebDriver driver) throws Exception {

		try {
			mthName = new Object() {
			}.getClass().getEnclosingMethod().getName();

			objCM.onMouseHover(driver, objProTrustOR.clearButton);
			//			driver.switchTo().frame("TrustProcess");


			if(objCM.checkElementVisibility(driver, objProTrustOR.rundate)) {

				objCM.onMouseHover(driver, objProTrustOR.rundate);
				objCM.onMouseHover(driver, objProTrustOR.bymonthSelection);
				objCM.onMouseHover(driver, objProTrustOR.byyearSelection);
				objCM.onMouseHover(driver, objProTrustOR.yearSelelection);
				objCM.onMouseHover(driver, objProTrustOR.monthSelection);
				//Webelelment exeption
				objCM.onMouseHover(driver, objProTrustOR.dateSelection2);

				objCM.onMouseHover(driver, objProTrustOR.dropdownTrustGroup);
				objCM.onMouseHover(driver, objProTrustOR.selectAllTrsustGroup);

				objCM.onMouseHover(driver, objProTrustOR.viewButton);
				objCM.listObjecLocater(driver, objProTrustOR.filtereddata);
				System.out.println(objCM.getText(driver, objProTrustOR.ListCount));

			}


			if (objCM.isElementPresent(driver, objProTrustOR.ListCount)) {
				ExtentReportBuilder.ReportTestStep("PASSED", "List of records",
						"User successfully get the list of open trust after applying Run date & Trsut Group type Selectall option", mthName);
			} else {
				ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
						"After selecting Run date filter & Select all option in Group trust typ dropdown,Failed to get list of open trust", mthName);
			}
		} catch (Exception e) {
			ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
					"User failed to apply fliter using run date and trust group options on open trust process"+e, mthName);
			e.printStackTrace();
			Assert.fail();
		}
		//		objCM.onMouseHover(driver, objProTrustOR.clearBtn);

	}
	/*
	 *Verify that applying Run Date & Trust Group Name as #1 DP ONLY filter displays available trusts and allows grid manipulation on the Trust Open screen
	 */
	public void verifyfilterdateandDP_Only(WebDriver driver) throws Exception {

		try {
			mthName = new Object() {
			}.getClass().getEnclosingMethod().getName();

			objCM.onMouseHover(driver, objProTrustOR.clearButton);
			//			driver.switchTo().frame("TrustProcess");


			if(objCM.checkElementVisibility(driver, objProTrustOR.rundate)) {

				objCM.onMouseHover(driver, objProTrustOR.rundate);
				objCM.onMouseHover(driver, objProTrustOR.bymonthSelection);
				objCM.onMouseHover(driver, objProTrustOR.byyearSelection);
				objCM.onMouseHover(driver, objProTrustOR.yearSelelection);
				objCM.onMouseHover(driver, objProTrustOR.monthSelection);
				//Webelelment exeption
				objCM.onMouseHover(driver, objProTrustOR.dateSelection2);

				objCM.onMouseHover(driver, objProTrustOR.dropdownTrustGroup);
				objCM.onMouseHover(driver, objProTrustOR.DP_ONLY);

				objCM.onMouseHover(driver, objProTrustOR.viewButton);
//				objCM.listObjecLocater(driver, objProTrustOR.filtereddata);
//				System.out.println(objCM.getText(driver, objProTrustOR.ListCount));
				objCM.onMouseHover(driver, objProTrustOR.viewButton);
//				objCM.listObjecLocater(driver, objProTrustOR.filtereddata);
				System.out.println(objCM.getText(driver, objProTrustOR.ActualOPRecords));

			}


			if (objCM.isElementPresent(driver, objProTrustOR.ActualOPRecords)) {
				ExtentReportBuilder.ReportTestStep("PASSED", "List of records",
						"User successfully get the list of open trust after applying Run date & #1 DP ONLY type option", mthName);
			} else {
				ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
						"After selecting Run date filter & Select  #1 DP ONLY option in Group trust type dropdown,Failed to get list of open trust", mthName);
			}
		} catch (Exception e) {
			ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
					"User failed to apply fliter using run date and  #1 DP ONLY options on open trust process"+e, mthName);
			e.printStackTrace();
			Assert.fail();
		}
		//		objCM.onMouseHover(driver, objProTrustOR.clearBtn);

	}
	/*
	 *Verify that applying Run Date & Trust Group Name as #2 NEGATIVE ONLY filter displays available trusts and allows grid manipulation on the Trust Open screen
	 */
	public void verifyfilterdateandNEGATIVE_ONLY(WebDriver driver) throws Exception {

		try {
			mthName = new Object() {
			}.getClass().getEnclosingMethod().getName();

			objCM.onMouseHover(driver, objProTrustOR.clearButton);
			//			driver.switchTo().frame("TrustProcess");


			if(objCM.checkElementVisibility(driver, objProTrustOR.rundate)) {

				objCM.onMouseHover(driver, objProTrustOR.rundate);
				objCM.onMouseHover(driver, objProTrustOR.bymonthSelection);
				objCM.onMouseHover(driver, objProTrustOR.byyearSelection);
				objCM.onMouseHover(driver, objProTrustOR.yearSelelection);
				objCM.onMouseHover(driver, objProTrustOR.monthSelection);
				//Webelelment exeption
				objCM.onMouseHover(driver, objProTrustOR.dateSelection2);

				objCM.onMouseHover(driver, objProTrustOR.dropdownTrustGroup);
				objCM.onMouseHover(driver, objProTrustOR.NEGATIVE_ONLY);

				objCM.onMouseHover(driver, objProTrustOR.viewButton);
//				objCM.listObjecLocater(driver, objProTrustOR.filtereddata);
//				System.out.println(objCM.getText(driver, objProTrustOR.ListCount));
				objCM.onMouseHover(driver, objProTrustOR.viewButton);
//				objCM.listObjecLocater(driver, objProTrustOR.filtereddata);
				System.out.println(objCM.getText(driver, objProTrustOR.ActualOPRecords));

			}


			if (objCM.isElementPresent(driver, objProTrustOR.ActualOPRecords)) {
				ExtentReportBuilder.ReportTestStep("PASSED", "List of records",
						"User successfully get the list of open trust after applying Run date & NEGATIVE_ONLY type option", mthName);
			} else {
				ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
						"After selecting Run date filter & Select  NEGATIVE_ONLY option in Group trust type dropdown,Failed to get list of open trust", mthName);
			}
		} catch (Exception e) {
			ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
					"User failed to apply fliter using run date and  NEGATIVE_ONLY options on open trust process"+e, mthName);
			e.printStackTrace();
			Assert.fail();
		}
		//		objCM.onMouseHover(driver, objProTrustOR.clearBtn);

	}
	/*
	 * Verify that applying Run Date & Trust Group Name as BOTH #1 & #2 filter displays available trusts and allows grid manipulation on the Trust Open screen
	 */
	public void verifyfilterdateandBOTH_OneAndTwo(WebDriver driver) throws Exception {

		try {
			mthName = new Object() {
			}.getClass().getEnclosingMethod().getName();

			objCM.onMouseHover(driver, objProTrustOR.clearButton);
			//			driver.switchTo().frame("TrustProcess");


			if(objCM.checkElementVisibility(driver, objProTrustOR.rundate)) {

				objCM.onMouseHover(driver, objProTrustOR.rundate);
				objCM.onMouseHover(driver, objProTrustOR.bymonthSelection);
				objCM.onMouseHover(driver, objProTrustOR.byyearSelection);
				objCM.onMouseHover(driver, objProTrustOR.yearSelelection);
				objCM.onMouseHover(driver, objProTrustOR.monthSelection);
				//Webelelment exeption
				objCM.onMouseHover(driver, objProTrustOR.dateSelection2);

				objCM.onMouseHover(driver, objProTrustOR.dropdownTrustGroup);
				objCM.onMouseHover(driver, objProTrustOR.BOTH_OneAndTwo);

				objCM.onMouseHover(driver, objProTrustOR.viewButton);
//				objCM.listObjecLocater(driver, objProTrustOR.filtereddata);
//				System.out.println(objCM.getText(driver, objProTrustOR.ListCount));
				
				objCM.onMouseHover(driver, objProTrustOR.viewButton);
//				objCM.listObjecLocater(driver, objProTrustOR.filtereddata);
				System.out.println(objCM.getText(driver, objProTrustOR.ActualOPRecords));

			}


			if (objCM.isElementPresent(driver, objProTrustOR.ActualOPRecords)) {
				ExtentReportBuilder.ReportTestStep("PASSED", "List of records",
						"User successfully get the list of open trust after applying Run date & BOTH_OneAndTwo type option", mthName);
			} else {
				ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
						"After selecting Run date filter & Select  BOTH_OneAndTwo option in Group trust type dropdown,Failed to get list of open trust", mthName);
			}
		} catch (Exception e) {
			ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
					"User failed to apply fliter using run date and  BOTH_OneAndTwo options on open trust process"+e, mthName);
			e.printStackTrace();
			Assert.fail();
		}
		//		objCM.onMouseHover(driver, objProTrustOR.clearBtn);

	}
	/*
	 *Verify that applying Run Date & Trust Group Name as NEGATIVE DP, BOTH #1 & #2 filter displays available trusts and allows grid manipulation on the Trust Open screen
	 */
	public void verifyfilterdateandNEGATIVE_DP_BOTH(WebDriver driver) throws Exception {

		try {
			mthName = new Object() {
			}.getClass().getEnclosingMethod().getName();

			objCM.onMouseHover(driver, objProTrustOR.clearButton);
			//			driver.switchTo().frame("TrustProcess");


			if(objCM.checkElementVisibility(driver, objProTrustOR.rundate)) {

				objCM.onMouseHover(driver, objProTrustOR.rundate);
				objCM.onMouseHover(driver, objProTrustOR.bymonthSelection);
				objCM.onMouseHover(driver, objProTrustOR.byyearSelection);
				objCM.onMouseHover(driver, objProTrustOR.yearSelelection);
				objCM.onMouseHover(driver, objProTrustOR.monthSelection);
				//Webelelment exeption
				objCM.onMouseHover(driver, objProTrustOR.dateSelection2);

				objCM.onMouseHover(driver, objProTrustOR.dropdownTrustGroup);
				objCM.onMouseHover(driver, objProTrustOR.NEGATIVE_DP_BOTH);

				objCM.onMouseHover(driver, objProTrustOR.viewButton);
				objCM.listObjecLocater(driver, objProTrustOR.filtereddata);
				System.out.println(objCM.getText(driver, objProTrustOR.ListCount));

			}


			if (objCM.isElementPresent(driver, objProTrustOR.ListCount)) {
				ExtentReportBuilder.ReportTestStep("PASSED", "List of records",
						"User successfully get the list of open trust after applying Run date & NEGATIVE_DP_BOTH type option", mthName);
			} else {
				ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
						"After selecting Run date filter & Select NEGATIVE_DP_BOTH option in Group trust type dropdown,Failed to get list of open trust", mthName);
			}
		} catch (Exception e) {
			ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
					"User failed to apply fliter using run date and  NEGATIVE_DP_BOTH options on open trust process"+e, mthName);
			e.printStackTrace();
			Assert.fail();
		}
	}		
	/*
	 * Verify that applying Run Date &   as Select all filter displays available trusts and allows grid manipulation on the Trust Open screen
	 */
	public void verifyfilterdateandtransactionAll(WebDriver driver) throws Exception {

		try {
			mthName = new Object() {
			}.getClass().getEnclosingMethod().getName();

			objCM.onMouseHover(driver, objProTrustOR.clearButton);
			//			driver.switchTo().frame("TrustProcess");


			if(objCM.checkElementVisibility(driver, objProTrustOR.rundate)) {

				objCM.onMouseHover(driver, objProTrustOR.rundate);
				objCM.onMouseHover(driver, objProTrustOR.bymonthSelection);
				objCM.onMouseHover(driver, objProTrustOR.byyearSelection);
				objCM.onMouseHover(driver, objProTrustOR.yearSelelection);
				objCM.onMouseHover(driver, objProTrustOR.monthSelection);
				//Webelelment exeption
				objCM.onMouseHover(driver, objProTrustOR.dateSelection2);

				objCM.onMouseHover(driver, objProTrustOR.dropdownTransType);
				objCM.onMouseHover(driver, objProTrustOR.selectallTransType);
				objCM.onMouseHover(driver, objProTrustOR.dropdownFreqType);

				objCM.onMouseHover(driver, objProTrustOR.viewButton);
				objCM.listObjecLocater(driver, objProTrustOR.filtereddata);
				System.out.println(objCM.getText(driver, objProTrustOR.ListCount));

			}


			if (objCM.isElementPresent(driver, objProTrustOR.ListCount)) {
				ExtentReportBuilder.ReportTestStep("PASSED", "List of records",
						"User successfully get the list of open trust after applying Run date &  Transaction Type Select all type option", mthName);
			} else {
				ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
						"After selecting Run date filter & Select Transaction Type Select all option in Group trust type dropdown,Failed to get list of open trust", mthName);
			}
		} catch (Exception e) {
			ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
					"User failed to apply fliter using run date and  Transaction Type Select all options on open trust process"+e, mthName);
			e.printStackTrace();
			Assert.fail();
		}
	}	
	/*
	 * Verify that applying Run Date & Transaction Type as Positive Transactions filter displays available trusts and allows grid manipulation on the Trust Open screen
	 */
	public void verifyfilterdateandPositiveTransactions(WebDriver driver) throws Exception {

		try {
			mthName = new Object() {
			}.getClass().getEnclosingMethod().getName();

			objCM.onMouseHover(driver, objProTrustOR.clearButton);
			//			driver.switchTo().frame("TrustProcess");


			if(objCM.checkElementVisibility(driver, objProTrustOR.rundate)) {

				objCM.onMouseHover(driver, objProTrustOR.rundate);
				objCM.onMouseHover(driver, objProTrustOR.bymonthSelection);
				objCM.onMouseHover(driver, objProTrustOR.byyearSelection);
				objCM.onMouseHover(driver, objProTrustOR.yearSelelection);
				objCM.onMouseHover(driver, objProTrustOR.monthSelection);
				//Webelelment exeption
				objCM.onMouseHover(driver, objProTrustOR.dateSelection2);

				objCM.onMouseHover(driver, objProTrustOR.dropdownTransType);
				objCM.onMouseHover(driver, objProTrustOR.PositiveTransactions);
				objCM.onMouseHover(driver, objProTrustOR.dropdownFreqType);
				objCM.onMouseHover(driver, objProTrustOR.viewButton);
				objCM.listObjecLocater(driver, objProTrustOR.filtereddata);
				System.out.println(objCM.getText(driver, objProTrustOR.ListCount));

			}


			if (objCM.isElementPresent(driver, objProTrustOR.ListCount)) {
				ExtentReportBuilder.ReportTestStep("PASSED", "List of records",
						"User successfully get the list of open trust after applying Run date &  Transaction Type Positive Transactions type option", mthName);
			} else {
				ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
						"After selecting Run date filter & Select Positive Transactions option in Group trust type dropdown,Failed to get list of open trust", mthName);
			}
		} catch (Exception e) {
			ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
					"User failed to apply fliter using run date and  Positive Transactions options on open trust process"+e, mthName);
			e.printStackTrace();
			Assert.fail();
		}
	}	
	/*
	 * Verify that applying Run Date & Transaction Type as Negative Transactions filter displays available trusts and allows grid manipulation on the Trust Open screen
	 */
	public void verifyfilterdateandNegativeTransactions(WebDriver driver) throws Exception {

		try {
			mthName = new Object() {
			}.getClass().getEnclosingMethod().getName();

			objCM.onMouseHover(driver, objProTrustOR.clearButton);
			//			driver.switchTo().frame("TrustProcess");


			if(objCM.checkElementVisibility(driver, objProTrustOR.rundate)) {

				objCM.onMouseHover(driver, objProTrustOR.rundate);
				objCM.onMouseHover(driver, objProTrustOR.bymonthSelection);
				objCM.onMouseHover(driver, objProTrustOR.byyearSelection);
				objCM.onMouseHover(driver, objProTrustOR.yearSelelection);
				objCM.onMouseHover(driver, objProTrustOR.monthSelection);
				//Webelelment exeption
				objCM.onMouseHover(driver, objProTrustOR.dateSelection2);

				objCM.onMouseHover(driver, objProTrustOR.dropdownTransType);
				objCM.onMouseHover(driver, objProTrustOR.NegativeTransactions);
				objCM.onMouseHover(driver, objProTrustOR.dropdownFreqType);
				objCM.onMouseHover(driver, objProTrustOR.viewButton);
				objCM.listObjecLocater(driver, objProTrustOR.filtereddata);
				System.out.println(objCM.getText(driver, objProTrustOR.ListCount));

			}


			if (objCM.isElementPresent(driver, objProTrustOR.ListCount)) {
				ExtentReportBuilder.ReportTestStep("PASSED", "List of records",
						"User successfully get the list of open trust after applying Run date &  Transaction Type Negative Transactions type option", mthName);
			} else {
				ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
						"After selecting Run date filter & Select Negative Transactions option in Group trust type dropdown,Failed to get list of open trust", mthName);
			}
		} catch (Exception e) {
			ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
					"User failed to apply fliter using run date and  Negative Transactions options on open trust process"+e, mthName);
			e.printStackTrace();
			Assert.fail();
		}
	}	
	/*
	 *Verify that applying Run Date & Transaction Type as All Transactions filter displays available trusts and allows grid manipulation on the Trust Open screen
	 */
	public void verifyfilterdateandAllTransactions(WebDriver driver) throws Exception {

		try {
			mthName = new Object() {
			}.getClass().getEnclosingMethod().getName();

			objCM.onMouseHover(driver, objProTrustOR.clearButton);
			//			driver.switchTo().frame("TrustProcess");


			if(objCM.checkElementVisibility(driver, objProTrustOR.rundate)) {

				objCM.onMouseHover(driver, objProTrustOR.rundate);
				objCM.onMouseHover(driver, objProTrustOR.bymonthSelection);
				objCM.onMouseHover(driver, objProTrustOR.byyearSelection);
				objCM.onMouseHover(driver, objProTrustOR.yearSelelection);
				objCM.onMouseHover(driver, objProTrustOR.monthSelection);
				//Webelelment exeption
				objCM.onMouseHover(driver, objProTrustOR.dateSelection2);

				objCM.onMouseHover(driver, objProTrustOR.dropdownTransType);
				objCM.onMouseHover(driver, objProTrustOR.AllTransactions);
				objCM.onMouseHover(driver, objProTrustOR.dropdownFreqType);
				objCM.onMouseHover(driver, objProTrustOR.viewButton);
				objCM.listObjecLocater(driver, objProTrustOR.filtereddata);
				System.out.println(objCM.getText(driver, objProTrustOR.ListCount));

			}


			if (objCM.isElementPresent(driver, objProTrustOR.ListCount)) {
				ExtentReportBuilder.ReportTestStep("PASSED", "List of records",
						"User successfully get the list of open trust after applying Run date &  Transaction Type All Transactions type option", mthName);
			} else {
				ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
						"After selecting Run date filter & Select All Transactions option in Group trust type dropdown,Failed to get list of open trust", mthName);
			}
		} catch (Exception e) {
			ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
					"User failed to apply fliter using run date and All Transactions options on open trust process"+e, mthName);
			e.printStackTrace();
			Assert.fail();
		}
	}	
	/*
	 * Verify that applying Run Date, Payment Type, Trust Group, Transaction Type and frequency type filters displays available trusts and allows grid manipulation on the Trust Open screen
	 */

	public void verifyfilterUsingAllOptions(WebDriver driver) throws Exception {

		try {
			mthName = new Object() {
			}.getClass().getEnclosingMethod().getName();

			objCM.onMouseHover(driver, objProTrustOR.clearButton);
			//			driver.switchTo().frame("TrustProcess");


			if(objCM.checkElementVisibility(driver, objProTrustOR.rundate)) {

				objCM.onMouseHover(driver, objProTrustOR.rundate);
				objCM.onMouseHover(driver, objProTrustOR.bymonthSelection);
				objCM.onMouseHover(driver, objProTrustOR.byyearSelection);
				objCM.onMouseHover(driver, objProTrustOR.yearSelelection);
				objCM.onMouseHover(driver, objProTrustOR.monthSelection);
				//Webelelment exeption
				objCM.onMouseHover(driver, objProTrustOR.dateSelection2);

				objCM.onMouseHover(driver, objProTrustOR.dropdownTransType);
				objCM.onMouseHover(driver, objProTrustOR.AllTransactions);
				
				objCM.onMouseHover(driver, objProTrustOR.dropdownPayment);
				objCM.onMouseHover(driver, objProTrustOR.selectAll);
				
				objCM.onMouseHover(driver, objProTrustOR.dropdownTrustGroup);
				objCM.onMouseHover(driver, objProTrustOR.selectAllTrsustGroup);
//				
//				objCM.onMouseHover(driver, objProTrustOR.dropdownTransType);
//				objCM.onMouseHover(driver, objProTrustOR.selectallTransType);
				
				objCM.onMouseHover(driver, objProTrustOR.dropdownFreqType);
				objCM.onMouseHover(driver, objProTrustOR.selectallFreqType);

				objCM.onMouseHover(driver, objProTrustOR.viewButton);
				objCM.listObjecLocater(driver, objProTrustOR.filtereddata);
				System.out.println(objCM.getText(driver, objProTrustOR.ListCount));

			}


			if (objCM.isElementPresent(driver, objProTrustOR.ListCount)) {
				ExtentReportBuilder.ReportTestStep("PASSED", "List of records",
						"User successfully get the list of open trust after applying Run Date, Payment Type, Trust Group, Transaction Type and frequency type All type option", mthName);
			} else {
				ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
						"After selecting Run Date, Payment Type, Trust Group, Transaction Type and frequency type option in Group trust type dropdown,Failed to get list of open trust", mthName);
			}
		} catch (Exception e) {
			ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
					"User failed to apply fliter using Run Date, Payment Type, Trust Group, Transaction Type and frequency type options on open trust process"+e, mthName);
			e.printStackTrace();
			Assert.fail();
		}
		driver.navigate().refresh();
	}
}

