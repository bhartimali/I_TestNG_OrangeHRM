package com.OrangeHRM.pages;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class A_LoginPage {
	
	public  WebDriver driver;
	
	@FindBy(xpath="//input[@id='txtUsername']")public WebElement userName_txt;
	@FindBy(xpath="//input[@id='txtPassword']")public WebElement password_txt;
	@FindBy(xpath="//input[@id='btnLogin']")public WebElement login_btn;
	@FindBy(xpath="//a[@id='welcome']") public WebElement welcome;
	@FindBy(xpath="//a[@href='/index.php/auth/logout']") public WebElement logout;
	
	public A_LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void OrangrHRMLogin(String uName, String passwd) throws InterruptedException {
		userName_txt.sendKeys(uName);
		Thread.sleep(3000);
		password_txt.sendKeys(passwd);
		Thread.sleep(3000);
		login_btn.click();
		Thread.sleep(3000);
		
	}
	
	public void OrangeHRMLogout() throws InterruptedException {
		welcome.click();
		Thread.sleep(2000);
		logout.click();
		Thread.sleep(5000);
	}
}
