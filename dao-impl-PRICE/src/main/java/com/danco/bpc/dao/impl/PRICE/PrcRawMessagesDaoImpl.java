package com.danco.bpc.dao.impl.PRICE;

import java.util.Calendar;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import com.danco.bpc.dao.api.PRICE.IPrcRawMessagesDao;
import com.danco.bpc.dao.impl.common.AbstractDaoPriceImpl;
import com.danco.bpc.entity.PRICE.PrcRawMessages;

public class PrcRawMessagesDaoImpl extends AbstractDaoPriceImpl<PrcRawMessages>implements IPrcRawMessagesDao {

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

	@Override
	public Long amountMessagesInPrcRawMessages(Long fileId) throws Exception {
		Transaction txn = null;
		try {
			Session session = sessionFactory.getCurrentSession();
			txn = session.beginTransaction();
			String hql = "select count(*) from PrcRawMessages where fileId = :fId";
			Query query = session.createQuery(hql);
			query.setLong("fId", fileId);
			Long amountMess = (Long) query.uniqueResult();
			txn.commit();
			return amountMess;
		} catch (HibernateException e) {
			if (null != txn) {
				txn.rollback();
			}
			e.printStackTrace();
			throw new Exception("ERROR");
		}
	}

	@Override
	public Long amountMessagesWithCurrentDate(Calendar currDate) throws Exception {
		Transaction txn = null;
		try {
			System.out.println("currDate=" + currDate.getTimeInMillis());
			Session session = sessionFactory.getCurrentSession();
			txn = session.beginTransaction();
			String hql = "select count(*) from PrcRawMessages r where year(r.createdAt) = year(:currDate) and month(r.createdAt) = month(:currDate) and day(r.createdAt) = day(:currDate)";
			Query query = session.createQuery(hql);
			query.setCalendar("currDate", currDate);
			Long amountMess = (Long) query.uniqueResult();
			txn.commit();
			System.out.println("amountMess=" + amountMess);
			return amountMess;
		} catch (HibernateException e) {
			if (null != txn) {
				txn.rollback();
			}
			e.printStackTrace();
			throw new Exception("ERROR");
		}
	}

	@Override
	public String getPrcRawMessagesStatus(String id) throws Exception {
		Transaction txn = null;
		try {
			Session session = sessionFactory.getCurrentSession();
			txn = session.beginTransaction();
			String hql = "select status from PrcRawMessages r where r.id = :id";
			Query query = session.createQuery(hql);
			query.setString("id", id);
			String messageStatus = (String) query.uniqueResult();
			txn.commit();
//			System.out.println("messageStatus = " + messageStatus);
			return messageStatus;
		} catch (HibernateException e) {
			if (null != txn) {
				txn.rollback();
			}
			e.printStackTrace();
			throw new Exception("ERROR");
		}
	}
}
