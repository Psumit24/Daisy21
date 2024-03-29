package com.testingshastra.uitests;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.automation.config.BaseClass;
import com.automation.keywords.UIKeywords;
import com.automation.pages.HomePage;
import com.automation.pages.JoinMeetingPage;

public class HomePageTest extends BaseClass {
	private static final  Logger LOG =Logger.getLogger(HomePageTest.class);
	UIKeywords keyword = UIKeywords.getInstance();

	@Test(enabled =false)
	public void verifyTitleOFHomePage() throws InterruptedException {
		HomePage page = new HomePage();
		String expectedTitle = "IJmeet";
		LOG.info("IJmeet");
		Assert.assertEquals(UIKeywords.getInstance().driver.getTitle(), expectedTitle);
		page.rightClickOnnavbarContent();
		Thread.sleep(5000);
		page.getTextOfInfoLinks();
		LOG.info("Hello");
		page.getTextOfSocialLinks();
		LOG.info("Done");
	}

	@Test
	public void verifyToUserRedirectToJoinMeetPage() {
		HomePage page = new HomePage();
		//HomePage page = PageFactory.initElements(keyword.driver, HomePage.class);
		page.clickOnJoinMeetingTab();
		JoinMeetingPage join = new JoinMeetingPage();
		//JoinMeetingPage join = PageFactory.initElements(keyword.driver, JoinMeetingPage.class);
		String actual = join.getQuickJoinMeetingTitle();
		Assert.assertTrue(actual.contains("Quick"));
		join.enterYourNameSend().sendKeys("Sumit");;
		join.getenterMeettingId().sendKeys("12345678");
		join.getjoinMeetingClick().click();
		System.out.println("Get text:.."+join.getjoinMeetingClick().getText());
		
	}
}
