package com.testscripts;

import java.util.List;

import org.apache.commons.collections.iterators.ListIteratorWrapper;
import org.apache.commons.collections.set.SynchronizedSortedSet;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.Base;
import com.pom.Inbox;


public class InboxTest extends Base {
	
	WebDriver driver;
	String Requested_Id=null;
	String requested_deatils=null;
	
   @BeforeMethod
   public void setUp() {
	System.setProperty("webdriver.chrome.driver", ".//Driver//chromedriver.exe");
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--disable-notifications");
	driver = new ChromeDriver(options);
	

}
   
   @Test
   public void testCase() throws InterruptedException {
	
	   Inbox i = new Inbox(driver);
	   
	   driver.navigate().to("https://www.communitymatrimony.com");
	   driver.manage().window().maximize();
	   
	   Base.click(i.getMatriId());
	   Base.typeData(i.getMatriId(), "AGR100176");
	   
	   Base.click(i.getPaswwordclr());
	   Base.typeData(i.getPassword(), "cbstest");
	   
	   Base.click(i.getLoginbtn());
	   
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
		 
		 
		 Thread.sleep(3000); 
		 Base.click(i.getInboxbtn());
		 
	/*	 Thread.sleep(3000);
		// Base.click(i.getPendinginterest());
		 
		
	//	 try {
		// Base.click(i.getAcceptinterest());
		 Thread.sleep(3000);
		 WebDriverWait wait = new WebDriverWait(driver, 10);
		 wait.until(ExpectedConditions.elementToBeClickable( driver.findElement(By.id("RMPENDINGINT1")))).click();
			// driver.findElement(By.xpath("RMPENDINGINT1")).click();
			 if (driver.findElement(By.id("acceptdiv0")).isDisplayed()) {
				 
				 Thread.sleep(1000);
				 String ID = driver.findElement(By.xpath("//*[@id=\"num0\"]/div[2]/div[2]/div[2]/div/div[1]")).getText();
				 System.out.println(ID);
				 
				 driver.findElement(By.id("acceptdiv0")).click();
				
				 
			// String Accepted_Id = driver.findElement(By.id("delete_msg_val")).getText();
	   	//	System.out.println("Accepted ID " +Accepted_Id);
	   		
	   		Actions A = new Actions(driver);
	   	 WebElement pop_up = driver.findElement(By.xpath("//*[@id=\"delete_confirm\"]/div/div/div/div[1]/div[2]/a"));
		 A.moveToElement(pop_up).click().perform();
		 
		 
			} else {
				 System.out.println("There is no Id");
			}
		
		// }  catch (Exception e) {
		//	 System.out.println("There is no Id");
		// }
		 
		 
	//	 try {
			 Thread.sleep(5000);
			 driver.findElement(By.xpath("RMPENDINGMSG1")).click();
			 
			 if (driver.findElement(By.xpath("//div[@class='mediumhdrtxt clr1 padl5']")).isDisplayed()) {
				 
				// String ID = driver.findElement(By.xpath("//*[@id=\"num0\"]/div[2]/div[2]/div[2]/div/div[1]")).getText();
			//	 System.out.println(ID);
				 
				 driver.findElement(By.id("repdiv0")).click();
				 
				 driver.findElement(By.id("txtval0")).sendKeys("Hi");
				 
			//	 Alert a =  driver.switchTo().alert();
			//	 a.dismiss();
				 
			//   String Accepted_Id = driver.findElement(By.id("delete_msg_val")).getText();
	   		 //   System.out.println("Mail sent ID" +Accepted_Id);
				
			} else {
				System.out.println("There is no mail to reply");
			} 
			 
		// } catch (Exception e) {
			 
		//	 System.out.println("There is no mail to reply");
			 
	//	 }
			//*[@id="lookingStatus2"] and Checked 
		 
		 Thread.sleep(3000);
		// try {
		 WebElement acceptinterest = driver.findElement(By.id("acceptdiv0"));
	     if (acceptinterest.isDisplayed()) {
			acceptinterest.click();
			String Accepted_Id = driver.findElement(By.id("delete_msg_val")).getText();
			
			System.out.println("Accepted ID " +Accepted_Id);
	     
			 Thread.sleep(3000);	
			 driver.switchTo().frame(0);
			 
		driver.findElement(By.xpath("//*[@id=\"delete_confirm\"]/div/div/div/div[1]/div[2]/a")).click();
		
	    
		} else {
            System.out.println("There is no Interest to Accept or Decline");
		}
	//	 } catch (Exception e) {
	//    	 System.out.println("There is no id to accept");
	//     }
			
	     
	   
	    // Base.click(i.getPendingmessage());
	     
	     Thread.sleep(3000);
	//     try {
	 WebElement replymessage = driver.findElement(By.id("repdiv0"));
		 if (replymessage.isDisplayed()) {
			replymessage.sendKeys(" Hi ");
			//Thread.sleep(3000);
		//	driver.findElement(By.id("repdiv0")).sendKeys(" Hi ");
			Thread.sleep(3000);
			driver.findElement(By.id("send0")).click();
			 Thread.sleep(3000);
			driver.findElement(By.id("delete_confirm")).click();
		} else {
			
			System.out.println("There is no Messages to reply or Decline");
	     } 
	  //   }catch (Exception e) {
	  //  		System.out.println("There is no Messages to reply or Decline");
	//	}
*/
   
	     


//////////////////////////////////////////////////////////////////////////////////////////
		   Thread.sleep(5000);
		 driver.findElement(By.id("RMPENDINGINT")).click();
	     Thread.sleep(2000);  try {
		 if ( driver.findElement(By.id("acceptdiv0")).isEnabled()) {
			 Thread.sleep(2000);
			 driver.findElement(By.id("acceptdiv0")).click();
			 Thread.sleep(2000);
			 driver.findElement(By.xpath("(//a[@class='popupclose popup-close-off'])[6]")).click();
			
		} else {
			System.out.println("There is no Matri ID to accept");

		}  
	     } catch (Exception e) {System.out.println("No Pending Interest"); }
		 
		 Thread.sleep(5000);
		 driver.findElement(By.id("RMPENDINGMSG1")).click();
		 Thread.sleep(2000); try {
		 if (driver.findElement(By.id("repdiv0")).isEnabled()) {
			 Thread.sleep(2000);
			 driver.findElement(By.id("repdiv0")).click();
			 Thread.sleep(5000);
			 driver.findElement(By.id("txtval0")).sendKeys("Hai");
			 Thread.sleep(2000);
			 driver.findElement(By.id("send0")).click();
			 Thread.sleep(2000);
			 driver.findElement(By.xpath("(//a[@class='popupclose popup-close-off'])[7]")).click();
		} else {
			   System.out.println("There is no Mail to reply");

		} } catch (Exception e) {
			System.out.println("No Pending Messages");
		}
		 
		 System.out.println("Accepted Interest Details");
		 
	 Thread.sleep(5000);
		 driver.findElement(By.id("RMACCEPTEDINT1")).click();
		 Thread.sleep(2000);
		 if (driver.findElement(By.id("num0")).isDisplayed()) {
			 
			 System.out.println("The accepted Interest are");//div[@class='srcbdr bgclr5 mrgb10']
			 List<WebElement> Accepted_Id = driver.findElements(By.xpath("//div[@class='pad8']"));
			 for (int j = 0; j < Accepted_Id.size(); j++) {
				 String ID = Accepted_Id.get(j).getText();
				 System.out.println("The Accepted Profile Details " + ID);
				 Thread.sleep(5000);
				/* try {
				   if (driver.findElement(By.xpath("//a[@onclick='pagination(1);']")).isEnabled()) {
					   Thread.sleep(5000);
					   driver.findElement(By.xpath("//a[@onclick='pagination(1);']")).click();
					   List<WebElement> Accepted_Id1 = driver.findElements(By.xpath("//div[@class='pad8']"));
						 for (int k = 0; k < Accepted_Id1.size(); k++) {
							 String ID1= Accepted_Id1.get(k).getText();
							 System.out.println("The Accepted Profile Details " + ID1);
					
				} } else {
					System.out.println("You are in Last Page");
 
				} } catch (Exception e ) {System.out.println("You are in Last Page");}*/
				
			}
		//	 Thread.sleep(2000);
			// String Acceptred_Id = driver.findElement(By.xpath("//*[@id=\"num0\"]")).getText();
		//	 System.out.println(Acceptred_Id);
			
		} else {
			System.out.println("There is no Accepted Matri ID's");

		}   
		 
  ///////////////////////////////////////////////////////////////////////////////////////
		 Thread.sleep(5000);
		 driver.findElement(By.id("RMDECLINEDMSG1")).click();
		 
		 Thread.sleep(2000);
		 if (driver.findElement(By.id("num0")).isDisplayed()) {
			 
			 System.out.println("The declined messages are");//div[@class='srcbdr bgclr5 mrgb10']
			 List<WebElement> Accepted_Id2 = driver.findElements(By.xpath("//div[@class='pad8']"));
			 for (int j1 = 0; j1 < Accepted_Id2.size(); j1++) {
				 String ID2 = Accepted_Id2.get(j1).getText();
				 System.out.println("The Declined Profile Details " + ID2);
			 }Thread.sleep(5000);
				/* try {
				   if (driver.findElement(By.xpath("//a[@onclick='pagination(1);']")).isEnabled()) {
					   Thread.sleep(5000);
					   driver.findElement(By.xpath("//a[@onclick='pagination(1);']")).click();
					   List<WebElement> Accepted_Id3 = driver.findElements(By.xpath("//div[@class='pad8']"));
						 for (int k1 = 0; k1 < Accepted_Id3.size(); k1++) {
							 String ID3= Accepted_Id3.get(k1).getText();
							 System.out.println("The declined Profile Details " + ID3);
						 
				} }
				  else {
						System.out.println("You are in Last Page");
				  }} catch (Exception e) {
					e.getMessage(); }*/
				
 
				} else {
					System.out.println("There is no declined Matri ID's");
				
				}
		 
		 
		 
		 ///////////////////////////////////////////////////////////////////////////////////
		 
		 System.out.println("The Declined Interesrt are");
		 
		 Thread.sleep(5000);
		 driver.findElement(By.id("RMDECLINEDINT")).click();
		 
		 Thread.sleep(2000);
		 if (driver.findElement(By.id("num0")).isDisplayed()) {
			 
			 System.out.println("The declined Interest are");//div[@class='srcbdr bgclr5 mrgb10']
			 List<WebElement> Accepted_Id3 = driver.findElements(By.xpath("//div[@class='pad8']"));
			 for (int j2 = 0; j2 < Accepted_Id3.size(); j2++) {
				 String ID3 = Accepted_Id3.get(j2).getText();
				 System.out.println("The Declined Profile Details " + ID3);
			 }Thread.sleep(5000);
				/* try {
				   if (driver.findElement(By.xpath("//a[@onclick='pagination(1);']")).isEnabled()) {
					   Thread.sleep(5000);
					   driver.findElement(By.xpath("//a[@onclick='pagination(1);']")).click();
					   List<WebElement> Accepted_Id4 = driver.findElements(By.xpath("//div[@class='pad8']"));
						 for (int k2 = 0; k2 < Accepted_Id4.size(); k2++) {
							 String ID4= Accepted_Id4.get(k2).getText();
							 System.out.println("The declined Profile Details " + ID4);
						 
				} }
				  else {
						System.out.println("You are in Last Page");
				  }} catch (Exception e) {
					e.getMessage(); }*/
				
 
				} else {
					System.out.println("There is no declined Matri ID's");
				
				}
		 
		 
		 /////////////////////////////////////////////////////////////////////////////////
		 
		 
		 System.out.println("The replied messages are ");
		 
		 Thread.sleep(5000);
		 driver.findElement(By.id("SMREPLIEDMSG1")).click();
		 
		 Thread.sleep(2000);
		 try {
			 if (driver.findElement(By.id("num0")).isDisplayed()) {
				 
				 Thread.sleep(2000);
				List<WebElement> reply_message = driver.findElements(By.xpath("//div[@class='pad8']"));
				
				for (int l = 0; l < reply_message.size(); l++) {
					
					String IDs = reply_message.get(l).getText();
					System.out.println("The replied messabes are " + IDs);
					
				}	 
			 } else {
				System.out.println("There is no replied messages");
			}
			 } catch (Exception e) {
				System.out.println("There is no replied messages");
			}
	
		 ///////////////////////////////////////////////////////////////////////////////////////////////////////
		 
		 
		 System.out.println("Request Received ");
		 
		 
		 Thread.sleep(5000);
		 driver.findElement(By.id("RRALL_LEFT")).click();
		 
		 try {
			 
			 if(driver.findElement(By.id("num0")).isDisplayed())  {
				 
				 Thread.sleep(2000);
				 List<WebElement> request_received = driver.findElements(By.xpath("//div[@class='fleft ']"));
						 for (int m = 0; m < request_received.size(); m++) {
						Requested_Id = request_received.get(m).getText();
							 System.out.println(Requested_Id);
							
						
						 }	
						 
				List<WebElement> requested_for = driver.findElements(By.xpath("//div[@class='padl15 padr10 padb10']"));
				for (int n = 0; n < requested_for.size(); n++) {
					requested_deatils = requested_for.get(n).getText();
					System.out.println(requested_deatils);
					
				//	System.out.println(Requested_Id + " " + requested_deatils);
					
				}
				//  System.out.println(Requested_Id +" " + requested_deatils);
						 	
			 } else {
				System.out.println("No request received");
			}
			  
		 } catch (Exception e) {
			System.out.println("No request received");
		}
		 
		 
		 /////////////////////////////////////////////////////////////////
		 
		 System.out.println("Chat conversation details");
		 
		 Thread.sleep(5000);
		 driver.findElement(By.id("CHAT_LEFT")).click();
		 
		 try {
			 if (driver.findElement(By.id("num0")).isDisplayed()) {
				 Thread.sleep(2000);
				 List<WebElement> chat_history = driver.findElements(By.xpath("//div[@class='srcbdr bgclr5 mrgb10']"));
				 for (int o = 1; o < chat_history.size(); o++) {
					 String Chat_historys = chat_history.get(o).getText();
					 System.out.println("***"+Chat_historys);
					 Thread.sleep(2000);
					 driver.findElement(By.xpath("(//a[contains(text(),'Click Here')])["+o+"]")).click();
					
					//(//div[@class='mediumhdrtxt-h clr5 padb5'])["+o+"]
					Thread.sleep(2000);
					String Chat_conversion = driver.findElement(By.xpath("//*[@id=\"chat_msg_val\"]/text()[1]")).getText();
					System.out.println("The conversations are "  + Chat_conversion);
					try {
						Thread.sleep(2000);
					if (driver.findElement(By.xpath("//*[@id=\"chat_msg_val\"]/text()["+o+"]")).isDisplayed()) {
						
						String Chat_Details = driver.findElement(By.xpath("//*[@id=\"chat_msg_val\"]/text()["+o+"]")).getText();
						System.out.println(Chat_Details);
						
					} else {
						System.out.println(".....");

					} } catch (Exception e) {
						e.getMessage();
					}
					Thread.sleep(2000);
					driver.findElement(By.xpath("(//input[@class='popupclose'])[7]")).click();
					
				}
				
			} else {
				System.out.println("No chat history");

			}
		 }  catch (Exception e) {
			System.out.println("No Chat history");
		}
		 
		 
		 
		 
		 
				
   }	 
   
   
   @AfterTest
   public void tearDowwn() {
	//driver.quit();
}
   }
   



