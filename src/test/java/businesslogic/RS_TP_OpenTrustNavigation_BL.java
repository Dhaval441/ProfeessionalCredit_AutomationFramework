package businesslogic;

import java.io.File;
import java.time.Duration;
import java.util.Arrays;
import java.util.Comparator;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import automationEngine.ApplicationSetup;
import objectRepository.RS_TP_OpenTrustNavigation_OR;
import utilities.CommonMethods;
import utilities.ExtentReportBuilder;
import utilities.RWExcel;

public class RS_TP_OpenTrustNavigation_BL extends ExtentReportBuilder{

	public RS_TP_OpenTrustNavigation_BL() {
		// TODO Auto-generated constructor stub
	}

	String mthName;
	CommonMethods objCM = new CommonMethods();
	RS_TP_OpenTrustNavigation_OR objProTrustOR = new RS_TP_OpenTrustNavigation_OR();
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

			driver.switchTo().frame("TrustProcess");
			objCM.onMouseHover(driver, objProTrustOR.rundate);
			objCM.onMouseHover(driver, objProTrustOR.bymonthSelection);
			objCM.onMouseHover(driver, objProTrustOR.byyearSelection);
			objCM.onMouseHover(driver, objProTrustOR.yearSelelection);
			objCM.onMouseHover(driver, objProTrustOR.monthSelection);
			objCM.onMouseHover(driver, objProTrustOR.dateSelection);
			objCM.onMouseHover(driver, objProTrustOR.viewButton);
			objCM.listObjecLocater(driver, objProTrustOR.filtereddata);

			System.out.println(objCM.getText(driver, objProTrustOR.ListCount));

