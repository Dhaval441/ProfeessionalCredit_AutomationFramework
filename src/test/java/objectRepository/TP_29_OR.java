package objectRepository;

import org.openqa.selenium.By;

public class TP_29_OR {

	public TP_29_OR() {
		// TODO Auto-generated constructor stub
	}
	/*
	 * Navigation
	 */
	
	
	/*
	 * 1.Verify Navigation to the New "Invoices" Screen
	 */
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
	public By ValidationTab=By.xpath("//a[@id='tab1']");
	public By ClearButton=By.xpath("//button[@id='revClearReceivables']");
	public By filtereddata=By.xpath("//table[@id=\"hql_result2\"]");
	public By ListCount=By.xpath("//span[@id='txtPatPreviewCount']");
	/*
	 * 3.Verify combined features from legacy tabs
	 */
	public By ViewOutstandingBtn=By.xpath("//button[@id='filterReceivablesReverse']");
	public By RecievablesHieghlight=By.xpath("//div[@id=\"gbox_invoiceDataGrid\"]");	
	public By AddInvoice=By.xpath("//button[normalize-space()='Add Invoice']");		
	public By processInvoiceBtn=By.xpath("//button[@id='addInvoiceAction']");		
	public By ProcessPopUpCloseBtn =By.xpath("//div[@class='jBox-closeButton jBox-noDrag']");
	public By ReverseFunBtn =By.xpath("//a[@id='btn1_15']//i[@class='fa fa-reply']");
	
	/*
	 * 4.Verify “Invoice Open” Functionality in the New Screen
	 */
	/*
	 * 5.Verify “Invoice Processed” Functionality in the New Screen
	 */
	
	public By AddInvoiceDate=By.xpath("//input[@id='manualDate']");
	public By ClientDrpDwn=By.xpath("//input[@id='suggesstion1']");//SendKeys	
	public By SelectClient=By.xpath("//div[@class=\\\"adropdown\\\"]//tr//td[2]");		
	public By ManualAmt=By.xpath("//input[@id='manualAmount']");		
	public By ManualNotes =By.xpath("//input[@id='manualNotes']");
	public By ManualDescription =By.xpath("//textarea[@id='manualDescription']");
	public By SuccessToastMsg= By.xpath("//div[@class='toast-message']");

	/*
	 * 6.Verify “Receivables” Functionality in the New Screen
	 */

	public By PostButton=By.xpath("//button[@id='btn_15']");
	public By AmtReceived=By.xpath("//input[@id='amountReceive']");//SendKeys	
	public By PaymentDrpDwn=By.xpath("//select[@id='cmbInvoicePaymentType']");		
	public By Option1=By.xpath("//select[@id='cmbInvoicePaymentType']/option[@value='Adjustment']");		
	public By NotesText =By.xpath("//textarea[@id='txtNotation']");//sendKyes
	public By ReceivedProcessbtn=By.xpath("//button[@id='receiveProcess']");
	public By SuccessToastMsg1= By.xpath("//div[@class='toast-message']");

	/*
	 * 7.Verify “Reverse” Functionality in the New Screen
	 */
	public By ClientSearch=By.xpath("//input[@id='suggesstion0']");//SendKeys
	public By ViewAll=By.xpath("//button[@id='filterReceivablesReverseAll']");//SendKeys	
	public By ReverseButton=By.xpath("//a[@id='btn1_4263']//i[@class='fa fa-reply']");		

	/*
	 * 8.Verify UI consistency with the “Process Trust” screen
	 */
	public By ProcessTrustHighlight= By.xpath("//div[@class='fixed-header push-left190']");
	public By DatePickeer =By.xpath("//input[@id='dpicker']");
	public By Viewbtn =By.xpath("//div[@id='submitWithoutToggle']//a[@class='btn btn-success viewRecord mr-2'][normalize-space()='View']");
	public By SwitchBtn =By.xpath("//span[@id='name-invoices']");
	/*
	 * 9. Verify All Filters and Actions in the New Screen
	 */
	public By InvoiceFilterDaterange= By.xpath("//input[@id='invoiceDataRange']");//Send Keys
	public By InvoiceIDs= By.xpath("//input[@id='invoiceIds']"); //Sendkeys
	public By listRe= By.xpath("//div[@id='gbox_invoiceDataGrid']"); 
	
	/*
	 * 10.Verify the Display of Columns in the Invoices Tab
	 */
	public By InvoiceReportActual= By.xpath("//div[@id=\"jqgh_invoiceDataGrid_invoiceReport\"]");
	public By BillingSummaryActual =By.xpath("//div[@id=\"jqgh_invoiceDataGrid_billingReport\"]");
	public By StatusActual =By.xpath("//div[@id=\"jqgh_invoiceDataGrid_statusValue\"]");
	public By ActionActual =By.xpath("//div[@id=\"jqgh_invoiceDataGrid_Action\"]");
	/*
	 * 11.Verify that the "Post" button is enabled for invoices with “Open” or “Partially Paid” status
	 */
	public By ActualInvoice =By.xpath("//td[@title='2']");
	public By ActualStatus1 =By.xpath("//td[@title='PARTIALLY PAID']");
	public By ActualStatus2 =By.xpath("//td[@title='OPEN']");
	public By ActualStatus3 =By.xpath("//td[@title='PAID']");
	public By PostButtonAfterSearch =By.xpath("//button[contains(text(),'Post')]");
	/*
	 * 12.Verify that the "Post" button is disabled for statuses other than “Open” or “Partially Paid”
	 */
	
	/*
	 * 13.Verify clicking the "Post" button triggers the expected behavior
	 */
	
	/*
	 *14.Verify that the “Reverse” button is enabled only for manual invoices 
	 */
	public By ManualDateAddinvoice = By.xpath("//input[@id='manualDate']");
	public By TodayDate= By.xpath("//div[@class='datepicker-days']//th[@class='today'][normalize-space()='Today']");
	public By TodayDateforFilter= By.xpath("//div[@class=\"daterangepicker dropdown-menu opensright\"]//following::li[contains(text(),'Today')]");
    public By	ReverseFunBtn2 =By.xpath("//table[@id=\"invoiceDataGrid\"]//tr//td//a[@title=\"Reverse Invoice (available for manual invoices only)\"][1]");
	/*
	 * 15.Verify that the “Reverse” button is disabled for previously reversed invoices
	 */
	
	/*
	 * 17.Verify that clicking the “Reverse” button updates the status to “Reversed”
	 */
	
	/*
	 * 18.Verify the presence of “Remit Type” and “Report” columns in the grid
	 */
	
	/*
	 * 20.Verify that the “Status” column size is adjusted to accommodate new columns
	 */
	
	

}
