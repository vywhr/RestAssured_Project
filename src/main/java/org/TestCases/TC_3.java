package org.TestCases;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class TC_3 {
	@Test
	
	public void query() {
	
	String url ="https://reqres.in/api/users";
	
	     Response res= given()
	    		       .contentType(ContentType.JSON)
	    		       //.baseUrl( url )
	    		       .queryParam("page", 2)
	    		       .when()
	    		       .get(url);
	     
	     String asPrettyString = res.asPrettyString();
		 System.out.println(asPrettyString);
	     
	    		// System.out.print("response is"+ "" + res.asPrettyString())    
	     
	
	}
	
	
	
	
	
	
	
	
	

}
