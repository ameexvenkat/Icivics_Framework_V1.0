package icivics_pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.aventstack.extentreports.ExtentTest;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import projectSpecific.base.ProjectSpecificMethods;

public class Icivics_HomepageTeacherHeader extends ProjectSpecificMethods {
	public String gpropname1 = "Homepage/homepageheader";
	public String gpropname2 = "Homepage/homepageteacherheader";

	public Icivics_HomepageTeacherHeader(RemoteWebDriver driver, ExtentTest node, Properties prop) {
		this.driver = driver;
		this.node = node;
		this.prop = prop;
	}

	@Given("Launch the icivis educatorregistration URL")
	public Icivics_HomepageTeacherHeader launchteacherpageURL(String URL) {
		navigateto(URL);
		return this;

	}

	public Icivics_HomepageTeacherHeader signin2() {
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

	@Then("Verify Play buttons should appear in the top/right")
	public Icivics_HomepageTeacherHeader playbutton() {
		WebElement playbutton = propElement(getPropfile(gpropname2, "Playbutton"));
		if (playbutton.isDisplayed()) {
			reportStep("playbutton Verified successfully", "Pass");
		} else {
			reportStep("playbutton is not Verified successfully", "Fail");
		}

		return this;
	}

	@Then("Verify Teach buttons should appear in the top/right")
	public Icivics_HomepageTeacherHeader Teachbutton() {
		WebElement teachbutton = propElement(getPropfile(gpropname2, "Teachbutton"));
		if (teachbutton.isDisplayed()) {
			reportStep("Teachbutton Verified successfully", "Pass");
		} else {
			reportStep("Teachbutton is not Verified successfully", "Fail");
		}

		return this;
	}

	@Then("Verify About buttons should appear in the top/right")
	public Icivics_HomepageTeacherHeader aboutbutton() {
		WebElement aboutbutton = propElement(getPropfile(gpropname2, "Aboutbutton"));
		if (aboutbutton.isDisplayed()) {
			reportStep("aboutbutton Verified successfully", "Pass");
		} else {
			reportStep("aboutbutton is not Verified successfully", "Fail");
		}

		return this;
	}

	@Then("Verify Donate buttons should appear in the top/right")
	public Icivics_HomepageTeacherHeader donatebutton() {
		WebElement donatebutton = propElement(getPropfile(gpropname1, "Donatebutton"));
		if (donatebutton.isDisplayed()) {
			reportStep("donatebutton Verified successfully", "Pass");
		} else {
			reportStep("donatebutton is not Verified successfully", "Fail");
		}

		return this;
	}

	@Then("Verify Shop buttons should appear in the top/right")
	public Icivics_HomepageTeacherHeader shopbutton() {
		WebElement Shopbutton = propElement(getPropfile(gpropname1, "shopbutton"));
		if (Shopbutton.isDisplayed()) {
			reportStep("Shopbutton Verified successfully", "Pass");
		} else {
			reportStep("Shopbutton is not Verified successfully", "Fail");
		}

		return this;
	}

	@And("Verify after login MyIcivics buttons should appear in the top/right")
	public Icivics_HomepageTeacherHeader Verifymyicivicsbuttondisplayafterlogin() {
		WebElement signinbutton = propElement(getPropfile(gpropname1, "Signinbutton"));
		if (signinbutton.isDisplayed()) {
			reportStep("Signin button Verified successfully", "Pass");
		} else {
			reportStep("Signin button is not Verified successfully", "Fail");
		}
		click(propElement(getPropfile(gpropname1, "Signinbutton")));
		click(propElement(getPropfile(gpropname1, "Signinlink")));
		WebElement username = propElement(getPropfile(gpropname1, "Username"));
		username.sendKeys("Bronze Speaker 1r4e");
		WebElement password = propElement(getPropfile(gpropname1, "Password"));
		password.sendKeys("i898qrCiPK9Hwgb");
		click(propElement(getPropfile(gpropname2, "Loginbutton")));
		waitTime(3000);
		WebElement myicivicsbutton2 = propElement(getPropfile(gpropname2, "Myicivicsbutton"));
		if (myicivicsbutton2.isDisplayed()) {
			reportStep("Myicivicsbutton Verified successfully", "Pass");
		} else {
			reportStep("Myicivicsbutton is not Verified successfully", "Fail");
		}
		return this;

	}

	@Then("Verify header button after login")
	public Icivics_HomepageTeacherHeader Verifyheaderbuttonsafterlogin() {
		WebElement playbutton = propElement(getPropfile(gpropname2, "Playbutton"));
		if (playbutton.isDisplayed()) {
			reportStep("playbutton Verified successfully", "Pass");
		} else {
			reportStep("playbutton is not Verified successfully", "Fail");
		}
		WebElement teachbutton = propElement(getPropfile(gpropname2, "Teachbutton"));
		if (teachbutton.isDisplayed()) {
			reportStep("Teachbutton Verified successfully", "Pass");
		} else {
			reportStep("Teachbutton is not Verified successfully", "Fail");
		}
		WebElement aboutbutton = propElement(getPropfile(gpropname2, "Aboutbutton"));
		if (aboutbutton.isDisplayed()) {
			reportStep("aboutbutton Verified successfully", "Pass");
		} else {
			reportStep("aboutbutton is not Verified successfully", "Fail");
		}
		WebElement donatebutton = propElement(getPropfile(gpropname1, "Donatebutton"));
		if (donatebutton.isDisplayed()) {
			reportStep("Donatebutton Verified successfully", "Pass");
		} else {
			reportStep("Donatebutton is not Verified successfully", "Fail");
		}

		WebElement shopbutton = propElement(getPropfile(gpropname1, "shopbutton2"));
		if (shopbutton.isDisplayed()) {
			reportStep("Shopbutton Verified successfully", "Pass");
		} else {
			reportStep("Shopbutton is not Verified successfully", "Fail");
		}

		WebElement myicivicsbutton2 = propElement(getPropfile(gpropname2, "Myicivicsbutton"));
		if (myicivicsbutton2.isDisplayed()) {
			reportStep("Myicivicsbutton Verified successfully", "Pass");
		} else {
			reportStep("Myicivicsbutton is not Verified successfully", "Fail");
		}
		return this;
	}

	@Then("Verify playbutton should have Hand cursor should appear over buttons Tooltip appears after hover.")
	public Icivics_HomepageTeacherHeader verifyplaybuttonhover() {

		String playbuttonhover = getPropfile(gpropname2, "Playbutton");
		mouseOverAction(playbuttonhover);
		waitTime(3000);
		WebElement playbuttontooltip = propElement(playbuttonhover);
		String ExpectedTooltip = getPropfile(gpropname2, "Playbuttontooltip");
		String actualTooltip = playbuttontooltip.getAttribute("title");
		if (actualTooltip.equals(ExpectedTooltip)) {
			reportStep("Expected Tooltip and Actual Tooltip text matched successfully", "Pass");
		} else {
			reportStep("Expected Tooltip and Actual Tooltip text did not match", "Fail");
		}

		click(propElement(getPropfile(gpropname2, "Playbutton")));
		waitTime(3000);
		return this;
	}

	@Then("Verify teachbutton should have Hand cursor should appear over buttons Tooltip appears after hover.")
	public Icivics_HomepageTeacherHeader verifyteachbuttonhover() {

		String teachbuttonhover = getPropfile(gpropname2, "Teachbutton");
		mouseOverAction(teachbuttonhover);
		waitTime(3000);
		WebElement teachbuttontooltip = propElement(teachbuttonhover);
		String ExpectedTooltip = getPropfile(gpropname2, "Teachbuttontooltip");
		String actualTooltip = teachbuttontooltip.getAttribute("title");
		if (actualTooltip.equals(ExpectedTooltip)) {
			reportStep("Expected Tooltip and Actual Tooltip text matched successfully", "Pass");
		} else {
			reportStep("Expected Tooltip and Actual Tooltip text did not match", "Fail");
		}

		click(propElement(getPropfile(gpropname2, "Teachbutton")));
		waitTime(3000);
		return this;
	}

	@Then("Verify aboutbutton should have Hand cursor should appear over buttons Tooltip appears after hover.")
	public Icivics_HomepageTeacherHeader verifyaboutbuttonhover() {

		String aboutbuttonhover = getPropfile(gpropname2, "Aboutbutton");
		mouseOverAction(aboutbuttonhover);
		waitTime(3000);
		WebElement aboutbuttontooltip = propElement(aboutbuttonhover);
		String ExpectedTooltip = getPropfile(gpropname2, "Aboutbuttontooltip");
		String actualTooltip = aboutbuttontooltip.getAttribute("title");
		if (actualTooltip.equals(ExpectedTooltip)) {
			reportStep("Expected Tooltip and Actual Tooltip text matched successfully", "Pass");
		} else {
			reportStep("Expected Tooltip and Actual Tooltip text did not match", "Fail");
		}

		click(propElement(getPropfile(gpropname2, "Aboutbutton")));
		waitTime(3000);
		return this;
	}

	@Then("Verify donatebutton should have Hand cursor should appear over buttons Tooltip appears after hover.")
	public Icivics_HomepageTeacherHeader verifydonatebuttonhover() {

		String Donatebuttonhover = getPropfile(gpropname1, "Donatebutton");
		mouseOverAction(Donatebuttonhover);
		waitTime(3000);
		WebElement donatebuttontooltip = propElement(Donatebuttonhover);
		String ExpectedTooltip = getPropfile(gpropname2, "Donatebuttontooltip");
		String actualTooltip = donatebuttontooltip.getAttribute("title");
		if (actualTooltip.equals(ExpectedTooltip)) {
			reportStep("Expected Tooltip and Actual Tooltip text matched successfully", "Pass");
		} else {
			reportStep("Expected Tooltip and Actual Tooltip text did not match", "Fail");
		}

		click(propElement(getPropfile(gpropname1, "Donatebutton")));
		waitTime(3000);
		return this;
	}

	@Then("Verify shopbutton should have Hand cursor should appear over buttons Tooltip appears after hover.")
	public Icivics_HomepageTeacherHeader verifyshopbuttonhover() {

		String Shopbuttonhover = getPropfile(gpropname1, "shopbutton");
		mouseOverAction(Shopbuttonhover);
		waitTime(3000);
		WebElement shopbuttontooltip = propElement(Shopbuttonhover);
		String ExpectedTooltip = getPropfile(gpropname2, "Shopbuttontooltip");
		String actualTooltip = shopbuttontooltip.getAttribute("title");
		if (actualTooltip.equals(ExpectedTooltip)) {
			reportStep("Expected Tooltip and Actual Tooltip text matched successfully", "Pass");
		} else {
			reportStep("Expected Tooltip and Actual Tooltip text did not match", "Fail");
		}

		click(propElement(getPropfile(gpropname1, "shopbutton")));
		waitTime(3000);
		return this;
	}

	@Then("Verify myicivicsbutton should not present for anonymous user it should present only when we login")
	public Icivics_HomepageTeacherHeader verifysigninbuttonhover() {

		String signinbuttonhover = getPropfile(gpropname1, "Signinbutton");
		mouseOverAction(signinbuttonhover);
		waitTime(3000);
		WebElement Signinbuttontooltip = propElement(signinbuttonhover);
		String ExpectedTooltip = getPropfile(gpropname2, "Myicivicstooltip");
		String actualTooltip = Signinbuttontooltip.getAttribute("title");
		if (actualTooltip.equals(ExpectedTooltip)) {
			reportStep("Expected Tooltip and Actual Tooltip text matched successfully", "Pass");
		} else {
			reportStep("Expected Tooltip and Actual Tooltip text did not match", "Fail");
		}
		return this;
	}

	@Then("Verify afterlogin myicivicsbutton should have Hand cursor should appear over buttons Tooltip appears after hover.")
	public Icivics_HomepageTeacherHeader verifymyicvicsbuttonhoverafterlogin() {

		click(propElement(getPropfile(gpropname1, "Signinbutton")));
		click(propElement(getPropfile(gpropname1, "Signinlink")));
		WebElement username = propElement(getPropfile(gpropname1, "Username"));
		username.sendKeys("Bronze Speaker 1r4e");
		WebElement password = propElement(getPropfile(gpropname1, "Password"));
		password.sendKeys("i898qrCiPK9Hwgb");
		click(propElement(getPropfile(gpropname2, "Loginbutton")));
		waitTime(3000);
		String myicivicsbuttonhover = getPropfile(gpropname2, "Myicivicsbutton2");
		mouseOverAction(myicivicsbuttonhover);
		waitTime(3000);
		WebElement myicivicstooltip = propElement(myicivicsbuttonhover);
		String ExpectedTooltip1 = getPropfile(gpropname2, "Myicivicstooltip");
		String actualTooltip1 = myicivicstooltip.getAttribute("title");
		if (actualTooltip1.equals(ExpectedTooltip1)) {
			reportStep("Expected Tooltip and Actual Tooltip text matched successfully", "Pass");
		} else {
			reportStep("Expected Tooltip and Actual Tooltip text did not match", "Fail");
		}
		click(propElement(getPropfile(gpropname2, "Myicivicsbutton")));
		waitTime(3000);
		return this;
	}

	public Icivics_HomepageTeacherHeader verifymyicvicsbuttonhover() {
		String myicivicsbuttonhover = getPropfile(gpropname2, "Myicivicsbutton2");
		mouseOverAction(myicivicsbuttonhover);
		waitTime(3000);
		WebElement myicivicstooltip = propElement(myicivicsbuttonhover);
		String ExpectedTooltip1 = getPropfile(gpropname2, "Myicivicstooltip");
		String actualTooltip1 = myicivicstooltip.getAttribute("title");
		if (actualTooltip1.equals(ExpectedTooltip1)) {
			reportStep("Expected Tooltip and Actual Tooltip text matched successfully", "Pass");
		} else {
			reportStep("Expected Tooltip and Actual Tooltip text did not match", "Fail");
		}
		click(propElement(getPropfile(gpropname2, "Myicivicsbutton")));
		waitTime(3000);
		return this;
	}

	public Icivics_HomepageTeacherHeader verifyshopbuttonhover2() {

		String Shopbuttonhover = getPropfile(gpropname1, "shopbutton2");
		mouseOverAction(Shopbuttonhover);
		waitTime(3000);
		WebElement shopbuttontooltip = propElement(Shopbuttonhover);
		String ExpectedTooltip = getPropfile(gpropname2, "Shopbuttontooltip2");
		String actualTooltip = shopbuttontooltip.getAttribute("title");
		if (actualTooltip.equals(ExpectedTooltip)) {
			reportStep("Expected Tooltip and Actual Tooltip text matched successfully", "Pass");
		} else {
			reportStep("Expected Tooltip and Actual Tooltip text did not match", "Fail");
		}

		click(propElement(getPropfile(gpropname1, "shopbutton2")));
		waitTime(3000);
		return this;
	}

	@When("Header is resize it should should turn into hamburger menu when its small enough")
	public Icivics_HomepageTeacherHeader resizeheader() {

		Dimension d = new Dimension(768, 1024);
		// Resize the current window to the given dimension
		driver.manage().window().setSize(d);
		takeSnap();
		waitTime(3000);
		reportStep("Ipad potrait resize is successfull", "Pass");

		WebElement hamburgericon1 = propElement(getPropfile(gpropname2, "Hamburgericon"));

		if (hamburgericon1.isDisplayed()) {
			reportStep("Hamburger Icon is displayed successfully", "Pass");
		} else {
			reportStep("Hamburger Icon is not displayed successfully", "Fail");

		}
		WebElement cardtitle = driver
				.findElement(By.xpath("//h2[contains(text(),'Foundations of Government')and @class='field-content']"));
		if (cardtitle.isDisplayed()) {
			reportStep("cardtitle is displayed successfully", "Pass");
		} else {
			reportStep("cardtitle Icon is not displayed successfully", "Fail");

		}

		Dimension d1 = new Dimension(1024, 768);
		driver.manage().window().setSize(d1);
		waitTime(3000);
		System.out.println(driver.manage().window().getSize());
		takeSnap();
		reportStep("Ipad landscape resize is successfull", "Pass");
		WebElement hamburgericon2 = propElement(getPropfile(gpropname2, "Hamburgericon"));
		if (hamburgericon2.isDisplayed()) {
			reportStep("Hamburger Icon is displayed successfully", "Pass");
		} else {
			reportStep("Hamburger Icon is not displayed successfully", "Fail");

		}
		WebElement cardtitle2 = driver
				.findElement(By.xpath("//h2[contains(text(),'Influence Library')and @class='field-content']"));
		if (cardtitle2.isDisplayed()) {
			reportStep("cardtitle is displayed successfully", "Pass");
		} else {
			reportStep("cardtitle Icon is not displayed successfully", "Fail");

		}
		Dimension d2 = new Dimension(375, 667);
		driver.manage().window().setSize(d2);
		waitTime(3000);
		System.out.println(driver.manage().window().getSize());
		takeSnap();
		reportStep("Iphone potrait resize is successfull", "Pass");
		WebElement hamburgericon3 = propElement(getPropfile(gpropname2, "Hamburgericon"));
		if (hamburgericon3.isDisplayed()) {
			reportStep("Hamburger Icon is displayed successfully", "Pass");
		} else {
			reportStep("Hamburger Icon is not displayed successfully", "Fail");

		}
		Dimension d3 = new Dimension(667, 375);
		driver.manage().window().setSize(d3);
		waitTime(3000);
		System.out.println(driver.manage().window().getSize());
		takeSnap();
		reportStep("Iphone landscape resize is successfull", "Pass");
		WebElement hamburgericon4 = propElement(getPropfile(gpropname2, "Hamburgericon"));
		if (hamburgericon4.isDisplayed()) {
			reportStep("Hamburger Icon is displayed successfully", "Pass");
		} else {
			reportStep("Hamburger Icon is not displayed successfully", "Fail");

		}
		Dimension d4 = new Dimension(360, 740);
		driver.manage().window().setSize(d4);
		waitTime(3000);
		System.out.println(driver.manage().window().getSize());
		takeSnap();
		reportStep("Samsung Galaxy potrait resize is successfull", "Passs");
		WebElement hamburgericon5 = propElement(getPropfile(gpropname2, "Hamburgericon"));
		if (hamburgericon5.isDisplayed()) {
			reportStep("Hamburger Icon is displayed successfully", "Pass");
		} else {
			reportStep("Hamburger Icon is not displayed successfully", "Fail");

		}

		Dimension d5 = new Dimension(740, 360);
		driver.manage().window().setSize(d5);
		waitTime(3000);
		System.out.println(driver.manage().window().getSize());
		takeSnap();
		reportStep("Samsung Galaxy landscape resize is successfull", "Passs");
		WebElement hamburgericon6 = propElement(getPropfile(gpropname2, "Hamburgericon"));
		if (hamburgericon6.isDisplayed()) {
			reportStep("Hamburger Icon is displayed successfully", "Pass");
		} else {
			reportStep("Hamburger Icon is not displayed successfully", "Fail");

		}
		return this;

	}

	@Then("Verify card is displaying in list pattern on resizing the window")
	public Icivics_HomepageTeacherHeader carddisplayinlistpattern() {
		Dimension d = new Dimension(768, 1024);
		// Resize the current window to the given dimension
		driver.manage().window().setSize(d);

		WebElement cardtitle = propElement(getPropfile(gpropname2, "CardTitle1"));
		if (cardtitle.isDisplayed()) {
			reportStep("cardtitle is displayed successfully", "Pass");
		} else {
			reportStep("cardtitle Icon is not displayed successfully", "Fail");

		}
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)", "CardTitle1");
		Dimension d1 = new Dimension(1024, 768);
		driver.manage().window().setSize(d1);
		WebElement cardtitle1 = propElement(getPropfile(gpropname2, "CardTitle2"));
		if (cardtitle1.isDisplayed()) {
			reportStep("cardtitle is displayed successfully", "Pass");
		} else {
			reportStep("cardtitle Icon is not displayed successfully", "Fail");

		}
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,350)", "CardTitle2");
		reportStep("Ipad landscape resize is successfull", "Pass");

