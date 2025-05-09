package com.shisir.activemq.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

@Service
public class MessageProducer {

    @Autowired
    private JmsTemplate jmsTemplate;

    public void sendToQueue(String message){

        jmsTemplate.convertAndSend("test-queue", message);
    }
}
