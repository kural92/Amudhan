package com.testscripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.Base;
import com.pom.Inbox;

public class InboxTest2 extends Base{
	
	WebDriver driver;

	
   @BeforeMethod
   public void setUp() {
	System.setProperty("webdriver.chrome.driver", ".//Driver//chromedriver.exe");
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--disable-notifications");
	driver = new ChromeDriver(options);
	

}
   
   @Test
   public void testCase() throws InterruptedException {
	
	   Inbox i = new Inbox(driver);
	   
	   driver.navigate().to("https://www.communitymatrimony.com");
	   driver.manage().window().maximize();
	   
	   Base.click(i.getMatriId());
	   Base.typeData(i.getMatriId(), "AGR102088");
	   
	   Base.click(i.getPaswwordclr());
	   Base.typeData(i.getPassword(), "cbstest");
	   
	   Base.click(i.getLoginbtn());
	   
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
		 
		 
		 Thread.sleep(3000); 
		 Base.click(i.getInboxbtn());
		 
		 
		 //////////////////////////////////////////////////
		 Thread.sleep(2000);
	//	 WebDriverWait wait = new WebDriverWait(driver, 30);
	//	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("(//a[contains(text(),'Sent')])[3]")))).click();
		 JavascriptExecutor js = (JavascriptExecutor)driver;
		 js.executeScript("arguments[0].click();", driver.findElement(By.id("senttab")));
		 Thread.sleep(2000);
		 js.executeScript("arguments[0].click();", driver.findElement(By.id("RMPENDINGINT1")));
		 
		 try {Thread.sleep(2000);
			 if (driver.findElement(By.xpath("//div[@class='fleft ']")).isDisplayed()) {
				 List<WebElement> profile_id = driver.findElements(By.xpath("//div[@class='pad8']"));
				 for (int j = 0; j < profile_id.size(); j++) {
					 String sent_request_details = profile_id.get(j).getText();
					 System.out.println(sent_request_details);
					 
					
				}
				
			} else {
				System.out.println("No ID present ****");

			}
			 
			 Thread.sleep(2000);
			 if (driver.findElement(By.id("reminder0")).isDisplayed()) {
				 js.executeScript("arguments[0].click();",  driver.findElement(By.id("reminder0")));
			
				 String a = driver.findElement(By.id("delete_msg_val")).getText();
				 System.out.println(a);
				 Thread.sleep(2000);
				 js.executeScript("arguments[0].click();",  driver.findElement(By.xpath("(//a[@class='popupclose popup-close-off'])[6]")));
				
			} else {
                  System.out.println("No Send Reminder Button * * * *");
			}
			
		} catch (Exception e) {
			System.out.println("No ID present *");
		}

		 
		 ///////////////////////////////////////////////////////////
}
   
   
   @AfterTest
   public void tearDown() {
       driver.quit();
}
}