		Dimension d2 = new Dimension(375, 667);
		driver.manage().window().setSize(d2);
		waitTime(3000);
		WebElement cardtitle2 = propElement(getPropfile(gpropname2, "CardTitle3"));
		if (cardtitle2.isDisplayed()) {
			reportStep("cardtitle is displayed successfully", "Pass");
		} else {
			reportStep("cardtitle Icon is not displayed successfully", "Fail");

		}
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("window.scrollBy(0,350)", "CardTitle3");
		reportStep("Iphone potrait resize is successfull", "Pass");

		Dimension d3 = new Dimension(667, 375);
		driver.manage().window().setSize(d3);
		waitTime(3000);
		WebElement cardtitle3 = propElement(getPropfile(gpropname2, "CardTitle4"));
		if (cardtitle3.isDisplayed()) {
			reportStep("cardtitle is displayed successfully", "Pass");
		} else {
			reportStep("cardtitle Icon is not displayed successfully", "Fail");

		}
		JavascriptExecutor js3 = (JavascriptExecutor) driver;
		js3.executeScript("window.scrollBy(0,350)", "CardTitle4");
		reportStep("Iphone landscape resize is successfull", "Pass");
		Dimension d4 = new Dimension(360, 740);
		driver.manage().window().setSize(d4);
		WebElement cardtitle4 = propElement(getPropfile(gpropname2, "CardTitle5"));
		if (cardtitle4.isDisplayed()) {
			reportStep("cardtitle is displayed successfully", "Pass");
		} else {
			reportStep("cardtitle Icon is not displayed successfully", "Fail");

		}
		JavascriptExecutor js4 = (JavascriptExecutor) driver;
		js4.executeScript("window.scrollBy(0,350)", "CardTitle5");
		reportStep("Samsung Galaxy potrait resize is successfull", "Pass");
		Dimension d5 = new Dimension(740, 360);
		driver.manage().window().setSize(d5);
		WebElement cardtitle5 = propElement(getPropfile(gpropname2, "CardTitle6"));
		if (cardtitle5.isDisplayed()) {
			reportStep("cardtitle is displayed successfully", "Pass");
		} else {
			reportStep("cardtitle Icon is not displayed successfully", "Fail");

		}
		JavascriptExecutor js5 = (JavascriptExecutor) driver;
		js5.executeScript("window.scrollBy(0,350)", "CardTitle6");
		reportStep("Samsung Galaxy landscape resize is successfull", "Pass");
		return this;
	}
}
