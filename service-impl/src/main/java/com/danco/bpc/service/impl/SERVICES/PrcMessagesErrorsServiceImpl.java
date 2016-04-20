package com.danco.bpc.service.impl.SERVICES;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.danco.bpc.dao.impl.PRICE.PrcMessagesErrorsDaoImpl;
import com.danco.bpc.entity.PRICE.PrcMessagesErrors;
import com.danco.bpc.service.api.PRICE.IPrcMessagesErrorsService;

@Service
@Transactional
public class PrcMessagesErrorsServiceImpl extends DataServiceImpl<PrcMessagesErrors>implements IPrcMessagesErrorsService {

	@Autowired
	private PrcMessagesErrorsDaoImpl genericDao = new PrcMessagesErrorsDaoImpl();

	@Override
	public ArrayList<PrcMessagesErrors> getErrors(Long id) throws Exception {
		return genericDao.getErrors(id);
	}
}
