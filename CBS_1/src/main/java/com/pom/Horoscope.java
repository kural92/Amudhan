package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Base;

public class Horoscope extends Base{
	
	//WebDriver driver;
	
	public Horoscope(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(xpath="//*[@id=\"topnav-login-menu\"]/div[3]/div[2]/div[1]/a/img")
    private WebElement menu_mouse_action;
	public WebElement getMenu_mouse_action() {
	return menu_mouse_action;
	}

	//*[@id="topnav-login-menu"]/div[3]/div[2]/div[1]/a
	@FindBy(xpath="//*[@id=\"topnav-login-menu\"]/div[3]/div[2]/div[1]/a")
    private WebElement menu_mouse_action1;
	public WebElement getMenu_mouse_action1() {
	return menu_mouse_action1;
	}


	@FindBy(xpath="//*[@id=\"userpop\"]/div[2]/div/div[3]/div[1]/ul/li[1]/a")
    private WebElement editProfile;
	public WebElement getEditProfile() {
		return editProfile;
	}	
	
	
	@FindBy(xpath="//*[@id=\"lp-container\"]/div/div/center/div[1]/div[1]/div[2]/ul/li[3]/div[2]/div[2]/div[2]/a")
    private WebElement addHoroScope_btn;
	public WebElement getAddHoroScope_btn() {
		return addHoroScope_btn;
	}
	
	
	@FindBy(id="hours")
	private WebElement hour_of_birth;
	public WebElement getHour_of_birth() {
		return hour_of_birth;
	}
	
	
	@FindBy(id="mins")
	private WebElement mins_of_birth;
	public WebElement getMins_of_birth() {
		return mins_of_birth;
	}
	
	
	@FindBy(id="meridiem")
	private WebElement time_format;
	public WebElement getTime_format() {
		return time_format;
	}
	
	
	@FindBy(id="country")
	private WebElement country_of_birth;
	public WebElement getCountry_of_birth() {
		return country_of_birth;
	}
	
	
	@FindBy(id="state")
	private WebElement state_of_birth;
	public WebElement getState_of_birth() {
		return state_of_birth;
	}
	
	
	@FindBy(id="city")
	private WebElement city_of_birth;
	public WebElement getCity_of_birth() {
		return city_of_birth;
	}
	
	
	@FindBy(id="chartStyle")
	private WebElement chart_style;
	public WebElement getChart_style() {
		return chart_style;
	}

	@FindBy(id="language")
	private WebElement language;
	public WebElement getLanguage() {
		return language;
	}



	@FindBy(xpath="//*[@id=\"frm\"]/div[2]/input")
	private WebElement horoscope_generate_btn;
	public WebElement getHoroscope_generate_btn() {
		return horoscope_generate_btn;
	}
	
	
	@FindBy(xpath="//*[@id=\"frm\"]/dl[13]/input[1]")
	private WebElement view_horoscope;		
	public WebElement getView_horoscope() {
		return view_horoscope;
	}

	
	@FindBy(xpath="//*[@id=\"frm\"]/dl[13]/input[2]")
	private WebElement edit_horoscope;
	public WebElement getEdit_horoscope() {
		return edit_horoscope;
	}


	@FindBy(xpath="//*[@id=\"frm\"]/dl[13]/input[3]")
	private WebElement delete_horoscope;
	public WebElement getDelete_horoscope() {
		return delete_horoscope;
	}


	@FindBy(id="horoscopeupload")
	private WebElement upload_horoscope;
	public WebElement getUpload_horoscope() {
		return upload_horoscope;
	}

	
	@FindBy(xpath="//*[@id=\"frmHoroscopeUpload\"]/div[5]/div[1]/input")
	private WebElement horoscope_upload_btn;
	public WebElement getHoroscope_upload_btn() {
		return horoscope_upload_btn;
	}


	@FindBy(id="checkProtect")
	private WebElement protect_horoscope_btn;
	public WebElement getProtect_horoscope_btn() {
		return protect_horoscope_btn;
	}



	@FindBy(xpath="//*[@id=\"userpop\"]/div[2]/div/div[3]/div[2]/ul/li[3]/a")
	private WebElement logout;
	public WebElement getLogout() {
		return logout;
	}
	
	
	@FindBy(xpath="/html/body/div/div/div[4]/a[1]")
    private WebElement download_horoscope;
	public WebElement getDownload_horoscope() {
		return download_horoscope;
	}
	
	@FindBy(xpath="//*[@id=\"frm\"]/div[1]/input[2]")
	private WebElement horoscope_cancel_bn;
	public WebElement getHoroscope_cancel_bn() {
		return horoscope_cancel_bn;
	}
	

    @FindBy(xpath="(//input[@type='button'])[3]")
    private WebElement view_uploaded_horoscope;
	public WebElement getView_uploaded_horoscope() {
		return view_uploaded_horoscope;
	}
	
	
	@FindBy(id="star")
	private WebElement star;
	public WebElement getStar() {
		return star;
	}
	
	
	@FindBy(id="raasi")
	private WebElement raasi;
	public WebElement getRaasi() {
		return raasi;
	}
	
	
	
	
}
