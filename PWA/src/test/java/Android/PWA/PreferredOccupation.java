package Android.PWA;

import java.awt.Robot;
import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PreferredOccupation extends BaseTest {

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
	    	BaseTest.typeData(d.getMatriid(), "EZH710533");
	    	Thread.sleep(3000);
	    	
	    	BaseTest.click(d.getPassword());
	    	BaseTest.typeData(d.getPassword(), "cbstest");
	    	Thread.sleep(3000);
	    	
	    	BaseTest.click(d.getLoginbtn());
	    	Thread.sleep(10000);
	    	
	    	
	    	
	    	if (d.getPREFERRED_PROFESSION().isDisplayed()) {
			
	    	
	    	Thread.sleep(10000);
	    	BaseTest.click(d.getPREFERRED_PROFESSION());
	    	Thread.sleep(3000);
	    	
	    	
	    	////
	    	  String count = d.getDiscover_matches_count().getText();
	    	  System.out.println(count);
	    	
	    	  String[] split = count.split(" members");
	    	  String value = split[0].toString().trim();
	    	  
	    	  int Counts = Integer.parseInt(value);
	    	  System.out.println(Counts);
	    	
	    	  
	     	  Thread.sleep(3000);
	    	  List<WebElement> verify = driver.findElements(By.xpath("//ion-col[@class='paddb0 col']"));
	    	  System.out.println(verify);
	    	  
	    	 int verify1 = verify.size();
	    	 
	    	 double verify2 = (verify1/2);
	    	 
	    	 double verification = Math.ceil(verify2);
	    	 System.out.println(verification);
	    	 
	    	 if (Counts==verification) {
	    		 
	    		 System.out.println("count matches");
				
			} else {
				
				 System.out.println("count not matches");

			}
	    	
	    	
	    	Thread.sleep(3000);
	    	List<WebElement> chips= driver.findElements(By.xpath("//*[@id=\"menusegmentchip\"]/span/ion-segment-button"));
	    	System.out.println(chips.size());
	    	
	    	for (int i = 0; i < chips.size(); i++) {
	    		
	    		int a=i+1;
	    		
	    		  String count1 = d.getDiscover_matches_count().getText();
		    	  System.out.println(count1);
		    	
		    	  String[] split1 = count1.split(" members");
		    	  String value1 = split1[0].toString().trim();
		    	  
		    	  int Counts1 = Integer.parseInt(value1);
		    	  System.out.println(Counts1);
	    		
	    		driver.findElement(By.xpath("//*[@id=\"menusegmentchip\"]/span["+a+"]/ion-segment-button")).click();
	    		Thread.sleep(5000);
	    		
	    		location = driver.findElement(By.xpath("//*[@id=\"menusegmentchip\"]/span["+a+"]/ion-segment-button")).getText();
	    		System.out.println(location);
	    		
	    		
	    	 	  Thread.sleep(5000);
		    	  List<WebElement> verify11 = driver.findElements(By.xpath("//ion-col[@class='paddb0 col']"));
		    	  System.out.println(verify);
		    	  
		    	 int verify111 = verify11.size();
		    	 
		    	 double verify222 = (verify111/2);
		    	 
		    	 double verification1 = Math.ceil(verify222);
		    	 System.out.println(verification1);
		    	 
		    	 Thread.sleep(2000);
		    	 if (Counts1==verification1) {
		    		 
		    		 System.out.println("count matches"+"\n"+"\n"+"\n");
					
				} else {
					
					 System.out.println("count not matches"+"\n"+"\n"+"\n");

				}

				
			}
	    	
	    	
	    	 Thread.sleep(3000);
	    	 BaseTest.click(driver.findElement(By.xpath("//ion-col[@class='paddb0 col']")));
	    	 Thread.sleep(3000);
	    	 
	    	 
	    	 String Occupation_profile = driver.findElement(By.xpath("//ion-col[contains(text(),'Occupation ')]//following::ion-col[1]")).getText();
	    	 System.out.println(Occupation_profile);
	    	 
	    	 
	    	 if (location.contains(Occupation_profile)||location.equalsIgnoreCase(Occupation_profile)) {
	    		 
	    		 System.out.println("Matches"+"\n"+"\n"+"\n");
				
			} else {
				
				System.out.println("Not Matches"+"\n"+"\n"+"\n");

			}
	    	
	    	
	
	    	
		}  else {
			
			System.out.println("There is no Occupation Matches");

		}
 	
	    }

}

