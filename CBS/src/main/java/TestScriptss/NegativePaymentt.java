package TestScriptss;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseTest;
import pom.cmlogin.payDiv;

public class NegativePaymentt extends BaseTest{
	
	WebDriver driver;

	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\amuthan\\eclipse-workspace\\CBS\\Driver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);
		driver.get("https://www.divorceematrimony.com");
        driver.manage().window().maximize();
	}
	

	@Test
	public void negativePayment() {
		
		//BaseTest b = new BaseTest();
		payDiv p = new payDiv(driver);
		
		BaseTest.click(p.getMatriID());
		BaseTest.typeData(p.getMatriID(), BaseTest.readValueFromExcelSheet().get(1).get("UserName"));
		BaseTest.click(p.getDpassWordclr1());
		BaseTest.typeData(p.getDpassword(), BaseTest.readValueFromExcelSheet().get(1).get("PassWord"));
		BaseTest.click(p.getDlogin());
		WebDriverWait Wait = new WebDriverWait(driver, 3000);
		Wait.until(ExpectedConditions.visibilityOf(p.getDskipInter())).click();
		
		BaseTest.click(p.getDaddsPop());
		BaseTest.click(p.getDupgrde());
		
		BaseTest.click(p.getDcardNumber());
		BaseTest.typeData(p.getDcardNumber(), BaseTest.readValueFromExcelSheet().get(1).get("Card NO"));
		BaseTest.typeData(p.getDexpreMnth(), BaseTest.readValueFromExcelSheet().get(1).get("EX Month"));
		BaseTest.typeData(p.getDexpreYr(), BaseTest.readValueFromExcelSheet().get(1).get("EX Date"));
		BaseTest.typeData(p.getDCvv(), BaseTest.readValueFromExcelSheet().get(1).get("Cvv"));
		BaseTest.click(p.getDpayCRDcard());
		
		

	}
	
	@AfterSuite
	public void exit() {
		driver.close();

	}

}



