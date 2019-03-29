package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;
@RefreshScope
@SpringBootApplication
@EnableEurekaClient
@EnableHystrix//加@EnableHystrix注解开启Hystrix：Hystrix组件，实现了断路器模式，SpringCloud对这一组件进行了整合
//较底层的服务如果出现故障，会导致连锁故障。当对特定的服务的调用的不可用达到一个阀值（Hystric 是5秒20次） 断路器将会被打开
public class UserApplication {
	public static void main(String[] args) {
		SpringApplication.run(UserApplication.class, args);
	}
	
	@Bean
	@LoadBalanced // 一定要@loadBalance注解修饰的restTemplate才能实现服务名的调用，没有修饰的restTemplate是没有该功能的。
	// @loadBalance是Netflix的ribbon中的一个负载均衡的注解，
	public RestTemplate getRestTemplate() {
		//RestTemplate设置调用的超时时间，springcloud默认情况下一秒之内调用成功，否则将打开断路器
 		SimpleClientHttpRequestFactory simpleClientHttpRequestFactory= new SimpleClientHttpRequestFactory ();
 		simpleClientHttpRequestFactory.setConnectTimeout(5000);
 		simpleClientHttpRequestFactory.setReadTimeout(5000);
		return new RestTemplate(simpleClientHttpRequestFactory);
	}

}
