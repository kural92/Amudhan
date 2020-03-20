package stepdefinition;

import java.net.URL;
import java.util.logging.Level;

import org.omg.PortableServer.THREAD_POLICY_ID;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class Registartion {
	
	  private String reportDirectory = "reports";
	    private String reportFormat = "xml";
	    private String testName = "Untitled";
	    protected AndroidDriver<AndroidElement> driver = null;

	    DesiredCapabilities dc = new DesiredCapabilities();
	
	@Given("^Set Up the Mobile capabilities for Android$")
	public void set_Up_the_Mobile_capabilities_for_Android() throws Throwable {
		  dc.setCapability("reportDirectory", reportDirectory);
	        dc.setCapability("reportFormat", reportFormat);
	        dc.setCapability("testName", testName);
	        dc.setCapability(MobileCapabilityType.UDID, "21d9e22c");
	        dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.android.chrome");
	        dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.google.android.apps.chrome.Main");
	        driver = new AndroidDriver<>(new URL("http://localhost:4723/wd/hub"), dc);
	        driver.setLogLevel(Level.INFO);
	 
	}

	@Given("^Member enter the Url and landed in Registration Page (\\d+)$")
	public void member_enter_the_Url_and_landed_in_Registration_Page(int arg1) throws Throwable {
	   Thread.sleep(5000);
	   driver.get("m.communitymatrimony.com");
	   
	}

	@When("^Member started the registration process$")
	public void member_started_the_registration_process() throws Throwable {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='COMMUNITY']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@text='AgarwalMatrimony.com']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@text='Self']")).click();
	  
	}

	@When("^Member sucessfully completed the registartion page (\\d+) and satred to fill the deatils for Registartion page (\\d+)\\.$")
	public void member_sucessfully_completed_the_registartion_page_and_satred_to_fill_the_deatils_for_Registartion_page(int arg1, int arg2) throws Throwable {
	    
	  
	}

	@Then("^Member completd the regisatrion and Registered Matri ID was disaplayed$")
	public void member_completd_the_regisatrion_and_Registered_Matri_ID_was_disaplayed() throws Throwable {
	   
	  
	}

	@Then("^Member completed the registartion process$")
	public void member_completed_the_registartion_process() throws Throwable {
	  
	
	}


	
	

}
