package com.danco.bpc.dao.impl.TMA;

import org.springframework.stereotype.Repository;

import com.danco.bpc.dao.api.TMA.ITmtSessionDao;
import com.danco.bpc.dao.impl.common.AbstractDaoTmaImpl;
import com.danco.bpc.entity.TMA.TmtSession;

@Repository
public class TmtSessionDaoImpl extends AbstractDaoTmaImpl<TmtSession> implements ITmtSessionDao {

	/**
	 * Instantiates a new about dao impl.
	 */
	public TmtSessionDaoImpl() {
		super(TmtSession.class);
	}

}