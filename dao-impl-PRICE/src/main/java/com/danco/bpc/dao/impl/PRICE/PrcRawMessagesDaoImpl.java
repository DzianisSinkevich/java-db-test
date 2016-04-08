package com.danco.bpc.dao.impl.PRICE;

import com.danco.bpc.dao.api.PRICE.IPrcRawMessagesDao;
import com.danco.bpc.dao.impl.common.AbstractDaoPriceImpl;
import com.danco.bpc.entity.PRICE.PrcRawMessages;

public class PrcRawMessagesDaoImpl extends AbstractDaoPriceImpl<PrcRawMessages> implements IPrcRawMessagesDao {

	/**
	 * Instantiates a new about dao impl.
	 */ 
	public PrcRawMessagesDaoImpl() {
		super(PrcRawMessages.class);
	}
}
