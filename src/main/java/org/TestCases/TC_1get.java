package org.TestCases;

import java.io.IOException;
import java.util.Map;
import java.util.Properties;

import org.TestSteps.HttpMethods;
import org.TestUtilities.PropertiesFileLoad;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.xml.Parser;
import org.ResponseValidation.ResponseValidation;
import org.json.simple.parser.JSONParser;
import io.restassured.response.Response;

public class TC_1get {
	
	String pathproperties= System.getProperty("user.dir");
	
	
	@Test
	public void getTestcase() throws Exception {
		
	Properties properties	=PropertiesFileLoad.propFileLoad(pathproperties+ "//Envirnment.properties");
		HttpMethods http= new HttpMethods(properties);
		Response responce1 =http.getRequest("URI_get_1");
		System.out.println("Request success");
		System.out.println(responce1.asString());
		
//		JSONObject obj = (JSONObject) responce1;
		
		String jsonString = responce1.getBody().toString();  // Convert the response body to string
		
		JSONParser jp = new JSONParser();
		JSONObject resO = (JSONObject) jp.parse(jsonString);
		
		ResponseValidation ResObj = new ResponseValidation(resO);
//		ResObj.responseValidation(response);
		
		ResObj.statusCodeShouldBe(200);
		ResObj.messageShouldBe("OK");
		
		String getPage = ResObj.getDataFromBody("page");
		Assert.assertEquals(getPage, "2");
		
		
		String getFirstName = ResObj.getDataFromBody("data[0].first_name");
		Assert.assertEquals(getFirstName, "Michael");
	}

}
