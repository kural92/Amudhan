package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Base;

public class Privacy extends Base{
	
	WebDriver driver;
	
	public Privacy(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebDriver getDriver() {
		return driver;
	}

	
	@FindBy(xpath="//*[@id=\"topnav-login-menu\"]/div[3]/div[2]/div[1]/a")
	private WebElement logout_menu;
	public WebElement getLogout_menu() {
		return logout_menu;
	}
	
	
	@FindBy(xpath="//*[@id=\"userpop\"]/div[2]/div/div[3]/div[2]/ul/li[3]/a")
	private WebElement privacy_settings;
	public WebElement getPrivacy_settings() {
		return privacy_settings;
	}
	
	@FindBy(id="pset1")
	private WebElement photo_visible_radio_btn;
	public WebElement getPhoto_visible_radio_btn() {
		return photo_visible_radio_btn;
	}
	
	@FindBy(id="pset2")
	private WebElement photo_visible_only_access_radio_btn;
	public WebElement getPhoto_visible_only_access_radio_btn() {
		return photo_visible_only_access_radio_btn;
	}
	
	@FindBy(id="photo_privacy")
	private WebElement photo_save_btn;
	public WebElement getPhoto_save_btn() {
		return photo_save_btn;
	}
	
	@FindBy(xpath="//a[contains(text(),'Phone')]")
	private WebElement phone_privacy_settings;
	public WebElement getPhone_privacy_settings() {
		return phone_privacy_settings;
	}
	
	@FindBy(xpath="(//a[contains(text(),'Edit')])[9]")
	private WebElement phone_number_edit;
	public WebElement getPhone_number_edit() {
		return phone_number_edit;
	}
	
	@FindBy(id="pset1")
	private WebElement show_mble_no_to_paid_user;
	public WebElement getShow_mble_no_to_paid_user() {
		return show_mble_no_to_paid_user;
	}
	
	@FindBy(id="pset2")
	private WebElement mble_no_visible_only_access_radio_btn;
	public WebElement getMble_no_visible_only_access_radio_btn() {
		return mble_no_visible_only_access_radio_btn;
	}
	
	@FindBy(xpath="//a[contains(text(),'Save')]")
	private WebElement mble_save_btn;
	public WebElement getMble_save_btn() {
		return mble_save_btn;
	}
	
	
	@FindBy(xpath="//a[contains(text(),'Horoscope')]")
	private WebElement horoscope_privacy_settings;
	public WebElement getHoroscope_privacy_settings() {
		return horoscope_privacy_settings;
	}
	
	
	@FindBy(id="pset1")
	private WebElement horoscope_view_all;
	public WebElement getHoroscope_view_all() {
		return horoscope_view_all;
	}
	
	@FindBy(id="pset2")
	private WebElement horoscope_visible_only_access_radio_btn;
	public WebElement getHoroscope_visible_only_access_radio_btn() {
		return horoscope_visible_only_access_radio_btn;
	}
	
	@FindBy(xpath="//a[contains(text(),'Save')]")
	private WebElement horoscope_save_btn;
	public WebElement getHoroscope_save_btn() {
		return horoscope_save_btn;
	}
	
	
	@FindBy(xpath="//a[contains(text(),'Profile Views')]")
	private WebElement profile_view_privacy_settings;
	public WebElement getProfile_view_privacy_settings() {
		return profile_view_privacy_settings;
	}
	
	@FindBy(id="pset2")
	private WebElement other_know_shortlisted;
	public WebElement getOther_know_shortlisted() {
		return other_know_shortlisted;
	}
	
	
	@FindBy(id="pset3")
	private WebElement other_know_viewedProfile;
	public WebElement getOther_know_viewedProfile() {
		return other_know_viewedProfile;
	}
	
	@FindBy(xpath="//a[contains(text(),'Save')]")
	private WebElement profile_view_save_btn;
	public WebElement getProfile_view_save_btn() {
		return profile_view_save_btn;
	}
	
	@FindBy(xpath="//a[contains(text(),'Unsubscribe from calling list')]")
	private WebElement unsubscribe_call_privacy_settings;
	public WebElement getUnsubscribe_call_privacy_settings() {
		return unsubscribe_call_privacy_settings;
	}
	
	
	@FindBy(id="radio1")
	private WebElement once_15_days;
	public WebElement getOnce_15_days() {
		return once_15_days;
	}
	
	@FindBy(id="radio2")
	private WebElement once_month;
	public WebElement getOnce_month() {
		return once_month;
	}
	
	@FindBy(id="radio3")
	private WebElement two_month_once;
	public WebElement getTwo_month_once() {
		return two_month_once;
	}
	
	@FindBy(id="radio4")
	private WebElement do_not_call;
	public WebElement getDo_not_call() {
		return do_not_call;
	}
	
	@FindBy(xpath="//*[@id=\"resulttxt\"]/form/div[5]/input")
	private WebElement call_submit;
	public WebElement getCall_submit() {
		return call_submit;
	}
	
	
	@FindBy(xpath="//input[@checked='checked']")
	private WebElement checked_box_btn;
	public WebElement getChecked_box_btn() {
		return checked_box_btn;
	}
	
	
	@FindBy(xpath="//input[@value=\"Submit\"]")
	private WebElement unsub_call_submit_btn;
	public WebElement getUnsub_call_submit_btn() {
		return unsub_call_submit_btn;
	}
	
}
