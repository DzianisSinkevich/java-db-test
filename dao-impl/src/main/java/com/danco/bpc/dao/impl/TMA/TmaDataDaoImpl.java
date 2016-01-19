package com.danco.bpc.dao.impl.TMA;

import org.springframework.stereotype.Repository;

import com.danco.bpc.dao.api.TMA.ITmaDataDao;
import com.danco.bpc.dao.impl.common.AbstractDaoImpl;
import com.danco.bpc.entity.TMA.TmaData;

@Repository
public class TmaDataDaoImpl extends AbstractDaoImpl<TmaData> implements ITmaDataDao {

	/**
	 * Instantiates a new about dao impl.
	 */
	public TmaDataDaoImpl() {
		super(TmaData.class);
	}

}
