import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Url {
	
	static WebDriver driver;

	public static void main(String[] args) throws IOException {
		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "C:\\Users\\amuthan\\eclipse-workspace\\FirewallUpgrade\\Driver\\chromedriver.exe"
		 * ); WebDriver driver = new ChromeDriver();
		 */
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\amuthan\\eclipse-workspace\\PWA\\Driver\\chromedriver.exe");
		   
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
		
		
		
		//Excel
		File f=new File("C:\\Users\\amuthan\\eclipse-workspace\\FirewallUpgrade\\Excel\\excel.xlsx");
		FileInputStream stream=new FileInputStream(f);
		Workbook w= new HSSFWorkbook(stream);
		Sheet s = w.getSheet("Sheet1");
		
		for (int i = 0; i <=338; i++) {
			Row r = s.getRow(i);
			driver.get("r");
			
			
		}

	}

}
