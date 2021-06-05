package com.testScript;

import java.awt.Robot;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.base.BaseTest;
import com.pom.EditPI_POM;
import com.pom.GothramPOM;
import com.utility.EditPIMethod;

public class WcsM extends BaseTest{
	

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
	public void WcsMe() throws Throwable {
		
		GothramPOM g = new GothramPOM(driver);
		EditPI_POM i = new EditPI_POM(driver);
		Actions acc = new Actions(driver);
		Robot r = new Robot();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		JavascriptExecutor js  = (JavascriptExecutor)driver;
		EditPIMethod pp = new EditPIMethod();
		
		
		driver.get("https://www.96kulimarathamatrimony.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		BaseTest.click(driver.findElement(By.id("loginbtn")));
		Thread.sleep(3000);
		BaseTest.click(g.getMatriID());
		BaseTest.typeData(g.getMatriID(), "NSK100014");
		BaseTest.click(g.getPasswordClear());
		BaseTest.typeData(g.getPassword(), "cbstest");
		//BaseTest.click(g.getLogin_btn());
		BaseTest.click(driver.findElement(By.xpath("//*[@id=\"login_form_web\"]/div[4]/div[2]")));
		
		
		
		try {
			BaseTest.click(g.getInterMediate_page());
		} catch (Exception e2) {
			// TODO: handle exception
		}
		
		try {
			BaseTest.click(g.getInterMediate_page1());
		} catch (Exception e2) {
			// TODO: handle exception
		}
		
		try {
			BaseTest.click(g.getInterMediate_page2());
		} catch (Exception e2) {
			// TODO: handle exception
		}
		
		Thread.sleep(5000);
		try {
			Alert al = driver.switchTo().alert();
			al.accept();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		Thread.sleep(5000);
		try {
			BaseTest.click(driver.findElement(By.xpath("//*[@id=\"special_offer_lightpic1\"]/div[1]/div/a/img")));
		} catch (Exception e2) {
			// TODO: handle exception
		}
		
		//////////////////////////////////////////////////////////////////////////////
		
		Thread.sleep(3000);
	try {	
		acc.moveToElement(driver.findElement(By.xpath("//*[@id=\"topnav-login-menu\"]/div[3]/div[2]/div[1]/a/img"))).build().perform();
		
		acc.moveToElement(driver.findElement(By.xpath("//*[@id=\"topnav-login-menu\"]/div[3]/div[2]/div[1]/a/img"))).build().perform();
	} catch (Exception e) {
         acc.moveToElement(driver.findElement(By.xpath("//*[@id=\"topnav-login-menu\"]/div[3]/div[2]/div[1]/a"))).build().perform();
		
         acc.moveToElement(driver.findElement(By.xpath("//*[@id=\"topnav-login-menu\"]/div[3]/div[2]/div[1]/a"))).build().perform();
	}
		
		
	Thread.sleep(3000);
	BaseTest.click(driver.findElement(By.xpath("//a[contains(text(),'Privacy Setting')]")));
		
	//a[contains(text(),'Who Can See Me')]
	Thread.sleep(3000);
	BaseTest.click(driver.findElement(By.xpath("//a[contains(text(),'Who Can See Me')]")));
	
	Thread.sleep(3000);
	String AgeFrom = BaseTest.getExcelData("WCSM", 1, 0);
	String AgeTo = BaseTest.getExcelData("WCSM", 1, 1);
	String Marital= BaseTest.getExcelData("WCSM", 1, 2);
	String Children= BaseTest.getExcelData("WCSM", 1, 3);
	String Education = BaseTest.getExcelData("WCSM", 1, 4);
	String IncomeFrom= BaseTest.getExcelData("WCSM", 1, 5);
	String IncomeTo= BaseTest.getExcelData("WCSM", 1, 6);
	String heightFrom= BaseTest.getExcelData("WCSM", 1, 7);
	String HeightTo= BaseTest.getExcelData("WCSM", 1, 8);
	String PhysicalStatus= BaseTest.getExcelData("WCSM", 1, 9);
	String motherTongue= BaseTest.getExcelData("WCSM", 1, 10);
	String Religion= BaseTest.getExcelData("WCSM", 1, 11);
	String SubCaste= BaseTest.getExcelData("WCSM", 1, 12);
	String Star= BaseTest.getExcelData("WCSM", 1, 13);
	String Manglik= BaseTest.getExcelData("WCSM", 1, 14);
	String EmployedIn= BaseTest.getExcelData("WCSM", 1, 15);
	String Occupation= BaseTest.getExcelData("WCSM", 1, 16);
	String Country= BaseTest.getExcelData("WCSM", 1, 17);
	String Citizenship= BaseTest.getExcelData("WCSM", 1, 18);
	String eating= BaseTest.getExcelData("WCSM", 1, 19);
	String drinking= BaseTest.getExcelData("WCSM", 1, 20);
	String smoking= BaseTest.getExcelData("WCSM", 1, 21);
	
	
	BaseTest.click(driver.findElement(By.id("wcsm2Div")));
	
	Thread.sleep(2000);
	BaseTest.select_text(driver.findElement(By.id("wcsmAgeFrom")), AgeFrom);
	
	Thread.sleep(2000);
	BaseTest.select_text(driver.findElement(By.id("wcsmAgeTo")), AgeTo);
	
	
		if (Marital.contains("Unmarried")) {
			BaseTest.click(driver.findElement(By.id("wcsmMaritalStatus1")));
		} else if (Marital.contains("Divorced")) {
			BaseTest.click(driver.findElement(By.id("wcsmMaritalStatus3")));
		} else if (Marital.contains("Widow")) {
			BaseTest.click(driver.findElement(By.id("wcsmMaritalStatus2")));
		} else if (Marital.contains("Separated")) {
			BaseTest.click(driver.findElement(By.id("wcsmMaritalStatus4")));
		}  else if (Marital.contains("Doesnt Matter")) {
			BaseTest.click(driver.findElement(By.id("wcsmMaritalStatus0")));
		}  else {}
		
		
		///
		
		if (driver.findElement(By.id("wcsmHaveChildren")).isDisplayed()) {
			BaseTest.select_text(driver.findElement(By.id("wcsmHaveChildren")), Children);
		} else {
		
		}
		
		//
	//	BaseTest.select_text(driver.findElement(By.id("wcsmEducation")), Education);
		
		//
		
	//	BaseTest.select_text(driver.findElement(By.id("wcsmAnnualIncomeFrom")), IncomeFrom);
		
		try {
	//	BaseTest.select_text(driver.findElement(By.id("wcsmAnnualIncomeTo")), IncomeTo);
		} catch (Exception e) {
			
		}
		//
		
		Thread.sleep(3000);
		BaseTest.click(driver.findElement(By.xpath("//div[contains(text(),'More Preferences')]")));
		
		
		Thread.sleep(3000);
		//wcsmSubCaste
		for (int ii = 0; ii <=100; ii++) {
			
			
			try {
			String SubCasteWCSM = BaseTest.getExcelData("EditPP", ii, 10);
			
			Thread.sleep(3000);
			BaseTest.select_deselectAll(driver.findElement(By.id("wcsmSubCaste")));
			
			Thread.sleep(3000);
			BaseTest.select_index(driver.findElement(By.id("wcsmSubCaste")), ii);
			
			Select AA = new Select(driver.findElement(By.id("wcsmSubCaste")));
			
			String DD = AA.getFirstSelectedOption().getText();
			
			Thread.sleep(3000);
			if (SubCasteWCSM.equals(DD)) {
				System.out.println(SubCasteWCSM+" WCSM Subcaste Matches with "+DD);
			} else {
				System.err.println(SubCasteWCSM+" WCSM Subcaste Not Matches "+DD);
			}
		
		
			} catch (Exception e) {
				// TODO: handle exception
			}
		

	}
	
	}
}
