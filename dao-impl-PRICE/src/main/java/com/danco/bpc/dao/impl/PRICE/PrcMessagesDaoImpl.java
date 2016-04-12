package com.danco.bpc.dao.impl.PRICE;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.danco.bpc.dao.api.PRICE.IPrcMessagesDao;
import com.danco.bpc.dao.impl.common.AbstractDaoPriceImpl;
import com.danco.bpc.entity.PRICE.PrcMessages;

public class PrcMessagesDaoImpl extends AbstractDaoPriceImpl<PrcMessages> implements IPrcMessagesDao {

	/**
	 * Instantiates a new about dao impl.
	 */ 
	public PrcMessagesDaoImpl() {
		super(PrcMessages.class);
	}
	
	@Override
	public Long sumPrcMessagesP04(Long fileId) throws Exception {
		Transaction txn = null;
		try {
			Session session = sessionFactory.getCurrentSession();
			txn = session.beginTransaction();
			String hql = "select SUM(P04) from PrcMessages m, PrcRawMessages r where m.id=r.id and r.fileId = :fId and r.type = 1240";
			Query query = session.createQuery(hql);
			query.setLong("fId", fileId);
			Long sumP4 = (Long) query.uniqueResult();
			txn.commit();
			System.out.println("SumP4 = " + sumP4);
			return sumP4;
		} catch (HibernateException e) {
			if (null != txn) {
				txn.rollback();
			}
			e.printStackTrace();
			throw new Exception("ERROR");
		}
	}

	@Override
	public Long sumPrcMessagesP05() throws Exception {
		return null;
	}

	@Override
	public Long sumPrcMessagesP76() throws Exception {
		return null;
	}

}
