package db.tests.PRICE;

import java.util.ArrayList;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

import com.danco.bpc.applogicDB.DBManager;
import com.danco.bpc.entity.PRICE.PrcFiles;

import pages.TestBaseAll;

public class IncomingValidation extends TestBaseAll {
	PrcFiles prcFile = new PrcFiles();
	private static final Logger logger = LogManager.getLogger("");
	ArrayList<PrcFiles> filesList = new ArrayList<PrcFiles>();

	@Test
	public void aReadFilesId() throws Exception {
		db = new DBManager();
		filesList = db.getPriceHelper().listIncomingFiles();

		for (PrcFiles el : filesList) {
			logger.info("Detect valid incoming file in DB with ID = " + el.getId());
		}
	}

	@Test
	public void bCompareRecorsCount() throws Exception {
		for (int i = 0; i < filesList.size(); i++) {
			Long prcMess = db.getPriceHelper().amountMessagesInPrcMessages(filesList.get(i).getId());
			Long prcRawMess = db.getPriceHelper().amountMessagesInPrcRawMessages(filesList.get(i).getId());
			Long totalRecordsInFile = filesList.get(i).getTotalRecords();
			logger.info("File amount Mess = " + totalRecordsInFile);
			assert(prcMess != prcRawMess);
			assert(prcMess != totalRecordsInFile);
		}
	}

	@Test
	public void cCheckTotalsCalculation() throws Exception {
		db = new DBManager();
		for (PrcFiles el : filesList) {
			logger.info("----- START FILE WITH ID " + el.getId() + " -----");
			db.getPriceHelper().compareTotals(el.getId());
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
