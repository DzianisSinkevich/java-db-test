package com.danco.bpc.service.impl.SERVICES;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.danco.bpc.entity.TMA.TmtData;
import com.danco.bpc.service.api.TMA.ITmtDataService;

@Service
@Transactional
public class TmtDataServiceImpl extends DataServiceImpl<TmtData>implements ITmtDataService {

}
