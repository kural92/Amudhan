package pom.cmlogin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseTest;

public class EditPI_POM extends BaseTest {

	public EditPI_POM(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "createdfor")
	private WebElement PI_ProfileCreated_DD;
	public WebElement getPI_ProfileCreated_DD() {
		return PI_ProfileCreated_DD;
	}

	@FindBy(id = "name")
	private WebElement PI_Name;
	public WebElement getPI_Name() {
		return PI_Name;
	}

	@FindBy(id = "dobDay")
	private WebElement PI_Day_DD;
	public WebElement getPI_Day_DD() {
		return PI_Day_DD;
	}

	@FindBy(id = "dobMonth")
	private WebElement PI_Month_DD;
	public WebElement getPI_Month_DD() {
		return PI_Month_DD;
	}

	@FindBy(id = "dobYear")
	private WebElement PI_Year_DD;
	public WebElement getPI_Year_DD() {
		return PI_Year_DD;
	}

	@FindBy(id = "maritalStatus3")
	private WebElement PI_Divorceed;
	public WebElement getPI_Divorceed() {
		return PI_Divorceed;
	}

	@FindBy(id = "maritalStatus4")
	private WebElement PI_Awaiting_Divorcee;
	public WebElement getPI_Awaiting_Divorcee() {
		return PI_Awaiting_Divorcee;
	}

	@FindBy(id = "maritalStatus2")
	private WebElement PI_Widow;
	public WebElement getPI_Widow() {
		return PI_Widow;
	}

	@FindBy(id = "mStatus4")
	private WebElement PI_Seperated;
	public WebElement getPI_Seperated() {
		return PI_Seperated;
	}

	@FindBy(id = "mStatus7")
	private WebElement PI_Annuled;
	public WebElement getPI_Annuled() {
		return PI_Annuled;
	}

	@FindBy(id = "maritalStatus1")
	private WebElement PI_NeverMarried;
	public WebElement getPI_NeverMarried() {
		return PI_NeverMarried;
	}

	@FindBy(id = "heightFeet")
	private WebElement PI_Height_DD;
	public WebElement getPI_Height_DD() {
		return PI_Height_DD;
	}

	@FindBy(id = "weightKgs")
	private WebElement PI_WeightKg_DD;
	public WebElement getPI_WeightKg_DD() {
		return PI_WeightKg_DD;
	}

	@FindBy(id = "weightLbs")
	private WebElement PI_WeightLbs_DD;
	public WebElement getPI_WeightLbs_DD() {
		return PI_WeightLbs_DD;
	}

	@FindBy(id = "bodyType3")
	private WebElement PI_Slim;
	public WebElement getPI_Slim() {
		return PI_Slim;
	}

	@FindBy(id = "bodyType2")
	private WebElement PI_Atheletic;
	public WebElement getPI_Atheletic() {
		return PI_Atheletic;
	}

	@FindBy(id = "bodyType1")
	private WebElement PI_Average;
	public WebElement getPI_Average() {
		return PI_Average;
	}

	@FindBy(id = "bodyType4")
	private WebElement PI_Heavy;
	public WebElement getPI_Heavy() {
		return PI_Heavy;
	}

	@FindBy(id = "complexion1")
	private WebElement PI_VeryFair;
	public WebElement getPI_VeryFair() {
		return PI_VeryFair;
	}

	@FindBy(id = "complexion2")
	private WebElement PI_Fair;
	public WebElement getPI_Fair() {
		return PI_Fair;
	}

	@FindBy(id = "complexion3")
	private WebElement PI_Wheatish;
	public WebElement getPI_Wheatish() {
		return PI_Wheatish;
	}

	@FindBy(id = "complexion4")
	private WebElement PI_Wheatish_Brown;
	public WebElement getPI_Wheatish_Brown() {
		return PI_Wheatish_Brown;
	}

	@FindBy(id = "complexion5")
	private WebElement PI_Dark;
	public WebElement getPI_Dark() {
		return PI_Dark;
	}

