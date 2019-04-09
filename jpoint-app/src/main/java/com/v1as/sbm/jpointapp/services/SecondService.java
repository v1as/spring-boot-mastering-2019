package com.v1as.sbm.jpointapp.services;

import com.v1as.sbm.starter2.Benchmark;
import lombok.extern.java.Log;
import org.springframework.stereotype.Service;

@Log
@Service
public class SecondService {

    @Deprecated
    @Benchmark
    public void oldMethod() {
        log.info("Old method just called!");
    }

}
