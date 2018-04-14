package com.auth.myauth.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.auth.common.sevice.impl.BaseServiceImpl;
import com.auth.common.utils.Utils;
import com.auth.myauth.dao.ResourcesMapper;
import com.auth.myauth.entity.Resources;
import com.auth.myauth.service.ResourcesService;
import com.auth.myauth.vo.ResourcesTree;

/**
 * 系统资源，系统目录，模块菜单，功能按钮，功能视图
 *
 * @author tang
 * @email 463540703@qq.com
 * @date 2018-04-06 21:00:25
 */
@Service
public class ResourcesServiceImpl extends BaseServiceImpl<ResourcesMapper,Resources> implements ResourcesService{
	
	@Transactional
	@Override
	public void create(Resources r) {	
		r.setResId(Utils.getUUID());
		r.setCreateTime(System.currentTimeMillis());
		this.insertSelective(r);
	}
	
	@Override
	public List<ResourcesTree> getResourcesTree() {
		List<Resources> rs = this.selectListAll();
		List<ResourcesTree> lrts = new ArrayList<ResourcesTree>();
		ResourcesTree rt = null;
		
		//一级菜单
		for (Resources r : rs) {
			if(r.getParentId() == null || "".equals(r.getParentId())) {
				rt = new ResourcesTree();
	            BeanUtils.copyProperties(r, rt);
	            lrts.add(rt);
			}
			
		}
		
		for (ResourcesTree ret : lrts) {
			ret.setChild(getChild(ret.getResId(),rs));
		}
		return lrts;
	}
	
	private List<ResourcesTree> getChild(String parentId,List<Resources> rs){
		 List<ResourcesTree> lrt = new ArrayList<ResourcesTree>();
		 ResourcesTree rt = null;
		for (Resources r : rs) {
			if(parentId.equals(r.getParentId())) {
				rt = new ResourcesTree();
	            BeanUtils.copyProperties(r, rt);
	            lrt.add(rt);
			}
		}
		
		for (ResourcesTree lt : lrt) {
			//递归
			lt.setChild(getChild(lt.getResId(),rs));
		}
		
		return lrt;
	}
	
	
	
}