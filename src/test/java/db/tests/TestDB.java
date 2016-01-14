package db.tests;

import org.testng.annotations.Test;

import pages.TestBase;

public class TestDB extends TestBase {

	// public static void main(String[] argv) throws SQLException {
	// // DaoForMusBatch daoForMusbatch = new DaoForMusBatch();
	// // daoForMusbatch.getUpdateSessionIdPreparedStatement(
	// // daoForMusbatch.getIdDinersSession(), "24_0444-000005");
	//
	// DaoForTmaMovActc daoForTmaMovActc = new DaoForTmaMovActc();
	// daoForTmaMovActc.getTmtDataClear();
	// daoForTmaMovActc.getTmaDataClear();
	// daoForTmaMovActc.getBatchDataClear();
	// daoForTmaMovActc.getTmtMessageSessionClear();
	// daoForTmaMovActc.getTmtSessionClear();
	// daoForTmaMovActc.getTmaMovActcClear();
	// daoForTmaMovActc.getTmtMovActcClear();
	// daoForTmaMovActc.getTmp3TmaMovActcDataClear();
	// daoForTmaMovActc.getTmp3TmtMovActcDataClear();
	//
	// daoForTmaMovActc.getOpenSession();
	//
	// }

	@Test
	public void testUntitled() throws InterruptedException {
		app.getUserHelper().loginAs(ADMIN);
		app.getNavigationHelper().menuSessionClick();
		app.getSessionHelper().search("%111%");
		// app.getSessionHelper().search("54321");
	}
}
