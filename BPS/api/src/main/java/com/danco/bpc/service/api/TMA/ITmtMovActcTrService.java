package com.danco.bpc.service.api.TMA;

import com.danco.bpc.entity.TMA.TmtMovActcTr;
import com.danco.bpc.service.api.IGenericService;

public interface ITmtMovActcTrService extends IGenericService<TmtMovActcTr> {
	TmtMovActcTr copyTmtMovActcTr();
}