package com.danco.bpc.dao.impl.PRICE;

import com.danco.bpc.dao.api.PRICE.IPrcTfTotalDao;
import com.danco.bpc.dao.impl.common.AbstractDaoImpl;
import com.danco.bpc.entity.PRICE.PrcTfTotal;

public class PrcTfTotalDaoImpl extends AbstractDaoImpl<PrcTfTotal> implements IPrcTfTotalDao {

	/**
	 * Instantiates a new about dao impl.
	 */ 
	public PrcTfTotalDaoImpl() {
		super(PrcTfTotal.class);
	}
}
