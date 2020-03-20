package SprintTask;

import java.awt.Robot;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.javascript.host.Set;
import com.gargoylesoftware.htmlunit.javascript.host.media.rtc.mozRTCIceCandidate;

import base.BaseTest;

public class RasiViewProfile extends BaseTest {
	
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
	
	driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/form/div[1]/input")).sendKeys("EZH710533");

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
	
	driver.findElement(By.xpath("//a[contains(text(),'My Home')]")).click();
	Thread.sleep(3000);
	
	try {
	 driver.findElement(By.xpath("//*[@id=\"strategicComm\"]/div/div[2]/a/img")).click();
	 Thread.sleep(3000);
	} catch (Exception e) {
		// TODO: handle exception
	}
	Thread.sleep(3000);
	List<WebElement> count = driver.findElements(By.xpath("//div[@class='padt10 padl10 padb10 padr5 ']"));
	System.out.println(count.size());
	
	
	String parent = driver.getWindowHandle();
	
	
	for (int i = 0; i < count.size(); i++) {
		
		Thread.sleep(3000);
		count.get(i).click();
		
		Thread.sleep(3000);
		java.util.Set<String> child = driver.getWindowHandles();
		if (!parent.equals(child)) {
			
			for (String handle : child) {
				Thread.sleep(3000);
				driver.switchTo().window(handle);
				Thread.sleep(3000);
				
			}
			
			
			String Mother_ton = driver.findElement(By.xpath("(//span[contains(text(),'Mother Tongue')]//following::span[@class='ng-binding'])[1]")).getText();
			System.out.println(Mother_ton);
			Thread.sleep(3000);
			String rasi = driver.findElement(By.xpath("(//span[contains(text(),'Raasi')]//following::span[@class='ng-binding'])[1]")).getText();
			System.out.println(rasi);
			Thread.sleep(3000);
			
			int row_mot = BaseTest.getCellCount("Rasi");
			
			
			for (int j = 0; j < row_mot; j++) {
				
				String Lan = BaseTest.getExcelData("Rasi", 0, j);
				System.out.println(Lan);
				Thread.sleep(3000);
				
				if (Mother_ton.equalsIgnoreCase(Lan)) {
			
					
					int rasi_coun = BaseTest.getRowCount("Rasi");
					Thread.sleep(3000);
					for (int k = 1; k < rasi_coun; k++) {
						
						if (rasi.equalsIgnoreCase(BaseTest.getExcelData("Rasi", k, j))) {
							
							System.err.println("Rasi Appeared Based on the Mother Tongue");
							Thread.sleep(3000);
						} else {
							
							String Hindi_rasi = BaseTest.getExcelData("Rasi", k, 3);
							
							if (rasi.equalsIgnoreCase(Hindi_rasi)) {
								
								System.out.println("Rasi Appeared Based on the Mother Tongue-( HINDI )");
								Thread.sleep(3000);
							}
							
							

						}
						
			
						
					}
					
					
		         Thread.sleep(3000);
		         driver.close();
		         driver.switchTo().window(parent);
		         Thread.sleep(3000);
					
					
				} else {
					
				/*	String rasi = driver.findElement(By.xpath("(//span[contains(text(),'Raasi')]//following::span[@class='ng-binding'])[1]")).getText();
					System.out.println(rasi);
					
					
					int rasi_coun = BaseTest.getRowCount("Rasi");
					
					for (int k = 1; k < rasi_coun; k++) {
						
						if (rasi.equalsIgnoreCase(BaseTest.getExcelData("Rasi", k, 3))) {
							
							System.out.println("Rasi Appeared Based on the Mother Tongue(HINDI)");
							
						} else {
							
							System.out.println("Rasi not Appeared Based on the Mother Tongue(HINDI)");

						}
						
								
					}
					
					
		        Thread.sleep(3000);
		         driver.close();
		         driver.switchTo().window(parent);
		         Thread.sleep(3000);*/

				}

				
			}
	
		}
		
	}
	

	
	}
	
	
	
	
	

}
