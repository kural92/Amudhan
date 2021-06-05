package com.testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.base.BaseTest;

public class EncryptURL extends BaseTest {
	
	
	@BeforeSuite
	public void setUp() {
		// test=reports.startTest("Divorcee Negative Payment");
		// test.log(LogStatus.PASS, "Divorcee Negative Payment Test Started");
		System.setProperty("webdriver.chrome.driver", ".//Driver//chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);

	}
	
	
	
	@Test
	public void excelID() throws Throwable {
		
		
		int a = BaseTest.getRowCount("Encrypt1");
		System.out.println("Count : "+ a);
		
		for (int i = 41; i <=a; i++) {
			System.out.println(i);
			Thread.sleep(1000);
			
			String ID = BaseTest.getExcelData("Encrypt1", i, 0);
			String Gender = BaseTest.getExcelData("Encrypt1", i, 1);
			
			Thread.sleep(2000);
			driver.navigate().to("https://www.agarwalmatrimony.com/cbscheck/token.php?matriid="+ID+"");
			driver.manage().window().maximize();

			Thread.sleep(1000);
			String Encr = driver.findElement(By.xpath("/html/body")).getText();
			System.out.println(Encr);
			
			
			String[] Encry = Encr.split("Encrypt Id: ");
			
			String Encryp = Encry[1].toString();
			System.out.println(Encryp);
			
			Thread.sleep(1000);
			BaseTest.setExcelData("Encrypt1", i, 2, Encryp);
			
			Thread.sleep(1000);
			BaseTest.setExcelData("Encrypt1", i, 3, ID+"|"+Encryp+"|"+Gender);
			
			Thread.sleep(1000);
	
			
		}


	}

}
