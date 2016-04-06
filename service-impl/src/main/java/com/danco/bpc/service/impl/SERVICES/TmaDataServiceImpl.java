package com.danco.bpc.service.impl.SERVICES;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.danco.bpc.entity.TMA.TmaData;
import com.danco.bpc.service.api.TMA.ITmaDataService;

@Service
@Transactional
public class TmaDataServiceImpl extends DataServiceImpl<TmaData>implements ITmaDataService {

}
