package objectRepository;

import org.openqa.selenium.By;

public class RS_TP_OpenTrustNavigation_OR {

	public RS_TP_OpenTrustNavigation_OR() {
		// TODO Auto-generated constructor stub
	}
	/*
	 * Navigation to process trust tab
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
	/*
	 * User is able to see the report download Option in excel,PDF and Combined format
	 */
	public By ExcelReportDwnloadbtn=By.xpath("//i[@class='fa fa-file-excel-o text-success']");	
	public By PDFReportDwnldbtn=By.xpath("//i[@class='fa fa-file-pdf-o text-danger']");		
	public By CombinedPDFReportDownldBtn =By.xpath("//i[@id='ViewAllTrust']");
	public By CheckBoxForCOmbinedPDF =By.xpath("//input[@id='jqg_hql_result2_1']");
	public By SearchText= By.xpath("//input[@id='srchRelatAll']");
	public By clientNameUI= By.xpath("//table[@id=\"hql_result2\"]//tr[2]//td[3]");
	public By PaidUsUi= By.xpath("//table[@id=\"hql_result2\"]//tr[2]//td[8]");
	
	public By PT_ExcelReportMsg=By.xpath("//div[contains(text(),'The report TrustProcessedReport has been generated successfully and will be downloaded automatically.')]");
	public By PT_PDFreportMsg= By.xpath("//div[contains(text(),'The report CollectionActivity has been generated successfully and will be downloaded automatically.')]");
	public By PT_CollectionActivityMsg =By.xpath("//div[contains(text(),'The report CollectionActivity has been generated successfully and will be downloaded automatically.')]");
	public By PT_CollectionActivityCombinedMsg = By.xpath("//div[contains(text(),'The report CollectionActivity has been generated successfully and will be downloaded automatically.')]");
	
}
