package icivics_testcases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import icivics_pages.Icivics_HomepageHeaderSigninMisc;
import projectSpecific.base.ProjectSpecificMethods;

public class Icivics_HomepageHeaderSigninMisc_Test extends ProjectSpecificMethods {

	@BeforeTest
	public void setValues() {
		testCaseName = "HomepageHeaderplay";
		authors = "Venkat";
		category = "Smoke";
		dataSheetName = "Icivics_Homepageheadersigninmisc";
	}

	// C29 - Can you see an appropriate icon for Donate?

	@Test(dataProvider = "fetchData", priority = 0)
	public void C29_Verifydonatebutton(String URL) throws IOException, InterruptedException {
		node = test.createNode("C29 -  Can you see an appropriate icon for Donate?");
		extent.attachReporter(reporter);
		new Icivics_HomepageHeaderSigninMisc(driver, node, prop).launchURL(URL).VerifyDonatebutton();
	}
	// C30 - When you select Donate, are you directed to https://give.icivics.org/?

	@Test(dataProvider = "fetchData", priority = 1)
	public void C30_Verifydonatebuttonclick(String URL) throws IOException, InterruptedException {
		node = test.createNode("C30 -  When you select Donate, are you directed to https://give.icivics.org/?");
		extent.attachReporter(reporter);
		new Icivics_HomepageHeaderSigninMisc(driver, node, prop).launchURL(URL).VerifyDonateclick();
	}
	// C31 - Can you see an appropriate icon for Shop?

	@Test(dataProvider = "fetchData", priority = 2)
	public void C31_Verifyshopbutton(String URL) throws IOException, InterruptedException {
		node = test.createNode("C31 -  Can you see an appropriate icon for Shop?");
		extent.attachReporter(reporter);
		new Icivics_HomepageHeaderSigninMisc(driver, node, prop).launchURL(URL).VerifyShopbutton();
	}
	// C32 - When you select Shop, are you directed to
	// https://icivics.myshopify.com/?

	@Test(dataProvider = "fetchData", priority = 3)
	public void C32_Verifyshopbuttonclick(String URL) throws IOException, InterruptedException {
		node = test.createNode("C32 -  When you select Shop, are you directed to https://icivics.myshopify.com/?");
		extent.attachReporter(reporter);
		new Icivics_HomepageHeaderSigninMisc(driver, node, prop).launchURL(URL).VerifyShopbuttonclick();
	}
	// C33 - If you are not signed in, do you see a Sign In button instead of My
	// iCivics?

	@Test(dataProvider = "fetchData", priority = 4)
	public void C33_Verifysigninbuttonforanonymoususer(String URL) throws IOException, InterruptedException {
		node = test.createNode("C33 - If you are not signed in, do you see a Sign In button instead of My iCivics?");
		extent.attachReporter(reporter);
		new Icivics_HomepageHeaderSigninMisc(driver, node, prop).launchURL(URL).verifysigninbutton();
	}
	// C34 - If you are signed in, do you see a My iCivics button instead of Sign
	// In?

	@Test(dataProvider = "fetchData", priority = 5)
	public void C34_Verifymyicivicsbuttonafterlogin(String URL) throws IOException, InterruptedException {
		node = test.createNode("C34 - If you are signed in, do you see a My iCivics button instead of Sign In?");
		extent.attachReporter(reporter);
		new Icivics_HomepageHeaderSigninMisc(driver, node, prop).launchURL(URL).verifymyicvicsbuttonafterlogin();
	}
	// C35 - If you are signed in, do you see a My iCivics button instead of Sign
	// In?

	@Test(dataProvider = "fetchData", priority = 6)
	public void C34_Verifymyicivicsbuttonafterlogin11(String URL) throws IOException, InterruptedException {
		node = test.createNode("C34 - If you are signed in, do you see a My iCivics button instead of Sign In?");
		extent.attachReporter(reporter);
		new Icivics_HomepageHeaderSigninMisc(driver, node, prop).launchURL(URL).verifymyicvicsbuttonafterlogin();
	}
	// C36 - When you select Sign In/My iCivics, does a submenu open below the
	// button?

	@Test(dataProvider = "fetchData", priority = 7)
	public void C36_Verifymyicivicsbuttonsubmenu(String URL) throws IOException, InterruptedException {
		node = test.createNode("C36 - When you select Sign In/My iCivics, does a submenu open below the button?");
		extent.attachReporter(reporter);
		new Icivics_HomepageHeaderSigninMisc(driver, node, prop).launchURL(URL).signin().verifymyicvicsbuttonsubmenu();
	}
	// C37 - When you select Sign In, do you see links to Sign In, Register As a
	// Student, Register As A Teacher in the submenu?

	@Test(dataProvider = "fetchData", priority = 8)
	public void C37_Verifysigninbuttonsubmenu(String URL) throws IOException, InterruptedException {
		node = test.createNode(
				"C37 - When you select Sign In, do you see links to Sign In, Register As a Student, Register As A Teacher in the submenu?");
		extent.attachReporter(reporter);
		new Icivics_HomepageHeaderSigninMisc(driver, node, prop).launchURL(URL).verifysigninbuttonsubmenu();
	}
	// C38 - If not signed in and you select a link in the submenu, are you
	// navigated to the appropriate page?

	@Test(dataProvider = "fetchData", priority = 9)
	public void C38_Verifysigninbuttonsubmenu(String URL) throws IOException, InterruptedException {
		node = test.createNode(
				"C38 - If not signed in and you select a link in the submenu, are you navigated to the appropriate page?");
		extent.attachReporter(reporter);
		new Icivics_HomepageHeaderSigninMisc(driver, node, prop).launchURL(URL).Signinbuttonelementsverification(URL);
	}
}
