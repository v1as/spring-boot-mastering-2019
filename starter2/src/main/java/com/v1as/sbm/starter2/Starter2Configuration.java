package com.v1as.sbm.starter2;

import lombok.extern.java.Log;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Log
@Configuration
@EnableConfigurationProperties(DataProperties.class)
public class Starter2Configuration {

    @Bean
    BenchmarkInterceptor getBenchmarkInterceptor() {
        return new BenchmarkInterceptor();
    }

    @Bean
    DeprecatedInterceptor getDeprecatedInterceptor() {
        return new DeprecatedInterceptor();
    }

    @Bean
    @ConditionalOnWindows
    @ConditionalOnProperty("demo.dba-emails")
    NotificationService getNotificationService() {
        return new NotificationService();
    }

}
