package SprintTask;

import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import base.BaseTest;

public class StarPi extends BaseTest {
	
	

	@BeforeSuite
	public void setUp() {
		// test=reports.startTest("Divorcee Negative Payment");
		// test.log(LogStatus.PASS, "Divorcee Negative Payment Test Started");
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\amuthan\\eclipse-workspace\\CBS\\Driver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);
	
	}
	
	
	
	@Test
	public void occupationSearch() throws Throwable {
		
		Actions acc = new Actions(driver);
		Robot r = new Robot();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		JavascriptExecutor js  = (JavascriptExecutor)driver;
	
	
	Thread.sleep(3000);
	driver.get("https://www.communitymatrimony.com");
	driver.manage().window().maximize();
	
	Thread.sleep(3000);
	driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/form/div[1]/input")).click();
	
	driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/form/div[1]/input")).sendKeys("AGR407359");

	Thread.sleep(2000);
	driver.findElement(By.id("passwordClear1")).click();
	
	driver.findElement(By.id("password1")).sendKeys("cbstest");
	
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/form/div[2]/input[3]")).click();
	Thread.sleep(3000);
	
	/////////////////// Intermediate Page  ////////////
	

	/////////////////   
	Thread.sleep(1000);
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

	Thread.sleep(1000);
	try {
		WebElement skip_matches = driver.findElement(By.xpath("//a[contains(text(),'Skip to Daily Matches >>')]"));
		if (skip_matches.isDisplayed()) {
			skip_matches.click();

		}
	} catch (Exception e) {
		System.out.println("Intermediate pages handled");
	}
	Thread.sleep(1000);
	try {
		WebElement element = driver.findElement(By.xpath("/html/body/div[1]/div[2]/a"));
		if (element.isDisplayed()) {
			element.click();

		}
	} catch (Exception e) {
		System.out.println("Intermediate pages handled");
	}
	Thread.sleep(1000);
	try {
		WebElement divorcee_intermediate_skip = driver.findElement(By.xpath("/html/body/div[1]/div/div[4]/a"));
		if (divorcee_intermediate_skip.isDisplayed()) {
			divorcee_intermediate_skip.click();

		}
	} catch (Exception e) {
		System.out.println("Intermediate pages handled");
	}
	Thread.sleep(1000);
	try {
		driver.findElement(By.xpath("//*[@id=\"conform\"]/div/div/div/a[1]")).click();
	} catch (Exception e) {
		System.out.println("No Intermediate pages");
	}
	Thread.sleep(1000);
	try {
		driver.findElement(By.xpath("//a[contains(text(),' Skip >>')]")).click();
	} catch (Exception e) {
		System.out.println("No Intermediate pages");
	}

//AD Pages
	Thread.sleep(3000);
	try {
		driver.findElement(By.xpath("//*[@id=\"special_offer_lightpic1\"]/div[1]/div/a/img")).click();
	} catch (Exception e) {
		System.out.println("ADs Closed Successfully");
	}
	Thread.sleep(3000);
	
	////////////////////   
	
	
	////////////////////////////////////////////////
	
	
	
	try {
		acc.moveToElement(driver.findElement(By.xpath("//*[@id=\"topnav-login-menu\"]/div[3]/div[2]/div[1]/a/img"))).build().perform();
		Thread.sleep(3000);
	} catch (Exception e) {
		acc.moveToElement(driver.findElement(By.xpath("//*[@id=\"topnav-login-menu\"]/div[3]/div[2]/div[1]/a"))).build().perform();
		Thread.sleep(3000);
	}
	
	
	acc.moveToElement(driver.findElement(By.xpath("//*[@id=\"userpop\"]/div[2]/div/div[3]/div[1]/ul/li[1]/a"))).build().perform();
	Thread.sleep(2000);
	
	BaseTest.click(driver.findElement(By.xpath("//*[@id=\"userpop\"]/div[2]/div/div[3]/div[1]/ul/li[1]/a")));
	Thread.sleep(5000);
	
	///   Location Edit
		//driver.findElement(By.xpath("//*[@id=\"container6\"]/div[2]/a")).click();
		Thread.sleep(3000);
		
		int cell = BaseTest.getCellCount("Star");
		System.err.println(cell);
		
		for (int i=0; i < cell; i++) {
			
		
			
			Thread.sleep(2000);
			BaseTest.click(driver.findElement(By.id("motherTongue")));
			BaseTest.select_text(driver.findElement(By.id("motherTongue")), BaseTest.getExcelData("Star", 0, i));
			Thread.sleep(3000);
		/*	
			String a = getExcelData("Star", 1, i);
			Integer aa = Integer.parseInt(a);
			int A = (aa+1);
			Thread.sleep(2000);*/
			System.err.println(getExcelData("Star", 0, i));
			
			for (int j = 1; j <28; j++) {
			try {
				System.out.println(j);
				BaseTest.select_text(driver.findElement(By.id("star")), BaseTest.getExcelData("Star", j, i));
				Thread.sleep(2000);
				System.out.println(getExcelData("Star", j, i));
			} catch (Exception e) {
				
				System.err.println(getExcelData("Star", j, i));
				
			}
				
			}
			
		}
		
		
		
		
		
		
		}

}
