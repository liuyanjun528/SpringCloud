package com.example.demo.contorlle;

import javax.sound.sampled.Port;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.interfacefeing.FeingInterface;
import com.example.demo.interfacefeing.Test1;

@RestController
// @RequestMapping("/api")
public class HiControlle {
	@Value("${server.port}")
	String Port;
	@Autowired
	private FeingInterface feingInterface;

	@Autowired
	private Test1 test1;

	@GetMapping("/sayHi")
	public String sayHi() {

		return feingInterface.hi22();
	}
	
	@GetMapping("/feignTest1")
	public String feignTest1() {

		return "我是端口是："+Port+"调用data项目test1方法："+test1.test1();
	}
	
	
	
}
