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

import com.pages.EditPIMethod;import SprintTask.payMentPrice;
import base.BaseTest;
import pom.cmlogin.EditPI_POM;
import pom.cmlogin.GothramPOM;
import pom.cmlogin.RefineSearch_POM;

public class RefineSearch extends BaseTest{
	
	
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
		RefineSearch_POM rs = new RefineSearch_POM();
		com.pages.EditPIMethod pp = new EditPIMethod();

		driver.get("https://www.communitymatrimony.com");
		driver.manage().window().maximize();
		BaseTest.click(g.getMatriID());
		BaseTest.typeData(g.getMatriID(), "EZH710533");
		BaseTest.click(g.getPasswordClear());
		BaseTest.typeData(g.getPassword(), "cbstest1");
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
		
		
		Thread.sleep(3000);
		BaseTest.click(rs.getMatches_btn());
		String Parent = driver.getWindowHandle();
		
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,100)");
		
		Thread.sleep(5000);
		BaseTest.click(driver.findElement(By.xpath("//*[@id=\"facetAgelabel\"]")));
		BaseTest.click(driver.findElement(By.xpath("//*[@id=\"facetAgelabel\"]")));
		
		Thread.sleep(5000);
		BaseTest.click(rs.getRefine_Age_More_Btn());
		
		Thread.sleep(2000);
		BaseTest.clear(rs.getRefine_AgeFrom());
		BaseTest.typeData(rs.getRefine_AgeFrom(), BaseTest.getExcelData("RefineSearch", 1, 2));
		BaseTest.clear(rs.getRefine_AgeTo());
		BaseTest.typeData(rs.getRefine_AgeTo(), BaseTest.getExcelData("RefineSearch", 1, 3));
		
		Thread.sleep(2000);
		BaseTest.click(rs.getRefine_Submit());
		Thread.sleep(2000);
		
		
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,100)");
		
			
		
		Thread.sleep(5000);
		BaseTest.click(driver.findElement(By.xpath("//*[@id=\"facetHeightlabel\"]")));
		
		try {
			Set<String> child = driver.getWindowHandles();
			Thread.sleep(2000);
			for (String handle : child) {
				if(!Parent.contains(handle)) {
					Thread.sleep(1000);
					driver.switchTo().window(handle);
					Thread.sleep(2000);
					driver.close();
					driver.switchTo().window(Parent);
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		BaseTest.click(driver.findElement(By.xpath("//*[@id=\"facetHeightlabel\"]")));
		
		Thread.sleep(5000);
		BaseTest.click(rs.getRefine_Height_More_Btn());
		
		Thread.sleep(5000);
		BaseTest.select_text(rs.getRefine_HeightFrom_DD(), BaseTest.getExcelData("RefineSearch", 1, 4));
		Thread.sleep(5000);
		BaseTest.select_text(rs.getRefine_HeightTo_DD(), BaseTest.getExcelData("RefineSearch", 1, 5));
		
		Thread.sleep(2000);
		BaseTest.click(rs.getRefine_Submit());
		Thread.sleep(2000);
////////////////////////////////////////////////////////////////////////////////////////////
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,200)");
		
		
	
		
		
		Thread.sleep(5000);
		BaseTest.click(driver.findElement(By.xpath("//*[@id=\"facetMaritalStatuslabel\"]")));
		
		try {
			Set<String> child = driver.getWindowHandles();
			Thread.sleep(2000);
			for (String handle : child) {
				if(!Parent.contains(handle)) {
					Thread.sleep(1000);
					driver.switchTo().window(handle);
					Thread.sleep(2000);
					driver.close();
					driver.switchTo().window(Parent);
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		try {
		BaseTest.click(driver.findElement(By.xpath("//*[@id=\"facetMaritalStatuslabel\"]")));
		}catch (Exception e) {
			// TODO: handle exception
		}
		Thread.sleep(5000);
		BaseTest.click(rs.getRefine_MaritalStatus_More_Btn());
		
		Thread.sleep(5000);
		String Marital_Status = BaseTest.getExcelData("RefineSearch", 1, 6);
		
		if(Marital_Status.contains("Unmarried")) {
		if (!rs.getRefine_marital_Unmarried().isSelected()) {
			BaseTest.click(rs.getRefine_marital_Unmarried());
		} else {
             System.out.println("Unmarried was Already Selected");
		} }
	/////////////////////////		
		if(Marital_Status.contains("Separated")) {
			if (!rs.getRefine_marital_Seperated().isSelected()) {
				BaseTest.click(rs.getRefine_marital_Unmarried());
			} else {
	             System.out.println("Separated was Already Selected");
			}	}
		
///////////////////////		
		if(Marital_Status.contains("Widow")) {
			if (!rs.getRefine_marital_Widow().isSelected()) {
				BaseTest.click(rs.getRefine_marital_Widow());
			} else {
	             System.out.println("Widow was Already Selected");
			}	}
/////////////////////////
		
		if(Marital_Status.contains("Divorced")) {
			if (!rs.getRefine_marital_Divorced().isSelected()) {
				BaseTest.click(rs.getRefine_marital_Divorced());
			} else {
	             System.out.println("Divorced was Already Selected");
			}	}
///////////////////////////

		if(Marital_Status.contains("Divorced")) {
			if (!rs.getRefine_marital_Divorced().isSelected()) {
				BaseTest.click(rs.getRefine_marital_Divorced());
			} else {
	             System.out.println("Divorced was Already Selected");
			}	}
///////////////////////////////		
		
		Thread.sleep(2000);
		BaseTest.click(rs.getRefine_Submit());
		Thread.sleep(2000);
		
///////////////////////////////////////////////////////////////////////
		
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,100)");
		
		
		Thread.sleep(2000);
		BaseTest.click(rs.getRefine_Show_More_Btn());
			
		
		Thread.sleep(5000);
		BaseTest.click(driver.findElement(By.xpath("//*[@id=\"facetMotherTonguelabel\"]")));
		
		try {
			Set<String> child = driver.getWindowHandles();
			Thread.sleep(2000);
			for (String handle : child) {
				if(!Parent.contains(handle)) {
					Thread.sleep(1000);
					driver.switchTo().window(handle);
					Thread.sleep(2000);
					driver.close();
					driver.switchTo().window(Parent);
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		BaseTest.click(driver.findElement(By.xpath("//*[@id=\"facetMotherTonguelabel\"]")));
		
		Thread.sleep(5000);
		BaseTest.click(rs.getRefine_MotherTongue_More());
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	

}
