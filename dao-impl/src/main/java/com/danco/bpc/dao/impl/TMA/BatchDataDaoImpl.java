package com.danco.bpc.dao.impl.TMA;

import org.springframework.stereotype.Repository;

import com.danco.bpc.dao.api.TMA.IBatchDataDao;
import com.danco.bpc.dao.impl.common.AbstractDaoTmaImpl;
import com.danco.bpc.entity.TMA.BatchData;

@Repository
public class BatchDataDaoImpl extends AbstractDaoTmaImpl<BatchData> implements IBatchDataDao {

	/**
	 * Instantiates a new about dao impl.
	 */
	public BatchDataDaoImpl() {
		super(BatchData.class);
	}

}