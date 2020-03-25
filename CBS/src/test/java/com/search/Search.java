package com.search;

import java.awt.Robot;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.pages.EditPIMethod;
import com.pages.SearchMethod;

import base.BaseTest;
import pom.cmlogin.EditPI_POM;
import pom.cmlogin.GothramPOM;
import pom.cmlogin.Search_POM;

public class Search extends BaseTest {

	@BeforeSuite
	public void setUp() {
		// test=reports.startTest("Divorcee Negative Payment");
		// test.log(LogStatus.PASS, "Divorcee Negative Payment Test Started");
		System.setProperty("webdriver.chrome.driver", ".//Driver//chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		// ChromeOptions options = new ChromeOptions();
		// options.addArguments("--disable-notifications");
		// options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);

	}

	@Test
	public void regularSearch() throws Throwable {

		GothramPOM g = new GothramPOM(driver);
		EditPI_POM i = new EditPI_POM(driver);
		Actions acc = new Actions(driver);
		Robot r = new Robot();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		com.pages.EditPIMethod pp = new EditPIMethod();

		driver.get("https://www.communitymatrimony.com");
		driver.manage().window().maximize();
		BaseTest.click(g.getMatriID());
		BaseTest.typeData(g.getMatriID(), "EZH710533");
		BaseTest.click(g.getPasswordClear());
		BaseTest.typeData(g.getPassword(), "cbstest1");
		BaseTest.click(g.getLogin_btn());

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

		Search_POM s = new Search_POM(driver);

		// SearchMethod.regularSearch();

		/////////////////////////////////////////////

		Thread.sleep(2000);
		BaseTest.click(s.getSearch_Menu_btn());

		try {
			Thread.sleep(5000);
			acc.moveToElement(driver.findElement(By.xpath("//*[@id=\"RSearchForm\"]/div[2]/div[1]/a[2]"))).build().perform();
			driver.findElement(By.id("chatbuddylistwin")).click();
			acc.moveToElement(driver.findElement(By.xpath("//*[@id=\"RSearchForm\"]/div[2]/div[1]/a[2]"))).click().build().perform();;
		} catch (Exception e) {

		}

		
		

		Thread.sleep(2000);

		BaseTest.select_text(s.getAdvanced_AgeFrom_DD(), BaseTest.getExcelData("Advanced Search", 1, 1));
		BaseTest.select_text(s.getAdvanced_AgeTo_DD(), BaseTest.getExcelData("Advanced Search", 1, 2));

		BaseTest.select_text(s.getAdvanced_HeightFrom_DD(), BaseTest.getExcelData("Advanced Search", 1, 3));
		BaseTest.select_text(s.getAdvanced_HeightTo_DD(), BaseTest.getExcelData("Advanced Search", 1, 4));

//////////////////////////////////////////////////////////////////////////

////////////////////////////////////Marital Status   ////////////////////////////////////		
		Thread.sleep(2000);
		if (BaseTest.getExcelData("Advanced Search", 1, 5).contains("Unmarried")) {
			if (!s.getAdvanced_Marital_Unmarried().isSelected()) {
				BaseTest.click(s.getAdvanced_Marital_Unmarried());
			} else {
				System.out.println("Unmarried Marital is Already Selected");
			}

		} else {
		}
		if (BaseTest.getExcelData("Advanced Search", 1, 5).contains("Widow / Widower")) {
			if (!s.getAdvanced_Marital_Widow().isSelected()) {
				BaseTest.click(s.getAdvanced_Marital_Widow());
			} else {
				System.out.println("Widow / Widower Marital is Already Selected");
			}

		} else {
		}
		if (BaseTest.getExcelData("Regular Search", 1, 5).contains("Divorced")) {
			if (!s.getAdvanced_Marital_Divorceed().isSelected()) {
				BaseTest.click(s.getAdvanced_Marital_Divorceed());
			} else {
				System.out.println("Divorced Marital is Already Selected");
			}

		} else {
		}
		if (BaseTest.getExcelData("Advanced Search", 1, 5).contains("Separated")) {
			if (!s.getAdvanced_Marital_Seperated().isSelected()) {
				BaseTest.click(s.getAdvanced_Marital_Seperated());
			} else {
				System.out.println("Seperated Marital is Already Selected");
			}

		} else {
		}
		if (BaseTest.getExcelData("Advanced Search", 1, 5).contains("Any")) {
			if (!s.getAdvanced_Marital_Any().isSelected()) {
				BaseTest.click(s.getRegular_Marital_Any());
			} else {
				System.out.println("Any Marital is Already Selected");
			}
		}
/////////////////////////////////////////   *  *  *  *  *   ///////////////////////////////	
/////////     Have Children  //////
		if (!s.getAdvanced_Marital_Unmarried().isSelected() || s.getAdvanced_Marital_Divorceed().isSelected()
				|| s.getAdvanced_Marital_Seperated().isSelected() || s.getAdvanced_Marital_Widow().isSelected()
				|| s.getAdvanced_Marital_Any().isSelected()) {
			if (BaseTest.getExcelData("Advanced Search", 1, 6).equals("Doesn't matter")) {
				if (!s.getAdvanced_HaveChild__Doesnt().isSelected()) {
					BaseTest.click(s.getAdvanced_HaveChild__Doesnt());
				} else {
					System.out.println("Doesn't Matter Children Status is Already Selected");
				}

			} else if (BaseTest.getExcelData("Advanced Search", 1, 6).equals("Yes. Living together")) {
				if (!s.getAdvanced_HaveChild_YesLiving().isSelected()) {
					BaseTest.click(s.getAdvanced_HaveChild_YesLiving());
				} else {
					System.out.println("Yes Living Together Children Status is Already Selected");
				}
			} else if (BaseTest.getExcelData("Advanced Search", 1, 6).equals("Yes. Not living together")) {
				if (!s.getAdvanced_HaveChild_Yes_Not_Living().isSelected()) {
					BaseTest.click(s.getAdvanced_HaveChild_Yes_Not_Living());
				} else {
					System.out.println("Yes, Not Living Together Children Status is Already Selected");
				}
			} else {
				if (!s.getAdvanced_HaveChild_No().isSelected()) {
					BaseTest.click(s.getAdvanced_HaveChild_No());
				} else {
					System.out.println("No Children Status is Already Selected");
				}
			}
		} else {
			System.out.println("Marital Status is UnMarried - So there is no Children Status to Display/Select");
		}

/////////////////////////////////////////////////////////////////////////////////	
		// Sub Caste /////

		/*
		 * String SubCaste = BaseTest.getExcelData("Advanced Search", 1, 7);
		 * Thread.sleep(2000); BaseTest.click(s.getRegular_Subcaste_Value()); if
		 * (SubCaste.contains(", ")) { String[] Subcaste = SubCaste.split(", "); for
		 * (int j = 0; j < Subcaste.length; j++) {
		 * 
		 * Thread.sleep(1000);
		 * acc.doubleClick(driver.findElement(By.xpath("//option[contains(text(),'"+j+
		 * "')]"))).build().perform();
		 * //acc.moveToElement(driver.findElement(By.xpath("//option[contains(text(),'"+
		 * j+"')]"))).doubleClick().build().perform(); Thread.sleep(1000); } }else{
		 * Thread.sleep(2000); BaseTest.click(s.getRegular_Subcaste_Value());
		 * acc.doubleClick(driver.findElement(By.xpath("//option[contains(text(),'"+
		 * SubCaste+"')]"))).build().perform(); }
		 */

	}

}
