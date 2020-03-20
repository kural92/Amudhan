package Android.PWA;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChangePassPom extends BaseTest {
	
	public ChangePassPom(WebDriver driver) {
		
	PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//*[@text='LOG IN']")//*[@text='LOG IN']
	private WebElement loginbutton;
	public WebElement getLoginbutton() {
		return loginbutton;
	}
	
	@FindBy(id="idEmail")
	private WebElement matriid;
	public WebElement getMatriid() {
		return matriid;
	}
	
	@FindBy(id="password1")
	private WebElement password;
	public WebElement getPassword() {
		return password;
	}
	
	@FindBy(id="login-button")
	private WebElement loginbtn;
	public WebElement getLoginbtn() {
		return loginbtn;
	}
	
	@FindBy(css="body > ion-app > ng-component > page-dashboard > ion-header > header > ion-navbar > div.toolbar-content.toolbar-content-md > ion-grid > ion-row > ion-col:nth-child(5)")
	private WebElement menubtn;
	public WebElement getMenubtn() {
		return menubtn;
	}
	
	@FindBy(css="#mainsidemenu > div > ion-content > div.scroll-content > ion-grid > ion-row > ion-col > ion-list:nth-child(7) > ion-item > div.item-inner > div > ion-label")
	private WebElement menu_settings;
	public WebElement getMenu_settings() {
		return menu_settings;
	}
	
	
	@FindBy(css="body > ion-app > ion-modal > div > settingpopup > ion-content > div.scroll-content > ion-grid > ion-row > ion-col > ion-list > ion-item:nth-child(4) > div.item-inner > div > ion-label")
	private WebElement chage_password;
	public WebElement getChage_password() {
		return chage_password;
	}
	
	
	@FindBy(css="body > ion-app > ng-component > page-changepassword > ion-content > div.scroll-content > div > form > ion-item:nth-child(1) > div.item-inner > div > ion-input > div")
	private WebElement old_password;
	public WebElement getOld_password() {
		return old_password;
	}
	
	@FindBy(css="body > ion-app > ng-component > page-changepassword > ion-content > div.scroll-content > div > form > ion-item:nth-child(2) > div.item-inner > div > ion-input > div")
	private WebElement new_password;
	public WebElement getNew_password() {
		return new_password;
	}
	
	
	@FindBy(css="body > ion-app > ng-component > page-changepassword > ion-content > div.scroll-content > div > form > ion-item:nth-child(3) > div.item-inner > div > ion-input > input")
	private WebElement confirm_password;
	public WebElement getConfirm_password() {
		return confirm_password;
	}
	
	@FindBy(css="body > ion-app > ng-component > page-changepassword > ion-content > div.scroll-content > div > form > ion-grid > ion-row:nth-child(1) > ion-col > button > span")
	private WebElement pass_submit;
	public WebElement getPass_submit() {
		return pass_submit;
	}
	
	

}
