package Cucumber_demo.cucumber.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import util.ApplicationData;
import util.UIElements;

public class ActiTimeCreateTaskPage extends UIElements 
{
	WebDriver driver;
	ApplicationData appData = new ApplicationData();

	WebElement timetracktabTxt, taskstabTxt, reportstabTxt, userstabTxt,
			workscheduletabTxt, settingstab, add_onstab,helptab;

	public ActiTimeCreateTaskPage(WebDriver driver) 
	{
		this.driver = driver;
	}


	
	public Boolean titleOpenTaksExist() {
		String actualTitle = driver.getTitle();
		System.out.println("actual title is " + actualTitle);
		String expectedTitle = appData.open_tasks_title ;

		if (expectedTitle.equals(actualTitle))

			// System.out.println("The page tile is true");
			return true;
		else
			// System.out.println("The page tile is false");
			return false;

	}
	
	
	
	public Boolean createOpenTaksPageExist()
	{
		
		String createnewTasktxt = driver.findElement(By.xpath("//table[@class='dialog-header']/descendant::div[@class='lightBoxTitle']")).getText();
		System.out.println("Create Task Page  heading is" + createnewTasktxt);
		String expectedheading = appData.create_new_customer_txt ;

		if (expectedheading.equals(createnewTasktxt))

			// System.out.println("The page tile is true");
			return true;
		else
			// System.out.println("The page tile is false");
			return false;

	}
	
	public void selectCustomerddl(WebElement element) 
	{
		
	Select select = new Select(element);	
	select.selectByVisibleText(appData.new_customer_txt);
		

		
		
			

	}
	
	
	
	
}
