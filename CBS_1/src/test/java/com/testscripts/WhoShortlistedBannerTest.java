package com.testscripts;

import java.util.Set;

import org.apache.poi.ss.formula.functions.Count;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.base.Base;
import com.pom.Inbox;
import com.pom.Logout;
import com.pom.WhoViewBanner;

public class WhoShortlistedBannerTest extends Base{
	
	
	WebDriver driver;
	int Count;
	
	@BeforeTest
	public void startUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\amuthan\\eclipse-workspace\\CBS_1\\Driver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);
	}
	
	@Test(enabled=false)
	public void myhomeShortlistBannerCount() throws Exception {
		
		
		Inbox i =new Inbox(driver);
		WhoViewBanner w = new WhoViewBanner(driver);
		Actions acc= new Actions(driver);
		JavascriptExecutor js =  (JavascriptExecutor)driver;
		WebDriverWait wait = new WebDriverWait(driver, 30);
		Logout l = new Logout(driver);
		
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
		 
		 /////////////////////////////////   Intermediate Pages 
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
			Base.click(w.getMy_home());
			try {
				driver.findElement(By.xpath("(//a[@class=\"popupclose\"])[2]")).click();
			} catch (Exception e) {
				e.getMessage();
			}
			
	try {		
			if (w.getShortlisted_my_banner().isDisplayed()) {
				

				Thread.sleep(3000);
				String a  =  w.getViewed_my_profile_banner_count().getText();
				System.out.println(a);
				
			    Count = Integer.parseInt(a);
				System.out.println(Count);
				
			}
	} catch (Exception e) {
				System.out.println("There is no shortlist banner");
			}
	
	Thread.sleep(2000);
	Base.click(w.getShortlisted_my_banner());
	
	String parent = driver.getWindowHandle();
	
	Set<String> child = driver.getWindowHandles();
	
	for (String handle : child) {
		
		if (!parent.contains(handle)) {
			Thread.sleep(2000);
			driver.switchTo().window(handle);			
		}
		
	}
	
	
	Thread.sleep(10000);
	String b  = w.getViewed_my_profile_count().getText();
	System.out.println(b);
	Thread.sleep(2000);
	
	Integer Count1 = Integer.parseInt(b);
	System.out.println(Count1);
	
	if (Count1.equals(Count)) {
		
		System.out.println("Count Matches");
		
	} else {
		
		System.out.println("Count Not Macthes");

	}
	
	
	/////////////////////////////////////////////   Logout   //////////////////////////////
	
/*	Thread.sleep(7000);
	acc.moveToElement(l.getLogout_menu()).build().perform();
	Thread.sleep(1000);
	
	acc.moveToElement(l.getLogout_btn()).build().perform();
	Thread.sleep(1000);
	
	Base.click(l.getLogout_btn()); 

	}   */
	 
	
	}
	
	
	@Test(enabled=true)
	public void shortlistViewProfileTest() throws Exception {
		
		Inbox i = new Inbox(driver);
		WhoViewBanner w =new WhoViewBanner(driver);
		Logout l = new Logout(driver);
		Actions acc = new Actions(driver);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebDriverWait wait = new WebDriverWait(driver, 30);
		
		Thread.sleep(2000);
		driver.get("https://www.communitymatrimony.com");
		driver.manage().window().maximize();
		
		try {
			
			Thread.sleep(2000);
			Base.click(i.getMatriId());
			Base.typeData(i.getMatriId(), "EZH710533");
			
			Thread.sleep(2000);
			Base.click(i.getPaswwordclr());
			Base.typeData(i.getPassword(), "cbstest1");
			
			Thread.sleep(2000);
            Base.click(i.getLoginbtn());
            
		} catch (Exception e) {
			System.out.println("Already Logged IN");
		}
		
		///////////////////    Intermediate Pages   /////////////////////////////
		
		
		
		Thread.sleep(3000);
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
		
		                           /////////////////////////////////////////
		
		Thread.sleep(3000);
		try {
			WebElement skip_matches = driver.findElement(By.xpath("//a[contains(text(),'Skip to Daily Matches >>')]"));
			if (skip_matches.isDisplayed()) {

			}
		} catch (Exception e) {
			System.out.println("Intermediate pages handled");
		}
		
		
		                         //////////////////////////////////////////////////
		Thread.sleep(3000);
		try {
			WebElement element = driver.findElement(By.xpath("/html/body/div[1]/div[2]/a"));
			if (element.isDisplayed()) {
				element.click();
			}
		} catch (Exception e) {
			System.out.println("Intermediate pages handled");
		}
		 
		                        ////////////////////////////////////////////////////////
		Thread.sleep(3000);
		try {
			WebElement divorcee_intermediate_skip = driver.findElement(By.xpath("/html/body/div[1]/div/div[4]/a"));
			if (divorcee_intermediate_skip.isDisplayed()) {
				divorcee_intermediate_skip.click();
			}
		} catch (Exception e) {
			System.out.println("Intermediate pages handled");
		}
		
		                         /////////////////////////////////////////////////////////
		Thread.sleep(3000);
		try {
			driver.findElement(By.xpath("//*[@id=\"conform\"]/div/div/div/a[1]")).click();
		} catch (Exception e) {
			System.out.println("No Intermediate pages");
		}   
		
		// AD Pages
		Thread.sleep(3000);	 try {
			 driver.findElement(By.xpath("//*[@id=\"special_offer_lightpic1\"]/div[1]/div/a/img")).click();
		} catch (Exception e) {
			System.out.println("ADs Closed Successfully");

	}
	
		
		String Parent = driver.getWindowHandle();
		
		Set<String> child = driver.getWindowHandles();
		for (String handle : child) {
			if (!Parent.equals(handle)) {
				driver.switchTo().window(handle);
				driver.close();
				Thread.sleep(2000);
				driver.switchTo().window(Parent);
			}
		}
		/////////////////////////////////////              /////////////////////////////////
		
		
          Thread.sleep(2000);
          Base.click(w.getMy_home());
          
          try {
  			driver.findElement(By.xpath("(//a[@class=\"popupclose\"])[2]")).click();
  		} catch (Exception e) {
  			e.getMessage();
  		}
  		
		
		///////////////////////////////////////////////////////////////////////////////////////////////////
       try {   
          if (w.getShortlisted_my_banner().isDisplayed()) {
        	  
        	  Thread.sleep(2000);
        	  Base.click(w.getShortlisted_my_banner());
        	 
        	  
			
		} else {
			System.out.println("No Such Banner to handle");
			
		}
          
       } catch (Exception e) {
		System.out.println("No Such Banner to Handle");
	/*	if(!w.getShortlisted_my_banner().getText().equals("Shortlisted your Profile")) 
			w.getShortlisted_my_banner();
			break;  */
		
	}
       
       
       ///////////////////////// 
       Set<String> child1 = driver.getWindowHandles();
       
       for (String winhandle : child1) {

       if (!Parent.equals(child1)) {
    	//   driver.switchTo().window(winhandle);
    	   Thread.sleep(2000);
    	   
    	 //  driver.findElement(By.id("ignorecrossbefore_0")).click();
    	   
    	   Thread.sleep(2000);
    	   Set<String> child2 = driver.getWindowHandles();
    	   
    	   for (String winHandle2 : child2) {
    		   
    		   if (!Parent.equals(winHandle2)) {
    			   
    			   driver.switchTo().window(winHandle2);
				
			}
			
		}
       }
	}
       
       //////////////////////////////////////////////////////////////////
       
       if (w.getShortlist_btn().isDisplayed()) {
			  Thread.sleep(2000);

             Base.click(w.getShortlist_btn());
             
             Thread.sleep(2000);
         try {    
             Base.click(w.getShorlisted_popup());
         } catch (Exception e) {
			e.getMessage();
		}
       
			
		}
		  ///////////////////   View Mble Number
		  
	/*	  if (w.getView_mble_no().isDisplayed()) {
			  Thread.sleep(2000);
			  
			  Base.click(w.getView_mble_no());
			  
			  if (w.getView_mobile_num_popUp().isDisplayed()) {
				  Thread.sleep(2000);
				  
				  Base.click(w.getView_mobile_num2());
				  Thread.sleep(3000);
				  Base.click(w.getView_mblr_no_pop_up_close());
				
			} else if (w.getReq_view_mble_no().isDisplayed()) {
				Thread.sleep(2000);
				
				Base.click(w.getReq_view_mble_no());
				Thread.sleep(2000);
				
				Base.click(w.getView_mble_req_pop_up_close());
				Thread.sleep(2000);
				
			} else {
				
				Set<String> Child = driver.getWindowHandles();
				for (String windHandle : Child) {
					if (!Parent.equals(windHandle)) {
						
						driver.switchTo().window(windHandle);
						driver.close();
						Thread.sleep(2000);
						
						driver.switchTo().window(Parent);
						
					}
					
				}
				

			}
			
		}  */
		  
		  
		///////////////////    View Horoscope   
		  
	/*	  if (w.getView_horoscope().isDisplayed()) {
			  Thread.sleep(2000);
			  
			  Base.click(w.getView_horoscope());
			  Thread.sleep(5000);
			  
			  if (w.getDownload_horoscope().isDisplayed()) {
				  Thread.sleep(2000);
				  
				  Base.click(w.getDownload_horoscope());
				  Thread.sleep(3000);
				  Base.click(w.getHoroscope_close_btn());
				
			} else if (w.getReq_horoscope_pop_up_close_btn().isDisplayed()) {
				Thread.sleep(2000);
				
				Base.click(w.getReq_horoscope());
				Thread.sleep(2000);
				
				Base.click(w.getReq_horoscope_pop_up_close_btn());
				Thread.sleep(2000);
				
			} else {
				
				Set<String> Child1 = driver.getWindowHandles();
				for (String windHandle : Child1) {
					if (!Parent.equals(windHandle)) {
						
						driver.switchTo().window(windHandle);
						driver.close();
						Thread.sleep(2000);
						
						driver.switchTo().window(Parent);
						
					}
					
				}
				

			}
			
		}  */
		  
		  
		  
		  
	}
       
       
       
       
       
          
          
      	}

