package com.shisir.activemq.rest;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class MessageConsumer {

    @JmsListener(destination = "test-queue")
    public void receiveMessage(String message) {
        System.out.println("Received from queue: " + message);
    }
}
