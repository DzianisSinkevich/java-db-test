package com.danco.bpc.dao.api.PRICE;

import java.util.ArrayList;

import com.danco.bpc.dao.api.IGenericDao;
import com.danco.bpc.entity.PRICE.PrcMessages;

public interface IPrcMessagesDao extends IGenericDao<PrcMessages> {

	public Long sumPrcMessagesP04(Long fileId, int recordType1, int recordType2, int minPrcc, int maxPrcc) throws Exception;

	public Long sumPrcMessagesP05(Long fileId, int recordType1, int recordType2, int minPrcc, int maxPrcc) throws Exception;

	public PrcMessages get1544(Long fileId) throws Exception;
	
	public Long kolInvalidMess(Long fileId) throws Exception;
	
	public Long kolMessWithError(Long fileId) throws Exception;
	
	public Long amountMessagesInPrcMessages(Long fileId) throws Exception;

	public ArrayList<PrcMessages> get1544List(Long fileId) throws Exception;

	public Long firstMessage(Long fileId) throws Exception;

	public Long lastMessage(Long fileId) throws Exception;

	Long sumPrcMessagesS74(Long fileId, Long startId, Long endId) throws Exception;

	Long sumPrcMessagesS75(Long fileId, Long startId, Long endId) throws Exception;

	Long sumPrcMessagesS76(Long fileId, Long startId, Long endId) throws Exception;

	Long sumPrcMessagesS77(Long fileId, Long startId, Long endId) throws Exception;

	Long sumPrcMessagesS85(Long fileId, Long startId, Long endId) throws Exception;

	Long sumPrcMessagesS109(Long fileId, Long startId, Long endId) throws Exception;

	Long sumPrcMessagesS110(Long fileId, Long startId, Long endId) throws Exception;
}
