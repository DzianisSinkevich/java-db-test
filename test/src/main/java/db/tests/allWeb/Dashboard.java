package db.tests.allWeb;

import org.testng.annotations.Test;

import com.danco.bpc.applogicAllWeb.ApplicationManager2;

import pages.TestBaseAll;

public class Dashboard extends TestBaseAll {
	@Test
	public void dashboardOpen() {
		app = new ApplicationManager2();
		app.getNavigationHelper().openDashboardMenu();
	}
}
