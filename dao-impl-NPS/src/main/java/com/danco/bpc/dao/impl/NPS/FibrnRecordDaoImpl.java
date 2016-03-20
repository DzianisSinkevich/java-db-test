package com.danco.bpc.dao.impl.NPS;

import com.danco.bpc.dao.api.NPS.IFibrnRecordDao;
import com.danco.bpc.dao.impl.common.AbstractDaoImpl;
import com.danco.bpc.entity.NPS.FibrnRecord;

public class FibrnRecordDaoImpl extends AbstractDaoImpl<FibrnRecord> implements IFibrnRecordDao {

	/**
	 * Instantiates a new about dao impl.
	 */ 
	public FibrnRecordDaoImpl() {
		super(FibrnRecord.class);
	}
}
