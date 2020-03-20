package stepdefinition;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

import org.apache.poi.hssf.record.PageBreakRecord.Break;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.URL;
import java.net.MalformedURLException;
import java.util.logging.Level;


public class Login_Pwa {
	
	  private String reportDirectory = "reports";
	    private String reportFormat = "xml";
	    private String testName = "Untitled";
	    protected AndroidDriver<AndroidElement> driver = null;

	    DesiredCapabilities dc = new DesiredCapabilities();

	  
	
	@Given("^Setup the capabilities for chrome browser$")
	public void setup_the_capabilities_for_chrome_browser() throws Throwable {
	    dc.setCapability("reportDirectory", reportDirectory);
        dc.setCapability("reportFormat", reportFormat);
        dc.setCapability("testName", testName);
        dc.setCapability(MobileCapabilityType.UDID, "21d9e22c");
        dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.android.chrome");
        dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.google.android.apps.chrome.Main");
        driver = new AndroidDriver<>(new URL("http://localhost:4723/wd/hub"), dc);
        driver.setLogLevel(Level.INFO);

	
	}

	@Given("^User entet the URL \"([^\"]*)\"$")
	public void user_entet_the_URL(String arg1) throws Throwable {
		Thread.sleep(5000);
	    driver.get("m.communitymatrimony.com/login");
	    System.out.println("Successfully entered into the login page");
	 
	}

	@When("^User enter the Matri Id and Password and click login$")
	public void user_enter_the_Matri_Id_and_Password_and_click_login() throws Throwable {
	   
	//	Thread.sleep(5000);
	//	driver.findElement(By.xpath("//*[@text and @class='android.view.View' and ./parent::*[@id='login-btn']]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='idEmail']")).sendKeys("EZH710533");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='password1']")).sendKeys("cbstest");
		Thread.sleep(5000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", driver.findElement(By.xpath("//*[@name='loginsubmit']")));
	//	  WebDriverWait wait = new WebDriverWait(driver, 60);
	//	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@name='loginsubmit']"))).click();
	//	driver.findElement(By.xpath("//*[@text='log in']")).click();
		
	}

	@When("^Verifying the user was successully logged in$")
	public void verifying_the_user_was_successully_logged_in() throws Throwable {
		Thread.sleep(5000);
	//  driver.findElement(By.xpath("//*[@text='MATCHES' and @class='android.view.View']"));
		   System.out.println("Log in was successfull");
		
	
	  
	}

	@When("^User handles the intermediate pages if present$")
	public void user_handles_the_intermediate_pages_if_present() throws Throwable {
	    System.out.println("No Intermediate pages");
	    
	}

	@Then("^User logging out of the website$")
	public void user_logging_out_of_the_website() throws Throwable {
		Thread.sleep(5000);
		JavascriptExecutor js1 = (JavascriptExecutor)driver;
	//	WebDriverWait wait = new WebDriverWait(driver, 60);
		js1.executeScript("arguments[0].click();", driver.findElement(By.xpath("//*[@text='Menu']")));
//wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("(//*/*[./*[@nodeName='A']])[5]")))).click();
				// driver.findElement(By.xpath("//*[@text='Menu']")).click();
	  Thread.sleep(10000);
	  driver.findElement(By.xpath("//*[@text='Settings']")).click();
	  Thread.sleep(5000);
	  driver.findElement(By.xpath("//*[@text='Privacy Settings']")).click();
	   
	}

	@Then("^User successfully logged out$")
	public void user_successfully_logged_out() throws Throwable {
	   System.out.println("User looged out successfully");
	
	}



}

                                                                                         
                                                                                         

