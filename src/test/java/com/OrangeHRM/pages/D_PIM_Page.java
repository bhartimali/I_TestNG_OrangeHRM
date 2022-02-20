package com.OrangeHRM.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class D_PIM_Page {

public  WebDriver driver;
	
	@FindBy(xpath="//input[@id='txtUsername']")public WebElement username;
	@FindBy(xpath="//input[@id='txtPassword']")public WebElement password;
	@FindBy(xpath="//input[@id='btnLogin']")public WebElement login_btn;
	
	//SEARCH FORM -  PIM Menu
	@FindBy(xpath="//a[@id='menu_pim_viewPimModule']")public WebElement PIMMenu;
	//Employee Name
	@FindBy(xpath="//input[@id='empsearch_employee_name_empName']")public WebElement empName;
	//Id
	@FindBy(xpath="//input[@id='empsearch_id']")public WebElement empId;
	//Employment Status
	@FindBy(xpath="//select[@id='empsearch_employee_status']")public WebElement empStatus;
	//Include
	@FindBy(xpath="//select[@id='empsearch_termination']")public WebElement empInclude;
	//Supervisor Name
	@FindBy(xpath="//input[@id='empsearch_supervisor_name']")public WebElement supervisorName;
	//Job Title
	@FindBy(xpath="//select[@id='empsearch_job_title']")public WebElement jobTitle;
    //Sub Unit
	@FindBy(xpath="//select[@id='empsearch_sub_unit']")public WebElement subUnit;
	//Reset button
	@FindBy(xpath="//input[@id='resetBtn']")public WebElement reset_btn;
	//Search button
	@FindBy(xpath="//input[@id='searchBtn']")public WebElement search_btn;
	//Check select row
	@FindBy(xpath="//input[@name='chkSelectRow[]']")public WebElement chkSelectRow;
	//delete button
	@FindBy(xpath="//input[@id='btnDelete']")public WebElement delete_btn;
	//conform button
	@FindBy(xpath="//input[@id='dialogDeleteBtn']")public WebElement conformOk_btn;
	
	//LOGOUT
	@FindBy(xpath="//a[@id='welcome']") public WebElement welcome;
	@FindBy(xpath="//a[@href='/index.php/auth/logout']") public WebElement logout;
	
	public D_PIM_Page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void OrangeHRM_PIM(String uname, String upass, String eName, String eId, String eStatus, String eInclude, String Sname, String jobtitle, String subunit ) throws InterruptedException {
		username.sendKeys(uname);
		Thread.sleep(2000);
		password.sendKeys(upass);
		Thread.sleep(2000);
		login_btn.click();
		Thread.sleep(2000);
		PIMMenu.click();
		Thread.sleep(2000);
		empName.sendKeys(eName);
		Thread.sleep(2000);
		empId.sendKeys(eId);
		Thread.sleep(2000);
		empStatus.sendKeys(eStatus);
		Thread.sleep(2000);
		empInclude.sendKeys(eInclude);
		Thread.sleep(2000);
		supervisorName.sendKeys(Sname);
		Thread.sleep(2000);
		jobTitle.sendKeys(jobtitle);
		Thread.sleep(2000);
		subUnit.sendKeys(subunit);
		Thread.sleep(2000);
		search_btn.click();
		Thread.sleep(2000);
		chkSelectRow.click();
		Thread.sleep(2000);
		delete_btn.click();
		Thread.sleep(2000);
		conformOk_btn.click();
		Thread.sleep(3000);
	}
	public void OrangeHRMLogout() throws Exception {
		welcome.click();
		Thread.sleep(2000);
		logout.click();
		Thread.sleep(5000);
	}
}
