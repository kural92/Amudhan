package SprintTask;

import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import base.BaseTest;

public class Registeration extends BaseTest{
	
	
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
	driver.findElement(By.xpath("//*[@id=\"home-register\"]/div/div[2]/nav/ul/li[2]/a")).click();
	
	Thread.sleep(3000);
	BaseTest.click(driver.findElement(By.id("domainName")));
	
	int a = getRowCount("Register");
	
	
	for (int i = 27; i <= a; i++) {
		
		
		Thread.sleep(1000);
		BaseTest.select_text(driver.findElement(By.id("domainName")), getExcelData("Register", i, 0));
		
		
		Thread.sleep(2000);
		BaseTest.select_index(driver.findElement(By.id("profile")), 2);
		
		Thread.sleep(2000);
		BaseTest.typeData(driver.findElement(By.id("name")), "Namashivaya");
		
		Thread.sleep(2000);
		acc.moveToElement(driver.findElement(By.id("gendermale"))).build().perform();
		acc.click();
//		BaseTest.click(driver.findElement(By.id("gendermale")));
		
		Thread.sleep(2000);
		acc.moveToElement(driver.findElement(By.id("dobDay"))).build().perform();
		acc.sendKeys("15").build().perform();
	//	BaseTest.click(driver.findElement(By.id("dobDay")));
	//	BaseTest.select_index(driver.findElement(By.id("dobDay")), 5);
		
		
		Thread.sleep(2000);
		acc.moveToElement(driver.findElement(By.id("dobMonth"))).build().perform();
		acc.sendKeys("10").build().perform();
	//	BaseTest.click(driver.findElement(By.id("dobMonth")));
	//	BaseTest.select_index(driver.findElement(By.id("dobMonth")), 5);
		
		Thread.sleep(2000);
		acc.moveToElement(driver.findElement(By.id("dobYear"))).build().perform();
		acc.sendKeys("1995").build().perform();
//		BaseTest.click(driver.findElement(By.id("dobYear")));
//		BaseTest.select_index(driver.findElement(By.id("dobYear")), 5);
		
		Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("motherTongue"))));
		BaseTest.click(driver.findElement(By.id("motherTongue")));
		
		Thread.sleep(2000);
	//	BaseTest.select_index(driver.findElement(By.id("caste")), 3);
		
		Thread.sleep(2000);
//		BaseTest.select_index(driver.findElement(By.id("subCaste")), 3);
	/*try {	
		for (int j = 1; j <=14; j++) {
			Thread.sleep(2000);
			String c = BaseTest.getExcelData("Register", i, j);
			System.out.println(c+" Excel Value ");
			
				Thread.sleep(2000);
		BaseTest.select_text(driver.findElement(By.id("motherTongue")), getExcelData("Register", i, j));
		
if (driver.findElement(By.id("motherTongue")).getText().contains(c)) {
			
			Thread.sleep(3000);
			System.out.println("Mother Tongue was  Present : " + c);
			
		}  else {
			System.err.println("Not Present");
		}
		
		
		} } catch (Exception e) {
			// TODO: handle exception
		}*/
		
		
		
		  for (int j = 1; j <=14 ; j++) {
			  
				 // driver.findElement(By.id("motherTongue")).click();
				  
				String lang = driver.findElement(By.xpath("//select[@id='motherTongue']//option["+j+"]")).getText();
				System.out.println(lang);
				  
				  Thread.sleep(2000);
				  
				 
				  
				if (lang.equalsIgnoreCase(getExcelData("Register", i, j))) {
					
					System.err.println(getExcelData("Register", i, j));
					
					System.err.println("Mother Tongue Matches");
					
				} else {
					
					System.out.println("Mother Tongue Not matches ");
					System.out.println(getExcelData("Register", i, j)+"   "+ lang);

				} 
				  
				
			}
			  
		
	}

	
	

	
	
	}

}
