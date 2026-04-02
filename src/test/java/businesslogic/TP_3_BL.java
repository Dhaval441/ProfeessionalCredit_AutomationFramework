package businesslogic;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import objectRepository.TP_2_OR;
import objectRepository.TP_3_OR;
import utilities.CommonMethods;
import utilities.ExtentReportBuilder;
import utilities.RWExcel;

public class TP_3_BL extends ExtentReportBuilder{

	public TP_3_BL() {
		// TODO Auto-generated constructor stub
	}
		String mthName;
	
	
		CommonMethods objCM = new CommonMethods();
		TP_3_OR objProTrustOR = new TP_3_OR();
		TP_2_OR objTP_2_OR =new TP_2_OR ();
		RWExcel getExcelData = new RWExcel();
		Duration due = Duration.ofSeconds(30);
	
		/*
		 * Navigation to Process Trust
		 */
		public void navigationProcessTrust(WebDriver driver) throws Exception {

			
			Thread.sleep(20000);
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
	 * Verify that clicking the Excel icon and selecting Excel for export type downloads a report that mirrors the “Report” (Excel) option in the Trust Processed screen, with results returned in a timely manner
	 */
	public void verifyexelreportdownloadpt(WebDriver driver) throws Exception {

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
			String ClientName2 = getExcelData.readCell("ProcessTrust", "ClientName2");
			objCM.setText(driver, objTP_2_OR.SearchFromOpenTrust,ClientName2 );
			String ExpCond=objCM.getText(driver, objProTrustOR.ActualClientname);

			System.out.println("Expected data from updated filtered is ="+ ExpCond);
			//Need to update code for open trust verification

			//Wait for actaul verification for excel download
			Actions a=new Actions(driver);
			objCM.onMouseHover(driver, objProTrustOR.ExcelReportDownload);
			Thread.sleep(15000);

			Runtime.getRuntime().exec("C:\\Users\\mangesh.gadekar\\Documents\\AutoIT\\ClickOnSaveWS.exe");

			Thread.sleep(5000);
			
			if (ExpCond.equals(ClientName2)) {
				ExtentReportBuilder.ReportTestStep("PASSED", "List of records",
						"User is successfully able to download excel report using single client name", mthName);
			} else {
				ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
						"User not able to download excel report using single client name", mthName);
			}
		} catch (Exception e) {
			ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
					"User failed to download excel report of single client in open trust process"+e, mthName);
			e.printStackTrace();
			Assert.fail();
		}

	}
	
	/*
	 * Verify that clicking the Excel icon and selecting PDF for export type downloads a report that mirrors the “Collection Activity” (PDF) option in the Trust Processed screen, with results returned in a timely manner
	 */
	public void verifypdfreportdownloadpt(WebDriver driver) throws Exception {

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

				objCM.onMouseHover(driver, objTP_2_OR.viewButton);
			}
			String ClientName2 = getExcelData.readCell("ProcessTrust", "ClientName2");
			objCM.setText(driver, objTP_2_OR.SearchFromOpenTrust,ClientName2 );
			String ExpCond=objCM.getText(driver, objProTrustOR.ActualClientname);

			System.out.println("Expected data from updated filtered is ="+ ExpCond);

			//Need to update code for open trust verification


			//Wait for actaul verification for excel download
			Actions a=new Actions(driver);
			objCM.onMouseHover(driver, objProTrustOR.PDFReportDownload);

			Thread.sleep(15000);
			Runtime.getRuntime().exec("C:\\Users\\mangesh.gadekar\\Documents\\AutoIT\\ClickOnSaveWS2.exe");



			if (ExpCond.equals(ClientName2)) {
				ExtentReportBuilder.ReportTestStep("PASSED", "List of records",
						"User is successfully able to download pdf report using single client name", mthName);
			} else {
				ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
						"User is not able to download pdf report using single client name", mthName);
			}
		} catch (Exception e) {
			ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
					"User failed to download pdf report of single client in open trust process"+e, mthName);
			e.printStackTrace();
			Assert.fail();
		}


	}
	
	/*
	 * Verify that selecting one or more records and clicking the printer icon downloads a single PDF report that combines all selected records, mirroring the “Collection Activity” (PDF) option in the Trust Processed screen
	 */
	
	public void verifycombinedreportdownloadpt(WebDriver driver) throws Exception {

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

				objCM.onMouseHover(driver, objTP_2_OR.viewButton);
			}
			String ClientName2 = getExcelData.readCell("ProcessTrust", "ClientName2");
			objCM.setText(driver, objTP_2_OR.SearchFromOpenTrust,ClientName2 );
			String ExpCond=objCM.getText(driver, objProTrustOR.ActualClientname);

			System.out.println("Expected data from updated filtered is ="+ ExpCond);

			//Wait for actaul verification for excel download
			Actions a=new Actions(driver);
			objCM.onMouseHover(driver, objProTrustOR.CombinedCheckbox);

			objCM.onMouseHover(driver, objProTrustOR.CombinedPDFDownload);


			Thread.sleep(5000);
			Runtime.getRuntime().exec("C:\\Users\\mangesh.gadekar\\Documents\\AutoIT\\ClickOnSaveWS3.exe");
			Thread.sleep(5000);

			//Need to update code for open trust verification
			objCM.setText(driver, objTP_2_OR.SearchFromOpenTrust,"");

		
			if (ExpCond.equals(ClientName2)) {
				ExtentReportBuilder.ReportTestStep("PASSED", "List of records",
						"User is successfully able to download combined report using single client name", mthName);
			} else {
				ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
						"User is not able to download combined report using single client name", mthName);
			}
		} catch (Exception e) {
			ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
					"User failed to download combined report of single client in open trust process"+e, mthName);
			e.printStackTrace();
			Assert.fail();
		}

//		driver.navigate().refresh();
	}
	
}


