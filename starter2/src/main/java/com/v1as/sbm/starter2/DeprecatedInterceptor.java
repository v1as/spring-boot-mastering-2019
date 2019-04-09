package com.v1as.sbm.starter2;

import lombok.extern.java.Log;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Log
@Aspect
public class DeprecatedInterceptor {

    @Before("execution(* com.v1as..*(..)) && @annotation(Deprecated)")
    public void before() {
        log.warning("You just used @Deprecated method");
    }
}