	@FindBy(id = "physicalStatus0")
	private WebElement PI_Physical_Normal;
	public WebElement getPI_Physical_Normal() {
		return PI_Physical_Normal;
	}

	@FindBy(id = "physicalStatus1")
	private WebElement PI_Physical_Challenged;
	public WebElement getPI_Physical_Challenged() {
		return PI_Physical_Challenged;
	}

	@FindBy(id = "religion")
	private WebElement PI_Religion_DD;
	public WebElement getPI_Religion_DD() {
		return PI_Religion_DD;
	}

	@FindBy(id = "caste")
	private WebElement PI_Caste_DD;
	public WebElement getPI_Caste_DD() {
		return PI_Caste_DD;
	}

	@FindBy(id = "subCaste")
	private WebElement PI_SubCaste_DD;
	public WebElement getPI_SubCaste_DD() {
		return PI_SubCaste_DD;
	}

	@FindBy(id = "subCasteText")
	private WebElement PI_SubCaste_Value;
	public WebElement getPI_SubCaste_Value() {
		return PI_SubCaste_Value;
	}

	@FindBy(id = "motherTongue")
	private WebElement PI_MotherTongue_DD;
	public WebElement getPI_MotherTongue_DD() {
		return PI_MotherTongue_DD;
	}

	@FindBy(id = "spokenLanguagesTemp")
	private WebElement PI_LanguageKnown_DD;
	public WebElement getPI_LanguageKnown_DD() {
		return PI_LanguageKnown_DD;
	}

	@FindBy(id = "spokenLanguages")
	private WebElement PI_LanguageKnown_Chosen_DD;
	public WebElement getPI_LanguageKnown_Chosen_DD() {
		return PI_LanguageKnown_Chosen_DD;
	}

	@FindBy(id = "gothramOthers")
	private WebElement PI_Gothram;
	public WebElement getPI_Gothram() {
		return PI_Gothram;
	}

	@FindBy(id = "star")
	private WebElement PI_Star_DD;
	public WebElement getPI_Star_DD() {
		return PI_Star_DD;
	}

	@FindBy(id = "raasi")
	private WebElement PI_Rasi_DD;
	public WebElement getPI_Rasi_DD() {
		return PI_Rasi_DD;
	}

	@FindBy(id = "suthajatakam1")
	private WebElement PI_SudhaJadhagam_Yes;
	public WebElement getPI_SudhaJadhagam_Yes() {
		return PI_SudhaJadhagam_Yes;
	}

	@FindBy(id = "suthajatakam2")
	private WebElement PI_SudhaJadhagam_NO;
	public WebElement getPI_SudhaJadhagam_NO() {
		return PI_SudhaJadhagam_NO;
	}

	@FindBy(id = "suthajatakam3")
	private WebElement PI_SudhaJadhagam_DontKnow;
	public WebElement getPI_SudhaJadhagam_DontKnow() {
		return PI_SudhaJadhagam_DontKnow;
	}

	@FindBy(id = "dosham1")
	private WebElement PI_Dosham_Yes;
	public WebElement getPI_Dosham_Yes() {
		return PI_Dosham_Yes;
	}

	@FindBy(id = "dosham2")
	private WebElement PI_Dosham_NO;
	public WebElement getPI_Dosham_NO() {
		return PI_Dosham_NO;
	}

	@FindBy(id = "dosham3")
	private WebElement PI_Dosham_DontKnow;
	public WebElement getPI_Dosham_DontKnow() {
		return PI_Dosham_DontKnow;
	}

	@FindBy(id = "manglik_m4")
	private WebElement PI_ChevvaDosham;
	public WebElement getPI_ChevvaDosham() {
		return PI_ChevvaDosham;
	}

	@FindBy(id = "manglik_m5")
	private WebElement PI_SarpaDosham;
	public WebElement getPI_SarpaDosham() {
		return PI_SarpaDosham;
	}

