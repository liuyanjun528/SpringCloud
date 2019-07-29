package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingapi.txlcn.tc.annotation.LcnTransaction;
import com.example.demo.enty.Stu;
import com.example.demo.interfacefeing.FeingInterface;
import com.example.demo.mapper.StuMapper;

@Service
public class StuService {
	
	@Autowired
	private FeingInterface feingInterface;
	@Autowired
	StuMapper stuMapper;
	
	//经测试在事物的调用者抛出异常，或者是事物的参与者抛出，
	//参与者和调用者都可以做到事物的回滚
	//！！！如果在调用者处做了《熔断处理》，那么当参与者抛出异常时，
	//         参与者的事物会回滚，但是调用者的事物不会回滚
	//TX-LCN主要有两个模块，Tx-Client（TC）Tx-Manager（TM）。TC作为微服务下的依赖，TM是独立的服务。
	//服务启动，TC会自动连接TM的端口，默认TM端口为8070，
	@LcnTransaction
	public String insertStu() {
		Stu stu=new Stu();
		
		stu.setStuage("15");
		stu.setStuname("小明");
		stu.setStusex("男");
		 stuMapper.insertSelective(stu);
		 //添加成功，调用tiger项目
		String message= feingInterface.hi22();
		//int a=1/0;
		return  message;
	}

}
