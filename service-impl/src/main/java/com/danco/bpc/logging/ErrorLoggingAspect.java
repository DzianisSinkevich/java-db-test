package com.danco.bpc.logging;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Aspect
public class ErrorLoggingAspect {
	private static final String SPACER = " ";
	private static final Logger LOG = LoggerFactory.getLogger(ErrorLoggingAspect.class);

	@AfterThrowing(pointcut = "within(com.danco.bpc.service.impl.*)", throwing="error")
	public void logAfterThrowing(JoinPoint joinPoint, Throwable error) {
		LOG.error(joinPoint.getSignature().getName() + SPACER + error.getMessage(),error);
	}

}