	@FindBy(id = "manglik_m10")
	private WebElement PI_KalaSarpaDosham;
	public WebElement getPI_KalaSarpaDosham() {
		return PI_KalaSarpaDosham;
	}

	@FindBy(id = "manglik_m20")
	private WebElement PI_RahuDosham;
	public WebElement getPI_RahuDosham() {
		return PI_RahuDosham;
	}

	@FindBy(id = "manglik_m40")
	private WebElement PI_KethuDosham;
	public WebElement getPI_KethuDosham() {
		return PI_KethuDosham;
	}

	@FindBy(id = "manglik_m80")
	private WebElement PI_KalahatraDosham;
	public WebElement getPI_KalahatraDosham() {
		return PI_KalahatraDosham;
	}

	@FindBy(id = "eatingHabits1")
	private WebElement PI_Vegetarian;
	public WebElement getPI_Vegetarian() {
		return PI_Vegetarian;
	}

	@FindBy(id = "eatingHabits2")
	private WebElement PI_Non_Vegetarian;
	public WebElement getPI_Non_Vegetarian() {
		return PI_Non_Vegetarian;
	}

	@FindBy(id = "eatingHabits3")
	private WebElement PI_Eggetarian;
	public WebElement getPI_Eggetarian() {
		return PI_Eggetarian;
	}

	@FindBy(id = "eatingHabits4")
	private WebElement PI_Vegan;
	public WebElement getPI_Vegan() {
		return PI_Vegan;
	}

	@FindBy(id = "smoke1")
	private WebElement PI_Non_Smoker;
	public WebElement getPI_Non_Smoker() {
		return PI_Non_Smoker;
	}

	@FindBy(id = "smoke2")
	private WebElement PI_Light_Smoker;
	public WebElement getPI_Light_Smoker() {
		return PI_Light_Smoker;
	}

	@FindBy(id = "smoke3")
	private WebElement PI_Regular_Smoker;
	public WebElement getPI_Regular_Smoker() {
		return PI_Regular_Smoker;
	}

	@FindBy(id = "drink1")
	private WebElement PI_Non_Drinker;
	public WebElement getPI_Non_Drinker() {
		return PI_Non_Drinker;
	}

	@FindBy(id = "drink2")
	private WebElement PI_Light_Drinker;
	public WebElement getPI_Light_Drinker() {
		return PI_Light_Drinker;
	}

	@FindBy(id = "drink3")
	private WebElement PI_Regular_Drinker;
	public WebElement getPI_Regular_Drinker() {
		return PI_Regular_Drinker;
	}

	@FindBy(id = "description")
	private WebElement PI_About_ME;
	public WebElement getPI_About_ME() {
		return PI_About_ME;
	}

	@FindBy(xpath = "//input[@value='Save']")
	private WebElement PI_Basic_Save;
	public WebElement getPI_Basic_Save() {
		return PI_Basic_Save;
	}

///////////////////////////////////////////////////////////

	@FindBy(xpath = "//div[contains(text(),'Education & Occupation')]//following::a[1]")
	private WebElement PI_Education_Edit_btn;
	public WebElement getPI_Education_Edit_btn() {
		return PI_Education_Edit_btn;
	}

	@FindBy(id = "educationCategory")
	private WebElement PI_HighestEducation_DD;
	public WebElement getPI_HighestEducation_DD() {
		return PI_HighestEducation_DD;
	}

	@FindBy(id = "educationadditional")
	private WebElement PI_AdditionalDegree_DD;
	public WebElement getPI_AdditionalDegree_DD() {
		return PI_AdditionalDegree_DD;
	}

	@FindBy(id = "institutionName")
	private WebElement PI_College_Value;
	public WebElement getPI_College_Value() {
		return PI_College_Value;
	}

	@FindBy(id = "educationInDetail")
	private WebElement PI_Education_Detail_Value;
	public WebElement getPI_Education_Detail_Value() {
		return PI_Education_Detail_Value;
	}

	@FindBy(id = "employmentCategory1")
	private WebElement PI_Government;
	public WebElement getPI_Government() {
		return PI_Government;
	}

