package com.danco.bpc.dao.impl.PRICE;

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

}
