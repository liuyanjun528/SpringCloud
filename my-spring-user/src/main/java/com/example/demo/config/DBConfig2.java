package com.example.demo.config;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Data;

@Data
@ConfigurationProperties(prefix = "mysql.datasource.test2")
@SpringBootConfiguration
public class DBConfig2 {

	private String url;
	private String username;
	private String password;

}
