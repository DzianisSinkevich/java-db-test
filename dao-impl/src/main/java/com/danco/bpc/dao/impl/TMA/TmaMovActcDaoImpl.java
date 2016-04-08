package com.danco.bpc.dao.impl.TMA;

import org.springframework.stereotype.Repository;

import com.danco.bpc.dao.api.TMA.ITmaMovActcDao;
import com.danco.bpc.dao.impl.common.AbstractDaoTmaImpl;
import com.danco.bpc.entity.TMA.TmaMovActc;

@Repository
public class TmaMovActcDaoImpl extends AbstractDaoTmaImpl<TmaMovActc> implements ITmaMovActcDao {

	/**
	 * Instantiates a new about dao impl.
	 */
	public TmaMovActcDaoImpl() {
		super(TmaMovActc.class);
	}

}
