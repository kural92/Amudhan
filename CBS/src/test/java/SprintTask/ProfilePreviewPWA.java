package SprintTask;

import java.awt.Robot;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseTest;
import pom.cmlogin.SprintPomPwa;



public class ProfilePreviewPWA extends base.BaseTest{
	
	
	  private String reportDirectory = "reports";
	    private String reportFormat = "xml";
	    private String testName = "Untitled";
	    protected ChromeDriver driver = null;
	    String email = "super1.test2"+(Math.floor(Math.random()*1478)+"@gmail.com");
	    JavascriptExecutor jse = (JavascriptExecutor)driver;
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
	    public void testUntitled() throws InterruptedException, IOException, Throwable {
	    	
	    	Actions acc = new Actions(driver);
	    	Robot r = new Robot();
	    	WebDriverWait wait  = new WebDriverWait(driver, 30);
	    	JavascriptExecutor js = (JavascriptExecutor)driver;
	    	
	    	
	    		    	
	        SprintPomPwa p = new SprintPomPwa(driver);
	    	
	    	driver.get("https://mobilestage.agarwalmatrimony.com/#/login");
	    	driver.manage().window().maximize();
	    	
	    	
	    	Thread.sleep(4000);
	    	acc.moveToElement(p.getMatri_id());
	    	acc.click();
	    	acc.sendKeys("AGR47");
	    	acc.build().perform();
	        
	    	Thread.sleep(4000);	
	    	acc.moveToElement(p.getPassword());
	    	acc.click();
	    	acc.sendKeys("cbstest");
	    	acc.build().perform();
	        
	    	Thread.sleep(4000);
	     acc.moveToElement(p.getLogin_btn()).click().build().perform();
	      Thread.sleep(4000);
	 //       test.log(LogStatus.PASS, "Logged In Succesfully");
	  try {    
	      BaseTest.click(p.getIntermediate_close());
	      Thread.sleep(3000);
	  } catch (Exception e) {
		
	}
	  Thread.sleep(4000);	
  	js.executeScript("arguments[0].click();", p.getMenu_btn());
  	acc.moveToElement(p.getMenu_btn()).click().build().perform();
  	
  	 Thread.sleep(2000);
  	js.executeScript("arguments[0].click();", p.getMenu_btn());      
 
  	 Thread.sleep(4000);	
   	acc.moveToElement(p.getEdit_profile());
   	acc.click();
   	//acc.sendKeys("cbstest");
   	acc.build().perform(); 
	        
	    	
	    	   	
	    	

}
}