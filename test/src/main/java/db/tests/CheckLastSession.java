package db.tests;

import java.io.IOException;

import org.testng.annotations.Test;

import com.danco.bpc.util.SessionPropertyReader;

import pages.TestBase;

public class CheckLastSession extends TestBase {
	@Test
	public void testUntitled() throws InterruptedException, IOException {
		SessionPropertyReader pr = new SessionPropertyReader();
//		app.getUserHelper().loginAs(ADMIN);
//		app.getNavigationHelper().menuSessionClick();
		pr.setS220444("" + (Integer.parseInt(app.getSessionHelper().lastSession("22_")) + 1));
//		app.getNavigationHelper().menuLogoutClick();
	}
}
