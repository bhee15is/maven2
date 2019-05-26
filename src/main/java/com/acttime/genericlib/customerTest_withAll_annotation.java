package com.acttime.genericlib;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class customerTest_withAll_annotation {
	@BeforeClass
	public void configBC(){
		System.err.println("=========launch browser=====");
	}
	@BeforeMethod
	public void configBM(){
		System.out.println("LOGIN");
		}
	@Test
	public void createCustomerTest(){
		System.out.println("excute create customer");
			
	}
	@Test
	public void modifyCustomerTest(){
		System.out.println("excute modify customer");

	}
	@AfterMethod
	public void configAM(){
		System.out.println("LOGOUT");
	}
	@AfterClass
	public void configAc(){
		System.out.println("=========close the browser======");
	}


}
