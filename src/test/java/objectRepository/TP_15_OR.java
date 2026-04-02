package objectRepository;

import org.openqa.selenium.By;

public class TP_15_OR {

	public TP_15_OR() {
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
	 * Verify that the G/L Code filter added on the Trust Processed Screen 
	 */
	public By dropdownSeleG_LCode =By.xpath("//div[@id='advanceTrustProcessedFiltersSection_1']//div[@class='form-group float-label-control']//span[@class='placeholder']");
	public By SelectAllG_LCode=By.xpath("//div[@id='advanceTrustProcessedFiltersSection_1']//div[@class='form-group float-label-control']//li[@class='ms-select-all']//input[@type='checkbox']");
	public By AdvancedFilterButton=By.xpath("//a[@id='advancedTrustProcessedFilter']");
	public By AdvViewButton=By.xpath("//button[@class='btn btn-success viewTrustProc']");
	public By AdvClearButton= By.xpath("//button[@class='btn btn-danger clearTrustBtn']");
	public By DivertButton=By.xpath("//div[@id='TrustDetails']//h3[@class='card-title']");
	/*
	 * Verify that the Trust Batch filter allows users to enter a comma-delimited string or a range of batch IDs	 
	 */
	public By TrustBatchIDs= By.xpath("//input[@id='trustBatchInput']");
	
	public By CloseTrustTab= By.xpath("//i[@class='fa fa-times icon-remove']");
}
