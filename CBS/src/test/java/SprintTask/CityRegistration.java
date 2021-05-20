package SprintTask;

import java.awt.Robot;
import java.util.Random;
import java.util.Set;

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
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.fasterxml.jackson.databind.deser.Deserializers.Base;
import com.pages.EditPIMethod;

import base.BaseTest;
import pom.cmlogin.EditPI_POM;
import pom.cmlogin.GothramPOM;
import pom.cmlogin.Search_POM;
import pom.cmlogin.ViewProfile_POM;

public class CityRegistration extends BaseTest {
	
	

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

	@Test(enabled = true,invocationCount = 5)
	public void occupationSearch() throws Throwable {

		int i = getExcelRandomRowNum("Registeration");
		Actions acc = new Actions(driver);
		Robot r = new Robot();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
	//	for (int i = 1; i <=100; i++) {
			
		

		Thread.sleep(3000);
		driver.get("https://www.communitymatrimony.com");
		driver.manage().window().maximize();

		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"home-register\"]/div/div[2]/nav/ul/li[2]/a")).click();
		String CommunitySite = BaseTest.getExcelData("Registeration", 1, 0);
		Thread.sleep(3000);
		BaseTest.select_text(driver.findElement(By.id("domainName")), getExcelData("Registeration", 1, 0));

		Thread.sleep(3000);
		BaseTest.select_index(driver.findElement(By.id("profile")), 2);

		Thread.sleep(3000);
		driver.findElement(By.id("name")).sendKeys(getExcelData("Registeration", 1, 2));

		Thread.sleep(2000);
		// driver.findElement(By.id("gendermale")).click();
		acc.moveToElement(driver.findElement(By.id("gendermale"))).click().build().perform();

		Thread.sleep(2000);
//	acc.moveToElement(driver.findElement(By.id("dobDay"))).build().perform();
//	acc.sendKeys("15").build().perform();
//	BaseTest.click(driver.findElement(By.id("dobDay")));
		BaseTest.select_text(driver.findElement(By.id("dobDay")), BaseTest.getExcelData("Registeration", i, 4));

		Thread.sleep(2000);
//	acc.moveToElement(driver.findElement(By.id("dobMonth"))).build().perform();
//	acc.sendKeys("10").build().perform();
//	BaseTest.click(driver.findElement(By.id("dobMonth")));
		BaseTest.select_text(driver.findElement(By.id("dobMonth")), BaseTest.getExcelData("Registeration", i, 5));

		Thread.sleep(2000);
