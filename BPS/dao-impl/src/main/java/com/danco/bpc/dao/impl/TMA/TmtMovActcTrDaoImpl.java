package com.danco.bpc.dao.impl.TMA;

import org.springframework.stereotype.Repository;

import com.danco.bpc.dao.api.TMA.ITmtMovActcTrDao;
import com.danco.bpc.dao.impl.common.AbstractDaoImpl;
import com.danco.bpc.entity.TMA.TmtMovActcTr;

@Repository
public class TmtMovActcTrDaoImpl extends AbstractDaoImpl<TmtMovActcTr>implements ITmtMovActcTrDao {

	/**
	 * Instantiates a new about dao impl.
	 */
	public TmtMovActcTrDaoImpl() {
		super(TmtMovActcTr.class);
	}

}
