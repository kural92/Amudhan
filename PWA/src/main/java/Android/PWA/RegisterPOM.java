package Android.PWA;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPOM extends BaseTest{
	
	//WebDriver driver;
	
	public RegisterPOM(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
			}

	
	
	@FindBy(id="COMMUNITY")
	private WebElement community;
	public WebElement getCommunity() {
		return community;
	}
	
	
	@FindBy(id="list_view_detail")
	private WebElement choose_community;
	public WebElement getChoose_community() {
		return choose_community;
	}
	
	@FindBy(id="RegPanelSearchvalue")
	private WebElement community_search;
	public WebElement getCommunity_search() {
		return community_search;
	}

	@FindBy(xpath="(//li[@class='ui-li ui-li-static ui-btn-up-c'])[1]")
	private WebElement community_search_value;
	public WebElement getCommunity_search_value() {
		return community_search_value;
	}



	@FindBy(css="#CBSRegistration > fieldset.ui-corner-all.ui-controlgroup.ui-controlgroup-horizontal > div.ui-controlgroup-controls > div > div > div:nth-child(1) > label > span")
	private WebElement profile_created_self;
	public WebElement getProfile_created_self() {
		return profile_created_self;
	}
	
	
	@FindBy(css="#CBSRegistration > fieldset.ui-corner-all.ui-controlgroup.ui-controlgroup-horizontal > div.ui-controlgroup-controls > div > div > div:nth-child(2) > label > span")
	private WebElement profile_created_parents;
	public WebElement getProfile_created_parents() {
		return profile_created_parents;
	}
	
	
	@FindBy(css="#CBSRegistration > fieldset.ui-corner-all.ui-controlgroup.ui-controlgroup-horizontal > div.ui-controlgroup-controls > div > div > div:nth-child(3) > label > span")
	private WebElement profile_created_sibiling;
	public WebElement getProfile_created_sibiling() {
		return profile_created_sibiling;
	}
	
	@FindBy(css="#CBSRegistration > fieldset.ui-corner-all.ui-controlgroup.ui-controlgroup-horizontal > div.ui-controlgroup-controls > div > div > div:nth-child(4) > label > span")
	private WebElement profile_created_relative;
	public WebElement getProfile_created_relative() {
		return profile_created_relative;
	}
	
	
	@FindBy(css="#CBSRegistration > fieldset.ui-corner-all.ui-controlgroup.ui-controlgroup-horizontal > div.ui-controlgroup-controls > div > div > div:nth-child(5) > label > span")
	private WebElement profile_created_friend;
	public WebElement getProfile_created_friend() {
		return profile_created_friend;
	} 
	
	@FindBy(id="USERNAME1")
	private WebElement name;
	public WebElement getName() {
		return name;
	}



	@FindBy(css="#CBSRegistration > div.genderblock > fieldset > div.ui-controlgroup-controls > div:nth-child(1) > label > span")
	private WebElement	male;
	public WebElement getMale() {
		return male;
	}
	
	@FindBy(css="#CBSRegistration > div.genderblock > fieldset > div.ui-controlgroup-controls > div:nth-child(2) > label > span")
	private WebElement	female;
	public WebElement getFemale() {
		return female;
	}
	
	@FindBy(xpath="//div[@class='dwv']")
	private WebElement dob_sendKeys;
	public WebElement getDob_sendKeys() {
		return dob_sendKeys;
	}



	@FindBy(id="dobspan")
	private WebElement dob;
	public WebElement getDob() {
		return dob;
	}
	
	
	@FindBy(id="dw_set")
	private WebElement dob_set;
	public WebElement getDob_set() {
		return dob_set;
	}
	
	
	@FindBy(id="PASSWORD")
	private WebElement password;
	public WebElement getPassword() {
		return password;
	}
	
	@FindBy(id="ISDCode")
	private WebElement country_Code;
	public WebElement getCountry_Code() {
		return country_Code;
	}
	
	@FindBy(id="RegPanelSearchvalue")
	private WebElement country_search;
	public WebElement getCountry_search() {
		return country_search;
	}
	
	
	@FindBy(id="RELIGION")
	private WebElement religion;
	public WebElement getReligion() {
		return religion;
	}
	
	@FindBy(id="SUBCASTE")
	private WebElement subcaste;
	public WebElement getSubcaste() {
		return subcaste;
	}



	@FindBy(id="CONTACTNO")
	private WebElement mobile_number;
	public WebElement getMobile_number() {
		return mobile_number;
	}
	
	@FindBy(id="MOTHERTONGUE")
	private WebElement mother_tongue;
	public WebElement getMother_tongue() {
		return mother_tongue;
	}
	
	@FindBy(id="continuebutton")
	private WebElement continue_button;
	public WebElement getContinue_button() {
		return continue_button;
	}
	
	
	///////   Page 2 
	
	
	@FindBy(xpath="//span[contains(text(),'Unmarried')]")
	private WebElement unmarried;
	public WebElement getUnmarried() {
		return unmarried;
	}
	
	@FindBy(xpath="//span[contains(text(),'Widow / Widower')]")
	private WebElement widow;
	public WebElement getWidow() {
		return widow;
	}
	
	@FindBy(xpath="//span[contains(text(),'Divorced')]")
	private WebElement Divorceed;
	public WebElement getDivorceed() {
		return Divorceed;
	}
	
	@FindBy(xpath="//span[contains(text(),'Separated')]")
	private WebElement seperated;
	public WebElement getSeperated() {
		return seperated;
	}
	
	@FindBy(id="EMAIL1")
	private WebElement email;
	public WebElement getEmail() {
		return email;
	}
	
	
	@FindBy(id="COUNTRYLIVING")
	private WebElement country_living;
	public WebElement getCountry_living() {
		return country_living;
	}
	
	
	@FindBy(id="RESIDINGSTATE")
	private WebElement state;
	public WebElement getState() {
		return state;
	}
	
	
	@FindBy(id="RESIDINGCITY")
	private WebElement city;
	public WebElement getCity() {
		return city;
	}
	
	
	@FindBy(id="RESIDINGCITYTEXT")
	private WebElement city_text;
	public WebElement getCity_text() {
		return city_text;
	}
	
	
	@FindBy(id="CITIZENSHIP")
	private WebElement citizenShip;
	public WebElement getCitizenShip() {
		return citizenShip;
	}	
	
	@FindBy(id="RESIDENTSTATUS")
	private WebElement resident_status;
	public WebElement getResident_status() {
		return resident_status;
	}
	
	
	
	/////   Page 3
	
	@FindBy(id="HEIGHT")
	private WebElement height;
	public WebElement getHeight() {
		return height;
	}
	
	@FindBy(id="dw_set")
	private WebElement height_setter;
	public WebElement getHeight_setter() {
		return height_setter;
	}
	
	
	@FindBy(xpath="//span[contains(text(),'Normal')]")
	private WebElement physical_status_normal;
	public WebElement getPhysical_status_normal() {
		return physical_status_normal;
	}

	@FindBy(id="radio-physical-h-2b")
	private WebElement physical_status_challenged;
	public WebElement getPhysical_status_challenged() {
		return physical_status_challenged;
	}



	@FindBy(id="EDUCATION")
	private WebElement education;
	public WebElement getEducation() {
		return education;
	}
	
	@FindBy(id="ABOUTME")
	private WebElement about_me;
	public WebElement getAbout_me() {
		return about_me;
	}
	
	
	@FindBy(id="OCCUPATION")
	private WebElement occupation;
	public WebElement getOccupation() {
		return occupation;
	}
	
	
	@FindBy(xpath="//*[@id=\"INCOMETEXT1\"]/div[2]")
	private WebElement income_text;
	public WebElement getIncome_text() {
		return income_text;
	}
	
	
	
	
}
