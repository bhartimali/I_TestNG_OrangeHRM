package com.OrangeHRM.testCases;

import org.testng.annotations.Test;

import com.OrangeHRM.pages.D_PIM_Page;
import com.OrangeHRM.utility.BaseClass;
import com.OrangeHRM.utility.D_PIM_excelDataProvider;

public class D_OrangeHRM_PIM_TC extends BaseClass{

	@Test(dataProviderClass = D_PIM_excelDataProvider.class, dataProvider = "OrangeHRM PIM Module" )
	
	public void OrangeHRM_PIM(String Uname, String Upass, String Ename, String EID, String EStatus, String EInclude, String SupName, String jTitle, String sUnit ) throws Exception {
		D_PIM_Page pimPage = new D_PIM_Page(driver);
		pimPage.OrangeHRM_PIM(Uname, Upass, Ename, EID, EStatus, EInclude, SupName, jTitle, sUnit);
		pimPage.OrangeHRMLogout();
	}
}
