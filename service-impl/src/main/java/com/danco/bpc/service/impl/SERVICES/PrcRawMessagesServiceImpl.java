package com.danco.bpc.service.impl.SERVICES;

import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.danco.bpc.dao.impl.PRICE.PrcRawMessagesDaoImpl;
import com.danco.bpc.entity.PRICE.PrcRawMessages;
import com.danco.bpc.service.api.PRICE.IPrcRawMessagesService;

@Service
@Transactional
public class PrcRawMessagesServiceImpl extends DataServiceImpl<PrcRawMessages> implements IPrcRawMessagesService {

	@Autowired
	private PrcRawMessagesDaoImpl genericDao = new PrcRawMessagesDaoImpl();

	public Long countRowsForSendToSv() throws Exception {
		return genericDao.countRowsForSendToSv();
	}

	@Override
	public Long amountMessagesInPrcRawMessages(Long fileId) throws Exception {
		return genericDao.amountMessagesInPrcRawMessages(fileId);
	}

	@Override
	public Long amountMessagesWithCurrentDate(Calendar currDate) throws Exception {
		return genericDao.amountMessagesWithCurrentDate(currDate);
	}

	@Override
	public String getPrcRawMessagesStatus(String id) throws Exception {
		return genericDao.getPrcRawMessagesStatus(id);
	}
}
