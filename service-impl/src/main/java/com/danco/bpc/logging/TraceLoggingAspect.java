package com.danco.bpc.logging;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@Aspect
public class TraceLoggingAspect {
	private static final String METHOD_SUCCEDED = "Method succeded : ";
	private static final String METHOD_STARTED = "Method started : ";
	private static final Logger LOG = LoggerFactory.getLogger(DebugLoggingAspect.class);
	
	@Around("within(com.danco.bpc.*)")
	public Object log(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
		if(LOG.isTraceEnabled()){
			LOG.trace(METHOD_STARTED + proceedingJoinPoint.getSignature().getName());
		}
	    Object value = null;
		try {
			value = proceedingJoinPoint.proceed();
        } catch (Throwable e) {
        	throw e;
        }
		if(LOG.isTraceEnabled()){
			LOG.trace(METHOD_SUCCEDED + proceedingJoinPoint.getSignature().getName());
		}
        return value;
	}
}
