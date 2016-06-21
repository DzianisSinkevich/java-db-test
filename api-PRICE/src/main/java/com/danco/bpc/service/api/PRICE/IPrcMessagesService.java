package com.danco.bpc.service.api.PRICE;

import java.util.ArrayList;

import com.danco.bpc.entity.PRICE.PrcMessages;
import com.danco.bpc.service.api.IGenericService;

public interface IPrcMessagesService extends IGenericService<PrcMessages> {
	public Long sumPrcMessagesP04(Long fileId, int recordType1, int recordType2, int minPrcc, int maxPrcc) throws Exception;

	public Long sumPrcMessagesP05(Long fileId, int recordType1, int recordType2, int minPrcc, int maxPrcc) throws Exception;

	public PrcMessages get1544(Long fileId) throws Exception;
	
	public Long kolInvalidMess(Long fileId) throws Exception;
	
	public Long kolMessWithError(Long fileId) throws Exception;
	
	public Long amountMessagesInPrcMessages(Long fileId) throws Exception;

	public Long firstMessageInFile(Long fileId) throws Exception;
	
	public Long lastMessageInFile(Long fileId) throws Exception;

	ArrayList<PrcMessages> get1544list(Long fileId) throws Exception;

	Long sumPrcMessagesS74(Long fileId, Long startId, Long endId) throws Exception;

	Long sumPrcMessagesS75(Long fileId, Long startId, Long endId) throws Exception;

	Long sumPrcMessagesS76(Long fileId, Long startId, Long endId) throws Exception;

	Long sumPrcMessagesS77(Long fileId, Long startId, Long endId) throws Exception;

	Long sumPrcMessagesS85(Long fileId, Long startId, Long endId) throws Exception;

	Long sumPrcMessagesS109(Long fileId, Long startId, Long endId) throws Exception;

	Long sumPrcMessagesS110(Long fileId, Long startId, Long endId) throws Exception;
}
