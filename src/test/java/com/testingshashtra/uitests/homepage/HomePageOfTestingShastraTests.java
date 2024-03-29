package com.testingshashtra.uitests.homepage;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.automation.keywords.UIKeywords;

public class HomePageOfTestingShastraTests {
	UIKeywords key = UIKeywords.getInstance();
	String expectedTittle = "Testing Shastra | Training | Placement";

	@Test
	public void verifyTitleOfHomePage() {
		key.OpenBrow("chrome");
		key.launchUrl("https://www.testingshastra.com");
		String title = key.getTitleOfPage();
		System.out.println(title);
		Assert.assertEquals(title, expectedTittle);
		key.quitBrowse();
	}
}
