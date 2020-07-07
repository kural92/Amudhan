package SprintTask;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.HashMap;
import java.util.Map;


import org.apache.poi.ss.usermodel.Row;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseTest;

public class PwaUrl extends BaseTest{
	
	
	@BeforeTest
	public static void setUp() {
		
		System.setProperty("webdriver.chrome.driver", ".//Driver//chromedriver.exe");
		   
    	HashMap<String, Object> deviceMetrics = new HashMap<String, Object>();

    	deviceMetrics.put("width", 360);

    	deviceMetrics.put("height", 640);

    	deviceMetrics.put("pixelRatio", 3.0);



    	Map<String, Object> mobileEmulation = new HashMap<String, Object>();

    	mobileEmulation.put("deviceMetrics", deviceMetrics);

    	mobileEmulation.put("userAgent", "Mozilla/5.0 (Linux; Android 4.2.1; en-us; Nexus 5 Build/JOP40D) AppleWebKit/535.19 (KHTML, like Gecko) Chrome/18.0.1025.166 Mobile Safari/535.19");

    	//mobileEmulation.put("deviceName", "Pixel 2");


    	ChromeOptions chromeOptions = new ChromeOptions();
    	chromeOptions.addArguments("--disable-notifications");
    	chromeOptions.setExperimentalOption("mobileEmulation", mobileEmulation);
    	driver = new ChromeDriver(chromeOptions);
		
		

	}
	
	@Test(enabled = true)
	public static void urlReDirect() throws Throwable {
	
	
		//338
		for (int i = 1; i <=33; i++) {
			Thread.sleep(5000);
		//	Row r = s.getRow(i);
			try {
			driver.get(BaseTest.getExcelData("URL", i, 4));
			
			
			Thread.sleep(5000);
			String url = driver.getCurrentUrl();
			System.err.println(url);
			Thread.sleep(5000);
			String[] w = url.split("//");
			System.out.println();
			
			String ww = w[1].toString();
			//System.out.println(ww);
			
			String[] www = ww.split("/");
			
			String W = www[0].toString();
			
		//	System.out.println(W);
			
			
			String[] WW = W.split("\\.");
			
			String WWW = WW[0].toString();
			//System.err.println(WWW);
			
			Thread.sleep(5000);
			if (WWW.equalsIgnoreCase("www")) {
				System.out.println(" m. redirect into www");
			} else {
				System.err.println(" m. not redirected into www");
			}
			
			
			Thread.sleep(5000);
			driver.findElement(By.xpath("//a[contains(text(),'LOGIN')]")).click();
			
			Thread.sleep(5000);
			String url1 = driver.getCurrentUrl();
			System.err.println(url1);
			Thread.sleep(5000);
			String[] w1 = url1.split("//");
			System.out.println();
			
			String ww1 = w1[1].toString();
			//System.out.println(ww);
			
			String[] www1 = ww1.split("/");
			
			String W1 = www1[0].toString();
			
		//	System.out.println(W);
			
			
			String[] WW1 = W1.split("\\.");
			
			String WWW1 = WW1[0].toString();
			//System.err.println(WWW);
			
			Thread.sleep(5000);
			if (WWW1.equalsIgnoreCase("www")) {
				System.out.println(" m. redirect into www");
			} else {
				System.err.println(" m. not redirected into www");
			}
			
			} catch (Exception e) {
				// TODO: handle exception
			}
			
		}
		
	}
	
	
	@Test(enabled = false)
	public static void mobileRedirect() throws Throwable {
		

		//338
		for (int i = 1; i <=3; i++) {
			Thread.sleep(5000);
		//	Row r = s.getRow(i);
			try {
			driver.get(BaseTest.getExcelData("URL", i, 2));
			
			
			Thread.sleep(5000);
			String url = driver.getCurrentUrl();
			System.err.println(url);
			Thread.sleep(5000);
			String[] w = url.split("//");
			System.out.println();
			
			String ww = w[1].toString();
			//System.out.println(ww);
			
			String[] www = ww.split("/");
			
			String W = www[0].toString();
			
		//	System.out.println(W);
			
			
			String[] WW = W.split("\\.");
			
			String WWW = WW[0].toString();
			//System.err.println(WWW);
			
			Thread.sleep(5000);
			if (WWW.equalsIgnoreCase("www")) {
				System.out.println(" mobile. redirect into www");
			} else {
				System.err.println(" mobile. not redirected into www");
			}
			
			} catch (Exception e) {
				// TODO: handle exception
			}
			
		}

	}
	
	
	@Test(enabled = false)
     public static void googleUrl() throws Throwable {
		
		
		for (int i = 1; i <=30; i++) {
			Thread.sleep(5000);
		//	Row r = s.getRow(i);
		//	driver.get(BaseTest.getExcelData("URL", i, 3));
			try {
			driver.get("http://www.google.com");
			
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@class='gLFyf']")).sendKeys(BaseTest.getExcelData("URL", i, 3));
			
			Thread.sleep(3000);
			Robot r = new Robot();
			Thread.sleep(3000);
			r.keyPress(KeyEvent.VK_ENTER);
			Thread.sleep(1000);
			r.keyRelease(KeyEvent.VK_ENTER);
			
			Thread.sleep(5000);
			
			driver.findElement(By.xpath("//a[@class='C8nzq d5oMvf BmP5tf']")).click();
			Thread.sleep(5000);
			
			String url = driver.getCurrentUrl();
			System.err.println(url);
			Thread.sleep(5000);
			String[] w = url.split("//");
			System.out.println();
			
			String ww = w[1].toString();
			//System.out.println(ww);
			
			String[] www = ww.split("/");
			
			String W = www[0].toString();
			
		//	System.out.println(W);
			
			
			String[] WW = W.split("\\.");
			
			String WWW = WW[0].toString();
			//System.err.println(WWW);
			
			Thread.sleep(5000);
			if (WWW.equalsIgnoreCase("www")) {
				System.out.println(" mobile. redirect into www");
			} else {
				System.err.println(" mobile. not redirected into www");
			}
			
			
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		

	}
}
