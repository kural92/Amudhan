package SprintTask;

import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.pages.EditPIMethod;

import base.BaseTest;
import pom.cmlogin.EditPI_POM;
import pom.cmlogin.GothramPOM;

public class Prime_Inrermediate extends BaseTest{
	
	
	@BeforeSuite
	public void setUp() {
	// test=reports.startTest("Divorcee Negative Payment");
	// test.log(LogStatus.PASS, "Divorcee Negative Payment Test Started");
	System.setProperty("webdriver.chrome.driver", ".//Driver//chromedriver.exe");
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--disable-notifications");
	driver = new ChromeDriver(options);

}
	
	
	@Test
	public void prime_Int() throws Throwable {
		
		
		GothramPOM g = new GothramPOM(driver);
		EditPI_POM i = new EditPI_POM(driver);
		Actions acc = new Actions(driver);
		Robot r = new Robot();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		JavascriptExecutor js  = (JavascriptExecutor)driver;
		EditPIMethod pp = new EditPIMethod();
		pom.cmlogin.Prime pr = new pom.cmlogin.Prime();
		
		
		driver.get("https://www.agarwalmatrimony.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		BaseTest.click(driver.findElement(By.id("loginbtn")));
		Thread.sleep(3000);
		BaseTest.click(g.getMatriID());
		BaseTest.typeData(g.getMatriID(), "AGR461814");
		BaseTest.click(g.getPasswordClear());
		BaseTest.typeData(g.getPassword(), "cbstest1");
		//BaseTest.click(g.getLogin_btn())s;
		BaseTest.click(driver.findElement(By.xpath("//*[@id=\"login_form_web\"]/div[4]/div[2]")));
		
		
		try {
		Thread.sleep(3000);
		if (driver.findElement(By.xpath("//a[contains(text(),'Upload Photo')]")).isDisplayed()) {
			
			
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[contains(text(),'Upload Photo')]")).click();
			Thread.sleep(3000);
			String UrlPh = driver.getCurrentUrl();
			
			String[] a= UrlPh.split("/index");
			System.err.println(a[0]);
			
			
			
			String[] c= a[0].split(".com/");
			System.out.println(c[1]);
			
			
			if (c[1].equals("photo")) {
				
				System.out.println("The Page was landed Correctly into Add Photo Page");
				
				
			} else {
				
				System.err.println("The Page was not landed Correctly into Add Photo Page");
			}
				
			}
			
		
		Thread.sleep(3000);
		driver.navigate().back();
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}	
			
			
			//System.out.println(UrlPh);
			
		try {
		Thread.sleep(3000);
		 if (driver.findElement(By.xpath("//a[contains(text(),'Upload ID Proof')]")).isDisplayed()) {
			
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[contains(text(),'Upload ID Proof')]")).click();
			
			Thread.sleep(3000);
			String UrlTB = driver.getCurrentUrl();
			
			Thread.sleep(3000);
			String[] a= UrlTB.split("/?mod");
			System.err.println(a[0]);
			
			
			
			String[] c= a[0].split(".com/");
			System.out.println(c[1]);
			
			
			if (c[1].equals("trustbadge/?")) {
				
				System.out.println("The Page was landed Correctly into Trust Badge Page");
				
				
			} else {
				
				System.err.println("The Page was not landed Correctly into Trust Badge Page");
			}
				
			}
			
		
		Thread.sleep(3000);
		driver.navigate().back();
		
		} catch (Exception e) {
			// TODO: handle exception
		}
		//////////////////////////////////////////////**********************/////////////////////////////////////////
		
		try {
		Thread.sleep(3000);
		if (driver.findElement(By.xpath("//a[contains(text(),'Explore prime')]")).isDisplayed()) {
			
			
			System.out.println("The Profile was Verified PRIME Member");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//a[contains(text(),'Explore prime')]")).click();
			
			Thread.sleep(3000);
			String mat = driver.getCurrentUrl();
			
			String[] a= mat.split("/index");
			System.err.println(a[0]);
			
			
			
			String[] c= a[0].split(".com/");
			System.out.println(c[1]);
			
			
			if (c[1].equals("matchsummary")) {
				
				System.out.println("The Page was landed Correctly into Matches Page");
				
				
			} else {
				
				System.err.println("The Page was not landed Correctly into Matches Page");
			}
				
			} else {
				
			
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
		
		//////////////////////////////////////**********************//////////////////////////////////////////////
		try {	
			Thread.sleep(3000);
			if (driver.findElement(By.xpath("//a[contains(text(),'Skip >>')]")).isDisplayed()) {
				
				
				Thread.sleep(3000);
				driver.findElement(By.xpath("//a[contains(text(),'Skip >>')]")).click();
				
				
			} else {
				
			
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}	
			
			///////////////////////////////////
			
			
			Thread.sleep(3000);
			try {
				driver.findElement(By.xpath("//*[@id=\"special_offer_lightpic1\"]/div[1]/div/a/img")).click();
			} catch (Exception e) {
				// TODO: handle exception
			}
		
		/////////////////////////////////
			
			
			
			Thread.sleep(3000);
			acc.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Matches ')]"))).build().perform();
			
			Thread.sleep(3000);
			acc.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Matches ')]"))).click().build().perform();
			
			
	/*		
			Thread.sleep(3000);
			if (driver.findElement(By.xpath("//*[@id=\"prime_div\"]/label/span/a[2]")).isDisplayed()) {
				
				Thread.sleep(3000);
				driver.findElement(By.xpath("//*[@id=\"prime_div\"]/label/span/a[2]")).click();
				
				Thread.sleep(3000);
				
				
				Thread.sleep(3000);
				if (driver.findElement(By.xpath("//a[contains(text(),'Upload Photo')]")).isDisplayed()) {
					
					
					Thread.sleep(2000);
					driver.findElement(By.xpath("//a[contains(text(),'Upload Photo')]")).click();
					Thread.sleep(3000);
					String UrlPh = driver.getCurrentUrl();
					
					String[] a= UrlPh.split("/index");
					System.err.println(a[0]);
					
					
					
					String[] c= a[0].split(".com/");
					System.out.println(c[1]);
					
					
					if (c[1].equals("photo")) {
						
						System.out.println("The Page was landed Correctly into Add Photo Page");
						
						
					} else {
						
						System.err.println("The Page was not landed Correctly into Add Photo Page");
					}
						
					}
					
				
				Thread.sleep(3000);
				driver.navigate().back();
					
					
					
					
					
					//System.out.println(UrlPh);
					
				Thread.sleep(3000);
				 if (driver.findElement(By.xpath("//a[contains(text(),'Upload ID Proof')]")).isDisplayed()) {
					
					Thread.sleep(2000);
					driver.findElement(By.xpath("//a[contains(text(),'Upload ID Proof')]")).click();
					
					Thread.sleep(3000);
					String UrlTB = driver.getCurrentUrl();
					
					Thread.sleep(3000);
					String[] a= UrlTB.split("/?mod");
					System.err.println(a[0]);
					
					
					
					String[] c= a[0].split(".com/");
					System.out.println(c[1]);
					
					
					if (c[1].equals("trustbadge/?")) {
						
						System.out.println("The Page was landed Correctly into Trust Badge Page");
						
						
					} else {
						
						System.err.println("The Page was not landed Correctly into Trust Badge Page");
					}
						
					}
					
				
				Thread.sleep(3000);
				driver.navigate().back();
				
		*/		
	
				
				

				
				
			
			
			
		

	}
		
	
		
		
	
	
	

}
