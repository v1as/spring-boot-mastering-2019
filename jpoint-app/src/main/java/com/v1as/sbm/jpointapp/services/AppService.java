package com.v1as.sbm.jpointapp.services;

import com.v1as.sbm.starter.jpoint.JPointService;
import org.springframework.stereotype.Service;

@Service
public class AppService {


    public AppService(JPointService pointService) {
        pointService.process();
    }
}
