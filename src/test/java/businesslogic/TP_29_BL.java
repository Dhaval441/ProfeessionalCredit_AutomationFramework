package businesslogic;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.openqa.selenium.support.ui.Select;

import objectRepository.TP_27_OR;
import objectRepository.TP_29_OR;
import objectRepository.TP_2_OR;
import utilities.CommonMethods;
import utilities.ExtentReportBuilder;
import utilities.RWExcel;

public class TP_29_BL extends ExtentReportBuilder{

	public TP_29_BL() {
		// TODO Auto-generated constructor stub
	}

	String mthName;
	CommonMethods objCM = new CommonMethods();
	TP_29_OR objProTrustOR = new TP_29_OR();
	TP_2_OR objTP_2_OR =new TP_2_OR ();
	RWExcel getExcelData = new RWExcel();
	Duration due = Duration.ofSeconds(30);
	/*
	 * 1.Verify Navigation to the New "Invoices" Screen
	 */
	/*
	 * 2.Verify that the “Invoices” tab is loaded by default
	 */
	public void navigationInvoiceTab(WebDriver driver) throws Exception {


		Thread.sleep(15000);
		objCM.waitUntillVisibilityOfElement(driver, objProTrustOR.menubutton,due);
		try {
			mthName = new Object() {
			}.getClass().getEnclosingMethod().getName();

			objCM.onMouseHover(driver, objProTrustOR.menubutton);
			objCM.onMouseHover_withoutClick(driver, objProTrustOR.AccountingButtonn);
			//			objCM.onMouseHover(driver, objProTrustOR.processtrustButton);
			//			objCM.onMouseHover(driver, objProssdTrustOR.processedTrustTab);
			objCM.onMouseHover(driver, objProTrustOR.invoiceTab);
			if (objCM.isElementPresent(driver, objProTrustOR.mainTab)) {
				ExtentReportBuilder.ReportTestStep("PASSED", "PASS",
						"User navigated successfully to the invoice tab", mthName);
			} else {
				ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
						"User not  able to navigate successfully to the invoice tab", mthName);
			}
		} catch (Exception e) {
			ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
					"User failed to navigate invoice tab"+e, mthName);
			e.printStackTrace();
			Assert.fail();
		}

	}
	/*
	 * 2.Verify that the “Invoices” tab is loaded by default
	 */

	/*
	 * 3.Verify combined features from legacy tabs
	 */
	public void VerifyInvoiceCombinedFeatures(WebDriver driver) throws Exception {
		try {
			mthName = new Object() {
			}.getClass().getEnclosingMethod().getName();
			driver.switchTo().frame("invoices");

			if(objCM.checkElementVisibility(driver, objProTrustOR.ViewOutstandingBtn)) {
				objCM.onMouseHover(driver, objProTrustOR.ViewOutstandingBtn);
				Thread.sleep(10000);
				objCM.isElementPresent(driver, objProTrustOR.RecievablesHieghlight);
				objCM.onMouseHover(driver, objProTrustOR.AddInvoice);
				objCM.isElementPresent(driver, objProTrustOR.processInvoiceBtn);
				objCM.onMouseHover(driver, objProTrustOR.ProcessPopUpCloseBtn);
				objCM.isElementPresent(driver, objProTrustOR.ReverseFunBtn);
				

			}
			/*
			 * Need to update code for Processed trust verification
			 */
			Thread.sleep(2000);
			if (objCM.isElementPresent(driver, objProTrustOR.ReverseFunBtn)) {
				ExtentReportBuilder.ReportTestStep("PASSED", "List of records",
						"User successfully able to access existing fucnctionalities as per lagecy application", mthName);
			} else {
				ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
						"User not able to access existing fucnctionalities as per lagecy application", mthName);
			}
		} catch (Exception e) {
			ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
					"User failed to access existing fucnctionalities as per lagecy application"+e, mthName);
			e.printStackTrace();
			Assert.fail();
		}
		objCM.onMouseHover(driver, objProTrustOR.ClearButton);
	}
	/*
	 * 4.Verify “Invoice Open” Functionality in the New Screen
	 * /*
	 * 5.Verify “Invoice Processed” Functionality in the New Screen
	 */
	 
	public void VerifyInvoiceOpenFunctionality(WebDriver driver) throws Exception {
		try {
			mthName = new Object() {
			}.getClass().getEnclosingMethod().getName();
//			driver.switchTo().frame("invoices");

			if(objCM.checkElementVisibility(driver, objProTrustOR.ViewOutstandingBtn)) {
				objCM.onMouseHover(driver, objProTrustOR.ViewOutstandingBtn);
				Thread.sleep(10000);
				objCM.onMouseHover(driver, objProTrustOR.AddInvoice);
				objCM.setText(driver, objProTrustOR.AddInvoiceDate, "03-02-2026");
				objCM.setText(driver, objProTrustOR.ClientDrpDwn, "Test ODR");
				objCM.onMouseHover(driver, objProTrustOR.ClientDrpDwn);
				// Create object of Actions class
				Actions action = new Actions(driver);
				Thread.sleep(2000);
				// Press ENTER key
				action.sendKeys(Keys.ENTER).perform();

				objCM.setText(driver, objProTrustOR.ManualAmt, "123");
				objCM.setText(driver, objProTrustOR.ManualNotes, "abc");	
				objCM.setText(driver, objProTrustOR.ManualDescription, "xyz");
				objCM.onMouseHover(driver, objProTrustOR.processInvoiceBtn);
			
				
			}
			/*
			 * Need to update code for Processed trust verification
			 */
			String ActualSuccessmsg =objCM.getText(driver, objProTrustOR.SuccessToastMsg);
			String ExpToastMsg = getExcelData.readCell("ProcessTrust", "AddInvoiceToastMsg");
			System.out.println(ExpToastMsg);
			Thread.sleep(2000);
			if (ExpToastMsg.equals(ActualSuccessmsg)) {
				ExtentReportBuilder.ReportTestStep("PASSED", "List of records",
						"User is successfully able to Add new invoice", mthName);
			} else {
				ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
						"User is not able to Add new invoice", mthName);
			}
		} catch (Exception e) {
			ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
					"User failed able to Add new invoice"+e, mthName);
			e.printStackTrace();
			Assert.fail();
		}
		objCM.onMouseHover(driver, objProTrustOR.ClearButton);
	}

	

	/*
	 * 6.Verify “Receivables” Functionality in the New Screen
	 */
	 
		public void VerifyReceivablesFunctionality(WebDriver driver) throws Exception {
			try {
				mthName = new Object() {
				}.getClass().getEnclosingMethod().getName();
//				driver.switchTo().frame("invoices");

				if(objCM.checkElementVisibility(driver, objProTrustOR.ViewOutstandingBtn)) {
					objCM.onMouseHover(driver, objProTrustOR.ViewOutstandingBtn);
					Thread.sleep(10000);
					objCM.onMouseHover(driver, objProTrustOR.PostButton);
					objCM.setText(driver, objProTrustOR.AmtReceived, "10");
					objCM.onMouseHover(driver, objProTrustOR.PaymentDrpDwn);
					WebElement paymentType = driver.findElement(By.id("cmbInvoicePaymentType"));

					Select select = new Select(paymentType);
					select.selectByVisibleText("Adjustment");
					objCM.onMouseHover(driver, objProTrustOR.PaymentDrpDwn);
					objCM.setText(driver, objProTrustOR.NotesText, "Abc");
					objCM.onMouseHover(driver, objProTrustOR.ReceivedProcessbtn);

					
				}
				/*
				 * Need to update code for Processed trust verification
				 */
				String PostSuccessToast=objCM.getText(driver, objProTrustOR.SuccessToastMsg1);
				String ExpToastMsg = getExcelData.readCell("ProcessTrust", "PostSuccesToasTMsg");
				System.out.println(ExpToastMsg);
				Thread.sleep(2000);
				if (ExpToastMsg.equals(PostSuccessToast )) {
					ExtentReportBuilder.ReportTestStep("PASSED", "List of records",
							"User is successfully able to post and make the update in stutus in invoice", mthName);
				} else {
					ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
							"User is not able to post and make the update in stutus in invoice", mthName);
				}
			} catch (Exception e) {
				ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
						"User failed to post and make the update in stutus in invoice"+e, mthName);
				e.printStackTrace();
				Assert.fail();
			}
			objCM.onMouseHover(driver, objProTrustOR.ClearButton);
		}

	/*
	 * 7.Verify “Reverse” Functionality in the New Screen
	 */
		public void VerifyInvoiceReverseFunctionality(WebDriver driver) throws Exception {
			try {
				mthName = new Object() {
				}.getClass().getEnclosingMethod().getName();
//				driver.switchTo().frame("invoices");

				if(objCM.checkElementVisibility(driver, objProTrustOR.ViewOutstandingBtn)) {
					objCM.onMouseHover(driver, objProTrustOR.ViewOutstandingBtn);
					Thread.sleep(10000);
					objCM.setText(driver, objProTrustOR.ClientSearch, "Test ODR");
					objCM.onMouseHover(driver, objProTrustOR.ClientSearch);
					// Create object of Actions class
					Actions action = new Actions(driver);
					Thread.sleep(2000);
					// Press ENTER key
					action.sendKeys(Keys.ENTER).perform();

					objCM.onMouseHover(driver, objProTrustOR.ViewAll);
					objCM.waitUntillElementClickable(driver,objProTrustOR.ReverseButton, due);
				
					
				}
				/*
				 * Need to update code for Processed trust verification
				 */
				if (objCM.isElementPresent(driver, objProTrustOR.ReverseButton)) {
					ExtentReportBuilder.ReportTestStep("PASSED", "List of records",
							"User successfully able to click on reverse button", mthName);
				} else {
					ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
							"User not able to click on reverse button", mthName);
				}
			} catch (Exception e) {
				ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
						"User failed to click on reverse button"+e, mthName);
				e.printStackTrace();
				Assert.fail();
			}
			objCM.onMouseHover(driver, objProTrustOR.ClearButton);
		}

	/*
	 * 8.Verify UI consistency with the “Process Trust” screen
	 */
		public void VerifyUICompareOfInvoiceProcessTrust(WebDriver driver) throws Exception {
			try {
				mthName = new Object() {
				}.getClass().getEnclosingMethod().getName();
//				driver.switchTo().frame("invoices");

				if(objCM.checkElementVisibility(driver, objProTrustOR.ViewOutstandingBtn)) {
					objCM.onMouseHover(driver, objProTrustOR.ViewOutstandingBtn);
					objCM.onMouseHover(driver, objProTrustOR.RecievablesHieghlight);
					Thread.sleep(10000);
					driver.switchTo().defaultContent();
					objCM.onMouseHover(driver, objProTrustOR.menubutton);
					
					objCM.onMouseHover_withoutClick(driver, objProTrustOR.AccountingButtonn);
					objCM.onMouseHover(driver, objProTrustOR.processtrustButton);
					driver.switchTo().frame("TrustProcess");
					objCM.setText(driver, objProTrustOR.DatePickeer, "03-03-2026");
					objCM.onMouseHover(driver, objProTrustOR.DatePickeer);
					
					objCM.onMouseHover(driver, objProTrustOR.Viewbtn);
					
					objCM.listObjecLocater(driver, objProTrustOR.filtereddata);
					///nned to update XPATH
					driver.switchTo().defaultContent();
					objCM.onMouseHover(driver, objProTrustOR.SwitchBtn);
					driver.switchTo().frame("invoices");
				
				}
				/*
				 * Need to update code for Processed trust verification
				 */
				if (objCM.isElementPresent(driver, objProTrustOR.ViewOutstandingBtn)) {
					ExtentReportBuilder.ReportTestStep("PASSED", "List of records",
							"User successfully able to See the both screen are alighend same", mthName);
				} else {
					ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
							"User not able to See the both screen are alighend same", mthName);
				}
			} catch (Exception e) {
				ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
						"User failed to See the both screen are alighend same"+e, mthName);
				e.printStackTrace();
				Assert.fail();
			}
