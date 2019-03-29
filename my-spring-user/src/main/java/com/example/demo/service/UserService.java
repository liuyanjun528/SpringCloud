package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RefreshScope//远程读取配置文件哪里读配置就加到哪个类上面
@Service
public class UserService {

//	@Autowired
//	private RestTemplate restTemplate;
	
	@Value("${foo}")
	private String foo;
	@Value("${server.port}")
	private String myspringuser;
	// 断路器注解，加指定方法
	@HystrixCommand(fallbackMethod = "sorryerror")
	public String user() {
		//String str = restTemplate.getForObject("http://spring-tiger/hi", String.class);
		return "git配置中心信息foo--->>"+foo+"-----my-spring-user的端口是："+myspringuser;
	}

	public String sorryerror() {
		return "系统繁忙";
	}

}
