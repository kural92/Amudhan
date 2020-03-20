package SprintTask;

import static org.testng.Assert.assertEquals;

import java.awt.Robot;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;import com.thoughtworks.selenium.webdriven.commands.GetAttribute;

import base.BaseTest;
import pom.cmlogin.SprintPomPwa;

public class SafeMatrimony extends BaseTest {
	

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
	   /* 	
	    	driver.get("https://www.communitymatrimony.com/safematrimony/");
	    	driver.manage().window().maximize();
	    	
	    	
	    	Thread.sleep(4000);
	    	acc.moveToElement(p.getMatri_id());
	    	acc.click();
	    	acc.sendKeys("BRH13");
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
	 
	 WebElement menu = driver.findElement(By.xpath("//ion-row[not(@hidden)]//span[@class='ficon icon-menu']"));
	 
	js.executeScript("arguments[0].checked = true;", menu);
//	acc.moveToElement(menu).click().build().perform();
	//acc.doubleClick(menu).build().perform();

	  
	  Thread.sleep(3000);
	  WebElement match = driver.findElement(By.xpath("//span[contains(text(),'MATCHES')]"));
	  js.executeScript("arguments[0].checked = true;", match);
	  
	  Thread.sleep(4000);
	  
	  List<WebElement> safe = driver.findElements(By.xpath("//span[@class='ficon icon-down-arrow font12']"));
	  int a = safe.size();
	  System.out.println("Profile Count : "+a);
	  
	  
	  Thread.sleep(3000);
	  
	  List<WebElement> profile = driver.findElements(By.xpath("/html/body/ion-app/ng-component/page-matches/ion-content/div[2]/ion-list/ion-row"));
	  int b = profile.size();
	  
	*/
	        
	        
	        
	        
	        
	        driver.get("https://www.communitymatrimony.com/safematrimony/");
	        driver.manage().window().maximize();
	        Thread.sleep(3000);
	///////////////        		
	        
	        BaseTest.click(driver.findElement(By.xpath("//span[contains(text(),'Menu ')]")));
	        Thread.sleep(3000);
	        
	        String a = driver.findElement(By.id("topnav-login-menu")).getText();
	        System.out.println(a);
	        
////////////////	        
	        String Home = driver.findElement(By.xpath("//*[@id=\"topnav-login-menu\"]/li[1]")).getText();
	       // assert.assertEquals(a, "HOME");
	        assertEquals(Home,"HOME");
	     
	/////////////////        
	        String identify = driver.findElement(By.xpath("//*[@id=\"topnav-login-menu\"]/li[2]")).getText();
	        assertEquals(identify,"HOW TO IDENTIFY FRAUDSTERS");
	        
////////////////	        
	        String Media = driver.findElement(By.xpath("//*[@id=\"topnav-login-menu\"]/li[3]")).getText();
	        assertEquals(Media,"FEW MEDIA REPORTS");
///////////////	        
	        String Report = driver.findElement(By.xpath("//*[@id=\"topnav-login-menu\"]/li[4]")).getText();
	        assertEquals(Report,"REPORT ABUSE");
//////////////////	        
	        String Contact = driver.findElement(By.xpath("//*[@id=\"topnav-login-menu\"]/li[5]")).getText();
	        assertEquals(Contact,"CONTACT POLICE");
/////////////////	        
	        String GRIEVANCE = driver.findElement(By.xpath("//*[@id=\"topnav-login-menu\"]/li[6]")).getText();
	        assertEquals(GRIEVANCE, "GRIEVANCE");
	        
///////////	        
	        Thread.sleep(5000);
	        
	        BaseTest.click(driver.findElement(By.xpath("//*[@id=\"topnav-login-menu\"]/li[1]")));
	        Thread.sleep(1000);
	        
