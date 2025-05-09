package com.shisir.activemq.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/messages")
public class MessageController {

    @Autowired
    private MessageProducer producer;

    @PostMapping
    public String sendMessage(@RequestBody String message){
        producer.sendToQueue(message);
        return "Message sent to ActiveMQ queue: " + message;
    }
}