//	acc.moveToElement(driver.findElement(By.id("dobYear"))).build().perform();
//	acc.sendKeys("1995").build().perform();
//	BaseTest.click(driver.findElement(By.id("dobYear")));
		BaseTest.select_text(driver.findElement(By.id("dobYear")), BaseTest.getExcelData("Registeration", i, 6));

		Thread.sleep(3000);
		BaseTest.select_index(driver.findElement(By.id("maritalStatus")), 1);

		Thread.sleep(3000);
		try {
			BaseTest.select_index(driver.findElement(By.id("religion")), 1);
		} catch (Exception e) {
			// TODO: handle exception

		}

		/*
		 * Thread.sleep(3000); try {
		 * BaseTest.select_index(driver.findElement(By.id("denomination")), 1); } catch
		 * (Exception e) { // TODO: handle exception }
		 * 
		 * Thread.sleep(2000); try {
		 * BaseTest.select_index(driver.findElement(By.id("caste")), 2); //
		 * Thread.sleep(2000); } catch (Exception e) { // TODO: handle exception }
		 */
		/// Common Divison Check
		/*
		 * Thread.sleep(3000); int CommonDivision_Count =
		 * BaseTest.getRowCount("Common Division");
		 * System.out.println("Row Count : "+CommonDivision_Count);
		 * 
		 * Thread.sleep(2000); for (int i = 1; i <= CommonDivision_Count; i++) {
		 * Thread.sleep(2000); String Coomon_Division =
		 * BaseTest.getExcelData("Common Division", i, 1);
		 * 
		 * 
		 * BaseTest.select_index(driver.findElement(By.id("caste")), i);
		 * Thread.sleep(2000); WebElement Caste_aa = driver.findElement(By.id("caste"));
		 * Select aa = new Select(Caste_aa); WebElement Caste_Val =
		 * aa.getFirstSelectedOption(); Caste_Value = Caste_Val.getText();
		 * System.out.println("Caste Value : "+ Caste_Value);
		 * 
		 * Thread.sleep(2000); if (Coomon_Division.contains(Caste_Value)) {
		 * System.out.println(Coomon_Division+" matches with given data "+Caste_Value);
		 * } else { System.err.println(Coomon_Division+" not matches with given data "
		 * +Caste_Value); }
		 * 
		 * }
		 */

		///////////////////////////////////////////////////////////////////////////////////

		/*
		 * Thread.sleep(3000); int Denomination_Count =
		 * BaseTest.getCellCount("Common Division");
		 * System.out.println("Cell Count : "+Denomination_Count);
		 * 
		 * for (int i = 2; i < Denomination_Count; i++) {
		 * 
		 * Thread.sleep(2000); String Denomination =
		 * BaseTest.getExcelData("Common Division", 0, i);
		 * System.out.println("Denomination : "+Denomination);
		 * 
		 * Thread.sleep(2000);
		 * BaseTest.select_text(driver.findElement(By.id("denomination")),
		 * Denomination);
		 * 
		 * Thread.sleep(2000);
		 * 
		 * 
		 * Thread.sleep(3000); int CommonDivision_Count =
		 * BaseTest.getRowCount("Common Division");
		 * System.out.println("Row Count : "+CommonDivision_Count);
		 * 
		 * Thread.sleep(2000); for (int j = 1; j <CommonDivision_Count; j++) {
		 * Thread.sleep(2000); String Coomon_Division =
		 * BaseTest.getExcelData("Common Division", j, i);
		 * 
		 * 
		 * BaseTest.select_index(driver.findElement(By.id("caste")), j);
		 * Thread.sleep(2000); WebElement Caste_aa = driver.findElement(By.id("caste"));
		 * Select aa = new Select(Caste_aa); WebElement Caste_Val =
		 * aa.getFirstSelectedOption(); Caste_Value = Caste_Val.getText();
		 * System.out.println("Caste Value : "+ Caste_Value);
		 * 
		 * Thread.sleep(2000); if (Coomon_Division.contains(Caste_Value)) {
		 * System.out.println(Coomon_Division+" matches with given data "+Caste_Value);
		 * } else { System.err.println(Coomon_Division+" not matches with given data "
		 * +Caste_Value); }
		 * 
		 * }
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * }
		 * 
		 * 
		 */

		Thread.sleep(3000);
		String SubCaste = BaseTest.getExcelData("Registeration", i, 13);
		
			BaseTest.select_text(driver.findElement(By.id("subCaste")), SubCaste);
			Thread.sleep(2000);
			/*
			 * WebElement subCaste_aa = driver.findElement(By.id("subCaste")); Select aa =
			 * new Select(subCaste_aa); WebElement subCaste_Val =
			 * aa.getFirstSelectedOption(); subCaste_Value = subCaste_Val.getText();
			 */
		//	BaseTest.setExcelData("Naidu", i, 1,  BaseTest.getExcelData("Registeration", i, 13) );
			BaseTest.writeexcel(SubCaste, i, 1);
			System.out.println("Sub_Caste Value : " + SubCaste);
		

		int ran = getExcelRandomRowNum("Registeration");

		Thread.sleep(3000);
		BaseTest.select_text(driver.findElement(By.id("motherTongue")), getExcelData("Registeration", i, 11));
		String moth_tng = getExcelData("Registeration", 1, 11);
		System.out.println(moth_tng);

		/*
		 * Thread.sleep(3000); try {
		 * BaseTest.select_index(driver.findElement(By.id("religion")), 2); } catch
		 * (Exception e) { // TODO: handle exception }
		 */

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
		String Mobile_Number ="7777777"+(Math.round(Math.random()*978));
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
		BaseTest.select_text(driver.findElement(By.id("residingCityMainDistId")), "Chennai");

		Thread.sleep(3000);
		//BaseTest.select_index(driver.findElement(By.id("residingCityMainDistId")), 5);

		String Citizenship = BaseTest.getExcelData("Registeration", 1, 18);
		Thread.sleep(3000);
		BaseTest.select_text(driver.findElement(By.id("citizenship")), "India");

		String Willing_subCaste = BaseTest.getExcelData("Registeration", 1, 19);

		/*
		 * if (Willing_subCaste.equals("Yes")) { Thread.sleep(3000);
		 * BaseTest.click(driver.findElement(By.id("labelsamecaste1"))); }else {
		 * BaseTest.click(driver.findElement(By.id("labelsamecaste2"))); }
		 */

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

		Thread.sleep(5000);
		// try {
		// driver.findElement(By.id("residingState")).sendKeys("Nepal");
		Thread.sleep(5000);
		// test.pass("****Registration Page--2 Completed Successfully****");
		// PIN Verification.....
		Thread.sleep(5000);
		// if(CommunitySite.equals("brahminmatrimony")||CommunitySite.equals("christianmatrimony")||CommunitySite.equals("muslimmatrimony"))
		// {
		Thread.sleep(2000);
		WebElement element1 = driver.findElement(By.xpath("//div[contains(text(),'Your Matrimony ID:')]"));
		String text = element1.getText();
		System.out.println(text);
		String matriid = text.substring(19, 28);
		System.out.println("Newly Registered Matri ID is - : " + matriid);
		
		BaseTest.writeexcel(matriid, i, 0);
		
		//BaseTest.setExcelData("Naidu", i, 0, matriid);
		// test.info("Newly Registered Matri ID is - : "+matriid);
		// }
		/*
		 * else { Thread.sleep(2000); WebElement element1 =
		 * driver.findElement(By.xpath("//div[contains(text(),'Your Matrimony ID:')]"));
		 * String text = element1.getText(); matriid = text.substring(19,28);
		 * System.out.println("Newly Registered Matri ID is - : "+matriid); //
		 * test.info("Newly Registered Matri ID is - : "+matriid); }
		 */
		// driver.quit();
//	} catch (Exception e) {
		// TODO: handle exception
