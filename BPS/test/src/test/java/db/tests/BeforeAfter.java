package db.tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import pages.TestBase;

public class BeforeAfter extends TestBase {
	@BeforeTest
	public void testBefore() {
		app.getUserHelper().loginAs(ADMIN);
	}

	@AfterTest
	public void testAfter() {
		app.getNavigationHelper().menuLogoutClick();
	}
}
