package com.danco.bpc.IApplogicDB;

import com.danco.bpc.entity.PRICE.PrcFiles;

public interface IPriceHelper {
	public String fileDailyName();

	public int idIncomingFile() throws Exception;

	public void checkFilePreferences(PrcFiles prcFile);
	
	public Long sumPrcMessagesP04(Long fileId, int recordType1, int recordType2, int minPrcc, int maxPrcc) throws Exception;

	public Long sumPrcMessagesP05(Long fileId, int recordType1, int recordType2, int minPrcc, int maxPrcc) throws Exception;

	public Long sumPrcMessagesS74(Long fileId) throws Exception;

	public Long sumPrcMessagesS75(Long fileId) throws Exception;

	public Long sumPrcMessagesS76(Long fileId) throws Exception;

	public Long sumPrcMessagesS77(Long fileId) throws Exception;

	public Long sumPrcMessagesS85(Long fileId) throws Exception;

	public Long sumPrcMessagesS105(Long fileId) throws Exception;

	public Long sumPrcMessagesS106(Long fileId) throws Exception;

	public Long sumPrcMessagesS109(Long fileId) throws Exception;

	public Long sumPrcMessagesS110(Long fileId) throws Exception;

	public Long sumPrcMessagesP04andP05 (Long fileId, Long p05);
}
