package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.service.HiService;

@RestController
public class HiController {
	@Autowired 
	HiService hiService;

	@GetMapping("/hi")
    public String hi1(){
    	//Thread.sleep(3000);
    	return hiService.car();
    }
    
    @GetMapping("/hello")
	public String hello() {	
	return "eureka-client2-----你好！";
	}
    
}
