package Android.PWA;

import java.awt.AWTException;
import java.awt.Desktop.Action;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

import org.apache.commons.collections.bag.TreeBag;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

public class RegisterationTest extends BaseTest {

	private String reportDirectory = "reports";
	private String reportFormat = "xml";
	private String testName = "Untitled";
	protected ChromeDriver driver = null;
	String email = "testmail.communitymatrimony" + (Math.floor(Math.random() * 1478) + "@gmail.com");
	JavascriptExecutor jse = (JavascriptExecutor) driver;
	DesiredCapabilities dc = new DesiredCapabilities();

	@BeforeTest
	public void setUp() throws MalformedURLException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\amuthan\\eclipse-workspace\\PWA\\Driver\\chromedriver.exe");

		HashMap<String, Object> deviceMetrics = new HashMap<String, Object>();

		deviceMetrics.put("width", 360);

		deviceMetrics.put("height", 640);

		deviceMetrics.put("pixelRatio", 3.0);

		Map<String, Object> mobileEmulation = new HashMap<String, Object>();

		mobileEmulation.put("deviceMetrics", deviceMetrics);

		mobileEmulation.put("userAgent",
				"Mozilla/5.0 (Linux; Android 4.2.1; en-us; Nexus 5 Build/JOP40D) AppleWebKit/535.19 (KHTML, like Gecko) Chrome/18.0.1025.166 Mobile Safari/535.19");

