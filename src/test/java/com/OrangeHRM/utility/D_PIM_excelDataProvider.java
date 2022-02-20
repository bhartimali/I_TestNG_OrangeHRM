package com.OrangeHRM.utility;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

import com.OrangeHRM.constants.Constants;

public class D_PIM_excelDataProvider {

	public static File src;
	public static FileInputStream fis;
	public static XSSFWorkbook workbook;
	public static XSSFSheet sheet;
	public static XSSFRow row;
	public static XSSFCell cell;
	
	DataFormatter dFormat = new DataFormatter();
	
	@DataProvider(name="OrangeHRM PIM Module")
	public Object PIM() {
		try {
			src = new File(Constants.LoginData);
			fis =new FileInputStream(src);
			workbook = new XSSFWorkbook(fis);
		}catch(Exception e) {
			e.printStackTrace();
		}
		sheet = workbook.getSheetAt(3);
		int rowCount = sheet.getLastRowNum();
		row = sheet.getRow(0);
		int colCount = row.getLastCellNum();
		Object excelData[][] = new Object[rowCount+1][colCount];
		
		for(int i=0; i<rowCount+1; i++) {
			
			row = sheet.getRow(i);
			
			for(int j=0; j<colCount; j++) {
				cell = row.getCell(j);
				dFormat.formatCellValue(cell);
				excelData[i][j] = dFormat.formatCellValue(cell);
			}
		}
		return excelData;
		
	}
	
}
