package com.utility;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.base.BaseTest;
import com.pom.Register_POM;

public class RegisterationMethod extends BaseTest{
	
	
	
	/**
	 * @throws Throwable 
	 * 
	 */
	public static void page1() throws Throwable {
		
		Register_POM r = new Register_POM(driver);
		
		
		////
		BaseTest.Wait_Explecit(driver,r.getProfileFor_btn(), 10);
		BaseTest.click(r.getProfileFor_btn());
		
		////
		String Profile_Created = BaseTest.getExcelData("Naidu_Register", 1, 1);
		
		if (Profile_Created.contains("Myself")) {
			BaseTest.Wait_Explecit(driver,r.getMySelf(), 10);
			BaseTest.click(r.getMySelf());
			
		} else if (Profile_Created.contains("Daughter")) {
			BaseTest.Wait_Explecit(driver,r.getDaughter(), 10);
			BaseTest.click(r.getDaughter());
			
		} else if (Profile_Created.contains("Son")) {
			BaseTest.Wait_Explecit(driver,r.getSon(), 10);
			BaseTest.click(r.getSon());
			
		} else if (Profile_Created.contains("Sister")) {
			BaseTest.Wait_Explecit(driver,r.getSister(), 10);
			BaseTest.click(r.getSister());
			
		} else if (Profile_Created.contains("Brother")) {
			BaseTest.Wait_Explecit(driver,r.getBrother(), 10);
			BaseTest.click(r.getBrother());
			
		} else if (Profile_Created.contains("Relative")) {
			BaseTest.Wait_Explecit(driver,r.getRelative(), 10);
			BaseTest.click(r.getBrother());
			
		} else if (Profile_Created.contains("Friend")) {
			BaseTest.Wait_Explecit(driver,r.getFriend(), 10);
			BaseTest.click(r.getBrother());
		} else {
			
			System.err.println("Locator Not Visible For Profile Created");
		}
		
		
		/////
		
		
		String Gender = BaseTest.getExcelData("Naidu_Register", 1, 2);
		
		if (Gender.contains("Male")) {
			BaseTest.Wait_Explecit(driver,r.getMale(), 10);
			BaseTest.click(r.getMale());
			
		} else if(Gender.contains("Female")) {
			BaseTest.Wait_Explecit(driver,r.getFemale(), 10);
			BaseTest.click(r.getFemale());
			
		} else {
			
			System.err.println("Locator Not Visible For Gender");
		}
		
		///////
		
		String Name = BaseTest.getExcelData("Naidu_Register", 1, 3);
		
		BaseTest.Wait_Explecit(driver,r.getName(), 10);
		BaseTest.typeData(r.getName(), Name);
		
		/////
		
		String Country_Code = BaseTest.getExcelData("Naidu_Register", 1, 4);
		
		BaseTest.Wait_Explecit(driver,r.getMobile_CountryCode(), 10);
		BaseTest.click(r.getMobile_CountryCode());
		
		BaseTest.Wait_Explecit(driver,r.getCountry_Code_Search(), 10);
		BaseTest.typeData(r.getCountry_Code_Search(), Country_Code);
		
		
		WebElement CCode = driver.findElement(By.xpath("(//li[contains(text(),'"+Country_Code+"')])[1]"));
		BaseTest.Wait_Explecit(driver,CCode, 10);
		BaseTest.click(CCode);
		
		
		/////
		
		String Mobile_number = BaseTest.getExcelData("Naidu_Register", 1, 5)+Math.incrementExact(1);
		System.out.println(Mobile_number + " : Mobile Number ");
		
		BaseTest.Wait_Explecit(driver,r.getMobile_Number(), 10);
		BaseTest.typeData(r.getMobile_Number(), Mobile_number);
		
		
		////
		
		BaseTest.Wait_Explecit(driver,r.getRegister_Free_Btn(), 10);
		BaseTest.click(r.getRegister_Free_Btn());

	}
	
	
	public static void page2() throws Throwable {
		
		Register_POM r = new Register_POM(driver);
		
		String Month = BaseTest.getExcelData("Naidu_Register", 1, 6);
		String Year = BaseTest.getExcelData("Naidu_Register", 1, 7);
		String Day = BaseTest.getExcelData("Naidu_Register", 1, 8);
		
		
		BaseTest.Wait_Explecit(driver, r.getDOB(), 10);
		BaseTest.click(r.getDOB());
		
		BaseTest.Wait_Explecit(driver, r.getMonth(), 10);
		BaseTest.select_text(r.getMonth(), Month);
		
		BaseTest.Wait_Explecit(driver, r.getYear(), 10);
		BaseTest.select_text(r.getYear(), Year);
		
		BaseTest.Wait_Explecit(driver, r.getYear(), 10);
		BaseTest.click(r.getDate());
		
		////
		
		String Religion = BaseTest.getExcelData("Naidu_Register", 1, 9);
	try {	
		BaseTest.Wait_Explecit(driver, r.getReligion(), 10);
		BaseTest.select_text(r.getReligion(), Religion);
	} catch (Exception e) {
		// TODO: handle exception
	}
		////
	
	
	
	try {
		WebElement Caste =  driver.findElement(By.id("caste"));
		BaseTest.Wait_Explecit(driver, Caste, 10);
		BaseTest.select_index(Caste, 1);
	} catch (Exception e) {
		// TODO: handle exception
	}
	
	
	/*
	try {
	for (int i = 1; i <=1; i++) {
		
	Thread.sleep(2000);
        String SubCaste = BaseTest.getExcelData("Naidu_Register", i, 10);
		
        Thread.sleep(2000);
		//BaseTest.Wait_Explecit(driver, driver.findElement(By.id("subCaste")), 10);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("subCaste"))));
		BaseTest.select_index(driver.findElement(By.id("subCaste")), i);
		
		Thread.sleep(2000);
		Select ss = new Select(driver.findElement(By.id("subCaste")));
		String aa = ss.getFirstSelectedOption().getText();
		
		if (aa.equals(SubCaste)) {
			System.out.println(SubCaste+" MATCHED "+aa);
		} else {
			System.err.println(SubCaste+" NOT MATCHED "+aa);
		}
	}	
	
	
	} catch (Exception e) {
		// TODO: handle exception
	}
		
		
		
		*/
	
		/////////////////*****************************************//////////////////////////////////
	/*
try {		
		int Count = BaseTest.getCellCount("Naidu_Register");
		System.out.println(Count);
		
		for (int i = 1; i <=Count; i++) {
			
			BaseTest.Wait_Explecit(driver, r.getSubCaste(), 10);
			
			Select ss = new Select(r.getSubCaste());
			
			ss.selectByIndex(i);
			
			String Sc_Value = ss.getFirstSelectedOption().getText();
			System.out.println("The Selected Value : "+Sc_Value);
			if (Sc_Value.equals(BaseTest.getExcelData("Naidu_Register", i, 10))) {
				
				System.out.println("The SubCaste Order Matches");
				
			} else {
				
				System.out.println("The Order Not Matches");

			}
			
			
			
		}
		
} catch (Exception e) {
	// TODO: handle exception
}
		
		*/
		//////////////////****************************************//////////////////////////////
		
		//
	
	/*
		String SubCaste_Value = driver.findElement(By.id("select2-subCaste-container")).getText();
		System.out.println(SubCaste_Value);
		
		if (SubCaste_Value.contains("Other")) {
			BaseTest.Wait_Explecit(driver, r.getSubCaste_Others_TextBox(), 10);
			String Others = BaseTest.getExcelData("Naidu_Register", 1, 11);
			BaseTest.typeData((r.getSubCaste_Others_TextBox()),Others);
			
		} else {
           System.out.println("The SubCaste Non Equals Others");
		}
		
		*/
		////
		String MotherTongue = BaseTest.getExcelData("Naidu_Register", 1, 12);
		
		
		BaseTest.Wait_Explecit(driver, r.getMotherTongue(), 10);
		BaseTest.select_text(r.getMotherTongue(), MotherTongue);
		
		////
		String Email = BaseTest.getExcelData("Naidu_Register", 1, 13)+Math.random()*1+"@yahoo.com";
		
		BaseTest.Wait_Explecit(driver, r.getEmail(), 10);
		BaseTest.typeData(r.getEmail(), Email);
		
		////
         String Password = BaseTest.getExcelData("Naidu_Register", 1, 14);
		
		BaseTest.Wait_Explecit(driver, r.getPassowrd(), 10);
		BaseTest.typeData(r.getPassowrd(), Password);
		
		BaseTest.Wait_Explecit(driver, r.getContinue_page2(), 10);
		BaseTest.click(r.getContinue_page2());

	}
	 
	
	
