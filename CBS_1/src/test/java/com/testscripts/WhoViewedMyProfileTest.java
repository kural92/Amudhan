package com.testscripts;

import java.util.List;
import java.util.Set;

import org.junit.runner.notification.Failure;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.base.Base;
import com.pom.Inbox;
import com.pom.Logout;
import com.pom.SortScroll;
import com.pom.WhoViewBanner;
import com.relevantcodes.extentreports.model.ITest;

public class WhoViewedMyProfileTest extends Base{
	
	WebDriver driver;
	
	@BeforeTest
	public void startUp() {
		
		System.setProperty("webdriver.chrome.driver", ".//Driver//chromedriver.exe");
		ChromeOptions options  = new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);

	}
	
	
	
	/*@BeforeMethod
	public void Login() throws Exception {
		
		Inbox i = new Inbox(driver);
		Thread.sleep(3000);
try {		
		driver.get("https://www.communitymatrimony.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		Base.click(i.getMatriId());
		Base.typeData(i.getMatriId(), "AGR102088");
		
		Base.click(i.getPaswwordclr());
		Base.typeData(i.getPassword(), "cbstest");
		
		Base.click(i.getLoginbtn());
		System.out.println("Log In was Successfull");
		Thread.sleep(3000);
} catch (Exception e) {
	System.out.println("Already Logged In");
}	
		
		System.out.println("Handling Intermeiate Pages");
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
		
		Thread.sleep(3000);
		try {
			WebElement skip_matches = driver.findElement(By.xpath("//a[contains(text(),'Skip to Daily Matches >>')]"));
			if (skip_matches.isDisplayed()) {
				skip_matches.click();
				
			}
		} catch (Exception e) {
			System.out.println("Intermediate pages handled");
		}
		
		Thread.sleep(3000);
		try {
			WebElement element = driver.findElement(By.xpath("/html/body/div[1]/div[2]/a"));
			if (element.isDisplayed()) {
				element.click();
				
			}
		} catch (Exception e) {
			System.out.println("Intermediate pages handled");
		}
		
		Thread.sleep(3000);
		try {
			WebElement divorcee_intermediate_skip = driver.findElement(By.xpath("/html/body/div[1]/div/div[4]/a"));
			if (divorcee_intermediate_skip.isDisplayed()) {
				divorcee_intermediate_skip.click();
				
			}
		} catch (Exception e) {
			System.out.println("Intermediate pages handled");
		}
		
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
	

	} */
	
