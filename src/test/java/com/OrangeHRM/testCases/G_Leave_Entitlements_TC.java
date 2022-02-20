package com.OrangeHRM.testCases;

import org.testng.annotations.Test;

import com.OrangeHRM.pages.G_Leave_Entitlements_Page;
import com.OrangeHRM.utility.BaseClass;
import com.OrangeHRM.utility.G_Leave_Entitlements_ExcelDataProvider;

public class G_Leave_Entitlements_TC extends BaseClass{

	@Test(dataProviderClass = G_Leave_Entitlements_ExcelDataProvider.class, dataProvider = "MyEntitlements")
	
	public void Leave_MyEntitlments(String Uname, String pswd, String Ename, String LType, String Lperiod, String entitlements, String UEntil) throws Exception {
		G_Leave_Entitlements_Page entitlemntsPage = new G_Leave_Entitlements_Page(driver);
		entitlemntsPage.MyEntitlements(Uname, pswd, Ename, LType, Lperiod, entitlements,UEntil);
		entitlemntsPage.logout();
	}
}
