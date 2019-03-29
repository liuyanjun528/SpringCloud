package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
@EnableEurekaServer
@SpringBootApplication
public class RurekaServerApplication2 {

	public static void main(String[] args) {
		SpringApplication.run(RurekaServerApplication2.class, args);
	}
}
