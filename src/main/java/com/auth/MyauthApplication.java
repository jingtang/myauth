package com.auth.myauth;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
@EnableAutoConfiguration
@MapperScan("com.auth.*.dao")
public class MyauthApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyauthApplication.class, args);
	}
}
