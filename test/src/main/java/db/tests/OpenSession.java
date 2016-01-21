package db.tests;

import java.io.IOException;

import org.testng.annotations.Test;

import com.danco.bpc.entity.TMA.TmaMovActc;
import com.danco.bpc.service.api.TMA.ITmaMovActcService;
import com.danco.bpc.service.impl.TMA.TmaMovActcServiceImpl;
import com.danco.bpc.util.SessionPropertyReader;

import db.utils.PropertyLoaderJenkins;
import pages.TestBase;

public class OpenSession extends TestBase {
	private ITmaMovActcService tmaMovActcService = new TmaMovActcServiceImpl();

	@Test
	public void testUntitled() throws InterruptedException, IOException {
		SessionPropertyReader pr = new SessionPropertyReader();
		TmaMovActc tmaMovActc = new TmaMovActc();
		String currSession = PropertyLoaderJenkins.loadProperty("curr.session");

		app.getNavigationHelper().menuSessionClick();
		assert(!app.getSessionHelper().checkSessionInTableNegative(currSession + "-" + pr.getS220444()));
		System.out.println("Ssid 1 - " + new Long(currSession.substring(currSession.indexOf("_") + 1, currSession.length())));
		tmaMovActc.setCmalcsbc(new Long(currSession.substring(currSession.indexOf("_") + 1, currSession.length())));
		System.out.println("Ssid 2 - " + Integer.parseInt(currSession));
		tmaMovActc.setC0dlcie3(Integer.parseInt(currSession));
		System.out.println("Sess 3 - " + Integer.parseInt(pr.getS220444()));
		tmaMovActc.setCmaqsere(Integer.parseInt(pr.getS220444()));
		tmaMovActcService.addRecord(tmaMovActc);
		assert(app.getSessionHelper().checkSessionInTablePositive(currSession + "-" + pr.getS220444()));
	}
}
