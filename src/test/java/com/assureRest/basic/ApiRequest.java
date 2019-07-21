package com.assureRest.basic;




import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import org.junit.Test;

public class ApiRequest  {


	  @Test 
	  public void sendGetRequest() {
/*Scenario:-
   APi Name-> URI:-https://api.openweathermap.org/data/2.5/weather?q=London,uk
   API Key:-2154b9a96178ba901814bec2b214e29d
	 Request type:-GET 
	 
     step1:- send request 
     step2:- store the response 
      step3:- Display the response time  */
	
	Response response1 = get("https://api.openweathermap.org/data/2.5/weather?q=London,uk&APPID=2154b9a96178ba901814bec2b214e29d");
     
     System.out.println("Status code in response:- " + response1.statusCode());
	 System.out.println("Response time:- " + response1.getTime());
	 System.out.println("*******************Response1****************");
     response1.prettyPrint();
	
	}
	 

}

