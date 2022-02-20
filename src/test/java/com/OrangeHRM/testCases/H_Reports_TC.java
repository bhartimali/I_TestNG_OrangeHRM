package com.OrangeHRM.testCases;

import org.testng.annotations.Test;

import com.OrangeHRM.pages.H_Reports_Page;
import com.OrangeHRM.utility.BaseClass;
import com.OrangeHRM.utility.H_Reports_excelDataProvider;

public class H_Reports_TC extends BaseClass{

	@Test(dataProviderClass = H_Reports_excelDataProvider.class, dataProvider="loginCredentials")
	
	public void OrangeHRMLogin(String Uname, String pswd) throws InterruptedException {
	
		H_Reports_Page reportPage =new H_Reports_Page(driver);
		reportPage.Login(Uname, pswd);
		reportPage.logout();
	}
}
