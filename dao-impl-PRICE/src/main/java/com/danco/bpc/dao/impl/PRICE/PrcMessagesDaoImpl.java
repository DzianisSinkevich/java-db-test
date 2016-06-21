package com.danco.bpc.dao.impl.PRICE;

import java.util.ArrayList;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.danco.bpc.dao.api.PRICE.IPrcMessagesDao;
import com.danco.bpc.dao.impl.common.AbstractDaoPriceImpl;
import com.danco.bpc.entity.PRICE.PrcMessages;

public class PrcMessagesDaoImpl extends AbstractDaoPriceImpl<PrcMessages>implements IPrcMessagesDao {

	/**
	 * Instantiates a new about dao impl.
	 */
	public PrcMessagesDaoImpl() {
		super(PrcMessages.class);
	}

	@Override
	public Long firstMessage(Long fileId) throws Exception {
		Transaction txn = null;
		try {
			Session session = sessionFactory.getCurrentSession();
			txn = session.beginTransaction();
			String hql = "select min(m.id) from PrcMessages m, PrcRawMessages r where m.id=r.id and r.fileId = :fId";
			Query query = session.createQuery(hql);
			query.setLong("fId", fileId);
			Long firstMessageInFile = (Long) query.uniqueResult();
			txn.commit();
			return firstMessageInFile;
		} catch (HibernateException e) {
			if (null != txn) {
				txn.rollback();
			}
			e.printStackTrace();
			throw new Exception("ERROR");
		}
	}

	@Override
	public Long lastMessage(Long fileId) throws Exception {
		Transaction txn = null;
		try {
			Session session = sessionFactory.getCurrentSession();
			txn = session.beginTransaction();
			String hql = "select max(m.id) from PrcMessages m, PrcRawMessages r where m.id=r.id and r.fileId = :fId";
			Query query = session.createQuery(hql);
			query.setLong("fId", fileId);
			Long lastMessageInFile = (Long) query.uniqueResult();
			txn.commit();
			return lastMessageInFile;
		} catch (HibernateException e) {
			if (null != txn) {
				txn.rollback();
			}
			e.printStackTrace();
			throw new Exception("ERROR");
		}
	}

