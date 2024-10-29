package org.TestCases;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.json.JSONObject;
import org.json.JSONTokener;

import io.restassured.response.Response;

public class PracticeTestCase {

	public static void main(String[] args) throws FileNotFoundException {
		
		File file =new File ("Path of the jason File");
		FileInputStream fis = new FileInputStream(file);
		JSONTokener jst= new JSONTokener(fis);
		JSONObject obj= new JSONObject(jst);
		
		
		/*
		 * Response res= given().contentType("application/json") .body(obj)
		 * 
		 * .When() .post("URI");
		 * 
		 * System.out.println(res.asPrettyString());
		 * System.out.println(res.getStatusLine());
		 */
		
	}

}
