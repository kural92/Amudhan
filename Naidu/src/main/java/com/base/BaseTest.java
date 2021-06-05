package com.base;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Random;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class BaseTest {
	
	 String html = "DivorceeReport.html";
	    public static WebDriver driver;
	    static String currentUrl,Clasfiation,a,b,c,d,e1,f;
	    public static String Profile_Created,Name,Age,Height,Gender,Marital_status,Mother_Tongue,
	    Physical_Status,Body_Type,Complexion,Language__Known,Star,Rasi,SubCaste,
	    Gothram,Dosham,Education,Education_Detail,Occupation,Occupation_Detail,
	    Employeed_In,Annual_Income,City,State,Country,Citizenship, Religion;
	    //public static Calendar calendar;
	    public static ExtentReports extent;
	    public static ExtentTest test;
	    public static int time=10;
	    public static String Job_Id, Job_Name, Medium, Date;
	    
	    public static void click(WebElement element) {	
			element.click();

		}
		 
		 public static void clear(WebElement element) {	
				element.clear();
		 }
				
		 public static void typeData(WebElement element, String Value) {
			element.sendKeys(Value);

		}
		 ////////////////////////////
		 public static void Wait_Explecit(WebDriver driver, WebElement element, int time) {
		 WebDriverWait wait =   new WebDriverWait(driver, time);
		 wait.until(ExpectedConditions.visibilityOf(element)); 
		 }
		 
		 
	////////////////Drop Down Base//////////////////
			
	public static void select_string(WebElement element, String Value) {
	Select s = new Select(element);
	s.selectByValue(Value);
	}


	public static void select_index(WebElement element, int Value) {
	Select s = new Select(element);
	s.selectByIndex(Value);	
	}


	public static void select_text(WebElement element, String text) {
	Select s = new Select(element);
	s.selectByVisibleText(text);
	}


	public static void select_deselectAll(WebElement element) {
		Select s = new Select(element);
		s.deselectAll();
	}


//////////	    Excel    COde   ///////////////////////
	public static String getExcelDataUrl(String sheetName, int rowNum, int colNum) throws Throwable{
		FileInputStream fis = new FileInputStream("//Excel//LoginTestData_Mohan2222.xlsx");
	 Workbook wb = WorkbookFactory.create(fis);
	 Sheet sh = wb.getSheet(sheetName);
	 Row row = sh.getRow(rowNum);
	 String data = row.getCell(colNum).getStringCellValue();
	 wb.close();
		return data;
	}



	public static String getExcelData(String sheetName, int rowNum, int colNum) throws Throwable{
		FileInputStream fis = new FileInputStream(".//Excel//SMSTEST.xlsx");
	 Workbook wb = WorkbookFactory.create(fis);
	 Sheet sh = wb.getSheet(sheetName);
	 Row row = sh.getRow(rowNum);
	 String data = row.getCell(colNum).getStringCellValue();
	 wb.close();
		return data;
	}


	public static int getExcelRandomRowNum(String sheetName) throws Throwable{
		FileInputStream fis = new FileInputStream(".//Excel//SMSTEST.xlsx");
	 Workbook wb = WorkbookFactory.create(fis);
	 Sheet sh = wb.getSheet(sheetName);
	 Random rand = new Random();
	 int rowNum = rand.nextInt(sh.getLastRowNum());
	 return rowNum;
	}
	public static void setExcelData(String sheetName, int rowNum, int colNum,String data) throws Throwable{
		FileInputStream fis = new FileInputStream(".//Excel//SMSTEST.xlsx");
	 Workbook wb = WorkbookFactory.create(fis);
	 Sheet sh = wb.getSheet(sheetName);
	 Row row = sh.getRow(rowNum);
	 Cell cel = row.createCell(colNum);
	 cel.setCellValue(data);
	 FileOutputStream fos = new FileOutputStream(".//Excel//SMSTEST.xlsx");
		wb.write(fos);
		wb.close();
	}



	public static void setExcelDataUrl(String sheetName, int rowNum, int colNum,String data) throws Throwable{
		FileInputStream fis = new FileInputStream(".//Excel//SMSTEST.xlsx");
	 Workbook wb = WorkbookFactory.create(fis);
	 Sheet sh = wb.getSheet(sheetName);
	 Row row = sh.getRow(rowNum);
	 Cell cel = row.createCell(colNum);
	 cel.setCellValue(data);
	 FileOutputStream fos = new FileOutputStream(".//Excel//SMSTEST.xlsx");
		wb.write(fos);
		wb.close();
	}



	public static int getRowCount(String sheetName) throws Throwable {
		FileInputStream fis = new FileInputStream(".//Excel//SMSTEST.xlsx");
	 Workbook wb = WorkbookFactory.create(fis);
	 int rowIndex = wb.getSheet(sheetName).getLastRowNum();
	 return rowIndex;
	}

	public static void setExcelDataInteg(String sheetName, int rowNum, int colNum,int data) throws Throwable{
		FileInputStream fis = new FileInputStream(".//Excel//SMSTEST.xlsx");
	 Workbook wb = WorkbookFactory.create(fis);
	 Sheet sh = wb.getSheet(sheetName);
	 Row row = sh.getRow(rowNum);
	 Cell cel = row.createCell(colNum);
	 cel.setCellValue(data);
	 FileOutputStream fos = new FileOutputStream(".//Excel//SMSTEST.xlsx");
		wb.write(fos);
		wb.close();

	}


	public static int getCellCount(String sheetName) throws Throwable {
		FileInputStream fis = new FileInputStream(".//Excel//SMSTEST.xlsx");
	 Workbook wb = WorkbookFactory.create(fis);
	Sheet sh = wb.getSheet(sheetName);
	Row row = sh.getRow(0);
	int cell = row.getLastCellNum();
	return cell;
	}
}


