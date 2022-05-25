package icivics_pages;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.aventstack.extentreports.ExtentTest;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import projectSpecific.base.ProjectSpecificMethods;

public class Icivics_StudentReg1classcode extends ProjectSpecificMethods {
	public String gpropname1 = "StudentRegistration/studentregistration1Email";
	public String gpropname2 = "StudentRegistration/studentregistration1classcode";

	public Icivics_StudentReg1classcode(RemoteWebDriver driver, ExtentTest node, Properties prop) {
		this.driver = driver;
		this.node = node;
		this.prop = prop;
	}

	@Given("Launch the icivis Studentregistration email URL")
	public Icivics_StudentReg1classcode launchstudentURL(String URL) {
		navigateto(URL);
		return this;

	}

	@Then("Click link Optional: Click here to enter your email address")
	public Icivics_StudentReg1classcode verifyemailfields() {
		WebElement link = propElement(getPropfile(gpropname2, "Link"));
		link.click();
		WebElement Emailaddresslabel = propElement(getPropfile(gpropname2, "Emailaddresslabel"));
		scrollToTheGivenWebElement(getPropfile(gpropname2, "Emailaddresslabel"));
		if (Emailaddresslabel.isDisplayed()) {
			reportStep("Emailaddress label is displayed", "Pass");
		} else {
			reportStep("Emailaddress label box is not displayed", "Fail");
		}

		WebElement email = propElement(getPropfile(gpropname2, "Emailaddress"));
		if (email.isDisplayed()) {

			reportStep("email field is displayed", "Pass");
		} else {
			reportStep("email field is not displayed", "Fail");
		}

		String CLbox = email.getAttribute("value");
		if (CLbox.isEmpty()) {
			reportStep("Emailaddress text box is Blank", "Pass");
		} else {
			reportStep("Emailaddress text box is not Blank", "Fail");
		}
		WebElement VerifyEmailaddresslabel = propElement(getPropfile(gpropname2, "VerifyEmailaddresslabel"));
		if (VerifyEmailaddresslabel.isDisplayed()) {
			reportStep("VerifyEmailaddress label is displayed", "Pass");
		} else {
			reportStep("VerifyEmailaddress label box is not displayed", "Fail");
		}

		WebElement verifyemail = propElement(getPropfile(gpropname2, "VerifyEmailaddress"));
		if (verifyemail.isDisplayed()) {

			reportStep("verifyemail field is displayed", "Pass");
		} else {
			reportStep("verifyemail field is not displayed", "Fail");
		}

		String CLbox2 = verifyemail.getAttribute("value");
		if (CLbox2.isEmpty()) {
			reportStep("VerifyEmailaddress text box is Blank", "Pass");
		} else {
			reportStep("VerifyEmailaddress box is not Blank", "Fail");
		}
		return this;
	}

	@Then("Hover over email and verify fields after they are made visible")
	public Icivics_StudentReg1classcode hoveronemailfield() throws InterruptedException, IOException {
		WebElement link = propElement(getPropfile(gpropname2, "Link"));
		link.click();
		String email = getPropfile(gpropname2, "Emailaddress");
		mouseOverAction(email);
		WebElement emailtooltip = propElement(email);
		String ExpectedTooltip = getPropfile(gpropname2, "EmailTooltip");
		String actualTooltip = emailtooltip.getAttribute("data-original-title");
		if (actualTooltip.equals(ExpectedTooltip)) {
			reportStep("Expected Tooltip and Actual Tooltip text matched successfully", "Pass");
		} else {
			reportStep("Expected Tooltip and Actual Tooltip text did not match", "Fail");
		}
		mouseOverAction(getPropfile(gpropname2, "VerifyEmailaddress"));
		reportStep("No Tool Tip present for Verifyemail text box", "Pass");

		return this;
	}

