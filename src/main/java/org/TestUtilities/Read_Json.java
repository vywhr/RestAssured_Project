package org.TestUtilities;

import java.io.File;
import java.io.FileInputStream;

import org.json.JSONObject;
import org.json.JSONTokener;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Read_Json {
public String readJson(String path) throws Throwable {
		
		File fl = new File(path); 
		FileInputStream fis = new FileInputStream(fl);
		JSONTokener jt = new JSONTokener(fis);
		JSONObject obj = new JSONObject(jt);
		
		String data= obj.toString();
		return data;
		//ObjectMapper obj1 =new ObjectMapper();
		//String data=obj1.writerWithDefaultPrettyPrinter().writeValueAsString(obj);
		
		
	/*file class create file object to handle file .
	 * fileInputStream load and  read the file
	 * JSONTokner convert FileInputStremObject to an formate that can understood by the Json Tokner
	 * Tokner read it and cretae tokens
	 * JSONObject tokens ko parse karta hai and convert into jasonObject	
	 * Parse means read krana .analyse karna and then make it structured to it can be readable 
	 * JSONObject is used to represent JSON data as a Java object. After parsing the input,
	 *  this object holds the key-value pairs from the JSON structure, 
	 *  allowing you to manipulate and access the data easily.
	*/
		
	}
}
