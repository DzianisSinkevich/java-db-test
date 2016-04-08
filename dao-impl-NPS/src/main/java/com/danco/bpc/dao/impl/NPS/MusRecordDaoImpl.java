package com.danco.bpc.dao.impl.NPS;

import com.danco.bpc.dao.api.NPS.IMusRecordDao;
import com.danco.bpc.dao.impl.common.AbstractDaoNpsImpl;
import com.danco.bpc.entity.NPS.MusRecord;

public class MusRecordDaoImpl extends AbstractDaoNpsImpl<MusRecord> implements IMusRecordDao {

	/**
	 * Instantiates a new about dao impl.
	 */ 
	public MusRecordDaoImpl() {
		super(MusRecord.class);
	}
}
