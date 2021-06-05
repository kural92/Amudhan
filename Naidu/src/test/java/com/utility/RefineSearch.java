package com.utility;

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
import com.pom.RefineSearch_POM;
import com.utility.EditPIMethod;
import com.utility.RefineSearchMethod;





public class RefineSearch extends BaseTest{
	
	
	@BeforeSuite
	public void setUp() {
		// test=reports.startTest("Divorcee Negative Payment");
		// test.log(LogStatus.PASS, "Divorcee Negative Payment Test Started");
		System.setProperty("webdriver.chrome.driver", ".//Driver//chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		// ChromeOptions options = new ChromeOptions();
		 options.addArguments("--disable-notifications");
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
		RefineSearch_POM rs = new RefineSearch_POM();
		EditPIMethod pp = new EditPIMethod();

		driver.get("https://www.communitymatrimony.com");
		driver.manage().window().maximize();
		BaseTest.click(g.getMatriID());
		BaseTest.typeData(g.getMatriID(), "AGR602604");
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
		
		
		
		
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
		RefineSearchMethod.refineAge();
	//	RefineSearchMethod.refineHeight();
	//	RefineSearchMethod.refineMaritalStatus();
	//	RefineSearchMethod.refineMotherTongue();
		RefineSearchMethod.refineSubCaste();
		RefineSearchMethod.refineEducation();
		RefineSearchMethod.refineFamilyType();
		RefineSearchMethod.refineFamilyStatus();
		RefineSearchMethod.refineAnnualIncome();
		RefineSearchMethod.refineOccupation();
		RefineSearchMethod.refineCountry();
		RefineSearchMethod.refineResidentStatus();
		RefineSearchMethod.refineCitizenShip();
		RefineSearchMethod.refinePhysicalStatus();
		RefineSearchMethod.refineComplexion();
		RefineSearchMethod.refineBodyType();
		RefineSearchMethod.refineEating();
		RefineSearchMethod.refineSmoking();
		RefineSearchMethod.refineDrinking();
		
		
////////////////////////////////////////////////////////////////////////////////////////////

	
		
	}
}
