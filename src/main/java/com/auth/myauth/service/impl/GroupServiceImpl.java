package com.auth.myauth.service.impl;

import org.springframework.stereotype.Service;

import com.auth.myauth.entity.Group;
import com.auth.myauth.service.GroupService;
import com.auth.myauth.dao.GroupMapper;
import com.auth.common.sevice.impl.BaseServiceImpl;

/**
 * 角色，用户组，岗位
 *
 * @author tang
 * @email 463540703@qq.com
 * @date 2018-04-06 21:00:25
 */
@Service
public class GroupServiceImpl extends BaseServiceImpl<GroupMapper,Group> implements GroupService{
}