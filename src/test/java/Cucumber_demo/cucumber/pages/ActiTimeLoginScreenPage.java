package Cucumber_demo.cucumber.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.ApplicationData;
import util.UIElements;

public class ActiTimeLoginScreenPage extends UIElements {

	WebDriver driver;
	ApplicationData appData = new ApplicationData();
	WebElement actitimeTxt, identifytextTxt, usernameTxtbox, passwordTxtbox,
			checkbox, keepmeloginTxt, keepmeloginbtn, actitime2015txt, liclink,
			actimindlink;

	public ActiTimeLoginScreenPage(WebDriver driver) {
		this.driver = driver;
	}

	public Boolean titleActiTimeExist() {
		String actualTitle = driver.getTitle();
		System.out.println("actual title is " + actualTitle);
		String expectedTitle = "actiTIME - Login";

		if (expectedTitle.equals(actualTitle))

			// System.out.println("The page tile is true");
			return true;
		else
			// System.out.println("The page tile is false");
			return false;

	}

	public Boolean identifyYourSelfTextExist() {

		identifytextTxt = driver.findElement(By.xpath(Identify_Txt_Actitime));
		if (identifytextTxt.isDisplayed()
				&& (identifytextTxt.getText()
						.equalsIgnoreCase(appData.identify_text_Actitime)))
			return true;
		else
			return false;

	}

	public Boolean usernametextBoxExist() {

		usernameTxtbox = driver.findElement(By.xpath(Username_txtBox));
		if (usernameTxtbox.isDisplayed())

			return true;
		else
			return false;

	}

	public Boolean passwordtextBoxExist() {

		passwordTxtbox = driver.findElement(By.xpath(Password_txtBox));
		if (passwordTxtbox.isDisplayed())

			return true;
		else
			return false;

	}

	public Boolean keepMeCheckBoxExist() {

		checkbox = driver.findElement(By.xpath(keepme_logged_in_chkBox));
		if (checkbox.isDisplayed())

			return true;
		else
			return false;

	}

	public Boolean keepMeLogintext() {

		keepmeloginTxt = driver.findElement(By.xpath(keepme_logged_in_text));
		if (keepmeloginTxt.isDisplayed())

			return true;
		else
			return false;

	}

	public Boolean LoginButtonExist() {

		keepmeloginbtn = driver.findElement(By.xpath(keepme_login_button));
		if (keepmeloginbtn.isDisplayed())

			return true;
		else
			return false;

	}

	public Boolean actiTime2015txtExist() {

		actitime2015txt = driver.findElement(By.xpath(Actitime_2015_txt));
		if (actitime2015txt.isDisplayed())

			return true;
		else
			return false;

	}

	public Boolean viewLicLinkExist() {

		liclink = driver.findElement(By.xpath(ViewLicLink));
		if (liclink.isDisplayed())

			return true;
		else
			return false;

	}

	public Boolean actiMindLinkExist() {

		actimindlink = driver.findElement(By.xpath(ActiMindLink));
		if (actimindlink.isDisplayed())

			return true;
		else
			return false;

	}

}
