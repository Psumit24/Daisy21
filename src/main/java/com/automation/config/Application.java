package com.automation.config;

import  com.automation.util.PropertiesFile;

public class Application {
private static final String FILEPATH = 
"/src/main/resources/applications.properties";
	
	public String getBrowser() {
		 return PropertiesFile.getProperty(FILEPATH, "daisy.browser");
	}
	
	public String getAppURL() {
		 return PropertiesFile.getProperty(FILEPATH,"daisy.dev.app.url");
	}
	
}

