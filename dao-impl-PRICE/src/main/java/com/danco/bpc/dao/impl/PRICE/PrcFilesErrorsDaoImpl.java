package com.danco.bpc.dao.impl.PRICE;

import com.danco.bpc.dao.api.PRICE.IPrcFilesErrorsDao;
import com.danco.bpc.dao.impl.common.AbstractDaoImpl;
import com.danco.bpc.entity.PRICE.PrcFilesErrors;

public class PrcFilesErrorsDaoImpl extends AbstractDaoImpl<PrcFilesErrors> implements IPrcFilesErrorsDao {

	/**
	 * Instantiates a new about dao impl.
	 */ 
	public PrcFilesErrorsDaoImpl() {
		super(PrcFilesErrors.class);
	}
}
