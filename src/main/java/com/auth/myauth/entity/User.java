package com.auth.myauth.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * 
 * 
 * @author tang
 * @email 463540703@qq.com
 * @date 2018-04-06 20:19:57
 */
@Table(name = "sys_user")
public class User implements Serializable {
	private static final long serialVersionUID = 1L;
	
	    //用户ID
    @Id
    private String userId;
	
	    //用户名
    @Column(name = "user_name")
    private String userName;
	
	    //密码
    @Column(name = "passwd")
    private String passwd;
	
	    //手机
    @Column(name = "phone")
    private String phone;
	
	    //邮箱
    @Column(name = "email")
    private String email;
	
	    //默认组织编码
    @Column(name = "def_org_code")
    private String defOrgCode;
	
	    //默认组织名称
    @Column(name = "def_org_name")
    private String defOrgName;
	
	    //默认职位编码
    @Column(name = "def_job_code")
    private String defJobCode;
	
	    //默认职位
    @Column(name = "def_job_name")
    private String defJobName;
	
	    //状态(0禁用，1启用)
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
	 * 设置：用户ID
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}
	/**
	 * 获取：用户ID
	 */
	public String getUserId() {
		return userId;
	}
	/**
	 * 设置：用户名
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	/**
	 * 获取：用户名
	 */
	public String getUserName() {
		return userName;
	}
	/**
	 * 设置：密码
	 */
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	/**
	 * 获取：密码
	 */
	public String getPasswd() {
		return passwd;
	}
	/**
	 * 设置：手机
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}
	/**
	 * 获取：手机
	 */
	public String getPhone() {
		return phone;
	}
	/**
	 * 设置：邮箱
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * 获取：邮箱
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * 设置：默认组织编码
	 */
	public void setDefOrgCode(String defOrgCode) {
		this.defOrgCode = defOrgCode;
	}
	/**
	 * 获取：默认组织编码
	 */
	public String getDefOrgCode() {
		return defOrgCode;
	}
	/**
	 * 设置：默认组织名称
	 */
	public void setDefOrgName(String defOrgName) {
		this.defOrgName = defOrgName;
	}
	/**
	 * 获取：默认组织名称
	 */
	public String getDefOrgName() {
		return defOrgName;
	}
	/**
	 * 设置：默认职位编码
	 */
	public void setDefJobCode(String defJobCode) {
		this.defJobCode = defJobCode;
	}
	/**
	 * 获取：默认职位编码
	 */
	public String getDefJobCode() {
		return defJobCode;
	}
	/**
	 * 设置：默认职位
	 */
	public void setDefJobName(String defJobName) {
		this.defJobName = defJobName;
	}
	/**
	 * 获取：默认职位
	 */
	public String getDefJobName() {
		return defJobName;
	}
	/**
	 * 设置：状态(0禁用，1启用)
	 */
	public void setState(Integer state) {
		this.state = state;
	}
	/**
	 * 获取：状态(0禁用，1启用)
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
