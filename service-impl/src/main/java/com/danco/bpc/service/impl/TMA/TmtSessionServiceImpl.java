package com.danco.bpc.service.impl.TMA;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.danco.bpc.dao.api.TMA.IBatchDataDao;
import com.danco.bpc.entity.TMA.BatchData;
import com.danco.bpc.service.api.TMA.IBatchDataService;

@Service
@Transactional
public class TmtSessionServiceImpl implements IBatchDataService {

	@Autowired
	private IBatchDataDao batchDataDao;

	@Override
	public Long addRecord(BatchData entity) {
		return batchDataDao.addRecord(entity);
	}

	@Override
	public void deleteRecord(Long id) throws IOException {
		batchDataDao.deleteRecord(id);
	}

	@Override
	public void updateRecord(BatchData entity) {
		batchDataDao.updateRecord(entity);
	}

	@Override
	public BatchData getRecordById(Long id) {
		return batchDataDao.getRecordById(id);
	}

	@Override
	public List<BatchData> getAll() {
		return batchDataDao.getAll();
	}

	@Override
	public List<BatchData> getRecordsPage(Integer startPage, Integer pageSize) {
		return batchDataDao.getRecordsPage(startPage, pageSize);
	}

	@Override
	public Integer count() {
		return batchDataDao.count();
	}

}
