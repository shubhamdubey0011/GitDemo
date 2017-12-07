package Cucumber_demo.cucumber.test;


import Cucumber_demo.cucumber.pages.LandingPage;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class LandingPageSteps extends BaseTest
{
	//hooks
		@Before
	    public void beforeScenario()
		{
			driver = new BaseTest().getDriver();
	        System.out.println("this will run before the actual scenario");
	    }

		
		//hooks
	    @After
	    public void afterScenario()
	    {
	    	new BaseTest().destroyDriver();
	        System.out.println("this will run after scneario is finished, even if it failed");
	    }
	@Given("^the user is on landing page$")
	public void setup()throws Throwable
	{
		
	     //BaseTest.browsersetup();
		new LandingPage(driver).createNewDriverInstance();
		driver.get("http://accountsdemo.herokuapp.com");
		
	}
	
	
	/*//Tagged hooks
    @Before("Signup-DataDriven")
    public void signupSetup(){
        System.out.println("This should run everytime before any of the @Signup-DataDriven tagged scenario is going to run");
    }
	//Tagged hooks
    @After("Signup-DataDriven")
    public void signupTeardown(){
        System.out.println("This should run everytime after any of the @Signup-DataDriven tagged scenario has run");
    }*/

	@When("^she chooses to sign up$")
	public void she_chooses_to_sign_up() throws Throwable {
		new LandingPage(driver).she_chooses_to_sign_up();
	}
	


}
