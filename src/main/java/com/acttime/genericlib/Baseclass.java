package com.acttime.genericlib;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.acttime.ObjectRepositorylib.Home;
import com.acttime.ObjectRepositorylib.Login;

public class Baseclass {
	public static WebDriver driver;
	public Filelib flib=new Filelib();
	@BeforeSuite
	public void configBeforeSuite(){
		System.out.println("connect to data base");
	}
	
	@BeforeClass
	public void configBC() throws Throwable{
		System.out.println("=========launch browser=====");
		String BROWSER=flib.getPropertyKeyValue("browser");
		if(BROWSER.equals("firefox")){
			driver=new FirefoxDriver();
		}else if(BROWSER.equals("chrome")){
			driver=new ChromeDriver();
		}driver.manage().window().maximize();
	}
		@BeforeMethod
	public void configBM() throws Throwable{
			
		System.out.println("LOGIN");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get(flib.getPropertyKeyValue("url"));
		
		Login lp=PageFactory.initElements(driver, Login.class);
		lp.loginToApp();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

		}

	@AfterMethod
	public void configAM(){
		System.out.println("LOGOUT");
		Home hp=PageFactory.initElements(driver, Home.class);
		hp.Logout();
	}
	@AfterClass
	public void configAc(){
		System.out.println("=========close the browser======");
	
		driver.close();
	}
	@AfterSuite
	public void configAftereSuite(){
		System.out.println("close to data base");
	}
}
