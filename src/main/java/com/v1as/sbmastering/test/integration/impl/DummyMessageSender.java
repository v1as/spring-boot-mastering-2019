package com.v1as.sbmastering.test.integration.impl;

import com.v1as.sbmastering.test.integration.MessageSender;
import com.v1as.sbmastering.test.model.MessageDto;
import lombok.extern.java.Log;
import org.springframework.stereotype.Component;

@Log
@Component
public class DummyMessageSender implements MessageSender {

    @Override
    public int getSupportMessageType() {
        return -1;
    }

    @Override
    public void send(MessageDto messageDto) {
        log.info("Message was sent:" + messageDto.toString());

    }

}
