package icivics_pages;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.aventstack.extentreports.ExtentTest;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import projectSpecific.base.ProjectSpecificMethods;

public class Icivics_StudentReg2Email extends ProjectSpecificMethods {
	public String gpropname = "StudentRegistration/studentregistration1Email";
	public String gpropname1 = "StudentRegistration/studentregistration1classcode";
	public String gpropname2 = "StudentRegistration/studentregistration2Email";

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

	public Icivics_StudentReg2Email verifyregistrationwithvaliddata() throws InterruptedException, IOException {
		waitTime(5000);
		WebElement username = propElement(getPropfile(gpropname, "username"));
		String username1 = username.getText();
		writePropfile("StudentRegistration/username", "username", username1);
		reportStep("User name is " + username1, "Pass");

		WebElement firstname = propElement(getPropfile(gpropname, "firstname"));
		firstname.clear();
		firstname.sendKeys(getPropfile(gpropname, "FirstName"));
		reportStep(getPropfile(gpropname, "FirstName") + " is entered as Firstname", "Pass");

		WebElement lastname = propElement(getPropfile(gpropname, "Lastname"));
		lastname.clear();
		lastname.sendKeys(getPropfile(gpropname, "LastName"));
		reportStep(getPropfile(gpropname, "LastName") + " is entered as Lastname", "Pass");

		WebElement emailele = propElement(getPropfile(gpropname, "Emailaddress"));
		emailele.clear();
		emailele.sendKeys(getPropfile(gpropname, "EmailID"));
		reportStep(getPropfile(gpropname, "EmailID") + " is entered as Email", "Pass");

		WebElement verifyemailele = propElement(getPropfile(gpropname, "VerifyEmailaddress"));
		verifyemailele.clear();
		verifyemailele.sendKeys(getPropfile(gpropname, "VerifyEmailID"));
		reportStep(getPropfile(gpropname, "VerifyEmailID") + " is entered as Verify email", "Pass");

		scrollToTheGivenWebElement(getPropfile(gpropname, "nextbutton"));
		reportStep("Next Button is clicked", "Pass");
		click(propElement(getPropfile(gpropname, "nextbutton")));
		waitTime(3000);
		return this;
	}

	@Then("verify Current page count is 2 and print")
	public Icivics_StudentReg2Email verifypagecount2() throws IOException {
		String cssvalue = "background-color";
		String Greycolor = "rgb(88, 89, 91)";
		String Greencolor = "rgb(0, 178, 124)";

		String Step1 = cssgetbefore(getPropfile(gpropname, "step1ele"), cssvalue, Greencolor);
		String Step2 = cssgetbefore(getPropfile(gpropname, "step2ele"), cssvalue, Greencolor);
		String Step3 = cssgetbefore(getPropfile(gpropname, "step3ele"), cssvalue, Greycolor);

		if (Step1.equals(Greencolor) && Step2.equals(Greencolor) && Step3.equals(Greycolor)) {
			reportStep("you are currently viewing page 2 in the breadcrumbs", "Pass");
		} else {
			reportStep("unable to identify which page you are currently viewing in the breadcrumbs", "Fail");
		}

		return this;
	}

	@Given("Verify clicking on back button will take to previous page 1")

	public Icivics_StudentReg2Email Clickbackbutton() throws InterruptedException, IOException {
		WebElement backbutton = propElement(getPropfile(gpropname2, "backbutton"));
		backbutton.click();
		waitTime(3000);
		String cssvalue = "background-color";
		String Greycolor = "rgb(88, 89, 91)";
		String Greencolor = "rgb(0, 178, 124)";

		String Step1 = cssgetbefore(getPropfile(gpropname, "step1ele"), cssvalue, Greencolor);
		String Step2 = cssgetbefore(getPropfile(gpropname, "step2ele"), cssvalue, Greycolor);
		String Step3 = cssgetbefore(getPropfile(gpropname, "step3ele"), cssvalue, Greycolor);

		if (Step1.equals(Greencolor) && Step2.equals(Greycolor) && Step3.equals(Greycolor)) {
			reportStep("you are currently viewing page 1 in the breadcrumbs", "Pass");
		} else {
			reportStep("unable to identify which page you are currently viewing in the breadcrumbs", "Fail");
		}
		return this;
	}

	@Given("Verify Username is regenerated.")
	public Icivics_StudentReg2Email verifyusernameisnotremembered() throws IOException {

		WebElement username = propElement(getPropfile(gpropname, "username"));
		String username2 = username.getText();
		String username1 = getPropfile("StudentRegistration/username", "username");
		if (!username1.equals(username2)) {
			reportStep("Username is regenerated " + username1 + " & " + username2 + " are not same", "Pass");
		} else {
			reportStep("Username is not regenerated" + username1 + " & " + username2 + " are same", "Fail");
		}
		return this;
	}

