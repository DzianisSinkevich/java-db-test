package com.danco.bpc.logging;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Aspect
public class DebugLoggingAspect {
	private static final String SERVICE_METHOD_EXECUTED = "Service method executed : ";
	private static final Logger LOG = LoggerFactory.getLogger(DebugLoggingAspect.class);
	
	@After("within(com.danco.bpc.service.impl.*)")
	public void log(JoinPoint joinPoint) {
		if(LOG.isDebugEnabled()){
			LOG.debug(SERVICE_METHOD_EXECUTED + joinPoint.getSignature().getName());
		}
	}
}
