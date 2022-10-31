package com.utility;

import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Library {
	
	public static ExtentTest test;

	
	
	public static void custom_SendKeys(WebElement element,String value,String fieldName) {
		try {
			
			element.sendKeys(value);
			test.log(Status.PASS, fieldName+"=Value sucessfully send ="+value);
			
		}catch(Exception e) {
			
			test.log(Status.FAIL, e.getMessage());
			
		}
	}
	
	
	public static void custom_Click(WebElement element,String fieldName) {
		
try {
			
			element.click();
			test.log(Status.PASS, fieldName+"=Value sucessfully clicked");
			
		}catch(Exception e) {
			test.log(Status.FAIL, e.getMessage());
			
		}
		
	}
}
