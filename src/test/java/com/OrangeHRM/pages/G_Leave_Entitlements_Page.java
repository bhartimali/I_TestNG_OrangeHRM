package com.OrangeHRM.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class G_Leave_Entitlements_Page {
	
	public WebDriver driver;

	@FindBy(xpath="//input[@id='txtUsername']")public WebElement username;
	@FindBy(xpath="//input[@id='txtPassword']")public WebElement password;
	@FindBy(xpath="//input[@id='btnLogin']")public WebElement login_btn;
	
	//Leave -> MyEntilements
	@FindBy(xpath="//a[@id='menu_leave_viewLeaveModule']") public WebElement leave_Menu;
	@FindBy(xpath="//a[@id='menu_leave_Entitlements']") public WebElement entitlment_Menu;
	@FindBy(xpath="//a[@id='menu_leave_viewMyLeaveEntitlements']") public WebElement myEntilement_Menu;
	@FindBy(xpath="//input[@id='btnAdd']")public WebElement add_btn;
	@FindBy(xpath="//input[@id='entitlements_employee_empName']")public WebElement employeeName;
	@FindBy(xpath="//select[@id='entitlements_leave_type']")public WebElement leaveType;
	@FindBy(xpath="//select[@id='period']")public WebElement period;
	@FindBy(xpath="//input[@id='entitlements_entitlement']")public WebElement Entitlement;
	@FindBy(xpath="//input[@id='btnSave']")public WebElement save_btn;
	//update leave
	@FindBy(xpath="//*[@id=\"resultTable\"]/tbody/tr/td[3]/a")public WebElement dateLink;
	@FindBy(xpath="//input[@id='entitlements_entitlement']")public WebElement updateEntitlement;
	//handle dynamic attribute
	//button[starts-with(@id, 'save') and contains(@class,'publish')]
	@FindBy(xpath="//input[starts-with(@id, 'ohrmList_chkSelectRecord_') and contains(@name,'chkSelectRow[]')]")public WebElement chkSelectRow;
	//@FindBy(xpath="//input[contains(@id, ‘ohrmList_chkSelectRecord_’)]")public WebElement chkSelectRow;
	@FindBy(xpath="//input[@id='btnDelete']")public WebElement delete_btn;
	@FindBy(xpath="//input[@id='dialogDeleteBtn']")public WebElement comform_btn;
	
	//LOGOUT
	@FindBy(xpath="//a[@id='welcome']") public WebElement welcome;
	@FindBy(xpath="//a[@href='/index.php/auth/logout']") public WebElement logout;
	
	public G_Leave_Entitlements_Page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void MyEntitlements(String uname, String upass, String ename, String ltype, String lPeriod, String entitlemt,String UEntile) throws Exception {
		
		username.sendKeys(uname);
		Thread.sleep(2000);
		password.sendKeys(upass);
		Thread.sleep(2000);
		login_btn.click();
		Thread.sleep(2000);
		leave_Menu.click();
		Thread.sleep(2000);
		entitlment_Menu.click();
		Thread.sleep(2000);
		myEntilement_Menu.click();
		Thread.sleep(2000);
		add_btn.click();
		Thread.sleep(2000);
		employeeName.sendKeys(ename);
		employeeName.sendKeys(Keys.TAB);
		Thread.sleep(2000);
		leaveType.sendKeys(ltype);
		Thread.sleep(2000);
		period.sendKeys(lPeriod);
		Thread.sleep(2000);
		Entitlement.sendKeys(entitlemt);
		Thread.sleep(2000);
		save_btn.click();
		Thread.sleep(2000);
		dateLink.click();
		Thread.sleep(2000);
		updateEntitlement.clear();
		updateEntitlement.sendKeys(UEntile);
		Thread.sleep(2000);
		save_btn.click();
		Thread.sleep(2000);
		chkSelectRow.click();
		Thread.sleep(2000);
		delete_btn.click();
		Thread.sleep(2000);
		comform_btn.click();
		Thread.sleep(3000);
	}
	public void logout() throws Exception {
		welcome.click();
		Thread.sleep(2000);
		logout.click();
		Thread.sleep(4000);
	}
}
