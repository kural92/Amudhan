package com.testscripts;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.Base;
import com.pom.Horoscope;
import com.pom.Inbox;

public class AddHoroscopeTest extends Base{
	
	WebDriver driver;
	
	   @BeforeMethod
	   public void setUp() {
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
		   Base.typeData(i.getMatriId(), "EZH811386");
		   
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
			 try {
			 acc.moveToElement(h.getMenu_mouse_action()).click().perform();
			 }catch (Exception e) {
				 acc.moveToElement(h.getMenu_mouse_action1()).click().perform();
			}
			 Thread.sleep(1000);
			// acc.moveToElement(h.getMenu_mouse_action()).perform();
			 acc.moveToElement(h.getEditProfile()).build().perform();
			// acc.doubleClick(h.getEditProfile());
			 Base.click(h.getEditProfile());
			 Thread.sleep(3000);
			 
			 ///////////////////// Horoscope Add //////
			 
			 Base.click(h.getAddHoroScope_btn());
			 Thread.sleep(3000);
			  System.out.println("Edit Horoscope Started");
			  
			 Base.select_index(h.getHour_of_birth(), 5);
			 Thread.sleep(1000);
			 
			 Base.select_index(h.getMins_of_birth(), 30);
			 Thread.sleep(1000);
			 
			 Base.select_index(h.getTime_format(), 2);
			 Thread.sleep(1000);
			 
		     Base.select_text(h.getCountry_of_birth(), "India");
			 Thread.sleep(1000);
			 
			 Base.select_text(h.getState_of_birth(), "Kerala");
			 Thread.sleep(2000);
			 
			 Base.select_index(h.getCity_of_birth(), 2);
			 Thread.sleep(1000);
			 
			 Base.select_index(h.getChart_style(), 0);
             Thread.sleep(2000);
             
             Base.select_index(h.getLanguage(), 5);
             Thread.sleep(2000);
             
             Base.click(h.getHoroscope_generate_btn());
			 Thread.sleep(5000);
			 System.out.println("Generate Horoscope Completed");
			 ////////  Window Handle   ///
			 
			 String Parent = driver.getWindowHandle();
			 System.out.println("Parent Window ID is  " + Parent);
				Thread.sleep(3000);
			 
				 Set<String> winHandles = driver.getWindowHandles();
					int count = winHandles.size();
					System.out.println("Window Count is : " + count);
					for (String winHandle : winHandles) {
						if (Parent.contains(winHandle)) {
							Thread.sleep(3000);
							driver.switchTo().window(winHandle);
						}

						System.out.println("window Handle Id :" + winHandle);

					}
					System.out.println("Handled");
					
					Thread.sleep(3000);
					acc.moveToElement(h.getMenu_mouse_action()).build().perform();
					acc.moveToElement(h.getLogout()).click();
					System.out.println("Logged out successfully");
			 

}
	   
	   
   @AfterMethod
   public void tearDown() {
	//driver.quit();

}
	   
	   
}

