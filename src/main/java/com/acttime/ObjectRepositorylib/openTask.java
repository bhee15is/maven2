package com.acttime.ObjectRepositorylib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class openTask {
	@FindBy(linkText="Projects & Customers")
	private WebElement projectAndCustlnk;
	public void clickOnprojectAndCustlnk() 
	{
		projectAndCustlnk.click();	
	}
	
}
