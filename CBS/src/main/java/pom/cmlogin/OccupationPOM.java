package pom.cmlogin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseTest;

public class OccupationPOM extends BaseTest {
	
	
	public OccupationPOM(WebDriver driver) {
		
		
		PageFactory.initElements(driver, this);

		
	}
	
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div/form/div[1]/input")
	private WebElement matriID;
	public WebElement getMatriID() {
		return matriID;
	}
	
    @FindBy(id="passwordClear1")
    private WebElement passclr;
	public WebElement getPassclr() {
		return passclr;
	}
	
	@FindBy(id="password1")
	private WebElement password;
	public WebElement getPassword() {
		return password;
	}
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div/form/div[2]/input[3]")
	private WebElement login_btn;
	public WebElement getLogin_btn() {
		return login_btn;
	}


	@FindBy(xpath="//*[@id=\"topnav-login-menu\"]/div[2]/div[3]/a")
    private WebElement inboxbtn;
	public WebElement getInboxbtn() {
		return inboxbtn;
	}	
	
	
	@FindBy(xpath="//*[@id=\"topnav-login-menu\"]/div[3]/div[2]/div[1]/a")
	private WebElement menu_btn;
	public WebElement getMenu_btn() {
		return menu_btn;
	}
	
	
	@FindBy(xpath="//a[contains(text(),'Edit Partner Preference')]")
	private WebElement edit_pp_menu_btn;
	public WebElement getEdit_pp_menu_btn() {
		return edit_pp_menu_btn;
	}
	
	
	@FindBy(xpath="//a[contains(text(),'Edit Profile')]")
	private WebElement edit_profile;
	public WebElement getEdit_profile() {
		return edit_profile;
	}


	@FindBy(xpath="//span[contains(text(),'Occupation - ')]//following::span[1]")
	private WebElement occupation_value;
	public WebElement getOccupation_value() {
		return occupation_value;
	}
	
	@FindBy(xpath="//div[@id='show_partner']//following::a[contains(text(),'Edit')]")
	private WebElement partner_preference_edit_btn;
	public WebElement getPartner_preference_edit_btn() {
		return partner_preference_edit_btn;
	}
	
	
	@FindBy(xpath="//input[@placeholder='Occupation']")
	private WebElement edit_pp_occupation;
	public WebElement getEdit_pp_occupation() {
		return edit_pp_occupation;
	}
	
	@FindBy(xpath="//a[contains(text(),'Matches ')]")
	private WebElement matches;
	public WebElement getMatches() {
		return matches;
	}
	
	
	@FindBy(id="total_div")
	private WebElement matches_count;
	public WebElement getMatches_count() {
		return matches_count;
	}
	
	
	//////////////////
	
	      //   Search
	
	@FindBy(xpath="(//a[contains(text(),'Search')])[1]")
	private WebElement search_btn;
	public WebElement getSearch_btn() {
		return search_btn;
	}


	@FindBy(id="occupationTemp")
	private WebElement occupation_seach_drpdown;
	public WebElement getOccupation_seach_drpdown() {
		return occupation_seach_drpdown;
	}
	
	@FindBy(id="subcasteTemp")
	private WebElement subCaste_dropdown;
	public WebElement getSubCaste_dropdown() {
		return subCaste_dropdown;
	}


	@FindBy(xpath="(//a[contains(text(),'Advanced')])[2]")
	private WebElement advanced_search;
	public WebElement getAdvanced_search() {
		return advanced_search;
	}
	
	@FindBy(id="occupation")
	private WebElement search_occupation_value;
	public WebElement getSearch_occupation_value() {
		return search_occupation_value;
	}
	
	
	@FindBy(xpath="//input[@value='Search']")
	private WebElement search_button;
	public WebElement getSearch_button() {
		return search_button;
	}
	
	
	
	

}
