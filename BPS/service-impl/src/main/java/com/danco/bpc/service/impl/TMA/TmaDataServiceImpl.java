package com.danco.bpc.service.impl.TMA;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.danco.bpc.dao.api.TMA.ITmaDataDao;
import com.danco.bpc.entity.TMA.TmaData;
import com.danco.bpc.service.api.TMA.ITmaDataService;

@Service
@Transactional
public class TmaDataServiceImpl implements ITmaDataService {

	@Autowired
	private ITmaDataDao TmaDataDao;

	@Override
	public Long addRecord(TmaData entity) {
		return TmaDataDao.addRecord(entity);
	}

	@Override
	public void deleteRecord(Long id) throws IOException {
		TmaDataDao.deleteRecord(id);
	}

	@Override
	public void updateRecord(TmaData entity) {
		TmaDataDao.updateRecord(entity);
	}

	@Override
	public TmaData getRecordById(Long id) {
		return TmaDataDao.getRecordById(id);
	}

	@Override
	public List<TmaData> getAll() {
		return TmaDataDao.getAll();
	}

	@Override
	public List<TmaData> getRecordsPage(Integer startPage, Integer pageSize) {
		return TmaDataDao.getRecordsPage(startPage, pageSize);
	}

	@Override
	public Integer count() {
		return TmaDataDao.count();
	}

}
