package com.OrangeHRM.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class E_PIM_AddEmployee_Page {

public  WebDriver driver;
	
	@FindBy(xpath="//input[@id='txtUsername']")public WebElement username;
	@FindBy(xpath="//input[@id='txtPassword']")public WebElement password;
	@FindBy(xpath="//input[@id='btnLogin']")public WebElement login_btn;
	
	//PIM - AddEmployee 
	@FindBy(xpath="//a[@id='menu_pim_viewPimModule']")public WebElement PIMMenu;
	//add button
	@FindBy(xpath="//input[@id='btnAdd']")public WebElement add_btn;
	//first name
	@FindBy(xpath="//input[@id='firstName']")public WebElement firstName;
	//last name
	@FindBy(xpath="//input[@id='lastName']")public WebElement lastName;
	//uplaod profile pic
	@FindBy(xpath="//input[@id='photofile']")public WebElement photofile;
	//save button
	@FindBy(xpath="//input[@id='btnSave']")public WebElement save_btn;
	
	//Edite Profile - edite btn
	@FindBy(xpath="//input[@id='btnSave']")public WebElement edit_Btn;
	//nick name
	@FindBy(xpath="//input[@id='personal_txtEmpNickName']")public WebElement nickName;
	//save button
	@FindBy(xpath="//input[@id='btnSave']")public WebElement Save_Btn;
	//Blood Type - edite Button
	@FindBy(xpath="//input[@id='btnEditCustom']")public WebElement EditCustom_Btn;
	@FindBy(xpath="//select[@name='custom1']")public WebElement blood_Type;
	@FindBy(xpath="//input[@id='btnEditCustom']")public WebElement SaveCustom_Btn;
	//Attachments
	@FindBy(xpath="//input[@id='btnAddAttachment']")public WebElement addAttchment_btn;
	@FindBy(xpath="//input[@id='ufile']")public WebElement ufile;
	@FindBy(xpath="//input[@id='btnSaveAttachment']")public WebElement SaveAttchmnet_Btn;
	@FindBy(xpath="//input[@name='chkattdel[]']")public WebElement chkattch;
	@FindBy(xpath="//input[@id='btnDeleteAttachment']")public WebElement deleteAttach_Btn;
	
	//LOGOUT
	@FindBy(xpath="//a[@id='welcome']") public WebElement welcome;
	@FindBy(xpath="//a[@href='/index.php/auth/logout']") public WebElement logout;
	
	public E_PIM_AddEmployee_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void OrangeHRM_AddEmployee(String uname, String upass, String efname, String elname, String epic, String NickName, String bType, String UFile) throws Exception {
		
		username.sendKeys(uname);
		Thread.sleep(2000);
		password.sendKeys(upass);
		Thread.sleep(2000);
		login_btn.click();
		Thread.sleep(2000);
		PIMMenu.click();
		Thread.sleep(2000);
		add_btn.click();
		Thread.sleep(2000);
		firstName.sendKeys(efname);
		Thread.sleep(2000);
		lastName.sendKeys(elname);
		Thread.sleep(2000);
		photofile.sendKeys(epic);
		Thread.sleep(2000);
		save_btn.click();
		Thread.sleep(2000);
		edit_Btn.click();
		Thread.sleep(2000);
		nickName.sendKeys(NickName);
		Thread.sleep(2000);
		Save_Btn.click();
		Thread.sleep(2000);
		EditCustom_Btn.click();
		Thread.sleep(2000);
		blood_Type.sendKeys(bType);
		Thread.sleep(2000);
		SaveCustom_Btn.click();
		Thread.sleep(2000);
		addAttchment_btn.click();
		Thread.sleep(2000);
		ufile.sendKeys(UFile);
		Thread.sleep(2000);
		SaveAttchmnet_Btn.click();
		Thread.sleep(2000);
		chkattch.click();
		Thread.sleep(2000);
		deleteAttach_Btn.click();
		Thread.sleep(3000);
	}
	public void OrangeHRM_LogOut() throws Exception {
		welcome.click();
		Thread.sleep(2000);
		logout.click();
		Thread.sleep(5000);
	}
}