	@When("Verify firstname is remembered.")
	public Icivics_StudentReg2Email verifyfirstnameremembered() throws IOException {

		String firstnamevalue = propElement(getPropfile(gpropname, "firstname")).getAttribute("value");
		if (firstnamevalue.equals(getPropfile(gpropname, "FirstName"))) {
			reportStep("Firstname value " + firstnamevalue + " is remembered ", "Pass");
		} else {
			reportStep("Firstname value " + firstnamevalue + " is not remembered ", "Fail");
		}
		return this;
	}

	@And("Verify lastname is remembered.")
	public Icivics_StudentReg2Email verifylastnameremembered() {
		String lastnamevalue = propElement(getPropfile(gpropname, "Lastname")).getAttribute("value");
		if (lastnamevalue.equals(getPropfile(gpropname, "LastName"))) {
			reportStep("lastname value " + lastnamevalue + " is remembered ", "Pass");
		} else {
			reportStep("lastname value " + lastnamevalue + " is not remembered ", "Fail");
		}
		return this;
	}

	@And("Verify email is remembered.")
	public Icivics_StudentReg2Email verifyemailremembered() {
		scrollToTheGivenWebElement(getPropfile(gpropname, "Emailaddresslabel"));
		String email = propElement(getPropfile(gpropname, "Emailaddress")).getAttribute("value");
		if (email.equals(getPropfile(gpropname, "EmailID"))) {
			reportStep("email value " + email + " is remembered ", "Pass");
		} else {
			reportStep("email value " + email + " is not remembered ", "Fail");
		}
		return this;
	}

	@And("Verify verifyemail is remembered.")
	public Icivics_StudentReg2Email verifyemailfieldremembered() {
		scrollToTheGivenWebElement(getPropfile(gpropname, "Emailaddresslabel"));
		String verifyemail = propElement(getPropfile(gpropname, "VerifyEmailaddress")).getAttribute("value");
		if (verifyemail.equals(getPropfile(gpropname, "VerifyEmailID"))) {
			reportStep("verify email value " + verifyemail + " is remembered ", "Pass");
		} else {
			reportStep("verify email value " + verifyemail + " is not remembered ", "Fail");
		}

		return this;
	}

	@Given("Click terms of use link Terms of use page should opens in new tab")
	public Icivics_StudentReg2Email clickontermsofuselink() throws IOException {
		WebElement termsofuseLink = propElement(getPropfile(gpropname2, "termsofuselink"));
		if (termsofuseLink.isDisplayed()) {

			click(propElement(getPropfile(gpropname2, "termsofuselink")));

		} else {

			reportStep("Terms of use link is not clicked successfully", "Fail");
		}
		switchToWindow(getPropfile(gpropname2, "termsofusetitle"));
		System.out.println(driver.getTitle());
		reportStep("Link is open in new tab successfully", "Pass");

		return this;

	}

	@Given("Click privacy policy link Privacy policy page should opens in new tab")
	public Icivics_StudentReg2Email clickprivacypolicy() {
		WebElement privacypolicy = propElement(getPropfile(gpropname2, "privacypolicylink"));
		if (privacypolicy.isDisplayed()) {

			click(propElement(getPropfile(gpropname2, "privacypolicylink")));

		} else {

			reportStep("Terms of use link is not clicked successfully", "Fail");
		}

		switchToWindow(getPropfile(gpropname2, "privacypolicytitle"));
		System.out.println(driver.getTitle());
		reportStep("Link is open in new tab successfully", "Pass");

		return this;

	}

	@Given("View page 2 of student registration no email subscription checkbox should appears")
	public Icivics_StudentReg2Email verifypage2noemailsubscriptioncheckbox() {
		scrollToTheGivenWebElement(getPropfile(gpropname2, "finishbutton"));
		WebElement AgreetotermsCheckbox = propElement(getPropfile(gpropname2, "Agreetotermschkbox"));
		verifyDisplayed(AgreetotermsCheckbox);
		
		WebElement Signuptobefirsttoknowcheckbox = propElement(getPropfile(gpropname2, "Signuptobefirstchkbox"));
		verifyDisplayed(Signuptobefirsttoknowcheckbox);
		
		return this;
	}

	@Given("verify the Tooltip Text by Hovering on password field")
	public Icivics_StudentReg2Email hoveronpwdfield() throws InterruptedException {
		String pwd = getPropfile(gpropname2, "password");
		mouseOverAction(pwd);
		WebElement pwdtooltip = propElement(pwd);
		String ExpectedTooltip = getPropfile(gpropname2, "PasswordHovertext");
		String actualTooltip = pwdtooltip.getAttribute("data-original-title");
		if (actualTooltip.equals(ExpectedTooltip)) {
			reportStep("Expected Tooltip and Actual Tooltip text matched successfully", "Pass");
		} else {
			reportStep("Expected Tooltip and Actual Tooltip text did not match", "Fail");
		}
		return this;
	}

