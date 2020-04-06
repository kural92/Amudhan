 package com.testscripts;

import java.util.List;
import java.util.Set;

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

public class DailyMatches extends Base {

	WebDriver driver;

	@BeforeTest
	public void startUp() {

		System.setProperty("webdriver.chrome.driver",
				".//Driver//chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);

	}

	@Test
	public void dailyMatchesTest() throws Exception {

		Inbox i = new Inbox(driver);
		com.pom.DailyMatches d = new com.pom.DailyMatches(driver);
		Actions acc = new Actions(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebDriverWait wait = new WebDriverWait(driver, 30);
		String parent = driver.getWindowHandle();

		////////////////////////////////////////////////////////////////////////////
		driver.get("https://www.communitymatrimony.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);

		Base.click(i.getMatriId());
		Base.typeData(i.getMatriId(), "AGR755407");

		Base.click(i.getPaswwordclr());
		Base.typeData(i.getPassword(), "cbstest");

		Base.click(i.getLoginbtn());
		Thread.sleep(3000);
        
		//////////////////////// Intermediate Pages
		//////////////////////// /////////////////////////////////////////

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

		/////////////////////////////////////////////////////////////////////////////////////////////////////////

		System.out.println("Daily Matches Test Started");

		Thread.sleep(3000);
		List<WebElement> yes = driver.findElements(By.id("ImageActionPerform"));
		System.out.println(yes.size());
		for (int k = 0; k <= yes.size(); k++) {
			Thread.sleep(3000);

			Base.click(d.getInterest_yes_btn());    
			Thread.sleep(3000);

			try {
				if (d.getMail_close_btn().isDisplayed()) {
					Base.click(d.getMail_close_btn());
				} else {
					System.out.println("No send Mail Pop_Up");
				}
			} catch (Exception e) {
				e.getMessage();
			}

		}   
	
		Thread.sleep(6000);
		try {
			Thread.sleep(6000);
			// acc.moveToElement(d.getDaily7_prev_arrow_btn())             
			Base.click(d.getDaily7_prev_arrow_btn());
		} catch (Exception e) {
			e.getMessage();
		}

		Thread.sleep(5000);
		List<WebElement> d7 = driver.findElements(By.id("ImageActionPerform"));
		System.out.println(d7.size());

		for (int j = 1; j <= 1; j++) {
			Thread.sleep(5000);
			d7.get(j).click();
			Thread.sleep(5000);
		}

		//////// View Mobile Number //////

		Base.click(d.getView_mobile_no());
		try {
			Thread.sleep(2000);

			Base.click(d.getView_mobile_num_popUp());
			Thread.sleep(10000);

			String Mobile_No = d.getMobile_no().getText();
			System.out.println(Mobile_No);

			String Count = d.getMble_view_count_details().getText();
			System.out.println(Count);
			Thread.sleep(2000);

			Base.click(driver.findElement(By.id("popupclose")));

		} catch (Exception e) {
			e.getMessage();
		} 
		
		
		try {
			Thread.sleep(4000);
			if (d.getReq_view_mble_no().isDisplayed()) {
				Thread.sleep(2000);
				Base.click(d.getReq_view_mble_no());
				Thread.sleep(2000);
				Base.click(driver.findElement(By.xpath("//*[@id=\"lightpic\"]/div/div/div/div[2]/a")));

			}
		} catch (Exception e) {
			e.getMessage();
		}
		
		
		try {

			Thread.sleep(3000);
			Set<String> child = driver.getWindowHandles();
			for (String handle : child) {
				if (!parent.contains(handle)) {
					driver.switchTo().window(handle);
					Thread.sleep(2000);
					driver.close();

				}
				driver.switchTo().window(parent);
         System.out.println("Uprade to view Mobile Number");
			} // 189010 2138

		} catch (Exception e) {
			e.getMessage();
		}
		
		System.out.println("Mobile Number Viewed successfully");
		Thread.sleep(5000);

		//////////////////////// View and Req Horoscope Test /////////////////////////

		System.out.println("View Horoscope Test Started ");

		try {

			Base.click(d.getView_horoscope());
			Thread.sleep(3000);

			Base.click(d.getDownload_horoscope());
			Thread.sleep(3000);

			Base.click(d.getHoroscope_close_btn());
			Thread.sleep(3000);

		} catch (Exception e) {
			System.out.println("No View Request Horoscope Button");
		}
		
		
		try {
			Base.click(d.getReq_horoscope());
			Thread.sleep(3000);

			Base.click(d.getReq_horoscope_pop_up_close_btn());

		} catch (Exception e) {
			System.out.println("No Request Horoscope Button");
		}
		

		try {

			Thread.sleep(3000);
			Set<String> child = driver.getWindowHandles();
			for (String handle : child) {
				if (!parent.contains(handle)) {
					driver.switchTo().window(handle);
					Thread.sleep(2000);
					driver.close();

				}
				driver.switchTo().window(parent);
				System.out.println("Please Upgrade to view/Request Horoscope");
			} 

		} catch (Exception e1) {
			e1.getMessage();
		}
		Thread.sleep(5000);
		
		////////////////////     Chat With This Member    /////////////////////
		
		try {
		Base.click(d.getChat_with_this_member());
		Thread.sleep(2000);
		} catch (Exception e) { e.getMessage(); }
		
		
		try {

			Thread.sleep(3000);
			Set<String> child = driver.getWindowHandles();
			for (String handle : child) {
				if (!parent.contains(handle)) {
					driver.switchTo().window(handle);
					Thread.sleep(2000);
					driver.close();

				}
				driver.switchTo().window(parent);
				System.out.println("Please Upgrade to Chat");
			} 

		} catch (Exception e1) {
			e1.getMessage();
		}
		
		
		///////////////////////////////////   Logout    /////////////////////////////////
		
		Thread.sleep(3000);
		acc.moveToElement(driver.findElement(By.xpath("//span[@class=\"menu-arrow-off\"]"))).build().perform();
		Thread.sleep(1000);
		acc.moveToElement(driver.findElement(By.xpath("//a[@class=\"settings-logout\"]"))).build().perform();
		
		driver.findElement(By.xpath("//a[@class=\"settings-logout\"]")).click();
		

	}

}
