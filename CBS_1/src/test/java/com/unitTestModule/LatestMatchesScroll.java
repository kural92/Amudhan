package com.unitTestModule;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.base.Base;
import com.pom.Inbox;
import com.pom.SortScroll;

public class LatestMatchesScroll extends Base{
	

	 WebDriver driver;
	 
	   @BeforeTest
	   public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\amuthan\\eclipse-workspace\\CBS_1\\Driver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);
			}
	   
	   @BeforeMethod
	   public void login() {
		   
			   Inbox i = new Inbox(driver);
			   
			   WebDriverWait wait = new WebDriverWait(driver, 60);
			   
		try {	   
			   driver.get("https://www.communitymatrimony.com/");
			   driver.manage().window().maximize();
			   
			   Base.click(i.getMatriId());
			   Base.typeData(i.getMatriId(), "EZH710533");
			   
			   Base.click(i.getPaswwordclr());
			   Base.typeData(i.getPassword(), "cbstest");
			   
			   Base.click(i.getLoginbtn());
		} catch (Exception e) {
			System.out.println("Already Logged iN");
		}   
			   ////////////// Intermediate Pages
			   
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
				 
				 
	}
	   
	   
	   @Test
	   public void recentlyActive() throws Exception {
		
		    SortScroll s = new SortScroll(driver);
			Actions acc= new Actions(driver);
			JavascriptExecutor js = (JavascriptExecutor)driver;
			
			/////////////////////////////////////////////////
			
			 Thread.sleep(10000);
			 acc.moveToElement(s.getMatches()).build().perform();
			 Thread.sleep(10000);
			 ///   Latest matches 
			 acc.moveToElement(s.getLatest_matches()).build().perform();
			 Base.click(s.getLatest_matches());
			 Thread.sleep(10000);  
			 
			 
			 /////////////////////////       Recently Active     ////////////////////////////
			 
	    
					 Base.click(s.getSort_recent_active_button());
					 Thread.sleep(3000);
					 	/////////////   To see Profile Without Photo      ////////////////
					 Base.click(s.getRecent_profile_with_Photo());
					 Thread.sleep(3000);  
					 
		////////////////////////////////      ////////////////////////////////////////////////			 
					 String a = s.getTotal_profile_count().getText();
					 Integer profile_count =Integer.parseInt(a);
					  int page_cou = (profile_count/10);
					  System.out.println(page_cou);
		if (page_cou<=5) {
			
		}			  
					  for (int i = 0; i <=page_cou; i++) {
						  
						  for (int j = 0; j <=12; j++) {
							  Thread.sleep(3000);
								js.executeScript("window.scrollBy(0,350)"); 
								System.out.println("The Scroll Completed are : "+j);
						}
						  
				
						  Thread.sleep(5000);
				try {		  
						  Base.click(s.getNext_btn());
						  Thread.sleep(2000);
				} catch (Exception e) {
					System.out.println("No Next Button");
				}  
						
					}
				

	}
	   
	   
	   @Test (enabled=false)
	   public void relevanceScroll() throws Exception {
		   
			
		    SortScroll s = new SortScroll(driver);
			Actions acc= new Actions(driver);
			JavascriptExecutor js = (JavascriptExecutor)driver;
			
			/////////////////////////////////////////////////
			
			 Thread.sleep(5000);
			 acc.moveToElement(s.getMatches()).build().perform();
			 Thread.sleep(2000);
			 ///   Latest matches 
			 acc.moveToElement(s.getLatest_matches()).build().perform();
			 Base.click(s.getLatest_matches());
			 Thread.sleep(3000);  
			 
			 
				/*    Relevance profile will display by default  -  No need to select the radio button */
					 
		////////////////////////////////      ////////////////////////////////////////////////			 
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
						  
				
						  Thread.sleep(5000);
				try {		  
						  Base.click(s.getNext_btn());
						  Thread.sleep(2000);
				} catch (Exception e) {
					System.out.println("No Next Button");
				}  
						
					}
				

	}
		


   
	   @Test(enabled=false)
	   public void newestProfile() throws Exception {
		
		            SortScroll s = new SortScroll(driver);
					Actions acc= new Actions(driver);
					JavascriptExecutor js = (JavascriptExecutor)driver;
					
					/////////////////////////////////////////////////
					
					 Thread.sleep(5000);
					 acc.moveToElement(s.getMatches()).build().perform();
					 Thread.sleep(2000);
					 ///   Latest matches 
					 acc.moveToElement(s.getLatest_matches()).build().perform();
					 Base.click(s.getLatest_matches());
					 Thread.sleep(3000);  
					 
					 
					 /////////////////////////      Newest Profile    ////////////////////////////
					 
						    	 Base.click(s.getSort_new_profile());
								 Thread.sleep(3000);
								 	/////////////   To see Profile Without Photo      ////////////////
								 Base.click(s.getNew_profile_with_photo());
								 Thread.sleep(3000);
							 
				////////////////////////////////      ////////////////////////////////////////////////			 
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
								  
						
								  Thread.sleep(5000);
						try {		  
								  Base.click(s.getNext_btn());
								  Thread.sleep(2000);
						} catch (Exception e) {
							System.out.println("No Next Button");
						}  
								
							}

	}
	   
	   
	   
	   
	   
	   @Test(enabled=false)
	   public void oldestProfile() throws Exception {
		   
		    SortScroll s = new SortScroll(driver);
			Actions acc= new Actions(driver);
			JavascriptExecutor js = (JavascriptExecutor)driver;
			
			/////////////////////////////////////////////////
			
			 Thread.sleep(5000);
			 acc.moveToElement(s.getMatches()).build().perform();
			 Thread.sleep(2000);
			 ///   Latest matches 
			 acc.moveToElement(s.getLatest_matches()).build().perform();
			 Base.click(s.getLatest_matches());
			 Thread.sleep(3000);  
			 
			 
			 /////////////////////////      Oldest Profile    ////////////////////////////
			 
			  Base.click(s.getSort_old_profile());
			 Thread.sleep(3000);
	   	/////////////   To see Profile Without Photo      ////////////////
	     	 Base.click(s.getOld_profile_with_photo());
			 Thread.sleep(3000);   
					 
		////////////////////////////////      ////////////////////////////////////////////////			 
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
						  
				
						  Thread.sleep(5000);
				try {		  
						  Base.click(s.getNext_btn());
						  Thread.sleep(2000);
				} catch (Exception e) {
					System.out.println("No Next Button");
				}  
						
					}
	}
	   
	   
	   
	   

}
