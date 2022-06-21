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

public class Icivics_HomepageHeaderAbout extends ProjectSpecificMethods {
	public String gpropname = "Homepage/homepageheader";
	public String gpropname1 = "Homepage/homepageteacherheader";
	public String gpropname2 = "Homepage/homepageheaderplay";
	public String gpropname3 = "Homepage/homepageheaderteach";
	public String gpropname4 = "Homepage/homepageheaderabout";

	public Icivics_HomepageHeaderAbout(RemoteWebDriver driver, ExtentTest node, Properties prop) {
		this.driver = driver;
		this.node = node;
		this.prop = prop;
	}

	@Given(" Launch the icivics URL")
	public Icivics_HomepageHeaderAbout launchURL(String URL) {
		navigateto(URL);
		return this;

	}

	@Then("Verify click on about button at top about submenu open other than homepage ")
	public Icivics_HomepageHeaderAbout verifyaboutmenu() {
		click(propElement(getPropfile(gpropname, "Headerlogo2")));
		waitTime(3000);
		reportStep("For Homepage aboutbutton is not present", "Fail");
		return this;
	}

	public Icivics_HomepageHeaderAbout clickonaboutmenu() {
		WebElement aboutbutton = propElement(getPropfile(gpropname1, "Aboutbutton"));
		if (aboutbutton.isDisplayed()) {
			click(propElement(getPropfile(gpropname1, "Aboutbutton")));
			reportStep("Aboutsubmenu display successfully", "Pass");
		} else {
			reportStep("Aboutsubmenu is not display successfully", "Pass");
		}
		return this;
	}

	@Given("Verify about submenu ")
	public Icivics_HomepageHeaderAbout verifyaboutoptionscount() {

		List<WebElement> allOptions = driver.findElements(By.xpath("(//*[@class='dropdown-menu'])[7]/li"));

		reportStep("Aboutbutton submenu count is" + " " + allOptions.size(), "Pass");
		for (int i = 0; i < allOptions.size(); i++) {
			WebElement optionelement = allOptions.get(i);
			String optionsText = optionelement.getText();

			reportStep("Aboutbutton submenu is " + " " + optionsText, "Pass");

		}
		return this;

	}

	@Given("Verify click on all about menu options and all options redirect to corresponding page ")
	public Icivics_HomepageHeaderAbout aboutbuttonelementsverification(String URL) throws IOException {
		String propname = "Homepage/aboutdropdown";
		String AboutButton = getPropfile(propname, "AboutButtonElement");
		navigateto(URL);

		// About iCivics
		mouseOverAndClickAction(AboutButton);
		Verifylinks(getprop(propname, "aboutElement"), getpropstring(propname, "aboutText"),
				getpropstring(propname, "aboutUrL"), getpropstring(propname, "aboutTitle"));
		verifyPartialText(getprop(propname, "aboutheaderele"), getpropstring(propname, "aboutheader"));

		// Who We Are
		mouseOverAndClickAction(AboutButton);
		Verifylinks(getprop(propname, "wwaElement"), getpropstring(propname, "wwaText"),
				getpropstring(propname, "wwaUrL"), getpropstring(propname, "wwaTitle"));
		navigateto(URL);

		// Our Strategy
		mouseOverAndClickAction(AboutButton);
		Verifylinks(getprop(propname, "osElement"), getpropstring(propname, "osText"), getpropstring(propname, "osUrL"),
				getpropstring(propname, "osTitle"));
		navigateto(URL);

		// CivXNow
		mouseOverAndClickAction(AboutButton);
		Verifylinks(getprop(propname, "cxnElement"), getpropstring(propname, "cxnText"),
				getpropstring(propname, "cxnUrL"), getpropstring(propname, "cxnTitle"));
		navigateto(URL);

		// Our Team
		mouseOverAndClickAction(AboutButton);
		Verifylinks(getprop(propname, "otElement"), getpropstring(propname, "otText"), getpropstring(propname, "otUrL"),
				getpropstring(propname, "otTitle"));
		navigateto(URL);

		// Blog
		mouseOverAndClickAction(AboutButton);
		Verifylinks(getprop(propname, "blogElement"), getpropstring(propname, "blogText"),
				getpropstring(propname, "blogUrL"), getpropstring(propname, "blogTitle"));
		verifyPartialText(getprop(propname, "blogheaderele"), getpropstring(propname, "blogheader"));
		navigateto(URL);

		// Contact Us
		mouseOverAndClickAction(AboutButton);
		Verifylinks(getprop(propname, "cuElement"), getpropstring(propname, "cuText"), getpropstring(propname, "cuUrL"),
				getpropstring(propname, "cuTitle"));
		navigateto(URL);

		reportStep("All links in the About dropdown is verified sucessfully", "Pass");
		return this;

	}

	@Given("Verify on clicking about menu again it close")
	public Icivics_HomepageHeaderAbout clickaboutbuttonagain() {
		WebElement Aboutbuttonlink = (propElement(getPropfile(gpropname1, "Aboutbutton")));

		if (Aboutbuttonlink.isDisplayed()) {
			click(propElement(getPropfile(gpropname1, "Aboutbutton")));
			reportStep("About button is successfully clicked again and about menu is close", "Pass");
			waitTime(3000);
		} else {
			reportStep("About button is not clicked again successfully and about menu is not close", "Fail");
		}
		return this;

	}
}
