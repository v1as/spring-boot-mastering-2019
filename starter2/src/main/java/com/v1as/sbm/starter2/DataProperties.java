package com.v1as.sbm.starter2;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;

@Data
@ConfigurationProperties(prefix = "demo")
public class DataProperties {
    private List<String> dbaEmails;
}
