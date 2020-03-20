package Android.PWA;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;
import com.thoughtworks.selenium.webdriven.commands.KeyEvent;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class PwaPayment extends BaseTest{
    private String reportDirectory = "reports";
    private String reportFormat = "xml";
    private String testName = "Untitled";
    protected ChromeDriver driver = null;

    DesiredCapabilities dc = new DesiredCapabilities();
    


    
    @BeforeTest
    public void setUp() throws MalformedURLException {

    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\amuthan\\eclipse-workspace\\PWA\\Driver\\chromedriver.exe");
   
    	HashMap<String, Object> deviceMetrics = new HashMap<String, Object>();

    	deviceMetrics.put("width", 360);

    	deviceMetrics.put("height", 640);

    	deviceMetrics.put("pixelRatio", 3.0);



    	Map<String, Object> mobileEmulation = new HashMap<String, Object>();

    	mobileEmulation.put("deviceMetrics", deviceMetrics);

    	mobileEmulation.put("userAgent", "Mozilla/5.0 (Linux; Android 4.2.1; en-us; Nexus 5 Build/JOP40D) AppleWebKit/535.19 (KHTML, like Gecko) Chrome/18.0.1025.166 Mobile Safari/535.19");

    	//mobileEmulation.put("deviceName", "Pixel 2");


    	ChromeOptions chromeOptions = new ChromeOptions();
    	chromeOptions.addArguments("--disable-notifications");
    	chromeOptions.setExperimentalOption("mobileEmulation", mobileEmulation);
    	driver = new ChromeDriver(chromeOptions);
    }

    @Test
    public void loginPwa() throws InterruptedException, IOException, Exception {
        Pom p= new Pom(driver);
      	Robot r = new Robot();
        
        test=reports.startTest("Android PWA Payment Test");
    	test.log(LogStatus.PASS, "Android PWA Payment Test Started");
    	
    	driver.get("https://m.communitymatrimony.com/login");
    	driver.manage().window().maximize();
    	//driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
    	Thread.sleep(4000);
  //      BaseTest.click(p.getLoginbutton());
    	
        test.log(LogStatus.PASS, "Logging In");
  
    	Thread.sleep(1000);

        BaseTest.typeData(p.getMatriid(),"EZH811385");
    	Thread.sleep(1000);
  
        BaseTest.typeData(p.getPassword(),"cbstest");
        
    	Thread.sleep(1000);
        BaseTest.click(p.getLoginbtn());
        
        test.log(LogStatus.PASS, "Login passed");
        
        Thread.sleep(10000);
        BaseTest.click(p.getMenubtn());
        
        Thread.sleep(1000);
        BaseTest.click(p.getUpgrade_now());
    
        
        Thread.sleep(1000);
       // BaseTest.click(p.getMemebrship_6month_pack());
        
        test.log(LogStatus.PASS, "Member ship Pack Clicked");
        
        Thread.sleep(4000);
      /*  try {
        	BaseTest.click(p.getHide_chat());
        	driver.findElementByXPath("//*[@nodeName='DIV' and @width>0 and ./*[@text='Need Help in Payment? Chat with us!!']]").click();
        	driver.findElementByXPath("//*[@text='▼' and @nodeName='DIV']").click();
		} catch (Exception e) {
			System.out.println("no button");
		}*/
       // BaseTest.click(p.getHide_chat());
        
     
        BaseTest.click(p.getPay_now_btn());
        Thread.sleep(4000);
      
        
        
        test.log(LogStatus.PASS, "Entering Card Details");
        
        Thread.sleep(4000);
        driver.switchTo().frame(1);
        
        try {
			driver.findElement(By.cssSelector("body > div > div.gmg_chat_online > textarea")).sendKeys("Using this for Testing Purpose . Please close the Chat");
			r.keyPress(java.awt.event.KeyEvent.VK_ENTER);
			r.keyRelease(java.awt.event.KeyEvent.VK_ENTER);
			BaseTest.click(p.getHide_chat());
		} catch (Exception e) {
			// TODO: handle exception
		}
        Thread.sleep(4000);
        driver.switchTo().defaultContent();
        Thread.sleep(10000);
        BaseTest.click(p.getDebit_credit_card());
        
        
      
       
        
        Thread.sleep(4000);
        BaseTest.typeData(p.getEnter_card_number(), "4111111111111111");
        Thread.sleep(4000);
      
        driver.switchTo().frame(1);
        
        try {
			driver.findElement(By.cssSelector("body > div > div.gmg_chat_online > textarea")).sendKeys("Using this for Testing Purpose . Please close the Chat");
			r.keyPress(java.awt.event.KeyEvent.VK_ENTER);
			r.keyRelease(java.awt.event.KeyEvent.VK_ENTER);
			BaseTest.click(p.getHide_chat());
		} catch (Exception e) {
			// TODO: handle exception
		}
        Thread.sleep(4000);
        driver.switchTo().defaultContent();
      
        
        Thread.sleep(4000);
        BaseTest.click(p.getEnter_expiry_date());
        Thread.sleep(4000);
       
        Thread.sleep(4000);
        BaseTest.click(p.getMonth_setter());
        /*   Thread.sleep(4000);
        try {
        	BaseTest.click(p.getHide_chat());
        	driver.findElementByXPath("//*[@nodeName='DIV' and @width>0 and ./*[@text='Need Help in Payment? Chat with us!!']]").click();
        	driver.findElementByXPath("//*[@text='▼' and @nodeName='DIV']").click();

		} catch (Exception e) {
			System.out.println("no button");
		}*/
        
        Thread.sleep(4000);
        BaseTest.typeData(p.getCvv(), "012");
        Thread.sleep(4000);
       
        
        Thread.sleep(4000);
        BaseTest.click(p.getPay_amount());
        
        test.log(LogStatus.PASS, "Payment In Progress ********");
        
       /* try {
			BaseTest.click(p.getCard_save_close());
		} catch (Exception e) {
			System.out.println("no button");
		}*/
        //Thread.sleep(4000);	
      /*  String path= "D:\\Android HTML Report\\PWA Payment Screen Shot\\"+ Math.floor(Math.random() * 143)+"negativePayment.png";
    	TakesScreenshot tk = (TakesScreenshot)driver;
    	File source= tk.getScreenshotAs(OutputType.FILE);
    	File destini = new File(path);
		FileUtils.copyFile(source, destini);	*/
    	
		test.log(LogStatus.PASS, "Payment Test Completed");
    }
    

    @AfterTest
    public void tearDown() {
    	//driver.resetApp();
      //  driver.quit();
        test.log(LogStatus.PASS, "Application Closed Succesfull");
        reports.endTest(test);
        reports.flush();
     	reports.close();
    }
}
