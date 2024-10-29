package org.TestCases;

import java.util.Properties;

import org.TestSteps.HttpMethods;
import org.TestUtilities.PropertiesFileLoad;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class PostTestCase {
 	String pathproperties1= System.getProperty("user.dir");
	
	@Test
	public static void main(String[] args) {
		
		Properties properties	=PropertiesFileLoad.propFileLoad(pathproperties1+ "//Envirnment.properties");
		HttpMethods http= new HttpMethods(properties);
		Response responce1 =http.PostRequestJson("URI_get_1","post.jason");
		System.out.println("Request success");
		System.out.println(responce1.asString());
		

	}

}
