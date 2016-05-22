package db.tests.allWeb;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import com.danco.bpc.applogicAllWeb.ApplicationManager;

import pages.TestBaseAll;

public class CloseSessionLotes extends TestBaseAll {

	private Logger log = Logger.getLogger("file");

	@Test
	public void readAndCloseActiveSession() throws InterruptedException {
		log.info("-- Start application manager");
		appAll = new ApplicationManager();
		log.info("-- Start application manager is successfully");
		
		appAll.getNavigationHelper().searchAndCloseTotalSessionsOnlyTMTPage();
		
//		appAll.getNavigationHelper().openMonitoringLotesPage();
//		appAll.getNavigationHelper().searchAndCloseTotalSessions();
	}
}
