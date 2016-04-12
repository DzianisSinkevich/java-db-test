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
		Long sumP04 = prcMessagesService.sumPrcMessagesP04(fileId);
		return sumP04;
	}

	@Override
	public Long sumPrcMessagesP05(Long fileId) throws Exception {
		Long sumP05 = prcMessagesService.sumPrcMessagesP05(fileId);
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
		Long sumS105 = prcMessagesService.sumPrcMessagesS105(fileId);
		return sumS105;
	}

	@Override
	public Long sumPrcMessagesS106(Long fileId) throws Exception {
		Long sumS106 = prcMessagesService.sumPrcMessagesS106(fileId);
		return sumS106;
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
		if ((p04.equals(null))&&(!p05.equals(null))){
			Long sum = p05;
			return sum;
		}
		if ((!p04.equals(null))&&(p05.equals(null))){
			Long sum = p04;
			return sum;
		}
		if ((!p04.equals(null))&&(!p05.equals(null))){
			Long sum = p05 + p04;
			return sum;
		}
		return null;
	}
}
