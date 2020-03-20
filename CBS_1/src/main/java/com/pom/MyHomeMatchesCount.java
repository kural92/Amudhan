package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Base;

public class MyHomeMatchesCount extends Base {
	
	public MyHomeMatchesCount(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//a[contains(text(),'My Home')]")
	private WebElement my_home;
	public WebElement getMy_home() {
		return my_home;
	}

	@FindBy(id="lmtabcnt")
	private WebElement latestmatches_count;
	public WebElement getLatestmatches_count() {
		return latestmatches_count;
	}
	
	
	@FindBy(id="lmtab")
	private WebElement latest_Matches_tab;
	public WebElement getLatest_Matches_tab() {
		return latest_Matches_tab;
	}
	
	@FindBy(id="ytbtabcnt")
	private WebElement yetTobe_Count;
	public WebElement getYetTobe_Count() {
		return yetTobe_Count;
	}

	@FindBy(id="ytbtab")
	private WebElement yetTobe_tab;
	public WebElement getYetTobe_tab() {
		return yetTobe_tab;
	}
	
	
	@FindBy(id="rcutabcnt")
	private WebElement recently_updated_count;
	public WebElement getRecently_updated_count() {
		return recently_updated_count;
	}
	
	@FindBy(id="rcutab")
	private WebElement recentlyUpdated_tab;
	public WebElement getRecentlyUpdated_tab() {
		return recentlyUpdated_tab;
	}
	
	@FindBy(id="vbtntabcnt")
	private WebElement view_not_contct_count;
	public WebElement getView_not_contct_count() {
		return view_not_contct_count;
	}
	
	
	@FindBy(id="vbtntab")
	private WebElement view_not_contct_tab;
	public WebElement getView_not_contct_tab() {
		return view_not_contct_tab;
	}
	
	
    @FindBy(id="vymntabcnt")
    private WebElement viewed_mble_no_count;
	public WebElement getViewed_mble_no_count() {
		return viewed_mble_no_count;
	}
	
	@FindBy(id="vymntab")
	private WebElement viewed_mble_no_tab;
	public WebElement getViewed_mble_no_tab() {
		return viewed_mble_no_tab;
	}
	
	@FindBy(id="withphotoOpt")
	private WebElement show_Profile_with_photo;
	public WebElement getShow_Profile_with_photo() {
		return show_Profile_with_photo;
	}
	
	@FindBy(id="alreadyContOpt")
	private WebElement dont_show_already_contacted;
	public WebElement getDont_show_already_contacted() {
		return dont_show_already_contacted;
	}
	
	
	@FindBy(id="alreadyContOpt")
	private WebElement dont_show_already_viewed;
	public WebElement getDont_show_already_viewed() {
		return dont_show_already_viewed;
	}
	
	
	@FindBy(id="showall")
	private WebElement show_all;
	public WebElement getShow_all() {
		return show_all;
	}
	
	@FindBy(id="tabsubmit")
	private WebElement submit;
	public WebElement getSubmit() {
		return submit;
	}
	
	
	@FindBy(id="viewall")
	private WebElement view_all;
	public WebElement getView_all() {
		return view_all;
	}
	
	@FindBy(id="total_div")
	private WebElement verfy_count;
	public WebElement getVerfy_count() {
		return verfy_count;
	}
	
	
	
}
