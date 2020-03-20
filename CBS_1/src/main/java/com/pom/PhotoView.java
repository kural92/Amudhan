package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Base;

public class PhotoView extends Base{
	
	
	public PhotoView(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	///  Matches
	@FindBy(xpath="//*[@id=\"topnav-login-menu\"]/div[2]/div[2]/a")
	private WebElement matches;
	public WebElement getMatches() {
		return matches;
	}
	
	/////  Latest Matches 
    @FindBy(id="menuLM")
    private WebElement latest_matches;
	public WebElement getLatest_matches() {
		return latest_matches;
	}
    
	///  Profile With Photo Button 
	@FindBy(xpath="//*[@id=\"facetProfileType\"]/dl/dd[1]/a")
	private WebElement profile_with_photo;
	public WebElement getProfile_with_photo() {
		return profile_with_photo;
	}
	
	// Contact Radio Button
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
		
		////     ID need to Be Use with Matri ID  -  " +ID ".
		@FindBy(xpath="//*[@id=\"imgdiv1_EZH734799\"]/img")
		private WebElement view_photo;
		public WebElement getView_photo() {
			return view_photo;
		}
		
		//  View Image Previous "<"  button. 
		@FindBy(xpath="//*[@id=\"vpGallerypopup\"]/div/div[2]/div/div[1]/div/div/a[1]")
		private WebElement image_prev_btn;
		public WebElement getImage_prev_btn() {
			return image_prev_btn;
		}
		
		///   Previous Image Previous ">"  button. 
		@FindBy(xpath="//*[@id=\"vpGallerypopup\"]/div/div[2]/div/div[1]/div/div/a[2]")
		private WebElement image_next_btn;
		public WebElement getImage_next_btn() {
			return image_next_btn;
		}
		
		
		@FindBy(xpath="//*[@id=\"vpGallerypopup\"]/div/div[1]/span")
		private WebElement close_photo_btn;
		public WebElement getClose_photo_btn() {
			return close_photo_btn;
		}
		
		
		
		
		
}
