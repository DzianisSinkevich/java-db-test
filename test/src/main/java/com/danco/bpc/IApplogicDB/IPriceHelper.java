package com.danco.bpc.IApplogicDB;

import java.util.ArrayList;
import java.util.Calendar;

import com.danco.bpc.entity.PRICE.PrcFiles;
import com.danco.bpc.entity.PRICE.PrcMessages;

public interface IPriceHelper {
	public String fileDailyName();

	public int idIncomingFile() throws Exception;

	public Calendar currentDate();

	public void checkFilePreferences(PrcFiles prcFile);

	public Long sumPrcMessagesP04(Long fileId, int recordType1, int recordType2, int minPrcc, int maxPrcc) throws Exception;

	public Long sumPrcMessagesP05(Long fileId, int recordType1, int recordType2, int minPrcc, int maxPrcc) throws Exception;

	public Long sumPrcMessagesS86(Long fileId) throws Exception;

	public Long sumPrcMessagesS87(Long fileId) throws Exception;

	public Long sumPrcMessagesS88(Long fileId) throws Exception;

	public Long sumPrcMessagesS89(Long fileId) throws Exception;

	public Long sumPrcMessagesS105(Long fileId) throws Exception;

	public Long sumPrcMessagesS106(Long fileId) throws Exception;

	public Long sumPrcMessagesP04andP05(Long fileId, Long p05);

	public PrcMessages get1544(Long fileId) throws Exception;

	public Long checkKolMesWithStatusError(Long fileId) throws Exception;

	public Long checkKolMesWithError(Long fileId) throws Exception;

	public Long amountMessagesInPrcMessages(Long fileId) throws Exception;

	public Long amountMessagesInPrcRawMessages(Long fileId) throws Exception;

	public Long amountMessagesWithCurrentDate() throws Exception;

	public String getPrcRawMessagesStatus(String id) throws Exception;

	public ArrayList<String> getIdErrors(Long id) throws Exception;
	
	public String p11generator() throws Exception;
	
	public String p12generator() throws Exception;
	
	public ArrayList<PrcFiles> listIncomingFiles() throws Exception;
	
	public ArrayList<String> listIncomingFilesId() throws Exception;

	ArrayList<Long> messageFlagsSearch(Long fileId) throws Exception;

	Long firstMessageInFile(Long fileId) throws Exception;

	Long lastMessageInFile(Long fileId) throws Exception;

	Long sumPrcMessagesS74(Long fileId, Long startId, Long endId) throws Exception;

	Long sumPrcMessagesS75(Long fileId, Long startId, Long endId) throws Exception;

	Long sumPrcMessagesS76(Long fileId, Long startId, Long endId) throws Exception;

	Long sumPrcMessagesS77(Long fileId, Long startId, Long endId) throws Exception;

	Long sumPrcMessagesS85(Long fileId, Long startId, Long endId) throws Exception;

	Long sumPrcMessagesS109(Long fileId, Long startId, Long endId) throws Exception;

	Long sumPrcMessagesS110(Long fileId, Long startId, Long endId) throws Exception;

	boolean compareTotals(Long fileId, Long startId, Long endId) throws Exception;
}
