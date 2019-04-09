package com.v1as.sbm.starter2;

import org.springframework.context.annotation.Import;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Старый формат включения стартера для обычного спринга (не spring-boot)
 */
@Retention(RetentionPolicy.RUNTIME)
@Import(Starter2Configuration.class)
public @interface EnableStarter2 {
}
