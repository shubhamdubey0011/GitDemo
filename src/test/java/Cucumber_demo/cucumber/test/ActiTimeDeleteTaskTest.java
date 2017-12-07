package Cucumber_demo.cucumber.test;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Cucumber_demo.cucumber.pages.ActiTimeDeletepage;
import util.ApplicationData;
import util.TestData;
import util.UIElements;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ActiTimeDeleteTaskTest extends BaseTest
{
	ApplicationData appData = new ApplicationData();
	UIElements uiElem = new UIElements();
	TestData testdata = new TestData();

	WebElement selectcustomerddl;

	
	@Given("^user should be on the tasks OpenTasks page$")
	public void user_should_be_on_the_tasks_OpenTasks_page() throws Throwable 
	{
		driver.findElement(By.xpath(uiElem.tasks_tab_locator)).click();
	    Assert.assertTrue(new ActiTimeDeletepage(driver).OpentaksPagetitile());
	}

	@Given("^verify there should be atleast one task created$")
	public void verify_there_should_be_atleast_one_task_created() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertNotNull(new ActiTimeDeletepage(driver).numOfTasks());
	}

	@When("^user selects the task to be deleted$")
	public void user_selects_the_task_to_be_deleted() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    new ActiTimeDeletepage(driver).selectTaskToBeDeteled();
	}

	@When("^clicks on Delete Selected task button$")
	public void clicks_on_Delete_Selected_task_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^verify an alert pop-up should show$")
	public void verify_an_alert_pop_up_should_show() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^from pop-up click on  Delete task button$")
	public void from_pop_up_click_on_Delete_task_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^task should be deleted$")
	public void task_should_be_deleted() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}


}
