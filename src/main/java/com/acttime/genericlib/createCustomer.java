package com.acttime.genericlib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * @author bhima
 */
	public class createCustomer 
{
public static void main(String[] args) throws Throwable {
/* create an object to generic lib*/
Filelib flib=new Filelib();
WebDriverCommonLib wlib=new WebDriverCommonLib();


/*read data from properties file*/
String URL=flib.getPropertyKeyValue("url");
String USERNAME=flib.getPropertyKeyValue("username");
String PASSWORD=flib.getPropertyKeyValue("password");

/*read data from Excel*/
String customerName=flib.getExcelData("Sheet2", 2, 0);
String CustomerDescription=flib.getExcelData("Sheet2", 2, 1) ;

/*step1:login to app*/
WebDriver driver=new FirefoxDriver();
wlib.WaitForPageToLoad(driver);
driver.get(URL);
/* STEP2:navigate to task page*/
driver.findElement(By.name("username")).sendKeys(USERNAME);
driver.findElement(By.name("pwd")).sendKeys(PASSWORD);
driver.findElement(By.id("loginButton")).click();
Thread.sleep(10000);
driver.findElement(By.xpath("//img[@class='sizer']")).click();
driver.findElement(By.xpath("//a[text()='Projects & Customers']")).click();

Thread.sleep(10000);
/*step3:navigate to crate customer page*/
driver.findElement(By.xpath("//input[@value='Create New Customer']")).click();

driver.findElement(By.name("name")).sendKeys(customerName);
driver.findElement(By.name("description")).sendKeys(CustomerDescription);
Thread.sleep(5000);
driver.findElement(By.name("createCustomerSubmit")).click();
Thread.sleep(5000);

driver.findElement(By.id("logoutLink")).click();

}
}
