package com.testScripts;

import java.awt.Robot;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.base.BaseTest;
import com.objectRepository.GamoogaPOM;

public class Gamooga  extends BaseTest {
	
	public static String Status;
	String Path= "C:\\Users\\amuthan\\eclipse-workspace\\Gammoga\\Data\\Excel.xlsx";
	
	@BeforeSuite
	public void setUp() {
		// test=reports.startTest("Divorcee Negative Payment");
		// test.log(LogStatus.PASS, "Divorcee Negative Payment Test Started");
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\amuthan\\eclipse-workspace\\Gammoga\\Driver\\chromedriver.exe");
		ChromeOptions lChromeOptions = new ChromeOptions();
		HashMap<String, Object> lChromePrefs = new HashMap<String, Object>();
		lChromePrefs.put("profile.default_content_settings.popups", 0);
		lChromePrefs.put("download.default_directory", Path);
		lChromePrefs.put("browser.set_download_behavior", "{ behavior: 'allow' , downloadPath: '"+Path+"'}");

	//	lChromeOptions.addArguments("--headless");
	//	lChromeOptions.addArguments("--disable-gpu");
		lChromeOptions.setExperimentalOption("prefs", lChromePrefs);
	       driver = new ChromeDriver(lChromeOptions);
		
		/*ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);*/
	
	}
	
