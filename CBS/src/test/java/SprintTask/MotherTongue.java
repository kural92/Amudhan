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

public class MotherTongue extends BaseTest {
	
	
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
	
	driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/form/div[1]/input")).sendKeys("mus10");

	Thread.sleep(2000);
	driver.findElement(By.id("passwordClear1")).click();
	
	Thread.sleep(2000);
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
	
	//  Basic Edit
	driver.findElement(By.xpath("//*[@id=\"container1\"]/div[2]/a")).click();
	Thread.sleep(3000);
	
//	for (int i=0; i <= 22; i++) {
		
	
		
		Thread.sleep(2000);
		BaseTest.click(driver.findElement(By.id("motherTongue")));
		
		int tongue = BaseTest.getRowCount("MotherTongue");
		System.out.println(tongue);
		
		for (int j = 1; j <=tongue ; j++) {
			
			String a = getExcelData("MotherTongue", j, 0).trim();
			System.out.println(a);
			
			String b = driver.findElement(By.id("motherTongue")).getText().trim();
			System.out.println(b);
			if (a.contains(b)) {
				
				System.err.println("mother Tongue Matches");
				
			} else {

				System.out.println("mother not Tongue Matches");
				
			}
			
				
//		String a = driver.findElement(By.id("motherTongue")).getText();
	//	System.out.println(a);
		
	//	BaseTest.select_index(driver.findElement(By.id("motherTongue")), );
		Thread.sleep(3000);
	
/*		BaseTest.select_string(driver.findElement(By.id("motherTongue")), BaseTest.getExcelData("MotherTongue", j, 0).trim());

		if (driver.findElement(By.id("motherTongue")).getText().contains(BaseTest.getExcelData("MotherTongue", j, 0).trim())) {
			
			Thread.sleep(3000);
			System.out.println("Mother Tongue was  Present : " + getExcelData("MotherTongue", j, 0).trim());
			
		}*/
		}
		
		
	/*	String a = getExcelData("City", 1, i);
		Integer aa = Integer.parseInt(a);
		int A = (aa+2);
		Thread.sleep(2000);*/
		
	/*	for (int j = 2; j <=A ; j++) {
			
			BaseTest.select_text(driver.findElement(By.id("residingCityId")), BaseTest.getExcelData("City", j, i));
			Thread.sleep(2000);
			
		}*/
		
	//}
		
		/*
		Thread.sleep(2000);
		try {
			
			String url = driver.getCurrentUrl();
			
			String[] a = url.split("//");
			
			String b = a[1].toString().trim();
			
			String[] c= b.split("/");
			
			String d = c[0].toString().trim();
			
			
			System.out.println(" 1 "+d);
			
			int cou = BaseTest.getRowCount("MotherTongueCo");
			System.out.println(" 2 "+cou);
			
			Thread.sleep(3000);
			
			for (int i = 1; i <=cou; i++) {	
			
			if (d.contains(getExcelData("MotherTongueCo", i, 0))) {
				
				
				int tongu= BaseTest.getRowCount("MotherTongue");
				System.out.println(" 3 "+tongu);
				
				for (int j = 1; j <=tongu ; j++) {
				
			//	BaseTest.select_text(driver.findElement(By.id("motherTongue")), BaseTest.getExcelData("MotherTongue", j, 0));
				Thread.sleep(1000);
				
				String a = driver.findElement(By.id("motherTongue")).getText();
				System.out.println(a);
				
				BaseTest.select_index(driver.findElement(By.id("motherTongue")), j);
				Thread.sleep(3000);
			try {	
				BaseTest.select_text(driver.findElement(By.id("motherTongue")), BaseTest.getExcelData("MotherTongueCo", j, 2));
			} catch (Exception e) {
				// TODO: handle exception
			}	
				if (driver.findElement(By.id("motherTongue")).getText().contains(BaseTest.getExcelData("MotherTongueCo", j, 1))) {
					
					Thread.sleep(3000);
					System.out.println("Mother Tongue was  Present : " + getExcelData("MotherTongueCo", j, 1));
					
				}
				}
				
				
				
				
			} else {

			}
			
			}	
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		*/


	
	}

}
