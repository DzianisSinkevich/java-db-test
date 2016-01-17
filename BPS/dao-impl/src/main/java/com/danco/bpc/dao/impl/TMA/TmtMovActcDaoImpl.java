package com.danco.bpc.dao.impl.TMA;

import org.springframework.stereotype.Repository;

import com.danco.bpc.dao.api.TMA.ITmtMovActcDao;
import com.danco.bpc.dao.impl.common.AbstractDaoImpl;
import com.danco.bpc.entity.TMA.TmtMovActc;

@Repository
public class TmtMovActcDaoImpl extends AbstractDaoImpl<TmtMovActc> implements ITmtMovActcDao {

	/**
	 * Instantiates a new about dao impl.
	 */
	public TmtMovActcDaoImpl() {
		super(TmtMovActc.class);
	}

}
