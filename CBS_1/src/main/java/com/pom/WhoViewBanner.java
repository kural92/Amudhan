package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Base;

public class WhoViewBanner extends Base{
	
	public WhoViewBanner(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[contains(text(),'My Home')]")
	private WebElement my_home;
	public WebElement getMy_home() {
		return my_home;
	}
	
	
	@FindBy(xpath="//span[contains(text(),'viewed your profile')]")
	private WebElement viwed_my_profile_banner;
	public WebElement getViwed_my_profile_banner() {
		return viwed_my_profile_banner;
	}
	
	@FindBy(xpath="//span[@class=\"number\"]")
	private WebElement viewed_my_profile_banner_count;
	public WebElement getViewed_my_profile_banner_count() {
		return viewed_my_profile_banner_count;
	}
	
	@FindBy(xpath="//span[@class=\"clr6\"]")
	private WebElement viewed_my_profile_count;
	public WebElement getViewed_my_profile_count() {
		return viewed_my_profile_count;
	}
	
	@FindBy(id="ignorecrossbefore_0")
	private WebElement view_profile_click;
	public WebElement getView_profile_click() {
		return view_profile_click;
	}
	
	@FindBy(xpath="//*[@id=\"hide_no_result\"]/div[1]/a")
	private WebElement matriID;
	public WebElement getMatriID() {
		return matriID;
	}
	
	@FindBy(xpath="//span[@class=\"clr7 src-double-tick\"]")
	private WebElement profile_viewed_date;
	public WebElement getProfile_viewed_date() {
		return profile_viewed_date;
	}
	
	
	@FindBy(xpath="(//a[contains(text(),'View Similar Profiles')])[1]")
	private WebElement view_similar_profiles;
	public WebElement getView_similar_profiles() {
		return view_similar_profiles;
	}
	
	@FindBy(xpath="//*[@id=\"ignorecrossbefore_0\"]/div[4]/div[2]/span[4]/span")
	private WebElement online_activity;
	public WebElement getOnline_activity() {
		return online_activity;
	}
	
	@FindBy(id="vphonediv0")
	private WebElement view_mble_no;
	public WebElement getView_mble_no() {
		return view_mble_no;
	}
	
	@FindBy(id="viewphone")
	private WebElement view_mobile_num2;
	public WebElement getView_mobile_num2() {
		return view_mobile_num2;
	}
	
	@FindBy(xpath="(//a[contains(text(),'Send Mail')])[1]")
	private WebElement send_mail_btn;
	public WebElement getSend_mail_btn() {
		return send_mail_btn;
	}
	
	@FindBy(id="viewhoro")
	private WebElement view_horoscope;
	public WebElement getView_horoscope() {
		return view_horoscope;
	}
	
	@FindBy(xpath="(//a[contains(text(),'Chat with this member')])[1]")
	private WebElement chat_with_this_member;
	public WebElement getChat_with_this_member() {
		return chat_with_this_member;
	}
	
	@FindBy(xpath="//a[contains(text(),'Request to View')]")
	private WebElement Req_view_mble_no;
	public WebElement getReq_view_mble_no() {
		return Req_view_mble_no;
	}
	
	@FindBy(xpath="//a[contains(text(),'View Mobile Number')]")
	private WebElement view_mobile_num_popUp;
	public WebElement getView_mobile_num_popUp() {
		return view_mobile_num_popUp;
	}
	
	@FindBy(xpath="(//a[@class='popupclose popup-close-off'])[5]")
	private WebElement view_mblr_no_pop_up_close;
	public WebElement getView_mblr_no_pop_up_close() {
		return view_mblr_no_pop_up_close;
	}
	
	@FindBy(xpath="//*[@id=\"lightpic\"]/div/div/div/div[11]")
	private WebElement mobile_no;
	public WebElement getMobile_no() {
		return mobile_no;
	}
	
	@FindBy(xpath="//*[@id=\"lightpic\"]/div/div/div/div[3]")
	private WebElement mble_view_count_details;
	public WebElement getMble_view_count_details() {
		return mble_view_count_details;
	}
	
	@FindBy(xpath="//a[@class='popupclose popup-close-off']")
	private WebElement view_mble_req_pop_up_close;
	public WebElement getView_mble_req_pop_up_close() {
		return view_mble_req_pop_up_close;
	}
	
	
	@FindBy(xpath="(//a[@class='popupclose popup-close-off'])[5]")
	private WebElement req_horoscope_pop_up_close_btn;
	public WebElement getReq_horoscope_pop_up_close_btn() {
		return req_horoscope_pop_up_close_btn;
	}
	
	@FindBy(id="reqhoro")
	private WebElement req_horoscope;
	public WebElement getReq_horoscope() {
		return req_horoscope;
	}
	
	 @FindBy(id="horoclose")
	 private WebElement horoscope_close_btn;
	public WebElement getHoroscope_close_btn() {
		return horoscope_close_btn;
	}
	
	
	@FindBy(xpath="//a[contains(text(),'Download Horoscope')]")
	private WebElement download_horoscope;
	public WebElement getDownload_horoscope() {
		return download_horoscope;
	}
	
	
	@FindBy(xpath="//span[@class='vp-shortlistIcon']")
	private WebElement shortlist_btn;
	public WebElement getShortlist_btn() {
		return shortlist_btn;
	}
	
	
	@FindBy(xpath="//*[@id=\"lightpic_fav_EZH731521\"]/a")
	private WebElement shorlisted_popup;
	public WebElement getShorlisted_popup() {
		return shorlisted_popup;
	}
	
	@FindBy(id="SurveyPopupClose")
	private WebElement survey_pop_up_close;
	public WebElement getSurvey_pop_up_close() {
		return survey_pop_up_close;
	}
	
	@FindBy(xpath="//span[contains(text(),'Request for')]")
	private WebElement view_profile_req;
	public WebElement getView_profile_req() {
		return view_profile_req;
	}
	
	@FindBy(xpath="//*[@id=\"nxtproflink\"]/span/i")
	private WebElement view_profile_next_btn;
	public WebElement getView_profile_next_btn() {
		return view_profile_next_btn;
	}
	
	
	@FindBy(id="prevproflink")
	private WebElement view_profile_previous_btn;
	public WebElement getView_profile_previous_btn() {
		return view_profile_previous_btn;
	}
	
	@FindBy(xpath="//*[@id=\"topnav-login-menu\"]/div[3]/div[2]/div[1]/a")
	private WebElement logout_menu;
	public WebElement getLogout_menu() {
		return logout_menu;
	}
	
	@FindBy(xpath="//*[@id=\"topnav-login-menu\"]/div[3]/div[2]/div[1]/a/img")
	private WebElement logout_menu_img;
	public WebElement getLogout_menu_img() {
		return logout_menu_img;
	}
	
	//////////////////////////////////     Who Shortlisted Banner   ////////////////////////////////
	
	@FindBy(xpath="//span[contains(text(),'shortlisted your profile')]")
	private WebElement shortlisted_my_banner;
	public WebElement getShortlisted_my_banner() {
		return shortlisted_my_banner;
	}
	
	
	@FindBy(xpath="//*[@id=\"lp-container\"]/div[5]/div/div[1]/div/div[6]/div[1]/div/div/div/a")
	private WebElement shoetlised_me_profile_count;
	public WebElement getShoetlised_me_profile_count() {
		return shoetlised_me_profile_count;
	}
	
	@FindBy(xpath="//*[@id=\"lp-container\"]/div[5]/div/div[1]/div/div[6]/div[1]")
	private WebElement shortlisted_banner_click;
	public WebElement getShortlisted_banner_click() {
		return shortlisted_banner_click;
	}
	
	//////////////////////         Payment     //////////////////////////////
	
	@FindBy(xpath="//*[@id=\"lp-container\"]/div[5]/div/div[1]/div/div[5]/a/div/div/div")
	private WebElement payment_banner_free_member;
	public WebElement getPayment_banner_free_member() {
		return payment_banner_free_member;
	}
	
	
	@FindBy(xpath="//span[@class=\"rdclr\"]")
	private WebElement payment_discount_amount;
	public WebElement getPayment_discount_amount() {
		return payment_discount_amount;
	}
	
	@FindBy(xpath="//*[@id=\"lp-container\"]/div[5]/div/div[1]/div/div[5]/a/div/div")
	private WebElement payment_banner_paid_member;
	public WebElement getPayment_banner_paid_member() {
		return payment_banner_paid_member;
	}
	
	
	@FindBy(xpath="//a[@class=\"popupclose popup-close-off\"]")
	private WebElement payment_hightlight_pop_up_close_btn;
	public WebElement getPayment_hightlight_pop_up_close_btn() {
		return payment_hightlight_pop_up_close_btn;
	}
	
	@FindBy(xpath="//span[@class=\"font16 boldtxt\"]")
	private WebElement payment_astro_mactch_price;
	public WebElement getPayment_astro_mactch_price() {
		return payment_astro_mactch_price;
	}
	
	@FindBy(id="spn_total_amt")
	private WebElement payment_astro_mactch_total_price;
	public WebElement getPayment_astro_mactch_total_price() {
		return payment_astro_mactch_total_price;
	}
	
	@FindBy(xpath="class=\"font16 txt-upper padl5 \"")
	private WebElement payment_addon_pack_name;
	public WebElement getPayment_addon_pack_name() {
		return payment_addon_pack_name;
	}
	
	
	
	
	
}
