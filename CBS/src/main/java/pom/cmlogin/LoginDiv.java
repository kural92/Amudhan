package pom.cmlogin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseTest;


public class LoginDiv extends BaseTest{
	WebDriver driver;
	public LoginDiv(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
     
	
	@FindBy(xpath="//*[@id=\"a12\"]")
	private WebElement DmatriID;
	public WebElement getDmatriID() {
		return DmatriID;
	}
	
	@FindBy(id="passwordClear1")
	private WebElement DpassWordclr1;
	public WebElement getDpassWordclr1() {
		return DpassWordclr1;
	}
	
	@FindBy(xpath="//*[@id=\"password1\"]")
	private WebElement Dpassword;
	public WebElement getDpassword() {
		return Dpassword;
	}
	
	@FindBy(xpath="//*[@id=\"login_form_web\"]/div[2]/input[3]")
	private WebElement Dlogin;
	public WebElement getDlogin() {
		return Dlogin;
	}
	
	@FindBy(xpath="//*[@id=\"special_offer_lightpic1\"]/div[1]/div/a/img")
	private WebElement DaddsPop;
	public WebElement getDaddsPop() {
		return DaddsPop;
	}
	
}
