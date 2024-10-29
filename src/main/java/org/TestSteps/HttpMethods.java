package org.TestSteps;

import static io.restassured.RestAssured.given;

import java.util.Properties;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class HttpMethods {

	static Properties properties;
	public	HttpMethods(Properties properties ) {
		this.properties=properties;
	}

	public Response getRequest(String URI) {
		Response res= given().contentType("application/json")
				.when()
				.get(properties.getProperty(URI));
		return res;
	}
	public Response PostRequestPOJO(Object postData, String URI) {
		Response Res =
				given()
				.contentType(ContentType.JSON)
				.body(postData)
				.when()
				.post(properties.getProperty(URI));
		return Res;
				
	}
	public Response PostRequestJson(String jasonFilePath, String URI) {
		Response Res =
				given()
				.contentType(ContentType.JSON)
				.accept(ContentType.JSON)
	            .auth()
		        .basic("username","password")
				.body(jasonFilePath)
				.when()
				.post(properties.getProperty(URI));
		return Res;
				
	}
	public Response PutRequestJson(String postData, String URI) {
		Response Res =
				given()
				.contentType(ContentType.JSON)
				.body(postData)
				.when()
				.put(properties.getProperty(URI));
		return Res;
				
	}
	public Response delete(String URI) {
		Response Res =
				given()
				.contentType(ContentType.JSON)
				.when()
				.put(properties.getProperty(URI));
		return Res;
				
	}






}
