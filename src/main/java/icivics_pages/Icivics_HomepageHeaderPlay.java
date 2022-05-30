package icivics_pages;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.aventstack.extentreports.ExtentTest;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import projectSpecific.base.ProjectSpecificMethods;

public class Icivics_HomepageHeaderPlay extends ProjectSpecificMethods {
	public String gpropname1 = "Homepage/homepageheader";
	public String gpropname2 = "Homepage/homepageteacherheader";
	public String gpropname3 = "Homepage/homepageheaderplay";

	public Icivics_HomepageHeaderPlay(RemoteWebDriver driver, ExtentTest node, Properties prop) {
		this.driver = driver;
		this.node = node;
		this.prop = prop;
	}

	@Given("Launch the icivis educatorregistration URL")
	public Icivics_HomepageHeaderPlay launchURL(String URL) {
		navigateto(URL);
		return this;

	}

	@Given("On Clicking  play button at top Play menu should open")
	public Icivics_HomepageHeaderPlay clickplaybutton() {

		click(propElement(getPropfile(gpropname2, "Playbutton")));
		waitTime(3000);
		return this;
	}

	@Then("Click on each link on play menu and each should navigate to corresponding page ")
	public Icivics_HomepageHeaderPlay Playbuttonelementsverification(String URL) throws IOException {

		String propname = "Homepage/playdropdown";
		String PlayButton = getPropfile(propname, "PlayButtonElement");
		navigateto(URL);

		// All Games
		mouseOverAndClickAction(PlayButton);
		Verifylinks(getprop(propname, "AllgamesElement"), getpropstring(propname, "AllgameText"),
				getpropstring(propname, "AllgameUrL"), getpropstring(propname, "AllgameTitle"));

		// cast your vote
		mouseOverAndClickAction(PlayButton);
		Verifylinks(getprop(propname, "cyvElement"), getpropstring(propname, "cyvText"),
				getpropstring(propname, "cyvUrL"), getpropstring(propname, "cyvTitle"));
		verifyPartialText(getprop(propname, "cyvheaderele"), getpropstring(propname, "cyvheader"));

		// counties work Texas
		mouseOverAndClickAction(PlayButton);
		Verifylinks(getprop(propname, "cwtElement"), getpropstring(propname, "cwtText"),
				getpropstring(propname, "cwtUrL"), getpropstring(propname, "cwtTitle"));
		verifyPartialText(getprop(propname, "cwtheaderele"), getpropstring(propname, "cwtheader"));

		// Execute Command
		mouseOverAndClickAction(PlayButton);
		Verifylinks(getprop(propname, "ecElement"), getpropstring(propname, "ecText"), getpropstring(propname, "ecUrL"),
				getpropstring(propname, "ecTitle"));
		verifyPartialText(getprop(propname, "echeaderele"), getpropstring(propname, "echeader"));

		// Lawcraft
		mouseOverAndClickAction(PlayButton);
		Verifylinks(getprop(propname, "lcElement"), getpropstring(propname, "lcText"), getpropstring(propname, "lcUrL"),
				getpropstring(propname, "lcTitle"));
		verifyPartialText(getprop(propname, "lcheaderele"), getpropstring(propname, "lcheader"));

		// Sortify:U.S.CITIZENSHIP
		mouseOverAndClickAction(PlayButton);
		Verifylinks(getprop(propname, "scElement"), getpropstring(propname, "scText"), getpropstring(propname, "scUrL"),
				getpropstring(propname, "scTitle"));
		verifyPartialText(getprop(propname, "scheaderele"), getpropstring(propname, "scheader"));

		// ARGUMENT WARS
		mouseOverAndClickAction(PlayButton);
		Verifylinks(getprop(propname, "awElement"), getpropstring(propname, "awText"), getpropstring(propname, "awUrL"),
				getpropstring(propname, "awTitle"));
		verifyPartialText(getprop(propname, "awheaderele"), getpropstring(propname, "awheader"));

		// Convene The Council
		mouseOverAndClickAction(PlayButton);
		Verifylinks(getprop(propname, "ctcElement"), getpropstring(propname, "ctcText"),
				getpropstring(propname, "ctcUrL"), getpropstring(propname, "ctcTitle"));
		verifyPartialText(getprop(propname, "ctcheaderele"), getpropstring(propname, "ctcheader"));

		// Court Quest
		mouseOverAndClickAction(PlayButton);
		Verifylinks(getprop(propname, "cqElement"), getpropstring(propname, "cqText"), getpropstring(propname, "cqUrL"),
				getpropstring(propname, "cqTitle"));
		verifyPartialText(getprop(propname, "cqheaderele"), getpropstring(propname, "cqheader"));

		// Game Odyssey
		mouseOverAndClickAction(PlayButton);
		Verifylinks(getprop(propname, "goElement"), getpropstring(propname, "goText"), getpropstring(propname, "goUrL"),
				getpropstring(propname, "goTitle"));
		verifyPartialText(getprop(propname, "goheaderele"), getpropstring(propname, "goheader"));
		navigateto(URL);
		waitTime(3000);

		// newsfeeders defenders
		mouseOverAndClickAction(PlayButton);
		Verifylinks(getprop(propname, "nfdElement"), getpropstring(propname, "nfdText"),
				getpropstring(propname, "nfdUrL"), getpropstring(propname, "nfdTitle"));
		verifyPartialText(getprop(propname, "nfdheaderele"), getpropstring(propname, "nfdheader"));

		// Win the white house
		mouseOverAndClickAction(PlayButton);
		Verifylinks(getprop(propname, "wtwhElement"), getpropstring(propname, "wtwhText"),
				getpropstring(propname, "wtwhUrL"), getpropstring(propname, "wtwhTitle"));
		verifyPartialText(getprop(propname, "wtwhheaderele"), getpropstring(propname, "wtwhheader"));

		// Branches of Power
		mouseOverAndClickAction(PlayButton);
		Verifylinks(getprop(propname, "bopElement"), getpropstring(propname, "bopText"),
				getpropstring(propname, "bopUrL"), getpropstring(propname, "bopTitle"));
		verifyPartialText(getprop(propname, "bopheaderele"), getpropstring(propname, "bopheader"));

		// Counties Work
		mouseOverAndClickAction(PlayButton);
		Verifylinks(getprop(propname, "cwElement"), getpropstring(propname, "cwText"), getpropstring(propname, "cwUrL"),
				getpropstring(propname, "cwTitle"));
		verifyPartialText(getprop(propname, "cwheaderele"), getpropstring(propname, "cwheader"));

		// Do I have A Birth?
		mouseOverAndClickAction(PlayButton);
		Verifylinks(getprop(propname, "drElement"), getpropstring(propname, "drText"), getpropstring(propname, "drUrL"),
				getpropstring(propname, "drTitle"));
		verifyPartialText(getprop(propname, "drheaderele"), getpropstring(propname, "drheader"));

		// Immigration Nation
		mouseOverAndClickAction(PlayButton);
		Verifylinks(getprop(propname, "inElement"), getpropstring(propname, "inText"), getpropstring(propname, "inUrL"),
				getpropstring(propname, "inTitle"));
		verifyPartialText(getprop(propname, "inheaderele"), getpropstring(propname, "inheader"));

		// Race To Ratify
		mouseOverAndClickAction(PlayButton);
		Verifylinks(getprop(propname, "rtrElement"), getpropstring(propname, "rtrText"),
				getpropstring(propname, "rtrUrL"), getpropstring(propname, "rtrTitle"));
		verifyPartialText(getprop(propname, "rtrheaderele"), getpropstring(propname, "rtrheader"));

		reportStep("All links in the play dropdown is verified sucessfully", "Pass");

		return this;
	}

	public Icivics_HomepageHeaderPlay verifypageisunderlined() {
		
		click(propElement(getPropfile(gpropname2, "Playbutton")));
		String cssValue = driver.findElement(By.xpath("//a[text()='Executive Command']"))
				.getCssValue("text-decoration");

		System.out.println("value" + cssValue);

		Actions act = new Actions(driver);

		act.moveToElement(driver.findElement(By.xpath("//a[text()='Executive Command']"))).perform();

		String cssValue1 = driver.findElement(By.xpath("//a[text()='Executive Command']"))
				.getCssValue("text-decoration");

		System.out.println("value over" + cssValue1);
		return this;
	}

	@Then("Click the play menu,menu opens click play menu again play menu should close")

	public Icivics_HomepageHeaderPlay clickplaybuttonagain() {

		click(propElement(getPropfile(gpropname2, "Playbutton")));
		waitTime(5000);
		click(propElement(getPropfile(gpropname2, "Playbutton")));
		return this;

	}
}
