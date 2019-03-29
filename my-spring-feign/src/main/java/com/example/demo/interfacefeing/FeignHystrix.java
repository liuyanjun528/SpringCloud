package com.example.demo.interfacefeing;

import org.springframework.stereotype.Component;
//Feign熔断
@Component
public class FeignHystrix implements FeingInterface{

	

	@Override
	public String hi22() {
		
		return "sorry---error";
	}

}
