package objectRepository;

import org.openqa.selenium.By;

public class TP_2_OR {

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
	 * Verify that applying Run Date & Payment Type as Select all filter displays available trusts and allows grid manipulation on the Trust Open screen
	 */

	public By dropdownPayment=By.xpath("//span[contains(text(),'Select Payment Type')]");	
	public By selectAll=By.xpath("(//input[@type='checkbox'])[1]");
	/*
	 * Verify that applying Run Date & Payment Type as Agency Payments filter displays available trusts and allows grid manipulation on the Trust Open screen
	 */
	public By AgencyPayment=By.xpath("//span[normalize-space()='Agency Payments']");
	/*
	 * Verify that applying Run Date & Payment Type as Client/DP Payments filter displays available trusts and allows grid manipulation on the Trust Open screen
	 */
	public By Client_DPPayments=By.xpath("//span[normalize-space()='Client/DP Payments']");
	/*
	 * Verify that applying Run Date & Trust Group Name as Select all filter displays available trusts and allows grid manipulation on the Trust Open screen
	 */
	public By dropdownTrustGroup= By.xpath("//span[contains(text(),'Select Trust Group')]");
	public By selectAllTrsustGroup=By.xpath("(//input[@type='checkbox'])[4]");
	/*
	 *Verify that applying Run Date & Trust Group Name as #1 DP ONLY filter displays available trusts and allows grid manipulation on the Trust Open screen
	 */
	public By DP_ONLY=By.xpath("//span[normalize-space()='#1 DP ONLY']");
	/*
	 *Verify that applying Run Date & Trust Group Name as #2 NEGATIVE ONLY filter displays available trusts and allows grid manipulation on the Trust Open screen
	 */
	public By NEGATIVE_ONLY=By.xpath("//span[normalize-space()='#2 NEGATIVE ONLY']");
	/*
	 * Verify that applying Run Date & Trust Group Name as BOTH #1 & #2 filter displays available trusts and allows grid manipulation on the Trust Open screen
	 */
	public By BOTH_OneAndTwo=By.xpath("//span[normalize-space()='BOTH #1 & #2']");
	/*
	 *Verify that applying Run Date & Trust Group Name as NEGATIVE DP, BOTH #1 & #2 filter displays available trusts and allows grid manipulation on the Trust Open screen
	 */
	public By NEGATIVE_DP_BOTH=By.xpath("//span[normalize-space()='NEGATIVE DP, BOTH #1 & #2']");
	/*
	 * Verify that applying Run Date & Transaction Type as Select all filter displays available trusts and allows grid manipulation on the Trust Open screen
	 */
	public By dropdownTransType=By.xpath("//span[normalize-space()='Select Transaction Type']");
	public By selectallTransType=By.xpath("(//input[@type='checkbox'])[9]");
	/*
	 * Verify that applying Run Date & Transaction Type as Positive Transactions filter displays available trusts and allows grid manipulation on the Trust Open screen
	 */
	public By PositiveTransactions=By.xpath("//span[normalize-space()='Positive Transactions']");

	/*
	 * Verify that applying Run Date & Transaction Type as Negative Transactions filter displays available trusts and allows grid manipulation on the Trust Open screen
	 */
	public By NegativeTransactions=By.xpath("//span[normalize-space()='Negative Transactions']");
	/*
	 *Verify that applying Run Date & Transaction Type as All Transactions filter displays available trusts and allows grid manipulation on the Trust Open screen
	 */
	public By AllTransactions=By.xpath("//span[normalize-space()='All Transactions']");
	/*
	 * Verify that applying Run Date, Payment Type, Trust Group, Transaction Type And frequency type filters displays available trusts and allows grid manipulation on the Trust Open screen
	 */
	
	public By dropdownFreqType=By.xpath("//div[@class='form-group float-label-control']//span[@class='placeholder'][normalize-space()='Select Trust Frequency']");
	public By selectallFreqType=By.xpath("//div[@class='row pt-2']//li[@class='ms-select-all']//input[@type='checkbox']");
	
	public By ActualOPRecords=By.xpath("//p[normalize-space()='No Record(s) Found']");
	
	/*
	 * Fetching data from excel sheet
	 */
	
	public By SearchFromOpenTrust=By.id("srchRelatAll");
	public By ExportSearchFromOpenTrust=By.xpath("//tr[@id=\"1\"]//td[3]");
	
//	Other
	public By AdvancedFilterOption =By.xpath("//a[@id='toggleAdvancedOptions']");
	public By dropdowntrustformula= By.xpath("//span[normalize-space()='Select Trust Formula']");
	public By SelectNETRemit= By.xpath("//span[normalize-space()='NET Remit']");
	public By SelectGrossRemit= By.xpath("//span[normalize-space()='Gross Remit']");
	public By SelectFixedFee= By.xpath("//span[normalize-space()='Fixed Fee']");
	public By dropdownglcode= By.xpath("//span[contains(text(),'Select G/L Code')]");
	public By SelectTest= By.xpath("//div[@class='row pt-4 advanceOptionsSection']//div[@class='form-group float-label-control']//span[contains(text(),'TEST')]");
	public By PaymentID=By.xpath("//input[@id='paymentIdInput']");
	public By dropdownCorporatename=By.xpath("//span[normalize-space()='Select Corporate Name']");
	public By selectallCorporatename= By.xpath("(//input[@type='checkbox'])[33]");
	public By SelectClient= By.xpath("//div[@class='row pt-4 advanceOptionsSection']//div[4]//div[1]//div[1]//ul[1]//li[3]//label[1]//span[1]");
	public By ExpCLientName =By.xpath("//table[@id=\"hql_result2\"]//tr//td[03]");
	public By dropdownclientname=By.xpath("//span[normalize-space()='Select Client Name']");
	public By selectallclientname= By.xpath("(//input[@type='checkbox'])[471]");
	public By SelectClient1=By.xpath("//span[normalize-space()='2 - Test ODR']");
	public By ExpClientName1= By.xpath("//table[@id=\"hql_result2\"]//tr//td[03]");
	}


