package com.v1as.sbmastering.test.integration;

import com.v1as.sbmastering.test.model.MessageDto;

public interface MessageSender {

    int getSupportMessageType();

    void send(MessageDto messageDto);
}
