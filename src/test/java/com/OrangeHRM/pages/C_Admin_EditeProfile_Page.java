package com.OrangeHRM.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class C_Admin_EditeProfile_Page {

	public   WebDriver driver;
	
	public C_Admin_EditeProfile_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	//LOGIN FORM - username
	@FindBy(xpath="//input[@id='txtUsername']")public WebElement username;
	//password
	@FindBy(xpath="//input[@id='txtPassword']")public WebElement password;
	//login btn
	@FindBy(xpath="//input[@id='btnLogin']")public WebElement login_btn;
	//admin menu
	@FindBy(xpath="//a[@id='menu_admin_viewAdminModule']") public WebElement admin_Menu;
	
	//SEARCH FORM  - USERNAME
	@FindBy(xpath="//input[@id='searchSystemUser_userName']") public WebElement searchUsername;
	//USER TYPE
	@FindBy(xpath="//select[@id='searchSystemUser_userType']") public WebElement userType;
	//SEARCH EMPLOYEE NAME
	@FindBy(xpath="//input[@id='searchSystemUser_employeeName_empName']") public WebElement searchEmpname;
	//SEARCH STATUS
	@FindBy(xpath="//select[@id='searchSystemUser_status']") public WebElement searchStatus;
	//SEARCH BUTTON
	@FindBy(xpath="//input[@id='searchBtn']") public WebElement search_btn;
	//CLICK ON THE SEARCH CHECKBOX
	@FindBy(xpath="//a[@href='saveSystemUser?userId=39']") public WebElement search_data;
	
	//EDITE PROFILE - edite button
	@FindBy(xpath="//input[@id='btnSave']") public WebElement edite_btn;
	//edite username
	@FindBy(xpath="//input[@id='systemUser_userName']") public WebElement editeUsername;
	@FindBy(xpath="//input[@id='systemUser_chkChangePassword']") public WebElement chkChangePassword;
	@FindBy(xpath="//input[@id='systemUser_password']") public WebElement editpassword;
	@FindBy(xpath="//input[@id='systemUser_confirmPassword']") public WebElement editComformPass;
	@FindBy(xpath="//input[@id='btnSave']") public WebElement save_btn;
	
	//LOGOUT - welcome menu
	@FindBy(xpath="//a[@id='welcome']") public WebElement welcome;
	//log out menu
	@FindBy(xpath="//a[@href='/index.php/auth/logout']") public WebElement logout;
	
	
	public void OrangeHRM_AdminEditeProfile(String uname, String upass, String sUname, String sUtype, String sEmpname, String sStatus, String eUsername, String eChangePass, String eChangeCPass) throws Exception   {
		
		username.sendKeys(uname);
		Thread.sleep(2000);
		password.sendKeys(upass);
		Thread.sleep(2000);
		login_btn.click();
		Thread.sleep(2000);
		admin_Menu.click();
		Thread.sleep(2000);
		searchUsername.sendKeys(sUname);
		Thread.sleep(2000);
		userType.sendKeys(sUtype);
		Thread.sleep(2000);
		searchEmpname.sendKeys(sEmpname);
		Thread.sleep(2000);
		searchStatus.sendKeys(sStatus);
		Thread.sleep(2000);
		search_btn.click();
		Thread.sleep(2000);
		search_data.click();
		Thread.sleep(2000);
		edite_btn.click();
		Thread.sleep(2000);
		editeUsername.clear();
		editeUsername.sendKeys(eUsername);
		Thread.sleep(2000);
		chkChangePassword.click();
		Thread.sleep(2000);
		editpassword.sendKeys(eChangePass);
		Thread.sleep(2000);
		editComformPass.sendKeys(eChangeCPass);
		Thread.sleep(2000);
		save_btn.click();
		Thread.sleep(3000);
	}
	
	public void OrangeHRMLogout() throws Exception  {
		welcome.click();
		Thread.sleep(2000);
		logout.click();
		Thread.sleep(5000);
	}
}
