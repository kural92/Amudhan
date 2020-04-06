package SprintTask;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.Set;

import org.apache.commons.collections.set.SynchronizedSortedSet;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import base.BaseTest;
import pom.cmlogin.GothramPOM;

public class Gothram extends BaseTest{
	
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
				".//Driver//chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);
	
	}
	
	
	@Test(enabled=true)
	public void changePIGothram() throws Throwable {
		
		
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
			
			Thread.sleep(2000);
			BaseTest.click(g.getSearch());
			
			Thread.sleep(2000);
			BaseTest.click(g.getAdvanced_Search());
			
			
			Thread.sleep(3000);
		//	acc.moveToElement(g.getGotram_dropDown()).doubleClick().build().perform();
			acc.doubleClick(driver.findElement(By.xpath("//*[@id=\"gothramTemp\"]/option[1]"))).build().perform();
			
			
			Thread.sleep(2000);
			BaseTest.click(g.getSearch_btn());
			
			
			Thread.sleep(6000);
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
			
			Thread.sleep(5000);
			 VP_Gothram = driver.findElement(By.xpath("(//span[contains(text(),'Gothra')])[1]//following::span[3]")).getText();
			System.out.println("Opposite Profile Gothram : "+VP_Gothram);
			
			if (!PI_Gothram.equals(VP_Gothram)) {
			//	status=true;
				System.out.println(i+1+" : Gothram Matches - Passed");
			//	//break;
			} else {
				
				System.err.println(i+1+" : Gothram Not Matches - Failed");

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
	
	
	
	@Test(enabled=true)
	public void exceptMyGothram() throws Throwable {
		
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
			
			Thread.sleep(1000);
			String PI_Gothram = g.getPI_Gothram_Value().getText();
			System.out.println("PI Gothram Value : "+PI_Gothram);
			
			Thread.sleep(2000);
			BaseTest.click(g.getSearch());
			
			Thread.sleep(2000);
			BaseTest.click(g.getAdvanced_Search());
			
			
			Thread.sleep(3000);
		//	acc.moveToElement(g.getGotram_dropDown()).doubleClick().build().perform();
			acc.doubleClick(driver.findElement(By.xpath("//*[@id=\"gothramTemp\"]/option[1]"))).build().perform();
			
			
			Thread.sleep(2000);
			BaseTest.click(g.getSearch_btn());
			
			
			Thread.sleep(6000);
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
			
			
			Thread.sleep(5000);
			 VP_Gothram = driver.findElement(By.xpath("(//span[contains(text(),'Gothra')])[1]//following::span[3]")).getText();
			System.out.println("Opposite Profile Gothram : "+VP_Gothram);
			
			if (!PI_Gothram.equals(VP_Gothram)) {
				status=true;
				System.out.println((i+1)+" : Gothram Matches - Passed");
				//break;
			} else {
				
				System.err.println((i+1)+" : Gothram Not Matches - Failed");

			}
			
			driver.close();
			Thread.sleep(3000);
			driver.switchTo().window(Parent);
			
			Thread.sleep(2000);
			driver.navigate().refresh();
			
			Thread.sleep(5000);
			
			}		
	} else {
			
			System.out.println("Gothram Value is Not an All Expect my Gothram");

		}
		
		///////////////////////////////////////////////////////////////////////////////////////////////////
		
		
		////////
		
	}	else {
      System.out.println("Gothram is not Present");
	}
		

	}
	
	
	@Test(enabled=true)
	public void allreadyViewedProfile() throws Throwable {
		
		
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
		
		
		Thread.sleep(3000);
		BaseTest.click(driver.findElement(By.xpath("//*[@id=\"special_offer_lightpic1\"]/div[1]/div/a/img")));
		
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
			
			Thread.sleep(1000);
			String PI_Gothram = g.getPI_Gothram_Value().getText();
			System.out.println("PI Gothram Value : "+PI_Gothram);
			
			Thread.sleep(2000);
			BaseTest.click(g.getSearch());
			
			Thread.sleep(2000);
			BaseTest.click(g.getAdvanced_Search());
		
			Thread.sleep(3000);
			//	acc.moveToElement(g.getGotram_dropDown()).doubleClick().build().perform();
				acc.doubleClick(driver.findElement(By.xpath("//*[@id=\"gothramTemp\"]/option[1]"))).build().perform();
				
				
				Thread.sleep(2000);
				BaseTest.click(g.getSearch_btn());
				
				
				Thread.sleep(6000);
				WebElement AlreadyViewedCHbox = driver.findElement(By.id("alreadyViewedOpt"));
		////		
				if (AlreadyViewedCHbox.isEnabled()) {
					
					BaseTest.click(AlreadyViewedCHbox);
					Thread.sleep(2000);
					BaseTest.click(driver.findElement(By.xpath("//input[@value='Submit »']")));
	
				} else {
                    System.out.println("Already Viewed check box was Unchecked");
				}
		///////		
				
				Thread.sleep(5000);
				String Count = g.getSearch_Results_Count().getText();
				int Res = Integer.parseInt(Count);
				System.out.println("Total Result : " + Res);
				
				int scroll = (Res/10);
				int ScrollCount = (int) Math.ceil(scroll);
				System.out.println(ScrollCount);
				Thread.sleep(2000);
				String Parent = driver.getWindowHandle();
			//	BaseTest.click(g.getProfile_Click_toGo_VP());
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
				
				
				/////////////////
				Thread.sleep(3000);
				for (int i = 0; i <=ScrollCount; i++) {
					
				
				Thread.sleep(5000);
				 VP_Gothram = driver.findElement(By.xpath("(//span[contains(text(),'Gothra')])["+b+"]//following::span[3]")).getText();
				System.out.println("Opposite profile Gothram :  "+VP_Gothram);
				
				if (!PI_Gothram.equals(VP_Gothram)) {
				//	status=true;
					System.out.println(i+" : Gothram Matches - Passed ");
				//	//break;
				} else {
					
					System.err.println(i+" : Gothram Not Matches - Failed ");

				}
				/*
				driver.close();
				Thread.sleep(3000);
				driver.switchTo().window(Parent);
				
				Thread.sleep(2000);
				driver.navigate().refresh();
				*/
				Thread.sleep(5000);
				BaseTest.click(g.getVP_Next_ProfileClick());
				
			/*	try {
					BaseTest.click(driver.findElement(By.xpath("//*[@id=\"infprevnextbtn\"]/div/span[1]/img")));
				} catch (Exception e) {
					// TODO: handle exception
				}
				
				try {
					BaseTest.click(driver.findElement(By.xpath("//*[@id=\"infprevnextbtn\"]/div/span[1]")));
				} catch (Exception e) {
					// TODO: handle exception
				}*/
				
			int	j=b;
				k=j+3;
				b=k;
				System.err.println("b : "+b);
				
				}		
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
