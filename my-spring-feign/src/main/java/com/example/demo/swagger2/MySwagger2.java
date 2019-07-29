package com.example.demo.swagger2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class MySwagger2 {

	public class Swagger2Config {
		@Bean
		public Docket createRestfulApi() {// api文档实例
			return new Docket(DocumentationType.SWAGGER_2)// 文档类型：DocumentationType.SWAGGER_2
					.apiInfo(apiInfo())// api信息
					.select()// 构建api选择器
					.apis(RequestHandlerSelectors.basePackage("com.example.demo.contorlle"))// api选择器选择api的包
					.paths(PathSelectors.any())// api选择器选择包路径下任何api显示在文档中
					.build();// 创建文档
		}

		 private ApiInfo apiInfo() {
		        return new ApiInfoBuilder()
		                //页面标题
		                .title("Spring cloud 测试使用 Swagger2 构建RESTful API")
		                //创建人
		                .contact("Sri_小三")
		                //版本号
		                .version("1.0")
		                //描述
		                .description("API 接口详情描述")
		                .build();
		    }
		 
	}
}
