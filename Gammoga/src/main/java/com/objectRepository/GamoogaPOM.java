package com.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseTest;

public class GamoogaPOM extends BaseTest{
	
	
	public GamoogaPOM(WebDriver driver) {

		PageFactory.initElements(driver, this);
 
		
	}
	
	
	@FindBy(xpath="//input[@placeholder='Username']")
	private WebElement userName;
    public WebElement getUserName() {
		return userName;
	}
	
    
    @FindBy(id="password")
    private WebElement passWord;
	public WebElement getPassWord() {
		return passWord;
	}
	
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement Login_btn;
	public WebElement getLogin_btn() {
		return Login_btn;
	}
	
	
	@FindBy(xpath="//button[contains(text(),'Login')]")
	private WebElement Login_btn1;
	public WebElement getLogin_btn1() {
		return Login_btn1;
	}
	
	
	@FindBy(xpath="//*[@id=\"scroll\"]/li[2]/a")
	private WebElement Chat_btn;
	public WebElement getChat_btn() {
		return Chat_btn;
	}
	
	
	@FindBy(xpath="//*[@id=\"chat\"]/li[8]/a")
	private WebElement Report_btn;
	public WebElement getReport_btn() {
		return Report_btn;
	}
	
	
	@FindBy(xpath="//li[@id=\"chattranscripts\"]")
	private WebElement Chat_Transcits;
	public WebElement getChat_Transcits() {
		return Chat_Transcits;
	}
	
	
	@FindBy(id="datepicker1")
	private WebElement DatePicker_From;
	public WebElement getDatePicker_From() {
		return DatePicker_From;
	}
	
	
	@FindBy(id="datepicker2")
	private WebElement DatePicker_To;
	public WebElement getDatePicker_To() {
		return DatePicker_To;
	}
	
	
	@FindBy(xpath="(//select[@class=\"pika-select pika-select-hour\"])[1]")
	private WebElement Date_Hour_To;
	public WebElement getDate_Hour_To() {
		return Date_Hour_To;
	}
	
	@FindBy(xpath="(//select[@class=\"pika-select pika-select-hour\"])[2]")
	private WebElement Date_Hour_To1;
	public WebElement getDate_Hour_To1() {
		return Date_Hour_To1;
	}
	
	
	@FindBy(xpath="(//select[@class='pika-select pika-select-minute'])[2]")
	private WebElement Date_minute_To;
	public WebElement getDate_minute_To() {
		return Date_minute_To;
	}
	
	
	@FindBy(xpath="(//span[contains(text(),'all')])[1]")
	private WebElement visitor_survey_all;
	public WebElement getVisitor_survey_all() {
		return visitor_survey_all;
	}

	
	@FindBy(xpath="(//span[contains(text(),'all')])[2]")
	private WebElement operator_survey_all;
	public WebElement getOperator_survey_all() {
		return operator_survey_all;
	}

	@FindBy(xpath="(//span[contains(text(),'all')])[3]")
	private WebElement associated_event_all;
	public WebElement getAssociated_event_all() {
		return associated_event_all;
	}


	@FindBy(xpath="//*[@id=\"chat_form\"]/div[2]/div/div/input[1]")
	private WebElement include_full_chats;
	public WebElement getInclude_full_chats() {
		return include_full_chats;
	}
	
	
	@FindBy(xpath="//input[@value=\"Download Excel\"]")
	private WebElement download_Exel;
	public WebElement getDownload_Exel() {
		return download_Exel;
	}
	
	
	
	@FindBy(xpath="(//a[contains(text(),' click here ')])[2]")
	private WebElement cbs_upload;
	public WebElement getCbs_upload() {
		return cbs_upload;
	}
	
	
	@FindBy(xpath="//*[@id=\"myForm\"]/div[1]/input")
	private WebElement choose_Upload_file;
	public WebElement getChoose_Upload_file() {
		return choose_Upload_file;
	}
	
	
	@FindBy(id="Submit1")
	private WebElement Upload_button;
	public WebElement getUpload_button() {
		return Upload_button;
	}
	
	
	
	
}
