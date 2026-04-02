package objectRepository;

import org.openqa.selenium.By;

public class RS_TP_ProcessedTrustNavigation_OR {

	public RS_TP_ProcessedTrustNavigation_OR() {
		// TODO Auto-generated constructor stub
	}
	/*
	 * Navigation to processed trust tab
	 */
	public By menubutton =By.id("menuPushIcon");
	public By AccountingButtonn   =By.id("limenu-3");
	public By processtrustButton=By.xpath("//a[contains(text(),'Process Trust')]");
	public By processedTrustTab=By.xpath("//a[normalize-space()='Trust Processed']");	
	public By processTrustTab=By.id("myTab");		
	public By mainTab =By.xpath("//i[@class='fa fa-refresh']");

	public By filtereddata=By.xpath("//table[@id=\"hql_result2\"]");
	
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
	public By listRe=By.xpath("//tr[@id=\"1\"]//td");
	public By ListCount=By.xpath("//span[@id='txtPatPreviewCount']");
	
	public By VerifyButton=By.xpath("(//h3[@class='card-title'])[1]");
	public By clearButton=By.xpath("//div[@id='submitWithoutToggle']//button[contains(@class,'btn btn-danger clearTrustBtnTrustOpen')][normalize-space()='Clear']");
	public By clearbutton2 =By.xpath("//button[@class='btn btn-danger clearTrustBtnTrustOpen showFilterBtn']");
public By ValidationTab=By.xpath("//a[@id='tab1']");
	
	public By ProcessedTrustTab=By.xpath("//a[normalize-space()='Trust Processed']");
	public By CustomDateOption= By.xpath("//input[@id='customDateRange']");
	public By EnterFromDate =By.xpath("//input[@name='daterangepicker_start']");
	public By EnterToDate = By.xpath("//input[@name='daterangepicker_end']");
	public By ApplyButton= By.xpath("//button[normalize-space()='Apply']");
	public By ViewButton =By.xpath("//button[@class='btn btn-success viewTrustProc showFilterBtnTrustProcessed']");
	public By AdvancedFilterButton=By.xpath("//a[@id='advancedTrustProcessedFilter']");
	public By AdvViewButton=By.xpath("//button[@class='btn btn-success viewTrustProc']");
	public By AdvClearButton= By.xpath("//button[@class='btn btn-danger clearTrustBtn']");
	public By listCount =By.id("txtTrpTrustCount");
	public By ClearFilter=By.xpath("//button[@class='btn btn-danger clearTrustBtn showFilterBtnTrustProcessed']");
	public By PublishDropDown =By.xpath("//span[normalize-space()='Select publish status']");
	public By PublishCheckBox=By.xpath("//input[@value='published']");
	public By UnpublishCheckBox =By.xpath("//input[@value='unpublished']");
	public By Search =By.id("srchRelatAll2");
	public By CheckBox =By.xpath("//table[@id=\"filterData\"]//following::input[@role=\"checkbox\"]");
	public By ClientName =By.xpath("//table[@id=\"filterData\"]//tr[3]//td[3]");
	public By Commission =By.xpath("//table[@id=\"filterData\"]//tr[3]//td[5]");
	public By InvoiceNumber =By.xpath("//table[@id=\"filterData\"]//tr[3]//td[32]");
	/*
	 * Verify that user can able to Excel report download button on processed trust tab
	 */
	public By PT_ExcelReportBtn=By.xpath("//table[@id=\"filterData\"]//tr[3]//td[19]");
	public By PT_PDFreportBtn= By.xpath("//table[@id=\"filterData\"]//tr[3]//td[20]");
	public By PT_CollectionActivityBtn =By.xpath("//div[@id='jqgh_filterData_Process2']//i[@class='fa fa-print print-dropdown-toggle']");
	public By PT_CollectionActivityCombinedBtn = By.xpath("//a[@onclick='printAll()']");
	public By PT_CollectionActivityindivisualBtn= By.xpath("//a[@onclick='viewAll()']");
	public By PT_invoiceBtn =By.xpath("//i[@class='fa fa-file-pdf-o text-danger']//following::a[@class=\"report4\"]");
	public By PT_MainIvoiceBtn =By.xpath("//div[@id='jqgh_filterData_Process4']//i[@class='fa fa-print print-dropdown-toggle']");
	public By PT_InvoiceCombinedBtn = By.xpath("//a[@onclick=\"ViewAllRep('combined')\"]");
	public By PT_InvoiceindivisualBtn= By.xpath("//a[@onclick=\"ViewAllRep('individual')\"]");
	public By PT_ERPreportBtn= By.xpath("//button[@id='masSubmit']");
	
	/*
	 * for Report validation
	 */
	public By PT_ExcelReportMsg=By.xpath("//div[contains(text(),'The report TrustProcessedReport has been generated successfully and will be downloaded automatically.')]");
	public By PT_PDFreportMsg= By.xpath("//div[contains(text(),'The report CollectionActivity has been generated successfully and will be downloaded automatically.')]");
	public By PT_CollectionActivityMsg =By.xpath("//div[contains(text(),'The report CollectionActivity has been generated successfully and will be downloaded automatically.')]");
	public By PT_CollectionActivityCombinedMsg = By.xpath("//div[contains(text(),'The report CollectionActivity has been generated successfully and will be downloaded automatically.')]");
	public By PT_CollectionActivityindivisualMsg= By.xpath("//div[contains(text(),'The report CollectionActivity has been generated successfully and will be downloaded automatically.')]");
	public By PT_invoiceMsg =By.xpath("//div[contains(text(),'has been generated successfully and will be downloaded automatically.')]");
	public By PT_MainIvoiceMsg =By.xpath("//div[@id='jqgh_filterData_Process4']//i[@class='fa fa-print print-dropdown-toggle']");
	public By PT_InvoiceCombinedMsg = By.xpath("//div[contains(text(),'The report InvoiceReport has been generated successfully and will be downloaded automatically.')]");
	public By PT_InvoiceindivisualMsg= By.xpath("//div[contains(text(),'The report InvoiceReport has been generated successfully and will be downloaded automatically.')]");
	public By PT_ERPreportMsg= By.xpath("//button[@id='masSubmit']");
	
	
}
