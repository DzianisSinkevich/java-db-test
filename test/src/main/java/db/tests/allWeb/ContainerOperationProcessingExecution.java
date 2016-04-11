package db.tests.allWeb;

import org.testng.annotations.Test;

import pages.TestBaseAll;

import com.danco.bpc.applogicAllWeb.ApplicationManager;
import com.danco.bpc.applogicDB.DBManager;
import com.danco.bpc.service.impl.SERVICES.PrcSessionServiceImpl;

public class ContainerOperationProcessingExecution extends TestBaseAll {
	private PrcSessionServiceImpl prcSessionService = new PrcSessionServiceImpl();

	@Test
	public void openContainerPage() throws Exception {
		appAll = new ApplicationManager();
		db = new DBManager();
		appAll.getNavigationHelper().searchAndLaunchContainer("Operation processing");
		String ssid = appAll.getNavigationHelper().waitForContainerExecution();
		String res = db.getMainHelper().waitForProcessFinished(ssid);
		System.out.println("Result = " + res);
		assert (res.equals("PRSR0002"));
	}
}
