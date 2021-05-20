package SprintTask;


import java.awt.Robot;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.thoughtworks.selenium.webdriven.commands.KeyEvent;

import base.BaseTest;

public class EcryptedId extends BaseTest{
	
	
	@BeforeSuite
	public void setUp() {
		// test=reports.startTest("Divorcee Negative Payment");
		// test.log(LogStatus.PASS, "Divorcee Negative Payment Test Started");
		System.setProperty("webdriver.chrome.driver", ".//Driver//chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);

	}
	
	@Test
	public void php() throws Exception {
		
		
		Thread.sleep(3000);
		//String Parent = driver.getWindowHandle();
		driver.get("https://www.w3schools.com/php/phptryit.asp?filename=tryphp_compiler");
		String Parent = driver.getWindowHandle();
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
	//	BaseTest.click(driver.findElement(By.xpath("//a[contains(text(),'Try it Yourself »')]")));
		try {
		Thread.sleep(3000);
		Set<String> Child = driver.getWindowHandles();
		for (String handle : Child) {
			
			if (!Parent.contains(handle)) {
				Thread.sleep(3000);
				driver.switchTo().window(handle);
			}
			
		}
		} catch (Exception e) {
			// TODO: handle exception
		}
		Thread.sleep(3000);
		String MatriD = "AGR104152";
		String Php = "<?php\r\n" + 
				"$varLoginSaltFirst	=	'Ch9Ga0vAm67sGX7i3Ly35awhW2V0g19P';\r\n" + 
				"$varLoginSaltSecond	=	'4KDdCA8iqlp2Q68xvn46DH8AVTL0sAV7';\r\n" + 
				"$matriid = '"+MatriD+"';\r\n" + 
				"/** FUNCTION TO GENERATE TOKENID */\r\n" + 
				"generateTokenId();\r\n" + 
				" generateEncryptMatriId($matriid);\r\n" + 
				"function generateTokenId(){\r\n" + 
				"	global $varLoginSaltFirst,$varLoginSaltSecond;\r\n" + 
				"	\r\n" + 
				"	$varCryptSaltFirst= sha1(date('W').$varLoginSaltFirst.date('z'));\r\n" + 
				"	echo \"Token Id: \".sha1($varCryptSaltFirst.$varLoginSaltSecond);\r\n" + 
				"}\r\n" + 
				"\r\n" + 
				"/** FUNCTION TO GENERATE ENCRYPTID */\r\n" + 
				"function generateEncryptMatriId($matriid){\r\n" + 
				"	global $varLoginSaltFirst,$varLoginSaltSecond;\r\n" + 
				"	\r\n" + 
				"	$saltkey1 = sha1($matriid.$varLoginSaltFirst);\r\n" + 
				"	$saltkey2 = sha1($saltkey1.$matriid);\r\n" + 
				"	echo \"<br>Encrypt Id: \".sha1($varLoginSaltSecond.$saltkey2);\r\n" + 
				"}\r\n" + 
				"?>" ;
		
		
		Thread.sleep(5000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("document.getElementsByName('body')[0].setAttribute('type', 'text');");
		
		
		 Thread.sleep(5000);
		WebElement element =   driver.findElement(By.xpath("//*[@id=\"textareawrapper\"]/div"));
		
		jse.executeScript("arguments[0].click();", element);
		
		Thread.sleep(5000);
		element.sendKeys(Php);
			//	driver.findElement(By.id("codeForm")).sendKeys(Php);
		
   Thread.sleep(5000);
	//driver.findElement(By.xpath("//pre[@class=' CodeMirror-line ']//following::span[contains(text(),'\"My first PHP script!\"')]")).click();
	 Thread.sleep(5000);
	//	driver.findElement(By.xpath("//pre[@class=' CodeMirror-line ']//following::span[contains(text(),'\"My first PHP script!\"')]")).sendKeys(Php);
		
		
		
		Robot rr = new Robot();
		
		Thread.sleep(2000);
		rr.keyPress(java.awt.event.KeyEvent.VK_CONTROL);
		Thread.sleep(2000);
		rr.keyPress(java.awt.event.KeyEvent.VK_A);
		
		Thread.sleep(2000);
		rr.keyRelease(java.awt.event.KeyEvent.VK_A);
		Thread.sleep(2000);
		rr.keyRelease(java.awt.event.KeyEvent.VK_CONTROL);
		
		
		Thread.sleep(2000);
		rr.keyPress(java.awt.event.KeyEvent.VK_DELETE);
		Thread.sleep(2000);
		rr.keyRelease(java.awt.event.KeyEvent.VK_DELETE);
		
		
		
		Thread.sleep(5000);
	driver.findElement(By.xpath("//*[@id='textareawrapper']/div/div[6]/div[1]/div/div")).sendKeys(Php);
		
		
		   Thread.sleep(5000);
		   //  driver.findElement(By.xpath("//*[@id=\"textareawrapper\"]/div/div[6]")).click();
		  //		driver.findElement(By.xpath("//pre[@class=' CodeMirror-line ']//following::span[contains(text(),'\"My first PHP script!\"')]")).sendKeys(Php);
		  		
		  		
		Thread.sleep(3000);
	//	driver.findElement(By.xpath("//button[contains(text(),'Run »')]")).click();
		
		
		
		//Thread.sleep(10000);
		//driver.findElement(By.xpath("//*[@id=\"textareawrapper\"]/div/div[6]/div[1]/div/div/div/div[5]/pre[11]")).sendKeys(Php);
		Thread.sleep(3000);
	/*	if (driver.findElement(By.xpath("(//pre[@class=' CodeMirror-line '])[11]")).isDisplayed()) {
			
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//pre[@class=' CodeMirror-line '])[11]")).click();
			
		} else {

		//	driver.findElement(By.xpath("(//pre[@class=' CodeMirror-line '])[11]")).click();
		}
		
	*/	
		
	/*	Actions ACC = new Actions(driver);
		Thread.sleep(3000);
		ACC.moveToElement(driver.findElement(By.xpath("//textarea[contains(text(),'php')]"))).build().perform();
		
		Thread.sleep(3000);
		ACC.moveToElement(driver.findElement(By.xpath("//textarea[contains(text(),'php')]"))).click().build().perform();
		
		Thread.sleep(3000);
		ACC.moveToElement(driver.findElement(By.xpath("//textarea[contains(text(),'php')]"))).sendKeys(Php);
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//pre[@class=' CodeMirror-line '])[11]")).sendKeys(Php);
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[contains(text(),'Run »')]")).click();
		
	*/	
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[contains(text(),'Run »')]")).click();
		
		Thread.sleep(3000);
		String Encrypt = driver.findElement(By.id("iframeResult")).getText();
		
		System.out.println(Encrypt);
		
		String[] AA = Encrypt.split("Encrypt Id:");
		String Ab =  AA[1].toString();
		System.out.println(Ab);

	}

}
