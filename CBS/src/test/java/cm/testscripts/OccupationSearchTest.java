package cm.testscripts;

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

public class OccupationSearchTest extends BaseTest{
	
	
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
	public void occupationSearch() throws Throwable {
		
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
		Thread.sleep(3000);
		
		////////////////////   
		
		BaseTest.click(o.getSearch_btn());
		Thread.sleep(3000);
		
		BaseTest.click(o.getAdvanced_search());
		Thread.sleep(3000);
		
		/*driver.findElement(By.id("maritalStatus0")).click();
		Thread.sleep(3000);*/
		
		/*BaseTest.click(o.getSubCaste_dropdown());
		Thread.sleep(3000);
		acc.doubleClick(driver.findElement(By.xpath("//option[@title='Any']"))).build().perform();*/
		
		BaseTest.click(o.getOccupation_seach_drpdown());
		Thread.sleep(3000);
		
	/*	List<WebElement> eleme = driver.findElements(By.id("optgroupLa"));
		System.out.println(eleme.size());
		
		for (int i = 0; i < eleme.size(); i++) {
			
			acc.moveToElement(eleme.get(i)).doubleClick();
			
		}*/
		
		
		
		//BaseTest.select_index(o.getOccupation_seach_drpdown(), 7);
		
		int excel_cou = BaseTest.getRowCount("Occupation");
		System.out.println(excel_cou);
		
		
		
		
	for (int i = 0; i < 30; i++) {
		
		String abc = BaseTest.getExcelData("Occupation", i, 2);
		String aab = abc.trim();
		try {
		acc.doubleClick(driver.findElement(By.xpath("//option[@title='"+aab+"']"))).build().perform();
	} catch (Exception e) {
		// TODO: handle exception
	}
		
	}
		
	//	acc.doubleClick(driver.findElement(By.xpath("//option[@title='Supervisor']"))).build().perform();
		
		
		
	//	BaseTest.select_string(o.getOccupation_seach_drpdown(), BaseTest.getExcelData("Occupation", 14, 6));
		Thread.sleep(3000);
		
		String occ_val = o.getSearch_occupation_value().getText();
		System.out.println(occ_val);
		
		
		Thread.sleep(3000);  //*[@id="srcform"]/div[3]/div[13]/div[1]/input[1]
		BaseTest.click(driver.findElement(By.xpath("//*[@id=\"srcform\"]/div[3]/div[13]/div[1]/input[1]")));
		
		Thread.sleep(3000);
		String co  = o.getMatches_count().getText();
		Integer cou = Integer.parseInt(co);
		double couu = (cou/10);
		int coun = (int) Math.ceil(couu);
		System.out.println(coun);
		
		
		for (int i = 0; i < cou; i++) {
			
			

			List<WebElement> occupation = driver.findElements(By.xpath("//*[@id=\"ignorecrossbefore_0\"]/div[4]//following::div[3]//following::div[1]//following::ul[1]//following::li//following::span[contains(text(),'Occupation')]//following::span[1]"));
			System.out.println(occupation+"  * * * * * * * * * * ");
			
			
			List<WebElement> matri_id = driver.findElements(By.xpath("//a[contains(text(),'EZH')]"));
			int size_id = matri_id.size();
			
			
			for (int k = 0; k < occupation.size(); k++) {
				
				String verify = occupation.get(k).getText();
				System.out.println(verify+" < MMMM > ");
				
				
				if (occ_val.contains(verify)) {
					
					System.out.println(" Verification "+verify +"  = =  Matched");
					
					js.executeScript("window.scrollBy(0,350)");
					
				Thread.sleep(3000);
					try {
						driver.findElement(By.xpath("//span[contains(text(),'Next ')]")).click();
					} catch (Exception e) {
						
					} Thread.sleep(3000);
				//	System.out.println("Occupation Matches");
					
				} else {
					
				    String text = matri_id.get(k).getText();
				    Thread.sleep(3000);
				    System.out.println(text);
					
					System.out.println(" Verification "+verify +"  = = not Matched");
					
					js.executeScript("window.scrollBy(0,350)");
					
					Thread.sleep(3000);
					try {
						driver.findElement(By.xpath("//span[contains(text(),'Next ')]")).click();
					} catch (Exception e) {
						
					} Thread.sleep(3000);

				}
			
		}
			
			

	}
		
	}
}
