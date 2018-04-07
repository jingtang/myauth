package com.auth.myauth.service.impl;

import org.springframework.stereotype.Service;

import com.auth.myauth.entity.GroupAuth;
import com.auth.myauth.service.GroupAuthService;
import com.auth.myauth.dao.GroupAuthMapper;
import com.auth.common.sevice.impl.BaseServiceImpl;

/**
 * 包含角色，用户组，岗位组
 *
 * @author tang
 * @email 463540703@qq.com
 * @date 2018-04-06 21:00:25
 */
@Service
public class GroupAuthServiceImpl extends BaseServiceImpl<GroupAuthMapper,GroupAuth> implements GroupAuthService{
}