package com.shisir.activemq;

import com.shisir.activemq.rest.MessageProducer;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jms.annotation.EnableJms;

@SpringBootApplication
@EnableJms
public class ActivemqApplication {

	public static void main(String[] args) {

		SpringApplication.run(ActivemqApplication.class, args);
	}

//	@Bean
//	public CommandLineRunner sendTestMessage(MessageProducer producer){
//		return args -> producer.sendMessage("test-queue", "Hello from Spring boot activemq application!");
//	}


}
