package com.danco.bpc.dao.impl.TMA;

import org.springframework.stereotype.Repository;

import com.danco.bpc.dao.api.TMA.ITmtMovActcTeDao;
import com.danco.bpc.dao.impl.common.AbstractDaoImpl;
import com.danco.bpc.entity.TMA.TmtMovActcTe;

@Repository
public class TmtMovActcTeDaoImpl extends AbstractDaoImpl<TmtMovActcTe>implements ITmtMovActcTeDao {

	/**
	 * Instantiates a new about dao impl.
	 */
	public TmtMovActcTeDaoImpl() {
		super(TmtMovActcTe.class);
	}

}
