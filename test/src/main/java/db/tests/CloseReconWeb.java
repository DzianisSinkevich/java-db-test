package db.tests;

import pages.TestBaseRecon;

public class CloseReconWeb extends TestBaseRecon {
	public void testBefore() {
		app.getNavigationHelper().menuLogoutClick();
		app.stop();
	}
}
