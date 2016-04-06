package com.danco.bpc.service.impl.SERVICES;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.danco.bpc.entity.TMA.TmtSessionMessage;
import com.danco.bpc.service.api.TMA.ITmtSessionMessageService;

@Service
@Transactional
public class TmtSessionMessageServiceImpl extends DataServiceImpl<TmtSessionMessage>implements ITmtSessionMessageService {

}
