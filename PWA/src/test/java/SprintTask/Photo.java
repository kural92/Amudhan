package SprintTask;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import Android.PWA.BaseTest;
import Android.PWA.Pom;

public class Photo extends BaseTest{
	
	
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
	    public void loginPwa() throws InterruptedException, IOException {
	        Pom p= new Pom(driver);
	        JavascriptExecutor js = (JavascriptExecutor)driver;
	        
	        
	        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	        
	        test=reports.startTest("Android PWA Login Test");
	    	test.log(LogStatus.PASS, "Android PWA Login Test Started");
	    	
	    	driver.get("https://m.communitymatrimony.com/login");
	    	driver.manage().window().maximize();
	    	Thread.sleep(10000);
	     //   BaseTest.click(p.getLoginbutton());
	    	
	  
	    	Thread.sleep(4000);
	        BaseTest.typeData(p.getMatriid(),"EZH710533");
	        
	    	Thread.sleep(4000);	
	        BaseTest.typeData(p.getPassword(),"cbstest");
	        
	    	Thread.sleep(4000);
	        BaseTest.click(p.getLoginbtn());
	        
	        test.log(LogStatus.PASS, "Logged In Succesfully");
	        
	        
	        Thread.sleep(10000);
	       driver.findElement(By.xpath("(//span[contains(text(),'MATCHES')])[1]")).click();
	       
	     
	       
	       Thread.sleep(3000);
	       
	       List<WebElement> protect = driver.findElements(By.xpath("//ion-col[@class='paddb0 col']//following::img[@src='https://imgs.ezhavamatrimony.com/cbsimages/avatar_protectrequestmob_f.jpg']"));
	       System.err.println(protect.size());
	        

	       List<WebElement> total = driver.findElements(By.xpath("//ion-col[@class='paddb0 col']"));
	       System.err.println(total.size());
	        
	       
           Thread.sleep(2000);
           int offset = driver.manage().window().getSize().getHeight() / 2; // start from mid screen
           System.out.println(offset);
           double time = driver.manage().window().getSize().getHeight() * 0.3; // just an example
           System.out.println(time);
           Thread.sleep(2000);
           

           for (int i = 1; i <= 25; i++) {

        	   js.executeScript("window.scrollBy(\"DOWN\",200, 500)");
	       
	        
           Thread.sleep(3000);
	       
	       List<WebElement> request = driver.findElements(By.xpath("//img[@src='https://imgs.ezhavamatrimony.com/cbsimages/avatarfoto_requestmob_f.jpg']"));
	       System.err.println(request.size());
	        
	        
	   	}
		      
	        
	        
	    }
}
