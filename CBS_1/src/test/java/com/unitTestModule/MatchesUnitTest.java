package com.unitTestModule;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
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
import com.pom.Horoscope;
import com.pom.Inbox;
import com.pom.ShortList;
import com.pom.SortScroll;
import com.pom.ViewProfileScroll;

public class MatchesUnitTest extends Base{
	
	 WebDriver driver;
	 
	   @BeforeTest
	   public void setUp() {
		System.setProperty("webdriver.chrome.driver", ".//Driver//chromedriver.exe");
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
			   Base.typeData(i.getMatriId(), "AGR600764");
			   
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
				 
			/*	 try {
					 driver.findElement(By.xpath("//*[@id=\"special_offer_lightpic1\"]/div[1]/div/a/img")).click();
				} catch (Exception e) {
					System.out.println("ADs Closed Successfully");
				} */
				 
				 
	}
	   
	   @Test(priority=-1)
	   public void adPage() throws Exception {
		   Thread.sleep(7000);
		   try {
				 driver.findElement(By.xpath("//*[@id=\"special_offer_lightpic1\"]/div[1]/div/a/img")).click();
			} catch (Exception e) {
				System.out.println("ADs Closed Successfully");
			}
		
	}
	   
	   @Test(enabled=true)
       public void viewProfileRequesstTest() throws InterruptedException, Exception {
		   
		   Inbox i = new Inbox(driver);
		   ShortList s = new ShortList(driver);
		   ViewProfileScroll v = new ViewProfileScroll(driver);
		   Horoscope h = new Horoscope(driver);
		   WebDriverWait wait = new WebDriverWait(driver, 60);

		   //////////////////////////////////////////////
			 Actions acc = new Actions(driver);
			 
			 acc.moveToElement(s.getMatches_btn()).build().perform();
			 Thread.sleep(7000);
			 acc.moveToElement(s.getLatest_matches()).build().perform();
			 Base.click(s.getLatest_matches());

			 /////// Dont show Profile Button Handel///
			 
			 Thread.sleep(7000);
			 
			 Base.click(v.getContact_radio_btn());
			 
			 Base.click(v.getView_radio_btn());
			 
			 Base.click(v.getShortlist_radio_button());
			 
			 Base.click(v.getBlock_radio_btn());
			 
			 Base.click(v.getIgnore_radio_btn());
			 
			 Base.click(v.getDnt_show_submit());
			 
			 //////////////////////////////////////////////
			 
			 Thread.sleep(6000);
			 Base.click(v.getView_profile_click());
			 
			 
			 ///////////  Window Handling  
			 
				String parent = driver.getWindowHandle();
				System.out.println("Parent Window ID is  " + parent);
				Thread.sleep(7000);
			 
			 Set<String> winHandles = driver.getWindowHandles();
				int count = winHandles.size();
				System.out.println("Window Count is : " + count);
				for (String winHandle : winHandles) {
					if (!parent.contains(winHandle)) {
						Thread.sleep(7000);
						driver.switchTo().window(winHandle);
					}

					System.out.println("window Handle Id :" + winHandle);

				}
				System.out.println("Handled");
				
				////////////////////////////////////////////////
				
				/*   Survey  Handle  */
				
				try {
					Thread.sleep(7000);
					Base.click(v.getSurvey_pop_up_close());
				} catch (Exception e) {
					System.out.println("No Survey Button to handle");
				}
				
				
				////////////////////////////////////////////
			//	(//span[@ng-click='requestfor($event)'])
			List<WebElement> request = driver.findElements(By.xpath("//span[contains(text(),'Request for')]"));
			int size = request.size();
			//int size1= size-1;
			System.out.println("Request for Pending  " + size);
			
			
			for (int j = 0; j<=size-1; j++) {
				
				Thread.sleep(10000);
		      request.get(j).click();
		      try {
		      Thread.sleep(6000);
		      driver.findElement(By.id("accept_close")).click();
		      } catch (Exception e) {
				e.getMessage();
			}
			}
			
			System.out.println("All Request Sent Succesfully ");
	   
	   }
	   
	   
	   @Test(enabled=true)
	   public void viewProfileRequesstTestYTW() throws Exception {
		   
		   Inbox i = new Inbox(driver);
		   ShortList s = new ShortList(driver);
		   ViewProfileScroll v = new ViewProfileScroll(driver);
		   Horoscope h = new Horoscope(driver);
		   SortScroll a = new SortScroll(driver);
		   WebDriverWait wait = new WebDriverWait(driver, 60);

		   //////////////////////////////////////////////
			 Actions acc = new Actions(driver);
			 
			 acc.moveToElement(s.getMatches_btn()).build().perform();
			 Thread.sleep(7000);
			 acc.moveToElement(a.getYet_to_viewed()).build().perform();
			 Base.click(a.getYet_to_viewed());

			 /////// Dont show Profile Button Handel///
			 
			 Thread.sleep(7000);
			 
		/*	 Base.click(v.getContact_radio_btn());
			 
			 Base.click(v.getView_radio_btn());
			 
			 Base.click(v.getShortlist_radio_button());
			 
			 Base.click(v.getBlock_radio_btn());
			 
			 Base.click(v.getIgnore_radio_btn());
			 
			 Base.click(v.getDnt_show_submit()); */
			 
			 //////////////////////////////////////////////
			 
			 Thread.sleep(6000);
			 Base.click(v.getView_profile_click());
			 
			 
			 ///////////  Window Handling  
			 
				String parent = driver.getWindowHandle();
				System.out.println("Parent Window ID is  " + parent);
				Thread.sleep(7000);
			 
			 Set<String> winHandles = driver.getWindowHandles();
				int count = winHandles.size();
				System.out.println("Window Count is : " + count);
				for (String winHandle : winHandles) {
					if (!parent.contains(winHandle)) {
						Thread.sleep(7000);
						driver.switchTo().window(winHandle);
					}

					System.out.println("window Handle Id :" + winHandle);

				}
				System.out.println("Handled");
				
				////////////////////////////////////////////////
				
				/*   Survey  Handle  */
				
				try {
					Thread.sleep(7000);
					Base.click(v.getSurvey_pop_up_close());
				} catch (Exception e) {
					System.out.println("No Survey Button to handle");
				}
				
				
				////////////////////////////////////////////
			//	(//span[@ng-click='requestfor($event)'])
			List<WebElement> request = driver.findElements(By.xpath("//span[contains(text(),'Request for')]"));
			int size = request.size();
			//int size1= size-1;
			System.out.println("Request for Pending  " + size);
			
			
			for (int j = 0; j<=size-1; j++) {
				
				Thread.sleep(6000);
		      request.get(j).click();
		      try {
		      Thread.sleep(7000);
		      driver.findElement(By.id("accept_close")).click();
		      } catch (Exception e) {
				e.getMessage();
			}
			}
			
			System.out.println("All Request Sent Succesfully ");
		

	}
	   
