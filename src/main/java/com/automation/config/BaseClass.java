package com.automation.config;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.automation.keywords.UIKeywords;

public class BaseClass{
	UIKeywords keyword = UIKeywords.getInstance();
	public RemoteWebDriver driver = null;
	@BeforeMethod
	public void setup() {
		keyword.OpenBrow("chrome");
		this.driver = keyword.getDriver();
		driver.get("https://www.ijmeet.com");
		keyword.maximazeWindow();
		keyword.implicitWait();
	}

	@AfterMethod
	public void tearDown() {
		keyword.quitBrowse();
	}

}
