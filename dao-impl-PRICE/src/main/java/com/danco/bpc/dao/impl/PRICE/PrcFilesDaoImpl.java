package com.danco.bpc.dao.impl.PRICE;

import java.util.ArrayList;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import com.danco.bpc.dao.api.PRICE.IPrcFilesDao;
import com.danco.bpc.dao.impl.common.AbstractDaoPriceImpl;
import com.danco.bpc.entity.PRICE.PrcFiles;

public class PrcFilesDaoImpl extends AbstractDaoPriceImpl<PrcFiles>implements IPrcFilesDao {

	/**
	 * Instantiates a new about dao impl.
	 */
	public PrcFilesDaoImpl() {
		super(PrcFiles.class);
	}

	@Override
	public PrcFiles selectFile(String filename) throws Exception {
		Transaction txn = null;
		try {
			Session session = sessionFactory.getCurrentSession();
			txn = session.beginTransaction();
			Criteria criteria = session.createCriteria(PrcFiles.class);
			criteria.add(Restrictions.eq("fileName", filename));
			PrcFiles prcFiles = (PrcFiles) criteria.uniqueResult();
			txn.commit();
			System.out.println(prcFiles);
			return prcFiles;
		} catch (HibernateException e) {
			if (null != txn) {
				txn.rollback();
			}
			e.printStackTrace();
			throw new Exception("ERROR");
		}
	}

	@Override
	public ArrayList<PrcFiles> listIncomingFiles() throws Exception {
		Transaction txn = null;
		try {
			Session session = sessionFactory.getCurrentSession();
			txn = session.beginTransaction();
			String hql = "from PrcFiles where type = 'FLTP1' and status = 'FLST2'";
			Query query = session.createQuery(hql);
//			query.setLong("fId", fileId);
			ArrayList<PrcFiles> listIncomingFiles = (ArrayList<PrcFiles>) query.list();
			txn.commit();
			return listIncomingFiles;
		} catch (HibernateException e) {
			if (null != txn) {
				txn.rollback();
			}
			e.printStackTrace();
			throw new Exception("ERROR");
		}
	}

}
