package com.danco.bpc.dao.impl.RECON;

import com.danco.bpc.dao.api.RECON.IReconNpsDao;
import com.danco.bpc.dao.impl.common.AbstractDaoReconImpl;
import com.danco.bpc.entity.RECON.ReconNps;

public class ReconNpsDaoImpl extends AbstractDaoReconImpl<ReconNps> implements IReconNpsDao {

	/**
	 * Instantiates a new about dao impl.
	 */ 
	public ReconNpsDaoImpl() {
		super(ReconNps.class);
	}
}
