package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
@Service
public class HiService {
	@Value("${server.port}")
	private	String port; 
	@Autowired
    private RestTemplate restTemplate;
	
	
	
	public String car() {
		
		return "eureka-tiger的端口-------->"+port;
	}
		
}
