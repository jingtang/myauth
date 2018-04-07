package com.auth.myauth.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * 分组明细，角色，用户组关联用户，职位关联岗位（用户通过岗位查询到岗位关联的权限）
 * 
 * @author tang
 * @email 463540703@qq.com
 * @date 2018-04-06 20:19:57
 */
@Table(name = "sys_group_detail")
public class GroupDetail implements Serializable {
	private static final long serialVersionUID = 1L;
	
	    //主键
    @Id
    private String groupDetailId;
	
	    //分组ID
    @Column(name = "group_id")
    private String groupId;
	
	    //分组类型组类型(role角色、user用户、job职位)
    @Column(name = "group_type")
    private String groupType;
	
	    //关联ID
    @Column(name = "link_id")
    private String linkId;
	

	/**
	 * 设置：主键
	 */
	public void setGroupDetailId(String groupDetailId) {
		this.groupDetailId = groupDetailId;
	}
	/**
	 * 获取：主键
	 */
	public String getGroupDetailId() {
		return groupDetailId;
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
	 * 设置：分组类型组类型(role角色、user用户、job职位)
	 */
	public void setGroupType(String groupType) {
		this.groupType = groupType;
	}
	/**
	 * 获取：分组类型组类型(role角色、user用户、job职位)
	 */
	public String getGroupType() {
		return groupType;
	}
	/**
	 * 设置：关联ID
	 */
	public void setLinkId(String linkId) {
		this.linkId = linkId;
	}
	/**
	 * 获取：关联ID
	 */
	public String getLinkId() {
		return linkId;
	}
}
