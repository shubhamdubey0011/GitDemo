package Cucumber_demo.cucumber.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Cucumber_demo.cucumber.test.BaseTest;

public class HomePage extends BaseTest{

	//1.Normal Approach
/*WebDriver driver;

	public HomePage(WebDriver driver) {
	    this.driver = driver;
	}

	public boolean isSignOutLinkDisplayed() throws Throwable {
	   return driver.findElement(By.cssSelector("a[href='/users/sign_out']")).isDisplayed();
	}*/
	
	//2.
	/*WebDriver driver;
    By	signoutlink=By.cssSelector("a[href='/users/sign_out']");
    public HomePage(WebDriver driver) {
		this.driver = driver;
	}
    
    public boolean isSignOutLinkDisplayed() throws Throwable 
    {
 	   return  driver.findElement(signoutlink).isDisplayed();

	
    }*/
    
    //3.Page factory model 
	
    
	WebDriver driver;
    @FindBy(css="signoutlink")
    private WebElement signoutlink;
    
    public HomePage(WebDriver driver)
    {
	
    	this.driver = driver;
	}
    
    
    public boolean isSignOutLinkDisplayed() throws Throwable 
    {
 	   return  signoutlink.isDisplayed();

	
    }
    
    
    
	
}
