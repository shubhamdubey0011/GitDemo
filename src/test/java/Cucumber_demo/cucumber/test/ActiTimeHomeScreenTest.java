package Cucumber_demo.cucumber.test;

import org.testng.Assert;

import Cucumber_demo.cucumber.pages.ActiTimeHomePage;
import cucumber.api.PendingException;
import cucumber.api.java.en.Then;

public class ActiTimeHomeScreenTest extends BaseTest
{
	
	@Then("^verify Time-Track tab is present$")
	public void verify_Time_Track_tab_is_present() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
		Assert.assertTrue(new ActiTimeHomePage(driver).timeTrackTextTabExist());
		
		
	}
	@Then("^verify Tasks tab is present$")
	public void verify_Tasks_tab_is_present() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertTrue(new ActiTimeHomePage(driver).tasksTextTabExist());
	}

	@Then("^verify Reports tab is present$")
	public void verify_Reports_tab_is_present() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertTrue(new ActiTimeHomePage(driver).reportsTextTabExist());
	}

	@Then("^verify user tab is present$")
	public void verify_user_tab_is_present() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertTrue(new ActiTimeHomePage(driver).usersTextTabExist());
	}

	@Then("^verify Work-Schedule Tab is present$")
	public void verify_Work_Schedule_Tab_is_present() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertTrue(new ActiTimeHomePage(driver).workscheduleTextTabExist());
	}

	@Then("^verify these options are available Setting options, add-ons options and Help&support\\.$")
	public void verify_these_options_are_available_Setting_options_add_ons_options_and_Help_support() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertTrue(new ActiTimeHomePage(driver).settingsTabExist());
		Assert.assertTrue(new ActiTimeHomePage(driver).addonsTabExist());
		Assert.assertTrue(new ActiTimeHomePage(driver).helpTabExist());
	}


}
