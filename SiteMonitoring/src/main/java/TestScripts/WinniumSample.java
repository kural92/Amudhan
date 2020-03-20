package TestScripts;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WinniumSample {

	
	
	@Test
	public void winiumSample() throws InterruptedException, MalformedURLException {
		
		DesktopOptions option = new DesktopOptions();
		
		option.setApplicationPath("C:\\Program Files (x86)\\TunnelBear\\TunnelBear.exe");
		 
		 
		WiniumDriver driver = new WiniumDriver(new URL("http://localhost:9999"), option);
	 Thread.sleep(15000);
	 driver.findElement(By.id("vpnSwitch")).click();
		
		
	}
 
}
