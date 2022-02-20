package com.OrangeHRM.testCases;

import org.testng.annotations.Test;

import com.OrangeHRM.pages.A_LoginPage;
import com.OrangeHRM.utility.BaseClass;
import com.OrangeHRM.utility.A_Login_excelDataProvider;

public class A_OrangeHRM_Login_TC extends BaseClass{
	
	@Test(dataProviderClass = A_Login_excelDataProvider.class, dataProvider = "loginCredentials")
	public void OrangeHRM(String uname, String pswd) throws InterruptedException {
		A_LoginPage loginpage = new A_LoginPage(driver);
		loginpage.OrangrHRMLogin(uname, pswd);
		loginpage.OrangeHRMLogout();
	}
	
}
