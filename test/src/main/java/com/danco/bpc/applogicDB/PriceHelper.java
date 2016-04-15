package com.danco.bpc.applogicDB;

import java.util.Calendar;

import com.danco.bpc.IApplogicDB.IPriceHelper;
import com.danco.bpc.entity.PRICE.PrcFiles;
import com.danco.bpc.entity.PRICE.PrcMessages;
import com.danco.bpc.service.impl.SERVICES.PrcFilesServiceImpl;
import com.danco.bpc.service.impl.SERVICES.PrcMessagesServiceImpl;
import com.danco.bpc.service.impl.SERVICES.PrcRawMessagesServiceImpl;

public class PriceHelper implements IPriceHelper {

	public PriceHelper(DBManager dbManager) {
	}

	private PrcFilesServiceImpl prcFilesService = new PrcFilesServiceImpl();
	private PrcMessagesServiceImpl prcMessagesService = new PrcMessagesServiceImpl();
	private PrcRawMessagesServiceImpl prcRawMessagesService = new PrcRawMessagesServiceImpl();

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
	public int idIncomingFile() throws Exception {
		PrcFiles prcFiles = prcFilesService.selectFile(fileDailyName());

		return (int) (long) prcFiles.getId();
	}

	@Override
	public void checkFilePreferences(PrcFiles prcFile) {
		Calendar currDate = Calendar.getInstance();
		Calendar fileDate = prcFile.getUploadDate();
		currDate.set(currDate.get(Calendar.YEAR), currDate.get(Calendar.MONTH), currDate.get(Calendar.DAY_OF_MONTH), 0, 0, 0);
		currDate.set(Calendar.MILLISECOND, 0);
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
	public Long sumPrcMessagesP04(Long fileId, int recordType1, int recordType2, int minPrcc, int maxPrcc) throws Exception {
		Long sumP04 = prcMessagesService.sumPrcMessagesP04(fileId, recordType1, recordType2, minPrcc, maxPrcc);
		return sumP04;
	}

	@Override
	public Long sumPrcMessagesP05(Long fileId, int recordType1, int recordType2, int minPrcc, int maxPrcc) throws Exception {
		Long sumP05 = prcMessagesService.sumPrcMessagesP05(fileId, recordType1, recordType2, minPrcc, maxPrcc);
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
		Long sum105p04 = sumPrcMessagesP04(fileId, 1442, 1442, 0, 290000);
		Long sum105p05 = sumPrcMessagesP05(fileId, 1442, 1442, 0, 290000);
		Long sum105 = sumPrcMessagesP04andP05(sum105p04, sum105p05);
		return sum105;
	}

	@Override
	public Long sumPrcMessagesS106(Long fileId) throws Exception {
		Long sum106p04 = sumPrcMessagesP04(fileId, 1442, 1442, 0, 290000);
		Long sum106p05 = sumPrcMessagesP05(fileId, 1442, 1442, 0, 290000);
		Long sum106 = sumPrcMessagesP04andP05(sum106p04, sum106p05);
		return sum106;
	}

	@Override
	public Long sumPrcMessagesS109(Long fileId) throws Exception {
		Long sumS109 = prcMessagesService.sumPrcMessagesS109(fileId);
		return sumS109;
	}

	@Override
	public Long sumPrcMessagesS110(Long fileId) throws Exception {
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
		Long sum86p04 = sumPrcMessagesP04(fileId, 1240, 1244, 200000, 290000);
		Long sum86p05 = sumPrcMessagesP05(fileId, 1240, 1244, 200000, 290000);
		Long sum86 = sumPrcMessagesP04andP05(sum86p04, sum86p05);
		return sum86;
	}

	@Override
	public Long sumPrcMessagesS87(Long fileId) throws Exception {
		Long sum87p04 = sumPrcMessagesP04(fileId, 1440, 1444, 0, 190000);
		Long sum87p05 = sumPrcMessagesP05(fileId, 1440, 1444, 0, 190000);
		Long sum87 = sumPrcMessagesP04andP05(sum87p04, sum87p05);
		return sum87;
	}

	@Override
	public Long sumPrcMessagesS88(Long fileId) throws Exception {
		Long sum88p04 = sumPrcMessagesP04(fileId, 1240, 1244, 0, 190000);
		Long sum88p05 = sumPrcMessagesP05(fileId, 1240, 1244, 0, 190000);
		Long sum88 = sumPrcMessagesP04andP05(sum88p04, sum88p05);
		return sum88;
	}

	@Override
	public Long sumPrcMessagesS89(Long fileId) throws Exception {
		Long sum89p04 = sumPrcMessagesP04(fileId, 1440, 1444, 200000, 290000);
		Long sum89p05 = sumPrcMessagesP05(fileId, 1440, 1444, 200000, 290000);
		Long sum89 = sumPrcMessagesP04andP05(sum89p04, sum89p05);
		return sum89;
	}

	@Override
	public PrcMessages get1544(Long fileId) throws Exception {
		PrcMessages get1544 = prcMessagesService.get1544(fileId);
		return get1544;
	}

	private boolean compare(Long a, Long b) {
		if (a == null && b == null) {
			return true;
		}
		if (a == null && b == 0) {
			return true;
		}
		if (b == null && a == 0) {
			return true;
		}
		if (a == null) {
			return false;
		}
		return a.equals(b);
	}

	@Override
	public boolean compareTotals(Long fileId) throws Exception {
		PrcMessages get1544 = prcMessagesService.get1544(fileId);
		boolean isError = false;
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

		System.out.println("getS74 = " + get1544.getS74() + ", sum = " + sumPrcMessagesS74(fileId));
		if (!compare(get1544.getS74(), sumPrcMessagesS74)) {
			isError = true;
		}
		System.out.println(isError);
		System.out.println("getS75 = " + get1544.getS75() + ", sum = " + sumPrcMessagesS75);
		if (!compare(get1544.getS75(), sumPrcMessagesS75)) {
			isError = true;
		}
		System.out.println(isError);
		System.out.println("getS76 = " + get1544.getS76() + ", sum = " + sumPrcMessagesS76);
		if (!compare(get1544.getS76(), sumPrcMessagesS76)) {
			isError = true;
		}
		System.out.println(isError);
		System.out.println("getS77 = " + get1544.getS77() + ", sum = " + sumPrcMessagesS77);
		if (!compare(get1544.getS77(), sumPrcMessagesS77)) {
			isError = true;
		}
		System.out.println(isError);
		System.out.println("getS85 = " + get1544.getS85() + ", sum = " + sumPrcMessagesS85);
		if (!compare(get1544.getS85(), sumPrcMessagesS85)) {
			isError = true;
		}
		System.out.println(isError);
		System.out.println("getS86 = " + get1544.getS86() + ", sum = " + sumPrcMessagesS86);
		if (!compare(get1544.getS86(), sumPrcMessagesS86)) {
			isError = true;
		}
		System.out.println(isError);
		System.out.println("getS87 = " + get1544.getS87() + ", sum = " + sumPrcMessagesS87);
		if (!compare(get1544.getS87(), sumPrcMessagesS87)) {
			isError = true;
		}
		System.out.println(isError);
		System.out.println("getS88 = " + get1544.getS88() + ", sum = " + sumPrcMessagesS88);
		if (!compare(get1544.getS88(), sumPrcMessagesS88)) {
			isError = true;
		}
		System.out.println(isError);
		System.out.println("getS89 = " + get1544.getS89() + ", sum = " + sumPrcMessagesS89);
		if (!compare(get1544.getS89(), sumPrcMessagesS89)) {
			isError = true;
		}
		System.out.println(isError);
		System.out.println("getS105 = " + get1544.getS105() + ", sum = " + sumPrcMessagesS105);
		if (!compare(get1544.getS105(), sumPrcMessagesS105)) {
			isError = true;
		}
		System.out.println(isError);
		System.out.println("getS106 = " + get1544.getS106() + ", sum = " + sumPrcMessagesS106);
		if (!compare(get1544.getS106(), sumPrcMessagesS106)) {
			isError = true;
		}
		System.out.println(isError);

		return isError;
	}

	@Override
	public Long checkKolMesWithStatusError(Long fileId) throws Exception {
		Long kolMess = prcMessagesService.kolInvalidMess(fileId);
		return kolMess;
	}

	@Override
	public Long checkKolMesWithError(Long fileId) throws Exception {
		Long kolMess = prcMessagesService.kolMessWithError(fileId);
		return kolMess;
	}

	@Override
	public Long amountMessagesInPrcMessages(Long fileId) throws Exception {
		Long kolMess = prcMessagesService.amountMessagesInPrcMessages(fileId);
		return kolMess;
	}

	@Override
	public Long amountMessagesInPrcRawMessages(Long fileId) throws Exception {
		Long kolMess = prcRawMessagesService.amountMessagesInPrcRawMessages(fileId);
		return kolMess;
	}
}
