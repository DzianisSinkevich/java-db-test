package com.danco.bpc.dao.api.PRICE;

import com.danco.bpc.dao.api.IGenericDao;
import com.danco.bpc.entity.PRICE.PrcMessages;

public interface IPrcMessagesDao extends IGenericDao<PrcMessages> {

	public Long sumPrcMessagesP04(Long fileId, int recordType1, String p56RT1, int recordType2, String p56RT2, int minPrcc, int maxPrcc) throws Exception;

	public Long sumPrcMessagesP05(Long fileId, int recordType1, String p56RT1, int recordType2, String p56RT2, int minPrcc, int maxPrcc) throws Exception;

	public PrcMessages get1544(Long fileId) throws Exception;

	public Long kolInvalidMess(Long fileId) throws Exception;

	public Long kolMessWithError(Long fileId) throws Exception;

	public Long amountMessagesInPrcMessages(Long fileId) throws Exception;

	Long sumPrcMessagesS74(Long fileId) throws Exception;

	Long sumPrcMessagesS75(Long fileId) throws Exception;

	Long sumPrcMessagesS76(Long fileId) throws Exception;

	Long sumPrcMessagesS77(Long fileId) throws Exception;

	Long sumPrcMessagesS85(Long fileId) throws Exception;

	Long sumPrcMessagesS109(Long fileId) throws Exception;

	Long sumPrcMessagesS110(Long fileId) throws Exception;

	Long sum1544Sxx(Long fileId, String filed) throws Exception;
}
