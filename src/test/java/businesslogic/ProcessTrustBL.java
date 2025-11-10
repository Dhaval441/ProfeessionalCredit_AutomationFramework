package businesslogic;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import objectRepository.LoginPageOR;
import objectRepository.ProcessTrustOR;
import utilities.CommonMethods;
import utilities.ExtentReportBuilder;
import utilities.RWExcel;

public class ProcessTrustBL extends ExtentReportBuilder {

	String mthName;


	CommonMethods objCM = new CommonMethods();
	ProcessTrustOR objProTrustOR = new ProcessTrustOR();
	RWExcel getExcelData = new RWExcel();
	Duration due = Duration.ofSeconds(30);






	public ProcessTrustBL(WebDriver driver) {
		// TODO Auto-generated constructor stub

	}
	/*
	 * TestScenario-Verify that  User is able to navigate to Process Trust tab 
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
	 * TestScenario- Verify that after applying run date filter displays available open trusts and allow grid manipulation
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
		 * Validation for filtered data through Excel file
		 */

//		String expClientNo = getExcelData.readCell("TrustOpen", "Client #");
//		String expClientName = getExcelData.readCell("TrustOpen", "Client Name");
//		String expRemitType = getExcelData.readCell("TrustOpen", "Remit Type");
//		String expType = getExcelData.readCell("TrustOpen", "Type");
//		String expFrequencyType = getExcelData.readCell("TrustOpen", "Frequency Type");
//		String expPaidUs = getExcelData.readCell("TrustOpen", "Paid Us");
//		String expCommission = getExcelData.readCell("TrustOpen", "Commission");
//		String expPaidYou = getExcelData.readCell("TrustOpen", "Paid You");
//		String expCurrencyCode = getExcelData.readCell("TrustOpen", "Currency Code");
//		List<String> expectedData = Arrays.asList(
//		        expClientNo,
//		        expClientName,
//		        expRemitType,
//		        expType,
//		        expFrequencyType,
//		        expPaidUs,
//		        expCommission,
//		        expPaidYou,
//		        expCurrencyCode
//		);
//		
//		System.out.println(expClientNo+expClientName+expRemitType+expType+expFrequencyType+expPaidUs+expCommission+expPaidYou+expCurrencyCode);
//		
//		/*
//		 * Fetching actual data
//		 */
//		List<String> actualData = new ArrayList<>();
//		for (int i1=1;i1<=9;i1++) {
//			WebElement ActualResult = driver.findElement(By.xpath("//tr[2]/td["+i1+"]"));
//			System.out.println(ActualResult.getText());
//			actualData.add(ActualResult.getText().trim());
//		}
//		/*
//		 * Validation
//		 */
//		for (int i1 = 0; i1 < expectedData.size(); i1++) {
//		    if (expectedData.get(i1).trim().equals(actualData.get(i1).trim())) {
//		        System.out.println("PASS ✅ Column " + (i1+1) + " matched: " + expectedData.get(i1));
//		    } else {
//		        System.out.println("FAIL ❌ Column " + (i1+1) + " mismatch: Expected [" 
//		                           + expectedData.get(i1) + "] but found [" + actualData.get(i1) + "]");
//		    }
//		}
//	
//	}
	/*
	 * TestScenario- Verify that applying run date & payment type as select all filter displays available trusts and allow grid manipulation
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
	 * TestScenario- Verify that applying run date & Trust Group Type as select all filter displays available trusts and allow grid manipulation
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
	 * TestScenario- Verify that applying run date &  transaction Type and Trust Frequency as select all filter displays available trusts and allow grid manipulation
	 */
	public void verifyfilterdateandtransactionfreqall(WebDriver driver) throws Exception {

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
				objCM.onMouseHover(driver, objProTrustOR.selectallFreqType);
				objCM.onMouseHover(driver, objProTrustOR.viewButton);
				objCM.listObjecLocater(driver, objProTrustOR.filtereddata);
				System.out.println(objCM.getText(driver, objProTrustOR.ListCount));

			}
			//Need to update code for open trust verification

