package com.danco.bpc.dao.api.PRICE;

import java.util.Calendar;

import com.danco.bpc.dao.api.IGenericDao;
import com.danco.bpc.entity.PRICE.PrcRawMessages;

public interface IPrcRawMessagesDao extends IGenericDao<PrcRawMessages> {

	public Long countRowsForSendToSv() throws Exception;

	public Long amountMessagesInPrcRawMessages(Long fileId) throws Exception;

	public Long amountMessagesWithCurrentDate(Calendar currDate) throws Exception;
	
	public String getPrcRawMessagesStatus(String id) throws Exception;
}