	@Given("Verify the password strength Indicator is changing according to password strength")
	public Icivics_StudentReg2Email VerifyPasswordstrengthmeter() {
		String pwd = getPropfile(gpropname2, "Passwordvalue");

		WebElement password = propElement(getPropfile(gpropname2, "password1"));
		password.clear();
		password.sendKeys(pwd);

		WebElement passwordstrength = propElement(getPropfile(gpropname2, "passwordstrength"));
		String passwordstrengthtext = passwordstrength.getText();
		if (passwordstrengthtext.equals("Weak") || passwordstrengthtext.equals("Strong")
				|| passwordstrengthtext.equals("Fair") || passwordstrengthtext.equals("Good")) {
			reportStep("Password strength Indicator is changing as " + passwordstrengthtext
					+ " according to password strength", "Pass");
		} else {
			reportStep("Password strength Indicator is not changing according to password strength", "Fail");
		}

		WebElement passwordstrengthmeter = propElement(getPropfile(gpropname2, "passwordstrengthmeter"));
		String passwordstrengthmetertext = passwordstrengthmeter.getAttribute("style");
		if (!passwordstrengthmetertext.equals("width: 0%;")) {
			reportStep("Password strength meter is changing as " + passwordstrengthmetertext
					+ " according to password strength", "Pass");
		} else {
			reportStep("Password strength meter is not changing according to password strength", "Fail");
		}

		return this;
	}

	@Given("Verify Password match indicator says yes or no depending on match with the confirm Password")
	public Icivics_StudentReg2Email VerifyPasswordindicatormatch() {
		String pwd = getPropfile(gpropname2, "Passwordvalue");

		WebElement password = propElement(getPropfile(gpropname2, "password1"));
		password.clear();
		password.sendKeys(pwd);

		WebElement confirmpassword = propElement(getPropfile(gpropname2, "confirmpassword1"));
		confirmpassword.clear();
		confirmpassword.sendKeys(pwd);

		WebElement passwordmatchstatus = propElement(getPropfile(gpropname2, "passwordmatchstatus"));
		String getpwdmatchtext = passwordmatchstatus.getText();
		if (getpwdmatchtext.equals("yes")) {
			reportStep("Password and Confirm password is matching and yes is displayed", "Pass");
		} else {
			reportStep("Password and Confirm password is not matching and no is displayed", "Fail");
		}
		scrollToTheGivenWebElement(getPropfile(gpropname2, "backbutton"));
		confirmpassword.clear();
		confirmpassword.sendKeys("Test@123");
		String getpwdnomatchtext = passwordmatchstatus.getText();
		if (getpwdnomatchtext.equals("no")) {
			reportStep("Password and Confirm password is not matching and no is displayed", "Pass");
		} else {
			reportStep("Password and Confirm password is matching and yes is displayed", "Fail");
		}

		return this;
	}

	@Given("Enter invalid Password, Confirm Password and verify the error message and its displayed in red")
	public Icivics_StudentReg2Email verifyenterinvaliddata() {

		String pwd = "gfgh^d$fthf&";
		String cpwd = "gfgh^d$fthf&123";
		WebElement password = propElement(getPropfile(gpropname2, "password1"));
		clearAndType(password, pwd);

		WebElement confirmpassword = propElement(getPropfile(gpropname2, "confirmpassword1"));
		clearAndType(confirmpassword, cpwd);

		WebElement agreechkbox1 = propElement(getPropfile(gpropname2, "agreechkbox"));

		if (agreechkbox1.isSelected()) {
			agreechkbox1.click();
			reportStep("Accept terms is unchecked", "Pass");
		}

		click(propElement(getPropfile(gpropname2, "finishbutton")));

		WebElement errormsgbox = propElement(getPropfile(gpropname, "errormsgbox"));
		WebElement pwderror = propElement(getPropfile(gpropname2, "pwderror"));
		WebElement agreeerror = propElement(getPropfile(gpropname2, "agreeerror"));
		if (errormsgbox.isDisplayed() && pwderror.isDisplayed() && agreeerror.isDisplayed()) {
			verifyExactText(errormsgbox, "2 errors have been found:");
			scrollToTheGivenWebElement(getPropfile(gpropname2, "backbutton"));
			verifyPartialText(pwderror, "The specified passwords do not match.");
			verifyPartialText(agreeerror, "Please agree to the terms of service and privacy policy.");
		} else {
			reportStep("Password and Confirm Password filed text box error messages is not verifed", "Fail");
		}
		String expectedcolor = "rgba(169, 68, 66, 1)";
		String expectedbgcolor = "rgba(242, 222, 222, 1)";
		WebElement Errormsgbox = propElement(getPropfile(gpropname2, "Errormsgbox"));
		String color = Errormsgbox.getCssValue("color");
		String bckgclr = Errormsgbox.getCssValue("background-color");
		if (color.contains(expectedcolor) && bckgclr.contains(expectedbgcolor)) {
			reportStep("Error msg box Is displayed in Pink Color and text in Red", "Pass");
		} else {
			reportStep("Error msg box Is not displayed in Pink Color", "Fail");
		}
		return this;
	}

