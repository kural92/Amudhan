package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Base;

public class WhoShortListMe extends Base{
	
	public WhoShortListMe(WebDriver driver) {

     PageFactory.initElements(driver, this);
	
	
	}
	
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div/form/div[1]/input")
	private WebElement matriId;
	public WebElement getMatriId() {
		return matriId;
	}


	@FindBy(id="passwordClear1")
	private WebElement paswwordclr;
	public WebElement getPaswwordclr() {
		return paswwordclr;
	}


	@FindBy(id="password1")
	private WebElement password;
	public WebElement getPassword() {
		return password;
	}


	@FindBy(xpath="(//input[@type='submit'])[1]")
	private WebElement loginbtn;
	public WebElement getLoginbtn() {
		return loginbtn;
	}
	
	@FindBy(xpath="//a[contains(text(),'My Home')]")
	private WebElement my_home;
	public WebElement getMy_home() {
		return my_home;
	}
	
	
	@FindBy(xpath="//a[contains(text(),'Who shortlisted me ')]")
	private WebElement who_shortlisted_me;
	public WebElement getWho_shortlisted_me() {
		return who_shortlisted_me;
	}
	
	
	@FindBy(xpath="//span[@id=\"total_div\"]//following::span[@class='clr6']")
	private WebElement shortlisted_me_profile_count;
	public WebElement getShortlisted_me_profile_count() {
		return shortlisted_me_profile_count;
	}
	
	
	@FindBy(id="checkedresult")
	private WebElement check_box_intrest_shortlist;
	public WebElement getCheck_box_intrest_shortlist() {
		return check_box_intrest_shortlist;
	}
	
	
	@FindBy(xpath="//a[contains(text(),'Send Interest to All')]")
	private WebElement send_intrest_all_btn;
	public WebElement getSend_intrest_all_btn() {
		return send_intrest_all_btn;
	}
	
	
	@FindBy(xpath="//a[contains(text(),'Shortlist')]")
	private WebElement shortlist_button;
	public WebElement getShortlist_button() {
		return shortlist_button;
	}
	
	
	@FindBy(xpath="//a[contains(text(),'Accept')]")
	private WebElement accept_btn;
	public WebElement getAccept_btn() {
		return accept_btn;
	}
	
	@FindBy(xpath="//a[contains(text(),'Yes')]")
	private WebElement yes_btn;
	public WebElement getYes_btn() {
		return yes_btn;
	}
	
	@FindBy(xpath="//span[contains(text(),'No')]")
	private WebElement no_btn;
	public WebElement getNo_btn() {
		return no_btn;
	}
	
	@FindBy(xpath="//a[contains(text(),'Send Reminder')]")
	private WebElement send_reminder_btn;
	public WebElement getSend_reminder_btn() {
		return send_reminder_btn;
	}
	
	@FindBy(xpath="(//span[contains(text(),'Next ')])[2]")
	private WebElement next_btn;
	public WebElement getNext_btn() {
		return next_btn;
	}
	//span[@class='msgIcon-on']
	@FindBy(xpath="//span[@class='mobileIcon']")
	private WebElement view_mobile_no;
	public WebElement getView_mobile_no() {
		return view_mobile_no;
	}

	@FindBy(xpath="//span[@class='msgIcon-on']")
	private WebElement message_btn;
	public WebElement getMessage_btn() {
		return message_btn;
	}
	//span[@class='horoIcon']
	@FindBy(xpath="//span[@class='horoIcon']")
	private WebElement horoscope_btn;
	public WebElement getHoroscope_btn() {
		return horoscope_btn;
	}
	
	//span[@class='shortlistIcon']
	@FindBy(xpath="//span[@class='shortlistIcon']")
	private WebElement shortlist_icon_btn;
	public WebElement getShortlist_icon_btn() {
		return shortlist_icon_btn;
	}
	
	
	@FindBy(id="ignorecrossbefore_0")
	private WebElement view_profile_btn;
	public WebElement getView_profile_btn() {
		return view_profile_btn;
	}
	
	@FindBy(xpath="//span[@class='vp-mobileIcon']")
	private WebElement view_profile_mobile_no_btn;
	public WebElement getView_profile_mobile_no_btn() {
		return view_profile_mobile_no_btn;
	}
	
	
	@FindBy(xpath="//span[@class='vp-shortlistIcon-off']")
	private WebElement view_profile_shortlist_btn;
	public WebElement getView_profile_shortlist_btn() {
		return view_profile_shortlist_btn;
	}
	
	
	@FindBy(xpath="//span[@class='vp-horoIcon']")
	private WebElement view_profile_horoscope_icon;
	public WebElement getView_profile_horoscope_icon() {
		return view_profile_horoscope_icon;
	}
	
	
	@FindBy(xpath="//span[@class='vp-comm-history']")
	private WebElement view_profile_communication_history;
	public WebElement getView_profile_communication_history() {
		return view_profile_communication_history;
	}
	// Use List to get Total Request Value
	@FindBy(xpath="//span[contains(text(),'Request for')]")
	private WebElement view_profile_request_btn;
	public WebElement getView_profile_request_btn() {
		return view_profile_request_btn;
	}
	
