package com.noor.actuator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication
@CrossOrigin(origins = "http://192.168.1.12:8094")
@EnableDiscoveryClient
public class ActuatorApplication {

	public static void main(String[] args) {

		SpringApplication.run(ActuatorApplication.class, args);
	}

}
