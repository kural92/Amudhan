package cm.testscripts;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Set;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import base.BaseTest;
import pom.cmlogin.payDiv;

public class CBSPayment extends BaseTest {

	WebDriver driver;

	@BeforeSuite
	public void setUp() {
		// test=reports.startTest("Divorcee Negative Payment");
		// test.log(LogStatus.PASS, "Divorcee Negative Payment Test Started");
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\amuthan\\eclipse-workspace\\CBS\\Driver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);
		driver.get("https://www.divorceematrimony.com");
		driver.manage().window().maximize();
	}

	@Test
	public void negativePayment() throws Exception {
		BaseTest b = new BaseTest();
		payDiv p = new payDiv(driver);
		// System.out.println("clicked");
		Thread.sleep(3000);
		// test.log(LogStatus.PASS, "Logging Started");
		b.click(p.getMatriID());
		Thread.sleep(3000);
		b.typeData(p.getMatriID(), b.readValueFromExcelSheet().get(1).get("UserName"));
		Thread.sleep(3000);
		b.click(p.getDpassWordclr1());
		Thread.sleep(3000);
		// driver.findElement(By.xpath("BaseTest")).sendKeys("cbstest");
		b.typeData(p.getDpassword(), b.readValueFromExcelSheet().get(1).get("PassWord"));
		Thread.sleep(3000);
		b.click(p.getDlogin());
		// test.log(LogStatus.PASS, "Logged In Successfully");
		Thread.sleep(3000);
		
/////////////////////////////////////  Intermediate Pages    ////////////////////////////////////////////////////////////
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

// AD Pages
		Thread.sleep(3000);
		try {
			driver.findElement(By.xpath("//*[@id=\"special_offer_lightpic1\"]/div[1]/div/a/img")).click();
		} catch (Exception e) {
			System.out.println("ADs Closed Successfully");
		}

//////////////////////////////////////////// ///////////////////////////////////////////////////////////////

		// test.log(LogStatus.PASS, "Intermediated Pages closed successfully");
	
	/*
	 * WebDriverWait Wait = new WebDriverWait(driver, 3000);
	 * Wait.until(ExpectedConditions.visibilityOf(p.getDskipInter())).click();
	 */
	/*Thread.sleep(3000);
	b.click(p.getDaddsPop());*/
	
/*	Thread.sleep(3000);
	b.click(p.getDupgrde());
	
	
	/////////////////////////////////////////
	String parent = driver.getWindowHandle();
	System.out.println("Parent Window ID : "+parent);
	
	Set<String> child = driver.getWindowHandles();
	System.out.println("Child  Window ID : "+child);
	
	for (String handle : child) {
		if (!parent.equals(handle)) {
			
			driver.switchTo().window(handle);
			
			
		}
	}
	

	
	/////////////////////////////////////////
	
	Thread.sleep(3000);
	// test.log(LogStatus.PASS, "Membership pack choosen Successfully");
	b.click(p.getDcardNumber());
	
	Thread.sleep(3000);
	// test.log(LogStatus.PASS, "Entering card details");
	b.typeData(p.getDcardNumber(),b.readValueFromExcelSheet().get(1).get("Card NO"));
	
	Thread.sleep(3000);
	b.typeData(p.getDexpreMnth(),b.readValueFromExcelSheet().get(1).get("EX Month"));
	
	Thread.sleep(3000);
	b.typeData(p.getDexpreYr(),b.readValueFromExcelSheet().get(1).get("EX Date"));
	
	Thread.sleep(3000);
	b.typeData(p.getDCvv(),b.readValueFromExcelSheet().get(1).get("Cvv"));
	
	Thread.sleep(3000);b.click(p.getDpayCRDcard());
	// test.log(LogStatus.PASS, "Payment in Progress");
	// test.log(LogStatus.PASS, "Negative Payment test Completed Successfully");   */

	}
	
	
	  @AfterMethod
	    public void takeScreenShotOnFailure(ITestResult testResult) throws Exception {
	    	
	   	 if (testResult.getStatus()==2) {
	           BaseTest.sendVFSms3();
	            System.out.println("intial fail");
	        } else if(testResult.getStatus()==1){
	            String text = BaseTest.readValueFromExcelSheet1().get(0).get("Result");
	            System.out.println(text);
	            if(text.equals("2.0")){
	            	BaseTest.sendVFSms2();
	                System.out.println("status change");
	            }else{

	            }

	        }



	        System.out.println(testResult.getStatus());
	        FileInputStream file = new 
	   FileInputStream("C:\\Users\\amuthan\\eclipse-workspace\\CBS\\Excel\\Divorcee_Test_Data.xlsx");

	        XSSFWorkbook workbook = new XSSFWorkbook(file);
	   XSSFSheet sheet = workbook.getSheet("Sheet2");


	        //Update the value of cell
	       Cell cell = sheet.getRow(1).createCell(0);
	        cell.setCellValue(testResult.getStatus());

	        file.close();

	        FileOutputStream outFile =new FileOutputStream(new 
	   File("C:\\Users\\amuthan\\eclipse-workspace\\CBS\\Excel\\Divorcee_Test_Data.xlsx"));
	        workbook.write(outFile);
	        outFile.close();
	        
	  }
	
	

	@AfterTest
	public void exit() {
	//	driver.quit();
	//	test.log(LogStatus.PASS, "Browser Closed");
		
	//	reports.endTest(test);
	//	reports.flush();
	//	reports.close();

	}

}
