package pom.cmlogin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseTest;

public class Search_POM extends BaseTest{
	
	
	public Search_POM(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	

	@FindBy(xpath="(//a[contains(text(),'Search')])[1]")
	private WebElement Search_Menu_btn;
	public WebElement getSearch_Menu_btn() {
		return Search_Menu_btn;
	}
	
	@FindBy(xpath="//a[contains(text(),'Regular Search')]")
	private WebElement	Regular_search_Menubtn;
	public WebElement getRegular_search_Menubtn() {
		return Regular_search_Menubtn;
	}
	
	@FindBy(xpath="//a[contains(text(),'Advanced Search')]")
	private WebElement	Advanced_search_Menubtn;
	public WebElement getAdvanced_search_Menubtn() {
		return Advanced_search_Menubtn;
	}
	
	
	@FindBy(xpath="//a[contains(text(),'Keyword Search')]")
	private WebElement	KeyWord_search_Menubtn;
	public WebElement getKeyWord_search_Menubtn() {
		return KeyWord_search_Menubtn;
	}
	
	
	@FindBy(xpath="(//a[contains(text(),'Regular')])[2]")
	private WebElement Regular_Search;
	public WebElement getRegular_Search() {
		return Regular_Search;
	}

	@FindBy(xpath="(//a[contains(text(),'Advanced')])[2]")
	private WebElement Advanced_Search;
	public WebElement getAdvanced_Search() {
		return Advanced_Search;
	}
	
	@FindBy(xpath="(//a[contains(text(),'Keyword Search')])[2]")
	private WebElement Keyword_Search;
	public WebElement getKeyword_Search() {
		return Keyword_Search;
	}
	
	
	@FindBy(xpath="//a[contains(text(),'By Matrimony Id')]")
	private WebElement Search_By_ID;
	public WebElement getSearch_By_ID() {
		return Search_By_ID;
	}

	
	@FindBy(id="ageFrom")
	private WebElement Regular_AgeFrom_DD;
	public WebElement getRegular_AgeFrom_DD() {
		return Regular_AgeFrom_DD;
	}

	@FindBy(id="ageTo")
	private WebElement Regular_AgeTo_DD;
	public WebElement getRegular_AgeTo_DD() {
		return Regular_AgeTo_DD;
	}
	
	@FindBy(id="heightFrom")
	private WebElement Regular_HeightFrom_DD;
	public WebElement getRegular_HeightFrom_DD() {
		return Regular_HeightFrom_DD;
	}
	
	
	@FindBy(id="heightTo")
	private WebElement Regular_HeightTo_DD;
	public WebElement getRegular_HeightTo_DD() {
		return Regular_HeightTo_DD;
	}
	
	
	@FindBy(id="maritalStatus0")
	private WebElement Regular_Marital_Any;
	public WebElement getRegular_Marital_Any() {
		return Regular_Marital_Any;
	}
	
	@FindBy(id="maritalStatus1")
	private WebElement Regular_Marital_Unmarried;
	public WebElement getRegular_Marital_Unmarried() {
		return Regular_Marital_Unmarried;
	}
	
	@FindBy(id="maritalStatus2")
	private WebElement Regular_Marital_Widow;
	public WebElement getRegular_Marital_Widow() {
		return Regular_Marital_Widow;
	}
	
	
	@FindBy(id="maritalStatus3")
	private WebElement Regular_Marital_Divorceed;
	public WebElement getRegular_Marital_Divorceed() {
		return Regular_Marital_Divorceed;
	}
	
	
	@FindBy(id="maritalStatus4")
	private WebElement Regular_Marital_Seperated;
	public WebElement getRegular_Marital_Seperated() {
		return Regular_Marital_Seperated;
	}
	
	@FindBy(id="haveChildren1")
	private WebElement Regular_HaveChild_No;
	public WebElement getRegular_HaveChild_No() {
		return Regular_HaveChild_No;
	}
	
	@FindBy(id="haveChildren2")
	private WebElement Regular_HaveChild_YesLiving;
	public WebElement getRegular_HaveChild_YesLiving() {
		return Regular_HaveChild_YesLiving;
	}
	
	@FindBy(id="haveChildren3")
	private WebElement Regular_HaveChild_Yes_Not_Living;
	public WebElement getRegular_HaveChild_Yes_Not_Living() {
		return Regular_HaveChild_Yes_Not_Living;
	}
	
	@FindBy(id="haveChildren")
	private WebElement Regular_HaveChild__Doesnt;
	public WebElement getRegular_HaveChild__Doesnt() {
		return Regular_HaveChild__Doesnt;
	}
	
	
	@FindBy(id="subcasteTemp")
	private WebElement Regular_Subcaste_Value;
	public WebElement getRegular_Subcaste_Value() {
		return Regular_Subcaste_Value;
	}
	
	
	@FindBy(id="subcaste")
	private WebElement Regular_Subcaste_Choosed;
	public WebElement getRegular_Subcaste_Choosed() {
		return Regular_Subcaste_Choosed;
	}
	
	@FindBy(id="motherTongueTemp")
	private WebElement Regular_MOtherTongue_Value;
	public WebElement getRegular_MOtherTongue_Value() {
		return Regular_MOtherTongue_Value;
	}
	
	
	@FindBy(id="motherTongue")
	private WebElement Regular_MOtherTongue_Choosed;
	public WebElement getRegular_MOtherTongue_Choosed() {
		return Regular_MOtherTongue_Choosed;
	}
	
	
	@FindBy(id="countryTemp")
	private WebElement Regular_CountryLiving_Value;
	public WebElement getRegular_CountryLiving_Value() {
		return Regular_CountryLiving_Value;
	}
	
	@FindBy(id="country")
	private WebElement Regular_CountryLiving_Choosed;
	public WebElement getRegular_CountryLiving_Choosed() {
		return Regular_CountryLiving_Choosed;
	}
	
	@FindBy(id="educationTemp")
	private WebElement Regular_Education_Value;
	public WebElement getRegular_Education_Value() {
		return Regular_Education_Value;
	}
	
	@FindBy(id="education")
	private WebElement Regular_Education_Choosed;
	public WebElement getRegular_Education_Choosed() {
		return Regular_Education_Choosed;

	}
	
	@FindBy(id="photoOpt")
	private WebElement Regular_ShowProfile_Photo;
	public WebElement getRegular_ShowProfile_Photo() {
		return Regular_ShowProfile_Photo;
	}
	
	
	@FindBy(id="horoscopeOpt")
	private WebElement Regular_ShowProfile_Horoscope;
	public WebElement getRegular_ShowProfile_Horoscope() {
		return Regular_ShowProfile_Horoscope;
	}
	
	@FindBy(id="alreadyContOpt")
	private WebElement Regular_DontShow_Contacted;
	public WebElement getRegular_DontShow_Contacted() {
		return Regular_DontShow_Contacted;
	}
	
	@FindBy(id="alreadyViewedOpt")
	private WebElement Regular_DontShow_Viewed;
	public WebElement getRegular_DontShow_Viewed() {
		return Regular_DontShow_Viewed;
	}
	
	@FindBy(id="shortlistOpt")
	private WebElement Regular_DontShow_ShortListed;
	public WebElement getRegular_DontShow_ShortListed() {
		return Regular_DontShow_ShortListed;
	}
	
	@FindBy(id="ignoredOpt")
	private WebElement Regular_DontShow_Blocked;
	public WebElement getRegular_DontShow_Blocked() {
		return Regular_DontShow_Blocked;
	}
	
	@FindBy(id="igOpt")
	private WebElement Regular_DontShow_Ignored;
	public WebElement getRegular_DontShow_Ignored() {
		return Regular_DontShow_Ignored;
	}
	
		
	@FindBy(xpath="//input[@value='Search']")
	private WebElement Regular_SEARCH_Btn;
	public WebElement getRegular_SEARCH_Btn() {
		return Regular_SEARCH_Btn;
	}
	
	
	@FindBy(xpath="//input[@value='Save & Search']")
	private WebElement Regular_SAVE_SEARCH_Btn;
	public WebElement getRegular_SAVE_SEARCH_Btn() {
		return Regular_SAVE_SEARCH_Btn;
	}
	
	//////////////////////////////////////////////////////////////////////////////
	
	////    Advanced Search  ///////////////////////
	
	@FindBy(id="ageFrom")
	private WebElement Advanced_AgeFrom_DD;
	public WebElement getAdvanced_AgeFrom_DD() {
		return Advanced_AgeFrom_DD;
	}



	@FindBy(id="ageTo")
	private WebElement Advanced_AgeTo_DD;
	public WebElement getAdvanced_AgeTo_DD() {
		return Advanced_AgeTo_DD;
	}



	@FindBy(id="heightFrom")
	private WebElement Advanced_HeightFrom_DD;
    public WebElement getAdvanced_HeightFrom_DD() {
		return Advanced_HeightFrom_DD;
	}



	@FindBy(id="heightTo")
	private WebElement Advanced_HeightTo_DD;
	public WebElement getAdvanced_HeightTo_DD() {
		return Advanced_HeightTo_DD;
	}



	@FindBy(id="maritalStatus0")
	private WebElement Advanced_Marital_Any;
    public WebElement getAdvanced_Marital_Any() {
		return Advanced_Marital_Any;
	}



	@FindBy(id="maritalStatus1")
	private WebElement Advanced_Marital_Unmarried;	
	public WebElement getAdvanced_Marital_Unmarried() {
		return Advanced_Marital_Unmarried;
	}



	@FindBy(id="maritalStatus2")
	private WebElement Advanced_Marital_Widow;
	public WebElement getAdvanced_Marital_Widow() {
		return Advanced_Marital_Widow;
	}



	@FindBy(id="maritalStatus3")
	private WebElement Advanced_Marital_Divorceed;
    public WebElement getAdvanced_Marital_Divorceed() {
		return Advanced_Marital_Divorceed;
	}



	@FindBy(id="maritalStatus4")
	private WebElement Advanced_Marital_Seperated;	
	public WebElement getAdvanced_Marital_Seperated() {
		return Advanced_Marital_Seperated;
	}



	@FindBy(id="haveChildren1")
	private WebElement Advanced_HaveChild_No;	
	public WebElement getAdvanced_HaveChild_No() {
		return Advanced_HaveChild_No;
	}



	@FindBy(id="haveChildren2")
	private WebElement Advanced_HaveChild_YesLiving;
	public WebElement getAdvanced_HaveChild_YesLiving() {
		return Advanced_HaveChild_YesLiving;
	}



	@FindBy(id="haveChildren3")
	private WebElement Advanced_HaveChild_Yes_Not_Living;	
	public WebElement getAdvanced_HaveChild_Yes_Not_Living() {
		return Advanced_HaveChild_Yes_Not_Living;
	}



	@FindBy(id="haveChildren")
	private WebElement Advanced_HaveChild__Doesnt;
	public WebElement getAdvanced_HaveChild__Doesnt() {
		return Advanced_HaveChild__Doesnt;
	}



	@FindBy(id="subcasteTemp")
	private WebElement Advanced_Subcaste_Value;	
	public WebElement getAdvanced_Subcaste_Value() {
		return Advanced_Subcaste_Value;
	}



	@FindBy(id="subcaste")
	private WebElement Advanced_Subcaste_Choosed;	
	public WebElement getAdvanced_Subcaste_Choosed() {
		return Advanced_Subcaste_Choosed;
	}



	@FindBy(id="motherTongueTemp")
	private WebElement Advanced_MOtherTongue_Value;	
	public WebElement getAdvanced_MOtherTongue_Value() {
		return Advanced_MOtherTongue_Value;
	}



	@FindBy(id="motherTongue")
	private WebElement Advanced_MOtherTongue_Choosed;
	public WebElement getAdvanced_MOtherTongue_Choosed() {
		return Advanced_MOtherTongue_Choosed;
	}



	@FindBy(id="countryTemp")
	private WebElement Advanced_CountryLiving_Value;	
	public WebElement getAdvanced_CountryLiving_Value() {
		return Advanced_CountryLiving_Value;
	}



	@FindBy(id="country")
	private WebElement Advanced_CountryLiving_Choosed;	
	public WebElement getAdvanced_CountryLiving_Choosed() {
		return Advanced_CountryLiving_Choosed;
	}



	@FindBy(id="educationTemp")
	private WebElement Advanced_Education_Value;
	public WebElement getAdvanced_Education_Value() {
		return Advanced_Education_Value;
	}
	
	
	@FindBy(id="education")
	private WebElement Advanced_Education_Choosed;
	public WebElement getAdvanced_Education_Choosed() {
		return Advanced_Education_Choosed;
	}
	
	
	@FindBy(id="physicalStatus2")
	private WebElement Advanced_Physical_Doesnt;
	public WebElement getAdvanced_Physical_Doesnt() {
		return Advanced_Physical_Doesnt;
	}
	
	@FindBy(id="physicalStatus0")
	private WebElement Advanced_Physical_Normal;
	public WebElement getAdvanced_Physical_Normal() {
		return Advanced_Physical_Normal;
	}
	
	@FindBy(id="physicalStatus")
	private WebElement Advanced_Physical_Challenged;
	public WebElement getAdvanced_Physical_Challenged() {
		return Advanced_Physical_Challenged;
	}
	
	
	@FindBy(id="gothram")
	private WebElement Advanced_Gothram_Input;
	public WebElement getAdvanced_Gothram_Input() {
		return Advanced_Gothram_Input;
	}
	
	
	@FindBy(id="starTemp")
	private WebElement Advanced_Star_Value;
	public WebElement getAdvanced_Star_Value() {
		return Advanced_Star_Value;
	}
	
	
	@FindBy(id="star")
	private WebElement Advanced_Star_Choosed;
	public WebElement getAdvanced_Star_Choosed() {
		return Advanced_Star_Choosed;
	}
	
	@FindBy(id="manglik0")
	private WebElement Advanced_Dosham_Doesnt;
	public WebElement getAdvanced_Dosham_Doesnt() {
		return Advanced_Dosham_Doesnt;
	}
	
	
	@FindBy(id="manglik1")
	private WebElement Advanced_Dosham_Yes;
	public WebElement getAdvanced_Dosham_Yes() {
		return Advanced_Dosham_Yes;
	}
	
	
	@FindBy(id="manglik2")
	private WebElement Advanced_Dosham_No;
	public WebElement getAdvanced_Dosham_No() {
		return Advanced_Dosham_No;
	}
	
	@FindBy(id="residentStatus")
	private WebElement Advanced_Resident_Any;
	public WebElement getAdvanced_Resident_Any() {
		return Advanced_Resident_Any;
	}

	@FindBy(id="residentStatus1")
	private WebElement Advanced_Resident_Citizen;
	public WebElement getAdvanced_Resident_Citizen() {
		return Advanced_Resident_Citizen;
	}
	
	
	@FindBy(id="residentStatus2")
	private WebElement Advanced_Resident_Permanent_resident;
	public WebElement getAdvanced_Resident_Permanent_resident() {
		return Advanced_Resident_Permanent_resident;
	}
	
	
	@FindBy(id="residentStatus3")
	private WebElement Advanced_Resident_WorkPermit;
	public WebElement getAdvanced_Resident_WorkPermit() {
		return Advanced_Resident_WorkPermit;
	}
	
	@FindBy(id="residentStatus4")
	private WebElement Advanced_Resident_StudentVisa;
	public WebElement getAdvanced_Resident_StudentVisa() {
		return Advanced_Resident_StudentVisa;
	}
	
	@FindBy(id="residentStatus5")
	private WebElement Advanced_Resident_TemporaryVisa;
	public WebElement getAdvanced_Resident_TemporaryVisa() {
		return Advanced_Resident_TemporaryVisa;
	}
	
	
	@FindBy(id="occupationTemp")
	private WebElement Advanced_Occupation_Value;
	public WebElement getAdvanced_Occupation_Value() {
		return Advanced_Occupation_Value;
	}
	
	
	@FindBy(id="occupation")
	private WebElement Advanced_Occupation_Choosed;
	public WebElement getAdvanced_Occupation_Choosed() {
		return Advanced_Occupation_Choosed;
	}
	
	
	@FindBy(id="annualIncome")
	private WebElement Advanced_AnnualIncome_DD;
	public WebElement getAdvanced_AnnualIncome_DD() {
		return Advanced_AnnualIncome_DD;
	}
	
	@FindBy(id="annualIncome1")
	private WebElement Advanced_AnnualIncomeTO_DD;
	public WebElement getAdvanced_AnnualIncomeTO_DD() {
		return Advanced_AnnualIncomeTO_DD;
	}
	
	
	@FindBy(id="photoOpt")
	private WebElement Advanced_ShowProfile_Photo;	
	public WebElement getAdvanced_ShowProfile_Photo() {
		return Advanced_ShowProfile_Photo;
	}



	@FindBy(id="horoscopeOpt")
	private WebElement Advanced_ShowProfile_Horoscope;
	public WebElement getAdvanced_ShowProfile_Horoscope() {
		return Advanced_ShowProfile_Horoscope;
	}



	@FindBy(id="alreadyContOpt")
	private WebElement Advanced_DontShow_Contacted;	
	public WebElement getAdvanced_DontShow_Contacted() {
		return Advanced_DontShow_Contacted;
	}



	@FindBy(id="alreadyViewedOpt")
	private WebElement Advanced_DontShow_Viewed;	
	public WebElement getAdvanced_DontShow_Viewed() {
		return Advanced_DontShow_Viewed;
	}



	@FindBy(id="shortlistOpt")
	private WebElement Advanced_DontShow_ShortListed;	
	public WebElement getAdvanced_DontShow_ShortListed() {
		return Advanced_DontShow_ShortListed;
	}



	@FindBy(id="ignoredOpt")
	private WebElement Advanced_DontShow_Blocked;
	public WebElement getAdvanced_DontShow_Blocked() {
		return Advanced_DontShow_Blocked;
	}



	@FindBy(id="igOpt")
	private WebElement Advanced_DontShow_Ignored;
	public WebElement getAdvanced_DontShow_Ignored() {
		return Advanced_DontShow_Ignored;
	}
	
	
	@FindBy(id="eating1")
	private WebElement Advanced_Eating_Vegetarian;	
	public WebElement getAdvanced_Eating_Vegetarian() {
		return Advanced_Eating_Vegetarian;
	}



	@FindBy(id="eating2")
	private WebElement Advanced_Eating_NonVegetarian;	
	public WebElement getAdvanced_Eating_NonVegetarian() {
		return Advanced_Eating_NonVegetarian;
	}



	@FindBy(id="eating3")
	private WebElement Advanced_Eating_Egg_tarian;
	public WebElement getAdvanced_Eating_Egg_tarian() {
		return Advanced_Eating_Egg_tarian;
	}



	@FindBy(id="eating4")
	private WebElement Advanced_Eating_Vegan;	
	public WebElement getAdvanced_Eating_Vegan() {
		return Advanced_Eating_Vegan;
	}



	@FindBy(id="eating")
	private WebElement Advanced_Eating_Any;	
	public WebElement getAdvanced_Eating_Any() {
		return Advanced_Eating_Any;
	}



	@FindBy(id="smoking1")
	private WebElement Advanced_Smoking_NonSmoker;	
	public WebElement getAdvanced_Smoking_NonSmoker() {
		return Advanced_Smoking_NonSmoker;
	}

	

	@FindBy(id="smoking2")
	private WebElement Advanced_Smoking_LightSmoker;	
	public WebElement getAdvanced_Smoking_LightSmoker() {
		return Advanced_Smoking_LightSmoker;
	}



	@FindBy(id="smoking3")
	private WebElement Advanced_Smoking_RegularSmoker;
	public WebElement getAdvanced_Smoking_RegularSmoker() {
		return Advanced_Smoking_RegularSmoker;
	}



	@FindBy(id="smoking")
	private WebElement Advanced_Smoking_Any;
	public WebElement getAdvanced_Smoking_Any() {
		return Advanced_Smoking_Any;
	}

	@FindBy(id = "drinking1")
	private WebElement Advanced_Non_Drinker;
	public WebElement getAdvanced_Non_Drinker() {
		return Advanced_Non_Drinker;
	}



	@FindBy(id = "drinking2")
	private WebElement Advanced_Light_Drinker;
	public WebElement getAdvanced_Light_Drinker() {
		return Advanced_Light_Drinker;
	}





	@FindBy(id = "drinking3")
	private WebElement Advanced_Regular_Drinker;
	public WebElement getAdvanced_Regular_Drinker() {
		return Advanced_Regular_Drinker;
	}
	
	
	@FindBy(id = "drinking")
	private WebElement Advanced_Drinker_Any;
	public WebElement getAdvanced_Drinker_Any() {
		return Advanced_Drinker_Any;
	}
	
	@FindBy(id="keywordTxt")
	private WebElement KeyWordSearch_Input;
	public WebElement getKeyWordSearch_Input() {
		return KeyWordSearch_Input;
	}
	
	
	@FindBy(id="matrisearchid")
	private WebElement Search_By_Id;
	public WebElement getSearch_By_Id() {
		return Search_By_Id;
	}
	
}
	
