package com.auth.myauth.service;

import com.auth.common.sevice.BaseService;
import com.auth.myauth.entity.User;

public interface UserService extends BaseService<User>{
	
	/**
	 * 保存用户
	 * @param u
	 * @return
	 */
	int createUser(User u);
	
	/**
	 * 登陆
	 * @param u
	 * @return
	 */
	User longin(User u);
}
