package db.tests.allWeb;

import org.testng.annotations.Test;

import com.danco.bpc.applogicAllWeb.ApplicationManager;

import pages.TestBaseAll;

public class CloseSessionLotes extends TestBaseAll {

	@Test
	public void openContainerPage() throws InterruptedException {
		appAll = new ApplicationManager();
		appAll.getNavigationHelper().openContainersPage();
		appAll.getNavigationHelper().searchAndCloseTotalSessions();
	}
}