	@When("Click link Click here to remove the email address")
	public Icivics_StudentReg1classcode clickonremovelink() {
		WebElement link = propElement(getPropfile(gpropname2, "Link"));
		link.click();
		WebElement Emailaddresslabel = propElement(getPropfile(gpropname2, "Emailaddresslabel"));
		scrollToTheGivenWebElement(getPropfile(gpropname2, "Emailaddresslabel"));
		if (Emailaddresslabel.isDisplayed()) {
			reportStep("Emailaddress label is displayed", "Pass");
		} else {
			reportStep("Emailaddress label box is not displayed", "Fail");
		}

		WebElement email = propElement(getPropfile(gpropname2, "Emailaddress"));
		if (email.isDisplayed()) {

			reportStep("email field is displayed", "Pass");
		} else {
			reportStep("email field is not displayed", "Fail");
		}

		WebElement VerifyEmailaddresslabel = propElement(getPropfile(gpropname2, "VerifyEmailaddresslabel"));
		if (VerifyEmailaddresslabel.isDisplayed()) {
			reportStep("VerifyEmailaddress label is displayed", "Pass");
		} else {
			reportStep("VerifyEmailaddress label box is not displayed", "Fail");
		}

		WebElement verifyemail = propElement(getPropfile(gpropname2, "VerifyEmailaddress"));
		if (verifyemail.isDisplayed()) {

			reportStep("verifyemail field is displayed", "Pass");
		} else {
			reportStep("verifyemail field is not displayed", "Fail");
		}
		WebElement linkdisappear = propElement(getPropfile(gpropname2, "Link1"));
		linkdisappear.click();
		waitTime(3000);
		WebElement Emailaddresslabel1 = propElement(getPropfile(gpropname2, "Emailaddresslabel"));
		scrollToTheGivenWebElement(getPropfile(gpropname2, "Emailaddresslabel"));
		if (!Emailaddresslabel1.isDisplayed()) {
			reportStep("Emailaddress label box is not displayed", "Pass");
		} else {
			reportStep("Emailaddress label box is displayed", "Fail");
		}

		WebElement email1 = propElement(getPropfile(gpropname2, "Emailaddress"));
		if (!email1.isDisplayed()) {

			reportStep("email field is not displayed", "Pass");
		} else {
			reportStep("email field is displayed", "Fail");
		}

		WebElement VerifyEmailaddresslabel1 = propElement(getPropfile(gpropname2, "VerifyEmailaddresslabel"));
		if (!VerifyEmailaddresslabel1.isDisplayed()) {
			reportStep("VerifyEmailaddress label is not displayed", "Pass");
		} else {
			reportStep("VerifyEmailaddress label is displayed", "Fail");
		}

		WebElement verifyemail1 = propElement(getPropfile(gpropname2, "VerifyEmailaddress"));
		if (!verifyemail1.isDisplayed()) {

			reportStep("verifyemail field is not displayed", "Pass");
		} else {
			reportStep("verifyemail field is displayed", "Fail");
		}
		return this;
	}

	@Then("Go to register as student class code page")
	public Icivics_StudentReg1classcode usernamepregenerated() {

		WebElement username = propElement(getPropfile(gpropname2, "username"));
		waitTime(6000);
		String username1 = username.getText();

		if (!username1.isEmpty()) {
			reportStep(
					"Username field is not empty,it is pregenerated with " + username1 + " and Verified successfully",
					"Pass");
		} else {
			reportStep("Username field is empty", "Fail");
		}
		return this;
	}

	@When("Click button next to username")
	public Icivics_StudentReg1classcode usernamegeneratedrandomly() throws InterruptedException, IOException {

		WebElement username = propElement(getPropfile(gpropname2, "username"));
		waitTime(6000);
		String username1 = username.getText();
		System.out.println(username1);
		propElement(getPropfile(gpropname2, "reloadicon")).click();
		waitTime(6000);
		String username2 = username.getText();
		System.out.println(username2);
		if (!username1.equals(username2)) {
			reportStep(
					username1 + " is not equal to " + username2 + " ,newly generated username is Verified successfully",
					"Pass");
		} else {
			reportStep(username1 + " is same as " + username2 + " username is not generated", "Fail");
		}
		return this;
	}

	@Given("Enter valid info into text fields and hit next")
	public Icivics_StudentReg1classcode verifyregistrationwithvaliddata() throws InterruptedException, IOException {
		WebElement link = propElement(getPropfile(gpropname2, "Link"));
		link.click();
		waitTime(5000);
		WebElement username = propElement(getPropfile(gpropname2, "username"));
		String username1 = username.getText();
		writePropfile("EducatorRegistration/username", "username", username1);
		reportStep("User name is " + username1, "Pass");

		WebElement classcode = propElement(getPropfile(gpropname2, "classcode"));
		classcode.clear();
		classcode.sendKeys(getPropfile(gpropname2, "ClassCode"));
		reportStep(getPropfile(gpropname2, "ClassCode") + " is entered as ClassCode", "Pass");

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

		WebElement page2 = propElement(getPropfile(gpropname2, "gradelevel"));
		if (page2.isDisplayed()) {
			reportStep("Page 2 is displayed", "Pass");
		} else {
			reportStep("Page 2 is not displayed", "Fail");
		}

		return this;

	}