	        String HOme_Content = driver.findElement(By.xpath("//*[@id=\"safe-home\"]/div[1]/div")).getText();
	        System.out.println(HOme_Content);
	        Thread.sleep(3000);
	        
	        
	        if (driver.findElement(By.xpath("//*[@id=\"safe-matri\"]/div/div[2]/div[2]/div")).isDisplayed()) {
	        	
	        	
	        	String aa = driver.findElement(By.xpath("//*[@id=\"safe-matri\"]/div/div[2]/div[2]/p")).getText();
	        	assertEquals(aa, "Your information will be kept confidential.");
	        	Thread.sleep(2000);
	        	
	        	WebElement Name = driver.findElement(By.xpath("//input[@name='name']"));
	        	BaseTest.click(Name);
	        	BaseTest.typeData(Name, "TestName");
	        	
	        	Thread.sleep(3000);
	        	
	//////////////////               	
	        	WebElement Email = driver.findElement(By.xpath("//input[@name='email']"));
	        	BaseTest.click(Email);
	        	BaseTest.typeData(Email, "Testmail@safematrimony.com");
	        	
	        	Thread.sleep(3000);
	        	
	        	
	    /////////////////////
	        	
	        	
	        	WebElement Mobile = driver.findElement(By.id("mobile-no"));
	        	BaseTest.click(Mobile);
	        	BaseTest.typeData(Mobile, "8889777799");
	        	
	        	Thread.sleep(3000);
	        	
	//////////////////////
	        	
	        	WebElement Details = driver.findElement(By.xpath("//textarea[@name='details']"));
	        	BaseTest.click(Details);
	        	BaseTest.typeData(Details, "Description about the Fraudsters");
	        	
	        	Thread.sleep(3000);
	        	
	        	
	//////////////captchaimg      
	        	
	        	WebElement Captcha = driver.findElement(By.id("captchaimg"));
	        	String capt = Captcha.getText();
	        	System.out.println(capt);
	        	
	        	WebElement Captchaa = driver.findElement(By.id("captcha"));
	        	BaseTest.click(Captchaa);
	        	driver.findElement(By.id("captcha")).sendKeys(capt);
	        	
	        	Thread.sleep(3000);
				
   ///////////////////
	        	
        	BaseTest.click(driver.findElement(By.id("reg-submit")));
	        	
			} else {

			}
	        
	        
	        
	  
	        
	        
///////////////////	        
	        BaseTest.click(driver.findElement(By.xpath("//span[contains(text(),'Menu ')]")));
	        Thread.sleep(3000);
	     
	        BaseTest.click(driver.findElement(By.xpath("//*[@id=\"topnav-login-menu\"]/li[2]")));
	        Thread.sleep(3000);
	        
	        String Identify_verification = driver.findElement(By.xpath("//*[@id=\"safe-matri\"]/div[1]/div[1]")).getText();
	        System.out.println(Identify_verification);
	        Thread.sleep(3000);
	        
	        
	        
	        
	        if (driver.findElement(By.xpath("//div[contains(text(),'Report a Fraud')]")).isDisplayed()) {
	        	
	        	
	        	String aa = driver.findElement(By.xpath("//*[@id=\"safe-matri\"]/div[2]/div[2]/p")).getText();
	        	assertEquals(aa, "Your information will be kept confidential.");
	        	Thread.sleep(2000);
	        	
	        	WebElement Name = driver.findElement(By.xpath("//input[@name='name']"));
	        	BaseTest.click(Name);
	        	BaseTest.typeData(Name, "TestName");
	        	
	        	Thread.sleep(3000);
	        	
	//////////////////               	
	        	WebElement Email = driver.findElement(By.xpath("//input[@name='email']"));
	        	BaseTest.click(Email);
	        	BaseTest.typeData(Email, "Testmail@safematrimony.com");
	        	
	        	Thread.sleep(3000);
	        	
	        	
	    /////////////////////
	        	
	        	
	        	WebElement Mobile = driver.findElement(By.id("mobile-no"));
	        	BaseTest.click(Mobile);
	        	BaseTest.typeData(Mobile, "8889777799");
	        	
	        	Thread.sleep(3000);
	        	
	//////////////////////
	        	
	        	WebElement Details = driver.findElement(By.xpath("//textarea[@name='details']"));
	        	BaseTest.click(Details);
	        	BaseTest.typeData(Details, "Description about the Fraudsters");
	        	
	        	Thread.sleep(3000);
	        	
	        	
	//////////////captchaimg      
	        	
	        	WebElement Captcha = driver.findElement(By.id("captchaimg"));
	        	String capt = Captcha.getText();
	        	System.out.println(capt);
	        	
	        	WebElement Captchaa = driver.findElement(By.id("captcha"));
	        	BaseTest.click(Captchaa);
	        	driver.findElement(By.id("captcha")).sendKeys(capt);
	        	
	        	Thread.sleep(3000);
				
   ///////////////////
	        	
        	BaseTest.click(driver.findElement(By.id("reg-submit")));
	        	
			} else {

			}
	        
	        
	        
///////////////	        
	        BaseTest.click(driver.findElement(By.xpath("//span[contains(text(),'Menu ')]")));
	        Thread.sleep(3000);
	        
