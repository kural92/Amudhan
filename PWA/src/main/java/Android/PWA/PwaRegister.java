package Android.PWA;


	
	import io.appium.java_client.remote.AndroidMobileCapabilityType;
	import io.appium.java_client.android.AndroidDriver;
	import io.appium.java_client.android.AndroidElement;
	import io.appium.java_client.remote.MobileCapabilityType;

import org.apache.commons.io.FileUtils;
import org.apache.regexp.RE;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import java.net.URL;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

	public class PwaRegister extends BaseTest{
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
	    public void testUntitled() throws InterruptedException, IOException {
	    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    	Pom register = new Pom(driver);
	    	
	       test=reports.startTest("Android PWA Registration Test");
	      	test.log(LogStatus.PASS, "Android PWA Registration Test Started");
	    	
	    	driver.get("https://mobile.communitymatrimony.com/");
	    	driver.manage().window().maximize();
	    	 Thread.sleep(5000);
	         driver.findElement(By.id("COMMUNITY")).click();
	         JavascriptExecutor js = (JavascriptExecutor)driver;
	         js.executeScript("arguments[0].click();",  driver.findElement(By.id("COMMUNITY")));
	         
	         Thread.sleep(5000);
	         js.executeScript("arguments[0].click();",  driver.findElement(By.xpath("//li[contains(text(),'AhomMatrimony.com')]")));
	         
	         Thread.sleep(5000);
	         js.executeScript("arguments[0].click();",  driver.findElement(By.xpath("//*[@text='Self' and @nodeName='SPAN']")));
	    /*	BaseTest.click(register.getChoose_community());
	    	BaseTest.click(register.getCommunity_agarwal());
	    	BaseTest.click(register.getSelf());*/
	    	BaseTest.typeData(register.getNAME(),"Pooja Agarwal");
	  //  	driver.hideKeyboard();
	   // 	driver.swipe(0, 500, 0, 0, 1000);
	    	 Thread.sleep(5000);
	         js.executeScript("arguments[0].click();",  driver.findElement(By.xpath("//*[@text='Female' and @nodeName='SPAN']")));
	    	//BaseTest.click(register.getFemale());
	    //	BaseTest.click(register.getDob());
	         js.executeScript("arguments[0].click();",  driver.findElement(By.id("dobspan")));
	    	BaseTest.click(register.getSet_dob());//id-dw_set
	    	BaseTest.typeData(register.getReg_password(), "cbstest");//id-PASSWORD
	    //	driver.hideKeyboard();
	    //	driver.swipe(0, 800, 0, 0, 1000);
	    	BaseTest.click(register.getCountry_code());//id-ISDCode
	    	BaseTest.click(register.getCountry_code_usa());
	    	BaseTest.typeData(register.getMobile_number_reg(), "9889875"+Math.floor(Math.random()*998));//id-CONTACTNO
	    	BaseTest.click(register.getReleigion());
	    	BaseTest.click(register.getHindu_reg());
	    	BaseTest.click(register.getSubcaste_reg());
	    	BaseTest.click(register.getSubcaste_bisa_reg());
	    	BaseTest.click(register.getMother_tongue()); //id-MOTHERTONGUE
	    	BaseTest.click(register.getMother_tongue_bengali());
	    	BaseTest.click(register.getReg_continue());//id-continuebutton
	    	
	    	test.log(LogStatus.PASS, "Registration Page 1 commpleted successfully");
//	    	try {
//				AndroidElement save_password = driver.findElement(By.xpath("//*[@text='Never']"));
//				if (save_password.isDisplayed()) {
//					save_password.click();
//					
//				}
//			} catch (Exception e) {
//				e.getMessage();
//			}
	    	
	    	
	    	Thread.sleep(4000);
	    	BaseTest.click(register.getReg_unmarried());
	    	BaseTest.typeData(register.getReg_email(), email);
	    	BaseTest.click(register.getReg_country());
	    	BaseTest.click(register.getReg_coubry_india());
	  //  	driver.swipe(0, 800, 0, 0, 1000);
	    	BaseTest.click(register.getReg_residing_state());
	    	BaseTest.click(register.getReg_residing_sate_delhi());
	    	BaseTest.click(register.getReg_residing_city());
	    	BaseTest.click(register.getReg_residingcity_guargon());
	    	
	    	try {
	    		BaseTest.click(register.getRegpge2_continue());
			} catch (Exception e) {
				e.getMessage();
			}
	    	test.log(LogStatus.PASS, "Registration Page 2 commpleted successfully");
	    	
	    	Thread.sleep(4000);
	    	BaseTest.click(register.getReg_height());
	       BaseTest.click(register.getReg_height_4ft());
	    //	driver.findElement(By.xpath("(((//*[@class='android.view.View' and ./parent::*[@text='Agarwal Matrimony Mobile']]/*[@class='android.view.View'])[3]/*/*[@class='android.view.View' and")).click();
	       // jse.executeScript("scroll(0, 15);");
	    	//jse.executeScript("window.scrollBy(0,250)", "5 ft 4 in / 162 cm");
       //    driver.swipe(0, 600, 0, 0, 1000);
	    //	AndroidElement height = driver.findElement(By.xpath("//*[@css='DIV.dwwol']"));
	    	//jse.executeScript("arguments[0].scrollIntoView(true)",height);
          //  BaseTest.click(register.getReg_heigth_5ft4inc());
	        BaseTest.click(register.getReg_height_set());
	        BaseTest.click(register.getReg_physical_normal());
	        BaseTest.click(register.getReg_education());
	        BaseTest.click(register.getReg_education_degree());
	        BaseTest.click(register.getReg_private());
	    //    driver.swipe(0, 900, 0, 0, 100);
	        BaseTest.click(register.getReg_occupation());
	        BaseTest.click(register.getReg_oc_manager());
	        BaseTest.click(register.getReg_income());
	        BaseTest.click(register.getReg_income_amount());
	   //     driver.swipe(0, 900, 0, 0, 1000);
	        BaseTest.click(register.getReg_family_status());
	        BaseTest.click(register.getReg_familytype());
	        BaseTest.click(register.getReg_familyvalues());
	        BaseTest.click(register.getRegpage3_continue());
	    	test.log(LogStatus.PASS, "Registration Page 3 commpleted successfully");
	        
	        BaseTest.click(register.getRegpage4_star());
	        BaseTest.click(register.getRegpage4_star_Baharani());
	        BaseTest.click(register.getRegpage4_RAASI());
	        BaseTest.click(register.getRegpage4_RAASI_kumbam());
	      //  BaseTest.click(register.getRegpage4_Gothra());
	  //      driver.swipe(0, 900, 0, 0, 1000);
	        BaseTest.click(register.getRegpage4_Dosham_NO());
	        BaseTest.click(register.getRegpage4_Birth_state());
	        BaseTest.click(register.getGetRegpage4_Birth_stateDelhi());
	 //       driver.swipe(0, 900, 0, 0, 1000);
	        BaseTest.click(register.getGetRegpage4_Birth_city());
	        BaseTest.click(register.getGetRegpage4_Birth_cityDelhi());
	        BaseTest.click(register.getGetRegpage4_Continue());
	        
	    	test.log(LogStatus.PASS, "Registration Page 4 commpleted successfully");
	        
	        String ID = driver.findElement(By.xpath("//*[@id='confirm-txt' and @nodeName='DIV']")).getText();
	        String MatriID = ID.substring(0, 25);
	        System.out.println(MatriID);
	        test.log(LogStatus.PASS, "The Registered MatriID was : " + MatriID);
	    	test.log(LogStatus.PASS, "Registration commpleted successfully");
	    	   Thread.sleep(4000);	
	           String path= "D:\\Android HTML Report\\PWA Payment Screen Shot\\"+ Math.floor(Math.random() * 143)+"negativePayment.png";
	       	TakesScreenshot tk = (TakesScreenshot)driver;
	       	File source= tk.getScreenshotAs(OutputType.FILE);
	       	File destini = new File(path);
	   		FileUtils.copyFile(source, destini);
	    	
	       /* 
	        BaseTest.click(register.getBrowsermenu());
	        BaseTest.click(register.getHistory());
	        BaseTest.click(register.getClear_browser_history());
	        BaseTest.click(register.getClear_data());
	        BaseTest.click(register.getClear_confirm());*/
	        try {
				driver.findElement(By.xpath("//*[@id='close_menu_id']")).click();
			} catch (Exception e) {
				e.getMessage();
			}
	        test.log(LogStatus.PASS, "Android PWA Registration Test Completed Successfully");
	    }

    @AfterTest
	    public void tearDown() {
    /*	driver.quit();
        test.log(LogStatus.PASS, "Application Closed Succesfull");
        reports.endTest(test);
        reports.flush();
     	reports.close();*/

	}
	}


