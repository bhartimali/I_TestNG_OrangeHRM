package com.OrangeHRM.testCases;

import org.testng.annotations.Test;

import com.OrangeHRM.pages.C_Admin_EditeProfile_Page;
import com.OrangeHRM.utility.BaseClass;
import com.OrangeHRM.utility.C_Admin_EditeProfile_excelDataProvider;

public class C_OrangeHRM_AdminEditProfile_TC extends BaseClass{

	@Test(dataProviderClass = C_Admin_EditeProfile_excelDataProvider.class, dataProvider = "AdminEditeProfile")
	
	public void AdminEditProfile(String Uname, String pswd, String sUName, String sURole, String sEmName, String sStatus, String eUName, String echangePass, String echangeCPass) throws Exception {
		
		
		C_Admin_EditeProfile_Page editPage = new C_Admin_EditeProfile_Page(driver);
		editPage.OrangeHRM_AdminEditeProfile(Uname, pswd, sUName, sURole, sEmName, sStatus, eUName, echangePass, echangeCPass);
			editPage.OrangeHRMLogout();
		
	}
}
