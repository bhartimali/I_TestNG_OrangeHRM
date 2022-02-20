package com.OrangeHRM.utility;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class I_Leave_excelDataProvider {
	
	public static File file;
	public static FileInputStream fis;
	public static XSSFWorkbook wk;
	public static XSSFSheet sheet;
	public static XSSFRow row;
	public static XSSFCell cell;
	
	DataFormatter dFormat = new DataFormatter();
	
	@DataProvider(name="loginCrediantial")
	public Object[][] loginData() {
		try {
			
			file = new File(com.OrangeHRM.constants.Constants.LoginData);
			fis =new FileInputStream(file);
			wk =new XSSFWorkbook(fis);
			sheet =wk.getSheetAt(0);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		int rowCount = sheet.getLastRowNum();
		row = sheet.getRow(0);
		int colCount = row.getLastCellNum();
		
		Object[][] excelData =new Object[rowCount+1][colCount];
		for(int i=0; i<rowCount+1; i++) {
			row = sheet.getRow(i);
			for(int j=0; j<colCount;j++){
				cell =row.getCell(j);
				dFormat.formatCellValue(cell);
				excelData[i][j]= dFormat.formatCellValue(cell);
			}
		}
		return excelData;
	}
	
}
