package com.utility;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	
	
	
	public static WebDriver driver;
	public static excelDataProvider excel;
	public static configDataProvider config;
	
	
	@BeforeSuite
	public void BS() throws IOException {
		excel = new excelDataProvider();
		config = new configDataProvider();
	}
	
	@Parameters({"BrowserName"})
	@BeforeMethod
	public void setUp(String BrowserName) {
		
		
		if(BrowserName.equalsIgnoreCase("Chrome")) {
			
			WebDriverManager.chromedriver().setup();
		    driver = new ChromeDriver();
			
		}else if(BrowserName.equalsIgnoreCase("Edge")) {
			
			WebDriverManager.edgedriver().setup();
		    driver = new EdgeDriver();
			
		}
		
		
		driver.get(config.BaseURL_QA1());
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
