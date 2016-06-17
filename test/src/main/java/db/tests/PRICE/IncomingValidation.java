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

	@Test
	public void readFilesId() throws Exception {
		ArrayList<String> filesID = new ArrayList<String>();
		
		db = new DBManager();
		db.getPriceHelper().listIncomingFiles();
		
		filesID = db.getPriceHelper().listIncomingFilesId();	
		
		for (String el : filesID){
			System.out.println(el);
		}
	}
	
	@Test
	public void compareRecorsCount() throws Exception {
		
		
	}
	
//	@Test
//	public void checkFilePreferences() throws Exception {
//		db = new DBManager();
//
//		prcFile = prcFilesService.selectFile(db.getPriceHelper().fileDailyName());
//		db.getPriceHelper().checkFilePreferences(prcFile);
//		logger.warn("File preferences is rigth");
//	}
//
//	@Test
//	public void checkTotalsCalculation() throws Exception {
//		db = new DBManager();
//
//		prcFile = prcFilesService.selectFile(db.getPriceHelper().fileDailyName());
//		assert(!db.getPriceHelper().compareTotals(prcFile.getId()));
//	}
//
//	@Test
//	public void checkMessageErrors() throws Exception {
//		Long kolMesWithStutsError = (long) 0;
//		Long kolMesWithError = (long) 0;
//
//		db = new DBManager();
//
//		prcFile = prcFilesService.selectFile(db.getPriceHelper().fileDailyName());
//		kolMesWithStutsError = db.getPriceHelper().checkKolMesWithStatusError(prcFile.getId());
//		// System.out.println("kolMesWithStutsError = " + kolMesWithStutsError);
//		kolMesWithError = db.getPriceHelper().checkKolMesWithError(prcFile.getId());
//		// System.out.println("kolMesWithError = " + kolMesWithError);
//
//		assert(kolMesWithStutsError.equals(kolMesWithError));
//	}
//
//	@Test
//	public void checkParsingMessages() throws Exception {
//		Long amountPrcMessages = (long) 0;
//		Long amountPrcRawMessages = (long) 0;
//
//		db = new DBManager();
//
//		prcFile = prcFilesService.selectFile(db.getPriceHelper().fileDailyName());
//		amountPrcMessages = db.getPriceHelper().amountMessagesInPrcMessages(prcFile.getId());
//		System.out.println("amountPrcMessages = " + amountPrcMessages);
//		amountPrcRawMessages = db.getPriceHelper().amountMessagesInPrcRawMessages(prcFile.getId());
//		System.out.println("amountPrcRawMessages = " + amountPrcRawMessages);
//
//		assert(amountPrcMessages.equals(amountPrcRawMessages));
//	}
}
