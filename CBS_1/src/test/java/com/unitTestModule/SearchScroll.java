package com.unitTestModule;

import java.awt.Robot;

import org.apache.commons.codec.language.bm.Rule.RPattern;
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
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.base.Base;
import com.pom.EditProfile;
import com.pom.Inbox;
import com.pom.Search;

public class SearchScroll extends Base{
	
	  WebDriver driver;
	   
	   
	   @BeforeSuite
	   public void setUp() {
		
		   System.setProperty("webdriver.chrome.driver", "C:\\Users\\amuthan\\eclipse-workspace\\CBS_1\\Driver\\chromedriver.exe");
		   ChromeOptions options = new ChromeOptions();
		   options.addArguments("--disable-notifications");
		   driver = new ChromeDriver(options);
		 

	}
	   
	   @BeforeTest
	   public void searchTest() throws Exception {
		
		   Search s = new Search(driver);
		   Inbox i = new Inbox(driver);
		   EditProfile E  = new EditProfile(driver);
		   Actions acc = new Actions(driver);
		   WebDriverWait wait = new WebDriverWait(driver, 30);
		   JavascriptExecutor js = (JavascriptExecutor)driver;
		   
		   driver.get("https://www.communitymatrimony.com");  
		   driver.manage().window().maximize();
		   System.out.println("Browser Launched successfully");
		   
		   Base.click(i.getMatriId());
		   Base.typeData(s.getMatriId(), "EZH710533");
		   Thread.sleep(2000);
		   
		   Base.click(i.getPaswwordclr());
		   Base.typeData(s.getPassword(), "cbstest1");
		   Thread.sleep(3000);
		   
		   Base.click(s.getLoginbtn());
		   System.out.println("Logged in Successfully");
		   ///////////////////////////////  Intermediate Pages  ////////////////////////// 
		   
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
			
			
			try {
				WebElement skip_matches = driver.findElement(By.xpath("//a[contains(text(),'Skip to Daily Matches >>')]"));
				if (skip_matches.isDisplayed()) {
					skip_matches.click();
					
				}
			} catch (Exception e) {
				System.out.println("No Intermediate pages");
			}
			
			try {
				WebElement element = driver.findElement(By.xpath("/html/body/div[1]/div[2]/a"));
				if (element.isDisplayed()) {
					element.click();
					
				}
			} catch (Exception e) {
				System.out.println("No Intermediate pages");
			}
			
			try {
				WebElement divorcee_intermediate_skip = driver.findElement(By.xpath("/html/body/div[1]/div/div[4]/a"));
				if (divorcee_intermediate_skip.isDisplayed()) {
					divorcee_intermediate_skip.click();
					
				}
			} catch (Exception e) {
				System.out.println("No Intermediate pages");
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
				System.out.println("ADs not Closed");
			}
			 
	   }   
	   ///////////////////////////////   Search Test  /////////////////////////////////////
			 @Test
			 public void regularSearch() throws Exception {
				  Search s = new Search(driver);
				   Inbox i = new Inbox(driver);
				   EditProfile E  = new EditProfile(driver);
				   Actions acc = new Actions(driver);
				   WebDriverWait wait = new WebDriverWait(driver, 30);
				   JavascriptExecutor js = (JavascriptExecutor)driver;
				   

			//driver.navigate().to("https://www.communitymatrimony.com");
			 Thread.sleep(3000);
			// wait.until(ExpectedConditions.elementToBeClickable(s.getSearch()));
			 acc.moveToElement(s.getSearch()).build().perform();
			 acc.moveToElement(s.getRegular_Search()).build().perform();
			 Base.click(s.getRegular_Search());
			
			 Base.select_text(s.getAgeFrom(), "21");
			 
			 Base.select_text(s.getAgeTo(), "27");
			 
			 Base.select_text(s.getHeightFrom(), "5 feet 1 inches");
			 
			 Base.select_text(s.getHeightTo(), "5 feet 7 inches");
			 
			 Base.click(s.getMarital_status_any());
		
			try { Thread.sleep(3000);
			 acc.doubleClick(driver.findElement(By.xpath("//*[@id=\"subcasteTemp\"]/option[2]"))).build().perform();
			 
			 Thread.sleep(3000);
			 acc.doubleClick(driver.findElement(By.xpath("//option[@alt='Malayalam']"))).build().perform();
			 
		 acc.doubleClick(driver.findElement(By.xpath("//option[@alt='India']"))).build().perform();
			 
			 acc.doubleClick(driver.findElement(By.xpath("//*[@id=\"residingStateTemp\"]/option[5]"))).build().perform();
			
			} catch (Exception e) {
				e.getMessage();
			}
			
			
			 Thread.sleep(3000);
			 Base.click(s.getShow_profile_with_photo());
			 
			 Thread.sleep(3000);
			 Base.click(s.getSearch_btn());
			 System.out.println("Edited and searched was completed");
			 
			 Thread.sleep(5000);
			 Base.click(s.getProfile_type_with_photo());
			 System.out.println("View the Profile Photo");
		/////////////////////////////////////////////////////////	 
			 Thread.sleep(5000);
			 String count = s.getProfile_count().getText();
			 System.out.println(count);
			 Integer profile_count = Integer.parseInt(count);
			 int pro = (profile_count/10);
			 System.out.println(pro);
			 Thread.sleep(2000);
		   /////////////////////////////////   Scroll 
		//	 if (pro<=10) {
				 
				 for (int j = 0; j <=pro-1; j++) {
					 System.out.println(j);
					 Thread.sleep(1000);
			
				
				
				 for (int k = 0; k<=12 ; k++) {
					 Thread.sleep(3000);
					 js.executeScript("window.scrollBy(0,350)"); 
					 System.out.println(k);
				 }	
				 
					 try {
					 Base.click(s.getNext_btn());
					 } catch (Exception e) {
						e.getMessage();
					 }

			}	

				
	//		} else {
	//			System.out.println("There is less than 10 Profile");

		//	}
			 
				 System.out.println("Photo Profile scroll was completed ");
	         /////////////////////////////   Profile created scroll       ///////////////

			 Thread.sleep(3000);
		//	 Base.click(s.getProfile_created_within_a_day());
		//	 Base.click(s.getProfile_created_within_a_week());
			 Base.click(s.getProfile_created_within_a_month());
			 
			 Thread.sleep(5000);
			 String count1 = s.getProfile_count().getText();
			 System.out.println(count1);
			 Integer profile_count1 = Integer.parseInt(count1);
			 int pro1 = (profile_count1/10);
			 System.out.println(pro1);
		   /////////////////////////////////   Scroll  
		//	 if (pro1<=10) {
				 for (int l = 0; l <=pro1-1; l++) {
					 System.out.println(l);
					 Thread.sleep(1000);
				
						 for (int m = 0; m<=12 ; m++) {
							 Thread.sleep(3000);
							 js.executeScript("window.scrollBy(0,350)"); 
							 System.out.println(m);
						 }	
						 
							 try {
							 Base.click(s.getNext_btn());
							 } catch (Exception e) {
								e.getMessage();
							}
					
					
				 }
	//		} else {
		//		System.out.println("There is less than 10 Profile");
		//	}
			 
			 
			System.out.println("Photo profile scroll based on created date is completed"); 
			 
			 
			 ////////////////////////    Logout      ///////////////////
			 
	/*		 acc.moveToElement(s.getLogout_menu()).build().perform();
			 Thread.sleep(2000);
			 acc.moveToElement(s.getLogout()).build().perform();
			 Base.click(s.getLogout());
			 System.out.println("Logged out successfully");     */
			 
	   }
	   
	   
	   @Test
	   public void advancedSearch() throws Exception {
		   Search s = new Search(driver);
		   Inbox i = new Inbox(driver);
		   EditProfile E  = new EditProfile(driver);
		   Actions acc = new Actions(driver);
		   WebDriverWait wait = new WebDriverWait(driver, 30);
		   JavascriptExecutor js = (JavascriptExecutor)driver;
		   
		    
			 Thread.sleep(3000);
				// wait.until(ExpectedConditions.elementToBeClickable(s.getSearch()));
				 acc.moveToElement(s.getSearch()).build().perform();
				 acc.moveToElement(s.getAdvanced_search()).build().perform();
				 Base.click(s.getAdvanced_search());
		   
				 Base.select_text(s.getAgeFrom(), "21");
				 
				 Base.select_text(s.getAgeTo(), "27");
				 
				 Base.select_text(s.getHeightFrom(), "5 feet 1 inches");
				 
				 Base.select_text(s.getHeightTo(), "5 feet 7 inches");
				 
				 Base.click(s.getMarital_status_any());
			
					try { Thread.sleep(3000);
					 acc.doubleClick(driver.findElement(By.xpath("//*[@id=\"subcasteTemp\"]/option[2]"))).build().perform();
					 
					 Thread.sleep(3000);
					 acc.doubleClick(driver.findElement(By.xpath("//option[@alt='Malayalam']"))).build().perform();
					 
				 acc.doubleClick(driver.findElement(By.xpath("//option[@alt='India']"))).build().perform();
					 
					 acc.doubleClick(driver.findElement(By.xpath("//*[@id=\"residingStateTemp\"]/option[5]"))).build().perform();
					
					} catch (Exception e) {
						e.getMessage();
					}
					
				 
					Base.click(s.getPhysical_status_normal());
					
					//star   need to code
					
					
					////////////        Loaction     ////   
					
					try { Thread.sleep(3000);
					 acc.doubleClick(driver.findElement(By.xpath("//*[@id=\"subcasteTemp\"]/option[2]"))).build().perform();
					 
					 Thread.sleep(3000);
					 acc.doubleClick(driver.findElement(By.xpath("//option[@alt='Malayalam']"))).build().perform();
					 
				 acc.doubleClick(driver.findElement(By.xpath("//option[@alt='India']"))).build().perform();
					 
					 acc.doubleClick(driver.findElement(By.xpath("//*[@id=\"residingStateTemp\"]/option[5]"))).build().perform();
					
					} catch (Exception e) {
						e.getMessage();
					}
					
					
					
					Base.click(s.getResidingStatus_citizen());
					
					/// education    occupationn    -- need to code 
					
					Base.select_index(s.getAnnual_income(), 4);
					
					
					////////////    Eating , Drinking and Smoking Habits
					
					Base.click(s.getSmoking_habit_non_smoker());
					
					Base.click(s.getDrinking_habit_non_drinker());
					
					Base.click(s.getEating_habit_non_vegeteranian());
					
					Thread.sleep(3000);
					Base.click(s.getSearch_btn());
					
					 Thread.sleep(5000);
					 Base.click(s.getProfile_type_with_photo());
					 System.out.println("View the Profile Photo");
				/////////////////////////////////////////////////////////	 
					 Thread.sleep(5000);
					 String count = s.getProfile_count().getText();
					 System.out.println(count);
					 Integer profile_count = Integer.parseInt(count);
					 int pro = (profile_count/10);
					 System.out.println(pro);
					 Thread.sleep(2000);
				   /////////////////////////////////   Scroll   
					 
			//		 if (pro<=10) {
						 
						 for (int j = 0; j < pro-1; j++) {
							 System.out.println(j);
							 Thread.sleep(1000);
							  
										 
										 for (int m = 0; m<=12 ; m++) {
											 
											 Thread.sleep(3000);
											 js.executeScript("window.scrollBy(0,350)"); 
											 System.out.println(m);
										 }	
										 
											 try {
											 Base.click(s.getNext_btn());
											 } catch (Exception e) {
												e.getMessage();
											}		   
									 }
									 
			//				} else {
			//			System.out.println("There is less than 10 Profile");
			//		}
			
					 System.out.println("Photo Profile scroll was completed ");
			         /////////////////////////////   Profile created scroll       ///////////////

					 Thread.sleep(3000);
				//	 Base.click(s.getProfile_created_within_a_day());
				//	 Base.click(s.getProfile_created_within_a_week());
				//	 Base.click(s.getProfile_created_within_a_month());
					 
					 Thread.sleep(5000);
					 String count1 = s.getProfile_count().getText();
					 System.out.println(count1);
					 Integer profile_count1 = Integer.parseInt(count1);
					 int pro1 = (profile_count1/10);
					 System.out.println(pro1);
				   /////////////////////////////////   Scroll   
				//	 if (pro1<=10) {
						 
						 for (int l = 0; l <=pro1-1; l++) {
							 System.out.println(l);
							 Thread.sleep(1000);
							 
	        
								 
								 for (int m = 0; m<=12 ; m++) {
									 
									 Thread.sleep(3000);
									 js.executeScript("window.scrollBy(0,350)"); 
									 System.out.println(m);
								 }	
								 
									 try {
									 Base.click(s.getNext_btn());
									 } catch (Exception e) {
										e.getMessage();
									}		   
							 }
						
			//		} else {
			//			System.out.println("There is less than 10 Profile");
			//		}
					 

					System.out.println("Photo profile scroll based on created date is completed"); 
				 				 
					 ////////////////////////    Logout      ///////////////////
					 
		/*			 acc.moveToElement(s.getLogout_menu()).build().perform();
					 Thread.sleep(2000);
					 acc.moveToElement(s.getLogout()).build().perform();
					 Base.click(s.getLogout());
					 System.out.println("Logged out successfully");      */
	   }
					 
					 
	   
	   @AfterTest
	   public void tearDown() {
	
		//   driver.quit();
		   System.out.println("Browser Closed Successfully");

	}

}