//	}	
		// For opening new tab
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "t");
		System.out.println("New tab opened");
		Thread.sleep(9000);
		driver.navigate()
				.to("https://admin:lRqW6WNT@communitymatrimony.com/api/webservicecall.php?filename=getSmsPin&MatriId="
						+ matriid);

		// Nepali -
		// https://www.nepalimatrimony.com/cbscheck/smspin.php?MatriId="+matriid

		// https://admin:lRqW6WNT@communitymatrimony.com/api/webservicecall.php?filename=getSmsPin&MatriId="+matriid
		// driver.navigate().back();
		Thread.sleep(5000);
		WebElement element = driver.findElement(By.xpath("/html/body"));
		String pinnotext = element.getText();
		driver.navigate().back();
		System.out.println("PIN : " + pinnotext);
		System.out.println("Success...");
		// test.pass("Mobile Activation Started.....");
		Thread.sleep(1000); // Your Matrimony ID: BRH2699411
		String pinNum = pinnotext.substring(24, 31);
		System.out.println(pinNum);
		// test.pass("Mobile Recivied PIN Number is : ****** ");
		Thread.sleep(1000);
		Thread.sleep(5000);
		driver.findElement(By.tagName("body")).sendKeys(Keys.CONTROL + "w");
		// driver.switchTo().window(pwh);
		// driver.navigate().back();
		Thread.sleep(3000);
		driver.findElement(By.id("pinNo")).sendKeys(pinNum);
		Thread.sleep(3000);
		driver.findElement(By.id("Verify")).click();
		Thread.sleep(1000);

		try {
			WebElement mobileAlert = driver.findElement(By.xpath(".//*[@id='alertresult']"));
			String mobileAlertMessage = mobileAlert.getText();
			// test.pass(mobileAlertMessage);
			driver.findElement(By.xpath(".//*[@id='popupphoneverified']/div/div/div/div[1]/div[3]/a")).click();
		} catch (Exception e) {
			// TODO: handle exception
		}
		// test.pass("Mobile POPUP Closed");
		Thread.sleep(5000);
		try {
			////////////////////////////////
			driver.findElement(By.id("skippage")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"conform\"]/div/div/div/a[1]")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("reason3")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("skipphotoclick")).click();
		} catch (Exception e) {
			// TODO: handle exception
		}

		// Thread.sleep(5000);
		// driver.navigate().to("https://www.agarwalmatrimony.com/profiledetail/index.php?act=fullprofilenew&id="+matriid);
		/*
		 * try { Thread.sleep(2000);
		 * 
		 * Thread.sleep(3000); int CommonDivision_Count =
		 * BaseTest.getRowCount("Common Division");
		 * System.out.println("Row Count : "+CommonDivision_Count);
		 * 
		 * Thread.sleep(2000); for (int j = 1; j <43; j++) { Thread.sleep(2000); String
		 * Coomon_Division = BaseTest.getExcelData("Common Division", j, 1);
		 * 
		 * 
		 * BaseTest.select_index(driver.findElement(By.id("partnerCaste")), j);
		 * Thread.sleep(2000); WebElement Caste_aa =
		 * driver.findElement(By.id("partnerCaste")); Select aa1 = new Select(Caste_aa);
		 * WebElement Caste_Val = aa1.getFirstSelectedOption(); Caste_Value =
		 * Caste_Val.getText(); System.out.println("Caste Value : "+ Caste_Value);
		 * 
		 * Thread.sleep(2000); if (Coomon_Division.contains(Caste_Value)) {
		 * System.out.println(Coomon_Division+" matches with Onboarding PP given data "
		 * +Caste_Value); } else { System.err.println(
		 * Coomon_Division+" not matches with onboarding PP given data "+Caste_Value); }
		 * 
		 * Thread.sleep(2000);
		 * BaseTest.select_deselectAll(driver.findElement(By.id("partnerCaste"))); }
		 * 
		 * 
		 * Thread.sleep(2000);
		 * BaseTest.select_deselectAll(driver.findElement(By.id("partnerCaste")));
		 * 
		 * 
		 * 
		 * //}
		 * 
		 * 
		 * 
		 * //////////////////////
		 * 
		 * 
		 * Thread.sleep(3000); int Denomination_Count =
		 * BaseTest.getCellCount("Common Division");
		 * System.out.println("Cell Count : "+Denomination_Count);
		 * 
		 * for (int i = 2; i < 10; i++) {
		 * 
		 * Thread.sleep(2000); //String Denomination =
		 * BaseTest.getExcelData("Common Division", 0, i);
		 * //System.out.println("Denomination : "+Denomination);
		 * 
		 * Thread.sleep(2000);
		 * BaseTest.select_index(driver.findElement(By.id("denomination")), i);
		 * 
		 * Thread.sleep(2000);
		 * 
		 * } Thread.sleep(3000); //int CommonDivision_Count =
		 * BaseTest.getRowCount("Common Division");
		 * System.out.println("Row Count : "+CommonDivision_Count);
		 * 
		 * Thread.sleep(2000); for (int j = 1; j <43; j++) { Thread.sleep(2000); String
		 * Coomon_Division = BaseTest.getExcelData("Common Division", j, 1);
		 * 
		 * 
		 * BaseTest.select_index(driver.findElement(By.id("partnerCaste")), j);
		 * Thread.sleep(2000); WebElement Caste_aa =
		 * driver.findElement(By.id("partnerCaste")); Select aa1 = new Select(Caste_aa);
		 * WebElement Caste_Val = aa1.getFirstSelectedOption(); Caste_Value =
		 * Caste_Val.getText(); System.out.println("Caste Value : "+ Caste_Value);
		 * 
		 * Thread.sleep(2000); if (Coomon_Division.contains(Caste_Value)) {
		 * System.out.println(Coomon_Division+" matches with Onboarding PP given data "
		 * +Caste_Value); } else { System.err.println(
		 * Coomon_Division+" not matches with Onboarding PP WCSM given data "
		 * +Caste_Value); }
		 * 
		 * Thread.sleep(2000);
		 * BaseTest.select_deselectAll(driver.findElement(By.id("partnerCaste"))); }
		 * 
		 * 
		 * 
		 * driver.findElement(By.id("save_addpp")).click();
		 * 
		 * 
		 * //.findElement(By.xpath("//a[contains(text(),'Skip to Home')]")).click();
		 * 
		 * Thread.sleep(2000); //
		 * driver.findElement(By.xpath("//a[contains(text(),'do this later')]")).click()
		 * ; } catch (Exception e) { // TODO: handle exception }
		 * /////////////////////////////// try { Thread.sleep(5000);
		 * driver.findElement(By.id("partnerFoodChoice4")).click(); Thread.sleep(2000);
		 * driver.findElement(By.id("save_addpp")).click(); } catch (Exception e) { //
		 * TODO: handle exception }
		 */
		/////////////////////////////////////////////////////////////////

		try {
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[contains(text(),'Skip to Home')]")).click();

			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[contains(text(),'do this later')]")).click();
		} catch (Exception e) {
			// TODO: handle exception
		}

		try {
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[contains(text(),'Skip to Home')]")).click();

			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[contains(text(),'do this later')]")).click();
		} catch (Exception e) {
			// TODO: handle exception
		}
		////////////////////////////////////////////////////////////////////////////////////

		try {
			Thread.sleep(5000);
			driver.findElement(By.id("eatingHabits4")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"frm\"]/div[18]/div[1]/input")).click();
		} catch (Exception e) {
			// TODO: handle exception
		}

		////////////////////////////////////////////
		try {
			Thread.sleep(3000);
			driver.findElement(By.xpath("//a[contains(text(),'skip »')]")).click();
		} catch (Exception e) {
			Thread.sleep(3000);
			// driver.navigate().to("https://www."+CommunitySite+".com/profiledetail/index.php?act=fullprofilenew&id="+matriid);
		} // AGR755419
		Thread.sleep(3000);
		try {
			Alert leavePage = driver.switchTo().alert();
			leavePage.accept();
		} catch (Exception e) {
			e.getMessage();
		}
		/////////////////////////////////////////
		/*
		 * Thread.sleep(2000); try {//*[@id="topnav-login-menu"]/div[3]/div[2]/div[1]/a
		 * acc.moveToElement(driver.findElement(By.xpath(
		 * "//*[@id=\"topnav-login-menu\"]/div[3]/div[2]/div[1]/div/a"))).build().
		 * perform(); Thread.sleep(3000); acc.moveToElement(driver.findElement(By.
		 * xpath("//a[contains(text(),'Edit Partner Preference')]"))).click().build().
		 * perform(); } catch (Exception e) { //
		 * acc.moveToElement(driver.findElement(By.xpath(
		 * "//*[@id=\"topnav-login-menu\"]/div[3]/div[2]/div[1]/div/a/img"))).build().
		 * perform(); Thread.sleep(3000); // acc.moveToElement(driver.findElement(By.
		 * xpath("//a[contains(text(),'Edit Partner Preference')]"))).click().build().
		 * perform(); }
		 */
		/*
		 * Thread.sleep(3000); try {//*[@id="topnav-login-menu"]/div[3]/div[2]/div[1]/a
		 * acc.moveToElement(driver.findElement(By.xpath(
		 * "//*[@id=\"topnav-login-menu\"]/div[3]/div[2]/div[1]/a"))).build().perform();
		 * Thread.sleep(3000); acc.moveToElement(driver.findElement(By.
		 * xpath("//a[contains(text(),'Edit Partner Preference')]"))).click().build().
		 * perform(); } catch (Exception e) {
		 * acc.moveToElement(driver.findElement(By.xpath(
		 * "//*[@id=\"topnav-login-menu\"]/div[3]/div[2]/div[1]/a/img"))).build().
		 * perform(); Thread.sleep(3000); acc.moveToElement(driver.findElement(By.
		 * xpath("//a[contains(text(),'Edit Partner Preference')]"))).click().build().
		 * perform(); }
		 * 
		 */
		/*
		 * Thread.sleep(5000); try { Caste_PP = driver.findElement(By.
		 * xpath("//span[contains(text(),'Caste / Division - ')]//following::span[1]")).
		 * getText(); System.out.println(Caste_PP); } catch (Exception e) { // TODO:
		 * handle exception }
		 * 
		 * Thread.sleep(5000); try { Caste_PP = driver.findElement(By.xpath(
		 * "//span[contains(text(),'Division')]//following::span[1]")).getText();
		 * System.out.println(Caste_PP); } catch (Exception e) { // TODO: handle
		 * exception }
		 * 
		 * Thread.sleep(2000); try { SubCaste_PP = driver.findElement(By.
		 * xpath("//span[contains(text(),'Subcaste - ')]//following::span[1]")).getText(
		 * ); System.out.println(SubCaste_PP); } catch (Exception e) { // TODO: handle
		 * exception }
		 * 
		 * Thread.sleep(2000); try { Dosham_PP = driver.findElement(By.
		 * xpath("//span[contains(text(),'Dosham ')]//following::span[1]")).getText();
		 * System.out.println(Dosham_PP); } catch (Exception e) { // TODO: handle
		 * exception }
		 * 
		 * try { Thread.sleep(2000); CitizenShip_PP = driver.findElement(By.
		 * xpath("//span[contains(text(),'Citizenship - ')]//following::span[1]")).
		 * getText(); System.out.println(CitizenShip_PP); } catch (Exception e) { //
		 * TODO: handle exception }
		 * 
		 * try { if (Willing_subCaste.contains("Yes")) { if
		 * (Caste_Value.contains(Caste_PP)) {
		 * System.err.println("The Registered Value matches System PP Caste"); }else {
		 * System.err.println("The Registered Value not matches System PP Caste"); } }
		 * 
		 * }catch (Exception e) { // TODO: handle exception }
		 * 
		 * try { if (Willing_subCaste.contains("Yes")) { if
		 * (subCaste_Value.contains(SubCaste_PP)) {
		 * System.err.println("The Registered Value matches System PP SubCaste"); }else
		 * { System.err.println("The Registered Value not matches System PP SubCaste");
		 * } } }catch (Exception e) { // TODO: handle exception }
		 * 
		 * try { if (Willing_subCaste.contains("No")) { if (SubCaste_PP.contains("Any"))
		 * { System.err.println("The Registered Value matches System PP SubCaste");
		 * }else {
		 * System.err.println("The Registered Value not matches System PP SubCaste"); }
		 * } } catch (Exception e) { // TODO: handle exception }
		 * 
		 * try { if (Willing_subCaste.contains("No")) { if
		 * (Caste_Value.contains("Caste_PP")) {
		 * System.err.println("The Registered Value matches System PP Caste"); }else {
		 * System.err.println("The Registered Value not matches System PP Caste"); } }
		 * 
		 * 
		 * }catch (Exception e) { // TODO: handle exception }
		 * 
		 * 
		 * try { if (Citizenship.contains("India")) { if
		 * (CitizenShip_PP.contains("Any")) {
		 * System.err.println("The Registered Value matches System PP CitizenShip");
		 * }else {
		 * System.err.println("The Registered Value not matches System PP CitizenShip");
		 * } } }catch (Exception e) { // TODO: handle exception }
		 * 
		 * 
		 * 
		 * ///////////////////////////////////////////////////// try { if
		 * (Caste_PP.contains("Any")) {
		 * System.out.println("Division was any as per Requirement"); } else {
		 * 
		 * } } catch (Exception e) { // TODO: handle exception }
		 * ////////////////////////////////////////////////////////////
		 * 
		 * Thread.sleep(2000); try { acc.moveToElement(driver.findElement(By.xpath(
		 * "//*[@id=\"topnav-login-menu\"]/div[3]/div[2]/div[1]/a"))).build().perform();
		 * Thread.sleep(3000); acc.moveToElement(driver.findElement(By.
		 * xpath("//a[contains(text(),'Privacy Settings')]"))).click().build().perform()
		 * ; } catch (Exception e) { acc.moveToElement(driver.findElement(By.xpath(
		 * "//*[@id=\"topnav-login-menu\"]/div[3]/div[2]/div[1]/a/img"))).build().
		 * perform(); Thread.sleep(3000); acc.moveToElement(driver.findElement(By.
		 * xpath("//a[contains(text(),'Privacy Settings')]"))).click().build().perform()
		 * ; }
		 * 
		 * 
		 * ////////////////////////////// Thread.sleep(3000);
		 * BaseTest.click(driver.findElement(By.
		 * xpath("//a[contains(text(),'Who Can See Me')]")));
		 * 
		 * 
		 * Thread.sleep(3000); if
		 * (!driver.findElement(By.id("wcsmstatus2")).isSelected()) {
		 * Thread.sleep(2000); driver.findElement(By.id("wcsmstatus2")).click();
		 * 
		 * }else { }
		 * 
		 * 
		 * Thread.sleep(3000);
		 * driver.findElement(By.xpath("//div[contains(text(),'More Preferences')]")).
		 * click();
		 * 
		 * 
		 * Thread.sleep(3000); WebElement Division_aa =
		 * driver.findElement(By.id("wcsmCaste")); Select aa = new Select(Division_aa);
		 * WebElement Division_Val = aa.getFirstSelectedOption(); subCaste_Value =
		 * Division_Val.getText(); System.out.println("Division Value : "+
		 * subCaste_Value);
		 * 
		 * //wcsmDenomination //wcsmCaste if (subCaste_Value.contains("Any")) {
		 * System.out.println("WCSM Division Value was Any as per Requirement"); } else
		 * {
		 * 
		 * }
		 * 
		 * 
		 */

		/////////////////////
		Thread.sleep(3000);
		/*
		 * int Denomination_Count = BaseTest.getCellCount("Common Division");
		 * System.out.println("Cell Count : "+Denomination_Count);
		 * 
		 * for (int i = 2; i < Denomination_Count; i++) {
		 * 
		 * Thread.sleep(2000); String Denomination =
		 * BaseTest.getExcelData("Common Division", 0, i);
		 * System.out.println("Denomination : "+Denomination);
		 * 
		 * Thread.sleep(2000);
		 * BaseTest.select_text(driver.findElement(By.id("wcsmDenomination")),
		 * Denomination);
		 * 
		 * Thread.sleep(2000);
		 * 
		 */
		/*
		 * Thread.sleep(3000); int CommonDivision_Count =
		 * BaseTest.getRowCount("Common Division");
		 * System.out.println("Row Count : "+CommonDivision_Count);
		 * 
		 * Thread.sleep(2000); for (int j = 1; j <43; j++) { Thread.sleep(2000); String
		 * Coomon_Division = BaseTest.getExcelData("Common Division", j, 1);
		 * 
		 * 
		 * BaseTest.select_index(driver.findElement(By.id("wcsmCaste")), j);
		 * Thread.sleep(2000); WebElement Caste_aa =
		 * driver.findElement(By.id("wcsmCaste")); Select aa1 = new Select(Caste_aa);
		 * WebElement Caste_Val = aa1.getFirstSelectedOption(); Caste_Value =
		 * Caste_Val.getText(); System.out.println("Caste Value : "+ Caste_Value);
		 * 
		 * Thread.sleep(2000); if (Coomon_Division.contains(Caste_Value)) {
		 * System.out.println(Coomon_Division+" matches with WCSM given data "
		 * +Caste_Value); } else {
		 * System.err.println(Coomon_Division+" not matches with WCSM given data "
		 * +Caste_Value); }
		 * 
		 * Thread.sleep(2000);
		 * BaseTest.select_deselectAll(driver.findElement(By.id("wcsmCaste"))); }
		 * 
		 * 
		 * Thread.sleep(2000);
		 * //BaseTest.select_deselectAll(driver.findElement(By.id("wcsmDenomination")));
		 * 
		 * 
		 * 
		 * //}
		 */
		//////////////////////////////////////////////////////////////////////

		/*
		 * Thread.sleep(3000); int Denomination_Count =
		 * BaseTest.getCellCount("Common Division");
		 * System.out.println("Cell Count : "+Denomination_Count);
		 * 
		 * for (int i = 2; i < 10; i++) {
		 * 
		 * 
		 * Thread.sleep(2000); String Denomination =
		 * BaseTest.getExcelData("Common Division", 0, i);
		 * System.out.println("Denomination : "+Denomination);
		 * 
		 * 
		 * Thread.sleep(2000);
		 * BaseTest.select_index(driver.findElement(By.id("wcsmDenomination")), i);
		 * 
		 * Thread.sleep(2000);
		 * 
		 * }
		 */

		/*
		 * Thread.sleep(3000); // int CommonDivision_Count =
		 * BaseTest.getRowCount("Common Division"); System.out.println("Row Count : " +
		 * CommonDivision_Count);
		 * 
		 * Thread.sleep(2000); for (int j = 1; j < 43; j++) { Thread.sleep(2000); String
		 * Coomon_Division = BaseTest.getExcelData("Common Division", j, 1);
		 * 
		 * BaseTest.select_index(driver.findElement(By.id("wcsmCaste")), j);
		 * Thread.sleep(2000); WebElement Caste_aa =
		 * driver.findElement(By.id("wcsmCaste")); Select aa1 = new Select(Caste_aa);
		 * WebElement Caste_Val = aa1.getFirstSelectedOption(); Caste_Value =
		 * Caste_Val.getText(); System.out.println("Caste Value : " + Caste_Value);
		 * 
		 * Thread.sleep(2000); if (Coomon_Division.contains(Caste_Value)) {
		 * System.out.println(Coomon_Division + " matches with WCSM given data " +
		 * Caste_Value); } else { System.err.println(Coomon_Division +
		 * " not matches with WCSM given data " + Caste_Value); }
		 * 
		 * Thread.sleep(2000);
		 * BaseTest.select_deselectAll(driver.findElement(By.id("wcsmCaste"))); }
		 * 
		 * Thread.sleep(2000); //
		 * BaseTest.select_deselectAll(driver.findElement(By.id("wcsmDenomination")));
		 * 
		 * ////////////////////////////////
		 * 
		 * ////////////////////////////////////////////////
		 * 
		 * Thread.sleep(2000); try { acc.moveToElement(driver.findElement(By.xpath(
		 * "//*[@id=\"topnav-login-menu\"]/div[3]/div[2]/div[1]/a")))
		 * .build().perform(); Thread.sleep(3000);
		 * acc.moveToElement(driver.findElement(By.
		 * xpath("//a[contains(text(),'Edit Partner Preference')]"))).click()
		 * .build().perform(); } catch (Exception e) {
		 * acc.moveToElement(driver.findElement(By.xpath(
		 * "//*[@id=\"topnav-login-menu\"]/div[3]/div[2]/div[1]/div/a")))
		 * .build().perform(); Thread.sleep(3000);
		 * acc.moveToElement(driver.findElement(By.
		 * xpath("//a[contains(text(),'Edit Partner Preference')]"))).click()
		 * .build().perform(); }
		 * 
		 * Thread.sleep(3000);
		 * driver.findElement(By.xpath("//a[@class='editIcon font12 clr6']")).click();
		 * 
		 * //////////////////////
		 * 
		 * Thread.sleep(3000); Thread.sleep(3000); // int CommonDivision_Count =
		 * BaseTest.getRowCount("Common Division"); System.out.println("Row Count : " +
		 * CommonDivision_Count);
		 * 
		 * Thread.sleep(2000); for (int j = 1; j < 43; j++) { Thread.sleep(2000); String
		 * Coomon_Division = BaseTest.getExcelData("Common Division", j, 1);
		 * 
		 * BaseTest.select_index(driver.findElement(By.id("casteDivision")), j);
		 * Thread.sleep(2000); WebElement Caste_aa =
		 * driver.findElement(By.id("casteDivision")); Select aa1 = new
		 * Select(Caste_aa); WebElement Caste_Val = aa1.getFirstSelectedOption();
		 * Caste_Value = Caste_Val.getText(); System.out.println("Caste Value : " +
		 * Caste_Value);
		 * 
		 * Thread.sleep(2000); if (Coomon_Division.contains(Caste_Value)) {
		 * System.out.println(Coomon_Division + " matches with PP given data " +
		 * Caste_Value); } else { System.err.println(Coomon_Division +
		 * " not matches with PP given data " + Caste_Value); }
		 * 
		 * Thread.sleep(2000);
		 * BaseTest.select_deselectAll(driver.findElement(By.id("casteDivision"))); }
		 * 
		 * Thread.sleep(2000); //
		 * BaseTest.select_deselectAll(driver.findElement(By.id("wcsmDenomination")));
		 * 
		 * // }
		 * 
		 * //////////////////////
		 * 
		 * Thread.sleep(3000); // int Denomination_Count =
		 * BaseTest.getCellCount("Common Division"); System.out.println("Cell Count : "
		 * + Denomination_Count);
		 * 
		 * for (int i = 2; i < 10; i++) {
		 * 
		 * Thread.sleep(2000); // String Denomination =
		 * BaseTest.getExcelData("Common Division", 0, i); //
		 * System.out.println("Denomination : "+Denomination);
		 * 
		 * Thread.sleep(2000);
		 * BaseTest.select_index(driver.findElement(By.id("denomination")), i);
		 * 
		 * Thread.sleep(2000);
		 * 
		 * } Thread.sleep(3000); // int CommonDivision_Count =
		 * BaseTest.getRowCount("Common Division"); System.out.println("Row Count : " +
		 * CommonDivision_Count);
		 * 
		 * Thread.sleep(2000); for (int j = 1; j < 43; j++) { Thread.sleep(2000); String
		 * Coomon_Division = BaseTest.getExcelData("Common Division", j, 1);
		 * 
		 * BaseTest.select_index(driver.findElement(By.id("casteDivision")), j);
		 * Thread.sleep(2000); WebElement Caste_aa =
		 * driver.findElement(By.id("casteDivision")); Select aa1 = new
		 * Select(Caste_aa); WebElement Caste_Val = aa1.getFirstSelectedOption();
		 * Caste_Value = Caste_Val.getText(); System.out.println("Caste Value : " +
		 * Caste_Value);
		 * 
		 * Thread.sleep(2000); if (Coomon_Division.contains(Caste_Value)) {
		 * System.out.println(Coomon_Division + " matches with PP given data " +
		 * Caste_Value); } else { System.err.println(Coomon_Division +
		 * " not matches PP WCSM given data " + Caste_Value); }
		 * 
		 * Thread.sleep(2000);
		 * BaseTest.select_deselectAll(driver.findElement(By.id("casteDivision")));
		 */		//}

		////////////////////////////////////////////////////////////
		
		
