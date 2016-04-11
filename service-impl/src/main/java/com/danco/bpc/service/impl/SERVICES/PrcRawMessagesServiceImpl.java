package com.danco.bpc.service.impl.SERVICES;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.danco.bpc.dao.impl.PRICE.PrcRawMessagesDaoImpl;
import com.danco.bpc.entity.PRICE.PrcRawMessages;
import com.danco.bpc.service.api.PRICE.IPrcRawMessagesService;

@Service
@Transactional
public class PrcRawMessagesServiceImpl extends DataServiceImpl<PrcRawMessages>implements IPrcRawMessagesService {

	@Autowired
	private PrcRawMessagesDaoImpl genericDao = new PrcRawMessagesDaoImpl();

	public Long countRowsForSendToSv() throws Exception {
		return genericDao.countRowsForSendToSv();
	}
}
