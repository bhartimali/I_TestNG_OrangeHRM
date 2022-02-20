package com.OrangeHRM.testCases;

import org.testng.annotations.Test;

import com.OrangeHRM.pages.I_Leave_Page;
import com.OrangeHRM.utility.BaseClass;
import com.OrangeHRM.utility.I_Leave_excelDataProvider;

public class I_Leave_TC extends BaseClass{

	
	@Test(dataProviderClass=I_Leave_excelDataProvider.class, dataProvider="loginCrediantial")
	public void OrangeHRMLogin(String Uname, String pswd) throws InterruptedException {
		
		I_Leave_Page leavePage =new I_Leave_Page(driver);
		leavePage.OrangeHRMLogin(Uname, pswd);
		leavePage.logout();
	}
}
