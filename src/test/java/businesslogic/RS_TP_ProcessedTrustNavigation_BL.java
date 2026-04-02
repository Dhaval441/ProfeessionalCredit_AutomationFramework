package businesslogic;

import java.io.File;
import java.time.Duration;
import java.util.Arrays;
import java.util.Comparator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import automationEngine.ApplicationSetup;
import objectRepository.RS_TP_OpenTrustNavigation_OR;
import objectRepository.RS_TP_ProcessedTrustNavigation_OR;
import utilities.CommonMethods;
import utilities.ExtentReportBuilder;
import utilities.RWExcel;

public class RS_TP_ProcessedTrustNavigation_BL extends ExtentReportBuilder{

	public RS_TP_ProcessedTrustNavigation_BL() {
		// TODO Auto-generated constructor stub
	}
	String mthName;
	CommonMethods objCM = new CommonMethods();
	RS_TP_ProcessedTrustNavigation_OR objProTrustOR = new RS_TP_ProcessedTrustNavigation_OR();
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
			driver.switchTo().frame("TrustProcess");
				objCM.onMouseHover(driver, objProTrustOR.ProcessedTrustTab);
				objCM.onMouseHover(driver, objProTrustOR.CustomDateOption);
				objCM.setText(driver, objProTrustOR.EnterFromDate,"01/01/2024");
				objCM.setText(driver, objProTrustOR.EnterToDate, "11/03/2026");
				objCM.onMouseHover(driver, objProTrustOR.ApplyButton);
				objCM.onMouseHover(driver, objProTrustOR.ViewButton);
				//need to change Xpath following Webelemnt
				objCM.listObjecLocater(driver, objProTrustOR.listRe);
				objCM.listObjecLocater(driver, objProTrustOR.listCount);
			if (objCM.isElementPresent(driver, objProTrustOR.listCount)) {
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
	 * TestScenario- Verify that user is able to see excel report download button in processed trust tab
	 */
	public void verifyExceReportPTDownload(WebDriver driver) throws Exception {
	//	int i;
		try {
			mthName = new Object() {
			}.getClass().getEnclosingMethod().getName();
//			driver.switchTo().frame("TrustProcess");

			if(objCM.checkElementVisibility(driver, objProTrustOR.PT_ExcelReportBtn)) {
				objCM.isElementClickable(driver, objProTrustOR.PT_ExcelReportBtn);
				objCM.listObjecLocater(driver, objProTrustOR.PT_ExcelReportBtn);
			}
			/*
			 * Need to update code for Processed trust verification
			 */
			Thread.sleep(2000);
			if (objCM.isElementPresent(driver, objProTrustOR.PT_ExcelReportBtn)) {
				ExtentReportBuilder.ReportTestStep("PASSED", "List of records",
						"User is successfully able to see report excel download button on processed trust tab", mthName);
			} else {
				ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
						"User is not able to see report excel download button on processed trust tab", mthName);
			}
		} catch (Exception e) {
			ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
					"User is failed to see report excel download button on processed trust tab"+e, mthName);
			e.printStackTrace();
			Assert.fail();
		}

	}
	public void verifyPDFReportPTDownload(WebDriver driver) throws Exception {
	//	int i;
		try {
			mthName = new Object() {
			}.getClass().getEnclosingMethod().getName();
//			driver.switchTo().frame("TrustProcess");

			if(objCM.checkElementVisibility(driver, objProTrustOR.PT_PDFreportBtn)) {
				objCM.isElementClickable(driver, objProTrustOR.PT_PDFreportBtn);
				objCM.listObjecLocater(driver, objProTrustOR.PT_PDFreportBtn);
				objCM.onMouseHover(driver, objProTrustOR.PT_CollectionActivityBtn);
				objCM.listObjecLocater(driver, objProTrustOR.PT_CollectionActivityCombinedBtn);
				objCM.isElementClickable(driver, objProTrustOR.PT_CollectionActivityindivisualBtn);
				objCM.listObjecLocater(driver, objProTrustOR.PT_CollectionActivityindivisualBtn);

			}
		
			if (objCM.isElementPresent(driver, objProTrustOR.PT_CollectionActivityindivisualBtn)) {
				ExtentReportBuilder.ReportTestStep("PASSED", "List of records",
						"User is successfully able to see report in PDF button and collection Activity reports", mthName);
			} else {
				ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
						"User is not able to see report in PDF button and collection Activity reports", mthName);
			}
		} catch (Exception e) {
			ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
					"User is failed to see report in PDF button and collection Activity reports"+e, mthName);
			e.printStackTrace();
			Assert.fail();
		}

	}
	
	public void verifyinvoiceReportPTDownload(WebDriver driver) throws Exception {
	//	int i;
		try {
			mthName = new Object() {
			}.getClass().getEnclosingMethod().getName();
//			driver.switchTo().frame("TrustProcess");

			if(objCM.checkElementVisibility(driver, objProTrustOR.PT_invoiceBtn)) {
				objCM.isElementClickable(driver, objProTrustOR.PT_invoiceBtn);
				objCM.listObjecLocater(driver, objProTrustOR.PT_invoiceBtn);
				objCM.onMouseHover(driver, objProTrustOR.PT_MainIvoiceBtn);
				objCM.isElementClickable(driver, objProTrustOR.PT_InvoiceCombinedBtn);
				objCM.listObjecLocater(driver, objProTrustOR.PT_InvoiceCombinedBtn);
				objCM.isElementClickable(driver, objProTrustOR.PT_InvoiceindivisualBtn);
				objCM.listObjecLocater(driver, objProTrustOR.PT_InvoiceindivisualBtn);

			}
		
			if (objCM.isElementPresent(driver, objProTrustOR.PT_InvoiceindivisualBtn)) {
				ExtentReportBuilder.ReportTestStep("PASSED", "List of records",
						"User is successfully able to see report in invoice as well as Combined and indivisual Invoice buttons", mthName);
			} else {
				ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
						"User is not able to see report in invoice as well as Combined and indivisual Invoice buttons", mthName);
			}
		} catch (Exception e) {
			ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
					"User is failed to see report in invioce as well as Combined and indivisual Invoice buttons"+e, mthName);
			e.printStackTrace();
			Assert.fail();
		}

	}
	

	public void verifyERPReportPTDownload(WebDriver driver) throws Exception {
	//	int i;
		try {
			mthName = new Object() {
			}.getClass().getEnclosingMethod().getName();
//			driver.switchTo().frame("TrustProcess");

			if(objCM.checkElementVisibility(driver, objProTrustOR.PT_ERPreportBtn)) {
				objCM.isElementClickable(driver, objProTrustOR.PT_ERPreportBtn);
				objCM.listObjecLocater(driver, objProTrustOR.PT_ERPreportBtn);

			}
		
			if (objCM.isElementPresent(driver, objProTrustOR.PT_ERPreportBtn)) {
				ExtentReportBuilder.ReportTestStep("PASSED", "List of records",
						"User is successfully able to see ERP report on process trust tab", mthName);
			} else {
				ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
						"User is not able to see ERP report on process trust tab", mthName);
			}
		} catch (Exception e) {
			ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
					"User is failed to see ERP report on process trust tab"+e, mthName);
			e.printStackTrace();
			Assert.fail();
		}
		driver.navigate().refresh();
	}
	
	/*
	 * TC_008. Verify that report are proper data in processed trust tab Excel Report for Processed trust (For Published trust) 
	 */
	public void VerifyExcelOnUIandDownloadPartPT(WebDriver driver) throws Exception {
		try {
			mthName = new Object() {
			}.getClass().getEnclosingMethod().getName();

			//		driver.switchTo().frame("TrustProcess");

			if(objCM.checkElementVisibility(driver, objProTrustOR.PT_ExcelReportBtn)) {

				objCM.isElementClickable(driver, objProTrustOR.PT_ExcelReportBtn);
//				objCM.setText(driver, objProTrustOR.EnterFromDate,"01/01/2024");
//				objCM.setText(driver, objProTrustOR.EnterToDate, "03/25/2026");
//				objCM.onMouseHover(driver, objProTrustOR.ApplyButton);
//				objCM.onMouseHover(driver, objProTrustOR.ViewButton);
				objCM.onMouseHover(driver, objProTrustOR.AdvancedFilterButton);
				objCM.onMouseHover(driver, objProTrustOR.PublishDropDown);
				objCM.onMouseHover(driver, objProTrustOR.PublishCheckBox);
				objCM.onMouseHover(driver, objProTrustOR.AdvViewButton);
				String expTrustNumber = getExcelData.readCell("ProcessTrust", "TrustNumber");
				objCM.setText(driver, objProTrustOR.Search, expTrustNumber);
//				objCM.onMouseHover(driver, objProTrustOR.ExcelReportDwnloadbtn);
				objCM.click(driver, objProTrustOR.PT_ExcelReportBtn);
				driver.switchTo().defaultContent();

				// wait ONLY for second popup
				objCM.waitUntilSecondPopupAppears(driver, 300);
				Thread.sleep(2000);
				// next flow
				System.out.println("Now proceed");
				driver.switchTo().frame("TrustProcess");
				String ClientName = objCM.getText(driver, objProTrustOR.ClientName);

				String Commission = objCM.getText(driver, objProTrustOR.Commission);
				
				System.out.println("UI Client Name: " + ClientName);
				System.out.println("UI commission Total: " + Commission);
				//Get Latest Downloaded Excel
//				String downloadPath = System.getProperty("user.dir") + "\\AutomationDownloads";
				   Thread.sleep(2000);
				String downloadPath = ApplicationSetup.downloadpath;

				
				File excelFile = objCM.getLatestDownloadedFile(downloadPath, ".xlsx", 20);
				System.out.println("Download Path: " + downloadPath);
				if(excelFile != null){

				    String filePath = excelFile.getAbsolutePath();
				    File dir = new File(downloadPath);
				    File[] files = dir.listFiles();

				    if(files != null){
				        for(File f : files){
				            System.out.println("Found File: " + f.getName());
				        }
				    }
				    System.out.println("Latest File: " + filePath);

				    String ClientNameExcel = objCM.getCellValue(excelFile, 2, 1);
				    Thread.sleep(3000);
				    String CommssionExcel = objCM.getCellValue(excelFile, 18, 12);
				    String cleanValue = CommssionExcel.replaceAll("[^0-9.]", "");

				    System.out.println("Excel Client Name: " + ClientNameExcel);
				    System.out.println("Excel Grand Total: " + cleanValue);

				    // Validation
				    if(ClientName.equalsIgnoreCase(ClientNameExcel)) {
				        System.out.println("Client name matched");
				    } else {
				        System.out.println("Client Name mismatch");
				    }

				    if(Commission.equals(cleanValue)) {
				        System.out.println("commssion matched");
				    } else {
				        System.out.println("Commssion mismatch");
				    }

				} else {
				    System.out.println("No file found");
				    Assert.fail("File not downloaded");
				}			
			}

			Thread.sleep(2000);
			if (objCM.isElementPresent(driver, objProTrustOR.PT_ExcelReportBtn)) {
				ExtentReportBuilder.ReportTestStep("PASSED", "List of records",
						"User successfully able to navigate to excel report download button and after downloading report from processtrust tab for published trust", mthName);
			} else {
				ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
						"User not able to navigate to excel report download button and after downloading report from processtrust tab for published trust", mthName);
			}
		} catch (Exception e) {
			ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
					"User failed to navigate to excel report download button and after downloading report from processtrust tab for published trust"+e, mthName);
			e.printStackTrace();
			Assert.fail();
		}
	
		driver.navigate().refresh();
		driver.switchTo().defaultContent();
	}
	
	
	
	/*
	 * PDF report single (Collection activity)
	 */
	
	
	public void VerifyPDFOnUIandDownloadPartPT(WebDriver driver) throws Exception {
		try {
			mthName = new Object() {
			}.getClass().getEnclosingMethod().getName();

			//		driver.switchTo().frame("TrustProcess");

			if(objCM.checkElementVisibility(driver, objProTrustOR.PT_PDFreportBtn)) {

				objCM.isElementClickable(driver, objProTrustOR.PT_PDFreportBtn);
				objCM.onMouseHover(driver, objProTrustOR.AdvancedFilterButton);
				objCM.onMouseHover(driver, objProTrustOR.PublishDropDown);
				objCM.onMouseHover(driver, objProTrustOR.PublishCheckBox);
				objCM.onMouseHover(driver, objProTrustOR.AdvViewButton);
				String expTrustNumber = getExcelData.readCell("ProcessTrust", "TrustNumber");
				objCM.setText(driver, objProTrustOR.Search, expTrustNumber);
//				objCM.onMouseHover(driver, objProTrustOR.ExcelReportDwnloadbtn);
				objCM.click(driver, objProTrustOR.PT_PDFreportBtn);
//				System.out.println(objCM.getText(driver, objProTrustOR.ExportSuccesToastMsg));

				driver.switchTo().defaultContent();

				// wait ONLY for second popup
				objCM.waitUntilSecondPopupAppears(driver, 300);
				Thread.sleep(2000);
				// next flow
				System.out.println("Now proceed");
				driver.switchTo().frame("TrustProcess");
				String clientNameUI = objCM.getText(driver, objProTrustOR.ClientName);

				String Commission = objCM.getText(driver, objProTrustOR.Commission);
				
				System.out.println("UI Client Name: " + clientNameUI);
				System.out.println("UI Grand Total: " + Commission);
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
				    Thread.sleep(2000);
				    String pdfText = objCM.readPDF(PDFFile);
				    pdfText = pdfText.replaceAll("\\s+", " ");
				    System.out.println("Normalized PDF: " + pdfText);

				    // Validation
				    if(pdfText.contains(clientNameUI)){
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
						"User successfully able to navigate to pdf report download button and after downloading report from processtrust tab for published trust", mthName);
			} else {
				ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
						"User not able to navigate to pdf report download button and after downloading report from processtrust tab for published trust", mthName);
			}
		} catch (Exception e) {
			ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
					"User failed to navigate to pdf report download button and after downloading report from processtrust tab for published trust"+e, mthName);
			e.printStackTrace();
			Assert.fail();
		}
	driver.navigate().refresh();
	}
	
	/*
	 * Collection activity : Combined report )
	 */
	
	public void VerifyPDFOnUIandDownloadPartCollectionCombinedPT(WebDriver driver) throws Exception {
		try {
			mthName = new Object() {
			}.getClass().getEnclosingMethod().getName();

			//		driver.switchTo().frame("TrustProcess");

			if(objCM.checkElementVisibility(driver, objProTrustOR.PT_CollectionActivityBtn)) {

				objCM.isElementClickable(driver, objProTrustOR.PT_CollectionActivityBtn);
				objCM.onMouseHover(driver, objProTrustOR.AdvancedFilterButton);
				objCM.onMouseHover(driver, objProTrustOR.PublishDropDown);
				objCM.onMouseHover(driver, objProTrustOR.PublishCheckBox);
				objCM.onMouseHover(driver, objProTrustOR.AdvViewButton);
		
				String expTrustNumber = getExcelData.readCell("ProcessTrust", "TrustNumber");
				objCM.setText(driver, objProTrustOR.Search, expTrustNumber);
				objCM.onMouseHover(driver, objProTrustOR.CheckBox);
				objCM.onMouseHover(driver, objProTrustOR.PT_CollectionActivityBtn);
				
				objCM.onMouseHover(driver, objProTrustOR.PT_CollectionActivityCombinedBtn);
//				System.out.println(objCM.getText(driver, objProTrustOR.ExportSuccesToastMsg));
//				Thread.sleep(200000);
				driver.switchTo().defaultContent();

				// wait ONLY for second popup
				objCM.waitUntilSecondPopupAppears(driver, 300);
				Thread.sleep(2000);
				// next flow
				System.out.println("Now proceed");
				driver.switchTo().frame("TrustProcess");
				String clientNameUI = objCM.getText(driver, objProTrustOR.ClientName);

				String Commission = objCM.getText(driver, objProTrustOR.Commission);
				
				System.out.println("UI Client Name: " + clientNameUI);
				System.out.println("UI Grand Total: " + Commission);
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

				    // Validation
				    if(pdfText.contains(clientNameUI)){
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
						"User successfully able to navigate to combined pdf report download button and after downloading report from process trust tab for published trust", mthName);
			} else {
				ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
						"User not able to navigate to combined pdf report download button and after downloading report from processtrust tab for published trust", mthName);
			}
		} catch (Exception e) {
			ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
					"User failed to navigate to combined pdf report download button and after downloading report from processtrust tab for published trust"+e, mthName);
			e.printStackTrace();
			Assert.fail();
		}
	driver.navigate().refresh();
	}
	
	/*
	 * Collection activity: Indivisual report 
	 */
	
	public void VerifyPDFOnUIandDownloadPartCollectionIndivisaulPT(WebDriver driver) throws Exception {
		try {
			mthName = new Object() {
			}.getClass().getEnclosingMethod().getName();

			//		driver.switchTo().frame("TrustProcess");

			if(objCM.checkElementVisibility(driver, objProTrustOR.PT_CollectionActivityBtn)) {

				objCM.isElementClickable(driver, objProTrustOR.PT_CollectionActivityBtn);
				objCM.onMouseHover(driver, objProTrustOR.AdvancedFilterButton);
				objCM.onMouseHover(driver, objProTrustOR.PublishDropDown);
				objCM.onMouseHover(driver, objProTrustOR.PublishCheckBox);
				objCM.onMouseHover(driver, objProTrustOR.AdvViewButton);
		
				String expTrustNumber = getExcelData.readCell("ProcessTrust", "TrustNumber");
				objCM.setText(driver, objProTrustOR.Search, expTrustNumber);
				objCM.onMouseHover(driver, objProTrustOR.CheckBox);
				objCM.onMouseHover(driver, objProTrustOR.PT_CollectionActivityBtn);
				
				objCM.onMouseHover(driver, objProTrustOR.PT_CollectionActivityindivisualBtn);
//				System.out.println(objCM.getText(driver, objProTrustOR.ExportSuccesToastMsg));
				driver.switchTo().defaultContent();

				// wait ONLY for second popup
				objCM.waitUntilSecondPopupAppears(driver, 300);
				Thread.sleep(2000);
				// next flow
				System.out.println("Now proceed");
				driver.switchTo().frame("TrustProcess");
				String clientNameUI = objCM.getText(driver, objProTrustOR.ClientName);

				String Commission = objCM.getText(driver, objProTrustOR.Commission);
				
				System.out.println("UI Client Name: " + clientNameUI);
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

				    // Validation
				    if(pdfText.contains(clientNameUI)){
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
						"User successfully able to navigate to indivisual pdf report download button and after downloading report from process trust tab for published trust", mthName);
			} else {
				ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
						"User not able to navigate to indivisual pdf report download button and after downloading report from processtrust tab for published trust", mthName);
			}
		} catch (Exception e) {
			ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
					"User failed to navigate to indivisual pdf report download button and after downloading report from processtrust tab for published trust"+e, mthName);
			e.printStackTrace();
			Assert.fail();
		}
	driver.navigate().refresh();
	}
	
	
	/*
	 * Invoice (Single )
	 */
	
	public void VerifyPDFOnUIandDownloadPartInvoicePT(WebDriver driver) throws Exception {
		try {
			mthName = new Object() {
			}.getClass().getEnclosingMethod().getName();

			//		driver.switchTo().frame("TrustProcess");

			if(objCM.checkElementVisibility(driver, objProTrustOR.PT_invoiceBtn)) {

				objCM.isElementClickable(driver, objProTrustOR.PT_invoiceBtn);
				objCM.onMouseHover(driver, objProTrustOR.AdvancedFilterButton);
				objCM.onMouseHover(driver, objProTrustOR.PublishDropDown);
				objCM.onMouseHover(driver, objProTrustOR.PublishCheckBox);
				objCM.onMouseHover(driver, objProTrustOR.AdvViewButton);
				String expTrustNumber = getExcelData.readCell("ProcessTrust", "TrustNumber");
				objCM.setText(driver, objProTrustOR.Search, expTrustNumber);
//				objCM.onMouseHover(driver, objProTrustOR.ExcelReportDwnloadbtn);
				objCM.click(driver, objProTrustOR.PT_invoiceBtn);
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
						"User successfully able to navigate to invoice pdf report download button and after downloading report from processtrust tab for published trust", mthName);
			} else {
				ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
						"User not able to navigate to invoice pdf report download button and after downloading report from processtrust tab for published trust", mthName);
			}
		} catch (Exception e) {
			ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
					"User failed to navigate to invoice pdf report download button and after downloading report from processtrust tab for published trust"+e, mthName);
			e.printStackTrace();
			Assert.fail();
		}
	driver.navigate().refresh();
	}
	
	/*
	 * Invoice -Combined Report
	 */
	
	public void VerifyPDFOnUIandDownloadPartInvoiceCombinedPT(WebDriver driver) throws Exception {
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
				
				objCM.onMouseHover(driver, objProTrustOR.PT_InvoiceCombinedBtn);
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
						"User successfully able to navigate to invoice combined pdf report download button and after downloading report from process trust tab for published trust", mthName);
			} else {
				ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
						"User not able to navigate to invoice combined pdf report download button and after downloading report from processtrust tab for published trust", mthName);
			}
		} catch (Exception e) {
			ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
					"User failed to navigate to invoice combined pdf report download button and after downloading report from processtrust tab for published trust"+e, mthName);
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
	
	/*
	 * TC_008. Verify that report are proper data in processed trust tab Excel Report for Unpublished Processed trust 
	 */
	public void VerifyExcelOnUIandDownloadPartUPT(WebDriver driver) throws Exception {
		try {
			mthName = new Object() {
			}.getClass().getEnclosingMethod().getName();

			//		driver.switchTo().frame("TrustProcess");

			if(objCM.checkElementVisibility(driver, objProTrustOR.PT_ExcelReportBtn)) {

				objCM.isElementClickable(driver, objProTrustOR.PT_ExcelReportBtn);
//				objCM.setText(driver, objProTrustOR.EnterFromDate,"01/01/2024");
//				objCM.setText(driver, objProTrustOR.EnterToDate, "03/25/2026");
//				objCM.onMouseHover(driver, objProTrustOR.ApplyButton);
//				objCM.onMouseHover(driver, objProTrustOR.ViewButton);
				objCM.onMouseHover(driver, objProTrustOR.AdvancedFilterButton);
				objCM.onMouseHover(driver, objProTrustOR.PublishDropDown);
				objCM.onMouseHover(driver, objProTrustOR.UnpublishCheckBox);
				objCM.onMouseHover(driver, objProTrustOR.AdvViewButton);
				String expTrustNumber = getExcelData.readCell("ProcessTrust", "TrustNumber2");
				objCM.setText(driver, objProTrustOR.Search, expTrustNumber);
//				objCM.onMouseHover(driver, objProTrustOR.ExcelReportDwnloadbtn);
				objCM.click(driver, objProTrustOR.PT_ExcelReportBtn);
//				System.out.println(objCM.getText(driver, objProTrustOR.ExportSuccesToastMsg));
				driver.switchTo().defaultContent();

				// wait ONLY for second popup
				objCM.waitUntilSecondPopupAppears(driver, 300);
				Thread.sleep(2000);
				// next flow
				System.out.println("Now proceed");
				driver.switchTo().frame("TrustProcess");
				String ClientName = objCM.getText(driver, objProTrustOR.ClientName);

				String Commission = objCM.getText(driver, objProTrustOR.Commission);
				
				System.out.println("UI Client Name: " + ClientName);
				System.out.println("UI commission Total: " + Commission);
				//Get Latest Downloaded Excel
				Thread.sleep(2000);
//				String downloadPath = System.getProperty("user.dir") + "\\AutomationDownloads";
				String downloadPath = ApplicationSetup.downloadpath;

				
				File excelFile = objCM.getLatestDownloadedFile(downloadPath, ".xlsx", 20);
				System.out.println("Download Path: " + downloadPath);
				if(excelFile != null){

				    String filePath = excelFile.getAbsolutePath();
				    File dir = new File(downloadPath);
				    File[] files = dir.listFiles();

				    if(files != null){
				        for(File f : files){
				            System.out.println("Found File: " + f.getName());
				        }
				    }
				    System.out.println("Latest File: " + filePath);

				    String ClientNameExcel = objCM.getCellValue(excelFile, 2, 1);
				    Thread.sleep(3000);
				    String CommssionExcel = objCM.getCellValue(excelFile, 18, 12);
				    String cleanValue = CommssionExcel.replaceAll("[^0-9.]", "");

				    System.out.println("Excel Client Name: " + ClientNameExcel);
				    System.out.println("Excel Grand Total: " + CommssionExcel);

				    // Validation
				    if(ClientName.equalsIgnoreCase(ClientNameExcel)) {
				        System.out.println("Client name matched");
				    } else {
				        System.out.println("Client Name mismatch");
				    }

				    if(Commission.equals(cleanValue)) {
				        System.out.println("commssion matched");
				    } else {
				        System.out.println("Commssion mismatch");
				    }

				} else {
				    System.out.println("No file found");
				    Assert.fail("File not downloaded");
				}			
			}

			Thread.sleep(2000);
			if (objCM.isElementPresent(driver, objProTrustOR.PT_ExcelReportBtn)) {
				ExtentReportBuilder.ReportTestStep("PASSED", "List of records",
						"User successfully able to navigate to excel report download button and after downloading report from processtrust tab for published trust", mthName);
			} else {
				ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
						"User not able to navigate to excel report download button and after downloading report from processtrust tab for published trust", mthName);
			}
		} catch (Exception e) {
			ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
					"User failed to navigate to excel report download button and after downloading report from processtrust tab for published trust"+e, mthName);
			e.printStackTrace();
			Assert.fail();
		}
	driver.navigate().refresh();
	}
	
	/*
	 * PDF report single for Unpublished trust (Collection activity)
	 */
	
	public void VerifyPDFOnUIandDownloadPartUPT(WebDriver driver) throws Exception {
		try {
			mthName = new Object() {
			}.getClass().getEnclosingMethod().getName();

			//		driver.switchTo().frame("TrustProcess");

			if(objCM.checkElementVisibility(driver, objProTrustOR.PT_PDFreportBtn)) {

				objCM.isElementClickable(driver, objProTrustOR.PT_PDFreportBtn);
				objCM.onMouseHover(driver, objProTrustOR.AdvancedFilterButton);
				objCM.onMouseHover(driver, objProTrustOR.PublishDropDown);
				objCM.onMouseHover(driver, objProTrustOR.UnpublishCheckBox);
				objCM.onMouseHover(driver, objProTrustOR.AdvViewButton);
				String expTrustNumber = getExcelData.readCell("ProcessTrust", "TrustNumber2");
				objCM.setText(driver, objProTrustOR.Search, expTrustNumber);
//				objCM.onMouseHover(driver, objProTrustOR.ExcelReportDwnloadbtn);
				objCM.click(driver, objProTrustOR.PT_PDFreportBtn);
//				System.out.println(objCM.getText(driver, objProTrustOR.ExportSuccesToastMsg));
				driver.switchTo().defaultContent();

				// wait ONLY for second popup
				objCM.waitUntilSecondPopupAppears(driver, 300);
				Thread.sleep(2000);
				// next flow
				System.out.println("Now proceed");
				driver.switchTo().frame("TrustProcess");
				String clientNameUI = objCM.getText(driver, objProTrustOR.ClientName);

				String Commission = objCM.getText(driver, objProTrustOR.Commission);
				
				System.out.println("UI Client Name: " + clientNameUI);
				System.out.println("UI Grand Total: " + Commission);
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

				    // Validation
				    if(pdfText.contains(clientNameUI)){
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
						"User successfully able to navigate to pdf report download button and after downloading report from processtrust tab for published trust", mthName);
			} else {
				ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
						"User not able to navigate to pdf report download button and after downloading report from processtrust tab for published trust", mthName);
			}
		} catch (Exception e) {
			ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
					"User failed to navigate to pdf report download button and after downloading report from processtrust tab for published trust"+e, mthName);
			e.printStackTrace();
			Assert.fail();
		}
	driver.navigate().refresh();
	}
	
	/*
	 * Collection activity : for Unpublished Combined report )
	 */
	
	public void VerifyPDFOnUIandDownloadPartCollectionCombinedUPT(WebDriver driver) throws Exception {
		try {
			mthName = new Object() {
			}.getClass().getEnclosingMethod().getName();

			//		driver.switchTo().frame("TrustProcess");

			if(objCM.checkElementVisibility(driver, objProTrustOR.PT_CollectionActivityBtn)) {

				objCM.isElementClickable(driver, objProTrustOR.PT_CollectionActivityBtn);
				objCM.onMouseHover(driver, objProTrustOR.AdvancedFilterButton);
				objCM.onMouseHover(driver, objProTrustOR.PublishDropDown);
				objCM.onMouseHover(driver, objProTrustOR.UnpublishCheckBox);
				objCM.onMouseHover(driver, objProTrustOR.AdvViewButton);
		
				String expTrustNumber = getExcelData.readCell("ProcessTrust", "TrustNumber2");
				objCM.setText(driver, objProTrustOR.Search, expTrustNumber);
				objCM.onMouseHover(driver, objProTrustOR.CheckBox);
				objCM.onMouseHover(driver, objProTrustOR.PT_CollectionActivityBtn);
				
				objCM.onMouseHover(driver, objProTrustOR.PT_CollectionActivityCombinedBtn);
//				System.out.println(objCM.getText(driver, objProTrustOR.ExportSuccesToastMsg));
				driver.switchTo().defaultContent();

				// wait ONLY for second popup
				objCM.waitUntilSecondPopupAppears(driver, 300);
				Thread.sleep(2000);
				// next flow
				System.out.println("Now proceed");
				driver.switchTo().frame("TrustProcess");
				String clientNameUI = objCM.getText(driver, objProTrustOR.ClientName);

				String Commission = objCM.getText(driver, objProTrustOR.Commission);
				
				System.out.println("UI Client Name: " + clientNameUI);
				System.out.println("UI Grand Total: " + Commission);
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

				    // Validation
				    if(pdfText.contains(clientNameUI)){
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
						"User successfully able to navigate to combined pdf report download button and after downloading report from process trust tab for published trust", mthName);
			} else {
				ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
						"User not able to navigate to combined pdf report download button and after downloading report from processtrust tab for published trust", mthName);
			}
		} catch (Exception e) {
			ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
					"User failed to navigate to combined pdf report download button and after downloading report from processtrust tab for published trust"+e, mthName);
			e.printStackTrace();
			Assert.fail();
		}
	driver.navigate().refresh();
	}
	
	/*
	 * Collection activity: For Unpublished Indivisual report 
	 */
	
	public void VerifyPDFOnUIandDownloadPartCollectionIndivisaulUPT(WebDriver driver) throws Exception {
		try {
			mthName = new Object() {
			}.getClass().getEnclosingMethod().getName();

			//		driver.switchTo().frame("TrustProcess");

			if(objCM.checkElementVisibility(driver, objProTrustOR.PT_CollectionActivityBtn)) {

				objCM.isElementClickable(driver, objProTrustOR.PT_CollectionActivityBtn);
				objCM.onMouseHover(driver, objProTrustOR.AdvancedFilterButton);
				objCM.onMouseHover(driver, objProTrustOR.PublishDropDown);
				objCM.onMouseHover(driver, objProTrustOR.UnpublishCheckBox);
				objCM.onMouseHover(driver, objProTrustOR.AdvViewButton);
		
				String expTrustNumber = getExcelData.readCell("ProcessTrust", "TrustNumber2");
				objCM.setText(driver, objProTrustOR.Search, expTrustNumber);
				Thread.sleep(3000);
				objCM.onMouseHover(driver, objProTrustOR.CheckBox);
				objCM.onMouseHover(driver, objProTrustOR.PT_CollectionActivityBtn);
				
				objCM.onMouseHover(driver, objProTrustOR.PT_CollectionActivityindivisualBtn);
//				System.out.println(objCM.getText(driver, objProTrustOR.ExportSuccesToastMsg));
				driver.switchTo().defaultContent();

				// wait ONLY for second popup
				objCM.waitUntilSecondPopupAppears(driver, 300);
				Thread.sleep(2000);
				// next flow
				System.out.println("Now proceed");
				driver.switchTo().frame("TrustProcess");
				String clientNameUI = objCM.getText(driver, objProTrustOR.ClientName);

				String Commission = objCM.getText(driver, objProTrustOR.Commission);
				
				System.out.println("UI Client Name: " + clientNameUI);
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

				    // Validation
				    if(pdfText.contains(clientNameUI)){
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
						"User successfully able to navigate to indivisual pdf report download button and after downloading report from process trust tab for published trust", mthName);
			} else {
				ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
						"User not able to navigate to indivisual pdf report download button and after downloading report from processtrust tab for published trust", mthName);
			}
		} catch (Exception e) {
			ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
					"User failed to navigate to indivisual pdf report download button and after downloading report from processtrust tab for published trust"+e, mthName);
			e.printStackTrace();
			Assert.fail();
		}
	driver.navigate().refresh();
	}
	
	
	/*
	 * For Unpublished Trust: Invoice (Single )
	 */
	
	public void VerifyPDFOnUIandDownloadPartInvoiceUPT(WebDriver driver) throws Exception {
		try {
			mthName = new Object() {
			}.getClass().getEnclosingMethod().getName();

			//		driver.switchTo().frame("TrustProcess");

			if(objCM.checkElementVisibility(driver, objProTrustOR.PT_invoiceBtn)) {

				objCM.isElementClickable(driver, objProTrustOR.PT_invoiceBtn);
				objCM.onMouseHover(driver, objProTrustOR.AdvancedFilterButton);
				objCM.onMouseHover(driver, objProTrustOR.PublishDropDown);
				objCM.onMouseHover(driver, objProTrustOR.UnpublishCheckBox);
				objCM.onMouseHover(driver, objProTrustOR.AdvViewButton);
				String expTrustNumber = getExcelData.readCell("ProcessTrust", "TrustNumber2");
				objCM.setText(driver, objProTrustOR.Search, expTrustNumber);
//				objCM.onMouseHover(driver, objProTrustOR.ExcelReportDwnloadbtn);
				objCM.click(driver, objProTrustOR.PT_invoiceBtn);
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
						"User successfully able to navigate to invoice pdf report download button and after downloading report from processtrust tab for published trust", mthName);
			} else {
				ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
						"User not able to navigate to invoice pdf report download button and after downloading report from processtrust tab for published trust", mthName);
			}
		} catch (Exception e) {
			ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
					"User failed to navigate to invoice pdf report download button and after downloading report from processtrust tab for published trust"+e, mthName);
			e.printStackTrace();
			Assert.fail();
		}
	driver.navigate().refresh();
	}
	
	/*
	 * Invoice -For Unpublished Trust Combined Report
	 */
	
	public void VerifyPDFOnUIandDownloadPartInvoiceCombinedUPT(WebDriver driver) throws Exception {
		try {
			mthName = new Object() {
			}.getClass().getEnclosingMethod().getName();

			//		driver.switchTo().frame("TrustProcess");

			if(objCM.checkElementVisibility(driver, objProTrustOR.PT_MainIvoiceBtn)) {

				objCM.isElementClickable(driver, objProTrustOR.PT_MainIvoiceBtn);
				objCM.onMouseHover(driver, objProTrustOR.AdvancedFilterButton);
				objCM.onMouseHover(driver, objProTrustOR.PublishDropDown);
				objCM.onMouseHover(driver, objProTrustOR.UnpublishCheckBox);
				objCM.onMouseHover(driver, objProTrustOR.AdvViewButton);
		
				String expTrustNumber = getExcelData.readCell("ProcessTrust", "TrustNumber2");
				objCM.setText(driver, objProTrustOR.Search, expTrustNumber);
				objCM.onMouseHover(driver, objProTrustOR.CheckBox);
				objCM.onMouseHover(driver, objProTrustOR.PT_MainIvoiceBtn);
				
				objCM.onMouseHover(driver, objProTrustOR.PT_InvoiceCombinedBtn);
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

				
				File PDFFile = objCM.getLatestDownloadedFile(downloadPath, ".pdf", 20);
				System.out.println("Download Path: " + downloadPath);
				if(PDFFile != null){

				    String filePath = PDFFile.getAbsolutePath();
				    File dir = new File(downloadPath);
				    File[] files = dir.listFiles();

				    if(files!= null){
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
						"User successfully able to navigate to invoice combined pdf report download button and after downloading report from process trust tab for published trust", mthName);
			} else {
				ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
						"User not able to navigate to invoice combined pdf report download button and after downloading report from processtrust tab for published trust", mthName);
			}
		} catch (Exception e) {
			ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
					"User failed to navigate to invoice combined pdf report download button and after downloading report from processtrust tab for published trust"+e, mthName);
			e.printStackTrace();
			Assert.fail();
		}
	driver.navigate().refresh();
	}
	
	/*
	 * invoice:Unpublished Indivisual report 
	 */
	
	public void VerifyPDFOnUIandDownloadPartInvoiceIndivisaulUPT(WebDriver driver) throws Exception {
		try {

			mthName = new Object() {
			}.getClass().getEnclosingMethod().getName();

			//		driver.switchTo().frame("TrustProcess");

			if(objCM.checkElementVisibility(driver, objProTrustOR.PT_MainIvoiceBtn)) {

				objCM.isElementClickable(driver, objProTrustOR.PT_MainIvoiceBtn);
				objCM.onMouseHover(driver, objProTrustOR.AdvancedFilterButton);
				objCM.onMouseHover(driver, objProTrustOR.PublishDropDown);
				objCM.onMouseHover(driver, objProTrustOR.UnpublishCheckBox);
 				objCM.onMouseHover(driver, objProTrustOR.AdvViewButton);
		
				String expTrustNumber = getExcelData.readCell("ProcessTrust", "TrustNumber2");
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

//	private File getLatestDownloadedFile(String path, int timeoutSeconds) {
//
//	    File dir = new File(path);
//
//	    for (int i = 0; i < timeoutSeconds; i++) {
//
//	        File[] files = dir.listFiles();
//
//	        if (files != null && files.length > 0) {
//
//	            Arrays.sort(files, Comparator.comparingLong(File::lastModified).reversed());
//
//	            for (File file : files) {
//
//	                // ignore incomplete files
//	                if (!file.getName().endsWith(".crdownload")) {
//	                    System.out.println("File Found: " + file.getName());
//	                    return file;
//	                }
//	            }
//	        }
//
//	        try {
//	            Thread.sleep(1000);
//	        } catch (Exception e) {
//	        }
//	    }
//
//	    return null;
//	}
	private File getLatestFile(String string) {
		// TODO Auto-generated method stub
		return null;
	}
}
