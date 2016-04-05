package com.danco.bpc.dao.impl.MAIN;

import com.danco.bpc.dao.api.MAIN.IPrcSessionDao;
import com.danco.bpc.dao.impl.common.AbstractDaoImpl;
import com.danco.bpc.entity.MAIN.PrcSession;

public class PrcSessionDaoImpl extends AbstractDaoImpl<PrcSession> implements IPrcSessionDao {

	/**
	 * Instantiates a new about dao impl.
	 */ 
	public PrcSessionDaoImpl() {
		super(PrcSession.class);
	}
}
