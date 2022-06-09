package icivics_pages;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.aventstack.extentreports.ExtentTest;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import projectSpecific.base.ProjectSpecificMethods;

public class Icivics_StudentReg3classcode extends ProjectSpecificMethods {
	public String gpropname1 = "StudentRegistration/studentregistration1Email";
	public String gpropname2 = "StudentRegistration/studentregistration1classcode";
	public String gpropname3 = "StudentRegistration/studentregistration2Email";
	public String gpropname4 = "StudentRegistration/studentregistration2classcode";
	public String gpropname5 = "StudentRegistration/studentregistration3Email";
	public String gpropname6 = "StudentRegistration/studentregistration3classcode";

	public Icivics_StudentReg3classcode(RemoteWebDriver driver, ExtentTest node, Properties prop) {
		this.driver = driver;
		this.node = node;
		this.prop = prop;
	}

	@Given("Launch the icivis Studentregistration email URL")
	public Icivics_StudentReg3classcode launchstudentURL(String URL) {
		navigateto(URL);
		return this;
	}

	public Icivics_StudentReg3classcode verifyregistrationwithvaliddata() throws InterruptedException, IOException {
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

		String EmailId = getPropfile(gpropname2, "EmailID");

		long number = (long) Math.floor(Math.random() * 900000000L) + 10000000L;
		String[] data = EmailId.split("@");
		String name = data[0];
		String host = data[1];
		String emailId = name + number + "@" + host;

		reportStep(emailId + " email is used for creating account", "Pass");
		writePropfile("StudentRegistration/email3", "email3", emailId);
		WebElement email = propElement(getPropfile(gpropname2, "Emailaddress"));
		email.clear();
		email.sendKeys(emailId);

		reportStep(getPropfile(gpropname2, "EmailID") + " is entered as Email", "Pass");

		WebElement verifyemailele = propElement(getPropfile(gpropname2, "VerifyEmailaddress"));
		verifyemailele.clear();
		verifyemailele.sendKeys(emailId);
		reportStep(getPropfile(gpropname2, "VerifyEmailID") + " is entered as Verify email", "Pass");

		scrollToTheGivenWebElement(getPropfile(gpropname2, "nextbutton"));
		reportStep("Next Button is clicked", "Pass");
		click(propElement(getPropfile(gpropname2, "nextbutton")));
		waitTime(3000);
		String pwd = "Test@12345";
		String cpwd = "Test@12345";
		WebElement password = propElement(getPropfile(gpropname3, "password1"));
		clearAndType(password, pwd);

		WebElement confirmpassword = propElement(getPropfile(gpropname3, "confirmpassword1"));
		clearAndType(confirmpassword, cpwd);

		click(propElement(getPropfile(gpropname3, "agreechkbox")));
		waitTime(3000);
		click(propElement(getPropfile(gpropname3, "finishbutton")));
		waitTime(5000);

		return this;
	}

	@And("View page 3 of student registration")
	public Icivics_StudentReg3classcode verifypagecount3() throws IOException {

		String cssvalue = "background-color";

		String Greencolor = "rgb(0, 178, 124)";

		String Step1 = cssgetbefore(getPropfile(gpropname5, "step1"), cssvalue, Greencolor);
		String Step2 = cssgetbefore(getPropfile(gpropname5, "step2"), cssvalue, Greencolor);
		String Step3 = cssgetbefore(getPropfile(gpropname5, "step3"), cssvalue, Greencolor);

		if (Step1.equals(Greencolor) && Step2.equals(Greencolor) && Step3.equals(Greencolor)) {
			reportStep("you are currently viewing page 3 in the breadcrumbs", "Pass");
		} else {
			reportStep("unable to identify which page you are currently viewing in the breadcrumbs", "Fail");
		}
		return this;
	}

	@Given("Verify generated username is displayed correctly")
	public Icivics_StudentReg3classcode verifyusernamegenerateddisplay() throws IOException {
		WebElement generatedusername = propElement(getPropfile(gpropname6, "Generatedusername"));
		waitTime(3000);
		String generatedusername1 = generatedusername.getText();
		if (!generatedusername1.isEmpty()) {
			reportStep("GeneratedUsername field is not empty,it is pregenerated with " + generatedusername1
					+ " and Verified successfully", "Pass");
		} else {
			reportStep("GeneratedUsername field is empty", "Fail");
		}

		return this;
	}

	@Given("Verify Note about username and password is visible")
	public Icivics_StudentReg3classcode verifyusernametextddisplay() {
		WebElement usernametext = propElement(getPropfile(gpropname6, "UsernameText"));
		String usernametext1 = usernametext.getText();
		if (usernametext1.contains(usernametext1)) {
			reportStep("Usernametext field is not empty,it is pregenerated with " + usernametext1
					+ " and Verified successfully", "Pass");
		} else {
			reportStep("Usernametext field is empty", "Fail");
		}

		System.out.println(usernametext1 + "username text display");
		return this;
	}

	@Given("Verify Email address is displayed")
	public Icivics_StudentReg3classcode verifyemailddisplay() throws IOException {
		WebElement emailaddress = propElement(getPropfile(gpropname6, "Emailaddress3"));
		waitTime(3000);
		String emailaddress1 = emailaddress.getText();
		if (!emailaddress1.isEmpty()) {
			reportStep(
					"Email field is not empty,it is pregenerated with " + emailaddress1 + " and Verified successfully",
					"Pass");
		} else {
			reportStep("Email field is empty", "Fail");
		}
		return this;

	}

	@Given("Verify Note about username or email and password is visible")
	public Icivics_StudentReg3classcode verifyemailtextddisplay() {
		WebElement emailtext = propElement(getPropfile(gpropname6, "EmailText"));
		String emailtext1 = emailtext.getText();
		if (emailtext1.contains("You may also use this email address along with the password you entered to log in.")) {
			reportStep(
					"Emailtext field is not empty,it is pregenerated with " + emailtext1 + " and Verified successfully",
					"Pass");
		} else {
			reportStep("Emailtext field is empty", "Fail");
		}

		return this;
	}
	@Given("Verify Page goes to student My iCivics page")
	public Icivics_StudentReg3classcode clickcontinuetomyassignmentbutton() {
		WebElement continuetomyassignmentbutton = propElement(getPropfile(gpropname6, "Continuetomyassignmentbutton"));
		continuetomyassignmentbutton.click();
		waitTime(3000);
		switchToWindow(getPropfile(gpropname6, "Continuetomyassignmentbutton"));
		System.out.println(driver.getTitle());
		defaultContent();
		return this;

	}
}
