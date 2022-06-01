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
		click(propElement(getPropfile(gpropname1, "Headerlogo2")));

		waitTime(3000);
		WebElement aboutbutton = propElement(getPropfile(gpropname2, "Aboutbutton"));
		if (aboutbutton.isDisplayed()) {
			reportStep("aboutbutton Verified successfully", "Pass");
		} else {
			reportStep("aboutbutton is not Verified successfully", "Fail");
		}

		return this;
	}

	@Then("Click the teach button Links for 6 menu options should appear")
	public Icivics_HomepageHeaderAbout verifymenuoptionscount() {
		click(propElement(getPropfile(gpropname2, "Aboutbutton")));
		waitTime(3000);
		reportStep("Aboutsubmenu display successfully", "Pass");
		List<WebElement> dropdowns = driver.findElements(By.xpath("(//*[@class='dropdown-menu'])[7]"));
		System.out.println(dropdowns.size());
		for (WebElement dropdown : dropdowns) {
			System.out.println(dropdown.getText());
		}
		return this;

	}

	@Then("check all links of teach button")
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
	@Given("Click the about menu, menu opens Click about menu again Teach menu should closes")
	public Icivics_HomepageHeaderAbout  clickaboutbuttonagain() {
		click(propElement(getPropfile(gpropname2, "Aboutbutton")));
		waitTime(3000);
		click(propElement(getPropfile(gpropname2, "Aboutbutton")));
		
		return this;

}
}
