package db.tests;

import java.io.IOException;

import org.testng.annotations.Test;

import com.danco.bpc.entity.TMA.TmaMovActc;
import com.danco.bpc.service.api.TMA.ITmaMovActcService;
import com.danco.bpc.service.impl.TMA.TmaMovActcServiceImpl;
import com.danco.bpc.util.SessionPropertyReader;

import pages.TestBase;

public class OpenSession extends TestBase {
	private ITmaMovActcService tmaMovActcService = new TmaMovActcServiceImpl();

	@Test
	public void testUntitled() throws InterruptedException, IOException {
		SessionPropertyReader pr = new SessionPropertyReader();
		TmaMovActc tmaMovActc = new TmaMovActc();

		// app.getUserHelper().loginAs(ADMIN);
		app.getNavigationHelper().menuSessionClick();
		assert(!app.getSessionHelper().checkSessionInTableNegative("22_0444-" + pr.getS220444()));
		tmaMovActc.setCmaqsere(Integer.parseInt(pr.getS220444()));
		tmaMovActcService.addRecord(tmaMovActc);
		assert(app.getSessionHelper().checkSessionInTablePositive("22_0444-" + pr.getS220444()));
		// app.getNavigationHelper().menuLogoutClick();
	}
}