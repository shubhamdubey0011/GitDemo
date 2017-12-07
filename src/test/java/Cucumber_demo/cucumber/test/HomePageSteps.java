package Cucumber_demo.cucumber.test;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;


import Cucumber_demo.cucumber.pages.HomePage;
import cucumber.api.java.en.Then;


 
	public class HomePageSteps extends BaseTest
	{
		public WebDriver driver;
	    @Then("^she should be logged in to the application$")
	    public void she_should_be_logged_in_to_the_application() throws Throwable {
	        Assert.assertTrue(new HomePage(driver).isSignOutLinkDisplayed());
	    }
	}

