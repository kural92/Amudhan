package SprintTask;

import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.wcsm.WhoCanSeeMe;

import base.BaseTest;

public class WhoCanSeeMeFemale extends BaseTest{

	int Age1,Age2,Age, AgeFrom, AgeTo, Annual_Incomefrom11,Annual_IncomeTo11,Annual_Incomefrom22,Annual_IncomeTo22;
	String Marital_status,Hei,Physical_status,Mother_Tongue, Caste , SubCaste , Star, Rassi, Occupation , Country , State , Citizenship, Dosham;
	Float Height, HeightFrom, HeightTo;
	String Unmarry,Seperated,widow,divorcee,doesnot,Annual_Income, Income,Annual_Incomefrom,Annual_IncomeTo,Annual_Income1, Income1,Annual_Incomefrom1,Annual_IncomeTo1;
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
	
	
	@Test()
	public void whoCanSee() throws Exception {
		
		Actions acc = new Actions(driver);
		Robot r = new Robot();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		JavascriptExecutor js  = (JavascriptExecutor)driver;
		WhoCanSeeMe w  = new WhoCanSeeMe(driver);
		
		
		Thread.sleep(3000);
		driver.get("https://www.communitymatrimony.com");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/form/div[1]/input")).click();
		
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/form/div[1]/input")).sendKeys("AGR159");

		Thread.sleep(2000);
		driver.findElement(By.id("passwordClear1")).click();
		
		driver.findElement(By.id("password1")).sendKeys("cbstest");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/form/div[2]/input[3]")).click();
		Thread.sleep(3000);
		
		/////////////////// Intermediate Page  ////////////
		
		
		while (true){
		    WebElement button = null;
		    try {
		      button = driver.findElement(By.xpath("//*[@class='nomsg mediumtxt  pad10 ']"));
		    } catch (NoSuchElementException ex){
		      break;   // button is missing, exit the loop
		    }
		    if (button.isDisplayed() == true) {
		      break;   // button is hidden, exit the loop
		    }
		
		
		}
		

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
		
		
		// Age
		String age = driver.findElement(By.xpath("//span[contains(text(),'Age')]//following::span[2]")).getText().trim();
		System.out.println(age);
		Thread.sleep(2000);
		
		
		//Height
		String Height1 = driver.findElement(By.xpath("(//span[contains(text(),'Height')]//following::span[2])[1]")).getText().trim();
		System.out.println(Height);
		Thread.sleep(2000);
		
		
		
		
		////span[contains(text(),' Marital Status')]//following::span[2]
		String  Marital_Status = driver.findElement(By.xpath("//span[contains(text(),' Marital Status')]//following::span[2]")).getText().trim();
		System.out.println(Marital_Status);
		Thread.sleep(2000);
		
		
		// Religion (//span[contains(text(),'Religion')]//following::span[2])[1]
		
		String  Religion = driver.findElement(By.xpath("(//span[contains(text(),'Religion')]//following::span[2])[1]")).getText().trim();
		System.out.println(Religion);
		Thread.sleep(2000);
		
		// Dosham 
		String  Dosham = driver.findElement(By.xpath("(//span[contains(text(),'Dosham')]//following::span[2])[1]")).getText().trim();
		System.out.println(Dosham);
		Thread.sleep(2000);
		
		// Education
		String  Education = driver.findElement(By.xpath("(//span[contains(text(),'Education')]//following::span[2])[1]")).getText().trim();
		System.out.println(Education);
		Thread.sleep(2000);
		
		// Occupation
		String  Occupation = driver.findElement(By.xpath("(//span[contains(text(),'Occupation')]//following::span[2])[1]")).getText().trim();
		System.out.println(Occupation);
		Thread.sleep(2000);
		
		
		// Physical_Status
		String  Physical_Status = driver.findElement(By.xpath("(//span[contains(text(),'Physical Status')]//following::span[2])[1]")).getText().trim();
		System.out.println(Physical_Status);
		Thread.sleep(2000);
		
		
		// Mother_Tongue
		String  Mother_Tongue = driver.findElement(By.xpath("(//span[contains(text(),'Mother Tongue')]//following::span[2])[1]")).getText().trim();
		System.out.println(Mother_Tongue);
		Thread.sleep(2000);
		
		// Star
		String  Star = driver.findElement(By.xpath("(//span[contains(text(),'Star')]//following::span[2])[1]")).getText().trim();
		System.out.println(Star);
		Thread.sleep(2000);
		
		
		//Annual Income
		if (driver.findElement(By.xpath("(//span[contains(text(),'Annual Income')])[1]")).isDisplayed()) {
			
			Income = driver.findElement(By.xpath("((//span[contains(text(),'Annual Income')])//following::span[2])[1]")).getText();
			System.out.println(Income);
			
		}
		
		try {
			
			String[] AI = Income.split(" - ");
			String Ain = AI[0].toString().trim();
			String[] Ainc = Ain.split("Rs. ");
			String Ainco = Ainc[1].toString().trim();
			Integer Ainco11 = Integer.parseInt(Ainco);
			System.out.println(Ainco11);
			
			
			
			if (Ainco11<2) {
				Annual_Incomefrom = "Any";
				System.out.println(Annual_Incomefrom);
				
			} else {
               int fromin = Ainco11-2;
               Annual_Incomefrom11 = fromin;
               System.out.println(Annual_Incomefrom11);
			}
			
			
			
			
			
			
			String Ain1 = AI[1].toString().trim();
			String[] Ainc1 = Ain1.split(" Lakhs");
			String Ainco1 = Ainc1[0].toString().trim();
			Integer Ainco22 = Integer.parseInt(Ainco1);
			System.out.println(Ainco22);
			
			
			
			if (Ainco22>2) {
				Annual_IncomeTo = "Any";
				System.out.println(Annual_IncomeTo);
				
			} /*else {
               int fromin1 = Ainco22-2;
               Annual_IncomeTo11 = fromin1;
               System.out.println(Annual_IncomeTo11);
			}
			*/
			
		} catch (Exception e) {
			
		}
		
		
/*		// Star
		String  Star1 = driver.findElement(By.xpath("(//span[contains(text(),'Star')]//following::span[2])[1]")).getText().trim();
		System.out.println(Star);
		Thread.sleep(2000);
				
				
		// Star
		String  Star2 = driver.findElement(By.xpath("(//span[contains(text(),'Star')]//following::span[2])[1]")).getText().trim();
		System.out.println(Star);
		Thread.sleep(2000);
				
				
		// Star
		String  Star3 = driver.findElement(By.xpath("(//span[contains(text(),'Star')]//following::span[2])[1]")).getText().trim();
		System.out.println(Star);
		Thread.sleep(2000);
		*/
		
		String[] A = age.split(" ");
		String Ag = A[0].toString().trim();
		  Age = Integer.parseInt(Ag);
		System.out.println("Age : "+ Age);
		Thread.sleep(2000);
		
		
		if (Gender.equals("Female")) {
			
			if (Age==18 || Age < 30) {				
				int F = Age-1;				
				int T = Age+10;							
				if (F==18 || F < 10) {					
					AgeFrom = 21;
					AgeTo = T;
					System.out.println("AgeFrom : "+ AgeFrom);
					System.out.println("AgeTo : "+ AgeTo);				
				}  else {
					AgeFrom=F;
					AgeTo=T;
					System.out.println("AgeFrom : "+ AgeFrom);
					System.out.println("AgeTo : "+ AgeTo);	
				}

				
			} else if (Age==30 || Age < 40) {				
				int F = Age - 2;		
				int T = Age + 10 ;					
					System.out.println("AgeFrom : "+ AgeFrom);
					System.out.println("AgeTo : "+ AgeTo);
			
				} else if (Age == 40 || Age < 50) {					
					AgeFrom = Age - 3;
					AgeTo = Age + 15;
					System.out.println("AgeFrom : "+ AgeFrom);
					System.out.println("AgeTo : "+ AgeTo);				
					
				} else if (Age == 50 || Age < 60) {					
					AgeFrom = Age - 4;
					AgeTo = Age + 15;				
					System.out.println("AgeFrom : "+ AgeFrom);
					System.out.println("AgeTo : "+ AgeTo);
					
				}  else if (Age <= 60 ) {					
					AgeFrom = Age - 4 ;
					AgeTo = Age + 10;
					if (AgeTo == 70 || Age > 70 ) {						
						AgeTo = 60 ;					
					}
					
					System.out.println("AgeFrom : "+ AgeFrom);
					System.out.println("AgeTo : "+ AgeTo);
					
				}
			
			
			
			
			if (Height1.contains("in")) {
				
				String[] He = Height1.split(" / ");
				 Hei = He[0].toString().trim();
				
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
			
		if (Gender.equals("Female")) {
			
			String HeightFroom = Hei;
			String HeightToo = "7 feet 11 inches";
			
			
			System.out.println("Height From : "+HeightFroom);
			System.out.println("Height To"+HeightToo);
			
		}	
		
		
	//	Marital_Status="Any";		
	//	System.out.println(Marital_Status);
		
		Physical_Status = "Any";
		System.out.println(Physical_Status);
		
		Mother_Tongue="Any";
		System.out.println(Mother_Tongue);
		
		Occupation="Any";
		System.out.println(Occupation);
		
		Education="Any";
		System.out.println(Education);
		
		Star = "Any";
		System.out.println(Star);
		
		Rassi = "Any";
		System.out.println(Rassi);
		
	
			}
			
			
		 else {

		}
		
		
		//////////////////////////////////////////////////////////////////
		
		
		try {
			acc.moveToElement(driver.findElement(By.xpath("//*[@id=\"topnav-login-menu\"]/div[3]/div[2]/div[1]/a/img"))).build().perform();
			Thread.sleep(3000);
		} catch (Exception e) {
			acc.moveToElement(driver.findElement(By.xpath("//*[@id=\"topnav-login-menu\"]/div[3]/div[2]/div[1]/a"))).build().perform();
			Thread.sleep(3000);
		}
		// Privacy Settings
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'Privacy Settings')]")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'Who can see me')]")).click();
		
		// AGe From
		Thread.sleep(3000);
		WebElement Agee = driver.findElement(By.id("wcsmAgeFrom"));
		Select fr = new Select(Agee);
		String fro = fr.getFirstSelectedOption().getText();
		String from = fro.toString();
		System.out.println("WCSM AGEFROM : "+ fro);
		String[] A1 = fro.split(" ");
		String Ag1 = A1[0].toString().trim();
		 Age1 = Integer.parseInt(Ag1);
		System.out.println("WCSM AGEFROM : "+ Age1);
		
		// Age To
		Thread.sleep(3000);
		WebElement Ageee = driver.findElement(By.id("wcsmAgeTo"));
		Select fre = new Select(Ageee);
		String froe = fre.getFirstSelectedOption().getText();
		String Toe = froe.toString();
		System.out.println("WCSM AGETO : "+Toe);
		String[] A2 = fro.split(" ");
		String Ag2 = A2[0].toString().trim();
		 Age2 = Integer.parseInt(Ag2);
		System.out.println("WCSM AGEFROM : "+ Ag2);
		
		
		
		// 
		
	/*	// Heigt From
		Thread.sleep(3000);
		WebElement Heigh = driver.findElement(By.xpath("a"));
		Select frH = new Select(Heigh);
		WebElement froH = frH.getFirstSelectedOption();
		String fromH = froH.toString();
		System.out.println(fromH);
		
		// Height To
		Thread.sleep(3000);
		WebElement HeighT = driver.findElement(By.xpath("b"));
		Select freT = new Select(HeighT);
		WebElement froeT = freT.getFirstSelectedOption();
		String ToeT = froeT.toString();
		System.out.println(ToeT);
		
		
		// Mother Tongue
				Thread.sleep(3000);
				WebElement Mot = driver.findElement(By.xpath("b"));
				Select Moth = new Select(Mot);
				WebElement Mothe = Moth.getFirstSelectedOption();
				String Mother = Mothe.toString();
				System.out.println(Mother);
				
				
	    //  Physical Status
				
			 Thread.sleep(3000);
			 String hy_status = driver.findElement(By.xpath("")).getText();
			 System.out.println(hy_status);		
		
		
		
		*/
		
		
		if (w.getWcsm_unmarried().isSelected()) {
			 Unmarry = driver.findElement(By.xpath("//*[@id=\"wcsmshow\"]/div[3]/div[2]/div[2]/div[1]/label")).getText();
			System.out.println(Unmarry);
			
		} else {}
		
		if (w.getWcsm_Seperated1().isSelected()) {
			 Seperated = driver.findElement(By.xpath("//*[@id=\"wcsmshow\"]/div[3]/div[2]/div[2]/div[4]/label")).getText();
			System.out.println(Seperated);
		}  else {}
		
		if(w.getWcsm_widow().isSelected())	{
			 widow = driver.findElement(By.xpath("//*[@id=\"wcsmshow\"]/div[3]/div[2]/div[2]/div[2]/label")).getText();
		     System.out.println(widow);
	
		} else {}
		
		if (w.getWcsm_Divorcee().isSelected()) {
			 divorcee = driver.findElement(By.xpath("//*[@id=\"wcsmshow\"]/div[3]/div[2]/div[2]/div[3]/label")).getText();
		     System.out.println(divorcee);
		}  else {}
		
		if (w.getWcsm_DoesntMater().isSelected()) {
			 doesnot =driver.findElement(By.xpath("//*[@id=\"wcsmshow\"]/div[3]/div[2]/div[2]/div[5]/label")).getText();
		     System.out.println(doesnot);
		}
		
		
	/////////////////	
		
		if (AgeFrom==Age1 && AgeTo==Age2) {
			System.out.println("Age Matches ");
		} else {
          System.err.println("Age Not Matches");
		}
		
