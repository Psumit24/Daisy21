package com.testingshastra.uitests;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.automation.config.BaseClass;
import com.automation.keywords.UIKeywords;
import com.automation.pages.ContactSalesPage;

public class ContactSaleTest extends BaseClass {
	UIKeywords keyword = UIKeywords.getInstance();
	String expectedTitle = "IJmeet";

	@Test(enabled = false)
	public void tc_1contactPageClick() {
		ContactSalesPage csp = PageFactory.initElements(UIKeywords.getInstance().driver, ContactSalesPage.class);
		csp.clickOnContactPage();
		String actualUrl = keyword.getCurrentURl();
		System.out.println(actualUrl + "\tTitle of Page:" + keyword.getTitleOfPage());
		Assert.assertEquals(keyword.getTitleOfPage(), "IJmeet");
	}

	@Test
	public void validatecontactSalePage() {
		ContactSalesPage csp = PageFactory.initElements(UIKeywords.getInstance().driver, ContactSalesPage.class);
		csp.clickOnContactPage();
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// ContactSalesPage page =new ContactSalesPage();
		// page.getTextOnpage();
		csp.getTextOnpage();

		keyword.enterText(csp.contactsales_userName, "Shailesh M");
		keyword.enterText(csp.contactsales_userEmail, "sumitpakk@gmial.com");
		keyword.enterText(csp.contactsales_textArea, "Hi, How Are you Boss!! 123456@21&");
		keyword.switchtoFrameAt(0);
		keyword.click(csp.contactsales_captcha);
		keyword.switchToDefaultContent();
		keyword.click(csp.contactsales_send);
	}
}