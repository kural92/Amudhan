package com.search;


import java.awt.Robot;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.pages.EditPIMethod;
import com.pages.RefineSearchMethod;

import base.BaseTest;
import pom.cmlogin.EditPI_POM;
import pom.cmlogin.GothramPOM;
import pom.cmlogin.RefineSearch_POM;
import pom.cmlogin.ViewProfile_POM;

public class RefineSearchValidation extends BaseTest {

	//public static int VP_Age;
	
	private static int VP_Age = 0;

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
		ViewProfile_POM  v = new ViewProfile_POM(driver);
		Actions acc = new Actions(driver);
		Robot r = new Robot();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		RefineSearch_POM rs = new RefineSearch_POM();
		com.pages.EditPIMethod pp = new EditPIMethod();

		driver.get("https://www.communitymatrimony.com");
		driver.manage().window().maximize();
		BaseTest.click(g.getMatriID());
		BaseTest.typeData(g.getMatriID(), "EZH710533");
		BaseTest.click(g.getPasswordClear());
		BaseTest.typeData(g.getPassword(), "cbstest");
		BaseTest.click(g.getLogin_btn());

		String Parent = driver.getWindowHandle();
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
	
		String Refine_AgeFrom = BaseTest.getExcelData("RefineSearch", 1, 2);
		int Age_From = Integer.parseInt(Refine_AgeFrom);
		String Refine_AgeTo = BaseTest.getExcelData("RefineSearch", 1, 3);
		int Age_To = Integer.parseInt(Refine_AgeTo);
		
		Thread.sleep(3000);
		
	List<WebElement> Refine_Profile = driver.findElements(By.xpath("//a[contains(text(),'EZH')]"));
	
	int profile_size = Refine_Profile.size();
	
	Thread.sleep(2000);
	for (int j = 0; j < 10; j++) {
		
		String matriid = Refine_Profile.get(j).getText();
		System.out.println("MatriID : "+ matriid);
		
		Thread.sleep(2000);
		try {
			BaseTest.click(driver.findElement(By.xpath("//*[@id=\"assitedform\"]/div/div/div[1]/a")));
		} catch (Exception e) {
			
		}
		//
		BaseTest.click(Refine_Profile.get(j));
		
		Thread.sleep(2000);
		try {
			BaseTest.click(driver.findElement(By.xpath("//*[@id=\"assitedform\"]/div/div/div[1]/a")));
		} catch (Exception e) {
			
		}
////////////////////////////////////////////////////////		
try {		
		Thread.sleep(3000);
		Set<String> child = driver.getWindowHandles();
		
		for (String handle : child) {
			
			if (!Parent.contains(handle)) {
			Thread.sleep(2000);
			driver.switchTo().window(handle);
			}
		}
		
}
catch (Exception e) {
	// TODO: handle exception
}
/////////////////////////////////////////////
			String Refine_Result_Age = v.getVP_Age().getText();
			System.out.println("Age : "+ Refine_Result_Age);
			
			Thread.sleep(2000);
			if (Refine_Result_Age.contains("yrs")) {
				String[] Age_spl = Refine_Result_Age.split("yrs");
				String Age_spli = Age_spl[0].toString().trim();
				  VP_Age = Integer.parseInt(Age_spli);
				System.out.println("Result Age : "+ VP_Age);				
			}
	////////////////			
		Thread.sleep(2000);
		if (Age_From==VP_Age ||  Age_To>VP_Age) {
			System.out.println(VP_Age +" Matches with the refine search result Age between : " +Age_From+" and "+ Age_To );
		}else {
			System.err.println(VP_Age +" not Matches with the refine search result Age between : " +Age_From+" and "+ Age_To );
		}
	//////////////////////////////
		try {
			Set<String> child = driver.getWindowHandles();
			for (String handle : child) {
				if (!Parent.contains(handle)) {
					Thread.sleep(2000);
					driver.close();
					Thread.sleep(2000);
					driver.switchTo().window(Parent);
					Thread.sleep(5000);
				}
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	///////////////////////////////////////////
		
		
	}
	
	
	}
	
}