	@Then("Go to register as student page")
	public Icivics_StudentReg1classcode verifyAsteriks() throws IOException {
		cssgetafter(getPropfile(gpropname2, "studentreg2.cc*"), "content", "\"*\"");
		reportStep("Asteriks * is present in the Class Code label", "Pass");

		cssgetafter(getPropfile(gpropname2, "studentreg2.fn*"), "content", "\"*\"");
		reportStep("Asteriks * is present in the firstname label", "Pass");

		cssgetafter(getPropfile(gpropname2, "studentreg2.ln*"), "content", "\"*\"");
		reportStep("Asteriks * is present in the lastname label", "Pass");

		WebElement link = propElement(getPropfile(gpropname2, "Link"));
		link.click();

		scrollToTheGivenWebElement(getPropfile(gpropname2, "nextbutton"));

		cssgetafter(getPropfile(gpropname2, "studentreg2.email*"), "content", "\"*\"");
		reportStep("Asteriks * is present in the email label", "Pass");

		cssgetafter(getPropfile(gpropname2, "studentreg2.vemail*"), "content", "\"*\"");
		reportStep("Asteriks * is present in the verifyemail label", "Pass");

		return this;
	}

	@When("Enter invalid class code and improper email address error msg should display ")
	public Icivics_StudentReg1classcode verifyinvaliderrormsg() throws InterruptedException {
		WebElement link = propElement(getPropfile(gpropname2, "Link"));
		link.click();
		WebElement classcode = propElement(getPropfile(gpropname2, "classcode"));
		classcode.clear();
		classcode.sendKeys("12345");

		WebElement firstname = propElement(getPropfile(gpropname2, "firstname"));
		firstname.clear();
		firstname.sendKeys("14344433%");

		WebElement lastname = propElement(getPropfile(gpropname2, "Lastname"));
		lastname.clear();
		lastname.sendKeys("%ttt#12");

		WebElement email = propElement(getPropfile(gpropname2, "Emailaddress"));
		email.clear();
		email.sendKeys("GHDGFH!#!#!");

		WebElement verifyemail = propElement(getPropfile(gpropname2, "VerifyEmailaddress"));
		verifyemail.clear();
		verifyemail.sendKeys("GHDGFH!#!#!");

		WebElement nextbutton = propElement(getPropfile(gpropname2, "nextbutton"));
		nextbutton.click();

		WebElement alertmsg = propElement(getPropfile(gpropname2, "alertpopup1"));
		String Actualerrmsg = alertmsg.getText();
		String Expectederrmsg = "The classcode isn't linked to a class.";
		verifyPartialText(alertmsg, "The classcode isn't linked to a class.");
		if (Expectederrmsg.equals(Actualerrmsg)) {
			reportStep("Error alert message is displayed", "Pass");
		}
		WebElement alertmsg2 = propElement(getPropfile(gpropname2, "alertpopup2"));
		String Actualerrmsg2 = alertmsg.getText();
		String Expectederrmsg2 = "2 errors have been found:";
		verifyPartialText(alertmsg2, "2 errors have been found:");
		if (Expectederrmsg2.equals(Actualerrmsg2)) {
			reportStep("Error alert message is displayed", "Pass");
		}
		WebElement emailerrormsg = propElement(getPropfile(gpropname2, "emailinvalidalert1"));
		if (emailerrormsg.getText().contains("The email address GHDGFH!#!#! is not valid."))
			scrollToTheGivenWebElement(getPropfile(gpropname2, "Emailaddresslabel"));
		{
			reportStep(emailerrormsg.getText() + " is displayed", "Pass");

		}
		WebElement verifyemailerrormsg = propElement(getPropfile(gpropname2, "verifyemailinvalidalert1"));
		if (verifyemailerrormsg.getText().contains("The email address GHDGFH!#!#! is not valid.")) {
			reportStep(verifyemailerrormsg.getText() + " is displayed", "Pass");

			Thread.sleep(3000);
		}
		return this;
	}

