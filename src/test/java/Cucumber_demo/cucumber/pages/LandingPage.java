package Cucumber_demo.cucumber.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Cucumber_demo.cucumber.test.BaseTest;

public class LandingPage extends BaseTest
{
	
	//1.Normal approach in which elements are tightly coupled which method
	
	/*WebDriver driver;

public LandingPage(WebDriver driver) 
{
    this.driver = driver;
}


public void she_chooses_to_sign_up() throws Throwable {
    driver.findElement(By.linkText("Sign up")).click();
}*/
	
	
	
	
	//2.abstracted variable from methods
	/*WebDriver driver;
	
	 By SignupButtonLocator= By.linkText("Sign up");
	 
	 public void she_chooses_to_sign_up() throws Throwable 
	 {
		    driver.findElement(SignupButtonLocator).click();
	 }
	 
*/	 
	//3.Page Factory approach
	WebDriver driver;
	 
	 @FindBy(linkText= "Sign up")
		private WebElement SignupButtonLocator;
	 
	 public LandingPage(WebDriver driver) {
		    this.driver = driver;
		    PageFactory.initElements(driver, this);
		}
	 
	 public void she_chooses_to_sign_up() throws Throwable 
	 {
		    
		 SignupButtonLocator.click();


	 }
	 
	 
}

