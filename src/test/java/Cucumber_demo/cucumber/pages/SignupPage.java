package Cucumber_demo.cucumber.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Cucumber_demo.cucumber.test.BaseTest;

public class SignupPage extends BaseTest {

	
	//Simple approach which could cause duplication and maintenance overhead because right now these elements locators 
	//are tightly coupled with methods 
	
	/*WebDriver driver;

	public SignupPage(WebDriver driver) {
		this.driver = driver;
	}

	public void she_provides_the_first_name_as(String firstName)
			throws Throwable {
		driver.findElement(By.id("user_first_name")).sendKeys(firstName);
	}

	public void she_provides_the_last_name_as(String lastName) throws Throwable {
		driver.findElement(By.id("user_last_name")).sendKeys(lastName);
	}

	public void she_provides_the_email_as(String email) throws Throwable {
		driver.findElement(By.id("user_email")).sendKeys(email);
	}

	public void she_provides_the_password_as(String password) throws Throwable {
		driver.findElement(By.id("user_password")).sendKeys(password);
	}

	public void she_provides_the_confirm_password_again_as(
			String confirmPassword) throws Throwable {
		driver.findElement(By.id("user_password_confirmation")).sendKeys(
				confirmPassword);
	}

	public void she_signs_up() throws Throwable {
		driver.findElement(By.name("commit")).click();
	}*/
	
	
	
	//2.Abstracting the elements from the methods 
	/*WebDriver driver;

	By firstNameTextBoxLocator = By.id("user_first_name");
	By lastNameTextBoxLocator = By.id("user_last_name");
	By emailTextBoxLocator = By.id("user_email");
	By passwordTextBoxLocator = By.id("user_password");
	By confirmPasswordTextBoxLocator = By.id("user_password_confirmation");
	By signupButtonLocator = By.name("commit");

	public SignupPage(WebDriver driver) {
		this.driver = driver;
	}

	public void she_provides_the_first_name_as(String firstName)
			throws Throwable {
		driver.findElement(firstNameTextBoxLocator).sendKeys(firstName);
	}

	public void she_provides_the_last_name_as(String lastName) throws Throwable {
		driver.findElement(lastNameTextBoxLocator).sendKeys(lastName);
	}

	public void she_provides_the_email_as(String email) throws Throwable {
		driver.findElement(emailTextBoxLocator).sendKeys(email);
	}

	public void she_provides_the_password_as(String password) throws Throwable {
		driver.findElement(passwordTextBoxLocator).sendKeys(password);
	}

	public void she_provides_the_confirm_password_again_as(
			String confirmPassword) throws Throwable {
		driver.findElement(confirmPasswordTextBoxLocator).sendKeys(
				confirmPassword);
	}

	public void she_signs_up() throws Throwable {
		driver.findElement(signupButtonLocator).click();
	}*/
	

	//3.Page Factory Method 
	

	@FindBy(id = "user_first_name")
	private WebElement firstNameTextBox;

	@FindBy(id = "user_last_name")
	private WebElement lastNameTextBox;

	@FindBy(id = "user_email")
	private WebElement emailTextBox;

	@FindBy(id = "user_password")
	private WebElement passwordTextBox;

	@FindBy(id = "user_password_confirmation")
	private WebElement confirmPasswordTextBox;

	@FindBy(name = "commit")
	private WebElement signupButton;
	
	
	
	public SignupPage(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(this.driver, this);
	}
	
	public void she_provides_the_first_name_as(String firstName)
			throws Throwable {

		firstNameTextBox.sendKeys(firstName);

	}
	
	
	public void she_provides_the_last_name_as(String lastName) throws Throwable {
	    lastNameTextBox.sendKeys(lastName);
	}

	public void she_provides_the_email_as(String email) throws Throwable {
	    emailTextBox.sendKeys(email);
	}

	public void she_provides_the_password_as(String password) throws Throwable {
	    passwordTextBox.sendKeys(password);
	}

	public void she_provides_the_confirm_password_again_as(String confirmPassword) throws Throwable {
	    confirmPasswordTextBox.sendKeys(confirmPassword);
	}


	public void she_signs_up() throws Throwable {
	    signupButton.click();
	}

}
