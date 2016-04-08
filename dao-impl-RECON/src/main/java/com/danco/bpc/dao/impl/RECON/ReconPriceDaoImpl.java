package com.danco.bpc.dao.impl.RECON;

import com.danco.bpc.dao.api.RECON.IReconPriceDao;
import com.danco.bpc.dao.impl.common.AbstractDaoReconImpl;
import com.danco.bpc.entity.RECON.ReconPrice;

public class ReconPriceDaoImpl extends AbstractDaoReconImpl<ReconPrice> implements IReconPriceDao {

	/**
	 * Instantiates a new about dao impl.
	 */ 
	public ReconPriceDaoImpl() {
		super(ReconPrice.class);
	}
}
