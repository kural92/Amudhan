package com.testScripts;

import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.base.BaseTest;
import com.objectRepository.GamoogaPOM;

public class Upload extends BaseTest{
	
	
	
	@BeforeSuite
	public void setUp() {
		// test=reports.startTest("Divorcee Negative Payment");
		// test.log(LogStatus.PASS, "Divorcee Negative Payment Test Started");
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\amuthan\\eclipse-workspace\\Gammoga\\Driver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);
	
	}
	
	@Test
	public void excelDownload() throws Throwable {
		
			
			Actions acc = new Actions(driver);
			Robot r = new Robot();
			WebDriverWait wait = new WebDriverWait(driver, 30);
			JavascriptExecutor js  = (JavascriptExecutor)driver;
			
			//  POM 
			
			GamoogaPOM g = new GamoogaPOM(driver);
			
			
			
			
			driver.get("http://telesales.bharatmatrimony.com/pa_import.php");
			driver.manage().window().maximize();
			Thread.sleep(3000);
			
			
			driver.findElement(By.xpath("(//a[contains(text(),' click here ')])[2]")).click();
			Thread.sleep(3000);
			
			
			BaseTest.typeData(driver.findElement(By.xpath("//*[@id=\"myForm\"]/div[1]/input")), "C:\\Users\\amuthan\\Downloads\\All agents-depts-2019-10-11-2019-10-11.xlsx");
			
			
	
	}
	

}
