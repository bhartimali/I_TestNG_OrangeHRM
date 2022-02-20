package com.OrangeHRM.testCases;

import org.testng.annotations.Test;

import com.OrangeHRM.pages.B_AdminPage;
import com.OrangeHRM.utility.B_Admin_ExcelDataProvider;
import com.OrangeHRM.utility.BaseClass;

public class B_OrangeHRM_Admin_TC extends BaseClass{

	@Test(dataProviderClass = B_Admin_ExcelDataProvider.class, dataProvider="adminModule")
	
	public void OrangeHRMAdminModule(String uName, String uPass, String URole, String aEmpName, String addUserName, String UStatus, String addUserpass, String addUserCPass, String sUname, String sUrole, String sEmpname, String sStatus ) throws Exception {
		B_AdminPage adminPage = new B_AdminPage(driver);
		adminPage.OrangeHRMAdmin(uName, uPass, URole, aEmpName, addUserName, UStatus, addUserpass, addUserCPass, sUname, sUrole, sEmpname, sStatus);
		adminPage.OrangeHRMLogOut();
	}
}
