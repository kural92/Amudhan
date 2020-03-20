package com.testscripts;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.Base;
import com.pom.Horoscope;
import com.pom.Inbox;

public class HoroScopeUpload extends Base {
	
	
	WebDriver driver;
	
	   @BeforeMethod
	   public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\amuthan\\eclipse-workspace\\CBS_1\\Driver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);
				

	}
	   
	   @Test
	   public void testCase() throws InterruptedException {
		
		   Inbox i = new Inbox(driver);
		   Horoscope h = new Horoscope(driver);
		   
		   Thread.sleep(3000);
		   driver.get("https://www.communitymatrimony.com");
		   driver.manage().window().maximize();
		   
		   Base.click(i.getMatriId());
		   Base.typeData(i.getMatriId(), "AGR7");
		   
		   Base.click(i.getPaswwordclr());
		   Base.typeData(i.getPassword(), "cbstest");
		   
		   Base.click(i.getLoginbtn());
		   System.out.println("logged in Successfully");
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
			//////////////////////  New ly Added  ///////////////////////////////
			try {
				WebElement skip_to_matriony = driver.findElement(By.xpath("/html/body/header/div/div/div/a"));
				if (skip_to_matriony.isDisplayed()) {
					skip_to_matriony.click();
				}
			} catch (Exception e) {
				System.out.println("Intermediate pages handled");
			}
			
			
			try {
				WebElement skip_to_matrimony1 = driver.findElement(By.xpath("/html/body/div[3]/a"));
				if (skip_to_matrimony1.isDisplayed()) {
					skip_to_matrimony1.click();
				}
			} catch (Exception e) {
				System.out.println("Intermediate pages handled");
			}
			
			
			////////////////////////////////////////////////////////////////////////////////////
			
			try {
				WebElement divorcee_intermediate_skip = driver.findElement(By.xpath("/html/body/div[1]/div/div[4]/a"));
				if (divorcee_intermediate_skip.isDisplayed()) {
					divorcee_intermediate_skip.click();
					
				}
			} catch (Exception e) {
				System.out.println("Intermediate pages handled");
			}
			
			
			try {
				
				WebElement horoscope = driver.findElement(By.xpath("//*[@id=\"conform\"]/div/div/div/a[1]"));
				if (horoscope.isDisplayed()) {
					horoscope.click();
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
			 
			 
			 
			 ///////////////////   MOuse Action to click on Edit Profile  //////////////
			 
			 Actions acc = new Actions(driver);
			 acc.moveToElement(h.getMenu_mouse_action()).perform();
			 Thread.sleep(1000);
			 acc.moveToElement(h.getMenu_mouse_action()).perform();
			 acc.moveToElement(h.getEditProfile()).build().perform();
			// acc.doubleClick(h.getEditProfile());
			 Base.click(h.getEditProfile());
			 Thread.sleep(3000);
			 
			 ///////////////////// Horoscope Add //////
			 
			 Base.click(h.getAddHoroScope_btn());
			 Thread.sleep(3000);
			  System.out.println("Upload Horoscope Started");
			  
			  
			  Thread.sleep(2000);
			  Base.typeData(h.getUpload_horoscope(), "C:\\Users\\amuthan\\Downloads\\horoscope-EZH710533.jpeg");		  
			  
			  
			  Thread.sleep(3000);
			  Base.click(h.getHoroscope_upload_btn());
			  System.out.println("Horoscope Uploaded Successfully");
			  
			  Thread.sleep(5000);
			  Base.click(h.getView_uploaded_horoscope());
			  
			  
			  ///////////    Window Handle  ////////////////////
			  
			  Thread.sleep(3000);
			  String Parent = driver.getWindowHandle();
			  
			  Set<String> child = driver.getWindowHandles();
			  
			  for (String winhandle : child) {
				  if (!Parent.contains(winhandle)) {
					  driver.switchTo().window(winhandle);
					  driver.close();
					  driver.switchTo().window(Parent);
					
				}
				  
				
				
			}
			  
			  
	 
			   ///////////  Logout  /////////////////
			  Thread.sleep(5000);
			  acc.moveToElement(h.getMenu_mouse_action()).build().perform();
			  acc.moveToElement(h.getLogout()).build().perform();
			  Base.click(h.getLogout());
			  
			System.out.println("Logged out successfully");
			  

}
}
