package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Base;

public class ShortList extends Base {
	
	
	
	public ShortList(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(xpath="//*[@id=\"topnav-login-menu\"]/div[2]/div[2]/a")
	private WebElement matches_btn;
	public WebElement getMatches_btn() {
		return matches_btn;
	}
   
     @FindBy(xpath="//*[@id=\"menuLM\"]")
     private WebElement latest_matches;
	public WebElement getLatest_matches() {
		return latest_matches;
	}
     
	
	@FindBy(xpath="//*[@id=\"ignorecrossbefore_0\"]/div[4]/div[2]/span[3]")
	private WebElement shortlist_btn;
	public WebElement getShortlist_btn() {
		return shortlist_btn;
	}
	
	
	@FindBy(xpath="//*[@id=\"lightpic_fav_EZH731521\"]/a")
	private WebElement shorlisted_popup;
	public WebElement getShorlisted_popup() {
		return shorlisted_popup;
	}
	
	
	@FindBy(xpath="//*[@id=\"hide_no_result\"]")
	private WebElement matri_id;
	public WebElement getMatri_id() {
		return matri_id;
	}
	
	
	@FindBy(xpath="//*[@id=\"topnav-login-menu\"]/div[2]/div[1]/a")
	private WebElement myhome;
	public WebElement getMyhome() {
		return myhome;
	}
	
	
	@FindBy(xpath="//*[@id=\"myhomepop\"]/div[2]/div/div[1]/ul/li[2]/a")
	private WebElement shortlisted_by_me;
	public WebElement getShortlisted_by_me() {
		return shortlisted_by_me;
	}
	
	
	@FindBy(xpath="//*[@id=\"hide_no_result\"]")
	private WebElement list_matriID;
	public WebElement getList_matriID() {
		return list_matriID;
	}
	
	
	@FindBy(id="ignorecrossbefore_0")
	private WebElement shortlist_viewprofile;
	public WebElement getShortlist_viewprofile() {
		return shortlist_viewprofile;
	}
	
	@FindBy(xpath="//*[@id=\"Newfavouriteshow\"]")
	private WebElement viewprofile_shrtlist_btn;
	public WebElement getViewprofile_shrtlist_btn() {
		return viewprofile_shrtlist_btn;
	}
	
	
	@FindBy(xpath="//span[@class='drpiconshin block-downarw']")
	private WebElement view_profile_Down_btn;
	public WebElement getView_profile_Down_btn() {
		return view_profile_Down_btn;
	}
	
	
	@FindBy(xpath="(//*[@id=\"infiniteshortlistbtn_EZH734247\"]/a)[1]")
	private WebElement view_profile_down_shrtlst_btn;
	public WebElement getView_profile_down_shrtlst_btn() {
		return view_profile_down_shrtlst_btn;
	}
	
	
	
	
	
	
	}
	
	
	
	
	

