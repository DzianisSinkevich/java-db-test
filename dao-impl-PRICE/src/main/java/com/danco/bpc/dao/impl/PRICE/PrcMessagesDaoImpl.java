package com.danco.bpc.dao.impl.PRICE;

import com.danco.bpc.dao.api.PRICE.IPrcMessagesDao;
import com.danco.bpc.dao.impl.common.AbstractDaoImpl;
import com.danco.bpc.entity.PRICE.PrcMessages;

public class PrcMessagesDaoImpl extends AbstractDaoImpl<PrcMessages> implements IPrcMessagesDao {

	/**
	 * Instantiates a new about dao impl.
	 */ 
	public PrcMessagesDaoImpl() {
		super(PrcMessages.class);
	}
}
