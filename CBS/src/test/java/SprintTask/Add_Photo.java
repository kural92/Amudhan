package SprintTask;

import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;

import com.base.BaseTest;

import pom.cmlogin.GothramPOM;

public class Add_Photo extends BaseTest {
	
	
	@Test
	public void photo_Upload() throws Throwable {
		
		System.setProperty("webdriver.chrome.driver",".//Driver//chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);
		
		
		GothramPOM g = new GothramPOM(driver);
		Actions acc = new Actions(driver);
		Robot r = new Robot();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		JavascriptExecutor js  = (JavascriptExecutor)driver;
		Screen sss = new Screen();
		

		Thread.sleep(3000);
		driver.get("https://www.communitymatrimony.com");
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		BaseTest.click(g.getMatriID());
		BaseTest.typeData(g.getMatriID(), "DVM3296097");
		
		Thread.sleep(1000);
		BaseTest.click(g.getPasswordClear());
		BaseTest.typeData(g.getPassword(), "cbstest");
		
		Thread.sleep(1000);
		BaseTest.click(g.getLogin_btn());
		
		try {
		Thread.sleep(3000);
		BaseTest.click(g.getInterMediate_page());
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		try {
			BaseTest.click(g.getInterMediate_page1());
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		try {
		Thread.sleep(3000);
		BaseTest.click(driver.findElement(By.xpath("//*[@id=\"special_offer_lightpic1\"]/div[1]/div/a/img")));
		} catch (Exception e) {
			
		}
		Thread.sleep(1000);
		try {
		acc.moveToElement(g.getMenu_btn()).build().perform();
		} catch (Exception e) {
			acc.moveToElement(g.getMenu_btn1()).build().perform();
		}
		
		
		Thread.sleep(1000);
		BaseTest.click(g.getEdit_Profile());
		
	
	
	
	
	
	}
	
	
	

}
