package db.tests;

import java.io.IOException;

import org.testng.annotations.Test;

import pages.TestBase;

import com.danco.bpc.util.SessionPropertyReader;

public class OpenSession extends TestBase {

	@Test
	public void testUntitled() throws InterruptedException, IOException {
		SessionPropertyReader pr = new SessionPropertyReader();
		pr.setS220444("161801");
		//System.out.println(pr.getS220444());
//		app.getUserHelper().loginAs(ADMIN);
//		app.getNavigationHelper().menuSessionClick();
//		TmaMovActc tmaMovActc = new TmaMovActc();
//		assert(!app.getSessionHelper().checkSessionInTableNegative("22_0444-161801"));
//		tmaMovActc.setCmaqsere(161801);
//		assert(app.getSessionHelper().checkSessionInTablePositive("22_0444-161801"));
	}
}
