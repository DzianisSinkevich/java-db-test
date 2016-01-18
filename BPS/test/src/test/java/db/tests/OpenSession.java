package db.tests;

import org.testng.annotations.Test;

import com.danco.bpc.entity.TMA.TmaMovActc;

import pages.TestBase;

public class OpenSession extends TestBase {

	@Test
	public void testUntitled() throws InterruptedException {
		app.getUserHelper().loginAs(ADMIN);
		app.getNavigationHelper().menuSessionClick();
		TmaMovActc tmaMovActc = new TmaMovActc();
		assert(!app.getSessionHelper().checkSessionInTableNegative("22_0444-161801"));
		tmaMovActc.setCmaqsere(161801);
		assert(app.getSessionHelper().checkSessionInTablePositive("22_0444-161801"));
	}
}
