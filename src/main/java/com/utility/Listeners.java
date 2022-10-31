package com.utility;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Listeners extends BaseClass implements ITestListener {
	
	ExtentReports extent = extentReportGenerator.getReports();
	ThreadLocal<ExtentTest> extest= new ThreadLocal<ExtentTest>();

	public void onTestStart(ITestResult result) {
		
		Library.test	= extent.createTest(result.getTestClass().getName()+"=="+result.getMethod().getMethodName());
		extest.set(Library.test);
	}

	public void onTestSuccess(ITestResult result) {
		
		extest.get().log(Status.PASS, "Test Case Pass");
		
	}

	public void onTestFailure(ITestResult result) {
		extest.get().log(Status.FAIL, "Test Case fail");
		extest.get().addScreenCaptureFromBase64String(getCapcture());
		
		
	}

	public void onTestSkipped(ITestResult result) {
		extest.get().log(Status.SKIP, "Test Case skip");
		
	}

	public void onFinish(ITestContext context) {
		extent.flush();
		
	}
	public static String getCapcture() {
		
		TakesScreenshot ts = (TakesScreenshot) driver;
	   return ts.getScreenshotAs(OutputType.BASE64);
		
	}
	
	

}
