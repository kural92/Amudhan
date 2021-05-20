package SprintTask;

import java.awt.Robot;
import java.util.List;
import java.util.Set;

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

public class Prime_Upgrade_Request extends BaseTest {
	
	
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
	public void prime_Upgrade() throws Throwable {
		
		
		GothramPOM g = new GothramPOM(driver);
		EditPI_POM i = new EditPI_POM(driver);
		Actions acc = new Actions(driver);
		Robot r = new Robot();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		JavascriptExecutor js  = (JavascriptExecutor)driver;
		EditPIMethod pp = new EditPIMethod();
		pom.cmlogin.Prime pr = new pom.cmlogin.Prime();
		
		
		driver.get("https://www.agarwalmatrimony.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		BaseTest.click(driver.findElement(By.id("loginbtn")));
		Thread.sleep(3000);
		BaseTest.click(g.getMatriID());
		BaseTest.typeData(g.getMatriID(), "AGR498388");
		BaseTest.click(g.getPasswordClear());
		BaseTest.typeData(g.getPassword(), "cbstest123");
		//BaseTest.click(g.getLogin_btn())s;
		BaseTest.click(driver.findElement(By.xpath("//*[@id=\"login_form_web\"]/div[4]/div[2]")));
		
		
		///
		
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
		
		/////////////////////////////////////
		
		///////////////////////////////////////////////////////////////////////
		
		
		//	Thread.sleep(3000);
			Thread.sleep(3000);
			acc.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Matches ')]"))).build().perform();
			
			Thread.sleep(3000);
			acc.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Matches ')]"))).build().perform();
			
			
			
			Thread.sleep(3000);
			acc.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Yet to be viewed')]"))).build().perform();
			
			
			
			Thread.sleep(3000);
			acc.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Yet to be viewed')]"))).click().build().perform();
			
			
			Thread.sleep(3000);
			acc.moveToElement(driver.findElement(By.xpath("//*[@id=\"prime_div\"]/label/span/a[2]"))).build().perform();
			
			
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"prime_div\"]/label/span/a[2]")).click();
			
			
			
			try {
			 
				BaseTest.click(pr.getExplore_Prime());
			 
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			
			Thread.sleep(10000);
			String parent = driver.getWindowHandle();
			
			WebElement Pr_co = driver.findElement(By.id("total_div"));
			String aaa = Pr_co.getText();
			System.err.println(aaa);
			
		//	String Co = pr.getProfile_Count().getText();
		//	System.err.println(Co);
			int Cou = Integer.parseInt(aaa);
			
			int Coun = (Cou/10);
		//	int Count = (int) Math.ceil(Coun);
			
			System.out.println(Coun);
			
			
		
		
		///////////////
			
			Thread.sleep(2000);
			for (int j = 1; j <=Coun; j++) {
				// (//input[@id='oppmemberMatriId'])["+j+"]
				Thread.sleep(6000);
				
				
				driver.navigate().refresh();
				
				Thread.sleep(10000);
				BaseTest.click(driver.findElement(By.id("ignorecrossbefore_0")));
				
				
				Thread.sleep(3000);
				Set<String> child = driver.getWindowHandles();
				for (String handle : child) {
					
					if (!(parent.contains(handle))) {
						driver.switchTo().window(handle);
					}
					
				}
			
				Thread.sleep(6000);
		 	String ID= driver.findElement(By.id("oppositeMemberId")).getText();
			System.out.println(ID);
				
			
			 Thread.sleep(2000);
				//driver.findElement(By.id("Close_pop")).click();
				
			//	System.out.println("Clicked On View Shortlist Icon and Got Upgrade Prime + Pop-up and same was Closed");
				
			Thread.sleep(3000);
			try {
				List<WebElement> Request = driver.findElements(By.xpath("//span[contains(text(),'Request for')]"));
				
				for (int k = 1; k <=Request.size(); k++) {
					
					Thread.sleep(3000);
					Request.get(k).click();
					
					 Thread.sleep(2000);
						driver.findElement(By.id("Close_pop")).click();
						
						System.out.println("Clicked On Request For and Got Upgrade Prime + Pop-up and same was Closed");
					
				}
				
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			
			
			Thread.sleep(2000);
			driver.close();
			
			Thread.sleep(3000);
			driver.switchTo().window(parent);
			
			
			Thread.sleep(3000);
			
			}
			
	}

}
