package businesslogic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import objectRepository.TP_20_OR;
import objectRepository.TP_27_OR;
import objectRepository.TP_2_OR;
import utilities.CommonMethods;
import utilities.ExtentReportBuilder;
import utilities.RWExcel;

public class TP_27_BL extends ExtentReportBuilder{

	public TP_27_BL() {
		// TODO Auto-generated constructor stub
	}
	String mthName;
	CommonMethods objCM = new CommonMethods();
	TP_27_OR objProTrustOR = new TP_27_OR();
	TP_2_OR objTP_2_OR =new TP_2_OR ();
	RWExcel getExcelData = new RWExcel();
	Duration due = Duration.ofSeconds(30);
	/*
	 * Navigation
	 */
	public void navigationProcessedTrust(WebDriver driver) throws Exception {

		
		Thread.sleep(15000);
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
	 * Verify "Invoice #" and "Invoice" Columns Are Moved to Trust Processed Tab`
	 */
	public void VerifyInvoiceColumn(WebDriver driver) throws Exception {
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
				objCM.onMouseHover(driver, objProTrustOR.InvoiceColumn);
				
				//need to change Xpath following Webelemnt
				objCM.listObjecLocater(driver, objProTrustOR.InvoiceColumn);

			}
			/*
			 * Need to update code for Processed trust verification
			 */
			Thread.sleep(2000);
			if (objCM.isElementPresent(driver, objProTrustOR.InvoiceColumn)) {
				ExtentReportBuilder.ReportTestStep("PASSED", "List of records",
						"User successfully able to see the Invoice Column", mthName);
			} else {
				ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
						"User not able to see the Invoice Column", mthName);
			}
		} catch (Exception e) {
			ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
					"User failed to see the Invoice Column"+e, mthName);
			e.printStackTrace();
			Assert.fail();
		}
		objCM.onMouseHover(driver, objProTrustOR.ClearFilter);
	}
	/*
	 * Verify "Invoice #" Column Header and Name
	 */
	public void VerifyInvoiceHeader(WebDriver driver) throws Exception {
		try {
			mthName = new Object() {
			}.getClass().getEnclosingMethod().getName();
//			driver.switchTo().frame("TrustProcess");

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
				objCM.onMouseHover(driver, objProTrustOR.InvoiceColumn);
				String ActualName=objCM.getText(driver, objProTrustOR.InvoiceColumn);
				System.out.println(ActualName);
				//need to change Xpath following Webelemnt
				objCM.listObjecLocater(driver, objProTrustOR.InvoiceColumn);

			}
			/*
			 * Need to update code for Processed trust verification
			 */
			Thread.sleep(2000);
			if (objCM.isElementPresent(driver, objProTrustOR.InvoiceColumn)) {
				ExtentReportBuilder.ReportTestStep("PASSED", "List of records",
						"User successfully able to see the header of invoice column", mthName);
			} else {
				ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
						"User not able to see tthe header of invoice column", mthName);
			}
		} catch (Exception e) {
			ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
					"User failed to see the header of invoice column"+e, mthName);
			e.printStackTrace();
			Assert.fail();
		}
	
	}
	/*
	 * Verify "Invoice" Column Header and Name
	 */
	public void VerifyInvoiceName(WebDriver driver) throws Exception {
		try {
			mthName = new Object() {
			}.getClass().getEnclosingMethod().getName();
//			driver.switchTo().frame("TrustProcess");

			if(objCM.checkElementVisibility(driver, objProTrustOR.ValidationTab)) {
				objCM.onMouseHover(driver, objProTrustOR.InvoiceColumnName);
				String ActualName=objCM.getText(driver, objProTrustOR.InvoiceColumnName);
				System.out.println(ActualName);
				//need to change Xpath following Webelemnt
				objCM.listObjecLocater(driver, objProTrustOR.InvoiceColumnName);

			}
			/*
			 * Need to update code for Processed trust verification
			 */
			Thread.sleep(2000);
			if (objCM.isElementPresent(driver, objProTrustOR.InvoiceColumnName)) {
				ExtentReportBuilder.ReportTestStep("PASSED", "List of records",
						"User successfully able to see the name of invoice column", mthName);
			} else {
				ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
						"User not able to see tthe header of name column", mthName);
			}
		} catch (Exception e) {
			ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
					"User failed to see the header of name column"+e, mthName);
			e.printStackTrace();
			Assert.fail();
		}
	}
	/*
	 * Verify PDF Icon in the "Invoice" Column
	 */
	public void VerifyInvoicePDFIcon(WebDriver driver) throws Exception {
		try {
			mthName = new Object() {
			}.getClass().getEnclosingMethod().getName();
//			driver.switchTo().frame("TrustProcess");

			if(objCM.checkElementVisibility(driver, objProTrustOR.ValidationTab)) {
//				objCM.onMouseHover(driver, objProTrustOR.InvoicePDFIcon);
				
				//need to change Xpath following Webelemnt
				objCM.listObjecLocater(driver, objProTrustOR.InvoicePDFIcon);

			}
			/*
			 * Need to update code for Processed trust verification
			 */
			Thread.sleep(2000);
			if (objCM.isElementPresent(driver, objProTrustOR.InvoicePDFIcon)) {
				ExtentReportBuilder.ReportTestStep("PASSED", "List of records",
						"User successfully able to see the PDF Icon in invoice column", mthName);
			} else {
				ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
						"User not able to see the PDF Icon in invoice column", mthName);
			}
		} catch (Exception e) {
			ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
					"User failed to see the PDF Icon in invoice column"+e, mthName);
			e.printStackTrace();
			Assert.fail();
		}
	}
	/*
	 * Verify "Invoice" column printer icon dropdown
	 */
	public void VerifyInvoicePrintDrpDwnOption(WebDriver driver) throws Exception {
		try {
			mthName = new Object() {
			}.getClass().getEnclosingMethod().getName();
//			driver.switchTo().frame("TrustProcess");

			if(objCM.checkElementVisibility(driver, objProTrustOR.ValidationTab)) {
				objCM.onMouseHover(driver, objProTrustOR.InvoicePritDrpdwn);
				
				
				//need to change Xpath following Webelemnt
				objCM.listObjecLocater(driver, objProTrustOR.CompbinedVerify);
				objCM.listObjecLocater(driver, objProTrustOR.IndivisualVerify);
				Thread.sleep(2000);

			}
			/*
			 * Need to update code for Processed trust verification
			 */
			Thread.sleep(2000);
			if (objCM.isElementPresent(driver, objProTrustOR.CompbinedVerify)) {
				ExtentReportBuilder.ReportTestStep("PASSED", "List of records",
						"User successfully able to see the both option in drpdown", mthName);
			} else {
				ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
						"User not able to see the both option in drpdown", mthName);
			}
		} catch (Exception e) {
			ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
					"User failed to see the both option in drpdown"+e, mthName);
			e.printStackTrace();
			Assert.fail();
		}
		objCM.onMouseHover(driver, objProTrustOR.ClearFilter);
	}
	/*
	 * Verify Combined Report Export from Printer Icon
	 */
	public void verifyCombinedExport(WebDriver driver) throws Exception {
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
					
					objCM.onMouseHover(driver, objProTrustOR.SelectClient1);
					objCM.onMouseHover(driver, objProTrustOR.InvoicePritDrpdwn);
					objCM.onMouseHover(driver, objProTrustOR.CompbinedVerify);
					System.out.println( objCM.getText(driver, objProTrustOR.ExportSuccesToastMsg));
					
				}
				/*
				 * Need to update code for Processed trust verification
				 */
				Thread.sleep(2000);
				if (objCM.isElementPresent(driver, objProTrustOR.listCount)) {
					ExtentReportBuilder.ReportTestStep("PASSED", "List of records",
							"User successfully abel to export PDf of combined report of selected client", mthName);
				} else {
					ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
							"User not abel to export PDf of combined report of selected client", mthName);
				}
			} catch (Exception e) {
				ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
						"User failed to export PDf of combined report of selected client"+e, mthName);
				e.printStackTrace();
				Assert.fail();
			}
			objCM.onMouseHover(driver, objProTrustOR.ClearFilter);
		}
	/*
	 * Verify Individual Reports Export from Printer Icon
	 */
	public void verifyIndivisualExport(WebDriver driver) throws Exception {
		//	int i;
		try {
			mthName = new Object() {
			}.getClass().getEnclosingMethod().getName();
//			driver.switchTo().frame("TrustProcess");
			Thread.sleep(5000);

			if(objCM.checkElementVisibility(driver, objProTrustOR.ValidationTab)) {
				objCM.onMouseHover(driver, objProTrustOR.ProcessedTrustTab);
				objCM.onMouseHover(driver, objProTrustOR.CustomDateOption);
				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
				wait.until(ExpectedConditions.visibilityOfElementLocated(objProTrustOR.EnterFromDate));
				objCM.setText(driver, objProTrustOR.EnterFromDate,"01/01/2025");
				objCM.setText(driver, objProTrustOR.EnterToDate, "03/25/2026");
				objCM.onMouseHover(driver, objProTrustOR.ApplyButton);
				objCM.onMouseHover(driver, objProTrustOR.ViewButton);
				//need to change Xpath following Webelemnt
				objCM.listObjecLocater(driver, objProTrustOR.listRe);
				objCM.listObjecLocater(driver, objProTrustOR.listCount);
				
				objCM.onMouseHover(driver, objProTrustOR.SelectClient1);
				objCM.onMouseHover(driver, objProTrustOR.InvoicePritDrpdwn);
				objCM.onMouseHover(driver, objProTrustOR.IndivisualVerify);
				
			}
				/*
				 * Need to update code for Processed trust verification
				 */
			String ActualSuccessmsg =objCM.getText(driver, objProTrustOR.ExportSuccesToastMsg);
			String ExpToastMsg = getExcelData.readCell("ProcessTrust", "IndivisualSuccessMsg");
			System.out.println(ExpToastMsg);
				Thread.sleep(2000);
				if (ExpToastMsg.equals(ActualSuccessmsg)) {
					ExtentReportBuilder.ReportTestStep("PASSED", "List of records",
							"User successfully abel to export PDf of indivisual report of selected client", mthName);
				} else {
					ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
							"User not abel to export PDf of indivisual report of selected client", mthName);
				}
			} catch (Exception e) {
				ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
						"User failed to export PDf of indivisual report of selected client"+e, mthName);
				e.printStackTrace();
				Assert.fail();
			}
			objCM.onMouseHover(driver, objProTrustOR.ClearFilter);
			
		}
	/*
	 *  Verify Reduced Width of "Status" Column
	 */
	public void VerifyWidthStatusColumn(WebDriver driver) throws Exception {
		try {
			mthName = new Object() {
			}.getClass().getEnclosingMethod().getName();
//			driver.switchTo().frame("TrustProcess");
			Thread.sleep(5000);

			if(objCM.checkElementVisibility(driver, objProTrustOR.ValidationTab)) {
				objCM.onMouseHover(driver, objProTrustOR.ProcessedTrustTab);
				objCM.onMouseHover(driver, objProTrustOR.CustomDateOption);
				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
				wait.until(ExpectedConditions.visibilityOfElementLocated(objProTrustOR.EnterFromDate));
				objCM.setText(driver, objProTrustOR.EnterFromDate,"01/01/2025");
				objCM.setText(driver, objProTrustOR.EnterToDate, "03/25/2026");
				objCM.onMouseHover(driver, objProTrustOR.ApplyButton);
				objCM.onMouseHover(driver, objProTrustOR.ViewButton);
				//need to change Xpath following Webelemnt
				objCM.listObjecLocater(driver, objProTrustOR.listRe);
				objCM.listObjecLocater(driver, objProTrustOR.listCount);
				
				//need to change Xpath following Webelemnt
				objCM.listObjecLocater(driver, objProTrustOR.StatusColumn);
				objCM.listObjecLocater(driver, objProTrustOR.StatusColumn);

			}
			/*
			 * Need to update code for Processed trust verification
			 */
			Thread.sleep(2000);
			if (objCM.isElementPresent(driver, objProTrustOR.StatusColumn)) {
				ExtentReportBuilder.ReportTestStep("PASSED", "List of records",
						"User successfully able to see the changed size of status column", mthName);
			} else {
				ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
						"User not able to see the changed size of status column", mthName);
			}
		} catch (Exception e) {
			ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
					"User failed to see the changed size of status column"+e, mthName);
			e.printStackTrace();
			Assert.fail();
		}
		objCM.onMouseHover(driver, objProTrustOR.ClearFilter);
	}
	/*
	 * Verify "Invoice Date" Filter
	 */
	public void VerifyInvoiceDateremoved(WebDriver driver) throws Exception {
		try {
			mthName = new Object() {
			}.getClass().getEnclosingMethod().getName();
//			driver.switchTo().frame("TrustProcess");

			if(objCM.checkElementVisibility(driver, objProTrustOR.ValidationTab)) {
				objCM.onMouseHover(driver, objProTrustOR.AdvancedFilterButton);
				objCM.onMouseHover(driver, objProTrustOR.RemovalInvoiceDate);
				
				
				//need to change Xpath following Webelemnt
				objCM.listObjecLocater(driver, objProTrustOR.RemovalInvoiceDate);
				objCM.listObjecLocater(driver, objProTrustOR.RemovalInvoiceDate);

			}
			/*
			 * Need to update code for Processed trust verification
			 */
			Thread.sleep(2000);
			if (objCM.isElementPresent(driver, objProTrustOR.RemovalInvoiceDate)) {
				ExtentReportBuilder.ReportTestStep("PASSED", "List of records",
						"User successfully able to see removed filter of invoice date", mthName);
			} else {
				ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
						"User not able to see removed filter of invoice date", mthName);
			}
		} catch (Exception e) {
			ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
					"User failed to see removed filter of invoice date"+e, mthName);
			e.printStackTrace();
			Assert.fail();
		}
		objCM.onMouseHover(driver, objProTrustOR.AdvClearButton);
	}
	/*
	 * Verify "Invoice #" Filter
	 */
	public void verifyInvoicefilter(WebDriver driver) throws Exception {
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
		
					objCM.onMouseHover(driver, objProTrustOR.AdvViewButton);
					//need to change Xpath following Webelemnt
					objCM.setText(driver, objProTrustOR.InvoiceSetText, "1829,4311");
					
					objCM.onMouseHover(driver, objProTrustOR.InvoiceAvail);
//					objCM.onMouseHover(driver, objProTrustOR.IndivisualVerify);
					objCM.onMouseHover(driver, objProTrustOR.AdvViewButton);
					objCM.listObjecLocater(driver, objProTrustOR.listRe);
					objCM.listObjecLocater(driver, objProTrustOR.listCount);
				}
				/*
				 * Need to update code for Processed trust verification
				 */
				Thread.sleep(2000);
				if (objCM.isElementPresent(driver, objProTrustOR.listCount)) {
					ExtentReportBuilder.ReportTestStep("PASSED", "List of records",
							"User successfully abel to see invoice # filter and able to search with maultiple string including comma", mthName);
				} else {
					ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
							"User not abel to see invoice # filter and able to search with maultiple string including comma", mthName);
				}
			} catch (Exception e) {
				ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
						"User failed to see invoice # filter and able to search with maultiple string including comma"+e, mthName);
				e.printStackTrace();
				Assert.fail();
			}
			objCM.onMouseHover(driver, objProTrustOR.AdvClearButton);
			driver.navigate().refresh();
		}
}
