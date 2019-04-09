package com.v1as.sbmastering.test.services;

import com.v1as.sbmastering.test.integration.MessageSender;
import com.v1as.sbmastering.test.model.MessageDto;
import lombok.extern.java.Log;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Log
@Service
public class MessageService {

    private Map<Integer, MessageSender> sendersMap = new HashMap<>();

    public void send(MessageDto message) {
        MessageSender messageSender = sendersMap.get(message.getType());
        if (messageSender == null) {
            throw new UnsupportedOperationException("This message type is not supported");
        }
        messageSender.send(message);
    }

    public void registerSender(MessageSender messageSender) {
        sendersMap.put(messageSender.getSupportMessageType(), messageSender);
        log.info("Sender was registered: " + messageSender.getClass().getSimpleName()
                + " with type " + messageSender.getSupportMessageType());
    }

}
