package com.testscripts;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.Base;
import com.pom.Horoscope;
import com.pom.Inbox;
import com.pom.PhotoView;

public class PhotoViewTest extends Base{
	
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
		   PhotoView p = new PhotoView(driver);
		   Horoscope h = new Horoscope(driver);
		   
		   Thread.sleep(3000);
		   driver.get("https://www.communitymatrimony.com");
		   driver.manage().window().maximize();
		   
		   Base.click(i.getMatriId());
		   Base.typeData(i.getMatriId(), "EZH710533");
		   
		   Base.click(i.getPaswwordclr());
		   Base.typeData(i.getPassword(), "cbstest1");
		   
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
			 acc.moveToElement(p.getMatches()).build().perform();
			 Thread.sleep(3000);
			 
			 acc.moveToElement(p.getLatest_matches()).build().perform();
			 Thread.sleep(2000);
			 
			 Base.click(p.getLatest_matches());
			 Thread.sleep(5000);
			 
			 Base.click(p.getView_radio_btn());
			 Base.click(p.getDnt_show_submit());
			 Thread.sleep(3000);
			 
			 Base.click(p.getProfile_with_photo());
			 Thread.sleep(3000);
			 
			 Base.click(p.getView_profile_click());
	/////////////////////////////////////////////////////////////////
			 String parent = driver.getWindowHandle();
			 int count = parent.length();
			 
			 Set<String> child = driver.getWindowHandles();
			 for (String handle : child) {
				 if (!parent.contains(handle)) {
					Thread.sleep(3000);
					driver.switchTo().window(handle);
					
				}
				
			}
			 Thread.sleep(3000);
			 
		////////////////////////////////////////////////////////////////////////	 
			 String ID = driver.findElement(By.id("oppositeMemberId")).getText();
			 System.out.println("The Profile to view for " +ID);
			 Thread.sleep(2000);
			 
			 
			 Base.click(driver.findElement(By.id("imgdiv1_"+ID+"")));
			 Thread.sleep(3000);
			 
			 List<WebElement> no_of_photos = driver.findElements(By.xpath("//li[@class='lslide']"));
			 int a = no_of_photos.size();
			 System.out.println(a);
		try {	 
			 for (int j = 0; j <= a; j++) {
				 Thread.sleep(5000);
				Base.click(p.getImage_next_btn());
				 Thread.sleep(10000);
			}} catch (Exception e) {
				e.getMessage();
			}
			 System.out.println("Photo VIewed Successfully ");
			 
			 try {
			 for (int k = 0; k <= a; k++) {
				 Thread.sleep(5000);
				 Base.click(p.getImage_prev_btn());
				Thread.sleep(10000);
			}}catch (Exception e) {
				e.getMessage();
			}
			 System.out.println("Photo VIewed Successfully ");
			 //////////////////////////////////
			 
			 driver.close();
			 Thread.sleep(3000);
			 
			 driver.switchTo().window(parent);
			 
			 
			 ///////////////////////////////////
			 try{
			 acc.moveToElement(h.getMenu_mouse_action()).build().perform();
			  acc.moveToElement(h.getLogout()).build().perform();
			  Base.click(h.getLogout());} catch (Exception e) {
				  e.getMessage();
			}
			  
			System.out.println("Logged out successfully");
			 	 
			 			 
	   }
	    
	   
	   @AfterTest
	   public void tearDown() {
	//	driver.quit();
	}

}
