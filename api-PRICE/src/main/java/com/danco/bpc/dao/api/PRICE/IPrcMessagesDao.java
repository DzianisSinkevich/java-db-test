package com.danco.bpc.dao.api.PRICE;

import com.danco.bpc.dao.api.IGenericDao;
import com.danco.bpc.entity.PRICE.PrcMessages;

public interface IPrcMessagesDao extends IGenericDao<PrcMessages> {

	public Long sumPrcMessagesP04(Long fileId) throws Exception;

	public Long sumPrcMessagesP05(Long fileId) throws Exception;
	
	public Long sumPrcMessagesS74(Long fileId) throws Exception;
	
	public Long sumPrcMessagesS75(Long fileId) throws Exception;

	public Long sumPrcMessagesS76(Long fileId) throws Exception;
	
	public Long sumPrcMessagesS77(Long fileId) throws Exception;
	
	public Long sumPrcMessagesS85(Long fileId) throws Exception;
	
	public Long sumPrcMessagesS105(Long fileId) throws Exception;
	
	public Long sumPrcMessagesS106(Long fileId) throws Exception;
	
	public Long sumPrcMessagesS109(Long fileId) throws Exception;
	
	public Long sumPrcMessagesS110(Long fileId) throws Exception;
}
