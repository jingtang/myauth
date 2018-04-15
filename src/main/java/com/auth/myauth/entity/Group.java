package com.auth.myauth.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;



/**
 * 角色，用户组，岗位
 * 
 * @author tang
 * @email 463540703@qq.com
 * @date 2018-04-06 20:19:57
 */
@Table(name = "sys_group")
public class Group implements Serializable {
	private static final long serialVersionUID = 1L;
	
	    //主键
    @Id
    private String groupId;
	
	    //组名
    @Column(name = "group_name")
    private String groupName;
	
	    //组编码
    @Column(name = "group_code")
    private String groupCode;
	
	    //组类型(role角色、user用户、job职位)
    @Column(name = "group_type")
    private String groupType;
	
	    //上级ID
    @Column(name = "parent_id")
    private String parentId;
	
	    //图标
    @Column(name = "icon")
    private String icon;
	
	    //描述
    @Column(name = "description")
    private String description;
	
	    //全路径
    @Column(name = "path")
    private String path;
	
	    //状态（0禁用、1启用）
    @Column(name = "state")
    private Integer state;
	
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
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}
	/**
	 * 获取：主键
	 */
	public String getGroupId() {
		return groupId;
	}
	/**
	 * 设置：组名
	 */
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	/**
	 * 获取：组名
	 */
	public String getGroupName() {
		return groupName;
	}
	/**
	 * 设置：组编码
	 */
	public void setGroupCode(String groupCode) {
		this.groupCode = groupCode;
	}
	/**
	 * 获取：组编码
	 */
	public String getGroupCode() {
		return groupCode;
	}
	/**
	 * 设置：组类型(role角色、user用户、job职位)
	 */
	public void setGroupType(String groupType) {
		this.groupType = groupType;
	}
	/**
	 * 获取：组类型(role角色、user用户、job职位)
	 */
	public String getGroupType() {
		return groupType;
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
	 * 设置：状态（0禁用、1启用）
	 */
	public void setState(Integer state) {
		this.state = state;
	}
	/**
	 * 获取：状态（0禁用、1启用）
	 */
	public Integer getState() {
		return state;
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
