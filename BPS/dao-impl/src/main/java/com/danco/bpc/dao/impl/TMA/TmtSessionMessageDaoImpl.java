package com.danco.bpc.dao.impl.TMA;

import org.springframework.stereotype.Repository;

import com.danco.bpc.dao.api.TMA.ITmtSessionMessageDao;
import com.danco.bpc.dao.impl.common.AbstractDaoImpl;
import com.danco.bpc.entity.TMA.TmtSessionMessage;

@Repository
public class TmtSessionMessageDaoImpl extends AbstractDaoImpl<TmtSessionMessage> implements ITmtSessionMessageDao {

	/**
	 * Instantiates a new about dao impl.
	 */
	public TmtSessionMessageDaoImpl() {
		super(TmtSessionMessage.class);
	}

}
