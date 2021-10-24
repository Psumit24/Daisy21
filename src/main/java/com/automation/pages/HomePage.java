package com.automation.pages;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automation.keywords.UIKeywords;

public class HomePage {
	UIKeywords keyword = UIKeywords.getInstance();
	//@CacheLookup //use when project freez UI not change
	@FindBy(css = "div#navbarContent li:nth-child(1)")
	public WebElement joinMeetingTab;
	public WebElement navbarContent;//id and name consider when use PageFactory
	// @FindBy(how=How.CSS,using="div.footer-last-view-support div:nth-child(3) li
	// a")
	@FindBy(css = "div.footer-last-view-support div:nth-child(3) li a")
	public List<WebElement> infoLinks;

	/**
	 * using method we need to create object to call method and also using
	 * constructor is not good choice hence we use find by annotations by testng
	 * 
	 */
	public HomePage() {
		PageFactory.initElements(keyword.driver, this);
	}

	/**
	 * this.joinMeetingTab = keyword.driver.findElement(By.cssSelector("
	 * a[href='https://ijmeet.com/app?csrt=17063641916987114431']"));} public void
	 * setJoinMeetingTab(WebElement joinMeetingTab) { this.joinMeetingTab =
	 * keyword.driver.findElement(By.cssSelector("
	 * a[href='https://ijmeet.com/app?csrt=17063641916987114431']"));}
	 * 
	 */

	public void clickOnJoinMeetingTab() {
		joinMeetingTab.click();

	}

	public void getTextOfInfoLinks() {
		Iterator<WebElement> itr = infoLinks.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next().getText());
		}
			}
	public void rightClickOnnavbarContent() {
Actions act =new Actions(keyword.driver);
act.contextClick(navbarContent).build().perform();
	}
	
}
