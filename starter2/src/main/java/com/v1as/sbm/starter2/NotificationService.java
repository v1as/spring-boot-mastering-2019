package com.v1as.sbm.starter2;

import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;

@Log
public class NotificationService {

    @Autowired
    private DataProperties dataProperties;

    public void process() {
        dataProperties.getDbaEmails().forEach(log::info);
    }
}
