package com.danco.bpc.service.impl.SERVICES;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.danco.bpc.dao.impl.PRICE.PrcFilesDaoImpl;
import com.danco.bpc.entity.PRICE.PrcFiles;
import com.danco.bpc.service.api.PRICE.IPrcFilesService;

@Service
@Transactional
public class PrcFilesServiceImpl extends DataServiceImpl<PrcFiles>implements IPrcFilesService {

	@Autowired
	private PrcFilesDaoImpl genericDao = new PrcFilesDaoImpl();

	@Override
	public PrcFiles selectFile(String filename) throws Exception {
		return genericDao.selectFile(filename);
	}
}
