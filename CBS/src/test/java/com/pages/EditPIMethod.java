package com.pages;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;



import base.BaseTest;
import pom.cmlogin.EditPI_POM;
import pom.cmlogin.EditPP_POM;
import pom.cmlogin.GothramPOM;
import pom.cmlogin.ViewProfile_POM;

public class EditPIMethod extends BaseTest{
	
	static String[] MT_Split, Caste_Split, SubCaste_Split, Star_Split, Gothram_Split, Education_Split,
	Occupation_Split, Citizenship_Split, Country_Split, State_Split, City_Split,INCFrom_Split, INCTo_Split,
	Residing_State_India_Split,Residing_State_USA_Split;

	static String[] Religion_Split;
	
	static String PP_Physical_Status,PP_Eating,PP_Drinking,PP_Smoking,PP_Subcaste,PP_Mother_Tongue,PP_Height,PP_Age,PP_Have_Chldren,PP_Marital_Status,
	PP_Star,PP_Education,PP_Occupation,PP_AnnualINcome,PP_Citizenship,PP_Country,Occupation, PP_Religion;
	
	String MotherTongueArray,SubCasteArray,StarArray,EducationArray,OccupationArray,CitizenSHipArray,CountryArray, ReligionArray;
	
	int AgeFrom, AgeTo, Age1;
	double HeightFron, HeightTo , Height1;
	
	
	public static void hobbies() throws Throwable {
	
		
		GothramPOM g = new GothramPOM(driver);
		EditPI_POM i = new EditPI_POM(driver);
		
		String Food = BaseTest.getExcelData("EditPIHobby", 1, 7);
		
		if (Food.contains("Arabic")) {
			if (!i.getPI_Arabic().isSelected()) {
				BaseTest.click(i.getPI_Arabic());
			} else {
				 System.out.println("Arabic was already Selected");
			}
		}else if (Food.contains("Bengali")) {
			if (!i.getPI_Bengali().isSelected()) {
				BaseTest.click(i.getPI_Bengali());
			} else {
				 System.out.println("Bengali was already Selected");
			}
		}else if (Food.contains("Chinese")) {
			if (!i.getPI_Chinese().isSelected()) {
				BaseTest.click(i.getPI_Chinese());
			} else {
				 System.out.println("Chinese was already Selected");
			}
		}else if (Food.contains("Continental")) {
			if (!i.getPI_Continental().isSelected()) {
				BaseTest.click(i.getPI_Continental());
			} else {
				 System.out.println("Continental was already Selected");
			}
		}else if (Food.contains("Fast food")) {
			if (!i.getPI_Fast_Food().isSelected()) {
				BaseTest.click(i.getPI_Fast_Food());
			} else {
				 System.out.println("Fast food was already Selected");
			}
		}else if (Food.contains("Gujarati")) {
			if (!i.getPI_Gujarathi().isSelected()) {
				BaseTest.click(i.getPI_Gujarathi());
			} else {
				 System.out.println("Gujarati was already Selected");
			}
		}else if (Food.contains("Italian")) {
			if (!i.getPI_Italian().isSelected()) {
				BaseTest.click(i.getPI_Italian());
			} else {
				 System.out.println("Italian was already Selected");
			}
		} else if (Food.contains("Konkan")) {
			if (!i.getPI_Konkan().isSelected()) {
				BaseTest.click(i.getPI_Konkan());
			} else {
				 System.out.println("Konkan was already Selected");
			}
		}else if (Food.contains("Mexican")) {
			if (!i.getPI_Mexican().isSelected()) {
				BaseTest.click(i.getPI_Mexican());
			} else {
				 System.out.println("Mexican was already Selected");
			}
		}else if (Food.contains("Moghlai")) {
			if (!i.getPI_Moghalai().isSelected()) {
				BaseTest.click(i.getPI_Moghalai());
			} else {
				 System.out.println("Moghlai was already Selected");
			}
		}else if (Food.contains("Punjabi")) {
			if (!i.getPI_Punjabi().isSelected()) {
				BaseTest.click(i.getPI_Punjabi());
			} else {
				 System.out.println("Punjabi was already Selected");
			}
		}else if (Food.contains("Rajasthani")) {
			if (!i.getPI_Rajastahni().isSelected()) {
				BaseTest.click(i.getPI_Rajastahni());
			} else {
				 System.out.println("Rajasthani was already Selected");
			}
		}else if (Food.contains("South Indian")) {
			if (!i.getPI_outh_Indian().isSelected()) {
				BaseTest.click(i.getPI_outh_Indian());
			} else {
				 System.out.println("South Indian was already Selected");
			}
		}else if (Food.contains("Spanish")) {
			if (!i.getPI_Spanish().isSelected()) {
				BaseTest.click(i.getPI_Spanish());
			} else {
				 System.out.println("Spanish was already Selected");
			}
		}else if (Food.contains("Sushi")) {
			if (!i.getPI_Sushi().isSelected()) {
				BaseTest.click(i.getPI_Sushi());
			} else {
				 System.out.println("Sushi was already Selected");
			}
		}else { }
		
		BaseTest.clear(i.getPI_Others_food());
		BaseTest.typeData(i.getPI_Others_food(), BaseTest.getExcelData("EditPIHobby", 1, 8));
            
		BaseTest.click(i.getPI_Basic_Save());
		Thread.sleep(3000);

	}
	
	
	public static void sports() throws Throwable {
		
		GothramPOM g = new GothramPOM(driver);
		EditPI_POM i = new EditPI_POM(driver);
		
		
		String Sports = BaseTest.getExcelData("EditPIHobby", 1, 5);
		
		if (Sports.contains("Badminton")) {
			if (!i.getPI_Badmiton().isSelected()) {
				BaseTest.click(i.getPI_Badmiton());
			} else {
	           System.out.println("Badminton was already Selected");
			}
		}else if (Sports.contains("Carrom")) {
			if (!i.getPI_Carrom().isSelected()) {
				BaseTest.click(i.getPI_Carrom());
			} else {
	           System.out.println("Carrom was already Selected");
			}
		}else if (Sports.contains("Chess")) {
			if (!i.getPI_Chess().isSelected()) {
				BaseTest.click(i.getPI_Chess());
			} else {
	           System.out.println("Chess was already Selected");
			}
		}else if (Sports.contains("Cricket")) {
			if (!i.getPI_Cricket().isSelected()) {
				BaseTest.click(i.getPI_Cricket());
			} else {
	           System.out.println("Cricket was already Selected");
			}
		}else if (Sports.contains("Football")) {
			if (!i.getPI_Football().isSelected()) {
				BaseTest.click(i.getPI_Football());
			} else {
	           System.out.println("Football was already Selected");
			}
		}else if (Sports.contains("Jogging")) {
			if (!i.getPI_Jogging().isSelected()) {
				BaseTest.click(i.getPI_Jogging());
			} else {
	           System.out.println("Jogging was already Selected");
			}
		}else if (Sports.contains("Swimming")) {
			if (!i.getPI_Swimming().isSelected()) {
				BaseTest.click(i.getPI_Swimming	());
			} else {
	           System.out.println("Swimming was already Selected");
			}
		}else {  }
		
		
		BaseTest.clear(i.getPI_Sports_other());
		BaseTest.typeData(i.getPI_Sports_other(), BaseTest.getExcelData("EditPIHobby", 1, 6));
		
		Thread.sleep(3000);
		BaseTest.click(i.getPI_Basic_Save());
	}
	
	
	public static void music() throws Throwable {
		
		GothramPOM g = new GothramPOM(driver);
		EditPI_POM i = new EditPI_POM(driver);
		

		String Music = BaseTest.getExcelData("EditPIHobby", 1, 3);
		
		if (Music.contains("Film songs")) {
			if (!i.getPI_Film_song().isSelected()) {
				BaseTest.click(i.getPI_Film_song());
			} else {
	           System.out.println("Film Song was Already Selected");
			}
		}else if (Music.contains("Indian/ Classical Music")) {
			if (!i.getPI_Indian_Clasical().isSelected()) {
				BaseTest.click(i.getPI_Indian_Clasical());
			} else {
	           System.out.println("Indian/ Classical Music was Already Selected");
			}
		}else if (Music.contains("Indian/ Classical Music")) {
			if (!i.getPI_Indian_Clasical().isSelected()) {
				BaseTest.click(i.getPI_Indian_Clasical());
			} else {
	           System.out.println("Indian/ Classical Music was Already Selected");
			}
		}else if (Music.contains("Western Music")) {
			if (!i.getPI_Western().isSelected()) {
				BaseTest.click(i.getPI_Western());
			} else {
	           System.out.println("Western Music was Already Selected");
			}
		}else {  }
		
		
		BaseTest.clear(i.getPI_Music_others());
		BaseTest.typeData(i.getPI_Music_others(), BaseTest.getExcelData("EditPIHobby", 1, 4));
		Thread.sleep(3000);
		BaseTest.click(i.getPI_Basic_Save());

	}
	
