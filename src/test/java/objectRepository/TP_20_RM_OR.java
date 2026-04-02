package objectRepository;

import org.openqa.selenium.By;

public class TP_20_RM_OR {

	public TP_20_RM_OR() {
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
	public By DivertButton=By.xpath("//div[@id='TrustDetails']//h3[@class='card-title']");
	
	/*
	 * User is able to select date and Select from G/L Code using using filters and able to view records 
	 */
	public By dropdownSeleG_LCode =By.xpath("//div[@id='advanceTrustProcessedFiltersSection_1']//div[@class='form-group float-label-control']//span[@class='placeholder']");
	public By SelectAllG_LCode=By.xpath("//div[@id='advanceTrustProcessedFiltersSection_1']//div[@class='form-group float-label-control']//li[@class='ms-select-all']//input[@type='checkbox']");
	public By AdvancedFilterButton=By.xpath("//a[@id='advancedTrustProcessedFilter']");
	public By AdvViewButton=By.xpath("//button[@class='btn btn-success viewTrustProc']");
	public By AdvClearButton= By.xpath("//button[@class='btn btn-danger clearTrustBtn']");
	
	/*
	 * User is able to select date and Select from ERP Export reports using using filters and able to view records 
	 */
	public By dropdownSeleERPReports =By.xpath("//span[normalize-space()='Select ERP Export status']");
	public By SelectAllERPReports=By.xpath("//body[1]/div[1]/section[2]/div[1]/div[4]/div[4]/div[1]/div[1]/ul[1]/li[1]/label[1]");
	public By RedropdownSeleERPReports= By.xpath("//span[normalize-space()='All selected']");
	
	/*
	 * User is able to select date and Select from Publish Status using using filters and able to view records 
	 */
	public By dropdownSelePublishStatus =By.xpath("//span[normalize-space()='Select publish status']");
	public By SelectAllPublishStatus=By.xpath("//div[@id='advanceTrustProcessedFiltersSection_2']//li[@class='ms-select-all']//label[contains(text(),'[Select all]')]");
	
	
	/*
	 * User is able to select date and enter the details of trust batch and able to view records
	 */
	
	public By enterTrustBatch = By.xpath("//input[@id='trustBatchInput']");
	
	/*
	 * User is able to select date and enter the details of invoice id and able to view records 
	 */
	public By enterInvoiceId= By.xpath("//input[@id='invoiceIds']");
	
	/*
	 * Run trust and reverse trust functionality
	 */
	
	public By processTrustTab=By.id("myTab");	
	public By rundate=By.xpath("//input[@id='dpicker']");
	public By bymonthSelection=By.xpath("(//th[@class=\"datepicker-switch\"])[01]");
	public By byyearSelection=By.xpath("(//th[@class=\"datepicker-switch\"])[02]");
	public By bymainYearSelection=By.xpath("(//th[@class=\"datepicker-switch\"])[03]");
	
	public By yearSelelection=By.xpath("//td[01]/following::span[contains(text(),'2025')]");
	public By monthSelection=By.xpath("//td[01]/following::span[contains(text(),'Jul')]");
	
	public By dateSelection =By.xpath("(//td[@class='day'][normalize-space()='1'])[1]");
	public By dateSelection2 =By.xpath("(//td[@class='active day'][normalize-space()='1'])[1]");

	
	public By viewButton=By.xpath("//div[@id='submitWithoutToggle']//a[@class='btn btn-success viewRecord mr-2'][normalize-space()='View']");
	public By viewbutton2= By.xpath("//div[@id='submitWithToggle']//a[@class='btn btn-success viewRecord mr-2'][normalize-space()='View']");
//	public By listRe=By.xpath("//tr[@id=\"1\"]//td");
	public By ListCount=By.xpath("//span[@id='txtPatPreviewCount']");
	
	public By VerifyButton=By.xpath("(//h3[@class='card-title'])[1]");
	public By clearButton=By.xpath("//div[@id='submitWithoutToggle']//button[contains(@class,'btn btn-danger clearTrustBtnTrustOpen')][normalize-space()='Clear']");
	public By filtereddata=By.xpath("//table[@id=\"hql_result2\"]");
	public By clearbutton2 =By.xpath("//button[@class='btn btn-danger clearTrustBtnTrustOpen showFilterBtn']");
	//
	public By Search =By.xpath("//input[@id='srchRelatAll']");//sendkeys 20021
	public By ClientSelection =By.xpath("//input[@id='jqg_hql_result2_1']");

	
	public By RunTrust=By.xpath("//div[@id='submitWithoutToggle']//a[@class='btn btn-primary trust'][contains(text(),'Run')]");
	public By CloseToast1=By.xpath("//button[@role='button']");
	public By SuccessToastMsg= By.xpath("//div[@class=\"toast toast-success\"]//following::div[contains(text(),'The Trust process batch has been processed successfully with 1 success and 0 failures record.')]");
	public By Search2=By.xpath("//input[@id='srchRelatAll2']");//send Keys
	public By ClientSelection2=By.xpath("//table[@id=\"filterData\"]//tr[3]//td[1]");
	
	public By ReverseTrust=By.xpath("//button[@id='reverseTrustProcessed']");
	public By ClickonYes=By.xpath("//button[@id='confirmBtn']");
	public By  SuccessToastMsg2= By.xpath("//div[contains(text(),'Trust reverse process batch')]");
	
	
//	public By filtereddata=By.xpath("//table[@id=\"hql_result2\"]");
//	public By clearbutton2 =By.xpath("//button[@class='btn btn-danger clearTrustBtnTrustOpen showFilterBtn']");
}

