package com.danco.bpc.service.api.PRICE;

import java.util.ArrayList;

import com.danco.bpc.entity.PRICE.PrcMessagesErrors;
import com.danco.bpc.service.api.IGenericService;

public interface IPrcMessagesErrorsService extends IGenericService<PrcMessagesErrors> {
	public ArrayList<PrcMessagesErrors> getErrors(Long id) throws Exception;
}