	public static void hobby() throws Throwable {
		
		
		GothramPOM g = new GothramPOM(driver);
		EditPI_POM i = new EditPI_POM(driver);
		
		BaseTest.click(i.getPI_Hobbies_Edit());
		
		Thread.sleep(3000);
		String Hobbies= BaseTest.getExcelData("EditPIHobby", 1, 1);
		if (Hobbies.contains("Art / Handicraft")) {
			if (!i.getPI_Art().isSelected()) {
				BaseTest.click(i.getPI_Art());
			} else {
	          System.out.println("Art was Already Selected");
			}
		} else if(Hobbies.contains("Cooking")) {
			if (!i.getPI_Cooking().isSelected()) {
				BaseTest.click(i.getPI_Cooking());
			} else {
	          System.out.println("Cooking was Already Selected");
			}
		}else if(Hobbies.contains("Dancing")) {
			if (!i.getPI_Dancing().isSelected()) {
				BaseTest.click(i.getPI_Dancing());
			} else {
	          System.out.println("Dancing was Already Selected");
			}
		}else if(Hobbies.contains("Gardening / landscaping")) {
			if (!i.getPI_Garden().isSelected()) {
				BaseTest.click(i.getPI_Garden());
			} else {
	          System.out.println("Gardening / landscaping was Already Selected");
			}
		}else if(Hobbies.contains("Nature")) {
			if (!i.getPI_Nature().isSelected()) {
				BaseTest.click(i.getPI_Nature());
			} else {
	          System.out.println("Nature was Already Selected");
			}
		}else if(Hobbies.contains("Painting")) {
			if (!i.getPI_Painting().isSelected()) {
				BaseTest.click(i.getPI_Painting());
			} else {
	          System.out.println("Painting was Already Selected");
			}
		}else if(Hobbies.contains("Pets")) {
			if (!i.getPI_Pets().isSelected()) {
				BaseTest.click(i.getPI_Pets());
			} else {
	          System.out.println("Pets was Already Selected");
			}
		}else if(Hobbies.contains("Photography")) {
			if (!i.getPPI_hotograph().isSelected()) {
				BaseTest.click(i.getPPI_hotograph());
			} else {
	          System.out.println("Photography was Already Selected");
			}
		}else if(Hobbies.contains("Playing musical instruments")) {
			if (!i.getPI_Playing_Music_Instruments().isSelected()) {
				BaseTest.click(i.getPI_Playing_Music_Instruments());
			} else {
	          System.out.println("Playing musical instruments was Already Selected");
			}
		}else if(Hobbies.contains("Puzzles")) {
			if (!i.getPI_Puzzles().isSelected()) {
				BaseTest.click(i.getPI_Puzzles());
			} else {
	          System.out.println("Puzzles was Already Selected");
			}
		}else if(Hobbies.contains("Internet Surfing")) {
			if (!i.getPI_Internet_Surfing().isSelected()) {
				BaseTest.click(i.getPI_Internet_Surfing());
			} else {
	          System.out.println("Internet Surfing was Already Selected");
			}
		}else if(Hobbies.contains("Listening to Music")) {
			if (!i.getPI_Listening_Music().isSelected()) {
				BaseTest.click(i.getPI_Listening_Music());
			} else {
	          System.out.println("Listening to Music was Already Selected");
			}
		}else if(Hobbies.contains("Movies")) {
			if (!i.getPI_Movies().isSelected()) {
				BaseTest.click(i.getPI_Movies());
			} else {
	          System.out.println("Movies was Already Selected");
			}
		}else if(Hobbies.contains("Travelling")) {
			if (!i.getPI_Travelling().isSelected()) {
				BaseTest.click(i.getPI_Travelling());
			} else {
	          System.out.println("Travelling was Already Selected");
			}
		} else {  }
		
		
		BaseTest.clear(i.getPI_Hobbies_others());
		BaseTest.typeData(i.getPI_Hobbies_others(), BaseTest.getExcelData("EditPIHobby", 1, 2));

		Thread.sleep(3000);
		BaseTest.click(i.getPI_Basic_Save());
	}
	
	public static void familyDetails() throws Throwable {
		

		GothramPOM g = new GothramPOM(driver);
		EditPI_POM i = new EditPI_POM(driver);
		
		

		Thread.sleep(3000);
		BaseTest.click(i.getPI_Family_Details_Edit());
		
		Thread.sleep(3000);
		String Family_Value = BaseTest.getExcelData("EditPI1", 1, 11);
		
	if (Family_Value.contains("Orthodox")) {
		BaseTest.click(i.getPI_OrthoDox());
	}else if (Family_Value.contains("Traditional")) {
		BaseTest.click(i.getPI_Traditional());
	}else if (Family_Value.contains("Moderate")) {
		BaseTest.click(i.getPI_Moderate());
	}else if (Family_Value.contains("Liberal")) {
		BaseTest.click(i.getPI_Liberal());
	}else { } 
	//////////////////////////////
	
	String Family_Type = BaseTest.getExcelData("EditPI1", 1, 12);
	if (Family_Type.contains("Joint Family")) {
		BaseTest.click(i.getPI_JointFammily());
	}else if (Family_Type.contains("Nuclear Family")) {
		BaseTest.click(i.getPI_NeuclearFamily());
	}else {	}
	//////////////////
	
	String Family_Status = BaseTest.getExcelData("EditPI1", 1, 13);
	if (Family_Status.contains("Middle class")) {
		BaseTest.click(i.getPI_MiddleClass());
	}else if (Family_Status.contains("Upper middle class")) {
		BaseTest.click(i.getPI_UpperMiddleClass());
	}else if (Family_Status.contains("Rich / Affluent")) {
		BaseTest.click(i.getPI_Rich());
	}else { }
	
	///////////////////////////////////////
	
	BaseTest.clear(i.getPI_NativePlace_Value());
    BaseTest.typeData(i.getPI_NativePlace_Value(), BaseTest.getExcelData("EditPI1", 1, 14));
    
    //////////////////////////
    
    BaseTest.clear(i.getPI_Father_Occupation());
	BaseTest.typeData(i.getPI_Father_Occupation(), BaseTest.getExcelData("EditPI1", 1, 15));
	
	/////////////////////
	
	BaseTest.clear(i.getPI_Mother_Occupation());
	BaseTest.typeData(i.getPI_Mother_Occupation(), BaseTest.getExcelData("EditPI1", 1, 16));
		
		
	//////////////////
	
	BaseTest.select_text(i.getPI_Brothers_DD(), BaseTest.getExcelData("EditPI1", 1, 17));
		
	try {
		BaseTest.select_text(i.getPI_Brother_Married_DD(), BaseTest.getExcelData("EditPI1", 1, 18));
	} catch (Exception e) {
		
	}
		
	//////////////////
	
	BaseTest.select_text(i.getPI_Sister_DD(), BaseTest.getExcelData("EditPI1", 1, 19));
	
	try {
		BaseTest.select_text(i.getPI_Sister_Married(), BaseTest.getExcelData("EditPI1", 1, 20));
	} catch (Exception e) {
		// TODO: handle exception
	}
		
	////////////////////////
	
	BaseTest.clear(i.getPI_About_Family());
	BaseTest.typeData(i.getPI_About_Family(), BaseTest.getExcelData("EditPI1", 1, 21));
	Thread.sleep(3000);
	BaseTest.click(i.getPI_Basic_Save());
	
	}

