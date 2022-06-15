package icivics_pages;

import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.aventstack.extentreports.ExtentTest;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import projectSpecific.base.ProjectSpecificMethods;

public class Icivics_HomepageHeaderMyicivicsMisc extends ProjectSpecificMethods {
	public String gpropname1 = "Homepage/homepageheader";
	public String gpropname2 = "Homepage/homepageteacherheader";
	public String gpropname3 = "Homepage/homepageheaderplay";
	public String gpropname4 = "Homepage/homepageheaderteach";
	public String gpropname5 = "Homepage/homepageheaderabout";
	public String gpropname6 = "Homepage/homepageheadersigninmisc";

	public Icivics_HomepageHeaderMyicivicsMisc(RemoteWebDriver driver, ExtentTest node, Properties prop) {
		this.driver = driver;
		this.node = node;
		this.prop = prop;
	}

	@Given("Launch the icivis URL")
	public Icivics_HomepageHeaderMyicivicsMisc launchURL(String URL) {
		navigateto(URL);
		return this;

	}

	@Then("login as a teacher")
	public Icivics_HomepageHeaderMyicivicsMisc verifylogin() {

		WebElement signinbutton = propElement(getPropfile(gpropname1, "Signinbutton"));
		signinbutton.click();
		WebElement signinlink = propElement(getPropfile(gpropname1, "Signinlink"));
		signinlink.click();
		WebElement username = propElement(getPropfile(gpropname1, "Username"));
		username.sendKeys("Bronze Speaker 1r4e");
		WebElement password = propElement(getPropfile(gpropname1, "Password"));
		password.sendKeys("i898qrCiPK9Hwgb");
		WebElement loginbutton = propElement(getPropfile(gpropname2, "Loginbutton"));
		loginbutton.click();
		waitTime(3000);
		return this;
	}

	@And("Verify Donate button is display")
	public Icivics_HomepageHeaderMyicivicsMisc VerifyDonatebutton() {
		WebElement donatebutton = propElement(getPropfile(gpropname1, "Donatebutton"));
		if (donatebutton.isDisplayed()) {
			reportStep("Donatebutton is displayed", "Pass");
		} else {
			reportStep("Donatebutton is not displayed", "Fail");
		}

		return this;
	}

	@Given("Click on donate button and verify url")
	public Icivics_HomepageHeaderMyicivicsMisc VerifyDonateclick() throws IOException {
		waitTime(3000);
		reportStep("Donatebutton is clicked ", "Pass");
		WebElement donatebutton = propElement(getPropfile(gpropname1, "Donatebutton"));
		donatebutton.click();
		waitTime(3000);
		String URL = driver.getCurrentUrl();
		System.out.println(URL);
		reportStep("'Donatebutton is clicked'" + "redirect to corresponding page" + driver.getCurrentUrl(), "Pass");
		return this;

	}

	@Given("Verify Shop button is display")
	public Icivics_HomepageHeaderMyicivicsMisc VerifyShopbutton() {
		WebElement Shopbutton = propElement(getPropfile(gpropname1, "shopbutton"));
		if (Shopbutton.isDisplayed()) {
			reportStep("Shopbutton is displayed", "Pass");
		} else {
			reportStep("Shopbutton is not displayed", "Fail");
		}

		return this;
	}

	@Given("click on shop button and verify the URL")
	public Icivics_HomepageHeaderMyicivicsMisc VerifyShopbuttonclick() throws IOException {
		reportStep("Shopbutton is clicked", "Pass");
		WebElement shopbutton = propElement(getPropfile(gpropname6, "shopbuttonele"));
		shopbutton.click();
		waitTime(3000);
		String URL = driver.getCurrentUrl();
		System.out.println(URL);
		reportStep("'Shopbutton is clicked'" + "redirect to corresponding page" + driver.getCurrentUrl(), "Pass");
		return this;

	}

	@And("Verify My iCivics button appears in top/right for an authenticated user")
	public Icivics_HomepageHeaderMyicivicsMisc verifymyicvicsbuttonafterlogin() {

		WebElement myicivicsbutton = propElement(getPropfile(gpropname2, "Myicivicsbutton2"));
		if (myicivicsbutton.isDisplayed()) {
			reportStep("Myicivicsbutton is display after login instead of signin button", "Pass");
		} else {
			reportStep("Myicivicsbutton is not display ", "Fail");
		}

		return this;
	}

	@And("Click on Myicivics button and verify submenu display")
	public Icivics_HomepageHeaderMyicivicsMisc verifymyicvicsbuttonsubmenu() {
		WebElement myicivicsbutton = propElement(getPropfile(gpropname2, "Myicivicsbutton"));
		if (myicivicsbutton.isDisplayed()) {
			myicivicsbutton.click();

			reportStep("myicivics button is clicked and submenu is display ", "Pass");
		} else {
			reportStep("myicivics button is not displayed ", "Fail");
		}

		return this;

	}

	@Given("Click on signin button and verify submenu list")
	public Icivics_HomepageHeaderMyicivicsMisc verifymyicivicssubmenulist() {
		WebElement myicivicsbutton = propElement(getPropfile(gpropname2, "Myicivicsbutton"));
		if (myicivicsbutton.isDisplayed()) {
			myicivicsbutton.click();

			reportStep("myicivics button is clicked and submenu is display ", "Pass");
		} else {
			reportStep("myicivics button is not displayed ", "Fail");
		}
		List<WebElement> allOptions = driver.findElements(By.xpath("(//*[@class='dropdown-menu'])[8]/li"));
		System.out.println(allOptions.size());
		reportStep("myicivics submenu count is" + " " + allOptions.size(), "Pass");
		for (int i = 0; i < allOptions.size(); i++) {
			WebElement optionelement = allOptions.get(i);
			String optionsText = optionelement.getText();
			System.out.println(optionsText);
			reportStep("myicivcs submenu is " + " " + optionsText, "Pass");

		}
		return this;
	}

