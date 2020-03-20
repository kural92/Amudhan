package com.testScripts;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.base.BaseTest;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.objectRepository.GamoogaPOM;

public class Gammoga_BM  extends BaseTest{
	
	
	String Status;
	String path = "C:\\Users\\amuthan\\eclipse-workspace\\Gammoga\\Data\\"+"Excel"+".xlsx";

	@BeforeSuite
	public void setUp() throws Throwable, IOException {
		// test=reports.startTest("Divorcee Negative Payment");
		// test.log(LogStatus.PASS, "Divorcee Negative Payment Test Started");
		/*System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\amuthan\\eclipse-workspace\\Gammoga\\Driver\\chromedriver.exe");
			ChromeOptions options = new ChromeOptions();  
			options.addArguments("--headless", "--disable-gpu", "--window-size=1920,1200","--ignore-certificate-errors");  
		 options.addArguments("--disable-dev-shm-usage");
		 options.addArguments("--remote-debugging-port=9222");
		driver = new ChromeDriver(options);  */
		
		
		/*FirefoxProfile profile = new FirefoxProfile();
		profile.setPreference("browser.download.folderList", 2);
		profile.setPreference("browser.download.dir", "C:\\Users\\amuthan\\eclipse-workspace\\Gammoga\\Data");
		profile.setPreference("browser.helperApps.neverAsk.saveToDisk", "application/vnd.ms-excel");
		
		FirefoxOptions options = new FirefoxOptions();
		options.addArguments("--headless");
	//	options.setProfile(profile);
		driver = new ChromeDriver(options);  */
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\amuthan\\eclipse-workspace\\Gammoga\\Driver\\chromedriver.exe");
		ChromeOptions lChromeOptions = new ChromeOptions();
		HashMap<String, Object> lChromePrefs = new HashMap<String, Object>();
		lChromePrefs.put("profile.default_content_settings.popups", 0);
		lChromePrefs.put("download.default_directory", path);
		lChromePrefs.put("browser.set_download_behavior", "{ behavior: 'allow' , downloadPath: '"+path+"'}");

	//	lChromeOptions.addArguments("--headless");
	//	lChromeOptions.addArguments("--disable-gpu");
		lChromeOptions.setExperimentalOption("prefs", lChromePrefs);
	       driver = new ChromeDriver(lChromeOptions);
              // driver.get("https://gamooga.com/user/login/?next=/manage/");
		
		
	
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
			
	// User Name		
			BaseTest.click(g.getUserName());
			BaseTest.typeData(g.getUserName(), BaseTest.getExcelData("Chat", 2, 1));
			Thread.sleep(3000);
			
	// Password		
			BaseTest.click(g.getPassWord());
			BaseTest.typeData(g.getPassWord(), BaseTest.getExcelData("Chat", 2, 2));
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
	
	// Click - Chat Transcripts
	BaseTest.click(g.getChat_Transcits());
	Thread.sleep(5000);
	
	
	////    DAte Value Chooser
	
	BaseTest.click(g.getDatePicker_From());
	Thread.sleep(3000);
	
	
	BaseTest.select_text(g.getDate_Hour_To(), "Noon");
	Thread.sleep(3000);
	
//////	To Time Choosing ( Noon )
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
	System.out.println("Download CLicked");
	

        // Store the current window handle
        String mainWindow = driver.getWindowHandle();
   //     Thread.sleep(120000);
        // open a new tab     
        js.executeScript("window.open()");
       // switch to new tab
      // Switch to new window opened
        for(String winHandle : driver.getWindowHandles()){
            driver.switchTo().window(winHandle);
        }
       //navigate to chrome downloads
       driver.get("about:downloads");
    /*    
      Robot rob  = new Robot();
      rob.keyPress(KeyEvent.VK_DOWN);
      rob.keyRelease(KeyEvent.VK_DOWN);
      
      TakesScreenshot screenshot = (TakesScreenshot) driver;
		File src = screenshot.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File(
				"C:\\Users\\amuthan\\eclipse-workspace\\Gammoga\\ScreenShot\\" + "SAmple1"+ ".png"));
		System.out.println("Successfully captured a screenshot");
      
      Thread.sleep(2000);
      rob.keyPress(KeyEvent.VK_ENTER);
      rob.keyRelease(KeyEvent.VK_ENTER);
      
      
      File src1 = screenshot.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src1, new File(
				"C:\\Users\\amuthan\\eclipse-workspace\\Gammoga\\ScreenShot\\" + "SAmple"+ ".png"));
		System.out.println("Successfully captured a screenshot");
*/
		
		
		
		
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
        
       // Thread.sleep(60000);
        
        TakesScreenshot screenshot1 = (TakesScreenshot) driver;
		File src1 = screenshot1.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src1, new File(
				"C:\\Users\\amuthan\\eclipse-workspace\\Gammoga\\ScreenShot\\" + "Samplee"+ ".png"));
		System.out.println("Successfully captured a screenshot");
		
		
       // get the latest downloaded file name
        String fileName = (String) js1.executeScript("return document.querySelector('downloads-manager').shadowRoot.querySelector('#downloadsList downloads-item').shadowRoot.querySelector('div#content #file-link').text");
        System.out.println("Download deatils");
        System.out.println("File Name :-" + fileName);
       
		File src = screenshot1.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File(
				"C:\\Users\\amuthan\\eclipse-workspace\\Gammoga\\ScreenShot\\" + "SAmple1"+ ".png"));
		System.out.println("Successfully captured a screenshot");
        // get the latest downloaded file url
        String sourceURL = (String) js1.executeScript("return document.querySelector('downloads-manager').shadowRoot.querySelector('#downloadsList downloads-item').shadowRoot.querySelector('div#content #file-link').href");
        System.out.println("Downloaded from url :- " + sourceURL);
        
       
        // file downloaded location
      //  String donwloadedAt = (String) js1.executeScript("return document.querySelector('downloads-manager').shadowRoot.querySelector('#downloadsList downloads-item').shadowRoot.querySelector('div.is-active.focus-row-active #file-icon-wrapper img').src");
      
   //     System.out.println("Donwloaded path :- " + donwloadedAt);
       
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
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
	//  CBS _ EXCEL _ CLICK	
		driver.findElement(By.xpath("(//a[contains(text(),' click here ')])[1]")).click();
		Thread.sleep(3000);
		
		
		BaseTest.typeData(driver.findElement(By.xpath("//*[@id=\"myForm\"]/div[1]/input")), "C:\\Users\\amuthan\\eclipse-workspace\\Gammoga\\Data\\Excel.xlsx\\"+fileName);
		Thread.sleep(3000);
		
	//	BaseTest.click(g.getUpload_button());
		Thread.sleep(3000);
        
	/*	Status = driver.findElement(By.cssSelector("body > div > h2")).getText();
		System.out.println(Status);
		Thread.sleep(3000);*/
        
    }

	
	/*@AfterTest
	public void sms(ITestResult result) throws Throwable {
	
		
		
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File src = screenshot.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File(
				"C:\\Users\\amuthan\\eclipse-workspace\\CBS_1\\Screenshot\\" + result.getName() + ".png"));
		System.out.println("Successfully captured a screenshot");
		
		
		if (Status.equalsIgnoreCase("File uploaded successfully..!")) {
	//		BaseTest.sendVFSms2();
		} else {
			
	//		BaseTest.sendVFSms3();

		}
		

	}*/
	
	
	

    
	}
    

	
	


