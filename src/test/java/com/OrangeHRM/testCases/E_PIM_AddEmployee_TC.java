package com.OrangeHRM.testCases;

import org.testng.annotations.Test;

import com.OrangeHRM.pages.E_PIM_AddEmployee_Page;
import com.OrangeHRM.utility.BaseClass;
import com.OrangeHRM.utility.E_PIM_AddEmployee_excelDataProvider;

public class E_PIM_AddEmployee_TC extends BaseClass{

	@Test(dataProviderClass = E_PIM_AddEmployee_excelDataProvider.class, dataProvider = "OrangeHRM PIM AddEmployee")
	
	public void PIM_AddEmployee(String UName, String pswd, String fname, String lname, String EPic, String NName, String bType, String ufile) throws Exception {
		
		E_PIM_AddEmployee_Page addEmployeePage = new E_PIM_AddEmployee_Page(driver);
		addEmployeePage.OrangeHRM_AddEmployee(UName, pswd, fname, lname, EPic,NName,bType, ufile);
		addEmployeePage.OrangeHRM_LogOut();
	}
}
