package com.acttime.ObjectRepositorylib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Home {
	@FindBy(xpath="//div[text()='Tasks']")
	private WebElement taskimg;
	@FindBy(xpath="//div[text()='USER']")
	private WebElement userimg;
	@FindBy(xpath="//a[text()='Logout']")
	private WebElement Logoutlnk;
	
	public void clickOnTaskImg(){
		taskimg.click();
	}
	public void clickOnUserImg() {
		userimg.click();
	}
	public void Logout(){
		Logoutlnk.click();
	}
}
