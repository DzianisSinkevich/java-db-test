package com.danco.bpc.service.api;

import java.io.IOException;
import java.util.List;

/**
 * The Interface IGenericService.
 *
 * @param <T> the generic type
 */
public interface IGenericService<T extends Object> {
	
	/**
	 * Adds the record.a
	 *
	 * @param entity the entity
	 * @return the integer
	 */
	public Long addRecord(T entity);
	
	/**
	 * Delete record.
	 *
	 * @param id the id
	 * @throws IOException 
	 */
	public void deleteRecord(Long id) throws IOException;
	
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
}