	public static void page3() throws Throwable {
		
		Register_POM r = new Register_POM(driver);
		
		
		String Star =  BaseTest.getExcelData("Naidu_Register", 1, 15);
		String Raasi =  BaseTest.getExcelData("Naidu_Register", 1, 16);
		String Dosham =  BaseTest.getExcelData("Naidu_Register", 1, 17);
		String Dosham_Value=  BaseTest.getExcelData("Naidu_Register", 1, 18);
		
		
		BaseTest.Wait_Explecit(driver, r.getStar(), 10);
		BaseTest.select_text(r.getStar(), Star);
		
		BaseTest.Wait_Explecit(driver, r.getRaasi(), 10);
		BaseTest.select_text(r.getRaasi(), Raasi);
		
		if (Dosham.contains("Yes")) {
			BaseTest.Wait_Explecit(driver, r.getDosham_Yes(), 10);
			BaseTest.click(r.getDosham_Yes());
			
		} else if (Dosham.contains("No")) {
			BaseTest.Wait_Explecit(driver, r.getDosham_Yes(), 10);
			BaseTest.click(r.getDosham_Yes());
			
		} else if (Dosham.contains("Dont Know")) {
			BaseTest.Wait_Explecit(driver, r.getDosham_Yes(), 10);
			BaseTest.click(r.getDosham_Yes());
			
		} else {
			System.out.println("No Dosham to Choose");
		}
		
	///
		
		if (Dosham.contains("Yes")) {
			
			if (Dosham_Value.contains("Chevvai")) {
				BaseTest.Wait_Explecit(driver, r.getCheva_Dosham(), 10);
				BaseTest.click(r.getCheva_Dosham());
				
			} else if (Dosham_Value.contains("Naga")) {
				BaseTest.Wait_Explecit(driver, r.getNaga_Dosham(), 10);
				BaseTest.click(r.getNaga_Dosham());
				
			} else if (Dosham_Value.contains("Kala Sarpa")) {
				BaseTest.Wait_Explecit(driver, r.getKala_Sarpa_Dosham(), 10);
				BaseTest.click(r.getKala_Sarpa_Dosham());
				
			} else if (Dosham_Value.contains("Rahu")) {
				BaseTest.Wait_Explecit(driver, r.getRagu_Dosham(), 10);
				BaseTest.click(r.getRagu_Dosham());
				
			} else if (Dosham_Value.contains("Kethu")) {
				BaseTest.Wait_Explecit(driver, r.getKetu_Dosham(), 10);
				BaseTest.click(r.getKetu_Dosham());
				
			} else if (Dosham_Value.contains("Kalathra")) {
				BaseTest.Wait_Explecit(driver, r.getKaalatra_Dosham(), 10);
				BaseTest.click(r.getKaalatra_Dosham());
				
			}
			
		} else {
			System.out.println("Dosham Value Not Equasl YES");

		}
		
		////////////////////////
		
		BaseTest.Wait_Explecit(driver, r.getContinue_Page3(), 10);
		BaseTest.click(r.getContinue_Page3());
		
		
		
		
		
		
	}
	
	
	
	
	public static void page4() throws Throwable {
		
		
Register_POM r = new Register_POM(driver);
		
		
		String Marital =  BaseTest.getExcelData("Naidu_Register", 1, 20);
		String Children =  BaseTest.getExcelData("Naidu_Register", 1, 21);
		String Height =  BaseTest.getExcelData("Naidu_Register", 1, 22);
		String Family_Status=  BaseTest.getExcelData("Naidu_Register", 1, 23);
		String Family_type=  BaseTest.getExcelData("Naidu_Register", 1, 24);
		String Physical_Status =  BaseTest.getExcelData("Naidu_Register", 1, 25);
		
		
		
		if (Marital.contains("Unmarried")) {
			BaseTest.Wait_Explecit(driver, r.getUnmarried(), 10);
			BaseTest.click(r.getUnmarried());
			
			
		} else if (Marital.contains("Widow")) {
			BaseTest.Wait_Explecit(driver, r.getWidow(), 10);
			BaseTest.click(r.getWidow());
			
		} else if (Marital.contains("Divorceed")) {
			BaseTest.Wait_Explecit(driver, r.getDivorced(), 10);
			BaseTest.click(r.getDivorced());
			
		} else if (Marital.contains("Seperated")) {
			BaseTest.Wait_Explecit(driver, r.getSeperated(), 10);
			BaseTest.click(r.getSeperated());
			
		}
		
		
		
		
		//////////
		
		if (!Marital.contains("Unmarried")) {
			if (Children.contains("None")) {
				BaseTest.Wait_Explecit(driver, r.getChild_None(), 10);
				BaseTest.click(r.getChild_None());
			} else if (Children.contains("1")) {
				BaseTest.Wait_Explecit(driver, r.getChild_one(), 10);
				BaseTest.click(r.getChild_one());
			} else if (Children.contains("2")) {
				BaseTest.Wait_Explecit(driver, r.getChild_two(), 10);
				BaseTest.click(r.getChild_two());
			} else if (Children.contains("3")) {
				BaseTest.Wait_Explecit(driver, r.getChild_Three(), 10);
				BaseTest.click(r.getChild_Three());
			} else if (Children.contains("4")) {
				BaseTest.Wait_Explecit(driver, r.getChild_Three_Plus(), 10);
				BaseTest.click(r.getChild_Three_Plus());
			} else {
				System.out.println("Marital Status was Unmarried");
			}		
			
			
		} else {

		}
		
		
		///////
		
		BaseTest.Wait_Explecit(driver, r.getHeight(), 10);
		BaseTest.select_text(r.getHeight(), Height);
		
		////
		
		
		if (Family_Status.contains("Middle Class")) {		
			BaseTest.Wait_Explecit(driver, r.getMiddle_CLass(), 10);
			BaseTest.click(r.getMiddle_CLass());		
		} else if (Family_Status.contains("Upper Middle Class")) {			
			BaseTest.Wait_Explecit(driver, r.getUpper_Middle_CLass(), 10);
			BaseTest.click(r.getUpper_Middle_CLass());					
		} else if (Family_Status.contains("Rich")) {			
			BaseTest.Wait_Explecit(driver, r.getRich_Affluent(), 10);
			BaseTest.click(r.getRich_Affluent());
		} else {
			
		}
		///////
		
		if (Family_type.contains("Joint")) {		
			BaseTest.Wait_Explecit(driver, r.getJoint_Family(), 10);
			BaseTest.click(r.getJoint_Family());		
		} else if (Family_type.contains("Nuclear")) {			
			BaseTest.Wait_Explecit(driver, r.getNeuclear_Family(), 10);
			BaseTest.click(r.getNeuclear_Family());					
		} else {
		}
		
		/////
		
		if (Physical_Status.contains("Normal")) {		
			BaseTest.Wait_Explecit(driver, r.getNormal(), 10);
			BaseTest.click(r.getNormal());		
		} else if (Physical_Status.contains("Physical Challenge")) {			
			BaseTest.Wait_Explecit(driver, r.getPhysical_Chalenged(), 10);
			BaseTest.click(r.getPhysical_Chalenged());					
		} else {
		}
		
		///
		
		BaseTest.Wait_Explecit(driver, r.getContinue_page4(), 10);
		BaseTest.click(r.getContinue_page4());
	

	}
	
	
	
