package objectRepository;

import org.openqa.selenium.By;

public class TP_10_OR {

	public TP_10_OR() {
		// TODO Auto-generated constructor stub
	}
	
	/*
	 * Verify that the "Select ACH/CH" filter is removed from the Trust Open screen	 
	 */
	
	/*
	 *Verify that clicking on Advanced Filters displays additional filtering options in the Trust Open tab
	 */
	public By AdvancedFilterOption =By.xpath("//a[@id='toggleAdvancedOptions']");
	
	/*
	 * Verify that the "Select Trust Formula" filter functions correctly in the Trust Open tab
	 */
	public By dropdowntrustformula= By.xpath("//span[normalize-space()='Select Trust Formula']");
	public By SelectNETRemit= By.xpath("//span[normalize-space()='NET Remit']");
	public By SelectGrossRemit= By.xpath("//span[normalize-space()='Gross Remit']");
	public By SelectFixedFee= By.xpath("//span[normalize-space()='Fixed Fee']");

	/*
	 * Verify that the "Select G/L Code" filter functions correctly in the Trust Open tab
	 */
	public By dropdownglcode= By.xpath("//span[contains(text(),'Select G/L Code')]");
	public By SelectTest= By.xpath("//div[@class='row pt-4 advanceOptionsSection']//div[@class='form-group float-label-control']//span[contains(text(),'TEST')]");
	/*
	 * Verify that the "PaymentID" filter functions correctly in the Trust Open tab
	 */
	public By PaymentID=By.xpath("//input[@id='paymentIdInput']");
	/*
	 * Verify that the "Select Corporate Name" filter functions correctly in the Trust Open tab
	 */
	
	public By dropdownCorporatename=By.xpath("//span[normalize-space()='Select Corporate Name']");
	public By selectallCorporatename= By.xpath("(//input[@type='checkbox'])[33]");
	public By SelectClient= By.xpath("//div[@class='row pt-4 advanceOptionsSection']//div[4]//div[1]//div[1]//ul[1]//li[3]//label[1]//span[1]");
	public By ExpCLientName =By.xpath("//table[@id=\"hql_result2\"]//tr//td[03]");
	/*
	 * Verify that the "Select Client Name" filter functions correctly in the Trust Open tab
	 */

	public By dropdownclientname=By.xpath("//span[normalize-space()='Select Client Name']");
	public By selectallclientname= By.xpath("(//input[@type='checkbox'])[471]");
	public By SelectClient1=By.xpath("//span[normalize-space()='2 - Test ODR']");
	public By ExpClientName1= By.xpath("//table[@id=\"hql_result2\"]//tr//td[03]");
}
