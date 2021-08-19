package com.example.kafka_test.config;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    @KafkaListener(topics = "go-kafka", groupId = "test-group")
    public void consume(String message) {
        System.out.println(String.format("Consumed message : %s", message));
    }
}