package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Base;

public class ViewProfileScroll extends Base {
	
	
	public ViewProfileScroll(WebDriver driver) {
	
		PageFactory.initElements(driver, this);
		
		
		
	}
	
	
	//////////////////Dont shpw profiles already Viewed,contact etc...////////////
	
	
	////Contact Radio Button 
	
	@FindBy(id="alreadyContOpt")
	private WebElement contact_radio_btn;
	public WebElement getContact_radio_btn() {
		return contact_radio_btn;
	}
	
	
	////View Radio Button
	
	@FindBy(id="alreadyViewedOpt")
	private WebElement view_radio_btn;
	public WebElement getView_radio_btn() {
		return view_radio_btn;
	}
	
	///// SHortlist Radio Button
	
	@FindBy(id="shortlistOpt")
	private WebElement shortlist_radio_button;
	public WebElement getShortlist_radio_button() {
		return shortlist_radio_button;
	}
	
	
	//////Block Radio Button
	
	


	@FindBy(id="ignoredOpt")
	private WebElement Block_radio_btn;
	public WebElement getBlock_radio_btn() {
		return Block_radio_btn;
	}
	
	
	//// Ignore Radio Button
	
	@FindBy(id="igOpt")
	private WebElement ignore_radio_btn;
	public WebElement getIgnore_radio_btn() {
		return ignore_radio_btn;
	}
	
	
	//  Dont show profile submit buttom
	
	@FindBy(xpath="//*[@id=\"save_srch_link\"]/div[5]/div[3]/input")
	private WebElement dnt_show_submit;
	public WebElement getDnt_show_submit() {
		return dnt_show_submit;
	}
	
	
	///  click to view the profile
	
	@FindBy(xpath="//*[@id=\"ignorecrossbefore_0\"]/div[4]")
	private WebElement view_profile_click;
	public WebElement getView_profile_click() {
		return view_profile_click;
	}
	
	
	////  Survey Intermediate Page Close
	
	@FindBy(id="SurveyPopupClose")
	private WebElement survey_pop_up_close;
	public WebElement getSurvey_pop_up_close() {
		return survey_pop_up_close;
	}
	
	//////  View Profile Next " V " button
	
	@FindBy(xpath="//*[@id=\"nxtproflink\"]/span/i")
	private WebElement view_profile_next_btn;
	public WebElement getView_profile_next_btn() {
		return view_profile_next_btn;
	}
	
	
	/////  View Profile  Previous " ^ " Button 
	
	@FindBy(id="prevproflink")
	private WebElement view_profile_previous_btn;
	public WebElement getView_profile_previous_btn() {
		return view_profile_previous_btn;
	}
	
	
	/////      
	
}
