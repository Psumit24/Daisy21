package com.automation.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFile {
	public String getProperty(String fileName, String key) {
		String value = "";
		return value;
	}

	/**
	 * This Method return the value of locator mentioned in ObjectRepository
	 * 
	 * @param key
	 * @return 
	 */
	public static String getObject(String key) {
		String dir = System.getProperty("user.dir");
		String value="";
		try {
			FileInputStream fis = new FileInputStream(dir+"/src/test/resources/ObjectRepository.properties");
			Properties prop = new Properties();
			prop.load(fis);
			value=prop.getProperty(key);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return value;
	}
}
