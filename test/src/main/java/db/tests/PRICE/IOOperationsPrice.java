package db.tests.PRICE;

import org.springframework.test.context.ContextConfiguration;
import org.testng.annotations.Test;

import com.danco.bpc.applogicAllWeb.ApplicationManager;
import com.danco.bpc.applogicDB.DBManager;

import pages.TestBaseAll;

@ContextConfiguration(locations = { "classpath:data.xml" })
public class IOOperationsPrice extends TestBaseAll {

	@Test
	public void aOpenContainerPage() throws Exception {
		appAll = new ApplicationManager();

		appAll.getNavigationHelper().openIOOperationPricePage();
		appAll.getPriceHelper().enterDates();
		appAll.getPriceHelper().startSearch();
	}

	// @Test
	// public void bCheckAndCompareAmountMessages() throws Exception {
	// appAll = new ApplicationManager();
	// db = new DBManager();
	//
	// String amountMessagesInDB = "" + db.getPriceHelper().amountMessagesWithCurrentDate();
	// System.out.println("amountMessagesInDB=" + amountMessagesInDB);
	// assert(appAll.getPriceHelper().compareRecordsCount(amountMessagesInDB));
	// }
	//
	// @Test
	// public void cRejectMessage() throws Exception {
	// String firstRecordId;
	//
	// appAll = new ApplicationManager();
	// db = new DBManager();
	//
	// appAll.getPriceHelper().filterClear();
	// appAll.getPriceHelper().filterStatusSelecter("Invalid");
	// appAll.getPriceHelper().enterDates();
	// appAll.getPriceHelper().startSearch();
	// firstRecordId = appAll.getPriceHelper().getFirstRecordId();
	// assert(db.getPriceHelper().getPrcRawMessagesStatus(firstRecordId).equals("MSST0004"));
	// appAll.getPriceHelper().rejectRecord(firstRecordId);
	// assert(db.getPriceHelper().getPrcRawMessagesStatus(firstRecordId).equals("MSST0005"));
	// }
	//
	// @Test
	// public void dDisplayingErrorsOfMessages() throws Exception {
	// String recordId;
	// ArrayList<String> idErrorsInWeb = new ArrayList<String>();
	// ArrayList<String> idErrorsInDB = new ArrayList<String>();
	//
	// appAll = new ApplicationManager();
	// db = new DBManager();
	//
	// appAll.getPriceHelper().filterClear();
	// appAll.getPriceHelper().filterStatusSelecter("Invalid");
	// appAll.getPriceHelper().enterDates();
	// appAll.getPriceHelper().startSearch();
	// recordId = appAll.getPriceHelper().getFirstRecordId();
	// System.out.println("recordId = " + recordId);
	// idErrorsInWeb = appAll.getPriceHelper().getErrorsId();
	// idErrorsInDB = db.getPriceHelper().getIdErrors(Long.valueOf(recordId));
	// assert(idErrorsInWeb.containsAll(idErrorsInDB));
	// }

	@Test
	public void eAddNewRecordValid() throws Exception {
		appAll = new ApplicationManager();
		String recordId;

		appAll = new ApplicationManager();
		db = new DBManager();

		appAll.getPriceHelper().filterClear();
		appAll.getPriceHelper().filterStatusSelecter("Valid");
		appAll.getPriceHelper().enterDates();
		appAll.getPriceHelper().startSearch();
		appAll.getPriceHelper().firstRecordSelect();
		appAll.getPriceHelper().addRecord();
		appAll.getPriceHelper().saveNewRecord();
		recordId = appAll.getPriceHelper().getFirstRecordId();
		assert(db.getPriceHelper().getPrcRawMessagesStatus(recordId).equals("MSST0003"));
		assert(appAll.getPriceHelper().checkRecordStatus(recordId, "Valid"));
	}

	@Test
	public void eAddNewRecordInvalid() throws Exception {
		appAll = new ApplicationManager();
		String recordId;

		appAll = new ApplicationManager();
		db = new DBManager();

		appAll.getPriceHelper().filterClear();
		appAll.getPriceHelper().filterStatusSelecter("Invalid");
		appAll.getPriceHelper().enterDates();
		appAll.getPriceHelper().startSearch();
		appAll.getPriceHelper().firstRecordSelect();
		appAll.getPriceHelper().addRecord();
		appAll.getPriceHelper().saveNewRecord();
		recordId = appAll.getPriceHelper().getFirstRecordId();
		assert(db.getPriceHelper().getPrcRawMessagesStatus(recordId).equals("MSST0004"));
		assert(appAll.getPriceHelper().checkRecordStatus(recordId, "Invalid"));
	}
}
