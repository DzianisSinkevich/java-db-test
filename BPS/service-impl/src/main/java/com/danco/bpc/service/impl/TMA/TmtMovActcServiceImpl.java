package com.danco.bpc.service.impl.TMA;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.danco.bpc.dao.api.TMA.ITmtMovActcDao;
import com.danco.bpc.entity.TMA.TmtMovActc;
import com.danco.bpc.service.api.TMA.ITmtMovActcService;

	@Service
	@Transactional
	public class TmtMovActcServiceImpl implements ITmtMovActcService{
		
		@Autowired
		private ITmtMovActcDao TmtMovActcDao;

		@Override
		public Long addRecord(TmtMovActc entity) {
			return TmtMovActcDao.addRecord(entity);
		}

		@Override
		public void deleteRecord(Long id) throws IOException {
			TmtMovActcDao.deleteRecord(id);
		}

		@Override
		public void updateRecord(TmtMovActc entity) {
			TmtMovActcDao.updateRecord(entity);
		}

		@Override
		public TmtMovActc getRecordById(Long id) {
			return TmtMovActcDao.getRecordById(id);
		}

		@Override
		public List<TmtMovActc> getAll() {
			return TmtMovActcDao.getAll();
		}

		@Override
		public List<TmtMovActc> getRecordsPage(Integer startPage, Integer pageSize) {
			return TmtMovActcDao.getRecordsPage(startPage, pageSize);
		}

		@Override
		public Integer count() {
		return TmtMovActcDao.count();
		}

	}

