package com.danco.bpc.service.api.MAIN;

import com.danco.bpc.entity.MAIN.PrcSession;
import com.danco.bpc.service.api.IGenericService;

public interface IPrcSessionService extends IGenericService<PrcSession> {

	String getUserByLogin(String login);

	public PrcSession selectSession(String session) throws Exception;

//	public void getAllParametersSessionFromBase(String sessionId) throws Exception;
}
