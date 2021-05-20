package SprintTask;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.pages.EditPIMethod;

import base.BaseTest;
import pom.cmlogin.EditPI_POM;
import pom.cmlogin.GothramPOM;

public class Prime_MailBox extends BaseTest{
	
	@BeforeSuite
	public void setUp() throws Throwable {
		// test=reports.startTest("Divorcee Negative Payment");
		// test.log(LogStatus.PASS, "Divorcee Negative Payment Test Started");
		System.setProperty("webdriver.chrome.driver", ".//Driver//chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);
		
		

		GothramPOM g = new GothramPOM(driver);
		EditPI_POM i = new EditPI_POM(driver);
		Actions acc = new Actions(driver);
		Robot r = new Robot();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		JavascriptExecutor js  = (JavascriptExecutor)driver;
		EditPIMethod pp = new EditPIMethod();
		pom.cmlogin.Prime pr = new pom.cmlogin.Prime();
		
		
		driver.get("https://www.communitymatrimony.com/");
		String ID = "AGR498388";
		String PassWord = "cbstest123";
		
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		try {
		BaseTest.click(driver.findElement(By.id("loginbtn")));
		Thread.sleep(3000);
		BaseTest.click(g.getMatriID());
		BaseTest.typeData(g.getMatriID(), ID);
		BaseTest.click(g.getPasswordClear());
		BaseTest.typeData(g.getPassword(), PassWord);
		//BaseTest.click(g.getLogin_btn())s;
		BaseTest.click(driver.findElement(By.xpath("//*[@id=\"login_form_web\"]/div[4]/div[2]")));
		} catch (Exception e) {
			
			Thread.sleep(3000);
			BaseTest.click(g.getMatriID());
			BaseTest.typeData(g.getMatriID(), ID);
			Thread.sleep(3000);
			BaseTest.click(g.getPasswordClear());
			BaseTest.typeData(g.getPassword(), PassWord);
			Thread.sleep(3000);
			BaseTest.click(driver.findElement(By.xpath("//input[@type='submit']")));
			
			
		}
		
		
		
		try {
			BaseTest.click(g.getInterMediate_page());
		} catch (Exception e2) {
			// TODO: handle exception
		}
		
		try {
			BaseTest.click(g.getInterMediate_page1());
		} catch (Exception e2) {
			// TODO: handle exception
		}
		
		
		
		
		try {
			Thread.sleep(3000);
			BaseTest.click(driver.findElement(By.xpath("//a[contains(text(),'Skip >>')]")));
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
	///////
		
			Thread.sleep(3000);
			try {
				driver.findElement(By.xpath("//*[@id=\"strategicComm\"]/div/div[2]/a/img")).click();
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			
			Thread.sleep(5000);
			try {
				BaseTest.click(driver.findElement(By.xpath("//*[@id=\"special_offer_lightpic1\"]/div[1]/div/a/img")));
			} catch (Exception e2) {
				// TODO: handle exception
			}
			

	}
	
	
	
	@Test(enabled = false)
	public void inBoxReceived_Intrest() throws Throwable {
		
		GothramPOM g = new GothramPOM(driver);
		EditPI_POM i = new EditPI_POM(driver);
		Actions acc = new Actions(driver);
		Robot r = new Robot();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		JavascriptExecutor js  = (JavascriptExecutor)driver;
		EditPIMethod pp = new EditPIMethod();
		pom.cmlogin.Prime pr = new pom.cmlogin.Prime();
		
/*		
		driver.get("https://www.communitymatrimony.com/");
		String ID = "AGR498388";
		String PassWord = "cbstest123";
		
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		try {
		BaseTest.click(driver.findElement(By.id("loginbtn")));
		Thread.sleep(3000);
		BaseTest.click(g.getMatriID());
		BaseTest.typeData(g.getMatriID(), ID);
		BaseTest.click(g.getPasswordClear());
		BaseTest.typeData(g.getPassword(), PassWord);
		//BaseTest.click(g.getLogin_btn())s;
		BaseTest.click(driver.findElement(By.xpath("//*[@id=\"login_form_web\"]/div[4]/div[2]")));
		} catch (Exception e) {
			
			Thread.sleep(3000);
			BaseTest.click(g.getMatriID());
			BaseTest.typeData(g.getMatriID(), ID);
			Thread.sleep(3000);
			BaseTest.click(g.getPasswordClear());
			BaseTest.typeData(g.getPassword(), PassWord);
			Thread.sleep(3000);
			BaseTest.click(driver.findElement(By.xpath("//input[@type='submit']")));
			
			
		}
		
		
		
		try {
			BaseTest.click(g.getInterMediate_page());
		} catch (Exception e2) {
			// TODO: handle exception
		}
		
		try {
			BaseTest.click(g.getInterMediate_page1());
		} catch (Exception e2) {
			// TODO: handle exception
		}
		
		
		
		
		try {
			Thread.sleep(3000);
			BaseTest.click(driver.findElement(By.xpath("//a[contains(text(),'Skip >>')]")));
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
	///////
		
			Thread.sleep(3000);
			try {
				driver.findElement(By.xpath("//*[@id=\"strategicComm\"]/div/div[2]/a/img")).click();
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			
			Thread.sleep(5000);
			try {
				BaseTest.click(driver.findElement(By.xpath("//*[@id=\"special_offer_lightpic1\"]/div[1]/div/a/img")));
			} catch (Exception e2) {
				// TODO: handle exception
			}
			
			////
			
*/			
			Thread.sleep(3000);
			acc.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Inbox ')]"))).build().perform();
			
			Thread.sleep(3000);
			BaseTest.click(driver.findElement(By.xpath("//a[contains(text(),'Inbox ')]")));
			
			Thread.sleep(3000);
			BaseTest.click(driver.findElement(By.id("prime-mbox")));
			
			Thread.sleep(3000);
			BaseTest.click(driver.findElement(By.id("prime-mbox")));
			
			Thread.sleep(3000);
			BaseTest.click(driver.findElement(By.id("RMPENDINGINT1")));
			
			Thread.sleep(3000);
			List<WebElement> Accept = driver.findElements(By.xpath("//div[contains(text(),'Accept')]"));
			System.out.println("Intrest Received Count : "+Accept.size());
			
			Thread.sleep(3000);
			List<WebElement> Decline =  driver.findElements(By.xpath("//span[contains(text(),'Decline ')]"));
			System.out.println("Decline CTA Profile : "+Decline.size());
			
		/*
		 * for (int j = 0; j <5 ; j++) {
		 * 
		 * System.out.println(j);
		 * 
		 * Thread.sleep(10000); js.executeAsyncScript("window.scrollBy(1,500)");
		 * 
		 * }
		 */
		
			Thread.sleep(3000);
			List<WebElement> prime = driver.findElements(By.xpath("//span[contains(text(),'PRIME')]"));
			System.out.println("Prime Profile : "+prime.size());
					
		try {
			
			
			Thread.sleep(3000);
			BaseTest.click(Accept.get(1));
			
			Thread.sleep(3000);
			String Acceptss = driver.findElement(By.id("delete_msg_val")).getText();
			System.out.println(Acceptss);
			
			Thread.sleep(3000);
			BaseTest.click(driver.findElement(By.xpath("//*[@id=\"delete_confirm\"]/div/div/div/div[1]/div[2]/a")));
			
		} catch (Exception e) {
			System.out.println("There is No Pending Intrest Request to Accept");
		}	
			
			
			
		
		try {
			Thread.sleep(3000);
    		BaseTest.click(Decline.get(0));
    		
    		Thread.sleep(3000);
    		BaseTest.click(driver.findElement(By.xpath("//a[contains(text(),'Confirm')]")));
    		
		} catch (Exception e) {
			System.out.println("There is No Pending Intrest Request to Decline");
		}	
			
		
		
		

	}
	
	
	
	
	@Test (enabled = false)
	public void inBOX_Reuest() throws AWTException, Throwable {
		
		
		GothramPOM g = new GothramPOM(driver);
		EditPI_POM i = new EditPI_POM(driver);
		Actions acc = new Actions(driver);
		Robot r = new Robot();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		JavascriptExecutor js  = (JavascriptExecutor)driver;
		EditPIMethod pp = new EditPIMethod();
		

		
		Thread.sleep(3000);
		acc.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Inbox ')]"))).build().perform();
		
		Thread.sleep(3000);
		BaseTest.click(driver.findElement(By.xpath("//a[contains(text(),'Inbox ')]")));
		
		Thread.sleep(3000);
		BaseTest.click(driver.findElement(By.id("prime-mbox")));
		
		Thread.sleep(3000);
		BaseTest.click(driver.findElement(By.id("prime-mbox")));
		
		Thread.sleep(3000);
		BaseTest.click(driver.findElement(By.id("RMPENDINGMSG1")));
		
		Thread.sleep(3000);
		List<WebElement> Reply = driver.findElements(By.xpath("//span[contains(text(),'Reply')]"));
		System.out.println(Reply.size());
	
		
		Thread.sleep(3000);
		List<WebElement> Decline = driver.findElements(By.xpath("//span[contains(text(),'Decline')]"));
		System.out.println(Decline.size());
		
		
		Thread.sleep(3000);
		BaseTest.click(Reply.get(0));
		
		Thread.sleep(3000);
		String TExt = driver.findElement(By.id("membertext")).getText();
		//System.out.println(TExt);
		
		String Name =  driver.findElement(By.xpath("//span[@id='membertext']//following::b")).getText();
		System.out.println(TExt+" : "+Name);
		
		Thread.sleep(3000);
		BaseTest.click(driver.findElement(By.xpath("//a[contains(text(),'Send')]")));
		
		Thread.sleep(3000);
		BaseTest.typeData(driver.findElement(By.xpath("//*[@id=\"txtval204648847\"]")), "Hi, I replied using Automation Script");
		
		
		Thread.sleep(3000);
		BaseTest.click(driver.findElement(By.xpath("//*[@id=\"replypopup\"]/div/div/div/div/div[1]/div[2]/a")));
		
		///////////////////////////////////////
		Thread.sleep(3000);
		BaseTest.click(Decline.get(1));

		Thread.sleep(3000);
		BaseTest.click(driver.findElement(By.xpath("//a[contains(text(),'Cancel')]")));
		
		
	}
	
	
	@Test
	public void chat_History() throws Throwable {
		
		GothramPOM g = new GothramPOM(driver);
		EditPI_POM i = new EditPI_POM(driver);
		Actions acc = new Actions(driver);
		Robot r = new Robot();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		JavascriptExecutor js  = (JavascriptExecutor)driver;
		EditPIMethod pp = new EditPIMethod();
		

		
		Thread.sleep(3000);
		acc.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Inbox ')]"))).build().perform();
		
		Thread.sleep(3000);
		BaseTest.click(driver.findElement(By.xpath("//a[contains(text(),'Inbox ')]")));
		
		Thread.sleep(3000);
		BaseTest.click(driver.findElement(By.id("prime-mbox")));
		
		Thread.sleep(3000);
		BaseTest.click(driver.findElement(By.id("prime-mbox")));
		
		Thread.sleep(3000);
		BaseTest.click(driver.findElement(By.id("CHAT_LEFT")));
		
		Thread.sleep(3000);
		List<WebElement> Click = driver.findElements(By.xpath("//a[contains(text(),'Click Here')]"));
		System.out.println(Click.size());
		
		Thread.sleep(3000);
		BaseTest.click(Click.get(0));
		
		Thread.sleep(3000);
		String Title =  driver.findElement(By.id("chat_title")).getText();
		System.out.println(Title);
		
		Thread.sleep(3000);
		String Conversation = driver.findElement(By.xpath("//*[@id=\"blockprofileaction\"]")).getText();
		System.out.println(Conversation);
		
		acc.moveToElement(driver.findElement(By.xpath("//*[@id=\"chat_confirm\"]/div/div/div/div/div[1]/div[3]/input"))).click().build().perform();
		
	}
	

}
