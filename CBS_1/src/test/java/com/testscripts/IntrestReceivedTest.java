package com.testscripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.base.Base;
import com.pom.WhoShortListMe;

public class IntrestReceivedTest extends Base{
	
	WebDriver driver;
	
	@BeforeSuite
	public void startUp() {
		
		System.setProperty("webdriver.chrome.driver", ".//Driver//chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
	    driver = new ChromeDriver(options);
				

	}
	@Test
	private void intrestReceived() throws Exception {
		
		WhoShortListMe w = new WhoShortListMe(driver);
		Actions acc= new Actions(driver);
		WebDriverWait wait = new WebDriverWait(driver, 30);
		JavascriptExecutor js  = (JavascriptExecutor)driver;
		
	
		
		Thread.sleep(3000);
		driver.get("https://www.communitymatrimony.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		Base.click(w.getMatriId());
		Base.typeData(w.getMatriId(), "AGR102088");
		Thread.sleep(2000);
		
		Base.click(w.getPaswwordclr());
		Base.typeData(w.getPassword(), "cbstest");
		Thread.sleep(2000);
		
		Base.click(w.getLoginbtn());
		Thread.sleep(3000);
		
		
		
		   /////////////   Intermediate Pages   ////////////////////
		
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
				System.out.println("7 Intermediate pages handled");
			}
			
			
			try {
				driver.findElement(By.xpath("//*[@id=\"conform\"]/div/div/div/a[1]")).click();
			} catch (Exception e) {
				System.out.println("8 No Intermediate pages");
			}
			// AD Pages
			 Thread.sleep(3000);
			 try {
				 driver.findElement(By.xpath("//*[@id=\"special_offer_lightpic1\"]/div[1]/div/a/img")).click();
			} catch (Exception e) {
				System.out.println("9 ADs Closed Successfully");
			}
	
			 Thread.sleep(3000);
			 acc.moveToElement(w.getMy_home()).build().perform();
			// Base.click(w.getMy_home());
			 Thread.sleep(2000);
			 acc.moveToElement(w.getMy_home_Intrest_rececived()).build().perform();
			 
			 /*String a = w.getMy_home_Intrest_rececived().getText();
			 System.out.println(a);
			 String[] b =a.split(" (");
			 String[] c = b[1].split(")");
			 String d = c[0].toString();
			 int e = Integer.parseInt(d);
             System.out.println(e);		
             int f = (e/10);
             int g =(int) Math.ceil(f);
             System.out.println(g);*/
			 
			 Base.click(w.getMy_home_Intrest_rececived());
			 Thread.sleep(2000);
			 
			/* if (e>10) { */
				
				 List<WebElement> matri = driver.findElements(By.xpath("//div[@class='fleft ']"));
				 System.out.println(matri.size());
				 
				 for (int i = 1; i <matri.size(); i++) {
					 
					 String Name = matri.get(i).getText();
					 System.out.println("Intrest Received by : "+Name);
					 
					 Thread.sleep(3000);
				 }		
				 
				 try {
					 if (driver.findElement(By.xpath("//*[@id=\"msgResults\"]/div[13]/div[2]/div[2]/div[2]/a")).isDisplayed()) {
						 
						 Thread.sleep(3000);
						 driver.findElement(By.xpath("//*[@id=\"msgResults\"]/div[13]/div[2]/div[2]/div[2]/a")).click();
						 Thread.sleep(5000);
					
						/* 
						 for (int i = 1; i <matri.size(); i++) {
							 
							 String Name = matri.get(i).getText();
							 System.out.println("Intrest Received by : "+Name);
							 
						 }*/
							 
					} else {

						}
	   } catch (Exception e) {
			
				}
	   
	   
					try { 
                     if (driver.findElement(By.xpath("//*[@id=\"msgResults\"]/div[13]/div[2]/div[2]/div[3]/a")).isDisplayed()) {
						 
						 Thread.sleep(3000);
						 driver.findElement(By.xpath("//*[@id=\"msgResults\"]/div[13]/div[2]/div[2]/div[3]/a")).click();
						 Thread.sleep(5000);
						
                        /*for (int i = 1; i <matri.size(); i++) {
							 
							 String Name = matri.get(i).getText();
							 System.out.println("Intrest Received by : "+Name);
							 
						 }*/ //25577  25579   25205
						
					} else {

						}
                     
	   } catch (Exception e) {
			
				}
               try {      
              if (driver.findElement(By.xpath("//*[@id=\"msgResults\"]/div[13]/div[2]/div[2]/div[4]/a")).isDisplayed()) {
						 
						 Thread.sleep(3000);
						 driver.findElement(By.xpath("//*[@id=\"msgResults\"]/div[13]/div[2]/div[2]/div[4]/a")).click();
						 Thread.sleep(5000);
						
                          /*  for (int i = 1; i <matri.size(); i++) {
							 
							 String Name = matri.get(i).getText();
							 System.out.println("Intrest Received by : "+Name);
							 
						 }*/
						
					} else {

						}
				 
               } catch (Exception e) {
				
			}
				 
			/*	 Thread.sleep(3000);
				 for (int i = 0; i < 10; i++) {
				 
				 js.executeScript("windows.scrollBy(0,350");
				
				 }*/
				 
				
				 
				 				 
		/*	} else {

			}
			 
		*/
		 
		
				 
	}

}
