package pom.cmlogin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseTest;

public class SprintPomPwa extends BaseTest{
	
	
	public SprintPomPwa(WebDriver driver) {

  
		 PageFactory.initElements(driver, this);
		
		
		
	}
	
	@FindBy(xpath="//a[contains(text(),'Log in')]")
	private WebElement login_page_btn;
	public WebElement getLogin_page_btn() {
		return login_page_btn;
	}

	@FindBy(xpath="/html/body/ion-app/ng-component/page-login/ion-content/div[2]/div[2]/form/ion-list[1]/ion-item/div[1]/div/ion-input/div")
	private WebElement matri_id;
	public WebElement getMatri_id() {
		return matri_id;
	}
	
	
	@FindBy(css="body > ion-app > ng-component > page-login > ion-content > div.scroll-content > div.loginType > form > ion-list.posrelative.list.list-md > ion-item > div.item-inner > div > ion-input > div")
	private WebElement password;
	public WebElement getPassword() {
		return password;
	}
	
	@FindBy(xpath="//span[contains(text(),'LogIn')]")
	private WebElement login_btn;
	public WebElement getLogin_btn() {
		return login_btn;
	}
	
	@FindBy(css="body > ion-app > ng-component > page-intermediatesegment > ion-content > div.scroll-content > span")
	private WebElement intermediate_close;
	public WebElement getIntermediate_close() {
		return intermediate_close;
	}
	
	@FindBy(xpath="//ion-nav[not(@hidden)]//following::span[@class='ficon icon-menu']")
	private WebElement menu_btn;
	public WebElement getMenu_btn() {
		return menu_btn;
	}

	@FindBy(xpath="//span[contains(text(),'Dashboard')]")
	private WebElement Dashboard;
	public WebElement getDashboard() {
		return Dashboard;
	}
	
	@FindBy(xpath="(//span[contains(text(),'MATCHES')])[1]")
	private WebElement MATCHES;
	public WebElement getMATCHES() {
		return MATCHES;
	}
	
	
	@FindBy(xpath="//span[contains(text(),'LATEST MATCHES')]")
	private WebElement LATEST_MATCHES;
	public WebElement getLATEST_MATCHES() {
		return LATEST_MATCHES;
	}
	
	
	@FindBy(xpath="//span[contains(text(),'VIEWED NOT CONTACTED')]")
	private WebElement VIEWED_NOT_CONTACTED;
	public WebElement getVIEWED_NOT_CONTACTED() {
		return VIEWED_NOT_CONTACTED;
	}
	
	@FindBy(xpath="(//span[contains(text(),'SHORTLISTED')])[1]")
	private WebElement SHORTLISTED;
	public WebElement getSHORTLISTED() {
		return SHORTLISTED;
	}
	
	@FindBy(xpath="//span[contains(text(),'PREMIUM MATCHES')]")
	private WebElement PREMIUM_MATCHES;
	public WebElement getPREMIUM_MATCHES() {
		return PREMIUM_MATCHES;
	}
	
	@FindBy(xpath="//span[contains(text(),'MUTUAL MATCHES')]")
	private WebElement MUTUAL_MATCHES;
	public WebElement getMUTUAL_MATCHES() {
		return MUTUAL_MATCHES;
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
	
	
	@FindBy(xpath="//span[contains(text(),'NEARBY MATCHES')]")
		private WebElement NEARBY_MATCHES;
		public WebElement getNEARBY_MATCHES() {
			return NEARBY_MATCHES;
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
		
		
		@FindBy(xpath="//ion-row[@class='row']//following::ion-grid[@class='list_item grid']")
		private WebElement discover_matches_profile_count;
		public WebElement getDiscover_matches_profile_count() {
			return discover_matches_profile_count;
		}
		
		
		
		@FindBy(css="#mainsidemenu > div > ion-content > div.scroll-content > ion-grid > ion-row > ion-col > ion-list:nth-child(4) > ion-item > div.item-inner > div > ion-label")
		private WebElement edit_profile;
		public WebElement getEdit_profile() {
			return edit_profile;
		}
		
		
		
		@FindBy(id="menu-active")
		private WebElement matches;
		public WebElement getMatches() {
			return matches;
		}
		
		
		
		
}
