package com.OrangeHRM.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class H_Reports_Page {

	public WebDriver driver;
	@FindBy(xpath="//input[@id='txtUsername']")public WebElement username;
	@FindBy(xpath="//input[@id='txtPassword']")public WebElement password;
	@FindBy(xpath="//input[@id='btnLogin']")public WebElement login_btn;
	@FindBy(xpath="//a[@id='welcome']") public WebElement welcome;
	@FindBy(xpath="//a[@href='/index.php/auth/logout']") public WebElement logout;
	
	public H_Reports_Page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void Login(String UserName, String Upass) throws InterruptedException {
		username.sendKeys(UserName);
		Thread.sleep(2000);
		password.sendKeys(Upass);
		Thread.sleep(2000);
		login_btn.click();
		Thread.sleep(3000);
	}
	public void logout() throws InterruptedException {
		welcome.click();
		Thread.sleep(2000);
		logout.click();
		Thread.sleep(3000);
	}
}
