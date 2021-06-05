package com.testScript;

import java.awt.Robot;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.base.BaseTest;
import com.pom.Register_POM;
import com.utility.RegisterationMethod;

public class RegisterationTest_Naidu extends BaseTest{
	
	
	
	@BeforeTest
	public void startUp() {
		
		
		  System.setProperty("webdriver.chrome.driver", ".//Driver//chromedriver.exe");
		  ChromeOptions options = new ChromeOptions();
		  options.addArguments("--disable-notifications"); driver = new
		  ChromeDriver(options);
		 
		
		
	//	System.setProperty("webdriver.gecko.driver", ".//Driver//geckodriver.exe");
		
	//	driver = new FirefoxDriver();
	}
	
	
	@Test(invocationCount = 1)
	public void register1() throws Throwable {
		
		Actions acc = new Actions(driver);
		Robot r = new Robot();
	//	WebDriverWait wait = new WebDriverWait(driver, 30);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Register_POM rp = new Register_POM(driver);
		
		Thread.sleep(2000);
		driver.get("https://www.iimiitmatrimony.com/");
		driver.manage().window().maximize();
		
		
		Thread.sleep(2000);
		RegisterationMethod.page1();
		
		
		RegisterationMethod.page2();
		
		RegisterationMethod.page3();
		
		RegisterationMethod.page4();
		
		RegisterationMethod.iimiitEducation();
		

	}

}
