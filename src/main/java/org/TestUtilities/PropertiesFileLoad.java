package org.TestUtilities;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

public  class  PropertiesFileLoad {
	
	public static Properties propFileLoad (String path) throws Exception {

		File file =new File (path);

		FileInputStream	fis= new  FileInputStream(file);
		Properties properties = new Properties(); //read data from properties file of key value pair in java
		properties.load(fis);                     // load method load and read the keys 
		return properties;                        //you can access valuse by using properties.key

	}



}


