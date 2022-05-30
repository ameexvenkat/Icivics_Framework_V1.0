package icivics_pages;

import java.util.Properties;

import org.openqa.selenium.Dimension;
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

	@Then("Verify donatebutton should have Hand cursor should appear over buttons Tooltip appears after hover.")
	public Icivics_HomepageTeacherHeader verifydonatebuttonhover() {

		String Donatebuttonhover = getPropfile(gpropname1, "Donatebutton");
		mouseOverAction(Donatebuttonhover);
		waitTime(3000);
		WebElement donatebuttontooltip = propElement(Donatebuttonhover);
		String ExpectedTooltip = getPropfile(gpropname2, "Donatebuttontooltip");
		String actualTooltip = donatebuttontooltip.getAttribute("title");
		if (actualTooltip.equals(ExpectedTooltip)) {
			reportStep("Expected Tooltip and Actual Tooltip text matched successfully", "Pass");
		} else {
			reportStep("Expected Tooltip and Actual Tooltip text did not match", "Fail");
		}

		click(propElement(getPropfile(gpropname1, "Donatebutton")));
		waitTime(3000);
		return this;
	}

	@Then("Verify shopbutton should have Hand cursor should appear over buttons Tooltip appears after hover.")
	public Icivics_HomepageTeacherHeader verifyshopbuttonhover() {

		String Shopbuttonhover = getPropfile(gpropname1, "shopbutton");
		mouseOverAction(Shopbuttonhover);
		waitTime(3000);
		WebElement shopbuttontooltip = propElement(Shopbuttonhover);
		String ExpectedTooltip = getPropfile(gpropname2, "Shopbuttontooltip");
		String actualTooltip = shopbuttontooltip.getAttribute("title");
		if (actualTooltip.equals(ExpectedTooltip)) {
			reportStep("Expected Tooltip and Actual Tooltip text matched successfully", "Pass");
		} else {
			reportStep("Expected Tooltip and Actual Tooltip text did not match", "Fail");
		}

		click(propElement(getPropfile(gpropname1, "shopbutton")));
		waitTime(3000);
		return this;
	}

	@Then("Verify myicivicsbutton should not present for anonymous user it should present only when we login")
	public Icivics_HomepageTeacherHeader verifymyicvicsbuttonhover() {

		String signinbuttonhover = getPropfile(gpropname1, "Signinbutton");
		mouseOverAction(signinbuttonhover);
		waitTime(3000);
		WebElement Signinbuttontooltip = propElement(signinbuttonhover);
		String ExpectedTooltip = getPropfile(gpropname2, "Myicivicstooltip");
		String actualTooltip = Signinbuttontooltip.getAttribute("title");
		if (actualTooltip.equals(ExpectedTooltip)) {
			reportStep("Expected Tooltip and Actual Tooltip text matched successfully", "Pass");
		} else {
			reportStep("Expected Tooltip and Actual Tooltip text did not match", "Fail");
		}

		click(propElement(getPropfile(gpropname1, "Signinbutton")));
		click(propElement(getPropfile(gpropname1, "Signinlink")));
		WebElement username = propElement(getPropfile(gpropname1, "Username"));
		username.sendKeys("Bronze Speaker 1r4e");
		WebElement password = propElement(getPropfile(gpropname1, "Password"));
		password.sendKeys("i898qrCiPK9Hwgb");
		click(propElement(getPropfile(gpropname2, "Loginbutton")));
		waitTime(3000);
		String myicivicsbuttonhover = getPropfile(gpropname2, "Myicivicsbutton");
		mouseOverAction(myicivicsbuttonhover);
		waitTime(3000);
		WebElement myicivicstooltip = propElement(myicivicsbuttonhover);
		String ExpectedTooltip1 = getPropfile(gpropname2, "Myicivicstooltip");
		String actualTooltip1 = myicivicstooltip.getAttribute("title");
		if (actualTooltip1.equals(ExpectedTooltip1)) {
			reportStep("Expected Tooltip and Actual Tooltip text matched successfully", "Pass");
		} else {
			reportStep("Expected Tooltip and Actual Tooltip text did not match", "Fail");
		}
		click(propElement(getPropfile(gpropname2, "Myicivicsbutton")));
		waitTime(3000);
		return this;
	}

	@Then("Verify after login all the button should have Hand cursor should appear over buttons Tooltip appears after hover.")
	public Icivics_HomepageTeacherHeader verifyallheaderbuttonhover() {
		waitTime(3000);
		click(propElement(getPropfile(gpropname1, "Signinbutton")));
		click(propElement(getPropfile(gpropname1, "Signinlink")));
		WebElement username = propElement(getPropfile(gpropname1, "Username"));
		username.sendKeys("Bronze Speaker 1r4e");
		WebElement password = propElement(getPropfile(gpropname1, "Password"));
		password.sendKeys("i898qrCiPK9Hwgb");
		click(propElement(getPropfile(gpropname2, "Loginbutton")));
		waitTime(3000);

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

		String teachbuttonhover = getPropfile(gpropname2, "Teachbutton");
		mouseOverAction(teachbuttonhover);
		waitTime(3000);
		WebElement teachbuttontooltip = propElement(teachbuttonhover);
		String ExpectedTooltip1 = getPropfile(gpropname2, "Teachbuttontooltip");
		String actualTooltip1 = teachbuttontooltip.getAttribute("title");
		if (actualTooltip1.equals(ExpectedTooltip1)) {
			reportStep("Expected Tooltip and Actual Tooltip text matched successfully", "Pass");
		} else {
			reportStep("Expected Tooltip and Actual Tooltip text did not match", "Fail");
		}

		click(propElement(getPropfile(gpropname2, "Teachbutton")));
		waitTime(3000);
	

			String aboutbuttonhover = getPropfile(gpropname2, "Aboutbutton");
			mouseOverAction(aboutbuttonhover);
			waitTime(3000);
			WebElement aboutbuttontooltip = propElement(aboutbuttonhover);
			String ExpectedTooltip2 = getPropfile(gpropname2, "Aboutbuttontooltip");
			String actualTooltip2 = aboutbuttontooltip.getAttribute("title");
			if (actualTooltip2.equals(ExpectedTooltip2)) {
				reportStep("Expected Tooltip and Actual Tooltip text matched successfully", "Pass");
			} else {
				reportStep("Expected Tooltip and Actual Tooltip text did not match", "Fail");
			}

			click(propElement(getPropfile(gpropname2, "Aboutbutton")));
			waitTime(3000);
			String Donatebuttonhover = getPropfile(gpropname1, "Donatebutton");
			mouseOverAction(Donatebuttonhover);
			waitTime(3000);
			WebElement donatebuttontooltip = propElement(Donatebuttonhover);
			String ExpectedTooltip3 = getPropfile(gpropname2, "Donatebuttontooltip");
			String actualTooltip3 = donatebuttontooltip.getAttribute("title");
			if (actualTooltip3.equals(ExpectedTooltip3)) {
				reportStep("Expected Tooltip and Actual Tooltip text matched successfully", "Pass");
			} else {
				reportStep("Expected Tooltip and Actual Tooltip text did not match", "Fail");
			}

			
		return this;
		
		
	}
	

	@When("Header is resize it should should turn into hamburger menu when its small enough")
	public Icivics_HomepageTeacherHeader resizeheader() {
		Dimension d = new Dimension(768, 1024);
		// Resize the current window to the given dimension
		driver.manage().window().setSize(d);
		takeSnap();
		waitTime(3000);

		reportStep("Ipad potrait resize is successfull", "Pass");
		Dimension d1 = new Dimension(1024, 768);
		driver.manage().window().setSize(d1);

		waitTime(3000);

		System.out.println(driver.manage().window().getSize());
		takeSnap();
		reportStep("Ipad landscape resize is successfull", "Pass");
		Dimension d2 = new Dimension(375, 667);
		driver.manage().window().setSize(d2);
		waitTime(3000);

		System.out.println(driver.manage().window().getSize());
		takeSnap();
		reportStep("Iphone potrait resize is successfull", "Pass");
		return this;

	}
}
