package Cucumber_demo.cucumber.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.ApplicationData;
import util.UIElements;

public class ActiTimeHomePage extends UIElements {
	WebDriver driver;
	ApplicationData appData = new ApplicationData();

	WebElement timetracktabTxt, taskstabTxt, reportstabTxt, userstabTxt,
			workscheduletabTxt, settingstab, add_onstab,helptab;

	public ActiTimeHomePage(WebDriver driver) {
		this.driver = driver;
	}

	public Boolean timeTrackTextTabExist() {

		timetracktabTxt = driver.findElement(By.xpath(time_track_tab_text));
		if (timetracktabTxt.isDisplayed()
				&& (timetracktabTxt.getText()
						.equalsIgnoreCase(appData.timetrack_tab_text)))
			return true;
		else
			return false;

	}

	public Boolean tasksTextTabExist() {

		taskstabTxt = driver.findElement(By.xpath(tasks_tab_text));
		if (taskstabTxt.isDisplayed()
				&& (taskstabTxt.getText()
						.equalsIgnoreCase(appData.tasks_tab_text)))
			return true;
		else
			return false;

	}

	public Boolean reportsTextTabExist() {

		reportstabTxt = driver.findElement(By.xpath(reports_tab_text));
		if (reportstabTxt.isDisplayed()
				&& (reportstabTxt.getText()
						.equalsIgnoreCase(appData.reports_tab_text)))
			return true;
		else
			return false;

	}

	public Boolean usersTextTabExist() {

		userstabTxt = driver.findElement(By.xpath(users_tab_text));
		if (userstabTxt.isDisplayed()
				&& (userstabTxt.getText()
						.equalsIgnoreCase(appData.users_tab_text)))
			return true;
		else
			return false;

	}

	public Boolean workscheduleTextTabExist() {

		workscheduletabTxt = driver
				.findElement(By.xpath(workSchedule_tab_text));
		if (workscheduletabTxt.isDisplayed()
				&& (workscheduletabTxt.getText()
						.equalsIgnoreCase(appData.work_schedule_tab_text)))
			return true;
		else
			return false;

	}

	public Boolean settingsTabExist() {

		settingstab = driver.findElement(By.xpath(settings_tab));
		if (settingstab.isDisplayed())
			return true;
		else
			return false;

	}

	public Boolean addonsTabExist() {

		add_onstab = driver.findElement(By.xpath(add_on_tab));
		if (add_onstab.isDisplayed())
			return true;
		else
			return false;

	}
	
	public Boolean helpTabExist() {

		helptab = driver.findElement(By.xpath(help_tab));
		if (helptab.isDisplayed())
			return true;
		else
			return false;

	}

}
