package com.testScript;

import java.awt.Robot;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.base.BaseTest;
import com.pom.EditPI_POM;
import com.pom.GothramPOM;
import com.pom.Search_POM;
import com.utility.EditPIMethod;
import com.utility.SearchMethod;


public class Search extends BaseTest {

	@BeforeSuite
	public void setUp() {
		// test=reports.startTest("Divorcee Negative Payment");
		// test.log(LogStatus.PASS, "Divorcee Negative Payment Test Started");
		System.setProperty("webdriver.chrome.driver", ".//Driver//chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		// ChromeOptions options = new ChromeOptions();
		// options.addArguments("--disable-notifications");
		// options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);

	}

	@Test
	public void regularSearch() throws Throwable {

		GothramPOM g = new GothramPOM(driver);
		EditPI_POM i = new EditPI_POM(driver);
		Actions acc = new Actions(driver);
		Robot r = new Robot();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		EditPIMethod pp = new EditPIMethod();

	/*	driver.get("https://www.96kulimarathamatrimony.com/");
		driver.manage().window().maximize();
		BaseTest.click(g.getMatriID());// AGR102088
		BaseTest.typeData(g.getMatriID(), "NSK100014");
		BaseTest.click(g.getPasswordClear());
		BaseTest.typeData(g.getPassword(), "cbstest");
		BaseTest.click(g.getLogin_btn());
*/
		
		
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

		try {
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@id=\"strategicComm\"]/div/div[2]/a/img")).click();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		Thread.sleep(5000);
		try {
			BaseTest.click(driver.findElement(By.xpath("//*[@id=\"special_offer_lightpic1\"]/div[1]/div/a/img")));
		} catch (Exception e2) {
			// TODO: handle exception
		}
		Thread.sleep(5000);
	try {	
		SearchMethod.regularSearch();
	} catch (Exception e) {
		// TODO: handle exception
	}
	
	try {
	//	SearchMethod.advancedSearch();
	} catch (Exception e) {
		// TODO: handle exception
	}	
	
	try {
		SearchMethod.keyWordSearch();
	} catch (Exception e) {
		// TODO: handle exception
	}
	   
	
			       
	}

}
