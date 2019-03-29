package com.example.demo.interfacefeing;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Feign是一个声明式的伪Http客户端，它使得写Http客户端变得更简单。使用Feign，只需要创建一个接口并注解。
 * 它具有可插拔的注解特性，可使用Feign 注解和JAX-RS注解。Feign支持可插拔的编码器和解码器。
 * Feign默认集成了Ribbon，并和Eureka结合，默认实现了负载均衡的效果。
 * 
 * 
 * @author 95303 定义一个feign接口，通过@ FeignClient（“服务名”），来指定调用哪个服务。
 *         比如在代码中调用了service-hi服务的“/hi”接口
 */
// 定义一个接口，注解指明要调用的服务，下面在写上要调用这个服务具体的接口
// 下面接口必须对应调用服务的接口，不能乱写
// feign自带断路器，只需指定一个熔断处理类即可，并实现FeingInterface接口，重写方法进行熔断处理的具体操作，
// xml文件中开启熔断feign.hystrix.enabled=true
// ,fallback = SchedualServiceHiHystric.class

@FeignClient(value = "spring-tiger", fallback = FeignHystrix.class)
public interface FeingInterface {
	// 服务名spring-tiger+"/hi"
	@GetMapping("/hi")
	public String hi22();

}
