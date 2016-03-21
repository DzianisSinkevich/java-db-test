package com.danco.bpc.dao.impl.RECON;

import com.danco.bpc.dao.api.RECON.IReconTrDao;
import com.danco.bpc.dao.impl.common.AbstractDaoImpl;
import com.danco.bpc.entity.RECON.ReconTr;

public class ReconTrDaoImpl extends AbstractDaoImpl<ReconTr> implements IReconTrDao {

	/**
	 * Instantiates a new about dao impl.
	 */ 
	public ReconTrDaoImpl() {
		super(ReconTr.class);
	}
}
