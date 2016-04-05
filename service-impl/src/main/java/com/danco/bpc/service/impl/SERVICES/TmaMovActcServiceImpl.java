package com.danco.bpc.service.impl.SERVICES;

import java.io.IOException;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.danco.bpc.dao.api.TMA.ITmaMovActcDao;
import com.danco.bpc.dao.impl.TMA.TmaMovActcDaoImpl;
import com.danco.bpc.entity.TMA.TmaMovActc;
import com.danco.bpc.service.api.TMA.ITmaMovActcService;

	@Service
	@Transactional
	public class TmaMovActcServiceImpl implements ITmaMovActcService{
		
		private ITmaMovActcDao TmaMovActcDao = new TmaMovActcDaoImpl() ;

		@Override
		public Long addRecord(TmaMovActc entity) {
			return TmaMovActcDao.addRecord(entity);
		}

		@Override
		public void deleteRecord(Long id) throws IOException {
			TmaMovActcDao.deleteRecord(id);
		}

		@Override
		public void updateRecord(TmaMovActc entity) {
			TmaMovActcDao.updateRecord(entity);
		}

		@Override
		public TmaMovActc getRecordById(Long id) {
			return TmaMovActcDao.getRecordById(id);
		}

		@Override
		public List<TmaMovActc> getAll() {
			return TmaMovActcDao.getAll();
		}

		@Override
		public List<TmaMovActc> getRecordsPage(Integer startPage, Integer pageSize) {
			return TmaMovActcDao.getRecordsPage(startPage, pageSize);
		}

		@Override
		public Integer count() {
		return TmaMovActcDao.count();
		}

		@Override
		public TmaMovActc copyTmaMovActc() {
			TmaMovActc tmaMovActc = this.getRecordsPage(1, 1).get(0);
			tmaMovActc.setCmaqnmov(tmaMovActc.getCmaqnmov()+1);
			tmaMovActc.setSvInternalId(null);
			return tmaMovActc;
		}

	}

