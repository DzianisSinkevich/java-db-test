package com.danco.bpc.dao.impl.NPS;

import com.danco.bpc.dao.api.NPS.IBatchFileDao;
import com.danco.bpc.dao.impl.common.AbstractDaoNpsImpl;
import com.danco.bpc.entity.NPS.BatchFile;

public class BatchFileDaoImpl extends AbstractDaoNpsImpl<BatchFile> implements IBatchFileDao {

	/**
	 * Instantiates a new about dao impl.
	 */ 
	public BatchFileDaoImpl() {
		super(BatchFile.class);
	}
}
