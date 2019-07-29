package com.example.demo.contorlle;

import javax.sound.sampled.Port;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.enty.Stu;
import com.example.demo.interfacefeing.FeingInterface;
import com.example.demo.interfacefeing.Test1;
import com.example.demo.mapper.StuMapper;
import com.example.demo.service.StuService;

import io.swagger.annotations.ApiOperation;

@RestController
// @RequestMapping("/api")
public class HiControlle {
	@Value("${server.port}")
	String Port;
	
	@Autowired
	StuService stuService;
	@Autowired
	private Test1 test1;

	@GetMapping("/sayHi")
	public String sayHi() {
		return stuService.insertStu();	
	}
	
	@GetMapping("/feignTest1")
	@ApiOperation("feignSwagger")
	public String feignTest1() {

		return "我是端口是："+Port+"调用data项目test1方法："+test1.test1();
	}
	
	
	
}
