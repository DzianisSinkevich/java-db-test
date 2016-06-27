package com.danco.bpc.dao.impl.PRICE;

import java.util.ArrayList;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.danco.bpc.dao.api.PRICE.IPrcMessagesDao;
import com.danco.bpc.dao.impl.common.AbstractDaoPriceImpl;
import com.danco.bpc.entity.PRICE.PrcMessages;

public class PrcMessagesDaoImpl extends AbstractDaoPriceImpl<PrcMessages> implements IPrcMessagesDao {

	private static final Logger logger = LogManager.getLogger("");

	public PrcMessagesDaoImpl() {
		super(PrcMessages.class);
	}

	@Override
	public Long sumPrcMessagesP04(Long fileId, int recordType1, String p56RT1, int recordType2, String p56RT2,
			int minPrcc, int maxPrcc) throws Exception {
		Transaction txn = null;
		try {
			Session session = sessionFactory.getCurrentSession();
			txn = session.beginTransaction();
			String hql = "select SUM(m.p04) from PrcMessages m, PrcRawMessages r where m.id=r.id and r.fileId = :fId and (r.type = :rType1 and (m.p03>=:minPrcc and m.p03<=:maxPrcc) and m.p56 like '"
					+ p56RT1
					+ "%')or r.type = :rType2 and (m.p03>=:minPrcc and m.p03<=:maxPrcc) and m.p56 like '"
					+ p56RT2 + "%') ";
			Query query = session.createQuery(hql);
			query.setLong("fId", fileId);
			query.setInteger("rType1", recordType1);
			query.setInteger("rType2", recordType2);
			query.setInteger("minPrcc", minPrcc);
			query.setInteger("maxPrcc", maxPrcc);
			Long sumP04 = (Long) query.uniqueResult();
			txn.commit();
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
	public Long sumPrcMessagesP05(Long fileId, int recordType1, String p56RT1, int recordType2, String p56RT2,
			int minPrcc, int maxPrcc) throws Exception {
		Transaction txn = null;
		try {
			Session session = sessionFactory.getCurrentSession();
			txn = session.beginTransaction();
			String hql = "select SUM(m.p05) from PrcMessages m, PrcRawMessages r where m.id=r.id and r.fileId = :fId and (r.type = :rType1 and (m.p03>=:minPrcc and m.p03<=:maxPrcc) and m.p56 like '"
					+ p56RT1
					+ "%')or r.type = :rType2 and (m.p03>=:minPrcc and m.p03<=:maxPrcc) and m.p56 like '"
					+ p56RT2 + "%') ";
			Query query = session.createQuery(hql);
			query.setLong("fId", fileId);
			query.setInteger("rType1", recordType1);
			query.setInteger("rType2", recordType2);
			query.setInteger("minPrcc", minPrcc);
			query.setInteger("maxPrcc", maxPrcc);
			Long sumP05 = (Long) query.uniqueResult();
			txn.commit();
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
		Transaction txn = null;
		try {
			Session session = sessionFactory.getCurrentSession();
			txn = session.beginTransaction();
			String hql = "select count(*) from PrcMessages m, PrcRawMessages r where m.id=r.id and r.fileId = :fId and (r.type = 1240 or r.type = 1244) and (m.p03>=200000 and m.p03<=290000)";
			Query query = session.createQuery(hql);
			query.setLong("fId", fileId);
			Long sumS74 = (Long) query.uniqueResult();
			txn.commit();
			return sumS74;
		} catch (HibernateException e) {
			if (null != txn) {
				txn.rollback();
			}
			e.printStackTrace();
			throw new Exception("ERROR");
		}
	}

	@Override
	public Long sumPrcMessagesS75(Long fileId) throws Exception {
		Transaction txn = null;
		try {
			Session session = sessionFactory.getCurrentSession();
			txn = session.beginTransaction();
			String hql = "select count(*) from PrcMessages m, PrcRawMessages r where m.id=r.id and r.fileId = :fId and (r.type = 1440 or r.type = 1444) and (m.p03>=0 and m.p03<=190000)";
			Query query = session.createQuery(hql);
			query.setLong("fId", fileId);
			Long sumS75 = (Long) query.uniqueResult();
			txn.commit();
			return sumS75;
		} catch (HibernateException e) {
			if (null != txn) {
				txn.rollback();
			}
			e.printStackTrace();
			throw new Exception("ERROR");
		}
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
		Transaction txn = null;
		try {
			Session session = sessionFactory.getCurrentSession();
			txn = session.beginTransaction();
			String hql = "select count(*) from PrcMessages m, PrcRawMessages r where m.id=r.id and r.fileId = :fId and (r.type = 1440 or r.type = 1444) and (m.p03>=200000 and m.p03<=290000)";
			Query query = session.createQuery(hql);
			query.setLong("fId", fileId);
			Long sumS77 = (Long) query.uniqueResult();
			txn.commit();
			return sumS77;
		} catch (HibernateException e) {
			if (null != txn) {
				txn.rollback();
			}
			e.printStackTrace();
			throw new Exception("ERROR");
		}
	}

	@Override
	public Long sumPrcMessagesS85(Long fileId) throws Exception {
		Transaction txn = null;
		try {
			Session session = sessionFactory.getCurrentSession();
			txn = session.beginTransaction();
			String hql = "select count(*) from PrcMessages m, PrcRawMessages r where m.id=r.id and r.fileId = :fId and r.type = 1744";
			Query query = session.createQuery(hql);
			query.setLong("fId", fileId);
			Long sumS85 = (Long) query.uniqueResult();
			txn.commit();
			return sumS85;
		} catch (HibernateException e) {
			if (null != txn) {
				txn.rollback();
			}
			e.printStackTrace();
			throw new Exception("ERROR");
		}
	}

	@Override
	public Long sumPrcMessagesS109(Long fileId) throws Exception {
		Long sumS109 = (long) 0;
		Transaction txn = null;
		try {
			Session session = sessionFactory.getCurrentSession();
			txn = session.beginTransaction();
			String hql = "select substr(m.p46, 4, 8) from PrcMessages m, PrcRawMessages r where m.id = r.id and r.fileId = :fId and r.type in (1240, 1244, 1440, 1442, 1444, 1744) and substr(m.p46, 3, 1) = 'C'";
			Query query = session.createQuery(hql);
			query.setLong("fId", fileId);
			ArrayList<String> sumS109String = (ArrayList<String>) query.list();
			txn.commit();
			for (String el: sumS109String){
				sumS109 = sumS109 + Long.parseLong(el);
			}
			return sumS109;
		} catch (HibernateException e) {
			if (null != txn) {
				txn.rollback();
			}
			e.printStackTrace();
			throw new Exception("ERROR");
		}
	}

	@Override
	public Long sumPrcMessagesS110(Long fileId) throws Exception {
		Long sumS110 = (long) 0;
		Transaction txn = null;
		try {
			Session session = sessionFactory.getCurrentSession();
			txn = session.beginTransaction();
			String hql = "select substr(m.p46, 4, 8) from PrcMessages m, PrcRawMessages r where m.id = r.id and r.fileId = :fId and r.type in (1240, 1244, 1440, 1442, 1444, 1744) and substr(m.p46, 3, 1) = 'D'";
			Query query = session.createQuery(hql);
			query.setLong("fId", fileId);
			ArrayList<String> sumS110String = (ArrayList<String>) query.list();
			txn.commit();
			for (String el: sumS110String){
				sumS110 = sumS110 + Long.parseLong(el);
			}
			return (long) sumS110;
		} catch (HibernateException e) {
			if (null != txn) {
				txn.rollback();
			}
			e.printStackTrace();
			throw new Exception("ERROR");
		}
	}

	@Override
	public Long sum1544Sxx(Long fileId, String fieldName) throws Exception {
		Transaction txn = null;
		try {
			Session session = sessionFactory.getCurrentSession();
			txn = session.beginTransaction();
			String hql = "select SUM(m." + fieldName
					+ ") from PrcMessages m, PrcRawMessages r where m.id = r.id and r.fileId = :fId and r.type = 1544";
			Query query = session.createQuery(hql);
			query.setLong("fId", fileId);
			Long sumSxx = (long) query.uniqueResult();
			txn.commit();
			return sumSxx;
		} catch (HibernateException e) {
			if (null != txn) {
				txn.rollback();
			}
			e.printStackTrace();
			throw new Exception("ERROR");
		}
	}

	@Override
	public PrcMessages get1544(Long messId) throws Exception {
		Transaction txn = null;
		try {
			Session session = sessionFactory.getCurrentSession();
			txn = session.beginTransaction();
			String hql = "select m from PrcMessages m where m.id=:mId";
			Query query = session.createQuery(hql);
			query.setLong("mId", messId);
			PrcMessages get1544 = (PrcMessages) query.uniqueResult();
			txn.commit();
			return get1544;
		} catch (HibernateException e) {
			if (null != txn) {
				txn.rollback();
			}
			e.printStackTrace();
			throw new Exception("ERROR");
		}
	}

	@Override
	public Long kolInvalidMess(Long fileId) throws Exception {
		Transaction txn = null;
		try {
			Session session = sessionFactory.getCurrentSession();
			txn = session.beginTransaction();
			String hql = "select count(*) from PrcRawMessages where fileId = :fId and status = 'MSST0004'";
			Query query = session.createQuery(hql);
			query.setLong("fId", fileId);
			Long kolMess = (Long) query.uniqueResult();
			txn.commit();
			return kolMess;
		} catch (HibernateException e) {
			if (null != txn) {
				txn.rollback();
			}
			e.printStackTrace();
			throw new Exception("ERROR");
		}
	}

	@Override
	public Long kolMessWithError(Long fileId) throws Exception {
		Transaction txn = null;
		try {
			Session session = sessionFactory.getCurrentSession();
			txn = session.beginTransaction();
			String hql = "select count(distinct m.id) from PrcMessages m, PrcRawMessages r, PrcMessagesErrors e where m.id = r.id and r.fileId = :fId and e.msgId = m.id";
			Query query = session.createQuery(hql);
			query.setLong("fId", fileId);
			Long kolMess = (Long) query.uniqueResult();
			txn.commit();
			return kolMess;
		} catch (HibernateException e) {
			if (null != txn) {
				txn.rollback();
			}
			e.printStackTrace();
			throw new Exception("ERROR");
		}
	}

	@Override
	public Long amountMessagesInPrcMessages(Long fileId) throws Exception {
		Transaction txn = null;
		try {
			Session session = sessionFactory.getCurrentSession();
			txn = session.beginTransaction();
			String hql = "select count(*) from PrcMessages m, PrcRawMessages r where m.id = r.id and r.fileId = :fId";
			Query query = session.createQuery(hql);
			query.setLong("fId", fileId);
			Long amountMess = (Long) query.uniqueResult();
			txn.commit();
			logger.info("Messages amountMess = " + amountMess);
			return amountMess;
		} catch (HibernateException e) {
			if (null != txn) {
				txn.rollback();
			}
			e.printStackTrace();
			throw new Exception("ERROR");
		}
	}
}
