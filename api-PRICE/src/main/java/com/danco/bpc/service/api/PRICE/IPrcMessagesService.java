package com.danco.bpc.service.api.PRICE;

import com.danco.bpc.entity.PRICE.PrcMessages;
import com.danco.bpc.service.api.IGenericService;

public interface IPrcMessagesService extends IGenericService<PrcMessages>{

	public Long sumPrcMessagesP04(Long fileId) throws Exception;

	public Long sumPrcMessagesP05() throws Exception;

	public Long sumPrcMessagesP76() throws Exception;
}