	        BaseTest.click(driver.findElement(By.xpath("//*[@id=\"topnav-login-menu\"]/li[3]")));
	        Thread.sleep(3000);
	        
	        String Few_media = driver.findElement(By.xpath("//*[@id=\"safe-matri\"]/div[1]/div[2]/div[2]/div[1]/span")).getText();
	        System.out.println(Few_media);
	        Thread.sleep(3000);
	        
	        
 if (driver.findElement(By.xpath("//div[contains(text(),'Report a Fraud')]")).isDisplayed()) {
	        	
	        	
	        	String aa = driver.findElement(By.xpath("//*[@id=\"safe-matri\"]/div[2]/div[2]/p")).getText();
	        	assertEquals(aa, "Your information will be kept confidential.");
	        	Thread.sleep(2000);
	        	
	        	WebElement Name = driver.findElement(By.xpath("//input[@name='name']"));
	        	BaseTest.click(Name);
	        	BaseTest.typeData(Name, "TestName");
	        	
	        	Thread.sleep(3000);
	        	
	//////////////////               	
	        	WebElement Email = driver.findElement(By.xpath("//input[@name='email']"));
	        	BaseTest.click(Email);
	        	BaseTest.typeData(Email, "Testmail@safematrimony.com");
	        	
	        	Thread.sleep(3000);
	        	
	        	
	    /////////////////////
	        	
	        	
	        	WebElement Mobile = driver.findElement(By.id("mobile-no"));
	        	BaseTest.click(Mobile);
	        	BaseTest.typeData(Mobile, "8889777799");
	        	
	        	Thread.sleep(3000);
	        	
	//////////////////////
	        	
	        	WebElement Details = driver.findElement(By.xpath("//textarea[@name='details']"));
	        	BaseTest.click(Details);
	        	BaseTest.typeData(Details, "Description about the Fraudsters");
	        	
	        	Thread.sleep(3000);
	        	
	        	
	//////////////captchaimg      
	        	
	        	WebElement Captcha = driver.findElement(By.id("captchaimg"));
	        	String capt = Captcha.getText();
	        	System.out.println(capt);
	        	
	        	WebElement Captchaa = driver.findElement(By.id("captcha"));
	        	BaseTest.click(Captchaa);
	        	driver.findElement(By.id("captcha")).sendKeys(capt);
	        	
	        	Thread.sleep(3000);
				
   ///////////////////
	        	
        	BaseTest.click(driver.findElement(By.id("reg-submit")));
	        	
			} else {

			}
	        
	        
	        
	        
////////////////	        
	        BaseTest.click(driver.findElement(By.xpath("//span[contains(text(),'Menu ')]")));
	        Thread.sleep(3000);
	        
	        BaseTest.click(driver.findElement(By.xpath("//*[@id=\"topnav-login-menu\"]/li[4]")));
	        Thread.sleep(3000);
	        
