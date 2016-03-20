package com.danco.bpc.dao.impl.PRICE;

import com.danco.bpc.dao.api.PRICE.IPrcMessagesErrorsDao;
import com.danco.bpc.dao.impl.common.AbstractDaoImpl;
import com.danco.bpc.entity.PRICE.PrcMessagesErrors;

public class PrcMessagesErrorsDaoImpl extends AbstractDaoImpl<PrcMessagesErrors> implements IPrcMessagesErrorsDao {

	/**
	 * Instantiates a new about dao impl.
	 */ 
	public PrcMessagesErrorsDaoImpl() {
		super(PrcMessagesErrors.class);
	}
}
