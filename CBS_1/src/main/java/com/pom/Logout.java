package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Base;

public class Logout extends Base {
	
	public Logout(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
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
	
	
	@FindBy(xpath="//*[@id=\"userpop\"]/div[2]/div/div[3]/div[2]/ul/li[4]/a")
	private WebElement Logout_btn;
	public WebElement getLogout_btn() {
		return Logout_btn;
	}
	

}
