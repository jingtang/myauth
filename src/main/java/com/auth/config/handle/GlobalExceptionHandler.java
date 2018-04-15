package com.auth.config.handle;

import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.auth.common.exception.BaseException;
import com.auth.common.utils.RV;

/**
 * 通用异常处理
 * @author tang
 *
 */
@ControllerAdvice
@ResponseBody
public class GlobalExceptionHandler {
	private Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);
	
	/**
	 * 基本异常处理
	 * @param response
	 * @param ex
	 * @return
	 */
	@ExceptionHandler(BaseException.class)
    public RV baseExceptionHandler(HttpServletResponse response, BaseException ex) {
		//response.setStatus(500);
        return RV.fail(ex.getCode(),ex.getMessage());
    }

	/**
	 * 其他异常处理
	 * @param response
	 * @param ex
	 * @return
	 */
    @ExceptionHandler(Exception.class)
    public RV otherExceptionHandler(HttpServletResponse response, Exception ex) {
        response.setStatus(500);
        logger.error(ex.getMessage(),ex);
    	return RV.fail(response.getStatus()+"",ex.getMessage());
    }

   
}
