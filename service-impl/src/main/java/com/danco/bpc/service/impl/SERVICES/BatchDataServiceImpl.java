package com.danco.bpc.service.impl.SERVICES;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.danco.bpc.entity.TMA.BatchData;
import com.danco.bpc.service.api.TMA.IBatchDataService;

@Service
@Transactional
public class BatchDataServiceImpl extends DataServiceImpl<BatchData>implements IBatchDataService {

}