			if (objCM.isElementPresent(driver, objProTrustOR.ListCount)) {
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
	 * User is able to see the report download Option in excel,PDF and Combined format
	 */
	public void VerifyExcelDownloadBtn(WebDriver driver) throws Exception {


		try {
			mthName = new Object() {
			}.getClass().getEnclosingMethod().getName();
			//
			//		driver.switchTo().frame("TrustProcess");

			if(objCM.checkElementVisibility(driver, objProTrustOR.ExcelReportDwnloadbtn)) {

				objCM.isElementClickable(driver, objProTrustOR.ExcelReportDwnloadbtn);

			}

			Thread.sleep(2000);
			if (objCM.isElementPresent(driver, objProTrustOR.ExcelReportDwnloadbtn)) {
				ExtentReportBuilder.ReportTestStep("PASSED", "List of records",
						"User successfully able to navigate to excel report download button", mthName);
			} else {
				ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
						"User not able to navigate to excel report download button", mthName);
			}
		} catch (Exception e) {
			ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
					"User failed to navigate to excel report download button"+e, mthName);
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void VerifyPDFDownloadBtn(WebDriver driver) throws Exception {


		try {
			mthName = new Object() {
			}.getClass().getEnclosingMethod().getName();

			//		driver.switchTo().frame("TrustProcess");

			if(objCM.checkElementVisibility(driver, objProTrustOR.PDFReportDwnldbtn)) {

				objCM.isElementClickable(driver, objProTrustOR.PDFReportDwnldbtn);

			}

			Thread.sleep(2000);
			if (objCM.isElementPresent(driver, objProTrustOR.PDFReportDwnldbtn)) {
				ExtentReportBuilder.ReportTestStep("PASSED", "List of records",
						"User successfully able to navigate to PDF report download button", mthName);
			} else {
				ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
						"User not able to navigate to PDF report download button", mthName);
			}
		} catch (Exception e) {
			ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
					"User failed to navigate to PDF report download button"+e, mthName);
			e.printStackTrace();
			Assert.fail();
		}
	}
	public void VerifyCombinedPDFDownloadBtn(WebDriver driver) throws Exception {


		try {
			mthName = new Object() {
			}.getClass().getEnclosingMethod().getName();

			//		driver.switchTo().frame("TrustProcess");

			if(objCM.checkElementVisibility(driver, objProTrustOR.CombinedPDFReportDownldBtn)) {

				objCM.isElementClickable(driver, objProTrustOR.CombinedPDFReportDownldBtn);

			}

			Thread.sleep(2000);
			if (objCM.isElementPresent(driver, objProTrustOR.CombinedPDFReportDownldBtn)) {
				ExtentReportBuilder.ReportTestStep("PASSED", "List of records",
						"User successfully able to navigate to Combined report download button", mthName);
			} else {
				ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
						"User not able to navigate to combined report download button", mthName);
			}
		} catch (Exception e) {
			ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
					"User failed to navigate to Combined report download button"+e, mthName);
			e.printStackTrace();
			Assert.fail();
		}
		driver.navigate().refresh();	
	}
	
	/*
	 * TC_002. Preview report in Excel format and verify UI and report values  
	 * TC_005. User is able to Download report in Excel format 
	 */
	public void VerifyExcelOnUIandDownloadPart(WebDriver driver) throws Exception {
		try {
			mthName = new Object() {
			}.getClass().getEnclosingMethod().getName();

			//		driver.switchTo().frame("TrustProcess");

			if(objCM.checkElementVisibility(driver, objProTrustOR.ExcelReportDwnloadbtn)) {

				objCM.isElementClickable(driver, objProTrustOR.ExcelReportDwnloadbtn);
				String expClientName = getExcelData.readCell("ProcessTrust", "ClientName2");
				objCM.setText(driver, objProTrustOR.SearchText, expClientName);
//				objCM.onMouseHover(driver, objProTrustOR.ExcelReportDwnloadbtn);
				objCM.click(driver, objProTrustOR.ExcelReportDwnloadbtn);
//				System.out.println(objCM.getText(driver, objProTrustOR.ExportSuccesToastMsg));
				boolean status = objCM.waitForPopupFast(
				        driver,
				        objProTrustOR.PT_ExcelReportMsg
				);

				if(status){
				    System.out.println("Validation Passed");
				} else {
				    System.out.println("Validation Failed");
				}
				String clientNameUI = objCM.getText(driver, objProTrustOR.clientNameUI);

				String PaidUsUI = objCM.getText(driver, objProTrustOR.PaidUsUi);
				
				System.out.println("UI Client Name: " + clientNameUI);
				System.out.println("UI Grand Total: " + PaidUsUI);
				//Get Latest Downloaded Excel
//				String downloadPath = System.getProperty("user.dir") + "\\AutomationDownloads";
				String downloadPath = ApplicationSetup.downloadpath;

				
				File file = getLatestDownloadedFile(downloadPath, 20);
				System.out.println("Download Path: " + downloadPath);
				if(file != null){

				    String filePath = file.getAbsolutePath();
				    File dir = new File(downloadPath);
				    File[] files = dir.listFiles();

				    if(files != null){
				        for(File f : files){
				            System.out.println("Found File: " + f.getName());
				        }
				    }
				    System.out.println("Latest File: " + filePath);

				    String clientNameExcel = objCM.getCellValue(file, 4, 1);
				    Thread.sleep(3000);
				    String PaidUsExcel = objCM.getCellValue(file, 18, 7);
				    String cleanValue = PaidUsExcel.replaceAll("[^0-9.]", "");

				    System.out.println("Excel Client Name: " + clientNameExcel);
				    System.out.println("Excel Grand Total: " + PaidUsExcel);

				    // Validation
				    if(clientNameUI.equalsIgnoreCase(clientNameExcel)) {
				        System.out.println("Client Name matched");
				    } else {
				        System.out.println("Client Name mismatch");
				    }

				    if(PaidUsUI.equals(cleanValue)) {
				        System.out.println("Grand Total matched");
				    } else {
				        System.out.println("Grand Total mismatch");
				    }

				} else {
				    System.out.println("No file found");
				    Assert.fail("File not downloaded");
				}			
			}

			Thread.sleep(2000);
			if (objCM.isElementPresent(driver, objProTrustOR.ExcelReportDwnloadbtn)) {
				ExtentReportBuilder.ReportTestStep("PASSED", "List of records",
						"User successfully able to navigate to excel report download button and after downloading report are validated", mthName);
			} else {
				ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
						"User not able to navigate to excel report download button and after downloading report are validated", mthName);
			}
		} catch (Exception e) {
			ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
					"User failed to navigate to excel report download button and after downloading report are validated"+e, mthName);
			e.printStackTrace();
			Assert.fail();
		}
	driver.navigate().refresh();
	}
	
	/*
	 * TC_003. Preview report in PDF format 
	 * TC_006. User is able to Download report in PDF format 
	 */
	
	public void VerifyPDFOnUIandDownloadPart(WebDriver driver) throws Exception {
		try {
			mthName = new Object() {
			}.getClass().getEnclosingMethod().getName();

			//		driver.switchTo().frame("TrustProcess");

			if(objCM.checkElementVisibility(driver, objProTrustOR.PDFReportDwnldbtn)) {

				objCM.isElementClickable(driver, objProTrustOR.PDFReportDwnldbtn);
				String expClientName = getExcelData.readCell("ProcessTrust", "ClientName2");
				objCM.setText(driver, objProTrustOR.SearchText, expClientName);
//				objCM.onMouseHover(driver, objProTrustOR.ExcelReportDwnloadbtn);
				objCM.click(driver, objProTrustOR.PDFReportDwnldbtn);
//				System.out.println(objCM.getText(driver, objProTrustOR.ExportSuccesToastMsg));
				boolean status = objCM.waitForPopupFast(
				        driver,
				        objProTrustOR.PT_ExcelReportMsg
				);

				if(status){
				    System.out.println("Validation Passed");
				} else {
				    System.out.println("Validation Failed");
				}
				
				String clientNameUI = objCM.getText(driver, objProTrustOR.clientNameUI);

				String PaidUsUI = objCM.getText(driver, objProTrustOR.PaidUsUi);
				
				System.out.println("UI Client Name: " + clientNameUI);
				System.out.println("UI Grand Total: " + PaidUsUI);
				//Get Latest Downloaded Excel
				String downloadPath = ApplicationSetup.downloadpath;

				
				File file = getLatestDownloadedFile(downloadPath, 20);
				System.out.println("Download Path: " + downloadPath);
				if(file != null){

				    String filePath = file.getAbsolutePath();
				    File dir = new File(downloadPath);
				    File[] files = dir.listFiles();

				    if(files != null){
				        for(File f : files){
				            System.out.println("Found File: " + f.getName());
				        }
				    }
				    System.out.println("Latest File: " + filePath);
				    //Read file logic
				    String pdfText = objCM.readPDF(file);
				    pdfText = pdfText.replaceAll("\\s+", " ");
				    System.out.println("Normalized PDF: " + pdfText);

				    // Validation
				    if(pdfText.contains(clientNameUI)){
				        System.out.println("Client Name matched in PDF");
				    } else {
				        Assert.fail("Client Name mismatch in PDF");
				    }
				    
				    if(pdfText.contains(PaidUsUI)){
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
			if (objCM.isElementPresent(driver, objProTrustOR.PDFReportDwnldbtn)) {
				ExtentReportBuilder.ReportTestStep("PASSED", "List of records",
						"User successfully able to navigate to PDF report download button and after downloading report are validated", mthName);
			} else {
				ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
						"User not able to navigate to PDF report download button and after downloading report are validated", mthName);
			}
		} catch (Exception e) {
			ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
					"User failed to navigate to PDF report download button and after downloading report are validated"+e, mthName);
			e.printStackTrace();
			Assert.fail();
		}
	driver.navigate().refresh();
	}
	
	/*
	 * TC_004. Preview Combined report in PDF format
	 * TC_007. User is able to Download Combined report  
	 */
	
	public void VerifyPDFZipFileOnUIandDownloadPart(WebDriver driver) throws Exception {
		try {
			mthName = new Object() {
			}.getClass().getEnclosingMethod().getName();

			//		driver.switchTo().frame("TrustProcess");

			if(objCM.checkElementVisibility(driver, objProTrustOR.CombinedPDFReportDownldBtn)) {

				objCM.isElementClickable(driver, objProTrustOR.CombinedPDFReportDownldBtn);
				String expClientName = getExcelData.readCell("ProcessTrust", "ClientName2");
				objCM.setText(driver, objProTrustOR.SearchText, expClientName);
				objCM.onMouseHover(driver, objProTrustOR.CheckBoxForCOmbinedPDF);
				objCM.click(driver, objProTrustOR.CombinedPDFReportDownldBtn);
//				System.out.println(objCM.getText(driver, objProTrustOR.ExportSuccesToastMsg));
				boolean status = objCM.waitForPopupFast(
				        driver,
				        objProTrustOR.PT_ExcelReportMsg
				);

				if(status){
				    System.out.println("Validation Passed");
				} else {
				    System.out.println("Validation Failed");
				}
				
				String clientNameUI = objCM.getText(driver, objProTrustOR.clientNameUI);

				String PaidUsUI = objCM.getText(driver, objProTrustOR.PaidUsUi);
				
				System.out.println("UI Client Name: " + clientNameUI);
				System.out.println("UI Grand Total: " + PaidUsUI);
				//Get Latest Downloaded Excel
				String downloadPath = ApplicationSetup.downloadpath;

				
				File Zipfile = getLatestDownloadedFile(downloadPath, 20);
				System.out.println("Download Path: " + downloadPath);
				if(Zipfile != null){

					System.out.println("ZIP File: " + Zipfile.getAbsolutePath());
					
					String extractPath = ApplicationSetup.downloadpath + "\\unzipped";

					File pdfFile = objCM.extractZipAndGetPDF(Zipfile, extractPath);
					System.out.println("Extracting: " + pdfFile);
					if(pdfFile == null){
					    Assert.fail("PDF not found inside ZIP");
					}

					System.out.println("Extracted PDF: " + pdfFile.getAbsolutePath());
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
				    
				    if(pdfText.contains(PaidUsUI)){
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
			if (objCM.isElementPresent(driver, objProTrustOR.CombinedPDFReportDownldBtn)) {
				ExtentReportBuilder.ReportTestStep("PASSED", "List of records",
						"User successfully able to navigate to Combined report download button and after downloading report are validated", mthName);
			} else {
				ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
						"User not able to navigate to Combined report download button and after downloading report are validated", mthName);
			}
		} catch (Exception e) {
			ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
					"User failed to navigate to Combined report download button and after downloading report are validated"+e, mthName);
			e.printStackTrace();
			Assert.fail();
		}
	driver.navigate().refresh();
	}

	

	private File getLatestDownloadedFile(String path, int timeoutSeconds) {

	    File dir = new File(path);

	    for (int i = 0; i < timeoutSeconds; i++) {

	        File[] files = dir.listFiles();

	        if (files != null && files.length > 0) {

	            Arrays.sort(files, Comparator.comparingLong(File::lastModified).reversed());

	            for (File file : files) {

	                // ignore incomplete files
	                if (!file.getName().endsWith(".crdownload")) {
	                    System.out.println("File Found: " + file.getName());
	                    return file;
	                }
	            }
	        }

	        try {
	            Thread.sleep(1000);
	        } catch (Exception e) {
	        }
	    }

	    return null;
	}
	private File getLatestFile(String string) {
		// TODO Auto-generated method stub
		return null;
	}
}
