package com.auth.myauth.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * 包含角色，用户组，岗位组
 * 
 * @author tang
 * @email 463540703@qq.com
 * @date 2018-04-06 20:19:57
 */
@Table(name = "sys_group_auth")
public class GroupAuth implements Serializable {
	private static final long serialVersionUID = 1L;
	
	    //主键
    @Id
    private String groupAuthId;
	
	    //分组ID
    @Column(name = "group_id")
    private String groupId;
	
	    //资源ID
    @Column(name = "res_id")
    private String resId;
	

	/**
	 * 设置：主键
	 */
	public void setGroupAuthId(String groupAuthId) {
		this.groupAuthId = groupAuthId;
	}
	/**
	 * 获取：主键
	 */
	public String getGroupAuthId() {
		return groupAuthId;
	}
	/**
	 * 设置：分组ID
	 */
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}
	/**
	 * 获取：分组ID
	 */
	public String getGroupId() {
		return groupId;
	}
	/**
	 * 设置：资源ID
	 */
	public void setResId(String resId) {
		this.resId = resId;
	}
	/**
	 * 获取：资源ID
	 */
	public String getResId() {
		return resId;
	}
}
