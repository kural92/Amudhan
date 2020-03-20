package com.testscripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.base.Base;
import com.pom.WhoShortListMe;

public class WhoViewMyMobileNoTest extends Base {
	
	WebDriver driver;
	
	
	@BeforeSuite
	public void startUp() {


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\amuthan\\eclipse-workspace\\CBS_1\\Driver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);

	}
	
	
	@Test
	public void whoShortListedMe() throws Exception {
		
		WhoShortListMe w =new WhoShortListMe(driver);
		Actions acc= new Actions(driver);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		driver.get("https://www.communitymatrimony.com");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		
		
		Base.click(w.getMatriId());
		Base.typeData(w.getMatriId(), "BRH1393126");
		Thread.sleep(2000);
		
	    Base.click(w.getPaswwordclr());
		//Base.clear(s.getPaswwordclr());
		Thread.sleep(2000);
		
	//	Base.click(s.getPassword());
		Base.typeData(w.getPassword(), "test4cbs");
		Thread.sleep(2000);
		
		Base.click(w.getLoginbtn());
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
				System.out.println("1 Photo Page Skipped");
			}
			
			
			try {
				WebElement skip_matches = driver.findElement(By.xpath("//a[contains(text(),'Skip to Daily Matches >>')]"));
				if (skip_matches.isDisplayed()) {
					skip_matches.click();
					
				}
			} catch (Exception e) {
				System.out.println("2 Intermediate pages handled");
			}
			
			try {
				WebElement element = driver.findElement(By.xpath("/html/body/div[1]/div[2]/a"));
				if (element.isDisplayed()) {
					element.click();
					
				}
			} catch (Exception e) {
				System.out.println("3 Intermediate pages handled");
			}
			//////////////////////  New ly Added  ///////////////////////////////
			try {
				WebElement skip_to_matriony = driver.findElement(By.xpath("/html/body/header/div/div/div/a"));
				if (skip_to_matriony.isDisplayed()) {
					skip_to_matriony.click();
				}
			} catch (Exception e) {
				System.out.println("4 Intermediate pages handled");
			}
			
			
			try {
				WebElement skip_to_matrimony1 = driver.findElement(By.xpath("/html/body/div[3]/a"));
				if (skip_to_matrimony1.isDisplayed()) {
					skip_to_matrimony1.click();
				}
			} catch (Exception e) {
				System.out.println("5 Intermediate pages handled");
			}
			
			
			////////////////////////////////////////////////////////////////////////////////////
			
			/*try {
				WebElement divorcee_intermediate_skip = driver.findElement(By.xpath("/html/body/div[1]/div/div[4]/a"));
				if (divorcee_intermediate_skip.isDisplayed()) {
					divorcee_intermediate_skip.click();
					
				}
			} catch (Exception e) {
				System.out.println("6 Intermediate pages handled");
			}*/
			
			
			try {
				
				WebElement horoscope = driver.findElement(By.xpath("//*[@id=\"conform\"]/div/div/div/a[1]"));
				if (horoscope.isDisplayed()) {
					horoscope.click();
				}
			} catch (Exception e) {
				System.out.println("7 No Intermediate pages");
			}
			
			
			try {
				driver.findElement(By.xpath("//*[@id=\"conform\"]/div/div/div/a[1]")).click();
			} catch (Exception e) {
				System.out.println("8 No Intermediate pages");
			}
			// AD Pages
			 
			 try {
				 driver.findElement(By.xpath("//*[@id=\"special_offer_lightpic1\"]/div[1]/div/a/img")).click();
			} catch (Exception e) {
				System.out.println("9 ADs Closed Successfully");
			}
	
	
			 Thread.sleep(3000);
			 acc.moveToElement(w.getMy_home()).build().perform();
			 Thread.sleep(1000);
			 
			 acc.moveToElement(w.getWho_view_my_mble_no()).build().perform();
			 Thread.sleep(1000);
			 Base.click(w.getWho_view_my_mble_no());
			 Thread.sleep(3000);
			 
			 
			 String Mobile_View_count = w.getMble_no_view_count().getText();
			 System.out.println(Mobile_View_count);
			 
			 Integer count = Integer.parseInt(Mobile_View_count);
			 System.out.println(count);
			 
			 int Count1 = (count/10);
			 System.out.println(Count1);
			 int count2 = (int) Math.ceil(Count1);
			 System.out.println(count2);
			 
			 if (count>10) {
				 
				 List<WebElement> Matri = driver.findElements(By.xpath("//a[@class='clr6 boldtxt']"));
				 
				 for (int i = 0; i < count2; i++) {
					 
					 for (int j = 0; j < Matri.size(); j++) {
						
						 List<WebElement> name = driver.findElements(By.xpath("//a[@class='clr1 font16 boldtxt padr8']"));
					 String ID = Matri.get(j).getText();
					 String Name = name.get(j).getText();
					 System.out.println("The Mobile Numbered Viewed by - "+ID+" : "+Name);
					 }
				
				 for (int k = 0; k < 10; k++) {
			
				 js.executeScript("window.scrollBy(0,350)");
				 
				 }
				 Thread.sleep(3000);
				 try {
					Base.click(w.getMobile_view_next());
					Thread.sleep(1000);
					Base.click(driver.findElement(By.id("chatbuddylistwin")));
					
					Base.click(w.getMobile_view_next());
				} catch (Exception e) {
					
				}
				 } 
				
			}
			             ////////////    Mobile Viewed By ME   ////////////////
			 
			 Thread.sleep(3000);
		     Base.click(w.getMble_no_viewed_by_me());
		     
		     
		     
			 String Mobile_View_by_me_count = w.getMble_no_view_count().getText();
			 System.out.println(Mobile_View_by_me_count);
			 
			 Integer count1 = Integer.parseInt(Mobile_View_by_me_count);
			 System.out.println(count1);
			 
			 int Count11 = (count1/10);
			 System.out.println(Count11);
			 int count22 = (int) Math.ceil(Count11);
			 System.out.println(count22);
			 
			 if (count1>10) {
				 
				 List<WebElement> Matri = driver.findElements(By.xpath("//a[@class='clr6 boldtxt']"));
				 
				 for (int i = 0; i < count22; i++) {
					 
					 for (int j = 0; j < Matri.size(); j++) {
						
						 List<WebElement> name = driver.findElements(By.xpath("//a[@class='clr1 font16 boldtxt padr8']"));
					 String ID = Matri.get(j).getText();
					 String Name = name.get(j).getText();
					 System.out.println("The Mobile Numbered Viewed by - "+ID+" : "+Name);
					 }
				
				 for (int k = 0; k < 10; k++) {
			
					 Thread.sleep(3000);
				 js.executeScript("window.scrollBy(0,350)");
				 
				 }
				 Thread.sleep(3000);
				 try {
					
					Thread.sleep(2000);
					Base.click(w.getMobile_view_next());
				} catch (Exception e) {
					
				}
				/* Thread.sleep(3000);
				 try {
					 
					Base.click(w.getMobile_view_next1());
				} catch (Exception e) {
					
				}*/
				 } 
				
			}
			
			 
	}

}
