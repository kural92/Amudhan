package Android.PWA;

//package <set your test package>;
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

public class PwaSample {
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
      dc.setCapability(MobileCapabilityType.UDID, "21d9e22c");
      dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.android.chrome");
      dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.google.android.apps.chrome.Main");
      driver = new AndroidDriver<AndroidElement>(new URL("http://localhost:4723/wd/hub"), dc);
      driver.setLogLevel(Level.INFO);


  }

  @Test
  public void testUntitled() throws Exception {
      driver.get("https://m.communitymatrimony.com");
      
WebDriverWait wait = new WebDriverWait(driver, 90);
//wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("(//*[@class='ui-link'])[2]")))).click();
    //  driver.findElement(By.xpath("//*[@text='LOG IN']")).click();
      Thread.sleep(5000);
      JavascriptExecutor js = (JavascriptExecutor)driver;
      js.executeScript("arguments[0].click();", driver.findElement(By.xpath("(//*[@class='ui-link'])[2]")));
      
      Thread.sleep(5000);
      driver.findElement(By.id("idEmail")).sendKeys("ezh710533");
      
      Thread.sleep(5000);
      driver.findElement(By.id("password1")).sendKeys("cbstest");
      
      js.executeScript("arguments[0].click();", driver.findElement(By.id("login-button")));
      
      Thread.sleep(10000);
      try {
    	  driver.findElement(By.id("button2")).click();
      } catch (Exception e) {
		System.out.println("No notifications appears");
	}
      Thread.sleep(5000);
    //  driver.navigate().refresh();
     // Thread.sleep(5000);
      try {
    	  driver.findElement(By.xpath("//*[@id='infobar_close_button']")).click();
      } catch (Exception e) {
		System.out.println("No button");
	}
      Thread.sleep(5000);
     Actions A = new Actions(driver);
  //    WebElement a = driver.findElement(By.cssSelector("SPAN.ficon.icon-menu"));
   //  A.moveToElement(a).click(a);
   //  a.submit();
     wait.until(ExpectedConditions.elementToBeClickable((By.xpath("//*['SPAN.ficon.icon-menu']")))).click();
     // js.executeScript("arguments[0].click();", driver.findElement(By.xpath("//*[@css='SPAN.ficon.icon-menu']")));
   //  js.executeScript("arguments[0].hidden = true;", driver.findElement(By.xpath("//*[@css='SPAN.ficon.icon-menu']")));
      Thread.sleep(5000);
    // driver.findElement(By.xpath("//*[@text='Menu']//*[@css='SPAN.ficon.icon-menu']")).click();
  }

  @AfterTest
  public void tearDown() {
   //   driver.quit();
  }
}