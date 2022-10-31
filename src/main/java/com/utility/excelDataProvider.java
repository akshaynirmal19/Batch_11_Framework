package com.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelDataProvider {
	
	XSSFWorkbook wb;
	
	public excelDataProvider() throws IOException {
		
		String path = "C:\\Users\\Public\\Automation\\FrameWork\\TestData\\abcd.xlsx";
		FileInputStream file = new FileInputStream(path);
	  wb = new XSSFWorkbook(file);
		
	}
	
	public String getStringData(String sheetname,int row,int cell) {
		
	return	wb.getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();
		
	}
	
	

}