	@FindBy(id = "employmentCategory2")
	private WebElement PI_Defence;
	public WebElement getPI_Defence() {
		return PI_Defence;
	}

	@FindBy(id = "employmentCategory3")
	private WebElement PI_Private;
	public WebElement getPI_Private() {
		return PI_Private;
	}

	@FindBy(id = "employmentCategory4")
	private WebElement PI_Business;
	public WebElement getPI_Business() {
		return PI_Business;
	}

	@FindBy(id = "employmentCategory6")
	private WebElement PI_SelfEmployed;
	public WebElement getPI_SelfEmployed() {
		return PI_SelfEmployed;
	}

	@FindBy(id = "employmentCategory7")
	private WebElement PI_NotWorking;
	public WebElement getPI_NotWorking() {
		return PI_NotWorking;
	}

	@FindBy(id = "occupation")
	private WebElement PI_Occupation_DD;
	public WebElement getPI_Occupation_DD() {
		return PI_Occupation_DD;
	}

	@FindBy(id = "occupationInDetail1")
	private WebElement PI_OccupationDetail_DD;
	public WebElement getPI_OccupationDetail_DD() {
		return PI_OccupationDetail_DD;
	}

	@FindBy(id = "annualIncomeCurrency")
	private WebElement PI_AnnualIncome_Currency;
	public WebElement getPI_AnnualIncome_Currency() {
		return PI_AnnualIncome_Currency;
	}

	@FindBy(id = "annualIncome")
	private WebElement PI_AnnualIncome_DD_Value;
	public WebElement getPI_AnnualIncome_DD_Value() {
		return PI_AnnualIncome_DD_Value;
	}

	/////////////////////////////////////////////////////

	@FindBy(xpath = "//div[contains(text(),'Family Details')]//following::a[1]")
	private WebElement PI_Family_Details_Edit;
	public WebElement getPI_Family_Details_Edit() {
		return PI_Family_Details_Edit;
	}

	@FindBy(id = "familyValue1")
	private WebElement PI_OrthoDox;
	public WebElement getPI_OrthoDox() {
		return PI_OrthoDox;
	}

	@FindBy(id = "familyValue2")
	private WebElement PI_Traditional;
	public WebElement getPI_Traditional() {
		return PI_Traditional;
	}

	@FindBy(id = "familyValue3")
	private WebElement PI_Moderate;
	public WebElement getPI_Moderate() {
		return PI_Moderate;
	}

	@FindBy(id = "familyValue4")
	private WebElement PI_Liberal;
	public WebElement getPI_Liberal() {
		return PI_Liberal;
	}

	@FindBy(id = "familyType1")
	private WebElement PI_JointFammily;
	public WebElement getPI_JointFammily() {
		return PI_JointFammily;
	}

	@FindBy(id = "familyType2")
	private WebElement PI_NeuclearFamily;
	public WebElement getPI_NeuclearFamily() {
		return PI_NeuclearFamily;
	}

	@FindBy(id = "familyStatuss1")
	private WebElement PI_MiddleClass;
	public WebElement getPI_MiddleClass() {
		return PI_MiddleClass;
	}

	@FindBy(id = "familyStatuss2")
	private WebElement PI_UpperMiddleClass;
	public WebElement getPI_UpperMiddleClass() {
		return PI_UpperMiddleClass;
	}

	@FindBy(id = "familyStatuss4")
	private WebElement PI_Rich;
	public WebElement getPI_Rich() {
		return PI_Rich;
	}

	@FindBy(id = "ancestralOrigin")
	private WebElement PI_NativePlace_Value;
	public WebElement getPI_NativePlace_Value() {
		return PI_NativePlace_Value;
	}

	@FindBy(id = "fatherOccupation")
	private WebElement PI_Father_Occupation;
	public WebElement getPI_Father_Occupation() {
		return PI_Father_Occupation;
	}

