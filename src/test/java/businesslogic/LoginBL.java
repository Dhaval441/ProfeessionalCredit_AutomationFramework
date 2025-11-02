package businesslogic;

import java.io.IOException;
import java.text.ParseException;
import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import objectRepository.LoginPageOR;
import utilities.CommonMethods;
import utilities.ExtentReportBuilder;

public class LoginBL extends ExtentReportBuilder {
	String username, password;
	String mthName;
	CommonMethods objCM = new CommonMethods();
	LoginPageOR objLoginOR = new LoginPageOR();
	Duration due = Duration.ofSeconds(30);


	
	public void launchApplication(WebDriver driver, String url) throws IOException, ParseException {
	try {
		mthName = new Object() {
		}.getClass().getEnclosingMethod().getName();
		if (objCM.launchURL(driver, url)) {
			ExtentReportBuilder.ReportTestStep("PASS", "Launching url in browser.", "Application launched successfully", mthName);
			Thread.sleep(5000);
		} else {
			Assert.assertTrue(false);
			ExtentReportBuilder.ReportTestStep("FAILED", "Launching url in browser.", "Application is NOT launched successfully", mthName);
		}
	} catch (Exception e) {
		ExtentReportBuilder.ReportTestStep("Error in", "Launching url in browser.", "Exception while launching url.", mthName);
		Assert.fail();
	}

}
	
	
	public void userLogin(WebDriver driver, String username, String password) throws IOException, ParseException {
	try {
		mthName = new Object() {
		}.getClass().getEnclosingMethod().getName();
//		Thread.sleep(5000);

		
		objCM.onMouseHover(driver, objLoginOR.loginButton);
		Thread.sleep(10000);	
		
		objCM.setText(driver, objLoginOR.Username, "mangesh.gadekar@rishabhsoft.com");
		objCM.onMouseHover(driver, objLoginOR.nextbutton);
		objCM.setText(driver, objLoginOR.Pass, "Mangad##9730");
		objCM.onMouseHover(driver, objLoginOR.nextbutton);
        // ✅ Wait until home button is visible & clickable
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(140)); // timeout 140s
        WebElement homeElement = wait.until(ExpectedConditions.elementToBeClickable(objLoginOR.homeBtn));

        if (homeElement.isDisplayed()) {
            ExtentReportBuilder.ReportTestStep("PASSED", "PASS",
                    "User logged in to application successfully", mthName);
        } else {
            ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
                    "User is NOT logged in to application successfully", mthName);
            Assert.fail("Home button not displayed after login");
        }

    } catch (Exception e) {
        ExtentReportBuilder.ReportTestStep("FAILED", "FAIL",
                "User is NOT logged in to application successfully. Error: " + e.getMessage(), mthName);
        e.printStackTrace();
        Assert.fail("Login failed due to exception: " + e.getMessage());
    }

	
	
}

	
	
	
}