	public static void page5() throws Throwable {
		Register_POM r = new Register_POM(driver);
		
		String Education =  BaseTest.getExcelData("Naidu_Register", 1, 26);
		
		BaseTest.Wait_Explecit(driver, r.getContinue_page4(), 10);
	//	BaseTest.select_text(element, text);
		
		
		
		
		
		

	}
	
	
	public static void iimiitEducation() throws Throwable {
	
		Register_POM r = new Register_POM(driver);
		
	//	String IIm =  BaseTest.getExcelData("Naidu_Register", 1, 28);
		
	//	String IIF =  BaseTest.getExcelData("Naidu_Register", 1, 27);
		
		if (BaseTest.getExcelData("Naidu_Register", 1, 2).contains("Female")) {
			
			Select s = new Select(driver.findElement(By.id("educationCategory")));
			
			for (int i = 0; i <17; i++) {
				
				s.selectByIndex((i));
				
				String IIF =  BaseTest.getExcelData("Naidu_Register", (i+1), 27);
				
				String edu = s.getFirstSelectedOption().getText();
				
				if (edu.contains(IIF)) {
					System.out.println(edu+" : Equals :"+IIF);
				} else {
					System.err.println(edu+" : not Equals :"+IIF);
				}
				
				
			}
			
			
			//datalist[@id='datalist']//following::option
			
		} else {
			
			
	Select s = new Select(driver.findElement(By.id("educationCategory")));
			
			for (int i = 0; i <17; i++) {
				
				s.selectByIndex(i);
				
				String IIm =  BaseTest.getExcelData("Naidu_Register", (i+1), 28);
				
				String edu = s.getFirstSelectedOption().getText();
				
				if (edu.contains(IIm)) {
					System.out.println(edu+" : Equals :"+IIm);
				} else {
					System.err.println(edu+" : not Equals :"+IIm);
				}
				
				
			}

		}

		
		
		WebElement Inst = driver.findElement(By.id("institutionName"));
		
		BaseTest.Wait_Explecit(driver, Inst, 30);
		
		BaseTest.click(Inst);
		
		BaseTest.Wait_Explecit(driver, Inst, 30);
		
		BaseTest.typeData(Inst, "IIT");
		
		List<WebElement> aaa = driver.findElements(By.xpath("//datalist[@id='datalist']//following::option"));
		
		for (int i = 0; i < aaa.size(); i++) {

			String azs = driver.findElement(By.xpath("//datalist[@id='datalist']//following::option["+(i+1)+"]")).getText();
			System.out.println(azs);
		}
		
		String a = driver.findElement(By.id("datalist")).getText();
		System.out.println(a);
		
		/////////////////////////
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	

}
