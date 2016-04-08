package com.danco.bpc.dao.impl.RECON;

import com.danco.bpc.dao.api.RECON.IReconTmaDao;
import com.danco.bpc.dao.impl.common.AbstractDaoReconImpl;
import com.danco.bpc.entity.RECON.ReconTma;

public class ReconTmaDaoImpl extends AbstractDaoReconImpl<ReconTma> implements IReconTmaDao {

	/**
	 * Instantiates a new about dao impl.
	 */ 
	public ReconTmaDaoImpl() {
		super(ReconTma.class);
	}
}
