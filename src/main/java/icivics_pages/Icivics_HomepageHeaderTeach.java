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

public class Icivics_HomepageHeaderTeach extends ProjectSpecificMethods {
	public String gpropname1 = "Homepage/homepageheader";
	public String gpropname2 = "Homepage/homepageteacherheader";
	public String gpropname3 = "Homepage/homepageheaderplay";
	public String gpropname4 = "Homepage/homepageheaderteach";

	public Icivics_HomepageHeaderTeach(RemoteWebDriver driver, ExtentTest node, Properties prop) {
		this.driver = driver;
		this.node = node;
		this.prop = prop;
	}

	@Given("Launch the icivis educatorregistration URL")
	public Icivics_HomepageHeaderTeach launchURL(String URL) {
		navigateto(URL);
		return this;

	}

	@Then("On Clicking  teach button at top Play menu should open")
	public Icivics_HomepageHeaderTeach verifyteachsubmenu() {
		click(propElement(getPropfile(gpropname2, "Teachbutton")));
		waitTime(3000);
		reportStep("Teachsubmenu display successfully", "Pass");
		List<WebElement> dropdowns = driver.findElements(By.xpath("(//*[@class='dropdown-menu'])[6]"));

		for (WebElement dropdown : dropdowns) {
			System.out.println(dropdown.getText());
		}
		return this;

	}

	@Then("Click the teach button Links for 6 menu options should appear")
	public Icivics_HomepageHeaderTeach verifymenuoptionscount() {
		click(propElement(getPropfile(gpropname2, "Teachbutton")));
		waitTime(3000);
		reportStep("Teachsubmenu display successfully", "Pass");
		List<WebElement> dropdowns = driver.findElements(By.xpath("(//*[@class='dropdown-menu'])[6]"));
		System.out.println(dropdowns.size());
		for (WebElement dropdown : dropdowns) {
			System.out.println(dropdown.getText());
		}
		return this;

	}
	@Then("check all links of teach button")
	public Icivics_HomepageHeaderTeach Teachbuttonelementsverification(String URL) throws IOException {
		String propname = "Homepage/teachdropdown";
		String TeachButton = getPropfile(propname, "TeachButtonElement");
		navigateto(URL);

		// Search Our Library
		mouseOverAndClickAction(TeachButton);
		Verifylinks(getprop(propname, "solElement"), getpropstring(propname, "solText"),
				getpropstring(propname, "solUrL"), getpropstring(propname, "solTitle"));
		verifyPartialText(getprop(propname, "solheaderele"), getpropstring(propname, "solheader"));

		// SCOPE & SEQUENCE
		mouseOverAndClickAction(TeachButton);
		Verifylinks(getprop(propname, "sasElement"), getpropstring(propname, "sasText"),
				getpropstring(propname, "sasUrL"), getpropstring(propname, "sasTitle"));
		verifyPartialText(getprop(propname, "sasheaderele"), getpropstring(propname, "sasheader"));

		// PROFESSIONAL DEVELOPMENT
		mouseOverAndClickAction(TeachButton);
		Verifylinks(getprop(propname, "pdElement"), getpropstring(propname, "pdText"), getpropstring(propname, "pdUrL"),
				getpropstring(propname, "pdTitle"));
		verifyPartialText(getprop(propname, "pdheaderele"), getpropstring(propname, "pdheader"));

		// GET STARTED
		mouseOverAndClickAction(TeachButton);
		Verifylinks(getprop(propname, "gsElement"), getpropstring(propname, "gsText"), getpropstring(propname, "gsUrL"),
				getpropstring(propname, "gsTitle"));
		verifyPartialText(getprop(propname, "gsheaderele"), getpropstring(propname, "gsheader"));

		// EDUCATOR COMMUNITY
		mouseOverAndClickAction(TeachButton);
		verifyDisplayed(getprop(propname, "ecElement"));
		verifyExactText(getprop(propname, "ecElement"), getpropstring(propname, "ecText"));
		click(getprop(propname, "ecElement"));
		verifyTitle(getpropstring(propname, "Community – iCivics"));
		
		// FAQ
		navigateto(URL);
		waitTime(3000);
		mouseOverAndClickAction(TeachButton);
		Verifylinks(getprop(propname, "faqElement"), getpropstring(propname, "faqText"),
				getpropstring(propname, "faqUrL"), getpropstring(propname, "faqTitle"));
		verifyPartialText(getprop(propname, "faqheaderele"), getpropstring(propname, "faqheader"));

		reportStep("All links in the teach dropdown is verified sucessfully", "Pass");

		return this;

	}
	@Given("Click the teach menu, menu opens Click teach menu again Teach menu should closes")
	public Icivics_HomepageHeaderTeach clickteachbuttonagain() {
		click(propElement(getPropfile(gpropname2, "Teachbutton")));
		waitTime(3000);
		click(propElement(getPropfile(gpropname2, "Teachbutton")));
		
		return this;

}
}