	@Override
	public Long sumPrcMessagesP04(Long fileId, int recordType1, int recordType2, int minPrcc, int maxPrcc) throws Exception {
		Transaction txn = null;
		try {
			Session session = sessionFactory.getCurrentSession();
			txn = session.beginTransaction();
			String hql = "select SUM(m.p04) from PrcMessages m, PrcRawMessages r where m.id=r.id and r.fileId = :fId and (r.type = :rType1 or r.type = :rType2) and (m.p03>=:minPrcc and m.p03<=:maxPrcc)";
			Query query = session.createQuery(hql);
			query.setLong("fId", fileId);
			query.setInteger("rType1", recordType1);
			query.setInteger("rType2", recordType2);
			query.setInteger("minPrcc", minPrcc);
			query.setInteger("maxPrcc", maxPrcc);
			Long sumP04 = (Long) query.uniqueResult();
			txn.commit();
			// System.out.println("SumP04 = " + sumP04);
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
	public Long sumPrcMessagesP05(Long fileId, int recordType1, int recordType2, int minPrcc, int maxPrcc) throws Exception {
		Transaction txn = null;
		try {
			Session session = sessionFactory.getCurrentSession();
			txn = session.beginTransaction();
			String hql = "select SUM(m.p05) from PrcMessages m, PrcRawMessages r where m.id=r.id and r.fileId = :fId and (r.type = :rType1 or r.type = :rType2) and (m.p03>=:minPrcc and m.p03<=:maxPrcc)";
			Query query = session.createQuery(hql);
			query.setLong("fId", fileId);
			query.setInteger("rType1", recordType1);
			query.setInteger("rType2", recordType2);
			query.setInteger("minPrcc", minPrcc);
			query.setInteger("maxPrcc", maxPrcc);
			Long sumP05 = (Long) query.uniqueResult();
			txn.commit();
			// System.out.println("SumP05 = " + sumP05);
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
	public Long sumPrcMessagesS74(Long fileId, Long startId, Long endId) throws Exception {
		Transaction txn = null;
		try {
			Session session = sessionFactory.getCurrentSession();
			txn = session.beginTransaction();
			String hql = "select count(*) from PrcMessages m, PrcRawMessages r where m.id=r.id and r.fileId = :fId and (r.type = 1240 or r.type = 1244) and (m.p03>=2000000 and m.p03<=290000) and m.id >= :startId and m.id <= endId";
			Query query = session.createQuery(hql);
			query.setLong("fId", fileId);
			query.setLong("startId", startId);
			query.setLong("endId", endId);
			Long sumS74 = (Long) query.uniqueResult();
			txn.commit();
			// System.out.println("SumS74 = " + sumS74);
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
	public Long sumPrcMessagesS75(Long fileId, Long startId, Long endId) throws Exception {
		Transaction txn = null;
		try {
			Session session = sessionFactory.getCurrentSession();
			txn = session.beginTransaction();
			String hql = "select count(*) from PrcMessages m, PrcRawMessages r where m.id=r.id and r.fileId = :fId and (r.type = 1440 or r.type = 1444) and (m.p03>=0 and m.p03<=190000) and m.id >= :startId and m.id <= endId";
			Query query = session.createQuery(hql);
			query.setLong("fId", fileId);
			query.setLong("startId", startId);
			query.setLong("endId", endId);
			Long sumS75 = (Long) query.uniqueResult();
			txn.commit();
			// System.out.println("SumS75 = " + sumS75);
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
	public Long sumPrcMessagesS76(Long fileId, Long startId, Long endId) throws Exception {
		Transaction txn = null;
		try {
			Session session = sessionFactory.getCurrentSession();
			txn = session.beginTransaction();
			String hql = "select count(*) from PrcMessages m, PrcRawMessages r where m.id=r.id and r.fileId = :fId and (r.type = 1240 or r.type = 1244) and (m.p03>=0 and m.p03<=190000) and m.id >= :startId and m.id <= endId";
			Query query = session.createQuery(hql);
			query.setLong("fId", fileId);
			query.setLong("startId", startId);
			query.setLong("endId", endId);
			Long sumS76 = (Long) query.uniqueResult();
			txn.commit();
			// System.out.println("SumS76 = " + sumS76);
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
	public Long sumPrcMessagesS77(Long fileId, Long startId, Long endId) throws Exception {
		Transaction txn = null;
		try {
			Session session = sessionFactory.getCurrentSession();
			txn = session.beginTransaction();
			String hql = "select count(*) from PrcMessages m, PrcRawMessages r where m.id=r.id and r.fileId = :fId and (r.type = 1440 or r.type = 1444) and (m.p03>=200000 and m.p03<=290000) and m.id >= :startId and m.id <= endId";
			Query query = session.createQuery(hql);
			query.setLong("fId", fileId);
			query.setLong("startId", startId);
			query.setLong("endId", endId);
			Long sumS77 = (Long) query.uniqueResult();
			txn.commit();
			// System.out.println("SumS77 = " + sumS77);
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
	public Long sumPrcMessagesS85(Long fileId, Long startId, Long endId) throws Exception {
		Transaction txn = null;
		try {
			Session session = sessionFactory.getCurrentSession();
			txn = session.beginTransaction();
			String hql = "select count(*) from PrcMessages m, PrcRawMessages r where m.id=r.id and r.fileId = :fId and r.type = 1744 and m.id >= :startId and m.id <= endId";
			Query query = session.createQuery(hql);
			query.setLong("fId", fileId);
			query.setLong("startId", startId);
			query.setLong("endId", endId);
			Long sumS85 = (Long) query.uniqueResult();
			txn.commit();
			// System.out.println("SumS85 = " + sumS85);
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
	public Long sumPrcMessagesS109(Long fileId, Long startId, Long endId) throws Exception {

		return null;
	}

	@Override
	public Long sumPrcMessagesS110(Long fileId, Long startId, Long endId) throws Exception {

		return null;
	}

	@Override
	public ArrayList<PrcMessages> get1544List(Long fileId) throws Exception {
		Transaction txn = null;
		try {
			Session session = sessionFactory.getCurrentSession();
			txn = session.beginTransaction();
			String hql = "select m.id from PrcMessages m, PrcRawMessages r where m.id=r.id and r.fileId = :fId and r.type = 1544 order by m.id";
			Query query = session.createQuery(hql);
			query.setLong("fId", fileId);
			ArrayList<PrcMessages> get1544 = (ArrayList<PrcMessages>) query.list();
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
			System.out.println("Messages amountMess = " + amountMess);
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
