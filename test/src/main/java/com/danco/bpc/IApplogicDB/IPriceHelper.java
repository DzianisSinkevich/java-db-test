package com.danco.bpc.IApplogicDB;

import com.danco.bpc.entity.PRICE.PrcFiles;

public interface IPriceHelper {
	public String fileDailyName();

	public int idIncomingFile() throws Exception;

	public void checkFilePreferences(PrcFiles prcFile);
	
	public Long sumPrcMessagesP04(Long fileId) throws Exception;
	
	public Long sumPrcMessagesP05();
	
	public Long sumPrcMessagesP76();

}