	@FindBy(id = "motherOccupation")
	private WebElement PI_Mother_Occupation;
	public WebElement getPI_Mother_Occupation() {
		return PI_Mother_Occupation;
	}

	@FindBy(id = "brothers")
	private WebElement PI_Brothers_DD;
	public WebElement getPI_Brothers_DD() {
		return PI_Brothers_DD;
	}

	@FindBy(id = "marriedBrothers")
	private WebElement PI_Brother_Married_DD;
	public WebElement getPI_Brother_Married_DD() {
		return PI_Brother_Married_DD;
	}

	@FindBy(id = "sisters")
	private WebElement PI_Sister_DD;
	public WebElement getPI_Sister_DD() {
		return PI_Sister_DD;
	}

	@FindBy(id = "marriedSisters")
	private WebElement PI_Sister_Married;
	public WebElement getPI_Sister_Married() {
		return PI_Sister_Married;
	}

	@FindBy(id = "familyDescription")
	private WebElement PI_About_Family;
	public WebElement getPI_About_Family() {
		return PI_About_Family;
	}

	/////////////////////////

	@FindBy(xpath = "//*[@id=\"container6\"]/div[2]/a")
	private WebElement loaction_edit_btn;
	public WebElement getLoaction_edit_btn() {
		return loaction_edit_btn;
	}

	@FindBy(id = "country")
	private WebElement PI_country_living_in;
	public WebElement getPI_Country_living_in() {
		return PI_country_living_in;
	}

	@FindBy(id = "residingCityId")
	private WebElement PI_residing_City;
	public WebElement getPI_Residing_City() {
		return PI_residing_City;
	}

	@FindBy(id = "residingState")
	private WebElement PI_residing_State;
	public WebElement getPI_Residing_State() {
		return PI_residing_State;
	}

	@FindBy(id = "citizenship")
	private WebElement PI_citizenship;
	public WebElement getPI_Citizenship() {
		return PI_citizenship;
	}

	@FindBy(id = "placeofbirth")
	private WebElement PI_place_of_birth;
	public WebElement getPI_Place_of_birth() {
		return PI_place_of_birth;
	}

	@FindBy(id = "residingCity")
	private WebElement PI_residing_City_US;
	public WebElement getPI_Residing_City_US() {
		return PI_residing_City_US;
	}

	@FindBy(id = "residentStatus")
	private WebElement PI_resident_Status;
	public WebElement getPI_Resident_Status() {
		return PI_resident_Status;
	}

	///////////////////////////

/////////////////////////    Hobbies   ////////////////////////////////////
	
	@FindBy(xpath = "//div[contains(text(),'Hobbies & Interest')]//following::a[1]")
	private WebElement PI_Hobbies_Edit;
	public WebElement getPI_Hobbies_Edit() {
		return PI_Hobbies_Edit;
	}
	
//art hobbies4
	@FindBy(id = "hobbies4")
	private WebElement PI_art;
	public WebElement getPI_Art() {
		return PI_art;
	}

// Nature - hobbies13
	@FindBy(id = "hobbies13")
	private WebElement PI_Nature;
	public WebElement getPI_Nature() {
		return PI_Nature;
	}

// Cooking - 