//	}

	}

	@Test(enabled = false)
	public static void loginEditPI() throws Throwable {

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
		BaseTest.typeData(g.getMatriID(), "CHR617505");
		BaseTest.click(g.getPasswordClear());
		BaseTest.typeData(g.getPassword(), "cbstest");
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
		Thread.sleep(2000);
		BaseTest.click(s.getSearch_Menu_btn());

		Thread.sleep(2000);
		for (int j = 1; j < 43; j++) {
			Thread.sleep(2000);
			int Denomination_Count = BaseTest.getCellCount("Common Division");
			String Coomon_Division = BaseTest.getExcelData("Common Division", j, 1);

			int cc = (j + 1);

			// BaseTest.select_index(driver.findElement(By.id("casteDivision")), j);
			String search_divison = driver
					.findElement(By.xpath("//select[@id='casteTemp']//following::option[" + cc + "]")).getText();
			/*
			 * BaseTest.select_index(driver.findElement(By.id("casteDivision")), j);
			 * Thread.sleep(2000); WebElement Caste_aa =
			 * driver.findElement(By.id("casteDivision")); Select aa1 = new
			 * Select(Caste_aa); WebElement Caste_Val = aa1.getFirstSelectedOption(); String
			 * Caste_Value = Caste_Val.getText(); System.out.println("Caste Value : "+
			 * Caste_Value);
			 */

			Thread.sleep(2000);
			if (Coomon_Division.contains(search_divison)) {
				System.out.println(Coomon_Division + " matches with PP given data " + search_divison);
			} else {
				System.err.println(Coomon_Division + " not matches with PP given data " + search_divison);
			}

			Thread.sleep(2000);
			// BaseTest.select_deselectAll(driver.findElement(By.id("casteDivision")));
		}

		Thread.sleep(2000);
		// BaseTest.select_deselectAll(driver.findElement(By.id("wcsmDenomination")));

		// }

		//////////////////////

		Thread.sleep(3000);
		int Denomination_Count = BaseTest.getCellCount("Common Division");
		System.out.println("Cell Count : " + Denomination_Count);

		for (int k = 2; k < 10; k++) {

			Thread.sleep(2000);
			// String Denomination = BaseTest.getExcelData("Common Division", 0, i);
			// System.out.println("Denomination : "+Denomination);
			int cc = (k + 1);
			Thread.sleep(2000);
			// BaseTest.select_index(driver.findElement(By.id("denomination")), k);
			String search_divison = driver
					.findElement(By.xpath("//select[@id='denominationTemp']//following::option[" + cc + "]")).getText();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//select[@id='denominationTemp']//following::option[" + cc + "]")).click();
			acc.doubleClick(
					driver.findElement(By.xpath("//select[@id='denominationTemp']//following::option[" + cc + "]")))
					.build().perform();
		}
		Thread.sleep(3000);
		int CommonDivision_Count = BaseTest.getRowCount("Common Division");
		System.out.println("Row Count : " + CommonDivision_Count);

		Thread.sleep(2000);
		for (int j = 1; j < 43; j++) {
			Thread.sleep(2000);
			String Coomon_Division = BaseTest.getExcelData("Common Division", j, 1);
			int cc = (j + 1);

			// BaseTest.select_index(driver.findElement(By.id("casteDivision")), j);
			String search_divison = driver
					.findElement(By.xpath("//select[@id='casteTemp']//following::option[" + cc + "]")).getText();

			Thread.sleep(2000);
			/*
			 * WebElement Caste_aa = driver.findElement(By.id("casteDivision")); Select aa1
			 * = new Select(Caste_aa); WebElement Caste_Val = aa1.getFirstSelectedOption();
			 * String Caste_Value = Caste_Val.getText();
			 * System.out.println("Caste Value : "+ Caste_Value);
			 */

			Thread.sleep(2000);
			if (Coomon_Division.contains(search_divison)) {
				System.out.println(Coomon_Division + " matches with Regular Search given data " + search_divison);
			} else {
				System.err.println(Coomon_Division + " not matches with Regular Search  given data " + search_divison);
			}

			Thread.sleep(2000);
			// BaseTest.select_deselectAll(driver.findElement(By.id("casteDivision")));
		}

		////////////////////////////////////////////////////////////

	}

	@Test(enabled = false)
	public void pidivi() throws Throwable {

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
		BaseTest.typeData(g.getMatriID(), "CHR617505");
		BaseTest.click(g.getPasswordClear());
		BaseTest.typeData(g.getPassword(), "cbstest");
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
		Thread.sleep(2000);

		Thread.sleep(2000);
		try {
			acc.moveToElement(g.getMenu_btn());
		} catch (Exception e2) {

		}
		Thread.sleep(2000);
		acc.moveToElement(g.getEdit_Profile()).click().build().perform();

		Thread.sleep(3000);

		String parent = driver.getWindowHandle();
		//

		/////////////////////
		Thread.sleep(3000);
		/*
		 * int Denomination_Count = BaseTest.getCellCount("Common Division");
		 * System.out.println("Cell Count : "+Denomination_Count);
		 * 
		 * for (int i = 2; i < Denomination_Count; i++) {
		 * 
		 * Thread.sleep(2000); String Denomination =
		 * BaseTest.getExcelData("Common Division", 0, i);
		 * System.out.println("Denomination : "+Denomination);
		 * 
		 * Thread.sleep(2000);
		 * BaseTest.select_text(driver.findElement(By.id("wcsmDenomination")),
		 * Denomination);
		 * 
		 * Thread.sleep(2000);
		 * 
		 */
		Thread.sleep(3000);
		int CommonDivision_Count = BaseTest.getRowCount("Common Division");
		System.out.println("Row Count : " + CommonDivision_Count);

		Thread.sleep(2000);
		for (int j = 1; j < 43; j++) {
			Thread.sleep(2000);
			String Coomon_Division = BaseTest.getExcelData("Common Division", j, 1);

			BaseTest.select_index(driver.findElement(By.id("caste")), j);
			Thread.sleep(2000);
			WebElement Caste_aa = driver.findElement(By.id("caste"));
			Select aa1 = new Select(Caste_aa);
			WebElement Caste_Val = aa1.getFirstSelectedOption();
			Caste_Value = Caste_Val.getText();
			System.out.println("Caste Value : " + Caste_Value);

			Thread.sleep(2000);
			if (Coomon_Division.contains(Caste_Value)) {
				System.out.println(Coomon_Division + " matches with PI given data " + Caste_Value);
			} else {
				System.err.println(Coomon_Division + " not matches with PI given data " + Caste_Value);
			}

			Thread.sleep(2000);
			// BaseTest.select_deselectAll(driver.findElement(By.id("wcsmCaste")));
		}

		Thread.sleep(2000);
		// BaseTest.select_deselectAll(driver.findElement(By.id("wcsmDenomination")));

		// }

		//////////////////////////////////////////////////////////////////////

		Thread.sleep(3000);
		int Denomination_Count = BaseTest.getCellCount("Common Division");
		System.out.println("Cell Count : " + Denomination_Count);

		// for (int k = 2; k < 10; k++) {

		/*
		 * Thread.sleep(2000); String Denomination =
		 * BaseTest.getExcelData("Common Division", 0, i);
		 * System.out.println("Denomination : "+Denomination);
		 */

		Thread.sleep(2000);
		BaseTest.select_index(driver.findElement(By.id("denomination")), 8);
		Thread.sleep(2000);
		WebElement Caste_aa = driver.findElement(By.id("denomination"));
		Select aa1 = new Select(Caste_aa);
		WebElement Caste_Val = aa1.getFirstSelectedOption();
		String Denomination = Caste_Val.getText();
		System.out.println("Denomination Value : " + Denomination);
		Thread.sleep(2000);

		// }
		Thread.sleep(3000);
		// int CommonDivision_Count = BaseTest.getRowCount("Common Division");
		System.out.println("Row Count : " + CommonDivision_Count);

		Thread.sleep(2000);
		for (int j = 1; j < 43; j++) {
			Thread.sleep(2000);
			String Coomon_Division = BaseTest.getExcelData("Common Division", j, 1);

			BaseTest.select_index(driver.findElement(By.id("caste")), j);
			Thread.sleep(2000);
			WebElement Caste_aa1 = driver.findElement(By.id("caste"));
			Select aa11 = new Select(Caste_aa1);
			WebElement Caste_Val1 = aa1.getFirstSelectedOption();
			Caste_Value = Caste_Val1.getText();
			System.out.println("Caste Value : " + Caste_Value);

			Thread.sleep(2000);
			if (Coomon_Division.contains(Caste_Value)) {
				System.out.println(Coomon_Division + " matches with PI given data " + Caste_Value);
			} else {
				System.err.println(Coomon_Division + " not matches with PI given data " + Caste_Value);
			}
		}
		Thread.sleep(2000);
		// BaseTest.select_deselectAll(driver.findElement(By.id("wcsmCaste")));
		BaseTest.select_index(driver.findElement(By.id("caste")), 11);
		Thread.sleep(2000);
		WebElement Division = driver.findElement(By.id("caste"));
		Select aa111 = new Select(Division);
		WebElement Div11 = aa111.getFirstSelectedOption();
		String Division_val = Div11.getText();
		System.out.println("Division Value : " + Division_val);

		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"frmProfile\"]/div/div/input")).click();

		Thread.sleep(3000);
		driver.findElement(
				By.xpath("//*[@id=\"lp-container\"]/div/div/center/div[1]/div[2]/div/div[1]/div[1]/div[2]/a")).click();

		String Parent = driver.getWindowHandle();
		Thread.sleep(2000);
		try {
			Set<String> child = driver.getWindowHandles();
			for (String handle : child) {
				if (!Parent.contains(handle)) {
					Thread.sleep(2000);
					driver.switchTo().window(handle);
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
		}

		// ViewProfile_POM vv = new ViewProfile_POM(driver);

		Thread.sleep(2000);
		String denominations = driver
				.findElement(By.xpath("//span[contains(text(),'Denomination')]//following::span[2]")).getText();

		Thread.sleep(2000);
		String Divisionss = driver.findElement(By.xpath("//span[contains(text(),'Division')]//following::span[2]"))
				.getText();

		Thread.sleep(3000);
		if (Denomination.contains(denominations)) {
			System.out.println(Denomination + "Matches with PI" + denominations);
		} else {
			System.out.println(Denomination + "not Matches with PI" + denominations);
		}
		// BaseTest.select_deselectAll(driver.findElement(By.id("wcsmDenomination")));

		Thread.sleep(3000);
		if (Division_val.contains(Divisionss)) {
			System.out.println(Division_val + "Matches with PI" + Divisionss);
		} else {
			System.out.println(Division_val + "not Matches with PI" + Divisionss);
		}
		////////////////////////////////

	}

}
