package com.danco.bpc.service.impl.SERVICES;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.danco.bpc.entity.TMA.TmtMovActcTe;
import com.danco.bpc.service.api.TMA.ITmtMovActcTeService;

@Service
@Transactional
public class TmtMovActcTeServiceImpl extends DataServiceImpl<TmtMovActcTe>implements ITmtMovActcTeService {

	@Override
	public TmtMovActcTe copyTmtMovActcTe() {
		// TODO Auto-generated method stub
		return null;
	}
}
