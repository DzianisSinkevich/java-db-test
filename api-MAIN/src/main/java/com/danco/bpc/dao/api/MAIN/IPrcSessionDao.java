package com.danco.bpc.dao.api.MAIN;

import com.danco.bpc.dao.api.IGenericDao;
import com.danco.bpc.entity.MAIN.PrcSession;

public interface IPrcSessionDao extends IGenericDao<PrcSession> {

	public PrcSession selectSession(String session) throws Exception;
	
	public void getAllParametersSessionFromBase(String sessionId) throws Exception;
}
