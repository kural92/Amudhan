package Android.PWA;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DiscoverMatch extends BaseTest {
	
	public DiscoverMatch(WebDriver driver) {
		
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
	} // password
	
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
	
	@FindBy(xpath="//span[contains(text(),'PREFERRED STAR')]")
	private WebElement PREFERRED_STAR;
	public WebElement getPREFERRED_STAR() {
		return PREFERRED_STAR;
	}

	@FindBy(xpath="//span[contains(text(),'PREFERRED PROFESSION')]")
	private WebElement PREFERRED_PROFESSION;
	public WebElement getPREFERRED_PROFESSION() {
		return PREFERRED_PROFESSION;
	}
	
	@FindBy(xpath="//span[contains(text(),'PREFERRED EDUCATION')]")
	private WebElement PREFERRED_EDUCATION;
	public WebElement getPREFERRED_EDUCATION() {
		return PREFERRED_EDUCATION;
	}
	
	
	@FindBy(xpath="//span[contains(text(),'PREFERRED LOCATION')]")
	private WebElement PREFERRED_LOCATION;
	public WebElement getPREFERRED_LOCATION() {
		return PREFERRED_LOCATION;
	}
	
	
	@FindBy(xpath="//span[contains(text(),'members match your preferences')]")
	private WebElement discover_matches_count;
	public WebElement getDiscover_matches_count() {
		return discover_matches_count;
	}
	

	@FindBy(id="menusegmentchip")
	private WebElement discover_matches_chip_value;
	public WebElement getDiscover_matches_chip_value() {
		return discover_matches_chip_value;
	}
	
	@FindBy(xpath="//div[contains(text(),'Discover matches based on')]")
	private WebElement Dashboard_discover_matches;
	public WebElement getDashboard_discover_matches() {
		return Dashboard_discover_matches;
	}
	
	
	@FindBy(xpath="//span[contains(text(),'Dashboard')]")
	private WebElement Dashboard;
	public WebElement getDashboard() {
		return Dashboard;
	}
	
	
	@FindBy(xpath="//h2[contains(text(),'Near by')]")
	private WebElement Dashboard_Location;
	public WebElement getDashboard_Location() {
		return Dashboard_Location;
	}
	
	@FindBy(xpath="//h2[contains(text(),'Near by')]//following::p[1]")
	private WebElement Dashboard_Location_count;
	public WebElement getDashboard_Location_count() {
		return Dashboard_Location_count;
	}
	
	@FindBy(xpath="//h2[contains(text(),'Education')]")
	private WebElement Dashboard_education;
	public WebElement getDashboard_education() {
		return Dashboard_education;
	}
	
	@FindBy(xpath="//h2[contains(text(),'Education')]//following::p[1]")
	private WebElement Dashboard_education_count;
	public WebElement getDashboard_education_count() {
		return Dashboard_education_count;
	}
	
	
	@FindBy(xpath="//h2[contains(text(),'Profession')]")
	private WebElement Dashboard_Occupation;
	public WebElement getDashboard_Occupation() {
		return Dashboard_Occupation;
	}
	
	
	@FindBy(xpath="//h2[contains(text(),'Profession')]//following::p[1]")
	private WebElement Dashboard_Occupation_count;
	public WebElement getDashboard_Occupation_count() {
		return Dashboard_Occupation_count;
	}
	
	@FindBy(xpath="//h2[contains(text(),'Star')]")
	private WebElement Dashboard_star;
	public WebElement getDashboard_star() {
		return Dashboard_star;
	}
	
	
	@FindBy(xpath="//h2[contains(text(),'Star')]//following::p[1]")
	private WebElement Dashboard_star_count;
	public WebElement getDashboard_star_count() {
		return Dashboard_star_count;
	}
	
	
	
}
