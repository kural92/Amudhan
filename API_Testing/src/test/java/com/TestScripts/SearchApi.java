package com.TestScripts;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class SearchApi {
	
	
	WebDriver driver;
	String Requested_Id=null;
	String requested_deatils=null;
	String matid,asd,ageFro,ageT,maritalStatus,mariedstatus1,Religion,Religion1,Caste,Caste1,SubCaste,SubCaste1,Education,Education1;
	int ageFrom,ageTo,ageFrom1,ageTo1;
    float heightFrom,heightFrom1,heightTo,heightTo1,heightFrom2,heightTo2,Height;
    
	@Test(priority=2,enabled=true)
	public void communicationDetails() {
		// Specify the base URL to the RESTful web service
		
		
		RestAssured.baseURI = "https://api.communitymatrimony.com/api/webservicecall.php?filename=showRecMsgCurl&MatriId=BRH1393126&Gender=2&MessageAction=RMPENDING&MsgType=1,2&Page=2&OrderBy=Date_Received%20DESC&FilterFlag=0";

		RequestSpecification httpRequest = RestAssured.given();

		Response response = httpRequest.request(Method.GET,
				"https://api.communitymatrimony.com/api/webservicecall.php?filename=showRecMsgCurl&MatriId=BRH1393126&Gender=2&MessageAction=RMPENDING&MsgType=1,2&Page=2&OrderBy=Date_Received%20DESC&FilterFlag=0");

		JsonPath jsonPathEvaluator = response.jsonPath();

		int statusCode = response.getStatusCode();
		System.out.println(statusCode);

		String statusLine = response.getStatusLine();
		System.out.println("Status Line : " + statusLine);

		String contentType = response.header("Content-Type");
		System.out.println("Content-Type value: " + contentType);

		String serverType = response.header("Server");
		System.out.println("Server value: " + serverType);

		String acceptLanguage = response.header("Content-Encoding");
		System.out.println("Content-Encoding: " + acceptLanguage);

		

		ResponseBody body = response.getBody();
		System.out.println("Response Body is: " + body.asString());
		
		String ERRORDESC = response.jsonPath().get("ERRORDESC").toString();
	//	System.out.println(ERRORDESC+" . ' . ' ");
		
		if (!ERRORDESC.equalsIgnoreCase("Sorry No Record's Found")) {
			
			
        String tota = response.jsonPath().get("TOTALRESULTS").toString();
       Float totaal = Float.parseFloat(tota);
       
       
       
       float tot = (float) (totaal/10.0);
       System.out.println(tot);
       int total = (int) Math.ceil(tot);
     //  int tot = (int) (totaal/10);
      //  float totalll = Math.round(tot);
     //  int total = Math.round(tot);
        System.out.println(total);
      
        
        for (int i = 1; i <=total; i++) {
        	
        	System.out.println("\n"+"\n"+i+"\n"+"\n");
        	
        	RestAssured.baseURI = "https://api.communitymatrimony.com/api/webservicecall.php?filename=showRecMsgCurl&MatriId=MUS2066206&Gender=2&MessageAction=RMPENDING&MsgType=1,2&Page="+i+"&OrderBy=Date_Received%20DESC&FilterFlag=0";

    		RequestSpecification httpRequest1 = RestAssured.given();

    		Response response1 = httpRequest1.request(Method.GET,
    				"https://api.communitymatrimony.com/api/webservicecall.php?filename=showRecMsgCurl&MatriId=MUS2066206&Gender=2&MessageAction=RMPENDING&MsgType=1,2&Page="+i+"&OrderBy=Date_Received%20DESC&FilterFlag=0");

    		JsonPath jsonPathEvaluator1= response1.jsonPath();
    		
    		ResponseBody body1 = response1.getBody();
    		
    	//	String ERRORDESC = response1.jsonPath().get("ERRORDESC").toString();

            			
		
	
		
		
	
		
		List<Map<String, String>> profile_details = response1.jsonPath().getList("PROFILEDETAILS");
        for (int j = 0; j < profile_details.size(); j++) {
        	int k = j+1;
        	
        	 
        	 System.out.println("\n"+k+"\n");
        	 
        	 
        	 
        }
	
        }
		}
}
	
}
