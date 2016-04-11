package db.tests.allWeb;

import org.testng.annotations.Test;

import com.danco.bpc.applogicAllWeb.ApplicationManager;

import pages.TestBaseAll;

public class Dashboard extends TestBaseAll {
	@Test
	public void dashboardOpen() {
		appAll = new ApplicationManager();
		appAll.getNavigationHelper().openDashboardMenu();
	}
}
