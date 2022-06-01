package icivics_testcases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import icivics_pages.Icivics_HomepageHeaderAbout;

import projectSpecific.base.ProjectSpecificMethods;

public class Icivics_HomepageHeaderAbout_Test extends ProjectSpecificMethods {

	@BeforeTest
	public void setValues() {
		testCaseName = "HomepageHeaderplay";
		authors = "Venkat";
		category = "Smoke";
		dataSheetName = "Icivics_Homepageheaderabout";
	}

	// C22 - When you select About, does a submenu open below the About button?

	@Test(dataProvider = "fetchData", priority = 0)
	public void C22_Verifyaboutsubmenu(String URL) throws IOException, InterruptedException {
		node = test.createNode("C22 -  When you select About, does a submenu open below the About button?");
		extent.attachReporter(reporter);
		new Icivics_HomepageHeaderAbout(driver, node, prop).launchURL(URL).verifyaboutmenu();
	}
	// C23 - Do you see links to About iCivics, Who We Are, Our Strategy, CIVXNOW,
	// Our Team, Blog, and Contact Us in the submenu?

	@Test(dataProvider = "fetchData", priority = 1)
	public void C23_Verifysubmenucount(String URL) throws IOException, InterruptedException {
		node = test.createNode(
				"C23 - Do you see links to About iCivics, Who We Are, Our Strategy, CIVXNOW, Our Team, Blog, and Contact Us in the submenu?");
		extent.attachReporter(reporter);
		new Icivics_HomepageHeaderAbout(driver, node, prop).launchURL(URL).verifymenuoptionscount();
	}
	// C24 - When you select a link in the submenu, are you navigated to the
	// appropriate page?

	@Test(dataProvider = "fetchData", priority = 2)
	public void C24_Verifysubmenucount(String URL) throws IOException, InterruptedException {
		node = test
				.createNode("C24 - When you select a link in the submenu, are you navigated to the appropriate page?");
		extent.attachReporter(reporter);
		new Icivics_HomepageHeaderAbout(driver, node, prop).launchURL(URL).aboutbuttonelementsverification(URL);
	}
	// C24 - When you select a link in the submenu, are you navigated to the
	// appropriate page?

	@Test(dataProvider = "fetchData", priority = 3)
	public void C24_Verifysubmenucount1(String URL) throws IOException, InterruptedException {
		node = test
				.createNode("C24 - When you select a link in the submenu, are you navigated to the appropriate page?");
		extent.attachReporter(reporter);
		new Icivics_HomepageHeaderAbout(driver, node, prop).launchURL(URL).aboutbuttonelementsverification(URL);
	}
	// C27 - When you select About again while the submenu is open, does the submenu close?


	@Test(dataProvider = "fetchData", priority = 4)
	public void C27_Verifyclickaboutbuttonagain(String URL) throws IOException, InterruptedException {
		node = test
				.createNode("C27 - When you select About again while the submenu is open, does the submenu close?");
		extent.attachReporter(reporter);
		new Icivics_HomepageHeaderAbout(driver, node, prop).launchURL(URL).clickaboutbuttonagain();
	}
}
