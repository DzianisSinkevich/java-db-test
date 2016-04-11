package com.danco.bpc.dao.api.PRICE;

import com.danco.bpc.dao.api.IGenericDao;
import com.danco.bpc.entity.PRICE.PrcFiles;

public interface IPrcFilesDao extends IGenericDao<PrcFiles> {
	public PrcFiles selectFile(String filename) throws Exception;
}
