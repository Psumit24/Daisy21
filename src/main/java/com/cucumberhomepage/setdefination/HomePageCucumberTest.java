package com.cucumberhomepage.setdefination;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

import com.automation.config.Application;
import com.automation.keywords.UIKeywords;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class HomePageCucumberTest {
	UIKeywords keyword = UIKeywords.getInstance();
	public RemoteWebDriver driver = null;

	@Before
	public void setUpp() {
		Application app = new Application();
		String browserName = app.getBrowser();
		keyword.OpenBrow(browserName);
		this.driver = keyword.getDriver();
		driver.get(app.getAppURL());
	}

	@After
	public void tearDown() {
		driver.quit();
	}
	 

	@Given("The chrome browser is launched")
	public void the_chrome_browser_is_launched() {
		/*Application app = new Application();
		String browserName = app.getBrowser();
		keyword.OpenBrow(browserName);
		this.driver = keyword.getDriver();
		
		 */
System.out.println("Chrome Broweser is lunched using cucumber Hooks");
	}

	@And("The Url of app is also launched")
	public void the_Url_of_app_is_also_launched() {
		/*Application app = new Application();
		driver.get(app.getAppURL());
		*/
System.out.println("URL is launched sing cucumber Hooks");
	}

	@Then("verify title of the pages")
	public void verify_title_of_the_pages() {
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, "IJmeet");
		System.out.println("Hello2");

	}
}
