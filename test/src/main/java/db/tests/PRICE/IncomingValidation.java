package db.tests.PRICE;

import java.util.ArrayList;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

import com.danco.bpc.applogicDB.DBManager;
import com.danco.bpc.entity.PRICE.PrcFiles;
import com.danco.bpc.service.impl.SERVICES.PrcFilesServiceImpl;

import pages.TestBaseAll;

public class IncomingValidation extends TestBaseAll {
	private PrcFilesServiceImpl prcFilesService = new PrcFilesServiceImpl();
	PrcFiles prcFile = new PrcFiles();
	private static final Logger logger = LogManager.getLogger("");
	ArrayList<PrcFiles> filesList = new ArrayList<PrcFiles>();
	ArrayList<Long> messagesFlags = new ArrayList<Long>();

	@Test
	public void aReadFilesId() throws Exception {
		db = new DBManager();
		filesList = db.getPriceHelper().listIncomingFiles();

		for (PrcFiles el : filesList) {
			System.out.println(el.getId());
		}
	}

	@Test
	public void bCompareRecorsCount() throws Exception {
		for (int i = 0; i < filesList.size(); i++) {
			assert(db.getPriceHelper().amountMessagesInPrcMessages(filesList.get(i).getId()) != db.getPriceHelper()
					.amountMessagesInPrcRawMessages(filesList.get(i).getId()));
		}
	}

	@Test
	public void cCheckTotalsCalculation() throws Exception {
		db = new DBManager();
		for (PrcFiles el : filesList) {
			messagesFlags.addAll(db.getPriceHelper().messageFlagsSearch(el.getId()));

			for (int i = 0; i + 1 < messagesFlags.size(); i++) {
				db.getPriceHelper().compareTotals(el.getId(), messagesFlags.get(i), messagesFlags.get(i + 1));
			}
		}
	}

	// @Test
	// public void checkMessageErrors() throws Exception {
	// Long kolMesWithStutsError = (long) 0;
	// Long kolMesWithError = (long) 0;
	//
	// db = new DBManager();
	//
	// prcFile = prcFilesService.selectFile(db.getPriceHelper().fileDailyName());
	// kolMesWithStutsError = db.getPriceHelper().checkKolMesWithStatusError(prcFile.getId());
	// // System.out.println("kolMesWithStutsError = " + kolMesWithStutsError);
	// kolMesWithError = db.getPriceHelper().checkKolMesWithError(prcFile.getId());
	// // System.out.println("kolMesWithError = " + kolMesWithError);
	//
	// assert(kolMesWithStutsError.equals(kolMesWithError));
	// }
	//
	// @Test
	// public void checkParsingMessages() throws Exception {
	// Long amountPrcMessages = (long) 0;
	// Long amountPrcRawMessages = (long) 0;
	//
	// db = new DBManager();
	//
	// prcFile = prcFilesService.selectFile(db.getPriceHelper().fileDailyName());
	// amountPrcMessages = db.getPriceHelper().amountMessagesInPrcMessages(prcFile.getId());
	// System.out.println("amountPrcMessages = " + amountPrcMessages);
	// amountPrcRawMessages = db.getPriceHelper().amountMessagesInPrcRawMessages(prcFile.getId());
	// System.out.println("amountPrcRawMessages = " + amountPrcRawMessages);
	//
	// assert(amountPrcMessages.equals(amountPrcRawMessages));
	// }
}
