package com.automation.config;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class configReader {

	
	private static Properties prop;
	static {
		try {
			FileInputStream obj =new FileInputStream("src/test/resources/config/config.properties");
			prop = new Properties();
			prop.load(obj);
		}
		catch(IOException e) {
			e.printStackTrace();
		
	}
}
public static String getProperty(String key) {
	return prop.getProperty(key);
}
}

  