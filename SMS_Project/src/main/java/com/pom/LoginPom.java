package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Base;

public class LoginPom extends Base{
	
	
	public LoginPom(WebDriver driver) {
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
	
	
	

}
