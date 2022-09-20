package com.producer.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.producer.service.KafkaMessageService;

@RestController
@RequestMapping("/message")
@RequiredArgsConstructor
public class MessageController {

    private final KafkaMessageService messageService;

    @PostMapping
    public ResponseEntity<String> sendMessageToKafka(@RequestBody String message){
        messageService.sendMessage(message);
        return ResponseEntity.ok().body("Message sent successfully "+message);
    }
}
