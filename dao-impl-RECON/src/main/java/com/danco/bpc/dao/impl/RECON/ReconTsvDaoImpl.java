package com.danco.bpc.dao.impl.RECON;

import com.danco.bpc.dao.api.RECON.IReconTsvDao;
import com.danco.bpc.dao.impl.common.AbstractDaoReconImpl;
import com.danco.bpc.entity.RECON.ReconTsv;

public class ReconTsvDaoImpl extends AbstractDaoReconImpl<ReconTsv> implements IReconTsvDao {

	/**
	 * Instantiates a new about dao impl.
	 */ 
	public ReconTsvDaoImpl() {
		super(ReconTsv.class);
	}
}
