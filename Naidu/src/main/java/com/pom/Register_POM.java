package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseTest;

public class Register_POM extends BaseTest{
	
	public Register_POM(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(id="selectprofile")
	private WebElement ProfileFor_btn;
	public WebElement getProfileFor_btn() {
		return ProfileFor_btn;
	}



	@FindBy(xpath="//label[contains(text(),'Myself')]")
	WebElement MySelf;
	public WebElement getMySelf() {
		return MySelf;
	}
	
	
	@FindBy(xpath="//label[contains(text(),'Daughter')]")
	WebElement Daughter;
	public WebElement getDaughter() {
		return Daughter;
	}
	
	@FindBy(xpath = "//label[contains(text(),'Son')]")
	WebElement Son;
	public WebElement getSon() {
		return Son;
	}
	
	
	@FindBy(xpath = "//label[contains(text(),'Sister')]")
	WebElement Sister;
	public WebElement getSister() {
		return Sister;
	}
	
	
	@FindBy(xpath = "//label[contains(text(),'Brother')]")
	WebElement Brother;
	public WebElement getBrother() {
		return Brother;
	}
	
	@FindBy(xpath = "//label[contains(text(),'Relative')]")
	WebElement Relative;
	public WebElement getRelative() {
		return Relative;
	}
	
	
	@FindBy(xpath = "//label[contains(text(),'Friend')]")
	WebElement Friend;
	public WebElement getFriend() {
		return Friend;
	}
	
	
	@FindBy(xpath = "//*[@id=\"selectprofile\"]/ul[2]/li[1]/label/i")
	WebElement Male;
	public WebElement getMale() {
		return Male;
	}

	
	@FindBy(xpath = "//*[@id=\"selectprofile\"]/ul[2]/li[2]/label/i")
	WebElement Female;
	public WebElement getFemale() {
		return Female;
	}
	
	
	@FindBy(id="name")
	WebElement Name;
	public WebElement getName() {
		return Name;
	}
	
	
	
	@FindBy(xpath = "//*[@id=\"select2-countryCode12-container\"]")
	WebElement Mobile_CountryCode;
	public WebElement getMobile_CountryCode() {
		return Mobile_CountryCode;
	}
	
	
	@FindBy(xpath = "//*[@id=\"countryCode\"]/span/span[1]/input")
	WebElement Country_Code_Search;
	public WebElement getCountry_Code_Search() {
		return Country_Code_Search;
	}
	//*[@id="select2-countryCode12-result-hz0d-+1"]
	@FindBy(xpath = "(//li[contains(text(),'+1')])[1]")
	WebElement Country_Code_Select;
	public WebElement getCountry_Code_Select() {
		return Country_Code_Select;
	}



	@FindBy(id="mobileNo")
	WebElement Mobile_Number;
	public WebElement getMobile_Number() {
		return Mobile_Number;
	}
	
	
	@FindBy(xpath = "//button[contains(text(),'Register Free')]")
	WebElement Register_Free_Btn;
	public WebElement getRegister_Free_Btn() {
		return Register_Free_Btn;
	}
	
	
	////////////////////////
	
	
	@FindBy(id="DOB")
	WebElement DOB;
	public WebElement getDOB() {
		return DOB;
	}
	
	
	@FindBy(xpath = "//select[@class='ui-datepicker-month']")
	WebElement Month;
	public WebElement getMonth() {
		return Month;
	}
	
	
	@FindBy(xpath = "//select[@class='ui-datepicker-year']")
	WebElement Year;
	public WebElement getYear() {
		return Year;
	}
	
	@FindBy(xpath = "//td[@class=' ui-datepicker-week-end ']")
	WebElement Date;
	public WebElement getDate() {
		return Date;
	}
	
	////
	
	
	@FindBy(id="religion")
	WebElement Religion;
	public WebElement getReligion() {
		return Religion;
	}
	
	
	@FindBy(id="subCaste")
	WebElement SubCaste;
	public WebElement getSubCaste() {
		return SubCaste;
	}
	
	@FindBy(id="subCasteOthers")
	WebElement SubCaste_Others_TextBox;
	public WebElement getSubCaste_Others_TextBox() {
		return SubCaste_Others_TextBox;
	}
	
	
	@FindBy(id="motherTongue")
	WebElement MotherTongue;
	public WebElement getMotherTongue() {
		return MotherTongue;
	}
	
	
	@FindBy(id="email")
	WebElement Email;
	public WebElement getEmail() {
		return Email;
	}
	
	@FindBy(id="password")
	WebElement Passowrd;
	public WebElement getPassowrd() {
		return Passowrd;
	}
	
	
	@FindBy(xpath = "//input[@value='Continue']")
	WebElement Continue_page2;
	public WebElement getContinue_page2() {
		return Continue_page2;
		 
		
		
	}
	
	
	///
	
	
	@FindBy(id="star")
	WebElement Star;
	public WebElement getStar() {
		return Star;
	}
	
	
	@FindBy(id="raasi")
	WebElement Raasi;
	public WebElement getRaasi() {
		return Raasi;
	}
	
	
	
	@FindBy(id="gothramText")
	WebElement Gothram_Text;
	public WebElement getGothram_Text() {
		return Gothram_Text;
	}
	
	
	@FindBy(xpath = "//label[@for='manglik1']")
	WebElement Dosham_Yes;
	public WebElement getDosham_Yes() {
		return Dosham_Yes;
	}
	
	
	@FindBy(xpath = "//label[@for='manglik2']")
	WebElement Dosham_No;
	public WebElement getDosham_No() {
		return Dosham_No;
	}
	
	@FindBy(xpath = "//label[@for='manglik3']")
	WebElement Dosham_DontKnow;
	public WebElement getDosham_DontKnow() {
		return Dosham_DontKnow;
	}
	
	@FindBy(id = "manglik_m4")
	WebElement Cheva_Dosham;
	public WebElement getCheva_Dosham() {
		return Cheva_Dosham;
	}
	
	
	@FindBy(id="manglik_m5")
	WebElement Naga_Dosham;
	public WebElement getNaga_Dosham() {
		return Naga_Dosham;
	}
	
	@FindBy(id="manglik_m10")
	WebElement Kala_Sarpa_Dosham;
	public WebElement getKala_Sarpa_Dosham() {
		return Kala_Sarpa_Dosham;
	}
	
	
	@FindBy(id="manglik_m20")
	WebElement Ragu_Dosham;
	public WebElement getRagu_Dosham() {
		return Ragu_Dosham;
	}
	
	@FindBy(id="manglik_m40")
	WebElement Ketu_Dosham;
	public WebElement getKetu_Dosham() {
		return Ketu_Dosham;
	}
	
	@FindBy(id="manglik_m80")
	WebElement Kaalatra_Dosham;
	public WebElement getKaalatra_Dosham() {
		return Kaalatra_Dosham;
	}
	
	
	@FindBy(xpath = "//a[contains(text(),'Continue')]")
	WebElement Continue_Page3;
	public WebElement getContinue_Page3() {
		return Continue_Page3;
	}
	
	
	///
	
	
	@FindBy(id="mStatus1")
	WebElement Unmarried;
	public WebElement getUnmarried() {
		return Unmarried;
	}
	
	
	@FindBy(id="mStatus2")
	WebElement Widow;
	public WebElement getWidow() {
		return Widow;
	}
	
	@FindBy(id="mStatus3")
	WebElement Divorced;
	public WebElement getDivorced() {
		return Divorced;
	}
	
	@FindBy(id="mStatus4")
	WebElement Seperated;
	public WebElement getSeperated() {
		return Seperated;
	}
	
	
	////
	
	@FindBy(xpath="//label[@for='noOfChildren1']")
	WebElement Child_None;
	public WebElement getChild_None() {
		return Child_None;
	}
	
	
	@FindBy(xpath="//label[@for='noOfChildren2']")
	WebElement Child_one;
	public WebElement getChild_one() {
		return Child_one;
	}
	
	@FindBy(xpath="//label[@for='noOfChildren3']")
	WebElement Child_two;
	public WebElement getChild_two() {
		return Child_two;
	}
	
	@FindBy(xpath="//label[@for='noOfChildren4']")
	WebElement Child_Three;
	public WebElement getChild_Three() {
		return Child_Three;
	}
	
	
	@FindBy(xpath="//label[@for='noOfChildren5']")
	WebElement Child_Three_Plus;
	public WebElement getChild_Three_Plus() {
		return Child_Three_Plus;
	}
	
	
	//////////////////
	
	
	
	
	@FindBy(id="heightFeet")
	WebElement Height;
	public WebElement getHeight() {
		return Height;
	}
	
	
	///
	
	@FindBy(id="familyStatuss1")
	WebElement Middle_CLass;
	public WebElement getMiddle_CLass() {
		return Middle_CLass;
	}
	
	
	
	@FindBy(id="familyStatuss2")
	WebElement upper_Middle_CLass;
	public WebElement getUpper_Middle_CLass() {
		return upper_Middle_CLass;
	}
	
	@FindBy(id="familyStatuss4")
	WebElement Rich_Affluent;
	public WebElement getRich_Affluent() {
		return Rich_Affluent;
	}
	
	////
	
	
	@FindBy(id="familyTypes1")
	WebElement Joint_Family;
	public WebElement getJoint_Family() {
		return Joint_Family;
	}
	
	@FindBy(id="familyTypes2")
	WebElement Neuclear_Family;
	public WebElement getNeuclear_Family() {
		return Neuclear_Family;
	}
	
	
	@FindBy(id="physicalStatuss0")
	WebElement Normal;
	public WebElement getNormal() {
		return Normal;
	}
	
	
	
	@FindBy(id="physicalStatuss1")
	WebElement Physical_Chalenged;
	public WebElement getPhysical_Chalenged() {
		return Physical_Chalenged;
	}
	
	
	@FindBy(xpath="//a[contains(text(),'Continue')]")
	WebElement continue_page4;
	public WebElement getContinue_page4() {
		return continue_page4;
	}
	
	//
	
	@FindBy(id="labelsamecaste1")
	WebElement Bachllour_engineering;
	public WebElement getBachllour_engineering() {
		return Bachllour_engineering;
	}
	
	@FindBy(id="labelsamecaste2")
	WebElement Master_engineering;
	public WebElement getMaster_engineering() {
		return Master_engineering;
	}
	
	
	@FindBy(id="labelsamecaste3")
	WebElement Bachllour_Arts;
	public WebElement getBachllour_Arts() {
		return Bachllour_Arts;
	}
	
	@FindBy(id="labelsamecaste4")
	WebElement Master_Arts;
	public WebElement getMaster_Arts() {
		return Master_Arts;
	}
	
	@FindBy(id="labelsamecaste15")
	WebElement Bachlour_Management;
	public WebElement getBachlour_Management() {
		return Bachlour_Management;
	}
	
	@FindBy(id="labelsamecaste16")
	WebElement Master_Management;
	public WebElement getMaster_Management() {
		return Master_Management;
	}
	
	@FindBy(id="labelsamecaste17")
	WebElement Bachlour_Medicine;
	public WebElement getBachlour_Medicine() {
		return Bachlour_Medicine;
	}

	@FindBy(id="labelsamecaste18")
	WebElement Master_Medicine;
	public WebElement getMaster_Medicine() {
		return Master_Medicine;
	}



	@FindBy(id="labelsamecaste13")
	WebElement Bachlour_Legal;
	public WebElement getBachlour_Legal() {
		return Bachlour_Legal;
	}
	
	@FindBy(id="labelsamecaste14")
	WebElement Master_Legal;
	public WebElement getMaster_Legal() {
		return Master_Legal;
	}
	
	
	@FindBy(id="labelsamecaste12")
	WebElement Finance;
	public WebElement getFinance() {
		return Finance;
	}
	
	
	
	@FindBy(id="labelsamecaste8")
	WebElement Service;
	public WebElement getService() {
		return Service;
	}
	
	
	@FindBy(id="labelsamecaste9")
	WebElement Phd;
	public WebElement getPhd() {
		return Phd;
	}
	
	
	@FindBy(id="labelsamecaste10")
	WebElement Diploma;
	public WebElement getDiploma() {
		return Diploma;
	}
	
	
	@FindBy(id="labelsamecaste11")
	WebElement Higher_Secondary;
	public WebElement getHigher_Secondary() {
		return Higher_Secondary;
	}
	
	
	@FindBy(id="ongoingEducation")
	WebElement Ongoing;
	public WebElement getOngoing() {
		return Ongoing;
	}
	
	
	@FindBy(id="educationCategory")
	WebElement Highest_education;
	public WebElement getHighest_education() {
		return Highest_education;
	}
	
	@FindBy(id="employmentCategorys1")
	WebElement Government;
	public WebElement getGovernment() {
		return Government;
	}
	
	@FindBy(id="employmentCategorys2")
	WebElement Defence;
	public WebElement getDefence() {
		return Defence;
	}
	
	@FindBy(id="employmentCategorys3")
	WebElement privatee;
	public WebElement getPrivatee() {
		return privatee;
	}
	
	@FindBy(id="employmentCategorys4")
	WebElement Businees;
	public WebElement getBusinees() {
		return Businees;
	}
	
	@FindBy(id="employmentCategorys6")
	WebElement SelfEmployed;
	public WebElement getSelfEmployed() {
		return SelfEmployed;
	}
	
	
	@FindBy(id="employmentCategorys7")
	WebElement NotWorking;
	public WebElement getNotWorking() {
		return NotWorking;
	}
	
	
	@FindBy(id="occupation")
	WebElement Occupation;
	public WebElement getOccupation() {
		return Occupation;
	}
	
	
	@FindBy(id="country")
	WebElement Work_Location;
	public WebElement getWork_Location() {
		return Work_Location;
	}
	
	//
	
	@FindBy(id="placeofbirth")
	WebElement placeOfBirth;
	public WebElement getPlaceOfBirth() {
		return placeOfBirth;
	}
	
	@FindBy(id="residingState")
	WebElement ResidingState_text;
	public WebElement getResidingState_text() {
		return ResidingState_text;
	}
	
	
	@FindBy(id="residingCity")
	WebElement ResidingCity_Text;
	public WebElement getResidingCity_Text() {
		return ResidingCity_Text;
	}
	
	@FindBy(id="citizenship")
	WebElement Citizenship;
	public WebElement getCitizenship() {
		return Citizenship;
	}
	
	@FindBy(xpath = "//a[contains(text(),'Continue')]")
	WebElement Continue_page5;
	public WebElement getContinue_page5() {
		return Continue_page5;
	}
	
	
	
	
	@FindBy(id="educationCategory")
	WebElement Highest_Education;
	public WebElement getHighest_Education() {
		return Highest_Education;
	}
	
	
	@FindBy(id="educationadditional")
	WebElement Additional_Education;
	public WebElement getAdditional_Education() {
		return Additional_Education;
	}
	
	
	@FindBy(id="annualIncomeCurrency")
	WebElement Currency_Country;
	public WebElement getCurrency_Country() {
		return Currency_Country;
	}
	
	@FindBy(id="annualIncome")
	WebElement Income_Text;
	public WebElement getIncome_Text() {
		return Income_Text;
	}
	
	
	
	
	
}
