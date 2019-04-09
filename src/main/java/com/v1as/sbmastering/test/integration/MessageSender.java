package com.v1as.sbmastering.test.integration;

import com.v1as.sbmastering.test.model.MessageDto;
import com.v1as.sbmastering.test.services.MessageService;
import org.springframework.beans.factory.annotation.Autowired;

public interface MessageSender {

    int getSupportMessageType();

    void send(MessageDto messageDto);

    @Autowired
    default void registerMySelf(MessageService messageService){
        messageService.registerSender(this);
    }
}
