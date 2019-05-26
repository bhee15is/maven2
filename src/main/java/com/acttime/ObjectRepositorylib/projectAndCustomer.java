package com.acttime.ObjectRepositorylib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class projectAndCustomer {
	@FindBy(xpath="//input[@value='Create New Customer']")
	private WebElement createCustmerBtn;
	
	@FindBy(xpath="//span[@class='successmsg']")
	private WebElement successmsg;

public void clickOncreateCustmerBtn()
{
	createCustmerBtn.click();	
	}
	public WebElement getsuccessmsg()
	{
		return successmsg;
	

}
	}