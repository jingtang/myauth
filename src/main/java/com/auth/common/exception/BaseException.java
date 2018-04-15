package com.auth.common.exception;

public class BaseException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2397791562274560681L;

	private String code;
	
	public BaseException(){}
	
	public BaseException(String code){
		this.code = code;
	}
	
	public BaseException(String code,String msg){
		super(msg);
		this.code = code;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
	
	
}
