package com.danco.bpc.service.impl.SERVICES;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.danco.bpc.dao.impl.PRICE.PrcMessagesDaoImpl;
import com.danco.bpc.entity.PRICE.PrcMessages;
import com.danco.bpc.service.api.PRICE.IPrcMessagesService;

@Service
@Transactional
public class PrcMessagesServiceImpl extends DataServiceImpl<PrcMessages>implements IPrcMessagesService {

	@Autowired
	private PrcMessagesDaoImpl genericDao = new PrcMessagesDaoImpl();

	
}
