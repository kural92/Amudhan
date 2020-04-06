package SprintTask;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.javascript.host.Set;
import com.gargoylesoftware.htmlunit.javascript.host.Symbol;

import base.BaseTest;

public class WhoCanSeeMe extends BaseTest{
	
	int Age, AgeFrom, AgeTo;
	String Marital_status;
	Float Height, HeightFrom, HeightTo;
	
	
	
	
	

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
	
	
	@Test
	public void whoCanSee() throws Exception {
		
		Actions acc = new Actions(driver);
		Robot r = new Robot();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		JavascriptExecutor js  = (JavascriptExecutor)driver;
		
		
		Thread.sleep(3000);
		driver.get("https://www.communitymatrimony.com");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/form/div[1]/input")).click();
		
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/form/div[1]/input")).sendKeys("AGR755407");

		Thread.sleep(2000);
		driver.findElement(By.id("passwordClear1")).click();
		
		driver.findElement(By.id("password1")).sendKeys("cbstest");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/form/div[2]/input[3]")).click();
		Thread.sleep(3000);
		
		/////////////////// Intermediate Page  ////////////
		

		/////////////////   
		Thread.sleep(1000);
		try {
			WebElement photo_add = driver.findElement(By.xpath("/html/body/div[2]/a"));
			if (photo_add.isDisplayed()) {
				photo_add.click();
				driver.findElement(By.xpath("//*[@id=\"conform\"]/div/div/div/a[1]")).click();
				driver.findElement(By.xpath("//*[@id=\"reason3\"]")).click();
				driver.findElement(By.xpath("//*[@id=\"skipphotoclick\"]")).click();

			}

		} catch (Exception e) {
			System.out.println("Photo Page Skipped");
		}

		Thread.sleep(1000);
		try {
			WebElement skip_matches = driver.findElement(By.xpath("//a[contains(text(),'Skip to Daily Matches >>')]"));
			if (skip_matches.isDisplayed()) {
				skip_matches.click();

			}
		} catch (Exception e) {
			System.out.println("Intermediate pages handled");
		}
		Thread.sleep(1000);
		try {
			WebElement element = driver.findElement(By.xpath("/html/body/div[1]/div[2]/a"));
			if (element.isDisplayed()) {
				element.click();

			}
		} catch (Exception e) {
			System.out.println("Intermediate pages handled");
		}
		Thread.sleep(1000);
		try {
			WebElement divorcee_intermediate_skip = driver.findElement(By.xpath("/html/body/div[1]/div/div[4]/a"));
			if (divorcee_intermediate_skip.isDisplayed()) {
				divorcee_intermediate_skip.click();

			}
		} catch (Exception e) {
			System.out.println("Intermediate pages handled");
		}
		Thread.sleep(1000);
		try {
			driver.findElement(By.xpath("//*[@id=\"conform\"]/div/div/div/a[1]")).click();
		} catch (Exception e) {
			System.out.println("No Intermediate pages");
		}
		Thread.sleep(1000);
		try {
			driver.findElement(By.xpath("//a[contains(text(),' Skip >>')]")).click();
		} catch (Exception e) {
			System.out.println("No Intermediate pages");
		}

	//AD Pages
		Thread.sleep(3000);
		try {
			driver.findElement(By.xpath("//*[@id=\"special_offer_lightpic1\"]/div[1]/div/a/img")).click();
		} catch (Exception e) {
			System.out.println("ADs Closed Successfully");
		}
		Thread.sleep(3000);
		
		////////////////////   
		
		
		////////////////////////////////////////////////
		
		
		
		try {
			acc.moveToElement(driver.findElement(By.xpath("//*[@id=\"topnav-login-menu\"]/div[3]/div[2]/div[1]/a/img"))).build().perform();
			Thread.sleep(3000);
		} catch (Exception e) {
			acc.moveToElement(driver.findElement(By.xpath("//*[@id=\"topnav-login-menu\"]/div[3]/div[2]/div[1]/a"))).build().perform();
			Thread.sleep(3000);
		}
		
		
		acc.moveToElement(driver.findElement(By.xpath("//*[@id=\"userpop\"]/div[2]/div/div[3]/div[1]/ul/li[1]/a"))).build().perform();
		Thread.sleep(2000);
		
		BaseTest.click(driver.findElement(By.xpath("//*[@id=\"userpop\"]/div[2]/div/div[3]/div[1]/ul/li[1]/a")));
		Thread.sleep(5000);
		
		//  Self View Profile
		BaseTest.click(driver.findElement(By.xpath("//a[contains(text(),'View my profile')]")));
		Thread.sleep(5000);
		
		String Parent = driver.getWindowHandle();
		try {
			
			//String Parent = driver.getWindowHandle();
			
			java.util.Set<String> child =  driver.getWindowHandles();
			
			for (String handle : child) {
				
				if (!Parent.equals(handle)) {
					Thread.sleep(2000);
					driver.switchTo().window(handle);	
				}	
						}

		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		///   Getting Values From Self View Profile
		Thread.sleep(2000);
		String Gender = driver.findElement(By.xpath("//span[contains(text(),'Gender')]//following::span[2]")).getText().trim();
		System.out.println("Gender : "+ Gender);
		
		Thread.sleep(2000);
		
		////span[contains(text(),' Marital Status')]//following::span[2]
		String  Marital_Status = driver.findElement(By.xpath("//span[contains(text(),' Marital Status')]//following::span[2]")).getText().trim();
		System.out.println(Marital_Status);
		Thread.sleep(2000);
		
		
		String age = driver.findElement(By.xpath("//span[contains(text(),'Age')]//following::span[2]")).getText().trim();
		System.out.println(age);
		Thread.sleep(2000);
		
		String[] A = age.split(" ");
		String Ag = A[0].toString().trim();
		  Age = Integer.parseInt(Ag);
		System.out.println("Age : "+ Age);
		Thread.sleep(2000);
		
		
		if (Gender.equals("Male")) {
			
			if (Age==18 || Age < 30) {				
				int F = Age - 10;				
				int T = Age+1;								
				if (F==20 || F > 10) {				
					AgeFrom = 21;
					AgeTo = T;
					System.out.println("AgeFrom : "+ AgeFrom);
					System.out.println("AgeTo : "+ AgeTo);					
				}
				
				
			} else if (Age==30 || Age < 40) {			
				int F = Age - 10;				
				int T = Age + 2 ;				
				if (F == 20 || F > 10) {				
					AgeFrom = 21 ;
					AgeTo = T ;
					System.out.println("AgeFrom : "+ AgeFrom);
					System.out.println("AgeTo : "+ AgeTo);			
				}
			}	
				else if (Age == 40 || Age < 50) {				
					AgeFrom = Age - 10 ;
					AgeTo = Age + 3;
					System.out.println("AgeFrom : "+ AgeFrom);
					System.out.println("AgeTo : "+ AgeTo);			
				}
				
				else if (Age == 50 || Age < 60) {					
					AgeFrom = Age - 15;
					AgeTo = Age + 4;					
					System.out.println("AgeFrom : "+ AgeFrom);
					System.out.println("AgeTo : "+ AgeTo);				
				} 
				
				else if (Age == 60 || Age < 70) {				
					AgeFrom = Age - 15 ;
					AgeTo = Age + 4;				
					if (AgeTo == 70 || Age > 70 ) {						
						AgeTo = 70 ;						
					}
					
					System.out.println("AgeFrom : "+ AgeFrom);
					System.out.println("AgeTo : "+ AgeTo);
					
				}		
			
		} else {

		}
		
		//////////
		
		//Height
				String Height1 = driver.findElement(By.xpath("(//span[contains(text(),'Height')]//following::span[2])[1]")).getText().trim();
				System.out.println(Height);
				Thread.sleep(2000);
				
				if (Height1.contains("in")) {
					
					String[] He = Height1.split(" / ");
					String Hei = He[0].toString().trim();
					
					String[] Heii = Hei.split(" ft ");				
					String ft = Heii[0].toString().trim();
					Integer Feet = Integer.parseInt(ft);
					
					String[] In = Heii[1].split(" in");
					String Inc = In[0].toString().trim();
					Integer Inch = Integer.parseInt(Inc);
					
					String Heiig = ft+"."+Inc;
					Height = Float.parseFloat(Heiig);
					System.out.println(Height);
					
				} else {
					
					String[] He = Height1.split(" / ");
					String Hei = He[0].toString().trim();
					
					String[] Heii = Hei.split(" ft ");				
					String ft = Heii[0].toString().trim();
					Integer Feet = Integer.parseInt(ft);
					
					String Heiig = ft+"."+"0";
					 Height = Float.parseFloat(Heiig);
					System.out.println(Height);
					

				}
				
			if (Gender.equals("Male")) {
				
				String HeightFroom = "4 feet";
				String HeightToo = Height1;
				
				
				System.out.println("Height From : "+HeightFroom);
				System.out.println("Height To"+HeightToo);
				
			}	
				
			
			
			
			
			//////
			if (Gender.equals("Male")) {
				
				//Marital_Status.
				
			}
		
		
		

	}
	
	@AfterTest
	public void tearDown() {
		

	}
	
	

}
