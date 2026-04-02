package objectRepository;

import org.openqa.selenium.By;

public class TP_27_OR {

	public TP_27_OR() {
		// TODO Auto-generated constructor stub
	}
	/*
	 * Navigation
	 */
	public By menubutton =By.id("menuPushIcon");
	public By AccountingButtonn   =By.id("limenu-3");
	public By processtrustButton=By.xpath("//a[contains(text(),'Process Trust')]");
	public By processedTrustTab=By.xpath("//a[normalize-space()='Trust Processed']");	
	public By mainTab =By.xpath("//i[@class='fa fa-refresh']");
public By ValidationTab=By.xpath("//a[@id='tab1']");
	
	public By ProcessedTrustTab=By.xpath("//a[normalize-space()='Trust Processed']");
	public By CustomDateOption= By.xpath("//input[@id='customDateRange']");
	public By EnterFromDate =By.xpath("//input[@name='daterangepicker_start']");
	public By EnterToDate = By.xpath("//input[@name='daterangepicker_end']");
	public By ApplyButton= By.xpath("//button[normalize-space()='Apply']");
	public By ViewButton =By.xpath("//button[@class='btn btn-success viewTrustProc showFilterBtnTrustProcessed']");
	public By listRe=By.xpath("//div[@id=\"gview_filterData\"]");
	public By listCount =By.id("txtTrpTrustCount");
	public By AdvancedFilterButton=By.xpath("//a[@id='advancedTrustProcessedFilter']");
	public By AdvViewButton=By.xpath("//button[@class='btn btn-success viewTrustProc']");
	
	public By DivertButton=By.xpath("//div[@id='TrustDetails']//h3[@class='card-title']");
	public By ClearFilter=By.xpath("//button[@class='btn btn-danger clearTrustBtn showFilterBtnTrustProcessed']");
	/*
	 * Verify "Invoice #" and "Invoice" Columns Are Moved to Trust Processed Tab`
	 */
	public By InvoiceColumn= By.xpath("//th[@id='filterData_Process4']");
	/*
	 * Verify "Invoice #" Column Header and Name
	 */
	public By InvoiceColumnHeader=By.xpath("//label[normalize-space()='Invoice #']");
	/*
	 * Verify "Invoice" Column Header and Name
	 */
	public By InvoiceColumnName= By.xpath("//div[@id='jqgh_filterData_Process4']");
	public By AdvClearButton= By.xpath("//button[@class='btn btn-danger clearTrustBtn']");

	/*
	 * Verify PDF Icon in the "Invoice" Column
	 */
	public By InvoicePDFIcon=By.xpath("//td[@title='1829 ']//i[@class='fa fa-file-pdf-o text-danger']");
	/*
	 * Verify "Invoice" column printer icon dropdown
	 */
	public By InvoicePritDrpdwn=By.xpath("//div[@id='jqgh_filterData_Process4']//i[@class='fa fa-print print-dropdown-toggle']");
	public By SelectClient1= By.xpath("//input[@id='jqg_filterData_2455']");
	public By CompbinedVerify= By.xpath("//a[@onclick=\"ViewAllRep('combined')\"]");
	public By IndivisualVerify= By.xpath("//a[@onclick=\"ViewAllRep('individual')\"]");
	/*
	 * Verify Combined Report Export from Printer Icon
	 */
	public By ExportSuccesToastMsg= By.xpath("//div[@class='toast-message']");
			
			
	/*
	 * Verify Individual Reports Export from Printer Icon
	 */
	/*
	 *  Verify Reduced Width of "Status" Column
	 */
	public By StatusColumn= By.xpath("//th[@id='filterData_status']");
	/*
	 * Verify "Invoice Date" Filter
	 */
	public By RemovalInvoiceDate= By.xpath("//div[@class='fixed-header push-left190 transSactionHide']");
	/*
	 * Verify "Invoice #" Filter
	 */
	public By InvoiceAvail=By.xpath("//label[normalize-space()='Invoice #']");
	public By InvoiceSetText=By.xpath("//input[@id='invoiceIds']");		
	
}
