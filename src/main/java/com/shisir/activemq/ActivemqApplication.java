package com.shisir.activemq;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ActivemqApplication {

	public static void main(String[] args) {

		SpringApplication.run(ActivemqApplication.class, args);
	}

	@Bean
	public CommandLineRunner sendTestMessage(MessageProducer producer){
		return args -> producer.sendMessage("test-queue", "Hello from Spring boot activemq application!");
	}


}
