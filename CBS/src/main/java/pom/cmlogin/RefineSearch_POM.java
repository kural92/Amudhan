package pom.cmlogin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseTest;

public class RefineSearch_POM extends BaseTest {
	
	public RefineSearch_POM() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@id=\"topnav-login-menu\"]/div[2]/div[2]/a")
	private WebElement matches_btn;
	public WebElement getMatches_btn() {
		return matches_btn;
	}

	@FindBy(id="facetAgelabel")
	private WebElement Refine_Age_Btn;
	public WebElement getRefine_Age_Btn() {
		return Refine_Age_Btn;
	}
	
	
	@FindBy(xpath = "//img[@id='facetAgelabel']//following::a[1]")
	private WebElement Refine_Age_More_Btn;
	public WebElement getRefine_Age_More_Btn() {
		return Refine_Age_More_Btn;
	}

	
	@FindBy(id = "ageFrom")
	private WebElement Refine_AgeFrom;
	public WebElement getRefine_AgeFrom() {
		return Refine_AgeFrom;
	}
	
	
	@FindBy(id = "ageTo")
	private WebElement Refine_AgeTo;
	public WebElement getRefine_AgeTo() {
		return Refine_AgeTo;
	}
	
	
	@FindBy(xpath = "//input[@value='Submit']")
	private WebElement Refine_Submit;
	public WebElement getRefine_Submit() {
		return Refine_Submit;
	}
	
	
	
	@FindBy(id="facetHeightlabel")
	private WebElement Refine_Height_Btn;
	public WebElement getRefine_Height_Btn() {
		return Refine_Height_Btn;
	}
	
	
	@FindBy(xpath = "//img[@id='facetHeightlabel']//following::a[1]")
	private WebElement Refine_Height_More_Btn;
	public WebElement getRefine_Height_More_Btn() {
		return Refine_Height_More_Btn;
	}



	@FindBy(id = "heightFrom")
	private WebElement Refine_HeightFrom_DD;
	public WebElement getRefine_HeightFrom_DD() {
		return Refine_HeightFrom_DD;
	}
	
	
	@FindBy(id = "heightTo")
	private WebElement Refine_HeightTo_DD;
	public WebElement getRefine_HeightTo_DD() {
		return Refine_HeightTo_DD;
	}
	
	
	@FindBy(id="facetMaritalStatuslabel")
	private WebElement Refine_maritalStatus_Btn;
	public WebElement getRefine_maritalStatus_Btn() {
		return Refine_maritalStatus_Btn;
	}
	
	
	@FindBy(xpath = "//img[@id='facetMaritalStatuslabel']//following::a[contains(text(),'More')]")
	private WebElement Refine_MaritalStatus_More_Btn;
	public WebElement getRefine_MaritalStatus_More_Btn() {
		return Refine_MaritalStatus_More_Btn;
	}
	
	@FindBy(id="maritalStatus1")
	private WebElement Refine_marital_Unmarried;
	public WebElement getRefine_marital_Unmarried() {
		return Refine_marital_Unmarried;
	}
	
	
	@FindBy(id="maritalStatus2")
	private WebElement Refine_marital_Widow;
	public WebElement getRefine_marital_Widow() {
		return Refine_marital_Widow;
	}
	
	@FindBy(id="maritalStatus3")
	private WebElement Refine_marital_Divorced;
	public WebElement getRefine_marital_Divorced() {
		return Refine_marital_Divorced;
	}
	
	
	@FindBy(id="maritalStatus4")
	private WebElement Refine_marital_Seperated;
	public WebElement getRefine_marital_Seperated() {
		return Refine_marital_Seperated;
	}
	
	
	
	@FindBy(id="showmore")
	private WebElement Refine_Show_More_Btn;	
	public WebElement getRefine_Show_More_Btn() {
		return Refine_Show_More_Btn;
	}
	
	
	@FindBy(id="facetMotherTonguelabel")
	private WebElement Refine_MotherTongue_btn;
	public WebElement getRefine_MotherTongue_btn() {
		return Refine_MotherTongue_btn;
	}
	
	
	@FindBy(xpath="//img[@id='facetMotherTonguelabel']//following::a[contains(text(),'More')]")
	private WebElement Refine_MotherTongue_More;
	public WebElement getRefine_MotherTongue_More() {
		return Refine_MotherTongue_More;
	}
	
	
	@FindBy(id="motherTongueTemp")
	private WebElement Refine_MotherTongue_Value;
	public WebElement getRefine_MotherTongue_Value() {
		return Refine_MotherTongue_Value;
	}
	
	@FindBy(id="motherTongue")
	private WebElement Refine_MotherTongue_Choosed;
	public WebElement getRefine_MotherTongue_Choosed() {
		return Refine_MotherTongue_Choosed;
	}
	
	
	
	@FindBy(id="facetSubcastelabel")
	private WebElement Refine_SubCaste_btn;
	public WebElement getRefine_SubCaste_btn() {
		return Refine_SubCaste_btn;
	}
	
	
	
	@FindBy(xpath="//img[@id='facetSubcastelabel']//following::a[contains(text(),'More')]")
	private WebElement Refine_SubCaste_More;
	public WebElement getRefine_SubCaste_More() {
		return Refine_SubCaste_More;
	}
	
	
	@FindBy(id="subcasteTemp")
	private WebElement Refine_SubCaste_Value;
	public WebElement getRefine_SubCaste_Value() {
		return Refine_SubCaste_Value;
	}
	
	
	
	@FindBy(id="subcaste")
	private WebElement Refine_SubCaste_Choosed;
	public WebElement getRefine_SubCaste_Choosed() {
		return Refine_SubCaste_Choosed;
	}
	
	
	@FindBy(id="facetEducationlabel")
	private WebElement Refine_Education_btn;
	public WebElement getRefine_Education_btn() {
		return Refine_Education_btn;
	}
	
	
	
	@FindBy(xpath="//img[@id='facetEducationlabel']//following::a[contains(text(),'More')]")
	private WebElement Refine_Education_More;
	public WebElement getRefine_Education_More() {
		return Refine_Education_More;
	}
	
	
	@FindBy(id="subeducationTemp")
	private WebElement Refine_Education_Value;
	public WebElement getRefine_Education_Value() {
		return Refine_Education_Value;
	}
	
	
	@FindBy(id="subeducation")
	private WebElement Refine_Education_Choosed;
	public WebElement getRefine_Education_Choosed() {
		return Refine_Education_Choosed;
	}
	
	
	@FindBy(id="facetFamilyTypelabel")
	private WebElement Refine_FamilyType_btn;
	public WebElement getRefine_FamilyType_btn() {
		return Refine_FamilyType_btn;
	}
	
	
	
	@FindBy(xpath="//img[@id='facetFamilyTypelabel']//following::a[contains(text(),'More')]")
	private WebElement Refine_FamilyType_More;
	public WebElement getRefine_FamilyType_More() {
		return Refine_FamilyType_More;
	}
	
	
	@FindBy(id="FamilyType0")
	private WebElement Refine_FamilyType_Any;
	public WebElement getRefine_FamilyType_Any() {
		return Refine_FamilyType_Any;
	}
	
	
	
	@FindBy(id="FamilyType1")
	private WebElement Refine_FamilyType_Joint;
	public WebElement getRefine_FamilyType_Joint() {
		return Refine_FamilyType_Joint;
	}
	
	@FindBy(id="FamilyType2")
	private WebElement Refine_FamilyType_Nuclear;
	public WebElement getRefine_FamilyType_Nuclear() {
		return Refine_FamilyType_Nuclear;
	}
	
	
	@FindBy(id="facetFamilyStatuslabel")
	private WebElement Refine_FamilyStatus_Btn;
	public WebElement getRefine_FamilyStatus_Btn() {
		return Refine_FamilyStatus_Btn;
	}
	
	
	@FindBy(xpath="//img[@id='facetFamilyStatuslabel']//following::a[contains(text(),'More')]")
	private WebElement Refine_FamilyStatus_More;
	public WebElement getRefine_FamilyStatus_More() {
		return Refine_FamilyStatus_More;
	}
	
	@FindBy(id="FamilyStatus0")
	private WebElement Refine_FamilyStatus_Any;
	public WebElement getRefine_FamilyStatus_Any() {
		return Refine_FamilyStatus_Any;
	}
	
	
	
	@FindBy(id="FamilyStatus1")
	private WebElement Refine_FamilyStatus_MiddleClass;
	public WebElement getRefine_FamilyStatus_MiddleClass() {
		return Refine_FamilyStatus_MiddleClass;
	}
	
	
	@FindBy(id="FamilyStatus2")
	private WebElement Refine_FamilyStatus_UpperMiddleClass;
	public WebElement getRefine_FamilyStatus_UpperMiddleClass() {
		return Refine_FamilyStatus_UpperMiddleClass;
	}
	
	
	@FindBy(id="FamilyStatus4")
	private WebElement Refine_FamilyStatus_Rich_Affulent;
	public WebElement getRefine_FamilyStatus_Rich_Affulent() {
		return Refine_FamilyStatus_Rich_Affulent;
	}
	
	
	@FindBy(id="facetEmployedInlabel")
	private WebElement Refine_EmployeedIn_Btn;
	public WebElement getRefine_EmployeedIn_Btn() {
		return Refine_EmployeedIn_Btn;
	}
	
	
	
	@FindBy(xpath="//img[@id='facetEmployedInlabel']//following::a[contains(text(),'More')]")
	private WebElement Refine_EmployeedIn_More;
	public WebElement getRefine_EmployeedIn_More() {
		return Refine_EmployeedIn_More;
	}
	
	
	@FindBy(id="occupationCat1")
	private WebElement Refine_Employeed_GovernMent;
	public WebElement getRefine_Employeed_GovernMent() {
		return Refine_Employeed_GovernMent;
	}
	
	
	@FindBy(id="occupationCat1")
	private WebElement Refine_Employeed_Defence;
	public WebElement getRefine_Employeed_Defence() {
		return Refine_Employeed_Defence;
	}
	
	
	
	@FindBy(id="occupationCat1")
	private WebElement Refine_Employeed_Private;
	public WebElement getRefine_Employeed_Private() {
		return Refine_Employeed_Private;
	}
	
	
	@FindBy(id="occupationCat1")
	private WebElement Refine_Employeed_SelfEmployeed;
	public WebElement getRefine_Employeed_SelfEmployeed() {
		return Refine_Employeed_SelfEmployeed;
	}
	
	
	
	@FindBy(id="occupationCat1")
	private WebElement Refine_Employeed_NotWorking;
	public WebElement getRefine_Employeed_NotWorking() {
		return Refine_Employeed_NotWorking;
	}
	
	
	@FindBy(id="facetOccupationlabel")
	private WebElement Refine_Occupation_Btn;
	public WebElement getRefine_Occupation_Btn() {
		return Refine_Occupation_Btn;
	}
	
	
	
	@FindBy(xpath="//img[@id='facetOccupationlabel']//following::a[contains(text(),'More')]")
	private WebElement Refine_Occupation_More;
	public WebElement getRefine_Occupation_More() {
		return Refine_Occupation_More;
	}
	
	
	@FindBy(id="occupationTemp")
	private WebElement Refine_Occupation_Value;
	public WebElement getRefine_Occupation_Value() {
		return Refine_Occupation_Value;
	}
	
	
	@FindBy(id="occupation")
	private WebElement Refine_Occupation_Choosed;
	public WebElement getRefine_Occupation_Choosed() {
		return Refine_Occupation_Choosed;
	}
	
	@FindBy(id="facetAnnualIncomelabel")
	private WebElement Refine_AnnualIncome_Btn;
	public WebElement getRefine_AnnualIncome_Btn() {
		return Refine_AnnualIncome_Btn;
	}
	
	
	@FindBy(xpath = "//img[@id='facetAnnualIncomelabel']//following::a[contains(text(),'More')]")
	private WebElement Refine_AnnualIncome_more;
	public WebElement getRefine_AnnualIncome_more() {
		return Refine_AnnualIncome_more;
	}
	
	
	@FindBy(id = "annualIncome")
	private WebElement Refine_AnnualIncome_From;
	public WebElement getRefine_AnnualIncome_From() {
		return Refine_AnnualIncome_From;
	}
	
	
	@FindBy(id = "annualIncome1")
	private WebElement Refine_AnnualIncome_To;
	public WebElement getRefine_AnnualIncome_To() {
		return Refine_AnnualIncome_To;
	}
	
	
	@FindBy(id="facetCountrylabel")
	private WebElement Refine_Country_Btn;
	public WebElement getRefine_Country_Btn() {
		return Refine_Country_Btn;
	}
	
	
	@FindBy(xpath = "//img[@id='facetCountrylabel']//following::a[contains(text(),'More')]")
	private WebElement Refine_Country_more;
	public WebElement getRefine_Country_more() {
		return Refine_Country_more;
	}
	
	
	@FindBy(id="countryTemp")
	private WebElement Refine_Country_Value;
	public WebElement getRefine_Country_Value() {
		return Refine_Country_Value;
	}
	
	
	@FindBy(id="country")
	private WebElement Refine_Country_Choosed;
	public WebElement getRefine_Country_Choosed() {
		return Refine_Country_Choosed;
	}
	
	
	@FindBy(id="facetResidentStatuslabel")
	private WebElement Refine_Resident_Status_Btn;
	public WebElement getRefine_Resident_Status_Btn() {
		return Refine_Resident_Status_Btn;
	}
	
	
	@FindBy(xpath = "//img[@id='facetResidentStatuslabel']//following::a[contains(text(),'More')]")
	private WebElement Refine_Resident_Status_more;
	public WebElement getRefine_Resident_Status_more() {
		return Refine_Resident_Status_more;
	}
	
	@FindBy(id="residentStatus1")
	private WebElement Refine_ResidentStatus_Citizen;
	public WebElement getRefine_ResidentStatus_Citizen() {
		return Refine_ResidentStatus_Citizen;
	}
	
	
	@FindBy(id="residentStatus2")
	private WebElement Refine_ResidentStatus_PermanentResident;
	public WebElement getRefine_ResidentStatus_PermanentResident() {
		return Refine_ResidentStatus_PermanentResident;
	}
	
	
	@FindBy(id="residentStatus3")
	private WebElement Refine_ResidentStatus_WorkPermit;
	public WebElement getRefine_ResidentStatus_WorkPermit() {
		return Refine_ResidentStatus_WorkPermit;
	}
	
	
	@FindBy(id="residentStatus4")
	private WebElement Refine_ResidentStatus_StudentVisa;
	public WebElement getRefine_ResidentStatus_StudentVisa() {
		return Refine_ResidentStatus_StudentVisa;
	}
	
	
	@FindBy(id="residentStatus5")
	private WebElement Refine_ResidentStatus_TemporaryVisa;
	public WebElement getRefine_ResidentStatus_TemporaryVisa() {
		return Refine_ResidentStatus_TemporaryVisa;
	}
	
	
	@FindBy(id="residentStatus6")
	private WebElement Refine_ResidentStatus_NonResident;
	public WebElement getRefine_ResidentStatus_NonResident() {
		return Refine_ResidentStatus_NonResident;
	}
	
	
	@FindBy(id="facetCitizenshiplabel")
	private WebElement Refine_CitizenShip_Btn;
	public WebElement getRefine_CitizenShip_Btn() {
		return Refine_CitizenShip_Btn;
	}
	
	
	@FindBy(xpath="//img[@id='facetCitizenshiplabel']//following::a[contains(text(),'More')]")
	private WebElement Refine_Citizenship_More;
	public WebElement getRefine_Citizenship_More() {
		return Refine_Citizenship_More;
	}
	
	@FindBy(id="citizenshipTemp")
	private WebElement Refine_Citizenship_Value;
	public WebElement getRefine_Citizenship_Value() {
		return Refine_Citizenship_Value;
	}
	
	
	@FindBy(id="citizenship")
	private WebElement Refine_Citizenship_Choosed;
	public WebElement getRefine_Citizenship_Choosed() {
		return Refine_Citizenship_Choosed;
	}
	
	
	@FindBy(id="facetPhysicalStatuslabel")
	private WebElement Refine_PhysicalStatus_Btn;
	public WebElement getRefine_PhysicalStatus_Btn() {
		return Refine_PhysicalStatus_Btn;
	}
	
	
	
	@FindBy(xpath = "//img[@id='facetPhysicalStatuslabel']//following::a[contains(text(),'More')]")
	private WebElement Refine_PhysicalStatus_More;
	public WebElement getRefine_PhysicalStatus_More() {
		return Refine_PhysicalStatus_More;
	}
	
	
	
	@FindBy(id="physicalStatus0")
	private WebElement Refine_PhysicalStatus_Any;
	public WebElement getRefine_PhysicalStatus_Any() {
		return Refine_PhysicalStatus_Any;
	}
	
	
	@FindBy(id="physicalStatus1")
	private WebElement Refine_PhysicalStatus_PhysicalChallenged;
	public WebElement getRefine_PhysicalStatus_PhysicalChallenged() {
		return Refine_PhysicalStatus_PhysicalChallenged;
	}
	
	
	@FindBy(id="physicalStatus2")
	private WebElement Refine_PhysicalStatus_DoesntMatter;
	public WebElement getRefine_PhysicalStatus_DoesntMatter() {
		return Refine_PhysicalStatus_DoesntMatter;
	}
	
	
	
	@FindBy(id="facetComplexionlabel")
	private WebElement Refine_Complexion_Btn;
	public WebElement getRefine_Complexion_Btn() {
		return Refine_Complexion_Btn;
	}
	
	
	
	@FindBy(xpath = "//img[@id='facetComplexionlabel']//following::a[contains(text(),'More')]")
	private WebElement Refine_Complexion_More;
	public WebElement getRefine_Complexion_More() {
		return Refine_Complexion_More;
	}
	
	
	@FindBy(id="complexion1")
	private WebElement Refine_Complexion_VeryFair;
	public WebElement getRefine_Complexion_VeryFair() {
		return Refine_Complexion_VeryFair;
	}
	
	
	
	@FindBy(id="complexion2")
	private WebElement Refine_Complexion_Fair;
	public WebElement getRefine_Complexion_Fair() {
		return Refine_Complexion_Fair;
	}
	
	
	@FindBy(id="complexion3")
	private WebElement Refine_Complexion_Wheatish;
	public WebElement getRefine_Complexion_Wheatish() {
		return Refine_Complexion_Wheatish;
	}
	
	
	@FindBy(id="complexion4")
	private WebElement Refine_Complexion_WheatishBrown;
	public WebElement getRefine_Complexion_WheatishBrown() {
		return Refine_Complexion_WheatishBrown;
	}
	
	
	@FindBy(id="complexion5")
	private WebElement Refine_Complexion_Dark;
	public WebElement getRefine_Complexion_Dark() {
		return Refine_Complexion_Dark;
	}
	
	
	@FindBy(id="facetBodytypelabel")
	private WebElement Refine_BodyType_Btn;
	public WebElement getRefine_BodyType_Btn() {
		return Refine_BodyType_Btn;
	}
	
	
	@FindBy(id="//img[@id='facetBodytypelabel']//following::a[contains(text(),'More')]")
	private WebElement Refine_BodyType_More;
	public WebElement getRefine_BodyType_More() {
		return Refine_BodyType_More;
	}
	
	
	@FindBy(id="bodyType1")
	private WebElement Refine_BodyType_Average;
	public WebElement getRefine_BodyType_Average() {
		return Refine_BodyType_Average;
	}
	
	@FindBy(id="bodyType2")
	private WebElement Refine_BodyType_Athelitic;
	public WebElement getRefine_BodyType_Athelitic() {
		return Refine_BodyType_Athelitic;
	}
	
	
	@FindBy(id="bodyType3")
	private WebElement Refine_BodyType_Slim;
	public WebElement getRefine_BodyType_Slim() {
		return Refine_BodyType_Slim;
	}
	
	
	@FindBy(id="bodyType4")
	private WebElement Refine_BodyType_Heavy;
	public WebElement getRefine_BodyType_Heavy() {
		return Refine_BodyType_Heavy;
	}
	
	
	@FindBy(id="facetEatinglabel")
	private WebElement Refine_Eating_Btn;
	public WebElement getRefine_Eating_Btn() {
		return Refine_Eating_Btn;
	}
	
	
	@FindBy(xpath="//img[@id='facetEatinglabel']//following::a[contains(text(),'More')]")
	private WebElement Refine_Eating_More;
	public WebElement getRefine_Eating_More() {
		return Refine_Eating_More;
	}
	
	@FindBy(id="eating1")
	private WebElement Refine_Eating_Veg;
	public WebElement getRefine_Eating_Veg() {
		return Refine_Eating_Veg;
	}
	
	@FindBy(id="eating2")
	private WebElement Refine_Eating_NonVeg;
	public WebElement getRefine_Eating_NonVeg() {
		return Refine_Eating_NonVeg;
	}
	
	@FindBy(id="eating3")
	private WebElement Refine_Eating_Egg;
	public WebElement getRefine_Eating_Egg() {
		return Refine_Eating_Egg;
	}
	
	
	@FindBy(id="eating4")
	private WebElement Refine_Eating_Vegan;
	public WebElement getRefine_Eating_Vegan() {
		return Refine_Eating_Vegan;
	}
	
	
	@FindBy(id="eating99")
	private WebElement Refine_Eating_NotSpecified;
	public WebElement getRefine_Eating_NotSpecified() {
		return Refine_Eating_NotSpecified;
	}
	
	
	@FindBy(id="facetSmokelabel")
	private WebElement Refine_Smoking_Btn;
	public WebElement getRefine_Smoking_Btn() {
		return Refine_Smoking_Btn;
	}
	
	
	
	@FindBy(id="//img[@id='facetSmokelabel']//following::a[contains(text(),'More')]")
	private WebElement Refine_Smoking_More;
	public WebElement getRefine_Smoking_More() {
		return Refine_Smoking_More;
	}
	
	
	@FindBy(id="smoking2")
	private WebElement Refine_Smoking_NonSmoker;
	public WebElement getRefine_Smoking_NonSmoker() {
		return Refine_Smoking_NonSmoker;
	}
	
	
	
	@FindBy(id="smoking3")
	private WebElement Refine_Smoking_LightSmoker;
	public WebElement getRefine_Smoking_LightSmoker() {
		return Refine_Smoking_LightSmoker;
	}
	
	
	@FindBy(id="smoking99")
	private WebElement Refine_Smoking_RegularSmoker;
	public WebElement getRefine_Smoking_RegularSmoker() {
		return Refine_Smoking_RegularSmoker;
	}
	
	
	@FindBy(id="eating99")
	private WebElement Refine_Smoking_NotSpecified;
	public WebElement getRefine_Smoking_NotSpecified() {
		return Refine_Smoking_NotSpecified;
	}
	
	
	
	@FindBy(id="facetDrinklabel")
	private WebElement Refine_Drinking_Btn;
	public WebElement getRefine_Drinking_Btn() {
		return Refine_Drinking_Btn;
	}
	
	
	@FindBy(xpath ="//img[@id='facetDrinklabel']//following::a[contains(text(),'More')]")
	private WebElement Refine_Drinking_More;
	public WebElement getRefine_Drinking_More() {
		return Refine_Drinking_More;
	}
	
	
	@FindBy(id="drinking1")
	private WebElement Refine_Drinking_nonDrinker;
	public WebElement getRefine_Drinking_nonDrinker() {
		return Refine_Drinking_nonDrinker;
	}
	
	
	@FindBy(id="drinking2")
	private WebElement Refine_Drinking_LightDrinker;
	public WebElement getRefine_Drinking_LightDrinker() {
		return Refine_Drinking_LightDrinker;
	}
	
	
	
	
	@FindBy(id="drinking3")
	private WebElement Refine_Drinking_RegularDrinker;
	public WebElement getRefine_Drinking_RegularDrinker() {
		return Refine_Drinking_RegularDrinker;
	}
	
	@FindBy(id="drinking99")
	private WebElement Refine_Drinking_NotSpecified;
	public WebElement getRefine_Drinking_NotSpecified() {
		return Refine_Drinking_NotSpecified;
	}
	
	
	///////////////////////////////////////////////////////////////////////
	
	
	@FindBy(id="total_div")
	private WebElement Refine_Result_Count;
	public WebElement getRefine_Result_Count() {
		return Refine_Result_Count;
	}
	
	
	@FindBy(xpath = "//a[contains(text(),'EZH')]")
	private WebElement Refine_Result_MatriId;
	public WebElement getRefine_Result_MatriId() {
		return Refine_Result_MatriId;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
