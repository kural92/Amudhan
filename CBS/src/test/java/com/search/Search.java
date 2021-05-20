package com.search;

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

import com.pages.EditPIMethod;
import com.pages.SearchMethod;

import base.BaseTest;
import pom.cmlogin.EditPI_POM;
import pom.cmlogin.GothramPOM;
import pom.cmlogin.Search_POM;

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
		com.pages.EditPIMethod pp = new EditPIMethod();

		driver.get("https://www.communitymatrimony.com");
		driver.manage().window().maximize();
		BaseTest.click(g.getMatriID());// AGR102088
		BaseTest.typeData(g.getMatriID(), "AGR755848");
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
		//driver.findElement(By.xpath("(//a[contains(text(),'Search')])[1]")).click();
		
		Thread.sleep(10000); //BaseTest.click(s.getSearch_Menu_btn());
		  
		
	///	 driver.findElement((By.xpath("//*[@id=\"topnav-login-menu\"]/div[2]/div[4]/a")).click();
		Search_POM s = new Search_POM(driver);//
        
       // driver.findElement((By.xpath("//*[@id=\"topnav-login-menu\"]/div[2]/div[4]/a")).click();
        //	try { SearchMethod.regularSearch(); } catch (Exception e) {	}
		try { SearchMethod.advancedSearch(); } catch (Exception e) {	}
	//	try { SearchMethod.keyWordSearch(); } catch (Exception e) {	}
	//	try { SearchMethod.searchById(); } catch (Exception e) {	}
		/////////////////////////////////////////////

		Thread.sleep(5000);
		String Total = driver.findElement(By.id("total_div")).getText();
		int a = Integer.parseInt(Total);
		
		int b = ((a/10));
		
		int c = (int) Math.ceil(b);
		
		
		for (int j = 1; j <=c; j++) {
			Thread.sleep(5000);
			String parent = driver.getWindowHandle();
			for (int j2 = 0; j2 <=9; j2++) {
				Thread.sleep(5000);
				driver.findElement(By.id("ignorecrossbefore_"+j2+"")).click();
				
				Thread.sleep(2000);
				Set<String> child = driver.getWindowHandles();
				
				for (String handle : child) {
					if (!parent.contains(handle)) {
						Thread.sleep(2000);
						driver.switchTo().window(handle);
					}
				}
				
				//
				Thread.sleep(5000);
				
				String habit = driver.findElement(By.xpath("(//span[contains(text(),'Eating Habits')]//following::span[2])[1]")).getText();
				//System.out.println("Eating Habits are : "+ habit);
				
				Thread.sleep(2000);
				if (habit.contains("Vegetarian")) {
					System.out.println("Eating Habit was "+ habit);
				} else {
					System.err.println("Eating Habit was "+habit);
				}
				
				Thread.sleep(2000);
				driver.close();
				
				Thread.sleep(2000);
				driver.switchTo().window(parent);
				
				
			}
		
			Thread.sleep(3000);
			driver.findElement(By.xpath("//span[contains(text(),'Next ')]")).click();
			
			Thread.sleep(5000);
			
		}
		
		
		
		
	   
			       
	}

}
