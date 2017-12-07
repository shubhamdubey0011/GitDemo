package Cucumber_demo.cucumber.test;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import util.GenericFunctions;
import util.PropertyReader;


public class BaseTest 
{

	
	GenericFunctions genFunc = new GenericFunctions(driver);
	public static WebDriver driver;
	


	public BaseTest() {
		initialize();
	}

	public void initialize() 
	{
		if (driver == null)
			createNewDriverInstance();
	}

	public WebDriver getDriver() {
		return driver;
	}

	public void createNewDriverInstance() {
		String browser = new PropertyReader().readProperty("browser");
		
		if (browser.equals("firefox")) {

			File path = new File("");
			String fileLocation = path.getAbsolutePath()
					+ "/src/test/resource/drivers/" + "geckodriver.exe";
			System.out.println("Location :  " + fileLocation);
			System.setProperty("webdriver.gecko.driver", fileLocation);
			// driver = new ChromeDriver();

			// System.setProperty("webdriver.gecko.driver",
			// "F:/Java_LAB_Workspace/cucumber/src/test/resource/drivers/geckodriver.exe");

			driver = new FirefoxDriver();
			
			//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		}
		   
		  else if (browser.equalsIgnoreCase("chrome")) 
		  { 

			  // Here I am setting up the path for my chromedriver
			  
			  File path = new File("");
				String fileLocation = path.getAbsolutePath()
						+ "/src/test/resource/drivers/" + "chromedriver.exe";
				System.out.println("Location :  " + fileLocation);
				System.setProperty("webdriver.chrome.driver", fileLocation);

			  //System.setProperty("webdriver.chrome.driver", "F:/NewFramework/Code/WatchableAutomation/webclient/src/main/resources/drivers/chromedriver.exe");

			  //System.setProperty("webdriver.gecko.driver",
						//"src\\main\\resources\\drivers\\geckodriver.exe");
			  driver=new ChromeDriver();

		  } 
		
		  else if (browser.equalsIgnoreCase("ie")) { 

			  // Here I am setting up the path for my IEDriver

			  System.setProperty("webdriver.ie.driver", "D:/Framework/Desktop/Watchable/resources/IEDriverServer.exe");

			  driver = new InternetExplorerDriver();

		  }


	}
@AfterClass
	public void destroyDriver() {
		//driver.quit();
		driver = null;
	}

	/*
	 * public static void browsersetup() {
	 * 
	 * File path = new File(""); String fileLocation = path.getAbsolutePath() +
	 * "/src/test/resource/drivers/" + "geckodriver.exe";
	 * System.out.println("Location :  " + fileLocation);
	 * System.setProperty("webdriver.gecko.driver", fileLocation); // driver =
	 * new ChromeDriver();
	 * 
	 * // System.setProperty("webdriver.gecko.driver", //
	 * "F:/Java_LAB_Workspace/cucumber/src/test/resource/drivers/geckodriver.exe"
	 * );
	 * 
	 * driver = new FirefoxDriver();
	 * 
	 * driver.get("http://accountsdemo.herokuapp.com");
	 * 
	 * // driver.get("http://localhost:8080/login.do"); // actiTime //
	 * driver.manage().window().maximize();
	 * 
	 * // driver.get("http://accountsdemo.herokuapp.com");
	 * driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	 * 
	 * }
	 */

}
