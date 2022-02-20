package com.OrangeHRM.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class B_AdminPage {
	
public  WebDriver driver;
	
	//LOGIN FORM - username
	@FindBy(xpath="//input[@id='txtUsername']")public WebElement username;
	//password
	@FindBy(xpath="//input[@id='txtPassword']")public WebElement password;
	//login btn
	@FindBy(xpath="//input[@id='btnLogin']")public WebElement login_btn;
	
	//ADD USER FORM - admin menu
	@FindBy(xpath="//a[@id='menu_admin_viewAdminModule']") public WebElement admin_Menu;
	//add button 
	@FindBy(xpath="//input[@id='btnAdd']") public WebElement add_btn;
	//user role
	@FindBy(xpath="//select[@id='systemUser_userType']") public WebElement userRole;
	//Employee Name 
	@FindBy(xpath="//input[@id='systemUser_employeeName_empName']") public WebElement employeeName;
	//Add Username 
	@FindBy(xpath="//input[@id='systemUser_userName']") public WebElement addUserName;
	//Sataus
	@FindBy(xpath="//select[@id='systemUser_status']") public WebElement status;
	//add password
	@FindBy(xpath="//input[@id='systemUser_password']") public WebElement addUPass;
	//add Comform Password
	@FindBy(xpath="//input[@id='systemUser_confirmPassword']") public WebElement addComformUPass;
	//Cancel Button
	@FindBy(xpath="//inpu[@id='btnCancel']") public WebElement cancel_btn;
	//Save Button
	@FindBy(xpath="//input[@id='btnSave']") public WebElement save_btn;
	
	//SEARCH FORM  - USERNAME
	@FindBy(xpath="//input[@id='searchSystemUser_userName']") public WebElement searchUsername;
	//USER TYPE
	@FindBy(xpath="//select[@id='searchSystemUser_userType']") public WebElement userType;
	//SEARCH EMPLOYEE NAME
	@FindBy(xpath="//input[@id='searchSystemUser_employeeName_empName']") public WebElement searchEmpname;
	//SEARCH STATUS
	@FindBy(xpath="//select[@id='searchSystemUser_status']") public WebElement searchStatus;
	//RESET BUTTON
	@FindBy(xpath="//input[@id='resetBtn']") public WebElement reset_btn;
	//SEARCH BUTTON
	@FindBy(xpath="//input[@id='searchBtn']") public WebElement search_btn;
	//CLICK ON THE SEARCH CHECKBOX
	@FindBy(xpath="//input[@name='chkSelectRow[]']") public WebElement search_chk;
	//DELETE BUTTON
	@FindBy(xpath="//input[@id='btnDelete']") public WebElement delete_btn;
	//CONFORM BUTTON
	@FindBy(xpath="//input[@id='dialogDeleteBtn']") public WebElement conformOk_btn;
	
	//LOGOUT
	//welcome menu
	@FindBy(xpath="//a[@id='welcome']") public WebElement welcome;
	//log out menu
	@FindBy(xpath="//a[@href='/index.php/auth/logout']") public WebElement logout;

	public B_AdminPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void OrangeHRMAdmin(String uname, String upass,String urole,String empName, String addUname, String ustatus, String addPass, String addComPass, String serachUname, String searchURole, String searchEmpName, String searchstatus) throws Exception {
		
		username.sendKeys(uname);
		Thread.sleep(2000);
		password.sendKeys(upass);
		Thread.sleep(2000);
		login_btn.click();
		Thread.sleep(2000);
		admin_Menu.click();
		Thread.sleep(2000);
		add_btn.click();
		Thread.sleep(2000);
		userRole.sendKeys(urole);
		Thread.sleep(2000);
		employeeName.sendKeys(empName);
		employeeName.sendKeys(Keys.TAB);
		Thread.sleep(2000);
		addUserName.sendKeys(addUname);
		Thread.sleep(2000);
		status.sendKeys(ustatus);
		Thread.sleep(2000);
		addUPass.sendKeys(addPass);
		Thread.sleep(2000);
		addComformUPass.sendKeys(addComPass);
		Thread.sleep(2000);
		save_btn.click();
		Thread.sleep(2000);
		
		//RESET DATA
		searchUsername.sendKeys(serachUname);
		Thread.sleep(2000);
		userType.sendKeys(searchURole);
		Thread.sleep(2000);
		searchEmpname.sendKeys(searchEmpName);
		Thread.sleep(2000);
		searchStatus.sendKeys(searchstatus);
		Thread.sleep(2000);
		reset_btn.click();
		Thread.sleep(2000);
					
		//SEARCH DATA
		searchUsername.sendKeys(serachUname);
		Thread.sleep(2000);
		userType.sendKeys(searchURole);
		Thread.sleep(2000);
		searchEmpname.sendKeys(searchEmpName);
		Thread.sleep(2000);
		searchStatus.sendKeys(searchstatus);
		Thread.sleep(2000);
		search_btn.click();
		Thread.sleep(2000);
		search_chk.click();
		Thread.sleep(2000);
		delete_btn.click();
		Thread.sleep(2000);
		conformOk_btn.click();
		Thread.sleep(2000);
	}
	public void OrangeHRMLogOut() throws Exception {
		welcome.click();
		Thread.sleep(2000);
		logout.click();
		Thread.sleep(5000);
	}
}
