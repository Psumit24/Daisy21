package com.testingshastra.uitests;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.automation.config.BaseClass;
import com.automation.keywords.UIKeywords;
import com.automation.pages.HostMeetingPage;
import com.automation.util.WaitsFor;

public class HostMeetingTest extends BaseClass {
	private static final Logger LOG = Logger.getLogger(HostMeetingTest.class);
	UIKeywords keyword = UIKeywords.getInstance();

	@Test
	public void hostmeetingClick() {
		String url = "https://ijmeet.com";
		keyword.launchUrl(url);
		LOG.info("URL Lunched:" + url);
		HostMeetingPage hmp = PageFactory.initElements(UIKeywords.getInstance().driver, HostMeetingPage.class);
		hmp.clickOnHostMeetingLink();
		String text = keyword.getTextonSubmit(hmp.tryItFreeLink);
		LOG.info("TryFree>>" + text);
		hmp.clickOntryitForFree();
		keyword.enterText(hmp.enterFullName, "Shailesh Maja Bedi");
		keyword.enterText(hmp.enterCompanyName, "TCS");
		keyword.enterText(hmp.enterEmailId, "bedijosh@gmail.com");
		keyword.enterText(hmp.enterContactNo, "9526721122");
		keyword.enterText(hmp.enterPassword, "Shail@123");
		keyword.switchtoFrameAt(0);
		LOG.info("Switched to Inside Frame");
		keyword.click(hmp.reCaptcha);
		keyword.switchToDefaultContent();
		LOG.info("Jumped back from Frame");
		String sp = keyword.getTextonSubmit(hmp.lebeltext);
		String fb = keyword.getTextonSubmit(hmp.socialLoginFacebook);
		String gog = keyword.getTextonSubmit(hmp.socialLoginGoogle);
		String fed = keyword.getTextonSubmit(hmp.socialLoginFedration);
		System.out.println("Text>>" + sp);
		System.out.println("Text>>" + fb);
		System.out.println("Text>>" + gog);
		System.out.println("Text>>" + fed);
		WaitsFor.elementToBeClickable(hmp.lebeltext);
		//keyword.click(hmp.lebeltext);
		// keyword.click(hmp.signUp);
		System.out.println("click on sign in>>" + hmp.singIn.getText());
		keyword.enterText(hmp.enterEmailId, "bedijosh@gmail.com");
		keyword.enterText(hmp.enterPassword, "Shail@123");
		WaitsFor.elementToBeClickable(hmp.signUp);
		//keyword.click(hmp.signUp);
	}

}
