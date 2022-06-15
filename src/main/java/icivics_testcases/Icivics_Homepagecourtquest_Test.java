package icivics_testcases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import icivics_pages.Icivics_Homepagecourtquest;
import projectSpecific.base.ProjectSpecificMethods;

public class Icivics_Homepagecourtquest_Test extends ProjectSpecificMethods {

	@BeforeTest
	public void setValues() {
		testCaseName = "HomepageHeader";
		authors = "Venkat";
		category = "Smoke";
		dataSheetName = "Icivics_Homepagecourtquest";
	}

	// C12- If you are viewing one of the pages in the Play submenu, is that page underlined in the submenu?


	@Test(dataProvider = "fetchData", priority = 0)
	public void C12_verifytextisunderlined(String URL) throws IOException, InterruptedException {
		node = test.createNode("C12 -If you are viewing one of the pages in the Play submenu, is that page underlined in the submenu?");
		extent.attachReporter(reporter);
		new Icivics_Homepagecourtquest(driver, node, prop).launchURL(URL).verifytextisunderlined();
	} 

}
