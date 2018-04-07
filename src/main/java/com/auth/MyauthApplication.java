package com.auth;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@ComponentScan
@EnableAutoConfiguration
@MapperScan("com.auth.*.dao")
@EnableTransactionManagement
public class MyauthApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyauthApplication.class, args);
	}
}
