package com.auth.config.Interceptor;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
@EnableWebMvc
@Configuration
public class WebMvcCfg extends WebMvcConfigurerAdapter{
	public void addInterceptors(InterceptorRegistry registry){
		registry.addInterceptor(new UserAuthRestInterceptor()).addPathPatterns("/**").excludePathPatterns("/user/login");
		
	}
}
