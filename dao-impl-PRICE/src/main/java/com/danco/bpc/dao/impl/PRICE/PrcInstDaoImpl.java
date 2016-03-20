package com.danco.bpc.dao.impl.PRICE;

import com.danco.bpc.dao.api.PRICE.IPrcInstDao;
import com.danco.bpc.dao.impl.common.AbstractDaoImpl;
import com.danco.bpc.entity.PRICE.PrcInst;

public class PrcInstDaoImpl extends AbstractDaoImpl<PrcInst> implements IPrcInstDao {

	/**
	 * Instantiates a new about dao impl.
	 */ 
	public PrcInstDaoImpl() {
		super(PrcInst.class);
	}
}
