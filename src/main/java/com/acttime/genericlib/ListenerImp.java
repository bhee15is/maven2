package com.acttime.genericlib;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

/**
 * 
 * @autho bhim
 * *
 */
public class ListenerImp implements ITestListener
{
//@override
	public void onTestFailure(ITestResult result)
	{
		String failedtestName=result.getMethod().getMethodName();
		EventFiringWebDriver edriver=new EventFiringWebDriver(Baseclass.driver);
		File srcfile=edriver.getScreenshotAs(OutputType.FILE);
		//create a new file inside the framework 
		File dstfile=new File("./Screenshot/"+failedtestName+".png");
		try{
		
			FileUtils.copyFile(srcfile,dstfile);
		}
		catch(IOException e){
			
		}
	}

	//@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	//@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	//@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	//@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	//@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	//@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}
}
