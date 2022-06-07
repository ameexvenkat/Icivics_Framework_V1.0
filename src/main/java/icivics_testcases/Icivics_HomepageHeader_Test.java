package icivics_testcases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import icivics_pages.Icivics_EducatorReg5;
import icivics_pages.Icivics_HomepageHeader;
import projectSpecific.base.ProjectSpecificMethods;

public class Icivics_HomepageHeader_Test extends ProjectSpecificMethods {

	@BeforeTest
	public void setValues() {
		testCaseName = "HomepageHeader";
		authors = "Venkat";
		category = "Smoke";
		dataSheetName = "Icivics_Homepageheader";
	}

	// C1 - Do you see the iCivics Logo in the upper left?

	@Test(dataProvider = "fetchData", priority = 0)
	public void C1_VerifyLogo(String URL) throws IOException, InterruptedException {
		node = test.createNode("C1 - Do you see the iCivics Logo in the upper left?");
		extent.attachReporter(reporter);
		new Icivics_HomepageHeader(driver, node, prop).launchURL(URL).verifyhomepage().VerifyLogo();
	}
	// C2 - While on the iCivics Home Page, do you see buttons for Donate, Shop, and
	// My iCivics in the navigation bar?

	@Test(dataProvider = "fetchData", priority = 1)
	public void C2_VerifyDonatebutton(String URL) throws IOException, InterruptedException {
		node = test.createNode(
				"C2 - While on the iCivics Home Page, do you see buttons for Donate, Shop,  and My iCivics in the navigation bar?");
		extent.attachReporter(reporter);
		new Icivics_HomepageHeader(driver, node, prop).launchURL(URL).verifyhomepage().VerifyDonatebutton()
				.Verifyshopbutton();
	}

	// C1538 - Does the donation popup NOT show?

	@Test(dataProvider = "fetchData", priority = 2)
	public void C1538_Verifydonationpopup(String URL) throws IOException, InterruptedException {
		node = test.createNode("C1538 - Does the donation popup NOT show?");
		extent.attachReporter(reporter);
		new Icivics_HomepageHeader(driver, node, prop).launchURL(URL).verifyhomepage().Verifydonationpopup();
	}

}
