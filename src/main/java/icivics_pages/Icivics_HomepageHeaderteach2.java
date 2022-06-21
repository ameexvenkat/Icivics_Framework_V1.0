package icivics_pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.aventstack.extentreports.ExtentTest;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import projectSpecific.base.ProjectSpecificMethods;

public class Icivics_HomepageHeaderteach2 extends ProjectSpecificMethods {
	public String gpropname = "Homepage/homepageheader";
	public String gpropname1 = "Homepage/homepageteacherheader";
	public String gpropname2 = "Homepage/homepageheaderplay";
	public String gpropname3 = "Homepage/homepageheaderteach";

	public Icivics_HomepageHeaderteach2(RemoteWebDriver driver, ExtentTest node, Properties prop) {
		this.driver = driver;
		this.node = node;
		this.prop = prop;
	}

	@Given("Launch the icivis educatorregistration URL")
	public Icivics_HomepageHeaderteach2 launchURL(String URL) {
		navigateto(URL);
		return this;

	}

	@Then("Verify on Clicking teach button at top teach submenu open")
	public Icivics_HomepageHeaderteach2 verifyteachmenu() {
		WebElement teachbutton = propElement(getPropfile(gpropname1, "Teachbutton"));
		if (teachbutton.isDisplayed()) {
			teachbutton.click();
			reportStep("Teachsubmenu is  display ", "Pass");
		} else {
			reportStep("Teachsubmenu is not display ", "Fail");
		}
		return this;
	}

	@Then("Verify Menu appears with underlined option IF you are on main teach page, professional development, or get started.")
	public Icivics_HomepageHeaderteach2 verifytextisunderlined() {
		waitTime(3000);
		WebElement sollink = driver.findElement(By.xpath("(//li[@class='active active-trail first search our library']/a)[2]"));
		sollink.click();
		waitTime(3000);
		click(propElement(getPropfile(gpropname1, "Teachbutton")));
		waitTime(3000);
		String cssValue = driver.findElement(By.xpath("(//li[@class='active active-trail first search our library']/a)[2]"))
				.getCssValue("text-decoration");

		System.out.println(cssValue);
		if (cssValue.contains("underline")) {

			reportStep("Selected page is underlined", "Pass");

		} else {
			reportStep("Selected page is not underlined", "Fail");
		}
		WebElement snslink = driver.findElement(By.xpath("(//li[@class='scope & sequence']/a)[2]"));
		snslink.click();
		waitTime(3000);
		click(propElement(getPropfile(gpropname1, "Teachbutton")));
		waitTime(3000);
		String cssValue1 = driver.findElement(By.xpath("(//li[@class='scope & sequence']/a)[2]"))
				.getCssValue("text-decoration");
		if (cssValue1.contains("underline")) {

			reportStep("Selected page is underlined", "Pass");

		} else {
			reportStep("Selected page is not underlined", "Fail");
		}
		WebElement pdlink = driver.findElement(By.xpath("(//li[@class='professional development']/a)[2]"));
		pdlink.click();
		waitTime(3000);
		click(propElement(getPropfile(gpropname1, "Teachbutton")));
		waitTime(3000);
		String cssValue2 = driver.findElement(By.xpath("(//li[@class='professional development']/a)[2]"))
				.getCssValue("text-decoration");
		if (cssValue2.contains("underline")) {

			reportStep("Selected page is underlined", "Pass");

		} else {
			reportStep("Selected page is not underlined", "Fail");
		}
		WebElement gslink = driver.findElement(By.xpath("(//li[@class='get started']/a)[2]"));
		gslink.click();
		waitTime(3000);
		click(propElement(getPropfile(gpropname1, "Teachbutton")));
		waitTime(3000);
		String cssValue3 = driver.findElement(By.xpath("(//li[@class='get started']/a)[2]"))
				.getCssValue("text-decoration");
		if (cssValue3.contains("underline")) {

			reportStep("Selected page is underlined", "Pass");

		} else {
			reportStep("Selected page is not underlined", "Fail");
		}
		WebElement eclink = driver.findElement(By.xpath("(//li[@class='educator community']/a)[2]"));
		eclink.click();
		waitTime(3000);
		click(propElement(getPropfile(gpropname1, "Teachbutton")));
		waitTime(3000);
		String cssValue4 = driver.findElement(By.xpath("(//li[@class='educator community']/a)[2]"))
				.getCssValue("text-decoration");
		if (cssValue4.contains("underline")) {

			reportStep("Selected page is underlined", "Pass");

		} else {
			reportStep("Selected page is not underlined", "Fail");
		}
		WebElement faqlink = driver.findElement(By.xpath("(//li[@class='last faq']/a)[2]"));
		faqlink.click();
		waitTime(3000);
		click(propElement(getPropfile(gpropname1, "Teachbutton")));
		waitTime(3000);
		String cssValue5 = driver.findElement(By.xpath("(//li[@class='last faq']/a)[2]"))
				.getCssValue("text-decoration");
		if (cssValue5.contains("underline")) {

			reportStep("Selected page is underlined", "Pass");

		} else {
			reportStep("Selected page is not underlined", "Fail");
		}
		return this;
	}

	public Icivics_HomepageHeaderteach2 clickteachbuttonagain() {
		WebElement teachbutton = propElement(getPropfile(gpropname1, "Teachbutton"));
		if (teachbutton.isDisplayed()) {
			click(propElement(getPropfile(gpropname1, "Teachbutton")));
			reportStep("on clicking again teach submenu is close", "Pass");
		} else {
			reportStep("Teach submenu is not display", "Pass");
		}
		return this;

	}
}
