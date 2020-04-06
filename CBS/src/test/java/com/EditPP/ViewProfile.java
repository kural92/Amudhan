package com.EditPP;

import java.awt.Robot;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import base.BaseTest;
import pom.cmlogin.EditPP_POM;
import pom.cmlogin.GothramPOM;
import pom.cmlogin.ViewProfile_POM;

public class ViewProfile extends BaseTest{
	
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
	public void viewProfile_getText() throws Throwable {
		
		GothramPOM g = new GothramPOM(driver);
		EditPP_POM e = new EditPP_POM(driver);
		ViewProfile_POM v= new ViewProfile_POM(driver);
		Actions acc = new Actions(driver);
		Robot r = new Robot();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		JavascriptExecutor js  = (JavascriptExecutor)driver;
		
		
		driver.get("https://www.communitymatrimony.com");
		driver.manage().window().maximize();
		BaseTest.click(g.getMatriID());
		BaseTest.typeData(g.getMatriID(), "AGR755407");
		BaseTest.click(g.getPasswordClear());
		BaseTest.typeData(g.getPassword(), "cbstest");
		BaseTest.click(g.getLogin_btn());
		
		
		String parent = driver.getWindowHandle();
		
		try {
			BaseTest.click(g.getInterMediate_page());
		} catch (Exception e2) {
			// TODO: handle exception
		}
		
		try {
			BaseTest.click(g.getInterMediate_page1());
		} catch (Exception e2) {
			// TODO: handle exception
		}
		
		try {
			BaseTest.click(driver.findElement(By.xpath("//*[@id=\"special_offer_lightpic1\"]/div[1]/div/a/img")));
		} catch (Exception e2) {
			// TODO: handle exception
		}
		
		//  Matches --  Click
		Thread.sleep(2000);
		BaseTest.click(driver.findElement(By.xpath("//*[@id=\"topnav-login-menu\"]/div[2]/div[2]/a")));
		
		
		List<WebElement> no_profile = driver.findElements(By.xpath("//input[@value='Edit Partner Preference']"));
		if (no_profile.size()>0) {
			System.err.println("No Profile in Listing to Verify");
		} else {

		
		Thread.sleep(5000);
		BaseTest.click(driver.findElement(By.id("ignorecrossbefore_0")));
		
		Thread.sleep(2000);
		Set<String> child = driver.getWindowHandles();
		for (String handle : child) {
			if (!parent.equals(child)) {
				Thread.sleep(2000);
				driver.switchTo().window(handle);
			}
		}
		
		/*Thread.sleep(5000);
		js.executeAsyncScript("window.scrollBy(0,500)");ju
		
		Thread.sleep(5000);
		js.executeAsyncScript("window.scrollBy(0,500)");
		*/
		Thread.sleep(5000);
		 Profile_Created = v.getVP_Profile_Created().getText();
		System.out.println("Profile Created by : "+ Profile_Created);
		
		 Name = v.getVP_Name().getText();   // 
		System.out.println("Name : "+ Name);
		
		 Age = v.getVP_Age().getText();
		System.out.println("Age : "+ Age);
		
		 Height = v.getVP_Height().getText();
		System.out.println("Height : "+ Height);
		
		 Gender = v.getVP_Gender().getText();
		System.out.println("Gender : "+ Gender);
		
		 Marital_status = v.getVP_Marital_Status().getText();
		System.out.println("Marital Status : "+ Marital_status);
		
		 Mother_Tongue = v.getVP_MotherTongue().getText();
		System.out.println("Mother Tongue : "+ Mother_Tongue);
		
		 Physical_Status = v.getVP_Physical_Status().getText();
		System.out.println("Physical Status : "+ Physical_Status);
		
		 Body_Type = v.getVP_BodyType().getText();
		System.out.println("Body Type : "+ Body_Type);
		if (Body_Type.equalsIgnoreCase("Request for")) {
			BaseTest.click(v.getVP_BodyType());
			Thread.sleep(2000);
			BaseTest.click(driver.findElement(By.id("accept_close")));
		} else {

		}
		
		 Complexion = v.getVP_Complexion().getText();
		System.out.println("Complexion : "+ Complexion);
		if (Body_Type.equalsIgnoreCase("Request for")) {
			BaseTest.click(v.getVP_Complexion());
			Thread.sleep(2000);                            //
			BaseTest.click(driver.findElement(By.id("accept_close")));
		} else {

		}
		
		 Language__Known = v.getVP_Language_Known().getText();
		System.out.println("Language Known : "+ Language__Known);
		if (Body_Type.equalsIgnoreCase("Request for")) {
			BaseTest.click(v.getVP_Language_Known());
			Thread.sleep(2000);
			BaseTest.click(driver.findElement(By.id("accept_close")));
		} else {

		}
		
	try {	
		 Star = v.getVP_Star().getText();
		System.out.println("Star " + Star);
	} catch (Exception e1) {	}	
	try {
		 Rasi = v.getVP_Raasi().getText();
		System.out.println("Raasi : "+ Rasi);
	} catch (Exception e2) {	}
	
	try {
		 SubCaste = v.getVP_SubCaste().getText();
		System.out.println("Raasi : "+ SubCaste);
	} catch (Exception e3) {	}	
	
	try {
		 Gothram = v.getVP_Gothram().getText();
		System.out.println("Gothram : "+ Gothram);
	} catch (Exception e2) {	}
	try {
		 Dosham = v.getVP_Chevvai_Dosham().getText();
		System.out.println("Dosham : "+ Dosham);
	} catch (Exception e2) {	}
	
	try {
	 Education = v.getVP_Education().getText();
	System.out.println("Education : "+ Education);
	} catch (Exception e2) {	}
	
	try {
	 Education_Detail = v.getVP_EducationDetail().getText();
	System.out.println("Education_Detail : "+Education_Detail);
	} catch (Exception e2) {	}
	
	try {
	 Occupation = v.getVP_Occupation().getText();
	System.out.println("Occupation Detail : "+ Occupation);
	} catch (Exception e2) {	}
	
	try {
	 Occupation_Detail = v.getVP_OccupationDetail().getText();
	System.out.println("Occupation Detail : "+Occupation_Detail);
	} catch (Exception e2) {	}
	
	try {
	 Employeed_In = v.getVP_EmployeedIN().getText();
	System.out.println("Employeed In "+Employeed_In);
	} catch (Exception e2) {	}
	
	try {
	 Annual_Income = v.getVP_Annual_Income().getText();  //
	System.out.println("Annual Income : "+Annual_Income);
	} catch (Exception e2) {	}
	
	try {
	 City = v.getVP_City().getText();
	System.out.println("City : "+City);
	} catch (Exception e2) {	}
	
	try {
	 State = v.getVP_State().getText();  //
	System.out.println("State : "+State);
	} catch (Exception e2) {	}
	
	try {
	 Country = v.getVP_Country().getText();
	System.out.println("Country : "+Country);
	} catch (Exception e2) {	}
	
	try {
	 Citizenship = v.getVP_Citizenship().getText();
	System.out.println("CitizenShip : "+Citizenship);
	} catch (Exception e2) {	}
	
	
	//////////////////////////////////////////////////////////////////////////////////////////////////////////
	//     /***   Verification Using Excel Value .
	
		String XL_Marital_Status = BaseTest.getExcelData("EditPP", 1, 1);
		String XL_AgeFrom = BaseTest.getExcelData("EditPP", 1, 3);
		String XL_AgeTo = BaseTest.getExcelData("EditPP", 1, 4);
		String XL_HeightFrom = BaseTest.getExcelData("EditPP", 1, 5);
		String XL_HeighTo = BaseTest.getExcelData("EditPP", 1, 6);
		String XL_Physical_Status = BaseTest.getExcelData("EditPP", 1, 8);
		String XL_MotherTongue = BaseTest.getExcelData("EditPP", 1, 7);
		String XL_Caste = BaseTest.getExcelData("EditPP", 1, 9);
		String XL_SubCaste = BaseTest.getExcelData("EditPP", 1, 10);
		String XL_Star = BaseTest.getExcelData("EditPP", 1, 11);
		String XL_Gothram = BaseTest.getExcelData("EditPP", 1, 12);
		String XL_Dosham = BaseTest.getExcelData("EditPP", 1, 13);
		String XL_Education = BaseTest.getExcelData("EditPP", 1, 15);
		String XL_Occupation = BaseTest.getExcelData("EditPP", 1, 18);
		String XL_Citizenship = BaseTest.getExcelData("EditPP", 1, 19);
		String XL_Coutry_Living = BaseTest.getExcelData("EditPP", 1, 20);
		String XL_Residing_State_India = BaseTest.getExcelData("EditPP", 1, 24);
		String XL_Eating = BaseTest.getExcelData("EditPP", 1, 21);
		String XL_Smoking = BaseTest.getExcelData("EditPP", 1, 22);	
		String XL_Drinking = BaseTest.getExcelData("EditPP", 1, 23);	
	
		
		if (XL_Marital_Status.contains(Marital_status)) {
			System.out.println("Marital Status  Verification - PASSed");
		} else {
			System.out.println("Marital Status  Verification - Failed");
		}
		
		
		if (XL_Physical_Status.contains(Physical_Status)) {
			System.out.println("Physical Status  Verification - PASSED");
		} else {
			System.out.println("Physical Status  Verification - Failed");
		}
	
		
		if (XL_MotherTongue.contains(Mother_Tongue)) {
			System.out.println("Mother Tongue Verification - PASSED");
		} else {
			System.out.println("Mother Tongue  Verification - Failed");
		}
		
		if (XL_SubCaste.contains(SubCaste)) {
			System.out.println("SubCaste  Verification - PASSED");
		} else {
			System.out.println("SubCaste Verification - Failed");
		}
	
}
///////////////////////////////////////////////////////////////////////////
		
		
		
		
		
}
}
