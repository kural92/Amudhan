package com.pages;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;

import base.BaseTest;
import pom.cmlogin.RefineSearch_POM;

public class RefineSearchMethod extends BaseTest{
	
	
	
	
	public static void refineAge() throws Throwable {
		RefineSearch_POM rs = new RefineSearch_POM();
		JavascriptExecutor js = (JavascriptExecutor)driver;

		Thread.sleep(3000);
		BaseTest.click(rs.getMatches_btn());
		String Parent = driver.getWindowHandle();
		
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,100)");
		
		Thread.sleep(5000);
		BaseTest.click(driver.findElement(By.xpath("//*[@id=\"facetAgelabel\"]")));
		BaseTest.click(driver.findElement(By.xpath("//*[@id=\"facetAgelabel\"]")));
		
		Thread.sleep(5000);
		BaseTest.click(rs.getRefine_Age_More_Btn());
		
		Thread.sleep(2000);
		BaseTest.clear(rs.getRefine_AgeFrom());
		BaseTest.typeData(rs.getRefine_AgeFrom(), BaseTest.getExcelData("RefineSearch", 1, 2));
		BaseTest.clear(rs.getRefine_AgeTo());
		BaseTest.typeData(rs.getRefine_AgeTo(), BaseTest.getExcelData("RefineSearch", 1, 3));
		
