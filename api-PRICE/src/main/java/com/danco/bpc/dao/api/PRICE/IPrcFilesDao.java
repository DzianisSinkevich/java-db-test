package com.danco.bpc.dao.api.PRICE;

import java.util.ArrayList;

import com.danco.bpc.dao.api.IGenericDao;
import com.danco.bpc.entity.PRICE.PrcFiles;

public interface IPrcFilesDao extends IGenericDao<PrcFiles> {
	public PrcFiles selectFile(String filename) throws Exception;
	
	public ArrayList<PrcFiles> listIncomingFiles() throws Exception;
}