	   @Test(enabled=true)
	   public void viewProfileRequesstTestMWML() throws Exception {
		   
		   Inbox i = new Inbox(driver);
		   ShortList s = new ShortList(driver);
		   ViewProfileScroll v = new ViewProfileScroll(driver);
		   Horoscope h = new Horoscope(driver);
		   SortScroll a = new SortScroll(driver);
		   WebDriverWait wait = new WebDriverWait(driver, 60);

		   //////////////////////////////////////////////
			 Actions acc = new Actions(driver);
			 
			 acc.moveToElement(s.getMatches_btn()).build().perform();
			 Thread.sleep(7000);
			 acc.moveToElement(a.getMember_who_might_like_you()).build().perform();
			 Base.click(a.getMember_who_might_like_you());

			 /////// Dont show Profile Button Handel///
			 
			 Thread.sleep(7000);
			 
			 Base.click(v.getContact_radio_btn());
			 
			 Base.click(v.getView_radio_btn());
			 
			 Base.click(v.getShortlist_radio_button());
			 
			 Base.click(v.getBlock_radio_btn());
			 
			 Base.click(v.getIgnore_radio_btn());
			 
			 Base.click(driver.findElement(By.xpath("//*[@id=\"lfm_dontshow\"]/div[3]/input")));
			 
			 //////////////////////////////////////////////
			 
			 Thread.sleep(6000);
			 Base.click(v.getView_profile_click());
			 
			 
			 ///////////  Window Handling  
			 
				String parent = driver.getWindowHandle();
				System.out.println("Parent Window ID is  " + parent);
				Thread.sleep(7000);
			 
			 Set<String> winHandles = driver.getWindowHandles();
				int count = winHandles.size();
				System.out.println("Window Count is : " + count);
				for (String winHandle : winHandles) {
					if (!parent.contains(winHandle)) {
						Thread.sleep(7000);
						driver.switchTo().window(winHandle);
					}

					System.out.println("window Handle Id :" + winHandle);

				}
				System.out.println("Handled");
				
				////////////////////////////////////////////////
				
				/*   Survey  Handle  */
				
				try {
					Thread.sleep(7000);
					Base.click(v.getSurvey_pop_up_close());
				} catch (Exception e) {
					System.out.println("No Survey Button to handle");
				}
				
				
				////////////////////////////////////////////
			//	(//span[@ng-click='requestfor($event)'])
			List<WebElement> request = driver.findElements(By.xpath("//span[contains(text(),'Request for')]"));
			int size = request.size();
			//int size1= size-1;
			System.out.println("Request for Pending  " + size);
			
			
			for (int j = 0; j<=size-1; j++) {
				
				Thread.sleep(6000);
		      request.get(j).click();
		      try {
		      Thread.sleep(7000);
		      driver.findElement(By.id("accept_close")).click();
		      } catch (Exception e) {
				e.getMessage();
			}
			}
			
			System.out.println("All Request Sent Succesfully ");
		

	}
	   
