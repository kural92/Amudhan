package com.wcsm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WhoCanSeeMe {
	
	WebDriver driver;
	public WebDriver getDriver() {
		return driver;
	}
	
	long timeOutInSeconds = 30000;
	public long getTimeOutInSeconds() {
		return timeOutInSeconds;
	}
	
	public WhoCanSeeMe(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	//  DropDown
	@FindBy(id="wcsmAgeFrom")
	private WebElement wcsm_ageFrom;	
	public WebElement getWcsm_ageFrom(WebDriverWait wait, WebElement element) {
		wait = new WebDriverWait(driver, timeOutInSeconds);
		wait.until(ExpectedConditions.visibilityOf(element));	
		return wcsm_ageFrom;
	}

	public WebElement getWcsm_ageFrom() {
		return wcsm_ageFrom;
	}
	

	// Drop DOwn
	@FindBy(id="wcsmAgeTo")
	private WebElement wcsm_ageTo;
	public WebElement getWcsm_ageTo() {
		return wcsm_ageTo;
	}

	
	//unmarried - CheckBox
	@FindBy(id="wcsmMaritalStatus1")
	private WebElement wcsm_unmarried;	
	public WebElement getWcsm_unmarried() {
		return wcsm_unmarried;
	}
	
	// Widow - CheckBox
	@FindBy(id="wcsmMaritalStatus2")
	private WebElement wcsm_widow;
	public WebElement getWcsm_widow() {
		return wcsm_widow;
	}
	
	//Divorceed - CheckBox
	@FindBy(id="wcsmMaritalStatus3")
	private WebElement wcsm_Divorcee;
	public WebElement getWcsm_Divorcee() {
		return wcsm_Divorcee;
	}
	
	// Sepearted - CheckBox
	@FindBy(id="wcsmMaritalStatus4")
	private WebElement wcsm_Seperated1;
	public WebElement getWcsm_Seperated1() {
		return wcsm_Seperated1;
	}
	
	// Doesnot Mter - CheckBox
	@FindBy(id="wcsmMaritalStatus0")
	private WebElement wcsm_DoesntMater;
	public WebElement getWcsm_DoesntMater() {
		return wcsm_DoesntMater;
	}
	
	// Children - DropDown
	@FindBy(id="wcsmHaveChildren")
	private WebElement wcsm_chidren;
	public WebElement getWcsm_chidren() {
		return wcsm_chidren;
	}
	
	//  Education - DropDown
	@FindBy(id="wcsmEducation")
	private WebElement wcsm_education;
	public WebElement getWcsm_education() {
		return wcsm_education;
	}
	
	
	// ANual INcome From -  DropDown
	@FindBy(id="wcsmAnnualIncomeFrom")
	private WebElement wcsm_IncomeFrom;
	public WebElement getWcsm_IncomeFrom() {
		return wcsm_IncomeFrom;
	}
	
	// Annual Income To - DropDown
	@FindBy(id="wcsmAnnualIncomeTo")
	private WebElement wcsm_IncomeTo;	
	public WebElement getWcsm_IncomeTo() {
		return wcsm_IncomeTo;
	}
	
	// More Prefence Button 
	
	@FindBy(xpath="//div[contains(text(),'More Preferences')]")
	private WebElement wcsm_morePreference;
	public WebElement getWcsm_morePreference() {
		return wcsm_morePreference;
	}

	// Less Prefence Button 
	@FindBy(xpath="//div[contains(text(),'Less Preferences')]")
	private WebElement wcsm_lessPreference;
	public WebElement getWcsm_lessPreference() {
		return wcsm_lessPreference;
	}
	
	
	// HeightFrom - Drop Dwon wcsmHeightFrom
	@FindBy(id="wcsmHeightFrom")
	private WebElement wcsm_heightFrom;
	public WebElement getWcsm_heightFrom() {
		return wcsm_heightFrom;
	}
	
	// Height To- Drop Dwon wcsmHeightFrom
		@FindBy(id="wcsmHeightTo")
		private WebElement wcsm_heightTo;
		public WebElement getWcsm_heightTo() {
			return wcsm_heightTo;
		}
	
	// Physical Status -  Drop Down
		@FindBy(id="wcsmPhysicalStatus")
		private WebElement wcsm_physicalStatus;
		public WebElement getWcsm_physicalStatus() {
			return wcsm_physicalStatus;
		}
		
		
		//  Mother Tongue - DropDown
		@FindBy(id="wcsmMotherTongue")
		private WebElement wcsm_motherTongue;
		public WebElement getWcsm_motherTongue() {
			return wcsm_motherTongue;
		}
		
		
		// Religion - DropDown
		@FindBy(id="wcsmReligion")
		private WebElement wcsm_Religion;
		public WebElement getWcsm_Religion() {
			return wcsm_Religion;
		}
		
		// SubCAste - DropDown
				@FindBy(id="wcsmSubCaste")
				private WebElement wcsm_subCaste;
				public WebElement getWcsm_subCaste() {
					return wcsm_subCaste;
				}
				
	  //STar - DropDown
				@FindBy(id="wcsmStar")
				private WebElement wcsm_star;
				public WebElement getWcsm_star() {
					return wcsm_star;
				}
				
				
	// Dosham -  DropDown
				@FindBy(id="wcsmManglik")
				private WebElement wcsm_dosham;
				public WebElement getWcsm_dosham() {
					return wcsm_dosham;
				}
				
	// Occupation -  DropDown
				@FindBy(id="wcsmOccupation")
				private WebElement wcsm_Occupation;
				public WebElement getWcsm_Occupation() {
					return wcsm_Occupation;
				}	
		
	// Location -  DropDown
				@FindBy(id="wcsmCountry")
				private WebElement wcsm_country;				
				public WebElement getWcsm_country() {
					return wcsm_country;
				}

	// STate -  DropDown
				@FindBy(id="wcsmState")
				private WebElement wcsm_state;			
				public WebElement getWcsm_state() {
					return wcsm_state;
				}

 // City -  DropDown
				@FindBy(id="wcsmDistrict")
				private WebElement wcsm_city;
				public WebElement getWcsm_city() {
					return wcsm_city;
				}

	// Citizen -  DropDown
				@FindBy(id="wcsmCitizenship")
				private WebElement wcsm_citizen;
				public WebElement getWcsm_citizen() {
					return wcsm_citizen;
				}
				
				// Eating -  DropDown
				@FindBy(id="wcsmEating")
				private WebElement wcsm_eatHabit;
				public WebElement getWcsm_eatHabit() {
					return wcsm_eatHabit;
				}

				// Drinking -  DropDown
				@FindBy(id="wcsmDrinking")
				private WebElement wcsm_DrinkHabit;
				public WebElement getWcsm_DrinkHabit() {
					return wcsm_DrinkHabit;
				}


				// Smoking -  DropDown
				@FindBy(id="wcsmSmoking")
				private WebElement wcsm_smokHabit;
				public WebElement getWcsm_smokHabit() {
					return wcsm_smokHabit;
				}
				
				// Done Button
				@FindBy(id="wcsmbtn")
				private WebElement wcsm_Done;
				public WebElement getWcsm_Done() {
					return wcsm_Done;
				}
				
				
				// Done Buttons
				@FindBy(id="wcsmSubmit")
				private WebElement wcsm_Done1;
				public WebElement getWcsm_Done1() {
					return wcsm_Done1;
				}
}