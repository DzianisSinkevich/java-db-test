package com.danco.bpc.dao.impl.NPS;

import com.danco.bpc.dao.api.NPS.IBatchFileDao;
import com.danco.bpc.dao.impl.common.AbstractDaoImpl;
import com.danco.bpc.entity.NPS.BatchFile;

public class BatchFileDaoImpl extends AbstractDaoImpl<BatchFile> implements IBatchFileDao {

	/**
	 * Instantiates a new about dao impl.
	 */ 
	public BatchFileDaoImpl() {
		super(BatchFile.class);
	}
}
