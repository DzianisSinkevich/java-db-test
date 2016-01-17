package com.danco.bpc.service.impl.TMA;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.danco.bpc.dao.api.TMA.ITmtSessionMessageDao;
import com.danco.bpc.entity.TMA.TmtSessionMessage;
import com.danco.bpc.service.api.TMA.ITmtSessionMessageService;

	@Service
	@Transactional
	public class TmtSessionMessageServiceImpl implements ITmtSessionMessageService{
		
		@Autowired
		private ITmtSessionMessageDao TmtSessionMessageDao;

		@Override
		public Long addRecord(TmtSessionMessage entity) {
			return TmtSessionMessageDao.addRecord(entity);
		}

		@Override
		public void deleteRecord(Long id) throws IOException {
			TmtSessionMessageDao.deleteRecord(id);
		}

		@Override
		public void updateRecord(TmtSessionMessage entity) {
			TmtSessionMessageDao.updateRecord(entity);
		}

		@Override
		public TmtSessionMessage getRecordById(Long id) {
			return TmtSessionMessageDao.getRecordById(id);
		}

		@Override
		public List<TmtSessionMessage> getAll() {
			return TmtSessionMessageDao.getAll();
		}

		@Override
		public List<TmtSessionMessage> getRecordsPage(Integer startPage, Integer pageSize) {
			return TmtSessionMessageDao.getRecordsPage(startPage, pageSize);
		}

		@Override
		public Integer count() {
		return TmtSessionMessageDao.count();
		}

	}

