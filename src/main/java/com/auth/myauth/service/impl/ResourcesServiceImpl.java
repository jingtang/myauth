package com.auth.myauth.service.impl;

import org.springframework.stereotype.Service;

import com.auth.myauth.entity.Resources;
import com.auth.myauth.service.ResourcesService;
import com.auth.myauth.dao.ResourcesMapper;
import com.auth.common.sevice.impl.BaseServiceImpl;

/**
 * 系统资源，系统目录，模块菜单，功能按钮，功能视图
 *
 * @author tang
 * @email 463540703@qq.com
 * @date 2018-04-06 21:00:25
 */
@Service
public class ResourcesServiceImpl extends BaseServiceImpl<ResourcesMapper,Resources> implements ResourcesService{
}