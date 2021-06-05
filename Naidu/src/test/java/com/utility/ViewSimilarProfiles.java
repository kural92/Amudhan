package com.utility;

import java.awt.List;
import java.awt.Robot;
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

import com.base.BaseTest;
import com.pom.EditPI_POM;
import com.pom.GothramPOM;


public class ViewSimilarProfiles extends BaseTest {
	
	
	

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
		
		driver.get("https://www.communitymatrimony.com");
		driver.manage().window().maximize();
		BaseTest.click(g.getMatriID());
		BaseTest.typeData(g.getMatriID(), "EZH710533");
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
		
		String Parent =  driver.getWindowHandle();
		
		///
		Thread.sleep(3000);
		BaseTest.click(driver.findElement(By.xpath("//a[contains(text(),'Matches ')]")));
		
		Thread.sleep(3000);
		BaseTest.click(driver.findElement(By.id("ignorecrossbefore_0")));
//////////////		
		Thread.sleep(3000);
		try {
			Set<String> child =  driver.getWindowHandles();
			
			for (String handle : child) {
				
				if (!Parent.contains(handle)) {
					Thread.sleep(2000);
					driver.switchTo().window(handle);
										
				}
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		/////////////////////
		
		
		
		
		Thread.sleep(2000);
		if (driver.findElement(By.xpath("//span[contains(text(),'Similar Profiles')]")).isDisplayed()) {
			
			Thread.sleep(2000);
			String Similar_Coun = driver.findElement(By.xpath("//span[@ng-bind='SmilarPfcount']")).getText();
			int Similar_Count = Integer.parseInt(Similar_Coun);
			System.out.println("Similar Profile Count : "+Similar_Count);
			
			
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[contains(text(),'Similar Profiles')]")).click();
			
			
			//////////////////////
			try {
				Set<String> child = driver.getWindowHandles();
				
				for (String handle : child) {
					
					if (!Parent.contains(handle)) {
						Thread.sleep(2000);
						driver.switchTo().window(handle);
											
					}
				}
				
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			
			//////////////////////
			
			Thread.sleep(5000);
			String Similar_Profile = driver.findElement(By.id("total_div")).getText();
			int Similar_Profile_Count = Integer.parseInt(Similar_Profile);
			
			Thread.sleep(2000);
			if (Similar_Count==Similar_Profile_Count) {
				System.out.println("Similar Profile Count "+Similar_Profile_Count+ " matches with "+Similar_Count);
			} else {
				System.out.println("Similar Profile Count "+Similar_Profile_Count+ " not matches with "+Similar_Count);
			}
			
			
			//////////////////////////////////
			
			int count = (Similar_Profile_Count/10);
			int Counts = (int) Math.ceil(count);
			System.out.println(Counts);
			
			Thread.sleep(3000);
			java.util.List<WebElement> mail_Icon = driver.findElements(By.xpath("//span[@class='msgIcon-on']"));
			int Mail_Icon_Size = mail_Icon.size();
			System.out.println(Mail_Icon_Size);
			
			
			
			
			Thread.sleep(2000);
			
			for (int j = 0; j <Mail_Icon_Size; j++) {
				
				Thread.sleep(2000);
				acc.moveToElement(mail_Icon.get(j)).build().perform();
				Thread.sleep(2000);
				mail_Icon.get(j).click();
				
				Thread.sleep(2000);
				String Parent1 = driver.getWindowHandle();	
//////////////////////
		try {
			
			
			Thread.sleep(2000);
			Set<String> child = driver.getWindowHandles();
			
			for (String handle : child) {
				
				if (!Parent1.contains(handle)) {
					Thread.sleep(2000);
					driver.switchTo().window(handle);
										
				}
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		//////////////////////
		
		Thread.sleep(2000);
		if (driver.findElement(By.xpath("//div[contains(text(),'Upgrade Online')]")).getText().contains("Upgrade Online")) {
			System.out.println("Please Upgarde to Send Mail");
			driver.close();
			driver.switchTo().window(Parent1);
		}else { }
		
		Thread.sleep(3000);
		
		
		
				
				
				
				
				
				
				
				
				
				
				
			}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}
	}
	
	
	
	

}
