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
			String hql = "select SUM(m.p04) from PrcMessages m, PrcRawMessages r where m.id=r.id and r.fileId = :fId and r.type = '1240'";
			Query query = session.createQuery(hql);
			query.setLong("fId", fileId);
			Long sumP04 = (Long) query.uniqueResult();
			txn.commit();
			System.out.println("SumP04 = " + sumP04);
			return sumP04;
		} catch (HibernateException e) {
			if (null != txn) {
				txn.rollback();
			}
			e.printStackTrace();
			throw new Exception("ERROR");
		}
	}

	@Override
	public Long sumPrcMessagesP05(Long fileId) throws Exception {
		Transaction txn = null;
		try {
			Session session = sessionFactory.getCurrentSession();
			txn = session.beginTransaction();
			String hql = "select SUM(m.p05) from PrcMessages m, PrcRawMessages r where m.id=r.id and r.fileId = :fId and r.type = '1240'";
			Query query = session.createQuery(hql);
			query.setLong("fId", fileId);
			Long sumP05 = (Long) query.uniqueResult();
			txn.commit();
			System.out.println("SumP05 = " + sumP05);
			return sumP05;
		} catch (HibernateException e) {
			if (null != txn) {
				txn.rollback();
			}
			e.printStackTrace();
			throw new Exception("ERROR");
		}
	}

	@Override
	public Long sumPrcMessagesS74(Long fileId) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Long sumPrcMessagesS75(Long fileId) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public Long sumPrcMessagesS76(Long fileId) throws Exception {
		Transaction txn = null;
		try {
			Session session = sessionFactory.getCurrentSession();
			txn = session.beginTransaction();
			String hql = "select count(*) from PrcMessages m, PrcRawMessages r where m.id=r.id and r.fileId = :fId and (r.type = 1240 or r.type = 1244) and (m.p03>=0 and m.p03<=190000)";
			Query query = session.createQuery(hql);
			query.setLong("fId", fileId);
			Long sumS76 = (Long) query.uniqueResult();
			txn.commit();
			System.out.println("SumS76 = " + sumS76);
			return sumS76;
		} catch (HibernateException e) {
			if (null != txn) {
				txn.rollback();
			}
			e.printStackTrace();
			throw new Exception("ERROR");
		}
	}

	@Override
	public Long sumPrcMessagesS77(Long fileId) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Long sumPrcMessagesS85(Long fileId) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Long sumPrcMessagesS105(Long fileId) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Long sumPrcMessagesS106(Long fileId) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Long sumPrcMessagesS109(Long fileId) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Long sumPrcMessagesS110(Long fileId) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
