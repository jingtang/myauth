package com.auth.myauth.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.auth.common.exception.BaseException;
import com.auth.common.sevice.impl.BaseServiceImpl;
import com.auth.common.utils.Utils;
import com.auth.myauth.dao.UserMapper;
import com.auth.myauth.entity.User;
import com.auth.myauth.service.UserService;

/**
 * 
 *
 * @author tang
 * @email 463540703@qq.com
 * @date 2018-04-06 21:00:25
 */
@Service
public class UserServiceImpl extends BaseServiceImpl<UserMapper,User> implements UserService{
	@Autowired
	private UserMapper userMapper;

	@Override
	public int createUser(User u) {
		u.setUserId(Utils.getUUID());
		u.setCreateTime(System.currentTimeMillis());
		return userMapper.insertSelective(u);
	}

	@Override
	public User longin(User u) {
		//TODO 校验
		User newUser = userMapper.selectByNameAndPasswd(u.getUserName(),u.getPasswd());
		if(newUser == null){
			throw new BaseException("401","用户密码错误");
		}
		return newUser;
	}
}