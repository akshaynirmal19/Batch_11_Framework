package com.utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class configDataProvider {
	
	
     Properties pro;
	
	public configDataProvider() throws IOException {
		
		String paths = "C:\\Users\\Public\\Automation\\FrameWork\\Config\\config.Properties";
		FileInputStream file = new FileInputStream(paths);
	    pro = new Properties();
	    pro.load(file);
		
	}
	
	public String BaseURL_QA1() {
		return pro.getProperty("BaseURL_QA1");
	}

}
