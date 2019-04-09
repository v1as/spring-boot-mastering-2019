package com.v1as.sbm.jpointapp;

import com.v1as.sbm.starter2.ConditionalOnWindows;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JpointAppApplication {

    @Bean
    @ConditionalOnWindows
    public String getBean1(){
        return "Bean1";
    }

    @Bean
    @ConditionalOnWindows
    public String getBean2(){
        return "Bean2";
    }

    public static void main(String[] args) {
        SpringApplication.run(JpointAppApplication.class, args);
    }

}
