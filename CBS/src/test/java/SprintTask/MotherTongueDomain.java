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

import base.BaseTest;

public class MotherTongueDomain extends BaseTest{
	

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
	
	driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/form/div[1]/input")).sendKeys("JAI7");

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
	
	//  Basic Edit
	driver.findElement(By.xpath("//*[@id=\"container1\"]/div[2]/a")).click();
	Thread.sleep(3000);
	
	
	int Domaimn = getRowCount("MotherTongueCo");
	System.err.println("Domain : "+ Domaimn);
	
	
	String url = driver.getCurrentUrl();
	
	String[] a = url.split("//");
	
	String b = a[1].toString().trim();
	
	String[] c= b.split("/");
	
	String d = c[0].toString().trim();
	
	
	System.out.println(" Domain : "+d);
	
	
	 List<WebElement> tongue = driver.findElements(By.id("motherTongue"));
	
	/////////////////////
	
	for (int i = 1; i <= Domaimn; i++) {
		
	
	
	if ((getExcelData("MotherTongueCo", i, 0)).equalsIgnoreCase(d)) {
		
	  System.out.println(d+" Equals " + Domaimn);
	  
	  for (int j = 1; j <=14 ; j++) {
		  
		 // driver.findElement(By.id("motherTongue")).click();
		  
		String lang = driver.findElement(By.xpath("//select[@id='motherTongue']//option["+j+"]")).getText();
		System.out.println(lang);
		  
		  Thread.sleep(2000);
		  
		 
		  
		if (lang.equalsIgnoreCase(getExcelData("MotherTongueCo", i, j))) {
			
			System.out.println(getExcelData("MotherTongueCo", i, j));
			
			System.out.println("Mother Tongue Matches");
			
		} else {
			
			System.out.println("Mother Tongue Not matches ");
			System.out.println(getExcelData("MotherTongueCo", i, j)+"   "+ lang);

		} 
		  
		
	}
	  
		
	} else {
		
		System.out.println("Not Equals");

	}
	

	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