/*	@Test (enabled=false)
	public void bannerCont() throws Exception {
		
		
		WhoViewBanner w = new WhoViewBanner(driver);
		Actions acc = new Actions(driver);
		WebDriverWait wait = new WebDriverWait(driver, 30);
		JavascriptExecutor js  =  (JavascriptExecutor)driver;
		Logout l = new Logout(driver);
		Inbox i = new Inbox(driver);
		
		
		Thread.sleep(3000);
try {		
		driver.get("https://www.communitymatrimony.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		Base.click(i.getMatriId());
		Base.typeData(i.getMatriId(), "BRH1393126");
		
		Base.click(i.getPaswwordclr());
		Base.typeData(i.getPassword(), "test4cbs");
		
		Base.click(i.getLoginbtn());
		System.out.println("Log In was Successfull");
		Thread.sleep(3000);
} catch (Exception e) {
	System.out.println("Already Logged In");
}	
		
		System.out.println("Handling Intermeiate Pages");
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
		
		Thread.sleep(3000);
		try {
			WebElement skip_matches = driver.findElement(By.xpath("//a[contains(text(),'Skip to Daily Matches >>')]"));
			if (skip_matches.isDisplayed()) {
				skip_matches.click();
				
			}
		} catch (Exception e) {
			System.out.println("Intermediate pages handled");
		}
		
		Thread.sleep(3000);
		try {
			WebElement element = driver.findElement(By.xpath("/html/body/div[1]/div[2]/a"));
			if (element.isDisplayed()) {
				element.click();
				
			}
		} catch (Exception e) {
			System.out.println("Intermediate pages handled");
		}
		
		Thread.sleep(3000);
		try {
			WebElement divorcee_intermediate_skip = driver.findElement(By.xpath("/html/body/div[1]/div/div[4]/a"));
			if (divorcee_intermediate_skip.isDisplayed()) {
				divorcee_intermediate_skip.click();
				
			}
		} catch (Exception e) {
			System.out.println("Intermediate pages handled");
		}
		
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
		
		//////////   
		Thread.sleep(3000);
		Base.click(w.getMy_home());
		
		try {
			driver.findElement(By.xpath("(//a[@class=\"popupclose\"])[2]")).click();
		} catch (Exception e) {
			e.getMessage();
		}
		
		Thread.sleep(3000);
		String count = w.getViewed_my_profile_banner_count().getText();
		System.out.println("Count : "+count);
		Integer Count = Integer.parseInt(count);
        System.out.println("Int Count : " + Count);
        Thread.sleep(10000);
        
        Base.click(w.getViwed_my_profile_banner());
        Thread.sleep(2000);
        
        ///////////////    Window Handle  ///////
        String parent = driver.getWindowHandle();
        
        Thread.sleep(2000);
        Set<String> child = driver.getWindowHandles();
        for (String handle : child) {
			if (!parent.contains(handle)) {
				Thread.sleep(2000);
				driver.switchTo().window(handle);
				
			}
        	
        	
		}
        
        Thread.sleep(2000);
        String count1 = w.getViewed_my_profile_count().getText();
        System.out.println(count1);
        
        Thread.sleep(2000);
        Integer Count1 = Integer.parseInt(count1);
        System.out.println(Count1);
        Thread.sleep(2000);
        
        
        
        if (Count.equals(Count1)) {
        	
        	System.out.println("Count Matched");
			
		} else {

			System.out.println("Count not Matched");
			
		}
        driver.close();
        Thread.sleep(1000);
	    driver.switchTo().window(parent);
 
           System.out.println("Who Viewed My Profile Count Test Completed Successfully");
       
    	   
    	  
    	   Thread.sleep(3000);
           acc.moveToElement(l.getLogout_menu()).build().perform();
           
           Thread.sleep(1000);
           acc.moveToElement(l.getLogout_btn()).build().perform();
           
           Thread.sleep(3000);
           Base.click(l.getLogout_btn());
	}
	*/
     @Test(enabled=true)
     public void whoViewedMeScrollTest() throws InterruptedException {
		
    	
 		WhoViewBanner w = new WhoViewBanner(driver);
 		SortScroll s  = new SortScroll(driver);
 		Actions acc = new Actions(driver);
 		WebDriverWait wait = new WebDriverWait(driver, 30);
 		JavascriptExecutor js  =  (JavascriptExecutor)driver;
 		Logout l = new Logout(driver);
 		Inbox i = new Inbox(driver);
 		
 		
		Thread.sleep(3000);
try {		
		driver.get("https://www.communitymatrimony.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		Base.click(i.getMatriId());
		Base.typeData(i.getMatriId(), "AGR102088");
		
		Base.click(i.getPaswwordclr());
		Base.typeData(i.getPassword(), "cbstest");
		
		Base.click(i.getLoginbtn());
		System.out.println("Log In was Successfull");
		Thread.sleep(3000);
} catch (Exception e) {
	System.out.println("Already Logged In");
}	
		
		System.out.println("Handling Intermeiate Pages");
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
		
		Thread.sleep(3000);
		try {
			WebElement skip_matches = driver.findElement(By.xpath("//a[contains(text(),'Skip to Daily Matches >>')]"));
			if (skip_matches.isDisplayed()) {
				skip_matches.click();
				
			}
		} catch (Exception e) {
			System.out.println("Intermediate pages handled");
		}
		
		Thread.sleep(3000);
		try {
			WebElement element = driver.findElement(By.xpath("/html/body/div[1]/div[2]/a"));
			if (element.isDisplayed()) {
				element.click();
				
			}
		} catch (Exception e) {
			System.out.println("Intermediate pages handled");
		}
		
		Thread.sleep(3000);
		try {
			WebElement divorcee_intermediate_skip = driver.findElement(By.xpath("/html/body/div[1]/div/div[4]/a"));
			if (divorcee_intermediate_skip.isDisplayed()) {
				divorcee_intermediate_skip.click();
				
			}
		} catch (Exception e) {
			System.out.println("Intermediate pages handled");
		}
		
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
 		
 		//////////   
 		Thread.sleep(3000);
 		Base.click(driver.findElement(By.xpath("//a[contains(text(),'My Home')]")));
 		try {
			driver.findElement(By.xpath("(//a[@class=\"popupclose\"])[2]")).click();
		} catch (Exception e) {
			e.getMessage();
		}
 		
         Thread.sleep(5000);
         Base.click(w.getViwed_my_profile_banner());
         Thread.sleep(2000);
         
         ///////////////    Window Handle  ///////
         String parent = driver.getWindowHandle();
         
         Set<String> child = driver.getWindowHandles();
         for (String handle : child) {
 			if (!parent.contains(handle)) {
 				Thread.sleep(2000);
 				driver.switchTo().window(handle);
 			}
	
 		}
         
    	 Thread.sleep(5000);  

		 String a = w.getViewed_my_profile_count().getText();
		 Integer profile_count =Integer.parseInt(a);
		  int page_cou = (profile_count/10);
		  System.out.println(page_cou);
		  
		  for (int m = 0; m <=3; m++) {
			  
			  for (int j = 0; j <=12; j++) {
				  Thread.sleep(1000);
					js.executeScript("window.scrollBy(0,350)"); 
					//System.out.println("The Scroll Completed are : "+j);
			}
	
			  Thread.sleep(3000);
	try {		  
			  Base.click(driver.findElement(By.xpath("//*[@id=\"paginationBottom\"]/span[2]")));
			  Thread.sleep(2000);
	} catch (Exception e) {
		System.out.println("No Next Button");
	}  
			
		}
	driver.close();
		  Thread.sleep(1000);
         driver.switchTo().window(parent);
         
  	   
  	  
  	   Thread.sleep(3000);
         acc.moveToElement(l.getLogout_menu()).build().perform();
         
         Thread.sleep(1000);
         acc.moveToElement(l.getLogout_btn()).build().perform();
         
         Thread.sleep(3000);
         Base.click(l.getLogout_btn());
 	}
     
     
     
  /*   @Test(enabled=false)
     public void viewProfileRequest() throws InterruptedException {
    	 
    	 
    		
  		WhoViewBanner w = new WhoViewBanner(driver);
  		SortScroll s  = new SortScroll(driver);
  		Actions acc = new Actions(driver);
  		WebDriverWait wait = new WebDriverWait(driver, 30);
  		JavascriptExecutor js  =  (JavascriptExecutor)driver;
  		Logout l = new Logout(driver);
  		Inbox i = new Inbox(driver);
  		
		Thread.sleep(3000);
try {		
		driver.get("https://www.communitymatrimony.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		Base.click(i.getMatriId());
		Base.typeData(i.getMatriId(), "BRH1393126");
		
		Base.click(i.getPaswwordclr());
		Base.typeData(i.getPassword(), "test4cbs");
		
		Base.click(i.getLoginbtn());
		System.out.println("Log In was Successfull");
		Thread.sleep(3000);
} catch (Exception e) {
	System.out.println("Already Logged In");
}	
		
		System.out.println("Handling Intermeiate Pages");
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
		
		Thread.sleep(3000);
		try {
			WebElement skip_matches = driver.findElement(By.xpath("//a[contains(text(),'Skip to Daily Matches >>')]"));
			if (skip_matches.isDisplayed()) {
				skip_matches.click();
				
			}
		} catch (Exception e) {
			System.out.println("Intermediate pages handled");
		}
		
		Thread.sleep(3000);
		try {
			WebElement element = driver.findElement(By.xpath("/html/body/div[1]/div[2]/a"));
			if (element.isDisplayed()) {
				element.click();
				
			}
		} catch (Exception e) {
			System.out.println("Intermediate pages handled");
		}
		
		Thread.sleep(3000);
		try {
			WebElement divorcee_intermediate_skip = driver.findElement(By.xpath("/html/body/div[1]/div/div[4]/a"));
			if (divorcee_intermediate_skip.isDisplayed()) {
				divorcee_intermediate_skip.click();
				
			}
		} catch (Exception e) {
			System.out.println("Intermediate pages handled");
		}
		
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
  		
  		
	
  		//////////   
  		Thread.sleep(3000);
  		Base.click(w.getMy_home());
  		try {
			driver.findElement(By.xpath("(//a[@class=\"popupclose\"])[2]"));
		} catch (Exception e) {
			e.getMessage();
		}
  		
          Thread.sleep(5000);
          Base.click(w.getViwed_my_profile_banner());
          Thread.sleep(2000);
          
          ///////////////    Window Handle  ///////
          String parent = driver.getWindowHandle();
          
          Set<String> child = driver.getWindowHandles();
          for (String handle : child) {
  			if (!parent.contains(handle)) {
  				Thread.sleep(2000);
  				driver.switchTo().window(handle);
  			}
 	
  		}
          
     	 Thread.sleep(5000);  
     	 Base.click(w.getView_profile_click());
     	 Thread.sleep(3000);
     //	 driver.close();
     	 
     	
		Set<String> child1 = driver.getWindowHandles();
		for (String handle1 : child1) {
			if (!child.contains(handle1)) {
				Thread.sleep(2000);
				driver.switchTo().window(handle1);				
			}
			
		}
		
		List<WebElement> request = driver.findElements(By.xpath("//span[contains(text(),'Request for')]"));
		System.out.println(request.size());
		
		for (int j = 0; j<=request.size()-1; j++) {
			
			Thread.sleep(5000);
	      request.get(j).click();
	      try {
	      Thread.sleep(3000);
	      driver.findElement(By.id("accept_close")).click();
	      } catch (Exception e) {
			e.getMessage();
		}
		}
		
		System.out.println("All Request Sent Succesfully ");
		driver.close();
		Thread.sleep(2000);
		driver.switchTo().window(parent);

		  
		   Thread.sleep(3000);
	       acc.moveToElement(l.getLogout_menu()).build().perform();
	       
	       Thread.sleep(1000);
	       acc.moveToElement(l.getLogout_btn()).build().perform();
	       
	       Thread.sleep(3000);
	       Base.click(l.getLogout_btn());
	}
     
     
     
     @Test(enabled=false)
     public void WhoViewMyProfileShortlist() throws Exception {
		
    		WhoViewBanner w = new WhoViewBanner(driver);
      		SortScroll s  = new SortScroll(driver);
      		Actions acc = new Actions(driver);
      		WebDriverWait wait = new WebDriverWait(driver, 30);
      		JavascriptExecutor js  =  (JavascriptExecutor)driver;
      		Logout l = new Logout(driver);
      		Inbox i = new Inbox(driver);
      		
      		
    		Thread.sleep(3000);
    try {		
    		driver.get("https://www.communitymatrimony.com");
    		driver.manage().window().maximize();
    		Thread.sleep(3000);
    		
    		Base.click(i.getMatriId());
    		Base.typeData(i.getMatriId(), "BRH1393126");
    		
    		Base.click(i.getPaswwordclr());
    		Base.typeData(i.getPassword(), "test4cbs");
    		
    		Base.click(i.getLoginbtn());
    		System.out.println("Log In was Successfull");
    		Thread.sleep(3000);
    } catch (Exception e) {
    	System.out.println("Already Logged In");
    }	
    		
    		System.out.println("Handling Intermeiate Pages");
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
    		
    		Thread.sleep(3000);
    		try {
    			WebElement skip_matches = driver.findElement(By.xpath("//a[contains(text(),'Skip to Daily Matches >>')]"));
    			if (skip_matches.isDisplayed()) {
    				skip_matches.click();
    				
    			}
    		} catch (Exception e) {
    			System.out.println("Intermediate pages handled");
    		}
    		
    		Thread.sleep(3000);
    		try {
    			WebElement element = driver.findElement(By.xpath("/html/body/div[1]/div[2]/a"));
    			if (element.isDisplayed()) {
    				element.click();
    				
    			}
    		} catch (Exception e) {
    			System.out.println("Intermediate pages handled");
    		}
    		
    		Thread.sleep(3000);
    		try {
    			WebElement divorcee_intermediate_skip = driver.findElement(By.xpath("/html/body/div[1]/div/div[4]/a"));
    			if (divorcee_intermediate_skip.isDisplayed()) {
    				divorcee_intermediate_skip.click();
    				
    			}
    		} catch (Exception e) {
    			System.out.println("Intermediate pages handled");
    		}
    		
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
      		
      		//////////   
      		Thread.sleep(3000);
      		Base.click(w.getMy_home());
      		try {
    			driver.findElement(By.xpath("(//a[@class=\"popupclose\"])[2]")).click();
    		} catch (Exception e) {
    			e.getMessage();
    		}
      		
              Thread.sleep(5000);
              Base.click(w.getViwed_my_profile_banner());
              Thread.sleep(2000);
              
              ///////////////    Window Handle  ///////
              String parent = driver.getWindowHandle();
              
              Set<String> child = driver.getWindowHandles();
              for (String handle : child) {
      			if (!parent.contains(handle)) {
      				Thread.sleep(2000);
      				driver.switchTo().window(handle);
      			}
     	
      		}
              
         
              Thread.sleep(2000);
              Base.click(w.getShortlist_btn());
              Thread.sleep(2000);
          try {    
              Base.click(w.getShorlisted_popup());
          } catch (Exception e) {
			e.getMessage();
		}
        
   	  
   	   Thread.sleep(3000);
          acc.moveToElement(l.getLogout_menu()).build().perform();
          
          Thread.sleep(1000);
          acc.moveToElement(l.getLogout_btn()).build().perform();
          
          Thread.sleep(3000);
          Base.click(l.getLogout_btn());
          
        //  driver.close();
	}  
     

     
   @AfterMethod
   public void tearDown(IRetryAnalyzer a,ITestResult result) throws InterruptedException {
	   
	   
	   if (a.retry(result)) {
		   
		   if (driver.findElement(By.xpath("//div[contains(text(),'Sorry for the inconvenience as we are facing technical difficulty at the moment. Please try again.')]")).isDisplayed()) {
			
			   System.out.println(driver.findElement(By.xpath("//div[contains(text(),'Sorry for the inconvenience as we are facing technical difficulty at the moment. Please try again.')]")).getText());
			   
			   
		} else {
			
			System.out.println(" Success ");

		}
		   
		
	} else {

	}
	
	   /*Logout l = new Logout(driver);
	   Actions acc  = new Actions(driver);
	   
	  
	   Thread.sleep(3000);
       acc.moveToElement(l.getLogout_menu()).build().perform();
       
       Thread.sleep(1000);
       acc.moveToElement(l.getLogout_btn()).build().perform();
       
       Thread.sleep(3000);
       Base.click(l.getLogout_btn());
	*/
    
//}  
     
     
   
     
}
