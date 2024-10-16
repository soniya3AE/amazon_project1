package com.mkt.test.amazon;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;


public class ListernerProgram  implements ITestListener {

	static 	ChromeDriver   driver;
	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub	
		ITestListener.super.onTestStart(result);
	}
	@Override
	public void onTestSuccess(ITestResult result) {		
		Reporter.log("Test case is passed");
	
	     Date date = new Date();  
		TakesScreenshot t1 =driver;	
		File source= t1.getScreenshotAs(OutputType.FILE);
		File destination=new File("/Users/abhishek/soniya-eclipse-workspace/POM_Amazon_project1/src/test/resources/Screenshot/"+Math.random()+date+".png");
		try {
			FileHandler.copy(source, destination);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		Reporter.log("Test case is failed");
		
	     Date date = new Date();  
		TakesScreenshot t1 =driver;	
		File source= t1.getScreenshotAs(OutputType.FILE);
		File destination=new File("/Users/abhishek/soniya-eclipse-workspace/POM_Amazon_project1/src/test/resources/Screenshot/"+Math.random()+date+".png");
		try {
			FileHandler.copy(source, destination);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailure(result);
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestSkipped(result);
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		//ITestListener.super.onTestFailedWithTimeout(result);
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		//ITestListener.super.onStart(context);
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		//ITestListener.super.onFinish(context);
	}
	

}
