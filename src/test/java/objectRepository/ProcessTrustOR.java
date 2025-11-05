package objectRepository;

import org.openqa.selenium.By;

public class ProcessTrustOR {

	/*
	 * For Navigation 
	 */
	public By menubutton =By.id("menuPushIcon");
	public By AccountingButtonn   =By.id("limenu-3");
	public By processtrustButton=By.xpath("//a[contains(text(),'Process Trust')]");
	public By processTrustTab=By.id("myTab");		
	
	
	/*
	 * for highlighting the filtered data
	 */
	
	public By filtereddata=By.xpath("//table[@id=\"hql_result2\"]");
	
	/*
	 * For Open Trust Process
	 */
	
	
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
	 * for applying filter for date & all payments
	 */
	
	public By dropdownPayment=By.xpath("//span[contains(text(),'Select Payment Type')]");	
	public By selectAll=By.xpath("(//input[@type='checkbox'])[1]");
//	public by highlightingData=By.xpath("")
	
	/*
	 * for applying filter for date &Trust Group
	 */
	
	public By dropdownTrustGroup= By.xpath("//span[contains(text(),'Select Trust Group')]");
	public By selectAllTrsustGroup=By.xpath("(//input[@type='checkbox'])[4]");

	
	/*
	 * for applying filter  for date and Transaction type and Trust frequency
	 */
	
	public By dropdownTransType=By.xpath("//span[normalize-space()='Select Transaction Type']");
	public By selectallTransType=By.xpath("(//input[@type='checkbox'])[9]");
	

	public By dropdownFreqType=By.xpath("//div[@class='form-group float-label-control']//span[@class='placeholder'][normalize-space()='Select Trust Frequency']");
	public By selectallFreqType=By.xpath("//div[@class='row pt-2']//li[@class='ms-select-all']//input[@type='checkbox']");
	
	/*
	 * for applying run date & Selecting all values from test formula and G/L Code dropDown of advance filter
	 */

	public By advancedfilter=By.xpath("//a[@id='toggleAdvancedOptions']");
	public By dropdowntrustformula= By.xpath("//span[normalize-space()='Select Trust Formula']");
	public By selectalltrustformula=By.xpath("(//input[@type='checkbox'])[21]");
	public By dropdownglcode= By.xpath("//span[contains(text(),'Select G/L Code')]");
	public By selectallglcode=By.xpath("(//input[@type='checkbox'])[25]");
	
	
	/*
	 * for applying run date & Selecting all values from Corporate name and Client name dropDown of advance filte
	 */
	public By dropdownCorporatename=By.xpath("//span[normalize-space()='Select Corporate Name']");
	public By selectallCorporatename= By.xpath("(//input[@type='checkbox'])[29]");
	public By dropdownclientname=By.xpath("//span[normalize-space()='Select Client Name']");
	public By selectallclientname= By.xpath("(//input[@type='checkbox'])[42]");
	
	
	
	/*
	 * Fetching data from excel sheet
	 */
	
	public By SearchFromOpenTrust=By.id("srchRelatAll");
	public By ExportSearchFromOpenTrust=By.xpath("//tr[@id=\"1\"]//td[3]");
	
	/*
	 * Report Generation
	 */
	
	public By ExcelReportDownload= By.xpath("//i[@class='fa fa-file-excel-o text-success']");
	public By ActualClientname=By.xpath("//tr[td[text()='1']]/td[3]");

	public By PDFReportDownload=By.xpath("//i[@class='fa fa-file-pdf-o text-danger']");
	public By CombinedCheckbox=By.xpath("//div[@id='jqgh_hql_result2_cb']");
	public By CombinedPDFDownload=By.xpath("//i[@id='ViewAllTrust']");
	public By Clearbutton=By.xpath("");
	
	
	/*
	 * For negative scenario
	 */
	
	/*
	 *  1. Without selecting any date, click on View Button
	 */
	//	public By viewButton=By.xpath("//div[@id='submitWithoutToggle']//a[@class='btn btn-success viewRecord mr-2'][normalize-space()='View']");
	public By ActualError1=By.xpath("//div[@class='toast-message']");
	
	/*
	 * 2. Without selecting any details, Click on Run trust process
	 */
	public By RunTrustProcessButton=By.xpath("//div[@id='submitWithoutToggle']//a[@class='btn btn-primary trust'][contains(text(),'Run')]");
	public By ActualError2=By.xpath("//div[@class='toast-message']");
	
	
	/* 
	 * 3. Selecting date 1 july, #1 DP Only in trust group showing No Results found
	 */
	public By SelectingDPONLY=By.xpath("//span[contains(text(),'#1 DP ONLY')]");
	public By ActualOPRecords=By.xpath("//p[normalize-space()='No Record(s) Found']");
	
	/*
	 * 4. Enter Invalid data in in search box --> NO result found
	 * 5. Try to enter future date in run date option
	 */
	
	/*
	 * Closing The process trust tab
	 */
	
	public By CloseTab_1=By.xpath("//i[@class='fa fa-times icon-remove']");
	
	
	
	


}
