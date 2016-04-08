package db.tests.PRICE;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.testng.annotations.Test;

import com.danco.bpc.applogicAllWeb.ApplicationManager2;
import com.danco.bpc.entity.MAIN.PrcSession;
import com.danco.bpc.service.impl.SERVICES.PrcSessionServiceImpl;

import pages.TestBaseAll;

@ContextConfiguration(locations = { "classpath:data.xml" })
public class ContainerOperationLoadingExecuition extends TestBaseAll {

	@Autowired
	private PrcSessionServiceImpl prcSessionService = new PrcSessionServiceImpl();

	@Test
	public void openContainerPage() throws Exception {
		app = new ApplicationManager2();
		app.getNavigationHelper().searchAndLaunchContainer("PRICE. Data loading");
		PrcSession prcSession = prcSessionService.selectSession(app.getNavigationHelper().waitForContainerExecution());
		System.out.println("Status = " + prcSession.getResultCode());
	}
}
