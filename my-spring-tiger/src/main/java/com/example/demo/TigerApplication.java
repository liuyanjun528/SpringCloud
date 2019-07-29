package com.example.demo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import org.springframework.context.annotation.Bean;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

import com.codingapi.txlcn.tc.config.EnableDistributedTransaction;



@EnableEurekaClient
@SpringBootApplication
@EnableDistributedTransaction
public class TigerApplication {

	public static void main(String[] args) {
		SpringApplication.run(TigerApplication.class, args);
	}
	
	 	@Bean
	    @LoadBalanced
	    public RestTemplate getRestTemplate(){
	 		//RestTemplate设置调用的超时时间，springcloud默认情况下一秒之内调用成功，否则将打开断路器
	 		SimpleClientHttpRequestFactory simpleClientHttpRequestFactory  = new SimpleClientHttpRequestFactory ();
	 		simpleClientHttpRequestFactory.setConnectTimeout(5000);
	 		simpleClientHttpRequestFactory.setReadTimeout(5000);
	        return new RestTemplate(simpleClientHttpRequestFactory);
	    }   
	    
}
