package com.dubbo.test;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * 1、导入依赖
 * 		
 * @author Administrator
 *
 */
@EnableDubbo
@SpringBootApplication
public class BootUserDubboProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootUserDubboProviderApplication.class, args);
	}

}
