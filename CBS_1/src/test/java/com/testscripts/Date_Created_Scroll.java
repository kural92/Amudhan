package com.testscripts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
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
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.Base;
import com.pom.Horoscope;
import com.pom.Inbox;
import com.pom.Search;
import com.pom.ShortList;
import com.pom.SortScroll;
import com.pom.ViewProfileScroll;

public class Date_Created_Scroll extends Base {

	WebDriver driver;

	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver",
				".//Driver//chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);

	}

	@Test
	public void dateCreated() throws InterruptedException, Exception {

		Inbox i = new Inbox(driver);
		ShortList s = new ShortList(driver);
		ViewProfileScroll v = new ViewProfileScroll(driver);
		WebDriverWait wait = new WebDriverWait(driver, 60);
		Horoscope h = new Horoscope(driver);
		SortScroll s1 = new SortScroll(driver);
		Actions acc = new Actions(driver);
		Search ss = new Search(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;

		driver.get("https://www.communitymatrimony.com/");
		driver.manage().window().maximize();

		Base.click(i.getMatriId());
		Base.typeData(i.getMatriId(), "AGR102088");

		Base.click(i.getPaswwordclr());
		Base.typeData(i.getPassword(), "cbstest");

		Base.click(i.getLoginbtn());

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

		try {
			driver.findElement(By.xpath("//*[@id=\"special_offer_lightpic1\"]/div[1]/div/a/img")).click();
		} catch (Exception e) {
			System.out.println("ADs Closed Successfully");
		}

		///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		Actions acc1 = new Actions(driver);

		acc.moveToElement(s.getMatches_btn()).build().perform();
		Thread.sleep(3000);

		Base.click(s.getLatest_matches());
		Thread.sleep(3000);
	
		///////    Profile Created Within A DAY   ///////////////////////////
		Base.click(ss.getProfile_created_within_a_day());
		System.out.println("showing profiles created with in a day....");

		Thread.sleep(5000);
		String a = s1.getTotal_profile_count().getText();
		Integer profile_count = Integer.parseInt(a);
		System.out.println(profile_count);

		int pro1 = (profile_count / 10);
		System.out.println(pro1);
		///////////////////////////////// Scroll
		if (pro1>10) {
		for (int l = 0; l <= pro1-1; l++) {
			System.out.println(l);
			Thread.sleep(1000);

			for (int m = 0; m <= 12; m++) {
				Thread.sleep(3000);
				js.executeScript("window.scrollBy(0,350)");
				System.out.println(m);
			}

			try {
				Base.click(s1.getNext_btn());
			} catch (Exception e) {
				e.getMessage();
			}

		} } else {
			System.out.println("Less than 10 profiles are present, scroll is  not required");
		}
		
		Thread.sleep(3000);
		Base.click(ss.getRefine_clear_all());
		
		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		acc.moveToElement(s.getMatches_btn()).build().perform();
		Thread.sleep(3000);

		Base.click(s.getLatest_matches());
		Thread.sleep(3000);
		

		Base.click(ss.getProfile_created_within_a_week());
		System.out.println("showing profiles created with in a week....");

		Thread.sleep(5000);
		String a1 = s1.getTotal_profile_count().getText();
		Integer profile_count1 = Integer.parseInt(a);
		System.out.println(profile_count1);

		int pro2 = (profile_count1 / 10);
		System.out.println(pro2);
		///////////////////////////////// Scroll
		if (pro2>10) {//pro2 - 1
		for (int l = 0; l <=pro2-1; l++) {
			System.out.println(l);
			Thread.sleep(1000);

			for (int m = 0; m <= 12; m++) {
				Thread.sleep(3000);
				js.executeScript("window.scrollBy(0,350)");
				System.out.println(m);
			}

			try {
				Base.click(s1.getNext_btn());
			} catch (Exception e) {
				e.getMessage();
			}

		} } else {
			System.out.println("Less than 10 profiles are present, scroll is  not required");
		}
		
		Thread.sleep(3000);
		Base.click(ss.getRefine_clear_all());

		/////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		acc.moveToElement(s.getMatches_btn()).build().perform();
		Thread.sleep(3000);

		Base.click(s.getLatest_matches());
		Thread.sleep(3000);
		
		Base.click(ss.getProfile_created_within_a_month());
		System.out.println("showing profiles created with in a month....");

		Thread.sleep(5000);
		String a12 = s1.getTotal_profile_count().getText();
		Integer profile_count12 = Integer.parseInt(a);
		System.out.println(profile_count12);

		int pro21 = (profile_count12 / 10);
		System.out.println(pro21);
		
		///////////////////////////////// Scroll
		 if (pro21>10) {//pro21 - 1
		for (int l = 0; l <=pro21-1 ; l++) {
			System.out.println(l);
			Thread.sleep(1000);

			for (int m = 0; m <= 12; m++) {
				Thread.sleep(3000);
				js.executeScript("window.scrollBy(0,350)");
				System.out.println(m);
			}

			try {
				Base.click(s1.getNext_btn());
			} catch (Exception e) {
				e.getMessage();
			}

		} }else {
			System.out.println("Less than 10 profiles are present, scroll is  not required");
		}

	}
	
	
	@AfterTest
	public void tearDown() {
		
		//driver.quit();

	}

}
