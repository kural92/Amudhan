package pom.cmlogin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Prime {

	public Prime() {
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(id="regular")
	private WebElement Regular_Toggle;
	public WebElement getRegular_Toggle() {
		return Regular_Toggle;
	}
	
	
	@FindBy(id="prime")
	private WebElement Prime_Toggle;
	public WebElement getPrime_Toggle() {
		return Prime_Toggle;
	}
	
	
	
	@FindBy(id="choose")
	private WebElement Choose_Document;
	public WebElement getChoose_Document() {
		return Choose_Document;
	}
	
	
	@FindBy(id="identity_upload_file")
	private WebElement Driving_License;
	public WebElement getDriving_License() {
		return Driving_License;
	}
	
	
	@FindBy(id="Pan_label_div")
	private WebElement Pan_Card;
	public WebElement getPan_Card() {
		return Pan_Card;
	}
	
	
	@FindBy(id="Voter_ID_div")
	private WebElement Voter_ID;
	public WebElement getVoter_ID() {
		return Voter_ID;
	}
	
	@FindBy(id="Passport_div")
	private WebElement Passport;
	public WebElement getPassport() {
		return Passport;
	}
	
	
	//@FindBy(xpath = "//a[contains(text(),'Upload Photo')]")
	
	@FindBy(xpath="//a[contains(text(),'Explore prime')]")
	private WebElement Explore_Prime;
	public WebElement getExplore_Prime() {
		return Explore_Prime;
	}
	
	@FindBy(id="total_div")
	private WebElement Profile_Count;
	public WebElement getProfile_Count() {
		return Profile_Count;
	}
	
	
	
	
}
