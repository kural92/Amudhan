package cm.testscripts;

import java.awt.AWTException;
import java.awt.Robot;
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

import base.BaseTest;
import pom.cmlogin.OccupationPOM;

public class OccupationListTest extends BaseTest {
	
	
	WebDriver driver;

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
	public void occupationList() throws Throwable {
		
		Actions acc = new Actions(driver);
		Robot r = new Robot();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		JavascriptExecutor js  = (JavascriptExecutor)driver;
		
		
		OccupationPOM o = new OccupationPOM(driver);
		
		
		driver.get("https://www.communitymatrimony.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		BaseTest.click(o.getMatriID());
		Thread.sleep(1000);
		BaseTest.typeData(o.getMatriID(), "EZH710533");
		Thread.sleep(3000);
		
		BaseTest.click(o.getPassclr());
		BaseTest.typeData(o.getPassword(), "cbstest");
		Thread.sleep(3000);
		
		BaseTest.click(o.getLogin_btn());
		Thread.sleep(3000);
		
		
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

// AD Pages
		Thread.sleep(3000);
		try {
			driver.findElement(By.xpath("//*[@id=\"special_offer_lightpic1\"]/div[1]/div/a/img")).click();
		} catch (Exception e) {
			System.out.println("ADs Closed Successfully");
		}
		
		///////////////////////
		
		
		acc.moveToElement(o.getMenu_btn()).build().perform();
		Thread.sleep(1000);
		
		acc.moveToElement(o.getEdit_pp_menu_btn()).build().perform();
		BaseTest.click(o.getEdit_pp_menu_btn());
		Thread.sleep(3000);
		
		
		try {
			driver.findElement(By.xpath("//span[contains(text(),'Occupation - ')]//following::span[1]//following::span[3]//following::a[1]")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		if (driver.findElement(By.xpath("//span[contains(text(),'Occupation - ')]//following::span[1]//following::span[2]")).isDisplayed()) {
			
			driver.findElement(By.xpath("//span[contains(text(),'Occupation - ')]//following::span[1]//following::span[2]")).click();
			Thread.sleep(2000);
		} else {
			
		}
		
		
		String occ = o.getOccupation_value().getText();
		System.out.println(occ);
		
		String[] occu = occ.split(",");
		System.out.println(occu);
		int a = occu.length;
		System.out.println(a);
		
		for (int i = 0; i < occu.length; i++) {
			
			System.out.println(occu[i].toString());
			
		}
		
		
		
		////// 
		
		
		Thread.sleep(3000);
		BaseTest.click(o.getMatches());
		Thread.sleep(5000);
		
		String co  = o.getMatches_count().getText();
		Integer cou = Integer.parseInt(co);
		double couu = (cou/10);
		int coun = (int) Math.ceil(couu);
		System.out.println(coun);
		
	//	List<WebElement> matri_id = driver.findElements(By.xpath("//a[contains(text(),'EZH')]"));
		
		
		for (int j = 0; j < coun; j++) {
			
			List<WebElement> matri_id = driver.findElements(By.xpath("//a[contains(text(),'EZH')]"));
			
			js.executeScript("window.scrollBy(0,350)");
			
			List<WebElement> occupation = driver.findElements(By.xpath("//*[@id=\"ignorecrossbefore_0\"]/div[4]//following::div[3]//following::div[1]//following::ul[1]//following::li//following::span[contains(text(),'Occupation')]//following::span[1]"));
			System.out.println(occupation+"  * * * * * * * * * * ");
			for (int k = 0; k < occupation.size(); k++) {
				
				String verify = occupation.get(k).getText();
				System.out.println(verify+" < MMMM > ");
				
				if (occ.contains(verify)) {
					
					System.out.println(verify +"  = =  Matched");
					
				//	System.out.println("Occupation Matches");
					
				} else {
					
					String id = matri_id.get(k).getText();
					System.out.println(id);
					
					System.out.println(verify +"  = = not Matched");
					
					//System.out.println("Not matches ");

				}
				
				
			}
			
			Thread.sleep(3000);
			try {
				driver.findElement(By.xpath("//span[contains(text(),'Next ')]")).click();
			} catch (Exception e) {
				
			} Thread.sleep(3000);
			
			
		}
		
		
		
		
		
		
		
		////*[@id="ignorecrossbefore_0"]/div[4]//following::div[3]//following::div[1]//following::ul[1]//following::li//following::span[contains(text(),'Occupation')]//following::span[1]
	
		
		
		
		
		
		

	}
	
	
	

}
