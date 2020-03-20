package cm.testscripts;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import base.BaseTest;
import pom.cmlogin.LoginDiv;
import pom.cmlogin.payDiv;

public class SmsDemo extends BaseTest{
	
	static WebDriver driver;
	
	
	@BeforeSuite
	public void startUp() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\amuthan\\eclipse-workspace\\CBS\\Driver\\chromedriver.exe");
		ChromeOptions options =  new ChromeOptions();
		driver = new ChromeDriver(options);
						
	}
	
	@Test
	public void login() {
		
		BaseTest b = new BaseTest();
		payDiv l = new payDiv(driver);
		
		driver.get("https://www.communitymatrimony.com");
		driver.manage().window().maximize();
		
		b.click(l.getCommunity_matri_id());
		b.typeData(l.getCommunity_matri_id(), "EZH710533");
		
		b.click(l.getDpassWordclr1());
		b.typeData(l.getDpassword(), "cbstest");
		
		b.click(l.getCommunity_login());
		
		
		

	}
	
	
	@AfterMethod
	public void sms(ITestResult testResult) throws Exception {
		
		

		File src =new File("C:\\Users\\amuthan\\eclipse-workspace\\CBS\\Excel\\SMSTEST.xlsx");
		////    Excel Code     ///
	
		FileInputStream file = new FileInputStream(src);
		
		  XSSFWorkbook wb=new XSSFWorkbook(file);
			 
		  // get the sheet which you want to modify or create
		 
		   XSSFSheet sheet= wb.getSheet("Sheet1");
		
	   int result =(testResult.getStatus());
	  System.out.println(result);
	   
	 	 
			 
			 if (testResult.getStatus()==2) {
				 BaseTest.sendVFSms1();
				
			} else if (testResult.getStatus()==1) {
				
			  String test = sheet.getRow(1).getCell(0).getStringCellValue();
			  
			  if (test.equals("2.0")) {
				  
				  BaseTest.sendVFSms();
				
			}
				
			} else {

			}
			 
			 
			 
			 /////  Read and Write Excel Value      ////
			 
			
				   
				//   sheet.getRow(1).getCell(0).setCellType(result);
				   Cell status = sheet.getRow(1).getCell(0);
				   status.setCellType(result);
				//   System.out.println(status);
				   
				   FileOutputStream fout=new FileOutputStream(src);
					 
					 
					// finally write content 
					 
					 wb.write(fout);
					 
					// close the file
					 System.out.println(status);
					 
					 fout.close();  
			

	}
	
	
	

}
