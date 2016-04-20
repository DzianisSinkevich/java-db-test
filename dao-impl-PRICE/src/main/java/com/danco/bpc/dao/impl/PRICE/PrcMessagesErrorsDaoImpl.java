package com.danco.bpc.dao.impl.PRICE;

import java.util.ArrayList;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.danco.bpc.dao.api.PRICE.IPrcMessagesErrorsDao;
import com.danco.bpc.dao.impl.common.AbstractDaoPriceImpl;
import com.danco.bpc.entity.PRICE.PrcMessagesErrors;

public class PrcMessagesErrorsDaoImpl extends AbstractDaoPriceImpl<PrcMessagesErrors>implements IPrcMessagesErrorsDao {

	/**
	 * Instantiates a new about dao impl.
	 */
	public PrcMessagesErrorsDaoImpl() {
		super(PrcMessagesErrors.class);
	}

	@Override
	public ArrayList<PrcMessagesErrors> getErrors(Long id) throws Exception {
		Transaction txn = null;
		try {
			Session session = sessionFactory.getCurrentSession();
			txn = session.beginTransaction();
			String hql = "from PrcMessagesErrors e where e.msgId = :id";
			Query query = session.createQuery(hql);
			query.setLong("id", id);
			ArrayList<PrcMessagesErrors> records = (ArrayList<PrcMessagesErrors>) query.list();
			System.out.println("" + records.size());
			txn.commit();
			return records;
		} catch (HibernateException e) {
			if (null != txn) {
				txn.rollback();
			}
			e.printStackTrace();
			throw new Exception("ERROR");
		}
	}
}
