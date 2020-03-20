package com.testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.Base;
import com.pom.SortScroll;

public class SortScrollTest extends Base{
	
	WebDriver driver;
	
	
	@BeforeMethod
	public void setUp() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\amuthan\\eclipse-workspace\\CBS_1\\Driver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);
		

	}
	
	
	@Test
	public void sortTest() throws Exception {
		
		SortScroll s = new SortScroll(driver);
		Actions acc= new Actions(driver);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		driver.get("https://www.communitymatrimony.com");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		
		
		Base.click(s.getMatriId());
		Base.typeData(s.getMatriId(), "EZH710533");
		Thread.sleep(2000);
		
	    Base.click(s.getPaswwordclr());
		//Base.clear(s.getPaswwordclr());
		Thread.sleep(2000);
		
	//	Base.click(s.getPassword());
		Base.typeData(s.getPassword(), "cbstest1");
		Thread.sleep(2000);
		
		Base.click(s.getLoginbtn());
		Thread.sleep(4000);
		
		/////////////////////////////////////  Intermediate Pages  ////////////////////
		
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
			 
			 
			 //////////////////////// ////////////////////////////////////////////////////////////////
			 Thread.sleep(5000);
			 acc.moveToElement(s.getMatches()).build().perform();
			 Thread.sleep(2000);
			 ///   Latest matches 
	/*		 acc.moveToElement(s.getLatest_matches()).build().perform();
			 Base.click(s.getLatest_matches());
			 Thread.sleep(3000);  */
			  
			 ///  Member who might Like you  
	/*		 acc.moveToElement(s.getMember_who_might_like_you()).build().perform();
			 Base.click(s.getMember_who_might_like_you());
			 Thread.sleep(3000);  */
			 
			 
			 //  Premium Matches 
		/*	 acc.moveToElement(s.getPremium_members()).build().perform();
			 Base.click(s.getPremium_members());
			 Thread.sleep(3000);  */
			 
			 // Mutual Members  
		/*	  acc.moveToElement(s.getMutual_matches()).build().perform();
			 Base.click(s.getMutual_matches());
			 Thread.sleep(3000);  */
			 
			 //  Yet to be viewed
			 acc.moveToElement(s.getYet_to_viewed()).build().perform();
			 Base.click(s.getYet_to_viewed());
			 Thread.sleep(3000);   
			 
			 
			 
		/*       Relevance profile will display by default  -  No need to select the radio button */
			 
			 
			 ///////////////////////////////// Sort Scroll Using for Latest matches ////////////////////////////////
			 
			         ////  Recntly Active
		/*	 Base.click(s.getSort_recent_active_button());
			 Thread.sleep(3000);
			 Base.click(s.getRecent_profile_with_Photo());
			 Thread.sleep(3000);  */
			 
			 
			            ////// Newest Profile
	/*	 Base.click(s.getSort_new_profile());
			 Thread.sleep(3000);
			 Base.click(s.getNew_profile_with_photo());
			 Thread.sleep(3000); */
			 
			            /////////   Oldest Profile
		/*	 Base.click(s.getSort_old_profile());
			 Thread.sleep(3000);
		/////////////   To see Profile Without Photo      ////////////////
		 Base.click(s.getOld_profile_with_photo());
			 Thread.sleep(3000);  */
			 
			 
			 String a = s.getTotal_profile_count().getText();
			 Integer profile_count =Integer.parseInt(a);
			  int page_cou = (profile_count/10);
			  System.out.println(page_cou);
			  
			  for (int i = 0; i <=page_cou; i++) {
				  
				  for (int j = 0; j <=12; j++) {
					  Thread.sleep(3000);
						js.executeScript("window.scrollBy(0,350)"); 
						System.out.println("The Scroll Completed are : "+j);
				}
				  
			//	  js.executeScript("arguments[0].scrollIntoView();", s.getPage_count());
			//	  js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
				  Thread.sleep(5000);
		try {		  
				  Base.click(s.getNext_btn());
				  Thread.sleep(2000);
		} catch (Exception e) {
			System.out.println("No Next Button");
		}  
				
			}
		
		////////////////////////////////////////  
		
		
		
		
		
		
		

	}
	
}