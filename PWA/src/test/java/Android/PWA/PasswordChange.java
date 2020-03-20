package Android.PWA;

import java.awt.AWTException;
import java.awt.Robot;
import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.Map;
import org.jsoup.Connection.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PasswordChange  extends BaseTest{
	
	 private String reportDirectory = "reports";
	    private String reportFormat = "xml";
	    private String testName = "Untitled";
	    protected WebDriver driver = null;

	  //  DesiredCapabilities dc = new DesiredCapabilities();
	    


	    
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
	    public void changePassWord() throws Throwable {


	    	ChangePassPom c = new ChangePassPom(driver);
	    	
	    	WebDriverWait wait = new WebDriverWait(driver, 30);
	    	Actions acc = new Actions(driver);
	    	Robot r  = new Robot();
	    	
	    	Thread.sleep(4000);
	    	driver.get("https://m.communitymatrimony.com/login");
	    	driver.manage().window().maximize();
	    	Thread.sleep(10000);
	     //   BaseTest.click(p.getLoginbutton());
	    	
	  
	    	Thread.sleep(4000);
	        BaseTest.typeData(c.getMatriid(), BaseTest.getExcelData("PassWord", 1, 1));
	        
	    	Thread.sleep(4000);	
	        BaseTest.typeData(c.getPassword(),BaseTest.getExcelData("PassWord", 1, 2));
	        
	    	Thread.sleep(4000);
	        BaseTest.click(c.getLoginbtn());
	        
	        Thread.sleep(10000);
	        BaseTest.click(c.getMenubtn());
	        
	        Thread.sleep(4000);
	        BaseTest.click(c.getMenu_settings());
	        
	        Thread.sleep(4000);
	        BaseTest.click(c.getChage_password());
	        
	        Thread.sleep(4000);
	        acc.moveToElement(c.getOld_password()).click().build().perform();
	        Thread.sleep(1000);
	        acc.sendKeys(BaseTest.getExcelData("PassWord", 1, 2));
	        
	     //   BaseTest.typeData(c.getOld_password(), BaseTest.getExcelData("PassWord", 1, 2));	    
	        
	        Thread.sleep(4000);
	        acc.moveToElement(c.getNew_password()).click().build().perform();
	        Thread.sleep(1000);
	        acc.sendKeys(BaseTest.getExcelData("PassWord", 1, 3));
	  //      BaseTest.typeData(c.getNew_password(), BaseTest.getExcelData("PassWord", 1, 3));
	        
	        Thread.sleep(4000);
	        acc.moveToElement(c.getConfirm_password()).click().build().perform();
	        Thread.sleep(1000);
	        acc.sendKeys(BaseTest.getExcelData("PassWord", 1, 3));
	 
	  //      BaseTest.typeData(c.getConfirm_password(), BaseTest.getExcelData("PassWord", 1, 3));
	        
	        Thread.sleep(4000);
	        BaseTest.click(c.getPass_submit());
	       
		}

}
