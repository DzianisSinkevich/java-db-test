package db.tests.allWeb;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

import com.danco.bpc.applogicAllWeb.ApplicationManager;
import com.danco.bpc.applogicDB.DBManager;

import pages.TestBaseAll;

public class ContainerOperationProcessingExecution extends TestBaseAll {
	private static final Logger logger = LogManager.getLogger("");
	String ssid = "";

	@Test
	public void launchContainer() throws Exception {
		appAll = new ApplicationManager();
		db = new DBManager();
		appAll.getNavigationHelper().searchAndLaunchContainer("Operation processing");
		ssid = appAll.getNavigationHelper().waitForContainerExecution();
	}

	@Test
	public void waitFinish() throws Exception {
		String res = db.getMainHelper().waitForProcessFinished(ssid);
		logger.info("Session " + ssid + " - Status = " + res);
		assert(res.equals("PRSR0002"));
	}
}
