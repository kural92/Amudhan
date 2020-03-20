package Scheduler;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Android.PWA.BaseTest;
import Android.PWA.Pom;

public class Login implements Job {
	
	  private String reportDirectory = "reports";
	    private String reportFormat = "xml";
	    private String testName = "Untitled";
	    protected WebDriver driver = null;

	  //  DesiredCapabilities dc = new DesiredCapabilities();
	    
      
	    

	    @Test
	    
public void execute(JobExecutionContext context) throws JobExecutionException{
	    	
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
	    public void loginPwa() throws InterruptedException, IOException {
	        Pom p= new Pom(driver);
	        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	        
	  //      test=reports.startTest("Android PWA Login Test");
	 //   	test.log(LogStatus.PASS, "Android PWA Login Test Started");
	    	
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
	        
	  //      test.log(LogStatus.PASS, "Logged In Succesfully");
	        
	        
	        Thread.sleep(10000);
	        BaseTest.click(p.getMenubtn());
	        
	        Thread.sleep(4000);	
	        String path= "D:\\Android HTML Report\\PWA Payment Screen Shot\\"+ Math.floor(Math.random() * 143)+"negativePayment.png";
	    	TakesScreenshot tk = (TakesScreenshot)driver;
	    	File source= tk.getScreenshotAs(OutputType.FILE);
	    	File destini = new File(path);
			FileUtils.copyFile(source, destini);	
	    	
		
	        
	        Thread.sleep(4000);
	        BaseTest.click(p.getSettinglog());
	        
	        Thread.sleep(4000);
	        BaseTest.click(p.getLogout());
	        
	   //     test.log(LogStatus.PASS, "Logged out successfully");
	        
	   // 	test.log(LogStatus.PASS, "Android PWA Login Test Completed");
	    }

	    @AfterTest
	    public void tearDown() {
	    
	    	    	//driver.resetApp();
	    	        driver.quit();
	    //	        test.log(LogStatus.PASS, "Application Closed Succesfull");
	    	//        reports.endTest(test);
	    	//        reports.flush();
	    	//     	reports.close();
	 

}




}
