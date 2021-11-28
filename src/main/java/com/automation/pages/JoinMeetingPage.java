package com.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.automation.keywords.UIKeywords;

public class JoinMeetingPage {
	UIKeywords keyword = UIKeywords.getInstance();
//apprroch1	//@FindBy(css="h2.m-txt")
//public WebElement enterYourName;
	// public JoinMeetingPage() {
	// PageFactory.initElements(keyword.driver,this);
	// }
	// public String enterYourNameTitle() {
	// return enterYourName.getText();

	// }
	public By quickJoinMeetingTitle = By.cssSelector("h2.m-txt");
	public By enterYourName = By.cssSelector("input[autocomplete='off']");
	public By enterMeettingId=By.cssSelector("#meetingid");
	public By joinMeetingClick = By.cssSelector("#before_start");
public String getQuickJoinMeetingTitle() {
	return UIKeywords.getInstance().driver.findElement(quickJoinMeetingTitle).getText();
}
public WebElement enterYourNameSend() {
	return UIKeywords.getInstance().driver.findElement(enterYourName);
}
public WebElement getenterMeettingId() {
return UIKeywords.getInstance().driver.findElement(enterMeettingId);
}
public WebElement getjoinMeetingClick() {
return UIKeywords.getInstance().driver.findElement(joinMeetingClick);
}
}