package com.testscripts;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.base.Base;
import com.pom.LoginPom;



public class Community_Login extends Base{
	
	
	WebDriver driver;
	

	
	@BeforeSuite
	public void startUp() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\amuthan\\eclipse-workspace\\SMS_Project\\Driver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);
		

	}
	
	
	@Test
	public void communityLoginTest() throws Exception {
		
		LoginPom l = new LoginPom(driver);
		
		
		driver.get("https://www.communitymatrimony.com");
		
		Base.click(l.getMatriId());
		Base.typeData(l.getMatriId(),"EZH710533");
		
		Base.click(l.getPaswwordclr());
		Base.typeData(l.getPassword(), "cbstest");
		
		Base.click(l.getLoginbtn());
		Thread.sleep(1000);
		

	}
	
	
@AfterMethod
public void sms(ITestResult result) throws Throwable
 {
	
	
	System.out.println(result.getStatus());
	
	//String aaaaa = result.getThrowable().getMessage();
	try {
	
	FileInputStream fis = new FileInputStream("C:\\Users\\amuthan\\eclipse-workspace\\SMS_Project\\Excel\\Sms_Test_Data.xlsx");
	
	Workbook w = new XSSFWorkbook(fis);
	
	Sheet s = w.getSheet("Sheet1");
	
	System.out.println(s.getRow(1).getCell(0).getStringCellValue());
	
	} catch (Exception e) {
		// TODO: handle exception
	}
}
	
}


