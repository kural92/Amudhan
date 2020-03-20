package com.base;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BaseTest {
	
	
	
	/*public static ExtentReports reports;
    public static ExtentTest test;*/
   // ExtentHtmlReporter reporter;
    String html = "DivorceeReport.html";
    public static WebDriver driver;
    
    
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



//////////    Excel    COde   ///////////////////////

public static String getExcelData(String sheetName, int rowNum, int colNum) throws Throwable{
	FileInputStream fis = new FileInputStream("C:\\Users\\amuthan\\eclipse-workspace\\Gammoga\\Excel\\Gamooga.xlsx");
 Workbook wb = WorkbookFactory.create(fis);
 Sheet sh = wb.getSheet(sheetName);
 Row row = sh.getRow(rowNum);
 String data = row.getCell(colNum).getStringCellValue();
 wb.close();
	return data;
}


public static int getExcelRandomRowNum(String sheetName) throws Throwable{
	FileInputStream fis = new FileInputStream("C:\\Users\\amuthan\\eclipse-workspace\\Gammoga\\Excel\\Gamooga.xlsx");
 Workbook wb = WorkbookFactory.create(fis);
 Sheet sh = wb.getSheet(sheetName);
 Random rand = new Random();
 int rowNum = rand.nextInt(sh.getLastRowNum());
 return rowNum;
}
public static void setExcelData(String sheetName, int rowNum, int colNum,String data) throws Throwable{
	FileInputStream fis = new FileInputStream("C:\\Users\\amuthan\\eclipse-workspace\\Gammoga\\Excel\\Gamooga.xlsx");
 Workbook wb = WorkbookFactory.create(fis);
 Sheet sh = wb.getSheet(sheetName);
 Row row = sh.getRow(rowNum);
 Cell cel = row.createCell(colNum);
 cel.setCellValue(data);
 FileOutputStream fos = new FileOutputStream("C:\\Users\\amuthan\\eclipse-workspace\\Gammoga\\Excel\\Gamooga.xlsx");
	wb.write(fos);
	wb.close();
}
public static int getRowCount(String sheetName) throws Throwable {
	FileInputStream fis = new FileInputStream("C:\\Users\\amuthan\\eclipse-workspace\\Gammoga\\Excel\\Gamooga.xlsx");
 Workbook wb = WorkbookFactory.create(fis);
 int rowIndex = wb.getSheet(sheetName).getLastRowNum();
 return rowIndex;
}

public static void setExcelDataInteg(String sheetName, int rowNum, int colNum,int data) throws Throwable{
	FileInputStream fis = new FileInputStream("C:\\Users\\amuthan\\eclipse-workspace\\Gammoga\\Excel\\Gamooga.xlsx");
 Workbook wb = WorkbookFactory.create(fis);
 Sheet sh = wb.getSheet(sheetName);
 Row row = sh.getRow(rowNum);
 Cell cel = row.createCell(colNum);
 cel.setCellValue(data);
 FileOutputStream fos = new FileOutputStream("C:\\Users\\amuthan\\eclipse-workspace\\Gammoga\\Excel\\Gamooga.xlsx");
	wb.write(fos);
	wb.close();

}


public static int getCellCount(String sheetName) throws Throwable {
	FileInputStream fis = new FileInputStream("C:\\Users\\amuthan\\eclipse-workspace\\Gammoga\\Excel\\Gamooga.xlsx");
 Workbook wb = WorkbookFactory.create(fis);
Sheet sh = wb.getSheet(sheetName);
Row row = sh.getRow(0);
int cell = row.getLastCellNum();
return cell;
}

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	 
	 
	 ///////////////////////////////
	 
	 public static void sendVFSms1() throws Exception {
         String message="CBS - Gamooga Chat Excel File"+"\n"
	                     +"Status : File Uploaded SuccessFully"+"\n";
         String mobileno="918098882244,916302165648,";
         String[] s = mobileno.split(",");
         for (int i = 0; i < s.length; i++) {


         String url = 
"http://api.myvaluefirst.com/psms/servlet/psms.Eservice2";
         URL obj = new URL(url);
         HttpURLConnection con = (HttpURLConnection) obj.openConnection();

         //add reuqest header
         con.setRequestMethod("POST");
         //con.setRequestProperty("User-Agent", USER_AGENT);
         con.setRequestProperty("Accept-Language", "en-US,en;q=0.5");

         String urlParameters = "data=<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?><!DOCTYPE MESSAGE SYSTEM \"http://127.0.0.1/psms/dtd/message.dtd\" ><MESSAGE><USER USERNAME=\"matrimony2\" PASSWORD=\"matrimony02\"/><SMS UDH=\"0\" CODING=\"1\" TEXT=\""+message+"\" PROPERTY=\"0\" ID=\"1\"><ADDRESS FROM=\"CMATRI\" TO=\""+s[i]+"\" SEQ=\"1\" TAG=\"some clientside random data\" /></SMS></MESSAGE>&action=send";

         // Send post request
         con.setDoOutput(true);
         DataOutputStream wr = new DataOutputStream(con.getOutputStream());
         wr.writeBytes(urlParameters);
         wr.flush();
         wr.close();

         int responseCode = con.getResponseCode();
         System.out.println("\nSending 'POST' request to URL : " + url);
         System.out.println("Post parameters : " + urlParameters);
         System.out.println("Response Code : " + responseCode);

         BufferedReader in = new BufferedReader(
                 new InputStreamReader(con.getInputStream()));
         String inputLine;
         StringBuffer response = new StringBuffer();

         while ((inputLine = in.readLine()) != null) {
             response.append(inputLine);
         }
         in.close();

         //print result
         System.out.println(response.toString());

     } 
  }
  public static void sendVFSms() throws Exception {
         String message="CBS - Gamooga Chat Excel File"+"\n" 
               +"Status : File Not Uploaded"+"\n" 
         	;
         		
         String mobileno="918098882244,916302165648";
         String[] s = mobileno.split(",");
         for (int i = 0; i < s.length; i++) {
         String url ="http://api.myvaluefirst.com/psms/servlet/psms.Eservice2";
         URL obj = new URL(url);
         HttpURLConnection con = (HttpURLConnection) obj.openConnection();

         //add reuqest header
         con.setRequestMethod("POST");
         //con.setRequestProperty("User-Agent", USER_AGENT);
         con.setRequestProperty("Accept-Language", "en-US,en;q=0.5");

         String urlParameters = "data=<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?><!DOCTYPE MESSAGE SYSTEM \"http://127.0.0.1/psms/dtd/message.dtd\" ><MESSAGE><USER USERNAME=\"matrimony2\" PASSWORD=\"matrimony02\"/><SMS UDH=\"0\" CODING=\"1\" TEXT=\""+message+"\" PROPERTY=\"0\" ID=\"1\"><ADDRESS FROM=\"CMATRI\" TO=\""+s[i]+"\" SEQ=\"1\" TAG=\"some clientside random data\" /></SMS></MESSAGE>&action=send";

         // Send post request
         con.setDoOutput(true);
         DataOutputStream wr = new DataOutputStream(con.getOutputStream());
         wr.writeBytes(urlParameters);
         wr.flush();
         wr.close();

         int responseCode = con.getResponseCode();
         System.out.println("\nSending 'POST' request to URL : " + url);
         System.out.println("Post parameters : " + urlParameters);
         System.out.println("Response Code : " + responseCode);

         BufferedReader in = new BufferedReader(
                 new InputStreamReader(con.getInputStream()));
         String inputLine;
         StringBuffer response = new StringBuffer();

         while ((inputLine = in.readLine()) != null) {
             response.append(inputLine);
         }
         in.close();

         //print result
         System.out.println(response.toString());

     }
     }

///////////////////////////////////////////////////////////////////////
  
  public static void sendVFSms2() throws Exception {
      String message="BM - Gamooga Chat Excel File"+"\n"
              +"Status : File Uploaded SuccessFully"+"\n";

      String mobileno="918098882244,916302165648,";
      String[] s = mobileno.split(",");
      for (int i = 0; i < s.length; i++) {


      String url = 
"http://api.myvaluefirst.com/psms/servlet/psms.Eservice2";
      URL obj = new URL(url);
      HttpURLConnection con = (HttpURLConnection) obj.openConnection();

      //add reuqest header
      con.setRequestMethod("POST");
      //con.setRequestProperty("User-Agent", USER_AGENT);
      con.setRequestProperty("Accept-Language", "en-US,en;q=0.5");

      String urlParameters = "data=<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?><!DOCTYPE MESSAGE SYSTEM \"http://127.0.0.1/psms/dtd/message.dtd\" ><MESSAGE><USER USERNAME=\"matrimony2\" PASSWORD=\"matrimony02\"/><SMS UDH=\"0\" CODING=\"1\" TEXT=\""+message+"\" PROPERTY=\"0\" ID=\"1\"><ADDRESS FROM=\"CMATRI\" TO=\""+s[i]+"\" SEQ=\"1\" TAG=\"some clientside random data\" /></SMS></MESSAGE>&action=send";

      // Send post request
      con.setDoOutput(true);
      DataOutputStream wr = new DataOutputStream(con.getOutputStream());
      wr.writeBytes(urlParameters);
      wr.flush();
      wr.close();

      int responseCode = con.getResponseCode();
      System.out.println("\nSending 'POST' request to URL : " + url);
      System.out.println("Post parameters : " + urlParameters);
      System.out.println("Response Code : " + responseCode);

      BufferedReader in = new BufferedReader(
              new InputStreamReader(con.getInputStream()));
      String inputLine;
      StringBuffer response = new StringBuffer();

      while ((inputLine = in.readLine()) != null) {
          response.append(inputLine);
      }
      in.close();

      //print result
      System.out.println(response.toString());

  } 
}
public static void sendVFSms3() throws Exception {
      String message="BM - Gamooga Chat Excel File"+"\n"
              +"Status : File Not Uploaded SuccessFully"+"\n";

      String mobileno="918098882244,916302165648";
      String[] s = mobileno.split(",");
      for (int i = 0; i < s.length; i++) {
      String url ="http://api.myvaluefirst.com/psms/servlet/psms.Eservice2";
      URL obj = new URL(url);
      HttpURLConnection con = (HttpURLConnection) obj.openConnection();

      //add reuqest header
      con.setRequestMethod("POST");
      //con.setRequestProperty("User-Agent", USER_AGENT);
      con.setRequestProperty("Accept-Language", "en-US,en;q=0.5");

      String urlParameters = "data=<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?><!DOCTYPE MESSAGE SYSTEM \"http://127.0.0.1/psms/dtd/message.dtd\" ><MESSAGE><USER USERNAME=\"matrimony2\" PASSWORD=\"matrimony02\"/><SMS UDH=\"0\" CODING=\"1\" TEXT=\""+message+"\" PROPERTY=\"0\" ID=\"1\"><ADDRESS FROM=\"CMATRI\" TO=\""+s[i]+"\" SEQ=\"1\" TAG=\"some clientside random data\" /></SMS></MESSAGE>&action=send";

      // Send post request
      con.setDoOutput(true);
      DataOutputStream wr = new DataOutputStream(con.getOutputStream());
      wr.writeBytes(urlParameters);
      wr.flush();
      wr.close();

      int responseCode = con.getResponseCode();
      System.out.println("\nSending 'POST' request to URL : " + url);
      System.out.println("Post parameters : " + urlParameters);
      System.out.println("Response Code : " + responseCode);

      BufferedReader in = new BufferedReader(
              new InputStreamReader(con.getInputStream()));
      String inputLine;
      StringBuffer response = new StringBuffer();

      while ((inputLine = in.readLine()) != null) {
          response.append(inputLine);
      }
      in.close();

      //print result
      System.out.println(response.toString());

  }
  }

  ///////////////////////////////////////////////////////////////////////////////////////

public static void sendVFSms4() throws Exception {
    String message="PASS : Community_Login-Desktop-Adyar,Chennai";
    String mobileno="918098882244,916302165648,";
    String[] s = mobileno.split(",");
    for (int i = 0; i < s.length; i++) {


    String url = 
"http://api.myvaluefirst.com/psms/servlet/psms.Eservice2";
    URL obj = new URL(url);
    HttpURLConnection con = (HttpURLConnection) obj.openConnection();

    //add reuqest header
    con.setRequestMethod("POST");
    //con.setRequestProperty("User-Agent", USER_AGENT);
    con.setRequestProperty("Accept-Language", "en-US,en;q=0.5");

    String urlParameters = "data=<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?><!DOCTYPE MESSAGE SYSTEM \"http://127.0.0.1/psms/dtd/message.dtd\" ><MESSAGE><USER USERNAME=\"matrimony2\" PASSWORD=\"matrimony02\"/><SMS UDH=\"0\" CODING=\"1\" TEXT=\""+message+"\" PROPERTY=\"0\" ID=\"1\"><ADDRESS FROM=\"CMATRI\" TO=\""+s[i]+"\" SEQ=\"1\" TAG=\"some clientside random data\" /></SMS></MESSAGE>&action=send";

    // Send post request
    con.setDoOutput(true);
    DataOutputStream wr = new DataOutputStream(con.getOutputStream());
    wr.writeBytes(urlParameters);
    wr.flush();
    wr.close();

    int responseCode = con.getResponseCode();
    System.out.println("\nSending 'POST' request to URL : " + url);
    System.out.println("Post parameters : " + urlParameters);
    System.out.println("Response Code : " + responseCode);

    BufferedReader in = new BufferedReader(
            new InputStreamReader(con.getInputStream()));
    String inputLine;
    StringBuffer response = new StringBuffer();

    while ((inputLine = in.readLine()) != null) {
        response.append(inputLine);
    }
    in.close();

    //print result
    System.out.println(response.toString());

} 
}
public static void sendVFSms5() throws Exception {
    String message="FAIL : Community_Login-Adyar,Chennai";
    		
    String mobileno="918098882244,916302165648";
    String[] s = mobileno.split(",");
    for (int i = 0; i < s.length; i++) {
    String url ="http://api.myvaluefirst.com/psms/servlet/psms.Eservice2";
    URL obj = new URL(url);
    HttpURLConnection con = (HttpURLConnection) obj.openConnection();

    //add reuqest header
    con.setRequestMethod("POST");
    //con.setRequestProperty("User-Agent", USER_AGENT);
    con.setRequestProperty("Accept-Language", "en-US,en;q=0.5");

    String urlParameters = "data=<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?><!DOCTYPE MESSAGE SYSTEM \"http://127.0.0.1/psms/dtd/message.dtd\" ><MESSAGE><USER USERNAME=\"matrimony2\" PASSWORD=\"matrimony02\"/><SMS UDH=\"0\" CODING=\"1\" TEXT=\""+message+"\" PROPERTY=\"0\" ID=\"1\"><ADDRESS FROM=\"CMATRI\" TO=\""+s[i]+"\" SEQ=\"1\" TAG=\"some clientside random data\" /></SMS></MESSAGE>&action=send";

    // Send post request
    con.setDoOutput(true);
    DataOutputStream wr = new DataOutputStream(con.getOutputStream());
    wr.writeBytes(urlParameters);
    wr.flush();
    wr.close();

    int responseCode = con.getResponseCode();
    System.out.println("\nSending 'POST' request to URL : " + url);
    System.out.println("Post parameters : " + urlParameters);
    System.out.println("Response Code : " + responseCode);

    BufferedReader in = new BufferedReader(
            new InputStreamReader(con.getInputStream()));
    String inputLine;
    StringBuffer response = new StringBuffer();

    while ((inputLine = in.readLine()) != null) {
        response.append(inputLine);
    }
    in.close();

    //print result
    System.out.println(response.toString());

}
}


  

	
}
	

