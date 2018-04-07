package com.auth.myauth.dao;

import org.apache.ibatis.annotations.Param;

import com.auth.myauth.entity.User;
import tk.mybatis.mapper.common.Mapper;

/**
 * 
 * 
 * @author tang
 * @email 463540703@qq.com
 * @date 2018-04-06 21:00:25
 */

public interface UserMapper extends Mapper<User> {

	User selectByNameAndPasswd(@Param("userName")String userName, @Param("passwd")String passwd);
	
}
