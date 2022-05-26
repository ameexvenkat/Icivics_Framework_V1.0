package icivics_pages;

import java.util.Properties;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.aventstack.extentreports.ExtentTest;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import projectSpecific.base.ProjectSpecificMethods;

public class Icivics_HomepageTeacherHeader extends ProjectSpecificMethods {
	public String gpropname1 = "Homepage/homepageheader";
	public String gpropname2 = "Homepage/homepageteacherheader";

	public Icivics_HomepageTeacherHeader(RemoteWebDriver driver, ExtentTest node, Properties prop) {
		this.driver = driver;
		this.node = node;
		this.prop = prop;
	}

	@Given("Launch the icivis educatorregistration URL")
	public Icivics_HomepageTeacherHeader launchteacherpageURL(String URL) {
		navigateto(URL);
		return this;

	}

	@Then("Verify Play buttons should appear in the top/right")
	public Icivics_HomepageTeacherHeader playbutton() {
		WebElement playbutton = propElement(getPropfile(gpropname2, "Playbutton"));
		if (playbutton.isDisplayed()) {
			reportStep("playbutton Verified successfully", "Pass");
		} else {
			reportStep("playbutton is not Verified successfully", "Fail");
		}

		return this;
	}

	@Then("Verify Teach buttons should appear in the top/right")
	public Icivics_HomepageTeacherHeader Teachbutton() {
		WebElement teachbutton = propElement(getPropfile(gpropname2, "Teachbutton"));
		if (teachbutton.isDisplayed()) {
			reportStep("Teachbutton Verified successfully", "Pass");
		} else {
			reportStep("Teachbutton is not Verified successfully", "Fail");
		}

		return this;
	}

	@Then("Verify About buttons should appear in the top/right")
	public Icivics_HomepageTeacherHeader aboutbutton() {
		WebElement aboutbutton = propElement(getPropfile(gpropname2, "Aboutbutton"));
		if (aboutbutton.isDisplayed()) {
			reportStep("aboutbutton Verified successfully", "Pass");
		} else {
			reportStep("aboutbutton is not Verified successfully", "Fail");
		}

		return this;
	}

	@Then("Verify Donate buttons should appear in the top/right")
	public Icivics_HomepageTeacherHeader donatebutton() {
		WebElement donatebutton = propElement(getPropfile(gpropname1, "Donatebutton"));
		if (donatebutton.isDisplayed()) {
			reportStep("donatebutton Verified successfully", "Pass");
		} else {
			reportStep("donatebutton is not Verified successfully", "Fail");
		}

		return this;
	}

	@Then("Verify Shop buttons should appear in the top/right")
	public Icivics_HomepageTeacherHeader shopbutton() {
		WebElement Shopbutton = propElement(getPropfile(gpropname1, "shopbutton"));
		if (Shopbutton.isDisplayed()) {
			reportStep("Shopbutton Verified successfully", "Pass");
		} else {
			reportStep("Shopbutton is not Verified successfully", "Fail");
		}

		return this;
	}

}
