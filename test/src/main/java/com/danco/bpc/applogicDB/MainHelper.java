package com.danco.bpc.applogicDB;

import com.danco.bpc.IApplogicDB.IMainHelper;
import com.danco.bpc.entity.MAIN.PrcSession;
import com.danco.bpc.modelAllWeb.ProcessesSession;
import com.danco.bpc.service.impl.SERVICES.PrcSessionServiceImpl;

public class MainHelper implements IMainHelper {
	private int estimateCount = -1;
	private int processed = -2;
	private int countRowPrice = -3;

	private ProcessesSession procSess = new ProcessesSession();
	private PrcSessionServiceImpl prcSessionService = new PrcSessionServiceImpl();


	public MainHelper(DBManager manager) {
	}

	@Override
	public void setAllParameters(String sessionId) throws Exception {
		PrcSession prcSession = prcSessionService.selectSession(sessionId);

		procSess.setId(Long.getLong(sessionId));
		procSess.setEstimatedCount(prcSession.getEstimatedCount());
		procSess.setExcepted(prcSession.getEscepted());
		procSess.setProcessed(prcSession.getProcessed());
		procSess.setRejected(prcSession.getRejected());
		procSess.setThreadCount(prcSession.getThreadCount());
	}

	@Override
	public String waitForProcessFinished(String pid) throws Exception {
		String resultCode = "PRSR0001";
		for (int i = 0; i <= 1200; i++) {
			PrcSession prcSession = prcSessionService.selectSession(pid);
			resultCode = prcSession.getResultCode();
			if (!resultCode.equals("PRSR0001")) {
				return resultCode;
			}
			Thread.sleep(1000);
		}
		return resultCode;
	}

	@Override
	public boolean compareAllMessagesCount() {
		if ((estimateCount == processed) && (estimateCount == countRowPrice)) {
			return true;
		}
		return false;
	}

	@Override
	public void setEstimateCount(PrcSession prcSess) {
		estimateCount = (int) (long) prcSess.getEstimatedCount();
	}

	@Override
	public void setProcessed(PrcSession prcSess) {
		processed = (int) (long) prcSess.getProcessed();
	}

	@Override
	public void setCountRowPrice(Long countRowInPrice) {
		countRowPrice = (int) (long) countRowInPrice;
	}

}
