package com.v1as.sbm.starter2;

import lombok.extern.java.Log;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;

@Log
@Aspect
public class DeprecatedInterceptor {

    @Autowired(required = false)
    private NotificationService notificationService;

    @Before("execution(* com.v1as..*(..)) && @annotation(Deprecated)")
    public void before() {
        log.warning("You just used @Deprecated method");
        if (notificationService != null) {
            notificationService.process();
        }
    }

}
