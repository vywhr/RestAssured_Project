package org.ResponseValidation;

import org.json.simple.JSONObject;
import org.testng.Assert;

import io.restassured.response.Response;

public class ResponseValidation {

	
	JSONObject response;
	
	public ResponseValidation(JSONObject response) {
		this.response=response;
	}
	
		public void responseValidation(Response Res) {
			System.out.println(Res.getStatusCode());
			System.out.println(Res.getStatusLine());
			
		}
	
		public void statusCodeShouldBe(int statusCode) {
			Assert.assertTrue(Integer.parseInt(response.get("statusCode").toString())==statusCode);
		}
		
		
		public void messageShouldBe(String responceMsg) {
			Assert.assertTrue(response.get("message").toString().equals(responceMsg));	
		}
		
		public String getDataFromBody(String keyFromBody) {
			return com.jayway.jsonpath.JsonPath.parse(response.toString()).read(keyFromBody);			
		}

}