	@FindBy(id = "hobbies6")
	private WebElement PI_cooking;
	public WebElement getPI_Cooking() {
		return PI_cooking;
	}

//Dancing
	@FindBy(id = "hobbies8")
	private WebElement PI_Dancing;
	public WebElement getPI_Dancing() {
		return PI_Dancing;
	}

// Garfen - Landscape
	@FindBy(id = "hobbies11")
	private WebElement PI_Garden;
	public WebElement getPI_Garden() {
		return PI_Garden;
	}

// Painting
	@FindBy(id = "hobbies15")
	private WebElement PI_Painting;
	public WebElement getPI_Painting() {
		return PI_Painting;
	}

// Pets
	@FindBy(id = "hobbies17")
	private WebElement PI_Pets;
	public WebElement getPI_Pets() {
		return PI_Pets;
	}

// Photograph
	@FindBy(id = "hobbies18")
	private WebElement PI_Photograph;
	public WebElement getPPI_hotograph() {
		return PI_Photograph;
	}

//  Playing Music Instruments
	@FindBy(id = "hobbies19")
	private WebElement PI_Playing_Music_Instruments;
	public WebElement getPI_Playing_Music_Instruments() {
		return PI_Playing_Music_Instruments;
	}

// Puzzles
	@FindBy(id = "hobbies20")
	private WebElement PI_Puzzles;
	public WebElement getPI_Puzzles() {
		return PI_Puzzles;
	}

// Internet Surfing
	@FindBy(id = "interest5")
	private WebElement PI_Internet_Surfing;
	public WebElement getPI_Internet_Surfing() {
		return PI_Internet_Surfing;
	}

// Listening Music
	@FindBy(id = "interest8")
	private WebElement PI_Listening_Music;
	public WebElement getPI_Listening_Music() {
		return PI_Listening_Music;
	}

// Movies 
	@FindBy(id = "interest7")
	private WebElement PI_Movies;
	public WebElement getPI_Movies() {
		return PI_Movies;
	}

// Travelling
	@FindBy(id = "interest15")
	private WebElement PI_Travelling;
	public WebElement getPI_Travelling() {
		return PI_Travelling;
	}

// Others -  Value
	@FindBy(id = "hobbiesDesc")
	private WebElement PI_hobbies_others;
	public WebElement getPI_Hobbies_others() {
		return PI_hobbies_others;
	}

// Film Song
	@FindBy(id = "music4")
	private WebElement PI_film_song;
	public WebElement getPI_Film_song() {
		return PI_film_song;
	}

// indian / Clasical
	@FindBy(id = "music9")
	private WebElement PI_indian_Clasical;
	public WebElement getPI_Indian_Clasical() {
		return PI_indian_Clasical;
	}

// Western
	@FindBy(id = "music18")
	private WebElement PI_Western;
	public WebElement getPI_Western() {
		return PI_Western;
	}

// music_others
	@FindBy(id = "musicDesc")
	private WebElement PI_music_others;
	public WebElement getPI_Music_others() {
		return PI_music_others;
	}

// Badmiton
	@FindBy(id = "sports4")
	private WebElement PI_Badmiton;
	public WebElement getPI_Badmiton() {
		return PI_Badmiton;
	}

// Carrom
	@FindBy(id = "sports10")
	private WebElement PI_Carrom;
	public WebElement getPI_Carrom() {
		return PI_Carrom;
	}

// Chess
	@FindBy(id = "sports11")
	private WebElement PI_Chess;
	public WebElement getPI_Chess() {
		return PI_Chess;
	}

// Cricket
	@FindBy(id = "sports7")
	private WebElement PI_Cricket;
	public WebElement getPI_Cricket() {
		return PI_Cricket;
	}

// Football
	@FindBy(id = "sports12")
	private WebElement PI_Football;
	public WebElement getPI_Football() {
		return PI_Football;
	}

// Jogging
	@FindBy(id = "sports15")
	private WebElement PI_Jogging;
	public WebElement getPI_Jogging() {
		return PI_Jogging;
	}

// Swimming
	@FindBy(id = "sports19")
	private WebElement PI_Swimming;
	public WebElement getPI_Swimming() {
		return PI_Swimming;
	}

//Sports_other
	@FindBy(id = "sportsDesc")
	private WebElement PI_Sports_other;
	public WebElement getPI_Sports_other() {
		return PI_Sports_other;
	}

// Arabic
	@FindBy(id = "food1")
	private WebElement PI_Arabic;
	public WebElement getPI_Arabic() {
		return PI_Arabic;
	}

// Bengali
	@FindBy(id = "food2")
	private WebElement PI_Bengali;
	public WebElement getPI_Bengali() {
		return PI_Bengali;
	}

//. Chinese
	@FindBy(id = "food3")
	private WebElement PI_Chinese;
	public WebElement getPI_Chinese() {
		return PI_Chinese;
	}

//  Continental
	@FindBy(id = "food4")
	private WebElement PI_Continental;
	public WebElement getPI_Continental() {
		return PI_Continental;
	}

// Fast Food
	@FindBy(id = "food17")
	private WebElement PI_Fast_Food;
	public WebElement getPI_Fast_Food() {
		return PI_Fast_Food;
	}

// Gujarathi
	@FindBy(id = "food5")
	private WebElement PI_Gujarathi;
	public WebElement getPI_Gujarathi() {
		return PI_Gujarathi;
	}

// Italian
	@FindBy(id = "food6")
	private WebElement PI_Italian;
	public WebElement getPI_Italian() {
		return PI_Italian;
	}

//  Konkan
	@FindBy(id = "food7")
	private WebElement PI_Konkan;
	public WebElement getPI_Konkan() {
		return PI_Konkan;
	}

//  Mexican
	@FindBy(id = "food8")
	private WebElement PI_Mexican;
	public WebElement getPI_Mexican() {
		return PI_Mexican;
	}

// Moghalai
	@FindBy(id = "food9")
	private WebElement PI_Moghalai;
	public WebElement getPI_Moghalai() {
		return PI_Moghalai;
	}

// Punjabi
	@FindBy(id = "food11")
	private WebElement PI_Punjabi;
	public WebElement getPI_Punjabi() {
		return PI_Punjabi;
	}

// rajastahni
	@FindBy(id = "food12")
	private WebElement PI_rajastahni;
	public WebElement getPI_Rajastahni() {
		return PI_rajastahni;
	}

// South Indian
	@FindBy(id = "food13")
	private WebElement PI_South_Indian;
	public WebElement getPI_outh_Indian() {
		return PI_South_Indian;
	}

// Spanish
	@FindBy(id = "food18")
	private WebElement PI_Spanish;
	public WebElement getPI_Spanish() {
		return PI_Spanish;
	}

// Sushi
	@FindBy(id = "food14")
	private WebElement PI_Sushi;
	public WebElement getPI_Sushi() {
		return PI_Sushi;
	}

// others_food
	@FindBy(id = "foodDesc")
	private WebElement PI_others_food;
	public WebElement getPI_Others_food() {
		return PI_others_food;
	}

// Hobbies Clear.
	@FindBy(xpath = "//*[@id=\"frmHobbies\"]/div[13]/a")
	private WebElement PI_hobbies_Clear;
	public WebElement getPI_Hobbies_Clear() {
		return PI_hobbies_Clear;
	}

////////////////////////////////////

