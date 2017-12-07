package Cucumber_demo.cucumber.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import util.ApplicationData;
import util.UIElements;

public class ActiTimeDeletepage extends UIElements {

	WebDriver driver;
	ApplicationData appData = new ApplicationData();

	public ActiTimeDeletepage(WebDriver driver) {
		this.driver = driver;
	}

	public boolean OpentaksPagetitile() {

		String actualTitle = driver.getTitle();
		System.out.println("Actual Title is :: " + actualTitle);
		String expectedTitle = appData.open_tasks_title;
		if (expectedTitle.equals(actualTitle))
			return true;
		else
			return false;

	}

	public int numOfTasks() {

		WebElement taskscount = driver.findElement(By
				.xpath("//table/tbody/tr/td[@class='text']/span"));
		String taskCount = taskscount.getText();
		int number = Integer.parseInt(taskCount);
		System.out.println("Number of task created ::" + taskCount);
		return number;

	}

	@FindBy(xpath = "//table/tbody/tr[3]/td[7]/input[@name='taskSelected[4]']")
	private WebElement taskcheckBox;

	public void selectTaskToBeDeteled() throws Throwable {
		taskcheckBox.click();

	}
}
