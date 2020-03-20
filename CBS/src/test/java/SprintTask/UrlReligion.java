package SprintTask;

import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import base.BaseTest;

public class UrlReligion extends BaseTest{

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
	for (int i = 194; i <449; i++) {
		
	
	Thread.sleep(3000);
	//String a = 
	driver.get(BaseTest.getExcelDataUrl("login", i, 0));

	
try {	
	Thread.sleep(3000);
	if (driver.findElement(By.id("religion")).isDisplayed()) {
		
		Thread.sleep(1000);																		
		WebElement religion = driver.findElement(By.id("religion"));
		Select s = new Select(religion);
		Thread.sleep(1000);	
		String a = religion.getText();
		
		Thread.sleep(1000);
		String domain = driver.getCurrentUrl();
		/*Thread.sleep(1000);
		BaseTest.setExcelDataUrl("Religion", i, 0, domain);
		Thread.sleep(1000);
		BaseTest.setExcelDataUrl("Religion", i, 1, a);
		Thread.sleep(1000);*/
		System.out.println(i+" : "+domain+" : "+a);
		
	} else {
     //   System.out.println(i+" : " +driver.getCurrentUrl()+" : No Religion For this Domain");
	}
	
} catch (Exception e) {
	// TODO: handle exception
}
	
	}
	
	
	
	
	}
	
	
}
