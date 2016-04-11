package com.danco.bpc.IApplogicDB;

import com.danco.bpc.entity.MAIN.PrcSession;

public interface IMainHelper {
	public String waitForProcessFinished(String pid) throws Exception;
	
	public boolean compareAllMessagesCount();

	public void setAllParameters(String ssid) throws Exception;

	public void setEstimateCount(PrcSession prcSess);

	public void setProcessed(PrcSession prcSess);

	public void setCountRowPrice(Long countRowInPrice);
}