	public static void educationDetail() throws Throwable {
		
		GothramPOM g = new GothramPOM(driver);
		EditPI_POM i = new EditPI_POM(driver);
		
		
		Thread.sleep(3000);
		BaseTest.click(i.getPI_Education_Edit_btn());
		
		Thread.sleep(3000);
		BaseTest.select_text(i.getPI_HighestEducation_DD(), BaseTest.getExcelData("EditPI1", 1, 1));
		
		try {
			BaseTest.select_text(i.getPI_AdditionalDegree_DD(), BaseTest.getExcelData("EditPI1", 1, 2));
		} catch (Exception e) {
			System.out.println("There is no Additonal Degree Field to Choose the given Value");
		}
     
		
		BaseTest.clear(i.getPI_College_Value());
		BaseTest.typeData(i.getPI_College_Value(), BaseTest.getExcelData("EditPI1", 1, 3));
		
		BaseTest.clear(i.getPI_Education_Detail_Value());
		BaseTest.typeData(i.getPI_Education_Detail_Value(), BaseTest.getExcelData("EditPI1", 1, 4));
		
		////////////
		String Employed_In = BaseTest.getExcelData("EditPI1", 1, 5);
		try {
		if (Employed_In.contains("Government")) {
			BaseTest.click(i.getPI_Government());
		}else if (Employed_In.contains("Defence")) {
			BaseTest.click(i.getPI_Defence());
		}else if (Employed_In.contains("Private")) {
			BaseTest.click(i.getPI_Private());
		}else if (Employed_In.contains("Business")) {
			BaseTest.click(i.getPI_Business());
		}else if (Employed_In.contains("Self Employed")) {
			BaseTest.click(i.getPI_SelfEmployed());
		}else if (Employed_In.contains("Not Working")) {
			BaseTest.click(i.getPI_NotWorking());
		}else { }
		} catch (Exception e) {		}
		//////////////////
		
		try {
			BaseTest.select_text(i.getPI_Occupation_DD(), BaseTest.getExcelData("EditPI1", 1, 6));
		} catch (Exception e) {
			System.out.println("There is no Occupation Filed to Choose the given Value");
		}
		
		////////////
		
		try {
			BaseTest.clear(i.getPI_OccupationDetail_DD());
			BaseTest.typeData(i.getPI_OccupationDetail_DD(), BaseTest.getExcelData("EditPI1", 1, 7));
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		BaseTest.select_text(i.getPI_AnnualIncome_Currency(), BaseTest.getExcelData("EditPI1", 1, 8));
		
		Thread.sleep(3000);
		/*try {
			BaseTest.select_text(i.getPI_AnnualIncome_DD_Value(), BaseTest.getExcelData("EditPI1", 1, 9));
		} catch (Exception e) {
			Thread.sleep(3000);
			BaseTest.clear(i.getPI_AnnualIncome_DD_Value());
			BaseTest.typeData(i.getPI_AnnualIncome_DD_Value(), BaseTest.getExcelData("EditPI", 1, 10));
		}*/
		
		Thread.sleep(3000);
		BaseTest.click(i.getPI_Basic_Save());
		

	}
	
	
	
	public static void basicDetail() throws Throwable {

		GothramPOM g = new GothramPOM(driver);
		EditPI_POM i = new EditPI_POM(driver);
		
		
		BaseTest.select_text(i.getPI_ProfileCreated_DD(), BaseTest.getExcelData("EditPI", 1, 1));
		
		// Name BaseTest.typeData(i.getPI_Name(), BaseTest.getExcelData("EditPI", 1, 2));
		Thread.sleep(3000);
		
		BaseTest.select_text(i.getPI_Day_DD(), BaseTest.getExcelData("EditPI", 1, 3));
		
		Thread.sleep(3000);
		BaseTest.select_text(i.getPI_Month_DD(), BaseTest.getExcelData("EditPI", 1, 4));
		BaseTest.select_text(i.getPI_Year_DD(), BaseTest.getExcelData("EditPI", 1, 5));
		Thread.sleep(3000);
		try {
			BaseTest.select_text(i.getPI_Day_DD(), BaseTest.getExcelData("EditPI", 1, 3));
		} catch (Exception e) {
			// TODO: handle exception
		}
		Thread.sleep(3000);
		String MaritalStatus = BaseTest.getExcelData("EditPI", 1, 6);
		if (MaritalStatus.contains("Divorced")) {
			BaseTest.click(i.getPI_Divorceed());
		} else if (MaritalStatus.contains("Awaiting Divorce")) {
			BaseTest.click(i.getPI_Awaiting_Divorcee());
		} else if (MaritalStatus.contains("Widow / Widower")) {
			BaseTest.click(i.getPI_Widow());
		} else if (MaritalStatus.contains("Annulled")) {
			BaseTest.click(i.getPI_Annuled());
		} else if (MaritalStatus.contains("Never Married")) {
			BaseTest.click(i.getPI_NeverMarried());
		} else if (MaritalStatus.contains("Separated")) {
			BaseTest.click(i.getPI_Seperated());
		} else { }

		
		BaseTest.select_text(i.getPI_Height_DD(), BaseTest.getExcelData("EditPI", 1, 7));
		
		BaseTest.select_text(i.getPI_WeightKg_DD(), BaseTest.getExcelData("EditPI", 1, 8));	
	// Weight LBS 	BaseTest.select_text(i.getPI_WeightLbs_DD(), BaseTest.getExcelData("EditPI", 1, 9));
		
		///////
		
		String Body_Type = BaseTest.getExcelData("EditPI", 1, 10);
		if (Body_Type.contains("Slim")) {
			BaseTest.click(i.getPI_Slim());
		} else if (Body_Type.contains("Athletic")) {
			BaseTest.click(i.getPI_Atheletic());
		} else if (Body_Type.contains("Average")) {
			BaseTest.click(i.getPI_Average());
		}else if (Body_Type.contains("Heavy")) {
			BaseTest.click(i.getPI_Average());
		} else { }
		
		// 
		
		String Complexion = BaseTest.getExcelData("EditPI", 1, 11);
		if (Complexion.contains("Very Fair")) {
			BaseTest.click(i.getPI_VeryFair());
		} else if (Complexion.contains("Fair")) {
			BaseTest.click(i.getPI_Fair());
		}else if (Complexion.contains("Wheatish")) {
			BaseTest.click(i.getPI_Wheatish());
		}else if (Complexion.contains("Wheatish brown")) {
			BaseTest.click(i.getPI_Wheatish_Brown());
		}else if (Complexion.contains("Dark")) {
			BaseTest.click(i.getPI_Dark());
		}else { }
		
		
		////////////////
		
		
		String Physical_Status = BaseTest.getExcelData("EditPI", 1, 12);
		if (Physical_Status.contains("Normal")) {
			BaseTest.click(i.getPI_Physical_Normal());
		} else if (Physical_Status.contains("Physically Challenged")) {
			BaseTest.click(i.getPI_Physical_Challenged());
		} else {  } 
		
		
		
		////
		
		try {
			BaseTest.select_text(i.getPI_Religion_DD(), BaseTest.getExcelData("EditPI", 1, 13));
		} catch (Exception e) {
			System.out.println("There is No Religion Field to Choose the Given Value");
		}
		
		/////
		
		
		try {
			BaseTest.select_text(i.getPI_Caste_DD(), BaseTest.getExcelData("EditPI", 1, 14));
		} catch (Exception e) {
			System.out.println("There is No Caste Field to Choose the Given Value");
		}
		
		////////////
		
		
		try {
			BaseTest.select_text(i.getPI_SubCaste_DD(), BaseTest.getExcelData("EditPI", 1, 15));
		} catch (Exception e) {
			System.out.println("There is No SubCaste Drop Down Field to Choose the Given Value");
		}
		
	
		
		try {
			BaseTest.typeData(i.getPI_SubCaste_Value(), BaseTest.getExcelData("EditPI", 1, 15));
		} catch (Exception e) {
			System.out.println("There is No SubCaste text box Field to Choose the Given Value");
		}
		
		//////////
		
		
		BaseTest.select_text(i.getPI_MotherTongue_DD(), BaseTest.getExcelData("EDitPI", 1, 16));
		
		/*String Language_Known = BaseTest.getExcelData("EditPI", 1, 17);
		if (Language_Known.contains(", ")) {
			String[] Languae_Spl = Language_Known.split(", ");
			for (int j = 0; j < Languae_Spl.length; j++) {
				acc.moveToElement(driver.findElement(By.xpath("option[contains(text(),'"+Languae_Spl[j]+"')]"))).doubleClick().build().perform();
				//acc.doubleClick(driver.findElement(By.xpath("option[contains(text(),'"+Languae_Spl[j]+"')]")));
			} 		
			}else { 
				acc.moveToElement(driver.findElement(By.xpath("option[contains(text(),'"+Language_Known+"')]"))).doubleClick().build().perform();
			//acc.doubleClick(driver.findElement(By.xpath("option[contains(text(),'"+Language_Known+"')]")));	
		}*/
		
		//////////
		
		// Gothram  BaseTest.typeData(i.getPI_Gothram(), BaseTest.getExcelData("EditPI", 1, 18));
		
		///////////
	try {	
		BaseTest.select_text(i.getPI_Star_DD(), BaseTest.getExcelData("EditPI", 1, 19));
	} catch (Exception e) {
		System.out.println("There is No Star Field to Choose the Given Value");
	}	
	
	/////
	try {
		BaseTest.select_text(i.getPI_Rasi_DD(), BaseTest.getExcelData("EditPI", 1, 20));
	} catch (Exception e) {
		System.out.println("There is No Rasi Field to Choose the Given Value");
	}
	
	//////////////////////
	
		try {
			String Sudha_jadhagam = BaseTest.getExcelData("EditPI", 1, 21);
			if (Sudha_jadhagam.contains("Yes")) {
				BaseTest.click(i.getPI_SudhaJadhagam_Yes());
			} else if (Sudha_jadhagam.contains("No")) {
				BaseTest.click(i.getPI_SudhaJadhagam_NO());
			}  else if (Sudha_jadhagam.contains("Don't Know")) {
				BaseTest.click(i.getPI_SudhaJadhagam_DontKnow());
			} else {  } 			
		} catch (Exception e) {	}
		
		
	///   Dosham 
		String Dosham = BaseTest.getExcelData("EditPI", 1, 22);
		try {			
			if (Dosham.contains("Yes")) {
				BaseTest.click(i.getPI_Dosham_Yes());
			} else if (Dosham.contains("NO")) {
				BaseTest.click(i.getPI_Dosham_NO());
			}  else if (Dosham.contains("Don't Know")) {
				BaseTest.click(i.getPI_Dosham_DontKnow());
			} else { }		
		} catch (Exception e) {	}
	//////
		
		if (Dosham.contains("Yes")) {
			String Dosham_Value = BaseTest.getExcelData("EditPI", 1, 23);
			if (Dosham_Value.contains("Chovva Dosham")||Dosham_Value.contains("Manglik")) {
				if (!i.getPI_ChevvaDosham().isSelected()) {
					BaseTest.click(i.getPI_ChevvaDosham());
				} else {
				System.out.println("ChevVa Dosham was Already Selected");
				} }
			if (Dosham_Value.contains("Sarpa Dosham")) {  
				if (!i.getPI_SarpaDosham().isSelected()) {
					BaseTest.click(i.getPI_SarpaDosham());
				} else {
				System.out.println("Sarpa Dosham was Already Selected");
				}  }
			 if (Dosham_Value.contains("Kala Sarpa Dosham")) {
				 if (!i.getPI_KalaSarpaDosham().isSelected()) {
						BaseTest.click(i.getPI_KalaSarpaDosham());
					} else {
					System.out.println("Kala Sarpa Dosham was Already Selected");
					} 	}
			 if (Dosham_Value.contains("Rahu Dosham")) {
				 if (!i.getPI_RahuDosham().isSelected()) {
						BaseTest.click(i.getPI_RahuDosham());
					} else {
					System.out.println("Rahu Dosham was Already Selected");
					} 	}
			 if (Dosham_Value.contains("Kethu Dosham")) {
				 if (!i.getPI_KethuDosham().isSelected()) {
						BaseTest.click(i.getPI_KethuDosham());
					} else {
					System.out.println("Kethu Dosham was Already Selected");
					} 	}
			 if (Dosham_Value.contains("Kalathra Dosham")) {
				 if (!i.getPI_KalahatraDosham().isSelected()) {
						BaseTest.click(i.getPI_KalahatraDosham());
					} else {
					System.out.println("Kalathra was Already Selected");
					} 	}
		}
		
		////////
		
		String Eating_Habit = BaseTest.getExcelData("EditPI", 1, 24);
		if (Eating_Habit.contains("Vegetarian")) {
			BaseTest.click(i.getPI_Vegetarian());
		} else if (Eating_Habit.contains("Non vegetarian")) {
			BaseTest.click(i.getPI_Non_Vegetarian());
		} else if (Eating_Habit.contains("Vegan")) {
			BaseTest.click(i.getPI_Vegan());
		} else if (Eating_Habit.contains("Eggetarian")) {
			BaseTest.click(i.getPI_Eggetarian());
		}  else { } 
		
		/////
		
		String Smoking = BaseTest.getExcelData("EditPI", 1, 25);
		if (Eating_Habit.contains("Non-smoker")) {
			BaseTest.click(i.getPI_Non_Smoker());
		}else if (Eating_Habit.contains("Light / Social smoker")) {
			BaseTest.click(i.getPI_Light_Smoker());
		}else if (Eating_Habit.contains("Regular smoker")) {
			BaseTest.click(i.getPI_Regular_Smoker());
		} else {  } 
		
		////////////////
		
		String Drinking_Habit = BaseTest.getExcelData("EditPI", 1, 26);
		if (Drinking_Habit.contains("Non-drinker")) {
			BaseTest.click(i.getPI_Non_Drinker());
		}else if (Drinking_Habit.contains("Light / Social drinker")) {
			BaseTest.click(i.getPI_Light_Drinker());
		}else if (Drinking_Habit.contains("Regular drinker")) {
			BaseTest.click(i.getPI_Regular_Drinker());
		}else { }
		
		////////////////////
		
		BaseTest.clear(i.getPI_About_ME());
		BaseTest.typeData(i.getPI_About_ME(), BaseTest.getExcelData("EditPI", 1, 27));
		
		BaseTest.click(i.getPI_Basic_Save());

	}
	
	public static void editPartnerPrefernce() throws Throwable {
		
		GothramPOM g = new GothramPOM(driver);
		EditPP_POM e = new EditPP_POM(driver);
		ViewProfile_POM v= new ViewProfile_POM(driver);
		  Actions acc = new Actions(driver);
	
		Thread.sleep(3000);//div[contains(text(),'Partner Preference')]//following::a[1]
         BaseTest.click(driver.findElement(By.xpath("//*[@id=\"container5\"]/div[2]/a")));
		
		Thread.sleep(3000);
		BaseTest.click(g.getPP_Edit_btn());
		
////////////////////////////////////    Marital Status   ////////////////////////////////////		
		Thread.sleep(2000);
		if (BaseTest.getExcelData("EditPP", 1, 1).contains("Unmarried")) {
			if(!e.getMarital_Unmarried().isSelected()) {
				BaseTest.click(e.getMarital_Unmarried());
			} else {
				System.out.println("Unmarried Marital is Already Selected");
			}
			
		} else {}
		if (BaseTest.getExcelData("EditPP", 1, 1).contains("Widow / Widower")) {
			if(!e.getMarital_Widow().isSelected()) {
				BaseTest.click(e.getMarital_Widow());
			} else {
				System.out.println("Widow / Widower Marital is Already Selected");
			}
			
		} else {} 
		if (BaseTest.getExcelData("EditPP", 1, 1).contains("Divorced")) {
			if(!e.getMarital_Divorced().isSelected()) {
				BaseTest.click(e.getMarital_Divorced());
			} else {
				System.out.println("Divorced Marital is Already Selected");
			}
			
		} else {} 
		if (BaseTest.getExcelData("EditPP", 1, 1).contains("Separated")) {
			if(!e.getMarital_Separated().isSelected()) {
				BaseTest.click(e.getMarital_Separated());
			} else {
				System.out.println("Seperated Marital is Already Selected");
			}
						
		} else {}
		if (BaseTest.getExcelData("EditPP", 1, 1).contains("Doesn't matter")) {
			if(!e.getMarital_DoesntMatter().isSelected()) {
				BaseTest.click(e.getMarital_DoesntMatter());
			} else {
				System.out.println("Doesn't Matter Marital is Already Selected");
			}
		}	
	/////////////////////////////////////////   *  *  *  *  *   ///////////////////////////////	
		       /////////     Have Children  //////
		if (!e.getMarital_Unmarried().isSelected()||e.getMarital_Divorced().isSelected()||e.getMarital_Separated().isSelected()||e.getMarital_Widow().isSelected()||e.getMarital_DoesntMatter().isSelected()) {
			if (BaseTest.getExcelData("EditPP", 1, 2).equals("Doesn't matter")) {
				if(!e.getChildren_DoesntMatter().isSelected()) {
					BaseTest.click(e.getChildren_DoesntMatter());
				} else {
					System.out.println("Doesn't Matter Children Status is Already Selected");
				}
				
			} else if (BaseTest.getExcelData("EditPP", 1, 2).equals("Yes. Living together")) {
				if(!e.getChildren_YesLiving().isSelected()) {
					BaseTest.click(e.getChildren_YesLiving());
				} else {
					System.out.println("Yes Living Together Children Status is Already Selected");
				}
			} else if (BaseTest.getExcelData("EditPP", 1, 2).equals("Yes. Not living together")) {
				if(!e.getChildren_YesNotLiving().isSelected()) {
					BaseTest.click(e.getChildren_YesNotLiving());
				} else {
					System.out.println("Yes, Not Living Together Children Status is Already Selected");
				}
			} else {
				if(!e.getChildren_No().isSelected()) {
					BaseTest.click(e.getChildren_No());
				} else {
					System.out.println("No Children Status is Already Selected");
				}
			}
		} else {
             System.out.println("Marital Status is UnMarried - So there is no Children Status to Display/Select");
		}
		
/////////////////////////////////////////////////////////////////////////////////		
		   /////  /////     AGE    ////   /////  
		
		
		BaseTest.select_text(e.getAge_From(), BaseTest.getExcelData("EditPP", 1, 3));
		BaseTest.select_text(e.getAge_To(), BaseTest.getExcelData("EditPP", 1, 4));
		
		////////////////////////   Height  /////////////////////////
		
		BaseTest.select_text(e.getHeight_From(), BaseTest.getExcelData("EditPP", 1, 5));
		BaseTest.select_text(e.getHeight_To(), BaseTest.getExcelData("EditPP", 1, 6));
		
		/////////////////////// Physical Status  ////////////////////////////
		if (BaseTest.getExcelData("EditPP", 1, 8).equalsIgnoreCase("Doesn't matter")) {
			if (!e.getPhysical_DoesntMatter().isSelected()) {
				BaseTest.click(e.getPhysical_DoesntMatter());
			} else {
                System.out.println("Physical Status - Doesn't Matter was Already Selected ");
			}
			
		} else if (BaseTest.getExcelData("EditPP", 1, 8).equalsIgnoreCase("Normal")) {
			if (!e.getPhysical_Normal().isSelected()) {
				BaseTest.click(e.getPhysical_Normal());
			} else {
				System.out.println("Physical Status - Normal was Already Selected ");
			}
			
		} else {
			if (!e.getPhysical_Challenged().isSelected()) {
				BaseTest.click(e.getPhysical_Challenged());
			} else {
				System.out.println("Physical Status - Physically Challenged was Already Selected ");
			}
		}
		
  ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		//////////////////  Mother Tongue  ////////////////////////
		
		//   If any Selected  -  Remove Any From DD and Choose Value
		
		String MotherTongue = BaseTest.getExcelData("EditPP", 1, 7);	
		if (MotherTongue.contains(",")) {
			MT_Split = MotherTongue.split(", ");
			BaseTest.select_deselectAll(e.getMother_Tongue());
			for (int i = 1; i < MT_Split.length; i++) {
				BaseTest.select_text(e.getMother_Tongue(), MT_Split[i]);
			}
			
		}else {	
			BaseTest.select_text(e.getMother_Tongue(), MotherTongue);
		}	
		///////////////   Religion  /////////////////////
	try {	
		String Religionn = BaseTest.getExcelData("EditPP", 1, 29);	
		if (Religionn.contains(",")) {
			Religion_Split = MotherTongue.split(", ");
			BaseTest.select_deselectAll(e.getReligion());
			for (int i = 1; i < Religion_Split.length; i++) {
				BaseTest.select_text(e.getMother_Tongue(), Religion_Split[i]);
			}
			
		}else {	
			BaseTest.select_text(e.getReligion(), Religionn);
		}	
	} catch (Exception e11) {
		System.out.println("There is no Religion Field to Choose");
	}
		/////////////   CAste   //////////////////////////
		try {
		String Caste = BaseTest.getExcelData("EditPP", 1, 9);
		BaseTest.select_deselectAll(e.getCaste());
		if (Caste.contains(", ")) {
			Caste_Split=Caste.split(", ");	
			
			for (int i = 0; i < Caste_Split.length; i++) {
				BaseTest.select_text(e.getCaste(), Caste_Split[i]);
			}
			
		} else {	
			BaseTest.select_text(e.getCaste(), Caste);
		}
		
		} catch (Exception e2) {
			System.out.println("There is no Caste Field to Choose");
		}
		
		///////////////////////  SUbCaste  ///////////////////
		try {
		String SubCaste = BaseTest.getExcelData("EditPP", 1, 10);
		BaseTest.select_deselectAll(e.getSub_Caste());
		if (SubCaste.contains(", ")) {
			SubCaste_Split=SubCaste.split(", ");
			for (int i = 0; i < SubCaste_Split.length; i++) {
				BaseTest.select_text(e.getSub_Caste(), SubCaste_Split[i]);
			}
		} else {	
			BaseTest.select_text(e.getSub_Caste(), SubCaste);
		}
			
		
		} catch (Exception e2) {
			System.out.println("There is no SubCaste Field to Choose");
		}
		
		/////////////////////   Star   /////////////////////
		try {	
		String Star = BaseTest.getExcelData("EditPP", 1, 11);
		BaseTest.select_deselectAll(e.getStar());

		if (Star.contains(", ")) {
			Star_Split=Star.split(", ");	
			for (int j = 0; j < Star_Split.length; j++) {
				BaseTest.select_text(e.getStar(), Star_Split[j] );
			}			
		} else {	
			BaseTest.select_text(e.getStar(), Star);
		}
				
		} catch (Exception e2) {
			System.out.println("There is no Star Field to Choose");
		}
		
		////////////////////////////  Gothram  //////////////
		try {
			String Gothram = BaseTest.getExcelData("EditPP", 1, 12);
			BaseTest.select_deselectAll(e.getGothram());
		if (Gothram.contains(", ")) {
			Gothram_Split= Gothram.split(", ");
			for (int i = 0; i < Gothram_Split.length; i++) {
				BaseTest.select_text(e.getGothram(), Gothram_Split[i]);
			}
		} else {	
			BaseTest.select_text(e.getGothram(), Gothram);
		}
				
		} catch (Exception e2) {
			System.out.println("There is no Gothram Field to Choose");
		}
//////////////////////////////////////////////////////////////////////////
		///////////////////   Dosham   ///////////////////
try {		
		if (BaseTest.getExcelData("EditPP", 1, 13).equalsIgnoreCase("Doesn't matter")) {
			if (!e.getDosham_DoesntMatter().isSelected()) {
				BaseTest.click(e.getDosham_DoesntMatter());
			} else {
                System.out.println("Dosham - Doesn't Matter was Already Selected ");
			}
			
		} else if (BaseTest.getExcelData("EditPP", 1, 13).equalsIgnoreCase("Yes")) {
			if (!e.getDosham_Yes().isSelected()) {
				BaseTest.click(e.getDosham_Yes());
			} else {
				System.out.println("Dosham - Yes was Already Selected ");
			}
			
		} else {
			if (!e.getDosham_NO().isSelected()) {
				BaseTest.click(e.getDosham_NO());
			} else {
				System.out.println("Dosham - No was Already Selected ");
			}
		}
} catch (Exception e23) {
	
}	
//////////////////////////////////////////////////   Education   //////////////////////////////////
/*
String Education = BaseTest.getExcelData("EditPP", 1, 15);

                         ////   ANY  /////
if (BaseTest.getExcelData("EditPP", 1, 14).equalsIgnoreCase("Any")) {
	if (!e.getEducation_Any().isSelected()) {
		BaseTest.click(e.getEducation_Any());
	} else {
        System.out.println("Education - Any was Already Selected ");
	}
	                  ////   ANY DEGREE  ///////
} else if (BaseTest.getExcelData("EditPP", 1, 14).equalsIgnoreCase("Any Degree")) {
	if (!e.getEducation_AnyDegree().isSelected()) {
		BaseTest.click(e.getEducation_AnyDegree());
	} else {
        System.out.println("Education - Any Degree was Already Selected ");
	}
	BaseTest.select_deselectAll(e.getEducation());
	if (Education.contains(", ")) {
		Education_Split= Education.split(", ");
		for (int j = 0; j < Education_Split.length; j++) {
			BaseTest.select_text(e.getEducation(), Education_Split[j]);
		}
	} else {	
		BaseTest.select_text(e.getEducation(), Education);
	}
	
	
	            //////////   Professional Degree ////////
}	else if (BaseTest.getExcelData("EditPP", 1, 14).equalsIgnoreCase("Professional Degree")) {
	if (!e.getEducation_Professional().isSelected()) {
		BaseTest.click(e.getEducation_Professional());
	} else {
        System.out.println("Education - Professional Degree was Already Selected ");
	}
		BaseTest.select_deselectAll(e.getEducation());
		if (Education.contains(", ")) {
			Education_Split= Education.split(", ");
			for (int j = 0; j < Education_Split.length; j++) {
				BaseTest.select_text(e.getEducation(), Education_Split[j]);
			}
		} else {	
			BaseTest.select_text(e.getEducation(), Education);
		}
		            /////////   Specific Degree  ////////
}  else if (BaseTest.getExcelData("EditPP", 1, 14).equalsIgnoreCase("Specific Degree")) {
	if (!e.getEducation_Specific().isSelected()) {
		BaseTest.click(e.getEducation_Specific());
	} else {
        System.out.println("Education - Specific Degree was Already Selected ");
	}
		BaseTest.select_deselectAll(e.getEducation());
		if (Education.contains(", ")) {
			Education_Split= Education.split(", ");
			for (int j = 0; j < Education_Split.length; j++) {
				BaseTest.select_text(e.getEducation(), Education_Split[j]);
			}
		} else {	
			BaseTest.select_text(e.getEducation(), Education);
		}
		
	}
*/
////////////////////////////////////////////////////////////////////////////////////////////////////////
 //////////////////           Occupation  ////////////////////////
   String Occupation = BaseTest.getExcelData("EditPP", 1, 18);
   BaseTest.select_deselectAll(e.getOccupation());
   if (Occupation.contains(", ")) {
	   Occupation_Split=Occupation.split(", ");	
	   for (int i = 0; i <Occupation_Split.length; i++) {
			  BaseTest.select_text(e.getOccupation(), Occupation_Split[i]);	
		}
} else {
	BaseTest.select_text(e.getOccupation(), Occupation);
}
   
   
   
//////////////////////////////////////////////////////////////////////////////////////////////
     ///////////     CitizenSHip  //////
   String Citizenship = BaseTest.getExcelData("EditPP", 1, 19);
   BaseTest.select_deselectAll(e.getCitizenShip());
   if (Citizenship.contains(", ")) {
	   Citizenship_Split = Citizenship.split(", ");
	   for (int i = 0; i < Citizenship_Split.length; i++) {
		     BaseTest.select_text(e.getCitizenShip(), Citizenship_Split[i]);	
		}
} else {  
	BaseTest.select_text(e.getCitizenShip(), Citizenship);
}
    
   
   //////////////////////////////////////////////////////////////////////////////////////////////////
     /////////////////////////   Counrty Living  ////////////////
   String Coutry_Living = BaseTest.getExcelData("EditPP", 1, 20);
   BaseTest.select_deselectAll(e.getCountry_LivingIN());
   if (Coutry_Living.contains(", ")) {
	Country_Split=Coutry_Living.split(", ");
	  for (int i = 0; i < Country_Split.length; i++) {
			BaseTest.select_text(e.getCountry_LivingIN(), Country_Split[i]);
		}
} else { 
	BaseTest.select_text(e.getCountry_LivingIN(), Coutry_Living);
}

   
   
   ////////////////////////////////////////////////////////////////////////////////////////////////////////
try {           //////////////////         Residing State                 ////////////////////////////////////
   if (Coutry_Living.contains("India")) {
	   
	   String Residing_State_India = BaseTest.getExcelData("EditPP", 1, 24);
	   BaseTest.select_deselectAll(e.getResiding_State_India());
	   if (Residing_State_India.contains(",")) {
		Residing_State_India_Split= Residing_State_India.split(", ");
		for (int i = 0; i < Residing_State_India_Split.length; i++) {
			BaseTest.select_text(e.getResiding_State_India(), Residing_State_India_Split[i]);
		}
	} else {
         BaseTest.select_text(e.getResiding_State_India(), Residing_State_India);
	}	
} else if (Coutry_Living.contains("United States of America")) { 
	   String Residing_State_USA = BaseTest.getExcelData("EditPP", 1, 25);
	   BaseTest.select_deselectAll(e.getResiding_State_USA());
	   if (Residing_State_USA.contains(",")) {
		Residing_State_USA_Split= Residing_State_USA.split(", ");
		for (int i = 0; i < Residing_State_India_Split.length; i++) {
			BaseTest.select_text(e.getResiding_State_USA(), Residing_State_India_Split[i]);
		}
	} else {
      BaseTest.select_text(e.getResiding_State_India(), Residing_State_USA);
	}	
} else {
     System.out.println("Country Living Other Than India & USA	");
}
   //  Need to write for Both INDIA and USA were Selected  //
} catch (Exception e1) {
	// TODO: handle exception
}  
   
 ///////////////////////////////////////////////////////////////////////////////////////////////////
   /////////////////////////////////   Food Habits   /////////////////////////////////

   if (BaseTest.getExcelData("EditPP", 1, 21).contains("Doesn't matter")) {
		if(!e.getEating_DoesntMatter().isSelected()) {
			BaseTest.click(e.getEating_DoesntMatter());
		} else {
			System.out.println("Eating Habit - Doesn't Matter is Already Selected");
		}
		
	} else {} 
   if (BaseTest.getExcelData("EditPP", 1, 21).contains("Vegetarian")) {
 		if(!e.getEating_Vegetarian().isSelected()) {
 			BaseTest.click(e.getEating_Vegetarian());
 		} else {
 			System.out.println("Eating Habit -Vegetarian is Already Selected");
 		}
 		
 	} else {} 
   if (BaseTest.getExcelData("EditPP", 1, 21).contains("Non vegetarian")) {
		if(!e.getEating_NonVegetarian().isSelected()) {
			BaseTest.click(e.getEating_NonVegetarian());
		} else {
			System.out.println("Eating Habit - Non Vegetarian is Already Selected");
		}
		
	} else {} 
   if (BaseTest.getExcelData("EditPP", 1, 21).contains("Eggetarian")) {
		if(!e.getEating_Egg_tarian().isSelected()) {
			BaseTest.click(e.getEating_Egg_tarian());
		} else {
			System.out.println("Eating Habit - Eggetarian is Already Selected");
		}
		
	} else {} 
   if (BaseTest.getExcelData("EditPP", 1, 21).contains("Vegan")) {
		if(!e.getEating_Vegan().isSelected()) {
			BaseTest.click(e.getEating_Vegan());
		} else {
			System.out.println("Eating Habit -  Vegan   is Already Selected");
		}
		
	} else {} 
		
		
		////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	     ///////////          Smoking Habits      //////////////////////
	
	if (BaseTest.getExcelData("EditPP", 1, 21).contains("Doesn't matter")) {
		if(!e.getSmoking_DoesntMatter().isSelected()) {
			BaseTest.click(e.getSmoking_DoesntMatter());
		} else {
			System.out.println("Smoking Habit - Doesn't Matter is Already Selected");
		}
		
	} else {} 
   if (BaseTest.getExcelData("EditPP", 1, 21).contains("Non-smoker")) {
 		if(!e.getSmoking_NonSmoker().isSelected()) {
 			BaseTest.click(e.getSmoking_NonSmoker());
 		} else {
 			System.out.println("Smoking Habit - Non-Smoker is Already Selected");
 		}
 		
 	} else {} 
   if (BaseTest.getExcelData("EditPP", 1, 21).contains("Light / Social smoker")) {
		if(!e.getSmoking_LightSmoker().isSelected()) {
			BaseTest.click(e.getSmoking_LightSmoker());
		} else {
			System.out.println("Eating Habit - Light / Social smoker is Already Selected");
		}
		
	} else {} 
   if (BaseTest.getExcelData("EditPP", 1, 21).contains("Regular smoker")) {
		if(!e.getSmoking_RegularSmoker().isSelected()) {
			BaseTest.click(e.getSmoking_RegularSmoker());
		} else {
			System.out.println("Eating Habit - Regular smoker is Already Selected");
		}
		
	} else {} 
		
   ///////////////////////////////////////////////////////////////////////////////////////////////////////////////
   ///////////////////////////           Drinking Habits  ///////////////////////////////
	if (BaseTest.getExcelData("EditPP", 1, 21).contains("Doesn't matter")) {
		if(!e.getDrinking_DoesntMatter().isSelected()) {
			BaseTest.click(e.getDrinking_DoesntMatter());
		} else {
			System.out.println("Smoking Habit - Doesn't Matter is Already Selected");
		}
		
	} else {} 
   if (BaseTest.getExcelData("EditPP", 1, 21).contains("Non-drinker")) {
 		if(!e.getDrinking_NonDrinker().isSelected()) {
 			BaseTest.click(e.getDrinking_NonDrinker());
 		} else {
 			System.out.println("Smoking Habit - Non-Smoker is Already Selected");
 		}
 		
 	} else {} 
   if (BaseTest.getExcelData("EditPP", 1, 21).contains("Light / Social drinker")) {
		if(!e.getDrinking_LightDrinker().isSelected()) {
			BaseTest.click(e.getDrinking_LightDrinker());
		} else {
			System.out.println("Eating Habit - Light / Social smoker is Already Selected");
		}
		
	} else {} 
   if (BaseTest.getExcelData("EditPP", 1, 21).contains("Regular drinker")) {
		if(!e.getDrinking_RegularDrinker().isSelected()) {
			BaseTest.click(e.getDrinking_RegularDrinker());
		} else {
			System.out.println("Eating Habit - Regular smoker is Already Selected");
		}
		
	} else {} 
   
   /////////////////////////////////////////////////////////////////////////////////////////////////
                             ///    Annual Income From   //////////////
   try {
       BaseTest.select_text(e.getAnnual_IncomeFrom(), BaseTest.getExcelData("EditPP", 1, 16));
   }    catch (Exception e2) {  System.out.println("Living Status is Not India");
	}
                    //////          Annual Income To   ///////////////////
       try {
    	   BaseTest.select_text(e.getAnnual_IncomeTo(), BaseTest.getExcelData("EditPP", 1, 17));
	} catch (Exception e2) {  System.out.println("Annual Income From is ANY or Less than 30K ");
	}

       //////////////////////////////   USA   ////////////////////////
       
       try {
           BaseTest.select_text(e.getAnnual_IncomeFrom_Dollar(), BaseTest.getExcelData("EditPP", 1, 26));
       }    catch (Exception e2) {  System.out.println("Living Status is Not India");
    	}
                        //////          Annual Income To   ///////////////////
           try {
        	   BaseTest.select_text(e.getAnnual_IncomeTo_Dollar(), BaseTest.getExcelData("EditPP", 1, 27));
    	} catch (Exception e2) {  System.out.println("Annual Income From is ANY or Less than 30$");
    	}

       ////////////////////////////////////////////////////////////////////////////////////////
            /////////////////////  About My Partner /////////////////////////////////
         BaseTest.clear(e.getAbout_My_Partner());  
         BaseTest.typeData(e.getAbout_My_Partner(), BaseTest.getExcelData("EditPP", 1, 28));  
         
         BaseTest.click(e.getEdit_PP_Save_Btn());
         
         Thread.sleep(3000);
       JavascriptExecutor js = (JavascriptExecutor)driver;
       js.executeScript("window.scrollBy(350,0)");
       
       Thread.sleep(2000);
     
		try {
			acc.moveToElement(g.getMenu_btn());
		} catch (Exception e2) {
		    acc.moveToElement(g.getMenu_btn1());
		}
		Thread.sleep(2000);
		acc.moveToElement(g.getEdit_Profile()).click().build().perform();
		
		Thread.sleep(3000);
		
       
         

	}
	
	
	
	
	public static void locationDetail() throws Throwable {
		
		GothramPOM g = new GothramPOM(driver);
		EditPI_POM i = new EditPI_POM(driver);
		Actions acc= new Actions(driver);
		   Thread.sleep(2000);
			try {
				acc.moveToElement(g.getMenu_btn());
			} catch (Exception e2) {
			    acc.moveToElement(g.getMenu_btn1());
			}
			Thread.sleep(2000);
			acc.moveToElement(g.getEdit_Profile()).click().build().perform(); 
			
			Thread.sleep(3000);
			
			////////////////////////////////////////////////////
			
			
			BaseTest.click(i.getLoaction_edit_btn());
			
			Thread.sleep(3000);
			BaseTest.select_text(i.getPI_Country_living_in(), BaseTest.getExcelData("EditPIHobby", 2, 9));
			
			Thread.sleep(1000);
			try {
				BaseTest.clear(i.getPI_Place_of_birth());
				BaseTest.typeData(i.getPI_Place_of_birth(), BaseTest.getExcelData("EditPIHobby", 2, 10));
			} catch (Exception e) {
				System.out.println("There is no Place of Birth Field ");
			}
			
			Thread.sleep(1000);
			try {
				BaseTest.select_text(i.getPI_Residing_State(), BaseTest.getExcelData("EditPIHobby", 2, 11));
			} catch (Exception e) {		}
			
			Thread.sleep(1000);
			try {
				BaseTest.typeData(i.getPI_Residing_State(), BaseTest.getExcelData("EditPIHobby", 2, 11));
			} catch (Exception e) {		}

			Thread.sleep(1000);
			try {
				BaseTest.select_text(i.getPI_Residing_City(), BaseTest.getExcelData("EditPIHobby", 2, 12));
			} catch (Exception e) {		}
			
			Thread.sleep(1000);
			try {
				BaseTest.typeData(i.getPI_Residing_City(), BaseTest.getExcelData("EditPIHobby", 2, 12));
			} catch (Exception e) {		}
			
			Thread.sleep(1000);
			try {
				BaseTest.typeData(i.getPI_Residing_City_US(), BaseTest.getExcelData("EditPIHobby", 2, 12));
			} catch (Exception e) {		}
			
			Thread.sleep(1000);
			BaseTest.select_text(i.getPI_Citizenship(), BaseTest.getExcelData("EditPIHobby", 2, 13));
			
			Thread.sleep(1000);
			try {
				BaseTest.select_text(i.getPI_Resident_Status(), BaseTest.getExcelData("EditPIHobby", 2, 14));
			} catch (Exception e) {
				
			}

			Thread.sleep(3000);
			BaseTest.click(i.getPI_Basic_Save());
	}
	
	
	////////////////////////////////////////////////////////////////////////////////////////////////////
	
	
	
	public static void email_mobileno_PI_edit() throws Throwable {
		
		GothramPOM g = new GothramPOM(driver);
		EditPI_POM i = new EditPI_POM(driver);

	    Thread.sleep(3000);
	    BaseTest.click(i.getPI_Edit_mail_btn());
	    
	    Thread.sleep(3000);
	    BaseTest.clear(i.getPI_Email());
	    BaseTest.typeData(i.getPI_Email(), BaseTest.getExcelData("EditPIHobby", 1, 15));
	  //  BaseTest.click(i.getPI_Email_save_btn());
	    
	    
	    Thread.sleep(3000);
	    BaseTest.click(i.getPI_mobile_number_edit_btn());
	    
	    Thread.sleep(3000);
	    BaseTest.click(driver.findElement(By.id("verifyMobile")));
	    
	    BaseTest.select_text(i.getPI_Country_code(), BaseTest.getExcelData("EditPIHobby", 1, 16));
	    
	    Thread.sleep(1000);
	    BaseTest.clear(i.getPI_Mobile_no());
	    BaseTest.typeData(i.getPI_Mobile_no(), BaseTest.getExcelData("EditPIHobby", 1, 17));
	    BaseTest.click(i.getPI_Mobile_no_save_button());
		

	}
	
	
	
	
	public static void iimIIT_Education() throws Throwable {
		
		GothramPOM g = new GothramPOM(driver);
		EditPI_POM i = new EditPI_POM(driver);
		
		
		Thread.sleep(3000);
		BaseTest.click(i.getPI_Education_Edit_btn());
		
		int a = BaseTest.getCellCount("IIMIIT");
		
		for (int j = 1; j <=a; j++) {
			
			Thread.sleep(3000);
			BaseTest.select_text(i.getPI_HighestEducation_DD(), BaseTest.getExcelData("IIMIIT", 0, j));
			
			
		}
		
		try {
			BaseTest.select_text(i.getPI_AdditionalDegree_DD(), BaseTest.getExcelData("EditPI1", 1, 2));
		} catch (Exception e) {
			System.out.println("There is no Additonal Degree Field to Choose the given Value");
		}
     
		
		BaseTest.clear(i.getPI_College_Value());
		BaseTest.typeData(i.getPI_College_Value(), BaseTest.getExcelData("EditPI1", 1, 3));
		
		BaseTest.clear(i.getPI_Education_Detail_Value());
		BaseTest.typeData(i.getPI_Education_Detail_Value(), BaseTest.getExcelData("EditPI1", 1, 4));
		
		////////////
		String Employed_In = BaseTest.getExcelData("EditPI1", 1, 5);
		try {
		if (Employed_In.contains("Government")) {
			BaseTest.click(i.getPI_Government());
		}else if (Employed_In.contains("Defence")) {
			BaseTest.click(i.getPI_Defence());
		}else if (Employed_In.contains("Private")) {
			BaseTest.click(i.getPI_Private());
		}else if (Employed_In.contains("Business")) {
			BaseTest.click(i.getPI_Business());
		}else if (Employed_In.contains("Self Employed")) {
			BaseTest.click(i.getPI_SelfEmployed());
		}else if (Employed_In.contains("Not Working")) {
			BaseTest.click(i.getPI_NotWorking());
		}else { }
		} catch (Exception e) {		}
		//////////////////
		
		try {
			BaseTest.select_text(i.getPI_Occupation_DD(), BaseTest.getExcelData("EditPI1", 1, 6));
		} catch (Exception e) {
			System.out.println("There is no Occupation Filed to Choose the given Value");
		}
		
		////////////
		
		try {
			BaseTest.clear(i.getPI_OccupationDetail_DD());
			BaseTest.typeData(i.getPI_OccupationDetail_DD(), BaseTest.getExcelData("EditPI1", 1, 7));
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		BaseTest.select_text(i.getPI_AnnualIncome_Currency(), BaseTest.getExcelData("EditPI1", 1, 8));
		
		Thread.sleep(3000);
		/*try {
			BaseTest.select_text(i.getPI_AnnualIncome_DD_Value(), BaseTest.getExcelData("EditPI1", 1, 9));
		} catch (Exception e) {
			Thread.sleep(3000);
			BaseTest.clear(i.getPI_AnnualIncome_DD_Value());
			BaseTest.typeData(i.getPI_AnnualIncome_DD_Value(), BaseTest.getExcelData("EditPI", 1, 10));
		}*/
		
		Thread.sleep(3000);
		BaseTest.click(i.getPI_Basic_Save());
		

	
		
		
		

	}
	
	
	
}
