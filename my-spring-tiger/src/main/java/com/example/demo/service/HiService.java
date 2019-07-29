package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.codingapi.txlcn.tc.annotation.LcnTransaction;
import com.example.demo.enty.Cod;
import com.example.demo.enty.User;
import com.example.demo.mapper.CodMapper;
import com.example.demo.mapper.UserMapper;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
@Service
public class HiService {
	@Value("${server.port}")
	private	String port; 
	@Autowired
    private RestTemplate restTemplate;
	
	@Autowired
	UserMapper userMapper;
	@Autowired
	CodMapper  codMapper;
@LcnTransaction
	public String car() {
//		User user=	new User();
//		user.setAge(18);
//		user.setName("小花");
//		user.setSex("女");
		//userMapper.insert(user);
	Cod cod=new Cod();
	cod.setCodename("爱你哦");
	codMapper.insert(cod);
		//int a=1/0;
		return "eureka-tiger的端口 user添加数据成功-------->"+port;
	}
		
}
