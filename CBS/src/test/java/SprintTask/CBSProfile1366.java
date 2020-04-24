package SprintTask;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import base.BaseTest;

public class CBSProfile1366 extends BaseTest {
	
	//String matriid, Caste_Value, subCaste_Value,Caste_PP,SubCaste_PP,Dosham_PP,CitizenShip_PP;
	

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
	public void christianMatrimony() throws Throwable {

		Thread.sleep(2000);
		driver.get("https://www.christianmatrimony.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.id("selectedvalue")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[contains(text(),'Son')]")).click();
		Thread.sleep(2000);
		// driver.findElement(By.id("gender_male")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("name")).sendKeys("CHRISTA");
		Thread.sleep(2000);
		driver.findElement(By.id("mobileNo")).sendKeys("9874563219");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"home-register\"]/div/div/div/div[2]/div[4]/button")).click();
		Thread.sleep(2000);
		/*
		 * driver.findElement(By.id("Myself")).click(); Thread.sleep(2000);
		 * driver.findElement(By.id("gender_male")).click(); Thread.sleep(2000);
		 * driver.findElement(By.xpath(
		 * "//*[@id=\"home-register\"]/div/div/div/div[2]/div[4]/button")).click();
		 */
		Thread.sleep(3000);
		driver.findElement(By.id("DOB")).sendKeys("10101992");
		Thread.sleep(2000);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		// driver.findElement(By.xpath("//a[@class='ui-state-default
		// ui-state-active']")).click();

		/////////////////////////////////////////////////////////////////////////////////

///////////////////////////////////////////////////////////////////////////////////

		Thread.sleep(3000);
		int Denomination_Count = BaseTest.getCellCount("Common Division");
		System.out.println("Cell Count : " + Denomination_Count);

		for (int i = 2; i < Denomination_Count; i++) {

			Thread.sleep(2000);
			String Denomination = BaseTest.getExcelData("Common Division", 0, i);
			System.out.println("Denomination : " + Denomination);

			Thread.sleep(2000);
			BaseTest.select_text(driver.findElement(By.id("denomination")), Denomination);

			Thread.sleep(2000);

			Thread.sleep(3000);
			int CommonDivision_Count = BaseTest.getRowCount("Common Division");
			System.out.println("Row Count : " + CommonDivision_Count);

			Thread.sleep(2000);
			for (int j = 1; j < CommonDivision_Count; j++) {
				Thread.sleep(2000);
				String Coomon_Division = BaseTest.getExcelData("Common Division", j, i);

				BaseTest.select_index(driver.findElement(By.id("caste")), j);
				Thread.sleep(2000);
				WebElement Caste_aa = driver.findElement(By.id("caste"));
				Select aa = new Select(Caste_aa);
				WebElement Caste_Val = aa.getFirstSelectedOption();
				String Caste_Value = Caste_Val.getText();
				System.out.println("Caste Value : " + Caste_Value);

				Thread.sleep(2000);
				if (Coomon_Division.contains(Caste_Value)) {
					System.out.println(Coomon_Division + " matches with given data " + Caste_Value);
				} else {
					System.err.println(Coomon_Division + " not matches with given data " + Caste_Value);
				}

			}

		}

		/////////////////////////////////////////////////////////////////////////////////

	}

}
