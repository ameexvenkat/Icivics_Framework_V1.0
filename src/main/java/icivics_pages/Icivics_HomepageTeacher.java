package icivics_pages;

import java.util.Properties;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.aventstack.extentreports.ExtentTest;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import projectSpecific.base.ProjectSpecificMethods;

public class Icivics_HomepageTeacher extends ProjectSpecificMethods {
	public String gpropname = "Homepage/homepageheader";
	public String gpropname1 = "Homepage/homepageteacherheader";
	public String gpropname2 = "Homepage/homepageheaderplay";
	public String gpropname3 = "Homepage/homepageheaderteach";

	public Icivics_HomepageTeacher(RemoteWebDriver driver, ExtentTest node, Properties prop) {
		this.driver = driver;
		this.node = node;
		this.prop = prop;
	}

	@Given("Launch the icivis educatorregistration URL")
	public Icivics_HomepageTeacher launchURL(String URL) {
		navigateto(URL);
		return this;

	}

	@Then("Verify Menu appears with underlined option IF you are on main teach page, professional development, or get started.")
	public Icivics_HomepageTeacher verifytextisunderlined() {
		click(propElement(getPropfile(gpropname1, "Teachbutton")));
		String cssValue = getPropfile(gpropname3, "Searchourlibrary");
		System.out.println("value" + cssValue);
		WebElement cssvalue1 = propElement(cssValue);
		if (cssvalue1.isDisplayed()) {
			reportStep("text is underlined Verified successfully", "Pass");
		} else {
			reportStep("text is not underlined Verified successfully", "Pass");
		}
		click(propElement(getPropfile(gpropname1, "Teachbutton")));
		click(propElement(getPropfile(gpropname3, "ScopeandSequence")));
		String cssValue1 = getPropfile(gpropname3, "ScopeandSequence ");
		System.out.println("value" + cssValue1);
		WebElement cssvalue2 = propElement(cssValue);
		if (cssvalue2.isDisplayed()) {
			reportStep("text is underlined Verified successfully", "Pass");
		} else {
			reportStep("text is not underlined Verified successfully", "Pass");
		}
		return this;
	}

}
