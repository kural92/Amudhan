package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Base;

public class SortScroll extends Base{
	
	
	public SortScroll(WebDriver driver) {
		
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

	
	@FindBy(xpath="//*[@id=\"topnav-login-menu\"]/div[2]/div[2]/a")
	private WebElement matches;
	public WebElement getMatches() {
		return matches;
	}
	
	
	@FindBy(id="menuLM")
	private WebElement latest_matches;
	public WebElement getLatest_matches() {
		return latest_matches;
	}
	
	@FindBy(id="sort_relvance")
	private WebElement sort_relevance_radio_btn;
	public WebElement getSort_relevance_radio_btn() {
		return sort_relevance_radio_btn;
	}
	
	@FindBy(id="sort_recent_active")
	private WebElement sort_recent_active_button;
	public WebElement getSort_recent_active_button() {
		return sort_recent_active_button;
	}
	
	@FindBy(id="sort_new_profile")
	private WebElement sort_new_profile;
	public WebElement getSort_new_profile() {
		return sort_new_profile;
	}
	
	@FindBy(id="sort_old_profile")
	private WebElement sort_old_profile;
	public WebElement getSort_old_profile() {
		return sort_old_profile;
	}

	///////    To know the total profile count ---  int = get text   
	@FindBy(id="total_div")
	private WebElement total_profile_count;
	public WebElement getTotal_profile_count() {
		return total_profile_count;
	}
	
	
	/////   Scroll   --    Uisng Pagination
	@FindBy(id="resultsperpage")
	private WebElement page_count;
	public WebElement getPage_count() {
		return page_count;
	}
	
	/////  List   of elements
	@FindBy(xpath="//*[@id=\"paginationBottom\"]/span[2]")
	private WebElement next_page_bxt;
	public WebElement getNext_page_bxt() {
		return next_page_bxt;
	}
	
	///// Pagenation Next Button   ///
	
	@FindBy(xpath="//span[contains(text(),'Next ')]")
	private WebElement next_btn;
	public WebElement getNext_btn() {
		return next_btn;
	}
	
	
	//////     Recently Active  Profile  -- With Photo
	@FindBy(id="recently_func_photo")
	private WebElement recent_profile_with_Photo;
	public WebElement getRecent_profile_with_Photo() {
		return recent_profile_with_Photo;
	}
	
	
	
	/////     Newest Profile  -- With Photo
	@FindBy(id="newest_profiles_func_photo")
	private WebElement new_profile_with_photo;
	public WebElement getNew_profile_with_photo() {
		return new_profile_with_photo;
	}
	
	
	
  /////       Oldest Profile  -- With Photo
	@FindBy(id="oldest_profiles_func_photo")
	private WebElement  old_profile_with_photo;
	public WebElement getOld_profile_with_photo() {
		return old_profile_with_photo;
	}
	
	@FindBy(id="menuYTB")
	private WebElement  yet_to_viewed;
	public WebElement getYet_to_viewed() {
		return yet_to_viewed;
	}
	
	
	@FindBy(xpath="//*[@id=\"matchpop\"]/div[2]/div/div[1]/ul/li[3]/a")
	private WebElement member_who_might_like_you;
	public WebElement getMember_who_might_like_you() {
		return member_who_might_like_you;
	}
	
	
	@FindBy(xpath="//*[@id=\"matchpop\"]/div[2]/div/div[1]/ul/li[4]/a")
	private WebElement mutual_matches;
	public WebElement getMutual_matches() {
		return mutual_matches;
	}
	
	@FindBy(id="premiumYTV")
	private WebElement premium_members;
	public WebElement getPremium_members() {
		return premium_members;
	}
	
	
	
	
}
