package db.tests.PRICE;

import org.testng.annotations.Test;

import pages.TestBaseAll;

import com.danco.bpc.applogicAllWeb.ApplicationManager2;
import com.danco.bpc.service.impl.SERVICES.PrcSessionServiceImpl;

public class ContainerOperationUnloadingExecuition extends TestBaseAll {
	private PrcSessionServiceImpl prcSessionService = new PrcSessionServiceImpl();

	@Test
	public void openContainerPage() throws Exception {
		app = new ApplicationManager2();
		app.getNavigationHelper().searchAndLaunchContainer(
				"PRICE.Outgoing LOTEs unloading");
		String ssid = app.getNavigationHelper().waitForContainerExecution();
		String res = app.getSessionHelper().waitForProcessFinished(ssid);
		System.out.println("Result = " + res);
		assert (res.equals("PRSR0002"));
	}
}
