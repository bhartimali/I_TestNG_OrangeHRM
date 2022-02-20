package com.OrangeHRM.utility;

import java.io.File;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import com.OrangeHRM.constants.Constants;

public class A_Login_excelDataProvider {

	public static WebDriver driver;
	public static File src;
	public static FileInputStream fis;
	public static XSSFWorkbook workbook;
	public static XSSFSheet sheet;
	public static XSSFRow row;
	public static XSSFCell cell;

	
	DataFormatter dFormat=new DataFormatter();
	
	
	@DataProvider(name="loginCredentials")
	public Object[][] loginData(){
		
		try {
		src=new File(Constants.LoginData);
		fis=new FileInputStream(src);
		workbook=new XSSFWorkbook(fis);
		sheet=workbook.getSheetAt(0);
		}catch( Exception e) {
			e.printStackTrace();
		}
		int rowCount=sheet.getLastRowNum();
		System.out.println("Row Count is: "+rowCount);
		row=sheet.getRow(0);
		int colCount=row.getLastCellNum();
		
		Object excelData[][]=new Object[rowCount+1][colCount];
		
		for(int i=0;i<rowCount+1;i++) {
			
			row=sheet.getRow(i);
			for(int j=0;j<colCount;j++) {
				 cell=row.getCell(j);
				dFormat.formatCellValue(cell);
				
				excelData[i][j]=dFormat.formatCellValue(cell);
			}
		}
		return excelData;
	}
	
	
}
		


