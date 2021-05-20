package SprintTask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.BaseTest;

public class FaceBook extends BaseTest{
	
	

	@BeforeMethod
	public void startUP() {
		System.setProperty("webdriver.chrome.driver", ".//Driver//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();	

	}
	
	
	@Test
	public void faceBookLogin() {
		
		
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		
		
		WebElement username =  driver.findElement(By.cssSelector("#email"));
		BaseTest.click(username);
		BaseTest.clear(username);
		BaseTest.typeData(username, "amukural@gmail.com");
		
		
		WebElement password = driver.findElement(By.cssSelector("#pass"));
		BaseTest.click(password);
		BaseTest.clear(password);
        BaseTest.typeData(password, "Change99");
        
        WebElement login = driver.findElement(By.xpath("//button[contains(text(),'Log In')]"));
        BaseTest.click(login);

        
        
        
	}

}