			if (objCM.isElementPresent(driver, objProTrustOR.ListCount)) {
				ExtentReportBuilder.ReportTestStep("PASSED", "List of records",
						"User successfully get the list of open trust after applying Run date, transaction type & trust frequency as Select all option", mthName);
			} else {
				ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
						"After selecting Run date filter & Select all option in transaction type dropdown as well as for Trust frequency,Failed to get list of open trust", mthName);
			}
		} catch (Exception e) {
			ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
					"User failed to apply fliter using run date,transaction type and trsut frequency options on open trust process"+e, mthName);
			e.printStackTrace();
			Assert.fail();
		}
		//		objCM.onMouseHover(driver, objProTrustOR.clearBtn);

	}
	
	/*
	 * TestScenario- Verify that  for applying run date & Selecting all values from trust formula and G/L Code dropDown of advance filter
	 */
	public void verifyfilterdateandtrustformulaglcodeall(WebDriver driver) throws Exception {

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

				objCM.onMouseHover(driver, objProTrustOR.advancedfilter);
				objCM.onMouseHover(driver, objProTrustOR.dropdowntrustformula);
				objCM.onMouseHover(driver, objProTrustOR.selectalltrustformula);
				objCM.onMouseHover(driver, objProTrustOR.dropdownglcode);
				objCM.onMouseHover(driver, objProTrustOR.selectallglcode);
				objCM.onMouseHover(driver, objProTrustOR.viewbutton2);
				objCM.listObjecLocater(driver, objProTrustOR.filtereddata);				
				
				System.out.println(objCM.getText(driver, objProTrustOR.ListCount));

			}
			//Need to update code for open trust verification

			if (objCM.isElementPresent(driver, objProTrustOR.ListCount)) {
				ExtentReportBuilder.ReportTestStep("PASSED", "List of records",
						"User successfully get the list of open trust after applying Run date,  trust formula and G/L Codeas Select all option from dropdown", mthName);
			} else {
				ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
						"After selecting Run date filter & Select all option in trust formula and G/L Code,Failed to get list of open trust", mthName);
			}
		} catch (Exception e) {
			ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
					"User failed to apply fliter using run date,trust formula and G/L Code options on open trust process"+e, mthName);
			e.printStackTrace();
			Assert.fail();
		}
		//		objCM.onMouseHover(driver, objProTrustOR.clearBtn);

	}
	
	/*
	 * TestScenario- Verify that  for applying run date & Selecting all values from corporate name and client name dropDown of advance filter
	 */
	public void verifyfilterdateandcorporateclientnameall(WebDriver driver) throws Exception {

		try {
			mthName = new Object() {
			}.getClass().getEnclosingMethod().getName();

			objCM.onMouseHover(driver, objProTrustOR.clearbutton2);
			//			driver.switchTo().frame("TrustProcess");


			if(objCM.checkElementVisibility(driver, objProTrustOR.rundate)) {

				objCM.onMouseHover(driver, objProTrustOR.rundate);
				objCM.onMouseHover(driver, objProTrustOR.bymonthSelection);
				objCM.onMouseHover(driver, objProTrustOR.byyearSelection);
				objCM.onMouseHover(driver, objProTrustOR.yearSelelection);
				objCM.onMouseHover(driver, objProTrustOR.monthSelection);
				//Webelelment exeption
				objCM.onMouseHover(driver, objProTrustOR.dateSelection2);

	//			objCM.onMouseHover(driver, objProTrustOR.advancedfilter);
				objCM.onMouseHover(driver, objProTrustOR.dropdownCorporatename);
				objCM.onMouseHover(driver, objProTrustOR.selectallCorporatename);
				objCM.onMouseHover(driver, objProTrustOR.dropdownclientname);
				objCM.onMouseHover(driver, objProTrustOR.selectallclientname);
				objCM.onMouseHover(driver, objProTrustOR.viewbutton2);
				objCM.onMouseHover(driver, objProTrustOR.advancedfilter);
				objCM.listObjecLocater(driver, objProTrustOR.filtereddata);				
				
				System.out.println(objCM.getText(driver, objProTrustOR.ListCount));

			}
			//Need to update code for open trust verification

			if (objCM.isElementPresent(driver, objProTrustOR.ListCount)) {
				ExtentReportBuilder.ReportTestStep("PASSED", "List of records",
						"User successfully get the list of open trust after applying Run date,  corporate name and client name Select all option from dropdown", mthName);
			} else {
				ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
						"After selecting Run date filter & Select all option in corporate name and client name,Failed to get list of open trust", mthName);
			}
		} catch (Exception e) {
			ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
					"User failed to apply fliter using run date,corporate name and client name options on open trust process"+e, mthName);
			e.printStackTrace();
			Assert.fail();
		}
		//		objCM.onMouseHover(driver, objProTrustOR.clearBtn);

	}
	
	/*
	 * 	TestScenario- Verify that fetching data from excel and try to operate search functionality in Open trust tab
	 */
	public void verifysearchoptionbyexceldata(WebDriver driver) throws Exception {

		try {
			mthName = new Object() {
			}.getClass().getEnclosingMethod().getName();

			objCM.onMouseHover(driver, objProTrustOR.clearButton);
			//driver.switchTo().frame("TrustProcess");


			if(objCM.checkElementVisibility(driver, objProTrustOR.rundate)) {

				objCM.onMouseHover(driver, objProTrustOR.rundate);
				objCM.onMouseHover(driver, objProTrustOR.bymonthSelection);
				objCM.onMouseHover(driver, objProTrustOR.byyearSelection);
				objCM.onMouseHover(driver, objProTrustOR.yearSelelection);
				objCM.onMouseHover(driver, objProTrustOR.monthSelection);
				//Webelelment exeption
				objCM.onMouseHover(driver, objProTrustOR.dateSelection2);

				objCM.onMouseHover(driver, objProTrustOR.viewButton);
			}
			String ClientName1 = getExcelData.readCell("ProcessTrust", "ClientName1");
			System.out.println(ClientName1);
			objCM.setText(driver, objProTrustOR.SearchFromOpenTrust,ClientName1 );
			String ExpCond=objCM.getText(driver, objProTrustOR.ExportSearchFromOpenTrust);

			System.out.println("Expected data from updated filtered is ="+ ExpCond);

			Thread.sleep(5000);
			//Need to update code for open trust verification

			if (ExpCond.equals(ClientName1)) {
				ExtentReportBuilder.ReportTestStep("PASSED", "List of records",
						"User is successfully able to search the clint name using search functionality", mthName);
			} else {
				ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
						"User is not able to search the client name using search functionality", mthName);
			}
		} catch (Exception e) {
			ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
					"User failed to apply search functionality on open trust process"+e, mthName);
			e.printStackTrace();
			Assert.fail();
		}
	}
	/*
	 * Test Scenario- User is able to search the data for given date
	 * Test Scenario- User is able to download excel report for single client
	 */

	@SuppressWarnings("deprecation")
	public void verifyexelreportdownloadpt(WebDriver driver) throws Exception {

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

				objCM.onMouseHover(driver, objProTrustOR.viewButton);
			}
			String ClientName2 = getExcelData.readCell("ProcessTrust", "ClientName2");
			objCM.setText(driver, objProTrustOR.SearchFromOpenTrust,ClientName2 );
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
	 * Test Scenario- User is able to download PDF report for single client
	 */
	public void verifypdfreportdownloadpt(WebDriver driver) throws Exception {

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

				objCM.onMouseHover(driver, objProTrustOR.viewButton);
			}
			String ClientName2 = getExcelData.readCell("ProcessTrust", "ClientName2");
			objCM.setText(driver, objProTrustOR.SearchFromOpenTrust,ClientName2 );
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
	 * Test Scenario- user is able to download combined PDF report for selected client
	 */

	public void verifycombinedreportdownloadpt(WebDriver driver) throws Exception {

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

				objCM.onMouseHover(driver, objProTrustOR.viewButton);
			}
			String ClientName2 = getExcelData.readCell("ProcessTrust", "ClientName2");
			objCM.setText(driver, objProTrustOR.SearchFromOpenTrust,ClientName2 );
			String ExpCond=objCM.getText(driver, objProTrustOR.ActualClientname);

			System.out.println("Expected data from updated filtered is ="+ ExpCond);

			//Wait for actaul verification for excel download
			Actions a=new Actions(driver);
			objCM.onMouseHover(driver, objProTrustOR.CombinedCheckbox);

			objCM.onMouseHover(driver, objProTrustOR.CombinedPDFDownload);


			Thread.sleep(15000);
			Runtime.getRuntime().exec("C:\\Users\\mangesh.gadekar\\Documents\\AutoIT\\ClickOnSaveWS3.exe");
			Thread.sleep(5000);

			//Need to update code for open trust verification
			objCM.setText(driver, objProTrustOR.SearchFromOpenTrust,"");

		
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


	}

	/*
	 * Test Scenario- Without selecting run Date option,Click on View button 
	 */

	public void withoutrundateView(WebDriver driver) throws Exception {

		try {
			mthName = new Object() {
			}.getClass().getEnclosingMethod().getName();

			objCM.onMouseHover(driver, objProTrustOR.clearButton);
			//		driver.switchTo().frame("TrustProcess");


			if(objCM.checkElementVisibility(driver, objProTrustOR.rundate)) 

				objCM.onMouseHover(driver, objProTrustOR.viewButton);
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
	 * Test Scenario- Without selecting any option,Click on Run Trust process 
	 */

	public void withoutrundateRunTrust(WebDriver driver) throws Exception {

		try {
			mthName = new Object() {
			}.getClass().getEnclosingMethod().getName();

			Thread.sleep(5000);
			objCM.onMouseHover(driver, objProTrustOR.clearButton);
			//			driver.switchTo().frame("TrustProcess");


			if(objCM.checkElementVisibility(driver, objProTrustOR.rundate)) 

				objCM.onMouseHover(driver, objProTrustOR.RunTrustProcessButton);
			objCM.checkElementVisibility(driver, objProTrustOR.ActualError2);
			String ActualError2=objCM.getText(driver, objProTrustOR.ActualError2);

			System.out.println(ActualError2);

			String ExpErrorCode2 = getExcelData.readCell("ProcessTrust", "ExpErrorCode2");


			System.out.println("Expected data from updated filtered is ="+ ExpErrorCode2);

			if (ExpErrorCode2.equalsIgnoreCase(ActualError2)) {
				ExtentReportBuilder.ReportTestStep("PASSED", "List of records",
						"User is successfully able click on view button with getting exception 'Please Select Any Client'", mthName);
			} else {
				ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
						"User is not able to click on view button", mthName);
			}
		} catch (Exception e) {
			ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
					"User failed to click on Run trsut process button without selecting details"+e, mthName);
			e.printStackTrace();
			Assert.fail();
		}

		Thread.sleep(5000);
	}

	/*
	 * Test Scenario- User is able to filter the option that are containing no records
	 */

	public void NorecordsScenario_1(WebDriver driver) throws Exception {

		try {
			mthName = new Object() {
			}.getClass().getEnclosingMethod().getName();

			objCM.onMouseHover(driver, objProTrustOR.clearButton);
			//		driver.switchTo().frame("TrustProcess");


			if(objCM.checkElementVisibility(driver, objProTrustOR.rundate)) {

				objCM.onMouseHover(driver, objProTrustOR.rundate);
				objCM.onMouseHover(driver, objProTrustOR.bymonthSelection);
				objCM.onMouseHover(driver, objProTrustOR.byyearSelection);
				objCM.onMouseHover(driver, objProTrustOR.yearSelelection);
				objCM.onMouseHover(driver, objProTrustOR.monthSelection);
				//Webelelment exeption
				objCM.onMouseHover(driver, objProTrustOR.dateSelection2);
				objCM.onMouseHover(driver, objProTrustOR.dropdownTrustGroup);
				objCM.onMouseHover(driver, objProTrustOR.SelectingDPONLY);
				objCM.onMouseHover(driver, objProTrustOR.viewButton);
				objCM.checkElementVisibility(driver, objProTrustOR.ActualOPRecords);

			}

			String Actualop=objCM.getText(driver, objProTrustOR.ActualOPRecords);

			System.out.println(Actualop);

			String ExpErrorCode3 = getExcelData.readCell("ProcessTrust", "ExpErrorCode3");

			System.out.println(ExpErrorCode3);

			if (ExpErrorCode3.equalsIgnoreCase(Actualop)) {
				ExtentReportBuilder.ReportTestStep("PASSED", "List of records",
						"User is successfully able to select filtered option having no records", mthName);
			} else {
				ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
						"User is not able to select filtered option having no records", mthName);
			}
		} catch (Exception e) {
			ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
					"User failed toto select filtered option having no records in open trust process"+e, mthName);
			e.printStackTrace();
			Assert.fail();
		}


	}
	
	/*
	 * Test Scenario_2- User is able to filter the option that are containing no records
	 */

	public void NorecordsScenario_2(WebDriver driver) throws Exception {

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
				objCM.onMouseHover(driver, objProTrustOR.viewButton);
				String ExpsearchData = getExcelData.readCell("ProcessTrust", "RandomStringSearch");
				objCM.setText(driver, objProTrustOR.SearchFromOpenTrust,ExpsearchData );
				
				objCM.checkElementVisibility(driver, objProTrustOR.ActualOPRecords);

			}

			String Actualop=objCM.getText(driver, objProTrustOR.ActualOPRecords);

			System.out.println(Actualop);

			String ExpErrorCode3 = getExcelData.readCell("ProcessTrust", "ExpErrorCode3");

			System.out.println(ExpErrorCode3);

			if (ExpErrorCode3.equals(Actualop)) {
				ExtentReportBuilder.ReportTestStep("PASSED", "List of records",
						"User is successfully able to enter invalid string in search box showing No records found", mthName);
			} else {
				ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
						"User is not able to enter invlaid data in search box", mthName);
			}
		} catch (Exception e) {
			ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
					"User failed to enter invalid data in search textbox for open trust process"+e, mthName);
			e.printStackTrace();
			Assert.fail();
		}
		driver.switchTo().defaultContent();
//		driver.switchTo().parentFrame();
		objCM.onMouseHover(driver, objProTrustOR.CloseTab_1);
		

	}

}