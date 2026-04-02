package businesslogic;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import automationEngine.ApplicationSetup;
import objectRepository.RS_TP_Invoicenavigation_OR;
import objectRepository.TP_29_OR;
import objectRepository.TP_2_OR;
import utilities.CommonMethods;
import utilities.ExtentReportBuilder;
import utilities.RWExcel;

public class RS_TP_Invoicenavigation_BL extends ExtentReportBuilder{

	public RS_TP_Invoicenavigation_BL() {
		// TODO Auto-generated constructor stub
	}
	String mthName;
	CommonMethods objCM = new CommonMethods();
	RS_TP_Invoicenavigation_OR objInvoiceOR = new RS_TP_Invoicenavigation_OR();
	TP_2_OR objTP_2_OR =new TP_2_OR ();
	RWExcel getExcelData = new RWExcel();
	Duration due = Duration.ofSeconds(30);

	public void navigationInvoiceTab(WebDriver driver) throws Exception {


		Thread.sleep(15000);
		objCM.waitUntillVisibilityOfElement(driver, objInvoiceOR.menubutton,due);
		try {
			mthName = new Object() {
			}.getClass().getEnclosingMethod().getName();
			Thread.sleep(20000);
			objCM.onMouseHover(driver, objInvoiceOR.menubutton);
			objCM.onMouseHover_withoutClick(driver, objInvoiceOR.AccountingButtonn);
			//			objCM.onMouseHover(driver, objProTrustOR.processtrustButton);
			//			objCM.onMouseHover(driver, objProssdTrustOR.processedTrustTab);
			objCM.onMouseHover(driver, objInvoiceOR.invoiceTab);


			if (objCM.isElementPresent(driver, objInvoiceOR.mainTab)) {
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
	 * User is able to see the report download Option single PDF download button
	 */
	public void VerifySinglePDFDownloadBtn(WebDriver driver) throws Exception {


		try {
			mthName = new Object() {
			}.getClass().getEnclosingMethod().getName();
			//	
			driver.switchTo().frame("invoices");

			if(objCM.checkElementVisibility(driver, objInvoiceOR.ViewOutstandingBtn)) {
				objCM.onMouseHover(driver, objInvoiceOR.ViewOutstandingBtn);
				objCM.waitForElement(driver, objInvoiceOR.InvoicePDFBtn, 20000);
				objCM.onMouseHover_withoutClick(driver, objInvoiceOR.InvoicePDFBtn);
				objCM.objecLocater(driver, objInvoiceOR.InvoicePDFBtn);

			}

			Thread.sleep(2000);
			if (objCM.isElementPresent(driver, objInvoiceOR.InvoicePDFBtn)) {
				ExtentReportBuilder.ReportTestStep("PASSED", "List of records",
						"User is able to click on single PDF download button in invoice tab", mthName);
			} else {
				ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
						"User is not able to click on single PDF download button in invoice tab", mthName);
			}
		} catch (Exception e) {
			ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
					"User is failed to click on single PDF download button in invoice tab"+e, mthName);
			e.printStackTrace();
			Assert.fail();
		}
	}
	/*
	 * User is able to see the report download Option single PDF download button for Billing Summary 
	 */
	public void VerifyBothCIPDFDownloadBtn(WebDriver driver) throws Exception {


		try {
			mthName = new Object() {
			}.getClass().getEnclosingMethod().getName();
			//
		

			if(objCM.checkElementVisibility(driver, objInvoiceOR.InvoiceMainPDFbtn)) {

				objCM.isElementClickable(driver, objInvoiceOR.InvoiceMainPDFbtn);
				objCM.onMouseHover(driver, objInvoiceOR.InvoiceMainPDFbtn);
				objCM.objecLocater(driver, objInvoiceOR.InvoiceCombinedPDFbtn);
				objCM.objecLocater(driver, objInvoiceOR.InvoiceIndiPDFbtn);

			}

			Thread.sleep(2000);
			if (objCM.isElementPresent(driver, objInvoiceOR.InvBSPDFBtn)) {
				ExtentReportBuilder.ReportTestStep("PASSED", "List of records",
						"User is able to click on both combined nad individual PDF download button in invoice tab", mthName);
			} else {
				ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
						"User is not able to click on both combined nad individual PDF download button in invoice tab", mthName);
			}
		} catch (Exception e) {
			ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
					"User is failed to click on both combined nad individual PDF download button in invoice tab"+e, mthName);
			e.printStackTrace();
			Assert.fail();
		}
	}
	
	/*
	 * User is able to see the report download Option single PDF download button for Billing Summary 
	 */
	public void VerifySingleBSPDFDownloadBtn(WebDriver driver) throws Exception {


		try {
			mthName = new Object() {
			}.getClass().getEnclosingMethod().getName();
		

			if(objCM.checkElementVisibility(driver, objInvoiceOR.InvBSPDFBtn)) {

				objCM.isElementClickable(driver, objInvoiceOR.InvBSPDFBtn);
				objCM.objecLocater(driver, objInvoiceOR.InvBSPDFBtn);

			}

			Thread.sleep(2000);
			if (objCM.isElementPresent(driver, objInvoiceOR.InvBSPDFBtn)) {
				ExtentReportBuilder.ReportTestStep("PASSED", "List of records",
						"User is able to click on single PDF download button for Billing Summary in invoice tab", mthName);
			} else {
				ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
						"User is not able to click on single PDF download button for Billing Summary in invoice tab", mthName);
			}
		} catch (Exception e) {
			ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
					"User failed to click on single PDF download button for Billing Summary in invoice tab"+e, mthName);
			e.printStackTrace();
			Assert.fail();
		}
	}
	/*
	 * User is able to see the report download Option Both Combined and individual PDF download button for Billing Summary 
	 */
	public void VerifyBothCIBSPDFDownloadBtn(WebDriver driver) throws Exception {


		try {
			mthName = new Object() {
			}.getClass().getEnclosingMethod().getName();
			//
		

			if(objCM.checkElementVisibility(driver, objInvoiceOR.InvBSMainPDFbtn)) {

				objCM.isElementClickable(driver, objInvoiceOR.InvBSMainPDFbtn);
				objCM.onMouseHover(driver, objInvoiceOR.InvBSMainPDFbtn);
				objCM.isElementClickable(driver, objInvoiceOR.InvBSCombinedPDFbtn);
				objCM.objecLocater(driver, objInvoiceOR.InvBSCombinedPDFbtn);
				objCM.isElementClickable(driver, objInvoiceOR.InvBSIndiPDFbtn);
				objCM.objecLocater(driver, objInvoiceOR.InvBSIndiPDFbtn);
			}

			Thread.sleep(2000);
			if (objCM.isElementPresent(driver, objInvoiceOR.InvBSIndiPDFbtn)) {
				ExtentReportBuilder.ReportTestStep("PASSED", "List of records",
						"User is  able to see the report download Option Both Combined and individual PDF download button for Billing Summary", mthName);
			} else {
				ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
						"User is not able to see the report download Option Both Combined and individual PDF download button for Billing Summary", mthName);
			}
		} catch (Exception e) {
			ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
					"User failed to see the report download Option Both Combined and individual PDF download button for Billing Summary"+e, mthName);
			e.printStackTrace();
			Assert.fail();
		}
		driver.navigate().refresh();
	}
	
	/*
	 * Invoice (Single )
	 */
	
	public void VerifyPDFOnUIandDownloadPartInvoiceUTAB(WebDriver driver) throws Exception {
		try {
			mthName = new Object() {
			}.getClass().getEnclosingMethod().getName();

			driver.switchTo().frame("invoices");

			if(objCM.checkElementVisibility(driver, objInvoiceOR.ViewOutstandingBtn)) {

				objCM.onMouseHover(driver, objInvoiceOR.ViewOutstandingBtn);
				objCM.waitForElement(driver, objInvoiceOR.InvoicePDFBtn, 20000);
				objCM.onMouseHover_withoutClick(driver, objInvoiceOR.InvoicePDFBtn);
				objCM.click(driver, objInvoiceOR.InvoicePDFBtn);
				driver.switchTo().defaultContent();

				// wait ONLY for second popup
				objCM.waitUntilSecondPopupAppears(driver, 300);
				Thread.sleep(2000);
				// next flow
				System.out.println("Now proceed");
				driver.switchTo().frame("invoices");
				String InvoiceNumberUI = objCM.getText(driver, objInvoiceOR.invoiceNumberUI);

				String ClientNameUI = objCM.getText(driver, objInvoiceOR.ClientNameUI);
				
				System.out.println("UI Client Name: " + InvoiceNumberUI);
				System.out.println("UI Grand Total: " + ClientNameUI);
				//Get Latest Downloaded Excel
				Thread.sleep(2000);
				String downloadPath = ApplicationSetup.downloadpath;

				
				File PDFFile = objCM.getLatestDownloadedFile(downloadPath, ".pdf", 20);
				System.out.println("Download Path: " + downloadPath);
				if(PDFFile != null){

				    String filePath = PDFFile.getAbsolutePath();
				    File dir = new File(downloadPath);
				    File[] files = dir.listFiles();

				    if(files != null){
				        for(File f : files){
				            System.out.println("Found File: " + f.getName());
				        }
				    }
				    System.out.println("Latest File: " + filePath);
				    //Read file logic
				    String pdfText = objCM.readPDF(PDFFile);
				    pdfText = pdfText.replaceAll("\\s+", " ");
				    System.out.println("Normalized PDF: " + pdfText);
				    String normalizedPDF = pdfText.toLowerCase().replaceAll("[^a-z0-9]", "");
				    String normalizedUI  = InvoiceNumberUI.toLowerCase().replaceAll("[^a-z0-9]", "");
				    // Validation
				    if(normalizedPDF.contains(normalizedUI)){
				        System.out.println("Invoice number matched in PDF");
				    } else {
				        Assert.fail("Invoice number mismatch in PDF");
				    }
				    
				    if(pdfText.contains(ClientNameUI)){
				        System.out.println("Client Name matched in PDF");
				    } else {
				        Assert.fail("Client Name mismatch in PDF");
				    }
				}     else {
				    System.out.println("No file found");
				    Assert.fail("File not downloaded");
				}			
			}

			Thread.sleep(2000);
			if (objCM.isElementPresent(driver, objInvoiceOR.InvoicePDFBtn)) {
				ExtentReportBuilder.ReportTestStep("PASSED", "List of records",
						"User successfully able to navigate to invoice pdf report download button and after downloading report from Invoice tab for published trust", mthName);
			} else {
				ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
						"User not able to navigate to invoice pdf report download button and after downloading report from Invoice  tab for published trust", mthName);
			}
		} catch (Exception e) {
			ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
					"User failed to navigate to invoice pdf report download button and after downloading report from Invoice  tab for published trust"+e, mthName);
			e.printStackTrace();
			Assert.fail();
		}
	driver.navigate().refresh();
	}
	
	/*
	 * Invoice -Combined Report
	 */
	
	public void VerifyPDFOnUIandDownloadPartInvoiceCombinedUTAB(WebDriver driver) throws Exception {
		try {
			mthName = new Object() {
			}.getClass().getEnclosingMethod().getName();

			//		driver.switchTo().frame("TrustProcess");

			if(objCM.checkElementVisibility(driver, objInvoiceOR.InvoiceMainPDFbtn)) {

				objCM.isElementClickable(driver, objInvoiceOR.InvoiceMainPDFbtn);
				objCM.onMouseHover(driver, objInvoiceOR.InvoiceMainPDFbtn);
				objCM.objecLocater(driver, objInvoiceOR.InvoiceCombinedPDFbtn);
				objCM.click(driver, objInvoiceOR.InvoiceCombinedPDFbtn);
		
			
//				System.out.println(objCM.getText(driver, objProTrustOR.ExportSuccesToastMsg));
				driver.switchTo().defaultContent();

				// wait ONLY for second popup
				objCM.waitUntilSecondPopupAppears(driver, 300);
				Thread.sleep(2000);
				// next flow
				System.out.println("Now proceed");
				driver.switchTo().frame("invoices");
				String InvoiceNumberUI = objCM.getText(driver, objInvoiceOR.invoiceNumberUI);

				String ClientNameUI = objCM.getText(driver, objInvoiceOR.ClientNameUI);
				
				System.out.println("UI Client Name: " + InvoiceNumberUI);
				System.out.println("UI Grand Total: " + ClientNameUI);
				//Get Latest Downloaded Excel
				Thread.sleep(2000);
				String downloadPath = ApplicationSetup.downloadpath;

				
				File PDFFile = objCM.getLatestDownloadedFile(downloadPath, ".pdf", 20);
				System.out.println("Download Path: " + downloadPath);
				if(PDFFile != null){

				    String filePath = PDFFile.getAbsolutePath();
				    File dir = new File(downloadPath);
				    File[] files = dir.listFiles();

				    if(files != null){
				        for(File f : files){
				            System.out.println("Found File: " + f.getName());
				        }
				    }
				    System.out.println("Latest File: " + filePath);
				    //Read file logic
				    String pdfText = objCM.readPDF(PDFFile);
				    pdfText = pdfText.replaceAll("\\s+", " ");
				    System.out.println("Normalized PDF: " + pdfText);
				    String normalizedPDF = pdfText.toLowerCase().replaceAll("[^a-z0-9]", "");
				    String normalizedUI  = InvoiceNumberUI.toLowerCase().replaceAll("[^a-z0-9]", "");

				    // Validation
				    if(pdfText.contains(normalizedUI)){
				        System.out.println("Invoice number matched in PDF");
				    } else {
				        Assert.fail("Invoice number mismatch in PDF");
				    }
				    
				    if(pdfText.contains(ClientNameUI)){
				        System.out.println("Client Name matched in PDF");
				    } else {
				        Assert.fail("Client name mismatch in PDF");
				    }
				}     else {
				    System.out.println("No file found");
				    Assert.fail("File not downloaded");
				}			
			}

			Thread.sleep(2000);
			if (objCM.isElementPresent(driver, objInvoiceOR.InvoiceMainPDFbtn)) {
				ExtentReportBuilder.ReportTestStep("PASSED", "List of records",
						"User successfully able to navigate to invoice combined pdf report download button and after downloading report from invoice tab", mthName);
			} else {
				ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
						"User not able to navigate to invoice combined pdf report download button and after downloading report from invoice", mthName);
			}
		} catch (Exception e) {
			ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
					"User failed to navigate to invoice combined pdf report download button and after downloading report from invoice tab "+e, mthName);
			e.printStackTrace();
			Assert.fail();
		}
	driver.navigate().refresh();
	}
	
	/*
	 * invoice: Indivisual report 
	 */
	
	public void VerifyPDFOnUIandDownloadPartInvoiceIndivisaulPT(WebDriver driver) throws Exception {
		try {
			mthName = new Object() {
			}.getClass().getEnclosingMethod().getName();

			//		driver.switchTo().frame("TrustProcess");

			if(objCM.checkElementVisibility(driver, objProTrustOR.PT_MainIvoiceBtn)) {

				objCM.isElementClickable(driver, objProTrustOR.PT_MainIvoiceBtn);
				objCM.onMouseHover(driver, objProTrustOR.AdvancedFilterButton);
				objCM.onMouseHover(driver, objProTrustOR.PublishDropDown);
				objCM.onMouseHover(driver, objProTrustOR.PublishCheckBox);
				objCM.onMouseHover(driver, objProTrustOR.AdvViewButton);
		
				String expTrustNumber = getExcelData.readCell("ProcessTrust", "TrustNumber");
				objCM.setText(driver, objProTrustOR.Search, expTrustNumber);
				objCM.onMouseHover(driver, objProTrustOR.CheckBox);
				objCM.onMouseHover(driver, objProTrustOR.PT_MainIvoiceBtn);
				
				objCM.click(driver, objProTrustOR.PT_InvoiceindivisualBtn);
//				System.out.println(objCM.getText(driver, objProTrustOR.ExportSuccesToastMsg));
				driver.switchTo().defaultContent();

				// wait ONLY for second popup
				objCM.waitUntilSecondPopupAppears(driver, 300);
				Thread.sleep(2000);
				// next flow
				System.out.println("Now proceed");
				driver.switchTo().frame("TrustProcess");
				String InvoiceNumberUI = objCM.getText(driver, objProTrustOR.InvoiceNumber);

				String Commission = objCM.getText(driver, objProTrustOR.Commission);
				
				System.out.println("UI Client Name: " + InvoiceNumberUI);
				System.out.println("UI Grand Total: " + Commission);
				//Get Latest Downloaded Excel
				Thread.sleep(2000);
				String downloadPath = ApplicationSetup.downloadpath;

				File PDFFile = objCM.getLatestDownloadedFile(downloadPath, ".zip", 20);
				System.out.println("Download Path: " + downloadPath);
				if(PDFFile != null){

					System.out.println("ZIP File: " + PDFFile.getAbsolutePath());
					
					String extractPath = ApplicationSetup.downloadpath + "\\unzipped";

					File pdfFile = objCM.extractZipAndGetPDF(PDFFile, extractPath);
					System.out.println("Extracting: " + pdfFile);
					if(pdfFile == null){
					    Assert.fail("PDF not found inside ZIP");
					}

					System.out.println("Extracted PDF: " + pdfFile.getAbsolutePath());
//				File file = getLatestDownloadedFile(downloadPath, 20);
//				System.out.println("Download Path: " + downloadPath);
//				if(file != null){
//
//				    String filePath = file.getAbsolutePath();
//				    File dir = new File(downloadPath);
//				    File[] files = dir.listFiles();
//
//				    if(files != null){
//				        for(File f : files){
//				            System.out.println("Found File: " + f.getName());
//				        }
//				    }
//				    System.out.println("Latest File: " + filePath);
				    //Read file logic
				    String pdfText = objCM.readPDF(pdfFile);
				    pdfText = pdfText.replaceAll("\\s+", " ");
				    System.out.println("Normalized PDF: " + pdfText);
				    String normalizedPDF = pdfText.toLowerCase().replaceAll("[^a-z0-9]", "");
				    String normalizedUI  = InvoiceNumberUI.toLowerCase().replaceAll("[^a-z0-9]", "");

				    // Validation
				    if(pdfText.contains(normalizedUI)){
				        System.out.println("Client Name matched in PDF");
				    } else {
				        Assert.fail("Client Name mismatch in PDF");
				    }
				    
				    if(pdfText.contains(Commission)){
				        System.out.println("Grand Total matched in PDF");
				    } else {
				        Assert.fail("Grand Total mismatch in PDF");
				    }
				}     else {
				    System.out.println("No file found");
				    Assert.fail("File not downloaded");
				}			
			}

			Thread.sleep(2000);
			if (objCM.isElementPresent(driver, objProTrustOR.PT_PDFreportBtn)) {
				ExtentReportBuilder.ReportTestStep("PASSED", "List of records",
						"User successfully able to navigate to invoice indivisual pdf report download button and after downloading report from process trust tab for published trust", mthName);
			} else {
				ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
						"User not able to navigate to  inoivce indivisual pdf report download button and after downloading report from processtrust tab for published trust", mthName);
			}
		} catch (Exception e) {
			ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
					"User failed to navigate to inoivce indivisual pdf report download button and after downloading report from processtrust tab for published trust"+e, mthName);
			e.printStackTrace();
			Assert.fail();
		}
	driver.navigate().refresh();
	}

	

}
