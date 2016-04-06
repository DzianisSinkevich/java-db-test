package com.danco.bpc.service.impl.SERVICES;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.danco.bpc.dao.api.IGenericDao;
import com.danco.bpc.service.api.IGenericService;

@Service
@Transactional
public class DataServiceImpl<T extends Object> implements IGenericService<T> {

	@Autowired
	private IGenericDao<T> genericDao;

	@Override
	public Long addRecord(T entity) {
		return genericDao.addRecord(entity);
	}

	@Override
	public void deleteRecord(Long id) throws IOException {

	}

	@Override
	public void updateRecord(T entity) {

	}

	@Override
	public T getRecordById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<T> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<T> getRecordsPage(Integer startPage, Integer pageSize) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer count() {
		// TODO Auto-generated method stub
		return null;
	}

}
