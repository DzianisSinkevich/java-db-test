package com.danco.bpc.dao.impl.NPS;

import com.danco.bpc.dao.api.NPS.IMusBatchDao;
import com.danco.bpc.dao.impl.common.AbstractDaoNpsImpl;
import com.danco.bpc.entity.NPS.MusBatch;

public class MusBatchDaoImpl extends AbstractDaoNpsImpl<MusBatch> implements IMusBatchDao {

	/**
	 * Instantiates a new about dao impl.
	 */ 
	public MusBatchDaoImpl() {
		super(MusBatch.class);
	}
}
