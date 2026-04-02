package businesslogic;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import objectRepository.TP_10_OR;
import objectRepository.TP_2_OR;
import objectRepository.TP_3_OR;
import utilities.CommonMethods;
import utilities.ExtentReportBuilder;
import utilities.RWExcel;

public class TP_10_BL extends ExtentReportBuilder{

	public TP_10_BL() {
		// TODO Auto-generated constructor stub
		
	}

	String mthName;


	CommonMethods objCM = new CommonMethods();
	TP_10_OR objProTrustOR = new TP_10_OR();
	TP_2_OR objTP_2_OR =new TP_2_OR ();
	RWExcel getExcelData = new RWExcel();
	Duration due = Duration.ofSeconds(30);
	/*
	 * Navigation to Process Trust
	 */
	public void navigationProcessTrust(WebDriver driver) throws Exception {

		
		Thread.sleep(20000);
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
	 * Verify that the "Select ACH/CH" filter is removed from the Trust Open screen	 
	 */
	public void verifyACH_CHFIlterRemved(WebDriver driver) throws Exception {

		try {
			mthName = new Object() {
			}.getClass().getEnclosingMethod().getName();

//			objCM.onMouseHover(driver, objTP_2_OR.clearButton);
						driver.switchTo().frame("TrustProcess");


			if(objCM.checkElementVisibility(driver, objTP_2_OR.rundate)) {

				objCM.onMouseHover(driver, objTP_2_OR.rundate);
				objCM.onMouseHover(driver, objTP_2_OR.bymonthSelection);	
				objCM.onMouseHover(driver, objTP_2_OR.byyearSelection);
				objCM.onMouseHover(driver, objTP_2_OR.yearSelelection);
				objCM.onMouseHover(driver, objTP_2_OR.monthSelection);
				//Webelelment exeption
				objCM.onMouseHover(driver, objTP_2_OR.dateSelection);

				objCM.onMouseHover(driver, objTP_2_OR.viewButton);
			}
			
			if (objCM.isElementPresent(driver, objTP_2_OR.ListCount)) {
				ExtentReportBuilder.ReportTestStep("PASSED", "List of records",
						"User can see that Select ACH/CH\" filter is removed from the Trust Open screen	", mthName);
			} else {
				ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
						"User can see that Select ACH/CH filter is not removed from the Trust Open screen	", mthName);
			}
		} catch (Exception e) {
			ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
					"User failed to see User can see that Select ACH/CH filter is removed from the Trust Open screen"+e, mthName);
			e.printStackTrace();
			Assert.fail();
		}

	}
	
	/*
	 *Verify that clicking on Advanced Filters displays additional filtering options in the Trust Open tab
	 */
	public void verifyAdvancedFilter(WebDriver driver) throws Exception {

		try {
			mthName = new Object() {
			}.getClass().getEnclosingMethod().getName();

			objCM.onMouseHover(driver, objTP_2_OR.clearButton);
			//			driver.switchTo().frame("TrustProcess");


			if(objCM.checkElementVisibility(driver, objTP_2_OR.rundate)) {	

			}

			
			if (objCM.isElementPresent(driver, objProTrustOR.AdvancedFilterOption)) {
				ExtentReportBuilder.ReportTestStep("PASSED", "List of records",
						"User is successfully able to click on Advanced filter option", mthName);
 			} else {
				ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
						"User is not able to click on Advanced filter option", mthName);
			}
		} catch (Exception e) {
			ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
					"User failed to click on Advanced filter option"+e, mthName);
			e.printStackTrace();
			Assert.fail();
		}

	}
	/*
	 * Verify that the "Select Trust Formula" filter functions correctly in the Trust Open tab
	 */
	public void verifySelectTrsutFormulaFilter1(WebDriver driver) throws Exception {

		try {
			mthName = new Object() {
			}.getClass().getEnclosingMethod().getName();

			objCM.onMouseHover(driver, objTP_2_OR.clearButton);
			//			driver.switchTo().frame("TrustProcess");


			if(objCM.checkElementVisibility(driver, objTP_2_OR.rundate)) {

				objCM.onMouseHover(driver, objTP_2_OR.rundate);
				objCM.onMouseHover(driver, objTP_2_OR.bymonthSelection);	
				objCM.onMouseHover(driver, objTP_2_OR.byyearSelection);
				objCM.onMouseHover(driver, objTP_2_OR.yearSelelection);
				objCM.onMouseHover(driver, objTP_2_OR.monthSelection);
				//Webelelment exeption
				objCM.onMouseHover(driver, objTP_2_OR.dateSelection2);
				objCM.onMouseHover(driver, objProTrustOR.AdvancedFilterOption);
				objCM.onMouseHover(driver, objProTrustOR.dropdowntrustformula);
				objCM.onMouseHover(driver, objProTrustOR.SelectNETRemit);
			

				objCM.onMouseHover(driver, objTP_2_OR.viewbutton2);
			}
			
			if (objCM.isElementPresent(driver, objTP_2_OR.ListCount)) {
				ExtentReportBuilder.ReportTestStep("PASSED", "List of records",
						"User can see that after selecting NET remit Results ", mthName);
			} else {
				ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
						"User is not able to select NET remit otion from trust filters", mthName);
			}
		} catch (Exception e) {
			ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
					"User failed to select the NET remit option from trust formula dropdown"+e, mthName);
			e.printStackTrace();
			Assert.fail();
		}

	}
	public void verifySelectTrsutFormulaFilter2(WebDriver driver) throws Exception {

		try {
			mthName = new Object() {
			}.getClass().getEnclosingMethod().getName();

			objCM.onMouseHover(driver, objTP_2_OR.clearbutton2);
			//			driver.switchTo().frame("TrustProcess");


			if(objCM.checkElementVisibility(driver, objTP_2_OR.rundate)) {

				objCM.onMouseHover(driver, objTP_2_OR.rundate);
				objCM.onMouseHover(driver, objTP_2_OR.bymonthSelection);	
				objCM.onMouseHover(driver, objTP_2_OR.byyearSelection);
				objCM.onMouseHover(driver, objTP_2_OR.yearSelelection);
				objCM.onMouseHover(driver, objTP_2_OR.monthSelection);
				//Webelelment exeption
				objCM.onMouseHover(driver, objTP_2_OR.dateSelection2);
//				objCM.onMouseHover(driver, objProTrustOR.AdvancedFilterOption);
				objCM.onMouseHover(driver, objProTrustOR.dropdowntrustformula);
				objCM.onMouseHover(driver, objProTrustOR.SelectGrossRemit);
			

				objCM.onMouseHover(driver, objTP_2_OR.clearbutton2);
			}
			
			if (objCM.isElementPresent(driver, objTP_2_OR.ListCount)) {
				ExtentReportBuilder.ReportTestStep("PASSED", "List of records",
						"User can see that after selecting gross remit Results ", mthName);
			} else {
				ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
						"User is not able to select gross remit otion from trust filters", mthName);
			}
		} catch (Exception e) {
			ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
					"User failed to select the gross remit option from trust formula dropdown"+e, mthName);
			e.printStackTrace();
			Assert.fail();
		}

	}
	public void verifySelectTrsutFormulaFilter3(WebDriver driver) throws Exception {

		try {
			mthName = new Object() {
			}.getClass().getEnclosingMethod().getName();

			objCM.onMouseHover(driver, objTP_2_OR.clearbutton2);
			//			driver.switchTo().frame("TrustProcess");


			if(objCM.checkElementVisibility(driver, objTP_2_OR.rundate)) {

				objCM.onMouseHover(driver, objTP_2_OR.rundate);
				objCM.onMouseHover(driver, objTP_2_OR.bymonthSelection);	
				objCM.onMouseHover(driver, objTP_2_OR.byyearSelection);
				objCM.onMouseHover(driver, objTP_2_OR.yearSelelection);
				objCM.onMouseHover(driver, objTP_2_OR.monthSelection);
				//Webelelment exeption
				objCM.onMouseHover(driver, objTP_2_OR.dateSelection2);
//				objCM.onMouseHover(driver, objProTrustOR.AdvancedFilterOption);
				objCM.onMouseHover(driver, objProTrustOR.dropdowntrustformula);
				objCM.onMouseHover(driver, objProTrustOR.SelectFixedFee);

				objCM.onMouseHover(driver, objTP_2_OR.viewbutton2);
				objCM.onMouseHover(driver, objTP_2_OR.ActualOPRecords);
				
			}
			
			if (objCM.isElementPresent(driver, objTP_2_OR.ActualOPRecords)) {
				ExtentReportBuilder.ReportTestStep("PASSED", "List of records",
						"User can see that after selecting Fixed fee Results ", mthName);
			} else {
				ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
						"User is not able to select Fixed fee option from trust filters", mthName);
			}
		} catch (Exception e) {
			ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
					"User failed to select the fixed option from trust formula dropdown"+e, mthName);
			e.printStackTrace();
			Assert.fail();
		}

	}
	
	/*
	 * Verify that the "Select G/L Code" filter functions correctly in the Trust Open tab
	 */
	public void verifySelectGLCodefromOptions(WebDriver driver) throws Exception {

		try {
			mthName = new Object() {
			}.getClass().getEnclosingMethod().getName();

			objCM.onMouseHover(driver, objTP_2_OR.clearbutton2);
			//			driver.switchTo().frame("TrustProcess");


			if(objCM.checkElementVisibility(driver, objTP_2_OR.rundate)) {

				objCM.onMouseHover(driver, objTP_2_OR.rundate);
				objCM.onMouseHover(driver, objTP_2_OR.bymonthSelection);	
				objCM.onMouseHover(driver, objTP_2_OR.byyearSelection);
				objCM.onMouseHover(driver, objTP_2_OR.yearSelelection);
				objCM.onMouseHover(driver, objTP_2_OR.monthSelection);
				//Webelelment exeption
				objCM.onMouseHover(driver, objTP_2_OR.dateSelection2);
//				objCM.onMouseHover(driver, objProTrustOR.AdvancedFilterOption);
				objCM.onMouseHover(driver, objProTrustOR.dropdownglcode);
				objCM.onMouseHover(driver, objProTrustOR.SelectTest);

				objCM.onMouseHover(driver, objTP_2_OR.viewbutton2);

				
			}
			
			if (objCM.isElementPresent(driver, objTP_2_OR.ListCount)) {
				ExtentReportBuilder.ReportTestStep("PASSED", "List of records",
						"User can see results after selecting Option from GL code", mthName);
			} else {
				ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
						"User is not able to see results after selecting Option from GL code", mthName);
			}
		} catch (Exception e) {
			ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
					"User failed to see results after selecting Option from GL code"+e, mthName);
			e.printStackTrace();
			Assert.fail();
		}

	}
	/*
	 * Verify that the "PaymentID" filter functions correctly in the Trust Open tab
	 */
	public void verifyPaymentIDFilter(WebDriver driver) throws Exception {

		try {			mthName = new Object() {
			}.getClass().getEnclosingMethod().getName();

			objCM.onMouseHover(driver, objTP_2_OR.clearbutton2);
			//			driver.switchTo().frame("TrustProcess");


			if(objCM.checkElementVisibility(driver, objTP_2_OR.rundate)) {

				objCM.onMouseHover(driver, objTP_2_OR.rundate);
				objCM.onMouseHover(driver, objTP_2_OR.bymonthSelection);
				objCM.onMouseHover(driver, objTP_2_OR.byyearSelection);
				objCM.onMouseHover(driver, objTP_2_OR.yearSelelection);
				objCM.onMouseHover(driver, objTP_2_OR.monthSelection);
				//Webelelment exeption
				objCM.onMouseHover(driver, objTP_2_OR.dateSelection2);		
//				objCM.onMouseHover(driver, objProTrustOR.AdvancedFilterOption);
				String Payment_ID = getExcelData.readCell("ProcessTrust", "PaymentID");
				String ClientName2 = getExcelData.readCell("ProcessTrust", "ClientName1");
				System.out.println(Payment_ID);
				System.out.println(ClientName2);
				objCM.setText(driver, objProTrustOR.PaymentID,Payment_ID );
				objCM.onMouseHover(driver, objTP_2_OR.viewbutton2);
				
			}
			String ClientName2 = getExcelData.readCell("ProcessTrust", "ClientName2");
			String ExpCond=objCM.getText(driver, objProTrustOR.ExpCLientName);

			System.out.println("Expected data from updated filtered is ="+ ExpCond);


			if (ExpCond.equals(ClientName2)) {
				ExtentReportBuilder.ReportTestStep("PASSED", "List of records",
						"User is successfully able to find records using paymentID", mthName);
			} else {
				ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
						"User is not able to find records using paymentID", mthName);
			}
		} catch (Exception e) {
			ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
					"User is failed to find records using paymentID"+e, mthName);
			e.printStackTrace();
			Assert.fail();
		}


	}
	
