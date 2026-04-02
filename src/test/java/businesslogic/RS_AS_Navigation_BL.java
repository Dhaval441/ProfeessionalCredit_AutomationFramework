package businesslogic;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import objectRepository.RS_AS_Navigation_OR;
import objectRepository.RS_TP_OpenTrustNavigation_OR;
import utilities.CommonMethods;
import utilities.ExtentReportBuilder;
import utilities.RWExcel;

public class RS_AS_Navigation_BL extends ExtentReportBuilder{

	public RS_AS_Navigation_BL() {
		// TODO Auto-generated constructor stub
	}

	String mthName;
	CommonMethods objCM = new CommonMethods();
	RS_AS_Navigation_OR objAccStagingOR = new RS_AS_Navigation_OR();
	RWExcel getExcelData = new RWExcel();
	Duration due = Duration.ofSeconds(30);
	/*
	 * Navigation to Account staging
	 */
	public void navigationAccountStaging(WebDriver driver) throws Exception {

		
		Thread.sleep(20000);
		objCM.waitUntillVisibilityOfElement(driver, objAccStagingOR.menubutton,due);
		try {
			mthName = new Object() {
			}.getClass().getEnclosingMethod().getName();

			objCM.onMouseHover(driver, objAccStagingOR.menubutton);
			objCM.onMouseHover_withoutClick(driver, objAccStagingOR.clientServiceBtn);
			objCM.onMouseHover(driver, objAccStagingOR.AccStagingBtn);
			driver.switchTo().frame("accountStaging");
			objCM.onMouseHover(driver, objAccStagingOR.CompleteTab);
			String Enterdate = getExcelData.readCell("ProcessTrust", "AS_NavigationDate");
			objCM.setText(driver, objAccStagingOR.EnterDate,Enterdate);
//			objCM.onMouseHover(driver, objAccStagingOR.ApplyBtn);
			objCM.onMouseHover(driver, objAccStagingOR.SearchBtn);
			objCM.onMouseHover(driver, objAccStagingOR.BatchSelection);
			objCM.onMouseHover_withoutClick(driver, objAccStagingOR.ViewAckBtn);
			objCM.listObjecLocater(driver, objAccStagingOR.ViewAckBtn);

		

			if (objCM.isElementPresent(driver, objAccStagingOR.ViewAckBtn)) {
				ExtentReportBuilder.ReportTestStep("PASSED", "PASS",
						"User navigated successfully to Account staging tab", mthName);
			} else {
				ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
						"User is not able to navigate Account staging tab", mthName);
			}
		} catch (Exception e) {
			ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
					"User failed to navigate Account staging tab"+e, mthName);
			e.printStackTrace();
			Assert.fail();
		}

		driver.navigate().refresh();
	}
	
}
