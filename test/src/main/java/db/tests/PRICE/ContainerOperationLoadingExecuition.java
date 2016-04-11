package db.tests.PRICE;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.testng.annotations.Test;

import com.danco.bpc.applogicAllWeb.ApplicationManager;
import com.danco.bpc.applogicDB.DBManager;
import com.danco.bpc.service.impl.SERVICES.PrcSessionServiceImpl;

import pages.TestBaseAll;

@ContextConfiguration(locations = { "classpath:data.xml" })
public class ContainerOperationLoadingExecuition extends TestBaseAll {

	@Autowired
	private PrcSessionServiceImpl prcSessionService = new PrcSessionServiceImpl();

	@Test
	public void openContainerPage() throws Exception {
		appAll = new ApplicationManager();
		db = new DBManager();
		appAll.getNavigationHelper().searchAndLaunchContainer("PRICE. Data loading");
		String ssid = appAll.getNavigationHelper().waitForContainerExecution();
		String res = db.getMainHelper().waitForProcessFinished(ssid);
		System.out.println("Result = " + res);
		assert(res.equals("PRSR0002"));
	}
}
