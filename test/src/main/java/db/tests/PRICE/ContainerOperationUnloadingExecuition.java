package db.tests.PRICE;

import org.testng.annotations.Test;

import com.danco.bpc.applogicAllWeb.ApplicationManager2;

import pages.TestBaseAll;

public class ContainerOperationUnloadingExecuition extends TestBaseAll {
	
	@Test
	public void openContainerPage() throws InterruptedException {
		app = new ApplicationManager2();
		app.getNavigationHelper().searchAndLaunchContainer("PRICE.Outgoing LOTEs unloading");
	}
}