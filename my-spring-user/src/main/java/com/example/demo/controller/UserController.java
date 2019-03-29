package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.UserService;
@RestController
public class UserController {

	
	@Autowired 
	UserService userService;
	@GetMapping("/user")
	public String user(){
		System.out.println("============>>>>>");
		
	return	userService.user();
		
	}
	
	@GetMapping("/hello")
	public String hello() {	
	return "eureka-client----你好！";
	}
}
