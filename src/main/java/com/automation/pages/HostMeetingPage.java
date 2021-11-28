package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.automation.keywords.UIKeywords;

public class HostMeetingPage {
	UIKeywords keyword = UIKeywords.getInstance();
	@FindBy(css = "#navbarContent ul li:nth-child(2) a")
	public WebElement hostMeetingLink;
	@FindBy(css = "a.button")
	public WebElement tryItFreeLink;
	@FindBy(css = "input#name")
	public WebElement enterFullName;
	@FindBy(css = "input#company_name")
	public WebElement enterCompanyName;
	@FindBy(css = "input#email")
	public WebElement enterEmailId;
	@FindBy(css = "input#contact")
	public WebElement enterContactNo;
	@FindBy(css = "input#password")
	public WebElement enterPassword;
	@FindBy(css = "div.recaptcha-checkbox-border")
	public WebElement reCaptcha;
	@FindBy(css = "Label.form-check-label-dont-have")
	public WebElement lebeltext;
	@FindBy(css = "span.sign-up-accounthave")
	public WebElement singIn;
	@FindBy(css = "button[type='submit']")
	public WebElement signUp;
	@FindBy(css="input[type='checkbox']")
	public WebElement checkBox;
	@FindBy(css = "div.form-group a:nth-child(2)")
	public WebElement socialLoginGoogle;
	@FindBy(css = "div.form-group a:nth-child(3)")
	public WebElement socialLoginFacebook;
	@FindBy(css = "div.form-group a:nth-child(4)")
	public WebElement socialLoginFedration;

	public void clickOnHostMeetingLink() {
		keyword.click(hostMeetingLink);
	}

	public void clickOntryitForFree() {
		keyword.click(tryItFreeLink);
	}
}
