package com.danco.bpc.dao.impl.PRICE;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import com.danco.bpc.dao.api.PRICE.IPrcRawMessagesDao;
import com.danco.bpc.dao.impl.common.AbstractDaoPriceImpl;
import com.danco.bpc.entity.PRICE.PrcRawMessages;

public class PrcRawMessagesDaoImpl extends AbstractDaoPriceImpl<PrcRawMessages>implements IPrcRawMessagesDao {

	/**
	 * Instantiates a new about dao impl.
	 */
	public PrcRawMessagesDaoImpl() {
		super(PrcRawMessages.class);
	}

	@Override
	public Long countRowsForSendToSv() throws Exception {
		Long countRows;
		Transaction txn = null;
		try {
			Session session = sessionFactory.getCurrentSession();
			txn = session.beginTransaction();
			countRows = (Long) session.createCriteria(PrcRawMessages.class).setProjection(Projections.rowCount()).add(Restrictions.eq("status", "MSST0003"))
					.add(Restrictions.eq("sendCount", 0)).uniqueResult();
			txn.commit();
			return countRows;
		} catch (HibernateException e) {
			if (null != txn) {
				txn.rollback();
			}
			e.printStackTrace();
			throw new Exception("ERROR");
		}
	}
}
