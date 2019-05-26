package com.acttime.customerTest;


import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.acttime.ObjectRepositorylib.Home;
import com.acttime.ObjectRepositorylib.createCustomernew;
import com.acttime.ObjectRepositorylib.openTask;
import com.acttime.ObjectRepositorylib.projectAndCustomer;
import com.acttime.genericlib.Baseclass;

/**
 * 
 * @author CHANDRU
 *
 */
@Listeners(com.acttime.genericlib.ListenerImp.class)

public class customerTest extends Baseclass {
	@Test	
	public void createCustomer() throws Throwable
	{
	/* read data from excel */
		String CustomerName=flib.getExcelData("Sheet2",1,0);

		Thread.sleep(6000);
		/* step3:Navigate to taskpage */
		Home hp=PageFactory.initElements(driver,Home.class);
		hp.clickOnTaskImg();
		/* step4: Navigate to project and Customer page */
		openTask op=PageFactory.initElements(driver, openTask.class);
		op.clickOnprojectAndCustlnk();
		/* step:5 Navigate to create customer page */
		projectAndCustomer pac=PageFactory.initElements(driver, projectAndCustomer.class);
		pac.clickOncreateCustmerBtn();
		/* step:6 create Customer */
		createCustomernew cp=PageFactory.initElements(driver,createCustomernew.class);
		cp.createCustomer(CustomerName);
		/* step: 7verify customer */
		/*	String actSussmsg=pac.getsuccessmsg().toString();
		boolean status=actSussmsg.contains("successfully created.");
		Assert.assertTrue(status);*/
	}
	@Test
	public void createCustomerWithDescTest() throws Throwable
	{
		String CustomerName=flib.getExcelData("Sheet2",2,0);
		String CustomerDesc=flib.getExcelData("Sheet2",2,1);
		/* step3:Navigate to taskpage */
		Home hp=PageFactory.initElements(driver,Home.class);
		hp.clickOnTaskImg();
		/* step4: Navigate to project and Customer page */
		openTask op=PageFactory.initElements(driver, openTask.class);
		op.clickOnprojectAndCustlnk();
		/* step:5 Navigate to create customer page */
		projectAndCustomer pac=PageFactory.initElements(driver, projectAndCustomer.class);
		pac.clickOncreateCustmerBtn();
		/* step:6 create CustomerWith name and Desc */
		
		createCustomernew cp1=PageFactory.initElements(driver,createCustomernew.class);
		cp1.createCustomer(CustomerName,CustomerDesc);
		
	}
	}
