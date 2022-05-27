package icivics_pages;

import java.util.Properties;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.aventstack.extentreports.ExtentTest;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
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

	@Then("Verify playbutton should have Hand cursor should appear over buttons Tooltip appears after hover.")
	public Icivics_HomepageTeacherHeader verifyplaybuttonhover() {

		String playbuttonhover = getPropfile(gpropname2, "Playbutton");
		mouseOverAction(playbuttonhover);
		waitTime(3000);
		WebElement playbuttontooltip = propElement(playbuttonhover);
		String ExpectedTooltip = getPropfile(gpropname2, "Playbuttontooltip");
		String actualTooltip = playbuttontooltip.getAttribute("title");
		if (actualTooltip.equals(ExpectedTooltip)) {
			reportStep("Expected Tooltip and Actual Tooltip text matched successfully", "Pass");
		} else {
			reportStep("Expected Tooltip and Actual Tooltip text did not match", "Fail");
		}

		click(propElement(getPropfile(gpropname2, "Playbutton")));
		waitTime(3000);
		return this;
	}

	@Then("Verify teachbutton should have Hand cursor should appear over buttons Tooltip appears after hover.")
	public Icivics_HomepageTeacherHeader verifyteachbuttonhover() {

		String teachbuttonhover = getPropfile(gpropname2, "Teachbutton");
		mouseOverAction(teachbuttonhover);
		waitTime(3000);
		WebElement teachbuttontooltip = propElement(teachbuttonhover);
		String ExpectedTooltip = getPropfile(gpropname2, "Teachbuttontooltip");
		String actualTooltip = teachbuttontooltip.getAttribute("title");
		if (actualTooltip.equals(ExpectedTooltip)) {
			reportStep("Expected Tooltip and Actual Tooltip text matched successfully", "Pass");
		} else {
			reportStep("Expected Tooltip and Actual Tooltip text did not match", "Fail");
		}

		click(propElement(getPropfile(gpropname2, "Teachbutton")));
		waitTime(3000);
		return this;
	}
	@Then("Verify aboutbutton should have Hand cursor should appear over buttons Tooltip appears after hover.")
	public Icivics_HomepageTeacherHeader verifyaboutbuttonhover() {

		String aboutbuttonhover = getPropfile(gpropname2, "Aboutbutton");
		mouseOverAction(aboutbuttonhover);
		waitTime(3000);
		WebElement aboutbuttontooltip = propElement(aboutbuttonhover);
		String ExpectedTooltip = getPropfile(gpropname2, "Aboutbuttontooltip");
		String actualTooltip = aboutbuttontooltip.getAttribute("title");
		if (actualTooltip.equals(ExpectedTooltip)) {
			reportStep("Expected Tooltip and Actual Tooltip text matched successfully", "Pass");
		} else {
			reportStep("Expected Tooltip and Actual Tooltip text did not match", "Fail");
		}

		click(propElement(getPropfile(gpropname2, "Aboutbutton")));
		waitTime(3000);
		return this;
	}
}
