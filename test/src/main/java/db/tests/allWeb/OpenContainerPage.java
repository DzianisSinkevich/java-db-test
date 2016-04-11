package db.tests.allWeb;

import org.testng.annotations.Test;

import com.danco.bpc.applogicAllWeb.ApplicationManager;

import pages.TestBaseAll;

public class OpenContainerPage extends TestBaseAll {

	@Test
	public void openContainerPage() {
		appAll = new ApplicationManager();
		appAll.getNavigationHelper().openContainersPage();
	}
}
