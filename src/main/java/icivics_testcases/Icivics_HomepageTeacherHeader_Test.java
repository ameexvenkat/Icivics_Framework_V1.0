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
	public void C3_Verifybuttons(String URL) throws IOException, InterruptedException {
		node = test.createNode(
				"C3 - While on all other pages, do you see buttons for Play, Teach, About, Donate, Shop, and My iCivics in the navigation bar?");
		extent.attachReporter(reporter);
		new Icivics_HomepageTeacherHeader(driver, node, prop).launchteacherpageURL(URL).playbutton().Teachbutton()
				.aboutbutton().donatebutton().shopbutton();
	}
	// C6 - Do all buttons have hover/click states?

	@Test(dataProvider = "fetchData", priority = 1)
	public void C6_Verifyplaybuttonhover(String URL) throws IOException, InterruptedException {
		node = test.createNode("C6 - Do all buttons have hover/click states?");
		extent.attachReporter(reporter);
		new Icivics_HomepageTeacherHeader(driver, node, prop).launchteacherpageURL(URL).verifyplaybuttonhover();
	}
	// C6 - Do all buttons have hover/click states?

	@Test(dataProvider = "fetchData", priority = 2)
	public void C6_Verifyteachbuttonhover(String URL) throws IOException, InterruptedException {
		node = test.createNode("C6 - Do all buttons have hover/click states?");
		extent.attachReporter(reporter);
		new Icivics_HomepageTeacherHeader(driver, node, prop).launchteacherpageURL(URL).verifyteachbuttonhover();
	}
	// C6 - Do all buttons have hover/click states?

	@Test(dataProvider = "fetchData", priority = 3)
	public void C6_Verifyaboutbuttonhover(String URL) throws IOException, InterruptedException {
		node = test.createNode("C6 - Do all buttons have hover/click states?");
		extent.attachReporter(reporter);
		new Icivics_HomepageTeacherHeader(driver, node, prop).launchteacherpageURL(URL).verifyaboutbuttonhover();
	}
	// C6 - Do all buttons have hover/click states?

	@Test(dataProvider = "fetchData", priority = 3)
	public void C6_Verifydonatebuttonhover(String URL) throws IOException, InterruptedException {
		node = test.createNode("C6 - Do all buttons have hover/click states?");
		extent.attachReporter(reporter);
		new Icivics_HomepageTeacherHeader(driver, node, prop).launchteacherpageURL(URL).verifydonatebuttonhover();
	}
	// C6 - Do all buttons have hover/click states?

	@Test(dataProvider = "fetchData", priority = 3)
	public void C6_Verifyshopbuttonhover(String URL) throws IOException, InterruptedException {
		node = test.createNode("C6 - Do all buttons have hover/click states?");
		extent.attachReporter(reporter);
		new Icivics_HomepageTeacherHeader(driver, node, prop).launchteacherpageURL(URL).verifyshopbuttonhover();
	}
	// C6 - Do all buttons have hover/click states?

	@Test(dataProvider = "fetchData", priority = 3)
	public void C6_verifymyicvicsbuttonhover(String URL) {
		node = test.createNode("C6 - Do all buttons have hover/click states?");
		extent.attachReporter(reporter);
		new Icivics_HomepageTeacherHeader(driver, node, prop).launchteacherpageURL(URL).verifymyicvicsbuttonhover();
	}

	// C6 - Do all buttons have hover/click states?

	@Test(dataProvider = "fetchData", priority = 3)
	public void C6_verifyallheaderbuttonhover(String URL) {
		node = test.createNode("C6 - Do all buttons have hover/click states?");
		extent.attachReporter(reporter);
		new Icivics_HomepageTeacherHeader(driver, node, prop).launchteacherpageURL(URL).verifyallheaderbuttonhover()
				.verifydonatebuttonhover().verifyshopbuttonhover();
	}
	// C7 - Does the header resize responsively at different resolutions?

	@Test(dataProvider = "fetchData", priority = 3)
	public void C7_verifyresizeheaderintohamburger(String URL) throws IOException, InterruptedException {
		node = test.createNode("C6 - Do all buttons have hover/click states?");
		extent.attachReporter(reporter);
		new Icivics_HomepageTeacherHeader(driver, node, prop).launchteacherpageURL(URL).resizeheader();
	}
}
