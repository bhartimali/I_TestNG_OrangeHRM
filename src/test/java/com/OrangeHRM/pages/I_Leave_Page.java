package com.OrangeHRM.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class I_Leave_Page {

	public WebDriver driver;
	
	@FindBy(xpath="//input[@id='txtUsername']")public WebElement username;
	@FindBy(xpath="//input[@id='txtPassword']")public WebElement password;
	@FindBy(xpath="//input[@id='btnLogin']")public WebElement loginbtn;
	@FindBy(xpath="//a[@id='welcome']")public WebElement welcome;
	@FindBy(xpath="//a[@href='/index.php/auth/logout']")public WebElement logoutbtn;
	
	public I_Leave_Page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void OrangeHRMLogin(String uname, String upass) throws InterruptedException {
		username.sendKeys(uname);
		password.sendKeys(upass);
		Thread.sleep(2000);
		loginbtn.click();
		Thread.sleep(2000);
	}
	public void logout() throws InterruptedException{
		welcome.click();
		Thread.sleep(2000);
		logoutbtn.click();
		Thread.sleep(4000);
	}
}
