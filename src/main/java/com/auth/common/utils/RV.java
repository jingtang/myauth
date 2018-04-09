package com.auth.common.utils;

import static org.hamcrest.CoreMatchers.instanceOf;

import com.github.pagehelper.Page;

/**
 * 通用结果封装
 * @author MES
 *
 */
public class RV {
	/**
	 * 返回编码
	 */
	private String code;
	/**
	 * 返回信息
	 */
	private String msg;
	/**
	 * 返回结果
	 */
	private Object result;
	/**
	 * 当前页
	 */
	private int pageNum;
	/**
	 * 每页数量
	 */
	private int pageSize;
	/**
	 * 总记录
	 */
	private long total;
	/**
	 * 总页数
	 */
	private int pages;
	
	public RV() {}
	
	public RV(String code,String msg) {
		super();
		this.code = code;
		this.msg = msg;
	}
	
	public static RV ok(Object result) {
		RV r = new RV("200","success");
		if(result instanceof Page ) {
			Page p = (Page)result;
			r.setPageNum(p.getPageNum());
			r.setPageSize(p.getPageSize());
			r.setTotal(p.getTotal());
			r.setPages(p.getPages());
			r.setResult(result);
		}else {
			r.setResult(result);
		}
		
		return r;
		
	}
	
	///get set
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public Object getResult() {
		return result;
	}
	public void setResult(Object result) {
		this.result = result;
	}
	public int getPageNum() {
		return pageNum;
	}
	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public long getTotal() {
		return total;
	}
	public void setTotal(long total) {
		this.total = total;
	}
	public int getPages() {
		return pages;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}

}
