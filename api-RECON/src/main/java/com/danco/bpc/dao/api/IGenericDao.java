package com.danco.bpc.dao.api;

import java.util.List;

public interface IGenericDao<T extends Object> {
	/**
	 * Adds the record.
	 *
	 * @param entity the entity
	 * @return the integer
	 */
	public Long addRecord(T entity);
	
	/**
	 * Delete record.
	 *
	 * @param id the id
	 */
	public void deleteRecord(Long id);
	
	public void delete(T entity);
	
	/**
	 * Update record.
	 *
	 * @param entity the entity
	 */
	public void updateRecord(T entity);
	
	/**
	 * Gets the record by id.
	 *
	 * @param id the id
	 * @return the record by id
	 */
	public T getRecordById(Long id);
	
	/**
	 * Gets the all.
	 *
	 * @return the all
	 */
	public List<T> getAll();
	/**
	 * Gets the records page.
	 *
	 * @param startPage the start page
	 * @param pageSize the page size
	 * @return the records page
	 */
	public List<T> getRecordsPage(Integer startPage, Integer pageSize);

	/**
	 * Count.
	 *
	 * @return the integer
	 */
	public Integer count();	
	
	/**
	 * @param entity
	 */
	public void detachObject(T entity);
	
	/**
	 * 
	 */
	public void closeSession();
}
