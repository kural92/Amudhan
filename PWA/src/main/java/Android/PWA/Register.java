package Android.PWA;

import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.URL;
import java.net.MalformedURLException;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

public class Register {
  private String reportDirectory = "reports";
  private String reportFormat = "xml";
  private String testName = "Untitled";
  protected AndroidDriver<AndroidElement> driver = null;

  DesiredCapabilities dc = new DesiredCapabilities();
  
  @BeforeTest
  public void setUp() throws MalformedURLException {
	  dc.setCapability("reportDirectory", reportDirectory);
      dc.setCapability("reportFormat", reportFormat);
      dc.setCapability("testName", testName);
      dc.setCapability(MobileCapabilityType.UDID, "16e455170205");
      dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.android.chrome");
      dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.google.android.apps.chrome.Main");
      driver = new AndroidDriver<AndroidElement>(new URL("http://localhost:4723/wd/hub"), dc);
      driver.setLogLevel(Level.INFO);


  }

  @Test
  public void testUntitled() throws Exception {
      driver.get("https://m.communitymatrimony.com");
      
      Thread.sleep(5000);
      driver.findElement(By.id("COMMUNITY")).click();
      JavascriptExecutor js = (JavascriptExecutor)driver;
      js.executeScript("arguments[0].click();",  driver.findElement(By.id("COMMUNITY")));
      
      Thread.sleep(5000);
      js.executeScript("arguments[0].click();",  driver.findElement(By.xpath("//*[@text='AhomMatrimony.com']")));
      
      Thread.sleep(5000);
      js.executeScript("arguments[0].click();",  driver.findElement(By.xpath("//*[@text='Self' and @nodeName='SPAN']")));
      
      
  }
  
}