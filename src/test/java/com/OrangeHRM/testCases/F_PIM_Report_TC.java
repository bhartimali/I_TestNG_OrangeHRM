package com.OrangeHRM.testCases;

import org.testng.annotations.Test;

import com.OrangeHRM.pages.F_PIM_Report_Page;
import com.OrangeHRM.utility.BaseClass;
import com.OrangeHRM.utility.F_PIM_Report_excelDataProvider;

public class F_PIM_Report_TC extends BaseClass{

	@Test(dataProviderClass= F_PIM_Report_excelDataProvider.class , dataProvider = "Report")
	
	public void Report(String Uname, String pswd, String RName,String SRName, String ERName, String DRName) throws Exception {
		
		F_PIM_Report_Page reportPage = new F_PIM_Report_Page(driver);
		reportPage.Report(Uname, pswd, RName, SRName, ERName, DRName);
		reportPage.Logout();
	}
}
