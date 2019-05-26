package com.acttime.ObjectRepositorylib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.acttime.genericlib.Filelib;

public class Login {
	//rule:1 create a separate java class for every project
	@FindBy(name="username")
	//rule:2 identify element  using @findby annotation 
	private WebElement usernameEdt;
	@FindBy(name="pwd")
	private WebElement passwordEdt;
	@FindBy(id="loginButton")
	private WebElement loginBtn;
	
	public void loginToApp() throws Throwable
	{
		Filelib flib=new Filelib();
		usernameEdt.sendKeys(flib.getPropertyKeyValue("username"));
		passwordEdt.sendKeys(flib.getPropertyKeyValue("password"));
		loginBtn.click();
	}
	public void LoginToApp(String username,String password)
	{
		usernameEdt.sendKeys(username);
		passwordEdt.sendKeys(password);
		loginBtn.click();
	}
	public WebElement getUsernameEdt() {
		return usernameEdt;
	}
	public WebElement getPasswordEdt() {
		return passwordEdt;
	}
	public WebElement getLoginBtn() {
		return loginBtn;
	}

}
