package com.auth.myauth.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * 系统资源，系统目录，模块菜单，功能按钮，功能视图
 * 
 * @author tang
 * @email 463540703@qq.com
 * @date 2018-04-06 20:19:57
 */
@Table(name = "sys_resources")
public class Resources implements Serializable {
	private static final long serialVersionUID = 1L;
	
	    //主键
    @Id
    private String resId;
	
	    //资源名称
    @Column(name = "res_name")
    private String resName;
	
	    //资源名称
    @Column(name = "res_code")
    private String resCode;
	
	    //目录、菜单、按钮、视图
    @Column(name = "type")
    private String type;
	
	    //上级ID
    @Column(name = "parent_id")
    private String parentId;
	
	    //全路径
    @Column(name = "path")
    private String path;
	
	    //描述
    @Column(name = "description")
    private String description;
	
	    //排序
    @Column(name = "order_idx")
    private Integer orderIdx;
	
	    //图标
    @Column(name = "icon")
    private String icon;
	
	    //资源URL
    @Column(name = "url")
    private String url;
	
	    //资源请求方法（POST,GET,DELETE,PUT）
    @Column(name = "req_method")
    private String reqMethod;
	
	    //授权标识码
    @Column(name = "auth_code")
    private String authCode;
	
	    //创建时间
    @Column(name = "create_time")
    private Long createTime;
	
	    //创建人
    @Column(name = "create_user")
    private String createUser;
	
	    //创建人ID
    @Column(name = "create_user_id")
    private String createUserId;
	
	    //更新时间
    @Column(name = "update_time")
    private Long updateTime;
	
	    //更新人
    @Column(name = "update_user")
    private String updateUser;
	
	    //更新人ID
    @Column(name = "update_user_id")
    private String updateUserId;
	

	/**
	 * 设置：主键
	 */
	public void setResId(String resId) {
		this.resId = resId;
	}
	/**
	 * 获取：主键
	 */
	public String getResId() {
		return resId;
	}
	/**
	 * 设置：资源名称
	 */
	public void setResName(String resName) {
		this.resName = resName;
	}
	/**
	 * 获取：资源名称
	 */
	public String getResName() {
		return resName;
	}
	/**
	 * 设置：资源名称
	 */
	public void setResCode(String resCode) {
		this.resCode = resCode;
	}
	/**
	 * 获取：资源名称
	 */
	public String getResCode() {
		return resCode;
	}
	/**
	 * 设置：目录、菜单、按钮、视图
	 */
	public void setType(String type) {
		this.type = type;
	}
	/**
	 * 获取：目录、菜单、按钮、视图
	 */
	public String getType() {
		return type;
	}
	/**
	 * 设置：上级ID
	 */
	public void setParentId(String parentId) {
		this.parentId = parentId;
	}
	/**
	 * 获取：上级ID
	 */
	public String getParentId() {
		return parentId;
	}
	/**
	 * 设置：全路径
	 */
	public void setPath(String path) {
		this.path = path;
	}
	/**
	 * 获取：全路径
	 */
	public String getPath() {
		return path;
	}
	/**
	 * 设置：描述
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * 获取：描述
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * 设置：排序
	 */
	public void setOrderIdx(Integer orderIdx) {
		this.orderIdx = orderIdx;
	}
	/**
	 * 获取：排序
	 */
	public Integer getOrderIdx() {
		return orderIdx;
	}
	/**
	 * 设置：图标
	 */
	public void setIcon(String icon) {
		this.icon = icon;
	}
	/**
	 * 获取：图标
	 */
	public String getIcon() {
		return icon;
	}
	/**
	 * 设置：资源URL
	 */
	public void setUrl(String url) {
		this.url = url;
	}
	/**
	 * 获取：资源URL
	 */
	public String getUrl() {
		return url;
	}
	/**
	 * 设置：资源请求方法（POST,GET,DELETE,PUT）
	 */
	public void setReqMethod(String reqMethod) {
		this.reqMethod = reqMethod;
	}
	/**
	 * 获取：资源请求方法（POST,GET,DELETE,PUT）
	 */
	public String getReqMethod() {
		return reqMethod;
	}
	/**
	 * 设置：授权标识码
	 */
	public void setAuthCode(String authCode) {
		this.authCode = authCode;
	}
	/**
	 * 获取：授权标识码
	 */
	public String getAuthCode() {
		return authCode;
	}
	/**
	 * 设置：创建时间
	 */
	public void setCreateTime(Long createTime) {
		this.createTime = createTime;
	}
	/**
	 * 获取：创建时间
	 */
	public Long getCreateTime() {
		return createTime;
	}
	/**
	 * 设置：创建人
	 */
	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}
	/**
	 * 获取：创建人
	 */
	public String getCreateUser() {
		return createUser;
	}
	/**
	 * 设置：创建人ID
	 */
	public void setCreateUserId(String createUserId) {
		this.createUserId = createUserId;
	}
	/**
	 * 获取：创建人ID
	 */
	public String getCreateUserId() {
		return createUserId;
	}
	/**
	 * 设置：更新时间
	 */
	public void setUpdateTime(Long updateTime) {
		this.updateTime = updateTime;
	}
	/**
	 * 获取：更新时间
	 */
	public Long getUpdateTime() {
		return updateTime;
	}
	/**
	 * 设置：更新人
	 */
	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}
	/**
	 * 获取：更新人
	 */
	public String getUpdateUser() {
		return updateUser;
	}
	/**
	 * 设置：更新人ID
	 */
	public void setUpdateUserId(String updateUserId) {
		this.updateUserId = updateUserId;
	}
	/**
	 * 获取：更新人ID
	 */
	public String getUpdateUserId() {
		return updateUserId;
	}
}
