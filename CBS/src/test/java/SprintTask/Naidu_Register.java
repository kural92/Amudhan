package SprintTask;

import java.awt.Robot;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import base.BaseTest;

public class Naidu_Register extends BaseTest {

	String matriid, Caste_Value, subCaste_Value, Caste_PP, SubCaste_PP, Dosham_PP, CitizenShip_PP;

	@BeforeSuite
	public void setUp() {
		// test=reports.startTest("Divorcee Negative Payment");
		// test.log(LogStatus.PASS, "Divorcee Negative Payment Test Started");
		System.setProperty("webdriver.chrome.driver", ".//Driver//chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);

	}

	@Test // (enabled = true,invocationCount = 5)
	public void occupationSearch() throws Throwable {

		int i = getExcelRandomRowNum("Registeration");
		Actions acc = new Actions(driver);
		Robot r = new Robot();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		JavascriptExecutor js = (JavascriptExecutor) driver;

		// for (int i = 1; i <=100; i++) {

		Thread.sleep(3000);
		driver.get("https://www.communitymatrimony.com");
		driver.manage().window().maximize();

		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"home-register\"]/div/div[2]/nav/ul/li[2]/a")).click();
		String CommunitySite = BaseTest.getExcelData("Registeration", 1, 0);
		Thread.sleep(3000);
		BaseTest.select_text(driver.findElement(By.id("domainName")), "96kulimarathamatrimony");

		Thread.sleep(3000);
		BaseTest.select_index(driver.findElement(By.id("profile")), 2);

		Thread.sleep(3000);
		driver.findElement(By.id("name")).sendKeys(getExcelData("Registeration", 1, 2));

		Thread.sleep(2000);
		// driver.findElement(By.id("gendermale")).click();
		acc.moveToElement(driver.findElement(By.id("gendermale"))).click().build().perform();

		Thread.sleep(2000);

		BaseTest.select_text(driver.findElement(By.id("dobDay")), BaseTest.getExcelData("Registeration", i, 4));

		Thread.sleep(2000);

		BaseTest.select_text(driver.findElement(By.id("dobMonth")), BaseTest.getExcelData("Registeration", i, 5));

		Thread.sleep(2000);

		BaseTest.select_text(driver.findElement(By.id("dobYear")), BaseTest.getExcelData("Registeration", i, 6));

		Thread.sleep(3000);
		BaseTest.select_index(driver.findElement(By.id("maritalStatus")), 1);

		Thread.sleep(3000);
		try {
			BaseTest.select_index(driver.findElement(By.id("religion")), 1);
		} catch (Exception e) {
			// TODO: handle exception

		}

		try {
			
			int count = BaseTest.getCellCount("Registeration");
			System.out.println(count);
			
		for (int j =0 ; j <=100; j++) {
			
			Thread.sleep(3000);
			String SubCaste = BaseTest.getExcelData("Registeration", j, 12);

			BaseTest.select_index(driver.findElement(By.id("subCaste")), j);
			Thread.sleep(2000);
			
			Thread.sleep(2000);
			
			Select DD = new Select(driver.findElement(By.id("subCaste")));
			
		
			String AA = DD.getFirstSelectedOption().getText();
			Thread.sleep(2000);
			if (SubCaste.equals(AA)) {
				
				System.out.println(AA+" Selected Subcaste Order Matches with " +DD);
				
			} else {
				
				System.err.println(AA+" Not Selected Subcaste Order Matches with " +DD);
			}
			
		}
		
		} catch (Exception e) {
			// TODO: handle exception
		}
		Thread.sleep(3000);
		String SubCaste = BaseTest.getExcelData("Registeration", i, 12);

		BaseTest.select_text(driver.findElement(By.id("subCaste")), SubCaste);
		Thread.sleep(2000);

	//	BaseTest.writeexcel(SubCaste, i, 1);
		System.out.println("Sub_Caste Value : " + SubCaste);

		int ran = getExcelRandomRowNum("Registeration");

		Thread.sleep(3000);
		BaseTest.select_text(driver.findElement(By.id("motherTongue")), getExcelData("Registeration", i, 11));
		String moth_tng = getExcelData("Registeration", 1, 11);
		System.out.println(moth_tng);

		Thread.sleep(3000);
		try {
			driver.findElement(By.id("subCasteText")).sendKeys("Others");
		} catch (Exception e) {
			// TODO: handle exception
		}

