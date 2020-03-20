package BugZilla;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.Date;
import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import base.BaseTest;



public class BugZilla_Report_Mail extends BaseTest{
	public static WebDriver driver;
	
	
    
    static String currentUrl,Clasfiation,a,b,c,d,e1,f;
	


	@Test
	public static void maiolcode() throws InterruptedException, AWTException {
		String driverExecutablePath = "C:\\Users\\amuthan\\eclipse-workspace\\CBS\\Driver\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", driverExecutablePath);
		driver = new ChromeDriver();

		driver.get("http://192.168.1.56/bugzilla/enter_bug.cgi");
		driver.manage().window().maximize();
		 Thread.sleep(3000);
		 
		 // Login
	/*	 driver.findElement(By.id("Bugzilla_login")).sendKeys("amudhan.nagarajan@matrimony.com");
		 Thread.sleep(3000);
		 
		 driver.findElement(By.id("Bugzilla_password")).sendKeys("login123");
		 Thread.sleep(3000);
		 
		 driver.findElement(By.id("log_in")).click();
		 Thread.sleep(3000);
		 
	*/	 
		 
		 		 
		driver.findElement(By.xpath("//*[@id=\"header\"]/ul/li[4]/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"tab_advanced\"]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='v1_classification']")).click();
		
		Thread.sleep(2000);
		Robot bot = new Robot();
		  driver.findElement(By.xpath("//*[@id='v46_product']")).click();  //*[@id="v1_classification"]
		  bot.keyPress(java.awt.event.KeyEvent.VK_CONTROL);
		 driver.findElement(By.xpath("//*[@id='v54_product']")).click();
		  driver.findElement(By.xpath("//*[@id='v58_product']")).click();
		driver.findElement(By.xpath("//*[@id='v48_product']")).click();
		driver.findElement(By.xpath("//*[@id='v5_product']")).click();
		 driver.findElement(By.xpath("//*[@id='v41_product']")).click();
		  driver.findElement(By.xpath("//*[@id='v57_product']")).click();
	driver.findElement(By.xpath("//*[@id=\"v65_product\"]")).click();
		  bot.keyRelease(java.awt.event.KeyEvent.VK_CONTROL);
		  
		  driver.findElement(By.xpath("//*[@id='v1_resolution']")).click();
		  Thread.sleep(3000);

		  
		  driver.findElement(By.xpath("//*[@id=\"history_filter\"]/a")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//*[@id=\"chfield\"]/option[1]")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//*[@id=\"button_calendar_chfieldfrom\"]")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("(//td[contains(@class, 'today selectable')])[1]")).click();
          Thread.sleep(2000);
		  driver.findElement(By.xpath("//*[@id=\"Search\"]")).click();
		  currentUrl = driver.getCurrentUrl();
		  System.out.println(currentUrl);
		  
		  
		  ///// 
		  
		  Thread.sleep(2000);
		   Clasfiation = driver.findElement(By.xpath("//*[@id=\"bugzilla-body\"]/ul[1]/li[1]"))
.getText();
		  
		  System.out.println(Clasfiation);
		  
		  
		  
		  Thread.sleep(2000);
		  String Product = driver.findElement(By.xpath("//*[@id=\"bugzilla-body\"]/ul[1]/li[2]")).getText();
		//  System.out.println(Product);
		  
		  Thread.sleep(2000);
		  
		  String[] A = Product.split(", ");
		  
		String aa = A[0].toString().trim();
		String[] aaa = aa.split(": ");
		 a = aaa[1].toString().trim();
		System.out.println(a);
		
		 b = A[1].toString().trim();
		System.out.println(b);
		
		 c = A[2].toString().trim();
		System.out.println(c);
		
		 d = A[3].toString().trim();
		System.out.println(d);
		
		 e1 = A[4].toString().trim();
		System.out.println(e1);
		
		 f = A[5].toString().trim();
		System.out.println(f);
		
		
		Thread.sleep(3000);
		//BaseTest.mail_report();
	}
		  
	
}