package cm.testscripts;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import base.BaseTest;
import pom.cmlogin.payDiv;

public class multiplelogin extends BaseTest {
	
	static WebDriver driver;
	
	
	@BeforeSuite
	public void setUp() {
		//test=reports.startTest("Divorcee Negative Payment");
	 // 	test.log(LogStatus.PASS, "Divorcee Negative Payment Test Started");
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\amuthan\\eclipse-workspace\\CBS\\Driver\\chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
	        options.addArguments("--disable-notifications");
			driver = new ChromeDriver(options);
			//driver.get("https://www.divorceematrimony.com");
	      //  driver.manage().window().maximize();
		}
	
	
	
	@Test
	private void loginTest() throws Throwable {
		
		
	//	BaseTest b = new BaseTest();
		payDiv p1 = new payDiv(driver);
		Thread.sleep(3000);
		driver.get("https://www.divorceematrimony.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		System.out.println("Opened");
		
		
		BaseTest.click(p1.getMatriID());
		System.out.println("1.Opened");
		Thread.sleep(3000);
		
		//for (int i = 1; i <=5; i++) {
			
		
	    BaseTest.typeData(p1.getMatriID(),p1.readValueFromExcelSheet().get(1).get("UserName"));
		Thread.sleep(3000);
        BaseTest.click(p1.getDpassWordclr1());
		Thread.sleep(3000);
	//	driver.findElement(By.xpath("BaseTest")).sendKeys("cbstest");
		BaseTest.typeData(p1.getDpassword(),p1.readValueFromExcelSheet().get(1).get("PassWord") );
		Thread.sleep(3000);
		BaseTest.click(p1.getDlogin());
	//	test.log(LogStatus.PASS, "Logged In Successfully");
		Thread.sleep(3000);
	//	BaseTest.interMediatePage();
		
		
	//	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}}