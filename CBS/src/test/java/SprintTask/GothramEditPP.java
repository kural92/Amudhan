package SprintTask;

import static org.testng.Assert.assertTrue;

import java.awt.Robot;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.Vector;

import org.apache.bcel.generic.AALOAD;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import base.BaseTest;
import pom.cmlogin.GothramPOM;

public class GothramEditPP extends BaseTest{
	
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
	public void changePPGothram() throws Throwable {
		
		
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
/////////////////////////////////////////////////////////////////////////////////////////////////		
////////////////////////////////////////////////////////////////////////////////////////////////////////////////		
		Thread.sleep(1000);
		BaseTest.click(g.getEdit_Partner_Preference());
		
		Thread.sleep(2000);
		BaseTest.click(g.getPP_Edit_btn());
		
		
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,350)");
		
		Thread.sleep(2000);
		//WebElement Gothra_PP = g.getGotram_dropDown();
		Select a = new Select(g.getGothram_selected_Value());
	 List<WebElement> c = a.getAllSelectedOptions();
	 
		int d = c.size();
		System.out.println(d);
		for (int i = 0; i<d; i++) {
			
			String E = c.get(i).getText();
			System.out.println(E);
			
			if (E.equals("All Except My Gothra(m)")) {
				
				Thread.sleep(2000);
				Select aa = new Select(g.getGothram_selected_Value());
				aa.deselectAll();
				
			}
			
			
		}
		
		Thread.sleep(2000);
		Select Gothras =new Select(g.getGothram_selected_Value());
		Gothras.deselectAll();
		for (int j = 2; j <=6; j++) {
			
			Thread.sleep(2000);
			Gothras.selectByIndex(j);
		}
		
		
		
		
	/*	Thread.sleep(3000);
		Select Gothra_Value = new Select(g.getGothram_selected_Value());
		List<WebElement> Multiple_Gothra = Gothra_Value.getAllSelectedOptions();
		int Mul = Multiple_Gothra.size();
		System.out.println(" * * * "+Mul);
		
		for (int l = 0; l<Mul; l++) {
			
			String PP_Gothrams = Multiple_Gothra.get(l).getText();
			String Total = PP_Gothrams+ l++;
			System.out.println(Total);
		}*/
		
		Thread.sleep(2000);
		BaseTest.click(g.getEdit_PP_Save());
		
		
		/*js.executeScript("window.scrollBy(500,0)");*/
		/*js.executeScript("window.scrollTo(350,0)");
		
		js.executeScript("window.scrollBy(500,0)");
		js.executeScript("window.scrollBy(500,0)");
		js.executeScript("window.scrollBy(500,0)");
		*/
		
		Thread.sleep(3000);
		driver.navigate().refresh();
		
		Thread.sleep(3000);
		js.executeScript("window.scrollTo(350,0)");
		
		Thread.sleep(3000);
		try {
			acc.moveToElement(g.getMenu_btn()).build().perform();
		} catch (Exception e) {
			acc.moveToElement(g.getMenu_btn1()).build().perform();
		}
		
		Thread.sleep(3000);
		BaseTest.click(g.getEdit_Partner_Preference());
		
		
		
		Thread.sleep(3000);  //(//span[contains(text(),'Gothram -')]//following::span[@class='strictpp_content'])[1]
		String Gothram_After_Save = driver.findElement(By.xpath("//span[contains(text(),'Gothram -')]//following::span[1]")).getText();
		System.out.println("Gothram After edit : "+Gothram_After_Save);
		
		Thread.sleep(3000);
		js.executeScript("window.scrollTo(350,0)");
		
		Thread.sleep(10000);
		acc.moveToElement(g.getMatches()).build().perform();
		
		Thread.sleep(3000);
		acc.moveToElement(g.getYet_To_Be_Viewed()).click().build().perform();
		
		
	//////////////////////////////////////////
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
		
		//************************************************************************
		
		String[] Gothram_Spli = Gothram_After_Save.split(", ");
		int Split = Gothram_Spli.length;
		
		
		