		Thread.sleep(3000);
		BaseTest.select_text(driver.findElement(By.id("country")), getExcelData("Registeration", 1, 8));

		Thread.sleep(3000);
		BaseTest.select_text(driver.findElement(By.id("countryCode")), "+1 (United States of America)");

		Thread.sleep(3000);
		String Mobile_Number = "7777777" + (Math.round(Math.random() * 978));
		System.out.println(Mobile_Number);
		driver.findElement(By.id("mobileNo")).sendKeys(Mobile_Number);

		Thread.sleep(3000);
		driver.findElement(By.id("password")).sendKeys("cbstest");

		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='REGISTER NOW']")).click();

		Thread.sleep(5000);
		driver.findElement(By.id("email")).sendKeys("testmail" + Math.random() * 1 + "@gmail.com");

		Thread.sleep(3000);
		BaseTest.select_index(driver.findElement(By.id("heightFeet")), 23);

		Thread.sleep(3000);
		driver.findElement(By.id("physicalStatuss0")).click();

		Thread.sleep(3000);
		BaseTest.select_text(driver.findElement(By.id("residingState")), "Tamil Nadu");

		Thread.sleep(3000);
		BaseTest.waits(driver.findElement(By.id("residingCityMainDistId")));

		Thread.sleep(3000);
		BaseTest.select_text(driver.findElement(By.id("residingCityMainDistId")), "Chennai");

		Thread.sleep(3000);
		// BaseTest.select_index(driver.findElement(By.id("residingCityMainDistId")),
		// 5);

		String Citizenship = BaseTest.getExcelData("Registeration", 1, 18);
		Thread.sleep(3000);
		BaseTest.select_text(driver.findElement(By.id("citizenship")), "India");

		String Willing_subCaste = BaseTest.getExcelData("Registeration", 1, 19);

		Thread.sleep(3000);
		if (driver.findElement(By.id("labelsamecaste2")).isSelected()) {
			System.out.println("Willing to marry Other Division is Already Selected");
		} else {
			System.out.println("Willing to marry Other Division is Already Selected");
		}

		Thread.sleep(2000);
		try {
			BaseTest.select_index(driver.findElement(By.id("religious")), 1);
		} catch (Exception e) {
			// TODO: handle exception
		}

		try {
			Thread.sleep(3000);
			BaseTest.select_index(driver.findElement(By.id("gothram")), 3);
		} catch (Exception e) {
			// TODO: handle exception
		}

		try {
			String Dosham = BaseTest.getExcelData("Registeration", 1, 20);
			Thread.sleep(3000);
			if (Dosham.contains("Yes")) {
				driver.findElement(By.xpath("//*[@id=\"manglikdisplay\"]/dl[2]/dd/label[1]")).click();
				Thread.sleep(3000);
				driver.findElement(By.id("manglik_m4")).click();
			} else if (Dosham.contains("No")) {
				driver.findElement(By.xpath("//*[@id=\"manglikdisplay\"]/dl[2]/dd/label[2]")).click();
			} else {
				driver.findElement(By.xpath("//*[@id=\"manglikdisplay\"]/dl[2]/dd/label[3]")).click();
			}

		} catch (Exception e) {
			// TODO: handle exception
		}

		Thread.sleep(3000);
		BaseTest.select_text(driver.findElement(By.id("educationCategory")), "IPS");

		Thread.sleep(3000);
		driver.findElement(By.id("employmentCategorys3")).click();

		Thread.sleep(3000);
		BaseTest.select_text(driver.findElement(By.id("occupation")), "Manager");

		Thread.sleep(3000);
		BaseTest.select_index(driver.findElement(By.id("annualIncome")), 5);

		Thread.sleep(3000);
		BaseTest.click(driver.findElement(By.id("familyValues1")));

		Thread.sleep(3000);
		BaseTest.click(driver.findElement(By.id("familyTypes1")));

		Thread.sleep(3000);
		BaseTest.click(driver.findElement(By.id("familyStatuss1")));

		Thread.sleep(3000);
		driver.findElement(By.id("complete")).click();

		try {
			Thread.sleep(3000);
			driver.findElement(By.id("complete")).click();
		} catch (Exception e) {
			// TODO: handle exception
		}

		String aaa = driver.findElement(By.id("assd")).getText();
		

		Thread.sleep(2000);
		WebElement element1 = driver.findElement(By.xpath("//div[contains(text(),'Your Matrimony ID:')]"));
		String text = element1.getText();
		System.out.println(text);
		String matriid = text.substring(19, 28);
		System.out.println("Newly Registered Matri ID is - : " + matriid);

		BaseTest.writeexcel(matriid, i, 0);

		/*
		 * Thread.sleep(5000);
		 * driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "t");
		 * System.out.println("New tab opened"); Thread.sleep(9000); driver.navigate()
		 * .to(
		 * "https://admin:lRqW6WNT@communitymatrimony.com/api/webservicecall.php?filename=getSmsPin&MatriId="
		 * + matriid);
		 * 
		 * Thread.sleep(5000); WebElement element =
		 * driver.findElement(By.xpath("/html/body")); String pinnotext =
		 * element.getText(); driver.navigate().back(); System.out.println("PIN : " +
		 * pinnotext); System.out.println("Success..."); //
		 * test.pass("Mobile Activation Started....."); Thread.sleep(1000); // Your
		 * Matrimony ID: BRH2699411 String pinNum = pinnotext.substring(24, 31);
		 * System.out.println(pinNum); //
		 * test.pass("Mobile Recivied PIN Number is : ****** "); Thread.sleep(1000);
		 * Thread.sleep(5000);
		 * driver.findElement(By.tagName("body")).sendKeys(Keys.CONTROL + "w"); //
		 * driver.switchTo().window(pwh); // driver.navigate().back();
		 * Thread.sleep(3000); driver.findElement(By.id("pinNo")).sendKeys(pinNum);
		 * Thread.sleep(3000); driver.findElement(By.id("Verify")).click();
		 * Thread.sleep(1000);
		 * 
		 * try { WebElement mobileAlert =
		 * driver.findElement(By.xpath(".//*[@id='alertresult']")); String
		 * mobileAlertMessage = mobileAlert.getText(); // test.pass(mobileAlertMessage);
		 * driver.findElement(By.xpath(
		 * ".//*[@id='popupphoneverified']/div/div/div/div[1]/div[3]/a")).click(); }
		 * catch (Exception e) { // TODO: handle exception } //
		 * test.pass("Mobile POPUP Closed"); Thread.sleep(5000); try {
		 * ////////////////////////////////
		 * driver.findElement(By.id("skippage")).click(); Thread.sleep(2000);
		 * driver.findElement(By.xpath("//*[@id=\"conform\"]/div/div/div/a[1]")).click()
		 * ; Thread.sleep(2000); driver.findElement(By.id("reason3")).click();
		 * Thread.sleep(2000); driver.findElement(By.id("skipphotoclick")).click(); }
		 * catch (Exception e) { // TODO: handle exception }
		 * 
		 * 
		 * try { Thread.sleep(2000);
		 * driver.findElement(By.xpath("//a[contains(text(),'Skip to Home')]")).click();
		 * 
		 * Thread.sleep(2000);
		 * driver.findElement(By.xpath("//a[contains(text(),'do this later')]")).click()
		 * ; } catch (Exception e) { // TODO: handle exception }
		 * 
		 * try { Thread.sleep(2000);
		 * driver.findElement(By.xpath("//a[contains(text(),'Skip to Home')]")).click();
		 * 
		 * Thread.sleep(2000);
		 * driver.findElement(By.xpath("//a[contains(text(),'do this later')]")).click()
		 * ; } catch (Exception e) { // TODO: handle exception }
		 * /////////////////////////////////////////////////////////////////////////////
		 * ///////
		 * 
		 * try { Thread.sleep(5000); driver.findElement(By.id("eatingHabits4")).click();
		 * Thread.sleep(2000);
		 * driver.findElement(By.xpath("//*[@id=\"frm\"]/div[18]/div[1]/input")).click()
		 * ; } catch (Exception e) { // TODO: handle exception }
		 * 
		 * //////////////////////////////////////////// try { Thread.sleep(3000);
		 * driver.findElement(By.xpath("//a[contains(text(),'skip »')]")).click(); }
		 * catch (Exception e) { Thread.sleep(3000); //
		 * driver.navigate().to("https://www."+CommunitySite+
		 * ".com/profiledetail/index.php?act=fullprofilenew&id="+matriid); } //
		 * AGR755419 Thread.sleep(3000); try { Alert leavePage =
		 * driver.switchTo().alert(); leavePage.accept(); } catch (Exception e) {
		 * e.getMessage(); } /////////////////////////////////////////
		 */

	}

	@AfterTest
	public void tearDown() {
//	driver.quit();

	}
}
