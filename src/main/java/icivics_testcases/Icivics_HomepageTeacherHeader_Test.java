package icivics_testcases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import icivics_pages.Icivics_HomepageTeacherHeader;
import projectSpecific.base.ProjectSpecificMethods;

public class Icivics_HomepageTeacherHeader_Test extends ProjectSpecificMethods {

	@BeforeTest
	public void setValues() {
		testCaseName = "HomepageHeader";
		authors = "Venkat";
		category = "Smoke";
		dataSheetName = "Icivics_Homepageteacherheader";
	}

	// C3 - While on all other pages, do you see buttons for Play, Teach, About,
	// Donate, Shop, and My iCivics in the navigation bar?

	@Test(dataProvider = "fetchData", priority = 0)
	public void C3_Verifyheaderbuttonsforanonymoususer(String URL) throws IOException, InterruptedException {
		node = test.createNode(
				"C3 - While on all other pages, do you see buttons for Play, Teach, About, Donate, Shop, and My iCivics in the navigation bar?");
		extent.attachReporter(reporter);
		new Icivics_HomepageTeacherHeader(driver, node, prop).launchteacherpageURL(URL).playbutton().Teachbutton()
				.aboutbutton().donatebutton().shopbutton().Verifymyicivicsbuttondisplayafterlogin();
	}
	// C3 - While on all other pages, do you see buttons for Play, Teach, About,
	// Donate, Shop, and My iCivics in the navigation bar?

	@Test(dataProvider = "fetchData", priority = 1)
	public void C3_Verifyheaderbuttonsforauthenticateduser(String URL) throws IOException, InterruptedException {
		node = test.createNode(
				"C3 - While on all other pages, do you see buttons for Play, Teach, About, Donate, Shop, and My iCivics in the navigation bar?");
		extent.attachReporter(reporter);
		new Icivics_HomepageTeacherHeader(driver, node, prop).launchteacherpageURL(URL).signin2()
				.Verifyheaderbuttonsafterlogin();
	}
	// C6 - Do all buttons have hover/click states?

	@Test(dataProvider = "fetchData", priority = 2)
	public void C6_Verifyheaderbuttonhoverforanonymoususer(String URL) throws IOException, InterruptedException {
		node = test.createNode("C6 - Do all buttons have hover/click states?");
		extent.attachReporter(reporter);
		new Icivics_HomepageTeacherHeader(driver, node, prop).launchteacherpageURL(URL).verifyplaybuttonhover()
				.verifyteachbuttonhover().verifyaboutbuttonhover().verifydonatebuttonhover().launchteacherpageURL(URL)
				.verifyshopbuttonhover().launchteacherpageURL(URL).verifysigninbuttonhover()
				.verifymyicvicsbuttonhover();
	}

	// C6 - Do all buttons have hover/click states?

	@Test(dataProvider = "fetchData", priority = 3)
	public void C6_verifyaheaderbuttonhoverforauthenticateduser(String URL) {
		node = test.createNode("C6 - Do all buttons have hover/click states?");
		extent.attachReporter(reporter);
		new Icivics_HomepageTeacherHeader(driver, node, prop).launchteacherpageURL(URL).signin2()
				.verifyplaybuttonhover().verifyteachbuttonhover().verifyaboutbuttonhover().verifydonatebuttonhover()
				.launchteacherpageURL(URL).verifyshopbuttonhover2().launchteacherpageURL(URL)
				.verifymyicvicsbuttonhover();
	}
	// C7 - Does the header resize responsively at different resolutions?

	@Test(dataProvider = "fetchData", priority = 4)
	public void C7_verifyresizeheaderintohamburger(String URL) throws IOException, InterruptedException {
		node = test.createNode("C7 - Does the header resize responsively at different resolutions?");
		extent.attachReporter(reporter);

		new Icivics_HomepageTeacherHeader(driver, node, prop).launchteacherpageURL(URL).resizeheader()
				.carddisplayinlistpattern();
	}
}
