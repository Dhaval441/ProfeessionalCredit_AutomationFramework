package objectRepository;

import org.openqa.selenium.By;

public class RS_AS_Navigation_OR {

	public RS_AS_Navigation_OR() {
		// TODO Auto-generated constructor stub
	}

	public By menubutton =By.id("menuPushIcon");
	public By clientServiceBtn =By.xpath("//a[normalize-space()='Client Service']");
	public By AccStagingBtn =By.xpath("//a[@onclick='addTab(\"accountStaging\",\"Account Staging\")']");
	//account-staging-view
	public By CompleteTab =By.xpath("//a[@id='acs-section4']");
	public By EnterDate =By.xpath("//input[@id='clientDate']");
	public By ApplyBtn =By.xpath("//button[contains(text(),'Apply')]");
	public By SearchBtn =By.xpath("//button[@id='clientFilter']");
	public By BatchSelection =By.xpath("//table[@id=\"loadAllAccountClient\"]//tr[2]//a[@class=\"loadByBatch C\"]");
	public By ViewAckBtn =By.xpath("//button[@id='getAcknowledgmentLocal']");
}
