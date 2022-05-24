package icivics_pages;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.aventstack.extentreports.ExtentTest;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import projectSpecific.base.ProjectSpecificMethods;

public class Icivics_StudentReg2Email extends ProjectSpecificMethods {
	public String gpropname1 = "StudentRegistration/studentregistration1Email";
	public String gpropname2 = "StudentRegistration/studentregistration1classcode";
	public String gpropname3 = "StudentRegistration/studentregistration2Email";

	public Icivics_StudentReg2Email(RemoteWebDriver driver, ExtentTest node, Properties prop) {
		this.driver = driver;
		this.node = node;
		this.prop = prop;
	}

	@Given("Launch the icivis Studentregistration email URL")
	public Icivics_StudentReg2Email launchstudentURL(String URL) {
		navigateto(URL);
		return this;
	}

	@Given("Launch the icivis Studentregistration email URL")
	public Icivics_StudentReg2Email verifywithvaliddata() throws IOException {
		WebElement username = propElement(getPropfile(gpropname2, "username"));
		String username1 = username.getText();
		writePropfile("StudentRegistration/username", "username", username1);
		reportStep("User name is " + username1, "Pass");

		WebElement firstname = propElement(getPropfile(gpropname2, "firstname"));
		firstname.clear();
		firstname.sendKeys(getPropfile(gpropname2, "FirstName"));
		reportStep(getPropfile(gpropname2, "FirstName") + " is entered as Firstname", "Pass");

		WebElement lastname = propElement(getPropfile(gpropname2, "Lastname"));
		lastname.clear();
		lastname.sendKeys(getPropfile(gpropname2, "LastName"));
		reportStep(getPropfile(gpropname2, "LastName") + " is entered as Lastname", "Pass");

		WebElement emailele = propElement(getPropfile(gpropname2, "Emailaddress"));
		emailele.clear();
		emailele.sendKeys(getPropfile(gpropname2, "EmailID"));
		reportStep(getPropfile(gpropname2, "EmailID") + " is entered as Email", "Pass");

		WebElement verifyemailele = propElement(getPropfile(gpropname2, "VerifyEmailaddress"));
		verifyemailele.clear();
		verifyemailele.sendKeys(getPropfile(gpropname2, "VerifyEmailID"));
		reportStep(getPropfile(gpropname2, "VerifyEmailID") + " is entered as Verify email", "Pass");

		scrollToTheGivenWebElement(getPropfile(gpropname2, "nextbutton"));
		reportStep("Next Button is clicked", "Pass");
		click(propElement(getPropfile(gpropname2, "nextbutton")));
		waitTime(3000);

		return this;
	}

	@And("View page 2 of student registration")

	public Icivics_StudentReg2Email Clickbackbutton() throws InterruptedException, IOException {
		WebElement backbutton = propElement(getPropfile(gpropname3, "backbutton"));
		backbutton.click();
		waitTime(3000);
		String cssvalue = "background-color";
		String Greycolor = "rgb(88, 89, 91)";
		String Greencolor = "rgb(0, 178, 124)";

		String Step1 = cssgetbefore(getPropfile(gpropname2, "step1ele"), cssvalue, Greencolor);
		String Step2 = cssgetbefore(getPropfile(gpropname2, "step2ele"), cssvalue, Greycolor);
		String Step3 = cssgetbefore(getPropfile(gpropname2, "step3ele"), cssvalue, Greycolor);
		
		if (Step1.equals(Greencolor) && Step2.equals(Greycolor) && Step3.equals(Greycolor)) {
			reportStep("you are currently viewing page 1 in the breadcrumbs", "Pass");
		} else {
			reportStep("unable to identify which page you are currently viewing in the breadcrumbs", "Fail");
		}
		return this;
	}

	@When("Click back from page 2 all the fields should be remembered")
	public Icivics_StudentReg2Email verifyfieldsisremembered() throws IOException {
		
		WebElement backbutton = propElement(getPropfile(gpropname3, "backbutton"));
		backbutton.click();
		waitTime(3000);
		String firstnamevalue = propElement(getPropfile(gpropname2, "firstname")).getAttribute("value");
		if (firstnamevalue.equals(getPropfile(gpropname2, "FirstName"))) {
			reportStep("Firstname value " + firstnamevalue + " is remembered ", "Pass");
		} else {
			reportStep("Firstname value " + firstnamevalue + " is not remembered ", "Fail");
		}

		String lastnamevalue = propElement(getPropfile(gpropname2, "Lastname")).getAttribute("value");
		if (lastnamevalue.equals(getPropfile(gpropname2, "LastName"))) {
			reportStep("lastname value " + lastnamevalue + " is remembered ", "Pass");
		} else {
			reportStep("lastname value " + lastnamevalue + " is not remembered ", "Fail");
		}

		String email = propElement(getPropfile(gpropname2, "Emailaddress")).getAttribute("value");
		if (email.equals(getPropfile(gpropname2, "EmailID"))) {
			reportStep("email value " + email + " is remembered ", "Pass");
		} else {
			reportStep("email value " + email + " is not remembered ", "Fail");
		}

		String verifyemail = propElement(getPropfile(gpropname2, "VerifyEmailaddress")).getAttribute("value");
		if (verifyemail.equals(getPropfile(gpropname2, "VerifyEmailID"))) {
			reportStep("verify email value " + verifyemail + " is remembered ", "Pass");
		} else {
			reportStep("verify email value " + verifyemail + " is not remembered ", "Fail");
		}

		return this;
	}

	@When("Click terms of use Terms of use page opens in new tab")
	public Icivics_StudentReg2Email clickontermsofuselink() throws IOException {
		waitTime(5000);

		WebElement termsofuse = propElement(getPropfile(gpropname3, "termsofuselink"));
		termsofuse.click();
		waitTime(3000);
		switchToWindow(getPropfile(gpropname3, "termsofusetitle"));
		System.out.println(driver.getTitle());
		defaultContent();
		return this;

	}

	@Given("Verify the password strength Indicator is changing according to password strength")
	public Icivics_StudentReg2Email VerifyPasswordstrengthmeter() {
		String pwd = getPropfile(gpropname3, "Passwordvalueweak");

		WebElement password = propElement(getPropfile(gpropname3, "password1"));
		password.clear();
		password.sendKeys(pwd);

		WebElement passwordstrength = propElement(getPropfile(gpropname3, "passwordstrength"));
		String passwordstrengthtext = passwordstrength.getText();
		if (passwordstrengthtext.equals("Weak") || passwordstrengthtext.equals("Strong")
				|| passwordstrengthtext.equals("Fair") || passwordstrengthtext.equals("Good")) {
			reportStep("Password strength Indicator is changing as " + passwordstrengthtext
					+ " according to password strength", "Pass");
		} else {
			reportStep("Password strength Indicator is not changing according to password strength", "Fail");
		}

		WebElement passwordstrengthmeter = propElement(getPropfile(gpropname3, "passwordstrengthmeter"));
		String passwordstrengthmetertext = passwordstrengthmeter.getAttribute("style");
		if (!passwordstrengthmetertext.equals("width: 0%;")) {
			reportStep("Password strength meter is changing as " + passwordstrengthmetertext
					+ " according to password strength", "Pass");
		} else {
			reportStep("Password strength meter is not changing according to password strength", "Fail");
		}

		return this;
	}
}
