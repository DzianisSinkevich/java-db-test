package com.danco.bpc.service.api.PRICE;

import java.util.ArrayList;

import com.danco.bpc.entity.PRICE.PrcFiles;
import com.danco.bpc.service.api.IGenericService;

public interface IPrcFilesService extends IGenericService<PrcFiles>{
	public PrcFiles selectFile(String filename) throws Exception;
	
	public ArrayList<PrcFiles> listIncomingFiles() throws Exception;
}