	   @Test(enabled=true)
	   public void viewProfileRequesstTest_Premium_matches() throws Exception {
		
		   Inbox i = new Inbox(driver);
		   ShortList s = new ShortList(driver);
		   ViewProfileScroll v = new ViewProfileScroll(driver);
		   Horoscope h = new Horoscope(driver);
		   SortScroll a = new SortScroll(driver);
		   WebDriverWait wait = new WebDriverWait(driver, 60);

		   //////////////////////////////////////////////
			 Actions acc = new Actions(driver);
			 
			 acc.moveToElement(s.getMatches_btn()).build().perform();
			 Thread.sleep(7000);
			 acc.moveToElement(a.getPremium_members()).build().perform();
			 Base.click(a.getPremium_members());

			 /////// Dont show Profile Button Handel///
			 
		/*	 Thread.sleep(7000);
			 
			 Base.click(v.getContact_radio_btn());
			 
			 Base.click(v.getView_radio_btn());
			 
			 Base.click(v.getShortlist_radio_button());
			 
			 Base.click(v.getBlock_radio_btn());
			 
			 Base.click(v.getIgnore_radio_btn());
			 
			 Base.click(v.getDnt_show_submit());  */
			 
			 //////////////////////////////////////////////
			 
			 Thread.sleep(6000);
			 Base.click(v.getView_profile_click());
			 
			 
			 ///////////  Window Handling  
			 
				String parent = driver.getWindowHandle();
				System.out.println("Parent Window ID is  " + parent);
				Thread.sleep(7000);
			 
			 Set<String> winHandles = driver.getWindowHandles();
				int count = winHandles.size();
				System.out.println("Window Count is : " + count);
				for (String winHandle : winHandles) {
					if (!parent.contains(winHandle)) {
						Thread.sleep(7000);
						driver.switchTo().window(winHandle);
					}

					System.out.println("window Handle Id :" + winHandle);

				}
				System.out.println("Handled");
				
				////////////////////////////////////////////////
				
				/*   Survey  Handle  */
				
				try {
					Thread.sleep(7000);
					Base.click(v.getSurvey_pop_up_close());
				} catch (Exception e) {
					System.out.println("No Survey Button to handle");
				}
				
				
				////////////////////////////////////////////
			//	(//span[@ng-click='requestfor($event)'])
			List<WebElement> request = driver.findElements(By.xpath("//span[contains(text(),'Request for')]"));
			int size = request.size();
			//int size1= size-1;
			System.out.println("Request for Pending  " + size);
			
			
			for (int j = 0; j<=size-1; j++) {
				
				Thread.sleep(6000);
		      request.get(j).click();
		      try {
		      Thread.sleep(7000);
		      driver.findElement(By.id("accept_close")).click();
		      } catch (Exception e) {
				e.getMessage();
			}
			}
			
			System.out.println("All Request Sent Succesfully ");
		
		   

	}
	   
