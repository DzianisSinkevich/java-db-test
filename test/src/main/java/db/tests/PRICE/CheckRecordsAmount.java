package db.tests.PRICE;

import org.testng.annotations.Test;

import pages.TestBaseAll;

import com.danco.bpc.applogicDB.DBManager;

public class CheckRecordsAmount extends TestBaseAll {

	@Test
	public void checkRecordsAmount() throws Exception {
		db = new DBManager();
		System.out.println("" + db.getPriceHelper().idIncomingFile());

		// System.out.println("Rows count = " + prcRawMessagesService.countRowsForSendToSv());
	}
}
