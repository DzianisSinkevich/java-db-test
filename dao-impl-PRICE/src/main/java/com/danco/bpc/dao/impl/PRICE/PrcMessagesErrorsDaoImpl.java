package com.danco.bpc.dao.impl.PRICE;

import com.danco.bpc.dao.api.PRICE.IPrcMessagesErrorsDao;
import com.danco.bpc.dao.impl.common.AbstractDaoPriceImpl;
import com.danco.bpc.entity.PRICE.PrcMessagesErrors;

public class PrcMessagesErrorsDaoImpl extends AbstractDaoPriceImpl<PrcMessagesErrors> implements IPrcMessagesErrorsDao {

	/**
	 * Instantiates a new about dao impl.
	 */ 
	public PrcMessagesErrorsDaoImpl() {
		super(PrcMessagesErrors.class);
	}
}
