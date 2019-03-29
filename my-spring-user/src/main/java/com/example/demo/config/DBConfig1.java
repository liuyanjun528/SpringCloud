package com.example.demo.config;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Data;
@Data
@ConfigurationProperties(prefix="mysql.datasource.test1")
@SpringBootConfiguration
public class DBConfig1 {
	
	private String url;
	private String username;
	private String password;
	
	
	
}
