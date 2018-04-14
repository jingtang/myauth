package com.auth.myauth.service;

import java.util.List;

import com.auth.common.sevice.BaseService;
import com.auth.myauth.entity.Resources;
import com.auth.myauth.vo.ResourcesTree;

public interface ResourcesService extends BaseService<Resources> {

	/**
	 * 创建资源
	 * @param r
	 */
	void create(Resources r);
	
	/**
	 * 加载资源树
	 * @return
	 */
	List<ResourcesTree> getResourcesTree();

}
