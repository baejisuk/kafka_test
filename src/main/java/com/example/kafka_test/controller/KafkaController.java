package com.example.kafka_test.controller;

import com.example.kafka_test.config.KafkaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/kafka")
public class KafkaController {

    private final KafkaProducer producer;

    @Autowired
    KafkaController(KafkaProducer producer) {
        this.producer = producer;
    }

    @GetMapping
    public String sendMessage() {
        this.producer.sendMessage("test");
        return "SUCCESS";
    }
}