		Thread.sleep(2000);
		BaseTest.click(rs.getRefine_Submit());
		Thread.sleep(2000);

	}
	
	
	
	public static void refineHeight() throws Throwable {
		
		
		String Parent = driver.getWindowHandle();
		RefineSearch_POM rs = new RefineSearch_POM();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,100)");
		
			
		
		Thread.sleep(5000);
		BaseTest.click(driver.findElement(By.xpath("//*[@id=\"facetHeightlabel\"]")));
		
		try {
			Set<String> child = driver.getWindowHandles();
			Thread.sleep(2000);
			for (String handle : child) {
				if(!Parent.contains(handle)) {
					Thread.sleep(1000);
					driver.switchTo().window(handle);
					Thread.sleep(2000);
					driver.close();
					driver.switchTo().window(Parent);
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		BaseTest.click(driver.findElement(By.xpath("//*[@id=\"facetHeightlabel\"]")));
		
		Thread.sleep(5000);
		BaseTest.click(rs.getRefine_Height_More_Btn());
		
		Thread.sleep(5000);
		BaseTest.select_text(rs.getRefine_HeightFrom_DD(), BaseTest.getExcelData("RefineSearch", 1, 4));
		Thread.sleep(5000);
		BaseTest.select_text(rs.getRefine_HeightTo_DD(), BaseTest.getExcelData("RefineSearch", 1, 5));
		
		Thread.sleep(2000);
		BaseTest.click(rs.getRefine_Submit());
		Thread.sleep(2000);
		
	}
	
	
	
	public static void refineMaritalStatus() throws Throwable {
		
		RefineSearch_POM rs = new RefineSearch_POM();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		String Parent = driver.getWindowHandle();


		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,200)");
		
		
	
		
		
		Thread.sleep(5000);
		BaseTest.click(driver.findElement(By.xpath("//*[@id=\"facetMaritalStatuslabel\"]")));
		
		try {
			Set<String> child = driver.getWindowHandles();
			Thread.sleep(2000);
			for (String handle : child) {
				if(!Parent.contains(handle)) {
					Thread.sleep(1000);
					driver.switchTo().window(handle);
					Thread.sleep(2000);
					driver.close();
					driver.switchTo().window(Parent);
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		try {
		BaseTest.click(driver.findElement(By.xpath("//*[@id=\"facetMaritalStatuslabel\"]")));
		}catch (Exception e) {
			// TODO: handle exception
		}
		Thread.sleep(5000);
		BaseTest.click(rs.getRefine_MaritalStatus_More_Btn());
		
		Thread.sleep(5000);
		String Marital_Status = BaseTest.getExcelData("RefineSearch", 1, 6);
		
		if(Marital_Status.contains("Unmarried")) {
		if (!rs.getRefine_marital_Unmarried().isSelected()) {
			BaseTest.click(rs.getRefine_marital_Unmarried());
		} else {
             System.out.println("Unmarried was Already Selected");
		} }
	/////////////////////////		
		if(Marital_Status.contains("Separated")) {
			if (!rs.getRefine_marital_Seperated().isSelected()) {
				BaseTest.click(rs.getRefine_marital_Unmarried());
			} else {
	             System.out.println("Separated was Already Selected");
			}	}
		
///////////////////////		
		if(Marital_Status.contains("Widow")) {
			if (!rs.getRefine_marital_Widow().isSelected()) {
				BaseTest.click(rs.getRefine_marital_Widow());
			} else {
	             System.out.println("Widow was Already Selected");
			}	}
/////////////////////////
		
		if(Marital_Status.contains("Divorced")) {
			if (!rs.getRefine_marital_Divorced().isSelected()) {
				BaseTest.click(rs.getRefine_marital_Divorced());
			} else {
	             System.out.println("Divorced was Already Selected");
			}	}
///////////////////////////

		if(Marital_Status.contains("Divorced")) {
			if (!rs.getRefine_marital_Divorced().isSelected()) {
				BaseTest.click(rs.getRefine_marital_Divorced());
			} else {
	             System.out.println("Divorced was Already Selected");
			}	}
///////////////////////////////		
		
		Thread.sleep(2000);
		BaseTest.click(rs.getRefine_Submit());
		Thread.sleep(2000);
		

	}
	
	
	
	
	
	public static void refineMotherTongue() throws Throwable {
		
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		RefineSearch_POM rs = new RefineSearch_POM();
		String Parent = driver.getWindowHandle();
		Actions acc = new Actions(driver);
		

		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,100)");
		
		
		Thread.sleep(2000);
		BaseTest.click(rs.getRefine_Show_More_Btn());
		
		try {
			Set<String> child = driver.getWindowHandles();
			Thread.sleep(2000);
			for (String handle : child) {
				if(!Parent.contains(handle)) {
					Thread.sleep(1000);
					driver.switchTo().window(handle);
					Thread.sleep(2000);
					driver.close();
					driver.switchTo().window(Parent);
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	try {		
		Thread.sleep(2000);
		BaseTest.click(rs.getRefine_Show_More_Btn());
	} catch (Exception e) {
		// TODO: handle exception
	}	
		
		Thread.sleep(5000);
		BaseTest.click(driver.findElement(By.xpath("//*[@id=\"facetMotherTonguelabel\"]")));
		
		try {
			Set<String> child = driver.getWindowHandles();
			Thread.sleep(2000);
			for (String handle : child) {
				if(!Parent.contains(handle)) {
					Thread.sleep(1000);
					driver.switchTo().window(handle);
					Thread.sleep(2000);
					driver.close();
					driver.switchTo().window(Parent);
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		//BaseTest.click(driver.findElement(By.xpath("//*[@id=\"facetMotherTonguelabel\"]")));
		String Mother_Tongue = BaseTest.getExcelData("RefineSearch", 1, 7);
		Thread.sleep(5000);
		BaseTest.click(rs.getRefine_MotherTongue_More());
		
		Thread.sleep(3000);
		BaseTest.click(rs.getRefine_MotherTongue_Choosed());
		BaseTest.select_deselectAll(rs.getRefine_MotherTongue_Choosed());
		
		Thread.sleep(3000);
		BaseTest.click(rs.getRefine_MotherTongue_Value());
		
		if (Mother_Tongue.contains(", ")) {
			String[] mother_tongue_split = Mother_Tongue.split(", ");
			for (int j = 0; j < mother_tongue_split.length; j++) {
				if (driver.findElement(By.xpath("//option[contains(text(),'"+j+"')]")).isDisplayed()) {
					Thread.sleep(3000);
					acc.moveToElement(driver.findElement(By.xpath("//option[contains(text(),'"+j+"')]"))).doubleClick().build().perform();
				} else {
					Thread.sleep(3000);
					System.out.println("The Given value "+j+"is not present in Mother Tongue DropDown");
				}
			}
		} else if (Mother_Tongue.length()<0) {
			Thread.sleep(2000);
			if (driver.findElement(By.xpath("//option[contains(text(),'"+Mother_Tongue+"')]")).isDisplayed()) {
				Thread.sleep(2000);
				acc.moveToElement(driver.findElement(By.xpath("//option[contains(text(),'"+Mother_Tongue+"')]"))).doubleClick().build().perform();
			} else {
				System.out.println("The Given value "+Mother_Tongue+"is not present in Mother Tongue DropDown");
			}
		} else {
			System.out.println("The Given value "+Mother_Tongue+"is not present in Mother Tongue DropDown");
		}
		
		
	
		Thread.sleep(2000);
		BaseTest.click(rs.getRefine_Submit());
		

	}
	
	
	public static void refineSubCaste() throws Throwable {
		
		Actions acc= new Actions(driver);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		RefineSearch_POM rs = new RefineSearch_POM();
		String Parent= driver.getWindowHandle();
		
		
		
		Thread.sleep(2000);
		BaseTest.click(rs.getRefine_Show_More_Btn());
		
		try {
			Set<String> child = driver.getWindowHandles();
			Thread.sleep(2000);
			for (String handle : child) {
				if(!Parent.contains(handle)) {
					Thread.sleep(1000);
					driver.switchTo().window(handle);
					Thread.sleep(2000);
					driver.close();
					driver.switchTo().window(Parent);
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	try {		
		Thread.sleep(2000);
		BaseTest.click(rs.getRefine_Show_More_Btn());
	} catch (Exception e) {
		// TODO: handle exception
	}	
		
		Thread.sleep(5000);
		BaseTest.click(driver.findElement(By.xpath("//*[@id=\"facetSubcastelabel\"]")));
		
		try {
			Set<String> child = driver.getWindowHandles();
			Thread.sleep(2000);
			for (String handle : child) {
				if(!Parent.contains(handle)) {
					Thread.sleep(1000);
					driver.switchTo().window(handle);
					Thread.sleep(2000);
					driver.close();
					driver.switchTo().window(Parent);
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		//BaseTest.click(driver.findElement(By.xpath("//*[@id=\"facetMotherTonguelabel\"]")));
		String SubCaste = BaseTest.getExcelData("RefineSearch", 1, 8);
		Thread.sleep(5000);
		BaseTest.click(rs.getRefine_SubCaste_More());
		
		Thread.sleep(3000);
		BaseTest.click(rs.getRefine_SubCaste_Choosed());
		BaseTest.select_deselectAll(rs.getRefine_SubCaste_Choosed());
		
		Thread.sleep(3000);
		BaseTest.click(rs.getRefine_SubCaste_Value());
		
		if (SubCaste.contains(", ")) {
			String[] SubCaste_split = SubCaste.split(", ");
			for (int j = 0; j < SubCaste_split.length; j++) {
				if (driver.findElement(By.xpath("//option[contains(text(),'"+j+"')]")).isDisplayed()) {
					Thread.sleep(3000);
					driver.findElement(By.xpath("//option[contains(text(),'"+j+"')]")).click();
					acc.moveToElement(driver.findElement(By.xpath("//option[contains(text(),'"+j+"')]"))).doubleClick().build().perform();
				} else {
					Thread.sleep(3000);
					System.out.println("The Given value "+j+"is not present in SubCaste DropDown");
				}
			}
		} else if (SubCaste.length()<0) {
			Thread.sleep(2000);
			if (driver.findElement(By.xpath("//option[contains(text(),'"+SubCaste+"')]")).isDisplayed()) {
				Thread.sleep(2000);
				driver.findElement(By.xpath("//option[contains(text(),'"+SubCaste+"')]")).click();
				acc.moveToElement(driver.findElement(By.xpath("//option[contains(text(),'"+SubCaste+"')]"))).doubleClick().build().perform();
			}
		else{
			System.out.println("The Given value "+SubCaste+"is not present in SubCaste DropDown");
		}
		} else { System.out.println("The Given value "+SubCaste+"is not present in SubCaste DropDown");}
		
	
		Thread.sleep(2000);
		BaseTest.click(rs.getRefine_Submit());
		
	
		
		
		
	}
	
	
	
	public static void refineEducation() throws Throwable {
		
		String Parent =  driver.getWindowHandle();
		Actions acc =  new Actions(driver);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		RefineSearch_POM rs = new RefineSearch_POM();

		Thread.sleep(2000);
		BaseTest.click(rs.getRefine_Show_More_Btn());
		
		try {
			Set<String> child = driver.getWindowHandles();
			Thread.sleep(2000);
			for (String handle : child) {
				if(!Parent.contains(handle)) {
					Thread.sleep(1000);
					driver.switchTo().window(handle);
					Thread.sleep(2000);
					driver.close();
					driver.switchTo().window(Parent);
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	try {		
		Thread.sleep(2000);
		BaseTest.click(rs.getRefine_Show_More_Btn());
	} catch (Exception e) {
		// TODO: handle exception
	}	
		
		Thread.sleep(5000);
		BaseTest.click(driver.findElement(By.xpath("//*[@id=\"facetEducationlabel\"]")));
		
		try {
			Set<String> child = driver.getWindowHandles();
			Thread.sleep(2000);
			for (String handle : child) {
				if(!Parent.contains(handle)) {
					Thread.sleep(1000);
					driver.switchTo().window(handle);
					Thread.sleep(2000);
					driver.close();
					driver.switchTo().window(Parent);
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		//BaseTest.click(driver.findElement(By.xpath("//*[@id=\"facetMotherTonguelabel\"]")));
		String Education = BaseTest.getExcelData("RefineSearch", 1, 9);
		Thread.sleep(5000);
		BaseTest.click(rs.getRefine_Education_More());
		
		Thread.sleep(3000);
		BaseTest.click(rs.getRefine_Education_Choosed());
		BaseTest.select_deselectAll(rs.getRefine_Education_Choosed());
		
		Thread.sleep(3000);
		BaseTest.click(rs.getRefine_Education_Value());
		
		if (Education.contains(", ")) {
			String[] Education_split = Education.split(", ");
			for (int j = 0; j < Education_split.length; j++) {
				if (driver.findElement(By.xpath("//option[contains(text(),'"+j+"')]")).isDisplayed()) {
					Thread.sleep(3000);
					acc.moveToElement(driver.findElement(By.xpath("//option[contains(text(),'"+j+"')]"))).doubleClick().build().perform();
				} else {
					Thread.sleep(3000);
					System.out.println("The Given value "+j+"is not present in Education DropDown");
				}
			}
		} else if (SubCaste.length()<0) {
			Thread.sleep(2000);
			if (driver.findElement(By.xpath("//option[contains(text(),'"+Education+"')]")).isDisplayed()) {
				Thread.sleep(2000);
				acc.moveToElement(driver.findElement(By.xpath("//option[contains(text(),'"+Education+"')]"))).doubleClick().build().perform();
			}
		else{
			System.out.println("The Given value "+Education+"is not present in SubCaste DropDown");
		}
		} else { System.out.println("The Given value "+Education+"is not present in SubCaste DropDown");}
		
	
		Thread.sleep(2000);
		BaseTest.click(rs.getRefine_Submit());
		
		

	}
	
	
	
	
	
	public static void refineFamilyType() throws Throwable {
		
		String Parent = driver.getWindowHandle();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		Actions acc = new Actions(driver);
		RefineSearch_POM rs = new RefineSearch_POM();
		
		
		Thread.sleep(2000);
		BaseTest.click(rs.getRefine_Show_More_Btn());
		
		try {
			Set<String> child = driver.getWindowHandles();
			Thread.sleep(2000);
			for (String handle : child) {
				if(!Parent.contains(handle)) {
					Thread.sleep(1000);
					driver.switchTo().window(handle);
					Thread.sleep(2000);
					driver.close();
					driver.switchTo().window(Parent);
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	try {		
		Thread.sleep(2000);
		BaseTest.click(rs.getRefine_Show_More_Btn());
	} catch (Exception e) {
		// TODO: handle exception
	}	
		
		Thread.sleep(5000);
		BaseTest.click(driver.findElement(By.xpath("//*[@id=\"facetFamilyTypelabel\"]")));
		
		try {
			Set<String> child = driver.getWindowHandles();
			Thread.sleep(2000);
			for (String handle : child) {
				if(!Parent.contains(handle)) {
					Thread.sleep(1000);
					driver.switchTo().window(handle);
					Thread.sleep(2000);
					driver.close();
					driver.switchTo().window(Parent);
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		Thread.sleep(5000);
		String Family_Type = BaseTest.getExcelData("RefineSearch", 1, 10);
		
		if(Family_Type.contains("Any")) {
		if (!rs.getRefine_FamilyType_Any().isSelected()) {
			BaseTest.click(rs.getRefine_FamilyType_Any());
		} else {
             System.out.println("Any was Already Selected");
		} }
	/////////////////////////		
		if(Family_Type.contains("Nuclear family")) {
			if (!rs.getRefine_FamilyType_Nuclear().isSelected()) {
				BaseTest.click(rs.getRefine_FamilyType_Nuclear());
			} else {
	             System.out.println("Nuclear family was Already Selected");
			}	}
		
///////////////////////		
		if(Family_Type.contains("Joint family")) {
			if (!rs.getRefine_FamilyType_Joint().isSelected()) {
				BaseTest.click(rs.getRefine_FamilyType_Joint());
			} else {
	             System.out.println("Joint family was Already Selected");
			}	}
/////////////////////////
		Thread.sleep(2000);
		BaseTest.click(rs.getRefine_Submit());
		
		

	}
	
	
	
	
	
	public static void refineFamilyStatus() throws Throwable {
		
		Actions acc = new Actions(driver);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		RefineSearch_POM rs = new RefineSearch_POM();
		String Parent = driver.getWindowHandle();
		
		
		Thread.sleep(2000);
		BaseTest.click(rs.getRefine_Show_More_Btn());
		
		try {
			Set<String> child = driver.getWindowHandles();
			Thread.sleep(2000);
			for (String handle : child) {
				if(!Parent.contains(handle)) {
					Thread.sleep(1000);
					driver.switchTo().window(handle);
					Thread.sleep(2000);
					driver.close();
					driver.switchTo().window(Parent);
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	try {		
		Thread.sleep(2000);
		BaseTest.click(rs.getRefine_Show_More_Btn());
	} catch (Exception e) {
		// TODO: handle exception
	}	
		
		Thread.sleep(5000);
		BaseTest.click(driver.findElement(By.xpath("//*[@id=\"facetFamilyStatuslabel\"]")));
		
		try {
			Set<String> child = driver.getWindowHandles();
			Thread.sleep(2000);
			for (String handle : child) {
				if(!Parent.contains(handle)) {
					Thread.sleep(1000);
					driver.switchTo().window(handle);
					Thread.sleep(2000);
					driver.close();
					driver.switchTo().window(Parent);
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		Thread.sleep(5000);
		String Family_Status = BaseTest.getExcelData("RefineSearch", 1, 11);
		
		if(Family_Status.contains("Any")) {
		if (!rs.getRefine_FamilyStatus_Any().isSelected()) {
			BaseTest.click(rs.getRefine_FamilyStatus_Any());
		} else {
             System.out.println("Any was Already Selected");
		} }
	/////////////////////////		
		if(Family_Status.contains("Middle class")) {
			if (!rs.getRefine_FamilyStatus_MiddleClass().isSelected()) {
				BaseTest.click(rs.getRefine_FamilyStatus_MiddleClass());
			} else {
	             System.out.println("Middle class was Already Selected");
			}	}
		
///////////////////////		
		if(Family_Status.contains("Upper middle class")) {
			if (!rs.getRefine_FamilyStatus_UpperMiddleClass().isSelected()) {
				BaseTest.click(rs.getRefine_FamilyStatus_UpperMiddleClass());
			} else {
	             System.out.println("Upper Middle Class was Already Selected");
			}	}
/////////////////////////
		
		if(Family_Status.contains("Rich")) {
			if (!rs.getRefine_FamilyStatus_Rich_Affulent().isSelected()) {
				BaseTest.click(rs.getRefine_FamilyStatus_Rich_Affulent());
			} else {
	             System.out.println("Rich was Already Selected");
			}	}
/////////////////////////
		Thread.sleep(2000);
		BaseTest.click(rs.getRefine_Submit());
		
		
		
	}
	
	
	
	public static void refineEmployeedIn() throws Throwable {
		
		String Parent = driver.getWindowHandle();
		Actions acc = new Actions(driver);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		RefineSearch_POM rs = new RefineSearch_POM();
		
		
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,200)");
		
		Thread.sleep(2000);
		BaseTest.click(rs.getRefine_Show_More_Btn());
		
		
		try {
			Set<String> child = driver.getWindowHandles();
			Thread.sleep(2000);
			for (String handle : child) {
				if(!Parent.contains(handle)) {
					Thread.sleep(1000);
					driver.switchTo().window(handle);
					Thread.sleep(2000);
					driver.close();
					driver.switchTo().window(Parent);
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	try {		
		Thread.sleep(2000);
		BaseTest.click(rs.getRefine_Show_More_Btn());
	} catch (Exception e) {
		// TODO: handle exception
	}	
		
		Thread.sleep(5000);
		BaseTest.click(driver.findElement(By.xpath("//*[@id=\"facetEmployedInlabel\"]")));
		
		try {
			Set<String> child = driver.getWindowHandles();
			Thread.sleep(2000);
			for (String handle : child) {
				if(!Parent.contains(handle)) {
					Thread.sleep(1000);
					driver.switchTo().window(handle);
					Thread.sleep(2000);
					driver.close();
					driver.switchTo().window(Parent);
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		Thread.sleep(5000);
		String Employeed_In = BaseTest.getExcelData("RefineSearch", 1, 12);
		
		if(Employeed_In.contains("Government")) {
		if (!rs.getRefine_Employeed_GovernMent().isSelected()) {
			BaseTest.click(rs.getRefine_Employeed_GovernMent());
		} else {
             System.out.println("Government was Already Selected");
		} }
	/////////////////////////		
		if(Employeed_In.contains("Private")) {
			if (!rs.getRefine_Employeed_Private().isSelected()) {
				BaseTest.click(rs.getRefine_Employeed_Private());
			} else {
	             System.out.println("Private was Already Selected");
			}	}
		
///////////////////////		
		if(Employeed_In.contains("Self Employeed")) {
			if (!rs.getRefine_Employeed_SelfEmployeed().isSelected()) {
				BaseTest.click(rs.getRefine_Employeed_SelfEmployeed());
			} else {
	             System.out.println("Self Employeed was Already Selected");
			}	}
/////////////////////////
		
		if(Employeed_In.contains("Not Working")) {
			if (!rs.getRefine_Employeed_NotWorking().isSelected()) {
				BaseTest.click(rs.getRefine_Employeed_NotWorking());
			} else {
	             System.out.println("Not Working was Already Selected");
			}	}
/////////////////////////
		
		if(Employeed_In.contains("Defence")) {
			if (!rs.getRefine_Employeed_Defence().isSelected()) {
				BaseTest.click(rs.getRefine_Employeed_Defence());
			} else {
	             System.out.println("Defence was Already Selected");
			}	}
/////////////////////////
		
		
		Thread.sleep(2000);
		BaseTest.click(rs.getRefine_Submit());
		
		

	}
	
	
	
	
	public static void refineAnnualIncome() throws Throwable {
		
		String Parent = driver.getWindowHandle();
		JavascriptExecutor js =  (JavascriptExecutor)driver;
		Actions acc = new Actions(driver);
		RefineSearch_POM rs = new RefineSearch_POM();
		
		
		
		
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,200)");
			
			Thread.sleep(2000);
			BaseTest.click(rs.getRefine_Show_More_Btn());
			
			try {
				Set<String> child = driver.getWindowHandles();
				Thread.sleep(2000);
				for (String handle : child) {
					if(!Parent.contains(handle)) {
						Thread.sleep(1000);
						driver.switchTo().window(handle);
						Thread.sleep(2000);
						driver.close();
						driver.switchTo().window(Parent);
					}
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
		try {		
			Thread.sleep(2000);
			BaseTest.click(rs.getRefine_Show_More_Btn());
		} catch (Exception e) {
			// TODO: handle exception
		}	
			
			Thread.sleep(5000);
			BaseTest.click(driver.findElement(By.xpath("//*[@id=\"facetAnnualIncomelabel\"]")));
			
			try {
				Set<String> child = driver.getWindowHandles();
				Thread.sleep(2000);
				for (String handle : child) {
					if(!Parent.contains(handle)) {
						Thread.sleep(1000);
						driver.switchTo().window(handle);
						Thread.sleep(2000);
						driver.close();
						driver.switchTo().window(Parent);
					}
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			
			try {
				Thread.sleep(2000);
				BaseTest.click(driver.findElement(By.xpath("//*[@id=\"facetAnnualIncomelabel\"]")));
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			Thread.sleep(2000);
			BaseTest.select_text(rs.getRefine_AnnualIncome_From(), BaseTest.getExcelData("RefineSearch", 1, 14));
			
			try {
				Thread.sleep(2000);
				BaseTest.select_text(rs.getRefine_AnnualIncome_To(), BaseTest.getExcelData("RefineSearch", 1, 15));
			} catch (Exception e) {
				// TODO: handle exception
			}
	
	
	
	///////////////
			
			Thread.sleep(2000);
			BaseTest.click(rs.getRefine_Submit());
			
	}
	
	
	
	public static void refineOccupation() throws Throwable {
		
		String Parent = driver.getWindowHandle();
		Actions acc = new Actions(driver);
		JavascriptExecutor js  =  (JavascriptExecutor)driver;
		RefineSearch_POM rs = new RefineSearch_POM();
		
		
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,200)");
			
			Thread.sleep(2000);
			BaseTest.click(rs.getRefine_Show_More_Btn());
			
			try {
				Set<String> child = driver.getWindowHandles();
				Thread.sleep(2000);
				for (String handle : child) {
					if(!Parent.contains(handle)) {
						Thread.sleep(1000);
						driver.switchTo().window(handle);
						Thread.sleep(2000);
						driver.close();
						driver.switchTo().window(Parent);
					}
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
		try {		
			Thread.sleep(2000);
			BaseTest.click(rs.getRefine_Show_More_Btn());
		} catch (Exception e) {
			// TODO: handle exception
		}	
			
			Thread.sleep(5000);
			BaseTest.click(driver.findElement(By.xpath("//*[@id=\"facetOccupationlabel\"]")));
			
			try {
				Set<String> child = driver.getWindowHandles();
				Thread.sleep(2000);
				for (String handle : child) {
					if(!Parent.contains(handle)) {
						Thread.sleep(1000);
						driver.switchTo().window(handle);
						Thread.sleep(2000);
						driver.close();
						driver.switchTo().window(Parent);
					}
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			//BaseTest.click(driver.findElement(By.xpath("//*[@id=\"facetMotherTonguelabel\"]")));
			String Occupation = BaseTest.getExcelData("RefineSearch", 1, 13);
			Thread.sleep(5000);
			BaseTest.click(rs.getRefine_Occupation_More());
			
			Thread.sleep(3000);
			BaseTest.click(rs.getRefine_Occupation_Choosed());
			BaseTest.select_deselectAll(rs.getRefine_Occupation_Choosed());
			
			Thread.sleep(3000);
			BaseTest.click(rs.getRefine_Occupation_Value());
			
			if (Occupation.contains(", ")) {
				String[] Occupation_split = Occupation.split(", ");
				for (int j = 0; j < Occupation_split.length; j++) {
					if (driver.findElement(By.xpath("//option[contains(text(),'"+j+"')]")).isDisplayed()) {
						Thread.sleep(3000);
						acc.moveToElement(driver.findElement(By.xpath("//option[contains(text(),'"+j+"')]"))).doubleClick().build().perform();
					} else {
						Thread.sleep(3000);
						System.out.println("The Given value "+j+"is not present in Education DropDown");
					}
				}
			} else if (Occupation.length()<0) {
				Thread.sleep(2000);
				if (driver.findElement(By.xpath("//option[contains(text(),'"+Occupation+"')]")).isDisplayed()) {
					Thread.sleep(2000);
					acc.moveToElement(driver.findElement(By.xpath("//option[contains(text(),'"+Occupation+"')]"))).doubleClick().build().perform();
				}
			else{
				System.out.println("The Given value "+Occupation+"is not present in SubCaste DropDown");
			}
			} else { System.out.println("The Given value "+Occupation+"is not present in SubCaste DropDown");}
			
		
			Thread.sleep(2000);
			BaseTest.click(rs.getRefine_Submit());
			
			
			

	}
	
	
	
	
	public static void refineCountry() throws Throwable {

		String Parent = driver.getWindowHandle();
		Actions acc= new Actions(driver);
		JavascriptExecutor js  = (JavascriptExecutor)driver;
		RefineSearch_POM rs = new RefineSearch_POM();

		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,200)");
		
		
		Thread.sleep(2000);
		BaseTest.click(rs.getRefine_Show_More_Btn());
		
		try {
			Set<String> child = driver.getWindowHandles();
			Thread.sleep(2000);
			for (String handle : child) {
				if(!Parent.contains(handle)) {
					Thread.sleep(1000);
					driver.switchTo().window(handle);
					Thread.sleep(2000);
					driver.close();
					driver.switchTo().window(Parent);
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	try {		
		Thread.sleep(2000);
		BaseTest.click(rs.getRefine_Show_More_Btn());
	} catch (Exception e) {
		// TODO: handle exception
	}	
		
		Thread.sleep(5000);
		BaseTest.click(driver.findElement(By.xpath("//*[@id=\"facetCountrylabel\"]")));
		
		try {
			Set<String> child = driver.getWindowHandles();
			Thread.sleep(2000);
			for (String handle : child) {
				if(!Parent.contains(handle)) {
					Thread.sleep(1000);
					driver.switchTo().window(handle);
					Thread.sleep(2000);
					driver.close();
					driver.switchTo().window(Parent);
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		//BaseTest.click(driver.findElement(By.xpath("//*[@id=\"facetMotherTonguelabel\"]")));
		String Country = BaseTest.getExcelData("RefineSearch", 1, 16);
		Thread.sleep(5000);
		BaseTest.click(rs.getRefine_Country_more());
		
		Thread.sleep(3000);
		BaseTest.click(rs.getRefine_Country_Choosed());
		BaseTest.select_deselectAll(rs.getRefine_Country_Choosed());
		
		Thread.sleep(3000);
		BaseTest.click(rs.getRefine_Country_Value());
		
		if (Country.contains(", ")) {
			String[] Country_split = Country.split(", ");
			for (int j = 0; j < Country_split.length; j++) {
				if (driver.findElement(By.xpath("//option[contains(text(),'"+j+"')]")).isDisplayed()) {
					Thread.sleep(3000);
					acc.moveToElement(driver.findElement(By.xpath("//option[contains(text(),'"+j+"')]"))).doubleClick().build().perform();
				} else {
					Thread.sleep(3000);
					System.out.println("The Given value "+j+"is not present in Education DropDown");
				}
			}
		} else if (Country.length()<0) {
			Thread.sleep(2000);
			if (driver.findElement(By.xpath("//option[contains(text(),'"+Country+"')]")).isDisplayed()) {
				Thread.sleep(2000);
				acc.moveToElement(driver.findElement(By.xpath("//option[contains(text(),'"+Country+"')]"))).doubleClick().build().perform();
			}
		else{
			System.out.println("The Given value "+Country+"is not present in SubCaste DropDown");
		}
		} else { System.out.println("The Given value "+Country+"is not present in SubCaste DropDown");}
		
	
		Thread.sleep(2000);
		BaseTest.click(rs.getRefine_Submit());
		
		
		
		
	}
	
	
	
	public static void refineResidentStatus() throws Throwable {
		
		String Parent = driver.getWindowHandle();
		Actions acc = new Actions(driver);
		JavascriptExecutor js  =  (JavascriptExecutor)driver;
		RefineSearch_POM rs = new RefineSearch_POM();
		
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,200)");
		
		Thread.sleep(2000);
		BaseTest.click(rs.getRefine_Show_More_Btn());
		
		
		try {
			Set<String> child = driver.getWindowHandles();
			Thread.sleep(2000);
			for (String handle : child) {
				if(!Parent.contains(handle)) {
					Thread.sleep(1000);
					driver.switchTo().window(handle);
					Thread.sleep(2000);
					driver.close();
					driver.switchTo().window(Parent);
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	try {		
		Thread.sleep(2000);
		BaseTest.click(rs.getRefine_Show_More_Btn());
	} catch (Exception e) {
		// TODO: handle exception
	}	
		
		Thread.sleep(5000);
		BaseTest.click(driver.findElement(By.xpath("//*[@id=\"facetResidentStatuslabel\"]")));
		
		try {
			Set<String> child = driver.getWindowHandles();
			Thread.sleep(2000);
			for (String handle : child) {
				if(!Parent.contains(handle)) {
					Thread.sleep(1000);
					driver.switchTo().window(handle);
					Thread.sleep(2000);
					driver.close();
					driver.switchTo().window(Parent);
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		Thread.sleep(5000);
		String ResidentStatus = BaseTest.getExcelData("RefineSearch", 1, 17);
		
		if(ResidentStatus.contains("Citizen")) {
		if (!rs.getRefine_ResidentStatus_Citizen().isSelected()) {
			BaseTest.click(rs.getRefine_ResidentStatus_Citizen());
		} else {
             System.out.println("Citizen was Already Selected");
		} }
	/////////////////////////		
		if(ResidentStatus.contains("Permanent resident")) {
			if (!rs.getRefine_ResidentStatus_PermanentResident().isSelected()) {
				BaseTest.click(rs.getRefine_ResidentStatus_PermanentResident());
			} else {
	             System.out.println("Permanent Resident was Already Selected");
			}	}
		
///////////////////////		
		if(ResidentStatus.contains("Work permit")) {
			if (!rs.getRefine_ResidentStatus_WorkPermit().isSelected()) {
				BaseTest.click(rs.getRefine_ResidentStatus_WorkPermit());
			} else {
	             System.out.println("Self Employeed was Already Selected");
			}	}
/////////////////////////
		
		if(ResidentStatus.contains("Non Resident")) {
			if (!rs.getRefine_ResidentStatus_NonResident().isSelected()) {
				BaseTest.click(rs.getRefine_ResidentStatus_NonResident());
			} else {
	             System.out.println("Non Resident was Already Selected");
			}	}
/////////////////////////
		
		if(ResidentStatus.contains("Student Visa")) {
			if (!rs.getRefine_ResidentStatus_StudentVisa().isSelected()) {
				BaseTest.click(rs.getRefine_ResidentStatus_StudentVisa());
			} else {
	             System.out.println("Student visa was Already Selected");
			}	}
/////////////////////////
		
		if(ResidentStatus.contains("Temporary Visa")) {
			if (!rs.getRefine_ResidentStatus_TemporaryVisa().isSelected()) {
				BaseTest.click(rs.getRefine_ResidentStatus_TemporaryVisa());
			} else {
	             System.out.println("Temporary was Already Selected");
			}	}
/////////////////////////
		
		
		
		Thread.sleep(2000);
		BaseTest.click(rs.getRefine_Submit());
		
		

	}
	
	
	
	public static void refineCitizenShip() throws Throwable {
		
		String Parent = driver.getWindowHandle();
		Actions acc = new Actions(driver);
		JavascriptExecutor js  =  (JavascriptExecutor)driver;
		RefineSearch_POM rs = new RefineSearch_POM();
		
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,200)");
		
		
		Thread.sleep(2000);
		BaseTest.click(rs.getRefine_Show_More_Btn());
		
		try {
			Set<String> child = driver.getWindowHandles();
			Thread.sleep(2000);
			for (String handle : child) {
				if(!Parent.contains(handle)) {
					Thread.sleep(1000);
					driver.switchTo().window(handle);
					Thread.sleep(2000);
					driver.close();
					driver.switchTo().window(Parent);
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	try {		
		Thread.sleep(2000);
		BaseTest.click(rs.getRefine_Show_More_Btn());
	} catch (Exception e) {
		// TODO: handle exception
	}	
		
		Thread.sleep(5000);
		BaseTest.click(driver.findElement(By.xpath("//*[@id=\"facetCitizenshiplabel\"]")));
		
		try {
			Set<String> child = driver.getWindowHandles();
			Thread.sleep(2000);
			for (String handle : child) {
				if(!Parent.contains(handle)) {
					Thread.sleep(1000);
					driver.switchTo().window(handle);
					Thread.sleep(2000);
					driver.close();
					driver.switchTo().window(Parent);
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		//BaseTest.click(driver.findElement(By.xpath("//*[@id=\"facetMotherTonguelabel\"]")));
		String Citizenship = BaseTest.getExcelData("RefineSearch", 1, 18);
		Thread.sleep(5000);
		BaseTest.click(rs.getRefine_Country_more());
		
		Thread.sleep(3000);
		BaseTest.click(rs.getRefine_Citizenship_Choosed());
		BaseTest.select_deselectAll(rs.getRefine_Citizenship_Choosed());
		
		Thread.sleep(3000);
		BaseTest.click(rs.getRefine_Citizenship_Value());
		
		if (Citizenship.contains(", ")) {
			String[] Citizenship_split = Citizenship.split(", ");
			for (int j = 0; j < Citizenship_split.length; j++) {
				if (driver.findElement(By.xpath("//option[contains(text(),'"+j+"')]")).isDisplayed()) {
					Thread.sleep(3000);
					acc.moveToElement(driver.findElement(By.xpath("//option[contains(text(),'"+j+"')]"))).doubleClick().build().perform();
				} else {
					Thread.sleep(3000);
					System.out.println("The Given value "+j+"is not present in Education DropDown");
				}
			}
		} else if (Citizenship.length()<0) {
			Thread.sleep(2000);
			if (driver.findElement(By.xpath("//option[contains(text(),'"+Citizenship+"')]")).isDisplayed()) {
				Thread.sleep(2000);
				acc.moveToElement(driver.findElement(By.xpath("//option[contains(text(),'"+Citizenship+"')]"))).doubleClick().build().perform();
			}
		else{
			System.out.println("The Given value "+Citizenship+"is not present in SubCaste DropDown");
		}
		} else { System.out.println("The Given value "+Citizenship+"is not present in SubCaste DropDown");}
		
	
		Thread.sleep(2000);
		BaseTest.click(rs.getRefine_Submit());
		
		
	}
	
	
	
	
	public static void refinePhysicalStatus() throws Throwable {
		
		
		String Parent = driver.getWindowHandle();
		Actions acc = new Actions(driver);
		JavascriptExecutor js  =  (JavascriptExecutor)driver;
		RefineSearch_POM rs = new RefineSearch_POM();
		
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,200)");
		
		Thread.sleep(2000);
		BaseTest.click(rs.getRefine_Show_More_Btn());
		
		
		try {
			Set<String> child = driver.getWindowHandles();
			Thread.sleep(2000);
			for (String handle : child) {
				if(!Parent.contains(handle)) {
					Thread.sleep(1000);
					driver.switchTo().window(handle);
					Thread.sleep(2000);
					driver.close();
					driver.switchTo().window(Parent);
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	try {		
		Thread.sleep(2000);
		BaseTest.click(rs.getRefine_Show_More_Btn());
	} catch (Exception e) {
		// TODO: handle exception
	}	
		
		Thread.sleep(5000);
		BaseTest.click(driver.findElement(By.xpath("//*[@id=\"facetPhysicalStatuslabel\"]")));
		
		try {
			Set<String> child = driver.getWindowHandles();
			Thread.sleep(2000);
			for (String handle : child) {
				if(!Parent.contains(handle)) {
					Thread.sleep(1000);
					driver.switchTo().window(handle);
					Thread.sleep(2000);
					driver.close();
					driver.switchTo().window(Parent);
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		Thread.sleep(5000);
		String Physical_Status = BaseTest.getExcelData("RefineSearch", 1, 19);
		
		if(Physical_Status.contains("Normal")) {
		if (!rs.getRefine_PhysicalStatus_Any().isSelected()) {
			BaseTest.click(rs.getRefine_PhysicalStatus_Any());
		} else {
            System.out.println("NOrmal was Already Selected");
		} }
	/////////////////////////		
		if(Physical_Status.contains("Physicaly Challenged")) {
			if (!rs.getRefine_PhysicalStatus_PhysicalChallenged().isSelected()) {
				BaseTest.click(rs.getRefine_PhysicalStatus_PhysicalChallenged());
			} else {
	             System.out.println("Physically Challenged was Already Selected");
			}	}
		
///////////////////////		
		if(Physical_Status.contains("Any")) {
			if (!rs.getRefine_PhysicalStatus_Any().isSelected()) {
				BaseTest.click(rs.getRefine_PhysicalStatus_Any());
			} else {
	             System.out.println("Any was Already Selected");
			}	}
/////////////////////////
		
		if(Physical_Status.contains("Doesnt matter")) {
			if (!rs.getRefine_PhysicalStatus_DoesntMatter().isSelected()) {
				BaseTest.click(rs.getRefine_PhysicalStatus_DoesntMatter());
			} else {
	             System.out.println("Doesnt Matter was Already Selected");
			}	}
/////////////////////////
		
				
		
		
		Thread.sleep(2000);
		BaseTest.click(rs.getRefine_Submit());
		
	

	}
	
	
	
	public static void refineComplexion() throws Throwable {
		
		String Parent = driver.getWindowHandle();
		Actions acc = new Actions(driver);
		JavascriptExecutor js  =  (JavascriptExecutor)driver;
		RefineSearch_POM rs = new RefineSearch_POM();
		
		
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,400)");
		
		Thread.sleep(2000);
		BaseTest.click(rs.getRefine_Show_More_Btn());
		
		
		try {
			Set<String> child = driver.getWindowHandles();
			Thread.sleep(2000);
			for (String handle : child) {
				if(!Parent.contains(handle)) {
					Thread.sleep(1000);
					driver.switchTo().window(handle);
					Thread.sleep(2000);
					driver.close();
					driver.switchTo().window(Parent);
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	try {		
		Thread.sleep(2000);
		BaseTest.click(rs.getRefine_Show_More_Btn());
	} catch (Exception e) {
		// TODO: handle exception
	}	
		
		Thread.sleep(5000);
		BaseTest.click(driver.findElement(By.xpath("//*[@id=\"facetComplexionlabel\"]")));
		
		try {
			Set<String> child = driver.getWindowHandles();
			Thread.sleep(2000);
			for (String handle : child) {
				if(!Parent.contains(handle)) {
					Thread.sleep(1000);
					driver.switchTo().window(handle);
					Thread.sleep(2000);
					driver.close();
					driver.switchTo().window(Parent);
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		Thread.sleep(5000);
		String Complexion = BaseTest.getExcelData("RefineSearch", 1, 20);
		
		if(Complexion.contains("Fair")) {
		if (!rs.getRefine_Complexion_Fair().isSelected()) {
			BaseTest.click(rs.getRefine_Complexion_Fair());
		} else {
	      System.out.println("Fair was Already Selected");
		} }
	/////////////////////////		
		if(Complexion.contains("Dark")) {
			if (!rs.getRefine_Complexion_Dark().isSelected()) {
				BaseTest.click(rs.getRefine_Complexion_Dark());
			} else {
	           System.out.println(" Dark was Already Selected");
			}	}
		
	///////////////////////		
		if(Complexion.contains("Very Fair")) {
			if (!rs.getRefine_Complexion_VeryFair().isSelected()) {
				BaseTest.click(rs.getRefine_Complexion_VeryFair());
			} else {
	           System.out.println("Very Fair was Already Selected");
			}	}
	/////////////////////////
		
		if(Complexion.contains("Wheatish")) {
			if (!rs.getRefine_Complexion_Wheatish().isSelected()) {
				BaseTest.click(rs.getRefine_Complexion_Wheatish());
			} else {
	           System.out.println(" Wheatish was Already Selected");
			}	}
	/////////////////////////
		
		if(Complexion.contains("Wheatish brown")) {
			if (!rs.getRefine_Complexion_WheatishBrown().isSelected()) {
				BaseTest.click(rs.getRefine_Complexion_WheatishBrown());
			} else {
	           System.out.println(" Wheatish brown was Already Selected");
			}	}
	/////////////////////////
				
		
		
		Thread.sleep(2000);
		BaseTest.click(rs.getRefine_Submit());
		
		
		
	}
	
	
	public static void refineBodyType() throws Throwable {
		
		
		String Parent = driver.getWindowHandle();
		Actions acc = new Actions(driver);
		JavascriptExecutor js  =  (JavascriptExecutor)driver;
		RefineSearch_POM rs = new RefineSearch_POM();
		
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,400)");

		Thread.sleep(2000);
		BaseTest.click(rs.getRefine_Show_More_Btn());


		try {
			Set<String> child = driver.getWindowHandles();
			Thread.sleep(2000);
			for (String handle : child) {
				if(!Parent.contains(handle)) {
					Thread.sleep(1000);
					driver.switchTo().window(handle);
					Thread.sleep(2000);
					driver.close();
					driver.switchTo().window(Parent);
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		try {		
		Thread.sleep(2000);
		BaseTest.click(rs.getRefine_Show_More_Btn());
		} catch (Exception e) {
		// TODO: handle exception
		}	

		Thread.sleep(5000);
		BaseTest.click(driver.findElement(By.xpath("//*[@id=\"facetBodytypelabel\"]")));

		try {
			Set<String> child = driver.getWindowHandles();
			Thread.sleep(2000);
			for (String handle : child) {
				if(!Parent.contains(handle)) {
					Thread.sleep(1000);
					driver.switchTo().window(handle);
					Thread.sleep(2000);
					driver.close();
					driver.switchTo().window(Parent);
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
		}

		Thread.sleep(5000);
		String BodyType = BaseTest.getExcelData("RefineSearch", 1, 21);

		if(BodyType.contains("Slim")) {
		if (!rs.getRefine_BodyType_Slim().isSelected()) {
			BaseTest.click(rs.getRefine_BodyType_Slim());
		} else {
		  System.out.println("Slim was Already Selected");
		} }
		/////////////////////////		
		if(BodyType.contains("Heavy")) {
			if (!rs.getRefine_BodyType_Heavy().isSelected()) {
				BaseTest.click(rs.getRefine_BodyType_Heavy());
			} else {
		       System.out.println(" Heavy was Already Selected");
			}	}

		///////////////////////		
		if(BodyType.contains("Average")) {
			if (!rs.getRefine_BodyType_Average().isSelected()) {
				BaseTest.click(rs.getRefine_BodyType_Average());
			} else {
		       System.out.println("Average was Already Selected");
			}	}
		/////////////////////////

		if(BodyType.contains("Athletic")) {
			if (!rs.getRefine_BodyType_Athelitic().isSelected()) {
				BaseTest.click(rs.getRefine_BodyType_Athelitic());
			} else {
		       System.out.println(" Athletic was Already Selected");
			}	}
		/////////////////////////
				


		Thread.sleep(2000);
		BaseTest.click(rs.getRefine_Submit());



	}
	

	public static void refineEating() throws Throwable {
		
		
		String Parent = driver.getWindowHandle();
		Actions acc = new Actions(driver);
		JavascriptExecutor js  =  (JavascriptExecutor)driver;
		RefineSearch_POM rs = new RefineSearch_POM();
		
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,400)");

		Thread.sleep(2000);
		BaseTest.click(rs.getRefine_Show_More_Btn());


		try {
		Set<String> child = driver.getWindowHandles();
		Thread.sleep(2000);
		for (String handle : child) {
			if(!Parent.contains(handle)) {
				Thread.sleep(1000);
				driver.switchTo().window(handle);
				Thread.sleep(2000);
				driver.close();
				driver.switchTo().window(Parent);
			}
		}
		} catch (Exception e) {
		// TODO: handle exception
		}
		try {		
		Thread.sleep(2000);
		BaseTest.click(rs.getRefine_Show_More_Btn());
		} catch (Exception e) {
		// TODO: handle exception
		}	

		Thread.sleep(5000);
		BaseTest.click(driver.findElement(By.xpath("//*[@id=\"facetEatinglabel\"]")));

		try {
		Set<String> child = driver.getWindowHandles();
		Thread.sleep(2000);
		for (String handle : child) {
			if(!Parent.contains(handle)) {
				Thread.sleep(1000);
				driver.switchTo().window(handle);
				Thread.sleep(2000);
				driver.close();
				driver.switchTo().window(Parent);
			}
		}
		} catch (Exception e) {
		// TODO: handle exception
		}

		Thread.sleep(5000);
		String Eating = BaseTest.getExcelData("RefineSearch", 1, 22);

		if(Eating.contains("Veg")) {
		if (!rs.getRefine_Eating_Veg().isSelected()) {
		BaseTest.click(rs.getRefine_Eating_Veg());
		} else {
		System.out.println("Veg was Already Selected");
		} }
		/////////////////////////		
		if(Eating.contains("NonVeg")) {
		if (!rs.getRefine_Eating_NonVeg().isSelected()) {
			BaseTest.click(rs.getRefine_Eating_NonVeg());
		} else {
		   System.out.println(" Non Veh was Already Selected");
		}	}

		///////////////////////		
		if(Eating.contains("Vegan")) {
		if (!rs.getRefine_Eating_Vegan().isSelected()) {
			BaseTest.click(rs.getRefine_Eating_Vegan());
		} else {
		   System.out.println("Vegan was Already Selected");
		}	}
		/////////////////////////

		if(Eating.contains("Not Specified")) {
		if (!rs.getRefine_Eating_NotSpecified().isSelected()) {
			BaseTest.click(rs.getRefine_Eating_NotSpecified());
		} else {
		   System.out.println(" Not Specified was Already Selected");
		}	}
		/////////////////////////
			

		if(Eating.contains("Egg")) {
		if (!rs.getRefine_Eating_Egg().isSelected()) {
			BaseTest.click(rs.getRefine_Eating_Egg());
		} else {
		   System.out.println("Egg was Already Selected");
		}	}
		/////////////////////////


		Thread.sleep(2000);
		BaseTest.click(rs.getRefine_Submit());

	}
	
	
	public static void refineSmoking() throws Throwable {
		
		
		String Parent = driver.getWindowHandle();
		Actions acc = new Actions(driver);
		JavascriptExecutor js  =  (JavascriptExecutor)driver;
		RefineSearch_POM rs = new RefineSearch_POM();
		
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,400)");

		Thread.sleep(2000);
		BaseTest.click(rs.getRefine_Show_More_Btn());


		try {
		Set<String> child = driver.getWindowHandles();
		Thread.sleep(2000);
		for (String handle : child) {
		if(!Parent.contains(handle)) {
		Thread.sleep(1000);
		driver.switchTo().window(handle);
		Thread.sleep(2000);
		driver.close();
		driver.switchTo().window(Parent);
		}
		}
		} catch (Exception e) {
		//TODO: handle exception
		}
		try {		
		Thread.sleep(2000);
		BaseTest.click(rs.getRefine_Show_More_Btn());
		} catch (Exception e) {
		//TODO: handle exception
		}	

		Thread.sleep(5000);
		BaseTest.click(driver.findElement(By.xpath("//*[@id=\"facetSmokelabel\"]")));

		try {
		Set<String> child = driver.getWindowHandles();
		Thread.sleep(2000);
		for (String handle : child) {
		if(!Parent.contains(handle)) {
		Thread.sleep(1000);
		driver.switchTo().window(handle);
		Thread.sleep(2000);
		driver.close();
		driver.switchTo().window(Parent);
		}
		}
		} catch (Exception e) {
		//TODO: handle exception
		}

		Thread.sleep(5000);
		String Smoking = BaseTest.getExcelData("RefineSearch", 1, 23);

		if(Smoking.contains("Non Smoker")) {
		if (!rs.getRefine_Smoking_NonSmoker().isSelected()) {
		BaseTest.click(rs.getRefine_Smoking_NonSmoker());
		} else {
		System.out.println("Non Smoker was Already Selected");
		} }
		/////////////////////////		
		if(Smoking.contains("Light Smoker")) {
		if (!rs.getRefine_Smoking_LightSmoker().isSelected()) {
		BaseTest.click(rs.getRefine_Smoking_LightSmoker());
		} else {
		System.out.println(" Light Smoker was Already Selected");
		}	}

		///////////////////////		
		if(Smoking.contains("Regular Smoker")) {
		if (!rs.getRefine_Smoking_RegularSmoker().isSelected()) {
		BaseTest.click(rs.getRefine_Smoking_RegularSmoker());
		} else {
		System.out.println("Regular Smoker was Already Selected");
		}	}
		/////////////////////////

		if(Smoking.contains("Not Specified")) {
		if (!rs.getRefine_Smoking_NotSpecified().isSelected()) {
		BaseTest.click(rs.getRefine_Smoking_NotSpecified());
		} else {
		System.out.println(" Not Specified was Already Selected");
		}	}
		/////////////////////////



		Thread.sleep(2000);
		BaseTest.click(rs.getRefine_Submit());



	}
	
	public static void refineDrinking() throws Throwable {
		
		
		String Parent = driver.getWindowHandle();
		Actions acc = new Actions(driver);
		JavascriptExecutor js  =  (JavascriptExecutor)driver;
		RefineSearch_POM rs = new RefineSearch_POM();
		
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,400)");

		Thread.sleep(2000);
		BaseTest.click(rs.getRefine_Show_More_Btn());


		try {
		Set<String> child = driver.getWindowHandles();
		Thread.sleep(2000);
		for (String handle : child) {
		if(!Parent.contains(handle)) {
		Thread.sleep(1000);
		driver.switchTo().window(handle);
		Thread.sleep(2000);
		driver.close();
		driver.switchTo().window(Parent);
		}
		}
		} catch (Exception e) {
		//TODO: handle exception
		}
		try {		
		Thread.sleep(2000);
		BaseTest.click(rs.getRefine_Show_More_Btn());
		} catch (Exception e) {
		//TODO: handle exception
		}	

		Thread.sleep(5000);
		BaseTest.click(driver.findElement(By.xpath("//*[@id=\"facetDrinklabel\"]")));

		try {
		Set<String> child = driver.getWindowHandles();
		Thread.sleep(2000);
		for (String handle : child) {
		if(!Parent.contains(handle)) {
		Thread.sleep(1000);
		driver.switchTo().window(handle);
		Thread.sleep(2000);
		driver.close();
		driver.switchTo().window(Parent);
		}
		}
		} catch (Exception e) {
		//TODO: handle exception
		}

		Thread.sleep(5000);
		String Drinking = BaseTest.getExcelData("RefineSearch", 1, 24);

		if(Drinking.contains("Non Drinker")) {
		if (!rs.getRefine_Drinking_nonDrinker().isSelected()) {
		BaseTest.click(rs.getRefine_Drinking_nonDrinker());
		} else {
		System.out.println("Non Drinker was Already Selected");
		} }
		/////////////////////////		
		if(Drinking.contains("Light Drinker")) {
		if (!rs.getRefine_Drinking_LightDrinker().isSelected()) {
		BaseTest.click(rs.getRefine_Drinking_LightDrinker());
		} else {
		System.out.println(" Light Drinker was Already Selected");
		}	}

		///////////////////////		
		if(Drinking.contains("Regular Drinker")) {
		if (!rs.getRefine_Drinking_RegularDrinker().isSelected()) {
		BaseTest.click(rs.getRefine_Drinking_RegularDrinker());
		} else {
		}	}
		/////////////////////////

		if(Drinking.contains("Not Specified")) {
		if (!rs.getRefine_Drinking_NotSpecified().isSelected()) {
		BaseTest.click(rs.getRefine_Drinking_NotSpecified());
		} else {
		System.out.println(" Not Specified was Already Selected");
		}	}
		/////////////////////////



		Thread.sleep(2000);
		BaseTest.click(rs.getRefine_Submit());


	}
	
}
