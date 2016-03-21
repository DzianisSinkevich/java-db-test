package com.danco.bpc.dao.impl.common;

import java.util.List;

import javax.persistence.PersistenceException;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.hibernate.exception.ConstraintViolationException;

import com.danco.bpc.dao.api.IGenericDao;

/**
 * The Class AbstractDao.
 *
 * @param <T>
 *            the generic type
 */
public class AbstractDaoImpl<T> implements IGenericDao<T> {

	/** The Constant ID. */
	protected static final String ID = "id";

	/** The session factory. */
	protected SessionFactory sessionFactory;

	/** The clazz. */
	@SuppressWarnings("rawtypes")
	private final Class clazz;

	/**
	 * Instantiates a new abstract dao.
	 *
	 * @param clazz
	 *            the clazz
	 */
	@SuppressWarnings("rawtypes")
	public AbstractDaoImpl(Class clazz) {
		AnnotationConfiguration configuration = new AnnotationConfiguration();
		configuration.configure("hibernate_recon.cfg.xml");
		this.sessionFactory = configuration.buildSessionFactory();
		this.clazz = clazz;
	}

	/**
	 * Delete.
	 *
	 * @param record
	 *            the record
	 */
	@Override
	public void delete(T record) {
		try {
			getSession().delete(record);
		} catch (Exception e) {
			throw new PersistenceException(e);
		}
	}

	/**
	 * Update.
	 *
	 * @param record
	 *            the record
	 */
	public void update(T record) {
		try {
			getSession().update(record);
		} catch (ConstraintViolationException ex) {
			throw ex;
		} catch (Exception e) {
			throw new PersistenceException(e);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.danco.citiestalking.dao.api.IGenericDao#addRecord(java.lang.Object)
	 */
	@Override
	public Long addRecord(T entity) throws PersistenceException {
		try {
			Session session  = sessionFactory.getCurrentSession();
			Transaction txn = session.beginTransaction();
			Long  id = (Long) session.save(entity);
			txn.commit();
			return id;
		} catch (org.hibernate.HibernateException he) {
			Session session  = sessionFactory.openSession();
			Transaction txn = session.beginTransaction();
			Long  id = (Long) session.save(entity);
			txn.commit();
			return id;
		} catch (Exception e) {
			throw new PersistenceException(e);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.danco.citiestalking.dao.api.IGenericDao#deleteRecord(java.lang.Long)
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void deleteRecord(Long id) throws PersistenceException {
		try {
			T entity = (T) getSession().load(clazz, id);
			getSession().delete(entity);
		} catch (Exception e) {
			throw new PersistenceException(e);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.danco.citiestalking.dao.api.IGenericDao#updateRecord(java.lang.Object
	 * )
	 */
	@Override
	public void updateRecord(T entity) throws PersistenceException {
		try {
			sessionFactory.getCurrentSession().update(entity);
		} catch (Exception e) {
			throw new PersistenceException(e);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.danco.citiestalking.dao.api.IGenericDao#getRecordById(java.lang.Long)
	 */
	@SuppressWarnings("unchecked")
	@Override
	public T getRecordById(Long id) throws PersistenceException {
		try {
			Criteria criteria = createCriteria();
			criteria.add(Restrictions.eq(ID, id));
			return (T) criteria.uniqueResult();
		} catch (Exception e) {
			throw new PersistenceException(e);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.danco.citiestalking.dao.api.IGenericDao#getAll()
	 */
	@Override
	public List<T> getAll() throws PersistenceException {
		try {
			return queryRecordsList(createCriteria());
		} catch (Exception e) {
			throw new PersistenceException(e);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.danco.citiestalking.dao.api.IGenericDao#getRecordsPage(java.lang.
	 * Integer, java.lang.Integer)
	 */
	@Override
	public List<T> getRecordsPage(Integer startPage, Integer pageSize) throws PersistenceException {
		try {
			Criteria cr = createCriteria();
			cr.setFirstResult((startPage - 1) * pageSize);
			cr.setMaxResults(pageSize);
			return queryRecordsList(cr);
		} catch (Exception e) {
			throw new PersistenceException(e);
		}

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.danco.citiestalking.dao.api.IGenericDao#count()
	 */
	@Override
	public Integer count() {
		try {
			Long rowCount = (Long) createCriteria().setProjection(Projections.rowCount()).uniqueResult();
			return rowCount.intValue();
		} catch (Exception e) {
			throw new PersistenceException(e);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.danco.nashorn.dao.api.IGenericDao#detachObject(java.lang.Object)
	 */
	public void detachObject(T entity) {
		getSession().evict(entity);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.danco.nashorn.dao.api.IGenericDao#closeSession()
	 */
	public void closeSession() {
		getSession().close();
	}

	/**
	 * Clear session.
	 */
	public void clearSession() {
		getSession().clear();
	}

	/**
	 * Gets the session.
	 *
	 * @return the session
	 */
	@Deprecated()
	protected Session getSession() {
		
		return sessionFactory.getCurrentSession();
	}

	/**
	 * Creates the criteria.
	 *
	 * @param classForCriteria
	 *            the class for criteria
	 * @return the criteria
	 */
	protected Criteria createCriteria(Class<?>... classForCriteria) {

		Class<?> realClass = classForCriteria == null || classForCriteria.length == 0 ? clazz : classForCriteria[0];
		try {
			return this.sessionFactory.getCurrentSession().createCriteria(realClass);
		} catch (org.hibernate.HibernateException he) {
			return this.sessionFactory.openSession().createCriteria(realClass);
		}
	}

	/**
	 * Adds the eq criterion.
	 *
	 * @param criteria
	 *            the criteria
	 * @param field
	 *            the field
	 * @param value
	 *            the value
	 * @return the criteria
	 */
	protected Criteria addEqCriterion(Criteria criteria, final String field, final Object value) {

		return criteria.add(Restrictions.eq(field, value));
	}

	/**
	 * Query unique record.
	 *
	 * @param criteria
	 *            the criteria
	 * @return the t
	 */
	@SuppressWarnings("unchecked")
	protected T queryUniqueRecord(Criteria criteria) {
		T record = (T) criteria.uniqueResult();
		clearSession();
		return record;
	}

	/**
	 * Query records list.
	 *
	 * @param criteria
	 *            the criteria
	 * @return the list
	 */
	@SuppressWarnings("unchecked")
	protected List<T> queryRecordsList(Criteria criteria) {
		List<T> recordsList = (List<T>) criteria.list();
		return recordsList;
	}
}
