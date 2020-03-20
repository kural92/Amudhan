package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Base;

public class DailyMatches extends Base{
	
	public DailyMatches(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//a[contains(text(),' Yes ')])[1]")
	private WebElement interest_yes_btn;
	public WebElement getInterest_yes_btn() {
		return interest_yes_btn;
	}
	
	@FindBy(id="(//a[contains(text(),' Skip ')])[1]")
	private WebElement interest_skip_btn;
	public WebElement getInterest_skip_btn() {
		return interest_skip_btn;
	}
	
	@FindBy(id="MessageTextArea")
	private WebElement send_mail_desc_box;
	public WebElement getSend_mail_desc_box() {
		return send_mail_desc_box;
	}
	
	@FindBy(id="buttonActionPerformSbmt")
	private WebElement mail_send_btn;
	public WebElement getMail_send_btn() {
		return mail_send_btn;
	}
	
	@FindBy(id="cls_btn")
	private WebElement mail_close_btn;
	public WebElement getMail_close_btn() {
		return mail_close_btn;
	}
	
	
	@FindBy(xpath="//a[contains(text(),'Prev')]")
	private WebElement prev_btn;
	public WebElement getPrev_btn() {
		return prev_btn;
	}

	@FindBy(xpath="//a[contains(text(),'Next')]")
	private WebElement next_btn;
	public WebElement getNext_btn() {
		return next_btn;
	}
	
	@FindBy(id="d7prev")
	private WebElement daily7_prev_arrow_btn;
	public WebElement getDaily7_prev_arrow_btn() {
		return daily7_prev_arrow_btn;
	}
	
	@FindBy(id="d7next")
	private WebElement daily7_next_arrow_btn;
	public WebElement getDaily7_next_arrow_btn() {
		return daily7_next_arrow_btn;
	}
	
	@FindBy(id="vphonediv0")
	private WebElement view_mobile_no;
	public WebElement getView_mobile_no() {
		return view_mobile_no;
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
	
	
	
	
	
	
	
	
	
	
	
}