//			objCM.onMouseHover(driver, objProTrustOR.ClearButton);
		}
	/*
	 * 9. Verify All Filters and Actions in the New Screen
	 */
		public void VerifyInvoiceFiltersFunctionality(WebDriver driver) throws Exception {
			try {
				mthName = new Object() {
				}.getClass().getEnclosingMethod().getName();
//				driver.switchTo().frame("invoices");
				if(objCM.checkElementVisibility(driver, objProTrustOR.ViewOutstandingBtn)) {
					objCM.onMouseHover(driver, objProTrustOR.ViewOutstandingBtn);
					Thread.sleep(10000);
					objCM.setText(driver, objProTrustOR.ClientSearch, "Test ODR");
					objCM.onMouseHover(driver, objProTrustOR.ClientSearch);
					// Create object of Actions class
					Actions action = new Actions(driver);
					Thread.sleep(2000);
					// Press ENTER key
					action.sendKeys(Keys.ENTER).perform();
					objCM.setText(driver, objProTrustOR.InvoiceFilterDaterange, "11/01/2025 to 03/09/2026");
					objCM.setText(driver, objProTrustOR.InvoiceIDs, "4313,4314");
					objCM.onMouseHover(driver, objProTrustOR.ViewAll);
					objCM.listObjecLocater(driver, objProTrustOR.listRe);
				
					
				}
				/*
				 * Need to update code for Processed trust verification
				 */
				if (objCM.isElementPresent(driver, objProTrustOR.listRe)) {
					ExtentReportBuilder.ReportTestStep("PASSED", "List of records",
							"User successfully able to use all three filters for invoice tab", mthName);
				} else {
					ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
							"User not able to use all three filters for invoice tab", mthName);
				}
			} catch (Exception e) {
				ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
						"User failed to use all three filters for invoice tab"+e, mthName);
				e.printStackTrace();
				Assert.fail();
			}
			objCM.onMouseHover(driver, objProTrustOR.ClearButton);
		}

	/*
	 * 10.Verify the Display of Columns in the Invoices Tab
	 */
		public void VerifyInvoiceNewColumn(WebDriver driver) throws Exception {
			try {
				mthName = new Object() {
				}.getClass().getEnclosingMethod().getName();
//				driver.switchTo().frame("invoices");
				if(objCM.checkElementVisibility(driver, objProTrustOR.ViewOutstandingBtn)) {
					objCM.onMouseHover(driver, objProTrustOR.ViewOutstandingBtn);
					Thread.sleep(10000);
			
				}
				String InvoiceReportActual=	objCM.getText(driver, objProTrustOR.InvoiceReportActual);
				String BillingSummaryActual	=objCM.getText(driver, objProTrustOR.BillingSummaryActual);
				String StatusActual =	objCM.getText(driver, objProTrustOR.StatusActual);
				String ActionActual	=objCM.getText(driver, objProTrustOR.ActionActual);
				System.out.println(InvoiceReportActual);	
				System.out.println(BillingSummaryActual);
				System.out.println(StatusActual);
				System.out.println(ActionActual);
//				String ExpToastMsg = getExcelData.readCell("ProcessTrust", "PostSuccesToasTMsg");
//				String ExpToastMsg = getExcelData.readCell("ProcessTrust", "PostSuccesToasTMsg");
//				String ExpToastMsg = getExcelData.readCell("ProcessTrust", "PostSuccesToasTMsg");
//				String ExpToastMsg = getExcelData.readCell("ProcessTrust", "PostSuccesToasTMsg");

				/*
				 * Need to update code for Processed trust verification
				 */
				String ExpToastMsg = getExcelData.readCell("ProcessTrust", "ActionaExp");
				if (ExpToastMsg.equals(ActionActual)) {
					ExtentReportBuilder.ReportTestStep("PASSED", "List of records",
							"User successfully able to see the added new columns in invoice tab", mthName);
				} else {
					ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
							"User not able to see the added new columns in invoice tab", mthName);
				}
			} catch (Exception e) {
				ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
						"User failed to see the added new columns in invoice tab"+e, mthName);
				e.printStackTrace();
				Assert.fail();
			}
			objCM.onMouseHover(driver, objProTrustOR.ClearButton);
		}
	/*
	 * 11.Verify that the "Post" button is enabled for invoices with “Open” or “Partially Paid” status
	 */
		public void VerifyPostButtonEnablePartiallyPaid(WebDriver driver) throws Exception {
			try {
				mthName = new Object() {
				}.getClass().getEnclosingMethod().getName();
//				driver.switchTo().frame("invoices");
				if(objCM.checkElementVisibility(driver, objProTrustOR.ViewOutstandingBtn)) {
					objCM.onMouseHover(driver, objProTrustOR.ViewOutstandingBtn);
					Thread.sleep(5000);
					objCM.setText(driver, objProTrustOR.InvoiceIDs, "1720");
					objCM.onMouseHover(driver, objProTrustOR.ViewAll);
		
					String ActualStatus	=objCM.getText(driver, objProTrustOR.ActualStatus1);
					
		
					System.out.println(ActualStatus);
					objCM.listObjecLocater(driver, objProTrustOR.PostButtonAfterSearch);
				}
				
				/*
				 * Need to update code for Processed trust verification
				 */
				if (objCM.isElementClickable(driver, objProTrustOR.PostButtonAfterSearch)) {
					ExtentReportBuilder.ReportTestStep("PASSED", "List of records",
							"User successfully able to the see the post button is clickable/ enable ", mthName);
				} else {
					ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
							"User not able to the see the post button is clickable/ enable ", mthName);
				}
			} catch (Exception e) {
				ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
						"User failed to the see the post button is clickable/ enable "+e, mthName);
				e.printStackTrace();
				Assert.fail();
			}
			objCM.onMouseHover(driver, objProTrustOR.ClearButton);
		}
		
		public void VerifyPostButtonEnableOpen(WebDriver driver) throws Exception {
			try {
				mthName = new Object() {
				}.getClass().getEnclosingMethod().getName();
//				driver.switchTo().frame("invoices");
				if(objCM.checkElementVisibility(driver, objProTrustOR.ViewOutstandingBtn)) {
					objCM.onMouseHover(driver, objProTrustOR.ViewOutstandingBtn);
					Thread.sleep(5000);
					objCM.setText(driver, objProTrustOR.InvoiceIDs, "1829");
					objCM.onMouseHover(driver, objProTrustOR.ViewAll);
			
				}
			
				String ActualStatus	=objCM.getText(driver, objProTrustOR.ActualStatus3);
		
				System.out.println(ActualStatus);
				objCM.listObjecLocater(driver, objProTrustOR.PostButtonAfterSearch);

				/*
				 * Need to update code for Processed trust verification
				 */
				if (objCM.isElementDisabled(driver, objProTrustOR.PostButtonAfterSearch)) {
					ExtentReportBuilder.ReportTestStep("PASSED", "List of records",
							"User successfully able to the see the post button is clickable/ enable ", mthName);
				} else {
					ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
							"User not able to the see the post button is clickable/ enable ", mthName);
				}
			} catch (Exception e) {
				ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
						"User failed to the see the post button is clickable/ enable "+e, mthName);
				e.printStackTrace();
				Assert.fail();
			}
			objCM.onMouseHover(driver, objProTrustOR.ClearButton);
		}
	/*
	 * 12.Verify that the "Post" button is disabled for statuses other than “Open” or “Partially Paid”
	 */
		public void VerifyPostButtondisablePaid(WebDriver driver) throws Exception {
			try {
				mthName = new Object() {
				}.getClass().getEnclosingMethod().getName();
//				driver.switchTo().frame("invoices");
				if(objCM.checkElementVisibility(driver, objProTrustOR.ViewOutstandingBtn)) {
					objCM.onMouseHover(driver, objProTrustOR.ViewOutstandingBtn);
					Thread.sleep(5000);
					objCM.setText(driver, objProTrustOR.InvoiceIDs, "2");
					objCM.onMouseHover(driver, objProTrustOR.ViewAll);
			
				}
				
				String ActualStatus	=objCM.getText(driver, objProTrustOR.ActualStatus3);
				
				System.out.println(ActualStatus);
				objCM.listObjecLocater(driver, objProTrustOR.PostButtonAfterSearch);

				/*
				 * Need to update code for Processed trust verification
				 */
				if (objCM.isElementDisabled(driver, objProTrustOR.PostButtonAfterSearch)) {
					ExtentReportBuilder.ReportTestStep("PASSED", "List of records",
							"User successfully able to the see the post button is disable", mthName);
				} else {
					ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
							"User not able to the see the post button is disable ", mthName);
				}
			} catch (Exception e) {
				ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
						"User failed to the see the post button is disable "+e, mthName);
				e.printStackTrace();
				Assert.fail();
			}
			objCM.onMouseHover(driver, objProTrustOR.ClearButton);
			driver.navigate().refresh();
		}
	/*
	 * 13.Verify clicking the "Post" button triggers the expected behavior
	 */

	/*
	 *14.Verify that the “Reverse” button is enabled only for manual invoices 
	 */
		public void VerifyReverseEnableFunctionality(WebDriver driver) throws Exception {
			try {
				mthName = new Object() {
				}.getClass().getEnclosingMethod().getName();
//				driver.switchTo().frame("invoices");

				if(objCM.checkElementVisibility(driver, objProTrustOR.ViewOutstandingBtn)) {
					objCM.onMouseHover(driver, objProTrustOR.ViewOutstandingBtn);
					Thread.sleep(10000);
					objCM.onMouseHover(driver, objProTrustOR.AddInvoice);
					objCM.onMouseHover(driver, objProTrustOR.ManualDateAddinvoice);
					objCM.onMouseHover(driver, objProTrustOR.TodayDate);
					objCM.setText(driver, objProTrustOR.ClientDrpDwn, "Test ODR");
					objCM.onMouseHover(driver, objProTrustOR.ClientDrpDwn);
					// Create object of Actions class
					Actions action = new Actions(driver);
					Thread.sleep(2000);
					// Press ENTER key
					action.sendKeys(Keys.ENTER).perform();

					objCM.setText(driver, objProTrustOR.ManualAmt, "123");
					objCM.setText(driver, objProTrustOR.ManualNotes, "abc");	
					objCM.setText(driver, objProTrustOR.ManualDescription, "xyz");
					objCM.onMouseHover(driver, objProTrustOR.processInvoiceBtn);
					objCM.onMouseHover(driver, objProTrustOR.InvoiceFilterDaterange);
					
					objCM.onMouseHover(driver, objProTrustOR.ViewAll);
					objCM.listObjecLocater(driver, objProTrustOR.listRe);
					
				}	
				/*
				 * Need to update code for Processed trust verification
				 */
				
				Thread.sleep(2000);
				if (objCM.isElementClickable(driver, objProTrustOR.ReverseFunBtn2)) {
					ExtentReportBuilder.ReportTestStep("PASSED", "List of records",
							"User is successfully able to reverse the invoice and button is enabled", mthName);
				} else {
					ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
							"User is not able to reverse the invoice and button is not enabled", mthName);
				}
			} catch (Exception e) {
				ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
						"User failed to reverse the invoice"+e, mthName);
				e.printStackTrace();
				Assert.fail();
			}
			objCM.onMouseHover(driver, objProTrustOR.ClearButton);
			driver.navigate().refresh();
		}
	/*
	 * 15.Verify that the “Reverse” button is disabled for previously reversed invoices
	 */

	/*
	 * 17.Verify that clicking the “Reverse” button updates the status to “Reversed”
	 */

	/*
	 * 18.Verify the presence of “Remit Type” and “Report” columns in the grid
	 */

	/*
	 * 20.Verify that the “Status” column size is adjusted to accommodate new columns
	 */

}
