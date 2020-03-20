package testscripts;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.net.InetAddress;
import java.net.URL;
import java.util.Properties;
import java.util.Set;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import businessFunctions.BussinessFunctions;
import utility.BaseTest;

public class NeagtivePayment extends BaseTest {
	public static String baseurl;
	public static Properties properties, properties5;
	public WebElement readRep;

	public NeagtivePayment() throws Exception {

        properties = new Properties();
        FileInputStream fis = new FileInputStream(
                new File("C:\\Users\\amuthan\\eclipse-workspace\\SampleLogin\\objectRepository\\Login.properties"));
        properties.load(fis);

    }

	@Test
	public void paymentTest() throws Exception {

		test = extent.createTest("Payment Test Scenario-1");
		test.pass("Browser Opened ");

		FileInputStream file = new FileInputStream(new File(
				"C:\\Users\\amuthan\\eclipse-workspace\\SampleLogin\\Resources\\LoginTestData_Mohan2333.xlsx"));
		Workbook workbook = WorkbookFactory.create(file);
		Sheet sheet1 = workbook.getSheet("login");
		for (int i = 1; i <= 1; i++) {
			baseurl = sheet1.getRow(i).getCell(0).getStringCellValue();
			driver.navigate().to(baseurl);

			InetAddress ip = InetAddress.getByName(new URL(baseurl).getHost());
			System.out.println("Public IP Address of: " + ip);
			test.pass("Public IP Address of: " + ip);

			test.pass("Application Launched Successfully");
			driver.manage().window().maximize();
			Thread.sleep(2000);

			String username = sheet1.getRow(i).getCell(1).getStringCellValue();
			String password = sheet1.getRow(i).getCell(2).getStringCellValue();
			test.info("Reading communitymatrimony UserName & Password from Test Data Repository");
			test.pass("UserName is Valid :" + username);
			test.pass("Password is Valid : *******");
			BussinessFunctions.cmLogin(driver, properties, username, password);
			Thread.sleep(2000);
			test.pass("Login Button Clicked");
			System.out.println("Login Successfully...");

			Thread.sleep(3000);
			
			try {
				driver.findElement(By.xpath("//a[@class='clr7']")).click();
			} catch (Exception e) {
				e.getMessage();
			}
			Thread.sleep(3000);
			try {
				driver.findElement(By.xpath("//*[@id=\"special_offer_lightpic1\"]/div[1]/div/a/img")).click();
			} catch (Exception e) { 
				e.getMessage();
			}
			Thread.sleep(3000);
			try {
				driver.findElement(By.xpath("//*[@id=\"strategicComm\"]/div/div[2]/a/img")).click();
			} catch (Exception e) {
				e.getMessage();
			}
			Thread.sleep(3000);
			try {
				driver.findElement(By.xpath("/html/body/header/div/div/div/a")).click();
			} catch (Exception e) {
				e.getMessage();
			}
			try {
				driver.findElement(By.xpath("//*[@id=\"special_offer_lightpic1\"]/div[1]/a/img")).click();
			} catch (Exception e) {
				e.getMessage();
			}
			Thread.sleep(3000);
			test.pass("Intermidate Pages are closed...Successfully");
			System.out.println("Intermidate Pages are closed...");

			Thread.sleep(5000);
		//	driver.navigate().to("https://communitymatrimony.com/payment/register_payment_upgrade.php?sourceFrom=2&EncId=32e30ab34c822a1c8e2cc68802c2cdacdda8ef01&MatriId=QlJIMjA0MTkwMw==&cid=BRH&gasrc=hdr&gaact=uprd&utm_source=Payment_Link&utm_medium=Header_Post_Login&utm_campaign=Menu_Below_Right&utm_content=Upgrade_Now");
			driver.findElement(By.xpath("//*[@id=\"topnav-login-menu\"]/div[2]/div[6]/a")).click();

			test.info("Scenario-1 Through Upgrade in Menu Bar....");
			String parent = driver.getWindowHandle();
			System.out.println("Parent Window ID is  " + parent);
			Thread.sleep(3000);

			Set<String> winHandles = driver.getWindowHandles();
			int count = winHandles.size();
			System.out.println("Window Count is : " + count);
			for (String winHandle : winHandles) {
				if (!parent.contains(winHandle)) {
					Thread.sleep(3000);
					driver.switchTo().window(winHandle);
				}

				System.out.println("window Handle Id :" + winHandle);

			}
			System.out.println("Handled");
			test.pass("Membership Plan Offer Button Clicked");

			Thread.sleep(5000);
			driver.findElement(By.id("vpc_CardNum_C")).sendKeys("4111111111111111");

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
			System.out.println("Card Details entered Successfully");
			test.pass("Pay Securly Button Cliked");
			test.pass("Redirecting Payment Process....");
			System.out.println("Negative payment completed");

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
	   FileInputStream("C:\\Users\\amuthan\\eclipse-workspace\\SampleLogin\\Resources\\LoginTestData_Mohan.xlsx");

	        XSSFWorkbook workbook = new XSSFWorkbook(file);
	   XSSFSheet sheet = workbook.getSheet("Sheet1");


	        //Update the value of cell
	       Cell cell = sheet.getRow(1).createCell(0);
	        cell.setCellValue(testResult.getStatus());

	        file.close();

	        FileOutputStream outFile =new FileOutputStream(new 
	   File("C:\\Users\\amuthan\\eclipse-workspace\\SampleLogin\\Resources\\LoginTestData_Mohan.xlsx"));
	        workbook.write(outFile);
	        outFile.close();

}*/

}
