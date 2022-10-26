package com.example.atelier2.config;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class PerformanceAspect {
    private static final Logger l = LogManager.getLogger(LoggingAspect.class);
    @Around("execution(* com.example.atelier2.Service.StockServiceImpl.*(..))")
    public Object profile(ProceedingJoinPoint pjp) throws Throwable {
        long start = System.currentTimeMillis();
        Object obj = pjp.proceed();
        long elapsedTime = System.currentTimeMillis() - start;
        l.info("Method execution time: " + elapsedTime + " milliseconds.");
        return obj;
    }
}
