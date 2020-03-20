package testscripts;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.net.InetAddress;
import java.net.URL;
import java.util.Properties;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.thoughtworks.selenium.webdriven.commands.Click;

import businessFunctions.BussinessFunctions;
import utility.BaseTest;

public class PaymentTest extends BaseTest {
	public static String baseurl;
	public static Properties properties, properties5;
	public WebElement readRep;

	public PaymentTest() throws Exception {

		properties = new Properties();
		FileInputStream fis = new FileInputStream(
				new File("C:\\Users\\amuthan\\eclipse-workspace\\CBSLogin\\objectRepository\\Login.properties"));
		properties.load(fis);

	}
	/*
	 * @BeforeTest public void startUp() {
	 * System.setProperty("webdriver.chrome.driver",
	 * "C:\\Users\\amuthan\\eclipse-workspace\\CBSLogin\\lib\\chromedriver.exe");
	 * driver = new ChromeDriver(); }
	 */

	@Test
	public void paymentTest() throws Exception {

		test = extent.createTest("Payment Test Scenario-1");
		test.pass("Browser Opened ");

		FileInputStream file = new FileInputStream(
				new File("C:\\Users\\amuthan\\eclipse-workspace\\CBS_Payment\\Resources\\LoginTestData.xlsx"));
		Workbook workbook = WorkbookFactory.create(file);
		Sheet sheet1 = workbook.getSheet("LoginTestData");
		for (int i = 5; i <= 5; i++) {
			baseurl = sheet1.getRow(i).getCell(0).getStringCellValue();
			driver.navigate().to(baseurl);
			test.pass("Application Launched Successfully");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			InetAddress ip = InetAddress.getByName(new URL(baseurl)
                    .getHost());
             System.out.println("Public IP Address of: " + ip);
             test.pass("Public IP Address of: " + ip); 
			String username = sheet1.getRow(i).getCell(1).getStringCellValue();
			String password = sheet1.getRow(i).getCell(2).getStringCellValue();
			test.info("Reading communitymatrimony UserName & Password from Test Data Repository");
			test.pass("UserName is Valid :" + username);
			test.pass("Password is Valid : *******");
			BussinessFunctions.cmLogin(driver, properties, username, password);
			Thread.sleep(2000);
			test.pass("Login Button Clicked");
			System.out.println("Login Successfully...");

			// BussinessFunctions.intermidatePages(driver,properties);
			try {
				WebElement skip_id = driver.findElement(By.xpath("//a[@class='clr7']"));
				if (skip_id.isDisplayed()) {
					skip_id.click();
					
					
				}
				
			} catch (Exception e) {
				e.getMessage();
			}
			
			
			try {
				WebElement photo_add = driver.findElement(By.xpath("/html/body/div[2]/a"));
				if (photo_add.isDisplayed()) {
					photo_add.click();
					driver.findElement(By.xpath("//*[@id=\"conform\"]/div/div/div/a[1]")).click();
					driver.findElement(By.xpath("//*[@id=\"reason3\"]")).click();
					driver.findElement(By.xpath("//*[@id=\"skipphotoclick\"]")).click();
					
				}
				
			} catch (Exception e) {
				e.getMessage();
			}
			
			
			try {
				WebElement skip_matches = driver.findElement(By.xpath("//a[contains(text(),'Skip to Daily Matches >>')]"));
				if (skip_matches.isDisplayed()) {
					skip_matches.click();
					
				}
			} catch (Exception e) {
				e.getMessage();
			}
			
			try {
				WebElement element = driver.findElement(By.xpath("/html/body/div[1]/div[2]/a"));
				if (element.isDisplayed()) {
					element.click();
					
				}
			} catch (Exception e) {
				e.getMessage();
			}
			
			try {
				WebElement divorcee_intermediate_skip = driver.findElement(By.xpath("/html/body/div[1]/div/div[4]/a"));
				if (divorcee_intermediate_skip.isDisplayed()) {
					divorcee_intermediate_skip.click();
					
				}
			} catch (Exception e) {
				e.getMessage();
			}
			
			
			test.pass("Intermidate Pages are closed...Successfully");
			System.out.println("Intermidate Pages are closed...");

			// Scenario-1 through Upgarde Option in Menu Bar...
			Thread.sleep(5000);
			try {
				WebElement adds_pop = driver.findElement(By.xpath("//*[@id='special_offer_lightpic1']/div[1]/div/a/img"));
				if (adds_pop.isDisplayed()) {
					adds_pop.click();
					
				}
			} catch (Exception e) {
				e.getMessage();
			}
			Thread.sleep(5000);
			try {
				driver.findElement(By.xpath("//*[@id=\"strategicComm\"]/div/div[2]/a/img")).click();
			} catch (Exception e) {
				System.out.println("Ads Handled Successfully");
			}
			Thread.sleep(5000);
			try {
				WebElement adds_pop = driver.findElement(By.xpath("//*[@id='special_offer_lightpic1']/div[1]/div/a/img"));
				if (adds_pop.isDisplayed()) {
					adds_pop.click();
					
				}
			} catch (Exception e) {
				System.out.println("Ad Page closed");;
			}
			

			//driver.findElement(By.xpath("//*[@id='special_offer_lightpic1']/div[1]/div/a/img")).click();
			Actions acc  = new Actions(driver);

			//Thread.sleep(3000);
			
			 WebDriverWait wait=new WebDriverWait(driver,60);
			 WebElement upgrade = driver.findElement(By.xpath("//*[@id=\"topnav-login-menu\"]/div[2]/div[6]/a"));
		   wait.until(ExpectedConditions.visibilityOf(upgrade)); 
			//    upgrade.click();
			    acc.moveToElement(upgrade).perform();
			   acc.doubleClick(upgrade).perform();

		Thread.sleep(3000);
	//	driver.findElement(By.xpath("(//a[contains(text(),'Upgrade')])[1]")).click();
			//(//a[contains(text(),'Upgrade')])[1]

		//	BussinessFunctions.payments_MouseAction(driver, properties);
	//	driver.navigate().to("https://communitymatrimony.com/payment/register_payment_upgrade.php?sourceFrom=2&EncId=32e30ab34c822a1c8e2cc68802c2cdacdda8ef01&MatriId=QlJIMjA0MTkwMw==&cid=BRH&gasrc=hdr&gaact=uprd&utm_source=Payment_Link&utm_medium=Header_Post_Login&utm_campaign=Menu_Below_Right&utm_content=Upgrade_Now");
		//https://communitymatrimony.com/payment/register_payment_upgrade.php?sourceFrom=2&EncId=32e30ab34c822a1c8e2cc68802c2cdacdda8ef01&MatriId=QlJIMjA0MTkwMw==&cid=BRH&gasrc=hdr&gaact=uprd&utm_source=Payment_Link&utm_medium=Header_Post_Login&utm_campaign=Menu_Below_Right&utm_content=Upgrade_Now
			test.info("Scenario-1 Through Upgrade in Menu Bar....");
			String parent = driver.getWindowHandle();
			System.out.println("Parent Window ID is  " + parent);
			Thread.sleep(1000);

			Set<String> winHandles = driver.getWindowHandles();
			int count = winHandles.size();
			System.out.println("Window Count is : " + count);
			for (String winHandle : winHandles) {
				if (!parent.contains(winHandle)) {

					driver.switchTo().window(winHandle);
				}
				// driver.switchTo().window(winHandle);
				// switch focus of WebDriver to the next found window handle (that's your newly
				// opened window)
				System.out.println("window Handle Id :" + winHandle);
				Thread.sleep(3000);
			}

			
			try {
				WebElement add = driver.findElement(By.xpath("//*[@id='special_offer_lightpic1']/div[1]/div/a/img"));
				if (add.isDisplayed()) {
					add.click();
					
				}
			} catch (Exception e) {
				e.getMessage();
			}
		//	driver.findElement(By.xpath("//*[@id='special_offer_lightpic1']/div[1]/div/a/img")).click();
//
//			Thread.sleep(3000);
			
			//driver.findElement(By.xpath("(//a[contains(text(),'Upgrade')])[1]")).click();

			//BussinessFunctions.selectOfferAmount_diamond3Months(driver);

			test.pass("Membership Plan Offer Button Clicked");
//			WebDriverWait wait = new WebDriverWait(driver, 20);
//			WebElement addOnPacks_ProfileHilighterElement = wait
//					.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"specialOffer120\"]")));
//					addOnPacks_ProfileHilighterElement.click();
		//	Thread.sleep(2000);

	/*		BussinessFunctions.addOnPacks(driver);
			test.pass("AddOn Packs Selected");
			WebDriverWait wait = new WebDriverWait(driver, 20);
			try {
				WebElement addOnPacks_ProfileHilighterElement = wait
						.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"specialOffer120\"]")));
				String addOnPacks1_ProfileHighlighter = addOnPacks_ProfileHilighterElement.getText();
				test.pass("AddOnPacks : " + addOnPacks1_ProfileHighlighter);

				WebElement addOnPacks_TopPlacmentElement = wait
						.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"specialOffer125\"]")));
				String addOnPacks1_TopPlacement = addOnPacks_TopPlacmentElement.getText();
				test.pass("AddOnPacks : " + addOnPacks1_TopPlacement);

				WebElement addOnPacks_AstroMatchElement = wait
						.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"specialOffer110\"]")));
				String addOnPacks1_AstroMatch = addOnPacks_AstroMatchElement.getText();
				test.pass("AddOnPacks: " + addOnPacks1_AstroMatch);
				// Special Check Out offer
				WebElement addOnPacks_SpecialOfferEle = wait.until(
						ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='splCheckoutAddon']/div")));
				String addOnPacks1_SpecialOffer = addOnPacks_SpecialOfferEle.getText();
				test.pass("AddOnPacks- Special CheckOut Offer : " + addOnPacks1_SpecialOffer);

				WebElement addOnPacks_TotalAmountEle = wait.until(ExpectedConditions
						.visibilityOfElementLocated(By.xpath("html/body/div[3]/div/div[5]/div[2]/div[6]/span")));
				String addOnPacks_TotalAmount = addOnPacks_TotalAmountEle.getText();
				test.pass("AddOnPacks- Total Amount : " + addOnPacks_TotalAmount);
			} catch (Exception e) {
				e.getMessage();
			} */

			Thread.sleep(2000);
			
			//Click Continue to enter Card Details
			
			try {
				WebElement click_continue_to_enter_card_details = driver.findElement(By.xpath("(//input[@type='submit'])[1]"));
				if (click_continue_to_enter_card_details.isDisplayed()) {
					click_continue_to_enter_card_details.click();
					
					
				}
			} catch (Exception e) {
				e.getMessage();
			}
			// Card Payment...
			Thread.sleep(2000);
			try {
				driver.findElement(By.xpath(".//*[@id='cardHolderName']")).sendKeys("xxxxx");
			} catch (Exception e) {
				e.getCause();
			}
			driver.findElement(By.xpath(".//*[@id='vpc_CardNum_C']")).sendKeys("4111111111111111");

			Select month = new Select(driver.findElement(By.xpath(".//*[@id='cardExpiryMonth']")));
			month.selectByIndex(4);
			Select year = new Select(driver.findElement(By.xpath(".//*[@id='cardExpiryYear']")));
			year.selectByIndex(6);
			Thread.sleep(2000);

			driver.findElement(By.xpath(".//*[@id='vpc_CardSecurityCode']")).sendKeys("635");
			Thread.sleep(3000);

			driver.findElement(By.xpath(".//*[@id='crditCardRiSubButL']")).click();
			Thread.sleep(3000);
			test.pass("Card Details entered Successfully");
			test.pass("Pay Securly Button Cliked");
			test.pass("Redirecting Payment Process....");
			Thread.sleep(5000);
			
//			 File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//	         FileUtils.copyFile(screenshotFile, new File("C:\Users\amuthan\Desktop\ScreenShot" + ));

			//driver.close();
		//	driver.switchTo().window(parent);

//			Thread.sleep(3000);
//		BussinessFunctions.Logout(driver, properties);
//
//			Thread.sleep(2000);
//			System.out.println("Successfully logged out ");
//			test.pass("Application Logged Out Successfully...");
//
//		}
		driver.quit();

	}
}
	
	
	/* @AfterMethod
	    public void takeScreenShotOnFailure(ITestResult testResult) throws Exception {
	    	
	   	 if (testResult.getStatus()==2) {
	           BaseTest.sendVFSms();
	            System.out.println("intial fail");
	        } else if(testResult.getStatus()==1){
	            String text = BaseTest.readValueFromExcelSheet1().get(0).get("Result");
	            System.out.println(text);
	            if(!text.equals("2.0")){
	            	BaseTest.sendVFSms1();
	                System.out.println("status change");
	            }else{

	            }

	        }



	        System.out.println(testResult.getStatus());
	        FileInputStream file = new 
	   FileInputStream("C:\\Users\\amuthan\\eclipse-workspace\\CBS_Payment\\Resources\\LoginTestData_Mohan.xlsx");

	        XSSFWorkbook workbook = new XSSFWorkbook(file);
	   XSSFSheet sheet = workbook.getSheet("Sheet1");


	        //Update the value of cell
	       Cell cell = sheet.getRow(1).createCell(0);
	        cell.setCellValue(testResult.getStatus());

	        file.close();

	        FileOutputStream outFile =new FileOutputStream(new 
	   File("C:\\Users\\amuthan\\eclipse-workspace\\CBS_Payment\\Resources\\LoginTestData_Mohan.xlsx"));
	        workbook.write(outFile);
	        outFile.close();

}
*/
}