package com.v1as.sbm.starter2;

import lombok.extern.java.Log;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

@Log
public class OnWindowsCondition implements Condition {
    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        log.info("On windows condition check...");
        return System.getenv().get("OS").toLowerCase().contains("windows");
    }
}
