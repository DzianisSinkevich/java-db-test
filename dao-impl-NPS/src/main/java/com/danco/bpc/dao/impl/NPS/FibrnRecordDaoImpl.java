package com.danco.bpc.dao.impl.NPS;

import com.danco.bpc.dao.api.NPS.IFibrnRecordDao;
import com.danco.bpc.dao.impl.common.AbstractDaoNpsImpl;
import com.danco.bpc.entity.NPS.FibrnRecord;

public class FibrnRecordDaoImpl extends AbstractDaoNpsImpl<FibrnRecord> implements IFibrnRecordDao {

	/**
	 * Instantiates a new about dao impl.
	 */ 
	public FibrnRecordDaoImpl() {
		super(FibrnRecord.class);
	}
}
