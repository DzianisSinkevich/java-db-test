package com.danco.bpc.service.api.TMA;

import com.danco.bpc.entity.TMA.TmaMovActc;
import com.danco.bpc.service.api.IGenericService;

public interface ITmaMovActcService extends IGenericService<TmaMovActc> {
	
	TmaMovActc copyTmaMovActc();

}