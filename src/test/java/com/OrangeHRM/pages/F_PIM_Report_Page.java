package com.OrangeHRM.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class F_PIM_Report_Page {

public  WebDriver driver;
	
	@FindBy(xpath="//input[@id='txtUsername']")public WebElement username;
	@FindBy(xpath="//input[@id='txtPassword']")public WebElement password;
	@FindBy(xpath="//input[@id='btnLogin']")public WebElement login_btn;
	
	//PIM -  ADD REPORT - Report 
	@FindBy(xpath="//a[@id='menu_pim_viewPimModule']")public WebElement PIMMenu;
	//add button
	@FindBy(xpath="//a[@id='menu_core_viewDefinedPredefinedReports']")public WebElement report_Menu;
	@FindBy(xpath="//input[@id='btnAdd']")public WebElement add_btn;
	@FindBy(xpath="//input[@id='report_report_name']")public WebElement reportName;
	@FindBy(xpath="//a[@id='btnAddDisplayField']")public WebElement displayField;
	@FindBy(xpath="//input[@name='display_groups[]']")public WebElement employeeId;
	@FindBy(xpath="//input[@id='btnSave']")public WebElement save_btn;
	//@FindBy(xpath="//input[@id='btnCancel']")public WebElement cancel_btn;
	
	//SEARCH REPORT
	@FindBy(xpath="//input[@id='search_search']") public WebElement SearchReportName;
	//@FindBy(xpath="//input[@name='_reset']") public WebElement reset_btn; 
	@FindBy(xpath="//input[@name='_search']") public WebElement search_btn;
	@FindBy(xpath="//*[@id=\"resultTable\"]/tbody/tr[1]/td[4]/a") public WebElement edit_link;
	@FindBy(xpath="//input[@id='report_report_name']")public WebElement EditReportName;
	//@FindBy(xpath="//input[@id='btnSave']")public WebElement Esave_btn;
	
	//Delete Report
	@FindBy(xpath="//input[@id='search_search']") public WebElement DeleteSReportName;
	@FindBy(xpath="//*[@id=\"ohrmList_chkSelectRecord_14\"]") public WebElement chkSelectRow;
	@FindBy(xpath="//input[@id='btnDelete']") public WebElement delete_btn;
	//@FindBy(xpath="input[@value='Cancel']") public WebElement scancel_btn;
	@FindBy(xpath="//input[@id='dialogDeleteBtn']") public WebElement conform_btn;
	
	
	//LOGOUT
	@FindBy(xpath="//a[@id='welcome']") public WebElement welcome;
	@FindBy(xpath="//a[@href='/index.php/auth/logout']") public WebElement logout;
	
	public F_PIM_Report_Page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void Report(String uname, String upass, String rName, String SReportName, String EReportName, String DSReportName ) throws Exception {
		username.sendKeys(uname);
		Thread.sleep(2000);
		password.sendKeys(upass);
		Thread.sleep(2000);
		login_btn.click();
		Thread.sleep(2000);
		PIMMenu.click();
		Thread.sleep(2000);
		report_Menu.click();
		Thread.sleep(2000);
		add_btn.click();
		Thread.sleep(2000);
		reportName.sendKeys(rName);
		Thread.sleep(2000);
		displayField.click();
		Thread.sleep(2000);
		employeeId.click();
		Thread.sleep(2000);
		save_btn.click();
		Thread.sleep(2000);
		SearchReportName.sendKeys(SReportName);
		Thread.sleep(2000);
		search_btn.click();
		Thread.sleep(2000);
		edit_link.click();
		Thread.sleep(2000);
		EditReportName.clear();
		EditReportName.sendKeys(EReportName);
		Thread.sleep(2000);
		save_btn.click();
		Thread.sleep(2000);
		DeleteSReportName.sendKeys(DSReportName);
		Thread.sleep(2000);
		search_btn.click();
		Thread.sleep(2000);
		chkSelectRow.click();
		Thread.sleep(2000);
		delete_btn.click();
		Thread.sleep(2000);
		conform_btn.click();
		Thread.sleep(3000);
		
	}
	public void Logout() throws Exception {
		welcome.click();
		Thread.sleep(2000);
		logout.click();
		Thread.sleep(4000);
	}
}
