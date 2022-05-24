package icivics_testcases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import icivics_pages.Icivics_StudentReg1classcode;
import icivics_pages.Icivics_StudentReg2Email;
import projectSpecific.base.ProjectSpecificMethods;

public class Icivics_StudentRegistration2Email_Test extends ProjectSpecificMethods {

	@BeforeTest
	public void setValues() {
		testCaseName = "Student Registration classcode and Email id ";
		authors = "Venkat";
		category = "Smoke";
		dataSheetName = "Icivics_Studentregistration2email";
	}

	// C398 - Can you tell which page you are currently viewing in the breadcrumbs?

	@Test(dataProvider = "fetchData", priority = 0)
	public void C398_verifypagecount2(String URL) throws IOException, InterruptedException {
		node = test.createNode("C425 - Do you see a set of 3 numbered page breadcrumbs?");
		extent.attachReporter(reporter);
		new Icivics_StudentReg2Email(driver, node, prop).launchstudentURL(URL);
	}
	// C399 - Can you select Back to proceed to the previous page?

	@Test(dataProvider = "fetchData", priority = 1)
	public void C399_Clickbackbutton(String URL) throws IOException, InterruptedException {
		node = test.createNode("C399 - Can you select Back to proceed to the previous page?");
		extent.attachReporter(reporter);
		new Icivics_StudentReg2Email(driver, node, prop).launchstudentURL(URL).verifywithvaliddata().Clickbackbutton();
	}
	// C400 - When you go Back, are your entries in all fields remembered?

	@Test(dataProvider = "fetchData", priority = 2)
	public void C400_verifyfieldsisremembered(String URL) throws IOException, InterruptedException {
		node = test.createNode("C400 - When you go Back, are your entries in all fields remembered?");
		extent.attachReporter(reporter);
		new Icivics_StudentReg2Email(driver, node, prop).launchstudentURL(URL).verifywithvaliddata().verifyfieldsisremembered();
	}
	// C403- If you select the 'Terms of Use' link, does the iCivics Terms of Use page open in a new tab?


	@Test(dataProvider = "fetchData", priority = 3)
	public void C403_clickontermsofuselink(String URL) throws IOException, InterruptedException {
		node = test.createNode("C403- If you select the 'Terms of Use' link, does the iCivics Terms of Use page open in a new tab");
		extent.attachReporter(reporter);
		new Icivics_StudentReg2Email(driver, node, prop).launchstudentURL(URL).verifywithvaliddata().clickontermsofuselink() ;
	}
}
