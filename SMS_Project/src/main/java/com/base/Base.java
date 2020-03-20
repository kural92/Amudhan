package com.base;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;





public class Base {
	
	
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
		 
		 ///////////////////////////////
		 
		 public static void sendVFSms1() throws Exception {
	         String message="PASS : Divrocee_Login_Desktop-Adyar,Chennai";
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
	         String message="FAIL : Divorcee_Login_Desktop-Adyar,Chennai";
	         		
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
	  
	  
	  
	  
	  
	  //////                                         EXcel  Base Code                                  ////////
	  
	  
	  
	  
	  
		public static List<HashMap<String, String>> readValueFromExcelSheet()  throws NullPointerException  {
			List<HashMap<String, String>> mapDatasList = new ArrayList();
			try {
				File excelLocaltion = new File("D:\\New folder\\SMS and MAIL Jenkin Code\\Sms_Test_Data.xlsx");

				String sheetName = "Sheet1";

				FileInputStream f = new FileInputStream(
						excelLocaltion.getAbsolutePath());
				Workbook w = new XSSFWorkbook(f);
				Sheet sheet = w.getSheet(sheetName);
				Row headerRow = sheet.getRow(0);
				for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
					Row currentRow = sheet.getRow(i);
					HashMap<String, String> mapDatas = new HashMap<String, String>();
					for (int j = 0; j < headerRow.getPhysicalNumberOfCells(); j++) {
						Cell currentCell = currentRow.getCell(j);

						switch (currentCell.getCellType()) {
						case Cell.CELL_TYPE_STRING:
							mapDatas.put(headerRow.getCell(j).getStringCellValue(),
									currentCell.getStringCellValue());
							break;
						case Cell.CELL_TYPE_NUMERIC:
							mapDatas.put(headerRow.getCell(j).getStringCellValue(),
									String.valueOf(currentCell
											.getNumericCellValue()));

							break;

						}
					}

					mapDatasList.add(mapDatas);
				}

			} catch (Throwable e) {
				e.printStackTrace();
			}
			return mapDatasList;

		}



		  	 
		  	 ////////////////////                         //////////////////////////////////////////////////////
	  
	  
	  
	  
	  
	  
	  /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	  
	  
	  
	  
	

}
