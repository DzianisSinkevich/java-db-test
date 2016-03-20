package com.danco.bpc.dao.impl.PRICE;

import com.danco.bpc.dao.api.PRICE.IPrcRawMessagesDao;
import com.danco.bpc.dao.impl.common.AbstractDaoImpl;
import com.danco.bpc.entity.PRICE.PrcRawMessages;

public class PrcRawMessagesDaoImpl extends AbstractDaoImpl<PrcRawMessages> implements IPrcRawMessagesDao {

	/**
	 * Instantiates a new about dao impl.
	 */ 
	public PrcRawMessagesDaoImpl() {
		super(PrcRawMessages.class);
	}
}
