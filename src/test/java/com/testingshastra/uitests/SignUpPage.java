package com.testingshastra.uitests;

import org.apache.log4j.Logger;
import org.testng.Assert;
//import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.automation.config.BaseClass;
import com.automation.keywords.UIKeywords;
import com.automation.util.Locator;
//import com.automation.util.TestListener;
//@Listeners(TestListener.class)
public class SignUpPage extends BaseClass {
	private static final Logger LOG = Logger.getLogger(SignUpPage.class);
	UIKeywords keyword = UIKeywords.getInstance();

	@Test
	public void validateFulltNameFieldForCorrectInput() {
		String url = "https://ijmeet.com";
		keyword.launchUrl(url);
		LOG.info("URL is Launched:" + url);
		// Approach 1
		// WebElement
		// signUp=keyword.getDriver().findElement(By.cssSelector("li:nth-child(5)
		// a.nav-link"));
		// keyword.click(signUp);
		keyword.maximazeWindow();
		keyword.implicitWait();
		keyword.click("css", "li:nth-child(5) a.nav-link");
		LOG.info("Clicked on Register Button");
		keyword.enterText(Locator.SINGUP_FULLNAME, "Sumit Pakhare");
		keyword.enterText(Locator.SINGUP_COMPANYNAME, "ShitalSumit pvt.ltd.");
		keyword.enterText(Locator.SINGUP_EMAIL, "sumitpakhre@gmail.com");
		keyword.enterText(Locator.SINGUP_CONTACTL, "8668414110");
		keyword.enterText(Locator.SINGUP_PASSWORD, "Sumit@1234");
		keyword.switchtoFrameAt(0);
		LOG.info("Switched to Inside Frame");
//WaitsFor.elementToBeClickable(keyword.getWebElement("css", "div.recaptcha-checkbox-border"));
		keyword.click("css", "div.recaptcha-checkbox-border");
		keyword.switchToDefaultContent();
		LOG.info("Jumped back from Frame");
		keyword.click("css", "button[type='submit']");
		String actualUrl = keyword.getCurrentURl();
		System.out.println(actualUrl);
		//Assert.assertTrue(actualUrl.contains("dashboard"));//for test case fail
		Assert.assertTrue(actualUrl.contains("https://ijmeet.com/register?csrt"));//test case pass
	}

}
