package com.danco.bpc.service.impl.SERVICES;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.danco.bpc.entity.TMA.TmtSession;
import com.danco.bpc.service.api.TMA.ITmtSessionService;

@Service
@Transactional
public class TmtSessionServiceImpl extends DataServiceImpl<TmtSession>implements ITmtSessionService {

}
