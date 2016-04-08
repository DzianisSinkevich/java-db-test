package com.danco.bpc.dao.impl.MAIN;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import com.danco.bpc.dao.api.MAIN.IPrcSessionDao;
import com.danco.bpc.dao.impl.common.AbstractDaoImpl;
import com.danco.bpc.entity.MAIN.PrcSession;

public class PrcSessionDaoImpl extends AbstractDaoImpl<PrcSession>implements IPrcSessionDao {

	/**
	 * Instantiates a new about dao impl.
	 */
	public PrcSessionDaoImpl() {
		super(PrcSession.class);
	}

	@Override
	public PrcSession selectSession(String sessionId) throws Exception {
		Transaction txn = null;
		try {
			Session session = sessionFactory.getCurrentSession();
			txn = session.beginTransaction();
			// Query q = session.createQuery("from PrcSession where parentId = :parentId");
			// q.setString(Integer.parseInt(sessionId), "parentId");
			// PrcSession prcSession = (PrcSession) q.uniqueResult();
			Criteria criteria = session.createCriteria(PrcSession.class);
			criteria.add(Restrictions.eq("parentId", Long.valueOf(sessionId)));
			PrcSession prcSession = (PrcSession) criteria.uniqueResult();
			txn.commit();
			return prcSession;
		} catch (HibernateException e) {
			if (null != txn) {
				txn.rollback();
			}
			e.printStackTrace();
			throw new Exception("ERROR");
		}
	}
}
