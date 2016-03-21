package com.danco.bpc.dao.impl.RECON;

import com.danco.bpc.dao.api.RECON.IReconPriceDao;
import com.danco.bpc.dao.impl.common.AbstractDaoImpl;
import com.danco.bpc.entity.RECON.ReconPrice;

public class ReconPriceDaoImpl extends AbstractDaoImpl<ReconPrice> implements IReconPriceDao {

	/**
	 * Instantiates a new about dao impl.
	 */ 
	public ReconPriceDaoImpl() {
		super(ReconPrice.class);
	}
}
