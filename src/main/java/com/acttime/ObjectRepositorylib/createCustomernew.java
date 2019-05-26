package com.acttime.ObjectRepositorylib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class createCustomernew {
	@FindBy(name="name")
	private WebElement customerName;
	@FindBy(xpath="//textarea[@name='description']")
	private WebElement customerDescEdt;
	@FindBy(xpath="//input[@name='createCustomerSubmit']")
	private WebElement createCustmerBtn;
	public void createCustomer(String customername)
	{
		customerName.sendKeys(customername);
		createCustmerBtn.click();
	}
	public void createCustomer(String customername,String customerDesc)
	{
		customerName.sendKeys(customername);
		customerDescEdt.sendKeys(customerDesc);
		createCustmerBtn.click();
	}


}
