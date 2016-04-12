package com.danco.bpc.dao.api.PRICE;

import com.danco.bpc.dao.api.IGenericDao;
import com.danco.bpc.entity.PRICE.PrcMessages;

public interface IPrcMessagesDao extends IGenericDao<PrcMessages> {

	public Long sumPrcMessagesP04(Long fileId) throws Exception;

	public Long sumPrcMessagesP05() throws Exception;

	public Long sumPrcMessagesP76() throws Exception;
}
