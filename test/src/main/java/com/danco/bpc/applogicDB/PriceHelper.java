package com.danco.bpc.applogicDB;

import java.util.Calendar;

import com.danco.bpc.IApplogicDB.IPriceHelper;
import com.danco.bpc.entity.PRICE.PrcFiles;
import com.danco.bpc.entity.PRICE.PrcMessages;
import com.danco.bpc.service.impl.SERVICES.PrcFilesServiceImpl;
import com.danco.bpc.service.impl.SERVICES.PrcMessagesServiceImpl;

public class PriceHelper implements IPriceHelper {

	public PriceHelper(DBManager dbManager) {
	}

	private PrcFilesServiceImpl prcFilesService = new PrcFilesServiceImpl();
	private PrcMessagesServiceImpl prcMessagesService = new PrcMessagesServiceImpl();

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
		currDate.set(2016, 3, 12, 0, 0, 0);
		currDate.set(Calendar.MILLISECOND, 0);
		fileDate.set(Calendar.MILLISECOND, 0);
		fileDate.set(Calendar.SECOND, 0);
		fileDate.set(Calendar.MINUTE, 0);
		fileDate.set(Calendar.HOUR_OF_DAY, 0);
		
		assert(prcFile.getType().equals("FLTP1"));
		assert(prcFile.getStatus().equals("FLST1"));
		assert(prcFile.getTotalRecords().equals(4052L));
		assert(fileDate.equals(currDate));
	}

	@Override
	public Long sumPrcMessagesP04(Long fileId) throws Exception {
		Long sumP4 = prcMessagesService.sumPrcMessagesP04(fileId);
		return null;
	}

	@Override
	public Long sumPrcMessagesP05() {
		
		return null;
	}

	@Override
	public Long sumPrcMessagesP76() {
		
		return null;
	}
}
