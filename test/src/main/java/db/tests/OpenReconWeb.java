package db.tests;

import com.danco.bpc.applogicReconWeb.ApplicationManager;

import pages.TestBaseRecon;

public class OpenReconWeb extends TestBaseRecon {
	public void openReconWeb() {
		app = new ApplicationManager();
		app.getUserHelper().loginAs(ADMIN);
	}
}
