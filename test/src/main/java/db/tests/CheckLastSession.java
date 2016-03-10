package db.tests;

import java.io.IOException;

import org.testng.annotations.Test;

import com.danco.bpc.util.SessionPropertyReader;

import db.utils.PropertyLoaderJenkins;
import pages.TestBaseRecon;

public class CheckLastSession extends TestBaseRecon {
	@Test
	public void testUntitled() throws InterruptedException, IOException {
		SessionPropertyReader pr = new SessionPropertyReader();
		String currSession = PropertyLoaderJenkins.loadProperty("curr.session");

		pr.setS220444("" + (Integer.parseInt(app.getSessionHelper().lastSession(currSession)) + 1));
	}
}
