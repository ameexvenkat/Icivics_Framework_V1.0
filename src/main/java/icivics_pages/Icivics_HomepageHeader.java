package icivics_pages;

import java.util.Properties;

import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.aventstack.extentreports.ExtentTest;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import projectSpecific.base.ProjectSpecificMethods;

public class Icivics_HomepageHeader extends ProjectSpecificMethods {
	public String gpropname1 = "Homepage/homepageheader";
	public String gpropname2 = "Homepage/homepageteacherheader";

	public Icivics_HomepageHeader(RemoteWebDriver driver, ExtentTest node, Properties prop) {
		this.driver = driver;
		this.node = node;
		this.prop = prop;
	}

	@Given("Launch the icivics URL")
	public Icivics_HomepageHeader launchURL(String URL) {
		navigateto(URL);
		return this;

	}

	@When("homepage is loaded successfully")
	public Icivics_HomepageHeader verifyhomepage() {
		verifyUrl("https://staging.d9.icivics.org/");
		reportStep("URL Verified successfully", "Pass");
		return this;
	}

	public Icivics_HomepageHeader signin() {
		click(propElement(getPropfile(gpropname1, "Signinbutton")));
		click(propElement(getPropfile(gpropname1, "Signinlink")));
		WebElement username = propElement(getPropfile(gpropname1, "Username"));
		username.sendKeys("Bronze Speaker 1r4e");
		WebElement password = propElement(getPropfile(gpropname1, "Password"));
		password.sendKeys("i898qrCiPK9Hwgb");
		click(propElement(getPropfile(gpropname2, "Loginbutton")));
		waitTime(3000);
		return this;
	}

	@Then("Verify iCivics logo is at top/left on Clicking it reloads the page")
	public Icivics_HomepageHeader VerifyLogo() {
		WebElement logo = propElement(getPropfile(gpropname1, "Headerlogo"));
		if (logo.isDisplayed()) {
			reportStep("Icivics logo is displayed", "Pass");
		} else {
			reportStep("Icivics logo is not displayed", "Fail");
		}
		click(propElement(getPropfile(gpropname1, "Headerlogo")));
		waitTime(3000);
		reportStep("Page reloads successfully", "Pass");

		return this;
	}

	@Given("Verify Donate buttons should appear in the top/right")
	public Icivics_HomepageHeader VerifyDonatebutton() {
		WebElement donatebutton = propElement(getPropfile(gpropname1, "Donatebutton"));
		if (donatebutton.isDisplayed()) {
			reportStep("Donatebutton is display", "Pass");
		} else {
			reportStep("Donatebutton is not display", "Fail");
		}

		return this;
	}

	@Then("Verify Shop buttons should appear in the top/right")
	public Icivics_HomepageHeader Verifyshopbutton() {
		WebElement shopbutton = propElement(getPropfile(gpropname1, "shopbutton"));
		if (shopbutton.isDisplayed()) {
			reportStep("Shopbutton is dislay", "Pass");
		} else {
			reportStep("Shopbutton is not  dislay", "Fail");
		}

		return this;
	}

	@And("Verify after login MyIcivics buttons should appear in the top/right")
	public Icivics_HomepageHeader Verifymyicivicsbuttondisplayafterlogin() {
		WebElement signinbutton = propElement(getPropfile(gpropname1, "Signinbutton"));
		if (signinbutton.isDisplayed()) {
			reportStep("Signin button is display", "Pass");
		} else {
			reportStep("Signin button is not display", "Fail");
		}
		click(propElement(getPropfile(gpropname1, "Signinbutton")));
		click(propElement(getPropfile(gpropname1, "Signinlink")));
		WebElement username = propElement(getPropfile(gpropname1, "Username"));
		username.sendKeys("Bronze Speaker 1r4e");
		WebElement password = propElement(getPropfile(gpropname1, "Password"));
		password.sendKeys("i898qrCiPK9Hwgb");
		click(propElement(getPropfile(gpropname2, "Loginbutton")));
		waitTime(3000);
		WebElement myicivicsbutton2 = propElement(getPropfile(gpropname2, "Myicivicsbutton"));
		if (myicivicsbutton2.isDisplayed()) {
			reportStep("Myicivicsbutton is display", "Pass");
		} else {
			reportStep("Myicivicsbutton is not display", "Fail");
		}
		return this;

	}

	@And("Verify header button after login")
	public Icivics_HomepageHeader Verifyheaderbuttonsafterlogin() {
		WebElement donatebutton = propElement(getPropfile(gpropname1, "Donatebutton"));
		if (donatebutton.isDisplayed()) {
			reportStep("Donatebutton is display after login ", "Pass");
		} else {
			reportStep("Donatebutton is not display", "Fail");
		}

		WebElement shopbutton = propElement(getPropfile(gpropname1, "shopbutton2"));
		if (shopbutton.isDisplayed()) {
			reportStep("Shopbutton is display after login ", "Pass");
		} else {
			reportStep("Shopbutton is not display", "Fail");
		}

		WebElement myicivicsbutton2 = propElement(getPropfile(gpropname2, "Myicivicsbutton"));
		if (myicivicsbutton2.isDisplayed()) {
			reportStep("Myicivicsbutton is display after login ", "Pass");
		} else {
			reportStep("Myicivicsbutton is not display", "Fail");
		}
		return this;
	}

	@Given("Verify donation popup display")
	public Icivics_HomepageHeader Verifydonationpopup() {

		click(propElement(getPropfile(gpropname1, "Donatebutton")));

		try {
			Alert alert = driver.switchTo().alert();
			System.out.println(alert.getText() + " Alert is Displayed");
			reportStep("Donation popup is present", "Fail");
		} catch (NoAlertPresentException ex) {
			System.out.println("Alert is NOT Displayed");
			reportStep("Donation Popup is not present", "Pass");
		}

		return this;
	}

}
