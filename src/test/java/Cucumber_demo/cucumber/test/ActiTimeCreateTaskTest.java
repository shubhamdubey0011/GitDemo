package Cucumber_demo.cucumber.test;

import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import util.ApplicationData;
import util.TestData;
import util.UIElements;
import Cucumber_demo.cucumber.pages.ActiTimeCreateTaskPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ActiTimeCreateTaskTest extends BaseTest {

	ApplicationData appData = new ApplicationData();
	UIElements uiElem = new UIElements();
	TestData testdata = new TestData();

	WebElement selectcustomerddl;

	@When("^user clicks on tasks tab$")
	public void user_clicks_on_tasks_tab() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath(uiElem.tasks_tab_locator)).click();

	}

	@Then("^user should be in Open-task page$")
	public void user_should_be_in_Open_task_page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		Assert.assertTrue(new ActiTimeCreateTaskPage(driver)
				.titleOpenTaksExist());
	}

	@Then("^clicks on create tasks button$")
	public void clicks_on_create_tasks_button() throws Throwable {
		driver.findElement(By.xpath(uiElem.create_tasks_btm_locator)).click();

	}

	@Then("^verify the text of pop-up$")
	public void verify_the_text_of_pop_up() throws Throwable {

		String parentWindows = driver.getWindowHandle();
		Set<String> handles = driver.getWindowHandles();

		for (String windowHandle : handles) {
			if (!windowHandle.equals(parentWindows)) {
				driver.switchTo().window(windowHandle);

				Thread.sleep(5000);
				boolean ele = driver
						.findElement(
								By.xpath("//table[@class='dialog-header']/descendant::tbody/descendant::tr/descendant::td/descendant::div[@class='lightBoxTitle']"))
						.isDisplayed();
				System.out.println("Element is present " + ele);

			}

		}
		// Write code here that turns the phrase above into concrete actions
		// throw new PendingException();
	}

	@Then("^create new task page will open$")
	public void create_new_task_page_will_open() throws Throwable {

	}

	@Then("^Select new customer$")
	public void select_new_customer() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

		Thread.sleep(3000);
		driver.findElement(
				By.xpath("//button[contains(text(),'Select Customer')]"))
				.click();
		;
		driver.findElement(
				By.xpath("(//a[contains(text(),' New Customer ')])[1]"))
				.click();

	}

	@Then("^Enter Customer name & project name$")
	public void enter_Customer_name_project_name() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(
				By.xpath("//input[@id='createTasksPopup_newCustomer']"))
				.sendKeys("COMCAST1");

		driver.findElement(
				By.xpath("//input[@id='createTasksPopup_newProject']"))
				.sendKeys("CHANNEL_STORE1");

	}

	@Then("^enter task name ,enter text ,set deadline$")
	public void enter_task_name_enter_text_set_deadline() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

		// Enter Task name
		driver.findElement(
				By.xpath("//div[@id='createTasksPopup_createTasksTableContainer']/table/tbody/tr[1]/td[1]/input"))
				.sendKeys("QA");

		// Text box
		driver.findElement(By.xpath("(//a[@id='descriptionElement']/img)[1]"))
				.click();

		// Enter text in the textbox
		driver.findElement(
				By.xpath("//textarea [@id='editDescriptionPopupText']"))
				.sendKeys("This is just for testing purpose ....");

		// Click on OK
		driver.findElement(By.xpath("//input[@id='scbutton']")).click();

		// calender select date
		driver.findElement(By.xpath("(//td[@class='x-btn-center']/em/button)[3]"))
				.click();

		// Click on calender ok button
		driver.findElement(By.xpath("(//ul[@class='x-menu-list']/li/div/table/tbody/tr[3]/td/table/tbody/tr/td[1]/em/button)[1]")).click();

	}

	@Then("^select billable billing type$")
	public void select_billable_billing_type() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

		// select billing typw
		driver.findElement(By.xpath("(//button[text()='Non-Billable'])[1]")).click();

		// checkbox
		driver.findElement(
				By.xpath("//div[@id='createTasksPopup_createTasksTableContainer']/table/tbody/tr[1]/td[5]/div/input"))
				.click();

	}

	@Then("^click on create task$")
	public void click_on_create_task() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

		// click on create task button
		driver.findElement(
				By.xpath("//div[@id='createTasksPopup_commitBtn']/div/span"))
				.click();
	}
}
