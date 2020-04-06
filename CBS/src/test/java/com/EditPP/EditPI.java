package com.EditPP;

import java.awt.Robot;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.pages.EditPIMethod;
import com.pages.logOut;

import base.BaseTest;
import pom.cmlogin.EditPI_POM;
import pom.cmlogin.GothramPOM;

public class EditPI extends BaseTest{
	
	
	@BeforeSuite
	public void setUp() {
		// test=reports.startTest("Divorcee Negative Payment");
		// test.log(LogStatus.PASS, "Divorcee Negative Payment Test Started");
		System.setProperty("webdriver.chrome.driver",
				".//Driver//chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		//ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
	//	options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);
	
	}
	
	
	@Test
	public void piEditing() throws Throwable {
		
		GothramPOM g = new GothramPOM(driver);
		EditPI_POM i = new EditPI_POM(driver);
		Actions acc = new Actions(driver);
		Robot r = new Robot();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		JavascriptExecutor js  = (JavascriptExecutor)driver;
		com.pages.EditPIMethod pp = new EditPIMethod();
		
		
		driver.get("https://www.communitymatrimony.com");
		driver.manage().window().maximize();
		BaseTest.click(g.getMatriID());
		BaseTest.typeData(g.getMatriID(), "AGR755407");
		BaseTest.click(g.getPasswordClear());
		BaseTest.typeData(g.getPassword(), "cbstest");
		BaseTest.click(g.getLogin_btn());
		
		
		
		
		try {
			BaseTest.click(g.getInterMediate_page());
		} catch (Exception e2) {
			// TODO: handle exception
		}
		
		try {
			BaseTest.click(g.getInterMediate_page1());
		} catch (Exception e2) {
			// TODO: handle exception
		}
		
		Thread.sleep(5000);
		try {
			Alert al = driver.switchTo().alert();
			al.accept();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		Thread.sleep(5000);
		try {
			BaseTest.click(driver.findElement(By.xpath("//*[@id=\"special_offer_lightpic1\"]/div[1]/div/a/img")));
		} catch (Exception e2) {
			// TODO: handle exception
		}
		
		Thread.sleep(2000);
		try {
			acc.moveToElement(g.getMenu_btn());
		} catch (Exception e2) {
		    acc.moveToElement(g.getMenu_btn1());
		}
		Thread.sleep(2000);
		acc.moveToElement(g.getEdit_Profile()).click().build().perform();
		
		Thread.sleep(3000);
		
		String parent = driver.getWindowHandle();
		
		/////////////////////////////////////////////////////////////////
	//	EditPIMethod.basicDetail();
	//	EditPIMethod.educationDetail();
	//	EditPIMethod.familyDetails();
    //	EditPIMethod.hobby();
     //	EditPIMethod.music();
       // EditPIMethod.sports();
	    //EditPIMethod.hobbies();
	//    EditPIMethod.editPartnerPrefernce();
	    EditPIMethod.locationDetail();
	    EditPIMethod.email_mobileno_PI_edit();
	    logOut.logoutMethod();
	    ///////////////////////////////////////////////////////////////////////
	    

	
	}
	

}
