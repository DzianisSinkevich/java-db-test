package com.danco.bpc.dao.impl.NPS;

import com.danco.bpc.dao.api.NPS.IFibrnBatchDao;
import com.danco.bpc.dao.impl.common.AbstractDaoNpsImpl;
import com.danco.bpc.entity.NPS.FibrnBatch;

public class FibrnBatchDaoImpl extends AbstractDaoNpsImpl<FibrnBatch> implements IFibrnBatchDao {

	/**
	 * Instantiates a new about dao impl.
	 */ 
	public FibrnBatchDaoImpl() {
		super(FibrnBatch.class);
	}
}
