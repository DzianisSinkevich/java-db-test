package db.tests;

import com.danco.bpc.applogicReconWeb.ApplicationManager2;

import pages.TestBaseRecon;

public class OpenReconWeb extends TestBaseRecon {
	public void openReconWeb() {
		app = new ApplicationManager2();
		app.getUserHelper().loginAs(ADMIN);
	}
}
