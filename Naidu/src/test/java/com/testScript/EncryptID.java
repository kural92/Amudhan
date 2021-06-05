package com.testScript;


import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.base.BaseTest;



public class EncryptID extends BaseTest{
	
/*	
	@BeforeSuite
	public void setUp() {
		// test=reports.startTest("Divorcee Negative Payment");
		// test.log(LogStatus.PASS, "Divorcee Negative Payment Test Started");
		System.setProperty("webdriver.gecko.driver", ".//Driver//geckodriver.exe");
	//	FirefoxDriver options = new ChromeOptions();
	//	options.addArguments("--disable-notifications");
		FirefoxDriver driver = new FirefoxDriver();

	}  */
	
	@Test(retryAnalyzer = FailedAll.class)
	public void php() throws Exception {
		
		System.setProperty("webdriver.gecko.driver", ".//Driver//geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		
		
		Thread.sleep(3000);
		//String Parent = driver.getWindowHandle();
		driver.navigate().to("https://www.w3schools.com/php/");
		//driver.get("https://www.w3schools.com/php/");
		String Parent = driver.getWindowHandle();
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		BaseTest.click(driver.findElement(By.xpath("//a[contains(text(),'Try it Yourself »')]")));
		
		Thread.sleep(3000);
		Set<String> Child = driver.getWindowHandles();
		for (String handle : Child) {
			
			if (!Parent.contains(handle)) {
				Thread.sleep(3000);
				driver.switchTo().window(handle);
			}
			
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
				"	$varCryptSaltFirst		= sha1(date('W').$varLoginSaltFirst.date('z'));\r\n" + 
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
		 driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div/div/div[6]/div[1]/div/div/div/div[5]/pre[11]")).click();
		
		 Thread.sleep(5000);
				driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div/div/div[6]/div[1]/div/div/div/div[5]/pre[11]")).sendKeys(Php);
		

		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[contains(text(),'Run »')]")).click();
		
		
		
	

		
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
