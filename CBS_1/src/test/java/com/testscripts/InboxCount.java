package com.testscripts;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.base.Base;
import com.pom.Inbox;

public class InboxCount extends Base {

	WebDriver driver;
	int Size, Size1, Size2,Size3,Size4,Size5,Size6,Size7,Size8,Size9;
	int total_size,Accept_count;

	@BeforeTest
	public void setUp() {

		System.setProperty("webdriver.chrome.driver",
				".//Driver//chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);
		driver.get("https://www.communitymatrimony.com");

	}

	@BeforeMethod
	public void login() {

		Inbox i = new Inbox(driver);

		
		driver.manage().window().maximize();
try {
		Base.click(i.getMatriId());
		Base.typeData(i.getMatriId(), "AGR755407");

		Base.click(i.getPaswwordclr());
		Base.typeData(i.getPassword(), "cbstest");

		Base.click(i.getLoginbtn());
} catch (Exception e) {
	System.out.println("Already Logged In");
}
		//////////////////////// INtermediate Pages /////////////////////////////

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
			System.out.println("Intermediate pages handled 1");
		}

		try {
			WebElement element = driver.findElement(By.xpath("/html/body/div[1]/div[2]/a"));
			if (element.isDisplayed()) {
				element.click();

			}
		} catch (Exception e) {
			System.out.println("Intermediate pages handled 2");
		}

		try {
			WebElement divorcee_intermediate_skip = driver.findElement(By.xpath("/html/body/div[1]/div/div[4]/a"));
			if (divorcee_intermediate_skip.isDisplayed()) {
				divorcee_intermediate_skip.click();

			}
		} catch (Exception e) {
			System.out.println("Intermediate pages handled 3");
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
	}

	@Test
	public void homePageCount() throws Exception {

		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[contains(text(),'My Home')]")).click();
		

		// driver.findElement(By.xpath("//a[contains(text(),'My Home')]")).click();

		/*
		 * try {
		 * 
		 * driver.findElement(By.xpath(""))
		 * 
		 * 
		 * } catch (Exception e) { e.getMessage(); }
		 */

		String pending_count = driver.findElement(By.xpath("//*[@id=\"inbox\"]/ol/li[1]/a/span")).getText();
		System.out.println("Pending Count : " + pending_count);

		String Accepted_count = driver.findElement(By.xpath("//*[@id=\"inbox\"]/ol/li[2]/a/span")).getText();
		System.out.println("Accepted count : " + Accepted_count);
		int Accept_count = Integer.parseInt(Accepted_count);
		String Replied_count = driver.findElement(By.xpath("//*[@id=\"msgrecpart\"]/ol/li[1]/a/span")).getText();
		System.out.println("Replied count : " + Replied_count);

		String Declined_count = driver.findElement(By.xpath("//*[@id=\"msgrecpart\"]/ol/li[3]/a/span")).getText();
		System.out.println("Declined count : " + Declined_count);

		////////////////////////////////////////////////// d
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", driver.findElement(By.cssSelector("#inbox > ol > li.last > a")));
		// driver.findElement(By.cssSelector("#inbox > ol > li.last > a")).click();

		Set<String> winHandles = driver.getWindowHandles();
		int count = winHandles.size();
		System.out.println("Window Count is : " + count);
		for (String winHandle : winHandles) {
			driver.switchTo().window(winHandle);
			// switch focus of WebDriver to the next found window handle (that's your newly
			// opened window)
			System.out.println("window Handle Id :" + winHandle);
			Thread.sleep(3000);
		}

		try {
			Thread.sleep(2000);
			if (driver.findElement(By.id("num0")).isDisplayed()) {

				System.out.println("The accepted Interest are");// div[@class='srcbdr bgclr5 mrgb10']
				List<WebElement> Accepted_Id = driver.findElements(By.xpath("//div[@class='pad8']"));
				 Size = Accepted_Id.size();
				System.out.println(Size);

				Thread.sleep(2000);
				try {
					driver.findElement(By.id("chatbuddylistwin")).click();
				} catch (Exception e) {
					System.out.println("No Chat ");
				}

				WebElement page2 = driver
						.findElement(By.xpath("//*[@id=\"msgResults\"]/div[12]/div[2]/div[2]/div[2]/a"));
				Thread.sleep(2000);
				if (page2.isDisplayed()) {
					page2.click();
					Thread.sleep(2000);
					if (driver.findElement(By.id("num0")).isDisplayed()) {

						System.out.println("The accepted Interest are");// div[@class='srcbdr bgclr5 mrgb10']
						List<WebElement> Accepted_Id1 = driver.findElements(By.xpath("//div[@class='pad8']"));
						 Size1 = Accepted_Id1.size();
						System.out.println(Size1);
					} else {
						System.out.println("Only one page * * *");
					}

				} else {
					System.out.println("Only one page * * *");
				}

			} else {
				System.out.println("No Accepted Interest * * *");
			}
		} catch (Exception e) {
			System.out.println("No Accepted Interest * * *");
		}

		total_size = Size + Size1;

		if (total_size == Accept_count) {
			System.out.println("The Accepted count matches with "+ Accept_count + "and" + total_size + "total size");

		} else {

			System.out.println("The Accepted count not matches");
		}

	}
	
	@Test
	public void declineCount() throws InterruptedException {
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[contains(text(),'My Home')]")).click();
		

		// driver.findElement(By.xpath("//a[contains(text(),'My Home')]")).click();

		/*
		 * try {
		 * 
		 * driver.findElement(By.xpath(""))
		 * 
		 * 
		 * } catch (Exception e) { e.getMessage(); }
		 */

		String pending_count = driver.findElement(By.xpath("//*[@id=\"inbox\"]/ol/li[1]/a/span")).getText();
		System.out.println("Pending Count : " + pending_count);

		String Accepted_count = driver.findElement(By.xpath("//*[@id=\"inbox\"]/ol/li[2]/a/span")).getText();
		System.out.println("Accepted count : " + Accepted_count);
		int Accept_count = Integer.parseInt(Accepted_count);
		
		String Replied_count = driver.findElement(By.xpath("//*[@id=\"msgrecpart\"]/ol/li[1]/a/span")).getText();
		System.out.println("Replied count : " + Replied_count);
 
		String Declined_count = driver.findElement(By.xpath("//*[@id=\"msgrecpart\"]/ol/li[3]/a/span")).getText();
		System.out.println("Declined count : " + Declined_count);
		int Decline_count = Integer.parseInt(Declined_count);
        
		////////////////////////////////////////////////// d
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", driver.findElement(By.cssSelector("#msgrecpart > ol > li:nth-child(3) > a")));
		// driver.findElement(By.cssSelector("#inbox > ol > li.last > a")).click();

		Set<String> winHandles = driver.getWindowHandles();
		int count = winHandles.size();
		System.out.println("Window Count is : " + count);
		for (String winHandle : winHandles) {
			driver.switchTo().window(winHandle);
			// switch focus of WebDriver to the next found window handle (that's your newly
			// opened window)
			System.out.println("window Handle Id :" + winHandle);
			Thread.sleep(3000);
		}

		try {
			Thread.sleep(2000);
			if (driver.findElement(By.id("num0")).isDisplayed()) {

				System.out.println("The Declined Interest are");// div[@class='srcbdr bgclr5 mrgb10']
				List<WebElement> Accepted_Id = driver.findElements(By.xpath("//div[@class='pad8']"));
				 Size = Accepted_Id.size();
				System.out.println(Size);

				Thread.sleep(2000);
				try {
					driver.findElement(By.id("chatbuddylistwin")).click();
				} catch (Exception e) {
					System.out.println("No Chat ");
				}

				WebElement page2 = driver
						.findElement(By.xpath("//*[@id=\"msgResults\"]/div[12]/div[2]/div[2]/div[2]/a"));
				Thread.sleep(2000);
				if (page2.isDisplayed()) {
					page2.click();
					Thread.sleep(2000);
					if (driver.findElement(By.id("num0")).isDisplayed()) {

						System.out.println("The Declined Interest are");// div[@class='srcbdr bgclr5 mrgb10']
						List<WebElement> Accepted_Id1 = driver.findElements(By.xpath("//div[@class='pad8']"));
						 Size1 = Accepted_Id1.size();
						System.out.println(Size1);
					} else {
						System.out.println("Only one page * * *");
					}

				} else {
					System.out.println("Only one page * * *");
				}

			} else {
				System.out.println("No Declined Interest * * *");
			}
		} catch (Exception e) {
			System.out.println("No Declined Interest * * *");
		}

		total_size = Size + Size1;

		if (total_size == Decline_count) {
			System.out.println("The Declined count matches with "+ Decline_count + "and" + total_size + "total size");

		} else {

			System.out.println("The Declined count not matches");
		}
		
	}
	
	@Test
	public void replyCount() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[contains(text(),'My Home')]")).click();
		

		// driver.findElement(By.xpath("//a[contains(text(),'My Home')]")).click();

		/*
		 * try {
		 * 
		 * driver.findElement(By.xpath(""))
		 * 
		 * 
		 * } catch (Exception e) { e.getMessage(); }
		 */

		String pending_count = driver.findElement(By.xpath("//*[@id=\"inbox\"]/ol/li[1]/a/span")).getText();
		System.out.println("Pending Count : " + pending_count);

		String Accepted_count = driver.findElement(By.xpath("//*[@id=\"inbox\"]/ol/li[2]/a/span")).getText();
		System.out.println("Accepted count : " + Accepted_count);
		int Accept_count = Integer.parseInt(Accepted_count);
		
		String Replied_count = driver.findElement(By.xpath("//*[@id=\"msgrecpart\"]/ol/li[1]/a/span")).getText();
		System.out.println("Replied count : " + Replied_count);
		int reply_count = Integer.parseInt(Replied_count);
 
		String Declined_count = driver.findElement(By.xpath("//*[@id=\"msgrecpart\"]/ol/li[3]/a/span")).getText();
		System.out.println("Declined count : " + Declined_count);
		int Decline_count = Integer.parseInt(Declined_count);
        
		////////////////////////////////////////////////// d
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", driver.findElement(By.cssSelector("#msgrecpart > ol > li:nth-child(1) > a")));
		// driver.findElement(By.cssSelector("#inbox > ol > li.last > a")).click();

		Set<String> winHandles = driver.getWindowHandles();
		int count = winHandles.size();
		System.out.println("Window Count is : " + count);
		for (String winHandle : winHandles) {
			driver.switchTo().window(winHandle);
			// switch focus of WebDriver to the next found window handle (that's your newly
			// opened window)
			System.out.println("window Handle Id :" + winHandle);
			Thread.sleep(3000);
		}

		try {
			Thread.sleep(2000);
			if (driver.findElement(By.id("num0")).isDisplayed()) {

				System.out.println("The Replied Interest are");// div[@class='srcbdr bgclr5 mrgb10']
				List<WebElement> Replied_Id = driver.findElements(By.xpath("//div[@class='pad8']"));
				 Size = Replied_Id.size();
				System.out.println(Size);

				Thread.sleep(2000);
				try {
					driver.findElement(By.id("chatbuddylistwin")).click();
				} catch (Exception e) {
					System.out.println("No Chat ");
				}

				WebElement page2 = driver
						.findElement(By.xpath("//*[@id=\"msgResults\"]/div[12]/div[2]/div[2]/div[2]/a"));
				Thread.sleep(2000);
				if (page2.isDisplayed()) {
					page2.click();
					Thread.sleep(2000);
					if (driver.findElement(By.id("num0")).isDisplayed()) {

						System.out.println("The Replied Interest are");// div[@class='srcbdr bgclr5 mrgb10']
						List<WebElement> Replied_Id1 = driver.findElements(By.xpath("//div[@class='pad8']"));
						 Size1 = Replied_Id1.size();
						System.out.println(Size1);
					} else {
						System.out.println("Only one page * * *");
					}

				} else {
					System.out.println("Only one page * * *");
				}

			} else {
				System.out.println("No Replied Interest * * *");
			}
		} catch (Exception e) {
			System.out.println("No Replied Interest * * *");
		}

		total_size = Size + Size1;

		if (total_size == reply_count) {
			System.out.println("The Replied count matches with "+ reply_count + "and" + total_size + "total size");

		} else {

			System.out.println("The Replied count not matches");
		}

	}
	@AfterMethod
	public void close() {
		
	//	driver.close();
	}
	
	@AfterTest
	public void tearDown() {
	//	driver.quit();

	}
	
	
}
