package com.v1as.sbmastering.test.services;

import com.v1as.sbmastering.test.integration.MessageSender;
import com.v1as.sbmastering.test.model.MessageDto;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class MessageService {

    private Map<Integer, MessageSender> sendersMap;

    public MessageService(List<MessageSender> messageSenders) {
        sendersMap = messageSenders.stream()
                .collect(Collectors.toMap(
                        MessageSender::getSupportMessageType,
                        s -> s));
    }

    public void send(MessageDto message) {
        MessageSender messageSender = sendersMap.get(message.getType());
        if (messageSender == null) {
            throw new UnsupportedOperationException("This message type is not supported");
        }
        messageSender.send(message);
    }
}
