package icivics_pages;

import java.util.Properties;

import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentTest;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import projectSpecific.base.ProjectSpecificMethods;

public class Icivics_HomepageHeader extends ProjectSpecificMethods {
	public String gpropname1 = "Homepage/homepageheader";

	public Icivics_HomepageHeader(RemoteWebDriver driver, ExtentTest node, Properties prop) {
		this.driver = driver;
		this.node = node;
		this.prop = prop;
	}

	@Given("Launch the icivis educatorregistration URL")
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

	@Then("Verify iCivics logo is at top/left on Clicking it reloads the page")
	public Icivics_HomepageHeader VerifyLogo() {
		WebElement logo = propElement(getPropfile(gpropname1, "Headerlogo"));
		if (logo.isDisplayed()) {
			reportStep("Logo Verified successfully", "Pass");
		} else {
			reportStep("Logo is not Verified successfully", "Fail");
		}
		click(propElement(getPropfile(gpropname1, "Headerlogo")));

		return this;
	}

	@Then("Verify Donate buttons should appear in the top/right")
	public Icivics_HomepageHeader VerifyDonatebutton() {
		WebElement donatebutton = propElement(getPropfile(gpropname1, "Donatebutton"));
		if (donatebutton.isDisplayed()) {
			reportStep("Donatebutton Verified successfully", "Pass");
		} else {
			reportStep("Donatebutton is not Verified successfully", "Fail");
		}

		return this;
	}

	@And("Verify Shop buttons should appear in the top/right")
	public Icivics_HomepageHeader Verifyshopbutton() {
		WebElement shopbutton = propElement(getPropfile(gpropname1, "shopbutton"));
		if (shopbutton.isDisplayed()) {
			reportStep("Shopbutton Verified successfully", "Pass");
		} else {
			reportStep("Shopbutton is not Verified successfully", "Fail");
		}

		return this;
	}

	@When("Click on donation popup there should never be a popup asking for donation")
	public Icivics_HomepageHeader Verifydonationpopup() {
		 //WebElement Donatebutton = propElement(getPropfile(gpropname1,
		// "Donatebutton"));
		click(propElement(getPropfile(gpropname1, "Donatebutton")));
		//acceptAlert();
	
		try{
		    Alert alert = driver.switchTo().alert();
		    System.out.println(alert.getText()+" Alert is Displayed"); 
		    reportStep("Alert is present", "Fail");
		    }
		    catch(NoAlertPresentException ex){
		    System.out.println("Alert is NOT Displayed");
		    reportStep("Alert is not present", "Pass");
		    }
		    
		return this;
	}

}
