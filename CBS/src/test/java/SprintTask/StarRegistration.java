package SprintTask;

import java.awt.Robot;
import java.util.List;

import org.openqa.selenium.Alert;
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

public class StarRegistration extends BaseTest{
	
	
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
	
	
	
	@Test()
	public void occupationSearch() throws Throwable {
		
		Actions acc = new Actions(driver);
		Robot r = new Robot();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		JavascriptExecutor js  = (JavascriptExecutor)driver;
	    
	Thread.sleep(3000);
	driver.navigate().to("https://www.communitymatrimony.com");
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
	BaseTest.select_text(driver.findElement(By.id("motherTongue")), getExcelData("Registeration", ran, 11));
	 String moth_tng = getExcelData("Registeration", ran, 11);
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
	driver.findElement(By.id("mobileNo")).sendKeys("9876500001");
	
	Thread.sleep(3000);
	driver.findElement(By.id("password")).sendKeys("cbstest");
	
	
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@value='REGISTER NOW']")).click();
	
	//ul[@id='select2-star-results']//li[contains(text(),'Anuradha / Anusham / Anizham')]
	Thread.sleep(5000);
	driver.findElement(By.id("select2-star-container")).click();
	Thread.sleep(3000);
	List<WebElement> star_count = driver.findElements(By.xpath("//ul[@id='select2-star-results']//li"));
	System.out.println(star_count.size());
	
	
	int cell = getCellCount("Star");
	System.out.println(cell);
 	
	for (int j = 0; j <=cell-1; j++) {
		
		String xcel = BaseTest.getExcelData("Star", 0, j);
		System.out.println(xcel);
		
	
		Thread.sleep(3000);
	if (moth_tng.equalsIgnoreCase(getExcelData("Star", 0, j))) {
		
		System.err.println("Mother Tongue Matches");
		
		for (int i = 1; i <= star_count.size()-1; i++) {
			
			
			System.out.println("\n"+i+"\n");
			
			String a = star_count.get(i).getText();
			System.err.println(a);
			String b = getExcelData("Star", i, j);
			System.err.println(b);
			
			if (a.equals(b)) {
				System.out.println(a+"  Matches "+b);
			} else {
				System.err.println(a+"   Not match with  "+b);
			}
			
		}
		
	} else {
		
		for (int i = 1; i <=star_count.size()-1; i++) {
			System.out.println("\n"+i+"\n"+"not matches");
		String a = star_count.get(i).getText();
		String b = getExcelData("Star", i, cell-1);
		
		if (a.equals(b)) {
			System.out.println(a+"   Matches   "+b);
		} else {
		//	System.err.println(a+"    Not match with   "+b);
		}
		
		}
	}
 
	}
	
	try {
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		
	} catch (Exception e) {
		// TODO: handle exception
	}
	
	}

}
