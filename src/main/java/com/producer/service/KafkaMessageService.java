package com.producer.service;

import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class KafkaMessageService {
    private static final Logger logger = LoggerFactory.getLogger(KafkaMessageService.class);

    @Value("${spring.topic.producer}")
    private String topic;

    private final KafkaTemplate<String,String> kafkaTemplate;

    public void sendMessage(String message){
        logger.info("Message -> {}",message);
        this.kafkaTemplate.send(topic,message);

    }
}
