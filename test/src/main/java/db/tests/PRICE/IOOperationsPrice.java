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
	}

	@Test
	public void bCheckAndCompareAmountMessages() throws Exception {
		appAll = new ApplicationManager();
		db = new DBManager();

		String amountMessagesInDB = "" + db.getPriceHelper().amountMessagesWithCurrentDate();
		System.out.println("amountMessagesInDB=" + amountMessagesInDB);
		assert(appAll.getPriceHelper().compareRecordsCount(amountMessagesInDB));
	}
	
	@Test
	public void cRejectMessage() throws Exception {
		String firstRecordId;
		
		appAll = new ApplicationManager();
		db = new DBManager();

		appAll.getPriceHelper().filterStatusSelecter("Invalid");
		appAll.getPriceHelper().enterDates();
		firstRecordId = appAll.getPriceHelper().getFirstRecordId();
		
	}	
}
