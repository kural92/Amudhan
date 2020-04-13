package com.testscripts;

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
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.base.Base;
import com.pom.Inbox;
import com.pom.ShortList;
import com.pom.SortScroll;

public class ShortListTest extends Base{
	
	WebDriver driver;
	
	
	   @BeforeTest
	   public void setUp() {
		System.setProperty("webdriver.chrome.driver", ".//Driver//chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);
		

	}
	   
	   @BeforeMethod
	   public void shortList() throws InterruptedException {
		   
		   Inbox i = new Inbox(driver);
		   ShortList s = new ShortList(driver);
		try {   
		   driver.get("https://www.communitymatrimony.com/");
		   driver.manage().window().maximize();
		   
		   Base.click(i.getMatriId());
		   Base.typeData(i.getMatriId(), "AGR100176");
		   
		   Base.click(i.getPaswwordclr());
		   Base.typeData(i.getPassword(), "cbstest");
		   
		   Base.click(i.getLoginbtn());
		} catch (Exception e) {
			System.out.println("Already Logged in");
		}
		
		Thread.sleep(2000);
		   try {
				WebElement photo_add = driver.findElement(By.xpath("/html/body/div[2]/a"));
				if (photo_add.isDisplayed()) {
					photo_add.click();
					driver.findElement(By.xpath("//*[@id=\"conform\"]/div/div/div/a[1]")).click();
					driver.findElement(By.xpath("//*[@id=\"reason3\"]")).click();
					driver.findElement(By.xpath("//*[@id=\"skipphotoclick\"]")).click();
					
				}
				
			} catch (Exception e) {
				System.out.println("NO Photo Page to Skip");
			}
			
		   Thread.sleep(2000);
			try {
				WebElement skip_matches = driver.findElement(By.xpath("//a[contains(text(),'Skip to Daily Matches >>')]"));
				if (skip_matches.isDisplayed()) {
					skip_matches.click();
					
				}
			} catch (Exception e) {
				System.out.println("No Intermediate pages");
			}
			
			Thread.sleep(2000);
			try {
				WebElement element = driver.findElement(By.xpath("/html/body/div[1]/div[2]/a"));
				if (element.isDisplayed()) {
					element.click();
					
				}
			} catch (Exception e) {
				System.out.println("No Intermediate pages");
			}
			
			Thread.sleep(2000);
			try {
				WebElement divorcee_intermediate_skip = driver.findElement(By.xpath("/html/body/div[1]/div/div[4]/a"));
				if (divorcee_intermediate_skip.isDisplayed()) {
					divorcee_intermediate_skip.click();
					
				}
			} catch (Exception e) {
				System.out.println("No Intermediate pages");
			}
			
			Thread.sleep(2000);
			try {
				driver.findElement(By.xpath("//*[@id=\"conform\"]/div/div/div/a[1]")).click();
			} catch (Exception e) {
				System.out.println("No Intermediate pages");
			}
			
			// AD Pages
			 Thread.sleep(5000);
			 try {
				 driver.findElement(By.xpath("//*[@id=\"special_offer_lightpic1\"]/div[1]/div/a/img")).click();
			} catch (Exception e) {         
				System.out.println("ADs not Closed");
			}
		}
	   
	   @Test(enabled=true)
	   public void shortlistLatestMatches() throws Exception {
		   
		   Inbox i = new Inbox(driver);
		   ShortList s = new ShortList(driver);
		   //////////////////////////////////////////////
			 Actions acc = new Actions(driver);
			 
			 acc.moveToElement(s.getMatches_btn()).build().perform();
			 Thread.sleep(3000);
			 Base.click(s.getLatest_matches());
			 
			 Thread.sleep(3000);
			 driver.findElement(By.id("shortlistOpt")).click();
			 
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//*[@id=\"save_srch_link\"]/div[5]/div[3]/input")).click();
			// Base.waitElementToPresent(s.getMatri_id());
			 Thread.sleep(5000);
			 String Id = s.getMatri_id().getText();
			 System.out.println("Matri ID : " + Id);
			 
			// Base.waitElementToPresent(s.getShortlist_btn());
			 Thread.sleep(5000);
			 Base.click(s.getShortlist_btn());
			 
		//	 Base.waitElementToPresent(s.getShorlisted_popup());
			 Thread.sleep(3000);
		//	 Base.click(s.getShorlisted_popup());
			 System.out.println("The Profile was Shortlisted Using Shortlist Button");
			 
			 Thread.sleep(5000);
			 acc.moveToElement(s.getMyhome()).build().perform();
			 Base.click(s.getShortlisted_by_me());
			 Thread.sleep(5000);
		//	 Base.waitElementToPresent(s.getList_matriID());
			 String Ids = s.getList_matriID().getText();
			 System.out.println("Page 1 shortlisted Ids : " + Ids);
			 
			 Thread.sleep(5000);
			 if (Ids.contains(Id)) {
				 
				 System.out.println("The Shortlisted Id matches with the Profile Shortlisted By me");
				
			} else {
				
				System.out.println("The Shortlisted Id not matches with the Profile Shortlisted By me");

			}
			 
			 

	}
	   
	   @Test(enabled=true)
	   public void shortlistYTBW() throws Exception {
		
		   Inbox i = new Inbox(driver);
		   ShortList s = new ShortList(driver);
		   SortScroll a = new SortScroll(driver);
		   //////////////////////////////////////////////
			 Actions acc = new Actions(driver);
			 
			 acc.moveToElement(s.getMatches_btn()).build().perform();
			 Thread.sleep(3000);
			 Base.click(a.getYet_to_viewed());
			
			// Base.waitElementToPresent(s.getMatri_id());
			 Thread.sleep(5000);
			 String Id = s.getMatri_id().getText();
			 System.out.println("Matri ID : " + Id);
			 
			// Base.waitElementToPresent(s.getShortlist_btn());
			 
			 Thread.sleep(5000);
			 acc.moveToElement(s.getShortlist_btn()).build().perform();
			 Thread.sleep(2000);
			 Base.click(s.getShortlist_btn());
			 
		//	 Base.waitElementToPresent(s.getShorlisted_popup());
			 Thread.sleep(3000);
		//	 Base.click(s.getShorlisted_popup());
			 System.out.println("The Profile was Shortlisted Using Shortlist Button");
			 
			 Thread.sleep(5000);
			 acc.moveToElement(s.getMyhome()).build().perform();
			 Base.click(s.getShortlisted_by_me());
			 Thread.sleep(5000);
		//	 Base.waitElementToPresent(s.getList_matriID());
			 String Ids = s.getList_matriID().getText();
			 System.out.println("Page 1 shortlisted Ids : " + Ids);
			 
			 Thread.sleep(5000);
			 if (Ids.contains(Id)) {
				 
				 System.out.println("The Shortlisted Id matches with the Profile Shortlisted By me");
				
			} else {
				
				System.out.println("The Shortlisted Id not matches with the Profile Shortlisted By me");

			}
			 

	}
	
	
	   @Test(enabled=true)
	   public void shortlistMLFM() throws Exception {
		
		   Inbox i = new Inbox(driver);
		   ShortList s = new ShortList(driver);
		   SortScroll a = new SortScroll(driver);
		   //////////////////////////////////////////////
			 Actions acc = new Actions(driver);
			 
			 acc.moveToElement(s.getMatches_btn()).build().perform();
			 Thread.sleep(3000);
			 Base.click(a.getMember_who_might_like_you());
			 
			 Thread.sleep(1000);
			 driver.findElement(By.id("shortlistOpt")).click();
			 
			 Thread.sleep(3000);
			 driver.findElement(By.id("chatbuddylistwin")).click();
			 
			 Thread.sleep(1000);
			 driver.findElement(By.id("shortlistOpt")).click();
		
			 Thread.sleep(3000);
			 acc.moveToElement(driver.findElement(By.xpath("//*[@id=\"mm_dontshow\"]/div[3]/input"))).build().perform();
			 driver.findElement(By.xpath("//*[@id=\"mm_dontshow\"]/div[3]/input")).click();
			// Base.waitElementToPresent(s.getMatri_id());
			 Thread.sleep(5000);
			 String Id = s.getMatri_id().getText();
			 System.out.println("Matri ID : " + Id);
			 
			// Base.waitElementToPresent(s.getShortlist_btn());
			 Thread.sleep(5000);
			 Base.click(s.getShortlist_btn());
			 
		//	 Base.waitElementToPresent(s.getShorlisted_popup());
			 Thread.sleep(3000);
		//	 Base.click(s.getShorlisted_popup());
			 System.out.println("The Profile was Shortlisted Using Shortlist Button");
			 
			 Thread.sleep(5000);
			 acc.moveToElement(s.getMyhome()).build().perform();
			 Base.click(s.getShortlisted_by_me());
			 Thread.sleep(5000);
		//	 Base.waitElementToPresent(s.getList_matriID());
			 String Ids = s.getList_matriID().getText();
			 System.out.println("Page 1 shortlisted Ids : " + Ids);
			 
			 Thread.sleep(5000);
			 if (Ids.contains(Id)) {
				 
				 System.out.println("The Shortlisted Id matches with the Profile Shortlisted By me");
				
			} else {
				
				System.out.println("The Shortlisted Id not matches with the Profile Shortlisted By me");

			}
			 

	   }
	   
	   @Test(enabled=true)
	   public void shortlistPremium_matches() throws Exception {
		
		   Inbox i = new Inbox(driver);
		   ShortList s = new ShortList(driver);
		   SortScroll a = new SortScroll(driver);
		   //////////////////////////////////////////////
			 Actions acc = new Actions(driver);
			 
			 acc.moveToElement(s.getMatches_btn()).build().perform();
			 Thread.sleep(3000);
			 Base.click(a.getPremium_members());
			 
			
			// Base.waitElementToPresent(s.getMatri_id());
			 Thread.sleep(5000);
			 String Id = s.getMatri_id().getText();
			 System.out.println("Matri ID : " + Id);
			 
			// Base.waitElementToPresent(s.getShortlist_btn());
			 
			 Thread.sleep(5000);
			 acc.moveToElement(s.getShortlist_btn()).build().perform();
			 Thread.sleep(2000);
			 Base.click(s.getShortlist_btn());
			 
		//	 Base.waitElementToPresent(s.getShorlisted_popup());
			 Thread.sleep(3000);
		//	 Base.click(s.getShorlisted_popup());
			 System.out.println("The Profile was Shortlisted Using Shortlist Button");
			 
			 Thread.sleep(5000);
			 acc.moveToElement(s.getMyhome()).build().perform();
			 Base.click(s.getShortlisted_by_me());
			 Thread.sleep(5000);
		//	 Base.waitElementToPresent(s.getList_matriID());
			 String Ids = s.getList_matriID().getText();
			 System.out.println("Page 1 shortlisted Ids : " + Ids);
			 
			 Thread.sleep(5000);
			 if (Ids.contains(Id)) {
				 
				 System.out.println("The Shortlisted Id matches with the Profile Shortlisted By me");
				
			} else {
				
				System.out.println("The Shortlisted Id not matches with the Profile Shortlisted By me");

			}
	   }
	   
			 

			 ///////////   Logout
			
	   
	   @Test(enabled=false)
	   public void shortlistMutual_matches() throws Exception {
		
		   Inbox i = new Inbox(driver);
		   ShortList s = new ShortList(driver);
		   SortScroll a = new SortScroll(driver);
		   WebDriverWait wait = new WebDriverWait(driver, 30);
		   JavascriptExecutor js  = (JavascriptExecutor)driver;
		   //////////////////////////////////////////////
			 Actions acc = new Actions(driver);
			 
			 acc.moveToElement(s.getMatches_btn()).build().perform();
			 Thread.sleep(3000);
			 Base.click(a.getMutual_matches());
		
			 Thread.sleep(1000);
			 driver.findElement(By.id("shortlistOpt")).click();
			 
			 Thread.sleep(3000);
			 driver.findElement(By.id("chatbuddylistwin")).click();
			 
			 Thread.sleep(1000);
			 driver.findElement(By.id("shortlistOpt")).click();
		
			 Thread.sleep(3000);
			 acc.moveToElement(driver.findElement(By.xpath("//*[@id=\"mm_dontshow\"]/div[3]/input"))).build().perform();
			 driver.findElement(By.xpath("//*[@id=\"mm_dontshow\"]/div[3]/input")).click();
		//	 wait.until(ExpectedConditions.elementToBeClickable( driver.findElement(By.xpath("(//input[@type='button'])[4]"))));
      //   js.executeScript("arguments[0].click();", driver.findElement(By.xpath("(//input[@type='button'])[4]")));
			// Base.waitElementToPresent(s.getMatri_id());
			 Thread.sleep(10000);
			 String Id = s.getMatri_id().getText();
			 System.out.println("Matri ID : " + Id);
			 
			// Base.waitElementToPresent(s.getShortlist_btn());
			 Thread.sleep(5000);
			 Base.click(s.getShortlist_btn());
			 
		//	 Base.waitElementToPresent(s.getShorlisted_popup());
			 Thread.sleep(3000);
		//	 Base.click(s.getShorlisted_popup());
			 System.out.println("The Profile was Shortlisted Using Shortlist Button");
			 
			 Thread.sleep(5000);
			 acc.moveToElement(s.getMyhome()).build().perform();
			 Base.click(s.getShortlisted_by_me());
			 Thread.sleep(5000);
		//	 Base.waitElementToPresent(s.getList_matriID());
			 String Ids = s.getList_matriID().getText();
			 System.out.println("Page 1 shortlisted Ids : " + Ids);
			 
			 Thread.sleep(5000);
			 if (Ids.contains(Id)) {
				 
				 System.out.println("The Shortlisted Id matches with the Profile Shortlisted By me");
				
			} else {
				
				System.out.println("The Shortlisted Id not matches with the Profile Shortlisted By me");

			}
			 ///////////   Logout
			
			 

	}
	
	   
	   @AfterTest
	   public void teardown() throws Exception {
		
		/*   Actions acc = new Actions(driver);
		   ///////////   Logout
			 System.out.println("  >  >  >  >  >  >  >  >  >");
			 Thread.sleep(3000);
			acc.moveToElement(driver.findElement(By.xpath("//*[@id=\"topnav-login-menu\"]/div[3]/div[2]/div[1]/a/img"))).build().perform();
			acc.moveToElement(driver.findElement(By.xpath("//*[@id=\"topnav-login-menu\"]/div[3]/div[2]/div[1]/a/img"))).build().perform();
			Thread.sleep(1000);
			acc.moveToElement(driver.findElement(By.xpath("//*[@id=\"userpop\"]/div[2]/div/div[3]/div[2]/ul/li[3]/a"))).build().perform();
			driver.findElement(By.xpath("//*[@id=\"userpop\"]/div[2]/div/div[3]/div[2]/ul/li[3]/a")).click();
			 System.out.println("Logged Out Successfully");  */
	}

}
