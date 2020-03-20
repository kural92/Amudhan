package TestScriptss;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import base.BaseTest;
import pom.cmlogin.Inbox;

public class InboxTest extends BaseTest {
	
	WebDriver driver;
	
	@Test
	public void inBox() throws InterruptedException, AWTException {
		Inbox i = new Inbox(driver);
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\amuthan\\eclipse-workspace\\CBS\\Driver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);
		driver.get("https://www.communitymatrimony.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		//BaseTest.click(i.getMatriID());
		//BaseTest.typeData(i.getMatriID(), BaseTest.readValueFromExcelSheet().get(2).get("UserName"));
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/form/div[1]/input")).sendKeys("EZH710533");
		Thread.sleep(3000);
		driver.findElement(By.id("passwordClear1")).click();
	//	BaseTest.click(i.getPassclr());
		driver.findElement(By.id("password1")).sendKeys("cbstest");
		//BaseTest.typeData(i.getPassword(), BaseTest.readValueFromExcelSheet().get(2).get("PassWord"));
		
		Thread.sleep(3000);
		//BaseTest.click(i.getLoginbtn());
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		//intermediate Pages
		
		
		Thread.sleep(2000);
		/*try {
			WebElement suspendid = driver.findElement(By.xpath("//*[@class='nomsg mediumtxt  pad10 ']"));

			if (suspendid.isDisplayed()) {
				test.pass("This ID was Blocked/Suspended");
				break;
			}
		} catch (Exception e) {
			e.getMessage();
		}
		
		
		try {
			WebElement mobile_verify=driver.findElement(By.xpath("(//a[@class='linkb font13'])[2]"));
			
			if (mobile_verify.isDisplayed()) {
			test.pass("This ID need to verify Mobile Number");
				break;
				
			}
			
			
		} catch (Exception e) {
			e.getMessage();
		} */
		
		try {
			WebElement photo_add = driver.findElement(By.xpath("/html/body/div[2]/a"));
			if (photo_add.isDisplayed()) {
				photo_add.click();
				driver.findElement(By.xpath("//*[@id=\"conform\"]/div/div/div/a[1]")).click();
				driver.findElement(By.xpath("//*[@id=\"reason3\"]")).click();
				driver.findElement(By.xpath("//*[@id=\"skipphotoclick\"]")).click();
				
			}
			
		} catch (Exception e) {
			e.getMessage();
		}
		
		
		try {
			WebElement skip_matches = driver.findElement(By.xpath("//a[contains(text(),'Skip to Daily Matches >>')]"));
			if (skip_matches.isDisplayed()) {
				skip_matches.click();
				
			}
		} catch (Exception e) {
			e.getMessage();
		}
		
		try {
			WebElement element = driver.findElement(By.xpath("/html/body/div[1]/div[2]/a"));
			if (element.isDisplayed()) {
				element.click();
				
			}
		} catch (Exception e) {
			e.getMessage();
		}
		
		try {
			WebElement divorcee_intermediate_skip = driver.findElement(By.xpath("/html/body/div[1]/div/div[4]/a"));
			if (divorcee_intermediate_skip.isDisplayed()) {
				divorcee_intermediate_skip.click();
				
			}
		} catch (Exception e) {
			e.getMessage();
		}
		
		
		// AD Pages
		 
		 try {
			 driver.findElement(By.xpath("//*[@id=\"special_offer_lightpic1\"]/div[1]/div/a/img")).click();
		} catch (Exception e) {
			System.out.println("ADs Closed Successfully");
		}
		 
		 
		 //click inbox
		Thread.sleep(3000);
	     BaseTest.click(i.getInboxbtn());
	     //click pending interest
	     Thread.sleep(3000);
	     BaseTest.click(i.getPenInterst());
	     
	     //Accept interest
	     Thread.sleep(3000);
	     WebElement acceptinterest = driver.findElement(By.id("acceptdiv0"));
	     if (acceptinterest.isDisplayed()) {
			acceptinterest.click();
			String Accepted_Id = driver.findElement(By.id("delete_msg_val")).getText();
			System.out.println(Accepted_Id);
			
		driver.findElement(By.xpath("//*[@id=\"delete_confirm\"]/div/div/div/div[1]/div[2]/a")).click();
			
		} else {
            System.out.println("There is no Interest to Accept or Decline");
		}
	    
      
	}

}
