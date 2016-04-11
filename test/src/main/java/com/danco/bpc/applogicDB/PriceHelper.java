package com.danco.bpc.applogicDB;

import java.util.Calendar;

import com.danco.bpc.IApplogicDB.IPriceHelper;
import com.danco.bpc.entity.PRICE.PrcFiles;
import com.danco.bpc.service.impl.SERVICES.PrcFilesServiceImpl;

public class PriceHelper implements IPriceHelper {

	public PriceHelper(DBManager dbManager) {
	}

	private PrcFilesServiceImpl prcFilesService = new PrcFilesServiceImpl();

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

}
