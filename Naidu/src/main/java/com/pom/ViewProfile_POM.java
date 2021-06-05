package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ViewProfile_POM {
	
	public ViewProfile_POM(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[contains(text(),'Profile Created For')]//following::span[2]")
	private WebElement VP_Profile_Created;
	public WebElement getVP_Profile_Created() {
		return VP_Profile_Created;
	}
	
	@FindBy(xpath="//span[contains(text(),'Name')]//following::span[3]")
	private WebElement VP_Name;
	public WebElement getVP_Name() {
		return VP_Name;
	}
	
	@FindBy(xpath="//span[contains(text(),'Age')]//following::span[2]")
	private WebElement VP_Age;
	public WebElement getVP_Age() {
		return VP_Age;
	}

	
	@FindBy(xpath="//span[contains(text(),'Height')]//following::span[2]")
	private WebElement VP_Height;
	public WebElement getVP_Height() {
		return VP_Height;
	}
	
	@FindBy(xpath="//span[contains(text(),'Weight')]//following::span[2]")
	private WebElement VP_Weight;
	public WebElement getVP_Weight() {
		return VP_Weight;
	}
	
	@FindBy(xpath="//span[contains(text(),'Gender')]//following::span[2]")
	private WebElement VP_Gender;
	public WebElement getVP_Gender() {
		return VP_Gender;
	}
	
	@FindBy(xpath="//span[contains(text(),'Marital Status')]//following::span[2]")
	private WebElement VP_Marital_Status;
	public WebElement getVP_Marital_Status() {
		return VP_Marital_Status;
	}
	
	
	@FindBy(xpath="//span[contains(text(),'Mother Tongue')]//following::span[2]")
	private WebElement VP_MotherTongue;
	public WebElement getVP_MotherTongue() {
		return VP_MotherTongue;
	}
	
	
	@FindBy(xpath="//span[contains(text(),'Physical Status')]//following::span[2]")
	private WebElement VP_Physical_Status;
	public WebElement getVP_Physical_Status() {
		return VP_Physical_Status;
	}
	
	@FindBy(xpath="//span[contains(text(),'Body Type')]//following::span[2]")
	private WebElement VP_BodyType;
	public WebElement getVP_BodyType() {
		return VP_BodyType;
	}
	
	@FindBy(xpath="//span[contains(text(),'Complexion')]//following::span[2]")
	private WebElement VP_Complexion;
	public WebElement getVP_Complexion() {
		return VP_Complexion;
	}
	
	@FindBy(xpath="//span[contains(text(),'Languages Known')]//following::span[2]")
	private WebElement VP_Language_Known;
	public WebElement getVP_Language_Known() {
		return VP_Language_Known;
	}
	
	@FindBy(xpath="//span[contains(text(),'Subcaste')]//following::span[2]")
	private WebElement VP_SubCaste;
	public WebElement getVP_SubCaste() {
		return VP_SubCaste;
	}
	
	@FindBy(xpath="//span[contains(text(),'Religion')]//following::span[2]")
	private WebElement VP_Religion;	
	public WebElement getVP_Religion() {
		return VP_Religion;
	}

	@FindBy(xpath="(//span[contains(text(),'Star')]//following::span[2])[2]")
	private WebElement VP_Star;
	public WebElement getVP_Star() {
		return VP_Star;
	}
	
	@FindBy(xpath="//span[contains(text(),'Raasi')]//following::span[2]")
	private WebElement VP_Raasi;
	public WebElement getVP_Raasi() {
		return VP_Raasi;
	}
	
	@FindBy(xpath="//span[contains(text(),'Gothram')]//following::span[2]")
	private WebElement VP_Gothram;
	public WebElement getVP_Gothram() {
		return VP_Gothram;
	}
	
	@FindBy(xpath="//span[contains(text(),'Suddha Jadhagam')]//following::span[2]")
	private WebElement VP_SudhaJadhgam;
	public WebElement getVP_SudhaJadhgam() {
		return VP_SudhaJadhgam;
	}
	
	@FindBy(xpath="(//span[contains(text(),'Education')]//following::span[2])[2]")
	private WebElement VP_Education;
	public WebElement getVP_Education() {
		return VP_Education;
	}
	
	@FindBy(xpath="//span[contains(text(),'Education Detail')]//following::span[2]")
	private WebElement VP_EducationDetail;
	public WebElement getVP_EducationDetail() {
		return VP_EducationDetail;
	}
	
	@FindBy(xpath="(//span[contains(text(),'Occupation')]//following::span[2])[2]")
	private WebElement VP_Occupation;
	public WebElement getVP_Occupation() {
		return VP_Occupation;
	}
	
	
	@FindBy(xpath="//span[contains(text(),'Employed in')]//following::span[2]")
	private WebElement VP_EmployeedIN;
	public WebElement getVP_EmployeedIN() {
		return VP_EmployeedIN;
	}
	
	
	@FindBy(xpath="(//span[contains(text(),'City')]//following::span[2])[2]")
	private WebElement VP_City;
	public WebElement getVP_City() {
		return VP_City;
	}
	
	@FindBy(xpath="//span[contains(text(),'State')]//following::span[2]")
	private WebElement VP_State;
	public WebElement getVP_State() {
		return VP_State;
	}
	
	
	@FindBy(xpath="//span[contains(text(),'Country')]//following::span[2]")
	private WebElement VP_Country;
	public WebElement getVP_Country() {
		return VP_Country;
	}
	
	@FindBy(xpath="//span[contains(text(),'Citizenship')]//following::span[2]")
	private WebElement VP_Citizenship;
	public WebElement getVP_Citizenship() {
		return VP_Citizenship;
	}
	
	
	@FindBy(xpath="//span[contains(text(),'Chevvai Dosham')]//following::span[2]")
	private WebElement VP_Chevvai_Dosham;
	public WebElement getVP_Chevvai_Dosham() {
		return VP_Chevvai_Dosham;
	}
	
	
	@FindBy(xpath="//span[contains(text(),'Annual Income')]//following::span[2]")
	private WebElement VP_Annual_Income;
	public WebElement getVP_Annual_Income() {
		return VP_Annual_Income;
	}
	
	
	@FindBy(xpath="//span[contains(text(),'Occupation Detail')]//following::span[2]")
	private WebElement VP_OccupationDetail;
	public WebElement getVP_OccupationDetail() {
		return VP_OccupationDetail;
	}
	
	@FindBy(xpath="//input[@value='Edit Partner Preference']")
	private WebElement VP_No_Profile_Found;
	public WebElement getVP_No_Profile_Found() {
		return VP_No_Profile_Found;
	}
	
	
	
	
}
