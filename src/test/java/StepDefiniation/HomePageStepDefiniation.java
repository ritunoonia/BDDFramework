package StepDefiniation;

import org.junit.Assert;
import org.openqa.selenium.By;

import browserControl.BaseClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class HomePageStepDefiniation extends BaseClass {

	@Given("I am on Amazon home page")	
	public void i_am_on_Amazon_home_page() throws InterruptedException {
	    browser.get(baseUrl);
	    Thread.sleep(3000);
		
	}

	@Then("I should see {string} Title")
	public void i_should_see_Title(String expectedTitle) {
	  Assert.assertEquals(expectedTitle, browser.getTitle());
	}
	
	
	@Then("the page URL should be {string}")
	public void the_page_URL_should_be(String expectedUrl) {
	Assert.assertEquals(expectedUrl, browser.getCurrentUrl());
	}
	
	@When("I click on  {string} link")
	public void i_click_on_link(String linkText) throws InterruptedException {
		browser.findElement(By.linkText(linkText)).click();
		Thread.sleep(3000);
	 	}
}
