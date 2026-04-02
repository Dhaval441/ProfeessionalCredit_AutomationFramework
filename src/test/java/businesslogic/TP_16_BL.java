package businesslogic;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import objectRepository.TP_15_OR;
import objectRepository.TP_16_OR;
import objectRepository.TP_2_OR;
import utilities.CommonMethods;
import utilities.ExtentReportBuilder;
import utilities.RWExcel;

public class TP_16_BL extends ExtentReportBuilder{

	public TP_16_BL () {
		// TODO Auto-generated constructor stub
	}
	String mthName;
	CommonMethods objCM = new CommonMethods();
	TP_16_OR objProTrustOR = new TP_16_OR();
	TP_2_OR objTP_2_OR =new TP_2_OR ();
	RWExcel getExcelData = new RWExcel();
	Duration due = Duration.ofSeconds(30);
	
	public void navigationProcessedTrust(WebDriver driver) throws Exception {

//		objCM.onMouseHover(driver, objProTrustOR.fa_refresh);	
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
	 * Verify that the Processed Type and ERP Export Type columns are added in the Trust Processed screen
	 */
	public void verifytrustERPtable(WebDriver driver) throws Exception {
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
				if (objCM.checkElementVisibility(driver, objProTrustOR.listRe)) {
					ExtentReportBuilder.ReportTestStep("PASSED", "List of records",
							"User successfully able to see the list of ERP table in Processed trust", mthName);
				} else {
					ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
							"User is not able to see the list of ERP table in Processed trust", mthName);
				}
			} catch (Exception e) {
				ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
						"User failed to see the list of ERP table in Processed trust"+e, mthName);
				e.printStackTrace();
				Assert.fail();
			}
			objCM.onMouseHover(driver, objProTrustOR.ClearFilter);
		}
	/*
	 *Verify that the Corporate Summary Required column is added to the Trust Processed grid
	 */
	public void verifytrustCorporateSummtable(WebDriver driver) throws Exception {
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
				Thread.sleep(2000);
				if (objCM.checkElementVisibility(driver, objProTrustOR.CorposrateSummaryReqTable)) {
					ExtentReportBuilder.ReportTestStep("PASSED", "List of records",
							"User successfully able to see the list of Corporate Summary table in Processed trust", mthName);
				} else {
					ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
							"User is not able to see the list of  Corporate Summary table in Processed trust", mthName);
				}
			} catch (Exception e) {
				ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
						"User failed to see the list of  Corporate Summary table in Processed trust"+e, mthName);
				e.printStackTrace();
				Assert.fail();
			}
			objCM.onMouseHover(driver, objProTrustOR.ClearFilter);
		}
	/*
	 * Verify that the Trust Frequency column is added to the Trust Processed grid 
	 */
	
	public void verifytrustFreqSummtable(WebDriver driver) throws Exception {
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
				Thread.sleep(2000);
				if (objCM.checkElementVisibility(driver, objProTrustOR.TrustFreqTable)) {
					ExtentReportBuilder.ReportTestStep("PASSED", "List of records",
							"User successfully able to see the list of Trust Frequency table in Processed trust", mthName);
				} else {
					ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
							"User is not able to see the list of  Trust Frequency table in Processed trust", mthName);
				}
			} catch (Exception e) {
				ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
						"User failed to see the list of  Trust Frequency table in Processed trust"+e, mthName);
				e.printStackTrace();
				Assert.fail();
			}
			objCM.onMouseHover(driver, objProTrustOR.ClearFilter);
			driver.navigate().refresh();
		}
}
