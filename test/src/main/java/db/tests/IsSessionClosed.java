package db.tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.danco.bpc.modelReconWeb.Session;
import com.danco.bpc.util.SessionPropertyReader;

import pages.TestBaseRecon;

public class IsSessionClosed extends TestBaseRecon {

	@Test
	public void testUntitled() throws InterruptedException, IOException {
		Session currSession = new Session();
		SessionPropertyReader pr = new SessionPropertyReader();
		
		app.getSessionHelper().getAllParameterSession("22_0444-" + pr.getS220444(), currSession);
		Assert.assertTrue((currSession.getState().equals("CLOSED") & currSession.getStatus().equals("OK") & !currSession.getTe().equals("")
				& !currSession.getTr().equals("") & !currSession.getTsv().equals("") & !currSession.getTf().equals("")), "Problem in session");
	}
}
