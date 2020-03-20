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

import base.BaseTest;

public class CityRegistration extends BaseTest{
	

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
	BaseTest.select_text(driver.findElement(By.id("domainName")), getExcelData("Registeration", 1, 0));
	
	Thread.sleep(3000);
	BaseTest.select_index(driver.findElement(By.id("profile")), 2);
	
	Thread.sleep(3000);
	driver.findElement(By.id("name")).sendKeys(getExcelData("Registeration", 1, 2));
	
	Thread.sleep(2000);
	//driver.findElement(By.id("gendermale")).click();
	acc.moveToElement(driver.findElement(By.id("genderfemale"))).click().build().perform();
	
	
	
	
	Thread.sleep(2000);
//	acc.moveToElement(driver.findElement(By.id("dobDay"))).build().perform();
//	acc.sendKeys("15").build().perform();
//	BaseTest.click(driver.findElement(By.id("dobDay")));
	BaseTest.select_index(driver.findElement(By.id("dobDay")), 5);
	
	
	Thread.sleep(2000);
//	acc.moveToElement(driver.findElement(By.id("dobMonth"))).build().perform();
//	acc.sendKeys("10").build().perform();
//	BaseTest.click(driver.findElement(By.id("dobMonth")));
	BaseTest.select_index(driver.findElement(By.id("dobMonth")), 5);
	
	Thread.sleep(2000);
//	acc.moveToElement(driver.findElement(By.id("dobYear"))).build().perform();
//	acc.sendKeys("1995").build().perform();
//	BaseTest.click(driver.findElement(By.id("dobYear")));
	BaseTest.select_index(driver.findElement(By.id("dobYear")), 10);
	
	
	Thread.sleep(3000);
	BaseTest.select_index(driver.findElement(By.id("maritalStatus")),1);
	
	Thread.sleep(3000);
	try {
		BaseTest.select_index(driver.findElement(By.id("religion")), 1);
	} catch (Exception e) {
		// TODO: handle exception
	}
	
	Thread.sleep(3000);
	try {
		BaseTest.select_index(driver.findElement(By.id("caste")), 3);
	} catch (Exception e) {
		// TODO: handle exception
	}
	
	Thread.sleep(3000);
	try {
		BaseTest.select_index(driver.findElement(By.id("subCaste")), 2);
	} catch (Exception e) {
		// TODO: handle exception
	}
	
	int ran = getExcelRandomRowNum("Registeration");
	
	Thread.sleep(3000);
	BaseTest.select_text(driver.findElement(By.id("motherTongue")), getExcelData("Registeration", 1, 11));
	 String moth_tng = getExcelData("Registeration", 1, 11);
	 System.out.println(moth_tng);

	
	Thread.sleep(3000);
	try {
		BaseTest.select_index(driver.findElement(By.id("religion")), 1);
	} catch (Exception e) {
		// TODO: handle exception
	}
	
	Thread.sleep(3000);
	try {
	driver.findElement(By.id("subCasteText")).sendKeys("Others");
	} catch (Exception e) {
		// TODO: handle exception
	}
	
	Thread.sleep(3000);
	BaseTest.select_text(driver.findElement(By.id("country")), getExcelData("Registeration", 1, 8));
	
	Thread.sleep(3000);
	driver.findElement(By.id("mobileNo")).sendKeys("8098882244");
	
	Thread.sleep(3000);
	driver.findElement(By.id("password")).sendKeys("cbstest");
	
	
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@value='REGISTER NOW']")).click();
	
	Thread.sleep(3000);
	for (int i=0; i <= 16; i++) {
		
	
		
		Thread.sleep(2000);
		BaseTest.click(driver.findElement(By.id("select2-residingState-container")));
		BaseTest.select_text(driver.findElement(By.id("residingState")), BaseTest.getExcelData("City", 0, i));
		Thread.sleep(3000);
		
		String a = getExcelData("City", 1, i);
		Integer aa = Integer.parseInt(a);
		int A = (aa+2);
		Thread.sleep(2000);
		System.err.println(getExcelData("City", 0, i));
		
		for (int j = 2; j <=A ; j++) {
		try {
			System.out.println(j);
			driver.findElement(By.id("select2-residingCityId-container")).click();
			Thread.sleep(2000);
			BaseTest.select_text(driver.findElement(By.id("residingCityId")), BaseTest.getExcelData("City", j, i));
			Thread.sleep(2000);
			System.out.println(getExcelData("City", j, i));
		} catch (Exception e) {
			
		}
			
		}
		
	}
	
	
	
	
	
	}

}