	@Then("Error messages will display if any of 5 are left blank")
	public Icivics_StudentReg1classcode verifyerrormsgverifyemailblankfield() throws InterruptedException {
		WebElement link = propElement(getPropfile(gpropname2, "Link"));
		link.click();
		WebElement classcode = propElement(getPropfile(gpropname2, "classcode"));
		classcode.clear();
		WebElement firstname = propElement(getPropfile(gpropname2, "firstname"));
		firstname.clear();
		firstname.sendKeys(getPropfile(gpropname2, "FirstName"));
		WebElement lastname = propElement(getPropfile(gpropname2, "Lastname"));
		lastname.clear();
		lastname.sendKeys(getPropfile(gpropname2, "LastName"));
		waitTime(5000);
		WebElement emailele = propElement(getPropfile(gpropname2, "Emailaddress"));
		emailele.clear();
		emailele.sendKeys(getPropfile(gpropname2, "EmailID"));
		WebElement verifyemail = propElement(getPropfile(gpropname2, "VerifyEmailaddress"));
		verifyemail.clear();
		waitTime(5000);

		scrollToTheGivenWebElement(getPropfile(gpropname2, "nextbutton"));
		waitTime(3000);
		clickOn(getPropfile(gpropname2, "nextbutton"));

		WebElement alertmsg = propElement(getPropfile(gpropname2, "alertpopup1"));
		String Actualerrmsg = alertmsg.getText();
		String Expectederrmsg = "The classcode isn't linked to a class.";
		verifyPartialText(alertmsg, "The classcode isn't linked to a class.");
		if (Expectederrmsg.equals(Actualerrmsg)) {
			reportStep("Error alert message is displayed", "Pass");
		}

		WebElement alertmsg2 = propElement(getPropfile(gpropname2, "alertpopup2"));
		String Actualerrmsg2 = alertmsg.getText();
		String Expectederrmsg2 = "2 errors have been found:";
		verifyPartialText(alertmsg2, "2 errors have been found:");
		if (Expectederrmsg2.equals(Actualerrmsg2)) {
			reportStep("Error alert message is displayed", "Pass");
		}

		scrollToTheGivenWebElement(getPropfile(gpropname2, "Emailaddresslabel"));
		WebElement verifyclasscodealertmsg = propElement(getPropfile(gpropname2, "classcodemsg"));
		verifyPartialText(verifyclasscodealertmsg, "Class Code field is required.");

		WebElement verifyemailalertmsg2 = propElement(getPropfile(gpropname2, "verifyemailalertmsg"));
		verifyPartialText(verifyemailalertmsg2, "Verify email address field is required.");

		return this;
	}

	@Then("Enter invalid or blank info and hit next")
	public Icivics_StudentReg1classcode verifyinvaliderrormsg2() throws InterruptedException {
		WebElement link = propElement(getPropfile(gpropname2, "Link"));
		link.click();
		WebElement classcode = propElement(getPropfile(gpropname2, "classcode"));
		classcode.clear();
		classcode.sendKeys("12345");

		WebElement firstname = propElement(getPropfile(gpropname2, "firstname"));
		firstname.clear();
		firstname.sendKeys("14344433%");

		WebElement lastname = propElement(getPropfile(gpropname2, "Lastname"));
		lastname.clear();
		lastname.sendKeys("%ttt#12");

		WebElement email = propElement(getPropfile(gpropname2, "Emailaddress"));
		email.clear();
		email.sendKeys("GHDGFH!#!#!");

		WebElement verifyemail = propElement(getPropfile(gpropname2, "VerifyEmailaddress"));
		verifyemail.clear();
		verifyemail.sendKeys(" ");

		WebElement nextbutton = propElement(getPropfile(gpropname2, "nextbutton"));
		nextbutton.click();

		WebElement alertmsg = propElement(getPropfile(gpropname2, "alertpopup1"));
		String Actualerrmsg = alertmsg.getText();
		String Expectederrmsg = "The classcode isn't linked to a class.";
		verifyPartialText(alertmsg, "The classcode isn't linked to a class.");
		if (Expectederrmsg.equals(Actualerrmsg)) {
			reportStep("Error alert message is displayed", "Pass");
		}

		WebElement emailerrormsg = propElement(getPropfile(gpropname2, "emailinvalidalert1"));
		if (emailerrormsg.getText().contains("The email address GHDGFH!#!#! is not valid.")) {
			scrollToTheGivenWebElement(getPropfile(gpropname2, "Emailaddresslabel"));
			reportStep(emailerrormsg.getText() + " is displayed", "Pass");
		}

		WebElement verifyemailerrormsg = propElement(getPropfile(gpropname2, "verifyemailinvalidalert1"));
		if (verifyemailerrormsg.getText().contains("Verify email address field is required.")) {
			reportStep(verifyemailerrormsg.getText() + " is displayed", "Pass");
		}
		waitTime(3000);

		return this;
	}

	@Given("Enter valid info for each field and hit next")
	public Icivics_StudentReg1classcode verifyregistrationwithvalidvalue() throws InterruptedException, IOException {
		waitTime(5000);
		WebElement link = propElement(getPropfile(gpropname2, "Link"));
		link.click();
		WebElement classcode = propElement(getPropfile(gpropname2, "classcode"));
		classcode.clear();
		classcode.sendKeys(getPropfile(gpropname2, "ClassCode"));
		reportStep(getPropfile(gpropname2, "ClassCode") + " is entered as ClassCode", "Pass");

		
		WebElement username = propElement(getPropfile(gpropname2, "username"));
		String username1 = username.getText();
		writePropfile("EducatorRegistration/username", "username", username1);
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

		WebElement page2 = propElement(getPropfile(gpropname1, "Page2StudentReglabel"));
		if (page2.isDisplayed()) {
			reportStep("Page 2 is displayed", "Pass");
		} else {
			reportStep("Page 2 is not displayed", "Fail");
		}

		return this;
	}

}
