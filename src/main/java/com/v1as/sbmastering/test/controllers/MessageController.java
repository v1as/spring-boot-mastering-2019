package com.v1as.sbmastering.test.controllers;

import com.v1as.sbmastering.test.model.MessageDto;
import com.v1as.sbmastering.test.services.MessageService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("message")
public class MessageController {

    private final MessageService messageService;

    public MessageController(MessageService messageService) {
        this.messageService = messageService;
    }

    @PostMapping("send")
    public ResponseEntity sendMessage(@RequestBody MessageDto message) {
        try {
            messageService.send(message);
            return ResponseEntity.ok().build();
        } catch (UnsupportedOperationException e) {
            return ResponseEntity.badRequest().build();
        }
    }

    @GetMapping("test")
    public ResponseEntity test(){
        return ResponseEntity.ok().build();
    }


}
