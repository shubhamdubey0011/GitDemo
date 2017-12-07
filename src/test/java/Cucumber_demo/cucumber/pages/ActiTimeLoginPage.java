package Cucumber_demo.cucumber.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Cucumber_demo.cucumber.test.BaseTest;

public class ActiTimeLoginPage 
{

	protected static WebDriver driver;
	 
	 
	@FindBy(id="username")
    private WebElement usernametextboxlocator;
	
	@FindBy(name="pwd")
    private WebElement passwordlocator;
	 
	@FindBy(xpath="//div[contains(text(),'Login')]")
	               //title[contains(text(),'actiTIME - Login')]
	private WebElement loginButton;
	
	@FindBy(xpath="//div[@class='popup_menu_icon support_icon']")
	private WebElement helpOptionlocator;
	
	
	
	 public ActiTimeLoginPage(WebDriver driver) 
	 {
		    this.driver = driver;
		    PageFactory.initElements(driver, this);
		}
	  
	public void user_entered_the_user_name_as_admin(String username) {

		usernametextboxlocator.sendKeys(username);

	}

	public void user_enter_password_as_manager(String password)
			throws Throwable {
		passwordlocator.sendKeys(password);
	}
	
	public void clicks_on_login_Button() throws Throwable
	{
		
	loginButton.click();	
	
	}
	public void user_should_be_in_Homepage() throws Throwable 
	{
	
		String homepagetitle = driver.getTitle();
		   Assert.assertEquals("actiTIME - Enter Time-Track", homepagetitle);
		
	}
	
	public void verify_help_option() throws Throwable 
	{
	  helpOptionlocator.click();;
	}
	

}
