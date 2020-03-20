package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Base;
import com.gargoylesoftware.htmlunit.Page;

public class InterestPendingBanner extends Base{
	
	public InterestPendingBanner(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
		
	}
	
	
	@FindBy(xpath="//a[contains(text(),'My Home')]")
	private WebElement my_home;
	public WebElement getMy_home() {
		return my_home;
	}
	
	@FindBy(xpath="//div[contains(text(),'Interest Pending')]")
	private WebElement intrest_pending_banner;
	public WebElement getIntrest_pending_banner() {
		return intrest_pending_banner;
	}
	
	
	@FindBy(id="apt_name")
	private WebElement intrest_pend_name;
	public WebElement getIntrest_pend_name() {
		return intrest_pend_name;
	}
	
	@FindBy(id="apt_det")
	private WebElement intrest_pend_descrption;
	public WebElement getIntrest_pend_descrption() {
		return intrest_pend_descrption;
	}
	
	@FindBy(id="apt_sendapt")
	private WebElement intrest_accept_yes_btn;
	public WebElement getIntrest_accept_yes_btn() {
		return intrest_accept_yes_btn;
	}
	
	@FindBy(id="apt_senddec")
	private WebElement intrest_decline_no_btn;
	public WebElement getIntrest_decline_no_btn() {
		return intrest_decline_no_btn;
	}
	
	@FindBy(xpath="//a[@class=\"txt-center disblk font14 clr6\"]")
	private WebElement view_all_btn;
	public WebElement getView_all_btn() {
		return view_all_btn;
	}
	
	@FindBy(id="user_photo_apt")
	private WebElement photo_request_view_btn;
	public WebElement getPhoto_request_view_btn() {
		return photo_request_view_btn;
	}
	
	
	

}
