package com.automation.pages;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.automation.keywords.UIKeywords;

public class ContactSalesPage {
	UIKeywords keyword = UIKeywords.getInstance();
	@FindBy(css = "#navbarContent ul li:nth-child(3) a")
	public WebElement contactSalesLink;
	@FindBy(css = "input[type='text']")
	public WebElement contactsales_userName;
	@FindBy(css = "input[type='email']")
	public WebElement contactsales_userEmail;
	@FindBy(css = "textarea.form-control")
	public WebElement contactsales_textArea;
	@FindBy(css = "div.recaptcha-checkbox-border")
	public WebElement contactsales_captcha;
	@FindBy(css = "button[type='submit']")
	public WebElement contactsales_send;
	@FindBy(css = "div.front-viewsecond-divcontactus div.media-body")
	public List<WebElement> contactsales_text;

	public void clickOnContactPage() {
		keyword.click(contactSalesLink);
	}

	public void getTextOnpage() {
		Iterator<WebElement> itr = contactsales_text.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next().getText());

		}

	}
}
