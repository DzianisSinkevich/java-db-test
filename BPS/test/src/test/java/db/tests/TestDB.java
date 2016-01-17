package db.tests;

import org.testng.annotations.Test;

import pages.TestBase;

import com.danco.bpc.entity.TMA.TmaMovActc;
import com.danco.bpc.service.api.TMA.ITmaMovActcService;
import com.danco.bpc.service.impl.TMA.TmaMovActcServiceImpl;

public class TestDB extends TestBase {
	
	private ITmaMovActcService tmaMovActcService = new TmaMovActcServiceImpl();
	

	@Test
	public void testUntitled() throws InterruptedException {
		System.out.println();
		app.getUserHelper().loginAs(ADMIN);
		app.getNavigationHelper().menuSessionClick();
		TmaMovActc tmaMovActc = new TmaMovActc();
		//Long id = tmaMovActcService.addRecord(tmaMovActcService.copyTmaMovActc());
		Long id = tmaMovActcService.addRecord(tmaMovActc);
		System.out.println(id);
		assert(!app.getSessionHelper().checkSessionInTableNegative("22_0444-160499"));
		assert(app.getSessionHelper().checkSessionInTablePositive("22_0444-160499"));
	}
}
