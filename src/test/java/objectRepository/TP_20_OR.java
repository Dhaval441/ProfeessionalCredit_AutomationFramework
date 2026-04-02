package objectRepository;

import org.openqa.selenium.By;

public class TP_20_OR {

	public TP_20_OR() {
		// TODO Auto-generated constructor stub
	}
	
	/*
	 * Navigation 
	 */
	/*
	 * Verify that a toast notification alerts the user to select the "Client" or "Run Date" filter to view results when no filters are selected on the Trust Open tab, and the "View" button is clicked.
	 */
	public By ActualError1=By.xpath("//div[@class='toast-message']");
	
	/*
	 * Verify that a toast notification alerts the user to select either the "Client" or "Run Date" filter to view results when only the "Corporate" filter is selected, and the "Run Trust Process" button is clicked on the Trust Open tab.
	 */
	public By RunTrust=By.xpath("//div[@id='submitWithToggle']//a[@class='btn btn-primary trust'][contains(text(),'Run')]");
			
			
	/*
	 * Verify that results are displayed in the grid when the "Run Date" filter is selected, and the "View" button is clicked on the Trust Open tab.
	 */

			
			
	/*
	 * Verify that results in the grid refresh without corporate grouping when the "Group by Corporate" checkbox is unchecked on the Trust Processed tab.
	 */
	public By GroupByCorporate=By.xpath("//input[@id='gropCheckId']");
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
	public By ClearFilter2=By.xpath("//button[@class='btn btn-danger clearTrustBtnTrustOpen showFilterBtn']");
	public By PaymentID=By.xpath("//input[@id='paymentIdInput']");
	/*
	 * Verify that entering a search string in the Search box filters the results in the grid to display only matching records.
	 */
	public By ProcessedTrustSearch =By.xpath("//input[@id='srchRelatAll2']");
	public By ExpCond= By.xpath("//table[@id=\"filterData\"]//tr[3]//td[8]");
			
			
	/*
	 * Verify that clicking the “Publish All” button publishes all selected trusts and updates their status to “Published” in the Trust Processed grid.
	 */
	
	/*
	 * Verify that clicking on a Payment ID opens a modal with additional information for the selected trust after the “Validate” action is clicked. 
	 */
	
	/*
	 * Verify that clicking on “Add More Transaction” shows available transactions for the selected trust and excludes transactions posted after the trust creation date. 
	 */
	
	/*
	 * Verify that selected transactions are added to the validate screen upon clicking the “ADD” button after selecting them from the available transactions grid
	 */
	/*
	 * Verify that any changes made in the Validate screen persist upon clicking the “SAVE” button. 
	 */	
	
	
	/*
	 * Verify that a toast alert is displayed when the user clicks on the “Remove” button without selecting any transactions in the Validate screen. 
	 */	
	
	
	/*
	 * Verify that selected transactions are removed in the Validate screen when the user clicks on the “Remove” button.	 
	 * 
	 */
	public By ValidateButton=By.xpath("//td[@title=' Validate ']");
	public By SearchTransforExp= By.xpath("//input[@id='srchRelatAllPatDet']");
	public By SelectTransaction=By.xpath("//table[@id=\"patTransDet\"]//tr[3]//td");
	public By RemoveBUtton= By.xpath("//button[normalize-space()='Remove']");
	public By RemoveToastMsg=By.xpath("//div[@class='toast-message']");
	public By AddMoreTrans =By.xpath("//button[@id='addTransaction']");
	public By SelectAddMoreTras = By.xpath("//table[@id=\"patTransDet\"]//tr[3]//td");
	public By AddTrans= By.xpath("//button[normalize-space()='ADD']");
	public By BackbtnAddMore =By.xpath("//button[@id='back']");
	public By SaveBtn=By.xpath("//button[@id='apply']");
	
}
