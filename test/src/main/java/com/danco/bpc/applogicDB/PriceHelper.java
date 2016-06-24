package com.danco.bpc.applogicDB;

import java.util.ArrayList;
import java.util.Calendar;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.danco.bpc.IApplogicDB.IPriceHelper;
import com.danco.bpc.entity.PRICE.PrcFiles;
import com.danco.bpc.entity.PRICE.PrcMessages;
import com.danco.bpc.entity.PRICE.PrcMessagesErrors;
import com.danco.bpc.service.impl.SERVICES.PrcFilesServiceImpl;
import com.danco.bpc.service.impl.SERVICES.PrcMessagesErrorsServiceImpl;
import com.danco.bpc.service.impl.SERVICES.PrcMessagesServiceImpl;
import com.danco.bpc.service.impl.SERVICES.PrcRawMessagesServiceImpl;

public class PriceHelper implements IPriceHelper {

	private static final Logger logger = LogManager.getLogger("");

	public PriceHelper(DBManager dbManager) {
	}

	ArrayList<PrcFiles> incomingFiles = new ArrayList<PrcFiles>();

	private PrcFilesServiceImpl prcFilesService = new PrcFilesServiceImpl();
	private PrcMessagesServiceImpl prcMessagesService = new PrcMessagesServiceImpl();
	private PrcRawMessagesServiceImpl prcRawMessagesService = new PrcRawMessagesServiceImpl();
	private PrcMessagesErrorsServiceImpl prcMessagesErrorsService = new PrcMessagesErrorsServiceImpl();

