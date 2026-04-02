package objectRepository;

import org.openqa.selenium.By;

public class TP_17_OR {

	public TP_17_OR() {
		// TODO Auto-generated constructor stub
	}

	
	/*
	 * For Navigation 	
	 */
	public By menubutton =By.id("menuPushIcon");
	public By AccountingButtonn   =By.id("limenu-3");
	public By processtrustButton=By.xpath("//a[contains(text(),'Process Trust')]");
	public By processedTrustTab=By.xpath("//a[normalize-space()='Trust Processed']");	
	public By mainTab =By.xpath("//i[@class='fa fa-refresh']");
	
	/*
	 * Verify that the "Run Date" filter allows selection of a date range on the Trust Processed screen 
	 */
	public By ValidationTab=By.xpath("//a[@id='tab1']");
	
	public By ProcessedTrustTab=By.xpath("//a[normalize-space()='Trust Processed']");
	public By CustomDateOption= By.xpath("//input[@id='customDateRange']");
	public By EnterFromDate =By.xpath("//input[@name='daterangepicker_start']");
	public By EnterToDate = By.xpath("//input[@name='daterangepicker_end']");
	public By ApplyButton= By.xpath("//button[normalize-space()='Apply']");
	public By ViewButton =By.xpath("//button[@class='btn btn-success viewTrustProc showFilterBtnTrustProcessed']");
	public By listRe=By.xpath("//div[@id=\"gview_filterData\"]");
	public By listCount =By.id("txtTrpTrustCount");
	public By ClearFilter=By.xpath("//button[@class='btn btn-danger clearTrustBtn showFilterBtnTrustProcessed']");
	
	/*
	 * Verify that the Trust Reverse tab is removed, and the Reverse Trust functionality is Available to the Trust Processed tab
	 */
	public By ReverseTrustButton =By.xpath("//button[@id='reverseTrustProcessed']");
	
	
	/*
	 * Verify that a toast alert is displayed when the Reverse Trust button is clicked without selecting any trusts on the Trust Processed tab
	 */
	public By ReverseToastMsg = By.xpath("//div[@class='toast toast-error']");
}
