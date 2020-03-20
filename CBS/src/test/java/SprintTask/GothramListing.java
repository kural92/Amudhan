package SprintTask;

import java.awt.Robot;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import base.BaseTest;
import pom.cmlogin.GothramPOM;


public class GothramListing extends BaseTest{
	
	String PP_Gothram;
	String VP_Gothram;
	int k;
	int b=1;
	boolean status;
	@BeforeSuite
	public void setUp() {
		// test=reports.startTest("Divorcee Negative Payment");
		// test.log(LogStatus.PASS, "Divorcee Negative Payment Test Started");
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\amuthan\\eclipse-workspace\\CBS\\Driver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);
	
	}
	
	@Test(enabled=true)
public void yetToBeView() throws Throwable {
		
		
		GothramPOM g = new GothramPOM(driver);
		Actions acc = new Actions(driver);
		Robot r = new Robot();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		JavascriptExecutor js  = (JavascriptExecutor)driver;
		
		

		Thread.sleep(3000);
		driver.get("https://www.communitymatrimony.com");
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		BaseTest.click(g.getMatriID());
		BaseTest.typeData(g.getMatriID(), "BRH1393126");
		
		Thread.sleep(1000);
		BaseTest.click(g.getPasswordClear());
		BaseTest.typeData(g.getPassword(), "test4cbs");
		
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
			// TODO: handle exception
		}
		
		
		Thread.sleep(1000);
		try {
		acc.moveToElement(g.getMenu_btn()).build().perform();
		} catch (Exception e) {
			acc.moveToElement(g.getMenu_btn1()).build().perform();
		}
		
		
		Thread.sleep(1000);
		BaseTest.click(g.getEdit_Partner_Preference());
		
	
			Thread.sleep(3000);
			js.executeScript("window.scrollBy(0,350)");
		
		
		Thread.sleep(3000);
		if (g.getPP_Gothram_Value().isDisplayed()) {
			
			Thread.sleep(1000);
			PP_Gothram = g.getPP_Gothram_Value().getText();
			System.out.println("PP Gothram Value : "+PP_Gothram);
			

		
		
		Thread.sleep(3000);
		if (PP_Gothram.contains("All Except My Gothra(m)")) {
			
			driver.navigate().back();
			Thread.sleep(3000);
			
			Thread.sleep(1000);
			try {
			acc.moveToElement(g.getMenu_btn()).build().perform();
			} catch (Exception e) {
				acc.moveToElement(g.getMenu_btn1()).build().perform();
			}
			
			acc.moveToElement(g.getEdit_Profile()).click().build().perform();
			Thread.sleep(2000);
			
			Thread.sleep(3000);
			js.executeScript("window.scrollBy(0,350)");
			
			BaseTest.select_index(driver.findElement(By.id("gothram")), 6);
			Thread.sleep(2000);
			
			Thread.sleep(3000);
			js.executeScript("window.scrollBy(0,350)");
			
			BaseTest.click(driver.findElement(By.xpath("//input[@type='submit']")));
			Thread.sleep(2000);
			
			Thread.sleep(1000);
			try {
			acc.moveToElement(g.getMenu_btn()).build().perform();
			} catch (Exception e) {
				acc.moveToElement(g.getMenu_btn1()).build().perform();
			}
			
			Thread.sleep(1000);
			acc.moveToElement(g.getEdit_Partner_Preference()).click().build().perform();
			
			Thread.sleep(1000);
			String PI_Gothram = g.getPI_Gothram_Value().getText();
			System.out.println("PI Gothram Value : "+PI_Gothram);
			
			
			//****
			
			
			Thread.sleep(2000);
             acc.moveToElement(g.getMatches()).build().perform();
             
             Thread.sleep(2000);
             acc.moveToElement(g.getYet_To_Be_Viewed()).click().build().perform();
             
             			
			
			Thread.sleep(10000);
			String Count = g.getSearch_Results_Count().getText();
			int Res = Integer.parseInt(Count);
			System.out.println("Total Result : " + Res);
			
			int scroll = (Res/10);
			int ScrollCount = (int) Math.ceil(scroll);
			System.out.println(ScrollCount);
			Thread.sleep(2000);
			String Parent = driver.getWindowHandle();
		//	BaseTest.click(g.getProfile_Click_toGo_VP());
			
			
			
			/////////////////
			Thread.sleep(3000);
			for (int i = 0; i <=Res; i++) {
				
				Thread.sleep(2000);
				BaseTest.click(g.getProfile_Click_toGo_VP());
			
			/////////  
			Thread.sleep(2000);
			Set<String> Child = driver.getWindowHandles();
			for (String handle : Child) {
				if (!Parent.equals(handle)) {
					Thread.sleep(1000);
					driver.switchTo().window(handle);
				}
					}
			
			Thread.sleep(3000);
			js.executeScript("window.scrollBy(0,350)");
			
			Thread.sleep(3000);
			js.executeScript("window.scrollBy(0,350)");
			
			Thread.sleep(3000);
			js.executeScript("window.scrollBy(0,350)");
			
			Thread.sleep(5000);
			 VP_Gothram = driver.findElement(By.xpath("(//span[contains(text(),'Gothra')])[1]//following::span[3]")).getText();
			System.out.println(VP_Gothram);
			
			if (!PI_Gothram.equals(VP_Gothram)) {
				status=true;
				System.out.println(i+" : Gothram Matches -  Passed ");
				//break;
			} else {
				
				System.err.println(i+" : Gothram Not Matches - Failed");

			}
			
			driver.close();
			Thread.sleep(3000);
			driver.switchTo().window(Parent);
			
			Thread.sleep(2000);
			driver.navigate().refresh();
			
			Thread.sleep(5000);
			
			}		
			
			//////////////

			
		} else {
			
			System.out.println("Gothram Value is Not an All Expect my Gothram");

		}
		
		///////////////////////////////////////////////////////////////////////////////////////////////////
		

		
		////////
		
	}	else {
      System.out.println("Gothram is not Present");
	}
		
		

	}
	
	
	
	@Test(enabled=false)
	public void premiumMatch() throws Throwable {
		GothramPOM g = new GothramPOM(driver);
		Actions acc = new Actions(driver);
		Robot r = new Robot();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		JavascriptExecutor js  = (JavascriptExecutor)driver;
		
		

		Thread.sleep(3000);
		driver.get("https://www.communitymatrimony.com");
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		BaseTest.click(g.getMatriID());
		BaseTest.typeData(g.getMatriID(), "BRH1393126");
		
		Thread.sleep(1000);
		BaseTest.click(g.getPasswordClear());
		BaseTest.typeData(g.getPassword(), "test4cbs");
		
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
			// TODO: handle exception
		}
		
		
		Thread.sleep(1000);
		try {
		acc.moveToElement(g.getMenu_btn()).build().perform();
		} catch (Exception e) {
			acc.moveToElement(g.getMenu_btn1()).build().perform();
		}
		
		
		Thread.sleep(1000);
		BaseTest.click(g.getEdit_Partner_Preference());
		
	
			Thread.sleep(3000);
			js.executeScript("window.scrollBy(0,350)");
		
		
		Thread.sleep(3000);
		if (g.getPP_Gothram_Value().isDisplayed()) {
			
			Thread.sleep(1000);
			PP_Gothram = g.getPP_Gothram_Value().getText();
			System.out.println("PP Gothram Value : "+PP_Gothram);
			

		
		
		Thread.sleep(3000);
		if (PP_Gothram.contains("All Except My Gothra(m)")) {
			
			driver.navigate().back();
			Thread.sleep(3000);
			
			Thread.sleep(1000);
			try {
			acc.moveToElement(g.getMenu_btn()).build().perform();
			} catch (Exception e) {
				acc.moveToElement(g.getMenu_btn1()).build().perform();
			}
			
			acc.moveToElement(g.getEdit_Profile()).click().build().perform();
			Thread.sleep(2000);
			
			Thread.sleep(3000);
			js.executeScript("window.scrollBy(0,350)");
			
			BaseTest.select_index(driver.findElement(By.id("gothram")), 9);
			Thread.sleep(2000);
			
			Thread.sleep(3000);
			js.executeScript("window.scrollBy(0,350)");
			
			BaseTest.click(driver.findElement(By.xpath("//input[@type='submit']")));
			Thread.sleep(2000);
			
			Thread.sleep(1000);
			try {
			acc.moveToElement(g.getMenu_btn()).build().perform();
			} catch (Exception e) {
				acc.moveToElement(g.getMenu_btn1()).build().perform();
			}
			
			Thread.sleep(1000);
			acc.moveToElement(g.getEdit_Partner_Preference()).click().build().perform();
			
			Thread.sleep(1000);
			String PI_Gothram = g.getPI_Gothram_Value().getText();
			System.out.println("PI Gothram Value : "+PI_Gothram);
			
			
			//****
			
			
			Thread.sleep(2000);
             acc.moveToElement(g.getMatches()).build().perform();
             
             Thread.sleep(2000);
             acc.moveToElement(g.getPremium_match()).click().build().perform();
             
             			
			
			Thread.sleep(10000);
			String Count = g.getSearch_Results_Count().getText();
			int Res = Integer.parseInt(Count);
			System.out.println("Total Result : " + Res);
			
			int scroll = (Res/10);
			int ScrollCount = (int) Math.ceil(scroll);
			System.out.println(ScrollCount);
			Thread.sleep(2000);
			String Parent = driver.getWindowHandle();
		//	BaseTest.click(g.getProfile_Click_toGo_VP());
			
			
			
			/////////////////
			Thread.sleep(3000);
			for (int i = 0; i <=ScrollCount; i++) {
				
				Thread.sleep(2000);
				BaseTest.click(g.getProfile_Click_toGo_VP());
			
			/////////  
			Thread.sleep(2000);
			Set<String> Child = driver.getWindowHandles();
			for (String handle : Child) {
				if (!Parent.equals(handle)) {
					Thread.sleep(1000);
					driver.switchTo().window(handle);
				}
					}
			
			Thread.sleep(3000);
			js.executeScript("window.scrollBy(0,350)");
			
			Thread.sleep(3000);
			js.executeScript("window.scrollBy(0,350)");
			
			Thread.sleep(3000);
			js.executeScript("window.scrollBy(0,350)");
			
			Thread.sleep(5000);
			 VP_Gothram = driver.findElement(By.xpath("(//span[contains(text(),'Gothra')])[1]//following::span[3]")).getText();
			System.out.println(VP_Gothram);
			
			if (!PI_Gothram.equals(VP_Gothram)) {
				status=true;
				System.out.println(i+" : Gothram Matches -Opposite Profile Gothram Should not Match with our PI Gothram");
				//break;
			} else {
				
				System.err.println(i+" : Gothram Not Matches - As Per RequireMent");

			}
			
			driver.close();
			Thread.sleep(3000);
			driver.switchTo().window(Parent);
			
			Thread.sleep(2000);
			driver.navigate().refresh();
			
			Thread.sleep(5000);
			
			}		
			
			//////////////

			
		} else {
			
			System.out.println("Gothram Value is Not an All Expect my Gothram");

		}
		
		///////////////////////////////////////////////////////////////////////////////////////////////////
		

		
		////////
		
	}	else {
      System.out.println("Gothram is not Present");
	}
		
		

	}
	
	
	
	@Test(enabled=false)
	public void latestMatch() throws Throwable {
		GothramPOM g = new GothramPOM(driver);
		Actions acc = new Actions(driver);
		Robot r = new Robot();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		JavascriptExecutor js  = (JavascriptExecutor)driver;
		
		

		Thread.sleep(3000);
		driver.get("https://www.communitymatrimony.com");
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		BaseTest.click(g.getMatriID());
		BaseTest.typeData(g.getMatriID(), "BRH1393126");
		
		Thread.sleep(1000);
		BaseTest.click(g.getPasswordClear());
		BaseTest.typeData(g.getPassword(), "test4cbs");
		
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
			// TODO: handle exception
		}
		
		
		Thread.sleep(1000);
		try {
		acc.moveToElement(g.getMenu_btn()).build().perform();
		} catch (Exception e) {
			acc.moveToElement(g.getMenu_btn1()).build().perform();
		}
		
		
		Thread.sleep(1000);
		BaseTest.click(g.getEdit_Partner_Preference());
		
	
			Thread.sleep(3000);
			js.executeScript("window.scrollBy(0,350)");
		
		
		Thread.sleep(3000);
		if (g.getPP_Gothram_Value().isDisplayed()) {
			
			Thread.sleep(1000);
			PP_Gothram = g.getPP_Gothram_Value().getText();
			System.out.println("PP Gothram Value : "+PP_Gothram);
			

		
		
		Thread.sleep(3000);
		if (PP_Gothram.contains("All Except My Gothra(m)")) {
			
			driver.navigate().back();
			Thread.sleep(3000);
			
			Thread.sleep(1000);
			try {
			acc.moveToElement(g.getMenu_btn()).build().perform();
			} catch (Exception e) {
				acc.moveToElement(g.getMenu_btn1()).build().perform();
			}
			
			acc.moveToElement(g.getEdit_Profile()).click().build().perform();
			Thread.sleep(2000);
			
			Thread.sleep(3000);
			js.executeScript("window.scrollBy(0,350)");
			
			BaseTest.select_index(driver.findElement(By.id("gothram")), 3);
			Thread.sleep(2000);
			
			Thread.sleep(3000);
			js.executeScript("window.scrollBy(0,350)");
			
			BaseTest.click(driver.findElement(By.xpath("//input[@type='submit']")));
			Thread.sleep(2000);
			
			Thread.sleep(1000);
			try {
			acc.moveToElement(g.getMenu_btn()).build().perform();
			} catch (Exception e) {
				acc.moveToElement(g.getMenu_btn1()).build().perform();
			}
			
			Thread.sleep(1000);
			acc.moveToElement(g.getEdit_Partner_Preference()).click().build().perform();
			
			Thread.sleep(1000);
			String PI_Gothram = g.getPI_Gothram_Value().getText();
			System.out.println("PI Gothram Value : "+PI_Gothram);
			
			
			//****
			
			
			Thread.sleep(2000);
             acc.moveToElement(g.getMatches()).build().perform();
             
             Thread.sleep(2000);
             acc.moveToElement(g.getLatest_Match()).click().build().perform();
             
             			
			
			Thread.sleep(10000);
			String Count = g.getSearch_Results_Count().getText();
			int Res = Integer.parseInt(Count);
			System.out.println("Total Result : " + Res);
			
			int scroll = (Res/10);
			int ScrollCount = (int) Math.ceil(scroll);
			System.out.println(ScrollCount);
			Thread.sleep(2000);
			String Parent = driver.getWindowHandle();
		//	BaseTest.click(g.getProfile_Click_toGo_VP());
			
			
			
			/////////////////
			Thread.sleep(3000);
			for (int i = 0; i <=Res; i++) {
				
				Thread.sleep(2000);
				BaseTest.click(g.getProfile_Click_toGo_VP());
			
			/////////  
			Thread.sleep(2000);
			Set<String> Child = driver.getWindowHandles();
			for (String handle : Child) {
				if (!Parent.equals(handle)) {
					Thread.sleep(1000);
					driver.switchTo().window(handle);
				}
					}
			
			Thread.sleep(3000);
			js.executeScript("window.scrollBy(0,350)");
			
			Thread.sleep(3000);
			js.executeScript("window.scrollBy(0,350)");
			
			Thread.sleep(3000);
			js.executeScript("window.scrollBy(0,350)");
			
			Thread.sleep(5000);
			 VP_Gothram = driver.findElement(By.xpath("(//span[contains(text(),'Gothra')])[1]//following::span[3]")).getText();
			System.out.println(VP_Gothram);
			
			if (!PI_Gothram.equals(VP_Gothram)) {
				status=true;
				System.out.println(i+" : Gothram Matches -Opposite Profile Gothram Should not Match with our PI Gothram");
				//break;
			} else {
				
				System.err.println(i+" : Gothram Not Matches - As Per RequireMent");

			}
			
			driver.close();
			Thread.sleep(3000);
			driver.switchTo().window(Parent);
			
			Thread.sleep(2000);
			driver.navigate().refresh();
			
			Thread.sleep(5000);
			
			}		
			
			//////////////

			
		} else {
			
			System.out.println("Gothram Value is Not an All Expect my Gothram");

		}
		
		///////////////////////////////////////////////////////////////////////////////////////////////////
		

		
		////////
		
	}	else {
      System.out.println("Gothram is not Present");
	}
		
		

	}
	
	
	
	@Test(enabled=false)
	public void viewed_Not_Contact() throws Throwable {
		GothramPOM g = new GothramPOM(driver);
		Actions acc = new Actions(driver);
		Robot r = new Robot();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		JavascriptExecutor js  = (JavascriptExecutor)driver;
		
		

		Thread.sleep(3000);
		driver.get("https://www.communitymatrimony.com");
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		BaseTest.click(g.getMatriID());
		BaseTest.typeData(g.getMatriID(), "BRH1393126");
		
		Thread.sleep(1000);
		BaseTest.click(g.getPasswordClear());
		BaseTest.typeData(g.getPassword(), "test4cbs");
		
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
			// TODO: handle exception
		}
		
		
		Thread.sleep(1000);
		try {
		acc.moveToElement(g.getMenu_btn()).build().perform();
		} catch (Exception e) {
			acc.moveToElement(g.getMenu_btn1()).build().perform();
		}
		
		
		Thread.sleep(1000);
		BaseTest.click(g.getEdit_Partner_Preference());
		
	
			Thread.sleep(3000);
			js.executeScript("window.scrollBy(0,350)");
		
		
		Thread.sleep(3000);
		if (g.getPP_Gothram_Value().isDisplayed()) {
			
			Thread.sleep(1000);
			PP_Gothram = g.getPP_Gothram_Value().getText();
			System.out.println("PP Gothram Value : "+PP_Gothram);
			

		
		
		Thread.sleep(3000);
		if (PP_Gothram.contains("All Except My Gothra(m)")) {
			
			driver.navigate().back();
			Thread.sleep(3000);
			
			Thread.sleep(1000);
			try {
			acc.moveToElement(g.getMenu_btn()).build().perform();
			} catch (Exception e) {
				acc.moveToElement(g.getMenu_btn1()).build().perform();
			}
			
			acc.moveToElement(g.getEdit_Profile()).click().build().perform();
			Thread.sleep(2000);
			
			Thread.sleep(3000);
			js.executeScript("window.scrollBy(0,350)");
			
			BaseTest.select_index(driver.findElement(By.id("gothram")), 3);
			Thread.sleep(2000);
			
			Thread.sleep(3000);
			js.executeScript("window.scrollBy(0,350)");
			
			BaseTest.click(driver.findElement(By.xpath("//input[@type='submit']")));
			Thread.sleep(2000);
			
			Thread.sleep(1000);
			try {
			acc.moveToElement(g.getMenu_btn()).build().perform();
			} catch (Exception e) {
				acc.moveToElement(g.getMenu_btn1()).build().perform();
			}
			
			Thread.sleep(1000);
			acc.moveToElement(g.getEdit_Partner_Preference()).click().build().perform();
			
			Thread.sleep(1000);
			String PI_Gothram = g.getPI_Gothram_Value().getText();
			System.out.println("PI Gothram Value : "+PI_Gothram);
			
			
			//****
			
			
			Thread.sleep(2000);
             acc.moveToElement(g.getMyHome()).build().perform();
             
             Thread.sleep(2000);
             acc.moveToElement(g.getProfile_View_Not_Comtacted()).click().build().perform();
             
             			
			
			Thread.sleep(10000);
			String Count = g.getSearch_Results_Count().getText();
			int Res = Integer.parseInt(Count);
			System.out.println("Total Result : " + Res);
			
			int scroll = (Res/10);
			int ScrollCount = (int) Math.ceil(scroll);
			System.out.println(ScrollCount);
			Thread.sleep(2000);
			String Parent = driver.getWindowHandle();
		//	BaseTest.click(g.getProfile_Click_toGo_VP());
			
			
			
			/////////////////
			Thread.sleep(3000);
			for (int i = 0; i <=ScrollCount; i++) {
				
				Thread.sleep(2000);
				BaseTest.click(g.getProfile_Click_toGo_VP());
			
			/////////  
			Thread.sleep(2000);
			Set<String> Child = driver.getWindowHandles();
			for (String handle : Child) {
				if (!Parent.equals(handle)) {
					Thread.sleep(1000);
					driver.switchTo().window(handle);
				}
					}
			
			Thread.sleep(3000);
			js.executeScript("window.scrollBy(0,350)");
			
			Thread.sleep(3000);
			js.executeScript("window.scrollBy(0,350)");
			
			Thread.sleep(3000);
			js.executeScript("window.scrollBy(0,350)");
			
			Thread.sleep(5000);
			 VP_Gothram = driver.findElement(By.xpath("(//span[contains(text(),'Gothra')])[1]//following::span[3]")).getText();
			System.out.println(VP_Gothram);
			
			if (!PI_Gothram.equals(VP_Gothram)) {
				
				System.out.println(i+" : Gothram Matches -Opposite Profile Gothram Should not Match our PI Gothram");
				
			} else {
				
				System.err.println(i+" : Gothram Not Matches - As Per RequireMent");

			}
			
			driver.close();
			Thread.sleep(3000);
			driver.switchTo().window(Parent);
			
			Thread.sleep(2000);
			driver.navigate().refresh();
			
			Thread.sleep(5000);
			
			}		
			
			//////////////

			
		} else {
			
			System.out.println("Gothram Value is Not an All Expect my Gothram");

		}
		
		///////////////////////////////////////////////////////////////////////////////////////////////////
		

		
		////////
		
	}	else {
      System.out.println("Gothram is not Present");
	}
		
		

	
	}
	
	
	@Test(enabled=false)
	public void mobile_No_Viewed() throws Throwable {
		GothramPOM g = new GothramPOM(driver);
		Actions acc = new Actions(driver);
		Robot r = new Robot();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		JavascriptExecutor js  = (JavascriptExecutor)driver;
		
		

		Thread.sleep(3000);
		driver.get("https://www.communitymatrimony.com");
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		BaseTest.click(g.getMatriID());
		BaseTest.typeData(g.getMatriID(), "BRH1393126");
		
		Thread.sleep(1000);
		BaseTest.click(g.getPasswordClear());
		BaseTest.typeData(g.getPassword(), "test4cbs");
		
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
			// TODO: handle exception
		}
		
		
		Thread.sleep(1000);
		try {
		acc.moveToElement(g.getMenu_btn()).build().perform();
		} catch (Exception e) {
			acc.moveToElement(g.getMenu_btn1()).build().perform();
		}
		
		
		Thread.sleep(1000);
		BaseTest.click(g.getEdit_Partner_Preference());
		
	
			Thread.sleep(3000);
			js.executeScript("window.scrollBy(0,350)");
		
		
		Thread.sleep(3000);
		if (g.getPP_Gothram_Value().isDisplayed()) {
			
			Thread.sleep(1000);
			PP_Gothram = g.getPP_Gothram_Value().getText();
			System.out.println("PP Gothram Value : "+PP_Gothram);
			

		
		
		Thread.sleep(3000);
		if (PP_Gothram.contains("All Except My Gothra(m)")) {
			
			driver.navigate().back();
			Thread.sleep(3000);
			
			Thread.sleep(1000);
			try {
			acc.moveToElement(g.getMenu_btn()).build().perform();
			} catch (Exception e) {
				acc.moveToElement(g.getMenu_btn1()).build().perform();
			}
			
			acc.moveToElement(g.getEdit_Profile()).click().build().perform();
			Thread.sleep(2000);
			
			Thread.sleep(3000);
			js.executeScript("window.scrollBy(0,350)");
			
			BaseTest.select_index(driver.findElement(By.id("gothram")), 3);
			Thread.sleep(2000);
			
			Thread.sleep(3000);
			js.executeScript("window.scrollBy(0,350)");
			
			BaseTest.click(driver.findElement(By.xpath("//input[@type='submit']")));
			Thread.sleep(2000);
			
			Thread.sleep(1000);
			try {
			acc.moveToElement(g.getMenu_btn()).build().perform();
			} catch (Exception e) {
				acc.moveToElement(g.getMenu_btn1()).build().perform();
			}
			
			Thread.sleep(1000);
			acc.moveToElement(g.getEdit_Partner_Preference()).click().build().perform();
			
			Thread.sleep(1000);
			String PI_Gothram = g.getPI_Gothram_Value().getText();
			System.out.println("PI Gothram Value : "+PI_Gothram);
			
			
			//****
			
			
			Thread.sleep(2000);
             acc.moveToElement(g.getMyHome()).build().perform();
             
             Thread.sleep(2000);
             acc.moveToElement(g.getMobile_No_Vewed()).click().build().perform();
             
             			
			
			Thread.sleep(10000);
			String Count = g.getSearch_Results_Count().getText();
			int Res = Integer.parseInt(Count);
			System.out.println("Total Result : " + Res);
			
			int scroll = (Res/10);
			int ScrollCount = (int) Math.ceil(scroll);
			System.out.println(ScrollCount);
			Thread.sleep(2000);
			String Parent = driver.getWindowHandle();
		//	BaseTest.click(g.getProfile_Click_toGo_VP());
			
			
			
			/////////////////
			Thread.sleep(3000);
			for (int i = 0; i <=ScrollCount; i++) {
				
				Thread.sleep(2000);
				BaseTest.click(g.getProfile_Click_toGo_VP());
			
			/////////  
			Thread.sleep(2000);
			Set<String> Child = driver.getWindowHandles();
			for (String handle : Child) {
				if (!Parent.equals(handle)) {
					Thread.sleep(1000);
					driver.switchTo().window(handle);
				}
					}
			
			Thread.sleep(3000);
			js.executeScript("window.scrollBy(0,350)");
			
			Thread.sleep(3000);
			js.executeScript("window.scrollBy(0,350)");
			
			Thread.sleep(3000);
			js.executeScript("window.scrollBy(0,350)");
			
			Thread.sleep(5000);
			 VP_Gothram = driver.findElement(By.xpath("(//span[contains(text(),'Gothra')])[1]//following::span[3]")).getText();
			System.out.println(VP_Gothram);
			
			if (!PI_Gothram.equals(VP_Gothram)) {
				status=true;
				System.out.println(i+" : Gothram Matches -Opposite Profile Gothram Should not Match with our PI Gothram");
				//break;
			} else {
				
				System.err.println(i+" : Gothram Not Matches - As Per RequireMent");

			}
			
			driver.close();
			Thread.sleep(3000);
			driver.switchTo().window(Parent);
			
			Thread.sleep(2000);
			driver.navigate().refresh();
			
			Thread.sleep(5000);
			
			}		
			
			//////////////

			
		} else {
			
			System.out.println("Gothram Value is Not an All Expect my Gothram");

		}
		
		///////////////////////////////////////////////////////////////////////////////////////////////////
		

		
		////////
		
	}	else {
      System.out.println("Gothram is not Present");
	}
		
		

	
	}
	
	
	@Test(enabled=false)
	public void profile_Ignored() throws Throwable {
		GothramPOM g = new GothramPOM(driver);
		Actions acc = new Actions(driver);
		Robot r = new Robot();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		JavascriptExecutor js  = (JavascriptExecutor)driver;
		
		

		Thread.sleep(3000);
		driver.get("https://www.communitymatrimony.com");
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		BaseTest.click(g.getMatriID());
		BaseTest.typeData(g.getMatriID(), "BRH1393126");
		
		Thread.sleep(1000);
		BaseTest.click(g.getPasswordClear());
		BaseTest.typeData(g.getPassword(), "test4cbs");
		
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
			// TODO: handle exception
		}
		
		
		Thread.sleep(1000);
		try {
		acc.moveToElement(g.getMenu_btn()).build().perform();
		} catch (Exception e) {
			acc.moveToElement(g.getMenu_btn1()).build().perform();
		}
		
		
		Thread.sleep(1000);
		BaseTest.click(g.getEdit_Partner_Preference());
		
	
			Thread.sleep(3000);
			js.executeScript("window.scrollBy(0,350)");
		
		
		Thread.sleep(3000);
		if (g.getPP_Gothram_Value().isDisplayed()) {
			
			Thread.sleep(1000);
			PP_Gothram = g.getPP_Gothram_Value().getText();
			System.out.println("PP Gothram Value : "+PP_Gothram);
			

		
		
		Thread.sleep(3000);
		if (PP_Gothram.contains("All Except My Gothra(m)")) {
			
			driver.navigate().back();
			Thread.sleep(3000);
			
			Thread.sleep(1000);
			try {
			acc.moveToElement(g.getMenu_btn()).build().perform();
			} catch (Exception e) {
				acc.moveToElement(g.getMenu_btn1()).build().perform();
			}
			
			acc.moveToElement(g.getEdit_Profile()).click().build().perform();
			Thread.sleep(2000);
			
			Thread.sleep(3000);
			js.executeScript("window.scrollBy(0,350)");
			
			BaseTest.select_index(driver.findElement(By.id("gothram")), 3);
			Thread.sleep(2000);
			
			Thread.sleep(3000);
			js.executeScript("window.scrollBy(0,350)");
			
			BaseTest.click(driver.findElement(By.xpath("//input[@type='submit']")));
			Thread.sleep(2000);
			
			Thread.sleep(1000);
			try {
			acc.moveToElement(g.getMenu_btn()).build().perform();
			} catch (Exception e) {
				acc.moveToElement(g.getMenu_btn1()).build().perform();
			}
			
			Thread.sleep(1000);
			acc.moveToElement(g.getEdit_Partner_Preference()).click().build().perform();
			
			Thread.sleep(1000);
			String PI_Gothram = g.getPI_Gothram_Value().getText();
			System.out.println("PI Gothram Value : "+PI_Gothram);
			
			
			//****
			
			
			Thread.sleep(2000);
             acc.moveToElement(g.getMyHome()).build().perform();
             
             Thread.sleep(2000);
             acc.moveToElement(g.getProfile_Ignored()).click().build().perform();
             
             			
			
			Thread.sleep(10000);
			String Count = g.getSearch_Results_Count().getText();
			int Res = Integer.parseInt(Count);
			System.out.println("Total Result : " + Res);
			
			int scroll = (Res/10);
			int ScrollCount = (int) Math.ceil(scroll);
			System.out.println(ScrollCount);
			Thread.sleep(2000);
			String Parent = driver.getWindowHandle();
		//	BaseTest.click(g.getProfile_Click_toGo_VP());
			
			
			
			/////////////////
			Thread.sleep(3000);
			for (int i = 0; i <=ScrollCount; i++) {
				
				Thread.sleep(2000);
				BaseTest.click(g.getProfile_Click_toGo_VP());
			
			/////////  
			Thread.sleep(2000);
			Set<String> Child = driver.getWindowHandles();
			for (String handle : Child) {
				if (!Parent.equals(handle)) {
					Thread.sleep(1000);
					driver.switchTo().window(handle);
				}
					}
			
			Thread.sleep(3000);
			js.executeScript("window.scrollBy(0,350)");
			
			Thread.sleep(3000);
			js.executeScript("window.scrollBy(0,350)");
			
			Thread.sleep(3000);
			js.executeScript("window.scrollBy(0,350)");
			
			Thread.sleep(5000);
			 VP_Gothram = driver.findElement(By.xpath("(//span[contains(text(),'Gothra')])[1]//following::span[3]")).getText();
			System.out.println(VP_Gothram);
			
			if (!PI_Gothram.equals(VP_Gothram)) {
				status=true;
				System.out.println(i+" : Gothram Matches - Opposite Profile Gothram Should not Match With our PI Gothram");
				//break;
			} else {
				
				System.err.println(i+" : Gothram Not Matches - As Per RequireMent");

			}
			
			driver.close();
			Thread.sleep(3000);
			driver.switchTo().window(Parent);
			
			Thread.sleep(2000);
			driver.navigate().refresh();
			
			Thread.sleep(5000);
			
			}		
			
			//////////////

			
		} else {
			
			System.out.println("Gothram Value is Not an All Expect my Gothram");

		}
		
		///////////////////////////////////////////////////////////////////////////////////////////////////
		

		
		////////
		
	}	else {
      System.out.println("Gothram is not Present");
	}
		
		

	
	}
	
	
	@Test(enabled=false)
	public void shortlistedFailTest() throws Throwable {
		

		GothramPOM g = new GothramPOM(driver);
		Actions acc = new Actions(driver);
		Robot r = new Robot();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		JavascriptExecutor js  = (JavascriptExecutor)driver;
		
		

		Thread.sleep(3000);
		driver.get("https://www.communitymatrimony.com");
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		BaseTest.click(g.getMatriID());
		BaseTest.typeData(g.getMatriID(), "BRH1393126");
		
		Thread.sleep(1000);
		BaseTest.click(g.getPasswordClear());
		BaseTest.typeData(g.getPassword(), "test4cbs");
		
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
			// TODO: handle exception
		}
		
		
		Thread.sleep(1000);
		try {
		acc.moveToElement(g.getMenu_btn()).build().perform();
		} catch (Exception e) {
			acc.moveToElement(g.getMenu_btn1()).build().perform();
		}
		
		
		Thread.sleep(1000);
		BaseTest.click(g.getEdit_Partner_Preference());
		
	
			Thread.sleep(3000);
			js.executeScript("window.scrollBy(0,350)");
		
		
		Thread.sleep(3000);
		if (g.getPP_Gothram_Value().isDisplayed()) {
			
			Thread.sleep(1000);
			PP_Gothram = g.getPP_Gothram_Value().getText();
			System.out.println("PP Gothram Value : "+PP_Gothram);
			

		
		
		Thread.sleep(3000);
		if (PP_Gothram.contains("All Except My Gothra(m)")) {
			
			driver.navigate().back();
			Thread.sleep(3000);
			
			/*Thread.sleep(1000);
			try {
			acc.moveToElement(g.getMenu_btn()).build().perform();
			} catch (Exception e) {
				acc.moveToElement(g.getMenu_btn1()).build().perform();
			}
			
			acc.moveToElement(g.getEdit_Profile()).click().build().perform();
			Thread.sleep(2000);
			
			Thread.sleep(3000);
			js.executeScript("window.scrollBy(0,350)");
			
			BaseTest.select_index(driver.findElement(By.id("gothram")), 3);
			Thread.sleep(2000);
			
			Thread.sleep(3000);
			js.executeScript("window.scrollBy(0,350)");
			
			BaseTest.click(driver.findElement(By.xpath("//input[@type='submit']")));
			Thread.sleep(2000);
			*/
			Thread.sleep(1000);
			try {
			acc.moveToElement(g.getMenu_btn()).build().perform();
			} catch (Exception e) {
				acc.moveToElement(g.getMenu_btn1()).build().perform();
			}
			
			Thread.sleep(1000);
			acc.moveToElement(g.getEdit_Partner_Preference()).click().build().perform();
			
			Thread.sleep(1000);
			String PI_Gothram = g.getPI_Gothram_Value().getText();
			System.out.println("PI Gothram Value : "+PI_Gothram);
			
			
			//****
			
			
			Thread.sleep(2000);
             acc.moveToElement(g.getMyHome()).build().perform();
             
             Thread.sleep(2000);
             acc.moveToElement(g.getProfile_Shortlisted_By_Me()).click().build().perform();
             
             			
			
			/*Thread.sleep(10000);
			String Count = g.getSearch_Results_Count().getText();
			int Res = Integer.parseInt(Count);
			System.out.println("Total Result : " + Res);
			
			int scroll = (Res/10);
			int ScrollCount = (int) Math.ceil(scroll);
			System.out.println(ScrollCount);*/
			Thread.sleep(2000);
			String Parent = driver.getWindowHandle();
		//	BaseTest.click(g.getProfile_Click_toGo_VP());
			
			
			
			/////////////////
			Thread.sleep(3000);
			for (int i = 0; i <1; i++) {
				
				Thread.sleep(2000);
				BaseTest.click(driver.findElement(By.xpath("//*[@id=\"result0\"]/div[1]")));
			
			/////////  
			Thread.sleep(2000);
			Set<String> Child = driver.getWindowHandles();
			for (String handle : Child) {
				if (!Parent.equals(handle)) {
					Thread.sleep(1000);
					driver.switchTo().window(handle);
				}
					}
			
			Thread.sleep(3000);
			js.executeScript("window.scrollBy(0,350)");
			
			Thread.sleep(3000);
			js.executeScript("window.scrollBy(0,350)");
			
			Thread.sleep(3000);
			js.executeScript("window.scrollBy(0,350)");
			
			Thread.sleep(5000);
			 VP_Gothram = driver.findElement(By.xpath("(//span[contains(text(),'Gothra')])[1]//following::span[3]")).getText();
			System.out.println(VP_Gothram);
			
			if (PI_Gothram.equals(VP_Gothram)) {
			//	status=true; 
				int tot = i+1;
				System.err.println(tot+" : Opposite Profile Gothram Matched - Failed");
			//	//break;
			} else {
				int tot = i+1;
				System.out.println(tot+" : Opposite Profile Gothram not Matched - Passed");

			}
			
			driver.close();
			Thread.sleep(3000);
			driver.switchTo().window(Parent);
			
			Thread.sleep(2000);
			driver.navigate().refresh();
			
			Thread.sleep(5000);
			
			}		
			
			//////////////

			
		} else {
			
			System.out.println("Gothram Value is Not an All Expect my Gothram");

		}
		
		///////////////////////////////////////////////////////////////////////////////////////////////////
		

		
		////////
		
	}	else {
      System.out.println("Gothram is not Present");
	}
		
		
	}
	

}
