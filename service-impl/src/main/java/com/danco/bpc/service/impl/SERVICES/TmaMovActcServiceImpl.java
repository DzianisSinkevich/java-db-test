package com.danco.bpc.service.impl.SERVICES;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.danco.bpc.entity.TMA.TmaMovActc;
import com.danco.bpc.service.api.TMA.ITmaMovActcService;
@Service
@Transactional
	public class TmaMovActcServiceImpl extends DataServiceImpl<TmaMovActc>implements ITmaMovActcService {

	@Override
	public TmaMovActc copyTmaMovActc() {
		// TODO Auto-generated method stub
		return null;
	}
}


