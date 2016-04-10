package db.tests.allWeb;

import org.testng.annotations.Test;

import pages.TestBaseAll;

import com.danco.bpc.applogicAllWeb.ApplicationManager2;
import com.danco.bpc.service.impl.SERVICES.PrcSessionServiceImpl;

public class ContainerOperationProcessingExecution extends TestBaseAll {
	private PrcSessionServiceImpl prcSessionService = new PrcSessionServiceImpl();

	@Test
	public void openContainerPage() throws Exception {
		app = new ApplicationManager2();
		app.getNavigationHelper().searchAndLaunchContainer(
				"Operation processing");
		String ssid = app.getNavigationHelper().waitForContainerExecution();
		String res = app.getSessionHelper().waitForProcessFinished(ssid);
		System.out.println("Result = " + res);
		assert (res.equals("PRSR0002"));
	}
}
