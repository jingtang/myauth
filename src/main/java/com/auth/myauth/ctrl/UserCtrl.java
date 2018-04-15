package com.auth.myauth.ctrl;

import com.auth.myauth.service.UserService;
import com.auth.common.ctrl.BaseCtrl;
import com.auth.common.utils.RV;
import com.auth.myauth.entity.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("user")
public class UserCtrl extends BaseCtrl<UserService, User>{
	@Autowired
	private UserService userService;
	
	/**
	 * 登陆
	 * @param u
	 * @return
	 */
	@RequestMapping(value="login",method=RequestMethod.POST)
	public @ResponseBody RV login(@RequestBody User u) {
		return RV.ok(userService.longin(u));
	}
	
	/**
	 * 增加用户
	 * @param u
	 * @return
	 */
	@RequestMapping(value="createUser",method=RequestMethod.POST)
	public @ResponseBody RV createUser(@RequestBody User u) {
		
		return RV.ok(userService.createUser(u));
	}
}