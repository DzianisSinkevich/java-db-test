package com.danco.bpc.dao.impl.RECON;

import com.danco.bpc.dao.api.RECON.IReconNpsDao;
import com.danco.bpc.dao.impl.common.AbstractDaoImpl;
import com.danco.bpc.entity.RECON.ReconNps;

public class ReconNpsDaoImpl extends AbstractDaoImpl<ReconNps> implements IReconNpsDao {

	/**
	 * Instantiates a new about dao impl.
	 */ 
	public ReconNpsDaoImpl() {
		super(ReconNps.class);
	}
}
