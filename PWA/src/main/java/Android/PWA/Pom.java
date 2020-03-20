package Android.PWA;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Pom extends BaseTest{
	//WebDriver driver;
	//public Pom(AndroidDriver driver) {
		
	//}
	public Pom(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//*[@text='LOG IN']")//*[@text='LOG IN']
	private WebElement loginbutton;
	public WebElement getLoginbutton() {
		return loginbutton;
	}
	
	@FindBy(xpath="//*[@name='idEmail']")
	private WebElement matriid;
	public WebElement getMatriid() {
		return matriid;
	}
	
	@FindBy(xpath="//*[@name='password1']")
	private WebElement password;
	public WebElement getPassword() {
		return password;
	}
	
	@FindBy(xpath="//*[@name='loginsubmit']")
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
	private WebElement settinglog;
	public WebElement getSettinglog() {
		return settinglog;
	}
	
	@FindBy(css="body > ion-app > ion-modal > div > settingpopup > ion-content > div.scroll-content > ion-grid > ion-row > ion-col > ion-list > ion-item:nth-child(5) > div.item-inner > div > ion-label")
	private WebElement logout;
	public WebElement getLogout() {
		return logout;
	}
	
	
	
	
	//Clearing Browser History POM   ********************************************************************\\
	
	
	@FindBy(xpath="//*[@id='menu_button']")
	private WebElement browsermenu;
	public WebElement getBrowsermenu() {
		return browsermenu;
	}
	
	@FindBy(xpath="//*[@text='History']")
	private WebElement history;
	public WebElement getHistory() {
		return history;
	}
	
	
	@FindBy(xpath="//*[@text='Clear browsing data…']")
	private WebElement clear_browser_history;
	public WebElement getClear_browser_history() {
		return clear_browser_history;
	}
	
	@FindBy(xpath="//*[@text='Clear data' and (./preceding-sibling::* | ./following-sibling::*)[./*[./*[./*[@text='Clears history and autocompletions in the address bar.']]]]]")
	private WebElement clear_data;
	public WebElement getClear_data() {
		return clear_data;
	}
	
	@FindBy(xpath="//*[@text='Clear']")
	private WebElement clear_confirm;
	public WebElement getClear_confirm() {
		return clear_confirm;
	}
	
	@FindBy(xpath="//*[@id='close_menu_id']")
	private WebElement close_history;
	public WebElement getClose_history() {
		return close_history;
	}
	
	//***************************************_______________________________********************************//
	
	
	//Payment Pom*********************************_________________________________***************\\
	
	
	@FindBy(css="#mainsidemenu > div > ion-content > div.scroll-content > ion-grid > ion-row > ion-col > ion-list:nth-child(6) > ion-item > div.item-inner > div > ion-label > span > span:nth-child(2)")
	private WebElement upgrade_now;
	public WebElement getUpgrade_now() {
		return upgrade_now;
	}
	
	@FindBy(xpath="//*[@id='gold6months' and @name='radio-choice-g']")
	private WebElement memebrship_6month_pack;
	public WebElement getMemebrship_6month_pack() {
		return memebrship_6month_pack;
	}
	
	@FindBy(css="body > div > div.gmg_chat_head > div")
	private WebElement hide_chat;
	public WebElement getHide_chat() {
		return hide_chat;
	}
	
	@FindBy(xpath="//*[@id='tillumarryd' and @name='radio-choice-d']")
	private WebElement till_u_marry_pack;
	public WebElement getTill_u_marry_pack() {
		return till_u_marry_pack;
	}
	
	@FindBy(xpath="//*[@id='diamond3months' and @name='radio-choice-d']")
	private WebElement  memebrship_3month_pack;
	public WebElement getMemebrship_3month_pack() {
		return memebrship_3month_pack;
	}
	
	@FindBy(id="newuipaynowurl")
	private WebElement pay_now_btn;
	public WebElement getPay_now_btn() {
		return pay_now_btn;
	}
	
	@FindBy(id="credit-debit-link1")
	private WebElement debit_credit_card;
	public WebElement getDebit_credit_card() {
		return debit_credit_card;
	}
	
	@FindBy(id="vpc_CardNum")
	private WebElement enter_card_number;
	public WebElement getEnter_card_number() {
		return enter_card_number;
	}
	
	@FindBy(id="cardExpiryMonthDisplay")
	private WebElement enter_expiry_date;
	public WebElement getEnter_expiry_date() {
		return enter_expiry_date;
	}
	
	@FindBy(id="cardExpiryYear")
	private WebElement enter_expiry_month;
	public WebElement getEnter_expiry_month() {
		return enter_expiry_month;
	}
	
	@FindBy(css="body > div.ui-popup-container.ui-popup-active > div > ul.mobipick-buttons > li:nth-child(1) > a")
	private WebElement month_setter;
	public WebElement getMonth_setter() {
		return month_setter;
	}
	
	@FindBy(id="vpc_CardSecurityCode")
	private WebElement cvv;
	public WebElement getCvv() {
		return cvv;
	}
	
	@FindBy(id="debit-card-submit")
	private WebElement pay_amount;
	public WebElement getPay_amount() {
		return pay_amount;
	}
	
	@FindBy(xpath="//*[@id='infobar_close_button']")
	private WebElement card_save_close;
	public WebElement getCard_save_close() {
		return card_save_close;
	}
	
	@FindBy(xpath="//*[@value='Retry payment']")
	private WebElement retry_payment;
	public WebElement getRetry_payment() {
		return retry_payment;
	}
	
	@FindBy(xpath="//*[@text='Credit Card ']")
	private WebElement repay_credit_card;
	public WebElement getRepay_credit_card() {
		return repay_credit_card;
	}
	
	@FindBy(xpath="//*[@text='Debit Card ']")
	private WebElement repay_dedit_card;
	public WebElement getRepay_dedit_card() {
		return repay_dedit_card;
	}
	
	@FindBy(xpath="//*[@text='Net Banking ']")
	private WebElement repay_netBanking;
	public WebElement getRepay_netBanking() {
		return repay_netBanking;
	}
	
	//****************************************************************************//
	
	//RegisterPom*************************************___________________________********************??
	
	
	@FindBy(xpath="//*[@nodeName='DIV' and @width>0 and ./*[@id='COMMUNITY']]")
	private WebElement choose_community;
	public WebElement getChoose_community() {
		return choose_community;
	}
	
	@FindBy(xpath="//*[@text='AgarwalMatrimony.com']")
	private WebElement community_agarwal;
	public WebElement getCommunity_agarwal() {
		return community_agarwal;
	}
	@FindBy(xpath="//*[@nodeName='SPAN' and ./*[@text='Self']]")
	private WebElement self;
	public WebElement getSelf() {
		return self;
	}
	
	
	@FindBy(xpath="//*[@nodeName='SPAN' and ./*[@text='Parents']]")
	private WebElement parents;
	public WebElement getParents() {
		return parents;
	}

	@FindBy(xpath="//*[@nodeName='SPAN' and ./*[@text='Sibling']]")
	private WebElement siblings;
	public WebElement getSiblings() {
		return siblings;
	}
	
	@FindBy(xpath="//*[@nodeName='SPAN' and ./*[@text='Relative']]")
	private WebElement Relative;
	public WebElement getRelative() {
		return Relative;
	}
	
	@FindBy(xpath="//*[@nodeName='SPAN' and ./*[@text='Friend']]")
	private WebElement Friend;
	public WebElement getFriend() {
		return Friend;
	}
	
	@FindBy(xpath="//*[@name='USERNAME']")
	private WebElement NAME;
	public WebElement getNAME() {
		return NAME;
	}
	
	@FindBy(xpath="//*[@nodeName='SPAN' and ./*[@text='Male']]")
	private WebElement Male;
	public WebElement getMale() {
		return Male;
	}
	
	@FindBy(xpath="//*[@nodeName='SPAN' and ./*[@text='Female']]")
	private WebElement Female;
	public WebElement getFemale() {
		return Female;
	}
	
	@FindBy(xpath="//*[@nodeName='DIV' and @width>0 and ./*[@id='dobspan']]")	
	private WebElement dob;
	public WebElement getDob() {
		return dob;
	}
	
	@FindBy(xpath="//*[@id='dw_set' and @nodeName='A']")
	private WebElement set_dob;
	public WebElement getSet_dob() {
		return set_dob;
	}
	
	@FindBy(xpath="//*[@name='PASSWORD']")
	private WebElement reg_password;
	public WebElement getReg_password() {
		return reg_password;
	}
	
	@FindBy(xpath="//*[@name='ISDCode']")
	private WebElement country_code;
	public WebElement getCountry_code() {
		return country_code;
	}
	
	@FindBy(xpath="(//*[@nodeName='UL']/*[@value='222'])[1]")
	private WebElement country_code_usa;
	public WebElement getCountry_code_usa() {
		return country_code_usa;
	}
	
	@FindBy(xpath="//*[@name='CONTACTNO']")
	private WebElement mobile_number_reg;
	public WebElement getMobile_number_reg() {
		return mobile_number_reg;
	}
	
	@FindBy(xpath="//*[@nodeName='DIV' and @width>0 and ./*[@id='MOTHERTONGUE']]")
	private WebElement mother_tongue;
	public WebElement getMother_tongue() {
		return mother_tongue;
	}
	
	@FindBy(xpath="//*[@value='Select Mother Tongue']")
	private WebElement mother_tongue_type;
	public WebElement getMother_tongue_type() {
		return mother_tongue_type;
	}
	
	@FindBy(xpath="(//*[@nodeName='UL']/*[@text='Bengali' and @value='4'])[1]")
	private WebElement mother_tongue_bengali;
	
	public WebElement getMother_tongue_bengali() {
		return mother_tongue_bengali;
	}
	@FindBy(xpath="//*[@name='form1']")
	private WebElement reg_continue;
	public WebElement getReg_continue() {
		return reg_continue;
	}
	
	@FindBy(xpath="//*[@name='RELIGION']")
	private WebElement releigion;
	public WebElement getReleigion() {
		return releigion;
	}
	
	@FindBy(xpath="//*[@text='Hindu' and @value='1']")
	private WebElement hindu_reg;
	public WebElement getHindu_reg() {
		return hindu_reg;
	}
	
	@FindBy(xpath="//*[@text='Jain' and @value='5']")
	private WebElement jain_reg;
	public WebElement getJain_reg() {
		return jain_reg;
	}
	
	@FindBy(xpath="//*[@name='SUBCASTE']")
	private WebElement subcaste_reg;
	public WebElement getSubcaste_reg() {
		return subcaste_reg;
	}
	
	@FindBy(xpath="//*[@value='2268']")
	private WebElement subcaste_bisa_reg;
	public WebElement getSubcaste_bisa_reg() {
		return subcaste_bisa_reg;
	}
	
	
	@FindBy(xpath="//*[@value='1011']")
	private WebElement subcaste_poddar_reg;
	public WebElement getSubcaste_poddar_reg() {
		return subcaste_poddar_reg;
	}
	
	@FindBy(xpath="//*[@value='9997']")
	private WebElement subcaste_others_reg;
	public WebElement getSubcaste_others_reg() {
		return subcaste_others_reg;
	}
	
	
	//*******************************************Registerayion Page 2**************************************
	
	
	@FindBy(xpath="//*[@nodeName='SPAN' and ./*[@text='Unmarried']]")
	private WebElement reg_unmarried;
	public WebElement getReg_unmarried() {
		return reg_unmarried;
	}
	
	@FindBy(xpath="//*[@nodeName='SPAN' and ./*[@text='Widow / Widower']]")
	private WebElement reg_Widow;
	public WebElement getReg_Widow() {
		return reg_Widow;
	}
	@FindBy(xpath="//*[@nodeName='SPAN' and ./*[@text='Divorced']]")
	private WebElement reg_Divorced;
	public WebElement getReg_Divorced() {
		return reg_Divorced;
	}
	
	@FindBy(xpath="//*[@nodeName='SPAN' and ./*[@text='Separated']]")
	private WebElement reg_Separated;
	public WebElement getReg_Separated() {
		return reg_Separated;
	}
	
	@FindBy(xpath="//*[@name='EMAIL']")
	private WebElement reg_email;
	public WebElement getReg_email() {
		return reg_email;
	}
	
	@FindBy(xpath="//*[@name='COUNTRYLIVING']")
	private WebElement reg_country;
	public WebElement getReg_country() {
		return reg_country;
	}
	
	
	@FindBy(xpath="(//*[@nodeName='UL']/*[@value='98'])[1]")
	private WebElement reg_coubry_india;
	public WebElement getReg_coubry_india() {
		return reg_coubry_india;
	}
	
	@FindBy(xpath="//*[@name='RESIDINGSTATE']")
	private WebElement reg_residing_state;
	public WebElement getReg_residing_state() {
		return reg_residing_state;
	}
	
	
	@FindBy(xpath="//*[@value='10']")
	private WebElement reg_residing_sate_delhi;
	public WebElement getReg_residing_sate_delhi() {
		return reg_residing_sate_delhi;
	}
	
	
	@FindBy(xpath="//*[@name='RESIDINGCITY']")
	private WebElement reg_residing_city;
	public WebElement getReg_residing_city() {
		return reg_residing_city;
	}
	
	
	@FindBy(xpath="//*[@value='949']")
	private WebElement reg_residingcity_guargon;
	public WebElement getReg_residingcity_guargon() {
		return reg_residingcity_guargon;
	}
	
	
	@FindBy(xpath="//*[@name='fome2']")
	private WebElement regpge2_continue;
	public WebElement getRegpge2_continue() {
		return regpge2_continue;
	}
	
	//*************************************************Registeration Page 3************************************************
	
	
	@FindBy(xpath="//*[@name='HEIGHT']")
	private WebElement reg_height;
	public WebElement getReg_height() {
		return reg_height;
	}
	
	
	@FindBy(xpath="//*[@text='4 ft 2 in / 127 cm' and @nodeName='LI']")
	private WebElement reg_height_4ft;
	public WebElement getReg_height_4ft() {
		return reg_height_4ft;
	}
	
	
	@FindBy(xpath="//*[@text='5 ft 4 in / 162 cm' and @nodeName='LI']")
	private WebElement reg_heigth_5ft4inc;
	public WebElement getReg_heigth_5ft4inc() {
		return reg_heigth_5ft4inc;
	}
	
	
	@FindBy(xpath="//*[@id='dw_set' and @nodeName='A']")
	private WebElement reg_height_set;
	public WebElement getReg_height_set() {
		return reg_height_set;
	}
	
	
	@FindBy(xpath="//*[@nodeName='LABEL' and ./*[@nodeName='SPAN' and ./*[@text='Normal']]]")
	private WebElement reg_physical_normal;
	public WebElement getReg_physical_normal() {
		return reg_physical_normal;
	}
	
	
	@FindBy(xpath="//*[@nodeName='LABEL' and ./*[@nodeName='SPAN' and ./*[@text='Physically Challenged']]]")
	private WebElement reg_physical_chalenged;
	public WebElement getReg_physical_chalenged() {
		return reg_physical_chalenged;
	}
	
	
	@FindBy(xpath="//*[@name='EDUCATION']")
	private WebElement reg_education;
	public WebElement getReg_education() {
		return reg_education;
	}
	
	
	@FindBy(xpath="//*[@value='43']")
	private WebElement reg_education_degree;
	public WebElement getReg_education_degree() {
		return reg_education_degree;
	}
	
	@FindBy(xpath="//*[@nodeName='SPAN' and ./*[@text='Government']]")
	private WebElement reg_government;
	public WebElement getReg_government() {
		return reg_government;
	}
	
	@FindBy(xpath="//*[@nodeName='SPAN' and ./*[@text='Private']]")
	private WebElement reg_private;
	public WebElement getReg_private() {
		return reg_private;
	}
	
	@FindBy(xpath="//*[@name='OCCUPATION']")
	private WebElement reg_occupation;
	public WebElement getReg_occupation() {
		return reg_occupation;
	}
	
	
	@FindBy(xpath="//*[@value='49']")
	private WebElement reg_oc_manager;
	public WebElement getReg_oc_manager() {
		return reg_oc_manager;
	}
	
	
	@FindBy(xpath="//*[@name='INCOMETEXT']")
	private WebElement reg_income;
	public WebElement getReg_income() {
		return reg_income;
	}
	
	@FindBy(xpath="//*[@value='9']")
	private WebElement reg_income_amount;
	public WebElement getReg_income_amount() {
		return reg_income_amount;
	}
	
	
	@FindBy(xpath="//*[@nodeName='SPAN' and ./*[@text='Middle class']]")
	private WebElement reg_family_status;
	public WebElement getReg_family_status() {
		return reg_family_status;
	}
	@FindBy(xpath="//*[@nodeName='SPAN' and ./*[@text='Joint family']]")
	private WebElement reg_familytype;
	public WebElement getReg_familytype() {
		return reg_familytype;
	}
	

	@FindBy(xpath="//*[@nodeName='SPAN' and ./*[@text='Traditional']]")
	private WebElement reg_familyvalues;
	public WebElement getReg_familyvalues() {
		return reg_familyvalues;
	}
	
	@FindBy(xpath="//*[@name='form3']")
	private WebElement regpage3_continue;
	public WebElement getRegpage3_continue() {
		return regpage3_continue;
	}
	
	
	//*******************************************Registeration Page 4 **************************
	
	//*[@name='STAR']
	@FindBy(xpath="//*[@name='STAR']")
	private WebElement regpage4_star;
	public WebElement getRegpage4_star() {
		return regpage4_star;
	}
	
	@FindBy(xpath="//*[@text='Bharani' and @value='2']")
	private WebElement regpage4_star_Baharani;
	public WebElement getRegpage4_star_Baharani() {
		return regpage4_star_Baharani;
	}
	
	@FindBy(xpath="//*[@name='RAASI']")
	private WebElement regpage4_RAASI;
	public WebElement getRegpage4_RAASI() {
		return regpage4_RAASI;
	}
	
	@FindBy(xpath="//*[@value='4']")
	private WebElement regpage4_RAASI_kumbam;
	public WebElement getRegpage4_RAASI_kumbam() {
		return regpage4_RAASI_kumbam;
	}
	
	@FindBy(xpath="//*[@name='GOTHRA_TXT']")
	private WebElement regpage4_Gothra;
	public WebElement getRegpage4_Gothra() {
		return regpage4_Gothra;
	}
	
	@FindBy(xpath="//*[@id='DOSHAM_NO' and @name='DOSHAM']")
	private WebElement regpage4_Dosham_NO;
	public WebElement getRegpage4_Dosham_NO() {
		return regpage4_Dosham_NO;
	}
	
	
	@FindBy(xpath="//*[@name='BIRTHSTATE']")
	private WebElement getRegpage4_Birth_state;
	public WebElement getRegpage4_Birth_state() {
		return getRegpage4_Birth_state;
	}
	
	@FindBy(xpath="//*[@value='10']")
	private WebElement getRegpage4_Birth_stateDelhi;
	public WebElement getGetRegpage4_Birth_stateDelhi() {
		return getRegpage4_Birth_stateDelhi;
	}
	
	
	@FindBy(xpath="//*[@name='BIRTHCITY']")
	private WebElement getRegpage4_Birth_city;
	public WebElement getGetRegpage4_Birth_city() {
		return getRegpage4_Birth_city;
	}
	@FindBy(xpath="//*[@value='5']")
	private WebElement getRegpage4_Birth_cityDelhi;
	public WebElement getGetRegpage4_Birth_cityDelhi() {
		return getRegpage4_Birth_cityDelhi;
	}
	
	@FindBy(xpath="//*[@name='form4']")
	private WebElement getRegpage4_Continue;
	public WebElement getGetRegpage4_Continue() {
		return getRegpage4_Continue;
	}
	
	
	@FindBy(xpath="//*[@id='confirm-txt' and @nodeName='DIV']")
	private WebElement getReg__GetMatriID;
	public WebElement getGetReg__GetMatriID() {
		return getReg__GetMatriID;
	}
	
}