	@Test
	public void excelDownload() throws Throwable {
	
			
			
			Actions acc = new Actions(driver);
			Robot r = new Robot();
			WebDriverWait wait = new WebDriverWait(driver, 30);
			JavascriptExecutor js  = (JavascriptExecutor)driver;
			
			//  POM 
			
			GamoogaPOM g = new GamoogaPOM(driver);

			driver.get("https://gamooga.com/user/login/?next=/manage/");
			driver.manage().window().maximize();
			Thread.sleep(3000);
			
//  Enter Username			
			BaseTest.click(g.getUserName());
			BaseTest.typeData(g.getUserName(), BaseTest.getExcelData("Chat", 1, 1));
			Thread.sleep(3000);
			
// Enter Password			
			BaseTest.click(g.getPassWord());
			BaseTest.typeData(g.getPassWord(), BaseTest.getExcelData("Chat", 1, 2));
			Thread.sleep(3000);
			
	// Login Button		
	try {		
			BaseTest.click(g.getLogin_btn());
	} catch (Exception e) {
		BaseTest.click(g.getLogin_btn1());
	}
	
	
	Thread.sleep(5000);
	
	// Click - Chat 
	BaseTest.click(g.getChat_btn());
	Thread.sleep(3000);
	
	//  Click - report
	BaseTest.click(g.getReport_btn());
	Thread.sleep(3000);
	
	// Click - Chat Transcit
	BaseTest.click(g.getChat_Transcits());
	Thread.sleep(5000);
	
	
	////    DAte Value Chooser
	
	BaseTest.click(g.getDatePicker_From());
	Thread.sleep(3000);
	
	
	BaseTest.select_text(g.getDate_Hour_To(), "Noon");
	Thread.sleep(3000);
	
//////	From Time Choosing ( Noon )
	BaseTest.click(g.getDatePicker_To());
	Thread.sleep(3000);
	
	BaseTest.select_text(g.getDate_Hour_To1(), "Noon");
	Thread.sleep(3000);

//////	From Time Choosing ( Midnight )
	BaseTest.click(g.getDatePicker_From());
	Thread.sleep(3000);
	
	BaseTest.select_text(g.getDate_Hour_To(), "Midnight");
	Thread.sleep(3000);
	
///////  To Time Choosing ( Hour )
	BaseTest.click(g.getDatePicker_To());
	Thread.sleep(3000);
	
	
	BaseTest.select_text(g.getDate_Hour_To1(), "11 PM");
	Thread.sleep(3000);
	
/////	To Time Choosing ( Minute )
	BaseTest.click(g.getDatePicker_To());
	Thread.sleep(3000);
	
	
	BaseTest.select_text(g.getDate_minute_To(), "59");
	Thread.sleep(3000);
	String Parent = driver.getWindowHandle();
	
	// Visitor Survey
		BaseTest.click(g.getVisitor_survey_all());
		Thread.sleep(3000);
		
		
		//Operator Survey
		BaseTest.click(g.getOperator_survey_all());
		Thread.sleep(3000);
		
		
		//Associated Event
		BaseTest.click(g.getAssociated_event_all());
		Thread.sleep(3000);
	
//////	 Check Box - Click Full Chat
	BaseTest.click(g.getInclude_full_chats());
	Thread.sleep(3000);
	
	// DownLoad Excel Button
	BaseTest.click(g.getDownload_Exel());

        // Store the current window handle
        String mainWindow = driver.getWindowHandle();

        // open a new tab
        js.executeScript("window.open()");
        
       // switch to new tab
      // Switch to new window opened
        for(String winHandle : driver.getWindowHandles()){
            driver.switchTo().window(winHandle);
        }
       // navigate to chrome downloads
        driver.get("chrome://downloads");

        JavascriptExecutor js1 = (JavascriptExecutor)driver;
        // wait until the file is downloaded
        Long percentage = (long) 0;
        while ( percentage!= 100) {
            try {
                percentage = (Long) js1.executeScript("return document.querySelector('downloads-manager').shadowRoot.querySelector('#downloadsList downloads-item').shadowRoot.querySelector('#progress').value");
                //System.out.println(percentage);
            }catch (Exception e) {
              // Nothing to do just wait
          }
            Thread.sleep(1000);
        }
       // get the latest downloaded file name
        String fileName = (String) js1.executeScript("return document.querySelector('downloads-manager').shadowRoot.querySelector('#downloadsList downloads-item').shadowRoot.querySelector('div#content #file-link').text");
       // get the latest downloaded file url
        String sourceURL = (String) js1.executeScript("return document.querySelector('downloads-manager').shadowRoot.querySelector('#downloadsList downloads-item').shadowRoot.querySelector('div#content #file-link').href");
        // file downloaded location
        String donwloadedAt = (String) js1.executeScript("return document.querySelector('downloads-manager').shadowRoot.querySelector('#downloadsList downloads-item').shadowRoot.querySelector('div.is-active.focus-row-active #file-icon-wrapper img').src");
        System.out.println("Download deatils");
        System.out.println("File Name :-" + fileName);
        System.out.println("Donwloaded path :- " + donwloadedAt);
        System.out.println("Downloaded from url :- " + sourceURL);
       // print the details
        System.out.println(fileName);
        System.out.println(sourceURL);
       // close the downloads tab2
        driver.close();
       // switch back to main window
        driver.switchTo().window(mainWindow);
       // return fileName;
        
        Thread.sleep(3000);
        driver.navigate().to("http://telesales.bharatmatrimony.com/pa_import.php");
    	
	//	driver.get("http://telesales.bharatmatrimony.com/pa_import.php");
	//	driver.manage().window().maximize();
		Thread.sleep(3000);
		
	//  Choose BM r CBS -  Click Here	
		driver.findElement(By.xpath("(//a[contains(text(),' click here ')])[2]")).click();
		Thread.sleep(3000);
		
	//  Upload the File ( Path )	
		BaseTest.typeData(driver.findElement(By.xpath("//*[@id=\"myForm\"]/div[1]/input")), "C:\\Users\\amuthan\\Downloads\\"+fileName);
		Thread.sleep(3000);

	// Click - ( Upload) to UpLoad the File
	//	BaseTest.click(g.getUpload_button());
		Thread.sleep(3000);
	
	// Upload Status - Success or Failure	
		/* Status = driver.findElement(By.cssSelector("body > div > h2")).getText();
		System.out.println(Status);
		Thread.sleep(3000);*/
        
        
    }
	

	
	@AfterTest
	public void sms() throws Throwable {
		
		if (Status.equalsIgnoreCase("File uploaded successfully..!")) {
	//		BaseTest.sendVFSms1();
		} else {
			
	//		BaseTest.sendVFSms();

		}
		
driver.close();
	}
	
    
	}
    

    
	 

	
	
	
	
	
	

