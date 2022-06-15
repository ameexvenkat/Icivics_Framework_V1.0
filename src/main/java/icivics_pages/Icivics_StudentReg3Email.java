package icivics_pages;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.aventstack.extentreports.ExtentTest;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import projectSpecific.base.ProjectSpecificMethods;

public class Icivics_StudentReg3Email extends ProjectSpecificMethods {
	public String gpropname = "StudentRegistration/studentregistration1Email";
	public String gpropname1 = "StudentRegistration/studentregistration1classcode";
	public String gpropname2 = "StudentRegistration/studentregistration2Email";
	public String gpropname3 = "StudentRegistration/studentregistration2classcode";
	public String gpropname4 = "StudentRegistration/studentregistration3Email";

	public Icivics_StudentReg3Email(RemoteWebDriver driver, ExtentTest node, Properties prop) {
		this.driver = driver;
		this.node = node;
		this.prop = prop;
	}

	@Given("Launch the icivis Studentregistration email URL")
	public Icivics_StudentReg3Email launchstudentURL(String URL) {
		navigateto(URL);
		return this;
	}

	public Icivics_StudentReg3Email verifywithvaliddata() throws IOException {
		WebElement username = propElement(getPropfile(gpropname1, "username"));
		String username1 = username.getText();
		writePropfile("StudentRegistration/username", "username", username1);
		reportStep("User name is " + username1, "Pass");

		WebElement firstname = propElement(getPropfile(gpropname1, "firstname"));
		firstname.clear();
		firstname.sendKeys(getPropfile(gpropname1, "FirstName"));
		reportStep(getPropfile(gpropname1, "FirstName") + " is entered as Firstname", "Pass");

		WebElement lastname = propElement(getPropfile(gpropname1, "Lastname"));
		lastname.clear();
		lastname.sendKeys(getPropfile(gpropname1, "LastName"));
		reportStep(getPropfile(gpropname1, "LastName") + " is entered as Lastname", "Pass");

		String EmailId = getPropfile(gpropname1, "EmailID");

		long number = (long) Math.floor(Math.random() * 900000000L) + 10000000L;
		String[] data = EmailId.split("@");
		String name = data[0];
		String host = data[1];
		String emailId = name + number + "@" + host;

		reportStep(emailId + " email is used for creating account", "Pass");
		writePropfile("StudentRegistration/email3", "email3", emailId);
		WebElement email = propElement(getPropfile(gpropname1, "Emailaddress"));
		email.clear();
		email.sendKeys(emailId);

		reportStep(getPropfile(gpropname1, "EmailID") + " is entered as Email", "Pass");

		WebElement verifyemailele = propElement(getPropfile(gpropname1, "VerifyEmailaddress"));
		verifyemailele.clear();
		verifyemailele.sendKeys(emailId);
		reportStep(getPropfile(gpropname1, "VerifyEmailID") + " is entered as Verify email", "Pass");

		scrollToTheGivenWebElement(getPropfile(gpropname1, "nextbutton"));
		reportStep("Next Button is clicked", "Pass");
		click(propElement(getPropfile(gpropname1, "nextbutton")));
		waitTime(3000);
		String pwd = "Test@12345";
		String cpwd = "Test@12345";
		WebElement password = propElement(getPropfile(gpropname1, "password1"));
		clearAndType(password, pwd);

		WebElement confirmpassword = propElement(getPropfile(gpropname1, "confirmpassword1"));
		clearAndType(confirmpassword, cpwd);

		click(propElement(getPropfile(gpropname1, "agreechkbox")));
		waitTime(3000);
		click(propElement(getPropfile(gpropname1, "finishbutton")));
		waitTime(5000);

		return this;
	}

	@And("View page 3 of student registration")
	public Icivics_StudentReg3Email verifypagecount3() throws IOException {

		String cssvalue = "background-color";

		String Greencolor = "rgb(0, 178, 124)";

		String Step1 = cssgetbefore(getPropfile(gpropname, "step1ele"), cssvalue, Greencolor);
		String Step2 = cssgetbefore(getPropfile(gpropname, "step2ele"), cssvalue, Greencolor);
		String Step3 = cssgetbefore(getPropfile(gpropname, "step3ele"), cssvalue, Greencolor);

		if (Step1.equals(Greencolor) && Step2.equals(Greencolor) && Step3.equals(Greencolor)) {
			reportStep("you are currently viewing page 3 in the breadcrumbs", "Pass");
		} else {
			reportStep("unable to identify which page you are currently viewing in the breadcrumbs", "Fail");
		}
		return this;
	}

	@Given("verify Message says check your inbox")
	public Icivics_StudentReg3Email verifycheckmsgdisplay() throws IOException {
		WebElement emailmsg = propElement(getPropfile(gpropname4, "emailmsg"));
		if (emailmsg.getText().equals("Check your inbox at:") && emailmsg.isDisplayed()) {
			reportStep(emailmsg.getText() + " label is verified", "Pass");
		} else {
			reportStep("email label is not verified", "Fail");
		}

		return this;
	}

	@Then("Verify Message says confirmation email is on its way")
	public Icivics_StudentReg3Email verifyemailheaderlabel() {
		WebElement emailheadermsg = propElement(getPropfile(gpropname4, "emailheadermsg"));
		if (emailheadermsg.isDisplayed() && emailheadermsg.getText().equals("Your confirmation email is on the way!")) {
			reportStep(emailheadermsg.getText() + " email header msg is displayed and label text verified", "Pass");
		} else {
			reportStep("email header msg is not displayed and label text is not verified", "Fail");
		}

		return this;
	}

	@Given("Message has correct email from what was registered")
	public Icivics_StudentReg3Email verifyregisteredemaildisplay() throws IOException {
		String emailID = propElement(getPropfile(gpropname4, "emailID")).getText();
		String email1 = getPropfile("StudentRegistration/email3", "email3");
		if (email1.equals(emailID)) {
			reportStep("Registered email Id is verified", "Pass");
		} else {
			reportStep("Registered email Id is verified not are same", "Fail");
		}
		return this;
	}

	@Given("Verify resend button is clickable")
	public Icivics_StudentReg3Email verifyresendbutton() {
		scrollToTheGivenWebElement(getPropfile(gpropname4, "resendbutton"));
		if (clickOn(getPropfile(gpropname4, "resendbutton"))) {
			reportStep("resend button is clicked successfully", "Pass");
		} else {
			reportStep("resend button is not clicked", "Fail");
		}
		scrollToTheGivenWebElement(getPropfile(gpropname4, "resendbutton"));
		waitTime(3000);
		return this;
	}

	@Given("Verify Screen shows confirmation email has been sent")
	public Icivics_StudentReg3Email verifyconfirmationemail() {
		scrollToTheGivenWebElement(getPropfile(gpropname4, "resendbutton"));
		clickOn(getPropfile(gpropname4, "resendbutton"));
		waitTime(3000);

		WebElement confirmationemailheadermsg = propElement(getPropfile(gpropname4, "confirmationemailheadermsg"));
		if (confirmationemailheadermsg.isDisplayed()
				&& confirmationemailheadermsg.getText().equals("Confirmation email has been resent.")) {
			reportStep(confirmationemailheadermsg.getText() + " conformation email msg is displayed and text verified",
					"Pass");
		} else {
			reportStep("confirmation email msg is not displayed and text is not verified", "Fail");
		}
		return this;
	}

}
