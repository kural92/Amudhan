package com.testscripts;

import org.apache.poi.hssf.record.PageBreakRecord.Break;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.Base;
import com.pom.Inbox;
import com.pom.InterestPendingBanner;
import com.pom.Logout;

public class IntrestPendingBannerTest extends Base {
	
	WebDriver driver;
	
	@BeforeMethod
	public void startUP() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\amuthan\\eclipse-workspace\\CBS_1\\Driver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);
		
		
	}
	
	
	@Test
	public void intrestPending() throws Exception {
		
		 Inbox i = new Inbox(driver);
		 InterestPendingBanner p = new InterestPendingBanner(driver);
		 Actions Acc =  new Actions(driver);
		 JavascriptExecutor js  = (JavascriptExecutor)driver;
		 WebDriverWait wait =  new WebDriverWait(driver, 30);
		 
		 Thread.sleep(3000);
		 driver.get("https://www.communitymatrimony.com");
		 driver.manage().window().maximize();
		 
		 Thread.sleep(1000);
		 Base.click(i.getMatriId());
		 Base.typeData(i.getMatriId(), "EZH710533");
		 
		 Base.click(i.getPaswwordclr());
		 Base.typeData(i.getPassword(), "cbstest1");
		 
		 Base.click(i.getLoginbtn());
		 Thread.sleep(2000);
		 
		 /////////////////////////////////   Intermediate Oages 
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
			Thread.sleep(3000);
			try {
				driver.findElement(By.xpath("//*[@id=\"special_offer_lightpic1\"]/div[1]/div/a/img")).click();
			} catch (Exception e) {
				System.out.println("ADs Closed Successfully");
			}

			
			//////////////////////////////////////                                     /////////////////////////////////
			Thread.sleep(3000);
			Base.click(p.getMy_home());
			try {
				driver.findElement(By.xpath("(//a[@class=\"popupclose\"])[2]")).click();
			} catch (Exception e) {
				// TODO: handle exception
			}
		try {
			Thread.sleep(3000);
			if (p.getIntrest_pending_banner().isDisplayed()) {
				
				Thread.sleep(3000);
				/*String a = p.getIntrest_pend_descrption().getText();
				System.out.println(a);
				String Name = p.getIntrest_pend_descrption().getText();
				System.out.println(Name);*/
				
				String name = p.getIntrest_pend_name().getText();
				System.out.println(name);
				
				Thread.sleep(2000);
				Base.click(p.getIntrest_accept_yes_btn());
				System.out.println("Interest Accepted");
				
			} else {
				
				System.out.println("No Intrest Pending Banner");
				

			}
		} catch (Exception e) {
			System.out.println("No Intrest Pending Banner to accept");
		}
			
			
		try {
			Thread.sleep(3000);
		
			if (p.getIntrest_pending_banner().isDisplayed()) {
				
				Thread.sleep(3000);
				/*String a = p.getIntrest_pend_descrption().getText();
				System.out.println(a);
				
				String Name = p.getIntrest_pend_descrption().getText();
				System.out.println(Name); */
				
				String name = p.getIntrest_pend_name().getText();
				System.out.println(name);
				
				Thread.sleep(2000);
				Base.click(p.getIntrest_decline_no_btn());
				System.out.println("Intrest Declined ");
				
			} else {
				
				System.out.println("No Intrest Pending Banner");

			}  
			} catch (Exception e) {
				System.out.println("No Intrest Pending Banner to decline");
			}
			
			/////////////////////////////     Logout    //////////////////
			
			Thread.sleep(3000);
			Logout l = new Logout(driver);
			Acc.moveToElement(l.getLogout_menu()).build().perform();
			Thread.sleep(1000);
		
			Acc.moveToElement(l.getLogout_btn()).build().perform();
			Thread.sleep(3000);
			Base.click(l.getLogout_btn());

	}

}