	@Override
	public boolean comparer(Long first, Long second) throws Exception {
		if (second == null) {
			second = (long) 0;
		}
		if (first.equals(second)) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public String fileDailyName() {
		Calendar calendar = Calendar.getInstance();

		String filePrefix = "l9auto_";
		String month;
		String dayOfMonth;

		String year = Integer.toString(calendar.get(Calendar.YEAR));

		if ((calendar.get(Calendar.MONTH) + 1) < 10) {
			month = "0" + Integer.toString(calendar.get(Calendar.MONTH) + 1);
		} else {
			month = Integer.toString(calendar.get(Calendar.MONTH) + 1);
		}
		if ((calendar.get(Calendar.DAY_OF_MONTH)) < 10) {
			dayOfMonth = "0" + Integer.toString(calendar.get(Calendar.DAY_OF_MONTH));
		} else {
			dayOfMonth = Integer.toString(calendar.get(Calendar.DAY_OF_MONTH));
		}

		return filePrefix + year + "-" + month + "-" + dayOfMonth;
	}

	@Override
	public Calendar currentDate() {
		Calendar currDate = Calendar.getInstance();
		currDate.set(currDate.get(Calendar.YEAR), currDate.get(Calendar.MONTH), currDate.get(Calendar.DAY_OF_MONTH), 0, 0, 0);
		currDate.set(Calendar.MILLISECOND, 0);
		System.out.println("Current date = " + currDate.getTimeInMillis());
		return currDate;
	}

	@Override
	public int idIncomingFile() throws Exception {
		PrcFiles prcFiles = prcFilesService.selectFile(fileDailyName());

		return (int) (long) prcFiles.getId();
	}

	@Override
	public void checkFilePreferences(PrcFiles prcFile) {

		Calendar fileDate = prcFile.getUploadDate();
		Calendar currDate = currentDate();
		fileDate.set(Calendar.MILLISECOND, 0);
		fileDate.set(Calendar.SECOND, 0);
		fileDate.set(Calendar.MINUTE, 0);
		fileDate.set(Calendar.HOUR_OF_DAY, 0);
		System.out.println("fileDate - " + fileDate.getTimeInMillis() + " currDate - " + currDate.getTimeInMillis());
		assert(prcFile.getType().equals("FLTP1"));
		assert(prcFile.getStatus().equals("FLST1"));
		assert(prcFile.getTotalRecords().equals(4052L));
		assert(fileDate.equals(currDate));
	}

	@Override
	public Long sumPrcMessagesP04(Long fileId, int recordType1, String p56RT1, int recordType2, String p56RT2, int minPrcc, int maxPrcc) throws Exception {
		Long sumP04 = prcMessagesService.sumPrcMessagesP04(fileId, recordType1, p56RT1, recordType2, p56RT2, minPrcc, maxPrcc);
		return sumP04;
	}

	@Override
	public Long sumPrcMessagesP05(Long fileId, int recordType1, String p56RT1, int recordType2, String p56RT2, int minPrcc, int maxPrcc) throws Exception {
		Long sumP05 = prcMessagesService.sumPrcMessagesP05(fileId, recordType1, p56RT1, recordType2, p56RT2, minPrcc, maxPrcc);
		return sumP05;
	}

	@Override
	public Long sumPrcMessagesS74(Long fileId) throws Exception {
		Long sumS74 = prcMessagesService.sumPrcMessagesS74(fileId);
		return sumS74;
	}

	@Override
	public Long sumPrcMessagesS75(Long fileId) throws Exception {
		Long sumS75 = prcMessagesService.sumPrcMessagesS75(fileId);
		return sumS75;
	}

	@Override
	public Long sumPrcMessagesS76(Long fileId) throws Exception {
		Long sumS76 = prcMessagesService.sumPrcMessagesS76(fileId);
		return sumS76;
	}

	@Override
	public Long sumPrcMessagesS77(Long fileId) throws Exception {
		Long sumS77 = prcMessagesService.sumPrcMessagesS77(fileId);
		return sumS77;
	}

	@Override
	public Long sumPrcMessagesS85(Long fileId) throws Exception {
		Long sumS85 = prcMessagesService.sumPrcMessagesS85(fileId);
		return sumS85;
	}

	@Override
	public Long sumPrcMessagesS105(Long fileId) throws Exception {
		Long sum105p04 = sumPrcMessagesP04(fileId, 1442, "", 1442, "1442", 0, 290000);
		Long sum105p05 = sumPrcMessagesP05(fileId, 1442, "", 1442, "1442", 0, 290000);
		Long sum105 = sumPrcMessagesP04andP05(sum105p04, sum105p05);
		return sum105;
	}

	@Override
	public Long sumPrcMessagesS106(Long fileId) throws Exception {
		Long sum106p04 = sumPrcMessagesP04(fileId, 1442, "", 1442, "1442", 0, 290000);
		Long sum106p05 = sumPrcMessagesP05(fileId, 1442, "", 1442, "1442", 0, 290000);
		Long sum106 = sumPrcMessagesP04andP05(sum106p04, sum106p05);
		return sum106;
	}

	@Override
	public Long sumPrcMessagesS109(Long fileId, Long startId, Long endId) throws Exception {
		Long sumS109 = prcMessagesService.sumPrcMessagesS109(fileId);
		return sumS109;
	}

	@Override
	public Long sumPrcMessagesS110(Long fileId, Long startId, Long endId) throws Exception {
		Long sumS110 = prcMessagesService.sumPrcMessagesS110(fileId);
		return sumS110;
	}

	@Override
	public Long sumPrcMessagesP04andP05(Long p04, Long p05) {
		System.out.println("---P04 - P05 = " + p04 + " - " + p05);
		if (p04 == null && p05 != null) {
			Long sum = p05;
			return sum;
		}
		if (p04 != null && p05 == null) {
			Long sum = p04;
			return sum;
		}
		if (p04 != null && p05 != null) {
			Long sum = p05 + p04;
			return sum;
		}
		return null;
	}

	@Override
	public Long sumPrcMessagesS86(Long fileId) throws Exception {
		Long sum86p04 = sumPrcMessagesP04(fileId, 1240, "", 1244, "", 200000, 290000);
		Long sum86p05 = sumPrcMessagesP05(fileId, 1240, "", 1244, "", 200000, 290000);
		Long sum86 = sumPrcMessagesP04andP05(sum86p04, sum86p05);
		return sum86;
	}

	@Override
	public Long sumPrcMessagesS87(Long fileId) throws Exception {
		Long sum87p04 = sumPrcMessagesP04(fileId, 1440, "1240", 1444, "", 0, 190000);
		Long sum87p05 = sumPrcMessagesP05(fileId, 1440, "1240", 1444, "", 0, 190000);
		Long sum87 = sumPrcMessagesP04andP05(sum87p04, sum87p05);
		return sum87;
	}

	@Override
	public Long sumPrcMessagesS88(Long fileId) throws Exception {
		Long sum88p04 = sumPrcMessagesP04(fileId, 1240, "", 1244, "", 0, 190000);
		Long sum88p05 = sumPrcMessagesP05(fileId, 1240, "", 1244, "", 0, 190000);
		Long sum88 = sumPrcMessagesP04andP05(sum88p04, sum88p05);
		return sum88;
	}

	@Override
	public Long sumPrcMessagesS89(Long fileId) throws Exception {
		Long sum89p04 = sumPrcMessagesP04(fileId, 1440, "1240", 1444, "", 200000, 290000);
		Long sum89p05 = sumPrcMessagesP05(fileId, 1440, "1240", 1444, "", 200000, 290000);
		Long sum89 = sumPrcMessagesP04andP05(sum89p04, sum89p05);
		return sum89;
	}

	@Override
	public PrcMessages get1544(Long fileId) throws Exception {
		PrcMessages get1544 = prcMessagesService.get1544(fileId);
		return get1544;
	}

	@Override
	public boolean compareTotals(Long fileId) throws Exception {
		boolean isError = false;
		Long sum1544S74 = prcMessagesService.sum1544Sxx(fileId, "s74");
		Long sum1544S75 = prcMessagesService.sum1544Sxx(fileId, "s75");
		Long sum1544S76 = prcMessagesService.sum1544Sxx(fileId, "s76");
		Long sum1544S77 = prcMessagesService.sum1544Sxx(fileId, "s77");
		Long sum1544S85 = prcMessagesService.sum1544Sxx(fileId, "s85");
		Long sum1544S86 = prcMessagesService.sum1544Sxx(fileId, "s86");
		Long sum1544S87 = prcMessagesService.sum1544Sxx(fileId, "s87");
		Long sum1544S88 = prcMessagesService.sum1544Sxx(fileId, "s88");
		Long sum1544S89 = prcMessagesService.sum1544Sxx(fileId, "s89");
		Long sum1544S105 = prcMessagesService.sum1544Sxx(fileId, "s105");
		Long sum1544S106 = prcMessagesService.sum1544Sxx(fileId, "s106");

		Long sumPrcMessagesS74 = sumPrcMessagesS74(fileId);
		Long sumPrcMessagesS75 = sumPrcMessagesS75(fileId);
		Long sumPrcMessagesS76 = sumPrcMessagesS76(fileId);
		Long sumPrcMessagesS77 = sumPrcMessagesS77(fileId);
		Long sumPrcMessagesS85 = sumPrcMessagesS85(fileId);
		Long sumPrcMessagesS86 = sumPrcMessagesS86(fileId);
		Long sumPrcMessagesS87 = sumPrcMessagesS87(fileId);
		Long sumPrcMessagesS88 = sumPrcMessagesS88(fileId);
		Long sumPrcMessagesS89 = sumPrcMessagesS89(fileId);
		Long sumPrcMessagesS105 = sumPrcMessagesS105(fileId);
		Long sumPrcMessagesS106 = sumPrcMessagesS106(fileId);

		isError = comparer(sum1544S74, sumPrcMessagesS74);
		logger.info("Sum S74 in 1544 = " + sum1544S74 + ", Sum S74 from messages = " + sumPrcMessagesS74 + " - " + isError);
		isError = comparer(sum1544S75, sumPrcMessagesS75);
		logger.info("Sum S75 in 1544 = " + sum1544S75 + ", Sum S75 from messages = " + sumPrcMessagesS75 + " - " + isError);
		isError = comparer(sum1544S76, sumPrcMessagesS76);
		logger.info("Sum S76 in 1544 = " + sum1544S76 + ", Sum S76 from messages = " + sumPrcMessagesS76 + " - " + isError);
		isError = comparer(sum1544S77, sumPrcMessagesS77);
		logger.info("Sum S77 in 1544 = " + sum1544S77 + ", Sum S77 from messages = " + sumPrcMessagesS77 + " - " + isError);
		isError = comparer(sum1544S85, sumPrcMessagesS85);
		logger.info("Sum S85 in 1544 = " + sum1544S85 + ", Sum S85 from messages = " + sumPrcMessagesS85 + " - " + isError);
		isError = comparer(sum1544S86, sumPrcMessagesS86);
		logger.info("Sum S86 in 1544 = " + sum1544S86 + ", Sum S86 from messages = " + sumPrcMessagesS86 + " - " + isError);
		isError = comparer(sum1544S87, sumPrcMessagesS87);
		logger.info("Sum S87 in 1544 = " + sum1544S87 + ", Sum S87 from messages = " + sumPrcMessagesS87 + " - " + isError);
		isError = comparer(sum1544S88, sumPrcMessagesS88);
		logger.info("Sum S88 in 1544 = " + sum1544S88 + ", Sum S88 from messages = " + sumPrcMessagesS88 + " - " + isError);
		isError = comparer(sum1544S89, sumPrcMessagesS89);
		logger.info("Sum S89 in 1544 = " + sum1544S89 + ", Sum S89 from messages = " + sumPrcMessagesS89 + " - " + isError);
		// isError = comparer(sum1544S105, sumPrcMessagesS105);
		// logger.info("Sum S105 in 1544 = " + sum1544S105 + ", Sum S105 from messages = " + sumPrcMessagesS105 + " - " + isError);
		// isError = comparer(sum1544S106, sumPrcMessagesS106);
		// logger.info("Sum S106 in 1544 = " + sum1544S106 + ", Sum S106 from messages = " + sumPrcMessagesS106 + " - " + isError);

		return isError;
	}

	@Override
	public Long checkKolMesWithStatusError(Long fileId) throws Exception {
		return prcMessagesService.kolInvalidMess(fileId);
	}

	@Override
	public Long checkKolMesWithError(Long fileId) throws Exception {
		return prcMessagesService.kolMessWithError(fileId);
	}

	@Override
	public Long amountMessagesInPrcMessages(Long fileId) throws Exception {
		return prcMessagesService.amountMessagesInPrcMessages(fileId);
	}

	@Override
	public Long amountMessagesInPrcRawMessages(Long fileId) throws Exception {
		return prcRawMessagesService.amountMessagesInPrcRawMessages(fileId);
	}

	@Override
	public Long amountMessagesWithCurrentDate() throws Exception {
		return prcRawMessagesService.amountMessagesWithCurrentDate(currentDate());
	}

	@Override
	public String getPrcRawMessagesStatus(String id) throws Exception {
		return prcRawMessagesService.getPrcRawMessagesStatus(id);
	}

	@Override
	public ArrayList<String> getIdErrors(Long id) throws Exception {
		ArrayList<PrcMessagesErrors> records = prcMessagesErrorsService.getErrors(id);
		ArrayList<String> idErrors = new ArrayList<String>();
		for (int i = 0; i < records.size(); i++) {
			idErrors.add(records.get(i).getError());
		}
		return idErrors;
	}

	@Override
	public String p11generator() throws Exception {
		return null;
	}

	@Override
	public String p12generator() throws Exception {
		return null;
	}

	@Override
	public ArrayList<PrcFiles> listIncomingFiles() throws Exception {
		incomingFiles = prcFilesService.listIncomingFiles();
		return incomingFiles;
	}

	@Override
	public ArrayList<String> listIncomingFilesId() throws Exception {
		ArrayList<String> incomingFilesId = new ArrayList<String>();
		for (PrcFiles el : incomingFiles) {
			incomingFilesId.add(String.valueOf(el.getId()));
		}
		return incomingFilesId;
	}
}