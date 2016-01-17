package com.danco.bpc.service.impl.TMA;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.danco.bpc.dao.api.TMA.ITmtDataDao;
import com.danco.bpc.entity.TMA.TmtData;
import com.danco.bpc.service.api.TMA.ITmtDataService;

	@Service
	@Transactional
	public class TmtDataServiceImpl implements ITmtDataService{
		
		@Autowired
		private ITmtDataDao TmtDataDao;

		@Override
		public Long addRecord(TmtData entity) {
			return TmtDataDao.addRecord(entity);
		}

		@Override
		public void deleteRecord(Long id) throws IOException {
			TmtDataDao.deleteRecord(id);
		}

		@Override
		public void updateRecord(TmtData entity) {
			TmtDataDao.updateRecord(entity);
		}

		@Override
		public TmtData getRecordById(Long id) {
			return TmtDataDao.getRecordById(id);
		}

		@Override
		public List<TmtData> getAll() {
			return TmtDataDao.getAll();
		}

		@Override
		public List<TmtData> getRecordsPage(Integer startPage, Integer pageSize) {
			return TmtDataDao.getRecordsPage(startPage, pageSize);
		}

		@Override
		public Integer count() {
		return TmtDataDao.count();
		}

	}