	   @Test(enabled=true)
	   public void viewProfileRequesstTest_mutual_matches() throws InterruptedException {
		
		   Inbox i = new Inbox(driver);
		   ShortList s = new ShortList(driver);
		   ViewProfileScroll v = new ViewProfileScroll(driver);
		   Horoscope h = new Horoscope(driver);
		   SortScroll a = new SortScroll(driver);
		   WebDriverWait wait = new WebDriverWait(driver, 60);

		   //////////////////////////////////////////////
			 Actions acc = new Actions(driver);
			 
			 acc.moveToElement(s.getMatches_btn()).build().perform();
			 Thread.sleep(7000);
			 acc.moveToElement(a.getMutual_matches()).build().perform();
			 Base.click(a.getMutual_matches());

			 /////// Dont show Profile Button Handel///
			 
			 Thread.sleep(7000);
			 
			 Base.click(v.getContact_radio_btn());
			 
			 Base.click(v.getView_radio_btn());
			 
			 Base.click(v.getShortlist_radio_button());
			 
			 Base.click(v.getBlock_radio_btn());
			 
			 Base.click(v.getIgnore_radio_btn());
			 
			 Base.click(driver.findElement(By.xpath("//*[@id=\"mm_dontshow\"]/div[3]/input")));
			 
			 //////////////////////////////////////////////
			 
			 Thread.sleep(6000);
			 Base.click(v.getView_profile_click());
			 
			 
			 ///////////  Window Handling  
			 
				String parent = driver.getWindowHandle();
				System.out.println("Parent Window ID is  " + parent);
				Thread.sleep(7000);
			 
			 Set<String> winHandles = driver.getWindowHandles();
				int count = winHandles.size();
				System.out.println("Window Count is : " + count);
				for (String winHandle : winHandles) {
					if (!parent.contains(winHandle)) {
						Thread.sleep(7000);
						driver.switchTo().window(winHandle);
					}

					System.out.println("window Handle Id :" + winHandle);

				}
				System.out.println("Handled");
				
				////////////////////////////////////////////////
				
				/*   Survey  Handle  */
				
				try {
					Thread.sleep(7000);
					Base.click(v.getSurvey_pop_up_close());
				} catch (Exception e) {
					System.out.println("No Survey Button to handle");
				}
				
				
				////////////////////////////////////////////
			//	(//span[@ng-click='requestfor($event)'])
			List<WebElement> request = driver.findElements(By.xpath("//span[contains(text(),'Request for')]"));
			int size = request.size();
			//int size1= size-1;
			System.out.println("Request for Pending  " + size);
			
			
			for (int j = 0; j<=size-1; j++) {
				
				Thread.sleep(6000);
		      request.get(j).click();
		      try {
		      Thread.sleep(7000);
		      driver.findElement(By.id("accept_close")).click();
		      } catch (Exception e) {
				e.getMessage();
			}
			}
			
			System.out.println("All Request Sent Succesfully ");

	}
	   
	   

}
