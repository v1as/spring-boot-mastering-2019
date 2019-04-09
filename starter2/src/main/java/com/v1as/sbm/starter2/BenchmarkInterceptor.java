package com.v1as.sbm.starter2;

import lombok.extern.java.Log;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

import java.util.Date;

@Log
@Aspect
public class BenchmarkInterceptor {

    @Around("execution(* com.v1as..*(..)) && @annotation(Benchmark)")
    public void around(ProceedingJoinPoint joinPoint) throws Throwable {
        long start = new Date().getTime();
        try {
            joinPoint.proceed();
        } finally {
            log.info("Method executed in " + (new Date().getTime() - start) + "ms.");
        }
    }

}