		for (int k = 0; k < Split; k++) {
			
			String PP_Gothram_Values11 = Gothram_Spli[k].toString();
			System.out.println("1 2 3 : "+PP_Gothram_Values11);
			/*Thread.sleep(2000);
			String PP_Gothra = Multiple_Gothra.get(k).getText();
			System.out.println("PP Gothram : "+PP_Gothra);*/
			
			Thread.sleep(3000);
			
			if (PP_Gothram_Values11.equals(VP_Gothram)) {
				status=true;
				System.out.println(k +" : Gothram Matches "+PP_Gothram_Values11+" with opposite profile Gothram "+VP_Gothram);
				//break
			} else {
				
				System.err.println("Gothram  Not Matches with opposite profile Gothram ");

			}
			
			
		}
		
	
		
		driver.close();
		Thread.sleep(3000);
		driver.switchTo().window(Parent);
		
		Thread.sleep(2000);
		driver.navigate().refresh();
		
		Thread.sleep(5000);
		
		}	
		
		//////////////

		
	}
		
		
		///////////////////////////////////////////////////
		
	
	@Test(enabled=true)
	public void changePPGothramStrict() throws Throwable {
		
		
		
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
		
		Thread.sleep(2000);
		BaseTest.click(g.getPP_Edit_btn());
		
		
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,350)");
		
		Thread.sleep(2000);
		//WebElement Gothra_PP = g.getGotram_dropDown();
		Select a = new Select(g.getGothram_selected_Value());
	 List<WebElement> c = a.getAllSelectedOptions();
	 
		int d = c.size();
		System.out.println(d);
		for (int i = 0; i<d; i++) {
			
			String E = c.get(i).getText();
			System.out.println(E);
			
			if (E.equals("All Except My Gothra(m)")) {
				
				Thread.sleep(2000);
				Select aa = new Select(g.getGothram_selected_Value());
				aa.deselectAll();
				
			}
			
			
		}
		
		Thread.sleep(2000);
		Select Gothras =new Select(g.getGothram_selected_Value());
		Gothras.deselectAll();
		for (int j = 2; j <=6; j++) {
			
			Thread.sleep(2000);
			Gothras.selectByIndex(j);
		}
		
		
		
		
	/*	Thread.sleep(3000);
		Select Gothra_Value = new Select(g.getGothram_selected_Value());
		List<WebElement> Multiple_Gothra = Gothra_Value.getAllSelectedOptions();
		int Mul = Multiple_Gothra.size();
		System.out.println(" * * * "+Mul);
		
		for (int l = 0; l<Mul; l++) {
			
			String PP_Gothrams = Multiple_Gothra.get(l).getText();
			String Total = PP_Gothrams+ l++;
			System.out.println(Total);
		}*/
		
		Thread.sleep(2000);
		BaseTest.click(g.getEdit_PP_Save());
		
		
		/*js.executeScript("window.scrollBy(500,0)");*/
		/*js.executeScript("window.scrollTo(350,0)");
		
		js.executeScript("window.scrollBy(500,0)");
		js.executeScript("window.scrollBy(500,0)");
		js.executeScript("window.scrollBy(500,0)");
		*/
		
		Thread.sleep(3000);
		driver.navigate().refresh();
		
		Thread.sleep(3000);
		js.executeScript("window.scrollTo(350,0)");
		
		Thread.sleep(3000);
		try {
			acc.moveToElement(g.getMenu_btn()).build().perform();
		} catch (Exception e) {
			acc.moveToElement(g.getMenu_btn1()).build().perform();
		}
		
		Thread.sleep(3000);
		BaseTest.click(g.getEdit_Partner_Preference());
		
		
		
		Thread.sleep(3000);  //(//span[contains(text(),'Gothram -')]//following::span[@class='strictpp_content'])[1]
		String Gothram_After_Save = driver.findElement(By.xpath("//span[contains(text(),'Gothram -')]//following::span[1]")).getText();
		System.out.println("Gothram After Save : "+Gothram_After_Save);
		
		
		Thread.sleep(3000);
		BaseTest.click(g.getStrict_PP_btn());
		
		Thread.sleep(3000);
		if (!g.getStrict_PP_Gothram().isSelected()) {
			Thread.sleep(2000);
			BaseTest.click(g.getStrict_PP_Gothram());
			Thread.sleep(2000);
			BaseTest.click(g.getStrict_PP_Save());
		} else {
			System.out.println("Already Strict Applied");
		}
		
		
		try {
			driver.findElement(By.xpath("//*[@id=\"lightpic\"]/div/div/div/div[1]/a")).click();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		Thread.sleep(3000);
		js.executeScript("window.scrollTo(350,0)");
		
		try {
			driver.findElement(By.xpath("//*[@id=\"lightpic\"]/div/div/div/div[1]/a")).click();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		Thread.sleep(10000);
		acc.moveToElement(g.getMatches()).build().perform();
		
		Thread.sleep(3000);
		acc.moveToElement(g.getYet_To_Be_Viewed()).click().build().perform();
		
		
	//////////////////////////////////////////
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
		
		//************************************************************************
		
		String[] Gothram_Spli = Gothram_After_Save.split(", ");
		int Split = Gothram_Spli.length;
		
		
		
		for (int k = 0; k < Split; k++) {
			
			String PP_Gothram_Values11 = Gothram_Spli[k].toString();
			//System.out.println("1 2 3 : "+PP_Gothram_Values11);
			/*Thread.sleep(2000);
			String PP_Gothra = Multiple_Gothra.get(k).getText();
			System.out.println("PP Gothram : "+PP_Gothra);*/
			
			Thread.sleep(3000);
			
			if (PP_Gothram_Values11.equals(VP_Gothram)) {
				 status = true;
				System.out.println(k +" : Gothram Matches "+PP_Gothram_Values11+" with opposite profile Gothram - "+VP_Gothram);
				//break
			} else {
				//status = true;
				System.err.println(k +" : Gothram Not Matches "+PP_Gothram_Values11+" with "+VP_Gothram);

			}
			
		//	assertTrue( status, k +" : Gothram Not Matches "+PP_Gothram_Values11+" with opposite profile Gothram "+VP_Gothram);
			
			
		}
		
	
		
		driver.close();
		Thread.sleep(3000);
		driver.switchTo().window(Parent);
		
		Thread.sleep(2000);
		driver.navigate().refresh();
		
		Thread.sleep(5000);
		
		}	
		

	}
	
	
	
	
	@Test(enabled=true)
	public void changePPGothramWithSearch() throws Throwable {
		
		
		
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
		
	
//////////
		///////////////
		////////////////////////////////////
		               //////////////////////////////
		
		Thread.sleep(10000);
		acc.moveToElement(g.getSearch()).click().build().perform();
		
		Thread.sleep(2000);
		BaseTest.click(g.getAdvanced_Search());
		
		Thread.sleep(3000);
		for (int l = 2; l<8; l++) {
			
			Thread.sleep(2000);
			acc.doubleClick(driver.findElement(By.xpath("//*[@id='gothramTemp']/option["+l+"]"))).build().perform();
			
		}
		
	     Thread.sleep(2000);
	     WebElement Search_Gothram = driver.findElement(By.id("gothram"));	   	     
	     Select sss = new Select(Search_Gothram);
         List<WebElement> c = sss.getOptions();
         System.out.println(c);
            System.out.println("lst size"+c.size());
            String[] array=new String[c.size()];
            for (int j = 0; j<c.size(); j++) {

                String f = c.get(j).getText();
              //  System.out.println("string value "+j+" "+f);
                array[j]=f;
                System.out.println("String value after adding in to array : "+array[j]); 
	 
	     }


		Thread.sleep(2000);
		BaseTest.click(g.getSearch_btn());
		
		
	//////////////////////////////////////////
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
		
		//************************************************************************


		
		for (int k = 0; k < array.length; k++) {


			
			Thread.sleep(3000);
			
			if (array[k].equals(VP_Gothram)) {
				status=true;
				System.out.println(k +" : Gothram Matches "+array[k]+" with opposite profile Gothram "+VP_Gothram);
			//	//break
			} else {
				
				System.err.println(k +" : Gothram  Not Matches with opposite profile Gothram");

			}
			
			
		}
		
	
		
		driver.close();
		Thread.sleep(3000);
		driver.switchTo().window(Parent);
		
		Thread.sleep(2000);
		driver.navigate().refresh();
		
		Thread.sleep(5000);
		
		}  

	}
	
	
			
	
}