		// mobileEmulation.put("deviceName", "Pixel 2");

		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--disable-notifications");
		chromeOptions.setExperimentalOption("mobileEmulation", mobileEmulation);
		driver = new ChromeDriver(chromeOptions);

	}

	@Test
	public void register() throws Throwable {

		RegisterPOM r = new RegisterPOM(driver);
		Actions acc = new Actions(driver);
		Robot kr = new Robot();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebDriverWait wait = new WebDriverWait(driver, 30);

		test = reports.startTest(" PWA Registration Test");
		test.log(LogStatus.PASS, " PWA Registration Test Started");

		driver.get("https://mobile.communitymatrimony.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);

		BaseTest.click(r.getCommunity());
		Thread.sleep(2000);

		BaseTest.click(r.getCommunity_search());
		BaseTest.typeData(r.getCommunity_search(), BaseTest.getExcelData("Page1", 1, 0));
		Thread.sleep(1000);

		// wait.until(ExpectedConditions.visibilityOf(r.getCommunity_search_value()));
		BaseTest.click(
				driver.findElement(By.xpath("//li[contains(text(),'" + BaseTest.getExcelData("Page1", 1, 0) + "')]")));
		Thread.sleep(2000);

		BaseTest.click(r.getProfile_created_self());
		Thread.sleep(2000);

		BaseTest.typeData(r.getName(), BaseTest.getExcelData("Page1", 1, 1));
		Thread.sleep(2000);

		BaseTest.click(r.getFemale());
		Thread.sleep(2000);

		BaseTest.click(r.getDob());
		Thread.sleep(2000);
		


		Actions actions = new Actions(driver);
		/*actions.moveToElement(driver.findElement(By.xpath("//div[@class='dwwo']")));
		actions.click();
		actions.sendKeys("May");
		actions.build().perform();
		
		// MOnth
		BaseTest.typeData(driver.findElement(By.xpath("//div[@class='dwwol']")),"May");
		
		// Day	
		BaseTest.click(driver.findElement(By.xpath("//div[@class='dw ios']//following::div[6]//following::li[contains(text(),'1')]")));
		Thread.sleep(2000);
		
		//Year
		BaseTest.click(driver.findElement(By.xpath("//div[@class='dw ios']//following::div[7]//following::li[contains(text(),'1992')]")));
		Thread.sleep(2000);*/
		
		Thread.sleep(2000);
		List<WebElement> Month = driver.findElements(By.xpath("(//div[@class='dww dwrc'])[1]//ul//li"));
		System.out.println(Month.size()+"   Month   ");
	//	Month.get(10).click();
	//	Month.get(0).sendKeys("June");
		for (int i = 0; i <= 10; i++) {
		acc.moveToElement(Month.get(i)).click();
		// Month.get(i).click();
		}
		//acc.moveToElement(Month.get(10)).click();
	//	acc.sendKeys("June");
		
		Thread.sleep(2000);
		List<WebElement> Date = driver.findElements(By.xpath("(//div[@class='dww dwrc'])[2]//ul//li"));
		System.out.println(Date.size()+"   Date   ");
	//	Date.get(15).click();
		for (int i = 0; i <= 15; i++) {
			acc.moveToElement(Date.get(i)).click();
		    // Date.get(i).click();
		}
		
	//	acc.sendKeys("12");
		
		Thread.sleep(2000);
		List<WebElement> Year = driver.findElements(By.xpath("(//div[@class='dww dwrc'])[3]//ul//li"));
		System.out.println(Year.size()+"   Year   ");
	 //   Year.get(50).click();
		for (int i = 0; i <= 50; i++) {
			acc.moveToElement(Year.get(i)).click();
			//Year.get(i).click();
		}
		
	//	acc.sendKeys("1998");
		
		
		
//	List<WebElement> dob = driver.findElements(By.xpath("//div[@class='dwwo']"));
//	System.out.println(dob.size()+"   DOB   ");
	
	
		/*
		 * BaseTest.click(driver.findElement(By.
		 * xpath("//div[@class='dww dwrc']//following::li[contains(text(),'"+BaseTest.
		 * getExcelData("Page1", 1, 3)+"')]"))); Thread.sleep(2000);
		 * 
		 * //div[@class='dw ios']//following::div[5]//following::li[contains(text(),'March')]
		 * BaseTest.click(driver.findElement(By.
		 * xpath("//div[@class='dww dwrc']//following::li[contains(text(),'"+BaseTest.
		 * getExcelData("Page1", 1, 4)+"')]"))); Thread.sleep(2000);
		 * 
		 * BaseTest.click(driver.findElement(By.
		 * xpath("//div[@class='dww dwrc']//following::li[contains(text(),'"+BaseTest.
		 * getExcelData("Page1", 1, 5)+"')]"))); Thread.sleep(2000);
		 */

		// BaseTest.typeData(r.getDob_sendKeys(), BaseTest.getExcelData("Page1", 1, ));
		Thread.sleep(2000);

		BaseTest.click(r.getDob_set());
		Thread.sleep(2000);

		BaseTest.typeData(r.getPassword(), BaseTest.getExcelData("Page1", 1, 6));
		Thread.sleep(2000);

		BaseTest.click(r.getCountry_Code());
		Thread.sleep(2000);

		BaseTest.click(driver.findElement(By.xpath("//ul[@id='list_view_detail']//following::li[contains(text(),'"
				+ BaseTest.getExcelData("Page1", 1, 7) + "')]")));
		Thread.sleep(2000);

		BaseTest.typeData(r.getMobile_number(), BaseTest.getExcelData("Page1", 1, 8));
		Thread.sleep(2000);
///////  Religion
		try {
			BaseTest.click(r.getReligion());
			Thread.sleep(2000);
			BaseTest.click(driver.findElement(By.xpath("//ul[@id='list_view_detail']//li[contains(text(),'"
					+ BaseTest.getExcelData("Page1", 1, 10) + "')]")));
			Thread.sleep(2000);
		} catch (Exception e) { }
////////////// SubCaste
		try {
			BaseTest.click(r.getSubcaste());
			Thread.sleep(2000);
			BaseTest.click(driver.findElement(By.xpath("//ul[@id='list_view_detail']//li[contains(text(),'"
					+ BaseTest.getExcelData("Page1", 1, 12) + "')]")));
			Thread.sleep(2000);
		} catch (Exception e) {	}
		
		/////// Mother Tongue
		BaseTest.click(r.getMother_tongue());
		Thread.sleep(2020);
		BaseTest.click(driver.findElement(By.xpath("//ul[@id='list_view_detail']//li[contains(text(),'"
		             + BaseTest.getExcelData("Page1", 1, 9)+"')]")));
		Thread.sleep(2000);
		
		BaseTest.click(r.getContinue_button());
		Thread.sleep(5000);
		
		
		//////     Registeration Page 2   /////////
		
		BaseTest.click(r.getUnmarried());
		Thread.sleep(2000);
		
			
		// other than Unmarried np of childrem
		
		
		try {
			BaseTest.click(driver.findElement(By.xpath("//span[contains(text(),'"+BaseTest.getExcelData("Page2", 1, 1)+"')]")));
			Thread.sleep(2000);
		} catch (Exception e) {    }
		
		try {
			BaseTest.click(driver.findElement(By.xpath("//span[contains(text(),'"+BaseTest.getExcelData("Page2", 1, 2)+"')]")));
			Thread.sleep(2000);
		} catch (Exception e) {  }
		
		
		BaseTest.typeData(r.getEmail(), email);
		Thread.sleep(2000);
		
		BaseTest.click(r.getCountry_living());
		Thread.sleep(2000);
		
		BaseTest.click(driver.findElement(By.xpath("//ul[@id='list_view_detail']//li[contains(text(),'"+BaseTest.getExcelData("page2", 1, 3)+"')]")));
		Thread.sleep(2000);
		
		
		BaseTest.click(r.getState());
		Thread.sleep(2000);
		
		BaseTest.click(driver.findElement(By.xpath("//ul[@id='list_view_detail']//li[contains(text(),'"+BaseTest.getExcelData("Page2", 1, 4)+"')]")));
		Thread.sleep(2000);
		
		js.executeScript("window.scrollBy(0,350)"); 
		Thread.sleep(2000);
		
		
		
		try {
			BaseTest.click(r.getCity());
			Thread.sleep(2000);
			BaseTest.click(driver.findElement(By.xpath("//ul[@id='list_view_detail']//li[contains(text(),'"+BaseTest.getExcelData("Page2", 1, 5)+"")));
			Thread.sleep(2000);
		} catch (Exception e) {
			
			BaseTest.typeData(r.getCity_text(), BaseTest.getExcelData("Page2", 1, 5));
			Thread.sleep(2000);
		}
		
		
		try {
			
			BaseTest.click(r.getCitizenShip());
			Thread.sleep(2000);
			
			BaseTest.click(driver.findElement(By.xpath("//ul[@id='list_view_detail']//li[contains(text(),'"+BaseTest.getExcelData("page2", 1, 3)+"')]")));
			Thread.sleep(2000);
		} catch (Exception e) { }
		
		
		try {
			
			BaseTest.click(r.getResident_status());
			Thread.sleep(2000);
			
			BaseTest.click(driver.findElement(By.xpath("//ul[@id='list_view_detail']//li[contains(text(),'"+BaseTest.getExcelData("page2", 1, 6)+"')]")));
			Thread.sleep(2000);
		} catch (Exception e) {
			
		}
		
		
		BaseTest.click(r.getContinue_button());
		Thread.sleep(5000);
		
		
		
		
		
		/////////////  Page 3
		
		
		
		BaseTest.click(r.getHeight());
		Thread.sleep(5000);
		
		List<WebElement> heigt = driver.findElements(By.xpath("//div[@class='dww dwrc']//ul//li"));
		int a = heigt.size();
		System.out.println(a);
		
		for (int i = 0; i <=22; i++) {
			
		//	heigt.get(i).sendKeys("4 ft 2 in / 127 cm");
		
		        actions.moveToElement(heigt.get(i)).click().build().perform();
		        Thread.sleep(1000);
		   /*    actions.click();
		//      actions.sendKeys(" ");
		        actions.build().perform();*/
			
		}
		
	//	heigt.get(0).sendKeys("5 ft 1 in / 154 cm");
		
		
		
///BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'4 ft / 121 cm')]")));
	//	BaseTest.click(driver.findElement(By.xpath("//div[contains(text(),'Height')]//following::li[contains(text(),'"+BaseTest.getExcelData("Page3", 1, 0)+"')]")));
		/*wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//div[@class='dw ios']//li[contains(text(),'"+BaseTest.getExcelData("Page3", 1, 0)+"')]"))));
		BaseTest.click(driver.findElement(By.xpath("//div[@class='dw ios']//li[contains(text(),'"+BaseTest.getExcelData("Page3", 1, 0)+"')]")));
		Thread.sleep(2000);*/
		Thread.sleep(2000);
		BaseTest.click(r.getHeight_setter());
		Thread.sleep(2000);
		
		BaseTest.click(r.getPhysical_status_normal());
		Thread.sleep(2000);
		
		BaseTest.click(r.getEducation());
		Thread.sleep(2000);
		
		BaseTest.click(driver.findElement(By.xpath("//ul[@id='list_view_detail']//li[contains(text(),'"+BaseTest.getExcelData("Page3", 1, 2)+"')]")));
		Thread.sleep(2000);
		
		BaseTest.click(driver.findElement(By.xpath("//span[contains(text(),'"+BaseTest.getExcelData("Page3", 6, 3)+"')]")));
		Thread.sleep(2000);
		
		try {  
			BaseTest.click(r.getOccupation());
			Thread.sleep(3000);
			
			BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'Not working')]")));
			Thread.sleep(3000);
		} catch (Exception e) {
			
			
		}
		
		
		try {  
			BaseTest.click(r.getIncome_text());
			Thread.sleep(3000);
			
			BaseTest.typeData(r.getIncome_text(), BaseTest.getExcelData("Page3", 1, 9));
			
		} catch (Exception e) {
			
			
		}
		
		
		
		
		BaseTest.click(driver.findElement(By.xpath("//span[contains(text(),'"+BaseTest.getExcelData("Page3", 1, 4)+"')]")));
		Thread.sleep(2000);
		
		BaseTest.click(driver.findElement(By.xpath("//span[contains(text(),'"+BaseTest.getExcelData("Page3", 1, 5)+"')]")));
		Thread.sleep(2000);
		
		BaseTest.click(driver.findElement(By.xpath("//span[contains(text(),'"+BaseTest.getExcelData("Page3", 1, 6)+"')]")));
		Thread.sleep(2000);
		
	//	BaseTest.click(driver.findElement(By.xpath("//span[contains(text(),'"+BaseTest.getExcelData("Page3", 1, 3)+"')]")));
		Thread.sleep(2000);
		
		BaseTest.click(r.getContinue_button());
		Thread.sleep(5000);
		
