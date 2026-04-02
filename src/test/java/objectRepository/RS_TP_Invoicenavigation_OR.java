	package objectRepository;

import org.openqa.selenium.By;

public class RS_TP_Invoicenavigation_OR {

	public RS_TP_Invoicenavigation_OR() {
		// TODO Auto-generated constructor stub
	}
	/*
	 * Navigation to process trust tab
	 */
	/*
	 * 2.Verify that the “Invoices” tab is loaded by default
	 */
	public By menubutton =By.id("menuPushIcon");
	public By AccountingButtonn   =By.id("limenu-3");
	public By processtrustButton=By.xpath("//a[contains(text(),'Process Trust')]");
	public By processedTrustTab=By.xpath("//a[normalize-space()='Trust Processed']");	
	public By invoiceTab=By.xpath("//ul[@id='menuItem-list-464']//a[@onclick='addTab(\"invoices\",\"Invoices\")'][normalize-space()='Invoices']");		
	public By processTrustTab=By.id("myTab");		
	public By mainTab =By.xpath("//i[@class='fa fa-refresh']");
	public By ViewOutstandingBtn=By.xpath("//button[@id='filterReceivablesReverse']");
	public By ValidationTab=By.xpath("//a[@id='tab1']");
	public By ClearButton=By.xpath("//button[@id='revClearReceivables']");
	public By filtereddata=By.xpath("//table[@id=\"hql_result2\"]");
	public By ListCount=By.xpath("//span[@id='txtPatPreviewCount']");
	public By InvoicePDFBtn= By.xpath("//a[@id='btn1_stats_15']//i[@class='fa fa-file-pdf-o text-danger']");
	public By InvoiceMainPDFbtn= By.xpath("//div[@id='jqgh_invoiceDataGrid_invoiceReport']//i[@class='fa fa-print print-dropdown-toggle']");
	public By InvoiceCombinedPDFbtn= By.xpath("//a[@onclick=\"exportInvoiceReport('combined')\"]");
	public By InvoiceIndiPDFbtn= By.xpath("//a[@onclick=\"exportInvoiceReport('individual')\"]");
	
	public By InvBSPDFBtn= By.xpath("//a[@id='btn2_stats_15']//i[@class='fa fa-file-pdf-o text-danger']");
	public By InvBSMainPDFbtn= By.xpath("//div[@id='jqgh_invoiceDataGrid_billingReport']//i[@class='fa fa-print print-dropdown-toggle']");
	public By InvBSCombinedPDFbtn= By.xpath("//a[@onclick=\"exportBillingReport('combined')\"]");
	public By InvBSIndiPDFbtn= By.xpath("//a[@onclick=\"exportBillingReport('individual')\"]");
	
	public By invoiceNumberUI= By.xpath("//table[@id=\"invoiceDataGrid\"]//tr[2]//td[6]");
	public By ClientNameUI= By.xpath("//table[@id=\"invoiceDataGrid\"]//tr[2]//td[5]");
	
	
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
