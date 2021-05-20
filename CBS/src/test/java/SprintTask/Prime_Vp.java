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

import com.pages.EditPIMethod;

import base.BaseTest;
import pom.cmlogin.EditPI_POM;
import pom.cmlogin.GothramPOM;

public class Prime_Vp extends BaseTest{
	
	
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
		
		driver.findElement(By.xpath("//*[@id=\"prime_div\"]/label/span/a[2]")).click();
		Thread.sleep(3000);
		
		
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
		
		Thread.sleep(3000);
		BaseTest.click(driver.findElement(By.id("ignorecrossbefore_0")));
		
		
		Thread.sleep(3000);
		Set<String> child = driver.getWindowHandles();
		for (String handle : child) {
			
			if (!(parent.contains(handle))) {
				driver.switchTo().window(handle);
			}
			
		}
		
		Thread.sleep(2000);
		for (int j = 1; j <=Coun; j++) {
			// (//input[@id='oppmemberMatriId'])["+j+"]
			Thread.sleep(6000);
	 	String ID= driver.findElement(By.id("oppmemberMatriId")).getText();
		System.out.println(ID);
			
			Thread.sleep(3000);
			String Prime = driver.findElement(By.xpath("//span[contains(text(),'PRIME')]")).getText();
		//	System.out.println(Prime);
			
			Thread.sleep(3000);
			String Edu = driver.findElement(By.xpath("(//div[@class='edu-cap-icon padb10 font12 ng-scope'])["+j+"]")).getText();
		//	System.out.println(Edu);
			
		System.out.println(" : "+ Prime+" : "+Edu);	
			
			Thread.sleep(3000);
			WebElement Next_Link = driver.findElement(By.id("nxtproflink"));
			
			Thread.sleep(3000);
			try {
				
				js.executeScript("window.scrollBy(100,0)");
				//js.executeScript("arguments[0].scrollIntoView(fasle);", Next_Link);
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			Thread.sleep(3000);
			BaseTest.click(driver.findElement(By.xpath("(//i[@class='prof_downarrows'])["+j+"]")));
			Thread.sleep(5000);
			
			
		}
		
		
		
		
		
		
		
	}

}
