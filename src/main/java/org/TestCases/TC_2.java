package org.TestCases;
import static io.restassured.RestAssured.*;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class TC_2 {
	
	
	 class Tc5 {
	@Test
		public void QueryPath() throws Throwable {
			
			String URL="https://reqres.in/api/users";
			 Response response = given().contentType(ContentType.JSON)
					//.baseUri(URL)
					.queryParam("page", 2)
					.queryParam("id", 7)
					.when()
					.get(URL);
			 int statuscode =response.statusCode();
			 int expectedStatuscode=200;
			 
			 String asPrettyString = response.asPrettyString();
			 System.out.println(asPrettyString);
			Assert.assertEquals(statuscode, expectedStatuscode);	
		}
	
		
	//@Test
	public void pathParam() throws Throwable {
		
		String URL="https://reqres.in/api/users/{id}";
		  Response response = given().log().ifValidationFails()
		 . contentType(ContentType.JSON)
				//.baseUri(URL)
				.pathParam("id", 3)
				.when()
				.get(URL)
				;
		  JsonPath jsonPath = response.jsonPath();
		  System.out.println(jsonPath.get("data.id"));
		  
				/*
				 * String string = response.prettyPrint(); System.out.println(string);
				 * System.out.println(string.contains("Emma"));
				 */ 

				
		//System.out.println(response.asPrettyString());
				
	}
	}
	

}
