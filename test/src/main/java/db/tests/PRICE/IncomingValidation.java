package db.tests.PRICE;

import org.testng.annotations.Test;

import com.danco.bpc.applogicDB.DBManager;
import com.danco.bpc.entity.PRICE.PrcFiles;
import com.danco.bpc.entity.PRICE.PrcMessages;
import com.danco.bpc.service.impl.SERVICES.PrcFilesServiceImpl;

import pages.TestBaseAll;

public class IncomingValidation extends TestBaseAll {
	private PrcFilesServiceImpl prcFilesService = new PrcFilesServiceImpl();
	PrcFiles prcFile = new PrcFiles();

	@Test
	public void checkFilePreferences() throws Exception {
		db = new DBManager();

		prcFile = prcFilesService.selectFile(db.getPriceHelper().fileDailyName());
		db.getPriceHelper().checkFilePreferences(prcFile);
		System.out.println("" + prcFile.getId());
	}

	@Test
	public void checkTotalsCalculation() throws Exception {
		db = new DBManager();
		PrcMessages prcMessages = new PrcMessages();
		prcFile = prcFilesService.selectFile(db.getPriceHelper().fileDailyName());
		db.getPriceHelper().sumPrcMessagesP04(prcFile.getId());
		db.getPriceHelper().sumPrcMessagesP05(prcFile.getId());
		db.getPriceHelper().sumPrcMessagesS76(prcFile.getId());
	}
}
