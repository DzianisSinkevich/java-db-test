package com.danco.bpc.service.api.PRICE;

import com.danco.bpc.entity.PRICE.PrcRawMessages;
import com.danco.bpc.service.api.IGenericService;

public interface IPrcRawMessagesService extends IGenericService<PrcRawMessages>{
	
	public Long countRowsForSendToSv() throws Exception;
	
	public Long amountMessagesInPrcRawMessages(Long fileId) throws Exception;
}
