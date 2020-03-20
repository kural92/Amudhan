package testscripts;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.net.InetAddress;
import java.net.URL;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.GetCurrentUrl;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import businessFunctions.BussinessFunctions;
import utility.BaseTest;

public class Url extends BaseTest {

	public static String baseurl;
	public static Properties properties;

	public Url() throws Exception {

		properties = new Properties();
		FileInputStream fis = new FileInputStream(new File(
				"C:\\\\Users\\\\amuthan\\\\eclipse-workspace\\\\CM_Desktop\\\\ObjectRepository\\\\Login.properties"));
		this.properties.load(fis);
	}
	/*
	 * @BeforeMethod public void startUp() {
	 * System.setProperty("webdriver.chrome.driver",
	 * "C:\\Users\\amuthan\\eclipse-workspace\\CBSLogin\\lib\\chromedriver.exe");
	 * driver = new ChromeDriver(); }
	 */


	
	@Test
	public void loginTest() throws Exception {

		test = extent.createTest("Url Test");
		test.pass("Browser Opened ");

		FileInputStream file = new FileInputStream(
				new File("C:\\Users\\amuthan\\eclipse-workspace\\SampleLogin\\Resources\\LoginTestData_Mohan2222.xlsx"));
		Workbook workbook = WorkbookFactory.create(file);
		Sheet sheet = workbook.getSheetAt(0);
		File ff = new File("C:\\Users\\amuthan\\eclipse-workspace\\Community_Edit\\Excel\\writeeditpp.xlsx");
		Workbook www = new XSSFWorkbook();
		Sheet ss = www.createSheet("editppvalue1");
		Row rrr = ss.createRow(2);
			FileOutputStream out = new FileOutputStream(ff);
		for (int i =1; i <=451; i++) {
			baseurl = sheet.getRow(i).getCell(0).getStringCellValue();
			driver.navigate().to(baseurl);
			InetAddress ip = InetAddress.getByName(new URL(baseurl)
                    .getHost());
             System.out.println("Public IP Address of: " + ip);
             test.pass("Public IP Address of: " + ip); 
			test.pass("Application Launched Successfully");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			String domain = driver.getCurrentUrl();
			test.pass("Domain Name====>" + domain);
			System.out.println("====>" + domain);

	
		        //Convert web driver object to TakeScreenshot		
			TakesScreenshot scrShot =((TakesScreenshot)driver);


			
			//Call getScreenshotAs method to create image file

		                File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
               String path = "C:\\Users\\amuthan\\eclipse-workspace\\SampleLogin\\Screenshot\\"+domain+".png";
	            //Move image file to new destination
		                File DestFile=new File("path");

	                //Copy file at destination

		                FileUtils.copyFile(SrcFile, DestFile);
		                
		       

		    }
	
}

}


