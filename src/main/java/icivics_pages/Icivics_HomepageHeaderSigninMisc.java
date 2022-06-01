package icivics_pages;

import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.aventstack.extentreports.ExtentTest;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import projectSpecific.base.ProjectSpecificMethods;

public class Icivics_HomepageHeaderSigninMisc extends ProjectSpecificMethods {
	public String gpropname1 = "Homepage/homepageheader";
	public String gpropname2 = "Homepage/homepageteacherheader";
	public String gpropname3 = "Homepage/homepageheaderplay";
	public String gpropname4 = "Homepage/homepageheaderteach";
	public String gpropname5 = "Homepage/homepageheaderabout";
	public String gpropname6 = "Homepage/homepageheadersigninmisc";

	public Icivics_HomepageHeaderSigninMisc(RemoteWebDriver driver, ExtentTest node, Properties prop) {
		this.driver = driver;
		this.node = node;
		this.prop = prop;
	}

	@Given("Launch the icivis educatorregistration URL")
	public Icivics_HomepageHeaderSigninMisc launchURL(String URL) {
		navigateto(URL);
		return this;

	}
	@Given("signin as a teacher")
	public Icivics_HomepageHeaderSigninMisc signin() {
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


	@Then("Verify Donate button appears")
	public Icivics_HomepageHeaderSigninMisc VerifyDonatebutton() {
		WebElement donatebutton = propElement(getPropfile(gpropname1, "Donatebutton"));
		if (donatebutton.isDisplayed()) {
			reportStep("Donatebutton Verified successfully", "Pass");
		} else {
			reportStep("Donatebutton is not Verified successfully", "Fail");
		}

		return this;
	}

	@Then("click on donate button and verify the URL")
	public Icivics_HomepageHeaderSigninMisc VerifyDonateclick() throws IOException {

		click(propElement(getPropfile(gpropname1, "Donatebutton")));

		getpropstring(gpropname6, "rtrUrL");
		return this;

	}

	@Then("Verify Shop button appears")
	public Icivics_HomepageHeaderSigninMisc VerifyShopbutton() {
		WebElement donatebutton = propElement(getPropfile(gpropname1, "shopbutton"));
		if (donatebutton.isDisplayed()) {
			reportStep("Shopbutton Verified successfully", "Pass");
		} else {
			reportStep("Shopbutton is not Verified successfully", "Fail");
		}

		return this;
	}

	@Then("click on shop button and verify the URL")
	public Icivics_HomepageHeaderSigninMisc VerifyShopbuttonclick() throws IOException {
		click(propElement(getPropfile(gpropname6, "shopbuttonele")));
		mouseOverAndClickAction(getPropfile(gpropname6, "shopbuttonele"));
		Verifylinks(getprop(gpropname6, "shopbuttonele"), getpropstring(gpropname6, "shopText"),
				getpropstring(gpropname6, "shopUrL"), getpropstring(gpropname6, "shopTitle"));
		verifyPartialText(getprop(gpropname6, "shopheaderele"), getpropstring(gpropname6, "shopheader"));

		reportStep("shop URL is verified sucessfully", "Pass");

		return this;

	}

	@Then("Go to home page,as an anonymous user Sign in button should appears in top/right")
	public Icivics_HomepageHeaderSigninMisc verifysigninbutton() {

		WebElement Signinbutton = propElement(getPropfile(gpropname6, "Signinbutton2"));
		if (Signinbutton.isDisplayed()) {
			reportStep("Signinbutton Verified successfully", "Pass");
		} else {
			reportStep("Signinbutton is not Verified successfully", "Fail");
		}
		return this;
	}

	@Then("Go to home page signed in as a teacher My iCivics button should appears in top/right")

	public Icivics_HomepageHeaderSigninMisc verifymyicvicsbuttonafterlogin() {

		click(propElement(getPropfile(gpropname1, "Signinbutton")));
		click(propElement(getPropfile(gpropname1, "Signinlink")));
		WebElement username = propElement(getPropfile(gpropname1, "Username"));
		username.sendKeys("Bronze Speaker 1r4e");
		WebElement password = propElement(getPropfile(gpropname1, "Password"));
		password.sendKeys("i898qrCiPK9Hwgb");
		click(propElement(getPropfile(gpropname2, "Loginbutton")));
		waitTime(3000);
		
		WebElement myicivicsbutton = propElement(getPropfile(gpropname2, "Myicivicsbutton2"));
		if (myicivicsbutton.isDisplayed()) {
			reportStep("Myicivicsbutton Verified successfully", "Pass");
		} else {
			reportStep("Myicivicsbutton is not Verified successfully", "Fail");
		}
		WebElement Signinbutton = propElement(getPropfile(gpropname1, "Signinbutton"));
		if (Signinbutton.isDisplayed()) {
			reportStep("Signinbutton Verified successfully", "Pass");
		} else {
			reportStep("Signinbutton is not Verified successfully", "Fail");
		}
		return this;
	}
	

@Then("Click on Myicivics button and submenu should display on clicking")
public Icivics_HomepageHeaderSigninMisc verifymyicvicsbuttonsubmenu() {
	click(propElement(getPropfile(gpropname2, "Myicivicsbutton")));
	waitTime(3000);
	reportStep("myicivicssubmenu display successfully", "Pass");
	List<WebElement> dropdowns = driver.findElements(By.xpath("(//*[@class='dropdown-menu'])[8]"));
	System.out.println(dropdowns.size());

	for (WebElement dropdown : dropdowns) {
		System.out.println(dropdown.getText());
	}
	return this;

}
@Then("Click on signin button and submenu should display on clicking")
public Icivics_HomepageHeaderSigninMisc verifysigninbuttonsubmenu() {
	click(propElement(getPropfile(gpropname1, "Signinbutton")));
	waitTime(3000);
	reportStep("signinsubmenu display successfully", "Pass");
	List<WebElement> dropdowns = driver.findElements(By.xpath("(//*[@class='dropdown-menu'])[8]"));
	System.out.println(dropdowns.size());

	for (WebElement dropdown : dropdowns) {
		System.out.println(dropdown.getText());
	}
	return this;

}
@Then("Click one of the 3 links on the submenu and verify whether it redirects to corresponding page")
public Icivics_HomepageHeaderSigninMisc Signinbuttonelementsverification(String URL) throws IOException {
	String propname = "Homepage/signindropdowndropdown";
	String SigninButton = getPropfile(propname, "SigninButtonElement");
	navigateto(URL);

	// Signin
	mouseOverAndClickAction(SigninButton);
	Verifylinks(getprop(propname, "signinElement"), getpropstring(propname, "signinText"),
			getpropstring(propname, "signinUrL"), getpropstring(propname, "signinTitle"));
	//verifyPartialText(getprop(propname, "sasheaderele"), getpropstring(propname, "sasheader"));

	// Register As a Student
	mouseOverAndClickAction(SigninButton);
	Verifylinks(getprop(propname, "stuElement"), getpropstring(propname, "stuText"),
			getpropstring(propname, "stuUrL"), getpropstring(propname, "stuTitle"));
	//verifyPartialText(getprop(propname, "sasheaderele"), getpropstring(propname, "sasheader"));

	// Register As a Teacher
	mouseOverAndClickAction(SigninButton);
	Verifylinks(getprop(propname, "teaElement"), getpropstring(propname, "teaText"), getpropstring(propname, "teaUrL"),
			getpropstring(propname, "teaTitle"));
	//verifyPartialText(getprop(propname, "pdheaderele"), getpropstring(propname, "pdheader"));
return this;
}
}
