package com.example.demo.interfacefeing;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
@FeignClient("springCloud-data")
public interface Test1 {
	
	@PostMapping("/test1")
	public String test1();
	
}
