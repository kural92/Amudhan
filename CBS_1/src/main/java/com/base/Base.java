package com.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

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

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeSuite;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class Base {

	static WebDriver driver;
	public static ExtentReports extent;
    public static ExtentTest test;
    String html =  "MyReport.html";
	//static long timeOutInSeconds = 60;
	//String filename = "C:\\\\Users\\\\amuthan\\\\eclipse-workspace\\\\CBS_1\\\\Excel\\\\EditProfile.xlsx";

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
	
	///////////////////////Wait Base//////////////////////////
	public static void waitPageToLoad()
	  {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  }
	 public static void waitElementToPresent(WebElement element,WebDriverWait wait)
	 {
	     wait=new WebDriverWait(driver,30);
	    wait.until(ExpectedConditions.visibilityOf(element));
		
	  }
	
	
///////////////////////////////////Excel Read and Write Base///////////
	public static List<HashMap<String, String>> readValueFromExcelSheet() throws NullPointerException {
		List<HashMap<String, String>> mapDatasList = new ArrayList();
		try {
			File excelLocaltion = new File("C:\\Users\\amuthan\\eclipse-workspace\\CBS_1\\Excel\\EditProfile.xlsx");

			String sheetName = "Sheet1";

			FileInputStream f = new FileInputStream(excelLocaltion.getAbsolutePath());
			Workbook w = new XSSFWorkbook(f);
			Sheet sheet = w.getSheet(sheetName);
			Row headerRow = sheet.getRow(0);
			for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
				Row currentRow = sheet.getRow(i);
				HashMap<String, String> mapDatas = new HashMap<String, String>();
				for (int j = 0; j < headerRow.getPhysicalNumberOfCells(); j++) {
					Cell currentCell = currentRow.getCell(j);

					switch (currentCell.getCellType()) {
					case Cell.CELL_TYPE_STRING:
						mapDatas.put(headerRow.getCell(j).getStringCellValue(), currentCell.getStringCellValue());
						break;
					case Cell.CELL_TYPE_NUMERIC:
						mapDatas.put(headerRow.getCell(j).getStringCellValue(),
								String.valueOf(currentCell.getNumericCellValue()));

						break;

					}
				}

				mapDatasList.add(mapDatas);
			}

		} catch (Throwable e) {
			e.printStackTrace();
		}
		return mapDatasList;

	}
	
	///////////////////////////////////////////////////////////////////////////////////////////////////
	
	
	///////////////////////////////////////////////////////////////////////////////////////////
	
                             /*    ---  Excel Base Code   ---    */
	
	
	public static  void readExcelData( String sheetName,int row, int cell) throws IOException, InvalidFormatException {
		
		FileInputStream fis = new FileInputStream("C:\\Users\\amuthan\\eclipse-workspace\\CBS_1\\Excel\\Data.xlsx");
		Workbook w = WorkbookFactory.create(fis);
		Sheet s = w.getSheet(sheetName);
		Row r = s.getRow(row);
		String read = r.getCell(cell).getStringCellValue();
	
		return;
		

	}
	
	
	public static void writeExcelData(String sheetName,int row,int cell,String value) throws IOException {

		FileInputStream fis = new FileInputStream("C:\\Users\\amuthan\\eclipse-workspace\\CBS_1\\Excel\\Data.xlsx");
		Workbook w = new XSSFWorkbook(fis);
		Sheet s = w.getSheet(sheetName);
		Row r = s.createRow(row);
		Cell c = r.createCell(cell);
		c.setCellValue(value);
		return;


	}
	
	
	  public static void reportflush1()
			{
				extent.flush();    	
				final String username = "cbsautomationreport@gmail.com";
			    final String password = "cbstest123";

			    Properties props = new Properties();
			    props.put("mail.smtp.auth", true);
			    props.put("mail.smtp.starttls.enable", true);
			    props.put("mail.smtp.host", "smtp.gmail.com");
			    props.put("mail.smtp.port", "587");

			    Session session = Session.getInstance(props, new javax.mail.Authenticator() {
			        protected PasswordAuthentication getPasswordAuthentication() {
			            return new PasswordAuthentication(username, password);
			        }
			    });
			    Message message = new MimeMessage(session);

			    try {
			       
			        message.setFrom(new InternetAddress("cbsautomationreport@gmail.com"));

			        message.setSubject("[CBS-QA-ALERT-LEVEL 2]["+   " :  FAIL]");
			     
			        message.setRecipients(Message.RecipientType.TO,
			                    InternetAddress.parse("amudhan.nagarajan@matrimony.com"));
			           //,thanikachalam.thirunanasambandan@matrimony.com                        
			        Multipart multipart = new MimeMultipart();

			        MimeBodyPart messageBodyPart = new MimeBodyPart();
			        messageBodyPart.setText("Level 2 " +"\n" + "Module : "+"\n"+"Platform : Desktop" +"\n"+ "Error on : "+ "\n" + "Error Description : "  +"\n" + "Domain Name : "  + "\n"+"Location : Adayar-Chennai" +"\n" + test.getStartedTime() +"");
			        MimeBodyPart attachmentBodyPart = new MimeBodyPart();       
			       // " Level 1 " +"\n" + "Error on : Login Test " + "\n" + "Error Description : " + error + "\n"  + " Reported to : No Response " +"\n" + "Domain Name : " + domain + "\n" + test.getStartedTime() +"" ;
		             //CBS Automation Report - Mail for Script Failed With Resson"+"\n"+ "Domain : " +domain+"\n"+"Error on : " +error+ "\n"+ " Error Reason : " + expt + "
			        String file = "C:\\Users\\amuthan\\eclipse-workspace\\Sample_Project\\Report\\MyReport.html";

			        String fileName = "CBS-AutomationReport-Desktop";
			        DataSource source = new FileDataSource(file);
			       // messageBodyPart.setDataHandler(new DataHandler(source));
			        attachmentBodyPart.setDataHandler(new DataHandler(source));
			        attachmentBodyPart.setFileName("MyReport.html");
			      
			       
			        multipart.addBodyPart(messageBodyPart);
			        multipart.addBodyPart(attachmentBodyPart);

			        message.setContent(multipart);

			        System.out.println("Sending....");

			        Transport.send(message);

			        System.out.println("Mail Sent Successfully");

			    } catch (MessagingException e) {
			        e.printStackTrace();
			    }      
			    
			    /////////////////////////////////////////////////////////////////////////////////////////////////////////////
		    

			
		}    

		@BeforeSuite
		public void htmlReport() {
			
			
		    // extent = new ExtentHtmlReporter("C:\\Users\\amuthan\\eclipse-workspace\\com.mobile\\ScreenShot");
	       
			 extent=new ExtentReports("C:\\Users\\amuthan\\eclipse-workspace\\CBS_1\\Report\\"+html,true);
			 extent.loadConfig(new File("C:\\Users\\amuthan\\eclipse-workspace\\CBS_1\\extent-config.xml"));
	    	 //test=reports.startTest("Android Registeration Test");
	         
		}
		
	
	
	
	/////////////////////////////////////////////////////////////////////////////////////////
	/*@AfterMethod
	public void screenShot(ITestResult result) {

		if (ITestResult.FAILURE == result.getStatus()) {
			try {
				TakesScreenshot screenshot = (TakesScreenshot) driver;
				File src = screenshot.getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(src, new File(
						"C:\\Users\\amuthan\\eclipse-workspace\\CBS_1\\Screenshot\\" + result.getName() + ".png"));
				System.out.println("Successfully captured a screenshot");


			} catch (Exception e) {
				System.out.println("Exception while taking screenshot " + e.getMessage());
			}
		}
	} */
}
