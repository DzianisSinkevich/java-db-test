package com.danco.bpc.dao.impl.RECON;

import com.danco.bpc.dao.api.RECON.IReconSessionDao;
import com.danco.bpc.dao.impl.common.AbstractDaoReconImpl;
import com.danco.bpc.entity.RECON.ReconSession;

public class ReconSessionDaoImpl extends AbstractDaoReconImpl<ReconSession> implements IReconSessionDao {

	/**
	 * Instantiates a new about dao impl.
	 */ 
	public ReconSessionDaoImpl() {
		super(ReconSession.class);
	}
}