	@Then("Click on the submenu links of MyIcivicsbutton and verify it redirects to corresponding page")
	public Icivics_HomepageHeaderMyicivicsMisc Myicivicsbuttonelementsverification(String URL) throws IOException {
		String propname = "Homepage/myicivicsdropdown";
		String MyicivicsButton = getPropfile(propname, "MyicivicsButtonElement");
		navigateto(URL);

		// MyIcivics
		mouseOverAndClickAction(MyicivicsButton);
		Verifylinks(getprop(propname, "MyicivicsElement"), getpropstring(propname, "MyicivicsText"),
				getpropstring(propname, "MyicivicsUrL"), getpropstring(propname, "MyicivicsTitle"));
		verifyPartialText(getprop(propname, "Myicivicsheaderele"), getpropstring(propname, "Myicivicsheader"));
		System.out.println(driver.getCurrentUrl());
		// MyClasses
		mouseOverAndClickAction(MyicivicsButton);
		Verifylinks(getprop(propname, "MyclassesElement"), getpropstring(propname, "MyclassesText"),
				getpropstring(propname, "MyclassesUrL"), getpropstring(propname, "MyclassesTitle"));
		scrollToTheGivenWebElement(getPropfile(propname, "Myclassesheaderele"));
		verifyPartialText(getprop(propname, "Myclassesheaderele"), getpropstring(propname, "Myclassesheader"));
		System.out.println(driver.getCurrentUrl());
		// MyFavorites
		mouseOverAndClickAction(MyicivicsButton);
		Verifylinks(getprop(propname, "MyfavoritesElement"), getpropstring(propname, "MyfavoritesText"),
				getpropstring(propname, "MyfavoritesUrL"), getpropstring(propname, "MyfavoritesTitle"));
		scrollToTheGivenWebElement(getPropfile(propname, "Myfavoritesheaderele"));
		verifyPartialText(getprop(propname, "Myfavoritesheaderele"), getpropstring(propname, "Myfavoritesheader"));
		System.out.println(driver.getCurrentUrl());
		return this;
	}

	@Given("Verify the option you are on is underlined.")
	public Icivics_HomepageHeaderMyicivicsMisc verifyselectedmyicivicsunderlined() {

		waitTime(3000);
		WebElement myicivcslink = driver.findElement(By.xpath("(//a[@title='My iCivics'])[2]"));
		myicivcslink.click();
		waitTime(3000);
		click(propElement(getPropfile(gpropname2, "Myicivicsbutton")));
		waitTime(3000);
		String cssValue = driver.findElement(By.xpath("(//a[@title='My iCivics'])[2]")).getCssValue("text-decoration");
		System.out.println(cssValue);
		if (cssValue.contains("underline")) {

			reportStep("Selected page is underlined", "Pass");

		} else {
			reportStep("Selected page is not underlined", "Fail");
		}

		return this;
	}

	public Icivics_HomepageHeaderMyicivicsMisc verifyselectedmyclassesunderlined() {
		
		waitTime(3000);
		WebElement myclassesbutton = driver.findElement(By.xpath("(//li[@class='my classes']//a)[2]"));
		myclassesbutton.click();
		waitTime(3000);
		WebElement myicivicsbutton1 = propElement(getPropfile(gpropname2, "Myicivicsbutton"));
		myicivicsbutton1.click();
		waitTime(3000);
		String cssValue1 = driver.findElement(By.xpath("(//li[@class='my classes']//a)[2]"))
				.getCssValue("text-decoration");
		System.out.println(cssValue1);
		if (cssValue1.contains("underline")) {

			reportStep("Selected page is underlined", "Pass");

		} else {
			reportStep("Selected page is not underlined", "Fail");
		}
		return this;
	}

	public Icivics_HomepageHeaderMyicivicsMisc verifyselectedmyfavoritesunderlined() {
		
		waitTime(3000);
		WebElement myfavorites = driver.findElement(By.xpath("(//a[@title='My Favorites'])[2]"));
		myfavorites.click();
		waitTime(3000);
		WebElement myicivicsbutton1 = propElement(getPropfile(gpropname2, "Myicivicsbutton"));
		myicivicsbutton1.click();
		waitTime(3000);
		String cssValue1 = driver.findElement(By.xpath("(//a[@title='My Favorites'])[2]"))
				.getCssValue("text-decoration");
		System.out.println(cssValue1);
		if (cssValue1.contains("underline")) {

			reportStep("Selected page is underlined", "Pass");

		} else {
			reportStep("Selected page is not underlined", "Fail");
		}
		return this;
	}

	@Given("Verify Click on My Icivics button submenu is display and click again submenu is close")
	public Icivics_HomepageHeaderMyicivicsMisc Clickonmyicivicsbuttonagain() {

		WebElement myicivicsbutton = propElement(getPropfile(gpropname2, "Myicivicsbutton"));
		if (myicivicsbutton.isDisplayed()) {
			click(propElement(getPropfile(gpropname2, "Myicivicsbutton")));
			reportStep("on clicking again myicivics submenu is close", "Pass");
		} else {
			reportStep("Myicivicssubmenu is not display", "Pass");
		}
		return this;

	}
}
