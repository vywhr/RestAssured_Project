package org.TestCases;
import io.restassured.RestAssured;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class TC_5 {
	
	    @Test
	    public void testApi() {
	        // Define base URI and path
	        RestAssured.baseURI = "https://api.example.com";
	        String basePath = "/api/v1";

	        // Send GET request and validate response
	        given()
	            .header("Authorization", "Bearer your_access_token")
	        .when()
	            .get(basePath + "/resource")
	        .then()
	            .statusCode(200)
	            .body("name", equalTo("John"))
	            .body("age", equalTo(30));
	    }
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


