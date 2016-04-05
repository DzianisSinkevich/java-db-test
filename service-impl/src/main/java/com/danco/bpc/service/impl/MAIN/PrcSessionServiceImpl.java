package com.danco.bpc.service.impl.MAIN;

import java.io.IOException;
import java.util.List;

import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.danco.bpc.dao.api.MAIN.IPrcSessionDao;
import com.danco.bpc.entity.MAIN.PrcSession;
import com.danco.bpc.service.api.MAIN.IPrcSessionService;


@Service
@Transactional
public class PrcSessionServiceImpl implements IPrcSessionService{
	
	@Autowired
	private IPrcSessionDao prcSessionDao;

	@Override
	public Long addRecord(PrcSession entity) {
		return prcSessionDao.addRecord(entity);
	}

	@Override
	public void deleteRecord(Long id) throws IOException {
		prcSessionDao.deleteRecord(id);
	}

	@Override
	public void updateRecord(PrcSession entity) {
		prcSessionDao.updateRecord(entity);
	}

	@Override
	public PrcSession getRecordById(Long id) {
		return prcSessionDao.getRecordById(id);
	}

	@Override
	public List<PrcSession> getAll() {
		return prcSessionDao.getAll();
	}

	@Override
	public List<PrcSession> getRecordsPage(Integer startPage, Integer pageSize) {
		return prcSessionDao.getRecordsPage(startPage, pageSize);
	}

	@Override
	public Integer count() {
		return prcSessionDao.count();
	}

	@Override
	 public String getUserByLogin(String login) {
		String result = null;
	  try {
	   result = (String) sessionFactory.getCurrentSession()
	     .createCriteria(String.class)
	     .add(Restrictions.eq(LOGIN, login))
	     .uniqueResult();
	  } catch (Exception e) {
	   log.error(e);
	  }
	  return result;
	 }
}
