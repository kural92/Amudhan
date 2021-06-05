package com.utility;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.base.BaseTest;
import com.pom.ViewProfile_POM;



public class RefineValidationMethod extends BaseTest{
	
	public static int VP_Age = 0;
	public static int VP_Height;
	
	public static void refineAgeValidation() throws Throwable {
		
		ViewProfile_POM v = new ViewProfile_POM(driver);
		String Parent = driver.getWindowHandle();
		
		String Refine_AgeFrom = BaseTest.getExcelData("RefineSearch", 1, 2);
		int Age_From = Integer.parseInt(Refine_AgeFrom);
		String Refine_AgeTo = BaseTest.getExcelData("RefineSearch", 1, 3);
		int Age_To = Integer.parseInt(Refine_AgeTo);
		
		Thread.sleep(3000);
		
	List<WebElement> Refine_Profile = driver.findElements(By.xpath("//a[contains(text(),'EZH')]"));
	
	int profile_size = Refine_Profile.size();
	
	Thread.sleep(2000);
	for (int j = 0; j < 10; j++) {
		
		String matriid = Refine_Profile.get(j).getText();
		System.out.println("MatriID : "+ matriid);
		
		Thread.sleep(2000);
		try {
			BaseTest.click(driver.findElement(By.xpath("//*[@id=\"assitedform\"]/div/div/div[1]/a")));
		} catch (Exception e) {
			
		}
		//
		BaseTest.click(Refine_Profile.get(j));
		
		Thread.sleep(2000);
		try {
			BaseTest.click(driver.findElement(By.xpath("//*[@id=\"assitedform\"]/div/div/div[1]/a")));
		} catch (Exception e) {
			
		}
////////////////////////////////////////////////////////		
try {		
		Thread.sleep(3000);
		Set<String> child = driver.getWindowHandles();
		
		for (String handle : child) {
			
			if (!Parent.contains(handle)) {
			Thread.sleep(2000);
			driver.switchTo().window(handle);
			}
		}
		
}
catch (Exception e) {
	// TODO: handle exception
}
/////////////////////////////////////////////
			String Refine_Result_Age = v.getVP_Age().getText();
			System.out.println("Age : "+ Refine_Result_Age);
			
			Thread.sleep(2000);
			if (Refine_Result_Age.contains("yrs")) {
				String[] Age_spl = Refine_Result_Age.split("yrs");
				String Age_spli = Age_spl[0].toString().trim();
				  VP_Age = Integer.parseInt(Age_spli);
				System.out.println("Result Age : "+ VP_Age);				
			}
	////////////////			
		Thread.sleep(2000);
		if (Age_From==VP_Age ||  Age_To>VP_Age) {
			System.out.println(VP_Age +" Matches with the refine search result Age between : " +Age_From+" and "+ Age_To );
		}else {
			System.err.println(VP_Age +" not Matches with the refine search result Age between : " +Age_From+" and "+ Age_To );
		}
	//////////////////////////////
		try {
			Set<String> child = driver.getWindowHandles();
			for (String handle : child) {
				if (!Parent.contains(handle)) {
					Thread.sleep(2000);
					driver.close();
					Thread.sleep(2000);
					driver.switchTo().window(Parent);
					Thread.sleep(5000);
				}
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	///////////////////////////////////////////
		
		
	}
		

	}
	
	
	
	public static void refineHeightValidation() throws Throwable {
		
		String Parent = driver.getWindowHandle();
		ViewProfile_POM v = new ViewProfile_POM(driver);
		
		String Refine_HeightFrom = BaseTest.getExcelData("RefineSearch", 1, 4 );
		String[] Heig_spl = Refine_HeightFrom.split("-");
		String Heigh_spl = Heig_spl[1].toString().trim();
		String[] Heigh_spli = Heigh_spl.split("cm");
		String Height_split = Heigh_spli[0].toString().trim();
		int Height_From = Integer.parseInt(Height_split);
		System.out.println("Height From : "+Height_From);
	
		String Refine_HeightTo = BaseTest.getExcelData("RefineSearch", 1, 5);
		String[] Heig_spl1 = Refine_HeightTo.split("-");
		String Heigh_spl1 = Heig_spl1[1].toString().trim();
		String[] Heigh_spli1 = Heigh_spl1.split("cm");
		String Height_split1 = Heigh_spli1[0].toString().trim();
		int Height_To= Integer.parseInt(Height_split1);
		System.out.println("Height To : "+Height_To);
		
		
		Thread.sleep(3000);
		
	List<WebElement> Refine_Profile = driver.findElements(By.xpath("//a[contains(text(),'EZH')]"));
	
	int profile_size = Refine_Profile.size();
	
	Thread.sleep(2000);
	for (int j = 0; j < 10; j++) {
		
		String matriid = Refine_Profile.get(j).getText();
		System.out.println("MatriID : "+ matriid);
		
		Thread.sleep(2000);
		try {
			BaseTest.click(driver.findElement(By.xpath("//*[@id=\"assitedform\"]/div/div/div[1]/a")));
		} catch (Exception e) {
			
		}
		//
		BaseTest.click(Refine_Profile.get(j));
		
		Thread.sleep(2000);
		try {
			BaseTest.click(driver.findElement(By.xpath("//*[@id=\"assitedform\"]/div/div/div[1]/a")));
		} catch (Exception e) {
			
		}
////////////////////////////////////////////////////////		
try {		
		Thread.sleep(3000);
		Set<String> child = driver.getWindowHandles();
		
		for (String handle : child) {
			
			if (!Parent.contains(handle)) {
			Thread.sleep(2000);
			driver.switchTo().window(handle);
			}
		}
		
}
catch (Exception e) {
	// TODO: handle exception
}
/////////////////////////////////////////////
			String Refine_Result_Height = v.getVP_Height().getText();
			System.out.println("Height : "+ Refine_Result_Height);
			
			Thread.sleep(2000);
			if (Refine_Result_Height.contains(" / ")) {
				//String[] Height_spl = Refine_Result_Height.split(" / ");
				String[] Heig_spl11 = Refine_Result_Height.split(" / ");
				String Heigh_spl11 = Heig_spl11[1].toString().trim();
				String[] Heigh_spli11 = Heigh_spl11.split("cm");
				String Height_split11 = Heigh_spli11[0].toString().trim();
				VP_Height= Integer.parseInt(Height_split11);
				System.out.println("Height To : "+VP_Height);				
			}
	////////////////			
		Thread.sleep(2000);
		if (Height_From==VP_Height ||  Height_To>VP_Height) {
			System.out.println(VP_Height +" Matches with the refine search result Height between : " +Height_From+" and "+ Height_To );
		}else {
			System.err.println(VP_Height +" not Matches with the refine search result Height between : " +Height_From+" and "+ Height_To );
		}
	//////////////////////////////
		try {
			Set<String> child = driver.getWindowHandles();
			for (String handle : child) {
				if (!Parent.contains(handle)) {
					Thread.sleep(2000);
					driver.close();
					Thread.sleep(2000);
					driver.switchTo().window(Parent);
					Thread.sleep(5000);
				}
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	///////////////////////////////////////////
		
		
	}
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
