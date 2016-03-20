package com.danco.bpc.dao.impl.PRICE;

import com.danco.bpc.dao.api.PRICE.IPrcFilesDao;
import com.danco.bpc.dao.impl.common.AbstractDaoImpl;
import com.danco.bpc.entity.PRICE.PrcFiles;

public class PrcFilesDaoImpl extends AbstractDaoImpl<PrcFiles> implements IPrcFilesDao {

	/**
	 * Instantiates a new about dao impl.
	 */ 
	public PrcFilesDaoImpl() {
		super(PrcFiles.class);
	}
}