	@FindBy(xpath = "//*[@id=\"container7\"]/div[2]/a")
	private WebElement PI_edit_mail_btn;
	public WebElement getPI_Edit_mail_btn() {
		return PI_edit_mail_btn;
	}

	@FindBy(id = "email")
	private WebElement PI_email;
	public WebElement getPI_Email() {
		return PI_email;
	}

	@FindBy(xpath = "//*[@id=\"frm\"]/dl[1]/dd/span/input")
	private WebElement PI_email_save_btn;
	public WebElement getPI_Email_save_btn() {
		return PI_email_save_btn;
	}

	@FindBy(xpath = "//*[@id=\"container8\"]/div[2]/a")
	private WebElement PI_mobile_number_edit_btn;
	public WebElement getPI_mobile_number_edit_btn() {
		return PI_mobile_number_edit_btn;
	}

	@FindBy(id = "countryCode")
	private WebElement PI_country_code;
	public WebElement getPI_Country_code() {
		return PI_country_code;
	}

	@FindBy(id = "mobileNo")
	private WebElement PI_mobile_no;
	public WebElement getPI_Mobile_no() {
		return PI_mobile_no;
	}

	@FindBy(id = "verifyMobile")
	private WebElement PI_mobile_no_save_button;
	public WebElement getPI_Mobile_no_save_button() {
		return PI_mobile_no_save_button;
	}

}
