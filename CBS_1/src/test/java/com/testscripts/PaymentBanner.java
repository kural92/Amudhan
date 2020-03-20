package com.testscripts;

import java.util.Set;

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
import com.pom.Inbox;
import com.pom.Logout;
import com.pom.WhoViewBanner;

public class PaymentBanner extends Base {

	WebDriver driver;

	@BeforeSuite
	public void startUp() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\amuthan\\eclipse-workspace\\CBS_1\\Driver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);

	}

	@Test
	public void upgardeBanner() throws Exception {

		Inbox i = new Inbox(driver);
		WhoViewBanner w = new WhoViewBanner(driver);
		Logout l = new Logout(driver);
		Actions acc = new Actions(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebDriverWait wait = new WebDriverWait(driver, 30);

		Thread.sleep(2000);

		driver.get("https://www.communitymatrimony.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		/////////////////////////////////////////////////////////////////
		try {

			Base.click(i.getMatriId());
			Base.typeData(i.getMatriId(), "EZH710533");
			Thread.sleep(1000);

			Base.click(i.getPaswwordclr());
			Base.typeData(i.getPassword(), "cbstest1");
			Thread.sleep(1000);

			Base.click(i.getLoginbtn());
			Thread.sleep(1000);

		} catch (Exception e) {
			System.out.println("Already Logged In");
		}

		/////////////////////////////////////////// Intermediate Pages
		/////////////////////////////////////////// /////////////////////////////////

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

		////////////////////////////////////////////////////////////////////////////////

		Thread.sleep(2000);
		Base.click(w.getMy_home());

		try {
			driver.findElement(By.xpath("(//a[@class=\"popupclose\"])[2]")).click();
		} catch (Exception e) {
			e.getMessage();
		}

		//////////////////////////////////////////////////////////////////

		if (w.getPayment_banner_paid_member().isDisplayed()) {

			Thread.sleep(2000);
			String a = w.getPayment_banner_paid_member().getText();
			System.out.println(a);

			Base.click(w.getPayment_banner_paid_member());
			Thread.sleep(2000);

			String Parent = driver.getWindowHandle();
			System.out.println(Parent);

			Set<String> child = driver.getWindowHandles();
			System.out.println(child);
			for (String handle : child) {
				if (!Parent.equals(handle)) {

					Thread.sleep(1000);
					driver.switchTo().window(handle);
					System.out.println(handle);
					Thread.sleep(10000);
					/////////////////////// Pop Up
					try {
						acc.moveToElement(driver.findElement(By.xpath("//*[@id=\"TopListingPopup\"]/div/div/div[1]/a")))
								.build().perform();
						Thread.sleep(1000);
						Base.click(driver.findElement(By.xpath("//*[@id=\"TopListingPopup\"]/div/div/div[1]/a")));

						///// //*[@id="phPopup"]/div/div/div[1]/a astroMatchPopupbtn
						acc.moveToElement(
								driver.findElement(By.xpath("//*[@id=\"astroMatchPopup110\"]/div/div/div[1]/a")))
								.build().perform();
						Thread.sleep(1000); // *[@id="astroMatchPopup110"]/div/div/div[1]/a
						Base.click(driver.findElement(By.xpath("//*[@id=\"astroMatchPopup110\"]/div/div/div[1]/a")));

						Thread.sleep(1000); // *[@id="astroMatchPopup110"]/div/div/div[1]/a
						// Base.click(driver.findElement(By.id("astroMatchPopupbtn")));

						///////////
						acc.moveToElement(driver.findElement(By.xpath("//*[@id=\"phPopup\"]/div/div/div[1]/a"))).build()
								.perform();
						Thread.sleep(1000);
						Base.click(driver.findElement(By.xpath("//*[@id=\"phPopup\"]/div/div/div[1]/a")));
						Thread.sleep(2000);

						Base.click(driver.findElement(By.xpath("//div[contains(text(),'▼')]")));

						/////

						////

					} catch (Exception e) {
						System.out.println("No Pop Up Appears");

					}

					Thread.sleep(3000);
					try {
						Thread.sleep(3000);
						driver.findElement(By.xpath("//*[@id=\"splCheckoutAddon\"]/div/div[1]/div/input[1]")).click();
					} catch (Exception e) {
						e.getMessage();
					}
					Thread.sleep(3000);
					/*
					 * String Addon_Name = w.getPayment_addon_pack_name().getText();
					 * System.out.println(Addon_Name);
					 */

					String Addon_Top_Price = driver
							.findElement(By.xpath("//*[@id=\"pay_member_package\"]/div[2]/div[1]")).getText();

					System.out.println(" : " + Addon_Top_Price);
					String[] aaa = Addon_Top_Price.split("for");
					String BB = aaa[0].toString().trim();
					/*
					 * Thread.sleep(3000); String Addon_Name =
					 * w.getPayment_addon_pack_name().getText(); System.out.println(Addon_Name);
					 */

					String Addon_Top_Price1 = w.getPayment_astro_mactch_price().getText();
					System.out.println(" : " + Addon_Top_Price1);
					String[] aa = Addon_Top_Price1.split("for");
					String B = aa[0].toString().trim();

					String Addon_Total_price = w.getPayment_astro_mactch_total_price().getText();
					System.out.println(Addon_Total_price);

					if (B.equals(Addon_Total_price)) {

						System.out.println("Addon Amount Matches ");

					} else {

						System.out.println("Addon Amount not Matches ");

					}

					if (BB.contains(Addon_Total_price)) {

						System.out.println("Upgrade Amount Matches for Free Member ");

					} else {

						System.out.println("Upgrde Amount not Matches For Free Member ");

					}

				}
			}

		} else {

			if (w.getPayment_banner_free_member().isDisplayed()) {

				Thread.sleep(2000);
				String b = w.getPayment_discount_amount().getText();
				System.out.println(b);

				Base.click(w.getPayment_banner_free_member());
				Thread.sleep(2000);

				String Parent = driver.getWindowHandle();
				System.out.println(Parent);

				Set<String> child = driver.getWindowHandles();
				System.out.println(child);
				for (String handle : child) {
					if (!Parent.equals(handle)) {

						Thread.sleep(1000);
						driver.switchTo().window(handle);
						System.out.println(handle);
						Thread.sleep(5000);

						try {
							acc.moveToElement(w.getPayment_hightlight_pop_up_close_btn()).build().perform();
							Thread.sleep(1000);
							Base.click(w.getPayment_hightlight_pop_up_close_btn());
						} catch (Exception e) {
							System.out.println("No Pop Up Appears");
						}
						Thread.sleep(3000);

					}
				}

			}

		}

	}

}
