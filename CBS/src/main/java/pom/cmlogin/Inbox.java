package pom.cmlogin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.gargoylesoftware.htmlunit.javascript.host.media.rtc.webkitRTCPeerConnection;

import base.BaseTest;

public class Inbox extends BaseTest {
	
	
	public Inbox(WebDriver Driver) {
			
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div/form/div[1]/input")
	private WebElement matriID;
	public WebElement getMatriID() {
		return matriID;
	}
	
    @FindBy(id="passwordClear1")
    private WebElement passclr;
	public WebElement getPassclr() {
		return passclr;
	}
	
	@FindBy(id="password1")
	private WebElement password;
	public WebElement getPassword() {
		return password;
	}
	
	@FindBy(xpath="//*[@id=\"topnav-login-menu\"]/div[2]/div[3]/a")
    private WebElement inboxbtn;
	public WebElement getInboxbtn() {
		return inboxbtn;
	}	
	
	@FindBy(id="RMPENDINGINT1")
	private WebElement penInterst;
	public WebElement getPenInterst() {
		return penInterst;
	}
	
	@FindBy(id="acceptdiv0")
	private WebElement acceptinterest;
	public WebElement getAcceptinterest() {
		return acceptinterest;
	}
	
	@FindBy(xpath="(//input[@type='submit'])[1]")
	private WebElement loginbtn;
	public WebElement getLoginbtn() {
		return loginbtn;
	}
}
