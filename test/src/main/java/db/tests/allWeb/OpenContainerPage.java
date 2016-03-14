package db.tests.allWeb;

import org.testng.annotations.Test;

import com.danco.bpc.applogicAllWeb.ApplicationManager2;

import pages.TestBaseAll;

public class OpenContainerPage extends TestBaseAll {

	@Test
	public void openContainerPage() {
		app = new ApplicationManager2();
		app.getNavigationHelper().openContainersPage();
	}
}
