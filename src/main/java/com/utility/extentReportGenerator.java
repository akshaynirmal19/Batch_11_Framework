package com.utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class extentReportGenerator {
	public static ExtentReports extent;
	public static ExtentReports getReports() {
		String path = "C:\\Users\\Public\\Automation\\FrameWork\\Reports\\index.html";
		ExtentSparkReporter repoter = new ExtentSparkReporter(path);
		repoter.config().setDocumentTitle("Automation Test Reports");
		repoter.config().setReportName("Batch 11 Report");
		repoter.config().setTheme(Theme.DARK);
		
		
		extent = new ExtentReports();
		extent.attachReporter(repoter);
		extent.setSystemInfo("Project Name", "Batch 11 Demo project");
		extent.setSystemInfo("Module Name", "ABC Name");
		extent.setSystemInfo("Browser name", "Chrome");
		extent.setSystemInfo("Versio Salium", "3.145.5");
		extent.setSystemInfo("QA", "ABC");
		
		
		return  extent;
		
		
		
		
		
	}

}