	@FindBy(xpath="//a[contains(text(),'View Horoscope')]")
	private WebElement view_profile_view_horoscope1_btn;
	public WebElement getView_profile_view_horoscope1_btn() {
		return view_profile_view_horoscope1_btn;
	}
	
	
	@FindBy(xpath="//div[@class='detailbox']")
	private WebElement view_profike_basic_details;
	public WebElement getView_profike_basic_details() {
		return view_profike_basic_details;
	}
	
	@FindBy(xpath="//a[contains(text(),'Send SMS')]")
	private WebElement mble_number_Send_sms_btn;
	public WebElement getMble_number_Send_sms_btn() {
		return mble_number_Send_sms_btn;
	}
	
	
	@FindBy(xpath="//a[contains(text(),'View Mobile Number')]")
	private WebElement view_mble_number_btn;
	public WebElement getView_mble_number_btn() {
		return view_mble_number_btn;
	}
	
	@FindBy(xpath="//a[contains(text(),'Download Horoscope')]")
	private WebElement download_horoscope;
	public WebElement getDownload_horoscope() {
		return download_horoscope;
	}
	 
	@FindBy(id="horoclose")
	private WebElement Horoscope_close_btn;
	public WebElement getHoroscope_close_btn() {
		return Horoscope_close_btn;
	}
	
	@FindBy(id="accept_close")
	private WebElement request_close_btn;
	public WebElement getRequest_close_btn() {
		return request_close_btn;
	}
	
	@FindBy(xpath="(//a[@class='popupclose popup-close-off'])[6]")
	private WebElement veiw_mble_no_close_btn;
	public WebElement getVeiw_mble_no_close_btn() {
		return veiw_mble_no_close_btn;
	}
	////////////////////////     Who Viewed My Mobile    /////////////////////////
	
	@FindBy(xpath="//a[contains(text(),'Who viewed my mobile no ')]")
	private WebElement who_view_my_mble_no;
	public WebElement getWho_view_my_mble_no() {
		return who_view_my_mble_no;
	}
	
	
	@FindBy(xpath="//span[@class='showmsgcount']")
	private WebElement mble_no_view_count;
	public WebElement getMble_no_view_count() {
		return mble_no_view_count;
	}
	//  LIst 
	@FindBy(xpath="//div[@class='srch1 phone-icon1-on']")
	private WebElement view_mobile_number;
	public WebElement getView_mobile_number() {
		return view_mobile_number;
	}
	
	//  List
	@FindBy(xpath="//div[@class='srch1 horo-on']")
	private WebElement view_horoscope_;
	public WebElement getView_horoscope_() {
		return view_horoscope_;
	}
	
	// List 
	@FindBy(xpath="//a[@class='clr6 boldtxt']")
	private WebElement mobile_view_matri_id;
	public WebElement getMobile_view_matri_id() {
		return mobile_view_matri_id;
	}
	
	// List  
	@FindBy(xpath="//a[@class='clr1 font16 boldtxt padr8']")
	private WebElement mobile_view_name;
	public WebElement getMobile_view_name() {
		return mobile_view_name;
	}
	
	@FindBy(xpath="//a[contains(text(),'Send Interest')]")
	private WebElement mobile_view_send_intrest;
	public WebElement getMobile_view_send_intrest() {
		return mobile_view_send_intrest;
	}
	
	
	@FindBy(xpath="(//span[contains(text(),'Next')])[2]")
	private WebElement mobile_view_next;
	public WebElement getMobile_view_next() {
		return mobile_view_next;
	}
	//   List  
	@FindBy(xpath="//a[contains(text(),'Mobile no. viewed by you')]")
	private WebElement mble_no_viewed_by_me;
	public WebElement getMble_no_viewed_by_me() {
		return mble_no_viewed_by_me;
	}
	
	
	@FindBy(xpath="//span[contains(text(),'Next')]")
	private WebElement mobile_view_next1;
	public WebElement getMobile_view_next1() {
		return mobile_view_next1;
	}
	
	///////////////////////////////////////   Intrest Received   ///////////////////////////////////
	@FindBy(xpath="//a[starts-with(text(),'Interests I received')]")
	private WebElement My_home_Intrest_rececived;
	public WebElement getMy_home_Intrest_rececived() {
		return My_home_Intrest_rececived;
	}
	
	// List
	@FindBy(xpath="//div[@class='fleft ']")
	private WebElement Intrest_recived_Matri_Id;
	public WebElement getIntrest_recived_Matri_Id() {
		return Intrest_recived_Matri_Id;
	}
	
	// List
	@FindBy(xpath="(//a[@class='clr1 bld'])[2]")
	private WebElement intresr_receicved_next;
	public WebElement getIntresr_receicved_next() {
		return intresr_receicved_next;
	}
	
	
}
