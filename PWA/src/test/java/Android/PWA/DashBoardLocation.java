package Android.PWA;

import java.awt.Robot;
import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DashBoardLocation extends BaseTest{
	
	

	 private String reportDirectory = "reports";
	    private String reportFormat = "xml";
	    private String testName = "Untitled";
	    protected ChromeDriver driver = null;
	    String email = "super1.test2"+(Math.floor(Math.random()*1478)+"@gmail.com");
	    JavascriptExecutor jse = (JavascriptExecutor)driver;
	    DesiredCapabilities dc = new DesiredCapabilities();
	    String location;
	    
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
	    public void preferredLocation() throws Throwable {
			
	    	
	    	Actions acc = new Actions(driver);
	    	Robot r = new Robot();
	    	WebDriverWait wait  = new WebDriverWait(driver, 30);
	    	JavascriptExecutor js = (JavascriptExecutor)driver;
	    	
	    	
	      DiscoverMatch d = new DiscoverMatch(driver);
	      
	      
	      
	    	
	    	driver.get("https://m.communitymatrimony.com/login");
	    	driver.manage().window().maximize();
	    	Thread.sleep(3000);
	    	try {
	    	BaseTest.click(driver.findElement(By.id("login-btn")));
	    	Thread.sleep(3000);
	    	} catch (Exception e) {
				// TODO: handle exception
			}	
	    	BaseTest.click(d.getMatriid());
	    	BaseTest.typeData(d.getMatriid(), "Brh1393126");
	    	Thread.sleep(3000);
	    	
	    	BaseTest.click(d.getPassword());
	    	BaseTest.typeData(d.getPassword(), "test4cbs");
	    	Thread.sleep(3000);
	    	
	    	BaseTest.click(d.getLoginbtn());
	    	Thread.sleep(10000);
	    	
	    	
	    	if (d.getDashboard().isDisplayed()) {
	    	 
	    		Thread.sleep(3000);
	    		
	    	
	    	
	    		
	    		js.executeScript("arguments[0].click();",driver.findElement(By.cssSelector("body > ion-app > ng-component > page-dashboard > ion-content > div.scroll-content > div:nth-child(4) > div > div")));
	    		
	    	  	Thread.sleep(3000);
	    	/*	if (d.getDashboard_discover_matches().isDisplayed()) {
	    		  	Thread.sleep(3000);
	    			BaseTest.click(d.getDashboard_Location());
					
				} else {
					System.out.println("Not Found");
				}*/
	    	  	
	    	  	acc.moveToElement(d.getDashboard_Location()).click().build().perform();
	    		
	    		
			} else {

			}
	    	
	    }

}
