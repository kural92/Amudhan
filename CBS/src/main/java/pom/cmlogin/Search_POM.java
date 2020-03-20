package pom.cmlogin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseTest;

public class Search_POM extends BaseTest{
	
	
	public Search_POM(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	

	@FindBy(xpath="(//a[contains(text(),'Search')])[1]")
	private WebElement Search_Menu_btn;
	public WebElement getSearch_Menu_btn() {
		return Search_Menu_btn;
	}
	
	@FindBy(xpath="//a[contains(text(),'Regular Search')]")
	private WebElement	Regular_search_Menubtn;
	public WebElement getRegular_search_Menubtn() {
		return Regular_search_Menubtn;
	}
	
	@FindBy(xpath="//a[contains(text(),'Advanced Search')]")
	private WebElement	Advanced_search_Menubtn;
	public WebElement getAdvanced_search_Menubtn() {
		return Advanced_search_Menubtn;
	}
	
	
	@FindBy(xpath="//a[contains(text(),'Keyword Search')]")
	private WebElement	KeyWord_search_Menubtn;
	public WebElement getKeyWord_search_Menubtn() {
		return KeyWord_search_Menubtn;
	}
	
	
	@FindBy(xpath="(//a[contains(text(),'Regular')])[2]")
	private WebElement Regular_Search;
	public WebElement getRegular_Search() {
		return Regular_Search;
	}

	@FindBy(xpath="(//a[contains(text(),'Advanced')])[2]")
	private WebElement Advanced_Search;
	public WebElement getAdvanced_Search() {
		return Advanced_Search;
	}
	
	@FindBy(xpath="(//a[contains(text(),'Keyword Search')])[2]")
	private WebElement Keyword_Search;
	public WebElement getKeyword_Search() {
		return Keyword_Search;
	}
	
	
	@FindBy(xpath="//a[contains(text(),'By Matrimony Id')]")
	private WebElement Search_By_ID;
	public WebElement getSearch_By_ID() {
		return Search_By_ID;
	}

	
	@FindBy(id="ageFrom")
	private WebElement Regular_AgeFrom_DD;
	public WebElement getRegular_AgeFrom_DD() {
		return Regular_AgeFrom_DD;
	}

	@FindBy(id="ageTo")
	private WebElement Regular_AgeTo_DD;
	public WebElement getRegular_AgeTo_DD() {
		return Regular_AgeTo_DD;
	}
	
	@FindBy(id="heightFrom")
	private WebElement Regular_HeightFrom_DD;
	public WebElement getRegular_HeightFrom_DD() {
		return Regular_HeightFrom_DD;
	}
	
	
	@FindBy(id="heightTo")
	private WebElement Regular_HeightTo_DD;
	public WebElement getRegular_HeightTo_DD() {
		return Regular_HeightTo_DD;
	}
	
	
	@FindBy(id="maritalStatus0")
	private WebElement Regular_Marital_Any;
	public WebElement getRegular_Marital_Any() {
		return Regular_Marital_Any;
	}
	
	@FindBy(id="maritalStatus1")
	private WebElement Regular_Marital_Unmarried;
	public WebElement getRegular_Marital_Unmarried() {
		return Regular_Marital_Unmarried;
	}
	
	@FindBy(id="maritalStatus2")
	private WebElement Regular_Marital_Widow;
	public WebElement getRegular_Marital_Widow() {
		return Regular_Marital_Widow;
	}
	
	
	@FindBy(id="maritalStatus3")
	private WebElement Regular_Marital_Divorceed;
	public WebElement getRegular_Marital_Divorceed() {
		return Regular_Marital_Divorceed;
	}
	
	
	@FindBy(id="maritalStatus4")
	private WebElement Regular_Marital_Seperated;
	public WebElement getRegular_Marital_Seperated() {
		return Regular_Marital_Seperated;
	}
	
	@FindBy(id="haveChildren1")
	private WebElement Regular_HaveChild_No;
	public WebElement getRegular_HaveChild_No() {
		return Regular_HaveChild_No;
	}
	
	@FindBy(id="haveChildren2")
	private WebElement Regular_HaveChild_YesLiving;
	public WebElement getRegular_HaveChild_YesLiving() {
		return Regular_HaveChild_YesLiving;
	}
	
	@FindBy(id="haveChildren3")
	private WebElement Regular_HaveChild_Yes_Not_Living;
	public WebElement getRegular_HaveChild_Yes_Not_Living() {
		return Regular_HaveChild_Yes_Not_Living;
	}
	
	@FindBy(id="haveChildren")
	private WebElement Regular_HaveChild__Doesnt;
	public WebElement getRegular_HaveChild__Doesnt() {
		return Regular_HaveChild__Doesnt;
	}
	
	
	@FindBy(id="subcasteTemp")
	private WebElement Regular_Subcaste_Value;
	public WebElement getRegular_Subcaste_Value() {
		return Regular_Subcaste_Value;
	}
	
	
	@FindBy(id="subcaste")
	private WebElement Regular_Subcaste_Choosed;
	public WebElement getRegular_Subcaste_Choosed() {
		return Regular_Subcaste_Choosed;
	}
	
	@FindBy(id="motherTongueTemp")
	private WebElement Regular_MOtherTongue_Value;
	public WebElement getRegular_MOtherTongue_Value() {
		return Regular_MOtherTongue_Value;
	}
	
	
	@FindBy(id="motherTongue")
	private WebElement Regular_MOtherTongue_Choosed;
	public WebElement getRegular_MOtherTongue_Choosed() {
		return Regular_MOtherTongue_Choosed;
	}
	
	
	
	
	
}
