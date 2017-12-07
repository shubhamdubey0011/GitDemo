package Cucumber_demo.cucumber.test;

import org.testng.Assert;

import Cucumber_demo.cucumber.pages.ActiTimeLoginScreenPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class ActiTimeLoginScreenTest extends BaseTest {

	@Given("^User navigtes to actitime loginscreen$")
	public void user_navigtes_to_actitime_loginscreen() throws Throwable {

		createNewDriverInstance();
		driver.get("http://localhost:8080/login.do");
	}

	@Then("^user verify the title,textfield of username,Password ,login button and  keep me logged in$")
	public void user_verify_the_title_textfield_of_username_Password_login_button_and_keep_me_logged_in()
			throws Throwable {
		Assert.assertTrue(new ActiTimeLoginScreenPage(driver)
				.titleActiTimeExist());
		Assert.assertTrue(new ActiTimeLoginScreenPage(driver)
				.identifyYourSelfTextExist());
		Assert.assertTrue(new ActiTimeLoginScreenPage(driver)
				.usernametextBoxExist());
		Assert.assertTrue(new ActiTimeLoginScreenPage(driver)
				.passwordtextBoxExist());
		Assert.assertTrue(new ActiTimeLoginScreenPage(driver)
				.keepMeCheckBoxExist());
		Assert.assertTrue(new ActiTimeLoginScreenPage(driver).keepMeLogintext());
		Assert.assertTrue(new ActiTimeLoginScreenPage(driver)
				.LoginButtonExist());
		Assert.assertTrue(new ActiTimeLoginScreenPage(driver)
				.actiTime2015txtExist());
		Assert.assertTrue(new ActiTimeLoginScreenPage(driver)
				.viewLicLinkExist());
		Assert.assertTrue(new ActiTimeLoginScreenPage(driver)
				.actiMindLinkExist());

	}

	@Then("^close the browser$")
	public void close_the_browser() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

		genFunc.closeBrowser(driver);
	}
}
