package com.testscripts;

import java.util.Set;

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
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.base.Base;
import com.pom.Inbox;
import com.pom.Logout;
import com.pom.MyHomeMatchesCount;

public class MyHomeMatchesCountTest extends Base{
	
	WebDriver driver; 
	
	
	@BeforeSuite
	public void startUp() {
		
		System.setProperty("webdriver.chrome.driver", ".//Driver//chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);
		
	}
	
	
	@Test
	public void LatestmatchesCount() throws InterruptedException {
		

		 Inbox i = new Inbox(driver);
		 MyHomeMatchesCount c = new MyHomeMatchesCount(driver);
		 Actions Acc =  new Actions(driver);
		 JavascriptExecutor js  = (JavascriptExecutor)driver;
		 WebDriverWait wait =  new WebDriverWait(driver, 30);
		 
		 Thread.sleep(3000);
		 driver.get("https://www.communitymatrimony.com");
		 driver.manage().window().maximize();
		 
		 Thread.sleep(1000);
		 Base.click(i.getMatriId());
		 Base.typeData(i.getMatriId(), "AGR755407");
		 
		 Base.click(i.getPaswwordclr());
		 Base.typeData(i.getPassword(), "cbstest1");
		 
		 Base.click(i.getLoginbtn());
		 Thread.sleep(2000);
		 
		 /////////////////////////////////   Intermediate Oages 
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
			Base.click(c.getMy_home());
			try {
				driver.findElement(By.xpath("(//a[@class=\"popupclose\"])[2]")).click();
			} catch (Exception e) {
				// TODO: handle exception
			}
			String parent = driver.getWindowHandle();
			System.out.println(parent);
			/////////////////////////////////////////////////
			Thread.sleep(1000);
			String Latest_coun = c.getLatestmatches_count().getText();
			Integer Latest_count = Integer.parseInt(Latest_coun);
			System.out.println("Latest Matches : "+Latest_count);
			
			Thread.sleep(1000);
			String Yet_to_vie = c.getYetTobe_Count().getText();
			Integer Yet_to_view = Integer.parseInt(Yet_to_vie);
			System.out.println("yet To Be View : "+Yet_to_view);
			
			Thread.sleep(1000);
			String Recently_update = c.getRecently_updated_count().getText();
			Integer Recently_updated = Integer.parseInt(Recently_update);
			System.out.println("Recently Updated : "+Recently_updated);
			
			Thread.sleep(1000);
			String View_not_contacte = c.getView_not_contct_count().getText();
			Integer View_not_contacted = Integer.parseInt(View_not_contacte);
			System.out.println("View Not Contacted : "+View_not_contacted);
			
			Thread.sleep(1000);
			String Viewed_our_mble_n = c.getViewed_mble_no_count().getText();
			Integer Viewed_our_mble_no = Integer.parseInt(Viewed_our_mble_n);
			System.out.println("Mobile Number Viewed : " +Viewed_our_mble_no);
			
			///////////////////////////////////////////////////////////////////////
			
			
			Thread.sleep(2000);
			if (Latest_count>0) {
				
				Thread.sleep(3000);
				Base.click(c.getYetTobe_Count());
				
				Thread.sleep(3000);
				Base.click(c.getLatestmatches_count());    // For this Module - View ALl button is not clickable ( Both Manual and Automation )
				
			
				Thread.sleep(3000);
				Acc.moveToElement(driver.findElement(By.xpath("//*[@id=\"viewall\"]"))).build().perform();
				Thread.sleep(2000);
				js.executeScript("arguments[0].click();", driver.findElement(By.id("viewall")));
				//Base.click(c.getView_all());
				
		try {		Thread.sleep(1000);
				Set<String> child = driver.getWindowHandles();
				System.out.println(child);
				
				for (String handle : child) {
					if (!parent.equals(handle)) {
						
						Thread.sleep(2000);
						driver.switchTo().window(handle);   
					}
				}
		}catch (Exception e) {
						// TODO: handle exception
					}						  
						Thread.sleep(5000);
						String count = c.getVerfy_count().getText();
						Integer Counts = Integer.parseInt(count);
						System.out.println(Counts);   
						
						Thread.sleep(2000);
						if (Latest_count==Counts) {
							
							System.out.println("Count Matched ");
							
						} else {

							System.out.println("Count not Matched ");
							
						}
			/*			
					Thread.sleep(3000);
					driver.close();
					
					Thread.sleep(2000);
					driver.switchTo().window(parent);
						
					}
					
				}
				*/
		
		} else {
			
			 System.out.println("No Latest Matches To view");
		}  
		
			  Thread.sleep(3000);
			  Base.click(c.getMy_home());
			
			////////////////////////    Yet To Be Viewed    /////////////////////////////////
			
	/*		Thread.sleep(2000);
			if (Yet_to_view>0) {
				
				Thread.sleep(3000);
				Base.click(c.getYetTobe_Count());
				
			
				Thread.sleep(10000);
				Base.click(c.getView_all());
				
				Thread.sleep(1000);
				Set<String> child = driver.getWindowHandles();
				System.out.println(child);
				
				for (String handle : child) {
					if (!parent.equals(handle)) {
						
						Thread.sleep(2000);
						driver.switchTo().window(handle);   
						  
						Thread.sleep(5000);
						String count = c.getVerfy_count().getText();
						Integer Counts1 = Integer.parseInt(count);
						System.out.println(Counts1);   
						
						Thread.sleep(2000);
						if (Counts1==Yet_to_view) {
							
							System.out.println("Count Matched ");
							
						} else {

							System.out.println("Count not Matched ");
							
						}
						
					Thread.sleep(3000);
					driver.close();
					
					Thread.sleep(2000);
					driver.switchTo().window(parent);
						
					}
					
				}
				
		
		} else {
			
			 System.out.println("No Latest Matches To view");
		}
			*/
			////////////////////////////////   Recently Updated   /////////////////////////////////////////
	/*	
			Thread.sleep(2000);
			if (Recently_updated>0) {
				
				Thread.sleep(3000);
				Base.click(c.getRecently_updated_count());
				
				
				Thread.sleep(10000);
				Base.click(c.getView_all());
				
				Thread.sleep(1000);
				Set<String> child = driver.getWindowHandles();
				System.out.println(child);
				
				for (String handle : child) {
					if (!parent.equals(handle)) {
						
						Thread.sleep(2000);
						driver.switchTo().window(handle);   
						  
						Thread.sleep(5000);
						String count = c.getVerfy_count().getText();
						Integer Counts = Integer.parseInt(count);
						System.out.println(Counts);   
						
						Thread.sleep(2000);
						if (Recently_updated==Counts) {
							
							System.out.println("Count Matched ");
							
						} else {

							System.out.println("Count not Matched ");
							
						}
						
					Thread.sleep(3000);
					driver.close();
					
					Thread.sleep(2000);
					driver.switchTo().window(parent);
						
					}
					
				}
				
		
		} else {
			
			 System.out.println("No Recent Updated files To view");
		}
			*/
			////////////////////////////////////   Viewed and Not Contacted   //////////////////////////////
			
	/*		

			Thread.sleep(2000);
			if (View_not_contacted>0) {
				
				Thread.sleep(3000);
				Base.click(c.getView_not_contct_count());
				
				
				Thread.sleep(10000);
				Base.click(c.getView_all());
				
				Thread.sleep(1000);
				Set<String> child = driver.getWindowHandles();
				System.out.println(child);
				
				for (String handle : child) {
					if (!parent.equals(handle)) {
						
						Thread.sleep(2000);
						driver.switchTo().window(handle);   
						  
						Thread.sleep(5000);
						String count = c.getVerfy_count().getText();
						Integer Counts = Integer.parseInt(count);
						System.out.println(Counts);   
						
						Thread.sleep(2000);
						if (View_not_contacted==Counts) {
							
							System.out.println("Count Matched ");
							
						} else {

							System.out.println("Count not Matched ");
							
						}
						
					Thread.sleep(3000);
					driver.close();
					
					Thread.sleep(2000);
					driver.switchTo().window(parent);
						
					}
					
				}
				
		
		} else {
			
			 System.out.println("No View not contacted profiles To view");
		}
			
			*/
			/////////////////////////    Viewed Our Mobile Number    ///////////////////////////////////
			
			

			Thread.sleep(2000);
			if (Viewed_our_mble_no>0) {
				
				Thread.sleep(5000);
				wait.until(ExpectedConditions.elementToBeClickable(c.getViewed_mble_no_count()));
				Base.click(c.getViewed_mble_no_count());
				
				
				Thread.sleep(10000);
				Base.click(c.getView_all());
				
				Thread.sleep(1000);
				Set<String> child = driver.getWindowHandles();
				System.out.println(child);
				
				for (String handle : child) {
					if (!parent.equals(handle)) {
						
						Thread.sleep(2000);
						driver.switchTo().window(handle);   
						  
						Thread.sleep(5000);
						String count = c.getVerfy_count().getText();
						Integer Counts = Integer.parseInt(count);
						System.out.println(Counts);   
						
						Thread.sleep(2000);
						if (Viewed_our_mble_no==Counts) {
							
							System.out.println("Count Matched ");
							
						} else {

							System.out.println("Count not Matched ");
							
						}
						
					Thread.sleep(3000);
					driver.close();
					
					Thread.sleep(2000);
					driver.switchTo().window(parent);
						
					}
					
				}
				
		
		} else {
			
			 System.out.println("No one viewed Mobile NUmber");
		}

	}
/*	
	@AfterTest
	public void tearDown() throws Exception {

 Logout l = new  Logout(driver);
 Actions acc = new Actions(driver);
 Thread.sleep(2000);
 acc.moveToElement(l.getLogout_menu()).build().perform();
 
 Thread.sleep(2000);
 acc.moveToElement(l.getLogout_btn()).build().perform();
 Base.click(l.getLogout_btn());
 
 System.out.println("Logged out Successfully");
 
 

	}
*/
}



