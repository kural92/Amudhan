package com.testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.base.Base;
import com.pom.EditProfile;
import com.pom.Inbox;

public class EditProfileTest extends Base{

	   WebDriver driver;
	   
	   
	   @BeforeTest
	   public void setUp() {
		
		   System.setProperty("webdriver.chrome.driver", "C:\\Users\\amuthan\\eclipse-workspace\\CBS_1\\Driver\\chromedriver.exe");
		   ChromeOptions options = new ChromeOptions();
		   options.addArguments("--disable-notifications");
		   driver = new ChromeDriver(options);
		 

	}
	   
	   @Test
	   public void editProfileTest2() throws Exception {
		
		   Inbox i = new Inbox(driver);
		   EditProfile E  = new EditProfile(driver);
		   Actions acc = new Actions(driver);
		   WebDriverWait wait = new WebDriverWait(driver, 30);
		   JavascriptExecutor js = (JavascriptExecutor)driver;
		   
		   driver.get("https://www.communitymatrimony.com");  
		   driver.manage().window().maximize();
		   
		   Base.click(i.getMatriId());
		   Base.typeData(i.getMatriId(), "EZH710533");
		   Thread.sleep(2000);
		   
		   Base.click(i.getPaswwordclr());
		   Base.typeData(i.getPassword(), "cbstest1");
		   Thread.sleep(3000);
		   
		   Base.click(i.getLoginbtn());
		   
		   ///////////////////////////////  Intermediate Pages  ////////////////////////// 
		   
		   try {
				WebElement photo_add = driver.findElement(By.xpath("/html/body/div[2]/a"));
				if (photo_add.isDisplayed()) {
					photo_add.click();
					driver.findElement(By.xpath("//*[@id=\"conform\"]/div/div/div/a[1]")).click();
					driver.findElement(By.xpath("//*[@id=\"reason3\"]")).click();
					driver.findElement(By.xpath("//*[@id=\"skipphotoclick\"]")).click();
					
				}
				
			} catch (Exception e) {
				System.out.println("NO Photo Page to Skip");
			}
			
			
			try {
				WebElement skip_matches = driver.findElement(By.xpath("//a[contains(text(),'Skip to Daily Matches >>')]"));
				if (skip_matches.isDisplayed()) {
					skip_matches.click();
					
				}
			} catch (Exception e) {
				System.out.println("No Intermediate pages");
			}
			
			try {
				WebElement element = driver.findElement(By.xpath("/html/body/div[1]/div[2]/a"));
				if (element.isDisplayed()) {
					element.click();
					
				}
			} catch (Exception e) {
				System.out.println("No Intermediate pages");
			}
			
			try {
				WebElement divorcee_intermediate_skip = driver.findElement(By.xpath("/html/body/div[1]/div/div[4]/a"));
				if (divorcee_intermediate_skip.isDisplayed()) {
					divorcee_intermediate_skip.click();
					
				}
			} catch (Exception e) {
				System.out.println("No Intermediate pages");
			}
			
			try {
				driver.findElement(By.xpath("//*[@id=\"conform\"]/div/div/div/a[1]")).click();
			} catch (Exception e) {
				System.out.println("No Intermediate pages");
			}
			
			// AD Pages
			 
			 try {
				 driver.findElement(By.xpath("//*[@id=\"special_offer_lightpic1\"]/div[1]/div/a/img")).click();
			} catch (Exception e) {
				System.out.println("ADs not Closed");
			}
			 
			 
			 ///////////////////////////////////////////////////////////////////////////////////////////////////
			 
			 
			 Thread.sleep(2000);
			 acc.moveToElement(E.getLogout_menu()).build().perform();
			 Thread.sleep(2000);
			 acc.moveToElement(E.getEdit_profile()).build().perform();
			 Base.click(E.getEdit_profile());
			 Thread.sleep(4000);
			 
			 
			 //////////////////////////////////////////////////////////////////////////////////
		    
	    	 Base.select_index(E.getProfile_created_by(), 4);		
			 Thread.sleep(1000);
			 
			 Base.select_text(E.getHeight(), "5 feet 8 inches");
			 Thread.sleep(1000);
			 
			 Base.select_text(E.getWeight_kgs(), "62 kg");
			 Thread.sleep(1000);
			 
			 Base.click(E.getBody_type_athletic());
			 Thread.sleep(1000);
			 
			 Base.click(E.getComplexion_Fair());
			 Thread.sleep(1000);
			 
			 Base.click(E.getPhysicalStatus_normal());
			 Thread.sleep(1000);
		try {	 
			 Base.click(E.getMarry_sameCaste_btn());
			 Thread.sleep(1000);
		} catch (Exception e) {
			
		} 
			 Base.select_index(E.getStar(), 3);
			 Thread.sleep(1000);
			 
			 Base.select_index(E.getRaasi(), 11);
			 Thread.sleep(1000);
			 
			 Base.click(E.getEatingHabits_NonVeg());
			 Thread.sleep(1000);
			 
			 Base.click(E.getSmokingHabits_nonSmoker());
			 Thread.sleep(1000);
			 
			 Base.click(E.getDrinkingHabits_nondrinker());
			 Thread.sleep(1000);
			 try {
				 
				 Base.click(driver.findElement(By.id("dosham2")));
				 Thread.sleep(1000);
				 js.executeScript("window.scrollBy(0,350)");
				
			 Base.click(driver.findElement(By.xpath("//input[@value='Save']")));
			 } catch (Exception e) {
				// TODO: handle exception
			}
			 System.out.println("Basic Details Edited Successfully");   
			 
			 //////////////////////////////////////////////////
			 System.out.println("Editing education details Started");
			 Thread.sleep(3000);
			 
			// js.executeScript("window.scrollBy(500,0)");
			 Thread.sleep(1000);
			 Base.click(E.getEducation_occupation_edit_btn());
			 Thread.sleep(1000);
			 
			 Base.select_index(E.getEducation(),0);
			 Thread.sleep(1000);
			 
			 Base.clear(E.getEducation_detail());
			 Base.typeData(E.getEducation_detail(), "Information Technology");
			 Thread.sleep(1000);
			 
			 Base.click(E.getEmployment_private());
			 Thread.sleep(1000);
			
			 Base.select_text(E.getOccupation(), "Administrative Professional");
			 Thread.sleep(1000);
			 
			 Base.clear(E.getOccupation_detail());
			 Base.typeData(E.getOccupation_detail(), "Working In MNC");
			 Thread.sleep(1000);	
			 
			 Base.select_text(E.getAnnual_income(), "India - Rs.");
			 Thread.sleep(1000);	
			 
			 Base.select_text(E.getAnnual_income_amount(), "7 - 8 Lakhs");
			 Thread.sleep(1000);	
			 
			 Base.click(E.getEducation_occupation_save_btn());
			 Thread.sleep(1000);	
			 
			 System.out.println("Education and Occupation Details were Edited Successfully");
			 Thread.sleep(1000);	 
			 ///////////////////////////////////////////////////////////////////////////
			 
			                           ///      Family Details  ///
			 
			 Base.click(E.getFamily_edit_btn());
			 Thread.sleep(1000);	
			 
			 Base.click(E.getFamilyValue_traditional());
			 Thread.sleep(1000);	
			 
			 Base.click(E.getFamilyType_joint());
			 Thread.sleep(1000);	
			 
			 Base.click(E.getFamilyStatus_upperMiddleClass());
			 Thread.sleep(1000);	
			 
			 Base.clear(E.getNative_place());
			 Base.typeData(E.getNative_place(), "TamilNadu");
			 Thread.sleep(1000);	
			 
			 Base.clear(E.getFather_Occupation());
			 Base.typeData(E.getFather_Occupation(), "Self Employed");
			 Thread.sleep(1000);	
			 
			 Base.clear(E.getMother_Occupation());
			 Base.typeData(E.getMother_Occupation(), "House Wife");
			 Thread.sleep(1000);	
			 
			 Base.select_index(E.getNo_of_brother(), 2);
			 Thread.sleep(1000);	
			 
			 Base.select_index(E.getBrother_married(), 1);
			 Thread.sleep(1000);	
			 
			 Base.select_index(E.getNo_of_sisters(), 2);
			 Thread.sleep(1000);	
			 
			 Base.select_index(E.getSister_married(), 1);
			 Thread.sleep(2000);	
			 
			
			// wait.until(ExpectedConditions.elementToBeClickable(E.getFamily_save_btn())).click();
		     Base.click(E.getFamily_save_btn());
			 Thread.sleep(1000);	
			 
			 System.out.println("Family details were edit and saved successfully");
			 Thread.sleep(1000);	
			 
			 /////////////////////////////////   Loaction  Details   ////////
			 
			 System.out.println("Started to edit the Loacation details");
			 Thread.sleep(2000);
			 
			 Base.click(E.getLoaction_edit_btn());
			 Thread.sleep(1000);
			 
			 Base.select_text(E.getCountry_living_in(), "India");
			 Thread.sleep(1000);
			 String country = E.getCountry_living_in().getText();
			 System.out.println(country);
			 
			 //////   Other Than India Location Editing Details    //////
			 Thread.sleep(1000);
			 if (!country.equals("India")) {
				 try {
					 Base.clear(E.getPlace_of_birth());
					Base.typeData(E.getPlace_of_birth(), "India");
					Thread.sleep(1000);
					
					Base.select_text(E.getResiding_State(), "New York");
					 Thread.sleep(1000);
					 
					 Base.clear(E.getResiding_City_US());
					 Base.typeData(E.getResiding_City_US(), "Florida");
					 Thread.sleep(1000);
					 
					 Base.select_text(E.getCitizenship(), "India");
					 Thread.sleep(1000);
					 
					 Base.select_text(E.getResident_Status(), "Work permit");
					 Thread.sleep(1000);
					 
				} catch (Exception e2) {
					System.out.println("The residing country was  "+country);
				}
				
			}   else {
				
		try {	Thread.sleep(1000);
			 Base.select_text(E.getResiding_State(), "Kerala");
			 Thread.sleep(1000);
			 
			 Base.select_text(E.getResiding_City(), "Aroor");
			 Thread.sleep(1000);
			 
			 Base.select_text(E.getCitizenship(), "India");
			 Thread.sleep(1000);
			 
			
		} catch (Exception e) {
			System.out.println("The Residing country was India");
		}	
			}
			 
			 
			 Base.click(E.getLocation_save_btn());
			 Thread.sleep(1000);
			 
			 System.out.println("Location Details Edit and Saved Successfuly");
			 Thread.sleep(3000);
			 
			 
			 
			 /////////////////////////////////////////////////////////////
			          /////////    Hobbies and Intrest    ///
			 
			 
			 
			 
			
			 //////////   Logout    /////////////////
			 acc.moveToElement(E.getLogout_menu()).build().perform();
			 Thread.sleep(2000);
			 acc.moveToElement(E.getLogout()).build().perform();
			 Base.click(E.getLogout());
			 Thread.sleep(4000);

	} 
}