///////////////		
		
		if (Marital_Status.equals("Unmarried")) {
			if (Marital_Status.equalsIgnoreCase(Unmarry)) {
				System.out.println("Marital Status Matched");
			} else {
				System.out.println("Not Matches");
			}
		} else {
			
			if (Marital_Status.equalsIgnoreCase(Unmarry) | Marital_Status.equalsIgnoreCase(Seperated)  |  Marital_Status.equalsIgnoreCase(divorcee) |  Marital_Status.equalsIgnoreCase(widow) | Marital_Status.equalsIgnoreCase(doesnot) ) {
				System.out.println("Marital Matches ");
			} else {
				System.out.println("Marital not Matches ");
			}
			
		}

	
		
		/////////  Annual Income
		if (w.getWcsm_IncomeFrom().isDisplayed()) {
			WebElement Inco = w.getWcsm_IncomeFrom();
			Select sIncom = new Select(Inco);
			String Sincome = sIncom.getFirstSelectedOption().getText();
			System.out.println(Sincome);
			if (Sincome.equalsIgnoreCase("Any")) {
				
				Annual_Incomefrom1 = "Any";
				System.out.println(Annual_Incomefrom1);
				
			} else {
				
				String[] FromIn = Sincome.split("Rs.");
				String FronInc = FromIn[1].toString().trim();
				String[] FromInc = FronInc.split(" ");
				String FromInco = FromInc[0].toString().trim();
				Integer aicm = Integer.parseInt(FromInco);
				System.out.println(aicm);
				
				Annual_Incomefrom22=aicm;
				System.out.println(Annual_Incomefrom22);
				
				
			}
		}
	
		if (w.getWcsm_IncomeTo().isDisplayed()) {
			WebElement Inco = w.getWcsm_IncomeTo();
			Select sIncom = new Select(Inco);
			String Sincome = sIncom.getFirstSelectedOption().getText();
			System.out.println(Sincome);
              if (Sincome.equalsIgnoreCase("Any")) {
				
				Annual_Incomefrom1 = "Any";
				System.out.println(Annual_Incomefrom1);
				
			}  else {
				
				String[] FromIn = Sincome.split("Rs.");
				String FronInc = FromIn[1].toString().trim();
				String[] FromInc = FronInc.split(" ");
				String FromInco = FromInc[0].toString().trim();
				Integer aicm = Integer.parseInt(FromInco);
				System.out.println(aicm);
				
				Annual_IncomeTo22=aicm;
				System.out.println(Annual_IncomeTo22);
				
				
			}
			
		}
		if (Annual_Incomefrom!= null) {
			
			if (Annual_Incomefrom.equalsIgnoreCase(Annual_Incomefrom1)) {
				
				System.out.println("Annual Income Matches");
				
			} else {
	             System.out.println("Not Matches");
			}
			
			
		}
		
		if (Annual_Incomefrom11==Annual_Incomefrom22 && Annual_IncomeTo11==Annual_IncomeTo22) {
			System.out.println("Annual Income Matches 1 ");
		} else {
			 System.out.println("Not Matches 1 ");
		}
		
		
	
		

	}
	
	@AfterTest
	public void tearDown() {
		

	}
	
	

}