/*		
		try {  

			BaseTest.click(r.getIncome_text());
            Thread.sleep(2000);
			BaseTest.typeData(r.getIncome_text(), "100000");
			
		} catch (Exception e) {
			
			
		}  */
		
		BaseTest.click(r.getContinue_button());
		Thread.sleep(5000);
		
		
		String Matri = driver.findElement(By.id("confirm-txt")).getText();
		System.out.println(Matri);
		
		Thread.sleep(2000);
		String[] aa = Matri.split(" : ");
		
		String ID = aa[1].toString().trim();
		System.out.println(ID);
		
		Thread.sleep(3000);
		BaseTest.setExcelData("ID", 1, 0, ID);
		
	/*	Thread.sleep(3000);
		String parent = driver.getWindowHandle();
		
		Robot rr = new Robot();
		
		Thread.sleep(3000);
		rr.keyPress(KeyEvent.VK_CONTROL);
		rr.keyPress(KeyEvent.VK_N);
		rr.keyRelease(KeyEvent.VK_N);
		rr.keyRelease(KeyEvent.VK_CONTROL);
		
		 Set<String> child  = driver.getWindowHandles();
	      
	      for (String hanlde : child) {
			if (!parent.contains(hanlde)) {
				Thread.sleep(2000);
				driver.switchTo().window(hanlde);
			}
		}
		
		Thread.sleep(9000);	      
        driver.navigate().to("https://admin:lRqW6WNT@communitymatrimony.com/api/webservicecall.php?filename=getSmsPin&MatriId="+ID);    
        //https://admin:lRqW6WNT@communitymatrimony.com/api/webservicecall.php?filename=getSmsPin&MatriId="+matriid
        //driver.navigate().back();
        Thread.sleep(5000);
		WebElement element = driver.findElement(By.xpath("/html/body/pre"));
		String pinnotext = element.getText();
		driver.navigate().back();
		System.out.println("PIN : "+pinnotext);			
		System.out.println("Success...");    
		
		Thread.sleep(3000);
		   String pinNum=pinnotext.substring(24,31);
	        System.out.println(pinNum);        
	        Thread.sleep(1000);	     
	       driver.close();
	       driver.switchTo().window(parent);
	     
	        Thread.sleep(5000);
	        
	        
	        driver.findElement(By.id("VERIFY")).sendKeys(pinNum);
	        Thread.sleep(2000);
	        
	        BaseTest.click(driver.findElement(By.id("verify")));
	     ////////////////   
	        Thread.sleep(3000);
	        try {
	        	js.executeScript("window.scrollBy(0,350)");
	        	 Thread.sleep(1000);
				BaseTest.click(driver.findElement(By.xpath("//a[contains(text(),'Skip >')]")));
			} catch (Exception e) {
				
			}
	        
	        Thread.sleep(3000);
	        try {
				BaseTest.click(driver.findElement(By.cssSelector("#formCheck > div.inner-bg-sub > div:nth-child(3) > div > label > span > span.ui-icon.ui-icon-radio-off.ui-icon-shadow")));
			    Thread.sleep(1000);
			    BaseTest.click(driver.findElement(By.cssSelector("#profiledtls > a")));
	        
	        } catch (Exception e) {
				// TODO: handle exception
			}
	        
	        
	        Thread.sleep(3000);
	        try {
	        	js.executeScript("window.scrollBy(0,350)");
	        	 Thread.sleep(1000);	
				BaseTest.click(driver.findElement(By.xpath("//a[contains(text(),\"I'll do this later  	»\")]")));
			} catch (Exception e) {
				// TODO: handle exception
			}
	        
	        Thread.sleep(3000);
	        try {
	        	js.executeScript("window.scrollBy(0,350)");
	        	 Thread.sleep(1000);
				BaseTest.click(driver.findElement(By.xpath("//a[contains(text(),\"I'll do this later\")]")));
			} catch (Exception e) {
				// TODO: handle exception
			}
	        
	        
	        ///////////////////////////////////////////
	        
	        Thread.sleep(3000);
	        
	        BaseTest
	        .click(driver.findElement(By.xpath("//a[contains(text(),'Menu')]")));
	        
	        Thread.sleep(3000);
	        BaseTest.click(driver.findElement(By.cssSelector("#mainsidemenu > div > ion-content > div.scroll-content > ion-grid > ion-row > ion-col > ion-list:nth-child(7) > ion-item > div.item-inner > div > ion-label")));
	        
	        Thread.sleep(3000);
	        BaseTest.click(driver.findElement(By.cssSelector("body > ion-app > ion-modal > div > settingpopup > ion-content > div.scroll-content > ion-grid > ion-row > ion-col > ion-list > ion-item:nth-child(5) > div.item-inner > div > ion-label")));
	}  */
	}
}
