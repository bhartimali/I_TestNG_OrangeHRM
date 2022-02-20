package com.OrangeHRM.utility;

import java.io.File;

import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.OrangeHRM.constants.Constants;

public class BaseClass {

public static WebDriver driver;
	
	public static String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
	
	@BeforeTest
	public void setUp() {
		
		System.setProperty("webdriver.chrome.driver", Constants.chromePath);
		driver = new ChromeDriver();
		driver.get(Constants.url);
		driver.manage().window().maximize();
		fCaptureScreenShot(driver, "Login");
	}
	@AfterTest
	public void tearDown() {
		driver.close();
	}
	public static String fCaptureScreenShot(WebDriver driver, String screenshotName) {
		TakesScreenshot takesScreenShot = (TakesScreenshot) driver;
		File Source = takesScreenShot.getScreenshotAs(OutputType.FILE);
		String screenshotPath = System.getProperty("user.dir")+ "\\Screenshots\\"+screenshotName+ " _ "+timeStamp+ ".png";
		try {
			FileUtils.copyFile(Source, new File(screenshotPath));
			
		}catch(Exception e) {
			System.out.println("Unable to capture the Screenshot "+e.getMessage());
		}
		return screenshotPath;
		
		
	}
}