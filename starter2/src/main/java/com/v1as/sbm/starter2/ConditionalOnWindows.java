package com.v1as.sbm.starter2;

import org.springframework.context.annotation.Conditional;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@Conditional(OnWindowsCondition.class)
public @interface ConditionalOnWindows {
}
