package SprintTask;

import java.awt.Robot;
import java.util.List;

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

import com.pages.EditPIMethod;

import base.BaseTest;
import pom.cmlogin.EditPI_POM;
import pom.cmlogin.GothramPOM;

public class Prime extends BaseTest{
	
	
	
	
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
	public void edit_pI() throws Throwable {
		
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
		BaseTest.typeData(g.getMatriID(), "AGR461814");
		BaseTest.click(g.getPasswordClear());
		BaseTest.typeData(g.getPassword(), "cbstest1");
		//BaseTest.click(g.getLogin_btn())s;
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
		
		/////////////////////////////////////////////////////////////
/*		
		try {
			Thread.sleep(3000);
			driver.findElement(By.xpath("//a[contains(text(),'Upload Photo')]")).click();
			
			Thread.sleep(5000);
			driver.findElement(By.xpath("//div[contains(text(),'ADD PHOTO NOW')]")).click();
			
			Thread.sleep(5000);
			Runtime.getRuntime().exec("C:\\Users\\Amudhan-4430\\Downloads\\Sean_O'pry_Profile");
	
			Thread.sleep(5000);
			driver.findElement(By.xpath("//div[contains(text(),'ADD PHOTO NOW')]")).sendKeys("C:\\Users\\Amudhan-4430\\Downloads\\Sean_O'pry_Profile");
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
	*/	
		
		
		
		
		
		
		
		
		try {
			Thread.sleep(3000);
			BaseTest.click(driver.findElement(By.xpath("//a[contains(text(),'Skip >>')]")));
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
		
		
		//////////////////////
		
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
		
		driver.findElement(By.xpath("//*[@id=\"prime_div\"]/label/span/a[2]")).click();
		Thread.sleep(3000);
	/*	if (driver.findElement(By.xpath("//*[@id=\"prime_div\"]/label/span/a[2]")).isSelected()) {
			System.out.println("1");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"prime_div\"]/label/span/a[2]")).click();
			
		} else {
			
			System.err.println("2");

		}
		*/
		Thread.sleep(3000);
		try {
			String POP_UP = driver.findElement(By.id("prime_congratz_popup")).getText();
			System.out.println(POP_UP);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
		
		Thread.sleep(3000);

		List<WebElement> primeMem = driver.findElements(By.xpath("//span[@class='prime-tag ng-binding']"));
		System.out.println(primeMem.size());
		Thread.sleep(3000);
		
		if (primeMem.size()<1) {
			
			
			if (driver.findElement(By.xpath("//a[contains(text(),'Upload ID Proof')]")).isDisplayed()) {
				driver.findElement(By.xpath("//a[contains(text(),'Upload ID Proof')]")).sendKeys("C:\\Users\\Amudhan-4430\\Desktop\\Prime\\5");
			} else {
				
				System.out.println("  ");
			}
		
		for (int j = 1; j <=primeMem.size(); j++) {
			
		//	WebElement aaa = driver.findElement(By.id("ignorecrossbefore_"+(j-1)+""));
			
		//	int aa = "ignorecrossbefore_"+j-1+"";
			
			String ID = primeMem.get(j).getText();
			//System.out.println(ID);
			
			Thread.sleep(3000);
		//	String Prime_Tag = driver.findElement(By.xpath("//span[@class='prime-tag ng-binding']")).getText();
			System.out.println(ID +" in Listing ");
			
		}
		
		
		
		Thread.sleep(3000);
	//	driver.findElement(By.xpath("//div[contains(text(),'View all matches that are yet to be viewed in Regular mode')]")).click();
		
	 } else {
		 
		 Thread.sleep(3000);
			String No_prime = driver.findElement(By.xpath("//*[@id=\"serResArea\"]/div")).getText();
			System.out.println(No_prime);
		
		 Thread.sleep(3000);
		//	driver.findElement(By.xpath("//div[contains(text(),'View all matches in Regular mode that are yet to be viewed')]")).click();
		

	}
		
		
	
		
		
	}		
		

}
