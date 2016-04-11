package db.tests.PRICE;

import org.testng.annotations.Test;

import pages.TestBaseAll;

import com.danco.bpc.applogicAllWeb.ApplicationManager;
import com.danco.bpc.applogicDB.DBManager;
import com.danco.bpc.service.impl.SERVICES.PrcSessionServiceImpl;

public class ContainerOperationUnloadingExecuition extends TestBaseAll {
	private PrcSessionServiceImpl prcSessionService = new PrcSessionServiceImpl();

	@Test
	public void openContainerPage() throws Exception {
		appAll = new ApplicationManager();
		db = new DBManager();
		appAll.getNavigationHelper().searchAndLaunchContainer(
				"PRICE.Outgoing LOTEs unloading");
		String ssid = appAll.getNavigationHelper().waitForContainerExecution();
		String res = db.getMainHelper().waitForProcessFinished(ssid);
		System.out.println("Result = " + res);
		assert (res.equals("PRSR0002"));
	}
}
