package com.v1as.sbm.starter.jpoint;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JPointConfiguration {

    @Bean
    public JPointService buildJPointService() {
        return new JPointService();
    }

}
