package com.pages;

import base.BaseTest;
import pom.cmlogin.Search_POM;

public class SearchMethod extends BaseTest {
	
	
	public static void regularSearch() throws Throwable {
		
		Search_POM s = new Search_POM(driver);
		
		Thread.sleep(2000);
		BaseTest.click(s.getSearch_Menu_btn());
		

		BaseTest.select_text(s.getRegular_AgeFrom_DD(), BaseTest.getExcelData("Regular Search", 1, 1));
		BaseTest.select_text(s.getRegular_AgeTo_DD(), BaseTest.getExcelData("Regular Search", 1, 2));
		
		BaseTest.select_text(s.getRegular_HeightFrom_DD(), BaseTest.getExcelData("Regular Search", 1, 3));
		BaseTest.select_text(s.getRegular_HeightTo_DD(), BaseTest.getExcelData("Regular Search", 1, 4));
		
//////////////////////////////////////////////////////////////////////////
		
////////////////////////////////////Marital Status   ////////////////////////////////////		
Thread.sleep(2000);
if (BaseTest.getExcelData("Regular Search", 1, 5).contains("Unmarried")) {
if(!s.getRegular_Marital_Unmarried().isSelected()) {
BaseTest.click(s.getRegular_Marital_Unmarried());
} else {
System.out.println("Unmarried Marital is Already Selected");
}

} else {}
if (BaseTest.getExcelData("Regular Search", 1, 5).contains("Widow / Widower")) {
if(!s.getRegular_Marital_Widow().isSelected()) {
BaseTest.click(s.getRegular_Marital_Widow());
} else {
System.out.println("Widow / Widower Marital is Already Selected");
}

} else {} 
if (BaseTest.getExcelData("Regular Search", 1, 5).contains("Divorced")) {
if(!s.getRegular_Marital_Divorceed().isSelected()) {
BaseTest.click(s.getRegular_Marital_Divorceed());
} else {
System.out.println("Divorced Marital is Already Selected");
}

} else {} 
if (BaseTest.getExcelData("Regular Search", 1, 5).contains("Separated")) {
if(!s.getRegular_Marital_Seperated().isSelected()) {
BaseTest.click(s.getRegular_Marital_Seperated());
} else {
System.out.println("Seperated Marital is Already Selected");
}

} else {}
if (BaseTest.getExcelData("Regular Search", 1, 5).contains("Any")) {
if(!s.getRegular_Marital_Any().isSelected()) {
BaseTest.click(s.getRegular_Marital_Any());
} else {
System.out.println("Any Marital is Already Selected");
}
}	
/////////////////////////////////////////   *  *  *  *  *   ///////////////////////////////	
/////////     Have Children  //////
if (!s.getRegular_Marital_Unmarried().isSelected()||s.getRegular_Marital_Divorceed().isSelected()||s.getRegular_Marital_Seperated().isSelected()||s.getRegular_Marital_Widow().isSelected()||s.getRegular_Marital_Any().isSelected()) {
if (BaseTest.getExcelData("Regular Search", 1, 6).equals("Doesn't matter")) {
if(!s.getRegular_HaveChild__Doesnt().isSelected()) {
BaseTest.click(s.getRegular_HaveChild__Doesnt());
} else {
System.out.println("Doesn't Matter Children Status is Already Selected");
}

} else if (BaseTest.getExcelData("Regular Search", 1, 6).equals("Yes. Living together")) {
if(!s.getRegular_HaveChild_YesLiving().isSelected()) {
BaseTest.click(s.getRegular_HaveChild_YesLiving());
} else {
System.out.println("Yes Living Together Children Status is Already Selected");
}
} else if (BaseTest.getExcelData("Regular Search", 1, 6).equals("Yes. Not living together")) {
if(!s.getRegular_HaveChild_Yes_Not_Living().isSelected()) {
BaseTest.click(s.getRegular_HaveChild_Yes_Not_Living());
} else {
System.out.println("Yes, Not Living Together Children Status is Already Selected");
}
} else {
if(!s.getRegular_HaveChild_No().isSelected()) {
BaseTest.click(s.getRegular_HaveChild_No());
} else {
System.out.println("No Children Status is Already Selected");
}
}
} else {
System.out.println("Marital Status is UnMarried - So there is no Children Status to Display/Select");
}

/////////////////////////////////////////////////////////////////////////////////	
               //       Sub Caste   ///// 

/*String SubCaste = BaseTest.getExcelData("Regular Search", 1, 7);
Thread.sleep(2000);
BaseTest.click(s.getRegular_Subcaste_Value());
if (SubCaste.contains(", ")) {
	String[] Subcaste = SubCaste.split(", ");
	for (int j = 0; j < Subcaste.length; j++) {
		
		Thread.sleep(1000);
		acc.doubleClick(driver.findElement(By.xpath("//option[contains(text(),'"+j+"')]"))).build().perform();
		//acc.moveToElement(driver.findElement(By.xpath("//option[contains(text(),'"+j+"')]"))).doubleClick().build().perform();
		Thread.sleep(1000);
	} }else{
		Thread.sleep(2000);
		BaseTest.click(s.getRegular_Subcaste_Value());
		acc.doubleClick(driver.findElement(By.xpath("//option[contains(text(),'"+SubCaste+"')]"))).build().perform();
	}
	*/
  /////////////////////////////////////////////////////////////////////////////////////

 /* String MotherTongue = BaseTest.getExcelData("Regular Search", 1, 8);
  
  Thread.sleep(2000);
	BaseTest.click(s.getRegular_MOtherTongue_Value());
  
		if (MotherTongue.contains(", ")) {
			String[] Mother_tongue = MotherTongue.split(", ");
			for (int j = 0; j < Mother_tongue.length; j++) {
				
				Thread.sleep(1000);
				acc.doubleClick(driver.findElement(By.xpath("//option[contains(text(),'"+j+"')]"))).build().perform();
				//acc.moveToElement(driver.findElement(By.xpath("//option[contains(text(),'"+j+"')]"))).doubleClick().build().perform();
				Thread.sleep(1000);
			} }else{
				Thread.sleep(2000);
				BaseTest.click(s.getRegular_MOtherTongue_Value());
				Thread.sleep(1000);
				acc.doubleClick(driver.findElement(By.xpath("//option[contains(text(),'"+SubCaste+"')]"))).build().perform();
			}  */
/////////////////////////////////////////////////////////////////////////////////////////////////
	/*	String Countryliving = BaseTest.getExcelData("Regular Search", 1, 9);
		Thread.sleep(2000);
		BaseTest.click(s.getRegular_CountryLiving_Value());
		
		if (Countryliving.contains(", ")) {
			String[] Country_Living = Countryliving.split(", ");
			for (int j = 0; j < Country_Living.length; j++) {
				
				Thread.sleep(1000);
				acc.doubleClick(driver.findElement(By.xpath("//option[contains(text(),'"+j+"')]"))).build().perform();
				//acc.moveToElement(driver.findElement(By.xpath("//option[contains(text(),'"+j+"')]"))).doubleClick().build().perform();
				Thread.sleep(1000);
			} }else{
				Thread.sleep(2000);
				BaseTest.click(s.getRegular_CountryLiving_Value());
				Thread.sleep(1000);
				acc.doubleClick(driver.findElement(By.xpath("//option[contains(text(),'"+SubCaste+"')]"))).build().perform();
			} */
////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
	/*	String Education = BaseTest.getExcelData("Regular Search", 1, 10);
		Thread.sleep(2000);
		BaseTest.click(s.getRegular_Education_Value());  
		
		if (Education.contains(", ")) {
			String[] Education_detail = Education.split(", ");
			for (int j = 0; j < Education_detail.length; j++) {
				
				Thread.sleep(1000);
				acc.doubleClick(driver.findElement(By.xpath("//option[contains(text(),'"+j+"')]"))).build().perform();
				//acc.moveToElement(driver.findElement(By.xpath("//option[contains(text(),'"+j+"')]"))).doubleClick().build().perform();
				Thread.sleep(1000);
			} }else{
				Thread.sleep(2000);
				BaseTest.click(s.getRegular_Education_Value());
				Thread.sleep(1000);
				acc.doubleClick(driver.findElement(By.xpath("//option[contains(text(),'"+SubCaste+"')]"))).build().perform();
			}
		*/
////////////////////////////////////////////////////////////////////////////////////////////
		
		String ShowProfile = BaseTest.getExcelData("Regular Search", 1, 11);
		
		if (ShowProfile.contains("Photo")) {
			if (!s.getRegular_ShowProfile_Photo().isSelected()) {
				BaseTest.click(s.getRegular_ShowProfile_Photo());
			}else {
				System.out.println("Show Profile With Photo was Already Selected");
			}
		} else { }
		if (ShowProfile.contains("Horoscope")) {
			if (!s.getRegular_ShowProfile_Horoscope().isSelected()) {
				BaseTest.click(s.getRegular_ShowProfile_Horoscope());
			}else {
				System.out.println("Show Profile With Horoscopw was Already Selected");
			}
		} else { }
		
/////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		String DontShow = BaseTest.getExcelData("Regular Search", 1, 12);
		if (DontShow.contains("Contacted")) {
			if (!s.getRegular_DontShow_Contacted().isSelected()) {
				BaseTest.click(s.getRegular_DontShow_Contacted());
			}else {
				System.out.println("Dont Show Already Contacted Profile was Already Selected");
			}
		} else { }
		
		if (DontShow.contains("Viewed")) {
			if (!s.getAdvanced_DontShow_Viewed().isSelected()) {
				BaseTest.click(s.getAdvanced_DontShow_Viewed());
			}else {
				System.out.println("Dont Show Already Viewed Profile was Already Selected");
			}
		} else { }
		
		if (DontShow.contains("Shortlisted")) {
			if (!s.getAdvanced_DontShow_ShortListed().isSelected()) {
				BaseTest.click(s.getAdvanced_DontShow_ShortListed());
			}else {
				System.out.println("Dont Show Already Shortlisted Profile was Already Selected");
			}
		} else { }
		
		if (DontShow.contains("Blocked")) {
			if (!s.getAdvanced_DontShow_Blocked().isSelected()) {
				BaseTest.click(s.getAdvanced_DontShow_Blocked());
			}else {
				System.out.println("Dont Show Already Blocked Profile was Already Selected");
			}
		} else { }
		
		
		if (DontShow.contains("Ignored")) {
			if (!s.getAdvanced_DontShow_Ignored().isSelected()) {
				BaseTest.click(s.getAdvanced_DontShow_Ignored());
			}else {
				System.out.println("Dont Show Already Ignored Profile was Already Selected");
			}
		} else { }
		
		
		////////////////////////////////////////////////////////////////////////////////////////////////
		
		BaseTest.click(s.getRegular_SEARCH_Btn());
		
		
		///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
			
		
		
	}

}
