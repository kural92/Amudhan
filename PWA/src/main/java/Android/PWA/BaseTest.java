package Android.PWA;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;
import java.util.Random;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.appium.java_client.android.AndroidDriver;

public class BaseTest {

	public static ExtentReports reports;
	public static ExtentTest test;
	String html = "PWAReport.html";
	AndroidDriver driver;

	public static void click(WebElement element) {
		element.click();

	}

	public static void clear(WebElement element) {
		element.clear();
	}

	public static void typeData(WebElement element, String Value) {
		element.sendKeys(Value);

	}

////////////////Drop Down Base//////////////////

	public static void select_string(WebElement element, String Value) {
		Select s = new Select(element);
		s.selectByValue(Value);
	}

	public static void select_index(WebElement element, int Value) {
		Select s = new Select(element);
		s.selectByIndex(Value);
	}

	public static void select_text(WebElement element, String text) {
		Select s = new Select(element);
		s.selectByVisibleText(text);
	}
	
	public static void select_visibleText(WebElement element, String text) {
		Select s = new Select(element);
		s.selectByVisibleText(text);

	}

//////////////////////    Screen SHot    //////////////////////////////////////

//Creating a method getScreenshot and passing two parameters 
//driver and screenshotName
	public static String getScreenshot(WebDriver driver, String screenshotName) throws Exception {
		// below line is just to append the date format with the screenshot name to
		// avoid duplicate names
		String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		// after execution, you could see a folder "FailedTestsScreenshots" under src
		// folder
		String destination = "C:\\Users\\amuthan\\eclipse-workspace\\PWA\\ScreenShot\\" + screenshotName
				+ ".png";
		File finalDestination = new File(destination);
		FileUtils.copyFile(source, finalDestination);
		// Returns the captured file path
		return destination;
	}

//////////    Excel    COde   ///////////////////////

