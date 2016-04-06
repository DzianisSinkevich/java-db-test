package com.danco.bpc.service.impl.SERVICES;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.danco.bpc.entity.TMA.TmtMovActcTr;
import com.danco.bpc.service.api.TMA.ITmtMovActcTrService;

@Service
@Transactional
public class TmtMovActcTrServiceImpl extends DataServiceImpl<TmtMovActcTr>implements ITmtMovActcTrService {

	@Override
	public TmtMovActcTr copyTmtMovActcTr() {
		// TODO Auto-generated method stub
		return null;
	}
}
