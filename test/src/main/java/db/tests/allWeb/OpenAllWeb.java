package db.tests.allWeb;

import org.testng.annotations.Test;

import com.danco.bpc.applogicAllWeb.ApplicationManager2;

import pages.TestBaseAll;

public class OpenAllWeb extends TestBaseAll {

	@Test
	public void openWeb() {
		app = new ApplicationManager2();
		app.getUserHelper().loginAs(ADMIN);
	}
}