	        String Report_Abuse = driver.findElement(By.xpath("//*[@id=\"topnav-login-menu\"]/li[2]")).getText();
	        System.out.println(Report_Abuse);
	        Thread.sleep(3000);
	        
	        
	        
if (driver.findElement(By.xpath("//div[contains(text(),'Report a Fraud')]")).isDisplayed()) {
	        	
	        	
	        	String aa = driver.findElement(By.xpath("//*[@id=\"safe-matri\"]/div[2]/div[2]/p")).getText();
	        	assertEquals(aa, "Your information will be kept confidential.");
	        	Thread.sleep(2000);
	        	
	        	WebElement Name = driver.findElement(By.xpath("//input[@name='name']"));
	        	BaseTest.click(Name);
	        	BaseTest.typeData(Name, "TestName");
	        	
	        	Thread.sleep(3000);
	        	
	//////////////////               	
	        	WebElement Email = driver.findElement(By.xpath("//input[@name='email']"));
	        	BaseTest.click(Email);
	        	BaseTest.typeData(Email, "Testmail@safematrimony.com");
	        	
	        	Thread.sleep(3000);
	        	
	        	
	    /////////////////////
	        	
	        	
	        	WebElement Mobile = driver.findElement(By.id("mobile-no"));
	        	BaseTest.click(Mobile);
	        	BaseTest.typeData(Mobile, "8889777799");
	        	
	        	Thread.sleep(3000);
	        	
	//////////////////////
	        	
	        	WebElement Details = driver.findElement(By.xpath("//textarea[@name='details']"));
	        	BaseTest.click(Details);
	        	BaseTest.typeData(Details, "Description about the Fraudsters");
	        	
	        	Thread.sleep(3000);
	        	
	        	
	//////////////captchaimg      
	        	
	        	WebElement Captcha = driver.findElement(By.id("captchaimg"));
	        	String capt = Captcha.getText();
	        	System.out.println(capt);
	        	
	        	WebElement Captchaa = driver.findElement(By.id("captcha"));
	        	BaseTest.click(Captchaa);
	        	driver.findElement(By.id("captcha")).sendKeys(capt);
	        	
	        	Thread.sleep(3000);
				
   ///////////////////
	        	
        	BaseTest.click(driver.findElement(By.id("reg-submit")));
	        	
			} else {

			}
	        
	        
	        
	        
	        
//////////////	        
	        BaseTest.click(driver.findElement(By.xpath("//span[contains(text(),'Menu ')]")));
	        Thread.sleep(3000);
	        
	        BaseTest.click(driver.findElement(By.xpath("//*[@id=\"topnav-login-menu\"]/li[5]")));
	        Thread.sleep(3000);
	        
	        String Contact_pol = driver.findElement(By.xpath("//*[@id=\"topnav-login-menu\"]/li[2]")).getText();
	        System.out.println(Contact_pol);
	        Thread.sleep(3000);
	        
	        
	        
	        
if (driver.findElement(By.xpath("//div[contains(text(),'Report a Fraud')]")).isDisplayed()) {
	        	
	        	
	        	String aa = driver.findElement(By.xpath("//*[@id=\"safe-matri\"]/div[2]/div[2]/p")).getText();
	        	assertEquals(aa, "Your information will be kept confidential.");
	        	Thread.sleep(2000);
	        	
	        	WebElement Name = driver.findElement(By.xpath("//input[@name='name']"));
	        	BaseTest.click(Name);
	        	BaseTest.typeData(Name, "TestName");
	        	
	        	Thread.sleep(3000);
	        	
	//////////////////               	
	        	WebElement Email = driver.findElement(By.xpath("//input[@name='email']"));
	        	BaseTest.click(Email);
	        	BaseTest.typeData(Email, "Testmail@safematrimony.com");
	        	
	        	Thread.sleep(3000);
	        	
	        	
	    /////////////////////
	        	
	        	
	        	WebElement Mobile = driver.findElement(By.id("mobile-no"));
	        	BaseTest.click(Mobile);
	        	BaseTest.typeData(Mobile, "8889777799");
	        	
	        	Thread.sleep(3000);
	        	
	//////////////////////
	        	
	        	WebElement Details = driver.findElement(By.xpath("//textarea[@name='details']"));
	        	BaseTest.click(Details);
	        	BaseTest.typeData(Details, "Description about the Fraudsters");
	        	
	        	Thread.sleep(3000);
	        	
	        	
	//////////////captchaimg      
	        	
	        	WebElement Captcha = driver.findElement(By.id("captchaimg"));
	        	String capt = Captcha.getText();
	        	System.out.println(capt);
	        	
	        	WebElement Captchaa = driver.findElement(By.id("captcha"));
	        	BaseTest.click(Captchaa);
	        	driver.findElement(By.id("captcha")).sendKeys(capt);
	        	
	        	Thread.sleep(3000);
				
   ///////////////////
	        	
        	BaseTest.click(driver.findElement(By.id("reg-submit")));
	        	
			} else {

			}
	        
	        
	        
	        
	        
//////////////	/        
	        BaseTest.click(driver.findElement(By.xpath("//span[contains(text(),'Menu ')]")));
	        Thread.sleep(3000);
	        
	        BaseTest.click(driver.findElement(By.xpath("//*[@id=\"topnav-login-menu\"]/li[6]")));
	        Thread.sleep(3000);
	        
