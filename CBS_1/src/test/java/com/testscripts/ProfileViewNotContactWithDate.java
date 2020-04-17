package com.testscripts;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.base.Base;
import com.pom.Inbox;

public class ProfileViewNotContactWithDate {

	
	WebDriver driver;
	
	@BeforeTest
	public void startUp() {
		
		System.setProperty("webdriver.chrome.driver", ".//Driver//chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
        driver = new ChromeDriver(options);
	}

	
	@Test (enabled=true)
	public void profileViewNotContactedTest() throws Exception {
		
		Actions acc = new Actions(driver);
		JavascriptExecutor js =  (JavascriptExecutor)driver;
		WebDriverWait wait = new WebDriverWait(driver, 60);
		com.pom.ProfileViewNotContacted p = new com.pom.ProfileViewNotContacted(driver);
	    Inbox i = new Inbox(driver);
		
		driver.get("https://www.communitymatrimony.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		Base.clear(i.getMatriId());
		Base.typeData(i.getMatriId(), "AGR102088");
		Thread.sleep(3000);
		
		Base.click(i.getPaswwordclr());
		Base.typeData(i.getPassword(), "cbstest");
		Thread.sleep(3000);
		
		Base.click(i.getLoginbtn());
		Thread.sleep(3000);
		
		
		////////////////////////         Intermediate  Pages    //////////////////////////////////
		
		try {
			WebElement photo_add = driver.findElement(By.xpath("/html/body/div[2]/a"));
			if (photo_add.isDisplayed()) {
				photo_add.click();
				driver.findElement(By.xpath("//*[@id=\"conform\"]/div/div/div/a[1]")).click();
				driver.findElement(By.xpath("//*[@id=\"reason3\"]")).click();
				driver.findElement(By.xpath("//*[@id=\"skipphotoclick\"]")).click();

			}

		} catch (Exception e) {
			System.out.println("Photo Page Skipped");
		}

		try {
			WebElement skip_matches = driver.findElement(By.xpath("//a[contains(text(),'Skip to Daily Matches >>')]"));
			if (skip_matches.isDisplayed()) {
				skip_matches.click();

			}
		} catch (Exception e) {
			System.out.println("Intermediate pages handled");
		}

		try {
			WebElement element = driver.findElement(By.xpath("/html/body/div[1]/div[2]/a"));
			if (element.isDisplayed()) {
				element.click();

			}
		} catch (Exception e) {
			System.out.println("Intermediate pages handled");
		}

		try {
			WebElement divorcee_intermediate_skip = driver.findElement(By.xpath("/html/body/div[1]/div/div[4]/a"));
			if (divorcee_intermediate_skip.isDisplayed()) {
				divorcee_intermediate_skip.click();

			}
		} catch (Exception e) {
			System.out.println("Intermediate pages handled");
		}

		try {
			driver.findElement(By.xpath("//*[@id=\"conform\"]/div/div/div/a[1]")).click();
		} catch (Exception e) {
			System.out.println("No Intermediate pages");
		}
		// AD Pages

		try {
			driver.findElement(By.xpath("//*[@id=\"special_offer_lightpic1\"]/div[1]/div/a/img")).click();
		} catch (Exception e) {
			System.out.println("ADs Closed Successfully");
		}
		
		
		/////////////////////////////////////////                       ////////////////////////////////////////////////
                    ///   Profile View not contacted with Created Date    ////////
		
			
		    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////

		    
			acc.moveToElement(p.getMy_home()).build().perform();
			Thread.sleep(1000);
			
			acc.moveToElement(p.getProfile_viewed_not_contacted()).build().perform();
			Base.click(p.getProfile_viewed_not_contacted());
			Thread.sleep(5000);   
		  
		    Thread.sleep(5000);
			Base.click(p.getProfile_created_within_a_month());
			Thread.sleep(5000);
			
			////////////////////////////////////    Direct Scroll   /////////////////////////////
			
			
			String a = p.getProfile_count().getText();
			Integer b = Integer.parseInt(a);
			System.out.println(b);
			int count = (b/10);
			System.out.println(count);
			Thread.sleep(2000);
			
			////////////////////////////////////////   Scroll Test
			
			if (count>=10) {
				Thread.sleep(1000);
				for (int j = 0; j <=3; j++) {
					Thread.sleep(1000);
					
					for (int k = 0; k <=12; k++) {
						Thread.sleep(1000);
						js.executeScript("window.scrollBy(0,350)");
						
					}
					
					try {
						Base.click(p.getNext());
					} catch (Exception e) {
						e.getMessage();
					}
					
				}
				
			} else {
	                   System.out.println("The displayed profile is less than 10");
			}
			Thread.sleep(5000);
			/////////////////////////////////   View Profile  
			Base.click(p.getViewProfile_click());
			Thread.sleep(1000);
			
			String parent = driver.getWindowHandle();
			System.out.println("Parent Window Id : " +parent);
			
			Set<String> child = driver.getWindowHandles();
			for (String handle : child) {
				Thread.sleep(1000);
				if (parent.equals(child)) {
					Thread.sleep(5000);
					driver.switchTo().window(handle);				
					driver.close();
					
				}
				driver.switchTo().window(parent);
			}
			
	////////////////////////////////////////////Logout    
try {		
	acc.moveToElement(p.getLogout_menu()).build().perform();
	Thread.sleep(1000);
	} catch (Exception e) {
		acc.moveToElement(p.getLogout_menu1()).build().perform();
		Thread.sleep(1000);
	}
	acc.moveToElement(p.getLogout()).build().perform();
	Base.click(p.getLogout());
	System.out.println("Logged out successfully");  
			
			
		}  
		

		
		@AfterTest
		public void tearDown() {
		
		//	driver.quit();

		}
	}