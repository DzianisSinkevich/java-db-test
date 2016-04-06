package com.danco.bpc.service.impl.SERVICES;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.danco.bpc.dao.api.MAIN.IPrcSessionDao;
import com.danco.bpc.entity.MAIN.PrcSession;
import com.danco.bpc.service.api.MAIN.IPrcSessionService;

@Service
@Transactional
public class PrcSessionServiceImpl extends DataServiceImpl<PrcSession>implements IPrcSessionService {

	@Autowired
	private IPrcSessionDao genericDao;

	@Override
	public String getUserByLogin(String login) {
		return null;
	}

	public PrcSession selectSession(String session) throws Exception {
		return genericDao.selectSession(session);
	}
}
