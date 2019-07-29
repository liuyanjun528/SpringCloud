package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

import com.codingapi.txlcn.tc.config.EnableDistributedTransaction;




//Feign 采用的是基于接口的注解
//Feign 整合了ribbon，具有负载均衡的能力
//整合了Hystrix，具有熔断的能力
//加上@EnableFeignClients注解开启Feign的功能
@EnableFeignClients
@SpringBootApplication
@EnableEurekaClient
@EnableDistributedTransaction
public class ServiceFeignApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceFeignApplication.class, args);
	}
}
