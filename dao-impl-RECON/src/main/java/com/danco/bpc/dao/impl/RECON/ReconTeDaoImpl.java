package com.danco.bpc.dao.impl.RECON;

import com.danco.bpc.dao.api.RECON.IReconTeDao;
import com.danco.bpc.dao.impl.common.AbstractDaoImpl;
import com.danco.bpc.entity.RECON.ReconTe;

public class ReconTeDaoImpl extends AbstractDaoImpl<ReconTe> implements IReconTeDao {

	/**
	 * Instantiates a new about dao impl.
	 */ 
	public ReconTeDaoImpl() {
		super(ReconTe.class);
	}
}
