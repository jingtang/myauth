package com.auth.myauth.service.impl;

import org.springframework.stereotype.Service;

import com.auth.common.sevice.impl.BaseServiceImpl;
import com.auth.myauth.dao.GroupDetailMapper;
import com.auth.myauth.entity.GroupDetail;
import com.auth.myauth.service.GroupDetailService;

/**
 * 分组明细，角色，用户组关联用户，职位关联岗位（用户通过岗位查询到岗位关联的权限）
 *
 * @author tang
 * @email 463540703@qq.com
 * @date 2018-04-06 21:00:25
 */
@Service
public class GroupDetailServiceImpl extends BaseServiceImpl<GroupDetailMapper,GroupDetail> implements GroupDetailService{
}