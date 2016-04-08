package com.danco.bpc.dao.impl.TMA;

import org.springframework.stereotype.Repository;

import com.danco.bpc.dao.api.TMA.ITmtDataDao;
import com.danco.bpc.dao.impl.common.AbstractDaoTmaImpl;
import com.danco.bpc.entity.TMA.TmtData;

@Repository
public class TmtDataDaoImpl extends AbstractDaoTmaImpl<TmtData> implements ITmtDataDao {

	/**
	 * Instantiates a new about dao impl.
	 */
	public TmtDataDaoImpl() {
		super(TmtData.class);
	}

}