	public static String getExcelData(String sheetName, int rowNum, int colNum) throws Throwable {
		FileInputStream fis = new FileInputStream(
				"C:\\Users\\amuthan\\eclipse-workspace\\PWA\\Excel\\Registeration.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetName);
		Row row = sh.getRow(rowNum);
		String data = row.getCell(colNum).getStringCellValue();
		wb.close();
		return data;
	}

	public static int getExcelRandomRowNum(String sheetName) throws Throwable {
		FileInputStream fis = new FileInputStream(
				"C:\\Users\\amuthan\\eclipse-workspace\\PWA\\Excel\\Registeration.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetName);
		Random rand = new Random();
		int rowNum = rand.nextInt(sh.getLastRowNum());
		return rowNum;
	}

	public static void setExcelData(String sheetName, int rowNum, int colNum, String data) throws Throwable {
		FileInputStream fis = new FileInputStream(
				"C:\\Users\\amuthan\\eclipse-workspace\\PWA\\Excel\\Registeration.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetName);
		Row row = sh.getRow(rowNum);
		Cell cel = row.createCell(colNum);
		cel.setCellValue(data);
		FileOutputStream fos = new FileOutputStream(
				"C:\\Users\\amuthan\\eclipse-workspace\\PWA\\Excel\\Registeration.xlsx");
		wb.write(fos);
		wb.close();
	}

	public static int getRowCount(String sheetName) throws Throwable {
		FileInputStream fis = new FileInputStream(
				"C:\\Users\\amuthan\\eclipse-workspace\\PWA\\Excel\\Registeration.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		int rowIndex = wb.getSheet(sheetName).getLastRowNum();
		return rowIndex;
	}

	public static void setExcelDataInteg(String sheetName, int rowNum, int colNum, int data) throws Throwable {
		FileInputStream fis = new FileInputStream(
				"C:\\Users\\amuthan\\eclipse-workspace\\PWA\\Excel\\Registeration.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetName);
		Row row = sh.getRow(rowNum);
		Cell cel = row.createCell(colNum);
		cel.setCellValue(data);
		FileOutputStream fos = new FileOutputStream(
				"C:\\Users\\amuthan\\eclipse-workspace\\PWA\\Excel\\Registeration.xlsx");
		wb.write(fos);
		wb.close();

	}
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	@BeforeSuite
	public void htmlReport() throws IOException {

		reports = new ExtentReports("C:\\Users\\amuthan\\eclipse-workspace\\PWA\\Report\\" + html, true);
		reports.loadConfig(new File("C:\\Users\\amuthan\\eclipse-workspace\\PWA\\extent-config.xml"));
		// test=reports.startTest("Android Registeration Test");

	}

	/*
	 * @AfterSuite public void reportflush() {
	 * 
	 * final String username = "mohantest.mm@gmail.com"; final String password =
	 * "mohanmmteam";
	 * 
	 * Properties props = new Properties(); props.put("mail.smtp.auth", true);
	 * props.put("mail.smtp.starttls.enable", true); props.put("mail.smtp.host",
	 * "smtp.gmail.com"); props.put("mail.smtp.port", "587");
	 * 
	 * Session session = Session.getInstance(props, new javax.mail.Authenticator() {
	 * protected PasswordAuthentication getPasswordAuthentication() { return new
	 * PasswordAuthentication(username, password); } }); Message message = new
	 * MimeMessage(session);
	 * 
	 * try {
	 * 
	 * message.setFrom(new InternetAddress("mohantest.mm@gmail.com"));
	 * 
	 * message.setSubject("CBS Android Automation Report ");
	 * 
	 * message.setRecipients(Message.RecipientType.TO,
	 * InternetAddress.parse("cbsautomationreport@gmail.com"));
	 * //,thanikachalam.thirunanasambandan@matrimony.com Multipart multipart = new
	 * MimeMultipart();
	 * 
	 * MimeBodyPart messageBodyPart = new MimeBodyPart();
	 * messageBodyPart.setText("CBS Android Automation Report"); MimeBodyPart
	 * attachmentBodyPart = new MimeBodyPart();
	 * 
	 * 
	 * String file = "D:\\Android HTML Report\\"+html;
	 * 
	 * String fileName = "CBS-Android-Automation-Report"; DataSource source = new
	 * FileDataSource(file); // messageBodyPart.setDataHandler(new
	 * DataHandler(source)); attachmentBodyPart.setDataHandler(new
	 * DataHandler(source)); attachmentBodyPart.setFileName("AndroidReport.html");
	 * 
	 * 
	 * multipart.addBodyPart(messageBodyPart);
	 * multipart.addBodyPart(attachmentBodyPart);
	 * 
	 * message.setContent(multipart);
	 * 
	 * System.out.println("Sending....");
	 * 
	 * Transport.send(message);
	 * 
	 * System.out.println("Mail Sent Successfully");
	 * 
	 * } catch (MessagingException e) { e.printStackTrace(); }
	 * 
	 * }
	 * 
	 */

	public static String getScreenhot(WebDriver driver, String screenshotName) throws Exception {
		String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		// after execution, you could see a folder "FailedTestsScreenshots" under src
		// folder
		String destination = "D:\\Android HTML Report\\Screenshot-Fails\\" + screenshotName + dateName + ".png";
		File finalDestination = new File(destination);
		FileUtils.copyFile(source, finalDestination);
		return destination;
	}
}

//@AfterMethod
//
//public void getResult(ITestResult result){
//if(result.getStatus() == ITestResult.FAILURE){
//test.log(LogStatus.FAIL, "Test Case Failed is "+result.getName());
//test.log(LogStatus.FAIL, "Test Case Failed is "+result.getThrowable());
//
//String screenshotPath = "D:\\Android HTML Report\\Screenshot-Fails\\";
////To add it in the extent report 
//test.log(LogStatus.FAIL, test.addScreenCapture(screenshotPath));
//
//
//
//}else if(result.getStatus() == ITestResult.SKIP){
//test.log(LogStatus.SKIP, "Test Case Skipped is "+result.getName());
//}
//}
//}
