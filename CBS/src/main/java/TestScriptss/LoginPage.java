package TestScriptss;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.base.BaseTest;

public class LoginPage  extends BaseTest{
	
	
static WebDriver driver;
	
	@BeforeTest
	@Parameters("browser")
	
	public void setup(String browser) throws Exception {
		
       if(browser.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", ".//Driver//geckodriver.exe");
			driver= new FirefoxDriver();
			System.out.println("ireFox");
			
		}
		
		else if(browser.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", ".//Driver//chromedriver.exe");
		driver= new ChromeDriver();
		System.out.println("Chrome");
		}
		
		else if(browser.equalsIgnoreCase("edge")){
			System.setProperty("webdriver.edge.driver", "D:\\CBS-Automation\\Desktop\\CBS\\Driver\\msedgedriver.exe");
			driver= new ChromeDriver();
		} else {
		
		System.setProperty("webdriver.chrome.driver", "D:\\CBS-Automation\\Desktop\\CBS\\Driver\\chromedriver.exe");
	driver= new ChromeDriver();
	}
	

	}
}
