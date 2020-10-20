package SprintTask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseTest;

public class BulkJobAlert extends BaseTest {
	
	
	
	
	public static String[] jobs = {" Horoscope Matches", " EI Suggested Mailer"," Star Match Watch"," Who Viewed Me Daily"," PM Suggested Mailer"," DMW YTBV"," DMW - Extended Matches"," Daily Match Watch"," EI Pending 5th day reminder daily"};
	
	
	@BeforeTest
	public void startUp() {
		
		
		System.setProperty("webdriver.chrome.driver",
				".//Driver//chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);

	}
	
	
	@Test
	public void jobAlert() throws Throwable {
		
		// Launch URL
		driver.get("https://bulkjobs.matrimonycorp.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		// Enter UserName
		driver.findElement(By.xpath("//input[@name='username']")).click();
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		Thread.sleep(3000);
		
		// Enter Password
		driver.findElement(By.xpath("//input[@name='password']")).click();
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("bjm123");
		Thread.sleep(3000);
		
		// Click on Login
		driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
		Thread.sleep(5000);
		
		//Click CBS Portal
		driver.findElement(By.xpath("//a[contains(text(),'Click here ')]")).click();
		Thread.sleep(3000);
		
		for (int i = 0; i < jobs.length; i++) {
			System.err.println(jobs[i]);
		
		// Horoscope Matches
		WebElement Horoscope = driver.findElement(By.xpath("//span[contains(text(),'"+jobs[i]+"')]"));
		
		
		
		Thread.sleep(3000);
		if (Horoscope.isDisplayed()) {
			Thread.sleep(3000); 
			Horoscope.click();
			
			Thread.sleep(3000);
			Job_Id= driver.findElement(By.xpath("//b[contains(text(),'Job Id:')]//following::span[1]")).getText();
			System.out.println(Job_Id);
			
			Job_Name = driver.findElement(By.xpath("//b[contains(text(),'Job Name:')]//following::span[1]")).getText();
			System.out.println(Job_Name);
			
			Date = driver.findElement(By.xpath("//b[contains(text(),' Date:')]//following::span[1]")).getText();
			System.out.println(Date);
			
			Medium= driver.findElement(By.xpath("//b[contains(text(),'Medium:')]//following::span[1]")).getText();
			System.out.println(Medium);
			
		
			////  Cooking 
			Thread.sleep(3000);
			WebElement Job_Status = driver.findElement(By.xpath("//b[contains(text(),'Cooking:')]//following::small[1]"));
			Thread.sleep(3000);
			
		     if (Job_Status.isDisplayed()) {
				Thread.sleep(3000);
				String Status = Job_Status.getText();
				System.out.println(Status);
				
				Thread.sleep(3000);
				if (Status.contains("Job stopped abruptly")) {
					System.err.println("Job Failed Need Send alert Cooking");
					
					
					Thread.sleep(3000);
					BaseTest.sms_bulkJob(Job_Id, Job_Name, Medium, Date);
					
					
					
					
				} else {

					System.out.println("Job Was Passed");
				}
				
			} else {

			}
		     
		     /////////////////////////  ******  ///////////////////////////////
		     
		     ////  Sending  
		     
		     Thread.sleep(3000);
				WebElement Job_Status1 = driver.findElement(By.xpath("//b[contains(text(),'Sending:')]//following::small[1]"));
				Thread.sleep(3000);
				
			     if (Job_Status1.isDisplayed()) {
					Thread.sleep(3000);
					String Status1 = Job_Status1.getText();
					System.out.println(Status1);
					
					Thread.sleep(3000);
					if (Status1.contains("Job stopped abruptly")) {
						System.err.println("Job Failed Need Send alert For Sending");

					} else {

						System.out.println("Job Was Passed");
					}
					
				} else {

				}
			     
			     ////////////    ***********  ///////////////////////////
			
		} else {
			Thread.sleep(3000);
			System.out.println("Horoscope Matches Job Not Found");
		}
		
		Thread.sleep(5000);
		driver.navigate().back();
		
		Thread.sleep(5000);
		
		}
		
		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		

	}
	
	

}
