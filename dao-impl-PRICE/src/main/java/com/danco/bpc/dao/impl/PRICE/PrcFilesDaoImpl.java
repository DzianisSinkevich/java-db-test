package com.danco.bpc.dao.impl.PRICE;

import com.danco.bpc.dao.api.PRICE.IPrcFilesDao;
import com.danco.bpc.dao.impl.common.AbstractDaoPriceImpl;
import com.danco.bpc.entity.PRICE.PrcFiles;

public class PrcFilesDaoImpl extends AbstractDaoPriceImpl<PrcFiles> implements IPrcFilesDao {

	/**
	 * Instantiates a new about dao impl.
	 */ 
	public PrcFilesDaoImpl() {
		super(PrcFiles.class);
	}
}