//	String PaymentID = getExcelData.readCell("ProcessTrust", "PaymentID");
//	String ClientaName2 = getExcelData.readCell("ProcessTrust", "ClientName2");
//	objCM.setText(driver, objProTrustOR.PaymentID,PaymentID );
//	String ExpCond=objCM.getText(driver, objProTrustOR.ExpCLientName);
//	System.out.println("Expected data from updated filtered is ="+ ExpCond);
	/*
	 * Verify that the "Select Corporate Name" filter functions correctly in the Trust Open tab
	 */
	public void verifySelectorporateName(WebDriver driver) throws Exception {

		try {
			mthName = new Object() {
			}.getClass().getEnclosingMethod().getName();

			objCM.onMouseHover(driver, objTP_2_OR.clearbutton2);
			//			driver.switchTo().frame("TrustProcess");


			if(objCM.checkElementVisibility(driver, objTP_2_OR.rundate)) {

				objCM.onMouseHover(driver, objTP_2_OR.rundate);
				objCM.onMouseHover(driver, objTP_2_OR.bymonthSelection);	
				objCM.onMouseHover(driver, objTP_2_OR.byyearSelection);
				objCM.onMouseHover(driver, objTP_2_OR.yearSelelection);
				objCM.onMouseHover(driver, objTP_2_OR.monthSelection);
				//Webelelment exeption
				objCM.onMouseHover(driver, objTP_2_OR.dateSelection2);
//				objCM.onMouseHover(driver, objProTrustOR.AdvancedFilterOption);
				objCM.onMouseHover(driver, objProTrustOR.dropdownCorporatename);
				objCM.onMouseHover(driver, objProTrustOR.SelectClient);
				objCM.onMouseHover(driver, objProTrustOR.PaymentID);
				objCM.onMouseHover(driver, objTP_2_OR.viewbutton2);
				String ExpCond=objCM.getText(driver, objProTrustOR.ExpCLientName);
			}
			
			if (objCM.isElementPresent(driver, objTP_2_OR.ListCount)) {
				ExtentReportBuilder.ReportTestStep("PASSED", "List of records",
						"User can see results after selecting Option from Corporate name", mthName);
			} else {
				ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
						"User is not able to see results after selecting Option from corporate name", mthName);
			}
		} catch (Exception e) {
			ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
					"User failed to see results after selecting Option from corporate name"+e, mthName);
			e.printStackTrace();
			Assert.fail();
		}

	}
	/*
	 * Verify that the "Select Client Name" filter functions correctly in the Trust Open tab
	 */
	
	public void verifySelectClientNameOption(WebDriver driver) throws Exception {

		try {
			mthName = new Object() {
			}.getClass().getEnclosingMethod().getName();

			objCM.onMouseHover(driver, objTP_2_OR.clearbutton2);
			//			driver.switchTo().frame("TrustProcess");


			if(objCM.checkElementVisibility(driver, objTP_2_OR.rundate)) {

				objCM.onMouseHover(driver, objTP_2_OR.rundate);
				objCM.onMouseHover(driver, objTP_2_OR.bymonthSelection);	
				objCM.onMouseHover(driver, objTP_2_OR.byyearSelection);
				objCM.onMouseHover(driver, objTP_2_OR.yearSelelection);
				objCM.onMouseHover(driver, objTP_2_OR.monthSelection);
				//Webelelment exeption
				objCM.onMouseHover(driver, objTP_2_OR.dateSelection2);
//				objCM.onMouseHover(driver, objProTrustOR.AdvancedFilterOption);
				objCM.onMouseHover(driver, objProTrustOR.dropdownclientname);
				objCM.onMouseHover(driver, objProTrustOR.SelectClient1);
				objCM.onMouseHover(driver, objTP_2_OR.viewbutton2);
		
			}
			
			if (objCM.isElementPresent(driver, objTP_2_OR.ListCount)) {
				ExtentReportBuilder.ReportTestStep("PASSED", "List of records",
						"User can see results after selecting Option from Client name", mthName);
			} else {
				ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
						"User is not able to see results after selecting Option from Client name", mthName);
			}
		} catch (Exception e) {
			ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
					"User failed to see results after selecting Option from client name"+e, mthName);
			e.printStackTrace();
			Assert.fail();
		}
		driver.navigate().refresh();
	}
}
