package com.danco.bpc.dao.api.PRICE;

import java.util.ArrayList;

import com.danco.bpc.dao.api.IGenericDao;
import com.danco.bpc.entity.PRICE.PrcMessagesErrors;

public interface IPrcMessagesErrorsDao extends IGenericDao<PrcMessagesErrors> {
	public ArrayList<PrcMessagesErrors> getErrors(Long id) throws Exception;
}
