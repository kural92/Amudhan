package SprintTask;

import java.awt.Robot;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.base.BaseTest;
import com.pages.EditPIMethod;

import pom.cmlogin.EditPI_POM;
import pom.cmlogin.GothramPOM;

public class Prime_SelfProfile extends BaseTest{
	
	
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
	public void primeCheck() throws Throwable {
		
		
		GothramPOM g = new GothramPOM(driver);
		EditPI_POM i = new EditPI_POM(driver);
		Actions acc = new Actions(driver);
		Robot r = new Robot();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		JavascriptExecutor js  = (JavascriptExecutor)driver;
		EditPIMethod pp = new EditPIMethod();
		
		
		driver.get("https://www.agarwalmatrimony.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		BaseTest.click(driver.findElement(By.id("loginbtn")));
		Thread.sleep(3000);
		BaseTest.click(g.getMatriID());
		BaseTest.typeData(g.getMatriID(), "AGR498388");
		BaseTest.click(g.getPasswordClear());
		BaseTest.typeData(g.getPassword(), "cbstest123");
		//BaseTest.click(g.getLogin_btn());
		BaseTest.click(driver.findElement(By.xpath("//*[@id=\"login_form_web\"]/div[4]/div[2]")));
		
		
		Thread.sleep(3000);
		try {
			
			WebElement ok = driver.findElement(By.xpath("//a[contains(text(),'OK')]"));
			if (ok.isDisplayed()) {
				Thread.sleep(3000);
				BaseTest.click(ok);
			} else {
				
				

			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		try {
			Thread.sleep(3000);
			BaseTest.click(driver.findElement(By.xpath("//a[contains(text(),'Skip')]")));
		} catch (Exception e) {
			// TODO: handle exception
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
		
		Thread.sleep(5000);
		try {
			Alert al = driver.switchTo().alert();
			al.accept();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		try {
			BaseTest.click(driver.findElement(By.xpath("//*[@id=\"strategicComm\"]/div/div[2]/a/img")));
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		Thread.sleep(5000);
		try {
			BaseTest.click(driver.findElement(By.xpath("//*[@id=\"special_offer_lightpic1\"]/div[1]/div/a/img")));
		} catch (Exception e2) {
			// TODO: handle exception
		}
		
		
		//////////////////////
		
		Thread.sleep(3000);
		try {
			Thread.sleep(3000);
			acc.moveToElement(driver.findElement(By.xpath("//*[@id=\"topnav-login-menu\"]/div[3]/div[2]/div[1]/a/img"))).build().perform();
		
			Thread.sleep(3000);
			acc.moveToElement(driver.findElement(By.xpath("//*[@id=\"topnav-login-menu\"]/div[3]/div[2]/div[1]/a/img"))).build().perform();
			
		} catch (Exception e) {
			Thread.sleep(3000);
			acc.moveToElement(driver.findElement(By.xpath("//*[@id=\"topnav-login-menu\"]/div[3]/div[2]/div[1]/a"))).build().perform();
		
			Thread.sleep(3000);
			acc.moveToElement(driver.findElement(By.xpath("//*[@id=\"topnav-login-menu\"]/div[3]/div[2]/div[1]/a"))).build().perform();
			
		}
		Thread.sleep(3000);
		String parent = driver.getWindowHandle();
		Thread.sleep(3000);
		acc.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Edit Profile')]"))).build().perform();
		
		
		
		Thread.sleep(3000);
		acc.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Edit Profile')]"))).build().perform();
		
		
		
		Thread.sleep(3000);
		acc.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Edit Profile')]"))).click().build().perform();
		
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'View my profile')]")).click();
		
		Thread.sleep(3000);
		try {
			
			Set<String> child = driver.getWindowHandles();
			
			for (String handle : child) {
				
				if (!parent.contains(handle)) {
					driver.switchTo().window(handle);
				}
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		Thread.sleep(3000);
try {
			
			Thread.sleep(3000);
			String PrimeTag = driver.findElement(By.xpath("//span[contains(text(),'PRIME')]")).getText();
			System.out.println("The Tag Name : " +PrimeTag);
		
			
			Thread.sleep(3000);
			if (PrimeTag.equals("PRIME")||PrimeTag.equals("PRIME+")) {
				System.err.println("The Member was Prime Member , he/she eligible to access the Prime benefits");
			}
			
			
		} catch (Exception e)  {
			System.err.println("The member is not Prime");
		}
		
/////////////////////////////////////////////////////////////////

		

	}
	
	
	
	
	
	
	

}
 