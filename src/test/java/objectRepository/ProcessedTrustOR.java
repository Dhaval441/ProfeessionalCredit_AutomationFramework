package objectRepository;

import org.openqa.selenium.By;

public class ProcessedTrustOR {

	public ProcessedTrustOR() {
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
	 * user is able to select date form option and view records
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
	 * User is able to select date and Select Corporate Tab from filters and able to view records
	 */
	public By dropdownSeleCorporate =By.xpath("//span[normalize-space()='Select Corporate']");
	public By SelectAllCorporate=By.xpath("//body[1]/div[1]/section[2]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/label[1]");

	/*
	 *User is able to select date and Select Option from Parent Tab from filters and able to view records
	 */
	public By dropdownSeleParent =By.xpath("//span[normalize-space()='Select Parent']");
	public By SelectAllParent=By.xpath("//body[1]/div[1]/section[2]/div[1]/div[1]/div[2]/div[1]/div[1]/ul[1]/li[1]/label[1]/input[1]");
	
	/*
	 * 	User is able to select date and Select Option from Client Tab from filters and able to view records 
	 */
	public By dropdownSeleClient =By.xpath("//span[normalize-space()='Select Client']");
	public By SelectAllClient=By.xpath("//div[@class='col-lg']//li[@class='ms-select-all']//input[@type='checkbox']");
	
	/*
	 * User is able to select date and Select Export type Tab from filters and able to view records
	 */
	public By dropdownSeleExportType =By.xpath("//span[normalize-space()='Select Export Type']");
	public By SelectAllExportType=By.xpath("//body[1]/div[1]/section[2]/div[1]/div[2]/div[1]/div[1]/div[1]/ul[1]/li[1]/label[1]");
	
	/*
	 * User is able to select date and Select Option Trust Receipt Method from filters and able to view records 
	 */
	public By dropdownSeleTrustReceiptMethod =By.xpath("//span[normalize-space()='Select Trust Receipt Method']");
	public By SelectAllTrustReceiptMethod=By.xpath("//body[1]/div[1]/section[2]/div[1]/div[2]/div[2]/div[1]/div[1]/ul[1]/li[1]/label[1]");
	
	/*
	 * User is able to select date and Select Option ACH/CH using filters and able to view records 
	 */
	public By dropdownSeleACH_CH =By.xpath("//span[normalize-space()='Select ACH/CH']");
	public By SelectAllACH_CH=By.xpath("//body[1]/div[1]/section[2]/div[1]/div[2]/div[3]/div[1]/div[1]/ul[1]/li[1]/label[1]");
	
	/*
	 * User is able to select date and Select from Trust frequency using filters and able to view records 
	 */
	public By dropdownSeleTrustFreq =By.xpath("//div[@class='row pt-4']//span[@class='placeholder'][normalize-space()='Select Trust Frequency']");
	public By SelectAllTrustFreq=By.xpath("//body[1]/div[1]/section[2]/div[1]/div[2]/div[4]/div[1]/div[1]/ul[1]/li[1]/label[1]");
	
	/*
	 * User is able to select date and Select from G/L Code using using filters and able to view records 
	 */
	public By dropdownSeleG_LCode =By.xpath("//div[@id='advanceTrustProcessedFiltersSection_1']//div[@class='form-group float-label-control']//span[@class='placeholder']");
	public By SelectAllG_LCode=By.xpath("//div[@id='advanceTrustProcessedFiltersSection_1']//div[@class='form-group float-label-control']//li[@class='ms-select-all']//input[@type='checkbox']");
	
	/*
	 * User is able to select date and Select from ERP Export reports using using filters and able to view records 
	 */
	public By dropdownSeleERPReports =By.xpath("//span[normalize-space()='Select ERP Export status']");
	public By SelectAllERPReports=By.xpath("//body[1]/div[1]/section[2]/div[1]/div[4]/div[4]/div[1]/div[1]/ul[1]/li[1]/label[1]");
	
	/*
	 * User is able to select date and Select from Publish Status using using filters and able to view records 
	 */
	public By dropdownSelePublishStatus =By.xpath("//span[normalize-space()='Select publish status']");
	public By SelectAllPublishStatus=By.xpath("//div[@id='advanceTrustProcessedFiltersSection_2']//li[@class='ms-select-all']//label[contains(text(),'[Select all]')]");
	
}
