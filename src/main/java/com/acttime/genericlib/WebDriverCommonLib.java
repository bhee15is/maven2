package com.acttime.genericlib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * 
 * @author bhima
 *common class contains webDriver specific reusable controls
 */
public class WebDriverCommonLib 
{
/**
 * used to wait for entire page to load,before perform action on element
 * maximum timeout is 20 seconds
 * @param driver
 */
	public void WaitForPageToLoad(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
}
	/**
	 * wait for element to be appear in gui,for every 500ms check for the element
	 * maximum time out is 20 seconds
	 * @param driver
	 * @param element
	 
	 */
	public void WaitForElementPresent(WebDriver driver,WebElement element){
		WebDriverWait wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOf(element));	
		
	}
	/**
	 * used to handle any select_dropdown,select the value based on option data
	 * @param element
	 * @param option
	 */
	public void Select(WebElement element,String option)
	{
 Select sel=new Select(element);
	sel.selectByVisibleText(option);
	}
	
	/**
	 * used to handle any slect_dropdown select the value based on option index
	 * @param element
	 * @param index
	 */
	
	public void Select(WebElement element,int index)
	{
		Select sel=new Select(element);
		sel.selectByIndex(index);
	}
	
	public void WaitandClick(WebElement element)
	{
		try{
			element.click();
		}catch(Throwable e)
		{
			System.out.println("wait--------");
		}
		
		
		
	}
	
	
	
}


