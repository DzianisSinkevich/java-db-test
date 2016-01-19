package db.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.danco.bpc.model.Session;
import com.danco.bpc.util.SessionPropertyReader;

import pages.TestBase;

public class IsSessionClosed extends TestBase {

	@Test
	public void testUntitled() throws InterruptedException {
		Session currSession = new Session();
		SessionPropertyReader pr = new SessionPropertyReader();
		
//		app.getUserHelper().loginAs(ADMIN);
//		app.getNavigationHelper().menuSessionClick();
		app.getSessionHelper().getAllParameterSession("22_0444-" + pr.getS220444(), currSession);
		Assert.assertTrue((currSession.getState().equals("CLOSED") & currSession.getStatus().equals("OK") & !currSession.getTe().equals("")
				& !currSession.getTr().equals("") & !currSession.getTsv().equals("") & !currSession.getTf().equals("")), "Problem in session");
//		app.getNavigationHelper().menuLogoutClick();
	}
}
