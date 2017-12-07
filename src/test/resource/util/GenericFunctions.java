package util;


import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class GenericFunctions extends UIElements
{

	
     WebDriver driver;
	
	WebElement gmailShare, txtEmailID, btnSend, descVideo;
	//ApplicationData data = new ApplicationData();
	TestData test_data = new TestData();
	static int counter = 0;
		
	public GenericFunctions(WebDriver driver)
	{
		this.driver = driver;		
	}
	//For alert to click on ok(accept)
	public static void acceptAlert(WebDriver driver)
	{
		Alert alt = driver.switchTo().alert();
		alt.accept();
	}
	//For alert to click on cancel(dimiss)
	public static void dismissAlert(WebDriver driver)
	{
		Alert alt = driver.switchTo().alert();
		alt.dismiss();
	}
	//to the text from an alert
	public static String getAlertText(WebDriver driver)
	{
		Alert alt = driver.switchTo().alert();
		return alt.getText();
	}
	
	//For drop down list Using select ,selecting by index
	public static void selectDDLByIndex(WebElement element,int index)
	{
		Select sct = new Select(element);
		sct.selectByIndex(index);
	}
	//For drop down list ,Using select ,selecting by value
	public static void selectDDLByValue(WebElement element,String value)
	{
		Select sct = new Select(element);
		sct.selectByValue(value);
	}
	//For drop down list,Using select ,selecting by visible text
	public static void selectDDLByVisibleText(WebElement element,String text)
	{
		Select sct = new Select(element);
		sct.selectByVisibleText(text);
	}
	//For drop down list,Using select ,verifying DDL is multilpe select or not
	public static boolean checkDDL(WebElement element)
	{
		Select sct = new Select(element);
		return sct.isMultiple();
	}
	//Performing mouseover action
	public static void mouseOver(WebDriver driver, WebElement element)
	{
		Actions act = new Actions(driver);
		act.moveToElement(element).perform();
	}
	
	//For moving control to iframe
	public static void iframe(WebDriver driver, WebElement element)
	{
		driver.switchTo().frame(element);
		
		
	}
	//In case of multiple iframes ,switching control from multiple iframes to a particular iframe
	public static void iframe(WebDriver driver,String frameId)
	{
		driver.switchTo().frame(frameId);
		
	}
	//In case of multiple iframes ,switching control from multiple iframes to a particular iframe index
	public static void iframe(WebDriver driver, int frameindex)
	{
		driver.switchTo().frame(frameindex);
		
		
	}
	
	/*
	 Scrolling Action to a particular element
	 */
	public static void scrollToAnElement(WebDriver driver, WebElement element)
	
	{
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].scrollIntoView();", element);
		
		
	}
	
	/*
	 * Scroll down to Bottom a page
	 */
	
	public static void scrollDownToBottom(WebDriver driver)
	{
		JavascriptExecutor jse = ((JavascriptExecutor) driver);
		
		jse.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		
		
	}
	
	/*
	 * Scroll Up to Top a page
	 */
    public static void scrollUpToTop(WebDriver driver)
	{
		JavascriptExecutor jse = ((JavascriptExecutor) driver);
		
		jse.executeScript("window.scrollTo( document.body.scrollHeight,0)");
		
	}
	
	/*
	 * Scroll page Up
	 */
	public static void scrollPageUp(WebDriver driver)
	{
		JavascriptExecutor jse = (JavascriptExecutor) driver;
	    
		jse.executeScript("window.scrollBy(0,250)", "");
		
	}
	
	/*
	 * Scroll page Down
	 */
	
	public static void scrollPageDown(WebDriver driver)
	{
		JavascriptExecutor jse = (JavascriptExecutor) driver;
	   
		jse.executeScript("window.scrollBy(0,-250)", "");
		
	}
	
	

public static void closeBrowser(WebDriver driver)
{
	driver.quit();


}
}
