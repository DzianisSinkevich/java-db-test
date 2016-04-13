package com.danco.bpc.service.impl.SERVICES;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.danco.bpc.dao.impl.PRICE.PrcMessagesDaoImpl;
import com.danco.bpc.entity.PRICE.PrcMessages;
import com.danco.bpc.service.api.PRICE.IPrcMessagesService;

@Service
@Transactional
public class PrcMessagesServiceImpl extends DataServiceImpl<PrcMessages>implements IPrcMessagesService {

	@Autowired
	private PrcMessagesDaoImpl genericDao = new PrcMessagesDaoImpl();

	@Override
	public Long sumPrcMessagesP04(Long fileId, int recordType1, int recordType2, int minPrcc, int maxPrcc) throws Exception {
		return genericDao.sumPrcMessagesP04(fileId, recordType1, recordType2, minPrcc, maxPrcc);
	}

	@Override
	public Long sumPrcMessagesP05(Long fileId, int recordType1, int recordType2, int minPrcc, int maxPrcc) throws Exception {
		return genericDao.sumPrcMessagesP05(fileId, recordType1, recordType2, minPrcc, maxPrcc);
	}

	@Override
	public Long sumPrcMessagesS74(Long fileId) throws Exception {
		return genericDao.sumPrcMessagesS74(fileId);
	}

	@Override
	public Long sumPrcMessagesS75(Long fileId) throws Exception {
		return genericDao.sumPrcMessagesS75(fileId);
	}

	public Long sumPrcMessagesS76(Long fileId) throws Exception {
		return genericDao.sumPrcMessagesS76(fileId);
	}

	@Override
	public Long sumPrcMessagesS77(Long fileId) throws Exception {
		return genericDao.sumPrcMessagesS76(fileId);
	}

	@Override
	public Long sumPrcMessagesS85(Long fileId) throws Exception {
		return genericDao.sumPrcMessagesS85(fileId);
	}

	@Override
	public Long sumPrcMessagesS105(Long fileId) throws Exception {
		return genericDao.sumPrcMessagesS105(fileId);
	}

	@Override
	public Long sumPrcMessagesS106(Long fileId) throws Exception {
		return genericDao.sumPrcMessagesS106(fileId);
	}

	@Override
	public Long sumPrcMessagesS109(Long fileId) throws Exception {
		return genericDao.sumPrcMessagesS109(fileId);
	}

	@Override
	public Long sumPrcMessagesS110(Long fileId) throws Exception {
		return genericDao.sumPrcMessagesS110(fileId);
	}

}
