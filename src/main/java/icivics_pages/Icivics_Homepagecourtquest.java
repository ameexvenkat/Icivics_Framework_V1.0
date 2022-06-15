package icivics_pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.aventstack.extentreports.ExtentTest;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import projectSpecific.base.ProjectSpecificMethods;

public class Icivics_Homepagecourtquest extends ProjectSpecificMethods {
	public String gpropname1 = "Homepage/homepageheader";
	public String gpropname2 = "Homepage/homepageteacherheader";
	public String gpropname3 = "Homepage/homepageheaderplay";
	
	public Icivics_Homepagecourtquest(RemoteWebDriver driver, ExtentTest node, Properties prop) {
		this.driver = driver;
		this.node = node;
		this.prop = prop;
	}

	@Given("Launch the icivis educatorregistration URL")
	public Icivics_Homepagecourtquest launchURL(String URL) {
		navigateto(URL);
		return this;

	} 
	@Then("Verify Current game should underlined on the menu")
	public Icivics_Homepagecourtquest verifytextisunderlined() {
		click(propElement(getPropfile(gpropname2, "Playbutton")));
		
		String cssValue=getPropfile(gpropname3, "CourtquestText");
				System.out.println ("value"+cssValue);
				WebElement cssvalue1 = propElement(cssValue);
				if(cssvalue1.isDisplayed()) {
				reportStep("text is underlined Verified successfully", "Pass");
				}
				else
				{
					reportStep("text is not underlined Verified successfully", "Pass");
				}
	return this;
	}
	

}
