package objectRepository;

import org.openqa.selenium.By;

public class TP_3_OR {

	public TP_3_OR() {
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
	
	/*
	 * Verify that applying Run Date filter displays available trusts and allows grid manipulation on the Trust Open screen
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
	 * Verify that clicking the Excel icon and selecting Excel for export type downloads a report that mirrors the “Report” (Excel) option in the Trust Processed screen, with results returned in a timely manner
	 */
	public By ExcelReportDownload= By.xpath("//i[@class='fa fa-file-excel-o text-success']");
	public By ActualClientname=By.xpath("//tr[@id='1']//td[3]");
	/*
	 * Verify that clicking the Excel icon and selecting PDF for export type downloads a report that mirrors the “Collection Activity” (PDF) option in the Trust Processed screen, with results returned in a timely manner
	 */
	public By PDFReportDownload=By.xpath("//i[@class='fa fa-file-pdf-o text-danger']");
	/*
	 * Verify that selecting one or more records and clicking the printer icon downloads a single PDF report that combines all selected records, mirroring the “Collection Activity” (PDF) option in the Trust Processed screen
	 */
	public By CombinedCheckbox=By.xpath("//div[@id='jqgh_hql_result2_cb']");
	public By CombinedPDFDownload=By.xpath("//i[@id='ViewAllTrust']");
	public By Clearbutton=By.xpath("");
	/*
	 * Verify that an alert is displayed when no records are selected and the user clicks the printer icon under the "Process Trust" header
	 */
}
