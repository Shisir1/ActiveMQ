package com.shisir.activemq.rest;

import org.apache.activemq.broker.BrokerService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//This config is to start embedded broker service
@Configuration
public class ActiveMqEmbeddedConfig {

    @Bean
    public BrokerService broker() throws Exception {
        BrokerService broker = new BrokerService();
        broker.addConnector("tcp://localhost:61616");
        broker.setPersistent(false);
        broker.setUseJmx(true);
        return broker;
    }
}
