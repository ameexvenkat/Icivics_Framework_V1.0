package icivics_pages;

import java.util.Properties;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.aventstack.extentreports.ExtentTest;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import projectSpecific.base.ProjectSpecificMethods;

public class Icivics_HomepageHeaderAbout extends ProjectSpecificMethods {
	public String gpropname1 = "Homepage/homepageheader";
	public String gpropname2 = "Homepage/homepageteacherheader";
	public String gpropname3 = "Homepage/homepageheaderplay";
	public String gpropname4 = "Homepage/homepageheaderteach";
	public String gpropname5 = "Homepage/homepageheaderteach";

	public Icivics_HomepageHeaderAbout(RemoteWebDriver driver, ExtentTest node, Properties prop) {
		this.driver = driver;
		this.node = node;
		this.prop = prop;
	}

	@Given("Launch the icivis educatorregistration URL")
	public Icivics_HomepageHeaderAbout launchURL(String URL) {
		navigateto(URL);
		return this;

	}
	@Then("On Clicking about button at top about menu should open")
	public Icivics_HomepageHeaderAbout verifyaboutmenu() {
	click(propElement(getPropfile(gpropname2, "Aboutbutton")));
	waitTime(3000);
	reportStep("Aboutsubmenu display successfully", "Pass");
	return this;
}
}
