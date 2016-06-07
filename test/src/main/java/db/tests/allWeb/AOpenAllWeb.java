package db.tests.allWeb;

import org.testng.annotations.Test;

import com.danco.bpc.applogicAllWeb.ApplicationManager;

import pages.TestBaseAll;

public class AOpenAllWeb extends TestBaseAll {

	@Test
	public void openWeb() {
		appAll = new ApplicationManager();
		appAll.getNavigationHelper().openMainPage();
		System.out.println("Open web!");
		appAll.getUserHelper().loginAs(ADMIN);
	}
}
