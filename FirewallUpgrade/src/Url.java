import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Url {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\amuthan\\eclipse-workspace\\FirewallUpgrade\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
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