	        String grie = driver.findElement(By.xpath("//*[@id=\"topnav-login-menu\"]/li[2]")).getText();
	        System.out.println(grie);
	        Thread.sleep(3000);
	        
	
	        
   ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	        
	        //////////////    Contact police Link  /////////////////////
	        
	        
	        
	        BaseTest.click(driver.findElement(By.xpath("//span[contains(text(),'Menu ')]")));
	        Thread.sleep(3000);
	        
	        BaseTest.click(driver.findElement(By.xpath("//*[@id=\"topnav-login-menu\"]/li[5]")));
	        Thread.sleep(3000);
	        
	        System.out.println("Contcat Police Link Test");
	        System.out.println(3000);
	        
	        
	        List<WebElement> city_list = driver.findElements(By.xpath("//div[@class='safe-contact-list ']"));
	        int Count_of_city = city_list.size();
	        
	        for (int i = 0; i < Count_of_city; i++) {
	        	
	        	
	        	String City_Name = city_list.get(i).getText();
	        	System.out.println(City_Name);
	        	Thread.sleep(3000);
	        	
	        	BaseTest.click(city_list.get(i));
	        	Thread.sleep(4000);
	        	
	        	String parent = driver.getWindowHandle();
	      //  	System.out.println("Parent Window ID : " + parent);
	        	
	        	Set<String> child = driver.getWindowHandles();
	        	for (String handle : child) {
	        		
	        		if (!parent.contains(handle)) {
	        			
	        			driver.switchTo().window(handle);
	        			Thread.sleep(3000);
	        			
	        			System.out.println("WebSite of City Police : " +driver.getCurrentUrl());
	        			Thread.sleep(2000);
	        			
	        			driver.close();
	        			
						
					}
					
				}
	        
	         Thread.sleep(2000);
	         driver.switchTo().window(parent);
	         Thread.sleep(3000);
				
			}
	        
	  //////////////////////////////////////////////////////////////////////////////////////////////////////
	        
	          ////////////////////         GRIEVENCE    //////////////////////////////
	        
	        
	        
	        
	        Thread.sleep(3000);
	        BaseTest.click(driver.findElement(By.xpath("//span[contains(text(),'Menu ')]")));
	        Thread.sleep(3000);
	        
	        
	        BaseTest.click(driver.findElement(By.xpath("//*[@id=\"topnav-login-menu\"]/li[6]")));
	        Thread.sleep(3000);
	        
	        
	        
	    	WebElement Name = driver.findElement(By.xpath("//input[@name='name']"));
        	BaseTest.click(Name);
        	BaseTest.typeData(Name, "TestName");
        	
        	Thread.sleep(3000);
        	
//////////////////               	
        	WebElement Email = driver.findElement(By.xpath("//input[@name='email']"));
        	BaseTest.click(Email);
        	BaseTest.typeData(Email, "Testmail@safematrimony.com");
        	
        	Thread.sleep(3000);
        	
        	
    /////////////////////
        	
        	
        	WebElement Mobile = driver.findElement(By.id("mobile-no"));
        	BaseTest.click(Mobile);
        	BaseTest.typeData(Mobile, "8889777799");
        	
        	Thread.sleep(3000);
        	
//////////////////////
        	
        	
        	WebElement community = driver.findElement(By.id("myselect"));
        	BaseTest.select_index(community, 9);
        	
        	Thread.sleep(3000);
        	
        	List<WebElement> grieva = driver.findElements(By.xpath("//input[@type='checkbox']"));
        	
	        for (int i = 0; i < grieva.size(); i++) {
	        	Thread.sleep(3000);
	        	
	        	grieva.get(i).click();
					
	        }
	        
	        
	        
	        driver.findElement(By.xpath("//*[@id=\"register-form\"]/div/div[6]/div[2]/div/div/span[16]/input")).sendKeys(" * * * * * * ");
	        Thread.sleep(3000);
	        
	        
	        driver.findElement(By.xpath("//*[@id=\"register-form\"]/div/div[7]/div[2]/div/div/textarea")).sendKeys(" Description about Url ");
	        Thread.sleep(3000);
	        
	        driver.findElement(By.xpath("//*[@id=\"register-form\"]/div/div[8]/div[4]/button")).click();
	        
	        
	  
	  
	    }
}
