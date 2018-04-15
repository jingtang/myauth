package com.auth.config.Interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.auth.common.context.BaseContextHandler;
import com.auth.common.exception.BaseException;

public class UserAuthRestInterceptor extends HandlerInterceptorAdapter {
	private Logger logger = LoggerFactory.getLogger(UserAuthRestInterceptor.class);
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		logger.info(".....check token......");
		HandlerMethod handlerMethod = (HandlerMethod) handler;
		String token = request.getHeader("token");
		String[] str = token==null?null:token.split(",");
		if(str == null || str.length == 0){
			throw new BaseException("408", "token 校验失败");
		}
		BaseContextHandler.setUsername(str[2]);
		BaseContextHandler.setName(str[1]);
		BaseContextHandler.setUserID(str[0]);
		return super.preHandle(request, response, handler);
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		logger.info(".....remove token......");
		BaseContextHandler.remove();
		super.afterCompletion(request, response, handler, ex);
	}
}