	@Then("Leave terms of use and privacy checkbox unckecked Errors should displayed in red")
	public Icivics_StudentReg2Email verifytermsofuseandprivacycheckbox() {
		String pwd = "Test@1234";
		String cpwd = "Test@1234";
		WebElement password = propElement(getPropfile(gpropname2, "password1"));
		clearAndType(password, pwd);

		WebElement confirmpassword = propElement(getPropfile(gpropname2, "confirmpassword1"));
		clearAndType(confirmpassword, cpwd);

		WebElement agreechkbox1 = propElement(getPropfile(gpropname2, "agreechkbox"));

		if (agreechkbox1.isSelected()) {
			agreechkbox1.click();
			reportStep("Accept terms is unchecked", "Pass");
		}

		click(propElement(getPropfile(gpropname2, "finishbutton")));
		WebElement agreeerror = propElement(getPropfile(gpropname2, "agreeerror"));
		WebElement errormsgbox = propElement(getPropfile(gpropname2, "Errormsgbox1"));
		WebElement errormsg = propElement(getPropfile(gpropname2, "Errormsg1"));
		WebElement errormsg1 = propElement(getPropfile(gpropname2, "Errormsg2"));
		WebElement errormsg2 = propElement(getPropfile(gpropname2, "Errormsg3"));
		if (errormsgbox.isDisplayed() && agreeerror.isDisplayed() && errormsg.isDisplayed() && errormsg1.isDisplayed()
				&& errormsg2.isDisplayed()) {
			verifyExactText(errormsgbox, "1 error has been found:");
			verifyExactText(errormsg, "I agree to the");
			verifyExactText(errormsg1, "Terms of Use");
			verifyExactText(errormsg2, "Privacy Policy");
			scrollToTheGivenWebElement(getPropfile(gpropname2, "backbutton"));
			verifyPartialText(agreeerror, "Please agree to the terms of service and privacy policy.");
		}
		String expectedcolor = "rgba(169, 68, 66, 1)";
		String expectedbgcolor = "rgba(242, 222, 222, 1)";

		WebElement Agreeerror = propElement(getPropfile(gpropname2, "agreeerror"));
		String color = Agreeerror.getCssValue("color");
		String bckgclr = Agreeerror.getCssValue("background-color");
		if (color.contains(expectedcolor) && bckgclr.contains(expectedbgcolor)) {
			reportStep("Agreeerror box Is displayed in Pink Color and text in Red", "Pass");
		} else {
			reportStep("Agreeerror box Is not displayed in Pink Color", "Fail");
		}
		return this;
	}

	@When("Leave password or confirm password blank check error messages")
	public Icivics_StudentReg2Email verifyblankerrormsg() {
		scrollToTheGivenWebElement(getPropfile(gpropname2, "finishbutton"));
		String pwd = "gfgh^d$fthf&";
		WebElement password = propElement(getPropfile(gpropname2, "password1"));

		click(propElement(getPropfile(gpropname2, "finishbutton")));
		reportStep("Error msg Is displayed for password field", "Pass");
		waitTime(3000);
		clearAndType(password, pwd);
		waitTime(3000);
		click(propElement(getPropfile(gpropname2, "finishbutton")));
		reportStep("Error msg Is displayed for confirm password field", "Pass");

		return this;
	}

	@When("Fill out required fields, passwords match, terms of use is checked and it should Goes on to next page")
	public Icivics_StudentReg2Email verifypage3loaded() throws InterruptedException, IOException {
		String pwd = "Test@12345";
		String cpwd = "Test@12345";
		WebElement password = propElement(getPropfile(gpropname2, "password1"));
		clearAndType(password, pwd);

		WebElement confirmpassword = propElement(getPropfile(gpropname2, "confirmpassword1"));
		clearAndType(confirmpassword, cpwd);

		click(propElement(getPropfile(gpropname2, "agreechkbox")));
		waitTime(3000);
		click(propElement(getPropfile(gpropname2, "finishbutton")));
		waitTime(5000);

		WebElement page2 = propElement(getPropfile(gpropname2, "welcomemsg"));
		if (page2.isDisplayed()) {
			reportStep("Page 3 is displayed", "Pass");
		} else {
			reportStep("Page 3 is not displayed", "Fail");
		}
		return this;
	}
}
