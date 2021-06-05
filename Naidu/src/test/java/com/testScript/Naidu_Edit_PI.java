package com.testScript;

import java.awt.Robot;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.base.BaseTest;
import com.pom.EditPI_POM;
import com.pom.GothramPOM;
import com.utility.EditPIMethod;
import com.utility.logOut;





public class Naidu_Edit_PI extends BaseTest{

	

	@BeforeSuite
	public void setUp() {
		// test=reports.startTest("Divorcee Negative Payment");
		 //test.log(LogStatus.PASS, "Divorcee Negative Payment Test Started");
		System.setProperty("webdriver.chrome.driver", ".//Driver//chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);

		

		//System.setProperty("webdriver.gecko.driver", ".//Driver//geckodriver.exe");
		
		//driver = new FirefoxDriver();
		
		
	}

	
	@Test
	public void edit_pI() throws Throwable {
		
		GothramPOM g = new GothramPOM(driver);
		EditPI_POM i = new EditPI_POM(driver);
		Actions acc = new Actions(driver);
		Robot r = new Robot();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		JavascriptExecutor js  = (JavascriptExecutor)driver;
		EditPIMethod pp = new EditPIMethod();
		
		
		driver.get("https://www.96kulimarathamatrimony.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		BaseTest.click(driver.findElement(By.id("loginbtn")));
		Thread.sleep(3000);
		BaseTest.click(g.getMatriID());
		BaseTest.typeData(g.getMatriID(), "NSK100014");
		BaseTest.click(g.getPasswordClear());
		BaseTest.typeData(g.getPassword(), "cbstest");
		//BaseTest.click(g.getLogin_btn());
		BaseTest.click(driver.findElement(By.xpath("//*[@id=\"login_form_web\"]/div[4]/div[2]")));
		
		
		
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
		
		try {
			BaseTest.click(g.getInterMediate_page2());
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
			acc.moveToElement(driver.findElement(By.xpath("//a[@title='Add Photo']"))).build().perform();
			Thread.sleep(2000);
			acc.moveToElement(driver.findElement(By.xpath("//a[@title='Add Photo']"))).build().perform();
		//	acc.moveToElement(g.getMenu_btn());
		} catch (Exception e2) {
		   // acc.moveToElement(g.getMenu_btn1());
		}
		

		Thread.sleep(2000);
		acc.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Edit Profile')]"))).build().perform();
		Thread.sleep(2000);
		acc.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Edit Profile')]"))).click().build().perform();
		
		//acc.moveToElement(g.getEdit_Profile()).click().build().perform();
		
		Thread.sleep(3000);
		
		String parent = driver.getWindowHandle();
		
		/////////////////////////////////////////////////////////////////
		Thread.sleep(3000);
	 EditPIMethod.basicDetail();
		Thread.sleep(3000);
//	EditPIMethod.doctorEducationDetail();
		Thread.sleep(3000);
	//	EditPIMethod.familyDetails();
		Thread.sleep(3000);
//  	EditPIMethod.hobby();
		Thread.sleep(3000);
//		EditPIMethod.music();
  	Thread.sleep(3000);
//       EditPIMethod.sports();
       Thread.sleep(3000);
//	    EditPIMethod.hobbies();
	    Thread.sleep(3000);
	//    EditPIMethod.editPartnerPrefernce();
	    Thread.sleep(3000);
//	   EditPIMethod.locationDetail();
	   Thread.sleep(3000);
	//    EditPIMethod.email_mobileno_PI_edit();
	    logOut.logoutMethod();
	    ///////////////////////////////////////////////////////////////////////
	    

		
	}
	
}
