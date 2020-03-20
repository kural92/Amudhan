package com.unitTestModule;

import java.util.List;
import java.util.Random;

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
import com.pom.Privacy;

public class PrivacySettings extends Base{
	
	WebDriver driver;
	
	@BeforeTest
	public void startUp() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\amuthan\\eclipse-workspace\\CBS_1\\Driver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);
		
	}
	
	@Test(enabled=true)
	public void privacyTest() throws Exception {
		
    ////
		Inbox i = new Inbox(driver);
		Privacy p = new Privacy(driver);
		Actions acc = new Actions(driver);
		JavascriptExecutor js  = (JavascriptExecutor)driver;
		WebDriverWait wait = new WebDriverWait(driver, 60);
		     		                                           ////
		
		
		driver.get("https://www.communitymatrimony.com");
		driver.manage().window().maximize();
		
		Base.click(i.getMatriId());
		Base.typeData(i.getMatriId(), "EZH710533");
		
		Base.click(i.getPaswwordclr());
		Base.typeData(i.getPassword(), "cbstest1");
		
		Base.click(i.getLoginbtn());
		Thread.sleep(3000);
		
		//////////    Intermediate Pages    /////////
		
		  try {WebElement photo_add = driver.findElement(By.xpath("/html/body/div[2]/a"));
				if (photo_add.isDisplayed()) {
					photo_add.click();
					driver.findElement(By.xpath("//*[@id=\"conform\"]/div/div/div/a[1]")).click();
					driver.findElement(By.xpath("//*[@id=\"reason3\"]")).click();
					driver.findElement(By.xpath("//*[@id=\"skipphotoclick\"]")).click();
				}
			} catch (Exception e) {
				System.out.println("NO Photo Page to Skip");
			}
			
			                                    /*  *********   */
			try { WebElement skip_matches = driver.findElement(By.xpath("//a[contains(text(),'Skip to Daily Matches >>')]"));
				if (skip_matches.isDisplayed()) {
					skip_matches.click();
				}
			} catch (Exception e) {
				System.out.println("No Intermediate pages");
			}
			
			                              /*  *********   */
			try { WebElement element = driver.findElement(By.xpath("/html/body/div[1]/div[2]/a"));
				if (element.isDisplayed()) {
					element.click();	
				}
			} catch (Exception e) {
				System.out.println("No Intermediate pages");
			}
			                                 /*  *********   */
			try {WebElement divorcee_intermediate_skip = driver.findElement(By.xpath("/html/body/div[1]/div/div[4]/a"));
				if (divorcee_intermediate_skip.isDisplayed()) {
					divorcee_intermediate_skip.click();	
				}
			} catch (Exception e) {
				System.out.println("No Intermediate pages");
			}
			
			                             /*  *********   */
			try { driver.findElement(By.xpath("//*[@id=\"conform\"]/div/div/div/a[1]")).click();
			} catch (Exception e) {
				System.out.println("No Intermediate pages");
			}
			
			// AD Pages
			                 /*  *********   */
			Thread.sleep(3000);
			 try {
				 driver.findElement(By.xpath("//*[@id=\"special_offer_lightpic1\"]/div[1]/div/a/img")).click();
			} catch (Exception e) {
				System.out.println("ADs not Closed");
			}
			 Thread.sleep(3000);
			 
			 /////////////////////////////////////////////////////////////////////////////////////////////////////
			 
			 acc.moveToElement(p.getLogout_menu()).build().perform();
			 Thread.sleep(1000);
			 
			 acc.moveToElement(p.getPrivacy_settings()).build().perform();
			 Base.click(p.getPrivacy_settings());
			 Thread.sleep(3000);
			 
			 ////////////////////////    Photo Privacy Setting     ////////////////////////////////
			 
			 
			  /*     Sample to verify the Checked box and selected radio box condition    
			 
			 if (driver.findElement(By.id("pset1")).isEnabled()) {
				 
				 System.out.println("Already Photo Visible radio button is checked");
				
			} else { Thread.sleep(2000);

				 Base.click(p.getPhoto_visible_radio_btn());
				 System.out.println("Photo Visible");
			}
			 */
		
			 


			 
			 
			 /////////////////////////    Phone Privacy Settings   //////////////////////////
			 
			 Base.click(p.getPhone_privacy_settings());
			 
			 Base.click(p.getShow_mble_no_to_paid_user());
			 
			 Base.click(p.getMble_no_visible_only_access_radio_btn());
			 
			 Base.click(p.getMble_save_btn());
			 
			 
			 /////////////////////////  Horosope  Privacy  Setting    //////////////////////////////////
			 
			 Base.click(p.getHoroscope_privacy_settings());
			 
			 Base.click(p.getHoroscope_view_all());
			 
			 Base.click(p.getHoroscope_visible_only_access_radio_btn());
			 
			 Base.click(p.getHoroscope_save_btn());

			 
			 /////////////////////////    Profile View        ///////////////////////////////////////////////
			 
			 Base.click(p.getProfile_view_privacy_settings());
			 
			 Base.click(p.getOther_know_viewedProfile());
			 
			 Base.click(p.getOther_know_shortlisted());
			 
			 Base.click(p.getProfile_view_save_btn());   
			  
			 //////////////////////////////                 //////////////////////////////////
			 
	   }   
		
		@Test
		public void unsubscribeCalling() throws Exception {
			
			Inbox i = new Inbox(driver);
			Privacy p = new Privacy(driver);
			Actions acc = new Actions(driver);
			JavascriptExecutor js  = (JavascriptExecutor)driver;
			WebDriverWait wait = new WebDriverWait(driver, 60);
			     		                                           ////
			
			
			driver.get("https://www.communitymatrimony.com");
			driver.manage().window().maximize();
			
			Base.click(i.getMatriId());
			Base.typeData(i.getMatriId(), "EZH710533");
			
			Base.click(i.getPaswwordclr());
			Base.typeData(i.getPassword(), "cbstest1");
			
			Base.click(i.getLoginbtn());
			Thread.sleep(3000);
			
			//////////    Intermediate Pages    /////////
			
			  try {WebElement photo_add = driver.findElement(By.xpath("/html/body/div[2]/a"));
					if (photo_add.isDisplayed()) {
						photo_add.click();
						driver.findElement(By.xpath("//*[@id=\"conform\"]/div/div/div/a[1]")).click();
						driver.findElement(By.xpath("//*[@id=\"reason3\"]")).click();
						driver.findElement(By.xpath("//*[@id=\"skipphotoclick\"]")).click();
					}
				} catch (Exception e) {
					System.out.println("NO Photo Page to Skip");
				}
				
				                                    /*  *********   */
				try { WebElement skip_matches = driver.findElement(By.xpath("//a[contains(text(),'Skip to Daily Matches >>')]"));
					if (skip_matches.isDisplayed()) {
						skip_matches.click();
					}
				} catch (Exception e) {
					System.out.println("No Intermediate pages");
				}
				
				                              /*  *********   */
				try { WebElement element = driver.findElement(By.xpath("/html/body/div[1]/div[2]/a"));
					if (element.isDisplayed()) {
						element.click();	
					}
				} catch (Exception e) {
					System.out.println("No Intermediate pages");
				}
				                                 /*  *********   */
				try {WebElement divorcee_intermediate_skip = driver.findElement(By.xpath("/html/body/div[1]/div/div[4]/a"));
					if (divorcee_intermediate_skip.isDisplayed()) {
						divorcee_intermediate_skip.click();	
					}
				} catch (Exception e) {
					System.out.println("No Intermediate pages");
				}
				
				                             /*  *********   */
				try { driver.findElement(By.xpath("//*[@id=\"conform\"]/div/div/div/a[1]")).click();
				} catch (Exception e) {
					System.out.println("No Intermediate pages");
				}
				
				// AD Pages
				                 /*  *********   */
				Thread.sleep(3000);
				 try {
					 driver.findElement(By.xpath("//*[@id=\"special_offer_lightpic1\"]/div[1]/div/a/img")).click();
				} catch (Exception e) {
					System.out.println("ADs not Closed");
				}
				 Thread.sleep(3000);
				 /////////////////////////////////////////////////////////////////////////////////////////////////////
				 
				 acc.moveToElement(p.getLogout_menu()).build().perform();
				 Thread.sleep(1000);
				 
				 acc.moveToElement(p.getPrivacy_settings()).build().perform();
				 Base.click(p.getPrivacy_settings());
				 Thread.sleep(3000);
				 
				 ///////////////////////////////////////////////////////////////////////////////////////////
				 
				/* Base.click(p.getUnsubscribe_call_privacy_settings());
				 Thread.sleep(3000);
				 
				 List<WebElement> options = driver.findElements(By.xpath("//*[starts-with(@id, 'radio')]")) ;
				    Random random = new Random();
				    int index = random.nextInt(options.size());
				    options.get(index).click(); 
				    Thread.sleep(3000);
				    Base.click(p.getUnsub_call_submit_btn());
				    
				    Thread.sleep(3000);
				    try {
						driver.findElement(By.xpath("(//input[@value=\"Yes\"])[2]")).click();
					} catch (Exception e) {
						System.out.println("* * * * * * * * * ");
					}*/

		}
		
		
		
		
		
		@Test
		public void privacyCondition() throws Exception {
			
			
			Inbox i = new Inbox(driver);
			Privacy p = new Privacy(driver);
			Actions acc = new Actions(driver);
			JavascriptExecutor js  = (JavascriptExecutor)driver;
			WebDriverWait wait = new WebDriverWait(driver, 60);
			     		                                           ////
			
			
			driver.get("https://www.communitymatrimony.com");
			driver.manage().window().maximize();
			
			Base.click(i.getMatriId());
			Base.typeData(i.getMatriId(), "Ezh811385");
			
			Base.click(i.getPaswwordclr());
			Base.typeData(i.getPassword(), "cbstest");
			
			Base.click(i.getLoginbtn());
			Thread.sleep(3000);
			
			//////////    Intermediate Pages    /////////
			
			  try {WebElement photo_add = driver.findElement(By.xpath("/html/body/div[2]/a"));
					if (photo_add.isDisplayed()) {
						photo_add.click();
						driver.findElement(By.xpath("//*[@id=\"conform\"]/div/div/div/a[1]")).click();
						driver.findElement(By.xpath("//*[@id=\"reason3\"]")).click();
						driver.findElement(By.xpath("//*[@id=\"skipphotoclick\"]")).click();
					}
				} catch (Exception e) {
					System.out.println("NO Photo Page to Skip");
				}
				
				                                    /*  *********   */
				try { WebElement skip_matches = driver.findElement(By.xpath("//a[contains(text(),'Skip to Daily Matches >>')]"));
					if (skip_matches.isDisplayed()) {
						skip_matches.click();
					}
				} catch (Exception e) {
					System.out.println("No Intermediate pages");
				}
				
				                              /*  *********   */
				try { WebElement element = driver.findElement(By.xpath("/html/body/div[1]/div[2]/a"));
					if (element.isDisplayed()) {
						element.click();	
					}
				} catch (Exception e) {
					System.out.println("No Intermediate pages");
				}
				                                 /*  *********   */
				try {WebElement divorcee_intermediate_skip = driver.findElement(By.xpath("/html/body/div[1]/div/div[4]/a"));
					if (divorcee_intermediate_skip.isDisplayed()) {
						divorcee_intermediate_skip.click();	
					}
				} catch (Exception e) {
					System.out.println("No Intermediate pages");
				}
				
				                             /*  *********   */
				try { driver.findElement(By.xpath("//*[@id=\"conform\"]/div/div/div/a[1]")).click();
				} catch (Exception e) {
					System.out.println("No Intermediate pages");
				}
				
				// AD Pages
				                 /*  *********   */
				Thread.sleep(3000);
				 try {
					 driver.findElement(By.xpath("//*[@id=\"special_offer_lightpic1\"]/div[1]/div/a/img")).click();
				} catch (Exception e) {
					System.out.println("ADs not Closed");
				}
				 Thread.sleep(3000);
				 
				 /////////////////////////////////////////////////////////////////////////////////////////////////////
				 
				 acc.moveToElement(p.getLogout_menu()).build().perform();
				 Thread.sleep(1000);
				 
				 acc.moveToElement(p.getPrivacy_settings()).build().perform();
				 Base.click(p.getPrivacy_settings());
				 Thread.sleep(3000);
				 
				 
				 //////////////////////////////    Photo  Privacy  /////////////////////
				 
				 
				 if (p.getPhoto_visible_radio_btn().isEnabled()) {
					 
					 Base.click(p.getPhoto_visible_only_access_radio_btn());
					
				} else {
					
					Base.click(p.getPhoto_visible_radio_btn());

				}
	
				 Base.click(p.getPhoto_save_btn());
				 Thread.sleep(3000);
				 
				 
				 /////////////////////////    Phone Privacy Settings   //////////////////////////
				 
				 Base.click(p.getPhone_privacy_settings());
				 
				 if (p.getShow_mble_no_to_paid_user().isEnabled()) {
					 
					 Base.click(p.getMble_no_visible_only_access_radio_btn());
					
				} else {
					
					 Base.click(p.getShow_mble_no_to_paid_user());

				}
				 
				 Base.click(p.getMble_save_btn());
				 Thread.sleep(3000);
				 
				 
				 /////////////////////////  Horosope  Privacy  Setting    //////////////////////////////////
				 
				 Base.click(p.getHoroscope_privacy_settings());
				 
				 if (p.getHoroscope_view_all().isEnabled()) {
					 
					 Base.click(p.getHoroscope_visible_only_access_radio_btn());
					
				} else {
					
					 Base.click(p.getHoroscope_view_all());

				}
				 
				 Base.click(p.getHoroscope_save_btn());
				 Thread.sleep(3000);
				 
				 /////////////////////////    Profile View        ///////////////////////////////////////////////
				 
				 Base.click(p.getProfile_view_privacy_settings());
				 
				 if (p.getOther_know_viewedProfile().isEnabled() && p.getOther_know_shortlisted().isEnabled()) {
					 
					 Base.click(p.getOther_know_viewedProfile());
					 
					 Base.click(p.getOther_know_shortlisted());
					
				} else {
					
				      System.out.println("Profile view settings Already deselected");

				}
				 
				 Base.click(p.getProfile_view_save_btn());   
				 
/////////////////////////////     Logout    //////////////////
					
	Thread.sleep(2000);
	Logout l = new Logout(driver);
	acc.moveToElement(l.getLogout_menu()).build().perform();
	Thread.sleep(1000);

	acc.moveToElement(l.getLogout_btn()).build().perform();
	Base.click(l.getLogout_btn());


		}

		
		
	}
	


