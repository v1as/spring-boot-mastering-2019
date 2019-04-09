package com.v1as.sbm.starter2;

import lombok.extern.java.Log;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Log
@Configuration
public class Starter2Configuration {

    @Bean
    BenchmarkInterceptor getBenchmarkInterceptor() {
        return new BenchmarkInterceptor();
    }

    @Bean
    DeprecatedInterceptor getDeprecatedInterceptor() {
        return new DeprecatedInterceptor();
    }

}
